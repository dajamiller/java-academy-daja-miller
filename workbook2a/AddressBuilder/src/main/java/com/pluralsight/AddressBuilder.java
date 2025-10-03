package com.pluralsight;

public class AddressBuilder {


    // name + addresses
    private String fullName;

    private String billingStreet;
    private String billingCity;
    private String billingState;
    private String billingZip;

    private String shippingStreet;
    private String shippingCity;
    private String shippingState;
    private String shippingZip;

    // constructor
    public AddressInfo(String fullName, String billingStreet, String billingCity, String billingState, String billingZip, String shippingStreet, String shippingCity, String shippingState, String shippingZip) {
        this.fullName = fullName;
        this.billingStreet = billingStreet;
        this.billingCity = billingCity;
        this.billingState = billingState;
        this.billingZip = billingZip;
        this.shippingStreet = shippingStreet;
        this.shippingCity = shippingCity;
        this.shippingState = shippingState;
        this.shippingZip = shippingZip;


    // build address
    public String formatAddress() {
        StringBuilder ab = new StringBuilder();
        {
            ab.append(fullName).append("\n");
            ab.append("Billing Street: " + billingStreet).append("\n");
            ab.append("Billing City: " + billingCity).append("\n");
            ab.append("Billing State: " + billingState).append("\n");
            ab.append("Billing Zip: " + billingZip).append("\n");
            ab.append("Shipping Street: " + billingStreet).append("\n");
            ab.append("Shipping City: " + billingCity).append("\n");
            ab.append("Shipping State: " + billingState).append("\n");
            ab.append("Shipping Zip: " + billingZip).append("\n");
            return ab.toString();
        }
    }






