public class Ingredient {
    //vereist: minimaal 3 variabelen, 2 constructors en getters en setters in Ingredient

    //variabelen
    int amount;
    double amountTwo;
    String unit;
    String name;

    //constructors
    // Deze "lege" constructor maken we aan, maar gebruiken we niet. Normaal maakt java die automatisch, achter de schermen aan,
    // maar omdat wij in deze klasse ook een andere constructor hebben gemaakt, doet java het niet meer automatisch.
    // We moeten dus zelf deze "lege" constructor er bij maken.
    public Ingredient() {

    }

    public Ingredient(int amount, String unit, String name){
        this.amount = amount;
        this.unit = unit;
        this.name = name;
    }

    public Ingredient(double amountTwo, String unit, String name){
        this.amountTwo = amount;
        this.unit = unit;
        this.name = name;
    }
    //getters en setters
    public int getAmount(){
        return amount;
    }
    public void setAmount(int amount){
        this.amount = amount;
    }

    public double getAmountTwo(){
        return amountTwo;
    }
    public void setAmountTwo(double amountTwo){
        this.amountTwo = amountTwo;
    }

    public String getUnit(){
        return unit;
    }
    public void setUnit(String unit){
        this.unit = unit;
    }

    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }


}
