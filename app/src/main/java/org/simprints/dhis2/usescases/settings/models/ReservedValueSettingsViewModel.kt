package org.simprints.dhis2.usescases.settings.models

data class ReservedValueSettingsViewModel(
    val numberOfReservedValuesToDownload: Int,
    val canBeEdited: Boolean
)
