package re;

public class Room {
	public class Room {
			private int Id;
		private String name;
		private String courier;
		private String dateTime;
		private int type;
		public Room(int Id, String name, String courier, String dateTime, int type){
			this.Id=Id;
			this.name=name;
			this.courier=courier;
			this.dateTime=dateTime;
			this.type=type;
		}
		public int getId(){
			return Id;
		}
		public void setId(int Id){
			this.Id=Id;
		}
		public int getname(){
			return name;
		}
		public void setname(int name){
			this.name=name;
		}
		public int getcourier(){
			return courier;
		}
		public void setcourier(int courier){
			this.courier=courier;
		}
		public int getdateTime(){
			return dateTime;
		}
		public void setdateTime(int dateTime){
			this.dateTime=dateTime;
		}
		public int gettype(){
			return type;
		}

		public void settype(int type) {
			this.type = type;
		}
		public String toString(){
			return "индекатор-"+Id+"\n"+"Название Товара-"+name+"\n"+"Курьер-"+courier+"\name"+"Дата и время -"+dateTime+"/5"+"\n"+"тип заказа-"+type+"\n";
		}
}
