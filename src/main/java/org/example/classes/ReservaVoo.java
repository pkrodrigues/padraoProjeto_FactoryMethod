package org.example.classes;

public class ReservaVoo implements IReserva{
    public String make_reservation() {
        return "Acento reservado";
    }

    public String cancel_reservation(){
        return "Reserva de acento cancelada";
    }

    public String checkin() {
        return "Checkin do acento efeuado";
    }

    public String checkout() {
        return "Checkout do acento efetuado";
    }
}
