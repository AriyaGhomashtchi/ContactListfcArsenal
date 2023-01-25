package de.syntax_institut.telefonbuch.data.model

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

/**
 * Diese Klasse stellt einen Listeneintrag dar
 */
@Parcelize
data class Contact(val name: String, val number: String, val badge: Int
) : Parcelable
