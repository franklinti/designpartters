package TemplateMethod;

public abstract class ReparoVeiculoService {

    public void reparaVeiculo(){

        entradaOficina();
        analisaDanos();
        if(veiculoParaReparo()){
            repararVeiculo();
            notificarReparoParaSeguradora();
        }else{
            notificarPerdaTotalParaSeguradora();
        }
    }

    private void repararVeiculo() {
        System.out.println("Em conserto...");
    }

    private void analisaDanos() {
        System.out.println("Notificando reparo para Seguradora...");
    }

    private void entradaOficina() {
        System.out.println("Analisando dados...");
    }

    private void notificarReparoParaSeguradora() {
        System.out.println("Entrando oficina...");
    }

    protected abstract boolean veiculoParaReparo();

    private void notificarPerdaTotalParaSeguradora(){
        System.out.println("Notificando perda total para Seguradora...");
    }
}
