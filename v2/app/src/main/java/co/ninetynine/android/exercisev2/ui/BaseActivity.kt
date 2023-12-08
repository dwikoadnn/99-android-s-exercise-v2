package co.ninetynine.android.exercisev2.ui

import android.os.Bundle
import android.viewbinding.ViewBinding
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.LiveData
import androidx.viewbinding.ViewBinding

abstract class BaseActivity<T : ViewBinding> : AppCompatActivity() {

    private lateinit var binding: T

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = createThisViewBinding()
        setContentView(binding.root)
    }

    abstract fun createThisViewBinding(): T

    protected fun getThisViewBinding() = binding

    // Corrected LiveData extension function
    fun <G> LiveData<G>.observe(onDataChanged: (data: G?) -> Unit) =
        observe(this@BaseActivity, { onDataChanged(it) })

    fun <G> LiveData<G>.observeNotNull(onDataChanged: (data: G) -> Unit) =
        observe(this@BaseActivity) { it?.let { onDataChanged(it) } }
}
