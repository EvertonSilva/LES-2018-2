(function($) {
	
	$("#search-btn").on('click', function(event) {
		$.ajax({
			url: "http://localhost:8082/books/" + $("#search-field").val(),
		}).done(function(book) {
			if(book) {
				$('input[name="id"]').val(book.id);
				for(var key in book) {
					let elem = "#"+key;
					$(elem).val(book[key]);
				}
				$("#form-button").data("method", "put").html("Atualizar");
			} else {
				alert("Não foi encontrado nenhum título");
			}
			
		});
	});
	
	$("#book-form").on('submit', function(event) {
		event.preventDefault();
		let form = $(this).serializeArray(),
			data = {};
			requestMethod = $("#form-button").data('method'),
			entityId = $("#book-id").val(); 

		$.each(form, function(i, field) {
			data[field.name] = field.value;
		});

		console.log("Data sending to server... ");
		console.table(data);

		$.ajax({
			url: 'http://localhost:8082/books/' + entityId,
			method: requestMethod,
			contentType: 'application/json',
			data: JSON.stringify(data),
		}).done(function(data) {
			console.log(data);
		});
		
	});
	
	$('#reserveBtnAction').on('click', function(event) {
		event.preventDefault();
		$('#reserveDate').slideToggle()
						.on('change', function(event) {
							alert('Reserva efetuada');
							if($(this).is(':visible')) {
								$(this).slideUp();
							}
						});
	});
	
	
} (jQuery));