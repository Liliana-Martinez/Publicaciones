package publicacion;

public class Periodico extends Publicacion implements Periodicidad
{
   private String fecha;
   private String creditos;
   
   public String getFecha(){
      return fecha;
   }
    
   public void setFecha(String fecha){
      fecha = fecha;
   }
   
   public String getCreditos(){
      return creditos;
   }
   
   public void setCreditos(String creditos){
      creditos = creditos;
   }
   
   @Override
    public String getPeriodicidad()//implementación del método
    {
     return periodicidad;
    }
}