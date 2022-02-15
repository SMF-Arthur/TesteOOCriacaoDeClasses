
package Numero1e2;

public class Teste {

    public static void main(String[] args) {
        
        Pessoa pe = new Pessoa();
        Automovel at = new Automovel();
        
        String palavra;
        
        pe.veiculo = at;
        
        pe.nome = "Arthur";      
        at.marcaFabricante = "Italia";
        at.modelo = "Ferrari Tx";
        at.quantidadeDePassageiros = 2;
        at.anoDeFabricacao = 1990;        
        
        System.out.println("Bem vindo senhor : " + pe.nome);        
        
        System.out.println("Seu carro, uma : " + pe.veiculo.modelo + " Fabricada pela : "+ pe.veiculo.marcaFabricante);
        System.out.println("Comporta até " + pe.veiculo.quantidadeDePassageiros + " Pessoa dentro do veiculo, que foi fabricado em " + pe.veiculo.anoDeFabricacao);
        
    }
    
}
