import static java.lang.Integer.toOctalString;

public class Octa implements Strategy{

    @Override
    public int convert(int num){

        toOctalString(num);

        return num;

    }
}
