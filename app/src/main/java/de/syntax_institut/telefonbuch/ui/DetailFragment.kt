package de.syntax_institut.telefonbuch.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import de.syntax_institut.telefonbuch.R
import de.syntax_institut.telefonbuch.data.model.Contact
import de.syntax_institut.telefonbuch.databinding.FragmentDetailBinding
import kotlin.contracts.contract

class DetailFragment : Fragment() {

    private lateinit var binding: FragmentDetailBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentDetailBinding.inflate(inflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {

        val contact = requireArguments().getParcelable<Contact>("contact")

        if (contact != null) {
            binding.detailContactImage.setImageResource(contact.badge)
            binding.detailNameText.text = contact.name
            binding.detailNumberText.text = contact.number
        } else {
            binding.detailContactImage.setImageResource(R.drawable.round_broken_image_24)
        }
    }
}