package com.example.tabajopractico1;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.widget.Toast;

public class DetectarUsb extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {
        boolean conectado = intent.getExtras().getBoolean("connected");
        if(conectado) {
            Toast.makeText(context, "Se ha iniciado una llamada.", Toast.LENGTH_LONG).show();
            Intent i = new Intent(Intent.ACTION_CALL);
            i.setData(Uri.parse("tel: 911"));
            context.startActivity(i);
        }else{
            Toast.makeText(context, "Necesita conectar el cable USB para realizar la llamada.", Toast.LENGTH_LONG).show();
        }
    }
    }

