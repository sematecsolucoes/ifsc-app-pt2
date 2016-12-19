package br.com.sematec.gerenciador.web;

import static br.com.sematec.ifsc.dao.DAOFactory.MEMORIA;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import br.com.sematec.ifsc.dao.UsuarioDAOFactory;
import br.com.sematec.modelo.Usuario;

@WebServlet(urlPatterns = "/login")
public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String email = req.getParameter("email");
		String senha = req.getParameter("senha");
		Usuario usuario = UsuarioDAOFactory.getInstance(MEMORIA).buscaPorEmailESenha(email, senha);
		PrintWriter writer = resp.getWriter();
		if (usuario == null) {
			writer.println("<html><body>Usuario invalido</body></html>");
		} else {
			HttpSession session = req.getSession();
			session.setAttribute("usuarioLogado", usuario);
			writer.println("<html><body>Usuario logado: " + email + "</body></html>");
		}
	}
}
