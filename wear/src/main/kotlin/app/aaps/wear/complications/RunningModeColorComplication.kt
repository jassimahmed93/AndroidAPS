package app.aaps.wear.complications

/** Keeps the current AAPS mode colors by offering only a full-color image. */
class RunningModeColorComplication : RunningModeComplication() {

    override fun getProviderCanonicalName(): String = RunningModeColorComplication::class.java.canonicalName!!
}
