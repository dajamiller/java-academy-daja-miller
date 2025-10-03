package com.pluralsight;

import java.time.LocalDate;

public class Task {

    // instance variables - a variable linked to a class/object

    //what we need to do to make ap
    // String - title
    private String listTitle;
    // due date (locale date parser)
    private LocalDate dueDate;
    // complete or not (boolean)
    private boolean isComplete;
    // urgency
    private String urgency; //(A list of default values => ENUM)
    // reminder - y/n (boolean)
    private boolean remindersOn;
    // String - notification message
    private String notificationMsg;

    // create constructor
    public Task(String _listTitle) {
        this.listTitle = _listTitle;
    }

    public void setComplete(boolean _isComplete) {
        this.isComplete = _isComplete;

        // bilal -  public boolean isComplete() {
        //        return this.isComplete = true;
    }
    @Override
    public String toString() {
        if (isComplete) {
            return "[✓]" + listTitle;
        } else {
            return listTitle + " is not yet complete.";
        }
    }

    }



//BONUS Challenge: ARRAYS
/// / Let's store several Task objects inside an array!
//
//      Inside of main add:
////    Step 1: create an array that can hold 3 tasks
//        Task[] tasks = new Task[3];
//
//        // Step 2: add new Task objects
//        tasks[0] = new Task("Learn the basics of Classes and Methods in Java");
//        tasks[1] = new Task("Fill out this Year Up online form. It's feedback for Year up about how you guys think the lessons are going.
//          https://www.surveymonkey.com/r/VXQF92Q.");
//        tasks[2] = new Task("Share your most fun exercise we did in class");
//
//        // Step 3: mark one task as completed
//        tasks[1].markCompleted();
//
//        // Step 4: loop through the array and print each task
//        for (int i = 0; i < tasks.length; i++) {
//            System.out.println(tasks[i]);
//        }