import org.example.classes.IReserva;
import org.example.classes.ReservaFactory;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ReservaVooTest {
    @Test
    void deveRealizarReserva() {
        IReserva reserva = ReservaFactory.obterReserva("Voo");
        assertEquals("Acento reservado", reserva.make_reservation());
    }
    @Test
    void deveCancelarReserva() {
        IReserva reserva = ReservaFactory.obterReserva("Voo");
        assertEquals("Reserva de acento cancelada", reserva.cancel_reservation());
    }
    @Test
    void deveRealizarCheckin() {
        IReserva reserva = ReservaFactory.obterReserva("Voo");
        assertEquals("Checkin do acento efeuado", reserva.checkin());
    }
    @Test
    void deveRealizarCheckout() {
        IReserva reserva = ReservaFactory.obterReserva("Voo");
        assertEquals("Checkout do acento efetuado", reserva.checkout());
    }
}
