package bestcab.com.bestcab.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.lang.reflect.Array;
import java.util.ArrayList;

import bestcab.com.bestcab.R;

public class CabTypeActivity extends AppCompatActivity {

    private RecyclerView recyclerviewcartypeimages;
    private RecyclerView.LayoutManager reLayoutManager;
    private RecyclerView.Adapter mAdapter;
    private ArrayList<String> mDataset;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cab_type);
        mDataset = new ArrayList<>();
        for (int i =0;i<3;i++){
            mDataset.add("Car type : " +i);
        }
        recyclerviewcartypeimages = (RecyclerView) findViewById(R.id.rcvcartypepictures);
        recyclerviewcartypeimages.setHasFixedSize(true);
        reLayoutManager = new LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false);
        recyclerviewcartypeimages.setLayoutManager(reLayoutManager);
        mAdapter = new CarTypeAdapter(mDataset);
        recyclerviewcartypeimages.setAdapter(mAdapter);


    }

}
