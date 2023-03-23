import org.example.classes.IReserva;
import org.example.classes.ReservaFactory;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.*;


class ReservaFactoryTest {
    @Test
    void deveRetornarExcecaoParaReservaInexistente() {
        try {
            IReserva reserva = ReservaFactory.obterReserva("Cruzeiro");
            fail();
        }catch (IllegalArgumentException e ){
            assertEquals("Reserva inexistente", e.getMessage());
        }
    }

    @Test
    void deveRetornarExececaoParaReservaInavalida() {
        try {
            IReserva reserva = ReservaFactory.obterReserva("Chale");
            fail();
        }catch(IllegalArgumentException e ){
            assertEquals("Reserva inválida", e.getMessage());
        }
    }

}
