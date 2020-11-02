package com.miguelzaragoza.upm.dam.model

import android.os.Parcelable
import com.google.android.gms.maps.model.LatLng
import kotlinx.android.parcel.Parcelize

/**
 * Clase del objeto Camera.
 * @param name: nombre de la cámara
 * @param url: enlace con el que se obtiene la captura de dicha cámara
 * @param coordinates: coordenadas de donde se ubica la cámara
 * @param status: valor que determina si tenemos la cámara seleccionada (true) o no (false)
 */
data class Camera(
    val name: String,
    val url: String,
    val coordinates: LatLng,
    var status: Boolean
)

/**
 * Clase Parcelable para enviar la lista de cámaras que queremos mostrar en el mapa
 * en función de lo solicitado en el primer Fragment.
 */
@Parcelize
class Cameras: ArrayList<Camera>(), Parcelable