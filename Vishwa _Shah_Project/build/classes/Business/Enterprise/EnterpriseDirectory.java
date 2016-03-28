/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Enterprise;

import java.util.ArrayList;

/**
 *
 * @author Vishwa
 */
public class EnterpriseDirectory {
    
    private ArrayList<Enterprise> enterpriselist;
    
    public EnterpriseDirectory()
    {
        enterpriselist = new ArrayList<Enterprise>();
    }

    public ArrayList<Enterprise> getEnterpriselist() {
        return enterpriselist;
    }

    public void setEnterpriselist(ArrayList<Enterprise> enterpriselist) {
        this.enterpriselist = enterpriselist;
    }
    
    public Enterprise createAndAddEnterprise(String name, Enterprise.EnterpriseType type)
    {
        Enterprise enterprise = null;
        if(type == Enterprise.EnterpriseType.Publisher)
        {
            enterprise = new PublisherEnterprise(name, type);
            enterpriselist.add(enterprise);
        }
        else if(type == Enterprise.EnterpriseType.AdExchange)
        {
            enterprise = new AdExchangeEnterprise(name, type);
            enterpriselist.add(enterprise);
        }
        else if(type == Enterprise.EnterpriseType.Advertiser)
        {
            enterprise = new AdvertiserEnterprise(name, type);
            enterpriselist.add(enterprise);
        }
        else if(type == Enterprise.EnterpriseType.Consumer)
        {
            enterprise = new ConsumerEnterprise(name, type);
            enterpriselist.add(enterprise);
        }
        return enterprise;
    }
    
}
