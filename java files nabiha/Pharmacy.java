import java.util.*;
public class Pharmacy {

    ArrayList<Medicine> medicines;
    public Pharmacy(){
    medicines = new ArrayList<>();
}
    // Add medicine
    public void addMedicine(Medicine medicine){
        this.medicines.add(medicine);
    }

    // Remove medicine
    public void removeMedicine(Medicine medicine){
        this.medicines.remove(medicine);
    }
    
    // Sale Method
    public void saleStock(Medicine medicine, int quantity){
        medicine.saleMedQuantity(quantity);
    }

    // Purchase Method
    public void purchaseStock(Medicine medicine, int quantity){
        medicine.purchaseMedQuantity(quantity);
    }

    // Medicine List
    public ArrayList<Medicine> getMedicineList(){
        return medicines;
    }
}
