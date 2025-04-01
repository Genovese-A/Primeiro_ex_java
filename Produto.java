package Trabalho;


public class Produto {
   String nome;
   double preco;
   int quantidadeEmEstoque;
   
   public void vender(int quantidade){
       if (quantidadeEmEstoque >= quantidade){
           quantidadeEmEstoque -= quantidade;
       }else{
           System.out.println("Estoque quantidadeEmEstoque");
       }
   }
   public void reabastecer(int quantidade){
       quantidadeEmEstoque += quantidade;
   }
   public void exibirDetalhes(){
       System.out.println("Nome: " + nome);
       System.out.println("preco: " + preco);
       System.out.println("Quantidade em estoque: " + quantidadeEmEstoque);
   }
}
