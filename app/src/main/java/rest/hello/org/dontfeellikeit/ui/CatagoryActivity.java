package rest.hello.org.dontfeellikeit.ui;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.Toast;

import rest.hello.org.dontfeellikeit.R;

public class CatagoryActivity extends ListActivity {

    private ImageButton mRandomButton;
    private ImageButton mUniverseButtton;
    private ImageButton mHumanBodyButton;
    private ImageButton mAnimalButton;
    String[] factArray = {"random","Universe","Animal","Human Body","Great Scientists","History","Cas","Technology"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_catagory);

        // mRandomButton = (Button)findViewById(R.id.randomImageButton);
        //   mUniverseButtton = (ImageButton)findViewById(R.id.universeimageButton);
        //   mRandomButton = (ImageButton) findViewById(R.id.randomImageButton);
        //   mHumanBodyButton = (ImageButton) findViewById(R.id.humanImageButton);
        //  mAnimalButton = (ImageButton) findViewById(R.id.scienceImageButton);
     //   ArrayAdapter adapter = new ArrayAdapter<String>(this, R.layout.list_item, factArray);
      // ArrayAdapter adapter = new ArrayAdapter<String>(this, R.layout.list_item, factArray);
        ListAdapter adapter = new CustomAdapter(this, factArray);
        ListView listView = (ListView) findViewById(android.R.id.list);
        listView.setAdapter(adapter);



     /*   mRandomButton.setOnClickListener(

                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        String random = "random";
                        startFactsActivity(random);
                    }
                }
        );

        mUniverseButtton.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        String universe = "universe";
                        startFactsActivity(universe);
                    }
                }
        );

        mHumanBodyButton.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        String human = "human";
                        startFactsActivity(human);
                    }
                }
        );





*/



    }

    @Override
    protected void onListItemClick(ListView l, View v, int position, long id) {
        super.onListItemClick(l, v, position, id);
        String description = factArray[position];
        String message = String.format("hello %s",description);
        Toast.makeText(this,message, Toast.LENGTH_LONG).show();
        startFactsActivity(description);

    }

    public void startFactsActivity(String topic){

            Intent intent = new Intent(this, FactActivity.class);
            intent.putExtra(getString(R.string.key_random), topic);
            startActivity(intent);



        }





}
