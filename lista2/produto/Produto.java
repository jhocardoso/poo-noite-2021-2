package lista2.produto;

public class Produto {
    // vamos encapsular as variáveis -> esconder, proteger, privar de mau uso
    private int id, qtde;
    private String descricao;
    private float preco;

    public Produto(){

    }
    public Produto(int id, int qtde, String descricao, float preco){
        this.id = id;
        this.qtde = qtde;
        this.descricao = descricao;
        this.preco = preco;
    }

    // vamos criar os métodos setters
    public void setQtde(int qtde){
        if (qtde >=0){
            this.qtde = qtde;
        }
        else {
            System.out.println("Qtde de produto não pode ser negativo");
        }
    }
    public void setPreco(float preco){
        if (preco >= 0){
            this.preco = preco;
        }
        else {
            System.out.println("Preço de produto não pode ser negativo");
        }
    }

    public void setId(int id){
        if (id >= 0){
            this.id = id;
        }
        else {
            System.out.println("Id de produto não pode ser negativo");
        }
    }

    public void setDescricao(String descricao){
        if (!descricao.isEmpty()){ // se descricao não for vazio
            this.descricao = descricao;
        }
        else {
            System.out.println("Descrição de produto não pode ser vazio");
        }
        
    }

    // comprar
    public void comprar(int x){

        this.qtde += x;

    }
     // vender
     public void vender(int x){

        this.setQtde(this.qtde-x);

    }
     // subir
     public void subir(float x){
        this.preco += x;
    }
     // subir
     public void descer(float x){

        this.setPreco(this.preco - x);
    
    }

    public String mostra(){
        return String.format("Id: %d Nome: %s Qtde: %d Preço %.2f", this.id, this.descricao, this.qtde, this.preco);
    }


}
