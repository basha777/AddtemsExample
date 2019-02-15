package d.xaro.additemsexample;


import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class AddItemsFragment extends Fragment {


    EditText labelEditText, detailsEditText, amountEditText;


    public AddItemsFragment() {
        // Required empty public constructor
    }

    FloatingActionButton floatingActionButton;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_add_items, container, false);

        labelEditText= view.findViewById(R.id.textLabelAddItems);
        detailsEditText= view.findViewById(R.id.textDetailsAddItems);
        amountEditText= view.findViewById(R.id.textAmountAddItems);
         floatingActionButton = view.findViewById(R.id.fabAddItems);

        floatingActionButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String label = labelEditText.getText().toString();
                String descrptn = detailsEditText.getText().toString();
                String amouunt = amountEditText.getText().toString();

                Bundle bundle = new Bundle();
                bundle.putString("Details", descrptn);
                bundle.putString("Amount", amouunt);
                bundle.putString("Label", label);
                android.support.v4.app.FragmentManager fragmentManager = getActivity().getSupportFragmentManager();
                android.support.v4.app.FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                MainScreen ms = new MainScreen();
                ms.setArguments(bundle);
                fragmentTransaction.replace(R.id.container, ms);
                fragmentTransaction.commit();
            }
        });
        return view;
    }

}
