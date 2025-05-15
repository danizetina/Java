# 🏧 Cajero Automático Simple
💻 Simulación básica de un cajero automático utilizando estructuras de control en Java.

## 📌 Intro  
Este proyecto consiste en una aplicación de consola en Java que simula el funcionamiento de un cajero automático. El programa permite consultar saldo, depositar, retirar dinero y salir del sistema, todo gestionado con estructuras de control como `while`, `do-while`, `switch`, `break` y `continue`.

## ✨ Funcionalidades  
1. Menú interactivo en consola con 4 opciones:
   - Consultar saldo  
   - Depositar dinero  
   - Retirar dinero  
   - Salir  
2. El sistema repite el menú hasta que el usuario elija salir.
3. Se valida que haya saldo suficiente antes de permitir un retiro.
4. Control de flujo con estructuras `do-while`, `switch`, `break`, y `continue`.
5. Manejo de opción inválida con mensaje de error y repetición del menú.

## 📂 Estructura  
* `CajeroAutomatico.java`: Clase principal que contiene toda la lógica del sistema, incluyendo el menú, operaciones de saldo, y validaciones.

## 💡 Lógica del sistema
- Se inicializa un saldo usando inferencia de tipo con `var` (por ejemplo, `var saldo = 1000.0`).
- El menú se presenta dentro de un bucle `do-while`.
- El `switch` evalúa la opción seleccionada por el usuario:
  - `case 1`: Muestra el saldo actual.
  - `case 2`: Pide monto y suma al saldo.
  - `case 3`: Pide monto, valida que haya saldo suficiente y realiza el retiro.
  - `case 4`: Muestra mensaje de despedida y finaliza.
  - `default`: Muestra error por opción inválida y repite menú.

## 🛠️ Tecnologías usadas  
* Lenguaje: Java  
* Control de flujo: `do-while`, `while`, `switch`, `break`, `continue`  
* Entrada de usuario: `Scanner`  
* Tipado: Uso de `var` para inferencia de tipo  
* IDE sugerido: IntelliJ IDEA, Eclipse o VSCode

## 🎯 Objetivos  
1. Reforzar el uso de estructuras de control como bucles y condicionales.
2. Practicar validación de entradas y lógica de negocio.
3. Familiarizarse con el control de flujo (`break`, `continue`).
4. Aplicar buenas prácticas de interacción con el usuario desde consola.




