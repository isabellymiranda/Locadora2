public class Filme{
    private int codigo;
    private String nome;
    private double valor;
    private boolean disponivel;
    public int getCodigo() {
        return codigo;
    }
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public double getValor() {
        return valor;
    }
    public void setValor(double valor) {
        this.valor = valor;
    }
    public boolean isDisponivel() {
        return disponivel;
    }
    public void setDisponivel(boolean disponivel) {
        this.disponivel = disponivel;
    }
    public void mostra(){
     System.out.println("Código:"+this.codigo);
     System.out.println("Nome:"+this.nome);
     System.out.println("Valor:"+this.valor);
     System.out.println("Disponibilidade:"+this.disponivel);
    }
    
 }

