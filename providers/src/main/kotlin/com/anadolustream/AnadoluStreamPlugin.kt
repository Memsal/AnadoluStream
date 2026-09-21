package com.anadolustream

import com.lagradost.cloudstream3.plugins.CloudstreamPlugin
import com.lagradost.cloudstream3.plugins.Plugin
import android.content.Context

@CloudstreamPlugin
class AnadoluStreamPlugin : Plugin() {
    override fun load(context: Context) {
        registerMainAPI(TurkDiziProvider())
    }
}