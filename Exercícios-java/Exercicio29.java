public class Exercicio29 {
    
    public static void main(String[] args) {
        
        int i =1;
        int b = 1;
        int a = 1;

        int j = 8;
        int jj = 7;
        int jjj = 6;
        int cont = 1;

        int totali;

        while(i <= 9) {
            j -= 1;
            jj -= 1;
            jjj -=1;
            System.out.print("i="+a);
            System.out.println(" "+"J="+j);

            System.out.print("i="+b);
            System.out.println(" "+"J="+jj);
            

            System.out.print("i="+i);
            System.out.println(" "+"J="+jjj);
            totali = a + b + i;
            i = totali;
            a = totali;
            b = totali;

            if(cont <=3) {
                j +=1;
                jj +=1;
                jjj += 1;
            }
        }

    }
}
