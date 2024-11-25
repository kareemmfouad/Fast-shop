package com.example.fastshop;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.VideoView;

public class MainActivity extends AppCompatActivity {
int NumberOfQuantity1,NumberOfQuantity2,NumberOfQuantity3,NumberOfQuantity4,NumberOfQuantity5,NumberOfQuantity6, NumberOfQuantity7,NumberOfQuantity8,NumberOfQuantity9;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
      public void increment1(View view) {
        if (NumberOfQuantity1>100){
            Toast.makeText(this, "You cannot have more than 100", Toast.LENGTH_SHORT).show();
            return;
        }
        NumberOfQuantity1=NumberOfQuantity1+1;
        displayIncrement1(NumberOfQuantity1);
    }
    public void decrement1(View view) {
        if (NumberOfQuantity1<1){
            Toast.makeText(this, "You cannot have less than 1", Toast.LENGTH_SHORT).show();
            return;
        }
        NumberOfQuantity1=NumberOfQuantity1-1;
        displayIncrement1(NumberOfQuantity1);
    }

    @SuppressLint("SetTextI18n")
    private void displayIncrement1(int numberOfQuantity1) {
        TextView quantityTextView = findViewById(R.id.text1);
        quantityTextView.setText("" + numberOfQuantity1);
        TextView textView=findViewById(R.id.total1);
        textView.setText(""+numberOfQuantity1*10+"$");
    }

    public void increment2(View view) {
        if (NumberOfQuantity2>100){
            Toast.makeText(this, "You cannot have more than 100", Toast.LENGTH_SHORT).show();
            return;
        }
        NumberOfQuantity2=NumberOfQuantity2+1;
        displayIncrement2(NumberOfQuantity2);
    }
    public void decrement2(View view) {
        if (NumberOfQuantity2<1){
            Toast.makeText(this, "You cannot have less than 1", Toast.LENGTH_SHORT).show();
            return;
        }
        NumberOfQuantity2=NumberOfQuantity2-1;
        displayIncrement2(NumberOfQuantity2);
    }

    @SuppressLint("SetTextI18n")
    private void displayIncrement2(int numberOfQuantity2) {
        TextView quantityTextView = findViewById(R.id.text2);
        quantityTextView.setText("" + numberOfQuantity2);
        TextView textView=findViewById(R.id.total2);
        textView.setText(""+numberOfQuantity2*7+"$");
    }

    public void increment3(View view) {
        if (NumberOfQuantity3>100){
            Toast.makeText(this, "You cannot have more than 100", Toast.LENGTH_SHORT).show();
            return;
        }
        NumberOfQuantity3=NumberOfQuantity3+1;
        displayIncrement3(NumberOfQuantity3);
    }
    public void decrement3(View view) {
        if (NumberOfQuantity3<1){
            Toast.makeText(this, "You cannot have less than 1", Toast.LENGTH_SHORT).show();
            return;
        }
        NumberOfQuantity3=NumberOfQuantity3-1;
        displayIncrement3(NumberOfQuantity3);
    }

    @SuppressLint("SetTextI18n")
    private void displayIncrement3(int numberOfQuantity3) {
        TextView quantityTextView = findViewById(R.id.text3);
        quantityTextView.setText("" + numberOfQuantity3);
        TextView textView=findViewById(R.id.total3);
        textView.setText(""+numberOfQuantity3*5+"$");
    }

    public void increment4(View view) {
        if (NumberOfQuantity4>100){
            Toast.makeText(this, "You cannot have more than 100", Toast.LENGTH_SHORT).show();
            return;
        }
        NumberOfQuantity4=NumberOfQuantity4+1;
        displayIncrement4(NumberOfQuantity4);
    }
    public void decrement4(View view) {
        if (NumberOfQuantity4<1){
            Toast.makeText(this, "You cannot have less than 1", Toast.LENGTH_SHORT).show();
            return;
        }
        NumberOfQuantity4=NumberOfQuantity4-1;
        displayIncrement4(NumberOfQuantity4);
    }

    @SuppressLint("SetTextI18n")
    private void displayIncrement4(int numberOfQuantity4) {
        TextView quantityTextView = findViewById(R.id.text4);
        quantityTextView.setText("" + numberOfQuantity4);
        TextView textView=findViewById(R.id.total4);
        textView.setText(""+numberOfQuantity4*3+"$");
    }

    public void increment5(View view) {
        if (NumberOfQuantity5>100){
            Toast.makeText(this, "You cannot have more than 100", Toast.LENGTH_SHORT).show();
            return;
        }
        NumberOfQuantity5=NumberOfQuantity5+1;
        displayIncrement5(NumberOfQuantity5);
    }
    public void decrement5(View view) {
        if (NumberOfQuantity5<1){
            Toast.makeText(this, "You cannot have less than 1", Toast.LENGTH_SHORT).show();
            return;
        }
        NumberOfQuantity5=NumberOfQuantity5-1;
        displayIncrement5(NumberOfQuantity5);
    }

    @SuppressLint("SetTextI18n")
    private void displayIncrement5(int numberOfQuantity5) {
        TextView quantityTextView = findViewById(R.id.text5);
        quantityTextView.setText("" + numberOfQuantity5);
        TextView textView=findViewById(R.id.total5);
        textView.setText(""+numberOfQuantity5*3+"$");
    }

