package abc;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class StudentController
{
   @RequestMapping(value = "/student", method = RequestMethod.GET)
   public ModelAndView student() {
      return new ModelAndView("student", "command", new Student());
   }
   @RequestMapping(value = "/addStudent", method = RequestMethod.POST)
      public String addStudent(@ModelAttribute("Student")Student student,ModelMap model)
   {
      model.addAttribute("name", student.getName());
      model.addAttribute("age", student.getAge());
      model.addAttribute("id", student.getId());
      
      return "result";
   }
   @RequestMapping(value="/list",method=RequestMethod.GET)
   public ModelAndView liststudent(ModelMap model)
   {
	 ArrayList<Student> list1=new ArrayList<Student>();
	 Student s=new Student();
	 s.setName("evan");
	 Student s1=new Student();
	 s1.setName("ram");
	 list1.add(s);
	 list1.add(s1);
	 return new ModelAndView("lis","l",list1);
   }
}