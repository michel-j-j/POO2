package TP2Punto2;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Mesa {
	private List<Comensal> comensales;
	private Integer capacidad;
	private Pedido pedido;
	private Float propinaBase;

	private Boolean mesaEnUso;
	private Float importeMesa;
	private Registrar planilla;

	private Ticket ticket;

	// Pensar clase ticket.

	public Mesa(ArrayList<Comensal> comensales, Integer capacidad, Float propinaBase, Registrar planilla)
			throws Exception {
		if (!validar(comensales, capacidad))
			throw new Exception("cantidad de comensales exede la capacidad de la mesa!");

		this.comensales = Objects.requireNonNull(comensales);
		this.capacidad = Objects.requireNonNull(capacidad);
		this.propinaBase = Objects.requireNonNull(propinaBase);
		this.planilla = Objects.requireNonNull(planilla);
		this.mesaEnUso = true;

	}

	private void cerrarMesa() {
		this.mesaEnUso = false;
	}

	public void abonar(Comensal comensal) throws Exception { // Vamos a suponer que paga un solo comensal.
		if (!estaEnLaMesa(comensal))
			throw new Exception("el comensal no corresponde a esta mesa.");

		Float descuento = comensal.descuento();
		importeMesa = comensal.pagar(pedido, propinaBase);
		Ticket ticket = new Ticket(importeMesa, propinaBase, descuento);

		// Registrar
		this.planilla.registarMesa(LocalDate.now(), importeMesa);

		cargarTicket(ticket);
		cerrarMesa();

	}

	private void cargarTicket(Ticket ticket) {
		this.ticket = ticket;
	}

	public Ticket obtenerTicket() {
		return this.ticket;
	}

	public void cargarPedido(Pedido pedido) {
		this.pedido = pedido;
	}

	private Boolean estaEnLaMesa(Comensal comensal) {
		return this.comensales.stream().anyMatch(p -> comensal.equals(p));
	}

	private Boolean validar(ArrayList<Comensal> comensales, Integer capacidad) {
		return comensales.size() <= capacidad;
	}
}
