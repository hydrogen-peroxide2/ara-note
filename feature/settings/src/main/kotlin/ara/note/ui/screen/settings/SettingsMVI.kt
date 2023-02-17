package ara.note.ui.screen.settings

import android.net.Uri
import com.ara.aranote.data.datastore.UserPreferences
import ara.note.util.MviIntent
import ara.note.util.MviSingleEvent
import ara.note.util.MviState
import kotlin.reflect.KProperty1

data class SettingsState(
    val userPreferences: UserPreferences = UserPreferences(),
) : MviState

sealed interface SettingsIntent : MviIntent {
    object ObserveUserPreferences : SettingsIntent
    data class ShowUserPreferences(val userPreferences: UserPreferences) : SettingsIntent

    data class WriteUserPreferences<T>(
        val kProperty: KProperty1<UserPreferences, T>,
        val value: T,
    ) : SettingsIntent

    data class ImportData(val uri: Uri, val onComplete: () -> Unit) : SettingsIntent
    data class ExportData(val uri: Uri, val onComplete: () -> Unit) : SettingsIntent
}

sealed interface SettingsSingleEvent : MviSingleEvent
