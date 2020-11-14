package com.miguelzaragoza.upm.dam.viewmodel

import android.app.Application
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.miguelzaragoza.upm.dam.database.CameraDao
import com.miguelzaragoza.upm.dam.modules.cameras.CamerasViewModel

/**
 * ViewModelFactory que permite crear un CamerasViewModel al que pasarle parámetros por constructor
 */
class CamerasViewModelFactory (
    private val application: Application,
    private val database: CameraDao
) : ViewModelProvider.Factory {
    @Suppress("unchecked_cast")
    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        if (modelClass.isAssignableFrom(CamerasViewModel::class.java)) {
            return CamerasViewModel(application, database) as T
        }
        throw IllegalArgumentException("Unknown ViewModel class")
    }
}