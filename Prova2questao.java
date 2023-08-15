
package javaapplication1;

import java.util.Scanner;

public class Prova2questao {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
          String pergunta = "S";
          String nome;
          int resposta = 0;

        
        do{
            System.out.print("Digite o nome do Aluno: ");
            nome = sc.next();
            
            System.out.print("Digite sua primeira nota: ");
             int nota1 = sc.nextInt();
             
             System.out.print("Digite sua segunda nota: ");
             int nota2 = sc.nextInt();
             
             System.out.print("Digite sua terceira nota: ");
             int nota3 = sc.nextInt();

             resposta = (nota1 + nota2 + nota3) /3;
             
              if(resposta > 7){
                    System.out.println("Aprovado " + resposta);
                    
                    
              }else if(resposta > 6 || 7 < resposta){
                  
                     System.out.println("Em exame " + resposta);
                     
              }else{
                  System.out.println("Reprovado " + resposta);
              }

             System.out.print("Deseja cadastrar outro Nome? (S/N): ");
             pergunta = sc.next();

        }while(pergunta.equalsIgnoreCase("S"));
        
        System.out.println("Nome do Aluno: " + nome);
        System.out.println("Media do Aluno: " + resposta);
        

        
    }
}
