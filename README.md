## Ejercicio 1 

Este proyecto es una aplicación Spring Boot que proporciona una API REST para verificar si una cadena es un palíndromo. Un palíndromo es una palabra, frase, número u otra secuencia de caracteres que se lee igual hacia adelante que hacia atrás, ignorando los espacios, la puntuación y las diferencias de mayúsculas y minúsculas

#Controlador 

El proyecto tiene un controlador, PruebaController, que maneja las solicitudes a la ruta /api/palindromo. Este controlador tiene un método, putIsPalindromo, que acepta una solicitud POST con un cuerpo JSON que contiene la cadena a verificar.

El cuerpo de la solicitud debe tener el siguiente formato:

```json
{
    "palindromo": "anitalavalatina"
}
```
