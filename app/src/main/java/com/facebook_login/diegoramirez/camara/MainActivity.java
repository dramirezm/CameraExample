package com.facebook_login.diegoramirez.camara;

import android.app.Activity;

import android.app.FragmentTransaction;
import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Environment;
import android.app.Fragment;
import android.provider.MediaStore;

import android.support.v4.app.FragmentManager;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.io.File;


public class MainActivity extends ActionBarActivity {
   /* Button btn;
    ImageView foto;
    Intent i;
    Bitmap bm;
*/
   //private final String ruta_fotos = Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_PICTURES) + "/misfotos/";
     //    private File file = new File(ruta_fotos);
       //  private Button boton;
    final static int constante = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        //file.mkdirs();

       /*¡¡btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TomarFoto();
            }
        });

    }

    public void TomarFoto()
    {

        i = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
        startActivityForResult(i, constante);



    }


    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        if (resultCode == Activity.RESULT_OK)
        {
            Bundle extra = data.getExtras();
            bm = (Bitmap)extra.get("data");
            foto.setImageBitmap(bm);
        }

    }
*/
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
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
}
