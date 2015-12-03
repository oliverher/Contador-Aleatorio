package classes;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet(value = "/sortear")
public class Controlador extends HttpServlet {
	protected void service(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {

		HttpSession sessao = req.getSession();

		Contador num;
		
		if(sessao.getAttribute("numeros") == null) {
			num = new Contador();
			sessao.setAttribute("numeros", num);
		} else {
			num = (Contador) sessao.getAttribute("numeros");
		}
		
		String paramAcao = req.getParameter("acao");
		String acao = paramAcao == null ? "" : paramAcao;
		
		
		if(acao.equals("sortear")) {
			num.sortear();
			sessao.setAttribute("numeros", num);
		} else if (acao.equals("reiniciar")){
			num = new Contador();
			sessao.setAttribute("numeros", num);
		}
		
		sessao.setAttribute("numeros", num);

		req.getRequestDispatcher("index.jsp").forward(req, resp);
	}

}
