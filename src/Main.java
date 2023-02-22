import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        /*
        Koşullar :

        Sıcaklık 5'dan küçük ise "Kayak" yapmayı öner.
        Sıcaklık 5 ve 15 arasında ise "Sinema" etkinliğini öner.
        Sıcaklık 15 ve 25 arasında ise "Piknik" etkinliğini öner.
        Sıcaklık 25'ten büyük ise "Yüzme" etkinliğini öner.
        Ödev
        Aynı örnek üzerinden if koşulları başka hangi şekilde oluşturulabilirdi farklı çözüm yolları bulunuz.
         */
        double weather;

        Scanner input = new Scanner(System.in);
        System.out.print("Hava Sıcaklığını Giriniz : ");
        weather = input.nextDouble();
        if(weather>=0 && weather<=35) {
            if (weather <= 5) {
                System.out.println("Kayak yapabilirsiniz...");
            } else if (weather > 5 && weather <= 15) {
                System.out.println("Sinemaya Gidebilirsiniz...");
            } else if (weather > 15 && weather <= 25) {
                System.out.println("Piknik yapabilirsiniz...");
            } else if (weather > 25) {
                System.out.println("Yüzebilirsiniz...");
            }
        }
        else{
            System.out.println("Sağlığınız İçin Dışarı Çıkmayın !");
        }

    }
}