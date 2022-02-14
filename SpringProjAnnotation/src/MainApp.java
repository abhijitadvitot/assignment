import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainApp {
    public static void main(String[] args) {

        AnnotationConfigApplicationContext annotationConfigApplicationContext=
                new AnnotationConfigApplicationContext(SpringBeanConfi.class);

         Book book =(Book)annotationConfigApplicationContext.getBean("mybookbean");
        Author author=(Author) annotationConfigApplicationContext.getBean("authorbean");

book.setIsbn(201);
book.setTitle("Java");
        author.setAuthorId(101);
        author.setName("ABhijt");
//        book.setIsbn(101);
//        book.setTitle("Sppring");
         System.out.println(book);

        System.out.println(author);
    }
}
