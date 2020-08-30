

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.ecommerce.Color;
import com.ecommerce.EProduct;
import com.ecommerce.Finance;
import com.ecommerce.HibernateUtil;
import com.ecommerce.OS;
import com.ecommerce.ScreenSizes;

/**
 * Servlet implementation class ProductDetails
 */

public class ProductDetails extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ProductDetails() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
			SessionFactory factory = HibernateUtil.getSessionFactory();
			
			Session session = factory.openSession();
			
			
			@SuppressWarnings("unchecked")
			List<EProduct> list = session.createQuery("from EProduct").list();
			
			PrintWriter out = response.getWriter();
			
			out.println("<html><body>");
			
			for(EProduct p:list) {
				
				String id= String.valueOf(p.getId());
				String price = String.valueOf(p.getPrice());
				List<Color> colors = p.getColors();
				String colorsAvail="";
				for(Color c : colors) {
					colorsAvail += (c.getName()+",");
				}
				
				Collection<ScreenSizes> sizes = p.getScreenSizes();
				String screenAvail="";
				for(ScreenSizes s:sizes) {
					screenAvail += (s.getSize()+",");
				}
				
				
				Set<OS> os = p.getOs();
				String osAvail="";
				for(OS o:os) {
					osAvail += (o.getName()+",");
				}
				
				
				Map finances = p.getFinance();
				
				String financeAvail="";
				if(finances.get("BANK")!=null) {
					Finance f =(Finance) finances.get("BANK");
					financeAvail +=(f.getName()+",");
				}
				if(finances.get("CREDITCARD") != null) {
					Finance f =(Finance) finances.get("CREDITCARD");
					financeAvail +=(f.getName()+",");				
				}
				
				out.println(id+"|"+price+"|"+colorsAvail+"|"+screenAvail+"|"+osAvail+"|"+financeAvail);
				out.println("<br><hr>");
			}
			session.close();
			
			out.println("</body></html>");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
