public class Binary implements Strategy{

    @Override
    public int convert(int num){

        int[] binaryNum = new int[32];

        int i = 0;
        while (num > 0) {

            binaryNum[i] = num % 2;
            num = num / 2;
            i++;
        }

        for (int j = i - 1; j >= 0; j--)
            System.out.print(binaryNum[j]);

        return i;

    }
}
