package pem.tema4.presentador;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

import java.util.ArrayList;

import pem.tema4.AppMediador;
import pem.tema4.modelo.IModelo;
import pem.tema4.modelo.Item;
import pem.tema4.modelo.Modelo;

public class PresentadorPrincipal implements IPresentadorPrincipal {

    private AppMediador appMediador;

	// TODO Declarar una variable modelo para acceder al Modelo
    private IModelo modelo;

	// TODO Declarar e implementar el receptor broadcast que espera por la notificaci�n del modelo. 
	// El modelo notificar� cuando los datos de los tel�fonos a notificar est�n disponibles.
    private BroadcastReceiver receptorAvisos = new BroadcastReceiver() {
        @Override
        public void onReceive(Context context, Intent intent) {
            if (intent.getAction().equals(AppMediador.AVISO_DATOS_LISTOS)){
                ArrayList<Item> infoReceta = (ArrayList<Item>) intent.getSerializableExtra(AppMediador.CLAVE_LISTA_RECETAS);
                String[] datos = new String[infoReceta.size()];
                for (int i = 0; i < infoReceta.size(); i++){
                    datos[i] = infoReceta.get(i).getNombreReceta();
                }
                appMediador.getVistaPrincipal().actualizarMaestro(datos);
            }
            appMediador.unRegisterReceiver(this);
        }
    };

	// TODO Implementar un constructor que crea el modelo.
    public PresentadorPrincipal(){
        appMediador = AppMediador.getInstance();
        modelo = Modelo.getInstance();
    }


    // TODO Implementar el m�todo obtenerDatos() que registra el receptor para recibir notificaciones y
	// solicita al modelo que recupere los datos de la lista maestro.
    @Override
    public void obtenerDatos() {
        appMediador.registerReceiver(receptorAvisos, AppMediador.AVISO_DATOS_LISTOS);
        modelo.obtenerDatos();

    }

	// TODO Implementar el m�todo obtenerDetalle(int posicion) que registra el receptor para recibir 
	// notificaciones y solicita al modelo que recupere los datos de la lista detalle para una receta dada su posici�n.

	// TODO Implementar el m�todo tratarAgregar() que lanza la vista de agregaci�n por medio del mediador.

}
