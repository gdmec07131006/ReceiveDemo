package cn.edu.gdmec.c07131006.smsfilter;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.content.ReceiverCallNotAllowedException;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends Activity {
	EditText myEd;
	Button myBtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        myEd = (EditText) findViewById(R.id.editText1);
        myBtn = (Button) findViewById(R.id.button1);
        myBtn.setOnClickListener(new OnClickListener(){

			@Override
			public void onClick(View v) {
				String str = "cn.edu.gdmec.c07131006.Receive";
				Intent myIt = new Intent(str);
				myIt.putExtra("para",myEd.getText().toString());
				sendBroadcast(myIt);
			}
        	
        });
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
    
}
