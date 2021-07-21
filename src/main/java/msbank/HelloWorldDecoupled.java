package msbank;

public class HelloWorldDecoupled {
    public static void main(String... args){
        MessageRender mr = new StandardOutMessageRender();
        MessageProvider mp = new HelloWorldMessageProvider();
        mr.setMessageProvider(mp);
        mr.render();
    }
}
