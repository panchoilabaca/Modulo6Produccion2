package cl.icap.fullstackjava2022.modulo6.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


import cl.icap.fullstackjava2022.modulo6.model.entity.Movimiento;
import cl.icap.fullstackjava2022.modulo6.service.MovimientoService;

@Controller
@RequestMapping("/movimiento") // http://localhost:8080/department
public class MovimientoController {
	@Autowired
	MovimientoService movimientoService;
	
	@RequestMapping("/list") 
	public @ResponseBody List<Movimiento> list(HttpServletRequest request, HttpServletResponse response) {
		return movimientoService.list();
	}
	
	@RequestMapping("/listOrderByidMovim") 
	public @ResponseBody List<Movimiento> listOrderByidMovim(HttpServletRequest request, HttpServletResponse response) {
		return movimientoService.listOrderByidMovim();
	}
	
	@PostMapping("/update") 
	public @ResponseBody Integer update(HttpServletRequest request, HttpServletResponse response) {
		int vret = 0;
		if (movimientoService.update(new Movimiento(Integer.parseInt(request.getParameter("id_movim")),Integer.parseInt(request.getParameter("id_invent")),request.getParameter("tipo_movim"),Integer.parseInt(request.getParameter("cant_movida")),request.getParameter("fecha_movim"),request.getParameter("id_rut"),request.getParameter("ubic_origen"),request.getParameter("ubic_destino"))) != null) {
			vret = 1;
		}
		return vret;
	}
	
	@PostMapping("/delete") 
	public @ResponseBody Integer delete(HttpServletRequest request, HttpServletResponse response) {
		return movimientoService.delete(Integer.parseInt(request.getParameter("id_movim")));
	}

	@RequestMapping("/insert") 
	public @ResponseBody Integer insert(HttpServletRequest request, HttpServletResponse response) {
		Integer vret = 0;
		if (movimientoService.insert(new Movimiento(Integer.parseInt(request.getParameter("id_movim")),Integer.parseInt(request.getParameter("id_invent")),request.getParameter("tipo_movim"),Integer.parseInt(request.getParameter("cant_movida")),request.getParameter("fecha_movim"),request.getParameter("id_rut"),request.getParameter("ubic_origen"),request.getParameter("ubic_destino"))) != null) {
			vret = 1;
		};
		return vret;
	}
	@RequestMapping("/select") 
	public @ResponseBody Movimiento select(HttpServletRequest request, HttpServletResponse response) {
		return movimientoService.get(Integer.parseInt(request.getParameter("id_movim")));
	}
}