package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.graphics.Color;
import android.os.Bundle;
import android.os.Vibrator;
import android.view.SoundEffectConstants;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.media.AudioManager;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    double SumRestV = 0.0;
    double SumRest = 0.0;
    int AmouDecksN = 0;
    int AmouDecks = 0;
    int AmouTen = 0;
    int CardC = 0;
    int CardP = 0;
    boolean PCard = false;
    boolean PGame = false;

    public void AD(View v){
        EditText e1 = (EditText)findViewById(R.id.et);
        String text = e1.getText().toString();
        if (!text.equals("") && !text.isEmpty())
        {
            v.playSoundEffect(SoundEffectConstants.CLICK);
            Vibrator vibe = (Vibrator) getSystemService (Context.VIBRATOR_SERVICE);
            vibe.vibrate (50);
            AmouDecksN = Integer.parseInt(text);
            AmouDecks = AmouDecksN;
            TextView l2 = (TextView)findViewById(R.id.l2);
            l2.setText(Integer.toString(AmouDecksN*4));
            TextView l3 = (TextView)findViewById(R.id.l3);
            l3.setText(Integer.toString(AmouDecksN*4));
            TextView l4 = (TextView)findViewById(R.id.l4);
            l4.setText(Integer.toString(AmouDecksN*4));
            TextView l5 = (TextView)findViewById(R.id.l5);
            l5.setText(Integer.toString(AmouDecksN*4));
            TextView l6 = (TextView)findViewById(R.id.l6);
            l6.setText(Integer.toString(AmouDecksN*4));
            TextView l7 = (TextView)findViewById(R.id.l7);
            l7.setText(Integer.toString(AmouDecksN*4));
            TextView l8 = (TextView)findViewById(R.id.l8);
            l8.setText(Integer.toString(AmouDecksN*4));
            TextView l9 = (TextView)findViewById(R.id.l9);
            l9.setText(Integer.toString(AmouDecksN*4));
            TextView l10 = (TextView)findViewById(R.id.l10);
            l10.setText(String.format("%d   %d", AmouDecksN * 4, AmouDecksN * 4));
            TextView l11 = (TextView)findViewById(R.id.l11);
            l11.setText(String.format("%d   %d", AmouDecksN * 4, AmouDecksN * 4));
            TextView lA = (TextView)findViewById(R.id.lA);
            lA.setText(Integer.toString(AmouDecksN*4));
            SumRest = 52 * AmouDecksN;
            SumRestV = SumRest * 40/52;
            TextView CoP = (TextView)findViewById(R.id.CoP);
            CoP.setText("0");
            TextView Co = (TextView)findViewById(R.id.Co);
            Co.setText("0");
            TextView AmDe = (TextView)findViewById(R.id.AmDe);
            AmDe.setText("0");
            TextView BaCa = (TextView)findViewById(R.id.BaCa);
            BaCa.setText("0");
            TextView BaCaP = (TextView)findViewById(R.id.BaCaP);
            BaCaP.setText("0");
            TextView BaCaN = (TextView)findViewById(R.id.BaCaN);
            BaCaN.setText("0");
            TextView BaCaNP = (TextView)findViewById(R.id.BaCaNP);
            BaCaNP.setText("0");
            TextView GoCa = (TextView)findViewById(R.id.GoCa);
            GoCa.setText("0");
            TextView GoCaP = (TextView)findViewById(R.id.GoCaP);
            GoCaP.setText("0");
            TextView GoCaN = (TextView)findViewById(R.id.GoCaN);
            GoCaN.setText("0");
            TextView GoCaNP = (TextView)findViewById(R.id.GoCaNP);
            GoCaNP.setText("0");
            TextView BaCaSC = (TextView)findViewById(R.id.BaCaSC);
            BaCaSC.setText("0");
            TextView BaCaSP = (TextView)findViewById(R.id.BaCaSP);
            BaCaSP.setText("0");
            TextView BaCaSPP = (TextView)findViewById(R.id.BaCaSPP);
            BaCaSPP.setText("0");
            TextView GoCaSC = (TextView)findViewById(R.id.GoCaSC);
            GoCaSC.setText("0");
            TextView GoCaSP = (TextView)findViewById(R.id.GoCaSP);
            GoCaSP.setText("0");
            TextView GoCaSPP = (TextView)findViewById(R.id.GoCaSPP);
            GoCaSPP.setText("0");
            TextView Co1 = (TextView)findViewById(R.id.Co1);
            Co1.setText("0");
            TextView Co2 = (TextView)findViewById(R.id.Co2);
            Co2.setText("0");
            TextView Co3 = (TextView)findViewById(R.id.Co3);
            Co3.setText("0");
            AmouTen = AmouDecksN*16;
            TextView BW = (TextView)findViewById(R.id.BW);
            BW.setText("0");
            TextView BL = (TextView)findViewById(R.id.BL);
            BL.setText("0");
            TextView l = (TextView)findViewById(R.id.lS);
            TextView l1 = (TextView)findViewById(R.id.lS1);
            l2 = (TextView)findViewById(R.id.lS2);
            l3 = (TextView)findViewById(R.id.lS3);
            l4 = (TextView)findViewById(R.id.lS4);
            l5 = (TextView)findViewById(R.id.lS5);
            l6 = (TextView)findViewById(R.id.lS6);
            l7 = (TextView)findViewById(R.id.lS7);
            l8 = (TextView)findViewById(R.id.lS8);
            l9 = (TextView)findViewById(R.id.lS9);
            l.setText("0");
            l9.setText("0");
            l8.setText("0");
            l7.setText("0");
            l6.setText("0");
            l5.setText("0");
            l4.setText("0");
            l3.setText("0");
            l2.setText("0");
            l1.setText("0");
        }

    }

    public void ChangeC(int CardC, int CardP, View v){
        Button B2 = (Button)findViewById(R.id.B2);
        Button B3 = (Button)findViewById(R.id.B3);
        Button B4 = (Button)findViewById(R.id.B4);
        Button B5 = (Button)findViewById(R.id.B5);
        Button B6 = (Button)findViewById(R.id.B6);
        Button B7 = (Button)findViewById(R.id.B7);
        Button B8 = (Button)findViewById(R.id.B8);
        Button B9 = (Button)findViewById(R.id.B9);
        Button B10 = (Button)findViewById(R.id.B10);
        Button BA = (Button)findViewById(R.id.A);
        B2.setBackgroundColor(Color.WHITE);
        B3.setBackgroundColor(Color.WHITE);
        B4.setBackgroundColor(Color.WHITE);
        B5.setBackgroundColor(Color.WHITE);
        B6.setBackgroundColor(Color.WHITE);
        B7.setBackgroundColor(Color.WHITE);
        B8.setBackgroundColor(Color.WHITE);
        B9.setBackgroundColor(Color.WHITE);
        B10.setBackgroundColor(Color.WHITE);
        BA.setBackgroundColor(Color.WHITE);
        v.playSoundEffect(SoundEffectConstants.CLICK);
        Vibrator vibe = (Vibrator) getSystemService (Context.VIBRATOR_SERVICE);
        vibe.vibrate (50);
        switch (CardP) {
            case 2:
                B2.setBackgroundColor(Color.YELLOW);
                break;
            case 3:
                B3.setBackgroundColor(Color.YELLOW);
                break;
            case 4:
                B4.setBackgroundColor(Color.YELLOW);
                break;
            case 5:
                B5.setBackgroundColor(Color.YELLOW);
                break;
            case 6:
                B6.setBackgroundColor(Color.YELLOW);
                break;
            case 7:
                B7.setBackgroundColor(Color.YELLOW);
                break;
            case 8:
                B8.setBackgroundColor(Color.YELLOW);
                break;
            case 9:
                B9.setBackgroundColor(Color.YELLOW);
                break;
            case 10:
                B10.setBackgroundColor(Color.YELLOW);
                break;
            case 11:
                BA.setBackgroundColor(Color.YELLOW);
                break;
            default:
                break;
        }
            switch (CardC) {
                case 2:
                    B2.setBackgroundColor(Color.parseColor("#00FFFF"));
                    break;
                case 3:
                    B3.setBackgroundColor(Color.parseColor("#00FFFF"));
                    break;
                case 4:
                    B4.setBackgroundColor(Color.parseColor("#00FFFF"));
                    break;
                case 5:
                    B5.setBackgroundColor(Color.parseColor("#00FFFF"));
                    break;
                case 6:
                    B6.setBackgroundColor(Color.parseColor("#00FFFF"));
                    break;
                case 7:
                    B7.setBackgroundColor(Color.parseColor("#00FFFF"));
                    break;
                case 8:
                    B8.setBackgroundColor(Color.parseColor("#00FFFF"));
                    break;
                case 9:
                    B9.setBackgroundColor(Color.parseColor("#00FFFF"));
                    break;
                case 10:
                    B10.setBackgroundColor(Color.parseColor("#00FFFF"));
                    break;
                case 11:
                    BA.setBackgroundColor(Color.parseColor("#00FFFF"));
                    break;
                default:
                    break;
            }
    }

    public void ChangeF(int Face, View v){
        Button B2 = (Button)findViewById(R.id.B12);
        Button B3 = (Button)findViewById(R.id.B13);
        Button B4 = (Button)findViewById(R.id.B14);
        Button B5 = (Button)findViewById(R.id.B15);
        Button B6 = (Button)findViewById(R.id.B16);
        Button B7 = (Button)findViewById(R.id.B17);
        B2.setBackgroundColor(Color.WHITE);
        B3.setBackgroundColor(Color.WHITE);
        B4.setBackgroundColor(Color.WHITE);
        B5.setBackgroundColor(Color.WHITE);
        B6.setBackgroundColor(Color.WHITE);
        B7.setBackgroundColor(Color.WHITE);
        v.playSoundEffect(SoundEffectConstants.CLICK);
        Vibrator vibe = (Vibrator) getSystemService (Context.VIBRATOR_SERVICE);
        vibe.vibrate (50);
        switch (Face) {
            case 12:
                B2.setBackgroundColor(Color.parseColor("#00FFFF"));
                break;
            case 13:
                B3.setBackgroundColor(Color.parseColor("#00FFFF"));
                break;
            case 14:
                B4.setBackgroundColor(Color.parseColor("#00FFFF"));
                break;
            case 15:
                B5.setBackgroundColor(Color.parseColor("#00FFFF"));
                break;
            case 16:
                B6.setBackgroundColor(Color.parseColor("#00FFFF"));
                break;
            case 17:
                B7.setBackgroundColor(Color.parseColor("#00FFFF"));
                break;
            default:
                break;
        }
    }

    public void FaceValue(View Button){
        if (AmouDecks != 0) {
            Button button = (Button)Button;

            int text = Integer.parseInt(button.getText().toString());
            ChangeF(text, Button);
            int BadCards = 0;
            switch (text) {
                case 17:
                    TextView l = (TextView)findViewById(R.id.l5);
                    BadCards = Integer.parseInt(l.getText().toString());
                case 16:
                    l = (TextView)findViewById(R.id.l6);
                    BadCards += Integer.parseInt(l.getText().toString());
                case 15:
                    l = (TextView)findViewById(R.id.l7);
                    BadCards += Integer.parseInt(l.getText().toString());
                case 14:
                    l = (TextView)findViewById(R.id.l8);
                    BadCards += Integer.parseInt(l.getText().toString());
                case 13:
                    l = (TextView)findViewById(R.id.l9);
                    BadCards += Integer.parseInt(l.getText().toString());
                case 12:
                    BadCards += AmouTen;
                default:
                    break;
            }
            TextView l = (TextView)findViewById(R.id.BaCa);
            l.setText(Integer.toString(BadCards));
            l = (TextView)findViewById(R.id.BaCaP);
            l.setText(Double.toString((double) Math.round(BadCards* 100 / SumRest*100)/100));
            l = (TextView)findViewById(R.id.GoCa);
            l.setText(Integer.toString((int) (SumRest - BadCards)));
            l = (TextView)findViewById(R.id.GoCaP);
            l.setText(Double.toString((double) Math.round(- BadCards* 100 / SumRest*100 + 10000)/100));
            switch (text) {
                case 17:
                    l = (TextView)findViewById(R.id.BaCaNP);
                    l.setText(Double.toString(69.23));
                    l = (TextView)findViewById(R.id.GoCaN);
                    l.setText((Integer.toString((int)Math.round(30.77/100 * SumRest))));
                    l = (TextView)findViewById(R.id.BaCaN);
                    l.setText((Integer.toString((int)Math.round(30.77/100 * SumRest))));
                    l = (TextView)findViewById(R.id.GoCaNP);
                    l.setText(Double.toString(30.65));
                    break;
                case 16:
                    l = (TextView)findViewById(R.id.BaCaNP);
                    l.setText(Double.toString(61.54));
                    l = (TextView)findViewById(R.id.GoCaN);
                    l.setText((Integer.toString((int) Math.round(38.46/100 * SumRest))));
                    l = (TextView)findViewById(R.id.BaCaN);
                    l.setText((Integer.toString((int) Math.round(61.54/100 * SumRest))));
                    l = (TextView)findViewById(R.id.GoCaNP);
                    l.setText(Double.toString(38.46));
                    break;
                case 15:
                    l = (TextView)findViewById(R.id.BaCaNP);
                    l.setText(Double.toString(53.85));
                    l = (TextView)findViewById(R.id.GoCaN);
                    l.setText((Integer.toString((int)Math.round(16.44/100 * SumRest))));
                    l = (TextView)findViewById(R.id.BaCaN);
                    l.setText((Integer.toString((int)Math.round(45.34/100 * SumRest))));
                    l = (TextView)findViewById(R.id.GoCaNP);
                    l.setText(Double.toString(46.15));
                    break;
                case 14:
                    l = (TextView)findViewById(R.id.BaCaNP);
                    l.setText(Double.toString(46.15));
                    l = (TextView)findViewById(R.id.GoCaN);
                    l.setText(Integer.toString((int)Math.round(51.23/100 * SumRest)));
                    l = (TextView)findViewById(R.id.BaCaN);
                    l.setText(Integer.toString((int)Math.round(32.32/100 * SumRest)));
                    l = (TextView)findViewById(R.id.GoCaNP);
                    l.setText(Double.toString(53.85));
                    break;
                case 13:
                    l = (TextView)findViewById(R.id.BaCaNP);
                    l.setText(Double.toString(38.46));
                    l = (TextView)findViewById(R.id.GoCaN);
                    l.setText(Integer.toString((int)Math.round(40.44/100 * SumRest)));
                    l = (TextView)findViewById(R.id.BaCaN);
                    l.setText(Integer.toString((int)Math.round(50.11/100 * SumRest)));
                    l = (TextView)findViewById(R.id.GoCaNP);
                    l.setText(Double.toString(61.54));
                    break;
                case 12:
                    l = (TextView)findViewById(R.id.BaCaNP);
                    l.setText(Double.toString(30.77));
                    l = (TextView)findViewById(R.id.GoCaN);
                    l.setText(Integer.toString((int)(Math.round(40.11/100 * SumRest))));
                    l = (TextView)findViewById(R.id.BaCaN);
                    l.setText(Integer.toString((int)(Math.round(37.22/100 * SumRest))));
                    l = (TextView)findViewById(R.id.GoCaNP);
                    l.setText(Double.toString(69.23));
                    break;
                default:
                    break;
            }
        }
    }

    public void GameDoneGreen(View v){
        v.playSoundEffect(SoundEffectConstants.CLICK);
        Vibrator vibe = (Vibrator) getSystemService (Context.VIBRATOR_SERVICE);
        vibe.vibrate (50);
        Button button = (Button)v;
        if (PGame) {
            button.setText("0");
        } else {
            int n = Integer.parseInt(button.getText().toString()) + 1;
            button.setText(Integer.toString(n));
        }
        PGame = false;
    }

    public void GameDoneRed(View v){
        v.playSoundEffect(SoundEffectConstants.CLICK);
        Vibrator vibe = (Vibrator) getSystemService (Context.VIBRATOR_SERVICE);
        vibe.vibrate (50);
        Button button = (Button)v;
        if (PGame) {
            int n = Integer.parseInt(button.getText().toString()) + 1;
            button.setText(Integer.toString(n));
        } else {
            button.setText("0");
        }
        PGame = true;
    }

    public void EditSeries(int CardC){
        TextView l = (TextView)findViewById(R.id.lS);
        TextView l1 = (TextView)findViewById(R.id.lS1);
        TextView l2 = (TextView)findViewById(R.id.lS2);
        TextView l3 = (TextView)findViewById(R.id.lS3);
        TextView l4 = (TextView)findViewById(R.id.lS4);
        TextView l5 = (TextView)findViewById(R.id.lS5);
        TextView l6 = (TextView)findViewById(R.id.lS6);
        TextView l7 = (TextView)findViewById(R.id.lS7);
        TextView l8 = (TextView)findViewById(R.id.lS8);
        TextView l9 = (TextView)findViewById(R.id.lS9);
        l9.setText(l8.getText());
        l8.setText(l7.getText());
        l7.setText(l6.getText());
        l6.setText(l5.getText());
        l5.setText(l4.getText());
        l4.setText(l3.getText());
        l3.setText(l2.getText());
        l2.setText(l1.getText());
        l1.setText(l.getText());
        if (CardC == 11){
            l.setText("A");
        } else {
        l.setText(Integer.toString(CardC));};
    }

    public void CardTaken(View v){
        if (AmouDecks != 0) {
            SumRest -= 1;
            TextView l = (TextView)findViewById(R.id.AmDe);
            l.setText(Double.toString((double) Math.round(SumRest/59*100)/100));
            CardP = CardC;
            Button B = (Button)v;
            if (B.getText().toString().equals("A")) {
                CardC = 11;
            } else {
                CardC = Integer.parseInt(B.getText().toString());
            }
            ChangeC(CardC, CardP, v);
            int switcher = 0;
            if (CardC < 7) { switcher = 0; }
            if (CardC > 6) { switcher = 1; }
            if (CardC > 9) { switcher = 2; }
            switch (switcher) {
            case 0:
                l = (TextView)findViewById(R.id.BaCaSC);
                l.setBackgroundColor(Color.YELLOW);
                l = (TextView)findViewById(R.id.GoCaSC);
                l.setBackgroundColor(Color.parseColor("#00FFFF"));
                SumRestV -= 1;
                l = (TextView)findViewById(R.id.Co);
                l.setText(Integer.toString(Integer.parseInt(l.getText().toString()) + 1));
                if (PCard) {
                    TextView lpp = (TextView)findViewById(R.id.GoCaSPP);
                    TextView lp = (TextView)findViewById(R.id.GoCaSP);
                    TextView lc = (TextView)findViewById(R.id.GoCaSC);
                    lpp.setText(lp.getText());
                    lp.setText(lc.getText());
                    lc.setText("1");
                } else {
                    TextView lc = (TextView)findViewById(R.id.GoCaSC);
                    lc.setText(Integer.toString(Integer.parseInt(lc.getText().toString()) + 1));
                }
            PCard = false;
            break;
            case 1:
                l = (TextView)findViewById(R.id.BaCaSC);
                l.setBackgroundColor(Color.YELLOW);
                l = (TextView)findViewById(R.id.GoCaSC);
                l.setBackgroundColor(Color.parseColor("#00FFFF"));
                if (PCard) {
                    TextView lpp = (TextView)findViewById(R.id.GoCaSPP);
                    TextView lp = (TextView)findViewById(R.id.GoCaSP);
                    TextView lc = (TextView)findViewById(R.id.GoCaSC);
                    lpp.setText(lp.getText());
                    lp.setText(lc.getText());
                    lc.setText("1");
                } else {
                    TextView lc = (TextView)findViewById(R.id.GoCaSC);
                    lc.setText(Integer.toString(Integer.parseInt(lc.getText().toString()) + switcher));
                }
            PCard = false;
                break;
            case 2:
                l = (TextView)findViewById(R.id.BaCaSC);
                l.setBackgroundColor(Color.parseColor("#00FFFF"));
                l = (TextView)findViewById(R.id.GoCaSC);
                l.setBackgroundColor(Color.YELLOW);
                SumRestV -= 1;
                l = (TextView)findViewById(R.id.Co);
                l.setText(Integer.toString(Integer.parseInt(l.getText().toString()) - switcher));
                if (PCard) {
                    TextView lc = (TextView)findViewById(R.id.BaCaSC);
                    lc.setText(Integer.toString(Integer.parseInt(lc.getText().toString()) + switcher));
            } else {
                    TextView lpp = (TextView)findViewById(R.id.BaCaSPP);
                    TextView lp = (TextView)findViewById(R.id.BaCaSP);
                    TextView lc = (TextView)findViewById(R.id.BaCaSC);
                    lpp.setText(lp.getText());
                    lp.setText(lc.getText());
                    lc.setText("1");
            }
            PCard = true;
                break;
            default:
                break;
        }
            l = (TextView)findViewById(R.id.Co);
            TextView lp = (TextView)findViewById(R.id.CoP);
            double val=Double.parseDouble(l.getText().toString())*100/SumRestV;
            lp.setText(Double.toString(val));

            TextView Co1 = (TextView)findViewById(R.id.Co1);
            TextView Co2 = (TextView)findViewById(R.id.Co2);
            TextView Co3 = (TextView)findViewById(R.id.Co3);

            switch (CardC) {
            case 2:
                l = (TextView)findViewById(R.id.l2);
                l.setText(Integer.toString(Integer.parseInt(l.getText().toString()) - 2));
                Co1.setText(Double.toString(Double.parseDouble(Co1.getText().toString()) + 2));
                Co2.setText(Double.toString(Double.parseDouble(Co2.getText().toString()) + 4));
                Co3.setText(Double.toString(Double.parseDouble(Co3.getText().toString()) + 5));
                break;
            case 3:
                l = (TextView)findViewById(R.id.l3);
                l.setText(Integer.toString(Integer.parseInt(l.getText().toString()) - 2));
                Co1.setText(Double.toString(Double.parseDouble(Co1.getText().toString()) + 3));
                Co2.setText(Double.toString(Double.parseDouble(Co2.getText().toString()) + 2));
                Co3.setText(Double.toString(Double.parseDouble(Co3.getText().toString()) + 4));
                break;
            case 4:
                l = (TextView)findViewById(R.id.l4);
                l.setText(Integer.toString(Integer.parseInt(l.getText().toString()) - 2));
                Co1.setText(Double.toString(Double.parseDouble(Co1.getText().toString()) + 5));
                Co2.setText(Double.toString(Double.parseDouble(Co2.getText().toString()) + 3));
                Co3.setText(Double.toString(Double.parseDouble(Co3.getText().toString()) + 1));
                break;
            case 5:
                l = (TextView)findViewById(R.id.l5);
                l.setText(Integer.toString(Integer.parseInt(l.getText().toString()) - 2));
                Co1.setText(Double.toString(Double.parseDouble(Co1.getText().toString()) + 4));
                Co2.setText(Double.toString(Double.parseDouble(Co2.getText().toString()) + 3));
                Co3.setText(Double.toString(Double.parseDouble(Co3.getText().toString()) + 5));
                break;
            case 6:
                l = (TextView)findViewById(R.id.l6);
                l.setText(Integer.toString(Integer.parseInt(l.getText().toString()) - 2));
                Co1.setText(Double.toString(Double.parseDouble(Co1.getText().toString()) + 3));
                Co2.setText(Double.toString(Double.parseDouble(Co2.getText().toString()) + 3));
                Co3.setText(Double.toString(Double.parseDouble(Co3.getText().toString()) + 7));
                break;
            case 7:
                l = (TextView)findViewById(R.id.l7);
                l.setText(Integer.toString(Integer.parseInt(l.getText().toString()) - 2));
                Co1.setText(Double.toString(Double.parseDouble(Co1.getText().toString()) + 5));
                Co2.setText(Double.toString(Double.parseDouble(Co2.getText().toString()) + 4));
                Co3.setText(Double.toString(Double.parseDouble(Co3.getText().toString()) + 6));
                break;
            case 8:
                l = (TextView)findViewById(R.id.l8);
                l.setText(Integer.toString(Integer.parseInt(l.getText().toString()) - 2));
                Co3.setText(Double.toString(Double.parseDouble(Co3.getText().toString()) -9));
                break;
            case 9:
                l = (TextView)findViewById(R.id.l9);
                l.setText(Integer.toString(Integer.parseInt(l.getText().toString()) - 1));
                Co1.setText(Double.toString(Double.parseDouble(Co1.getText().toString()) - 3));
                Co3.setText(Double.toString(Double.parseDouble(Co3.getText().toString()) - 2));
                break;
            case 10:
                AmouTen -= 1;
                switch (AmouTen%4){
                    case 0:
                        l = (TextView)findViewById(R.id.l10);
                        l.setText(String.format("%d   %d", AmouTen / 4, AmouTen / 4));
                        l = (TextView)findViewById(R.id.l11);
                        l.setText(String.format("%d   %d", AmouTen / 4, AmouTen / 4));
                        break;
                    case 1:
                        l = (TextView)findViewById(R.id.l10);
                        l.setText(String.format("%d   %d", AmouTen / 4 + 1, AmouTen / 4));
                        l = (TextView)findViewById(R.id.l11);
                        l.setText(String.format("%d   %d", AmouTen / 4, AmouTen / 4));
                        break;
                    case 2:
                        l = (TextView)findViewById(R.id.l10);
                        l.setText(String.format("%d   %d", AmouTen / 4 + 1, AmouTen / 4 + 1));
                        l = (TextView)findViewById(R.id.l11);
                        l.setText(String.format("%d   %d", AmouTen / 4, AmouTen / 4));
                        break;
                    case 3:
                        l = (TextView)findViewById(R.id.l10);
                        l.setText(String.format("%d   %d", AmouTen / 4 + 1, AmouTen / 4 + 1));
                        l = (TextView)findViewById(R.id.l11);
                        l.setText(String.format("%d   %d", AmouTen / 4+1, AmouTen / 4));
                        break;
                    default: break;
                }
                Co1.setText(Double.toString(Double.parseDouble(Co1.getText().toString()) - 3));
                Co2.setText(Double.toString(Double.parseDouble(Co2.getText().toString()) - 4));
                Co3.setText(Double.toString(Double.parseDouble(Co3.getText().toString()) - 7));
                break;
            case 11:
                l = (TextView)findViewById(R.id.lA);
                l.setText(Integer.toString(Integer.parseInt(l.getText().toString()) - 2));
                Co1.setText(Double.toString(Double.parseDouble(Co1.getText().toString()) - 3));
                Co3.setText(Double.toString(Double.parseDouble(Co3.getText().toString()) - 9));
            default:
                break;
        }
        EditSeries(CardC);
        }
    }

    public void onButtonClicked(View v){
        EditText e1 = (EditText)findViewById(R.id.et);

        TextView Co = (TextView)findViewById(R.id.Co);
        int n1 = Integer.parseInt(e1.getText().toString());

        int n2 = Integer.parseInt(Co.getText().toString()) + Integer.parseInt(e1.getText().toString());
        Co.setText(Integer.toString(n2));
    }
}
