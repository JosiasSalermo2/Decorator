public class Faccao extends RegimeDecorator {
    public Faccao(Regime regime){
        super(regime);
    }

    @Override
    public int getNivelSegurancaAdicional(){
        return 3;
    }

    @Override
    public String getNomeAdicionado(){
        return "Facção (Cela Especial)";
    }

    @Override
    public int getDiasAdicionais(){
        return 180;
    }

}