    public void increment6(View view) {
        if (NumberOfQuantity6>100){
            Toast.makeText(this, "You cannot have more than 100", Toast.LENGTH_SHORT).show();
            return;
        }
        NumberOfQuantity6=NumberOfQuantity6+1;
        displayIncrement6(NumberOfQuantity6);
    }
    public void decrement6(View view) {
        if (NumberOfQuantity6<1){
            Toast.makeText(this, "You cannot have less than 1", Toast.LENGTH_SHORT).show();
            return;
        }
        NumberOfQuantity6=NumberOfQuantity6-1;
        displayIncrement6(NumberOfQuantity6);
    }

    @SuppressLint("SetTextI18n")
    private void displayIncrement6(int numberOfQuantity6) {
        TextView quantityTextView = findViewById(R.id.text6);
        quantityTextView.setText("" + numberOfQuantity6);
        TextView textView=findViewById(R.id.total6);
        textView.setText(""+numberOfQuantity6*5+"$");
    }

    public void increment7(View view) {
        if (NumberOfQuantity7>100){
            Toast.makeText(this, "You cannot have more than 100", Toast.LENGTH_SHORT).show();
            return;
        }
        NumberOfQuantity7=NumberOfQuantity7+1;
        displayIncrement7(NumberOfQuantity7);
    }
    public void decrement7(View view) {
        if (NumberOfQuantity7<1){
            Toast.makeText(this, "You cannot have less than 1", Toast.LENGTH_SHORT).show();
            return;
        }
        NumberOfQuantity7=NumberOfQuantity7-1;
        displayIncrement7(NumberOfQuantity7);
    }

    @SuppressLint("SetTextI18n")
    private void displayIncrement7(int numberOfQuantity7) {
        TextView quantityTextView = findViewById(R.id.text7);
        quantityTextView.setText("" + numberOfQuantity7);
        TextView textView=findViewById(R.id.total7);
        textView.setText(""+numberOfQuantity7*7+"$");
    }

    public void increment8(View view) {
        if (NumberOfQuantity8>100){
            Toast.makeText(this, "You cannot have more than 100", Toast.LENGTH_SHORT).show();
            return;
        }
        NumberOfQuantity8=NumberOfQuantity8+1;
        displayIncrement8(NumberOfQuantity8);
    }
    public void decrement8(View view) {
        if (NumberOfQuantity8<1){
            Toast.makeText(this, "You cannot have less than 1", Toast.LENGTH_SHORT).show();
            return;
        }
        NumberOfQuantity8=NumberOfQuantity8-1;
        displayIncrement8(NumberOfQuantity8);
    }

    @SuppressLint("SetTextI18n")
    private void displayIncrement8(int numberOfQuantity8) {
        TextView quantityTextView = findViewById(R.id.text8);
        quantityTextView.setText("" + numberOfQuantity8);
        TextView textView=findViewById(R.id.total8);
        textView.setText(""+numberOfQuantity8*8+"$");
    }

    public void increment9(View view) {
        if (NumberOfQuantity9>100){
            Toast.makeText(this, "You cannot have more than 100", Toast.LENGTH_SHORT).show();
            return;
        }
        NumberOfQuantity9=NumberOfQuantity9+1;
        displayIncrement9(NumberOfQuantity9);
    }
    public void decrement9(View view) {
        if (NumberOfQuantity9<1){
            Toast.makeText(this, "You cannot have less than 1", Toast.LENGTH_SHORT).show();
            return;
        }
        NumberOfQuantity9=NumberOfQuantity9-1;
        displayIncrement9(NumberOfQuantity9);
    }

    @SuppressLint("SetTextI18n")
    private void displayIncrement9(int numberOfQuantity9) {
        TextView quantityTextView = findViewById(R.id.text9);
        quantityTextView.setText("" + numberOfQuantity9);
        TextView textView=findViewById(R.id.total9);
        textView.setText(""+numberOfQuantity9*6+"$");
    }
    public void totalOrder(View view) {
        int price=NumberOfQuantity1*10+NumberOfQuantity2*7+NumberOfQuantity3*5+NumberOfQuantity4*3+
                NumberOfQuantity5*3+NumberOfQuantity6*5+NumberOfQuantity7*6+NumberOfQuantity8*6+NumberOfQuantity9*6;
         String message="Pizza:"+NumberOfQuantity1+" Price:"+NumberOfQuantity1*10+"$";
         message+="\nBurger:"+NumberOfQuantity2+" Price:"+NumberOfQuantity2*7+"$";
         message+="\nSusage:"+NumberOfQuantity3+" Price:"+NumberOfQuantity3*5+"$";
         message+="\nCoffee:"+NumberOfQuantity4+" Price:"+NumberOfQuantity4*3+"$";
         message+="\nTea:"+NumberOfQuantity5+" Price:"+NumberOfQuantity5*3+"$";
         message+="\nOrange Juice:"+NumberOfQuantity6+" Price:"+NumberOfQuantity6*5+"$";
         message+="\nChocolate:"+NumberOfQuantity7+" Price:"+NumberOfQuantity7*6+"$";
         message+="\nVanilla:"+NumberOfQuantity8+" Price:"+NumberOfQuantity8*6+"$";
         message+="\nMulberry:"+NumberOfQuantity9+" Price:"+NumberOfQuantity9*6+"$";
         message+="\nTotal:"+price+"$";
         message+="\nThank you so much";
         displaymessage(message);
    }

    private void displaymessage(String message) {
        TextView textView=findViewById(R.id.messageall);
        textView.setText(message);
    }
}