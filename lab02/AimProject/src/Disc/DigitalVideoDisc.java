package Disc;

public class DigitalVideoDisc {
	private String title;
    private String category;
    private String director;
    private int length;
    private float cost;

    
    public DigitalVideoDisc(String title) {
        super();
        this.title = title;
        
    }

    public DigitalVideoDisc(String title, String category, float cost) {
        this.title = title;
        this.category = category;
        this.cost = cost;

    }
    
    public DigitalVideoDisc(String title, String category, String director, float cost) {
        this.title = title;
        this.category = category;
        this.director = director;
        this.cost = cost;
        
    }

    public DigitalVideoDisc(String title, String category, String director, int length, float cost) {
        this.title = title;
        this.category = category;
        this.director = director;
        this.length = length;
        this.cost = cost;
      
    }


    //Getter for title
    public String getTitle() { return title; }
    //Getter for category
    public String getCategory() { return category; }
    //Getter for director
    public String getDirector() { return director; }
    //Getter for length
    public int getLength() { return length; }
    //Getter for cost
    public float getCost() { return cost; }

    //Setting for title
    public void setTitle(String titleSet){ title = titleSet; }
    public void setCategory(String categorySet){ category = categorySet; }
    public void setDirector(String directorSet){ director = directorSet; }
    public void setLength(int lengthSet){ length = lengthSet; }
    public void setCost(float costSet){ cost = costSet; }
}