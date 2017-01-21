package rest.hello.org.dontfeellikeit.model;


public class Page {

    //all data incluse on page
    private int mImageId;
    private String mText;


    public Page(String text){

        mText = text;


    }



    public Page(int imageId, String text){
        mImageId = imageId;
        mText = text;



    }



    public int getImageId() {
        return mImageId;
    }

    public void setImageId(int imageId) {
        mImageId = imageId;
    }

    public String getText() {
        return mText;
    }

    public void setText(String text) {
        this.mText = text;
    }

}
