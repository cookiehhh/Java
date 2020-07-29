
public class ConnectionManager {
    static JavaDateConnection njdc = new JavaDateConnection();
    public static void main(String[] args) throws Exception {
    	int choice = 0;
    	switch (choice) {
		case 1:
			njdc.insert();
			break;
		case 2:
			njdc.update();
			break;
		case 3:
			njdc.delete();
			break;
		case 4:
			njdc.select();
			break;
		case 0:
			return ;

		default:
			break;
		}

    }
}
