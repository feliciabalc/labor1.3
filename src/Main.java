public class Main {
    public static void main(String[] args) {
        int[] a=sum(new int[]{1320}, new int[]{1720});
        for(int element:a){
            System.out.println(element);
        }
        int[] b=multiplikation(new int[]{54}, new int[]{2});
        for(int element:b) {
            System.out.println(element);
        }
        int[] c=multiplikation(new int[]{541}, new int[]{180});
        for(int element:c) {
            System.out.println(element);
        }
    }
    public static int[] sum(int[] array1, int[] array2) {
        int[] sum=new int[array1.length];
        for (int i = 0; i < sum.length; i++) {
            sum[i] = 0;
        }
        int index=array1.length-1;
        if (array1.length==array2.length){
            for (int i=array1.length-1;i>0; i--){
                for (int j=array2.length-1;j>0; j--){
                    if(sum[index]+array1[i]+array2[j]<9){
                        sum[index]=sum[index]+array1[i]+array2[j];
                        index--;
                    }else{
                        sum[index]=(sum[index]+array1[i]+array2[j])%10;
                        index--;
                        sum[index]=sum[index]+(array1[i]+array2[j])/10;
                    }
                }
            }
        }
        return sum;
    }
    public static int[] multiplikation(int[] array, int[] x){
        int[] result=new int[array.length+1];

        int index= array.length-1;

        for (int i=array.length-1;i>0; i--){
            result[index]=(result[index]+array[i]*x[0])%10;
            index--;
            result[index]=(array[i]*x[0])/10;
        }
        return result;
    }

    public static int[] differenz(int[] array1, int[] array2){
        int[] diff=new int[array1.length];

        int index=array1.length-1;
        int ok=0;
        if (array1.length==array2.length) {
            for (int i = array1.length - 1; i > 0; i--) {
                if (ok == 1) {
                    array1[i]--;
                }
                for (int j = array2.length - 1; j > 0; j--) {
                    if (array1[i] - array2[j] > 0) {
                        diff[index] = array1[i] - array2[j];
                        index--;
                    } else {
                        diff[index] = 10 + array1[i] - array2[j];
                        index--;
                        ok = 1;
                    }
                }
            }
        }
        return diff;
    }

}