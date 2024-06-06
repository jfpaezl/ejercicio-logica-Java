## Ejercicio 1 

Este proyecto es una aplicación Spring Boot que proporciona una API REST para verificar si una cadena es un palíndromo. Un palíndromo es una palabra, frase, número u otra secuencia de caracteres que se lee igual hacia adelante que hacia atrás, ignorando los espacios, la puntuación y las diferencias de mayúsculas y minúsculas

## Controlador 

El proyecto tiene un controlador, PruebaController, que maneja las solicitudes a la ruta /api/palindromo. Este controlador tiene un método, putIsPalindromo, que acepta una solicitud POST con un cuerpo JSON que contiene la cadena a verificar.

El cuerpo de la solicitud debe tener el siguiente formato:

```json
{
    "palindromo": "anitalavalatina"
}
```
El método putIsPalindromo verifica si la cadena es un palíndromo, calcula la longitud de la cadena y cuenta la cantidad de caracteres especiales en la cadena. Luego, devuelve un objeto JSON con los resultados:

```json
{
    "isPalindromo": 1,
    "lengthCadena": 17,
    "lengthCaracteresEspeciales": 0
}
```

## Requisitos

- Java 8 o superior
- Maven

## Descarga 

Descarga la carpeta del repositorio en tu computador 
![image](https://github.com/jfpaezl/ejercicio-logica-Java/assets/108756151/236b8669-442e-41f2-bc37-aeb240bca3e5)

Abre la carpeta en cualquier edictor de codigo que soporte Java 
En mi caso uso Visual Studio Code
![image](https://github.com/jfpaezl/ejercicio-logica-Java/assets/108756151/c485d857-7650-422e-b129-bc0b4395da5d)

inicializa el api en el archivo Ejercicio1Application.java donde marca la flecha o donde esta resaltado en rojo 

![image](https://github.com/jfpaezl/ejercicio-logica-Java/assets/108756151/8050cd33-a5ee-475f-a4d7-8bb7aad42204)

# Consumo de la API

Para consumir la API desde Postman o Thunder Client, sigue estos pasos:

## Postman

1. Abre Postman.
2. Haz clic en el botón "+ New" y selecciona "Request".
3. En el cuadro de diálogo que aparece, dale un nombre a tu solicitud y haz clic en "Save to My Workspace".
4. En el campo "HTTP method", selecciona "POST".
5. En el campo "Enter request URL", escribe `http://localhost:8080/api/palindromo`.
6. Haz clic en la pestaña "Body".
7. Selecciona "raw" y luego "JSON" en el menú desplegable.
8. En el área de texto que aparece, escribe `{"palindromo": "anitalavalatina"}`.
9. Haz clic en el botón "Send".

## Thunder Client (VS Code extension)

1. Abre Visual Studio Code.
2. Haz clic en el icono de Thunder Client en la barra lateral.
3. Haz clic en "New Request".
4. En el campo "Method", selecciona "POST".
5. En el campo "URL", escribe `http://localhost:8080/api/palindromo`.
6. Haz clic en el botón "Body".
7. Selecciona "JSON" en el menú desplegable.
8. En el área de texto que aparece, escribe `{"palindromo": "anitalavalatina"}`.
9. Haz clic en el botón "Send".

En ambos casos, reemplaza `"anitalavalatina"` con la cadena que deseas verificar. La API responderá con un objeto JSON que indica si la cadena es un palíndromo, la longitud de la cadena y la cantidad de caracteres especiales en la cadena.


