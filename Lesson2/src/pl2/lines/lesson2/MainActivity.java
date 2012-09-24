package pl2.lines.lesson2;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.CompoundButton.OnCheckedChangeListener;
import android.widget.RadioButton;

public class MainActivity extends Activity implements OnClickListener, OnCheckedChangeListener{

	private Button button;
	private CheckBox checkbox;
	private RadioButton radiobutton;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button = (Button)findViewById(R.id.button);
        checkbox = (CheckBox)findViewById(R.id.checkbox);
        radiobutton = (RadioButton)findViewById(R.id.radio);
        
        button.setOnClickListener(this);
        checkbox.setOnCheckedChangeListener(this);
        radiobutton.setOnCheckedChangeListener(this);
    }

	@Override
	public void onClick(View view) {
		switch(view.getId()){
			case R.id.button:
				Log.d("onClick()", "button was clicked!");
				break;			
		}
		
	}

	@Override
	public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
		switch(buttonView.getId()){
			case R.id.checkbox:
				if(isChecked)
					Log.d("onCheckedChanged()", "checkbox is checked");
				else
					Log.d("onCheckedChanged()", "checkbox is unchecked");
				break;
			
			case R.id.radio:
				if(isChecked)
					Log.d("onCheckedChanged()", "radiobutton is checked");
				else
					Log.d("onCheckedChanged()", "radiobutton is unchecked");
				break;
		}
		
	}
}
