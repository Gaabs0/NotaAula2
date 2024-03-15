public class Calculoestoque {

    protected int quantidademax;
    protected int quantidadeatual;
    protected int quantidademin;
    protected int quantidademed;

    public void setQuantidadeatual(int quantidadeatual) {
        this.quantidadeatual = quantidadeatual;
    }

    public void setQuantidademin(int quantidademin) {
        this.quantidademin = quantidademin;
    }

    public void setQuantidademax(int quantidademax) {
        this.quantidademax = quantidademax;
    }

    public int getQuantidademed() {
        return quantidademed = (quantidademax + quantidademin) / 2 ;
    }
}

