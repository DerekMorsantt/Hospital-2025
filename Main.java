// Importamos las clases necesarias de la librería Swing, que nos permiten crear interfaces gráficas de usuario
import javax.swing.JFrame;  // JFrame es la clase que se utiliza para crear una ventana principal.
import javax.swing.JLabel;  // JLabel es la clase que se usa para mostrar texto o imágenes en la ventana.

public class Main {

    public static void main(String[] args) {
        
        // Crear una ventana usando JFrame
        // Aquí estamos creando un objeto de tipo JFrame, que representa la ventana en la interfaz gráfica.
        JFrame miVentana = new JFrame(); 
        
        // Establecemos el título de la ventana con el método setTitle()
        // En este caso, el título de la ventana será "Hospital SCL".
        miVentana.setTitle("Hospital SCL"); 
        
        // Definimos el tamaño de la ventana con el método setSize(), en donde el primer número es el ancho
        // y el segundo número es la altura de la ventana en píxeles.
        miVentana.setSize(1000, 800); 

        // Crear un texto utilizando JLabel
        // JLabel es un componente que nos permite mostrar texto en la ventana.
        JLabel texto = new JLabel(); // Aquí creamos un objeto de tipo JLabel vacío.

        // Establecemos el texto que queremos mostrar en el JLabel.
        // En este caso, el texto será "Hola Mundo".
        texto.setText("Hola Mundo"); 

        // Agregamos el JLabel (que contiene el texto) a la ventana para que se muestre.
        miVentana.add(texto); 

        // Finalmente, hacemos que la ventana sea visible. Por defecto, las ventanas en Swing están ocultas,
        // por lo que debemos llamar a setVisible(true) para que se vea en pantalla.
        miVentana.setVisible(true);
    }
}
