package servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import module.TPromInfo;
import module.TPromInfoExample;
import module.TProminfoIbeacons;
import module.TProminfoIbeaconsExample;
import module.TStore;
import module.TStoreExample;
import module.TStoreIbeacons;
import module.TStoreIbeaconsExample;
import net.sf.json.JSONObject;

import org.apache.ibatis.session.SqlSession;

import dao.TPromInfoMapper;
import dao.TProminfoIbeaconsMapper;
import dao.TStoreIbeaconsMapper;
import dao.TStoreMapper;
import db.ibatis.MySqlSessionFactory;

public class GetPromotionServlet extends HttpServlet {

	/**
	 * Constructor of the object.
	 */
	public GetPromotionServlet() {
		super();
	}

	/**
	 * Destruction of the servlet. <br>
	 */
	public void destroy() {
		super.destroy(); // Just puts "destroy" string in log
		// Put your code here
	}

	/**
	 * The doGet method of the servlet. <br>
	 * 
	 * This method is called when a form has its tag value method equals to get.
	 * 
	 * @param request
	 *            the request send by the client to the server
	 * @param response
	 *            the response send by the server to the client
	 * @throws ServletException
	 *             if an error occurred
	 * @throws IOException
	 *             if an error occurred
	 */
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		SqlSession sqlSession = MySqlSessionFactory.getSqlSession();
		String ibeaconid = request.getParameter("ibeaconid");
		String storeno = request.getParameter("storeno");

		TProminfoIbeaconsExample tpiexampe = new TProminfoIbeaconsExample();
		tpiexampe.or().andStorenoEqualTo(storeno);
		if (ibeaconid == null || "".equals(ibeaconid.trim())) {
			tpiexampe.or().andIbeaconidEqualTo(ibeaconid);
		}

		TProminfoIbeaconsMapper tpimapper = sqlSession
				.getMapper(TProminfoIbeaconsMapper.class);

		List<TProminfoIbeacons> tpilist = tpimapper.selectByExample(tpiexampe);
		TPromInfoMapper tpmapper = sqlSession.getMapper(TPromInfoMapper.class);

		List<JSONObject> tsiobjlist = new ArrayList<JSONObject>();

		for (TProminfoIbeacons tProminfoIbeacons : tpilist) {
			TPromInfoExample tpexample = new TPromInfoExample();
			tpexample.or().andStorenoEqualTo(tProminfoIbeacons.getStoreno())
					.andProminfoidEqualTo(tProminfoIbeacons.getProminfoid());

			List<TPromInfo> tplist = tpmapper.selectByExample(tpexample);
			for (TPromInfo tPromInfo : tplist) {
				JSONObject tsiobj = new JSONObject();
				tsiobj.element("adimage", tPromInfo.getAdimage());
				tsiobj.element("description", tPromInfo.getDescription());
				tsiobjlist.add(tsiobj);

			}

		}
		sqlSession.clearCache();
		String str = "{totalCount :" + tsiobjlist.size() + ", data:"
				+ tsiobjlist.toString() + "}";

		response.setContentType("text/html; charset=utf-8");
		PrintWriter pw = response.getWriter();
		System.out.println(str);
		pw.write(str);
		pw.flush();
		pw.close();
	}

	/**
	 * The doPost method of the servlet. <br>
	 * 
	 * This method is called when a form has its tag value method equals to
	 * post.
	 * 
	 * @param request
	 *            the request send by the client to the server
	 * @param response
	 *            the response send by the server to the client
	 * @throws ServletException
	 *             if an error occurred
	 * @throws IOException
	 *             if an error occurred
	 */
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		doGet(request, response);
	}

	/**
	 * Initialization of the servlet. <br>
	 * 
	 * @throws ServletException
	 *             if an error occurs
	 */
	public void init() throws ServletException {
		// Put your code here
	}

}
