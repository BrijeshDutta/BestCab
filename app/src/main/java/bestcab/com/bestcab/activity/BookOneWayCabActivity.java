package bestcab.com.bestcab.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import com.codetroopers.betterpickers.calendardatepicker.CalendarDatePickerDialogFragment;
import com.codetroopers.betterpickers.numberpicker.NumberPickerBuilder;
import com.codetroopers.betterpickers.timepicker.TimePickerBuilder;

import java.util.Calendar;

import bestcab.com.bestcab.R;

public class BookOneWayCabActivity extends AppCompatActivity {

    EditText onewaycabPickUpTime;
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
    }
    private void initializeUiComponents(){
        onewaycabPickUpTime = (EditText) findViewById(R.id.onewaycabPickUpTime);
    }
    private void showTimePicker(){
        TimePickerBuilder tpb = new TimePickerBuilder()
                .setFragmentManager(getSupportFragmentManager())
                .setStyleResId(R.style.BetterPickersDialogFragment);
        tpb.show();
    }
}
