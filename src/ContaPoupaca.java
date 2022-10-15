public class ContaPoupaca {
    String agencia;
    String numero;
    Float saldo;
    Float taxa;

    /* metodo construtor vazio */
    public ContaPoupaca() {

    }

    /* Metodo construtor com atributos */
    public ContaPoupaca(String a, String n,
            float s, float t) {
        agencia = a;
        numero = n;
        saldo = s;
        taxa = t;
    }

    /* Metodo sem retorno */
    void imprimeDados() {
        System.out.println("***************");
        System.out.println("Bem vindo ao banco senhor(a)");
        System.out.println("Agencia:" + agencia);
        System.out.println("Numero:" + numero);
        System.out.println("Saldo:" + saldo);
        System.out.println("Taxa:" + taxa);
        System.out.println("******************");

    }

    /* Meto sem retorno com parametro */
    void depositar(float valor) {
        saldo = saldo + valor;
    }

    float caulculaRendimento(){
        float rendimento;
        rendimento = saldo * taxa/100;
        return rendimento;


    }
}
