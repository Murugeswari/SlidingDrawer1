package com.example.slidingdrawertest1;


import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.SlidingDrawer;
import android.widget.SlidingDrawer.OnDrawerCloseListener;
import android.widget.SlidingDrawer.OnDrawerOpenListener;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity<context> extends Activity {
public SlidingDrawer Drawer;
public Button clickme,Handle;
public TextView text;
public Context context;

@Override
protected void onCreate(Bundle savedInstanceState) {
super.onCreate(savedInstanceState);
setContentView(R.layout.activity_main);
context=this.getApplicationContext();

Handle  = (Button)        findViewById(R.id.handle);
clickme = (Button)        findViewById(R.id.Click);
Drawer  = (SlidingDrawer) findViewById(R.id.slidingDrawer1);
text    = (TextView)      findViewById(R.id.text1);

Drawer.setOnDrawerOpenListener(new OnDrawerOpenListener() {

@Override
public void onDrawerOpened() {
// TODO Auto-generated method stub

}
});

Drawer.setOnDrawerCloseListener(new OnDrawerCloseListener() {

@Override
public void onDrawerClosed() {
// TODO Auto-generated method stub

}
});

clickme.setOnClickListener(new OnClickListener() {

@Override
public void onClick(View v) {
Toast.makeText(context, "This button is Clicked", Toast.LENGTH_LONG).show();
// TODO Auto-generated method stub

}
});
}



@Override
public boolean onCreateOptionsMenu(Menu menu) {
// Inflate the menu; this adds items to the action bar if it is present.
getMenuInflater().inflate(R.menu.main, menu);
return true;
}

@Override
public boolean onOptionsItemSelected(MenuItem item) {
// Handle action bar item clicks here. The action bar will
// automatically handle clicks on the Home/Up button, so long
// as you specify a parent activity in AndroidManifest.xml.
int id = item.getItemId();
if (id == R.id.action_settings) {
return true;
}
return super.onOptionsItemSelected(item);
}
}


