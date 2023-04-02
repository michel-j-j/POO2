package test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;

import org.junit.Test;

import TP1Punto2.Bebida;
import TP1Punto2.Comensal;
import TP1Punto2.Mesa;
import TP1Punto2.Pedido;
import TP1Punto2.Plato;
import TP1Punto2.Tarjeta;
import TP1Punto2.TarjetaComarcaPlus;
import TP1Punto2.TarjetaMasterCard;
import TP1Punto2.TarjetaVisa;
import TP1Punto2.Ticket;

public class TP1Punto2 {
	@Test
	public void calcularCostoConTarjetaVisa() { // Verifican que el codigo no se rompa cuando se agrega un
												// requerimiento.
		try {
			Tarjeta tarjetaVisa = new TarjetaVisa((float) 14340, (float) 3);

			Comensal comensal = new Comensal(1, tarjetaVisa);

			ArrayList<Comensal> comensales = new ArrayList<Comensal>();
			comensales.add(comensal);

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

			Mesa mesa = new Mesa(comensales, 4, (float) 3.0);
			mesa.cargarPedido(pedido);

			mesa.abonar(comensal);

			Ticket ticket = mesa.obtenerTicket();

			System.out.println("Importe total: " + ticket.total());
			System.out.println("Propina total: " + ticket.propina());
			System.out.println("Descuento total: " + ticket.descuento());

			assertEquals((float) 6646.59, ticket.total());

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Test
	public void calcularCostoConTarjetaMasterCard() {
		try {
			Tarjeta tarjetaMasterCard = new TarjetaMasterCard((float) 14340, (float) 2);

			Comensal comensal = new Comensal(1, tarjetaMasterCard);

			ArrayList<Comensal> comensales = new ArrayList<Comensal>();
			comensales.add(comensal);

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

			Mesa mesa = new Mesa(comensales, 4, (float) 3.0);
			mesa.cargarPedido(pedido);

			mesa.abonar(comensal);

			Ticket ticket = mesa.obtenerTicket();
			System.out.println("Importe total: " + ticket.total());
			System.out.println("Propina total: " + ticket.propina());
			System.out.println("Descuento total: " + ticket.descuento());

			assertEquals((float) 6762.98, ticket.total());

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Test
	public void calcularCostoConTarjetaComarcaPlus() {
		try {
			Tarjeta tarjetaComarcaPlus = new TarjetaComarcaPlus((float) 14340, (float) 2);

			Comensal comensal = new Comensal(1, tarjetaComarcaPlus);

			ArrayList<Comensal> comensales = new ArrayList<Comensal>();
			comensales.add(comensal);

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

			Mesa mesa = new Mesa(comensales, 4, (float) 3.0);
			mesa.cargarPedido(pedido);

			mesa.abonar(comensal);

			Ticket ticket = mesa.obtenerTicket();
			System.out.println("Importe total: " + ticket.total());
			System.out.println("Propina total: " + ticket.propina());
			System.out.println("Descuento total: " + ticket.descuento());

			assertEquals((float) 6662.04, ticket.total());

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Test
	public void calcularCostoConTarjetViedma() {
		try {
			Tarjeta tarjetaViedma = new Tarjeta((float) 14340, (float) 0);

			Comensal comensal = new Comensal(1, tarjetaViedma);

			ArrayList<Comensal> comensales = new ArrayList<Comensal>();
			comensales.add(comensal);

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

			Mesa mesa = new Mesa(comensales, 4, (float) 3.0);
			mesa.cargarPedido(pedido);

			mesa.abonar(comensal);

			Ticket ticket = mesa.obtenerTicket();
			System.out.println("Importe total: " + ticket.total());
			System.out.println("Propina total: " + ticket.propina());
			System.out.println("Descuento total: " + ticket.descuento());

			assertEquals((float) 6798.0, ticket.total());

		} catch (Exception e) {
			e.printStackTrace();

		}
	}
}
