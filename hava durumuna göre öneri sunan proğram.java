import java.util.Scanner ;
public class dersss {

    public static void main (String[] args) {

      Scanner scan = new Scanner(System.in);


//Sıcaklık 5'dan küçük ise "Kayak" yapmayı öner.
//Sıcaklık 5 ve 15 arasında ise "Sinema" etkinliğini öner.
//Sıcaklık 10 ve 25 arasında ise "Piknik" etkinliğini öner.
//Sıcaklık 25'ten büyük ise "Yüzme" etkinliğini öner.

        int heat ;

        System.out.print("Hava sıcaklığını giriniz : ");
            heat=scan.nextInt();

            if (heat<5) {
                System.out.println("kayak yapabilirsiniz.");

            } else if (heat<25) {
                if (heat<=15) {
                    System.out.println("sinemaya gidebilirsiniz.");

                } if (heat>=10) {
                    System.out.println("Piknik yapabilirsiniz .");
                }

                    } else if (heat  >  25) {
                        System.out.println("Yüzmeye gidebilirsiniz.");
            }
                    }

                        };


