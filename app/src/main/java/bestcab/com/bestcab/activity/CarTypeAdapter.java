package bestcab.com.bestcab.activity;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;

import bestcab.com.bestcab.R;

/**
 * Created by Brijesh on 8/3/2017.
 */

class CarTypeAdapter extends RecyclerView.Adapter<CarTypeAdapter.ViewHolder> {

    private ArrayList<String> mDataset;

    public CarTypeAdapter(ArrayList<String> mDataset) {
        this.mDataset = mDataset;
    }

    @Override
    public CarTypeAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.cabrow,parent,false);
        ViewHolder vh = new ViewHolder(view);

        return vh;
    }

    @Override
    public void onBindViewHolder(CarTypeAdapter.ViewHolder holder, int position) {
        holder.mTextView.setText(mDataset.get(position));

    }

    @Override
    public int getItemCount() {
        return mDataset.size();
    }
    class ViewHolder extends RecyclerView.ViewHolder {

        public TextView mTextView;

        public ViewHolder(View itemView) {
            super(itemView);
            mTextView = (TextView) itemView.findViewById(R.id.title);
        }
    }
}
