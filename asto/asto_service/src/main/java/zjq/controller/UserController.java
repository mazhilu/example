package zjq.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import zjq.model.User;
import zjq.model.usertest;
import zjq.service.UserServiceI;

@Controller
@RequestMapping("/UserController")
public class UserController {
	private int size = 0;// 总页数
	private int pagenow = 0;// 重第几tiao开始
	private int pagesize = 5;// 每页条数
	private UserServiceI userServiceI;

	public UserServiceI getUserServiceI() {
		return userServiceI;
	}

	@Autowired
	public void setUserServiceI(UserServiceI userServiceI) {
		this.userServiceI = userServiceI;
	}
	@RequestMapping("/addset")
	public ModelAndView addset() {
		return new ModelAndView("add");
	}
	
	@RequestMapping("/showUser/{id}")
	public ModelAndView showUser(@PathVariable Integer id) {
		Map<String, Object> map = new HashMap<String, Object>();
		User u = userServiceI.getUserById(id);
		map.put("user", u);
		System.out.println(u.getName());

		return new ModelAndView("default", map);
	}

	@RequestMapping("/default")
	public ModelAndView showUser1(Integer id, HttpServletRequest request) {
		Map<String, Object> map = new HashMap<String, Object>();
		User u = userServiceI.getUserById(id);
		map.put("user", u);
		return new ModelAndView("a", map);
	}

	/*
	 * 显示页面的方法
	 */
	@RequestMapping("/show")
	public ModelAndView show(Map<String, Object> map) {
		// Map<String,Object> map = new HashMap<String,Object>();
		// List<Object> list = new ArrayList<Object>();
		List<User> l = userServiceI.getAll4();
		map.put("user", l);
		/*
		 * Iterator<User> p = l.iterator(); while (p.hasNext()) { User t =
		 * (User) p.next(); System.out.println(t.getId() + "   " + t.getName() +
		 * "   " + t.getAge()); List<usertest> k = t.getUserget();
		 * Iterator<usertest> usert = k.iterator(); while (usert.hasNext()) {
		 * usertest test = usert.next(); System.out.println(test.getUserid() +
		 * " " + test.getUsername() + "  " + test.getAge()); // map.put("user2",
		 * test); Integer id = t.getId(); String name = t.getName(); Integer age
		 * = t.getAge(); String username = test.getUsername(); list.add(id);
		 * list.add(name); list.add(age); list.add(username);
		 * 
		 * } } Set<String> set = map.keySet(); Iterator<String> key =
		 * set.iterator(); while(key.hasNext()){ String keys = key.next();
		 * System.out.println(keys); list.add(key); }
		 */

		return new ModelAndView("test");
	}

	@RequestMapping("/ber")
	public ModelAndView get() {

		return new ModelAndView("add");
	}

	/*
	 * 添加的方法
	 */
	@RequestMapping("/add")
	public ModelAndView add(HttpServletRequest request, Map<String, Object> errors) {

		// User form = CommonUtils.toBean(request.getParameterMap(),
		// User.class);
		User form = new User();
		String id = request.getParameter("id");
		String regex = "[0-9]{1,9}";
		if (!id.matches(regex)) {
			errors.put("errors", "id必须为数字,长度1~9之间");
			errors.put("errorsid", id);
			return new ModelAndView("add");
		}
		int id1 = Integer.parseInt(id);

		String username1 = request.getParameter("name");

		String regex1 = "[0-9]{1,3}";
		String age = request.getParameter("age");
		if (username1 == null || username1.trim().isEmpty()) {
			errors.put("names", "姓名不能为空");
			errors.put("errorsid", id);
			errors.put("errorsname", username1);
			errors.put("errorsage", age);
			return new ModelAndView("add");
		}

		if (!age.matches(regex1)) {
			errors.put("age", "年龄必须为数字,长度1~3之间");
			errors.put("errorsid", id);
			errors.put("errorsname", username1);
			errors.put("errorsage", age);
			return new ModelAndView("add");
		}

		int age1 = Integer.parseInt(age);

		User user = userServiceI.getUserById(id1);
		if (user != null) {
			errors.put("id", "id已有请重新添加");
			errors.put("errorsid", id);
			errors.put("errorsname", username1);
			errors.put("errorsage", age);
			return new ModelAndView("add");
		}

		form.setId(id1);
		form.setName(username1);
		form.setAge(age1);

		if (errors.size() > 0) {
			request.setAttribute("form", form);
			return new ModelAndView("add");
		}
		userServiceI.insert(form);
		List<User> pp = userServiceI.getAll7(0, pagesize);
		errors.put("sizeto", 0);
		errors.put("user", pp);
		return new ModelAndView("addpag");
	}

	/*
	 * 显示页面
	 */
	@RequestMapping("/list")
	public ModelAndView List(Map<String, Object> errors) {
		List<User> pp = userServiceI.getAll7(0, pagesize);
		errors.put("sizeto", size);
		errors.put("user", pp);
		return new ModelAndView("addpag");
	}

