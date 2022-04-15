function list(){
	var token = $("meta[name='_csrf']").attr("content");

	$.ajax({
		type : "post",
		headers : {"X-CSRF-TOKEN" : token},
		url : "/lote/list",
		success : function(response) {
			$("#loteTable").bootstrapTable('load',response);
			$("#loteTable tbody").on('click','tr',function() {
				$("#id_invent").val($(this).find("td:eq(0)").text());
				$("#lote").val($(this).find("td:eq(1)").text());
				$("#stock_cant").val($(this).find("td:eq(2)").text());
				$("#fecha_ingreso").val($(this).find("td:eq(3)").text());
				$("#fecha_caducidad").val($(this).find("td:eq(4)").text());
				$("#id_prod").val($(this).find("td:eq(5)").text());
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
		url : "/lote/select",
		data: "id_invent=" + $("#id_invent").val(),
		success : function(response) {
			$("#lote").val(response.lote);
		}
	});
}

function del(){
	var token = $("meta[name = '_csrf']").attr("content");

	$.ajax({
		type : "post",
		headers : {"X-CSRF-TOKEN" : token},
		url : "/lote/delete",
		data: "id_invent=" + $("#id_invent").val(),
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
		url : "/lote/update",
		data: {
			id_invent:$("#id_invent").val(),
			lote:$("#lote").val(),
			stock_cant:$("#stock_cant").val(),
			fecha_ingreso:$("#fecha_ingreso").val(),
			fecha_caducidad:$("#fecha_caducidad").val(),
			id_prod:$("#id_prod").val()
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
	$("#id_invent").val("");
	$("#lote").val("");
	$("#stock_cant").val("");
	$("#fecha_ingreso").val("");
	$("#fecha_caducidad").val("");
	$("#id_prod").val("");
	$("#myModal").modal("show");
	$("#btn_group_old").hide();
	$("#btn_group_new").show();
}


function insert(){
	var token = $("meta[name = '_csrf']").attr("content");

	$.ajax({
		type : "post",
		headers : {"X-CSRF-TOKEN" : token},
		url : "/lote/insert",
		data: {
			id_invent:$("#id_invent").val(),
			lote:$("#lote").val(),
			stock_cant:$("#stock_cant").val(),
			fecha_ingreso:$("#fecha_ingreso").val(),
			fecha_caducidad:$("#fecha_caducidad").val(),
			id_prod:$("#id_prod").val()
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