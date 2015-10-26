package com.facebook_login.diegoramirez.camara;

import android.app.Activity;
import android.app.Fragment;
import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;

/**
 * Created by Diego Ramirez on 0/08/2015.
 */
public class FragmentoCamara extends Fragment {

    Button btn;
    ImageView foto;
    Intent i;
    Bitmap bm;
    final static int constante = 0;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        //return super.onCreateView(inflater, container, savedInstanceState);
         /*i = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
        startActivityForResult(i, constante);*/
      View   view =     inflater.inflate(R.layout.fragmento_camara,container,false);
        btn = (Button) view.findViewById(R.id.btn);
        foto = (ImageView) view.findViewById(R.id.foto);

            btn.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    TomarFoto();
                }
            });


        return view;

    }

    public void TomarFoto()
    {

        i = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
        startActivityForResult(i, constante);



    }


    @Override
    public void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        if (resultCode == Activity.RESULT_OK)
        {
            Bundle extra = data.getExtras();
            bm = (Bitmap)extra.get("data");
            foto.setImageBitmap(bm);
        }

    }




    }

