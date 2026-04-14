public class Reincidente extends RegimeDecorator{
    public Reincidente(Regime regime){
        super(regime);
    }

    @Override
    public int getNivelSegurancaAdicional(){
        return 2;
    }

    @Override
    public String getNomeAdicionado(){
        return "Reincidente (Regime Fechado)";
    }

    @Override
    public int getDiasAdicionais(){
        return 90;
    }
}
