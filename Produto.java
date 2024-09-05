public class Produto {

    private String nome;
    private String codigo;
    private double preco;

    public Produto(String nome, String codigo, double preco) {
        this.nome = nome;
        this.codigo = codigo;
        this.preco = preco;
    }

    public void exibirInformacoes() {
        System.out.println("Nome do produto: " + nome);
    }

    public void exibirInformacoes(boolean mostrarCodigo) {
        if (mostrarCodigo) {
            System.out.println("Nome do produto: " + nome);
            System.out.println("Código do produto: " + codigo);
        }
    }

    public void exibirInformacoes(boolean mostrarCodigo, boolean mostrarPreco) {
        System.out.println("Nome do produto: " + nome);
        if (mostrarCodigo) {
            System.out.println("Código do produto: " + codigo);
        }
        if (mostrarPreco) {
            System.out.println("Preço do produto: R$ " + preco);
        }
    }

    public static void main(String[] args) {
        Produto produto = new Produto("Iphone", "12345", 900.000);

        produto.exibirInformacoes();
        System.out.println();

        produto.exibirInformacoes(true);
        System.out.println();

        produto.exibirInformacoes(true, true);
    }
}
