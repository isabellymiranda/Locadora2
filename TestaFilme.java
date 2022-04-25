public class TestaFilme {
  public static void main(String[] rgs){
    Filme f = new Filme();
    f.setCodigo(153238749);
    f.setNome("Matrix");
    f.setValor(3.50);

    f.mostra();
    f.setCodigo(225987430);
    f.setNome("007");
    f.setValor(4.00);
    f.setDisponivel(true);

    f.mostra();
  }
}
