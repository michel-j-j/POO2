package TP2Punto2;

import java.util.ArrayList;

import Utilitario.EnBaseDeDatosRegistrar;

public class Main {

	public static void main(String[] args) {

		try {
			Tarjeta tarjetaBase = new Tarjeta((float) 14340, (float) 2);
			Tarjeta tarjetaVisa = new TarjetaVisa((float) 14340, (float) 3);
			Tarjeta tarjetaMasterCard = new TarjetaMasterCard((float) 14340, (float) 4);
			Tarjeta tarjetaComarcaPlus = new TarjetaComarcaPlus((float) 14340, (float) 5);

			Comensal comensal1 = new Comensal(1, tarjetaBase);
			Comensal comensal2 = new Comensal(2, tarjetaVisa);
			Comensal comensal3 = new Comensal(3, tarjetaMasterCard);
			Comensal comensal4 = new Comensal(4, tarjetaComarcaPlus);

			ArrayList<Comensal> comensales = new ArrayList<Comensal>();

			comensales.add(comensal4);
			comensales.add(comensal3);
			comensales.add(comensal2);
			comensales.add(comensal1);

			Bebida vino = new Bebida("Cosecha Tardia", (float) 1200);
			Bebida agua = new Bebida("Villa Vicencio", (float) 500);
			Plato ravioles = new Plato("Ravioles", (float) 2100);
			Plato lasaña = new Plato("Lasaña", (float) 2800);

			ArrayList<Plato> plato = new ArrayList<Plato>();
			plato.add(ravioles);
			plato.add(lasaña);

			ArrayList<Bebida> bebida = new ArrayList<Bebida>();
			bebida.add(agua);
			bebida.add(vino);

			Pedido pedido = new Pedido(plato, bebida);

			Registrar planilla = new EnBaseDeDatosRegistrar();

			Mesa mesa = new Mesa(comensales, 4, (float) 3.0, planilla);
			mesa.cargarPedido(pedido);

			mesa.abonar(comensal4);

			Ticket ticket = mesa.obtenerTicket();
			System.out.println("Importe total: " + ticket.total());
			System.out.println("Propina total: " + ticket.propina());
			System.out.println("Descuento total: " + ticket.descuento());

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
