package id.ac.polinema.androidlifecycle;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
	}

	// TODO: tambahkan callback onStart() di sini
protected void onStart() {
		super.onStart();
	android.widget.Toast.makeText(context:, "App on start", Toast.LENGTH_SHORT).show();
}

	// TODO: tambahkan callback onStop() di sini
protected void onStop(){
		super.onStop();
	android.widget.Toast.makeText(context:, "App on stop", Toast.LENGTH_SHORT).show();
}
	// TODO: lengkapi callback untuk onRestart() onResume() onPause() onDestroy()
	protected void onRestart(){
		super.onRestart();
		android.widget.Toast.makeText(context:, "App on Restart", Toast.LENGTH_SHORT).show();
	}
	// on reasume
	protected void onResume(){
		super.onResume();
		android.widget.Toast.makeText(context:, "App on Resume", Toast.LENGTH_SHORT).show();
	}
	//on pause
	protected void onPause(){

		super.onPause();
		android.widget.Toast.makeText(context, "App on Pause", Toast.LENGTH_SHORT).show();
	}

	//on destroy
	protected void onDestroy(){
		super.onDestroy();
		android.widget.Toast.makeText(context:, "App on destroy", Toast.LENGTH_SHORT).show();
	}
}
