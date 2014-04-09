package exercise_one;


import org.jlalias.exercise_one.R;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends Activity {
	@Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        final EditText textName = (EditText)findViewById(R.id.TextName);
        final Button buttonHello = (Button)findViewById(R.id.ButtonHello);
        
        buttonHello.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                 Intent intent =
                         new Intent(MainActivity.this, FrmHello.class);

                 Bundle b = new Bundle();
                 b.putString("NAME", textName.getText().toString());

                 intent.putExtras(b);

                 startActivity(intent);
            }
       });
    }
 
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.activity_main, menu);
        return true;
    }
}
