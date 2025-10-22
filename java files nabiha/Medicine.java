public class Medicine {
    private String medName;
    private double medCost;
    private int medQuantity;
    

    // Constructor
    Medicine(String medName, double medCost, int medQuantity){
        this.medName = medName;
        this.medCost = medCost;
        this.medQuantity = medQuantity;
    }

    // Get Method medicine name
    public String getMedName(){
        return this.medName; 
    }

    // Set Method medicine name
    public void SetMedName(String medName){
        this.medName = medName; 
    }

    // Get Method medicine cost
    public double getMedCost(){
        return this.medCost; 
    }

    // Set Method medicine cost
    public void SetMedCost(double medCost){
        this.medCost = medCost; 
    }

    // Get Method medicine quantity
    public int getMedQuantity(){
        return this.medQuantity; 
    }

    // Set Method medicine quantity
    public void SetMedQuantity(int medQuantity){
        this.medQuantity = medQuantity; 
    }

    // Sale Method
    public void saleMedQuantity(int quantity){
        medQuantity -= quantity; 
    }

    // Purchase Method
    public void purchaseMedQuantity(int quantity){
        medQuantity += quantity; 
    }

    // Get medicine Information
    public String getInfo(){
        return "Medicine Name: " + medName + "CostName: " + medCost + "Quantity: " + medQuantity;
    }
}
