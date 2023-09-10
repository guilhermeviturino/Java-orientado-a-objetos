import java.util.Scanner;

public class Exercicio12 {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Palavra 1: ");
        String p1 = sc.nextLine();

        System.out.println("Palavra 2: ");
        String p2 = sc.nextLine();

        System.out.println("Palavra 3: ");
        String p3 = sc.nextLine();

        sc.close();
        
       if (p1.equalsIgnoreCase("vertebrado")) {
            if (p2.equalsIgnoreCase("ave")) {
                if (p3.equalsIgnoreCase("carnivoro")) {
                    System.out.println("ÁGUIA");
         } else {
            System.out.println("POMBA");
                }
            }
        }

       if (p1.equalsIgnoreCase("vertebrado")) {
            if (p2.equalsIgnoreCase("mamifero")) {
                if (p3.equalsIgnoreCase("onivoro")){
                    System.out.println("HOMEM");
                } else {
                    System.out.println("VACA");
                }
            }
       }

       if (p1.equalsIgnoreCase("invertebrado")) {
            if (p2.equalsIgnoreCase("inseto")) {
                if (p3.equalsIgnoreCase("hematofago")) {
                    System.out.println("PULGA");
                } else {
                    System.out.println("LARGATA");
                }
            }
       }

       if (p1.equalsIgnoreCase("invertebrado")) {
            if (p2.equalsIgnoreCase("anelidio")) {
                if (p3.equalsIgnoreCase("hematofago")) {
                    System.out.println("SANGUESSUGA");
                } else {
                    System.out.println("MINHOCA");
                }
            }
       }
    }
}
