import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;


@Configuration
public class SpringBeanConfi {

    @Bean(initMethod = "initlization",destroyMethod = "delelting",name = "mybookbean")
    @Scope("singleton")
    public Book getBookBean() {
        return new Book();
     }

     @Bean(name ="authorbean")
     @Scope("prototype")
     public Author getAuthorBean()
  {
      return new Author();
  }

}
