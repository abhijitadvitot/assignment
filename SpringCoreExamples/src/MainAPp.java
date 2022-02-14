//Q1. Please create one Spring core project with Employee and Laptop bean injected using setter and constructor both
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainAPp {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext classPathXmlApplicationContext=
                new ClassPathXmlApplicationContext("spring.xml");

        Employee employee_bean= (Employee) classPathXmlApplicationContext.getBean(("employee_bean"));

        Employee employee_bean1= (Employee) classPathXmlApplicationContext.getBean(("employee_bean constructs"));

        Laptop laptop_bean=(Laptop) classPathXmlApplicationContext.getBean(("laptop_bean"));

        Laptop laptop_bean1=(Laptop) classPathXmlApplicationContext.getBean(("laptop_bean constructs"));

        System.out.println("This is using setter and Getter"+employee_bean);


        System.out.println(("This is usingg setter and getter "+laptop_bean));

        System.out.println("This is using Consrusots"+employee_bean1);

        System.out.println("This is using Construcopts"+laptop_bean1);

        classPathXmlApplicationContext.close();
    }
}

