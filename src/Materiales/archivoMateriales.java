/*
Universidad Abierta y a Distacia de Mexico (UnADM)
Autor: Miguel Angel Mendoza Jimenez
Matricula: ES172000597
Carrera Ingenieria en Desarrollo de Software
Materia: Programacion Orientada a Objetos III
Actividad: Evidencia de aprendizaje Unidad 1
Docente: Nora García González
Tijuana, B.C., Abril 2022 
 */
package Materiales;

// librerias a usar
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class archivoMateriales {
    // con clase File declaramos la variable para crear el archivo TXT
    private File archivoConstructora;
    // se crea la funcion para crear el archivo
    public void crearDocumento(){
        // se crea el objeto documento con la extension del archivo que se creara
        archivoConstructora = new File("materialesCosntructora.txt");
        // se declara el try catch paar el tema de excepciones y errores
        try{
            // validamos que el documento no exista para crearlo
            if(archivoConstructora.createNewFile()){}
        }catch (IOException ex){
            // se muestra el error al usuario en caso de existir
            System.err.println("Existe un error: " + ex);
            }
        }
    
    // se crea la funcion para escribir el texto en el documento
    public void ingresarTexto(Material  materiales){
        // se declara otro try catch para las excepciones y errores
        try{
            try ( // se escribe la informacion en el documento
                    FileWriter insertar = new FileWriter(archivoConstructora, true)) {
                // se insertan por medio de los metodos get
                insertar.write(materiales.getNombreMaterial() + " - " + materiales.getUnidadMaterial() + " - " +
                        materiales.getPrecioMaterial() + " - " + materiales.getFechaMaterial() + "\r\n");
            }
        }catch (IOException ex){
            // se muestra el error al usuario en caso de existir
            System.err.println("Existe un error: " + ex);
            }
    }
}
