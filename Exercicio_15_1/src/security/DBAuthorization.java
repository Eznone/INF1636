package security;
import java.util.*;
import validation.*;

public class DBAuthorization {
	static Map<Integer, IAuthorization> db = new HashMap<>();
	
	public static void init() {
		db = new HashMap<Integer, IAuthorization>();
		db.put(11111, new Authorization(11111, "aa"));
		db.put(22222, new Authorization(22222, "bb"));
		db.put(33333, new Authorization(33333, "cc"));
		db.put(44444, new Authorization(44444, "dd"));
		db.put(55555, new Authorization(55555, "ee"));
	}
	
	public static IAuthorization getAuthorization(int code) {
		return db.get(code);
	}
}
