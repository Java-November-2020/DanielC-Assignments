public class ProjectClass{
    public String name;
    public String description;
    public double initalCost;

    public String elevatorPitch(String name, String description){
        return name + " : " + description;
    }

    public void ProjectClass(){

    }

    public String ProjectClass(String name){
        return name;
    }

    public String ProjectClass(String name, String description, double cost){
        this.name = name;
        this.description = description;
        this.initalCost = cost;
        return name + "(" + cost + ")" + ": " + description;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getDescription(){
        return description;
    }
    
    public void setDescription(String description){
        this.description = description;
    }


}