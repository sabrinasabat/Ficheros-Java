import java.io.*;
public class Main {
    public static void main(String[] arg){
        File archivo = null;
        FileReader fr = null;
        BufferedReader br = null;

        try{
            /* Apertura del fichero y creación de BufferedReader para poder
             hacer una lectura comoda (disponer del metodo readLine()) */
            archivo = new File ("archivoTest.txt");
            fr = new FileReader(archivo);
            br = new BufferedReader(fr);

            // Lectura del fichero


            String linea;
            while ((linea=br.readLine())!=null)
                System.out.println(linea);
        } catch (Exception e){
            e.printStackTrace(); // Esto pinta el detalle del error
        } finally {
            /* El el finally cerramos el fichero, para asegurarnos
             que se cierra tanto si todo va bien como si salta
             una excepcion. */
            try{
                if(null!=fr){
                    fr.close();
                }
            } catch (Exception e2){
                e2.printStackTrace();
            }
        }

    }
}

