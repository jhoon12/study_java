package no2List;

import java.util.*;

public class Vector1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Board> list = new Vector<Board>();
		list.add(new Board("����1", "����1", "�۾���1"));
		list.add(new Board("����2", "����2", "�۾���2"));
		list.add(new Board("����3", "����3", "�۾���3"));
		list.add(new Board("����4", "����4", "�۾���4"));
		list.add(new Board("����5", "����5", "�۾���5"));
		
		list.remove(2);
		list.remove(3);
		for(int i = 0; i <list.size();i++) {
			Board board = list.get(i);
			System.out.println(board.subject+""+board.content + ""+board.writer);
		}
	}

}
