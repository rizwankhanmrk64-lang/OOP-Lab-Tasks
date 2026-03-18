Code Person.java:
package pkg76746_assignment1_7;
//76746 
public class Person {
    String fullName = "Rizwan Khan";
    char gender = 'M';
    long phoneNo = 1111111;
    String email = "assadf";
    String residence = "huasndsand";
}


Code Staff.java:
package pkg76746_assignment1_7;
//76746 
public class Staff extends Person {
    String staffId;
    String[] qualifications;
    String[] experiences;
    int pay;
}


Code MedicalStaff.java:
package pkg76746_assignment1_7;

public class MedicalStaff extends Staff {
    String specilizations;
}


Code Doctor.java :
    package pkg76746_assignment1_7;
//76746
public class Doctor extends MedicalStaff {
    String patients;

    String diagnose() {
        return "Common Cold";
    }

    String prescribe() {
        return "Softin";
    }
}


Code Nurse.java:
package pkg76746_assignment1_7;
//76746 
public class Nurse extends MedicalStaff {
    String wardId;
    void treatement() {
        System.out.println("Treated");
    }
}


Code Patient.java:
package pkg76746_assignment1_7;
//76746
public class Patient extends Person {
    String id;
    String diagnosis;
    String prescriptions;
}


Code Main.java:
package pkg73462_assignment1_7;
//76746 
public class Main {
    public static void main(String[] args) {
        Doctor doc = new Doctor();
        Nurse nur = new Nurse();
        Patient pat = new Patient();

        doc.pay = 2000000;
        nur.pay = 1500000;

        pat.diagnosis = doc.diagnose();
        pat.prescriptions = doc.prescribe();

        nur.treatement();

        System.out.println("Diagnosis: " + pat.diagnosis);
        System.out.println("Prescription: " + pat.prescriptions);
    }
}

