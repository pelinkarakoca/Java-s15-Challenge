package library.admin;

import library.collection.Book;
import library.collection.LibraryCollection;

import java.util.*;

public class Library {
	private Map<Long, LibraryCollection> libraryCollectionMap;
	private Map<String, Member> memberMap;

	public Library(Set<Member> memberList, List<Book> libraryCollectionList) {
		libraryCollectionMap = new HashMap<>();
		for(LibraryCollection libraryCollection: libraryCollectionList){
			libraryCollectionMap.put(libraryCollection.getId(), libraryCollection);
		}
		memberMap = new HashMap<>();
		for(Member member: memberList){
			memberMap.put(member.getMemberId(), member);
		}
	}

	public Map<String, Member> getMemberMap() {
		return memberMap;
	}

	public Map<Long, LibraryCollection> getLibraryCollectionMap() {
		return libraryCollectionMap;
	}

	public void addMember(String id, Member member) {

		memberMap.put(id, member);
	}

	public void addLibraryCollection(Long id, LibraryCollection libraryCollection) {
		libraryCollectionMap.put(id, libraryCollection);

	}

	public Book withdrawBook(long id) {
		Book selectedBook = (Book)libraryCollectionMap.get(id);
		selectedBook.setAvailability(false);
		return selectedBook;
	}

	public Book depositBook(long id) {
		Book selectedBook = (Book)libraryCollectionMap.get(id);
		selectedBook.setAvailability(true);
		return selectedBook;
	}

}
