package rest.hello.org.dontfeellikeit.ui;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import rest.hello.org.dontfeellikeit.R;
import rest.hello.org.dontfeellikeit.model.FactBook;
import rest.hello.org.dontfeellikeit.model.FactColor;
import rest.hello.org.dontfeellikeit.model.Page;
import rest.hello.org.dontfeellikeit.model.RandomFacts;

public class FactActivity extends AppCompatActivity {
    //Declare Variables
    private RandomFacts mRandomFacts = new RandomFacts();
    private FactBook mFactBook = new FactBook();
    private FactColor mFactColor = new FactColor();
    private TextView mFactTextView;
    private Button mShowButton;
    private RelativeLayout mRelativeLayout;
    private TextView mTextView;
    private ImageView mFactImageView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Intent intent = getIntent();
        String random = intent.getStringExtra(getString(R.string.key_random));

        String universe = intent.getStringExtra(getString(R.string.key_universe));

        String human = intent.getStringExtra(getString(R.string.key_human));

        String animal = intent.getStringExtra(getString(R.string.key_science));

        //Assign the views layout
        mFactTextView = (TextView) findViewById(R.id.textView);
        mShowButton = (Button) findViewById(R.id.showButton);
        mRelativeLayout = (RelativeLayout) findViewById(R.id.relativeLayout);
        mTextView = (TextView)findViewById(R.id.textView);
        mFactImageView = (ImageView)findViewById(R.id.factImageView);







        //add a switch case with all cases e.g if universe is passed to intent then case mFactBook.getUniverseFact();
        if (random != null) {

           getCorrectFactList(random);
           // loadRandomPage();

        }else if(universe != null){

          //  getCorrectFactList(universe);
        }else if(human != null){

         //   getCorrectFactList(human);

        }else if(animal != null){

         //   getCorrectFactList(animal);

        }


    }


    private void loadRandomPage(){

      //  Page page = mRandomFacts.;
        Page page =  mRandomFacts.getFact();
        Drawable drawable = getResources().getDrawable(page.getImageId());
        mFactImageView.setImageDrawable(drawable);
        //hold text ooff our story
        String factText = page.getText();
        //add name if placeholder included else wont
      //  pageText = String.format(pageText, mName);  //staic method dont need inastance

        mTextView.setText(factText);




        // mChoice1.setText(page.getChoice1().getText());
        //mChoice1.setText(page.getChoice2().getText());

    }




    public void getCorrectFactList(final String topic) {

        Page page =  mRandomFacts.getFact();
        Drawable drawable = getResources().getDrawable(page.getImageId());
        mFactImageView.setImageDrawable(drawable);
        //hold text ooff our story
        String factText = page.getText();
        mTextView.setText(factText);

        int color = mFactColor.getColor();
      //  mFactTextView.setText(mFactBook.getFact(topic));
        mRelativeLayout.setBackgroundColor(color);
        mShowButton.setTextColor(color);

        View.OnClickListener listener = new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Page page =  mRandomFacts.getFact();
                Drawable drawable1 = getResources().getDrawable(page.getImageId());
                mFactImageView.setImageDrawable(drawable1);
                String factText = page.getText();
                mTextView.setText(factText);

                int color = mFactColor.getColor();

                //update with new fact
               // mFactTextView.setText(mFactBook.getFact(topic));
                mRelativeLayout.setBackgroundColor(color);
                mShowButton.setTextColor(color);


            }
        };

        mShowButton.setOnClickListener(listener);

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
