import com.project1.service.SpeakerService;
import com.project1.service.SpeakerServiceimpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Application {
    public static void main(String args[])
    {
        ApplicationContext appContext=new ClassPathXmlApplicationContext("applicationContext.xml");

        //SpeakerServiceimpl service =new SpeakerServiceimpl();

        SpeakerService service=appContext.getBean("speakerService",SpeakerService.class);

        //here we are calling its interface instead of its class

        System.out.println(service.findall().get(0).getLastname());
    }
}
