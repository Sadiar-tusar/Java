package usecontinue;

public class UseContinue {

    public static void main(String[] args) {
        
        int targetValue = 50;
        int count = 1;

        while (count <= targetValue) {

            if (count % 3 == 0 && count % 5 == 0) {
                count++;
                continue;
            }
            System.out.println("" + count);
            count++;
        }
    }

}
