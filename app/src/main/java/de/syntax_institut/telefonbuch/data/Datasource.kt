package de.syntax_institut.telefonbuch.data

import de.syntax_institut.telefonbuch.R
import de.syntax_institut.telefonbuch.data.model.Contact

/**
 * Diese Klasse bereitet die Informationen vor
 */
class Datasource {

    /**
     * Diese Funktion liefert eine Liste von Contact Objekten zurück,
     * in denen die Namen und die Telefonnummern gespeichert sind
     */
    fun loadContacts(): MutableList<Contact> {
        return mutableListOf(
            Contact("Gabriel Martinelli", "+43 1595 9367862", R.drawable.fc_arsenal__seit_2002__svg),
            Contact("Cristiano Ronaldo", "+43 15047 284702", R.drawable.alnassr),
            Contact("Edu Gaspar", "+43 1598 7361226",R.drawable.fc_arsenal__seit_2002__svg),
            Contact("Marc Overmars", "+46 1513 5007043", R.drawable.psveindhovn),
            Contact("Lothar Matthäus", "+49 15596 033203",R.drawable.fcbayern_svg),
            Contact("Piotr Zielinski", "+24 15027 785378",R.drawable.napoli_svg),
            Contact("Mikel Arteta", "+43 15574 793889",R.drawable.fc_arsenal__seit_2002__svg),
            Contact("Bastian Schweinsteiger", "+49 163 55846780",R.drawable.fcbayern_svg),
            Contact("Luis Suárez", "+34 15655 478518",R.drawable.barca),
            Contact("Diego Costa", "+34 15868 293585",R.drawable.atleti_svg),
            Contact("Sergio Ramos", "+34 1526 6618426",R.drawable.realmadrid_svg),
            Contact("Piotr Trochowski", "+49 162 6334069",R.drawable.hsv_svg),
            Contact("Philipp Lahm", "+49 15880 654128",R.drawable.fcbayern_svg),
            Contact("Mesut Özil", "+49 172 32469523",R.drawable.realmadrid_svg),
            Contact("Leon Goretzka", "+49 1521 3291920",R.drawable.fcbayern_svg),
            Contact("Erling Haaland", "+43 1577 5161260",R.drawable.mancity_svg),
            Contact("Karim Benzema", "+34 162 7285734",R.drawable.realmadrid_svg),
            Contact("Thomas Müller", "+49 15818 559583",R.drawable.fcbayern_svg),
            Contact("Toni Kroos", "+34 162 6544672",R.drawable.realmadrid_svg),
            Contact("Aaron Ramsdale", "+43 173 30423354",R.drawable.fc_arsenal__seit_2002__svg)
        )
    }
}
