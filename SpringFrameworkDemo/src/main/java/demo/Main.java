package demo;
//Tutorial: https://www.youtube.com/watch?v=zvR-Oif_nxg&t=1304s

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {


    public static void main(String[] args) {
        //ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        ApplicationContext context = new AnnotationConfigApplicationContext(BeanConfig.class);
        Doctor doctor = context.getBean(Doctor.class);
        doctor.assist();
        /*System.out.println(doctor);
        doctor.setQualification("MBBS");
        System.out.println(doctor);
        Doctor doctor1 = context.getBean(Doctor.class);
        System.out.println(doctor1);*/
    }
}
