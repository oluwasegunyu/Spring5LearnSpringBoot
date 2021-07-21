package msbank;

import org.springframework.context.support.GenericXmlApplicationContext;

public class DeclareSpringComponents {
    public static void main(String... args){
        GenericXmlApplicationContext ctx = new GenericXmlApplicationContext();
        ctx.load("classpath:spring/app-context.xml");
        ctx.refresh();
        MessageRender messageRender = ctx.getBean("renderer", MessageRender.class);
        messageRender.render();
        ctx.close();
    }
}
