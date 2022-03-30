package demo;

import org.springframework.stereotype.Component;

@Component
public class Nurse implements Staff {
    /*public Nurse(String qualification) {
        this.qualification = qualification;
    }

    private String qualification;

    public String getQualification() {
        return qualification;
    }

    public void setQualification(String qualification) {
        this.qualification = qualification;
    }*/

    public void assist() {
        System.out.println("Nurse is assisting...");
    }
}
