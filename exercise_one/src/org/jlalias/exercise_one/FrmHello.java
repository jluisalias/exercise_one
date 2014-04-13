package org.jlalias.exercise_one;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

public class FrmHello extends Activity {
	@Override
    protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_saludo);
        
        TextView textHello = (TextView)findViewById(R.id.TextHello);

        Bundle bundle = this.getIntent().getExtras();
        
        textHello.setText("Hello " + bundle.getString("NAME"));
       }
}
