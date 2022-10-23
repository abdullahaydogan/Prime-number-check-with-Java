public class Main {

    public static void asal(int num){
        int sayac=0;
        int i=2;
        while(i<num){
            if(num%i==0){
                sayac++;
            }
            i++;
        }
        if(sayac==0){
            System.out.println("Sayı ASALDIR");
        }
        else{
            System.out.println("Sayı ASAL DEĞİLDİR");
        }
    }

    public static void main(String[] args) {

       asal(12);
    }
}