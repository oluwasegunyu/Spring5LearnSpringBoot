package msbank;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class HelloWorldSpringAnnotatedTest {
    public static void main(String[] args){
        ApplicationContext ctx = new AnnotationConfigApplicationContext(HelloWorldConfiguration.class);
        MessageRender mr = ctx.getBean("renderer", MessageRender.class);
        mr.render();
    }
}
