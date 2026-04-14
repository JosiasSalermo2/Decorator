public class Briga extends RegimeDecorator{
    public Briga(Regime regime){
        super(regime);
    }

    @Override
    public int getNivelSegurancaAdicional(){
        return 2;
    }

    @Override
    public String getNomeAdicionado(){
        return "Briga (Solitária)";
    }

    @Override
    public int getDiasAdicionais(){
        return 30;
    }
}
