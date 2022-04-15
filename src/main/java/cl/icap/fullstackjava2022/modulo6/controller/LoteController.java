package cl.icap.fullstackjava2022.modulo6.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import cl.icap.fullstackjava2022.modulo6.model.entity.Lote;

import cl.icap.fullstackjava2022.modulo6.service.LoteService;


@Controller
@RequestMapping("/lote") // http://localhost:8090/lote
public class LoteController {

	@Autowired
	LoteService loteService;
	
	@RequestMapping("/list") 
	public @ResponseBody List<Lote> list(HttpServletRequest request, HttpServletResponse response) {
		return loteService.list();
	}
	
	
	@RequestMapping("/update") 
	public @ResponseBody int update(HttpServletRequest request, HttpServletResponse response) {
		int vret = 0;
		if (loteService.update( new Lote(
				 Integer.parseInt(request.getParameter("id_invent")),
				 request.getParameter("lote"),
				 Integer.parseInt(request.getParameter("stock_cant")),
				 request.getParameter("fecha_ingreso"),
				 request.getParameter("fecha_caducidad"),
				 Integer.parseInt(request.getParameter("id_prod")
				  ))) != null) {
			vret = 1;
		};
		return vret;
	}
	@RequestMapping("/delete") 
	public @ResponseBody int delete(HttpServletRequest request, HttpServletResponse response) {
		return loteService.delete(Integer.parseInt(request.getParameter("id_invent")));
	}

	@RequestMapping("/insert") 
	public @ResponseBody int insert(HttpServletRequest request, HttpServletResponse response) {
		int vret = 0;
		if (loteService.update( new Lote(
				 Integer.parseInt(request.getParameter("id_invent")),
				 request.getParameter("lote"),
				 Integer.parseInt(request.getParameter("stock_cant")),
				 request.getParameter("fecha_ingreso"),
				 request.getParameter("fecha_caducidad"),
				 Integer.parseInt(request.getParameter("id_prod")
				  ))) != null) {
			vret = 1;
		};
		return vret;
	}
	
	@RequestMapping("/select") 
	public @ResponseBody Lote select(HttpServletRequest request, HttpServletResponse response) {
		return loteService.get(Integer.parseInt(request.getParameter("id_invent")));
	}

}