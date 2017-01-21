package rest.hello.org.dontfeellikeit.model;

import android.util.Log;

import java.util.Random;

/**
 * Created by stephenholland on 12/09/2016.
 */
public class FactBook {

    public static final String TAG =FactBook.class.getSimpleName();

    //member var - properties about object

    private String[] mFacts = {
            "Ants stretch when they wake up in the morning.",
            "Ostriches can run faster than horses.",
            "Olympic gold medals are actually made mostly of silver.",
            "You are born with 300 bones; by the time you are an adult you will have 206.",
            "It takes about 8 minutes for light from the Sun to reach Earth.",
            "Some bamboo plants can grow almost a meter in just one day.",
            "The state of Florida is bigger than England.",
            "Some penguins can leap 2-3 meters out of the water.",
            "On average, it takes 66 days to form a new habit.",
            "Mammoths still walked the earth when the Great Pyramid was being built.",
            "Owls are the only birds in the world that can see the color blue.",
            "Most people have lost 50% of their taste buds by the time they reach the age of sixty.",
            "You can't swallow without your tongue touching the roof of your mouth.",
            "Prior to 2004, caffeine was on the International Olympic Committee's list of prohibited substances.",
            "The average American will watch 9 years of television in his/her lifetime.",
            "Scientists have discovered that Earth's rotation is slowing, and in the past 2 years, there is about 24 more seconds in a day."
            , "Studies show painting your room blue will make you more creative.",
            "It is impossible to spell a word only using the bottom row of the keyboard.",
            "If you run in the rain, you will get about 50% wetter than if you stood still."};


    private String[] mUniverseFacts = {
            "When you look into the night sky, you are looking back in time", "The Hubble telescope allows us to look back billions of years into the past",
            "There’s a giant cloud of alcohol in Sagittarius B","It takes 225 million years for our Sun to travel round the galaxy","A year on Venus is shorter than its day",
            "A spoonful of a neutron star weighs about a billion ton","It is estimated there are 400 billion stars in our galaxy","We are all made of stardust",
            "A day in Mercury lasts approximately as long as 59 days on earth.","Earth’s atmosphere was formed from gases pouring out from volcanoes.",
            "The fastest spinning objects in the Universe are neutron stars – these can rotate 500 times in just 1 second.","The sun is about 5 billion years old and half a way through its life – as a medium sized star it will probably live for around 10 billion years.",
            "The moon’s gravity is 17% of the Earth’s so astronauts in space suits can jump 4 m high on the moon.","The future of the Universe may depend on how much dark matter there is. If there is too much, its gravity will eventually stop the Universe’s expansion – and make it shrink again."

    };

    private String[] mHumanBodyFacts = {
        "Infants blink only once or twice a minute while adults average around 10.",
            "As well as having unique fingerprints, humans also have unique tongue prints.",
            "The brain uses over a quarter of the oxygen used by the human body","Your heart beats around 100000 times a day, 36500000 times a year and over a billion times if you live beyond 30",
            "Adult lungs have a surface area of around 70 square metres!","Your nose and ears continue growing throughout your entire life",
            "Most adults have 32 teeth","Infants blink only once or twice a minute while adults average around 10.","The left side of your body is controlled by the right side of your brain while the right side of your body is controlled by the left side of your brain."



    };

    private String[] mHistoryFacts = {
           "Albert Einstein was offered the role of Israel’s second President in 1952, but declined."


    };



    // method - action
    public String getFact(String topic) {

        Log.d(TAG, topic);

        //the button clicked update
        if (topic.equals("universe")) {

            String fact = "";
            //random select fact
            Random randomGenerator = new Random();
            int randomNumber = randomGenerator.nextInt(mUniverseFacts.length);
            fact = mUniverseFacts[randomNumber];

            return fact;


        } else if (topic.equals("random")) {

            String fact = "";
            //random select fact
            Random randomGenerator = new Random();
            int randomNumber = randomGenerator.nextInt(mFacts.length);
            fact = mFacts[randomNumber];

            return fact;

        }else if (topic.equals("human")){

            String fact = "";
            //random select fact
            Random randomGenerator = new Random();
            int randomNumber = randomGenerator.nextInt(mHumanBodyFacts.length);
            fact = mHumanBodyFacts[randomNumber];

            return fact;

        }else if (topic.equals("science")){

            String fact = "";
            //random select fact
            Random randomGenerator = new Random();
            int randomNumber = randomGenerator.nextInt(mHistoryFacts.length);
            fact = mHistoryFacts[randomNumber];

            return fact;

        }



        return null;


    }



    // method - action
    public String getUniverseFact(){

        //the button clicked update

        String fact = "";
        //random select fact
        Random randomGenerator = new Random();
        int randomNumber = randomGenerator.nextInt(mUniverseFacts.length);
        fact = mFacts[randomNumber];

        return fact;

    }

}
