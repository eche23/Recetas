package pem.tema4.presentador;

import pem.tema4.AppMediador;

public class PresentadorPrincipal implements IPresentadorPrincipal {

    private AppMediador appMediador;
	// TODO Declarar una variable modelo para acceder al Modelo

	// TODO Declarar e implementar el receptor broadcast que espera por la notificaci�n del modelo. 
	// El modelo notificar� cuando los datos de los tel�fonos a notificar est�n disponibles.

	// TODO Implementar un constructor que crea el modelo.
    public PresentadorPrincipal(){
        appMediador = AppMediador.getInstance();
    }
	// TODO Implementar el m�todo obtenerDatos() que registra el receptor para recibir notificaciones y 
	// solicita al modelo que recupere los datos de la lista maestro.

	// TODO Implementar el m�todo obtenerDetalle(int posicion) que registra el receptor para recibir 
	// notificaciones y solicita al modelo que recupere los datos de la lista detalle para una receta dada su posici�n.

	// TODO Implementar el m�todo tratarAgregar() que lanza la vista de agregaci�n por medio del mediador.

}
