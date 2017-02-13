package DAL;


public interface Facility_Interface {
    public void listUnits();
    public String getFacilityInfo();
    public int getAvailableCapacity();
    public boolean addNewUnit(Unit unit);
    public void addFacilityDetail(String detail);
    public boolean removeUnit(Unit unit);
    public ArrayList<Inspection> getInspections();
    public void addInspection(Inspection inspection);
    public double getUsage();

}