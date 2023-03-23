package org.example.classes;

public class ReservaHotel implements IReserva{
    public String make_reservation() {
        return "Quarto reservado";
    }

    public String cancel_reservation(){
        return "Reserva de quarto cancelada";
    }

    public String checkin() {
        return "Checkin do quarto efeuado";
    }

    public String checkout() {
        return "Checkout de quarto efetuado";
    }
}
