package org.example.classes;

public class ReservaFactory {
    public static IReserva obterReserva(String reserva)
    {
        Class classe = null;
        Object objeto = null;

        try
        {
            classe = Class.forName("org.example.classes.Reserva"+reserva);
            objeto = classe.newInstance();
        }
        catch(Exception ex)
        {
            throw new IllegalArgumentException("Reserva inexistente");
        }
        if (!(objeto instanceof IReserva))
        {
            throw new IllegalArgumentException("Reserva inválida");
        }
        return (IReserva) objeto;
    }
}
