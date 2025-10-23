import java.util.*;

import ExamTenMarks.ArrayListSSS;
public class Pharmacy {

    ArrayListSSS<Medicine> medicines;
    public Pharmacy(){
    medicines = new ArrayListSSS<>();
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
    public ArrayListSSS<Medicine> getMedicineList(){
        return medicines;
    }
}
