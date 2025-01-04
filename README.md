# Ejercicios de Principios SOLID

Este repositorio contiene ejemplos y ejercicios diseñados para aplicar y comprender los principios SOLID en el desarrollo de software. Cada ejercicio ilustra cómo implementar un principio específico con explicaciones claras y código ejemplo.

---

## 1. Principio de Responsabilidad Única (Single Responsibility Principle - SRP)

### Descripción:
El principio de responsabilidad única establece que una clase debe tener una única razón para cambiar, es decir, debe encargarse únicamente de una funcionalidad.

### Ejercicio: Sistema de Gestión de Libros
Separamos las responsabilidades de gestión de datos, presentación y persistencia de un libro en tres clases diferentes:

- **Book**: Maneja la información del libro (título y autor).
- **BookPrinter**: Responsable de mostrar los detalles del libro en formato de texto.
- **BookRepository**: Responsable de guardar la información del libro en la base de datos.

[Ver código SRP]([Ver código SRP](https://github.com/SanalbuDev1/SolidExercises/blob/main/src/main/java/solid/examples/java/solid/java/badexercises/goodexercises/SingleResponsability.java)
)

---

## 2. Principio de Abierto/Cerrado (Open/Closed Principle - OCP)

### Descripción:
El principio de abierto/cerrado establece que las entidades de software deben estar abiertas para extensión, pero cerradas para modificación.

### Ejercicio: Calculadora de Precios con Descuentos
Se creó una estructura que permite agregar nuevos tipos de descuentos sin modificar la lógica existente:

- **Discount**: Interfaz común para aplicar descuentos.
- Clases concretas como **GenericDiscount**, **SeasonalDiscount** y **QuantityDiscount** implementan la lógica de cada tipo de descuento.
- **PriceCalculator**: Utiliza la interfaz para calcular precios con descuentos.

[Ver código OCP](#)

---

## 3. Principio de Sustitución de Liskov (Liskov Substitution Principle - LSP)

### Descripción:
El principio de sustitución de Liskov establece que una subclase debe ser sustituible por su clase base sin alterar el correcto funcionamiento del sistema.

### Ejercicio: Sistema de Figuras Geométricas
Se separaron las responsabilidades de cálculo del área para diferentes figuras geométricas:

- **Shape**: Interfaz común para todas las figuras.
- Clases concretas como **Rectangle**, **Square** y **Circle** implementan la lógica para calcular sus áreas respectivas.
- **AreaCalculator**: Permite calcular el área de cualquier figura geométrica basada en la interfaz.

[Ver código LSP](#)

---

## 4. Principio de Segregación de Interfaces (Interface Segregation Principle - ISP)

### Descripción:
El principio de segregación de interfaces establece que una clase no debe estar obligada a implementar interfaces que no usa.

### Ejercicio: Sistema de Empleados
Se diseñaron interfaces específicas para diferentes tipos de empleados:

- **SalariedEmployee**: Para empleados con salario mensual.
- **HourlyEmployee**: Para empleados con pago por hora.
- **ProjectEmployee**: Para empleados que trabajan por proyecto.

Cada tipo de empleado implementa únicamente las interfaces que necesita, evitando métodos innecesarios.

[Ver código ISP](#)

---

## 5. Principio de Inversión de Dependencias (Dependency Inversion Principle - DIP)

### Descripción:
El principio de inversión de dependencias establece que los módulos de alto nivel no deberían depender de módulos de bajo nivel; ambos deben depender de abstracciones.

### Ejercicio: Sistema de Notificaciones
Se creó un sistema para enviar notificaciones desacoplado de las implementaciones concretas:

- **Notification**: Interfaz común para las notificaciones.
- Clases concretas como **EmailNotification**, **SMSNotification** y **PushNotification** implementan la lógica de cada tipo de notificación.
- **NotificationService**: Depende de la interfaz **Notification** para enviar notificaciones.

[Ver código DIP](#)

---

## Cómo Usar

1. Clona este repositorio:
   ```bash
   git clone <[URL del repositorio](https://github.com/SanalbuDev1/SolidExercises)>
