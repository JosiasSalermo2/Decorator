public abstract class RegimeDecorator implements Regime{
    private Regime regimeDecorado;

    public RegimeDecorator(Regime regime){
        this.regimeDecorado = regime;
    }

    public Regime getRegimeDecorado(){
        return regimeDecorado;
    }

    public void setRegimeDecorado(Regime regime){
        this.regimeDecorado = regime;
    }

    public abstract int getNivelSegurancaAdicional();
    public abstract String getNomeAdicionado();
    public abstract int getDiasAdicionais();

    @Override
    public String getNomeRegime(){
        return this.regimeDecorado.getNomeRegime() + " + " + getNomeAdicionado();
    }

    @Override
    public int getNivelSeguranca(){
        return this.regimeDecorado.getNivelSeguranca() + getNivelSegurancaAdicional();
    }

    @Override
    public String getDescricaoRegime(){
        return this.regimeDecorado.getDescricaoRegime();
    }

    @Override
    public int getDiasDeInternacao(){
        return this.regimeDecorado.getDiasDeInternacao() + getDiasAdicionais();
    }
}
