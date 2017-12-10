package com.springbook.view.board;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.springbook.biz.board.BoardVO;
import com.springbook.biz.board.impl.BoardDAO;

// �ش� ��û�� ������, @Controller�� ���� ��� ��Ʈ�ѷ� ��ü�� ����
// �ش� ��ü�� �޼ҵ带 ����, �� �� �Ű������� �ش��ϴ� ��ü�� '������ �����̳ʰ� ����'
// ����ڰ� �Է��� �Ķ���͵��� �����Ͽ� BoardVO�� �Ҵ�(Setter �޼ҵ� �̿�)
// insertBoard �޼ҵ� ȣ�� ��, ������ BoardVO�� ���ڷ� ���޵ȴ�.
// ��, Form �±��� �Ķ���� �̸� = Command ��ü�� Setter �޼ҵ� �̸��� ��ġ�ؾ� �Ѵ�.
// ex> name="title" // setTitle(String title) {}
@Controller
public class InsertBoardController {
	
	@RequestMapping(value="/insertBoard.do")
	public String insertBoard(BoardVO vo, BoardDAO boardDAO) {
		System.out.println("�� ��� ó��");
		boardDAO.insertBoard(vo);
		return "redirect:getBoardList.do";
	}
}
