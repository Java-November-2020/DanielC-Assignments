public class Portfolio{
    public ArrayList<Project> Projects;

    public Portfolio() {
        this.Projects = new ArrayList<Project>();
    }

    public void AddToPortfolio(Project proj) {
        Projects.add(proj);
    }
    public String getPortfolio() {
        return Projects.toString();
    }

    //I don't really understand anything south of here. (2020-11-21)
    public double getPortfolioCost() {
        double total = 0;
        for (Project p : Projects) {
            total += p.getCost();
        }
        return total;
    }
    public void showPortfolio() {
        System.out.println("All projects in portfolio:");
        for(Project p : Projects) {
            System.out.println(p.ElevatorPitch());
    }
    System.out.println(String.format("Total Cost: %f", this.getPortfolioCost()));

    }
}