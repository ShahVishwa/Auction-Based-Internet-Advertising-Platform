/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Publisher;

import java.util.ArrayList;

/**
 *
 * @author Vishwa
 */
public class PageCatalog {
    
    private ArrayList<Page> pageList;
    
    public PageCatalog()
    {
        pageList = new ArrayList<>();
    }

    public ArrayList<Page> getPageList() {
        return pageList;
    }

    public void setPageList(ArrayList<Page> pageList) {
        this.pageList = pageList;
    }
    
    public Page addPage(String name)
    {
        Page page = new Page();
        page.setName(name);
        pageList.add(page);
        return page;
    }
    
    public void removePage(Page page)
    {
        pageList.remove(page);
        return;
    }
  
    
//    public void removeAdSpace()
//    {
//        Page page = new Page();
//        pageList.remove(page.getAdSpace().)
//    }
//    
}
