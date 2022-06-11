package com.google.ff.controller;

import com.google.ff.dto.AppointExecution;
import com.google.ff.pojo.Books;
import com.google.ff.pojo.Msg;
import com.google.ff.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

@Controller
public class MainController {

    @Autowired
    @Qualifier("BookServiceImpl")
    private BookService bookService;

//    @Autowired
//    @Qualifier("AppointmentServiceImpl")
//    private AppointmentService appointmentService;

    /**
     * 根据图书id查询图书
     *
     * @param ids
     * @return
     */
    @RequestMapping(value = "/book/{bookId}", method = RequestMethod.GET)
    @ResponseBody
    public Msg getBook(@PathVariable("ids") int ids) {

        Books books = bookService.getById(ids);
        return Msg.success().add("book", books);
    }

    /**
     * 显示全部书籍
     *
     * @param model
     * @return
     */
    @RequestMapping("/allBook")
    public String list(Model model) {
        List<Books> list = bookService.queryList();
        model.addAttribute("list", list);
        return "allBook";
    }

    //跳转到增加书籍页面
    @RequestMapping("/toAddBook")
    public String toAddPaper() {
        return "addBook";
    }

    //添加书籍的请求
    @RequestMapping("/addBook")
    public String addBook(Books books) {
        System.out.println("addBook=>" + books);
        bookService.addBook(books);

        return "redirect:/allBook";//重定向到我们的 @RequestMapping("/allBook")请求
    }

    //跳转到修改页面
    @RequestMapping("/toUpdateBook")
    public String toUpdatePaper(int id, Model model) {

        Books books = bookService.getById(id);
        model.addAttribute("book", books);
        return "updateBook";
    }

    //修改书籍
    @RequestMapping("/updateBook")
    public String updateBook(Books book, Model model) {
        System.out.println("updateBook=>" + book);
        bookService.updateBook(book);
        Books books = bookService.getById(book.getBookID());
        model.addAttribute("book", books);
        return "redirect:/allBook";
    }

    @RequestMapping("/del/{bookId}")
    public String deleteBook(@PathVariable("bookId") int id) {
        bookService.deleteBookByID(id);
        return "redirect:/allBook";
    }

    /**
     * 查询书籍
     *
     * @param queryBookName
     * @param model
     * @return
     */
    @RequestMapping("/queryBook")
    public String queryBook(String queryBookName, Model model) {
        Books books = bookService.getByName(queryBookName);

        List list = new ArrayList<Books>();
        list.add(books);

        if (books == null) {
            list = bookService.queryList();
            model.addAttribute("error", "未查到");
        }
        model.addAttribute("list", list);

        return "allBook";
    }

    @RequestMapping("/appoint")
    public String appoint(int bookId, int studentId, Model model) {

        AppointExecution appoint = bookService.appoint(bookId, studentId);
        if (appoint == null) {
            model.addAttribute("error", "预约失败");
        }
        model.addAttribute("appoint", appoint);

        return "appointBook";

    }

}
