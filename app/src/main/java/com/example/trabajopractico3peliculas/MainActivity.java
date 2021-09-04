package com.example.trabajopractico3peliculas;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;

import com.example.trabajopractico3peliculas.Modelo.Pelicula;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private RecyclerView rvPeliculas;
    private PeliculaAdapter adapter;
    private ArrayList<Pelicula> lista;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        inicializarVista();
        inicializarValor();
    }

    private void inicializarVista(){
        rvPeliculas = findViewById(R.id.rvPeliculas);
    }

    private void inicializarValor(){
        GridLayoutManager manager = new GridLayoutManager(this, 2, GridLayoutManager.VERTICAL, false);
        rvPeliculas.setLayoutManager(manager);

        lista = obtenerPeliculas();
        adapter = new PeliculaAdapter(lista);
        rvPeliculas.setAdapter(adapter);
    }


    private ArrayList<Pelicula> obtenerPeliculas() {
        ArrayList<Pelicula> lista = new ArrayList<Pelicula>();

        lista.add(new Pelicula("El discurso del rey", R.drawable.discursorey, "El eje principal es el miedo escénico provocado por la tartamudez del protagonista, el príncipe Alberto....",
                "El eje principal es el miedo escénico provocado por la tartamudez del protagonista, el príncipe Alberto. Cuando su padre muere y su hermano decide abdicar, es él quien tiene " +
                        "que asumir sus responsabilidades como rey, pero cree que no está preparado. Debido a su tartamudeo, al príncipe le da pavor hablar en público, pero tiene un objetivo: con ayuda de " +
                        "su logopeda va a prepararse un discurso muy importante para todo el país: la declaración de guerra a la Alemania nazi en plena Segunda Guerra Mundial. Y para ello solo puede hacer " +
                        "una cosa: tesón y mucha práctica.", "ACTORES: Colin Firth, Helena Carter, Derek Jacobi, Geoffrey Rush", "DIRECTOR: Tom Hopper"));
        lista.add(new Pelicula("En busca de la felicidad", R.drawable.enbuscadelafelicidad, "Los sentimientos y las emociones permanecen a flor de piel en la primera película que Wil....",
                "Los sentimientos y las emociones permanecen a flor de piel en la primera película que Will Smith protagonizó junto a su hijo Jaden. Está basada en la historia real de Chris Gardner," +
                        " quien invierte todos sus ahorros en desarrollar escáneres de densidad ósea portátiles para vender a los médicos. Tras fracasar y quedarse en bancarrota, su mujer lo abandona, dejando a " +
                        "su hijo a su cargo. Ambos tienen que enfrentarse a la difícil situación de vivir en la calle y empezar desde cero. La película enseña qué significa el valor y la capacidad de superar " +
                        "obstáculos pese a la adversidad, sobre todo cuando se trata de luchar por tus hijos", "ACTORES: Will Smith, Thandiwe Newton, Jaden Smith, Dan Castellaneta", "DIRECTOR: Gabriel Muccino"));
        lista.add(new Pelicula("Equals", R.drawable.equals, "En una sociedad futurista y distópica, las emociones humanas han conseguido ser totalmente erradic....", "En una sociedad " +
                "futurista y distópica, las emociones humanas han conseguido ser totalmente erradicadas a raíz de una guerra. Por ello, todo el mundo vive en paz en una sociedad pacífica y tranquila, pero no " +
                "tarda en aparecer un virus que cambia el destino del planeta. Resulta de gran interés la forma en que se plantea la relación entre personas y cómo se afrontan los problemas en una civilización " +
                "que ha eliminado todo aquello que diferencia a los humanos de un robot: los sentimientos. ", "ACTORES: Nicholas Hoult, Kristen Stewart, Jacki Weaver, Guy Pearce", "DIRECTOR: Drake Doremus"));
        lista.add(new Pelicula("Inteligencia Artificial", R.drawable.inteligenciaartificial, "Una película de ciencia ficción con la que Steven Spielberg consiguió emocionarnos en 20....",
                "Una película de ciencia ficción con la que Steven Spielberg consiguió emocionarnos en 2001. Cuenta la historia de David, un niño robot al que le programan un amor muy intenso" +
                        " por su madre, la mujer que lo compró. Sin embargo, su condición artificial despertará sentimientos contradictorios entre todos aquellos que se encuentren con él. Este niño no es humano" +
                        " pero a lo largo de la película quizá descubramos que el sentimiento es igualmente real y poderoso.", "ACTORES: Haley Joel Osment, Jude Law, Frances O'Connor", "DIRECTOR: Steven Spilberg"));
        lista.add(new Pelicula("Marte", R.drawable.marte, "Esta película de ciencia ficción, dirigida por Ridley Scott, tiene como protagonista a Mark Watney ....",
                "Esta película de ciencia ficción, dirigida por Ridley Scott, tiene como protagonista a Mark Watney (Matt Damon), que debido a varias circunstancias durante una exploración en Marte, " +
                        "se queda totalmente solo en el planeta. Con muy pocos recursos, se trata de una prueba de la esperanza y el instinto de supervivencia del ser humano, ya que no pueden volver a rescatarle " +
                        "hasta que hayan transcurrido varios años. Sin duda, constituye una gran reflexión sobre la gestión de las emociones en situaciones límite.", "ACTORES: Matt Damon, Jessica Chastain, Kristen Wiig", "DIRECTOR: Ridley Scott"));
        lista.add(new Pelicula("Mejor...imposible", R.drawable.mejorimposible, "Jack Nicholson interpreta en este largometraje a Melvin, un escritor maniático y odioso que parece no mostrar...",
                "Jack Nicholson interpreta en este largometraje a Melvin, un escritor maniático y odioso que parece no mostrar ningún tipo de sensibilidad y empatía hacía los demás. Todo cambia el día que" +
                        " empieza a cuidar al perro de su vecino Simon e inicie una relación con Carol Connelly (Helen Hunt), la paciente camarera que trabaja en el restaurante al que Melvin acude con bastante frecuencia." +
                        " Ella es madre soltera y tiene un hijo enfermo.", "ACTORES: Jack Nicholson, Helen Hunt, Greg Kinnear", "DIRECTOR: James L. Brooks"));

        return lista;
    }

}