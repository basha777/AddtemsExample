package d.xaro.additemsexample;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class ExampleAdapter extends RecyclerView.Adapter<ExampleAdapter.ExampleViewHolder> {

    private ArrayList<ExampleItem> mExampleList;


    public static class ExampleViewHolder extends RecyclerView.ViewHolder
    {

        public ImageView mImageView;
        public TextView mLabel;
        public TextView mDetails;
        public TextView mAmount;

        public ExampleViewHolder(View itemView) {
            super(itemView);

            mLabel = itemView.findViewById(R.id.textLabel);
            mDetails = itemView.findViewById(R.id.textDetails);
            mAmount = itemView.findViewById(R.id.textAmount);
        }
    }

    public ExampleAdapter(ArrayList<ExampleItem> exampleList)
    {
        mExampleList = exampleList;
    }

    @NonNull
    @Override
    public ExampleViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.customlist, parent, false);
        ExampleViewHolder evh = new ExampleViewHolder(view);
        return evh;
    }

    @Override
    public void onBindViewHolder(@NonNull ExampleViewHolder holder, int position) {
        ExampleItem currentItem = mExampleList.get(position);

        holder.mLabel.setText(currentItem.getMlabel());
        holder.mDetails.setText(currentItem.getMdetails());
        holder.mAmount.setText(currentItem.getMamount());
    }

    @Override
    public int getItemCount() {
        if (mExampleList == null)
            return 0;
        else
            return  mExampleList.size();
    }
}
