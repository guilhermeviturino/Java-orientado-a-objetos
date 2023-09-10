import java.util.Scanner;

public class Exercicio09 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Duração do evento: ");
        int duracao = sc.nextInt();

        sc.close();

        int horas = duracao / 3600;
        int minutos = (duracao % 3600) / 60;
        int segundos = (duracao % 3600) % 60;

        System.out.printf("HH:MM:SS = %02d:%02d:%02d", horas, minutos, segundos);

    }
    
}
