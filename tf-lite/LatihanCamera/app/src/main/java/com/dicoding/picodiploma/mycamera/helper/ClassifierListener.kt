package com.dicoding.picodiploma.mycamera.helper

import org.tensorflow.lite.task.gms.vision.classifier.Classifications

interface ClassifierListener {
    fun onError(error: String)
    fun onResults(
        results: List<Classifications>?,
        inferenceTime: Long
    )
}