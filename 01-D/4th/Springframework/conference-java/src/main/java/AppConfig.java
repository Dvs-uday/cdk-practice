import com.project1.repository.Speakerrepository;
import com.project1.repository.Stubspeakerrepositoryimpl;
import com.project1.service.SpeakerService;
import com.project1.service.SpeakerServiceimpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration // Java configuration is added
public class AppConfig {

    @Bean(name="speakerService") //auto-wiring by name using bean
    public SpeakerService getSpeakerService()
    {
        SpeakerServiceimpl service =new SpeakerServiceimpl();
        service.setRepository(getSpeakerrepository()); //using the setter injection by setting it to getSpeakerrepository method down
        return service;
    }

    @Bean(name="speakerRepository")
    public Speakerrepository getSpeakerrepository()
    {

        return new Stubspeakerrepositoryimpl();
    }

}
