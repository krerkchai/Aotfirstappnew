package cs.rmuti.example.mobile.aotfirstappnew

import android.os.Bundle
import android.view.*
import androidx.fragment.app.Fragment
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.findNavController
import androidx.navigation.ui.NavigationUI
import cs.rmuti.example.mobile.aotfirstappnew.database.Database
import cs.rmuti.example.mobile.aotfirstappnew.databinding.FragmentContactBinding

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [ContactFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class ContactFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        var binding = DataBindingUtil.inflate<FragmentContactBinding>(
            inflater,
            R.layout.fragment_contact,
            container,
            false
        )

        setHasOptionsMenu(true)

        val application = requireNotNull(this.activity).application
        val dataSource = Database.getInstance(application).databaseDao
        val viewModelFactory = ContactViewModelFactory(dataSource, binding, application)
        val contactViewModel =
            ViewModelProvider(
                this, viewModelFactory
            ).get(ContactViewModel::class.java)
        binding.contactViewModel = contactViewModel
        binding.lifecycleOwner = this
        return binding.root
    }
}