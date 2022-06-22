package Collections;

import java.util.HashMap;
import java.util.Map;

public class PhoneBook {

	HashMap<String, String> phoneNotes = new HashMap<>();

	public void addNoteIntoPhoneBook(String phone, String name) {
		phoneNotes.put(phone, name);	
	}

	public void getNoteFromPhoneBook(String name) {
		for (Map.Entry<String, String> o : phoneNotes.entrySet()) {
			if (o.getValue().equals(name)) {
				System.out.println(o.getKey());
			}
		}
	}
}
