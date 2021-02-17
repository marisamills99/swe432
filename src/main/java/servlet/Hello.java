package servlet;

import java.io.PrintWriter;
import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(
        name = "MyServlet",
        urlPatterns = {"/hello"}
    )

public class HelloServlet extends HttpServlet
{
  @Override
   protected void doGet  (HttpServletRequest req, HttpServletResponse res)
          throws ServletException, IOException
   {

        res.setContentType ("text/html");
        PrintWriter out = res.getWriter ();

        out.println ("<HTML>");
        out.println ("<HEAD>");
        out.println ("<TITLE>A simple servlet program</TITLE>");
        out.println ("</HEAD>");

        out.println ("<BODY>");
        out.println ("<CENTER>");

        out.println (" <B>Hello from Marisa!</B><BR> <!--  English -->");
        out.println (" <B>Alo !</B><BR> <!--  Portuguese -->");

        out.println ("<P>");
        out.println ("For a longer listing of \"hellos\" to the world, go see");
        out.println ("<A HREF=\"http://www.ipl.org/youth/hello/\">http://www.ipl.org/youth/hello/</A>");

        out.println ("</CENTER>");
        out.println ("</BODY>");

        out.println ("</HTML>");
        out.flush();

        out.close ();

    }
}
