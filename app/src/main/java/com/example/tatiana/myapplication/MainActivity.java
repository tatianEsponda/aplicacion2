package com.example.tatiana.myapplication;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;





    public class MainActivity extends AppCompatActivity {

        String className;
        @Override


        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);
            className=getApplication().getClass().toString();
        }

        @Override
        protected void onStart() {
            super.onStart();
            Toast.makeText(this,"onStart "+className, Toast.LENGTH_LONG).show();
        }

        @Override
        protected void onResume() {
            super.onResume();
            Toast.makeText(this,"onResume "+className, Toast.LENGTH_LONG).show();
        }

        @Override
        protected void onPause() {
            super.onPause();
            Toast.makeText(this,"onPause "+className, Toast.LENGTH_LONG).show();
        }

        @Override
        protected void onDestroy() {
            super.onDestroy();
            Toast.makeText(this,"onDestroy "+className, Toast.LENGTH_LONG).show();
        }



        public void alerta(final View b) {
            AlertDialog.Builder myBuild = new AlertDialog.Builder(this);
            myBuild.setMessage("Deseas salir de la APP");
            myBuild.setTitle("Titulo de prueba");
            myBuild.setPositiveButton("Si", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {
                    finish();
                }
            });
            myBuild.setNegativeButton("No", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {
                    aceptar();
                    //irHome();
                }
            });
            AlertDialog dialog = myBuild.create();
            dialog.show();
        }
        public void aceptar(){
            Intent ir = new Intent(MainActivity.this,Home.class);
            startActivity(ir.addFlags(ir.FLAG_ACTIVITY_CLEAR_TOP | ir.FLAG_ACTIVITY_CLEAR_TASK));
        }



        //Metodo para ir de mainActivity a Home activity
        //View b recibe este objeto porque recibe la orden de la interfaz
        public void irHome(View b){
            //Linea para mensajes similar al show.messageDialoge de java
            Toast.makeText(this,"Hola Metodo soy royer y modifiqué este cuento ", Toast.LENGTH_LONG).show();
            //donde estoy para donde voy
            Intent ir = new Intent(MainActivity.this,Home.class);
            startActivity(ir.addFlags(ir.FLAG_ACTIVITY_CLEAR_TOP | ir.FLAG_ACTIVITY_CLEAR_TASK));


        }
    }
