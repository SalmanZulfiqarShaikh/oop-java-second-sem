import java.util.ArrayList;

public class Phar_main {
    public static void main(String args[]){
        Medicine med1 = new Medicine("Panadol",100,10);
        Medicine med2 = new Medicine("Calpol",150,8);

        Pharmacy mypharmacy = new Pharmacy();
        mypharmacy.addMedicine(med1);
        mypharmacy.addMedicine(med2);

        mypharmacy.saleStock(med1,2);

        ArrayList<Medicine> medicine_list = mypharmacy.getMedicineList();
        for (Medicine medicine : medicine_list){
            System.out.println(medicine.getInfo());
        } 
}
}
