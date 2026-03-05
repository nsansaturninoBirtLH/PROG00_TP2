# HolaMundoActualizado

## Enunciado

En esta tarea vas a identificar y corregir errores en un programa Java sencillo. Te ayudará a consolidar lo que has aprendido sobre la estructura básica de un programa Java y el uso de System.out.println(). 

Para ello, es importante que identifiques las partes del programa que puedes probar de manera independiente. De este modo, puedes ir testando menos líneas y detectar y corregir errores resulta más sencillo.

Una vez que el programa compile, necesitarás realizar ciertos cambios para que se comporte según lo esperado en los tests.

El programa final debe mostrar lo siguiente:

    Hola, BirtLH!
    Bienvenidos/as al curso de programación en Java.
    1984
    ¡Vamos a aprender mucho!

## Indicaciones de desarrollo

1. Identifica las partes del programa que puedes probar de manera independiente, escribe cada una de ellas y revísala hasta que compile sin errores. Lee atentamente los errores que muestra el compilador en la pestaña "PROBLEMAS". Recuerda que te da pistas, pero no siempre acierta al cien por cien.
2. Ejecuta los test y comprueba cuáles fallan para identificar las líneas a modificar.
3. Revisa por qué falla cada test y realiza los cambios necesarios. Revísalos en orden y si te cuesta identificar las diferencias en el texto, usa la página text-compare.com
4. Comenta el programa y comprueba que cumple con los criterios de legibilidad propuestos en el curso. 
5. Finalmente usa el prompt que se propone al final de este documento para comprobar que has finalizado.


## Resumen de los tests

El archivo `HolaMundoActualizadoTest.java` contiene 6 tests que se ejecutan en orden:

| # | Test | Descripción |
|---|------|-------------|
| 1 | `testCompilaYEjecuta` | Verifica que el programa **compila y se ejecuta** sin lanzar ninguna excepción. |
| 2 | `testNumeroDeLíneas` | Comprueba que la salida del programa tiene **exactamente 4 líneas**. |
| 3 | `testLinea1Saludo` | Verifica que la primera línea es `Hola, BirtLH!` |
| 4 | `testLinea2Bienvenida` | Verifica que la segunda línea es `Bienvenidos/as al curso de programación en Java.` |
| 5 | `testLinea3AnioNacimiento` | Verifica que la tercera línea es `1984` |
| 6 | `testLinea4Motivacion` | Verifica que la cuarta línea es `¡Vamos a aprender mucho!` |

> **Consejo:** ejecuta los tests en orden. Si el test 1 falla, significa que el programa no compila o tiene un error de ejecución. Corrige eso antes de preocuparte por los demás tests.

## Prompt para evaluar legibilidad y comentarios con IA

Copia y pega el siguiente prompt en el chat de Copilot (o cualquier IA) junto con tu código Java para obtener una evaluación detallada:

---

```text
Analiza el siguiente código Java y evalúa:

1. Tabulación: ¿es consistente? ¿usa espacios o tabuladores?
2. Legibilidad: ¿los nombres de variables/métodos son descriptivos? ¿la estructura es clara?
   No te preocupes por números mágicos y constantes. Todavía no los hemos trabajado.
3. Comentarios: ¿están bien redactados? ¿son suficientes? ¿tiene Javadoc en clases y métodos públicos?
4. Convenciones Java: ¿sigue las convenciones de nombrado estándar (camelCase, PascalCase para clases, etc.)?
   No te preocupes por la declaración de paquetes. Todavía no lo hemos trabajado.

Responde con una puntuación del 1 al 10 en cada categoría y sugiere mejoras concretas.
```

---

> **Nota:** si en el futuro se trabajan conceptos como constantes, números mágicos o paquetes,
> elimina las líneas que dicen "no te preocupes por..." para que la IA también evalúe esos aspectos.

