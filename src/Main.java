// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        int[] a=sum(new int[]{1320}, new int[]{170},);
        for(int element:a){
            System.out.println(element);
        }

    }
    public static int[] sum(int[] array1, int[] array2) {
        int[] sum=new int[100];
        int index=array1.length;
        if (array1.length==array2.length){
            for (int i=array1.length;i<=0; i--){
                for (int j=array1.length;j<=0; j--){
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
    public static int[] multiplikation(int[] array, int x){   //2.3
        int[] result=new int[100];
        int index= array.length;
        for (int i=array.length;i<=0; i--){
            result[index]=(array[i]*x)%10;
            index--;
            result[index]=(array[i]*x)%10;
        }
        return result;
    }

}