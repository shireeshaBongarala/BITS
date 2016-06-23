import java.util.Scanner;

public class BITS {

    public static void main(String args[]){
        System.out.print("enter size of array");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int arr[]= new int[n+1];
        arr[0]=0;
        for(int i=1;i<=n;i++){
            arr[i]= scanner.nextInt();
        }
        int bit[] = new int[n+1];
        bit[0]=0;
        for (int i=1;i<=n;i++){
            bit[i]=0;
            int setBit = i -(i & -i) +1;
            while(setBit <= i){
                bit[i]+= arr[setBit];
                setBit++;
            }
        }

        System.out.print(getSum(n,bit));
        bit = updateValue(n, bit, 2);
        System.out.print(getSum(n,bit));

    }

    public static int getSum(int i, int[] bit){
       int ans =0;
        while(i>0){
            ans+= bit[i];
            i=i-(i & -i);
        }
        return ans;
    }

    public static int[] updateValue(int i, int[] bit, int diff){
        while(i< bit.length){
            bit[i] +=diff;
            i=i+ (i &-i);
        }
        return bit;

    }
}
