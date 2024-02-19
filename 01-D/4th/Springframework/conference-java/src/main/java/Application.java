import com.project1.service.SpeakerService;
import com.project1.service.SpeakerServiceimpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Application {
    public static void main(String args[])
    {

        //SpeakerServiceimpl service =new SpeakerServiceimpl();

        ApplicationContext appContext=new AnnotationConfigApplicationContext(AppConfig.class);


        SpeakerService service= appContext.getBean("speakerService",SpeakerService.class);


        System.out.println(service.findall().get(0).getFirstname());
    }
}
