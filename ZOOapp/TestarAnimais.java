package ZOOapp;

public class TestarAnimais {
    
    public static void main(String[] args) {
        
        Animal camelo = new Animal("camelo", 5, 4, 
        "Amarelo", "Terra", 30);
        camelo.exibirDados();

        System.out.println("----------------------------------------------------");

        Peixe tubarao = new Peixe("tubarão", 5, 0,
         "Cinza", "Água", 30, "Barbatanas e caudas");
         tubarao.exibirDados();

         System.out.println("----------------------------------------------------");

         Mamifero ursoCanada = new Mamifero("Urso do canadá", 180, 4, 
         "Marrom", "Terra", 30, "peixe");
         ursoCanada.exibirDados();
    }
}
