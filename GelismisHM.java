import java.util.Scanner;
public class GelismisHM {




        static int sum(int a, int b){
            int result = a + b;
            System.out.println("Toplam: " + result);
            return result;
        }

        static int minus(int a, int b){
            int result = a - b;
            System.out.println("Cikarma: " + result);
            return result;
        }

        static int times(int a, int b){
            int result = a * b;
            System.out.println("Carpma: " + result);
            return result;
        }

        static int divided(int a, int b){
            if (b == 0){
                System.out.println("Ikinci sayi 0'dan farkli olmali.");
                return 0;
            }
            int result = a / b;
            System.out.println("Bolme: " + result);
            return result;
        }

        static int power(int a, int b){
            int result = 1;
            for (int i = 1; i <= b; i++){
                result *= a;
            }
            System.out.println("Uslu: " + result);
            return result;
        }

        static int mod(int a, int b){
            return a % b;
        }

        static void calc(int a, int b){
            System.out.println("Cevresi: " + (2 * (a + b)));
            System.out.println("Alani: " + (a * b));
        }

        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            int select;

            String menu = "1.Toplama\n" + "2.Cikarma\n" + "3.Carpma\n" + "4.Bolme\n"
                    + "5.Uslu Sayi\n" + "6.Mod Alma\n" + "7.Dikdortgen Alan Cevre\n"
                    + "0.Cikis";

            while (true) {
                System.out.println(menu);
                System.out.print("Bir islem seciniz: ");
                select = input.nextInt();

                if (select == 0){
                    break;
                }

                System.out.print("Ilk sayiyi giriniz: ");
                int a = input.nextInt();
                System.out.print("Ikinci sayiyi giriniz: ");
                int b = input.nextInt();

                switch(select){
                    case 1:
                        sum(a,b);
                        break;
                    case 2:
                        minus(a,b);
                        break;
                    case 3:
                        times(a,b);
                        break;
                    case 4:
                        divided(a,b);
                        break;
                    case 5:
                        power(a,b);
                        break;
                    case 6:
                        System.out.println("Mod: " + mod(a,b) );
                        break;
                    case 7:
                        calc(a,b);
                        break;
                    default:
                        System.out.println("Gecersiz bir islem girdiniz.");
                }
            }
        }
    }



