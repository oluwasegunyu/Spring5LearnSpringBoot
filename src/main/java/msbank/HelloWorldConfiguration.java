package msbank;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class HelloWorldConfiguration {
    @Bean
    public MessageProvider provider(){
        return new HelloWorldMessageProvider();
    }
    @Bean
    public MessageRender renderer(){
        MessageRender render = new StandardOutMessageRender();
        render.setMessageProvider(provider());
        return render;
    }
}
