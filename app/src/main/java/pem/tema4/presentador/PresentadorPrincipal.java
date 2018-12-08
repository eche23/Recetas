package pem.tema4.presentador;

import pem.tema4.AppMediador;

public class PresentadorPrincipal implements IPresentadorPrincipal {

    private AppMediador appMediador;
	// TODO Declarar una variable modelo para acceder al Modelo

	// TODO Declarar e implementar el receptor broadcast que espera por la notificación del modelo. 
	// El modelo notificará cuando los datos de los teléfonos a notificar están disponibles.

	// TODO Implementar un constructor que crea el modelo.
    public PresentadorPrincipal(){
        appMediador = AppMediador.getInstance();
    }
	// TODO Implementar el método obtenerDatos() que registra el receptor para recibir notificaciones y 
	// solicita al modelo que recupere los datos de la lista maestro.

	// TODO Implementar el método obtenerDetalle(int posicion) que registra el receptor para recibir 
	// notificaciones y solicita al modelo que recupere los datos de la lista detalle para una receta dada su posición.

	// TODO Implementar el método tratarAgregar() que lanza la vista de agregación por medio del mediador.

}
