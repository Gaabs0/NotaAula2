public class Calculoestoque {


    private int quantidadeatual;
    private int quantidademax;

    private int quantidademin;
    private int quantidademed;

    public void setQuantidadeatual(int quantidadeatual) {
        this.quantidadeatual = quantidadeatual;
    }

    public int getQuantidadeatual() {
        return quantidadeatual;
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

    public void setQuantidademed(int quantidademed) {
        this.quantidademed = quantidademed;
    }
}

