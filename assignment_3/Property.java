/*
 * Assignment 3
 * Jerry Joy
 * 2203196
 */

// The class named Property.
public class Property {

    protected String address;
    protected int zoneCode, noOfBedrooms, yearsOfCOnstruction, type;

    protected float riskFactor;

    /*
     * Default Constructor
     */
    Property() {
        address = "Default Address";
        zoneCode = 1;
        noOfBedrooms = 3;
        yearsOfCOnstruction = 10;
        riskFactor = 1.0f;
        type = 1;
    }

    /*
     * Parameterised Constructor
     */
    Property(
            String address,
            int zoneCode,
            int noOfBedrooms,
            int yearsOfCOnstruction,
            float riskFactor,
            String type) {
        this.address = address;
        this.zoneCode = zoneCode;
        this.noOfBedrooms = noOfBedrooms;
        this.yearsOfCOnstruction = yearsOfCOnstruction;
        this.riskFactor = riskFactor;
        this.type = type.equalsIgnoreCase("condo") ? 1 : 2;
    }

    // Accessor Methods
    public String getAddress() {
        return this.address;
    }

    public int getNoOfBedrooms() {
        return this.noOfBedrooms;
    }

    public int getZoneCode() {
        return this.zoneCode;
    }

    public int getYearsOfConstruction() {
        return this.yearsOfCOnstruction;
    }

    public String getType() {
        return this.type == 1 ? "Condo" : "SFHome";
    }

    public float RiskFactor() {
        return this.riskFactor;
    }

    /*
     * Mutator Methods
     */
    public void setAddress(String address) {
        this.address = address;
    }

    public void setNoOfBedrooms(int noOfBedrooms) {
        this.noOfBedrooms = noOfBedrooms;
    }

    public void setZoneCode(int zoneCode) {
        this.zoneCode = zoneCode;
    }

    public void setYearsOfConstruction(int yearsOfCOnstruction) {
        this.yearsOfCOnstruction = yearsOfCOnstruction;
    }

    public void setType(String type) {
        this.type = type.equalsIgnoreCase("condo") ? 1 : 2;
    }

    public void setRiskFactor(float riskFactor) {
        this.riskFactor = riskFactor;
    }

    // To String Method
    public String toString() {
        String type = getType();
        return (this.address + " " + this.zoneCode + " " + this.noOfBedrooms + " " + this.yearsOfCOnstruction + " "
                + type + " " + this.riskFactor);
    }

    // Equals Method
    public boolean equals(Property property) {
        return ((property.address.equals(this.address)) && this.zoneCode == property.zoneCode
                && this.noOfBedrooms == property.noOfBedrooms
                && this.yearsOfCOnstruction == property.yearsOfCOnstruction && this.type == property.type
                && this.riskFactor == property.riskFactor);
    }

    /*
     * Analyze Method
     */
    public double analyzeInvestment() {
        return (double) this.riskFactor * 50;
    }

    /*
     * Evaluate Price
     */
    public double evaluatePrice() {
        int basePrice = basePrice();
        return (basePrice + (0.05 * basePrice * noOfBedrooms) +
                (yearsOfCOnstruction * 100) / 2);
    }

    /*
     * Calculate the Base Price
     */
    protected int basePrice() {
        int basePrice = 100000;
        if (this.type == 1) {
            if (this.zoneCode == 1) {
                basePrice = 300000;
            } else if (this.zoneCode == 2) {
                basePrice = 200000;
            } else if (this.zoneCode == 3) {
                basePrice = 100000;
            }
        } else if (this.type == 2) {
            if (this.zoneCode == 1) {
                basePrice = 500000;
            } else if (this.zoneCode == 2) {
                basePrice = 400000;
            } else if (this.zoneCode == 3) {
                basePrice = 300000;
            }
        }
        return basePrice;
    }

    public void displayDetails() {
        System.out.println(" \nType: " + getType() + "\nAddress:" + address + "\nZone:" + zoneCode
                + "\nNo. of Bedrooms: " + noOfBedrooms
                + "\nYear of Construction: " + yearsOfCOnstruction + "\nR. Factor:" + riskFactor
                + "\nInvestment analysis: "
                + String.format("%.1f", analyzeInvestment()) + "\nEvaluated price: $"
                + String.format("%.2f", evaluatePrice()));
    }

    /*
     * 
     * Style formatter for the program
     */

    public void header()// Displays the header
    {
        System.out.println("************************\nWelcome to ABC Analyzer\n************************");
    }

    public void dividor()// Divides each property
    {
        System.out.println("==========================");
    }

    public void footer()// the footer message
    {
        System.out.println("Thanks for using our software");
    }
}
