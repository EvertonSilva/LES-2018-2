'use strict';

(function($) {
	
	let template = _.template($('#result-list-tmpl').html());

	
	$("#search-form").on('submit', function(event) {
		event.preventDefault();
		let formData = $(this).serialize();
		
		$.ajax({
			url: "http://localhost:8082/books/search?"+formData,
		}).done(function(data) {
			if(data) {
				$('.result-list').html(template({bookList:data}));
			}
		}).fail(function(erro) {			
			console.log(erro);
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