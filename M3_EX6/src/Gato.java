public class Gato extends Felideos { // O operador "extends" aplica a herança, fazendo que os atributos e métodos da classe pai sejam acessíveis pela classe filho, ainda que tenham o mesmo nome, o operador "super" será usado para diferenciar as chamadas. O mesmo foi feito em todas as hierarquias deste a primeira.
    public Gato() {
    }

    public void comer() {
        super.comer(); // Este operador "super" acessa ao método com o mesmo nome da classe pai. Assim a classe filho pode além de executar o próprio método também pode chamar o método da classe acima já que herdou ddela.
        System.out.println("Este animal é um gato, se alimenta principalmente de leite e derivados de carne.");
    }
}
