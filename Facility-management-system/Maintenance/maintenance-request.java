//import


public MaintenanceRequest(){}

public void makeFacilityMaintRequest(Maintainance maintainance, Facility_Interface facility) {
        maintainanceRequests.put(maintainance, facility);
        }

public void calcMaintainanceCost(Facility_Interface facility) {
        double cost = 0.0;
        for (Entry<Facility1, ArrayList<Maintainance>> entry : scheduledMaintainances.entrySet()) {
        if (entry.getKey() == facility) {
        for (Maintainance m : entry.getValue()){
        cost += m.getCost();}
        }
        }
        System.out.println(Cost);
}

public void calcProblemRateForFacility(Facility_Interface facility) {
        int problemrate = 0;
        for (Entry<Maintainance, Facility_Interface> entry : maintainanceRequests.entrySet()){
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
    for (Entry<Manintainance, Facility_Interface> entry : manintainanceRequests.entrySet()){
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
        for (Entry<Facility_Interface, ArrayList<Maintainance>> entry : scheduledMaintainances.entrySet()){
        if (entry.getKey() == facility){
        for (Maintainance m : entry.getValue())
        System.out.println(m.getType());
        }
        }
}

public void scheduleMaintainance(Facility_Interface facility, ArrayList<Maintainance> maintainance) {
        scheduledMaintainances.put(facility,maintainance);
        }

public void listMaintainance() {
        for (Entry<Facility_Interface, ArrayList<Maintainance>> entry : scheduledMaintainances.entrySet()){
        System.out.println("Facility: " + entry.getKey().getFacilityInfo() + " requesting maintainances in...");
        for (Maintainance m : entry.getValue()){
        System.out.print(m.getType() + ", ");
        }
        }
}

public void listMaintainanceRequest() {
        for (Entry<Maintainance, Facility_Interface> entry : maintainanceRequests.entrySet())
        System.out.println("Maintainance types: " + entry.getKey().getType() + " made by the facility" + entry.getValue().getFacilityInfo());
        }

        }