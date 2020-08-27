package cs.rmuti.example.mobile.aotfirstappnew

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import cs.rmuti.example.mobile.aotfirstappnew.database.DatabaseDAO
import cs.rmuti.example.mobile.aotfirstappnew.databinding.FragmentContactBinding

class ContactViewModel(
    val database: DatabaseDAO,
    private val binding: FragmentContactBinding,
    application: Application
) : AndroidViewModel(application) {
}