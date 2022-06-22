package Collections;

public class PhoneBookMain {

	public static void main(String[] args) {
		PhoneBook phoneBook = new PhoneBook();
		phoneBook.addNoteIntoPhoneBook("89998887766", "Alex");
		phoneBook.addNoteIntoPhoneBook("89998887767", "Maria");
		phoneBook.addNoteIntoPhoneBook("89998887768", "Maria");
		phoneBook.getNoteFromPhoneBook("Maria");
		//phoneBook.getNoteFromPhoneBook("Mari");
	}

}
