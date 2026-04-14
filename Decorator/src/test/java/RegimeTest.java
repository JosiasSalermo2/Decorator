import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class RegimeTest {

    @Test
    void deveRetornarNomeRegimePrimarioSemiAberto(){
        Regime regime = new ReuPrimarioSemiAberto("João");
        assertEquals("Réu Primário - Semi Aberto", regime.getNomeRegime());
    }

    @Test
    void deveRetornarNivelSegurancaPrimarioSemiAberto(){
        Regime regime = new ReuPrimarioSemiAberto("João");
        assertEquals(1, regime.getNivelSeguranca());
    }

    @Test
    void deveRetornrDescricaoPrimarioSemiAberto(){
        Regime regime = new ReuPrimarioSemiAberto("João");
        assertEquals("Menor infrator primário em regime semi aberto: João", regime.getDescricaoRegime());
    }

    @Test
    void deveRetornarDiasInternacaoPrimarioSemiAberto(){
        Regime regime = new ReuPrimarioSemiAberto("João");
        assertEquals(180, regime.getDiasDeInternacao());
    }

    @Test
    void deveRetornarNomeRegimeComReincidente(){
        Regime regime = new Reincidente(new ReuPrimarioSemiAberto("Carlos"));
        assertEquals("Réu Primário - Semi Aberto + Reincidente (Regime Fechado)", regime.getNomeRegime());
    }

    @Test
    void deveRetornarNivelSegurancaComReincidente(){
        Regime regime = new Reincidente(new ReuPrimarioSemiAberto("Carlos"));
        assertEquals(3, regime.getNivelSeguranca());
    }



}
