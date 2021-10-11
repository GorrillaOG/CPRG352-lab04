
package servlets;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import objects.Note;

/**
 *
 * @author 504785
 */
public class NoteServlet extends HttpServlet {
    String path;
    String title;
    String contents;
BufferedReader bufread;
PrintWriter printwrt;

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        try {
            path = getServletContext().getRealPath("/WEB-INF/note.txt"); 
            bufread = new BufferedReader(new FileReader(new File(path)));
            while (bufread.ready()){
              
                
                title = bufread.readLine();
                contents = bufread.readLine();
                
                Note newNote = new Note(title, contents);
                request.setAttribute("note", newNote);
                bufread.close();
                
            }  
            
        }
        catch (IOException e){
            request.setAttribute("errorMessage", true);
           //return;
        }
        
        if (request.getParameter("edit")!= null){
            
            getServletContext().getRequestDispatcher("/WEB-INF/editnote.jsp").forward(request,response);
            return;       

        }
        else{
            getServletContext().getRequestDispatcher("/WEB-INF/viewnote.jsp").forward(request,response);
            return;
        } 
    
    }
    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
       
        printwrt = new PrintWriter(new BufferedWriter(new FileWriter(path, false)));
        
        title = request.getParameter("title");
        contents = request.getParameter("contents");
         printwrt.println(title); 
        printwrt.println(contents);
        Note newNote2 = new Note(title, contents);
        request.setAttribute("note", newNote2);
       
        printwrt.close();
    
     
        // The request object will be passed through to the JSP by the forward() method.
        getServletContext().getRequestDispatcher("/WEB-INF/viewnote.jsp").forward(request,response);
        return;
      
    }


}
