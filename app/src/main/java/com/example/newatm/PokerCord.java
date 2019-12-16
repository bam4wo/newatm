package com.example.newatm;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.constraintlayout.widget.ConstraintLayout;

public class PokerCord extends ConstraintLayout {
    int value;
    private ImageView type;
    private TextView leftNum;
    private TextView rightNum;

    public PokerCord(Context context){
        super(context); //繼承父類別，調用父類別的方法
    }

    public PokerCord(Context context, AttributeSet attrs){
        super(context, attrs);
        inflate(context,R.layout.card, this);
        type = findViewById(R.id.imageView);
        leftNum = findViewById(R.id.left_num);
        rightNum = findViewById(R.id.right_num);
    }

    public int getValue(){
        return value;
    }

    public void setValue(int value){
        this.value = value;
        int flowerType = value/13;
        int point = (value%13)+1;
        switch (flowerType){
            case 0:
                type.setImageResource(R.drawable.clubs);
                break;
            case 1:
                type.setImageResource(R.drawable.diamonds);
                break;
            case 2:
                type.setImageResource(R.drawable.hearts);
                break;
            case 3:
                type.setImageResource(R.drawable.spades);
                break;
        }
        leftNum.setText(point+"");
        rightNum.setText(point+"");
    }
}
