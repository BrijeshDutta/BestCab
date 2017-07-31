package bestcab.com.bestcab;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;

import java.util.ArrayList;

import bestcab.com.bestcab.activity.BookOneWayCabActivity;
import bestcab.com.bestcab.activity.CabTypeActivity;

public class LoginActivity extends AppCompatActivity {

    Spinner susertype;
    ArrayList<String> usertypelist;
    Button blogin;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        blogin = (Button) findViewById(R.id.blogin);
        susertype = (Spinner) findViewById(R.id.susertype);
        usertypelist = new ArrayList<>();
        usertypelist.add("User type");
        usertypelist.add("Passenger");
        usertypelist.add("Admin");
        ArrayAdapter<String> adapterusertype = new ArrayAdapter<String>(this,
                android.R.layout.simple_dropdown_item_1line, usertypelist);
        susertype.setAdapter(adapterusertype);

        blogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String userselectedvalue = susertype.getSelectedItem().toString();
                if(userselectedvalue.equalsIgnoreCase("Passenger")){
                    Intent intentHomeActivity = new Intent(LoginActivity.this, HomeActivity.class);
                    startActivity(intentHomeActivity);
                    finish();

                }
                else if(userselectedvalue.equalsIgnoreCase("Admin")){
                    Intent intentHomeAdminActivity = new Intent(LoginActivity.this, HomeAdminActivity.class);
                    startActivity(intentHomeAdminActivity);
                    finish();

                }

            }
        });

    }
}
