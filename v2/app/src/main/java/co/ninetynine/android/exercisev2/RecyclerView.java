package co.ninetynine.android.exercisev2;

import android.view.LayoutInflater;

import java.util.List;
import java.util.zip.Inflater;

public class RecyclerView<fun, override> {
    public static Object Adapter;

    class ApartmentAdapter(private val apartments:List<data.Apartment>) : RecyclerView.Adapter<ApartmentAdapter.ViewHolder>() {

        class ViewHolder(private val binding: ApartmentItemBinding) : RecyclerView.ViewHolder(binding.root) {
            fun bind Object apartment;
            (apartment:data.Apartment) {
                binding.apartment = apartment
                binding.executePendingBindings()
            }
        }

        override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
            Inflater ApartmentItemBinding;
            val binding = ApartmentItemBinding.inflate(LayoutInflater.from(parent.context), parent, false)
            return ViewHolder(binding)
        }

        override fun onBindViewHolder(holder: ViewHolder, position: Int) {
            holder.bind(apartments[position])
        }

        override fun getItemCount() = apartments.size
    }
}
