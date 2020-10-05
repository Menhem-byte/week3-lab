/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlets;

import domain.Note;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import static java.io.FileDescriptor.out;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author 789438
 */
public class NoteServlet extends HttpServlet {



  
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
          String edit=request.getParameter("edit");
          
          if(edit !=null){
           getServletContext().getRequestDispatcher("/WEB-INF/editnote.jsp").forward(request, response);
          }
         
        getServletContext().getRequestDispatcher("/WEB-INF/viewnote.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String path = getServletContext().getRealPath("/WEB-INF/note.txt");
// to read files
BufferedReader br = new BufferedReader(new FileReader(new File(path)));
ArrayList<String> read= new ArrayList<>();
String line="";
while(line !=null){
    line=br.readLine();
read.add(line);
}

String title=read.get(0);
String content=read.get(1);

request.setAttribute("title", title);
        request.setAttribute("content", content);
  Note note=new Note(title,content);
   request.setAttribute("note", note);
     
  getServletContext().getRequestDispatcher("/WEB-INF/viewnote.jsp").forward(request, response); 

// to write to a file
PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter(path, false))); 
String title1=request.getParameter("title");
String content1=request.getParameter("title");
pw.write(title1);
pw.write(content1);

     
        
        getServletContext().getRequestDispatcher("/WEB-INF/viewnote.jsp").forward(request, response);
       
    }


}
