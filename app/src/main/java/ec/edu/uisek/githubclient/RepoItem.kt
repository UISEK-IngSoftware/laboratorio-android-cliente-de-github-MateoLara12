package ec.edu.uisek.githubclient

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import ec.edu.uisek.githubclient.databinding.FragmentRepoItemBinding

/**
 * A simple [Fragment] subclass.
 * Use the [RepoItem.newInstance] factory method to
 * create an instance of this fragment.
 */
class RepoItem : Fragment() {

    private var _binding: FragmentRepoItemBinding? = null
    private val binding get() = _binding!!

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            // Si en el futuro necesitas pasar parámetros, puedes manejarlos aquí
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentRepoItemBinding.inflate(inflater, container, false)
        return binding.root
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.repoName.text = "Mi repositorio"
        binding.repoDescription.text = "Esta es la descripción del repositorio"
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

    companion object {
        /**
         * Use this factory method to create a new instance of
         * this fragment using the provided parameters.
         */
        @JvmStatic
        fun newInstance(param1: String? = null, param2: String? = null) =
            RepoItem().apply {
                arguments = Bundle().apply {
                    // Puedes guardar los parámetros si los necesitas:
                    // putString("param1", param1)
                    // putString("param2", param2)
                }
            }
    }
}
