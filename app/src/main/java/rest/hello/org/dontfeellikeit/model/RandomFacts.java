package rest.hello.org.dontfeellikeit.model;

import java.util.Random;

import rest.hello.org.dontfeellikeit.R;

public class RandomFacts {

    private Page[]  mPages;

    public RandomFacts(){

        mPages = new Page[4];

        mPages[0] = new Page(

                R.drawable.bird,
                "There are around 10000 different species of birds worldwide. "


        );


        mPages[1] = new Page(

                R.drawable.antstrawberry,
                "Ants stretch when they wake up in the morning. "


        );

        mPages[2] = new Page(

                R.drawable.medel,
                "Olympic gold medals are actually made mostly of silver. "


        );

        mPages[3] = new Page(

                R.drawable.bones,
                "You are born with 300 bones; by the time you are an adult you will have 206. "


        );




    }
    public Page getFact(){

        Random randomGenerator = new Random();
        int randomNumber = randomGenerator.nextInt(mPages.length);

        return mPages[randomNumber];

    }



}
