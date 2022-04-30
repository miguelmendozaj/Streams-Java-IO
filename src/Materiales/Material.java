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

// Se genera la clase material con sus atributos
public class Material {
    private String nombreMaterial;
    private String unidadMaterial;
    private Float precioMaterial;
    private String fechaMaterial;
    
    // se declara el constructor de la clase
    public Material(String nombreMaterial, String unidadMaterial, Float precioMaterial, String fechaMaterial) {
        this.nombreMaterial = nombreMaterial;
        this.unidadMaterial = unidadMaterial;
        this.precioMaterial = precioMaterial;
        this.fechaMaterial = fechaMaterial;
    }
    
    // se generan los getter y setter de todos los atributos de la clase
    public String getNombreMaterial() {
        return nombreMaterial;
    }

    public void setNombreMaterial(String nombreMaterial) {
        this.nombreMaterial = nombreMaterial;
    }

    public String getUnidadMaterial() {
        return unidadMaterial;
    }

    public void setUnidadMaterial(String unidadMaterial) {
        this.unidadMaterial = unidadMaterial;
    }

    public Float getPrecioMaterial() {
        return precioMaterial;
    }

    public void setPrecioMaterial(Float precioMaterial) {
        this.precioMaterial = precioMaterial;
    }

    public String getFechaMaterial() {
        return fechaMaterial;
    }

    public void setFechaMaterial(String fechaMaterial) {
        this.fechaMaterial = fechaMaterial;
    }
    
}
    
    