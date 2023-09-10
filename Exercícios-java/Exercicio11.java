import java.util.Scanner;

public class Exercicio11 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Hora de início: ");
        int horaInicio = sc.nextInt();

        System.out.println("Digite a hora do término: ");
        int horaTermino = sc.nextInt();

        sc.close();

        int duracao = 0;

        if (horaInicio < horaTermino){
            duracao =  horaTermino - horaInicio;
        } else {
            duracao = (24 - horaInicio) + horaTermino;
        }
        
        System.out.printf("O jogo durou %d hora(s)", duracao);
    }
    
}
