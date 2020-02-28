public class Main {

    public static void main(String[] args) {

        int sum = 0;
        for (int i = 1; i <= 30; i++){
            for (int j = 0; j < 30; sum+=j) {
                    System.out.printf("the inner sum is %d\n", sum);
                    j++;
                    System.out.printf("the outer value is %d\n", i);
                    i++;
                    continue;
            }
            }
        }
    }

