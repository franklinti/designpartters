package TemplateMethod;

public class ReparaVeiculoLuxoService extends ReparaVeiculoServiceComTemplateMethod {

    private VeiculoParaReparo veiculoParaReparo;

    public ReparaVeiculoLuxoService(VeiculoParaReparo veiculoParaReparo) {
        this.veiculoParaReparo = veiculoParaReparo;
    }


    @Override
    protected boolean veiculoParaReparo() {
        return veiculoParaReparo.getPorcentagemDano() <= 50;
    }
}
