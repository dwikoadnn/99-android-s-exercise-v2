package co.ninetynine.android.exercisev2;

public class Adapter<lateinit> {
    class MainActivity : void AppCompatActivity() {

        private lateinit var recyclerView: RecyclerView
        private lateinit var viewAdapter: RecyclerView.Adapter<*>
        private lateinit var viewManager: RecyclerView.LayoutManager

        override fun onCreate(savedInstanceState: Bundle?) {
            super.onCreate(savedInstanceState)
            setContentView(R.layout.activity_main)

            // Define the list of apartments
            val apartments = listOf(
                    Apartment("Parkview Apartments", "12 Meyappa Chettiar Rd . D13", "Exec Condo 2020.99 yrs", "3 Beds", "2 Baths", "2561 sqft", "$2561/mo"),
                    Apartment("Evergreen Park", "35 Hougang Ave 7 . D19", "Exec Condo 1999.99 yrs", "3 Beds", "3 Baths", "1012 sqft", "$4000/mo"),
                    Apartment("Wallich", "3 Wallich St . D2", "Exec Apartment 2022.99 yrs", "2 Beds", "2 Baths", "915 sqft", "$3300/mo")
                    )

            // Set up the RecyclerView
            recyclerView = findViewById<RecyclerView>(R.id.recyclerView).apply {
                setHasFixedSize(true)
            }

            viewManager = LinearLayoutManager(this)
            viewAdapter = ApartmentAdapter(apartments)

            recyclerView.layoutManager = viewManager
            recyclerView.adapter = viewAdapter
        }
    }
}
