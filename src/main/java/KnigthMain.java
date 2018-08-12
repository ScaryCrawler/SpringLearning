import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class KnigthMain {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext applicationContext =
                new ClassPathXmlApplicationContext("knigth.xml");
        Knigth knigth = applicationContext.getBean(Knigth.class);
        knigth.embarkOnQuest();
        applicationContext.close();
    }
}
