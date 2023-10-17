public class Main {
    public static void main(String[] args) {
        sum(new int[]{17555}, new int[]{13555}); //3.1
        System.out.println("   ");

        multiplikation(new int[]{54}, new int[]{2});//3.3
        System.out.println("   ");

        differenz(new int[]{162}, new int[]{122});//3.2
        System.out.println("   ");

        division(new int[]{352}, new int[]{2});//3.4


    }
    public static void sum(int[] array1, int[] array2) {
        int[] finalSum = new int[array1.length + 1];
        int rest = 0;

        for (int i = array1.length - 1; i >= 0; i--) {
            int digitSum = array1[i] + array2[i] + rest;
            finalSum[i +1] = digitSum % 10;
            rest = digitSum / 10;
        }

        finalSum[0] = rest;

        for (int digit : finalSum) {
            System.out.print(digit);
        }
    }
    public static void multiplikation(int[] array, int[] x){
        int[] result=new int[array.length+1];

        int rest=0;

        for (int i=array.length-1;i>=0; i--){
            result[i+1]=(rest+array[i]*x[0])%10;
            rest=(array[i]*x[0])/10;
        }
        result[0] = rest;
        for (int digit : result) {
            System.out.print(digit);
        }
    }

    public static void differenz(int[] array1, int[] array2){
        int[] diff=new int[array1.length+1];

        int rest=0;
        if (array1.length==array2.length) {//exceptie daca nu?
            for (int i = array1.length - 1; i >= 0; i--) {
                    if (array1[i] - array2[i] > 0) {
                        diff[i+1] = rest+array1[i] - array2[i];
                    } else {
                        diff[i + 1] = (10 + (array1[i] - array2[i])) % 10;
                        rest = (10 + (array1[i] - array2[i])) / 10;
                        array1[i - 1]--;
                    }
            }
            diff[0] = rest;
            for (int digit : diff) {
                System.out.print(digit);
            }
        }
    }
    public static void division(int[] array, int[] x) {
        int rest = 0;
        int[] result = new int[array.length];

        for (int i = 0; i < array.length; i++) {
            int dividend = rest * 10 + array[i];
            result[i] = dividend / x[0];
            rest = dividend % x[0];
        }

        for (int digit : result) {
            System.out.print(digit);
        }
        }
}