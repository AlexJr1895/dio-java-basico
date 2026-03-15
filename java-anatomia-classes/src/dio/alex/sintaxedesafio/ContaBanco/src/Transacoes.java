public class Transacoes {
    Double saldo = 0.0;

    public void depositar(Double novoDeposito){
        saldo = saldo + novoDeposito;
    }

    //*public void sacar(Double novoSaque){
    //    if(novoSaque <= saldo){
    //       saldo = saldo - novoSaque;
    //        System.out.println("Saque realizado com sucesso!");
    //    } else{
    //        System.out.println("Saldo insuficiente!");
    //    }*/

    public boolean sacar(Double novoSaque){
        if(novoSaque <= saldo){
            return true;
        }
        return false;
    }

    public Double consultarSaldo(){
        return saldo;
    }
}
