package d.xaro.additemsexample;

class ExampleItem {


    private int mImageResource;
    private String mlabel;
    private String mdetails;
    private String mamount;

    public ExampleItem(int imageResource, String label, String details, String amount)
    {
        mImageResource = imageResource;
        mlabel = label;
        mdetails = details;
        mamount = amount;
    }

    public int getmImageResource()
    {
        return mImageResource;
    }

    public String getMlabel() {
        return mlabel;
    }

    public String getMdetails() {
        return mdetails;
    }

    public String getMamount() {
        return mamount;
    }


}
