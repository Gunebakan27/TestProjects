package SpaceChallenge;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Simulation {
public Simulation(){
		
	}
	public ArrayList<Item> loadItems(String fileName) throws NumberFormatException, IOException    {				
				BufferedReader reader=new BufferedReader(new FileReader(fileName));				   	
				ArrayList<Item>itemArrayList=new ArrayList<>();
					String line;						
					while((line=reader.readLine())!=null){
			            String[] oneItem = line.split("=");
			            String name=oneItem[0];
			            int weight=Integer.valueOf(oneItem[1]);		                      
			            Item item1=new Item(name,weight);			            
			            itemArrayList.add(item1);	
			           
			        }
					
					return itemArrayList;				  
				}
	public ArrayList<Rocket> loadU1(ArrayList<Item> itemArrayList){	
		ArrayList<Rocket> fleet = new ArrayList<>();
		Rocket r = new U1();
        int itemCounter = 1;
        int rocketCounter = 1;
//        System.out.println("\nU1 Rocket weight = " + r.weight + "; maxWeight = " + r.maxWeight);
        for (Item i : itemArrayList) {
            while (!r.canCary(i)) {
//                System.out.println(" Adding next Item " + itemCounter + ": " + i.name + " = " + i.weight
//                        + " failed -> No." + rocketCounter + " U1 full");
                rocketCounter++;
                fleet.add(r);
                r = new U1();
            }
            r.carry(i);
//            System.out.println("Item " + itemCounter + ": " + i.name + " = " + i.weight + "; Rocket weight = "
//                    + r.currentWeight + "; Item added");
            itemCounter++;
        }
        fleet.add(r);
        System.out.println("U1 fleet contains " + fleet.size() + " rockets");
        return fleet;		
		
		
		
		
//		ArrayList<U1>u1ArrayList=new ArrayList<>();
//		U1 u1=new U1();	
//			for (int i=0;i<itemArrayList.size();i++) {
//			int sum=u1.weight+=itemArrayList.get(i).weight;	
//			if(sum<=u1.maxWeight) {	
//				itemsForOneRocket.add(itemArrayList.get(i));			
//				System.out.println(itemArrayList.get(i).weight);
//			}
//	}	
//			U1 rocket=new U1(itemsForOneRocket);
//			u1ArrayList.add(rocket);	
//		System.out.println(u1.weight);
//		System.out.println(itemsForOneRocket.size());	
//		return u1ArrayList;
	}
	public ArrayList<Rocket> loadU2(ArrayList<Item> ArrayList){
		ArrayList<Rocket> fleet = new ArrayList<>();
        Rocket r = new U2();

        int itemCounter = 1;
        int rocketCounter = 1;

        System.out.println("U2 Rocket weight = " + r.weight + "; maxWeight = " + r.maxWeight);

        for (Item i : ArrayList) {

            while (!r.canCary(i)){
//                System.out.println(" Adding next Item " + itemCounter + ": " + i.name + " = " + i.weight
//                        + " failed -> No." + rocketCounter + " U2 full");
                rocketCounter++;
                fleet.add(r);
                r = new U2();
            }
            r.carry(i);
//            System.out.println("Item " + itemCounter + ": " + i.name + " = " + i.weight + "; Rocket weight = "
//                    + r.currentWeight + "; Item added");
            itemCounter++;
        }
        fleet.add(r);
        System.out.println("U2 fleet contains " + fleet.size() + " rockets\n");
        return fleet;
	}
	public int runSimulation(ArrayList<Rocket> ArrayList) {
		int num = 0; //failed trials of launch/land
        int indexSuccess = 1;
        for (Rocket r : ArrayList) {

            while (!r.launch()) {
                r.launch();
                num++;
                //System.out.println("Extra trials: " + num);
            }
            //System.out.println("No." + indexSuccess + " rocket launched");

            while (!r.land()) {
                r.land();
                num++;
                //System.out.println("Extra trials: " + num);
            }
            //System.out.println("No." + indexSuccess + " rocket landed\n");
            indexSuccess++;
        }
        int budget = ArrayList.get(0).cost * (ArrayList.size() + num);
        System.out.println(ArrayList.size() + " rockets and " + num + " extra trials = "
                + (ArrayList.size() + num) + " in total");
        return budget;
		
	}
//	public static void main(String[] args) throws NumberFormatException, IOException {
//
//		// Create a Simulation object
//        Simulation sim = new Simulation();
//
//        // Load Items for Phase-1 and Phase-2
//        ArrayList<Item> phase1 = sim.loadItems("src/SpaceChallenge/phase-1.txt");
//        ArrayList<Item> phase2 = sim.loadItems("src/SpaceChallenge/phase-2.txt");
//
//
//        // Load a fleet of U1 rockets for Phase-1 and then for Phase-2
//        ArrayList<Rocket> u1FleetPhase1 = sim.loadU1(phase1);
//        ArrayList<Rocket> u1FleetPhase2 = sim.loadU1(phase2);
//
//
//        // Run the simulation using the fleet of U1 rockets and display the total budget required
//        System.out.println("\nU1 rocket cost = 100");
//        int budgetU1phase1 = sim.runSimulation(u1FleetPhase1);
//        		
//        System.out.println("Budget of U1 fleet for phase 1 = " + budgetU1phase1 + " (millions)");
//
//        int budgetU1phase2 = sim.runSimulation(u1FleetPhase2);
//        System.out.println("Budget of U1 fleet for phase 2 = " + budgetU1phase2 + " (millions)");
//
//        System.out.println("Total budget of U1 fleet = " + (budgetU1phase1 + budgetU1phase2) + " (millions)\n");
//
//
//        // Repeat the same for U2 rockets and display the total budget for that
//        ArrayList<Rocket> u2FleetPhase1 = sim.loadU2(phase1);
//        ArrayList<Rocket> u2FleetPhase2 = sim.loadU2(phase2);
//        System.out.println("\nU2 rocket cost = 120");
//        int budgetU2phase1 = sim.runSimulation(u2FleetPhase1);
//        System.out.println("Budget of U2 fleet for phase 1 = " + budgetU2phase1 + " (millions)");
//
//        int budgetU2phase2 = sim.runSimulation(u2FleetPhase2);
//        System.out.println("Budget of U2 fleet for phase 2 = " + budgetU2phase2 + " (millions)");
//
//        System.out.println("Total budget of U1 fleet = " + (budgetU2phase1 + budgetU2phase2) + " (millions)\n");
//
//	
//		
//	}
}
