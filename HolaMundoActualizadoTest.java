import org.junit.jupiter.api.*;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Clase de pruebas unitarias para {@link HolaMundoActualizado}.
 *
 * <p>Verifica que la salida por consola del programa es correcta,
 * comprobando primero el número total de líneas impresas y después
 * el contenido exacto de cada una de ellas.</p>
 *
 * <p>Se utiliza la redirección de {@code System.out} a un
 * {@link ByteArrayOutputStream} para capturar la salida del programa
 * y poder analizarla en cada test.</p>
 *
 * @author BirtLH
 * @version 1.0
 */
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class HolaMundoActualizadoTest {

    /** Flujo de bytes donde se captura la salida de {@code System.out}. */
    private final ByteArrayOutputStream outputStream = new ByteArrayOutputStream();

    /** Referencia al {@code System.out} original para restaurarlo tras cada test. */
    private final PrintStream originalOut = System.out;

    /**
     * Configuración previa a cada test.
     * Redirige {@code System.out} al flujo {@link #outputStream}
     * para poder capturar todo lo que el programa imprima.
     */
    @BeforeEach
    void setUp() {
        System.setOut(new PrintStream(outputStream));
    }

    /**
     * Limpieza posterior a cada test.
     * Restaura {@code System.out} a su valor original
     * para no afectar a otros tests ni a la salida de la consola.
     */
    @AfterEach
    void tearDown() {
        System.setOut(originalOut);
    }

    /**
     * Comprueba que el programa compila y se ejecuta sin lanzar excepciones.
     *
     * <p>Este test se ejecuta en primer lugar ({@code @Order(1)})
     * para verificar que el código compila correctamente y que
     * el método {@code main} se ejecuta sin errores.</p>
     */
    @Test
    @Order(1)
    @DisplayName("1. El programa compila y se ejecuta sin errores")
    void testCompilaYEjecuta() {
        assertDoesNotThrow(() -> HolaMundoActualizado.main(new String[]{}),
                "El programa debería compilar y ejecutarse sin lanzar excepciones");
    }

    /**
     * Comprueba que el programa imprime exactamente 4 líneas.
     *
     * <p>Este test se ejecuta en segundo lugar ({@code @Order(2)})
     * para validar la estructura general de la salida antes de
     * verificar el contenido de cada línea individual.</p>
     */
    @Test
    @Order(2)
    @DisplayName("2. Debe imprimir exactamente 4 líneas")
    void testNumeroDeLíneas() {
        HolaMundoActualizado.main(new String[]{});
        String salida = outputStream.toString().trim();
        String[] lineas = salida.split(System.lineSeparator());
        assertEquals(4, lineas.length,
                "Se esperaban 4 líneas pero se obtuvieron " + lineas.length);
    }

    /**
     * Comprueba que la primera línea de la salida es el saludo personalizado.
     *
     * <p>Valor esperado: {@code "Hola, BirtLH!"}</p>
     */
    @Test
    @Order(3)
    @DisplayName("3. Línea 1: debe ser el saludo 'Hola, BirtLH!'")
    void testLinea1Saludo() {
        HolaMundoActualizado.main(new String[]{});
        String[] lineas = outputStream.toString().trim().split(System.lineSeparator());
        assertEquals("Hola, BirtLH!", lineas[0],
                "La línea 1 no coincide con el saludo esperado");
    }

    /**
     * Comprueba que la segunda línea de la salida es el mensaje de bienvenida al curso.
     *
     * <p>Valor esperado: {@code "Bienvenidos/as al curso de programación en Java."}</p>
     */
    @Test
    @Order(4)
    @DisplayName("4. Línea 2: debe ser el mensaje de bienvenida")
    void testLinea2Bienvenida() {
        HolaMundoActualizado.main(new String[]{});
        String[] lineas = outputStream.toString().trim().split(System.lineSeparator());
        assertEquals("Bienvenidos/as al curso de programación en Java.", lineas[1],
                "La línea 2 no coincide con el mensaje de bienvenida esperado");
    }

    /**
     * Comprueba que la tercera línea de la salida es el año de nacimiento del usuario.
     *
     * <p>Valor esperado: {@code "1984"}</p>
     */
    @Test
    @Order(5)
    @DisplayName("5. Línea 3: debe ser el año de nacimiento 1984")
    void testLinea3AnioNacimiento() {
        HolaMundoActualizado.main(new String[]{});
        String[] lineas = outputStream.toString().trim().split(System.lineSeparator());
        assertEquals("1984", lineas[2],
                "La línea 3 no coincide con el año de nacimiento esperado");
    }

    /**
     * Comprueba que la cuarta línea de la salida es el mensaje final de motivación.
     *
     * <p>Valor esperado: {@code "¡Vamos a aprender mucho!"}</p>
     */
    @Test
    @Order(6)
    @DisplayName("6. Línea 4: debe ser el mensaje de motivación")
    void testLinea4Motivacion() {
        HolaMundoActualizado.main(new String[]{});
        String[] lineas = outputStream.toString().trim().split(System.lineSeparator());
        assertEquals("¡Vamos a aprender mucho!", lineas[3],
                "La línea 4 no coincide con el mensaje de motivación esperado");
    }
}
