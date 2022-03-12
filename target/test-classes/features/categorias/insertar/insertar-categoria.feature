Feature: Registrar Categoría

		Scenario: Registrar Categoría Exitosa
			Given cargo la página login del aplicativo Visor Web
			  And inicio sesión con el usuario "admin" y la clave "clave"
			 When ingreso a la página registrar categoría
			  And escribo la categoría "ZAPATILLAS CUCUMBER" y hago clic en el botón Guardar
			 Then el aplicativo muestra el mensaje "Se guardó de manera correcta la Categoría"
		
		Scenario: Registrar Categoría Vacía
			Given cargo la página login del aplicativo Visor Web
			  And inicio sesión con el usuario "admin" y la clave "clave"
			 When ingreso a la página registrar categoría
			  And escribo la categoría "" y hago clic en el botón Guardar
			 Then el aplicativo muestra el mensaje "Nombre: Error de validación: se necesita un valor."