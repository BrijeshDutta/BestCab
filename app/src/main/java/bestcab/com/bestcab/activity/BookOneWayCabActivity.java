package bestcab.com.bestcab.activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;

import com.codetroopers.betterpickers.calendardatepicker.CalendarDatePickerDialogFragment;
import com.codetroopers.betterpickers.numberpicker.NumberPickerBuilder;
import com.codetroopers.betterpickers.timepicker.TimePickerBuilder;

import java.util.ArrayList;
import java.util.Calendar;

import bestcab.com.bestcab.R;

public class BookOneWayCabActivity extends AppCompatActivity {

    ArrayList<String> onewaycabfromList,onewaycabtoList;
    EditText onewaycabPickUpTime;
    Button bsearchforcab;
    Spinner onewaycabFrom,onewaycabTo;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_book_one_way_cab);
        super.setTitle(getString(R.string.onewaytriplable));
        initializeUiComponents();
        onewaycabPickUpTime.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                NumberPickerBuilder npb = new NumberPickerBuilder()
//                        .setFragmentManager(getSupportFragmentManager())
//                        .setStyleResId(R.style.BetterPickersDialogFragment)
//                        .setLabelText("No of people.");
//                npb.show();
            }
        });
        onewaycabPickUpTime.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View v, boolean hasFocus) {
                if(hasFocus){
                    showTimePicker();
                }
            }
        });
        bsearchforcab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentViewSingleCustomer = new Intent(BookOneWayCabActivity.this, CabTypeActivity.class);
                startActivity(intentViewSingleCustomer);
                //finish();
            }
        });
    }
    private void initializeUiComponents(){
        onewaycabPickUpTime = (EditText) findViewById(R.id.onewaycabPickUpTime);
        bsearchforcab = (Button) findViewById(R.id.bsearchforcab);
        onewaycabfromList = new ArrayList<>();
        onewaycabfromList.add("From");
        onewaycabfromList.add("Pune");
        onewaycabfromList.add("Mumbai");
        onewaycabfromList.add("Nashik");
        onewaycabFrom = (Spinner) findViewById(R.id.onewaycabFrom);
        ArrayAdapter<String> adapteronewaycabFrom = new ArrayAdapter<String>(this,
                android.R.layout.simple_dropdown_item_1line, onewaycabfromList);
        onewaycabFrom.setAdapter(adapteronewaycabFrom);

        onewaycabTo  = (Spinner) findViewById(R.id.onewaycabTo);
        onewaycabtoList = new ArrayList<>();
        onewaycabtoList.add("To");
        onewaycabtoList.add("Pune");
        onewaycabtoList.add("Mumbai");
        onewaycabtoList.add("Nashik");
        ArrayAdapter<String> adapteronewaycabTo = new ArrayAdapter<String>(this,
                android.R.layout.simple_dropdown_item_1line, onewaycabtoList);
        onewaycabTo.setAdapter(adapteronewaycabTo);
    }
    private void showTimePicker(){
        TimePickerBuilder tpb = new TimePickerBuilder()
                .setFragmentManager(getSupportFragmentManager())
                .setStyleResId(R.style.BetterPickersDialogFragment);
        tpb.show();
    }
}
