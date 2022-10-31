package com.driver;
public class Pizza {

    private int price;
    private Boolean isVeg;
    private String bill;
    private boolean cheese;
    private boolean topping;
    private boolean takeaway, billCreated;
    private int extraChessePrice, extraToppingPrice, takeAwayPrice;

    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
        this.cheese= false;
        this.topping = false;
        this.takeaway = false;
        this.extraChessePrice  =80;
        this.takeAwayPrice = 20;
        this.billCreated = false;
        if(isVeg) {
            price = 300;
            extraToppingPrice = 70;
        }
        else {
            price = 400;
            extraToppingPrice =120;
        }
        this.bill = "Base Price Of The Pizza: " + this.price + "\n";

    }

    public int getPrice(){

        return this.price;
    }

    public void addExtraCheese(){
        // your code goes here
        //this.getPrice();
        if(cheese== false) {
            this.price += extraChessePrice;

            cheese= true;
        }
    }

    public void addExtraToppings(){
        // your code goes here
        //this.addExtraCheese();
        if( topping == false) {
            this.price += this.extraToppingPrice;

            topping = true;
        }

    }

    public void addTakeaway(){
        // your code goes here
        if ( takeaway == false) {
            this.price += this.takeAwayPrice;

            takeaway = true;
        }
    }

    public String getBill(){
        // your code goes here
        if(billCreated==false) {

            if(cheese==true)  this.bill +="Extra Cheese Added: "+this.extraChessePrice+"\n";
            if(topping==true)   this.bill +="Extra Toppings Added: "+ this.extraToppingPrice + "\n";
            if(takeaway== true)  this.bill +="Paperbag Added: "+this.takeAwayPrice+ "\n";

            this.bill += "Total Price: " + this.price+ "\n";
            billCreated = true;

        }
        return this.bill;
    }
}