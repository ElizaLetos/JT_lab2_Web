package com.secondlab.lab2tj;

import com.secondlab.lab2tj.model.Word;
import com.secondlab.lab2tj.utils.FileOperations;
import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet(name = "WordServlet", urlPatterns = {"/WordServlet"})
public class WordServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String letters = request.getParameter("letters");
        int size = Integer.parseInt(request.getParameter("size"));
        
        Word word = new Word();
        word.setLetters(letters);
        word.setSize(size);
        
        FileOperations fileOperations = new FileOperations();
        fileOperations.addWordToFile(word);

        request.getRequestDispatcher("result.jsp").forward(request, response);
    }
}
