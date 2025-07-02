package utils;

import java.util.Comparator;
import models.Contacto;

public class ContactoComparador implements Comparator<Contacto>{

    @Override
    public int compare(Contacto o1, Contacto o2) {
        // Por apellido
        int resultComparacionApellido=o1.getApellido().compareToIgnoreCase(o2.getApellido());

        //Si son iguales, por nombre
        if(resultComparacionApellido!=0){
            return resultComparacionApellido;
        }

        int resultComparacionNombre=o1.getNombre().compareToIgnoreCase(o2.getNombre());
        return resultComparacionNombre;
    }
    
}
