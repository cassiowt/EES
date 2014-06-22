package com.cawt.managetbeans;

import javax.annotation.ManagedBean;
import javax.enterprise.context.RequestScoped;




import com.cawt.entities.Paper;

@ManagedBean
@RequestScoped
public class PaperMB {
    
    public Paper[] getPapers(){  
        return Paper.values();  
    } 
    
}
