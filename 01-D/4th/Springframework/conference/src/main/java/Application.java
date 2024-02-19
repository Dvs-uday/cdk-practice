import com.project1.service.SpeakerServiceimpl;

public class Application {
    public static void main(String args[])
    {
        SpeakerServiceimpl service =new SpeakerServiceimpl();

        System.out.println(service.findall().get(0).getLastname());
    }
}
