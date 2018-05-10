import java.time.OffsetDateTime
import javax.servlet.http.{HttpServlet, HttpServletRequest, HttpServletResponse}

class HelloWorldServlet extends HttpServlet {
  override def doGet(req: HttpServletRequest,
                     resp: HttpServletResponse): Unit = {
    resp.getWriter.write(OffsetDateTime.now().toString)
    resp.getWriter.close()
  }
}
