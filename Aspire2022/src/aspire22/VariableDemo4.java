package aspire22;

//https://fluvid.com/videos/detail/oKxdEh6a1_CDjody4#.YhWXrlcGA0s.link

public class VariableDemo4 {
	public static void main (String[] args) {
		
		TrainingRoom Rehan = new TrainingRoom();
		TrainingRoom Khaled = new TrainingRoom();
		
		System.out.println(Rehan.sony + ":"+ Khaled.sony);
		
		System.out.println(Rehan.sulab + ":"+ Khaled.sulab);
		
		System.out.println(TrainingRoom.sulab +":"+ TrainingRoom.sulab);
		
	}
	}
		
		class TrainingRoom {
			Projector sony = new Projector();//Instance Variable
			static Toilet sulab = new Toilet();//Class Variable
			
		}

		class Projector{
			
		}
		
		class Toilet {
			
		}

