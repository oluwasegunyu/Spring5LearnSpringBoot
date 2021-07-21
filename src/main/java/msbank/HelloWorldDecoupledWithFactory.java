package msbank;

public class HelloWorldDecoupledWithFactory {
    public static void main(String... args){
        MessageRender mr = MessageSupportFactory.getInstance().getMessageRenderer();
        MessageProvider mp = MessageSupportFactory.getInstance().getMessageProvider();
        mr.setMessageProvider(mp);
        mr.render();
    }
}
