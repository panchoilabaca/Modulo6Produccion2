function list(){
	var token = $("meta[name='_csrf']").attr("content");

	$.ajax({
		type : "post",
		headers : {"X-CSRF-TOKEN" : token},
		url : "/movimiento/list",
		success : function(response) {
			$("#movimientoTable").bootstrapTable('load',response);
			$("#movimientoTable tbody").on('click','tr',function() {
				$("#id_movim").val($(this).find("td:eq(0)").text());
				$("#id_invent").val($(this).find("td:eq(1)").text());
				$("#tipo_movim").val($(this).find("td:eq(2)").text());
				$("#cant_movida").val($(this).find("td:eq(3)").text());
				$("#fecha_movim").val($(this).find("td:eq(4)").text());
				$("#id_rut").val($(this).find("td:eq(5)").text());
				$("#ubic_origen").val($(this).find("td:eq(6)").text());
				$("#ubic_destino").val($(this).find("td:eq(7)").text());
				$("#btn_group_old").show();
				$("#btn_group_new").hide();
				$("#myModal").modal("show");
			});
		}
	});
}

function select(){
	var token = $("meta[name = '_csrf']").attr("content");
	
	$.ajax({
		type : "post",
		headers : {"X-CSRF-TOKEN" : token},
		url : "/movimiento/select",
		data: "id_movim=" + $("#id_movim").val(),
		success : function(response) {
			$("#id_invent").val(response.id_invent);
		}
	});
}

function del(){
	var token = $("meta[name = '_csrf']").attr("content");

	$.ajax({
		type : "post",
		headers : {"X-CSRF-TOKEN" : token},
		url : "/movimiento/delete",
		data: "id_movim=" + $("#id_movim").val(),
		success : function(response) {
			if (response == 1) {
				alert("Se eliminó el registro");
				list();
				$("#myModal").modal("hide");

			}			
		}
	});
}

function update(){
	var token = $("meta[name = '_csrf']").attr("content");

	$.ajax({
		type : "post",
		headers : {"X-CSRF-TOKEN" : token},
		url : "/movimiento/update",
		data: {
			id_movim:$("#id_movim").val(),
			id_invent:$("#id_invent").val(),
			tipo_movim:$("#tipo_movim").val(),
			cant_movida:$("#cant_movida").val(),
			fecha_movim:$("#fecha_movim").val(),
			id_rut:$("#id_rut").val(),
			ubic_origen:$("#ubic_origen").val(),
			ubic_destino:$("#ubic_destino").val()
			},
		success : function(response) {
			if (response == 1) {
				alert("Se actualizó el registro");
				list();
				$("#myModal").modal("hide");
			}			
		}
	});
}

function add() {
	$("#id_movim").val("");
	$("#id_invent").val("");
	$("#tipo_movim").val("");
	$("#cant_movida").val("");
	$("#fecha_movim").val("");
	$("#id_rut").val("");
	$("#ubic_origen").val("");
	$("#ubic_destino").val("");
	$("#myModal").modal("show");
	$("#btn_group_old").hide();
	$("#btn_group_new").show();
}


function insert(){
	var token = $("meta[name = '_csrf']").attr("content");

	$.ajax({
		type : "post",
		headers : {"X-CSRF-TOKEN" : token},
		url : "/movimiento/insert",
		data: {
			id_movim:$("#id_movim").val(),
			id_invent:$("#id_invent").val(),
			tipo_movim:$("#tipo_movim").val(),
			cant_movida:$("#cant_movida").val(),
			fecha_movim:$("#fecha_movim").val(),
			id_rut:$("#id_rut").val(),
			ubic_origen:$("#ubic_origen").val(),
			ubic_destino:$("#ubic_destino").val()
			},
		success : function(response) {
			if (response == 1) {
				alert("Se insertó el registro");
				list();
				$("#myModal").modal("hide");
			}			
		}
	});
}