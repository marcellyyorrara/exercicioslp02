package br.ufpb.dcx.marcelly.gastos;

public class GastoNaoExisteException extends Exception {
    public GastoNaoExisteException(String mensagem){
        super (mensagem);
    }
}
