
package br.ufpb.dcx.marcelly.gastos;
import java.util.List;
    public interface SistemaControleGastos {

        public void cadastrarGasto(String codigo, String descricao, String categoria,
                                   double valor, String dataGasto, boolean foiPago)
                throws GastoJaExisteException;
        public List<Gasto> pesquisarGastosPorCategoria(String categoria);
        public List<Gasto> pesquisarGastosNaoPagos();
        public List<Gasto> pesquisarGastosPorData(String dataGasto);
        public boolean pesquisarSeGastoFoiPago(String codigoGasto)
                throws GastoNaoExisteException;

        public double calcularTotalGastosPorCategoria(String categoria);

        public int pesquisarQuantidadeDeGastosDaCategoria(String categoria);

        public void removerGasto(String codigoGasto)
                throws GastoNaoExisteException;

    }