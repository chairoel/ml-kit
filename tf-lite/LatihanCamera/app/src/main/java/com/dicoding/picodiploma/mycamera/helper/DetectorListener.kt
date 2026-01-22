package com.dicoding.picodiploma.mycamera.helper

import org.tensorflow.lite.task.gms.vision.detector.Detection

interface DetectorListener {
    fun onError(error: String)
    fun onResults(
        results: MutableList<Detection>?,
        inferenceTime: Long,
        imageHeight: Int,
        imageWidth: Int
    )
}