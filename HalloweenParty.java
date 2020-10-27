class HalloweenParty {
		private static class HalloweenParticipant {
			String name;
			int drinks;
			int treats;
			String costume;
			Boolean ditch;
			Boolean designatedDriver;
			Boolean isFuckBoi;
		public HalloweenParticipant(String name) {
			this.name = name;
		}
		public HalloweenParticipant(String name, int drinks, int treats, String costume, Boolean ditch, Boolean designatedDriver, Boolean isFuckBoi) {
			this.name = name;
			this.drinks = drinks;
			this.treats = treats;
			this.costume = costume;
			this.ditch = ditch;
			this.designatedDriver = designatedDriver;
			this.isFuckBoi = isFuckBoi;
		}
	}

	public static HalloweenParticipant[] get_all_attendees() {
		HalloweenParticipant[] attendees = new HalloweenParticipant[5];
		attendees[0] = new HalloweenParticipant("leos", 0, 0, "???", false, null, false);
		attendees[1] = new HalloweenParticipant("llausas", 12, 5, "panda", false, null, false);
		attendees[2] = new HalloweenParticipant("arod", 0, 0, "???", false, null, false);
		attendees[3] = new HalloweenParticipant("chris", 24, 2, "Shaggy", false, null, false);
		attendees[4] = new HalloweenParticipant("boi aka Monkey", attendees[3].drinks, attendees[3].treats, "Scooby", false, true, true);
		return attendees;
	}

	public static void willPartyBeLit(HalloweenParticipant[] attendees) {
		int total_bummers = 0;
		for(int i = 0; i < 5; i++) {
			if (attendees[i].ditch == true || attendees[i].isFuckBoi == true) {
				total_bummers++;
			}
		}
		if (total_bummers > 2) {
			System.out.println("The party WILL NOT be lit :( :(");
		} else {
			System.out.println("The party gonna BE LIT... WOOT WOOT!!");
		}
		return;
	}

	public static void main(String[] args) {
		HalloweenParticipant[] attendees = get_all_attendees();
		for(int i =0; i < 5; i++) {
			System.out.println("Attendee Name: " + attendees[i].name);
			System.out.println("Number of Drinks: " + attendees[i].drinks);
			System.out.println("Number of treats: " + attendees[i].treats);
			System.out.println("Costume: " + attendees[i].costume);
			System.out.println("Will they ditch? " + attendees[i].ditch);
			System.out.println("Designated Driver: " + attendees[i].designatedDriver);
			System.out.println("Is a fuck boi? " + attendees[i].isFuckBoi);
			System.out.println("\n");

		}

		willPartyBeLit(attendees);
	}

}

