
package projeto_isa;

import javax.swing.JOptionPane;


public class Projeto_isa {

   
    public static void main(String[] args) {
       String nome = JOptionPane.showInputDialog("Como se chama?");
       JOptionPane.showMessageDialog(null, "Bem vinda "+nome);
       String idade = JOptionPane.showInputDialog("Digite sua idade");
       String msg = "Que legal "+nome+", você tem "+idade+" anos ";
       JOptionPane.showMessageDialog(null,msg);
       String rl = JOptionPane.showInputDialog("O que é, o que é? Dá muitas voltas e não sai do lugar.");
       if(rl.equals("O relógio")){
           JOptionPane.showInputDialog(null, "acertou!!");
       }
              else{
JOptionPane.showMessageDialog(null,"Errou!");    } 
    }
    
}

usei esta atividade pois gostei da atividade, criamos diálogos com o computador.
