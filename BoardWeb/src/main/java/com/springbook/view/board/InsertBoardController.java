package com.springbook.view.board;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.springbook.biz.board.BoardVO;
import com.springbook.biz.board.impl.BoardDAO;

// 해당 요청이 들어오면, @Controller가 붙은 모든 컨트롤러 객체르 생성
// 해당 객체의 메소드를 실행, 이 때 매개변수에 해당하는 객체를 '스프링 컨테이너가 생성'
// 사용자가 입력한 파라미터들을 추출하여 BoardVO에 할당(Setter 메소드 이용)
// insertBoard 메소드 호출 시, 이전의 BoardVO가 인자로 전달된다.
// 단, Form 태그의 파라미터 이름 = Command 객체의 Setter 메소드 이름이 일치해야 한다.
// ex> name="title" // setTitle(String title) {}
@Controller
public class InsertBoardController {
	
	@RequestMapping(value="/insertBoard.do")
	public String insertBoard(BoardVO vo, BoardDAO boardDAO) {
		System.out.println("글 등록 처리");
		boardDAO.insertBoard(vo);
		return "redirect:getBoardList.do";
	}
}
