public class StratPatt {

    public static void main(String[] args) {
        Context context = new Context(new Binary());
        System.out.println(context.executeStrategy(10));

        context = new Context(new Hexdec());
        System.out.println(context.executeStrategy(10101001));

        context = new Context(new Octa());
        System.out.println(context.executeStrategy(20));

    }

}
