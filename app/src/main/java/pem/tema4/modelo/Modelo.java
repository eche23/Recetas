package pem.tema4.modelo;

import pem.tema4.AppMediador;

public class Modelo implements IModelo {

    private static Modelo singleton = null;
    private ConjuntoDeRecetas conjuntoDeRecetas;
    private AppMediador appMediador;

    private Modelo() {
        appMediador = AppMediador.getInstance();
        conjuntoDeRecetas =	ConjuntoDeRecetas.getInstance();
    }

    public static Modelo getInstance() {
        if (singleton == null)
            singleton = new Modelo();
        return singleton;
    }

	// TODO Implementar el m�todo obtenerDatos() que recupera los datos de la lista de recetas del 
	// conjunto de recetas y envia una notificaci�n del tipo AVISO_DATOS_LISTOS al presentador.
	
	// TODO Implementar el m�todo obtenerDetalle(int posicion) que recupera los datos del detalle de una receta del 
	// conjunto de recetas y envia una notificaci�n del tipo AVISO_DETALLE_LISTO al presentador.

	// TODO A�adir el m�todo agregarReceta(Object[] datos) que almacena una nueva receta en la lista
	// de recetas. En la posici�n 0 se almacena el nombre del archivo de imagen, en la posici�n 1 se
	// almacena el nombre de la receta y en la posici�n 2 se almacena la descripci�n de la receta.

}

