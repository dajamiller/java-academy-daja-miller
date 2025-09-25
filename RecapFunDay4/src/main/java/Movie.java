public class Movie {
    public static void main(String[] args) {
        //exercise - movie night
        String movieName = "The Conjuring";
        int numberFriends = 4;
        double pizzaPrice = 10.99; // one individual pizza
        double pizzaTotalPrice = pizzaPrice * (1 + numberFriends);
        boolean havePopcorn = false;

        System.out.println("We're watching " + movieName + " with " +  numberFriends + " friends.") ;
        System.out.println("Pizza costs $" + pizzaPrice + " each.");
        System.out.println("The total price for pizza is $" + pizzaTotalPrice);
        if (!havePopcorn) {
            System.out.println("Popcorn time!");
        } else {
            System.out.println("Sorry, we have no popcorn :(");

            //🌟 Extra Challenges (increasing difficulty)
            //⚡ Challenge 1 — Input from User
            //Use a Scanner to ask the user:
            //Movie title
            //Number of friends
            //Pizza price per piece
            //Whether there’s popcorn (true/false)
            //⚡ Challenge 2 — Round the Pizza Cost
            //Use Math.round() to round the total pizza cost to whole euros or two decimals.
            //⚡ Challenge 3 — Dynamic Message
            //If the pizza cost is above €30, print:
            //"Whoa, that's a lot of pizza! 🍕"
            //Else print:
            //"Nice budget-friendly movie night!"
            //⚡ Challenge 4 — Add Drinks
            //Add a drinkPrice variable (double).
            //Calculate a new total including drinks for everyone.
            //⚡ Challenge 5 — String Formatting
            //Use String.format or System.out.printf to create a nicely formatted output, for example:
            //Movie: Inception | Guests: 4 | Total cost: €35.50



        }
    }

    }