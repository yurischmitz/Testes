/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testes;

/**
 *
 * @author yuris
 */
public class Testes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
         Pessoa pessoa1 = new Pessoa();
         Pessoa pessoa2 = new Pessoa();
         
         
         pessoa1.setNome("Yuri");
         pessoa1.setSaldo(500);
         pessoa1.setDebito(0);
         
         pessoa2.setNome("Cris");
         pessoa2.setSaldo(500);
         pessoa2.setDebito(0);
         
         if(pessoa1.getDebito() > 0 && pessoa2.getDebito() > 0){
             System.out.println("\n\n\t\t\tVOCÊ ESTÁ TENTANDO TRANSFERIR PARA DUAS CONTAS AO MESMO TEMPO\n\n");
         } else {
             if(pessoa2.getSaldo() >= pessoa2.getDebito() && pessoa2.getDebito() > 0){
               //depositando para o Yuri
               pessoa1.setSaldo(pessoa1.getSaldo() + pessoa2.getDebito());//DEPOSITANDO
               pessoa1.setRecebeu(pessoa2.getDebito());//DIZENDO QUANDO RECEBEU
               pessoa2.setSaldo(pessoa2.getSaldo() - pessoa2.getDebito());//TIRANDO O VALOR DA OUTRA PESSOA
               System.out.println(pessoa1);
               System.out.println(pessoa2);
            } else if(pessoa2.getDebito() > pessoa2.getSaldo()){
                System.out.println("\n\nVALOR MUITO ALTO\n\n");
            }

            if(pessoa1.getSaldo() >= pessoa1.getDebito()&& pessoa1.getDebito() > 0){
               //DEPOSITANDO PARA A CRIS
               pessoa2.setSaldo(pessoa2.getSaldo() + pessoa1.getDebito());//DEPOSITANDO
               pessoa2.setRecebeu(pessoa1.getDebito());//DIZENDO QUANDO RECEBEU
               pessoa1.setSaldo(pessoa1.getSaldo() - pessoa1.getDebito());//TIRANDO O VALOR DA OUTRA PESSOA
               System.out.println(pessoa1);
               System.out.println(pessoa2);
            } else if(pessoa1.getDebito() > pessoa1.getSaldo()){
                System.out.println("\n\nVALOR MUITO ALTO\n\n");
            }
         }
    }   
}