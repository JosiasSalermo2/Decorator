public class ReuPrimarioSemiAberto implements Regime{
    private String nomeInfrator;

    public ReuPrimarioSemiAberto(String nomeInfrator){
        this.nomeInfrator = nomeInfrator;
    }

    @Override
    public String getNomeRegime(){
        return "Réu Primário - Semi Aberto";
    }

    @Override
    public int getNivelSeguranca(){
        return 1;
    }

    @Override
    public String getDescricaoRegime(){
        return "Menor infrator primário em regime semi aberto: " + nomeInfrator;
    }

    @Override
    public int getDiasDeInternacao(){
        return 180;

    }

    public String getNomeInfrator(){
        return nomeInfrator;
    }
}