	/*
	 * 翻页
	 */
	@RequestMapping("/list/{sizeto}")
	public ModelAndView List(@PathVariable Integer sizeto, Map<String, Object> map) {
		sizeto = sizeto + 1;

		List<User> l = userServiceI.getAll6();
		size = (int) Math.ceil(l.size() / 5);
		
		if(l.size()%5==0){
			size=size-1;
		}

		if (sizeto > size) {
			sizeto = size;
		}
		pagenow = sizeto * 5;
		List<User> pp = userServiceI.getAll7(pagenow, pagesize);
		map.put("sizeto", sizeto);
		map.put("user", pp);
		return new ModelAndView("addpag");
	}

	/*
	 * 翻页
	 */
	@RequestMapping("/listdo/{sizeto}")
	public ModelAndView Listget(@PathVariable Integer sizeto, Map<String, Object> map) {
		sizeto = sizeto - 1;
		List<User> l = userServiceI.getAll6();
		System.out.println("+++++++****" + l.size());
		size = (int) Math.ceil(l.size() / 5);
        
		if(l.size()%5==0){
			size=size-1;
		}

		
		if (sizeto < 0) {
			sizeto = 0;
		}
		pagenow = sizeto * 5;
		List<User> pp = userServiceI.getAll7(pagenow, pagesize);

		map.put("sizeto", sizeto);
		map.put("user", pp);
		return new ModelAndView("addpag");
	}

	/*
	 * 按ID删除
	 */
	@RequestMapping("/delete/{id}")
	public ModelAndView delete(@PathVariable Integer id, Map<String, Object> errors) {
		userServiceI.delete(id);
		List<User> pp = userServiceI.getAll7(0, pagesize);
		errors.put("sizeto", 0);
		errors.put("user", pp);
		return new ModelAndView("addpag");
	}

	/*
	 * 修改
	 */
	@RequestMapping("/update/{id}")
	public ModelAndView update(@PathVariable Integer id, Map<String, Object> errors) {
		System.out.println(id);
		errors.put("id", id);
		return new ModelAndView("update");
	}

	@RequestMapping("/updateto/{id}")
	public ModelAndView updateto(@PathVariable Integer id, HttpServletRequest request, Map<String, Object> errors) {
		System.out.println(id);
		User form = new User();
		String id1 = request.getParameter("id");
		int d2 = Integer.parseInt(id1);

		String username1 = request.getParameter("name");

		String age = request.getParameter("age");
		String regex = "[0-9]{1,3}";
		if (!age.matches(regex)) {
			errors.put("errors", "年龄必须为数字,长度1~3之间");
			errors.put("id", id);
			return new ModelAndView("update");
		}
		int age1 = Integer.parseInt(age);
		form.setId(id);
		form.setName(username1);
		form.setAge(age1);

		userServiceI.updateByPrimaryKeySelective(form);
		List<User> pp = userServiceI.getAll7(0, pagesize);
		errors.put("sizeto", 0);
		errors.put("user", pp);
		return new ModelAndView("addpag");
	}
	
	
	/*
	 * 搜索
	 */
	@RequestMapping("/find")
	public ModelAndView find(HttpServletRequest request,Map<String, Object> errors){
		String id = request.getParameter("id");	
		List<User> pp = userServiceI.getlike(id,  0, pagesize);
		errors.put("sizeto", 0);
		errors.put("user", pp);
		errors.put("tiaojian", id);
		return new ModelAndView("findpage");
	}
	
	/*
	 * 搜索翻页
	 */
	
	@RequestMapping("/findup/{sizeto}/{tiaojian}")
	public ModelAndView findup(@PathVariable Integer sizeto,@PathVariable String tiaojian,Map<String, Object> map) {
		sizeto = sizeto + 1;
      
		List<User> l = userServiceI.getliketo(tiaojian);
		size = (int) Math.ceil(l.size() / 5);
		
		if(l.size()%5==0){
			size=size-1;
		}
        
		if(l.size()<=5){
			sizeto=0;
		}
		
		if (sizeto > size) {
			sizeto = size;
		}
		
		
		pagenow = sizeto * 5;
		List<User> to = userServiceI.getlike(tiaojian, pagenow, pagesize);
		map.put("sizeto", sizeto);
		map.put("tiaojian", tiaojian);
		map.put("user", to);
		return new ModelAndView("findpage");
	}

	/*
	 * 搜索翻页
	 */
	@RequestMapping("/finddown/{sizeto}/{tiaojian}")
	public ModelAndView finddown(@PathVariable Integer sizeto,@PathVariable String tiaojian,Map<String, Object> map) {
		sizeto = sizeto - 1;
		List<User> l = userServiceI.getliketo(tiaojian);
		
		System.out.println(l.size()+"-----------------");
		size = (int) Math.ceil(l.size() / 5);
        
		if(l.size()%5==0){
			size=size-1;
		}

		if(l.size()<=5){
			sizeto=0;
		}
		
		if (sizeto < 0) {
			sizeto = 0;
		}
		pagenow = sizeto * 5;
		List<User> to = userServiceI.getlike(tiaojian, pagenow, pagesize);

		map.put("sizeto", sizeto);
		map.put("tiaojian", tiaojian);
		map.put("user", to);
		return new ModelAndView("findpage");
	}
}
