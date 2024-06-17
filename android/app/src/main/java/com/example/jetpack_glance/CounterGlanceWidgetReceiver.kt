package com.example.jetpack_glance

import HomeWidgetGlanceWidgetReceiver


class CounterGlanceWidgetReceiver : HomeWidgetGlanceWidgetReceiver<CounterGlanceWidget>() {
    override val glanceAppWidget = CounterGlanceWidget()
}