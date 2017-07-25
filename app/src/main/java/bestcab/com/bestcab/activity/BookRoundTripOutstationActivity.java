package bestcab.com.bestcab.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import bestcab.com.bestcab.R;

public class BookRoundTripOutstationActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_book_round_trip_outstation);
        super.setTitle(getString(R.string.roundtripoutstationlable));
    }
}
