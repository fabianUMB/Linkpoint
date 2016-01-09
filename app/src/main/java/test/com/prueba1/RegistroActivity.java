package test.com.prueba1;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;


public class RegistroActivity extends ActionBarActivity {

    /*variables que capturan los textos*/
    EditText name, mail, pass;

    /*variables que muestran los textos*/
    TextView nm1, ml1, ps1;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registro);


 /* Cuadros de texto que solicitan los datos */
        name = (EditText)findViewById(R.id.editText3);
        mail = (EditText)findViewById(R.id.editText4);
        pass = (EditText)findViewById(R.id.editText5);


        /* textViews que muestran lo ingresado por el usuario */
        nm1 = (TextView)findViewById(R.id.txtName1);
        ml1 = (TextView)findViewById(R.id.txtMail1);
        ps1 = (TextView)findViewById(R.id.txtPass1);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_registro, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }


    public void getContent (View view) {



        String nom1 = name.getText().toString();
        String mail1 = mail.getText().toString();
        String pass1 = pass.getText().toString();

        Intent intent = new Intent(this, AcceptActivity.class);
        intent.putExtra("nombre", nom1);
        intent.putExtra("email", mail1);
        intent.putExtra("contrasena", pass1);

        startActivity(intent);

    }

}
