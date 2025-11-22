class Doctor{
    public Consultation recordConsultation(Consultation consult){
        return consult;
    }
}

class Patient{
    Consultation consultation;
    Patient(){
    }

}

class Auditor{
 public void CheckRepeatedDrugs(){

 }
}

class Consultation{
  public String illnessDiagnosis;
  public String prescribeDrug;
  public Doctor doc;
  public Patient patient;
    Consultation(Doctor doc,Patient patient){
    this.doc=doc;
    this.patient=patient;
  }
  public String IllnessDiagnosis(){
        return illnessDiagnosis;
  }
  public void PrescibeDrug(Drug drug){
        
  }
  public Consultation recordConsultation(Consultation consult){
    return consult;
}
}

class Drug{
 String drugname;
 int quantity;

 public String GetDrugName(){
   return drugname;
 }
 public int GetDrugQuantity(){
    return quantity;
  }
}

public class MedicalSystem {
    public static void main(String args[]){
     Doctor doc= new Doctor();
     Patient patient= new Patient();
     Consultation consultation= new Consultation(doc, patient);

}
}
