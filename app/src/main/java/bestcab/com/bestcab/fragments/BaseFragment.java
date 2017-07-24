package bestcab.com.bestcab.fragments;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

import bestcab.com.bestcab.Card;
import bestcab.com.bestcab.CustomListAdapter;
import bestcab.com.bestcab.R;

public class BaseFragment extends Fragment {
    ListView listView;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View viewBaseFragment = inflater.inflate(R.layout.fragment_base, container, false);
        listView = (ListView) viewBaseFragment.findViewById(R.id.listView);
        Card card1 = new Card("drawable://" + R.drawable.test1, "One way Cab");
        ArrayList<Card> list = new ArrayList<>();
        list.add(new Card("drawable://" + R.drawable.yellow, "ONE-WAY TRIP"));
        list.add(new Card("drawable://" + R.drawable.yellow, "ROUNDTRIP OUTSTATION"));
        list.add(new Card("drawable://" + R.drawable.yellow, "LOCAL 8/80"));
        list.add(new Card("drawable://" + R.drawable.yellow, "LOCAL 4/40"));
        CustomListAdapter adapter = new CustomListAdapter(getActivity(), R.layout.card_layout_main, list);
        listView.setAdapter(adapter);
        return viewBaseFragment;
    }
}
