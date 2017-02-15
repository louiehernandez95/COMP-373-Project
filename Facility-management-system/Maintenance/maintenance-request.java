//import


public MaintenanceRequest(){}

public void makeFacilityMaintRequest(Maintenance maintenance, Facility_Interface facility) {
        maintenanceRequests.put(maintenance, facility);
        }

public void calcMaintenanceCost(Facility_Interface facility) {
        double cost = 0.0;
        for (Entry<Facility1, ArrayList<Maintenance>> entry : scheduledMaintenances.entrySet()) {
        if (entry.getKey() == facility) {
        for (Maintenance m : entry.getValue()){
        cost += m.getCost();}
        }
        }
        System.out.println(Cost);
}

public void calcProblemRateForFacility(Facility_Interface facility) {
        int problemrate = 0;
        for (Entry<Maintenance, Facility_Interface> entry : maintenanceRequests.entrySet()){
        if (entry.getValue() == facility){
        if (entry.getKey().getType() == "Gas")
        problemrate = 1;
        else if (entry.getKey().getType() == "Electric")
        problemrate = 2;
        else if (entry.getKey().getType() == "Heat")
        problemrate = 3;
        }
        }
        System.out.println(ProblemRate);
}

public void calcDownTimeForFacility(Facility_Interface facility) {
    int problemrate = 0;
    for (Entry<Maintenance, Facility_Interface> entry : maintenanceRequests.entrySet()){
        if (entry.getValue() == facility){
            if (entry.getKey().getType() == "Tornado"
        problemrate = 4;
            else if (entry.getKey().getType() == "Hurricane" )
                problemrate = 5;

        }
    }
        System.out.println(DownTime);
        }

public void listFacilityProblems(Facility_Interface facility) {
        for (Entry<Facility_Interface, ArrayList<Maintenance>> entry : scheduledMaintenances.entrySet()){
        if (entry.getKey() == facility){
        for (Maintenance m : entry.getValue())
        System.out.println(m.getType());
        }
        }
}

public void scheduleMaintenance(Facility_Interface facility, ArrayList<Maintenance> maintenance) {
        scheduledMaintenances.put(facility,maintenance);
        }

public void listMaintenance() {
        for (Entry<Facility_Interface, ArrayList<Maintenance>> entry : scheduledMaintenances.entrySet()){
        System.out.println("Facility: " + entry.getKey().getFacilityInfo() + " requesting maintenances in...");
        for (Maintenance m : entry.getValue()){
        System.out.print(m.getType() + ", ");
        }
        }
}

public void listMaintenanceRequest() {
        for (Entry<Maintenance, Facility_Interface> entry : maintenanceRequests.entrySet())
        System.out.println("Maintenance types: " + entry.getKey().getType() + " made by the facility" + entry.getValue().getFacilityInfo());
        }

        }