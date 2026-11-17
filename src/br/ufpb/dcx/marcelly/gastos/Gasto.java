package br.ufpb.dcx.marcelly.gastos;

public class Gasto {
    private String codigo;
    private String descricao;
    private String categoria;
    private double valor;
    private String dataGasto;
    private boolean foiPago;

    public Gasto(String codigo, String descricao, String categoria,
                 double valor, String dataGasto, boolean foiPago) {
        this.codigo = codigo;
        this.descricao = descricao;
        this.categoria = categoria;
        this.valor = valor;
        this.dataGasto = dataGasto;
        this.foiPago = foiPago;
    }

    public String getCodigo() {
        return codigo;
    }

    public String getDescricao() {
        return descricao;
    }

    public String getCategoria() {
        return categoria;
    }

    public double getValor() {
        return valor;
    }

    public String getDataGasto() {
        return dataGasto;
    }

    public boolean isFoiPago() {
        return foiPago;
    }

    public void setFoiPago(boolean foiPago) {
        this.foiPago = foiPago;
    }

}
