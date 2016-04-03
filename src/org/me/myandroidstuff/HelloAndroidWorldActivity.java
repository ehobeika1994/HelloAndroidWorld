package org.me.myandroidstuff;

import android.os.Bundle;
import android.app.Activity;
import android.graphics.Typeface;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;


public class HelloAndroidWorldActivity extends Activity implements OnClickListener
{
	private Button exitButton;
	private View mainView;
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) 
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        exitButton = (Button)findViewById(R.id.exit_button);
        mainView = (View)findViewById(R.id.mainView);
        mainView.setBackgroundColor(getResources().getColor(R.color.silver));
        
        TextView tbox1 = (TextView)findViewById(R.id.textBox1);
        tbox1.setTypeface(Typeface.SANS_SERIF);
        tbox1.setTypeface(Typeface.MONOSPACE);
        
        // Just check that button was returned correctly
        if (exitButton == null)
        {
        	Toast.makeText(this,"Null pointer ",Toast.LENGTH_LONG).show();
        }
        else
        {
        	Toast.makeText(this,"All ok ",Toast.LENGTH_SHORT).show();
        	// Attach the Listener
        	exitButton.setOnClickListener(this);
        }
    }
    
    /** Called when a button is clicked*/
    public void onClick(View v) 
    {
    	// Exit the application    	
    	finish();
    }
}// End of class



