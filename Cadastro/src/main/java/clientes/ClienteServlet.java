package clientes;


import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet(urlPatterns = "/servlet")
public class ClienteServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private Cliente cliente;
	GerenciadorCliente gc;


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String nome, sexo,estado;
		int ra;
		
		nome = request.getParameter("nome");
		sexo = request.getParameter("sexo");
		
		estado = request.getParameter("estado");
		
		ra = Integer.parseInt((request.getParameter("ra")));
		
		 gc = new GerenciadorCliente();
		cliente = new Cliente(nome, sexo, ra, estado);
		
		
		gc.salvarCliente(cliente);

		response.setContentType("text/html");
		response.getWriter()
				.print("<script> window.alert('Salvo Sucesso!');location.href='ViewCadastro.html';  </script>");
		
//		RequestDispatcher dispatcher = request.getRequestDispatcher("ViewCadastro.html");
//		dispatcher.forward(request, response);

	}
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		
		
		req.setAttribute("clients", gc.getClientes());
		RequestDispatcher dispatcher = req.getRequestDispatcher("ViewResposta.jsp");
		dispatcher.forward(req,resp);
	}
	
	

}
