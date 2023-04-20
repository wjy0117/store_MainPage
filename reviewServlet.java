package InsertServlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import DataClass.*;
import DB.*;

/**
 * Servlet implementation class reviewServlet
 */
@WebServlet("/review")
public class reviewServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public reviewServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		// response.getWriter().append("Served at: ").append(request.getContextPath());

		System.out.println("리뷰 서블릿 호출");
		request.setCharacterEncoding("utf-8");
		String context = request.getContextPath();

		DB_Conn dao = new DB_Conn();

		//리뷰데이터 모델클래스.
		reviewData sd = new reviewData();

		// 각 페이지가 아직 연결되지 않아 세션가져오기 어려움
		// 임시로 아이디 입력칸 생성
		try {
			//메뉴 리스트와 태그 리스트.
			String menuListView = request.getParameter("menuListView");
			String tagListView = request.getParameter("tagListView");
			
			//input 받아옴.
			String review_noname = request.getParameter("noname_check"); //null인가 아닌가.
			String review_store = request.getParameter("review_storeCode"); // request.getParameter("review_storeCode");
			String review_id = request.getParameter("review_input_id");
			String review_text = request.getParameter("review_text");
			String review_score = request.getParameter("score_result"); // request.getParameter("score_review");

			//받아온 결과 출력.
			//true: value, false: null(익명체크)
			System.out.println("no: "+review_noname);
			
			System.out.println("menu: "+menuListView);
			System.out.println("tag: "+tagListView);
			
			System.out.println("store: "+review_store);
			System.out.println("id: "+review_id);
			System.out.println("text: "+review_text);
			System.out.println("score: "+review_score);

			//데이터 등록
			sd.setStoreCode(review_store);
			sd.setUserId(review_id);
			sd.setContents(review_text);
			sd.setRating(review_score);
			sd.setPhotoPath("지금 사진등록을 못해");
			sd.setAnonymous(review_noname);
			
			//store, id, text, score 등록에 큰 문제 없으므로 일단 DB접속 막아둠.
			dao.Insert_ReviewData(sd);
			dao.Insert_List(menuListView, review_id, tagListView, review_store);
			System.out.println("db 등록 끝");
			
			response.sendRedirect(context + "/Store.jsp");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
