import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.ApplicationContext;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableAutoConfiguration
public class Example
{

  @Autowired
  private ApplicationContext appContext;

  public static void main(String[] args) throws Exception
  {
    SpringApplication.run(Example.class, args);
  }

  @RequestMapping("/")
  String home()
  {
    return "Hello World!";
  }

  @RequestMapping("/stop")
  String stop()
  {
    SpringApplication.exit(appContext);
    return "Shut Down!";
  }
}