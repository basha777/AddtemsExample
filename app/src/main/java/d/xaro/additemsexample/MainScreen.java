package d.xaro.additemsexample;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;

import java.util.ArrayList;


/**
 * A simple {@link Fragment} subclass.
 */
public class MainScreen extends Fragment {

    //  Spinner spinner;
    EditText amountt;
    EditText detailss;
    EditText datee;
    private ArrayList<ExampleItem> mExampleList;
    private RecyclerView mRecyclerView;
    private RecyclerView.Adapter mAdapter;
    private RecyclerView.LayoutManager mLayoutManager;

    public MainScreen() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        View view = inflater.inflate(R.layout.fragment_main_screen, container, false);


        //      amountt = (EditText) view.findViewById(R.id.textAmountt);
        //      detailss = (EditText) view.findViewById(R.id.textDetailss);
        //      datee = (EditText) view.findViewById(R.id.datePick);
        //      spinner = (Spinner) view.findViewById(R.id.customSpinner);


        mExampleList = new ArrayList<ExampleItem>();
        mExampleList.add(new ExampleItem(R.drawable.ic_launcher_foreground, "", "", "ADD EXPENSES"));


        mRecyclerView = view.findViewById(R.id.recyclerView);
        mRecyclerView.setHasFixedSize(true);
        mLayoutManager = new LinearLayoutManager(getContext());
        mAdapter = new ExampleAdapter(mExampleList);

        mRecyclerView.setLayoutManager(mLayoutManager);
        mRecyclerView.setAdapter(mAdapter);


        insertItem();

        return view;
    }


    public void insertItem() {
        // String amount = String.valueOf(amountt.getText());
        //  String details = String.valueOf((detailss.getText()));
        // String date = String.valueOf((datee.getText()));

        Bundle bundle = getArguments();
        if(bundle!=null){
            String deTails = bundle.getString("Details");
            String aMount = bundle.getString("Amount");
            String label =bundle.getString("Label" );

            mExampleList.add(0, new ExampleItem(R.drawable.ic_launcher_background, label, "" + deTails, "₱ " + aMount));
            mAdapter.notifyDataSetChanged();
        }



        //int position = bundle.getInt("Position");




/*
        switch (position){
            case 0:
                mExampleList.add(0, new ExampleItem(R.drawable.food, "Food % Drink", deTails, "₱ " + aMount));
                mAdapter.notifyDataSetChanged();
            case 1:
                mExampleList.add(0, new ExampleItem(R.drawable.shopping, "Shopping", deTails, "₱ " + aMount));
                mAdapter.notifyDataSetChanged();
            case 2:
                mExampleList.add(0, new ExampleItem(R.drawable.transportation, "Transportation", deTails, "₱ " + aMount));
                mAdapter.notifyDataSetChanged();
            case 3:
                mExampleList.add(0, new ExampleItem(R.drawable.home, "Home", deTails, "₱ " + aMount));
                mAdapter.notifyDataSetChanged();
            case 4:
                mExampleList.add(0, new ExampleItem(R.drawable.bills, "Bills & Fees", deTails, "₱ " + aMount));
                mAdapter.notifyDataSetChanged();
            case 5:
                mExampleList.add(0, new ExampleItem(R.drawable.entertainment, "Entertainment", deTails, "₱ " + aMount));
                mAdapter.notifyDataSetChanged();
            case 6:
                mExampleList.add(0, new ExampleItem(R.drawable.medical, "Healthcare", deTails, "₱ " + aMount));
                mAdapter.notifyDataSetChanged();
            case 7:
                mExampleList.add(0, new ExampleItem(R.drawable.education, "Education", deTails, "₱ " + aMount));
                mAdapter.notifyDataSetChanged();
            case 8:
                mExampleList.add(0, new ExampleItem(R.drawable.beauty, "Beauty", deTails, "₱ " + aMount));
                mAdapter.notifyDataSetChanged();
            case 9:
                mExampleList.add(0, new ExampleItem(R.drawable.others, "Others", deTails, "₱ " + aMount));
                mAdapter.notifyDataSetChanged();
        }
*/
    }

}
