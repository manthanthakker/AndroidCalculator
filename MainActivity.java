package com.ost.calculator1;


import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;


public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
    public void add(View v)
    {	
    	EditText e=(EditText)findViewById(R.id.editText1);
    	EditText f=(EditText)findViewById(R.id.editText2);
    	int n1=Integer.parseInt(e.getText().toString());
    	int n2=Integer.parseInt(f.getText().toString());
    	TextView t=(TextView)findViewById(R.id.textView1);
    	t.setText(""+(n1+n2));
    	
    	
    	
    }
    public void sub(View v)
    {	
    	EditText e=(EditText)findViewById(R.id.editText1);
    	EditText f=(EditText)findViewById(R.id.editText2);
    	int n1=Integer.parseInt(e.getText().toString());
    	int n2=Integer.parseInt(f.getText().toString());
    	TextView t=(TextView)findViewById(R.id.textView1);
    	t.setText(""+(n1-n2));
    	
    	
    	
    }
    public void mul(View v)
    {	
    	EditText e=(EditText)findViewById(R.id.editText1);
    	EditText f=(EditText)findViewById(R.id.editText2);
    	int n1=Integer.parseInt(e.getText().toString());
    	int n2=Integer.parseInt(f.getText().toString());
    	TextView t=(TextView)findViewById(R.id.textView1);
    	t.setText(""+(n1*n2));
    	
    	
    	
    }
    public void div(View v)
    {	
    	EditText e=(EditText)findViewById(R.id.editText1);
    	EditText f=(EditText)findViewById(R.id.editText2);
    	int n1=Integer.parseInt(e.getText().toString());
    	int n2=Integer.parseInt(f.getText().toString());
    	TextView t=(TextView)findViewById(R.id.textView1);
    	t.setText(""+(n1/n2));
    	
    	
    	
    }
    public void cosine(View v)
    {	
    	EditText e=(EditText)findViewById(R.id.editText1);
    
    	int n1=Integer.parseInt(e.getText().toString());
   
    	TextView t=(TextView)findViewById(R.id.textView1);
    	t.setText(""+Math.cos(n1));
    	
    	
    	
    	
    }
    public void sine(View v)
    {	
    	EditText e=(EditText)findViewById(R.id.editText1);
    
    	int n1=Integer.parseInt(e.getText().toString());
   
    	TextView t=(TextView)findViewById(R.id.textView1);
    	t.setText(""+Math.sin(n1));
    	
    	
    	
    	
    }
    public void tan(View v)
    {	
    	EditText e=(EditText)findViewById(R.id.editText1);
    
    	int n1=Integer.parseInt(e.getText().toString());
   
    	TextView t=(TextView)findViewById(R.id.textView1);
    	t.setText(""+Math.tan(n1));
    	
    	
    	
    	
    }
    public void cot(View v)
    {	
    	EditText e=(EditText)findViewById(R.id.editText1);
    
    	int n1=Integer.parseInt(e.getText().toString());
   
    	TextView t=(TextView)findViewById(R.id.textView1);
    	t.setText(""+(1/(Math.tan(n1))));
    	
    	
    	
    	
    }
    public void square(View v)
    {	
    	EditText e=(EditText)findViewById(R.id.editText1);
    
    	int n1=Integer.parseInt(e.getText().toString());
   
    	TextView t=(TextView)findViewById(R.id.textView1);
    	t.setText(""+(n1*n1));
    	
    	
    	
    	
    }
    public void cube(View v)
    {	
    	EditText e=(EditText)findViewById(R.id.editText1);
    
    	int n1=Integer.parseInt(e.getText().toString());
   
    	TextView t=(TextView)findViewById(R.id.textView1);
    	t.setText(""+(n1*n1*n1));
    	
    	
    	
    	
    }
    public void squareroot(View v)
    {	
    	EditText e=(EditText)findViewById(R.id.editText1);
    
    	int n1=Integer.parseInt(e.getText().toString());
   
    	TextView t=(TextView)findViewById(R.id.textView1);
    	t.setText(""+(Math.pow(n1, 0.5)));
    	
    	
    	
    	
    }
    public void cuberoot(View v)
    {	
    	EditText e=(EditText)findViewById(R.id.editText1);
    
    	int n1=Integer.parseInt(e.getText().toString());
   
    	TextView t=(TextView)findViewById(R.id.textView1);
    	t.setText(""+(Math.pow(n1, (1/3))));
    	
    	
    	
    	
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
