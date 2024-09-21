package sj;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LinkServlet extends HttpServlet {
	//GETメソッドのリクエスト受信時に実行されるメソッド
	public void doGet(HttpServletRequest request, HttpServletResponse response)
	throws ServletException, IOException {
		
		//リクエスト・レスポンスの設定
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html; Charset=UTF-8");
		
		//リンクをクリックした後である事を示す属性を設定して転送
		request.setAttribute("text","Servletからデータを受信しました:侍太郎さん、こんにちは！");
		RequestDispatcher dispatcher = request.getRequestDispatcher("/index.jsp");
		dispatcher.include(request, response);
		
	}

}
