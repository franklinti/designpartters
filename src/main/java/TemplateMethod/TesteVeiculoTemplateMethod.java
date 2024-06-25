package TemplateMethod;

public class TesteVeiculoTemplateMethod {

    public static void main(String[] args) {

        //teste simples sem template method
//        VeiculoParaReparo veiculoDeLuxoParaReparo = new VeiculoParaReparo();
//        veiculoDeLuxoParaReparo.setPorcentagemDano(49);
//
//        ReparaVeiculoLuxoService rpl = new ReparaVeiculoLuxoService(veiculoDeLuxoParaReparo);
//
//        rpl.reparaVeiculo();
//
//        VeiculoParaReparo veiculoComumParaReparo = new VeiculoParaReparo();
//        veiculoComumParaReparo.setPorcentagemDano(71);
//
//        ReparaVeiculoComumService rpc = new ReparaVeiculoComumService(veiculoComumParaReparo);
//
//       rpc.reparaVeiculo();

        //teste simples com template method após realizar extends nas class de reparaVeiculo
        VeiculoParaReparo veiculoDeLuxoParaReparo = new VeiculoParaReparo();
        veiculoDeLuxoParaReparo.setPorcentagemDano(49);

        ReparaVeiculoLuxoService rpl = new ReparaVeiculoLuxoService(veiculoDeLuxoParaReparo);

        rpl.reparaVeiculo();

        VeiculoParaReparo veiculoComumParaReparo = new VeiculoParaReparo();
        veiculoComumParaReparo.setPorcentagemDano(71);

        ReparaVeiculoComumService rpc = new ReparaVeiculoComumService(veiculoComumParaReparo);

        rpc.reparaVeiculo();



    }

}
