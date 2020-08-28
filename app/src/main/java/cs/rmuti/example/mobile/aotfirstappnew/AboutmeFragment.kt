package cs.rmuti.example.mobile.aotfirstappnew

import android.os.Bundle
import android.view.*
import androidx.fragment.app.Fragment
import androidx.databinding.DataBindingUtil
import androidx.navigation.findNavController
import androidx.navigation.ui.NavigationUI
import cs.rmuti.example.mobile.aotfirstappnew.R.menu.options_menu
import cs.rmuti.example.mobile.aotfirstappnew.databinding.FragmentAboutmeBinding

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [AboutmeFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class AboutmeFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        var binding = DataBindingUtil.inflate<FragmentAboutmeBinding>(
            inflater,
            R.layout.fragment_aboutme,
            container,
            false
        )
        setHasOptionsMenu(true)
        return binding.root
    }

    override fun onCreateOptionsMenu(menu: Menu, inflater: MenuInflater) {
        super.onCreateOptionsMenu(menu, inflater)
        inflater?.inflate(options_menu, menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return NavigationUI.onNavDestinationSelected(
            item!!,
            view!!.findNavController()
        ) || super.onOptionsItemSelected(item)
    }

}