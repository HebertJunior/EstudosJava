package A29_07;

import java.util.Arrays;
import java.util.Scanner;

public class Vetores {
     
    int op;
    String vetor[] = new String[6];
    Scanner ent = new Scanner(System.in);

     public Vetores() {
    }
    
   //EX1 ====================================================================
    public void MétodoEscolher() { //método para escolher array
        System.out.print("Digite uma opção de vetor = 1, 2 ou 3:");
        op = ent.nextInt();
        if (op == 1) {
            System.out.println("O vetor escolhido foi 'ordena'");
            vetor = new String[] {"o", "r", "d", "e", "n", "a"};
        } else if (op == 2) {
            System.out.println("O vetor escolhido foi 'anedro' ");
            vetor = new String[] {"a", "n", "e", "d", "r", "o"};
        } else if (op == 3) {
            System.out.println("O vetor escolhido foi 'rodena' ");
            vetor = new String[] {"a", "n", "r", "d", "r", "o"};
        }
        
    }
    
    
    public void CrescentorN(){ //método que confere se é crescente ou não
       String vetor_comparado1[] = {"o", "r", "d", "e", "n", "a"};
       String vetor_comparado2[] = {"a", "n", "e", "d", "r", "o"};
       String vetor_comparado3[] = {"n", "a", "e", "d", "r", "o"};
        
        //método para escolher qual vetor que será comparado
        MétodoEscolher();
        
        //retornos if que comparam com o arrays.equals que comparam o conteudo
        if (Arrays.equals(vetor, vetor_comparado1)) {
            System.out.println(0 + " O vetor está em ordem crescente");
        } else if (Arrays.equals(vetor, vetor_comparado2)) {
            System.out.println(2 + " O vetor está em ordem decrescente");
        } else if (Arrays.equals(vetor, vetor_comparado3)) {
            System.out.println(1 + " O vetor não está em ordem decrescente");
        } else {
            System.out.println("O vetor não corresponde a nenhum dos vetores comparados");
        }
    }
    
    //EX 2 ===========================================================================
     public void MétodoDeterminarVetor(){
      String comp;
      
      System.out.println("Digite o componente de cada espaço:");
      //Caso usar no for a variavel de controle = 0, colocar vetos.lengt - 1
      for (int i = 0; i < vetor.length; i++) {
          System.out.print("Espaço" + (i + 1) + ":");
          comp = ent.nextLine();
          vetor[i] = comp;
          }
         System.out.println(Arrays.toString(vetor)); //para mostrar vetor usar Arrays.toString(nome
      }
     
    public void TrocarLugares(){ //método que troca de lugar - ex2
        //determinação de variáveis
        int position1; //posição1
        int position2; //posição2
        String temp; //variavel para guardar a posição


        // Escolha das trocas 
        System.out.print("Digite a 1° posição a ser trocada:");
        position1 = ent.nextInt() -1 ;

        System.out.print("Digite a 2° posição a ser trocada:");
        position2 = ent.nextInt() - 1 ;

        if (position1 > 0 && position1 <= 6 || position2 > 0 && position2 <= 6) {
             temp = vetor[position1]; //variavel para guardar o valor da p1 
            vetor[position1] = vetor[position2];
            vetor[position2] = temp;
            System.out.println(Arrays.toString(vetor)); //]sempre ao imprimir vetor string usar Arrays.toString
        } else {
            System.out.println("Defina valores de 1 a 6");
        }
}
        //EX 3 ===========================================================================
        public void Cascateamento(){
        MétodoDeterminarVetor();
        int p1;
        int p2;
        String pg1;
        Scanner ent = new Scanner(System.in);

        System.out.println("Digite as posições a serem trocadas (de 1 a 6)");
        p1 = ent.nextInt() - 1; //-1 para ser coerente ao vetor 0 a 5
        p2 = ent.nextInt() - 1;
        if (p1 >= vetor.length || p1 < 0 || p2 >= vetor.length || p2 < 0) {
            System.out.println("Digite um valor entre 1 e 6");
            //cd
        } else {
            pg1 = vetor[p1];
            if (p1 < p2) { 
                for (int i = p1; i < p2; i++) {
                vetor[i] = vetor[i + 1];
                } vetor[p2] =  pg1;
            } else if (p1 > p2) {
             for (int i = p1; i > p2; i--) {
                vetor[i] = vetor[i - 1];
                } vetor[p2] =  pg1;
            }
            vetor[p2] = pg1;
            System.out.println(Arrays.toString(vetor));
  /**
                 * Nessa dupla de codigo há um for que usa como parametro a diferença entre p1 e p2, fazendo
                 * disso o i de seu loop. No primeiro enquanto a diferença estiver ativa, exemplo 3
                 * ,a posição i irá receber o seu proximo, passando o valor da esquerda pra direita.
                 * Apos o loop o valor da troca inicial é feito.
                 * esquerda -> direita = aumentar o menor
                 * direita -> esquera = diminuir o maior
                 */
        }
        }
}
