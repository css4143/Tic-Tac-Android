package com.example.test;

import java.util.ArrayList;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;

/**
 * Main Activity for Tic-Tac-Android program.
 * 
 * @author Connor Seiden
 * @version 10-5-2013
 */
public class MainActivity extends Activity implements OnClickListener {

	
	private boolean turn = true;
	/*
	 * true is X's turn and false is O's turn
	 */
	private ArrayList<Button> buttons = new ArrayList<Button>();
	private TextView winner;
	private Button reset;
	
	
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        winner = (TextView) findViewById(R.id.textView1);
        reset = (Button) findViewById(R.id.button1);
        reset.setOnClickListener(this);
        
        buttons.add((Button) findViewById(R.id.Button01));
        buttons.add((Button) findViewById(R.id.Button02));
        buttons.add((Button) findViewById(R.id.Button03));
        buttons.add((Button) findViewById(R.id.Button04));
        buttons.add((Button) findViewById(R.id.Button05));
        buttons.add((Button) findViewById(R.id.Button06));
        buttons.add((Button) findViewById(R.id.Button07));
        buttons.add((Button) findViewById(R.id.Button08));
        buttons.add((Button) findViewById(R.id.Button09));
        
        for(int i=0;i<buttons.size();i++){
        	buttons.get(i).setOnClickListener(this);
        }
        
        
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }


    /**
     * Method that is called on button click,  will update the board based
     * on which button was clicked.
     */
	@Override
	public void onClick(View e) {
		
		if(e==buttons.get(0) && buttons.get(0).getText().equals("")){
			if(turn){
				buttons.get(0).setText("X");
				turn = !turn;
			}
			else{
				buttons.get(0).setText("O");
				turn = !turn;
			}
			checkWin();
		}
		else if(e==buttons.get(1) && buttons.get(1).getText().equals("")){
			if(turn){
				buttons.get(1).setText("X");
				turn = !turn;
			}
			else{
				buttons.get(1).setText("O");
				turn = !turn;
			}
			checkWin();
		}
		else if(e==buttons.get(2) && buttons.get(2).getText().equals("")){
			if(turn){
				buttons.get(2).setText("X");
				turn = !turn;
			}
			else{
				buttons.get(2).setText("O");
				turn = !turn;
			}
			checkWin();
		}
		else if(e==buttons.get(3) && buttons.get(3).getText().equals("")){
			if(turn){
				buttons.get(3).setText("X");
				turn = !turn;
			}
			else{
				buttons.get(3).setText("O");
				turn = !turn;
			}
			checkWin();
		}
		else if(e==buttons.get(4) && buttons.get(4).getText().equals("")){
			if(turn){
				buttons.get(4).setText("X");
				turn = !turn;
			}
			else{
				buttons.get(4).setText("O");
				turn = !turn;
			}
			checkWin();
		}
		else if(e==buttons.get(5) && buttons.get(5).getText().equals("")){
			if(turn){
				buttons.get(5).setText("X");
				turn = !turn;
			}
			else{
				buttons.get(5).setText("O");
				turn = !turn;
			}
			checkWin();
		}
		else if(e==buttons.get(6) && buttons.get(6).getText().equals("")){
			if(turn){
				buttons.get(6).setText("X");
				turn = !turn;
			}
			else{
				buttons.get(6).setText("O");
				turn = !turn;
			}
			checkWin();
		}
		else if(e==buttons.get(7) && buttons.get(7).getText().equals("")){
			if(turn){
				buttons.get(7).setText("X");
				turn = !turn;
			}
			else{
				buttons.get(7).setText("O");
				turn = !turn;
			}
			checkWin();
		}
		else if(e==buttons.get(8) && buttons.get(8).getText().equals("")){
			if(turn){
				buttons.get(8).setText("X");
				turn = !turn;
			}
			else{
				buttons.get(8).setText("O");
				turn = !turn;
			}
			checkWin();
		}
		else if(e==reset){
			for(int i=0;i<buttons.size();i++){
				buttons.get(i).setText("");
				winner.setText("");
			}
		}
			
	}
	
	
	/**
	 * Check if a player has won by look for all combinations of 3 in a row.
	 * 
	 */
	public void checkWin(){
		if(buttons.get(0).getText().equals("X")){
			if(buttons.get(1).getText().equals("X")&&buttons.get(2).getText().equals("X")){
				winner.setText("X's Win!");
			}
			if(buttons.get(3).getText().equals("X")&&buttons.get(6).getText().equals("X")){
				winner.setText("X's Win!");
			}
			if(buttons.get(4).getText().equals("X")&&buttons.get(8).getText().equals("X")){
				winner.setText("X's Win!");
			}
			
		}
		
		if(buttons.get(1).getText().equals("X")&&buttons.get(4).getText().equals("X")&&buttons.get(7).getText().equals("X")){
			winner.setText("X's Win!");
		}
		
		if(buttons.get(2).getText().equals("X")){
			if(buttons.get(4).getText().equals("X")&&buttons.get(6).getText().equals("X")){
				winner.setText("X's Win!");
			}
			if(buttons.get(5).getText().equals("X")&&buttons.get(8).getText().equals("X")){
				winner.setText("X's Win!");
			}
			
		}
		if(buttons.get(3).getText().equals("X")&&buttons.get(4).getText().equals("X")&&buttons.get(5).getText().equals("X")){
			winner.setText("X's Win!");
		}
		if(buttons.get(6).getText().equals("X")&&buttons.get(7).getText().equals("X")&&buttons.get(8).getText().equals("X")){
			winner.setText("X's Win!");
		}
		
		/*
		 * change
		 */
		
		if(buttons.get(0).getText().equals("O")){
			if(buttons.get(1).getText().equals("O")&&buttons.get(2).getText().equals("O")){
				winner.setText("O's Win!");
			}
			if(buttons.get(3).getText().equals("O")&&buttons.get(6).getText().equals("O")){
				winner.setText("O's Win!");
			}
			if(buttons.get(4).getText().equals("O")&&buttons.get(8).getText().equals("O")){
				winner.setText("O's Win!");
			}
			
		}
		
		if(buttons.get(1).getText().equals("O")&&buttons.get(4).getText().equals("O")&&buttons.get(7).getText().equals("O")){
			winner.setText("O's Win!");
		}
		
		if(buttons.get(2).getText().equals("O")){
			if(buttons.get(4).getText().equals("O")&&buttons.get(6).getText().equals("O")){
				winner.setText("O's Win!");
			}
			if(buttons.get(5).getText().equals("O")&&buttons.get(8).getText().equals("O")){
				winner.setText("O's Win!");
			}
			
		}
		if(buttons.get(3).getText().equals("O")&&buttons.get(4).getText().equals("O")&&buttons.get(5).getText().equals("O")){
			winner.setText("O's Win!");
		}
		if(buttons.get(6).getText().equals("O")&&buttons.get(7).getText().equals("O")&&buttons.get(8).getText().equals("O")){
			winner.setText("O's Win!");
		}
		
		
		
	}
    
}
