package mx.edu.ittepic.tpdm_u4_practica2_juegogato_pabloarturocrespoduran;

import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button uno,dos,tres,cuatro,cinco,seis,siete,ocho,nueve;
    int un=0,doss=0,tre=0,cua=0,cin=0,sei=0,sie=0,och=0,nue=0;
    Boolean turno=true;
    Thread hilo1,hilo2,hilo3,hilo4,hilo5,hilo6,hilo7,hilo8,hilo9;
    TextView textoTurno;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        uno = findViewById(R.id.uno);
        dos = findViewById(R.id.dos);
        tres = findViewById(R.id.tres);
        cuatro = findViewById(R.id.cuatro);
        cinco = findViewById(R.id.cinco);
        seis = findViewById(R.id.seis);
        siete = findViewById(R.id.siete);
        ocho = findViewById(R.id.ocho);
        nueve = findViewById(R.id.nueve);
        textoTurno = findViewById(R.id.turno);


        //**************INICIA HILO 1 ****************
        hilo1 = new Thread(){
            public void run() {
                runOnUiThread(new Runnable() {
                    @Override
                    public void run() {
                        try {
                            sleep(500);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }

                        int colocar=0;

                        //*************DEFIENDE HORIZONTAL************
                        if(un==1&&tre==1&&doss==0){
                            dos.setBackgroundResource(R.drawable.x);
                            dos.setEnabled(false);
                            doss=2;
                            textoTurno.setText("ES TU TURNO");
                            colocar=1;
                        }
                        if(cua==1&&sei==1&&cin==0){
                            cinco.setBackgroundResource(R.drawable.x);
                            cinco.setEnabled(false);
                            cin=2;
                            textoTurno.setText("ES TU TURNO");
                            colocar=1;
                        }
                        if(sei==1&&nue==1&&och==0){
                            siete.setBackgroundResource(R.drawable.x);
                            siete.setEnabled(false);
                            sie=2;
                            textoTurno.setText("ES TU TURNO");
                            colocar=1;
                        }
                        //*************DEFIENDE VERTICAL************
                        if(un==1&&sie==1&&cua==0){
                            cuatro.setBackgroundResource(R.drawable.x);
                            cuatro.setEnabled(false);
                            cua=2;
                            textoTurno.setText("ES TU TURNO");
                            colocar=1;
                        }
                        if(doss==1&&och==1&&cin==0){
                            cinco.setBackgroundResource(R.drawable.x);
                            cinco.setEnabled(false);
                            cin=2;
                            textoTurno.setText("ES TU TURNO");
                            colocar=1;
                        }
                        if(tre==1&&nue==1&&sei==0){
                            cuatro.setBackgroundResource(R.drawable.x);
                            cuatro.setEnabled(false);
                            cua=2;
                            textoTurno.setText("ES TU TURNO");
                            colocar=1;
                        }
                        //*************DEFIENDE DIAGONAL************
                        if(un==1&&nue==1&&cin==0){
                            cinco.setBackgroundResource(R.drawable.x);
                            cinco.setEnabled(false);
                            cin=2;
                            textoTurno.setText("ES TU TURNO");
                            colocar=1;
                        }
                        if(tre==1&&sie==1&&cin==0){
                            cinco.setBackgroundResource(R.drawable.x);
                            cinco.setEnabled(false);
                            cin=2;
                            textoTurno.setText("ES TU TURNO");
                            colocar=1;
                        }
                        //********VERIFICA SI GANAMOS************
                        if((un==2&&doss==2&&tre==2)||(cua==2&&cin==2&&sei==2)||(sie==2&&och==2&&nue==2)||(un==2&&cua==2&&och==2)||(doss==2&&cin==2&&och==2)||(tre==2&&sei==2&&nue==2)||(un==2&&cin==2&&nue==2)||(tre==2&&cin==2&&sie==2)){
                            AlertDialog.Builder alerta = new AlertDialog.Builder(MainActivity.this);
                            alerta.setTitle("HAS GANADO")
                                    .setMessage("Felicidades has ganada contra CPU")
                                    .setPositiveButton("ACEPTAR", new DialogInterface.OnClickListener() {
                                        @Override
                                        public void onClick(DialogInterface dialogInterface, int i) {

                                        }
                                    })
                                    .show();

                        }


                        if(colocar==0){
                            //*************ATACA HORIZONTAL************
                            if(un==2&&tre==2&&doss==0){
                                dos.setBackgroundResource(R.drawable.x);
                                dos.setEnabled(false);
                                doss=2;
                                textoTurno.setText("ES TU TURNO");
                                colocar=1;
                            }
                            if(cua==2&&sei==2&&cin==0){
                                cinco.setBackgroundResource(R.drawable.x);
                                cinco.setEnabled(false);
                                cin=2;
                                textoTurno.setText("ES TU TURNO");
                                colocar=1;
                            }
                            if(sei==2&&nue==2&&och==0){
                                siete.setBackgroundResource(R.drawable.x);
                                siete.setEnabled(false);
                                sie=2;
                                textoTurno.setText("ES TU TURNO");
                                colocar=1;
                            }
                            //*************ATACA VERTICAL************
                            if(un==2&&sie==2&&cua==0){
                                cuatro.setBackgroundResource(R.drawable.x);
                                cuatro.setEnabled(false);
                                cua=2;
                                textoTurno.setText("ES TU TURNO");
                                colocar=1;
                            }
                            if(doss==2&&och==2&&cin==0){
                                cinco.setBackgroundResource(R.drawable.x);
                                cinco.setEnabled(false);
                                cin=2;
                                textoTurno.setText("ES TU TURNO");
                                colocar=1;
                            }
                            if(tre==2&&nue==2&&sei==0){
                                cuatro.setBackgroundResource(R.drawable.x);
                                cuatro.setEnabled(false);
                                cua=2;
                                textoTurno.setText("ES TU TURNO");
                                colocar=1;
                            }
                            //*************ATACA DIAGONAL************
                            if(un==2&&nue==2&&cin==0){
                                cinco.setBackgroundResource(R.drawable.x);
                                cinco.setEnabled(false);
                                cin=2;
                                textoTurno.setText("ES TU TURNO");
                                colocar=1;
                            }
                            if(tre==2&&sie==2&&cin==0){
                                cinco.setBackgroundResource(R.drawable.x);
                                cinco.setEnabled(false);
                                cin=2;
                                textoTurno.setText("ES TU TURNO");
                                colocar=1;
                            }

                        }

                        //*********** SE DUERME *****************
                        try {
                            sleep(500);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }

                        if(colocar==0){
                            //***********PRIMER GOLPE **************
                            if(cin==0){
                                cinco.setBackgroundResource(R.drawable.x);
                                cinco.setEnabled(false);
                                cin=2;
                                textoTurno.setText("ES TU TURNO");
                                colocar=1;
                            }else if(cin==1&&un==0){
                                uno.setBackgroundResource(R.drawable.x);
                                uno.setEnabled(false);
                                un=2;
                                textoTurno.setText("ES TU TURNO");
                                colocar=1;
                            }else if(cin==1&&doss==0){
                                dos.setBackgroundResource(R.drawable.x);
                                dos.setEnabled(false);
                                doss=2;
                                textoTurno.setText("ES TU TURNO");
                                colocar=1;
                            }else if(cin==1&&tre==0){
                                tres.setBackgroundResource(R.drawable.x);
                                tres.setEnabled(false);
                                tre=2;
                                textoTurno.setText("ES TU TURNO");
                                colocar=1;
                            }else if(cin==1&&cua==0){
                                cuatro.setBackgroundResource(R.drawable.x);
                                cuatro.setEnabled(false);
                                cua=2;
                                textoTurno.setText("ES TU TURNO");
                                colocar=1;
                            }else if(cin==1&&cin==0){
                                cinco.setBackgroundResource(R.drawable.x);
                                cinco.setEnabled(false);
                                cin=2;
                                textoTurno.setText("ES TU TURNO");
                                colocar=1;
                            }else if(cin==1&&sei==0){
                                seis.setBackgroundResource(R.drawable.x);
                                seis.setEnabled(false);
                                sei=2;
                                textoTurno.setText("ES TU TURNO");
                                colocar=1;
                            } else if(cin==1&&sie==0){
                                siete.setBackgroundResource(R.drawable.x);
                                siete.setEnabled(false);
                                sie=2;
                                textoTurno.setText("ES TU TURNO");
                                colocar=1;
                            }else if(cin==1&&och==0){
                                ocho.setBackgroundResource(R.drawable.x);
                                ocho.setEnabled(false);
                                och=2;
                                textoTurno.setText("ES TU TURNO");
                                colocar=1;
                            }else if(cin==1&&nue==0){
                                nueve.setBackgroundResource(R.drawable.x);
                                nueve.setEnabled(false);
                                nue=2;
                                textoTurno.setText("ES TU TURNO");
                                colocar=1;
                            }
                            //********VERIFICA SI GANAMOS************
                            if((un==2&&doss==2&&tre==2)||(cua==2&&cin==2&&sei==2)||(sie==2&&och==2&&nue==2)||(un==2&&cua==2&&och==2)||(doss==2&&cin==2&&och==2)||(tre==2&&sei==2&&nue==2)||(un==2&&cin==2&&nue==2)||(tre==2&&cin==2&&sie==2)){
                                AlertDialog.Builder alerta = new AlertDialog.Builder(MainActivity.this);
                                alerta.setTitle("HAS GANADO")
                                        .setMessage("Felicidades has ganada contra CPU")
                                        .setPositiveButton("ACEPTAR", new DialogInterface.OnClickListener() {
                                            @Override
                                            public void onClick(DialogInterface dialogInterface, int i) {

                                            }
                                        })
                                        .show();

                            }
                        }

                        //***********SEGUNDO GOLPE **************
                        if(cin==0){
                            cinco.setBackgroundResource(R.drawable.x);
                            cinco.setEnabled(false);
                            cin=2;
                            textoTurno.setText("ES TU TURNO");
                        }else if(cin==1&&un==0){
                            uno.setBackgroundResource(R.drawable.x);
                            uno.setEnabled(false);
                            un=2;
                            textoTurno.setText("ES TU TURNO");
                        }else if(cin==1&&doss==0){
                            dos.setBackgroundResource(R.drawable.x);
                            dos.setEnabled(false);
                            doss=2;
                            textoTurno.setText("ES TU TURNO");
                        }else if(cin==1&&tre==0){
                            tres.setBackgroundResource(R.drawable.x);
                            tres.setEnabled(false);
                            tre=2;
                            textoTurno.setText("ES TU TURNO");
                        }else if(cin==1&&cua==0){
                            cuatro.setBackgroundResource(R.drawable.x);
                            cuatro.setEnabled(false);
                            cua=2;
                            textoTurno.setText("ES TU TURNO");
                        }else if(cin==1&&cin==0){
                            cinco.setBackgroundResource(R.drawable.x);
                            cinco.setEnabled(false);
                            cin=2;
                            textoTurno.setText("ES TU TURNO");
                        }else if(cin==1&&sei==0){
                            seis.setBackgroundResource(R.drawable.x);
                            seis.setEnabled(false);
                            sei=2;
                            textoTurno.setText("ES TU TURNO");
                        } else if(cin==1&&sie==0){
                            siete.setBackgroundResource(R.drawable.x);
                            siete.setEnabled(false);
                            sie=2;
                            textoTurno.setText("ES TU TURNO");
                        }else if(cin==1&&och==0){
                            ocho.setBackgroundResource(R.drawable.x);
                            ocho.setEnabled(false);
                            och=2;
                            textoTurno.setText("ES TU TURNO");
                        }else if(cin==1&&nue==0){
                            nueve.setBackgroundResource(R.drawable.x);
                            nueve.setEnabled(false);
                            nue=2;
                            textoTurno.setText("ES TU TURNO");
                        }
                        //********VERIFICA SI GANAMOS************
                        if((un==2&&doss==2&&tre==2)||(cua==2&&cin==2&&sei==2)||(sie==2&&och==2&&nue==2)||(un==2&&cua==2&&och==2)||(doss==2&&cin==2&&och==2)||(tre==2&&sei==2&&nue==2)||(un==2&&cin==2&&nue==2)||(tre==2&&cin==2&&sie==2)){
                            AlertDialog.Builder alerta = new AlertDialog.Builder(MainActivity.this);
                            alerta.setTitle("HAS GANADO")
                                    .setMessage("Felicidades has ganada contra CPU")
                                    .setPositiveButton("ACEPTAR", new DialogInterface.OnClickListener() {
                                        @Override
                                        public void onClick(DialogInterface dialogInterface, int i) {

                                        }
                                    })
                                    .show();
                        }
                    }
                });
            }
        };
        //**************TERMINA HILO 1 ****************

        //**************INICIA HILO 2 ****************
        hilo2 = new Thread(){
            public void run() {
                runOnUiThread(new Runnable() {
                    @Override
                    public void run() {
                        try {
                            sleep(500);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }

                        int colocar=0;

                        //*************DEFIENDE HORIZONTAL************
                        if(un==1&&tre==1&&doss==0){
                            dos.setBackgroundResource(R.drawable.x);
                            dos.setEnabled(false);
                            doss=2;
                            textoTurno.setText("ES TU TURNO");
                            colocar=1;
                        }
                        if(cua==1&&sei==1&&cin==0){
                            cinco.setBackgroundResource(R.drawable.x);
                            cinco.setEnabled(false);
                            cin=2;
                            textoTurno.setText("ES TU TURNO");
                            colocar=1;
                        }
                        if(sei==1&&nue==1&&och==0){
                            siete.setBackgroundResource(R.drawable.x);
                            siete.setEnabled(false);
                            sie=2;
                            textoTurno.setText("ES TU TURNO");
                            colocar=1;
                        }
                        //*************DEFIENDE VERTICAL************
                        if(un==1&&sie==1&&cua==0){
                            cuatro.setBackgroundResource(R.drawable.x);
                            cuatro.setEnabled(false);
                            cua=2;
                            textoTurno.setText("ES TU TURNO");
                            colocar=1;
                        }
                        if(doss==1&&och==1&&cin==0){
                            cinco.setBackgroundResource(R.drawable.x);
                            cinco.setEnabled(false);
                            cin=2;
                            textoTurno.setText("ES TU TURNO");
                            colocar=1;
                        }
                        if(tre==1&&nue==1&&sei==0){
                            cuatro.setBackgroundResource(R.drawable.x);
                            cuatro.setEnabled(false);
                            cua=2;
                            textoTurno.setText("ES TU TURNO");
                            colocar=1;
                        }
                        //*************DEFIENDE DIAGONAL************
                        if(un==1&&nue==1&&cin==0){
                            cinco.setBackgroundResource(R.drawable.x);
                            cinco.setEnabled(false);
                            cin=2;
                            textoTurno.setText("ES TU TURNO");
                            colocar=1;
                        }
                        if(tre==1&&sie==1&&cin==0){
                            cinco.setBackgroundResource(R.drawable.x);
                            cinco.setEnabled(false);
                            cin=2;
                            textoTurno.setText("ES TU TURNO");
                            colocar=1;
                        }
                        //********VERIFICA SI GANAMOS************
                        if((un==2&&doss==2&&tre==2)||(cua==2&&cin==2&&sei==2)||(sie==2&&och==2&&nue==2)||(un==2&&cua==2&&och==2)||(doss==2&&cin==2&&och==2)||(tre==2&&sei==2&&nue==2)||(un==2&&cin==2&&nue==2)||(tre==2&&cin==2&&sie==2)){
                            AlertDialog.Builder alerta = new AlertDialog.Builder(MainActivity.this);
                            alerta.setTitle("HAS GANADO")
                                    .setMessage("Felicidades has ganada contra CPU")
                                    .setPositiveButton("ACEPTAR", new DialogInterface.OnClickListener() {
                                        @Override
                                        public void onClick(DialogInterface dialogInterface, int i) {

                                        }
                                    })
                                    .show();

                        }


                        if(colocar==0){
                            //*************ATACA HORIZONTAL************
                            if(un==2&&tre==2&&doss==0){
                                dos.setBackgroundResource(R.drawable.x);
                                dos.setEnabled(false);
                                doss=2;
                                textoTurno.setText("ES TU TURNO");
                                colocar=1;
                            }
                            if(cua==2&&sei==2&&cin==0){
                                cinco.setBackgroundResource(R.drawable.x);
                                cinco.setEnabled(false);
                                cin=2;
                                textoTurno.setText("ES TU TURNO");
                                colocar=1;
                            }
                            if(sei==2&&nue==2&&och==0){
                                siete.setBackgroundResource(R.drawable.x);
                                siete.setEnabled(false);
                                sie=2;
                                textoTurno.setText("ES TU TURNO");
                                colocar=1;
                            }
                            //*************ATACA VERTICAL************
                            if(un==2&&sie==2&&cua==0){
                                cuatro.setBackgroundResource(R.drawable.x);
                                cuatro.setEnabled(false);
                                cua=2;
                                textoTurno.setText("ES TU TURNO");
                                colocar=1;
                            }
                            if(doss==2&&och==2&&cin==0){
                                cinco.setBackgroundResource(R.drawable.x);
                                cinco.setEnabled(false);
                                cin=2;
                                textoTurno.setText("ES TU TURNO");
                                colocar=1;
                            }
                            if(tre==2&&nue==2&&sei==0){
                                cuatro.setBackgroundResource(R.drawable.x);
                                cuatro.setEnabled(false);
                                cua=2;
                                textoTurno.setText("ES TU TURNO");
                                colocar=1;
                            }
                            //*************ATACA DIAGONAL************
                            if(un==2&&nue==2&&cin==0){
                                cinco.setBackgroundResource(R.drawable.x);
                                cinco.setEnabled(false);
                                cin=2;
                                textoTurno.setText("ES TU TURNO");
                                colocar=1;
                            }
                            if(tre==2&&sie==2&&cin==0){
                                cinco.setBackgroundResource(R.drawable.x);
                                cinco.setEnabled(false);
                                cin=2;
                                textoTurno.setText("ES TU TURNO");
                                colocar=1;
                            }

                        }

                        //*********** SE DUERME *****************
                        try {
                            sleep(500);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }

                        if(colocar==0){
                            //***********PRIMER GOLPE **************
                            if(cin==0){
                                cinco.setBackgroundResource(R.drawable.x);
                                cinco.setEnabled(false);
                                cin=2;
                                textoTurno.setText("ES TU TURNO");
                                colocar=1;
                            }else if(cin==1&&un==0){
                                uno.setBackgroundResource(R.drawable.x);
                                uno.setEnabled(false);
                                un=2;
                                textoTurno.setText("ES TU TURNO");
                                colocar=1;
                            }else if(cin==1&&doss==0){
                                dos.setBackgroundResource(R.drawable.x);
                                dos.setEnabled(false);
                                doss=2;
                                textoTurno.setText("ES TU TURNO");
                                colocar=1;
                            }else if(cin==1&&tre==0){
                                tres.setBackgroundResource(R.drawable.x);
                                tres.setEnabled(false);
                                tre=2;
                                textoTurno.setText("ES TU TURNO");
                                colocar=1;
                            }else if(cin==1&&cua==0){
                                cuatro.setBackgroundResource(R.drawable.x);
                                cuatro.setEnabled(false);
                                cua=2;
                                textoTurno.setText("ES TU TURNO");
                                colocar=1;
                            }else if(cin==1&&cin==0){
                                cinco.setBackgroundResource(R.drawable.x);
                                cinco.setEnabled(false);
                                cin=2;
                                textoTurno.setText("ES TU TURNO");
                                colocar=1;
                            }else if(cin==1&&sei==0){
                                seis.setBackgroundResource(R.drawable.x);
                                seis.setEnabled(false);
                                sei=2;
                                textoTurno.setText("ES TU TURNO");
                                colocar=1;
                            } else if(cin==1&&sie==0){
                                siete.setBackgroundResource(R.drawable.x);
                                siete.setEnabled(false);
                                sie=2;
                                textoTurno.setText("ES TU TURNO");
                                colocar=1;
                            }else if(cin==1&&och==0){
                                ocho.setBackgroundResource(R.drawable.x);
                                ocho.setEnabled(false);
                                och=2;
                                textoTurno.setText("ES TU TURNO");
                                colocar=1;
                            }else if(cin==1&&nue==0){
                                nueve.setBackgroundResource(R.drawable.x);
                                nueve.setEnabled(false);
                                nue=2;
                                textoTurno.setText("ES TU TURNO");
                                colocar=1;
                            }
                            //********VERIFICA SI GANAMOS************
                            if((un==2&&doss==2&&tre==2)||(cua==2&&cin==2&&sei==2)||(sie==2&&och==2&&nue==2)||(un==2&&cua==2&&och==2)||(doss==2&&cin==2&&och==2)||(tre==2&&sei==2&&nue==2)||(un==2&&cin==2&&nue==2)||(tre==2&&cin==2&&sie==2)){
                                AlertDialog.Builder alerta = new AlertDialog.Builder(MainActivity.this);
                                alerta.setTitle("HAS GANADO")
                                        .setMessage("Felicidades has ganada contra CPU")
                                        .setPositiveButton("ACEPTAR", new DialogInterface.OnClickListener() {
                                            @Override
                                            public void onClick(DialogInterface dialogInterface, int i) {

                                            }
                                        })
                                        .show();

                            }
                        }

                        //***********SEGUNDO GOLPE **************
                        if(cin==0){
                            cinco.setBackgroundResource(R.drawable.x);
                            cinco.setEnabled(false);
                            cin=2;
                            textoTurno.setText("ES TU TURNO");
                        }else if(cin==1&&un==0){
                            uno.setBackgroundResource(R.drawable.x);
                            uno.setEnabled(false);
                            un=2;
                            textoTurno.setText("ES TU TURNO");
                        }else if(cin==1&&doss==0){
                            dos.setBackgroundResource(R.drawable.x);
                            dos.setEnabled(false);
                            doss=2;
                            textoTurno.setText("ES TU TURNO");
                        }else if(cin==1&&tre==0){
                            tres.setBackgroundResource(R.drawable.x);
                            tres.setEnabled(false);
                            tre=2;
                            textoTurno.setText("ES TU TURNO");
                        }else if(cin==1&&cua==0){
                            cuatro.setBackgroundResource(R.drawable.x);
                            cuatro.setEnabled(false);
                            cua=2;
                            textoTurno.setText("ES TU TURNO");
                        }else if(cin==1&&cin==0){
                            cinco.setBackgroundResource(R.drawable.x);
                            cinco.setEnabled(false);
                            cin=2;
                            textoTurno.setText("ES TU TURNO");
                        }else if(cin==1&&sei==0){
                            seis.setBackgroundResource(R.drawable.x);
                            seis.setEnabled(false);
                            sei=2;
                            textoTurno.setText("ES TU TURNO");
                        } else if(cin==1&&sie==0){
                            siete.setBackgroundResource(R.drawable.x);
                            siete.setEnabled(false);
                            sie=2;
                            textoTurno.setText("ES TU TURNO");
                        }else if(cin==1&&och==0){
                            ocho.setBackgroundResource(R.drawable.x);
                            ocho.setEnabled(false);
                            och=2;
                            textoTurno.setText("ES TU TURNO");
                        }else if(cin==1&&nue==0){
                            nueve.setBackgroundResource(R.drawable.x);
                            nueve.setEnabled(false);
                            nue=2;
                            textoTurno.setText("ES TU TURNO");
                        }
                        //********VERIFICA SI GANAMOS************
                        if((un==2&&doss==2&&tre==2)||(cua==2&&cin==2&&sei==2)||(sie==2&&och==2&&nue==2)||(un==2&&cua==2&&och==2)||(doss==2&&cin==2&&och==2)||(tre==2&&sei==2&&nue==2)||(un==2&&cin==2&&nue==2)||(tre==2&&cin==2&&sie==2)){
                            AlertDialog.Builder alerta = new AlertDialog.Builder(MainActivity.this);
                            alerta.setTitle("HAS GANADO")
                                    .setMessage("Felicidades has ganada contra CPU")
                                    .setPositiveButton("ACEPTAR", new DialogInterface.OnClickListener() {
                                        @Override
                                        public void onClick(DialogInterface dialogInterface, int i) {

                                        }
                                    })
                                    .show();
                        }
                    }
                });
            }
        };
        //**************TERMINA HILO 2 ****************

        //**************INICIA HILO 3 ****************
        hilo3 = new Thread(){
            public void run() {
                runOnUiThread(new Runnable() {
                    @Override
                    public void run() {
                        try {
                            sleep(500);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }

                        int colocar=0;

                        //*************DEFIENDE HORIZONTAL************
                        if(un==1&&tre==1&&doss==0){
                            dos.setBackgroundResource(R.drawable.x);
                            dos.setEnabled(false);
                            doss=2;
                            textoTurno.setText("ES TU TURNO");
                            colocar=1;
                        }
                        if(cua==1&&sei==1&&cin==0){
                            cinco.setBackgroundResource(R.drawable.x);
                            cinco.setEnabled(false);
                            cin=2;
                            textoTurno.setText("ES TU TURNO");
                            colocar=1;
                        }
                        if(sei==1&&nue==1&&och==0){
                            siete.setBackgroundResource(R.drawable.x);
                            siete.setEnabled(false);
                            sie=2;
                            textoTurno.setText("ES TU TURNO");
                            colocar=1;
                        }
                        //*************DEFIENDE VERTICAL************
                        if(un==1&&sie==1&&cua==0){
                            cuatro.setBackgroundResource(R.drawable.x);
                            cuatro.setEnabled(false);
                            cua=2;
                            textoTurno.setText("ES TU TURNO");
                            colocar=1;
                        }
                        if(doss==1&&och==1&&cin==0){
                            cinco.setBackgroundResource(R.drawable.x);
                            cinco.setEnabled(false);
                            cin=2;
                            textoTurno.setText("ES TU TURNO");
                            colocar=1;
                        }
                        if(tre==1&&nue==1&&sei==0){
                            cuatro.setBackgroundResource(R.drawable.x);
                            cuatro.setEnabled(false);
                            cua=2;
                            textoTurno.setText("ES TU TURNO");
                            colocar=1;
                        }
                        //*************DEFIENDE DIAGONAL************
                        if(un==1&&nue==1&&cin==0){
                            cinco.setBackgroundResource(R.drawable.x);
                            cinco.setEnabled(false);
                            cin=2;
                            textoTurno.setText("ES TU TURNO");
                            colocar=1;
                        }
                        if(tre==1&&sie==1&&cin==0){
                            cinco.setBackgroundResource(R.drawable.x);
                            cinco.setEnabled(false);
                            cin=2;
                            textoTurno.setText("ES TU TURNO");
                            colocar=1;
                        }
                        //********VERIFICA SI GANAMOS************
                        if((un==2&&doss==2&&tre==2)||(cua==2&&cin==2&&sei==2)||(sie==2&&och==2&&nue==2)||(un==2&&cua==2&&och==2)||(doss==2&&cin==2&&och==2)||(tre==2&&sei==2&&nue==2)||(un==2&&cin==2&&nue==2)||(tre==2&&cin==2&&sie==2)){
                            AlertDialog.Builder alerta = new AlertDialog.Builder(MainActivity.this);
                            alerta.setTitle("HAS GANADO")
                                    .setMessage("Felicidades has ganada contra CPU")
                                    .setPositiveButton("ACEPTAR", new DialogInterface.OnClickListener() {
                                        @Override
                                        public void onClick(DialogInterface dialogInterface, int i) {

                                        }
                                    })
                                    .show();

                        }


                        if(colocar==0){
                            //*************ATACA HORIZONTAL************
                            if(un==2&&tre==2&&doss==0){
                                dos.setBackgroundResource(R.drawable.x);
                                dos.setEnabled(false);
                                doss=2;
                                textoTurno.setText("ES TU TURNO");
                                colocar=1;
                            }
                            if(cua==2&&sei==2&&cin==0){
                                cinco.setBackgroundResource(R.drawable.x);
                                cinco.setEnabled(false);
                                cin=2;
                                textoTurno.setText("ES TU TURNO");
                                colocar=1;
                            }
                            if(sei==2&&nue==2&&och==0){
                                siete.setBackgroundResource(R.drawable.x);
                                siete.setEnabled(false);
                                sie=2;
                                textoTurno.setText("ES TU TURNO");
                                colocar=1;
                            }
                            //*************ATACA VERTICAL************
                            if(un==2&&sie==2&&cua==0){
                                cuatro.setBackgroundResource(R.drawable.x);
                                cuatro.setEnabled(false);
                                cua=2;
                                textoTurno.setText("ES TU TURNO");
                                colocar=1;
                            }
                            if(doss==2&&och==2&&cin==0){
                                cinco.setBackgroundResource(R.drawable.x);
                                cinco.setEnabled(false);
                                cin=2;
                                textoTurno.setText("ES TU TURNO");
                                colocar=1;
                            }
                            if(tre==2&&nue==2&&sei==0){
                                cuatro.setBackgroundResource(R.drawable.x);
                                cuatro.setEnabled(false);
                                cua=2;
                                textoTurno.setText("ES TU TURNO");
                                colocar=1;
                            }
                            //*************ATACA DIAGONAL************
                            if(un==2&&nue==2&&cin==0){
                                cinco.setBackgroundResource(R.drawable.x);
                                cinco.setEnabled(false);
                                cin=2;
                                textoTurno.setText("ES TU TURNO");
                                colocar=1;
                            }
                            if(tre==2&&sie==2&&cin==0){
                                cinco.setBackgroundResource(R.drawable.x);
                                cinco.setEnabled(false);
                                cin=2;
                                textoTurno.setText("ES TU TURNO");
                                colocar=1;
                            }

                        }

                        //*********** SE DUERME *****************
                        try {
                            sleep(500);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }

                        if(colocar==0){
                            //***********PRIMER GOLPE **************
                            if(cin==0){
                                cinco.setBackgroundResource(R.drawable.x);
                                cinco.setEnabled(false);
                                cin=2;
                                textoTurno.setText("ES TU TURNO");
                                colocar=1;
                            }else if(cin==1&&un==0){
                                uno.setBackgroundResource(R.drawable.x);
                                uno.setEnabled(false);
                                un=2;
                                textoTurno.setText("ES TU TURNO");
                                colocar=1;
                            }else if(cin==1&&doss==0){
                                dos.setBackgroundResource(R.drawable.x);
                                dos.setEnabled(false);
                                doss=2;
                                textoTurno.setText("ES TU TURNO");
                                colocar=1;
                            }else if(cin==1&&tre==0){
                                tres.setBackgroundResource(R.drawable.x);
                                tres.setEnabled(false);
                                tre=2;
                                textoTurno.setText("ES TU TURNO");
                                colocar=1;
                            }else if(cin==1&&cua==0){
                                cuatro.setBackgroundResource(R.drawable.x);
                                cuatro.setEnabled(false);
                                cua=2;
                                textoTurno.setText("ES TU TURNO");
                                colocar=1;
                            }else if(cin==1&&cin==0){
                                cinco.setBackgroundResource(R.drawable.x);
                                cinco.setEnabled(false);
                                cin=2;
                                textoTurno.setText("ES TU TURNO");
                                colocar=1;
                            }else if(cin==1&&sei==0){
                                seis.setBackgroundResource(R.drawable.x);
                                seis.setEnabled(false);
                                sei=2;
                                textoTurno.setText("ES TU TURNO");
                                colocar=1;
                            } else if(cin==1&&sie==0){
                                siete.setBackgroundResource(R.drawable.x);
                                siete.setEnabled(false);
                                sie=2;
                                textoTurno.setText("ES TU TURNO");
                                colocar=1;
                            }else if(cin==1&&och==0){
                                ocho.setBackgroundResource(R.drawable.x);
                                ocho.setEnabled(false);
                                och=2;
                                textoTurno.setText("ES TU TURNO");
                                colocar=1;
                            }else if(cin==1&&nue==0){
                                nueve.setBackgroundResource(R.drawable.x);
                                nueve.setEnabled(false);
                                nue=2;
                                textoTurno.setText("ES TU TURNO");
                                colocar=1;
                            }
                            //********VERIFICA SI GANAMOS************
                            if((un==2&&doss==2&&tre==2)||(cua==2&&cin==2&&sei==2)||(sie==2&&och==2&&nue==2)||(un==2&&cua==2&&och==2)||(doss==2&&cin==2&&och==2)||(tre==2&&sei==2&&nue==2)||(un==2&&cin==2&&nue==2)||(tre==2&&cin==2&&sie==2)){
                                AlertDialog.Builder alerta = new AlertDialog.Builder(MainActivity.this);
                                alerta.setTitle("HAS GANADO")
                                        .setMessage("Felicidades has ganada contra CPU")
                                        .setPositiveButton("ACEPTAR", new DialogInterface.OnClickListener() {
                                            @Override
                                            public void onClick(DialogInterface dialogInterface, int i) {

                                            }
                                        })
                                        .show();

                            }
                        }

                        //***********SEGUNDO GOLPE **************
                        if(cin==0){
                            cinco.setBackgroundResource(R.drawable.x);
                            cinco.setEnabled(false);
                            cin=2;
                            textoTurno.setText("ES TU TURNO");
                        }else if(cin==1&&un==0){
                            uno.setBackgroundResource(R.drawable.x);
                            uno.setEnabled(false);
                            un=2;
                            textoTurno.setText("ES TU TURNO");
                        }else if(cin==1&&doss==0){
                            dos.setBackgroundResource(R.drawable.x);
                            dos.setEnabled(false);
                            doss=2;
                            textoTurno.setText("ES TU TURNO");
                        }else if(cin==1&&tre==0){
                            tres.setBackgroundResource(R.drawable.x);
                            tres.setEnabled(false);
                            tre=2;
                            textoTurno.setText("ES TU TURNO");
                        }else if(cin==1&&cua==0){
                            cuatro.setBackgroundResource(R.drawable.x);
                            cuatro.setEnabled(false);
                            cua=2;
                            textoTurno.setText("ES TU TURNO");
                        }else if(cin==1&&cin==0){
                            cinco.setBackgroundResource(R.drawable.x);
                            cinco.setEnabled(false);
                            cin=2;
                            textoTurno.setText("ES TU TURNO");
                        }else if(cin==1&&sei==0){
                            seis.setBackgroundResource(R.drawable.x);
                            seis.setEnabled(false);
                            sei=2;
                            textoTurno.setText("ES TU TURNO");
                        } else if(cin==1&&sie==0){
                            siete.setBackgroundResource(R.drawable.x);
                            siete.setEnabled(false);
                            sie=2;
                            textoTurno.setText("ES TU TURNO");
                        }else if(cin==1&&och==0){
                            ocho.setBackgroundResource(R.drawable.x);
                            ocho.setEnabled(false);
                            och=2;
                            textoTurno.setText("ES TU TURNO");
                        }else if(cin==1&&nue==0){
                            nueve.setBackgroundResource(R.drawable.x);
                            nueve.setEnabled(false);
                            nue=2;
                            textoTurno.setText("ES TU TURNO");
                        }
                        //********VERIFICA SI GANAMOS************
                        if((un==2&&doss==2&&tre==2)||(cua==2&&cin==2&&sei==2)||(sie==2&&och==2&&nue==2)||(un==2&&cua==2&&och==2)||(doss==2&&cin==2&&och==2)||(tre==2&&sei==2&&nue==2)||(un==2&&cin==2&&nue==2)||(tre==2&&cin==2&&sie==2)){
                            AlertDialog.Builder alerta = new AlertDialog.Builder(MainActivity.this);
                            alerta.setTitle("HAS GANADO")
                                    .setMessage("Felicidades has ganada contra CPU")
                                    .setPositiveButton("ACEPTAR", new DialogInterface.OnClickListener() {
                                        @Override
                                        public void onClick(DialogInterface dialogInterface, int i) {

                                        }
                                    })
                                    .show();
                        }
                    }
                });
            }
        };
        //**************TERMINA HILO 3 ****************

        //**************INICIA HILO 4 ****************
        hilo4 = new Thread(){
            public void run() {
                runOnUiThread(new Runnable() {
                    @Override
                    public void run() {
                        try {
                            sleep(500);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }

                        int colocar=0;

                        //*************DEFIENDE HORIZONTAL************
                        if(un==1&&tre==1&&doss==0){
                            dos.setBackgroundResource(R.drawable.x);
                            dos.setEnabled(false);
                            doss=2;
                            textoTurno.setText("ES TU TURNO");
                            colocar=1;
                        }
                        if(cua==1&&sei==1&&cin==0){
                            cinco.setBackgroundResource(R.drawable.x);
                            cinco.setEnabled(false);
                            cin=2;
                            textoTurno.setText("ES TU TURNO");
                            colocar=1;
                        }
                        if(sei==1&&nue==1&&och==0){
                            siete.setBackgroundResource(R.drawable.x);
                            siete.setEnabled(false);
                            sie=2;
                            textoTurno.setText("ES TU TURNO");
                            colocar=1;
                        }
                        //*************DEFIENDE VERTICAL************
                        if(un==1&&sie==1&&cua==0){
                            cuatro.setBackgroundResource(R.drawable.x);
                            cuatro.setEnabled(false);
                            cua=2;
                            textoTurno.setText("ES TU TURNO");
                            colocar=1;
                        }
                        if(doss==1&&och==1&&cin==0){
                            cinco.setBackgroundResource(R.drawable.x);
                            cinco.setEnabled(false);
                            cin=2;
                            textoTurno.setText("ES TU TURNO");
                            colocar=1;
                        }
                        if(tre==1&&nue==1&&sei==0){
                            cuatro.setBackgroundResource(R.drawable.x);
                            cuatro.setEnabled(false);
                            cua=2;
                            textoTurno.setText("ES TU TURNO");
                            colocar=1;
                        }
                        //*************DEFIENDE DIAGONAL************
                        if(un==1&&nue==1&&cin==0){
                            cinco.setBackgroundResource(R.drawable.x);
                            cinco.setEnabled(false);
                            cin=2;
                            textoTurno.setText("ES TU TURNO");
                            colocar=1;
                        }
                        if(tre==1&&sie==1&&cin==0){
                            cinco.setBackgroundResource(R.drawable.x);
                            cinco.setEnabled(false);
                            cin=2;
                            textoTurno.setText("ES TU TURNO");
                            colocar=1;
                        }
                        //********VERIFICA SI GANAMOS************
                        if((un==2&&doss==2&&tre==2)||(cua==2&&cin==2&&sei==2)||(sie==2&&och==2&&nue==2)||(un==2&&cua==2&&och==2)||(doss==2&&cin==2&&och==2)||(tre==2&&sei==2&&nue==2)||(un==2&&cin==2&&nue==2)||(tre==2&&cin==2&&sie==2)){
                            AlertDialog.Builder alerta = new AlertDialog.Builder(MainActivity.this);
                            alerta.setTitle("HAS GANADO")
                                    .setMessage("Felicidades has ganada contra CPU")
                                    .setPositiveButton("ACEPTAR", new DialogInterface.OnClickListener() {
                                        @Override
                                        public void onClick(DialogInterface dialogInterface, int i) {

                                        }
                                    })
                                    .show();

                        }


                        if(colocar==0){
                            //*************ATACA HORIZONTAL************
                            if(un==2&&tre==2&&doss==0){
                                dos.setBackgroundResource(R.drawable.x);
                                dos.setEnabled(false);
                                doss=2;
                                textoTurno.setText("ES TU TURNO");
                                colocar=1;
                            }
                            if(cua==2&&sei==2&&cin==0){
                                cinco.setBackgroundResource(R.drawable.x);
                                cinco.setEnabled(false);
                                cin=2;
                                textoTurno.setText("ES TU TURNO");
                                colocar=1;
                            }
                            if(sei==2&&nue==2&&och==0){
                                siete.setBackgroundResource(R.drawable.x);
                                siete.setEnabled(false);
                                sie=2;
                                textoTurno.setText("ES TU TURNO");
                                colocar=1;
                            }
                            //*************ATACA VERTICAL************
                            if(un==2&&sie==2&&cua==0){
                                cuatro.setBackgroundResource(R.drawable.x);
                                cuatro.setEnabled(false);
                                cua=2;
                                textoTurno.setText("ES TU TURNO");
                                colocar=1;
                            }
                            if(doss==2&&och==2&&cin==0){
                                cinco.setBackgroundResource(R.drawable.x);
                                cinco.setEnabled(false);
                                cin=2;
                                textoTurno.setText("ES TU TURNO");
                                colocar=1;
                            }
                            if(tre==2&&nue==2&&sei==0){
                                cuatro.setBackgroundResource(R.drawable.x);
                                cuatro.setEnabled(false);
                                cua=2;
                                textoTurno.setText("ES TU TURNO");
                                colocar=1;
                            }
                            //*************ATACA DIAGONAL************
                            if(un==2&&nue==2&&cin==0){
                                cinco.setBackgroundResource(R.drawable.x);
                                cinco.setEnabled(false);
                                cin=2;
                                textoTurno.setText("ES TU TURNO");
                                colocar=1;
                            }
                            if(tre==2&&sie==2&&cin==0){
                                cinco.setBackgroundResource(R.drawable.x);
                                cinco.setEnabled(false);
                                cin=2;
                                textoTurno.setText("ES TU TURNO");
                                colocar=1;
                            }

                        }

                        //*********** SE DUERME *****************
                        try {
                            sleep(500);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }

                        if(colocar==0){
                            //***********PRIMER GOLPE **************
                            if(cin==0){
                                cinco.setBackgroundResource(R.drawable.x);
                                cinco.setEnabled(false);
                                cin=2;
                                textoTurno.setText("ES TU TURNO");
                                colocar=1;
                            }else if(cin==1&&un==0){
                                uno.setBackgroundResource(R.drawable.x);
                                uno.setEnabled(false);
                                un=2;
                                textoTurno.setText("ES TU TURNO");
                                colocar=1;
                            }else if(cin==1&&doss==0){
                                dos.setBackgroundResource(R.drawable.x);
                                dos.setEnabled(false);
                                doss=2;
                                textoTurno.setText("ES TU TURNO");
                                colocar=1;
                            }else if(cin==1&&tre==0){
                                tres.setBackgroundResource(R.drawable.x);
                                tres.setEnabled(false);
                                tre=2;
                                textoTurno.setText("ES TU TURNO");
                                colocar=1;
                            }else if(cin==1&&cua==0){
                                cuatro.setBackgroundResource(R.drawable.x);
                                cuatro.setEnabled(false);
                                cua=2;
                                textoTurno.setText("ES TU TURNO");
                                colocar=1;
                            }else if(cin==1&&cin==0){
                                cinco.setBackgroundResource(R.drawable.x);
                                cinco.setEnabled(false);
                                cin=2;
                                textoTurno.setText("ES TU TURNO");
                                colocar=1;
                            }else if(cin==1&&sei==0){
                                seis.setBackgroundResource(R.drawable.x);
                                seis.setEnabled(false);
                                sei=2;
                                textoTurno.setText("ES TU TURNO");
                                colocar=1;
                            } else if(cin==1&&sie==0){
                                siete.setBackgroundResource(R.drawable.x);
                                siete.setEnabled(false);
                                sie=2;
                                textoTurno.setText("ES TU TURNO");
                                colocar=1;
                            }else if(cin==1&&och==0){
                                ocho.setBackgroundResource(R.drawable.x);
                                ocho.setEnabled(false);
                                och=2;
                                textoTurno.setText("ES TU TURNO");
                                colocar=1;
                            }else if(cin==1&&nue==0){
                                nueve.setBackgroundResource(R.drawable.x);
                                nueve.setEnabled(false);
                                nue=2;
                                textoTurno.setText("ES TU TURNO");
                                colocar=1;
                            }
                            //********VERIFICA SI GANAMOS************
                            if((un==2&&doss==2&&tre==2)||(cua==2&&cin==2&&sei==2)||(sie==2&&och==2&&nue==2)||(un==2&&cua==2&&och==2)||(doss==2&&cin==2&&och==2)||(tre==2&&sei==2&&nue==2)||(un==2&&cin==2&&nue==2)||(tre==2&&cin==2&&sie==2)){
                                AlertDialog.Builder alerta = new AlertDialog.Builder(MainActivity.this);
                                alerta.setTitle("HAS GANADO")
                                        .setMessage("Felicidades has ganada contra CPU")
                                        .setPositiveButton("ACEPTAR", new DialogInterface.OnClickListener() {
                                            @Override
                                            public void onClick(DialogInterface dialogInterface, int i) {

                                            }
                                        })
                                        .show();

                            }
                        }

                        //***********SEGUNDO GOLPE **************
                        if(cin==0){
                            cinco.setBackgroundResource(R.drawable.x);
                            cinco.setEnabled(false);
                            cin=2;
                            textoTurno.setText("ES TU TURNO");
                        }else if(cin==1&&un==0){
                            uno.setBackgroundResource(R.drawable.x);
                            uno.setEnabled(false);
                            un=2;
                            textoTurno.setText("ES TU TURNO");
                        }else if(cin==1&&doss==0){
                            dos.setBackgroundResource(R.drawable.x);
                            dos.setEnabled(false);
                            doss=2;
                            textoTurno.setText("ES TU TURNO");
                        }else if(cin==1&&tre==0){
                            tres.setBackgroundResource(R.drawable.x);
                            tres.setEnabled(false);
                            tre=2;
                            textoTurno.setText("ES TU TURNO");
                        }else if(cin==1&&cua==0){
                            cuatro.setBackgroundResource(R.drawable.x);
                            cuatro.setEnabled(false);
                            cua=2;
                            textoTurno.setText("ES TU TURNO");
                        }else if(cin==1&&cin==0){
                            cinco.setBackgroundResource(R.drawable.x);
                            cinco.setEnabled(false);
                            cin=2;
                            textoTurno.setText("ES TU TURNO");
                        }else if(cin==1&&sei==0){
                            seis.setBackgroundResource(R.drawable.x);
                            seis.setEnabled(false);
                            sei=2;
                            textoTurno.setText("ES TU TURNO");
                        } else if(cin==1&&sie==0){
                            siete.setBackgroundResource(R.drawable.x);
                            siete.setEnabled(false);
                            sie=2;
                            textoTurno.setText("ES TU TURNO");
                        }else if(cin==1&&och==0){
                            ocho.setBackgroundResource(R.drawable.x);
                            ocho.setEnabled(false);
                            och=2;
                            textoTurno.setText("ES TU TURNO");
                        }else if(cin==1&&nue==0){
                            nueve.setBackgroundResource(R.drawable.x);
                            nueve.setEnabled(false);
                            nue=2;
                            textoTurno.setText("ES TU TURNO");
                        }
                        //********VERIFICA SI GANAMOS************
                        if((un==2&&doss==2&&tre==2)||(cua==2&&cin==2&&sei==2)||(sie==2&&och==2&&nue==2)||(un==2&&cua==2&&och==2)||(doss==2&&cin==2&&och==2)||(tre==2&&sei==2&&nue==2)||(un==2&&cin==2&&nue==2)||(tre==2&&cin==2&&sie==2)){
                            AlertDialog.Builder alerta = new AlertDialog.Builder(MainActivity.this);
                            alerta.setTitle("HAS GANADO")
                                    .setMessage("Felicidades has ganada contra CPU")
                                    .setPositiveButton("ACEPTAR", new DialogInterface.OnClickListener() {
                                        @Override
                                        public void onClick(DialogInterface dialogInterface, int i) {

                                        }
                                    })
                                    .show();
                        }
                    }
                });
            }
        };
        //**************TERMINA HILO 4 ****************

        //**************INICIA HILO 5 ****************
        hilo5 = new Thread(){
            public void run() {
                runOnUiThread(new Runnable() {
                    @Override
                    public void run() {
                        try {
                            sleep(500);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }

                        int colocar=0;

                        //*************DEFIENDE HORIZONTAL************
                        if(un==1&&tre==1&&doss==0){
                            dos.setBackgroundResource(R.drawable.x);
                            dos.setEnabled(false);
                            doss=2;
                            textoTurno.setText("ES TU TURNO");
                            colocar=1;
                        }
                        if(cua==1&&sei==1&&cin==0){
                            cinco.setBackgroundResource(R.drawable.x);
                            cinco.setEnabled(false);
                            cin=2;
                            textoTurno.setText("ES TU TURNO");
                            colocar=1;
                        }
                        if(sei==1&&nue==1&&och==0){
                            siete.setBackgroundResource(R.drawable.x);
                            siete.setEnabled(false);
                            sie=2;
                            textoTurno.setText("ES TU TURNO");
                            colocar=1;
                        }
                        //*************DEFIENDE VERTICAL************
                        if(un==1&&sie==1&&cua==0){
                            cuatro.setBackgroundResource(R.drawable.x);
                            cuatro.setEnabled(false);
                            cua=2;
                            textoTurno.setText("ES TU TURNO");
                            colocar=1;
                        }
                        if(doss==1&&och==1&&cin==0){
                            cinco.setBackgroundResource(R.drawable.x);
                            cinco.setEnabled(false);
                            cin=2;
                            textoTurno.setText("ES TU TURNO");
                            colocar=1;
                        }
                        if(tre==1&&nue==1&&sei==0){
                            cuatro.setBackgroundResource(R.drawable.x);
                            cuatro.setEnabled(false);
                            cua=2;
                            textoTurno.setText("ES TU TURNO");
                            colocar=1;
                        }
                        //*************DEFIENDE DIAGONAL************
                        if(un==1&&nue==1&&cin==0){
                            cinco.setBackgroundResource(R.drawable.x);
                            cinco.setEnabled(false);
                            cin=2;
                            textoTurno.setText("ES TU TURNO");
                            colocar=1;
                        }
                        if(tre==1&&sie==1&&cin==0){
                            cinco.setBackgroundResource(R.drawable.x);
                            cinco.setEnabled(false);
                            cin=2;
                            textoTurno.setText("ES TU TURNO");
                            colocar=1;
                        }
                        //********VERIFICA SI GANAMOS************
                        if((un==2&&doss==2&&tre==2)||(cua==2&&cin==2&&sei==2)||(sie==2&&och==2&&nue==2)||(un==2&&cua==2&&och==2)||(doss==2&&cin==2&&och==2)||(tre==2&&sei==2&&nue==2)||(un==2&&cin==2&&nue==2)||(tre==2&&cin==2&&sie==2)){
                            AlertDialog.Builder alerta = new AlertDialog.Builder(MainActivity.this);
                            alerta.setTitle("HAS GANADO")
                                    .setMessage("Felicidades has ganada contra CPU")
                                    .setPositiveButton("ACEPTAR", new DialogInterface.OnClickListener() {
                                        @Override
                                        public void onClick(DialogInterface dialogInterface, int i) {

                                        }
                                    })
                                    .show();

                        }


                        if(colocar==0){
                            //*************ATACA HORIZONTAL************
                            if(un==2&&tre==2&&doss==0){
                                dos.setBackgroundResource(R.drawable.x);
                                dos.setEnabled(false);
                                doss=2;
                                textoTurno.setText("ES TU TURNO");
                                colocar=1;
                            }
                            if(cua==2&&sei==2&&cin==0){
                                cinco.setBackgroundResource(R.drawable.x);
                                cinco.setEnabled(false);
                                cin=2;
                                textoTurno.setText("ES TU TURNO");
                                colocar=1;
                            }
                            if(sei==2&&nue==2&&och==0){
                                siete.setBackgroundResource(R.drawable.x);
                                siete.setEnabled(false);
                                sie=2;
                                textoTurno.setText("ES TU TURNO");
                                colocar=1;
                            }
                            //*************ATACA VERTICAL************
                            if(un==2&&sie==2&&cua==0){
                                cuatro.setBackgroundResource(R.drawable.x);
                                cuatro.setEnabled(false);
                                cua=2;
                                textoTurno.setText("ES TU TURNO");
                                colocar=1;
                            }
                            if(doss==2&&och==2&&cin==0){
                                cinco.setBackgroundResource(R.drawable.x);
                                cinco.setEnabled(false);
                                cin=2;
                                textoTurno.setText("ES TU TURNO");
                                colocar=1;
                            }
                            if(tre==2&&nue==2&&sei==0){
                                cuatro.setBackgroundResource(R.drawable.x);
                                cuatro.setEnabled(false);
                                cua=2;
                                textoTurno.setText("ES TU TURNO");
                                colocar=1;
                            }
                            //*************ATACA DIAGONAL************
                            if(un==2&&nue==2&&cin==0){
                                cinco.setBackgroundResource(R.drawable.x);
                                cinco.setEnabled(false);
                                cin=2;
                                textoTurno.setText("ES TU TURNO");
                                colocar=1;
                            }
                            if(tre==2&&sie==2&&cin==0){
                                cinco.setBackgroundResource(R.drawable.x);
                                cinco.setEnabled(false);
                                cin=2;
                                textoTurno.setText("ES TU TURNO");
                                colocar=1;
                            }

                        }

                        //*********** SE DUERME *****************
                        try {
                            sleep(500);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }

                        if(colocar==0){
                            //***********PRIMER GOLPE **************
                            if(cin==0){
                                cinco.setBackgroundResource(R.drawable.x);
                                cinco.setEnabled(false);
                                cin=2;
                                textoTurno.setText("ES TU TURNO");
                                colocar=1;
                            }else if(cin==1&&un==0){
                                uno.setBackgroundResource(R.drawable.x);
                                uno.setEnabled(false);
                                un=2;
                                textoTurno.setText("ES TU TURNO");
                                colocar=1;
                            }else if(cin==1&&doss==0){
                                dos.setBackgroundResource(R.drawable.x);
                                dos.setEnabled(false);
                                doss=2;
                                textoTurno.setText("ES TU TURNO");
                                colocar=1;
                            }else if(cin==1&&tre==0){
                                tres.setBackgroundResource(R.drawable.x);
                                tres.setEnabled(false);
                                tre=2;
                                textoTurno.setText("ES TU TURNO");
                                colocar=1;
                            }else if(cin==1&&cua==0){
                                cuatro.setBackgroundResource(R.drawable.x);
                                cuatro.setEnabled(false);
                                cua=2;
                                textoTurno.setText("ES TU TURNO");
                                colocar=1;
                            }else if(cin==1&&cin==0){
                                cinco.setBackgroundResource(R.drawable.x);
                                cinco.setEnabled(false);
                                cin=2;
                                textoTurno.setText("ES TU TURNO");
                                colocar=1;
                            }else if(cin==1&&sei==0){
                                seis.setBackgroundResource(R.drawable.x);
                                seis.setEnabled(false);
                                sei=2;
                                textoTurno.setText("ES TU TURNO");
                                colocar=1;
                            } else if(cin==1&&sie==0){
                                siete.setBackgroundResource(R.drawable.x);
                                siete.setEnabled(false);
                                sie=2;
                                textoTurno.setText("ES TU TURNO");
                                colocar=1;
                            }else if(cin==1&&och==0){
                                ocho.setBackgroundResource(R.drawable.x);
                                ocho.setEnabled(false);
                                och=2;
                                textoTurno.setText("ES TU TURNO");
                                colocar=1;
                            }else if(cin==1&&nue==0){
                                nueve.setBackgroundResource(R.drawable.x);
                                nueve.setEnabled(false);
                                nue=2;
                                textoTurno.setText("ES TU TURNO");
                                colocar=1;
                            }
                            //********VERIFICA SI GANAMOS************
                            if((un==2&&doss==2&&tre==2)||(cua==2&&cin==2&&sei==2)||(sie==2&&och==2&&nue==2)||(un==2&&cua==2&&och==2)||(doss==2&&cin==2&&och==2)||(tre==2&&sei==2&&nue==2)||(un==2&&cin==2&&nue==2)||(tre==2&&cin==2&&sie==2)){
                                AlertDialog.Builder alerta = new AlertDialog.Builder(MainActivity.this);
                                alerta.setTitle("HAS GANADO")
                                        .setMessage("Felicidades has ganada contra CPU")
                                        .setPositiveButton("ACEPTAR", new DialogInterface.OnClickListener() {
                                            @Override
                                            public void onClick(DialogInterface dialogInterface, int i) {

                                            }
                                        })
                                        .show();

                            }
                        }

                        //***********SEGUNDO GOLPE **************
                        if(cin==0){
                            cinco.setBackgroundResource(R.drawable.x);
                            cinco.setEnabled(false);
                            cin=2;
                            textoTurno.setText("ES TU TURNO");
                        }else if(cin==1&&un==0){
                            uno.setBackgroundResource(R.drawable.x);
                            uno.setEnabled(false);
                            un=2;
                            textoTurno.setText("ES TU TURNO");
                        }else if(cin==1&&doss==0){
                            dos.setBackgroundResource(R.drawable.x);
                            dos.setEnabled(false);
                            doss=2;
                            textoTurno.setText("ES TU TURNO");
                        }else if(cin==1&&tre==0){
                            tres.setBackgroundResource(R.drawable.x);
                            tres.setEnabled(false);
                            tre=2;
                            textoTurno.setText("ES TU TURNO");
                        }else if(cin==1&&cua==0){
                            cuatro.setBackgroundResource(R.drawable.x);
                            cuatro.setEnabled(false);
                            cua=2;
                            textoTurno.setText("ES TU TURNO");
                        }else if(cin==1&&cin==0){
                            cinco.setBackgroundResource(R.drawable.x);
                            cinco.setEnabled(false);
                            cin=2;
                            textoTurno.setText("ES TU TURNO");
                        }else if(cin==1&&sei==0){
                            seis.setBackgroundResource(R.drawable.x);
                            seis.setEnabled(false);
                            sei=2;
                            textoTurno.setText("ES TU TURNO");
                        } else if(cin==1&&sie==0){
                            siete.setBackgroundResource(R.drawable.x);
                            siete.setEnabled(false);
                            sie=2;
                            textoTurno.setText("ES TU TURNO");
                        }else if(cin==1&&och==0){
                            ocho.setBackgroundResource(R.drawable.x);
                            ocho.setEnabled(false);
                            och=2;
                            textoTurno.setText("ES TU TURNO");
                        }else if(cin==1&&nue==0){
                            nueve.setBackgroundResource(R.drawable.x);
                            nueve.setEnabled(false);
                            nue=2;
                            textoTurno.setText("ES TU TURNO");
                        }
                        //********VERIFICA SI GANAMOS************
                        if((un==2&&doss==2&&tre==2)||(cua==2&&cin==2&&sei==2)||(sie==2&&och==2&&nue==2)||(un==2&&cua==2&&och==2)||(doss==2&&cin==2&&och==2)||(tre==2&&sei==2&&nue==2)||(un==2&&cin==2&&nue==2)||(tre==2&&cin==2&&sie==2)){
                            AlertDialog.Builder alerta = new AlertDialog.Builder(MainActivity.this);
                            alerta.setTitle("HAS GANADO")
                                    .setMessage("Felicidades has ganada contra CPU")
                                    .setPositiveButton("ACEPTAR", new DialogInterface.OnClickListener() {
                                        @Override
                                        public void onClick(DialogInterface dialogInterface, int i) {

                                        }
                                    })
                                    .show();
                        }
                    }
                });
            }
        };
        //**************TERMINA HILO 5 ****************

        //**************INICIA HILO 6 ****************
        hilo6 = new Thread(){
            public void run() {
                runOnUiThread(new Runnable() {
                    @Override
                    public void run() {
                        try {
                            sleep(500);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }

                        int colocar=0;

                        //*************DEFIENDE HORIZONTAL************
                        if(un==1&&tre==1&&doss==0){
                            dos.setBackgroundResource(R.drawable.x);
                            dos.setEnabled(false);
                            doss=2;
                            textoTurno.setText("ES TU TURNO");
                            colocar=1;
                        }
                        if(cua==1&&sei==1&&cin==0){
                            cinco.setBackgroundResource(R.drawable.x);
                            cinco.setEnabled(false);
                            cin=2;
                            textoTurno.setText("ES TU TURNO");
                            colocar=1;
                        }
                        if(sei==1&&nue==1&&och==0){
                            siete.setBackgroundResource(R.drawable.x);
                            siete.setEnabled(false);
                            sie=2;
                            textoTurno.setText("ES TU TURNO");
                            colocar=1;
                        }
                        //*************DEFIENDE VERTICAL************
                        if(un==1&&sie==1&&cua==0){
                            cuatro.setBackgroundResource(R.drawable.x);
                            cuatro.setEnabled(false);
                            cua=2;
                            textoTurno.setText("ES TU TURNO");
                            colocar=1;
                        }
                        if(doss==1&&och==1&&cin==0){
                            cinco.setBackgroundResource(R.drawable.x);
                            cinco.setEnabled(false);
                            cin=2;
                            textoTurno.setText("ES TU TURNO");
                            colocar=1;
                        }
                        if(tre==1&&nue==1&&sei==0){
                            cuatro.setBackgroundResource(R.drawable.x);
                            cuatro.setEnabled(false);
                            cua=2;
                            textoTurno.setText("ES TU TURNO");
                            colocar=1;
                        }
                        //*************DEFIENDE DIAGONAL************
                        if(un==1&&nue==1&&cin==0){
                            cinco.setBackgroundResource(R.drawable.x);
                            cinco.setEnabled(false);
                            cin=2;
                            textoTurno.setText("ES TU TURNO");
                            colocar=1;
                        }
                        if(tre==1&&sie==1&&cin==0){
                            cinco.setBackgroundResource(R.drawable.x);
                            cinco.setEnabled(false);
                            cin=2;
                            textoTurno.setText("ES TU TURNO");
                            colocar=1;
                        }
                        //********VERIFICA SI GANAMOS************
                        if((un==2&&doss==2&&tre==2)||(cua==2&&cin==2&&sei==2)||(sie==2&&och==2&&nue==2)||(un==2&&cua==2&&och==2)||(doss==2&&cin==2&&och==2)||(tre==2&&sei==2&&nue==2)||(un==2&&cin==2&&nue==2)||(tre==2&&cin==2&&sie==2)){
                            AlertDialog.Builder alerta = new AlertDialog.Builder(MainActivity.this);
                            alerta.setTitle("HAS GANADO")
                                    .setMessage("Felicidades has ganada contra CPU")
                                    .setPositiveButton("ACEPTAR", new DialogInterface.OnClickListener() {
                                        @Override
                                        public void onClick(DialogInterface dialogInterface, int i) {

                                        }
                                    })
                                    .show();

                        }


                        if(colocar==0){
                            //*************ATACA HORIZONTAL************
                            if(un==2&&tre==2&&doss==0){
                                dos.setBackgroundResource(R.drawable.x);
                                dos.setEnabled(false);
                                doss=2;
                                textoTurno.setText("ES TU TURNO");
                                colocar=1;
                            }
                            if(cua==2&&sei==2&&cin==0){
                                cinco.setBackgroundResource(R.drawable.x);
                                cinco.setEnabled(false);
                                cin=2;
                                textoTurno.setText("ES TU TURNO");
                                colocar=1;
                            }
                            if(sei==2&&nue==2&&och==0){
                                siete.setBackgroundResource(R.drawable.x);
                                siete.setEnabled(false);
                                sie=2;
                                textoTurno.setText("ES TU TURNO");
                                colocar=1;
                            }
                            //*************ATACA VERTICAL************
                            if(un==2&&sie==2&&cua==0){
                                cuatro.setBackgroundResource(R.drawable.x);
                                cuatro.setEnabled(false);
                                cua=2;
                                textoTurno.setText("ES TU TURNO");
                                colocar=1;
                            }
                            if(doss==2&&och==2&&cin==0){
                                cinco.setBackgroundResource(R.drawable.x);
                                cinco.setEnabled(false);
                                cin=2;
                                textoTurno.setText("ES TU TURNO");
                                colocar=1;
                            }
                            if(tre==2&&nue==2&&sei==0){
                                cuatro.setBackgroundResource(R.drawable.x);
                                cuatro.setEnabled(false);
                                cua=2;
                                textoTurno.setText("ES TU TURNO");
                                colocar=1;
                            }
                            //*************ATACA DIAGONAL************
                            if(un==2&&nue==2&&cin==0){
                                cinco.setBackgroundResource(R.drawable.x);
                                cinco.setEnabled(false);
                                cin=2;
                                textoTurno.setText("ES TU TURNO");
                                colocar=1;
                            }
                            if(tre==2&&sie==2&&cin==0){
                                cinco.setBackgroundResource(R.drawable.x);
                                cinco.setEnabled(false);
                                cin=2;
                                textoTurno.setText("ES TU TURNO");
                                colocar=1;
                            }

                        }

                        //*********** SE DUERME *****************
                        try {
                            sleep(500);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }

                        if(colocar==0){
                            //***********PRIMER GOLPE **************
                            if(cin==0){
                                cinco.setBackgroundResource(R.drawable.x);
                                cinco.setEnabled(false);
                                cin=2;
                                textoTurno.setText("ES TU TURNO");
                                colocar=1;
                            }else if(cin==1&&un==0){
                                uno.setBackgroundResource(R.drawable.x);
                                uno.setEnabled(false);
                                un=2;
                                textoTurno.setText("ES TU TURNO");
                                colocar=1;
                            }else if(cin==1&&doss==0){
                                dos.setBackgroundResource(R.drawable.x);
                                dos.setEnabled(false);
                                doss=2;
                                textoTurno.setText("ES TU TURNO");
                                colocar=1;
                            }else if(cin==1&&tre==0){
                                tres.setBackgroundResource(R.drawable.x);
                                tres.setEnabled(false);
                                tre=2;
                                textoTurno.setText("ES TU TURNO");
                                colocar=1;
                            }else if(cin==1&&cua==0){
                                cuatro.setBackgroundResource(R.drawable.x);
                                cuatro.setEnabled(false);
                                cua=2;
                                textoTurno.setText("ES TU TURNO");
                                colocar=1;
                            }else if(cin==1&&cin==0){
                                cinco.setBackgroundResource(R.drawable.x);
                                cinco.setEnabled(false);
                                cin=2;
                                textoTurno.setText("ES TU TURNO");
                                colocar=1;
                            }else if(cin==1&&sei==0){
                                seis.setBackgroundResource(R.drawable.x);
                                seis.setEnabled(false);
                                sei=2;
                                textoTurno.setText("ES TU TURNO");
                                colocar=1;
                            } else if(cin==1&&sie==0){
                                siete.setBackgroundResource(R.drawable.x);
                                siete.setEnabled(false);
                                sie=2;
                                textoTurno.setText("ES TU TURNO");
                                colocar=1;
                            }else if(cin==1&&och==0){
                                ocho.setBackgroundResource(R.drawable.x);
                                ocho.setEnabled(false);
                                och=2;
                                textoTurno.setText("ES TU TURNO");
                                colocar=1;
                            }else if(cin==1&&nue==0){
                                nueve.setBackgroundResource(R.drawable.x);
                                nueve.setEnabled(false);
                                nue=2;
                                textoTurno.setText("ES TU TURNO");
                                colocar=1;
                            }
                            //********VERIFICA SI GANAMOS************
                            if((un==2&&doss==2&&tre==2)||(cua==2&&cin==2&&sei==2)||(sie==2&&och==2&&nue==2)||(un==2&&cua==2&&och==2)||(doss==2&&cin==2&&och==2)||(tre==2&&sei==2&&nue==2)||(un==2&&cin==2&&nue==2)||(tre==2&&cin==2&&sie==2)){
                                AlertDialog.Builder alerta = new AlertDialog.Builder(MainActivity.this);
                                alerta.setTitle("HAS GANADO")
                                        .setMessage("Felicidades has ganada contra CPU")
                                        .setPositiveButton("ACEPTAR", new DialogInterface.OnClickListener() {
                                            @Override
                                            public void onClick(DialogInterface dialogInterface, int i) {

                                            }
                                        })
                                        .show();

                            }
                        }

                        //***********SEGUNDO GOLPE **************
                        if(cin==0){
                            cinco.setBackgroundResource(R.drawable.x);
                            cinco.setEnabled(false);
                            cin=2;
                            textoTurno.setText("ES TU TURNO");
                        }else if(cin==1&&un==0){
                            uno.setBackgroundResource(R.drawable.x);
                            uno.setEnabled(false);
                            un=2;
                            textoTurno.setText("ES TU TURNO");
                        }else if(cin==1&&doss==0){
                            dos.setBackgroundResource(R.drawable.x);
                            dos.setEnabled(false);
                            doss=2;
                            textoTurno.setText("ES TU TURNO");
                        }else if(cin==1&&tre==0){
                            tres.setBackgroundResource(R.drawable.x);
                            tres.setEnabled(false);
                            tre=2;
                            textoTurno.setText("ES TU TURNO");
                        }else if(cin==1&&cua==0){
                            cuatro.setBackgroundResource(R.drawable.x);
                            cuatro.setEnabled(false);
                            cua=2;
                            textoTurno.setText("ES TU TURNO");
                        }else if(cin==1&&cin==0){
                            cinco.setBackgroundResource(R.drawable.x);
                            cinco.setEnabled(false);
                            cin=2;
                            textoTurno.setText("ES TU TURNO");
                        }else if(cin==1&&sei==0){
                            seis.setBackgroundResource(R.drawable.x);
                            seis.setEnabled(false);
                            sei=2;
                            textoTurno.setText("ES TU TURNO");
                        } else if(cin==1&&sie==0){
                            siete.setBackgroundResource(R.drawable.x);
                            siete.setEnabled(false);
                            sie=2;
                            textoTurno.setText("ES TU TURNO");
                        }else if(cin==1&&och==0){
                            ocho.setBackgroundResource(R.drawable.x);
                            ocho.setEnabled(false);
                            och=2;
                            textoTurno.setText("ES TU TURNO");
                        }else if(cin==1&&nue==0){
                            nueve.setBackgroundResource(R.drawable.x);
                            nueve.setEnabled(false);
                            nue=2;
                            textoTurno.setText("ES TU TURNO");
                        }
                        //********VERIFICA SI GANAMOS************
                        if((un==2&&doss==2&&tre==2)||(cua==2&&cin==2&&sei==2)||(sie==2&&och==2&&nue==2)||(un==2&&cua==2&&och==2)||(doss==2&&cin==2&&och==2)||(tre==2&&sei==2&&nue==2)||(un==2&&cin==2&&nue==2)||(tre==2&&cin==2&&sie==2)){
                            AlertDialog.Builder alerta = new AlertDialog.Builder(MainActivity.this);
                            alerta.setTitle("HAS GANADO")
                                    .setMessage("Felicidades has ganada contra CPU")
                                    .setPositiveButton("ACEPTAR", new DialogInterface.OnClickListener() {
                                        @Override
                                        public void onClick(DialogInterface dialogInterface, int i) {

                                        }
                                    })
                                    .show();
                        }
                    }
                });
            }
        };
        //**************TERMINA HILO 6 ****************

        //**************INICIA HILO 7 ****************
        hilo7 = new Thread(){
            public void run() {
                runOnUiThread(new Runnable() {
                    @Override
                    public void run() {
                        try {
                            sleep(500);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }

                        int colocar=0;

                        //*************DEFIENDE HORIZONTAL************
                        if(un==1&&tre==1&&doss==0){
                            dos.setBackgroundResource(R.drawable.x);
                            dos.setEnabled(false);
                            doss=2;
                            textoTurno.setText("ES TU TURNO");
                            colocar=1;
                        }
                        if(cua==1&&sei==1&&cin==0){
                            cinco.setBackgroundResource(R.drawable.x);
                            cinco.setEnabled(false);
                            cin=2;
                            textoTurno.setText("ES TU TURNO");
                            colocar=1;
                        }
                        if(sei==1&&nue==1&&och==0){
                            siete.setBackgroundResource(R.drawable.x);
                            siete.setEnabled(false);
                            sie=2;
                            textoTurno.setText("ES TU TURNO");
                            colocar=1;
                        }
                        //*************DEFIENDE VERTICAL************
                        if(un==1&&sie==1&&cua==0){
                            cuatro.setBackgroundResource(R.drawable.x);
                            cuatro.setEnabled(false);
                            cua=2;
                            textoTurno.setText("ES TU TURNO");
                            colocar=1;
                        }
                        if(doss==1&&och==1&&cin==0){
                            cinco.setBackgroundResource(R.drawable.x);
                            cinco.setEnabled(false);
                            cin=2;
                            textoTurno.setText("ES TU TURNO");
                            colocar=1;
                        }
                        if(tre==1&&nue==1&&sei==0){
                            cuatro.setBackgroundResource(R.drawable.x);
                            cuatro.setEnabled(false);
                            cua=2;
                            textoTurno.setText("ES TU TURNO");
                            colocar=1;
                        }
                        //*************DEFIENDE DIAGONAL************
                        if(un==1&&nue==1&&cin==0){
                            cinco.setBackgroundResource(R.drawable.x);
                            cinco.setEnabled(false);
                            cin=2;
                            textoTurno.setText("ES TU TURNO");
                            colocar=1;
                        }
                        if(tre==1&&sie==1&&cin==0){
                            cinco.setBackgroundResource(R.drawable.x);
                            cinco.setEnabled(false);
                            cin=2;
                            textoTurno.setText("ES TU TURNO");
                            colocar=1;
                        }
                        //********VERIFICA SI GANAMOS************
                        if((un==2&&doss==2&&tre==2)||(cua==2&&cin==2&&sei==2)||(sie==2&&och==2&&nue==2)||(un==2&&cua==2&&och==2)||(doss==2&&cin==2&&och==2)||(tre==2&&sei==2&&nue==2)||(un==2&&cin==2&&nue==2)||(tre==2&&cin==2&&sie==2)){
                            AlertDialog.Builder alerta = new AlertDialog.Builder(MainActivity.this);
                            alerta.setTitle("HAS GANADO")
                                    .setMessage("Felicidades has ganada contra CPU")
                                    .setPositiveButton("ACEPTAR", new DialogInterface.OnClickListener() {
                                        @Override
                                        public void onClick(DialogInterface dialogInterface, int i) {

                                        }
                                    })
                                    .show();

                        }


                        if(colocar==0){
                            //*************ATACA HORIZONTAL************
                            if(un==2&&tre==2&&doss==0){
                                dos.setBackgroundResource(R.drawable.x);
                                dos.setEnabled(false);
                                doss=2;
                                textoTurno.setText("ES TU TURNO");
                                colocar=1;
                            }
                            if(cua==2&&sei==2&&cin==0){
                                cinco.setBackgroundResource(R.drawable.x);
                                cinco.setEnabled(false);
                                cin=2;
                                textoTurno.setText("ES TU TURNO");
                                colocar=1;
                            }
                            if(sei==2&&nue==2&&och==0){
                                siete.setBackgroundResource(R.drawable.x);
                                siete.setEnabled(false);
                                sie=2;
                                textoTurno.setText("ES TU TURNO");
                                colocar=1;
                            }
                            //*************ATACA VERTICAL************
                            if(un==2&&sie==2&&cua==0){
                                cuatro.setBackgroundResource(R.drawable.x);
                                cuatro.setEnabled(false);
                                cua=2;
                                textoTurno.setText("ES TU TURNO");
                                colocar=1;
                            }
                            if(doss==2&&och==2&&cin==0){
                                cinco.setBackgroundResource(R.drawable.x);
                                cinco.setEnabled(false);
                                cin=2;
                                textoTurno.setText("ES TU TURNO");
                                colocar=1;
                            }
                            if(tre==2&&nue==2&&sei==0){
                                cuatro.setBackgroundResource(R.drawable.x);
                                cuatro.setEnabled(false);
                                cua=2;
                                textoTurno.setText("ES TU TURNO");
                                colocar=1;
                            }
                            //*************ATACA DIAGONAL************
                            if(un==2&&nue==2&&cin==0){
                                cinco.setBackgroundResource(R.drawable.x);
                                cinco.setEnabled(false);
                                cin=2;
                                textoTurno.setText("ES TU TURNO");
                                colocar=1;
                            }
                            if(tre==2&&sie==2&&cin==0){
                                cinco.setBackgroundResource(R.drawable.x);
                                cinco.setEnabled(false);
                                cin=2;
                                textoTurno.setText("ES TU TURNO");
                                colocar=1;
                            }

                        }

                        //*********** SE DUERME *****************
                        try {
                            sleep(500);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }

                        if(colocar==0){
                            //***********PRIMER GOLPE **************
                            if(cin==0){
                                cinco.setBackgroundResource(R.drawable.x);
                                cinco.setEnabled(false);
                                cin=2;
                                textoTurno.setText("ES TU TURNO");
                                colocar=1;
                            }else if(cin==1&&un==0){
                                uno.setBackgroundResource(R.drawable.x);
                                uno.setEnabled(false);
                                un=2;
                                textoTurno.setText("ES TU TURNO");
                                colocar=1;
                            }else if(cin==1&&doss==0){
                                dos.setBackgroundResource(R.drawable.x);
                                dos.setEnabled(false);
                                doss=2;
                                textoTurno.setText("ES TU TURNO");
                                colocar=1;
                            }else if(cin==1&&tre==0){
                                tres.setBackgroundResource(R.drawable.x);
                                tres.setEnabled(false);
                                tre=2;
                                textoTurno.setText("ES TU TURNO");
                                colocar=1;
                            }else if(cin==1&&cua==0){
                                cuatro.setBackgroundResource(R.drawable.x);
                                cuatro.setEnabled(false);
                                cua=2;
                                textoTurno.setText("ES TU TURNO");
                                colocar=1;
                            }else if(cin==1&&cin==0){
                                cinco.setBackgroundResource(R.drawable.x);
                                cinco.setEnabled(false);
                                cin=2;
                                textoTurno.setText("ES TU TURNO");
                                colocar=1;
                            }else if(cin==1&&sei==0){
                                seis.setBackgroundResource(R.drawable.x);
                                seis.setEnabled(false);
                                sei=2;
                                textoTurno.setText("ES TU TURNO");
                                colocar=1;
                            } else if(cin==1&&sie==0){
                                siete.setBackgroundResource(R.drawable.x);
                                siete.setEnabled(false);
                                sie=2;
                                textoTurno.setText("ES TU TURNO");
                                colocar=1;
                            }else if(cin==1&&och==0){
                                ocho.setBackgroundResource(R.drawable.x);
                                ocho.setEnabled(false);
                                och=2;
                                textoTurno.setText("ES TU TURNO");
                                colocar=1;
                            }else if(cin==1&&nue==0){
                                nueve.setBackgroundResource(R.drawable.x);
                                nueve.setEnabled(false);
                                nue=2;
                                textoTurno.setText("ES TU TURNO");
                                colocar=1;
                            }
                            //********VERIFICA SI GANAMOS************
                            if((un==2&&doss==2&&tre==2)||(cua==2&&cin==2&&sei==2)||(sie==2&&och==2&&nue==2)||(un==2&&cua==2&&och==2)||(doss==2&&cin==2&&och==2)||(tre==2&&sei==2&&nue==2)||(un==2&&cin==2&&nue==2)||(tre==2&&cin==2&&sie==2)){
                                AlertDialog.Builder alerta = new AlertDialog.Builder(MainActivity.this);
                                alerta.setTitle("HAS GANADO")
                                        .setMessage("Felicidades has ganada contra CPU")
                                        .setPositiveButton("ACEPTAR", new DialogInterface.OnClickListener() {
                                            @Override
                                            public void onClick(DialogInterface dialogInterface, int i) {

                                            }
                                        })
                                        .show();

                            }
                        }

                        //***********SEGUNDO GOLPE **************
                        if(cin==0){
                            cinco.setBackgroundResource(R.drawable.x);
                            cinco.setEnabled(false);
                            cin=2;
                            textoTurno.setText("ES TU TURNO");
                        }else if(cin==1&&un==0){
                            uno.setBackgroundResource(R.drawable.x);
                            uno.setEnabled(false);
                            un=2;
                            textoTurno.setText("ES TU TURNO");
                        }else if(cin==1&&doss==0){
                            dos.setBackgroundResource(R.drawable.x);
                            dos.setEnabled(false);
                            doss=2;
                            textoTurno.setText("ES TU TURNO");
                        }else if(cin==1&&tre==0){
                            tres.setBackgroundResource(R.drawable.x);
                            tres.setEnabled(false);
                            tre=2;
                            textoTurno.setText("ES TU TURNO");
                        }else if(cin==1&&cua==0){
                            cuatro.setBackgroundResource(R.drawable.x);
                            cuatro.setEnabled(false);
                            cua=2;
                            textoTurno.setText("ES TU TURNO");
                        }else if(cin==1&&cin==0){
                            cinco.setBackgroundResource(R.drawable.x);
                            cinco.setEnabled(false);
                            cin=2;
                            textoTurno.setText("ES TU TURNO");
                        }else if(cin==1&&sei==0){
                            seis.setBackgroundResource(R.drawable.x);
                            seis.setEnabled(false);
                            sei=2;
                            textoTurno.setText("ES TU TURNO");
                        } else if(cin==1&&sie==0){
                            siete.setBackgroundResource(R.drawable.x);
                            siete.setEnabled(false);
                            sie=2;
                            textoTurno.setText("ES TU TURNO");
                        }else if(cin==1&&och==0){
                            ocho.setBackgroundResource(R.drawable.x);
                            ocho.setEnabled(false);
                            och=2;
                            textoTurno.setText("ES TU TURNO");
                        }else if(cin==1&&nue==0){
                            nueve.setBackgroundResource(R.drawable.x);
                            nueve.setEnabled(false);
                            nue=2;
                            textoTurno.setText("ES TU TURNO");
                        }
                        //********VERIFICA SI GANAMOS************
                        if((un==2&&doss==2&&tre==2)||(cua==2&&cin==2&&sei==2)||(sie==2&&och==2&&nue==2)||(un==2&&cua==2&&och==2)||(doss==2&&cin==2&&och==2)||(tre==2&&sei==2&&nue==2)||(un==2&&cin==2&&nue==2)||(tre==2&&cin==2&&sie==2)){
                            AlertDialog.Builder alerta = new AlertDialog.Builder(MainActivity.this);
                            alerta.setTitle("HAS GANADO")
                                    .setMessage("Felicidades has ganada contra CPU")
                                    .setPositiveButton("ACEPTAR", new DialogInterface.OnClickListener() {
                                        @Override
                                        public void onClick(DialogInterface dialogInterface, int i) {

                                        }
                                    })
                                    .show();
                        }
                    }
                });
            }
        };
        //**************TERMINA HILO 7 ****************

        //**************INICIA HILO 8 ****************
        hilo8 = new Thread(){
            public void run() {
                runOnUiThread(new Runnable() {
                    @Override
                    public void run() {
                        try {
                            sleep(500);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }

                        int colocar=0;

                        //*************DEFIENDE HORIZONTAL************
                        if(un==1&&tre==1&&doss==0){
                            dos.setBackgroundResource(R.drawable.x);
                            dos.setEnabled(false);
                            doss=2;
                            textoTurno.setText("ES TU TURNO");
                            colocar=1;
                        }
                        if(cua==1&&sei==1&&cin==0){
                            cinco.setBackgroundResource(R.drawable.x);
                            cinco.setEnabled(false);
                            cin=2;
                            textoTurno.setText("ES TU TURNO");
                            colocar=1;
                        }
                        if(sei==1&&nue==1&&och==0){
                            siete.setBackgroundResource(R.drawable.x);
                            siete.setEnabled(false);
                            sie=2;
                            textoTurno.setText("ES TU TURNO");
                            colocar=1;
                        }
                        //*************DEFIENDE VERTICAL************
                        if(un==1&&sie==1&&cua==0){
                            cuatro.setBackgroundResource(R.drawable.x);
                            cuatro.setEnabled(false);
                            cua=2;
                            textoTurno.setText("ES TU TURNO");
                            colocar=1;
                        }
                        if(doss==1&&och==1&&cin==0){
                            cinco.setBackgroundResource(R.drawable.x);
                            cinco.setEnabled(false);
                            cin=2;
                            textoTurno.setText("ES TU TURNO");
                            colocar=1;
                        }
                        if(tre==1&&nue==1&&sei==0){
                            cuatro.setBackgroundResource(R.drawable.x);
                            cuatro.setEnabled(false);
                            cua=2;
                            textoTurno.setText("ES TU TURNO");
                            colocar=1;
                        }
                        //*************DEFIENDE DIAGONAL************
                        if(un==1&&nue==1&&cin==0){
                            cinco.setBackgroundResource(R.drawable.x);
                            cinco.setEnabled(false);
                            cin=2;
                            textoTurno.setText("ES TU TURNO");
                            colocar=1;
                        }
                        if(tre==1&&sie==1&&cin==0){
                            cinco.setBackgroundResource(R.drawable.x);
                            cinco.setEnabled(false);
                            cin=2;
                            textoTurno.setText("ES TU TURNO");
                            colocar=1;
                        }
                        //********VERIFICA SI GANAMOS************
                        if((un==2&&doss==2&&tre==2)||(cua==2&&cin==2&&sei==2)||(sie==2&&och==2&&nue==2)||(un==2&&cua==2&&och==2)||(doss==2&&cin==2&&och==2)||(tre==2&&sei==2&&nue==2)||(un==2&&cin==2&&nue==2)||(tre==2&&cin==2&&sie==2)){
                            AlertDialog.Builder alerta = new AlertDialog.Builder(MainActivity.this);
                            alerta.setTitle("HAS GANADO")
                                    .setMessage("Felicidades has ganada contra CPU")
                                    .setPositiveButton("ACEPTAR", new DialogInterface.OnClickListener() {
                                        @Override
                                        public void onClick(DialogInterface dialogInterface, int i) {

                                        }
                                    })
                                    .show();

                        }


                        if(colocar==0){
                            //*************ATACA HORIZONTAL************
                            if(un==2&&tre==2&&doss==0){
                                dos.setBackgroundResource(R.drawable.x);
                                dos.setEnabled(false);
                                doss=2;
                                textoTurno.setText("ES TU TURNO");
                                colocar=1;
                            }
                            if(cua==2&&sei==2&&cin==0){
                                cinco.setBackgroundResource(R.drawable.x);
                                cinco.setEnabled(false);
                                cin=2;
                                textoTurno.setText("ES TU TURNO");
                                colocar=1;
                            }
                            if(sei==2&&nue==2&&och==0){
                                siete.setBackgroundResource(R.drawable.x);
                                siete.setEnabled(false);
                                sie=2;
                                textoTurno.setText("ES TU TURNO");
                                colocar=1;
                            }
                            //*************ATACA VERTICAL************
                            if(un==2&&sie==2&&cua==0){
                                cuatro.setBackgroundResource(R.drawable.x);
                                cuatro.setEnabled(false);
                                cua=2;
                                textoTurno.setText("ES TU TURNO");
                                colocar=1;
                            }
                            if(doss==2&&och==2&&cin==0){
                                cinco.setBackgroundResource(R.drawable.x);
                                cinco.setEnabled(false);
                                cin=2;
                                textoTurno.setText("ES TU TURNO");
                                colocar=1;
                            }
                            if(tre==2&&nue==2&&sei==0){
                                cuatro.setBackgroundResource(R.drawable.x);
                                cuatro.setEnabled(false);
                                cua=2;
                                textoTurno.setText("ES TU TURNO");
                                colocar=1;
                            }
                            //*************ATACA DIAGONAL************
                            if(un==2&&nue==2&&cin==0){
                                cinco.setBackgroundResource(R.drawable.x);
                                cinco.setEnabled(false);
                                cin=2;
                                textoTurno.setText("ES TU TURNO");
                                colocar=1;
                            }
                            if(tre==2&&sie==2&&cin==0){
                                cinco.setBackgroundResource(R.drawable.x);
                                cinco.setEnabled(false);
                                cin=2;
                                textoTurno.setText("ES TU TURNO");
                                colocar=1;
                            }

                        }

                        //*********** SE DUERME *****************
                        try {
                            sleep(500);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }

                        if(colocar==0){
                            //***********PRIMER GOLPE **************
                            if(cin==0){
                                cinco.setBackgroundResource(R.drawable.x);
                                cinco.setEnabled(false);
                                cin=2;
                                textoTurno.setText("ES TU TURNO");
                                colocar=1;
                            }else if(cin==1&&un==0){
                                uno.setBackgroundResource(R.drawable.x);
                                uno.setEnabled(false);
                                un=2;
                                textoTurno.setText("ES TU TURNO");
                                colocar=1;
                            }else if(cin==1&&doss==0){
                                dos.setBackgroundResource(R.drawable.x);
                                dos.setEnabled(false);
                                doss=2;
                                textoTurno.setText("ES TU TURNO");
                                colocar=1;
                            }else if(cin==1&&tre==0){
                                tres.setBackgroundResource(R.drawable.x);
                                tres.setEnabled(false);
                                tre=2;
                                textoTurno.setText("ES TU TURNO");
                                colocar=1;
                            }else if(cin==1&&cua==0){
                                cuatro.setBackgroundResource(R.drawable.x);
                                cuatro.setEnabled(false);
                                cua=2;
                                textoTurno.setText("ES TU TURNO");
                                colocar=1;
                            }else if(cin==1&&cin==0){
                                cinco.setBackgroundResource(R.drawable.x);
                                cinco.setEnabled(false);
                                cin=2;
                                textoTurno.setText("ES TU TURNO");
                                colocar=1;
                            }else if(cin==1&&sei==0){
                                seis.setBackgroundResource(R.drawable.x);
                                seis.setEnabled(false);
                                sei=2;
                                textoTurno.setText("ES TU TURNO");
                                colocar=1;
                            } else if(cin==1&&sie==0){
                                siete.setBackgroundResource(R.drawable.x);
                                siete.setEnabled(false);
                                sie=2;
                                textoTurno.setText("ES TU TURNO");
                                colocar=1;
                            }else if(cin==1&&och==0){
                                ocho.setBackgroundResource(R.drawable.x);
                                ocho.setEnabled(false);
                                och=2;
                                textoTurno.setText("ES TU TURNO");
                                colocar=1;
                            }else if(cin==1&&nue==0){
                                nueve.setBackgroundResource(R.drawable.x);
                                nueve.setEnabled(false);
                                nue=2;
                                textoTurno.setText("ES TU TURNO");
                                colocar=1;
                            }
                            //********VERIFICA SI GANAMOS************
                            if((un==2&&doss==2&&tre==2)||(cua==2&&cin==2&&sei==2)||(sie==2&&och==2&&nue==2)||(un==2&&cua==2&&och==2)||(doss==2&&cin==2&&och==2)||(tre==2&&sei==2&&nue==2)||(un==2&&cin==2&&nue==2)||(tre==2&&cin==2&&sie==2)){
                                AlertDialog.Builder alerta = new AlertDialog.Builder(MainActivity.this);
                                alerta.setTitle("HAS GANADO")
                                        .setMessage("Felicidades has ganada contra CPU")
                                        .setPositiveButton("ACEPTAR", new DialogInterface.OnClickListener() {
                                            @Override
                                            public void onClick(DialogInterface dialogInterface, int i) {

                                            }
                                        })
                                        .show();

                            }
                        }

                        //***********SEGUNDO GOLPE **************
                        if(cin==0){
                            cinco.setBackgroundResource(R.drawable.x);
                            cinco.setEnabled(false);
                            cin=2;
                            textoTurno.setText("ES TU TURNO");
                        }else if(cin==1&&un==0){
                            uno.setBackgroundResource(R.drawable.x);
                            uno.setEnabled(false);
                            un=2;
                            textoTurno.setText("ES TU TURNO");
                        }else if(cin==1&&doss==0){
                            dos.setBackgroundResource(R.drawable.x);
                            dos.setEnabled(false);
                            doss=2;
                            textoTurno.setText("ES TU TURNO");
                        }else if(cin==1&&tre==0){
                            tres.setBackgroundResource(R.drawable.x);
                            tres.setEnabled(false);
                            tre=2;
                            textoTurno.setText("ES TU TURNO");
                        }else if(cin==1&&cua==0){
                            cuatro.setBackgroundResource(R.drawable.x);
                            cuatro.setEnabled(false);
                            cua=2;
                            textoTurno.setText("ES TU TURNO");
                        }else if(cin==1&&cin==0){
                            cinco.setBackgroundResource(R.drawable.x);
                            cinco.setEnabled(false);
                            cin=2;
                            textoTurno.setText("ES TU TURNO");
                        }else if(cin==1&&sei==0){
                            seis.setBackgroundResource(R.drawable.x);
                            seis.setEnabled(false);
                            sei=2;
                            textoTurno.setText("ES TU TURNO");
                        } else if(cin==1&&sie==0){
                            siete.setBackgroundResource(R.drawable.x);
                            siete.setEnabled(false);
                            sie=2;
                            textoTurno.setText("ES TU TURNO");
                        }else if(cin==1&&och==0){
                            ocho.setBackgroundResource(R.drawable.x);
                            ocho.setEnabled(false);
                            och=2;
                            textoTurno.setText("ES TU TURNO");
                        }else if(cin==1&&nue==0){
                            nueve.setBackgroundResource(R.drawable.x);
                            nueve.setEnabled(false);
                            nue=2;
                            textoTurno.setText("ES TU TURNO");
                        }
                        //********VERIFICA SI GANAMOS************
                        if((un==2&&doss==2&&tre==2)||(cua==2&&cin==2&&sei==2)||(sie==2&&och==2&&nue==2)||(un==2&&cua==2&&och==2)||(doss==2&&cin==2&&och==2)||(tre==2&&sei==2&&nue==2)||(un==2&&cin==2&&nue==2)||(tre==2&&cin==2&&sie==2)){
                            AlertDialog.Builder alerta = new AlertDialog.Builder(MainActivity.this);
                            alerta.setTitle("HAS GANADO")
                                    .setMessage("Felicidades has ganada contra CPU")
                                    .setPositiveButton("ACEPTAR", new DialogInterface.OnClickListener() {
                                        @Override
                                        public void onClick(DialogInterface dialogInterface, int i) {

                                        }
                                    })
                                    .show();
                        }
                    }
                });
            }
        };
        //**************TERMINA HILO 8 ****************

        //**************INICIA HILO 9 ****************
        hilo9 = new Thread(){
            public void run() {
                runOnUiThread(new Runnable() {
                    @Override
                    public void run() {
                        try {
                            sleep(500);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }

                        int colocar=0;

                        //*************DEFIENDE HORIZONTAL************
                        if(un==1&&tre==1&&doss==0){
                            dos.setBackgroundResource(R.drawable.x);
                            dos.setEnabled(false);
                            doss=2;
                            textoTurno.setText("ES TU TURNO");
                            colocar=1;
                        }
                        if(cua==1&&sei==1&&cin==0){
                            cinco.setBackgroundResource(R.drawable.x);
                            cinco.setEnabled(false);
                            cin=2;
                            textoTurno.setText("ES TU TURNO");
                            colocar=1;
                        }
                        if(sei==1&&nue==1&&och==0){
                            siete.setBackgroundResource(R.drawable.x);
                            siete.setEnabled(false);
                            sie=2;
                            textoTurno.setText("ES TU TURNO");
                            colocar=1;
                        }
                        //*************DEFIENDE VERTICAL************
                        if(un==1&&sie==1&&cua==0){
                            cuatro.setBackgroundResource(R.drawable.x);
                            cuatro.setEnabled(false);
                            cua=2;
                            textoTurno.setText("ES TU TURNO");
                            colocar=1;
                        }
                        if(doss==1&&och==1&&cin==0){
                            cinco.setBackgroundResource(R.drawable.x);
                            cinco.setEnabled(false);
                            cin=2;
                            textoTurno.setText("ES TU TURNO");
                            colocar=1;
                        }
                        if(tre==1&&nue==1&&sei==0){
                            cuatro.setBackgroundResource(R.drawable.x);
                            cuatro.setEnabled(false);
                            cua=2;
                            textoTurno.setText("ES TU TURNO");
                            colocar=1;
                        }
                        //*************DEFIENDE DIAGONAL************
                        if(un==1&&nue==1&&cin==0){
                            cinco.setBackgroundResource(R.drawable.x);
                            cinco.setEnabled(false);
                            cin=2;
                            textoTurno.setText("ES TU TURNO");
                            colocar=1;
                        }
                        if(tre==1&&sie==1&&cin==0){
                            cinco.setBackgroundResource(R.drawable.x);
                            cinco.setEnabled(false);
                            cin=2;
                            textoTurno.setText("ES TU TURNO");
                            colocar=1;
                        }
                        //********VERIFICA SI GANAMOS************
                        if((un==2&&doss==2&&tre==2)||(cua==2&&cin==2&&sei==2)||(sie==2&&och==2&&nue==2)||(un==2&&cua==2&&och==2)||(doss==2&&cin==2&&och==2)||(tre==2&&sei==2&&nue==2)||(un==2&&cin==2&&nue==2)||(tre==2&&cin==2&&sie==2)){
                            AlertDialog.Builder alerta = new AlertDialog.Builder(MainActivity.this);
                            alerta.setTitle("HAS GANADO")
                                    .setMessage("Felicidades has ganada contra CPU")
                                    .setPositiveButton("ACEPTAR", new DialogInterface.OnClickListener() {
                                        @Override
                                        public void onClick(DialogInterface dialogInterface, int i) {

                                        }
                                    })
                                    .show();

                        }


                        if(colocar==0){
                            //*************ATACA HORIZONTAL************
                            if(un==2&&tre==2&&doss==0){
                                dos.setBackgroundResource(R.drawable.x);
                                dos.setEnabled(false);
                                doss=2;
                                textoTurno.setText("ES TU TURNO");
                                colocar=1;
                            }
                            if(cua==2&&sei==2&&cin==0){
                                cinco.setBackgroundResource(R.drawable.x);
                                cinco.setEnabled(false);
                                cin=2;
                                textoTurno.setText("ES TU TURNO");
                                colocar=1;
                            }
                            if(sei==2&&nue==2&&och==0){
                                siete.setBackgroundResource(R.drawable.x);
                                siete.setEnabled(false);
                                sie=2;
                                textoTurno.setText("ES TU TURNO");
                                colocar=1;
                            }
                            //*************ATACA VERTICAL************
                            if(un==2&&sie==2&&cua==0){
                                cuatro.setBackgroundResource(R.drawable.x);
                                cuatro.setEnabled(false);
                                cua=2;
                                textoTurno.setText("ES TU TURNO");
                                colocar=1;
                            }
                            if(doss==2&&och==2&&cin==0){
                                cinco.setBackgroundResource(R.drawable.x);
                                cinco.setEnabled(false);
                                cin=2;
                                textoTurno.setText("ES TU TURNO");
                                colocar=1;
                            }
                            if(tre==2&&nue==2&&sei==0){
                                cuatro.setBackgroundResource(R.drawable.x);
                                cuatro.setEnabled(false);
                                cua=2;
                                textoTurno.setText("ES TU TURNO");
                                colocar=1;
                            }
                            //*************ATACA DIAGONAL************
                            if(un==2&&nue==2&&cin==0){
                                cinco.setBackgroundResource(R.drawable.x);
                                cinco.setEnabled(false);
                                cin=2;
                                textoTurno.setText("ES TU TURNO");
                                colocar=1;
                            }
                            if(tre==2&&sie==2&&cin==0){
                                cinco.setBackgroundResource(R.drawable.x);
                                cinco.setEnabled(false);
                                cin=2;
                                textoTurno.setText("ES TU TURNO");
                                colocar=1;
                            }

                        }

                        //*********** SE DUERME *****************
                        try {
                            sleep(500);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }

                        if(colocar==0){
                            //***********PRIMER GOLPE **************
                            if(cin==0){
                                cinco.setBackgroundResource(R.drawable.x);
                                cinco.setEnabled(false);
                                cin=2;
                                textoTurno.setText("ES TU TURNO");
                                colocar=1;
                            }else if(cin==1&&un==0){
                                uno.setBackgroundResource(R.drawable.x);
                                uno.setEnabled(false);
                                un=2;
                                textoTurno.setText("ES TU TURNO");
                                colocar=1;
                            }else if(cin==1&&doss==0){
                                dos.setBackgroundResource(R.drawable.x);
                                dos.setEnabled(false);
                                doss=2;
                                textoTurno.setText("ES TU TURNO");
                                colocar=1;
                            }else if(cin==1&&tre==0){
                                tres.setBackgroundResource(R.drawable.x);
                                tres.setEnabled(false);
                                tre=2;
                                textoTurno.setText("ES TU TURNO");
                                colocar=1;
                            }else if(cin==1&&cua==0){
                                cuatro.setBackgroundResource(R.drawable.x);
                                cuatro.setEnabled(false);
                                cua=2;
                                textoTurno.setText("ES TU TURNO");
                                colocar=1;
                            }else if(cin==1&&cin==0){
                                cinco.setBackgroundResource(R.drawable.x);
                                cinco.setEnabled(false);
                                cin=2;
                                textoTurno.setText("ES TU TURNO");
                                colocar=1;
                            }else if(cin==1&&sei==0){
                                seis.setBackgroundResource(R.drawable.x);
                                seis.setEnabled(false);
                                sei=2;
                                textoTurno.setText("ES TU TURNO");
                                colocar=1;
                            } else if(cin==1&&sie==0){
                                siete.setBackgroundResource(R.drawable.x);
                                siete.setEnabled(false);
                                sie=2;
                                textoTurno.setText("ES TU TURNO");
                                colocar=1;
                            }else if(cin==1&&och==0){
                                ocho.setBackgroundResource(R.drawable.x);
                                ocho.setEnabled(false);
                                och=2;
                                textoTurno.setText("ES TU TURNO");
                                colocar=1;
                            }else if(cin==1&&nue==0){
                                nueve.setBackgroundResource(R.drawable.x);
                                nueve.setEnabled(false);
                                nue=2;
                                textoTurno.setText("ES TU TURNO");
                                colocar=1;
                            }
                            //********VERIFICA SI GANAMOS************
                            if((un==2&&doss==2&&tre==2)||(cua==2&&cin==2&&sei==2)||(sie==2&&och==2&&nue==2)||(un==2&&cua==2&&och==2)||(doss==2&&cin==2&&och==2)||(tre==2&&sei==2&&nue==2)||(un==2&&cin==2&&nue==2)||(tre==2&&cin==2&&sie==2)){
                                AlertDialog.Builder alerta = new AlertDialog.Builder(MainActivity.this);
                                alerta.setTitle("HAS GANADO")
                                        .setMessage("Felicidades has ganada contra CPU")
                                        .setPositiveButton("ACEPTAR", new DialogInterface.OnClickListener() {
                                            @Override
                                            public void onClick(DialogInterface dialogInterface, int i) {

                                            }
                                        })
                                        .show();

                            }
                        }

                        //***********SEGUNDO GOLPE **************
                        if(cin==0){
                            cinco.setBackgroundResource(R.drawable.x);
                            cinco.setEnabled(false);
                            cin=2;
                            textoTurno.setText("ES TU TURNO");
                        }else if(cin==1&&un==0){
                            uno.setBackgroundResource(R.drawable.x);
                            uno.setEnabled(false);
                            un=2;
                            textoTurno.setText("ES TU TURNO");
                        }else if(cin==1&&doss==0){
                            dos.setBackgroundResource(R.drawable.x);
                            dos.setEnabled(false);
                            doss=2;
                            textoTurno.setText("ES TU TURNO");
                        }else if(cin==1&&tre==0){
                            tres.setBackgroundResource(R.drawable.x);
                            tres.setEnabled(false);
                            tre=2;
                            textoTurno.setText("ES TU TURNO");
                        }else if(cin==1&&cua==0){
                            cuatro.setBackgroundResource(R.drawable.x);
                            cuatro.setEnabled(false);
                            cua=2;
                            textoTurno.setText("ES TU TURNO");
                        }else if(cin==1&&cin==0){
                            cinco.setBackgroundResource(R.drawable.x);
                            cinco.setEnabled(false);
                            cin=2;
                            textoTurno.setText("ES TU TURNO");
                        }else if(cin==1&&sei==0){
                            seis.setBackgroundResource(R.drawable.x);
                            seis.setEnabled(false);
                            sei=2;
                            textoTurno.setText("ES TU TURNO");
                        } else if(cin==1&&sie==0){
                            siete.setBackgroundResource(R.drawable.x);
                            siete.setEnabled(false);
                            sie=2;
                            textoTurno.setText("ES TU TURNO");
                        }else if(cin==1&&och==0){
                            ocho.setBackgroundResource(R.drawable.x);
                            ocho.setEnabled(false);
                            och=2;
                            textoTurno.setText("ES TU TURNO");
                        }else if(cin==1&&nue==0){
                            nueve.setBackgroundResource(R.drawable.x);
                            nueve.setEnabled(false);
                            nue=2;
                            textoTurno.setText("ES TU TURNO");
                        }
                        //********VERIFICA SI GANAMOS************
                        if((un==2&&doss==2&&tre==2)||(cua==2&&cin==2&&sei==2)||(sie==2&&och==2&&nue==2)||(un==2&&cua==2&&och==2)||(doss==2&&cin==2&&och==2)||(tre==2&&sei==2&&nue==2)||(un==2&&cin==2&&nue==2)||(tre==2&&cin==2&&sie==2)){
                            AlertDialog.Builder alerta = new AlertDialog.Builder(MainActivity.this);
                            alerta.setTitle("HAS GANADO")
                                    .setMessage("Felicidades has ganada contra CPU")
                                    .setPositiveButton("ACEPTAR", new DialogInterface.OnClickListener() {
                                        @Override
                                        public void onClick(DialogInterface dialogInterface, int i) {

                                        }
                                    })
                                    .show();
                        }
                    }
                });
            }
        };
        //**************TERMINA HILO 9 ****************





















        //************** OYENTES DE LOS BOTONES *******

        //************** OYENTES BOTON 1 *******
        uno.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                uno.setBackgroundResource(R.drawable.o);
                un=1;
                uno.setEnabled(false);
                //verificamos si perdemos
                if((un==1&&doss==1&&tre==1)||(cua==1&&cin==1&&sei==1)||(sie==1&&och==1&&nue==1)||(un==1&&cua==1&&och==1)||(doss==1&&cin==1&&och==1)||(tre==1&&sei==1&&nue==1)||(un==1&&cin==1&&nue==1)||(tre==1&&cin==1&&sie==1)){
                    AlertDialog.Builder alerta = new AlertDialog.Builder(MainActivity.this);
                    alerta.setTitle("HAS GANADO")
                            .setMessage("Felicidades has ganada contra CPU")
                            .setPositiveButton("ACEPTAR", new DialogInterface.OnClickListener() {
                                @Override
                                public void onClick(DialogInterface dialogInterface, int i) {

                                }
                            })
                            .show();

                }
                textoTurno.setText("ES TURNO DE CPU");
                hilo1.start();

            }
        });

        //************** OYENTES BOTON 2 *******
        dos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dos.setBackgroundResource(R.drawable.o);
                doss=1;
                dos.setEnabled(false);
                //verificamos si perdemos
                if((un==1&&doss==1&&tre==1)||(cua==1&&cin==1&&sei==1)||(sie==1&&och==1&&nue==1)||(un==1&&cua==1&&och==1)||(doss==1&&cin==1&&och==1)||(tre==1&&sei==1&&nue==1)||(un==1&&cin==1&&nue==1)||(tre==1&&cin==1&&sie==1)){
                    AlertDialog.Builder alerta = new AlertDialog.Builder(MainActivity.this);
                    alerta.setTitle("HAS GANADO")
                            .setMessage("Felicidades has ganada contra CPU")
                            .setPositiveButton("ACEPTAR", new DialogInterface.OnClickListener() {
                                @Override
                                public void onClick(DialogInterface dialogInterface, int i) {

                                }
                            })
                            .show();

                }
                textoTurno.setText("ES TURNO DE CPU");
                hilo2.start();

            }
        });

        //************** OYENTES BOTON 3 *******
        tres.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tres.setBackgroundResource(R.drawable.o);
                tre=1;
                tres.setEnabled(false);
                //verificamos si perdemos
                if((un==1&&doss==1&&tre==1)||(cua==1&&cin==1&&sei==1)||(sie==1&&och==1&&nue==1)||(un==1&&cua==1&&och==1)||(doss==1&&cin==1&&och==1)||(tre==1&&sei==1&&nue==1)||(un==1&&cin==1&&nue==1)||(tre==1&&cin==1&&sie==1)){
                    AlertDialog.Builder alerta = new AlertDialog.Builder(MainActivity.this);
                    alerta.setTitle("HAS GANADO")
                            .setMessage("Felicidades has ganada contra CPU")
                            .setPositiveButton("ACEPTAR", new DialogInterface.OnClickListener() {
                                @Override
                                public void onClick(DialogInterface dialogInterface, int i) {

                                }
                            })
                            .show();

                }
                textoTurno.setText("ES TURNO DE CPU");
                hilo3.start();

            }
        });

        //************** OYENTES BOTON 4 *******
        cuatro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                cuatro.setBackgroundResource(R.drawable.o);
                cua=1;
                cuatro.setEnabled(false);
                //verificamos si perdemos
                if((un==1&&doss==1&&tre==1)||(cua==1&&cin==1&&sei==1)||(sie==1&&och==1&&nue==1)||(un==1&&cua==1&&och==1)||(doss==1&&cin==1&&och==1)||(tre==1&&sei==1&&nue==1)||(un==1&&cin==1&&nue==1)||(tre==1&&cin==1&&sie==1)){
                    AlertDialog.Builder alerta = new AlertDialog.Builder(MainActivity.this);
                    alerta.setTitle("HAS GANADO")
                            .setMessage("Felicidades has ganada contra CPU")
                            .setPositiveButton("ACEPTAR", new DialogInterface.OnClickListener() {
                                @Override
                                public void onClick(DialogInterface dialogInterface, int i) {

                                }
                            })
                            .show();

                }
                textoTurno.setText("ES TURNO DE CPU");
                hilo4.start();

            }
        });

        //************** OYENTES BOTON 5 *******
        cinco.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                cinco.setBackgroundResource(R.drawable.o);
                cin=1;
                cinco.setEnabled(false);
                //verificamos si perdemos
                if((un==1&&doss==1&&tre==1)||(cua==1&&cin==1&&sei==1)||(sie==1&&och==1&&nue==1)||(un==1&&cua==1&&och==1)||(doss==1&&cin==1&&och==1)||(tre==1&&sei==1&&nue==1)||(un==1&&cin==1&&nue==1)||(tre==1&&cin==1&&sie==1)){
                    AlertDialog.Builder alerta = new AlertDialog.Builder(MainActivity.this);
                    alerta.setTitle("HAS GANADO")
                            .setMessage("Felicidades has ganada contra CPU")
                            .setPositiveButton("ACEPTAR", new DialogInterface.OnClickListener() {
                                @Override
                                public void onClick(DialogInterface dialogInterface, int i) {

                                }
                            })
                            .show();

                }
                textoTurno.setText("ES TURNO DE CPU");
                hilo5.start();

            }
        });

        //************** OYENTES BOTON 6 *******
        seis.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                seis.setBackgroundResource(R.drawable.o);
                sei=1;
                seis.setEnabled(false);
                //verificamos si perdemos
                if((un==1&&doss==1&&tre==1)||(cua==1&&cin==1&&sei==1)||(sie==1&&och==1&&nue==1)||(un==1&&cua==1&&och==1)||(doss==1&&cin==1&&och==1)||(tre==1&&sei==1&&nue==1)||(un==1&&cin==1&&nue==1)||(tre==1&&cin==1&&sie==1)){
                    AlertDialog.Builder alerta = new AlertDialog.Builder(MainActivity.this);
                    alerta.setTitle("HAS GANADO")
                            .setMessage("Felicidades has ganada contra CPU")
                            .setPositiveButton("ACEPTAR", new DialogInterface.OnClickListener() {
                                @Override
                                public void onClick(DialogInterface dialogInterface, int i) {

                                }
                            })
                            .show();

                }
                textoTurno.setText("ES TURNO DE CPU");
                hilo6.start();

            }
        });

        //************** OYENTES BOTON 7 *******
        siete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                siete.setBackgroundResource(R.drawable.o);
                sie=1;
                siete.setEnabled(false);
                //verificamos si perdemos
                if((un==1&&doss==1&&tre==1)||(cua==1&&cin==1&&sei==1)||(sie==1&&och==1&&nue==1)||(un==1&&cua==1&&och==1)||(doss==1&&cin==1&&och==1)||(tre==1&&sei==1&&nue==1)||(un==1&&cin==1&&nue==1)||(tre==1&&cin==1&&sie==1)){
                    AlertDialog.Builder alerta = new AlertDialog.Builder(MainActivity.this);
                    alerta.setTitle("HAS GANADO")
                            .setMessage("Felicidades has ganada contra CPU")
                            .setPositiveButton("ACEPTAR", new DialogInterface.OnClickListener() {
                                @Override
                                public void onClick(DialogInterface dialogInterface, int i) {

                                }
                            })
                            .show();

                }
                textoTurno.setText("ES TURNO DE CPU");
                hilo7.start();

            }
        });

        //************** OYENTES BOTON 8 *******
        ocho.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ocho.setBackgroundResource(R.drawable.o);
                och=1;
                ocho.setEnabled(false);
                //verificamos si perdemos
                if((un==1&&doss==1&&tre==1)||(cua==1&&cin==1&&sei==1)||(sie==1&&och==1&&nue==1)||(un==1&&cua==1&&och==1)||(doss==1&&cin==1&&och==1)||(tre==1&&sei==1&&nue==1)||(un==1&&cin==1&&nue==1)||(tre==1&&cin==1&&sie==1)){
                    AlertDialog.Builder alerta = new AlertDialog.Builder(MainActivity.this);
                    alerta.setTitle("HAS GANADO")
                            .setMessage("Felicidades has ganada contra CPU")
                            .setPositiveButton("ACEPTAR", new DialogInterface.OnClickListener() {
                                @Override
                                public void onClick(DialogInterface dialogInterface, int i) {

                                }
                            })
                            .show();

                }
                textoTurno.setText("ES TURNO DE CPU");
                hilo8.start();

            }
        });

        //************** OYENTES BOTON 9 *******
        nueve.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                nueve.setBackgroundResource(R.drawable.o);
                nue=1;
                nueve.setEnabled(false);
                //verificamos si perdemos
                if((un==1&&doss==1&&tre==1)||(cua==1&&cin==1&&sei==1)||(sie==1&&och==1&&nue==1)||(un==1&&cua==1&&och==1)||(doss==1&&cin==1&&och==1)||(tre==1&&sei==1&&nue==1)||(un==1&&cin==1&&nue==1)||(tre==1&&cin==1&&sie==1)){
                    AlertDialog.Builder alerta = new AlertDialog.Builder(MainActivity.this);
                    alerta.setTitle("HAS GANADO")
                            .setMessage("Felicidades has ganada contra CPU")
                            .setPositiveButton("ACEPTAR", new DialogInterface.OnClickListener() {
                                @Override
                                public void onClick(DialogInterface dialogInterface, int i) {

                                }
                            })
                            .show();

                }
                textoTurno.setText("ES TURNO DE CPU");
                hilo9.start();

            }
        });



    }
}
