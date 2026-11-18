package br.ufpb.dcx.marcelly.gastos;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

    public class SistemaControleGastosMap implements SistemaControleGastos {

        private Map<String, Gasto> gastos;

        public SistemaControleGastosMap() {
            this.gastos = new HashMap<>();
        }


        public void cadastrarGasto(String codigo, String descricao, String categoria,
                                   double valor, String dataGasto, boolean foiPago)
                throws GastoJaExisteException {
            if (this.gastos.containsKey(codigo)) {
                throw new GastoJaExisteException("Já existe gasto com o código " + codigo);
            }
            Gasto g = new Gasto(codigo, descricao, categoria, valor, dataGasto, foiPago);
            this.gastos.put(codigo, g);
        }


        public List<Gasto> pesquisarGastosPorCategoria(String categoria) {
            List<Gasto> resultado = new ArrayList<>();
            for (Gasto g : this.gastos.values()) {
                if (g.getCategoria().equals(categoria)) {
                    resultado.add(g);
                }
            }
            return resultado;
        }


        public List<Gasto> pesquisarGastosNaoPagos() {
            List<Gasto> resultado = new ArrayList<>();
            for (Gasto g : this.gastos.values()) {
                if (!g.isFoiPago()) {
                    resultado.add(g);
                }
            }
            return resultado;
        }


        public List<Gasto> pesquisarGastosPorData(String dataGasto) {
            List<Gasto> resultado = new ArrayList<>();
            for (Gasto g : this.gastos.values()) {
                if (g.getDataGasto().equals(dataGasto)) {
                    resultado.add(g);
                }
            }
            return resultado;
        }


        public boolean pesquisarSeGastoFoiPago(String codigoGasto)
                throws GastoNaoExisteException {
            Gasto g = this.gastos.get(codigoGasto);
            if (g == null) {
                throw new GastoNaoExisteException("Não existe gasto com o código " + codigoGasto);
            }
            return g.isFoiPago();
        }


        public double calcularTotalGastosPorCategoria(String categoria) {
            double total = 0;
            for (Gasto g : this.gastos.values()) {
                if (g.getCategoria().equals(categoria)) {
                    total += g.getValor();
                }
            }
            return total;
        }


        public int pesquisarQuantidadeDeGastosDaCategoria(String categoria) {
            int quantidade = 0;
            for (Gasto g : this.gastos.values()) {
                if (g.getCategoria().equals(categoria)) {
                    quantidade++;
                }
            }
            return quantidade;
        }


        public void removerGasto(String codigoGasto) throws GastoNaoExisteException {
            if (!this.gastos.containsKey(codigoGasto)) {
                throw new GastoNaoExisteException("Não existe gasto com o código " + codigoGasto);
            }
            this.gastos.remove(codigoGasto);
        }

}
