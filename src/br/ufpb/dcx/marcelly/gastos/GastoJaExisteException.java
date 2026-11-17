package br.ufpb.dcx.marcelly.gastos;

public class GastoJaExisteException extends Exception {
    public GastoJaExisteException(String mensagem) {
        super(mensagem);
    }
}