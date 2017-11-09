package mdcreative.com.interdonation.Model;

/**
 * Created by Semmy
 * mr.shanky08@gmail.com on 11/9/17.
 *
 * @copyright 2016
 * PT.Bisnis Indonesia Sibertama
 */

public class EventModel {

    private String title;

    public EventModel(){}
    public EventModel(String title){
        this.title = title ;

    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }
}
