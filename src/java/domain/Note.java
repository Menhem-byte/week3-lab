/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domain;

import java.beans.*;
import java.io.Serializable;

/**
 *
 * @author 789438
 */
public class Note implements Serializable {
    
  String title ="";
  String content ="";

    public Note(String title, String content) {
        
        this.title=title;
        this.content=content;
        
    }

    public String getTitle() {
        return title;
    }

    public String getContent() {
        return content;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setContent(String content) {
        this.content = content;
    }
  
         
    

    
}
