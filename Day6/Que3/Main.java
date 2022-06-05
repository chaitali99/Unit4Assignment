package Que3;

public class Main {
    public boolean checkPrime(int n){
        boolean flag=true;
        for(int j=2;j<n;j++){
            if(n%j==0){
                flag=false;
            }
        }
        return flag;
    }
    public int[] findAndReturnPrimeNumbers(int[] inputArray){
        int count=0;
        for (int i=0;i<inputArray.length;i++){
            if(checkPrime(inputArray[i])){
                count++;
            }
        }
        int[] primeArr = new int[count];

        int pos=0;
        for (int i=0;i<inputArray.length;i++){
            if(checkPrime(inputArray[i])){
                primeArr[pos]=inputArray[i];
                pos++;
            }
        }

        return primeArr;
    }
    public static void main(String[] args){

        Main m1 = new Main();
        int[] arr = {10,12,5,50,11,14,15};
        int[] new_arr = m1.findAndReturnPrimeNumbers(arr);

        if(new_arr.length>0){

            for (int item : new_arr){
                System.out.println(item);
            }
        }
        else {
            System.out.println("Prime number not found in the supplied Array");
        }
    }

}
