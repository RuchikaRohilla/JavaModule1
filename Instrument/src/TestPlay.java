
public class TestPlay {

	public static void main(String[] args) {
		Instrument i[]=new Instrument[10];
		i[0]=new Piano();
		i[1]=new Guitar();
		i[2]=new Flute();
		i[3]=new Piano();
		i[4]=new Guitar();
		i[5]=new Flute();
		i[6]=new Piano();
		i[7]=new Guitar();
		
		for(int j=0;j<i.length;j++){
			display(i[j]);
		}
	}
		public static  void display(Instrument e){
			
			if(e instanceof Piano){
				Piano p=(Piano)e;
				p.play();
			}
			if(e instanceof Guitar){
				Guitar g=(Guitar)e;
				g.play();
			}
			if(e instanceof Flute){
				Flute f=(Flute)e;
				f.play();
			}
			
		}
	}


