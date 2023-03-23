import org.example.classes.IReserva;
import org.example.classes.ReservaFactory;
import org.example.classes.ReservaHotel;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ReservaHotelTest {
    @Test
    void deveRealizarReserva() {
        IReserva reserva = ReservaFactory.obterReserva("Hotel");
        assertEquals("Quarto reservado", reserva.make_reservation());
    }
    @Test
    void deveCancelarReserva() {
        IReserva reserva = ReservaFactory.obterReserva("Hotel");
        assertEquals("Reserva de quarto cancelada", reserva.cancel_reservation());
    }
    @Test
    void deveRealizarCheckin() {
        IReserva reserva = ReservaFactory.obterReserva("Hotel");
        assertEquals("Checkin do quarto efeuado", reserva.checkin());
    }
    @Test
    void deveRealizarCheckout() {
        IReserva reserva = ReservaFactory.obterReserva("Hotel");
        assertEquals("Checkout de quarto efetuado", reserva.checkout());
    }
}
