/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Organization.Organization.Type;
import java.util.ArrayList;

/**
 *
 * @author Vishwa
 */
public class OrganizationDirectory {
    
    private ArrayList<Organization> organizationlist;
    
    public OrganizationDirectory()
    {
        organizationlist = new ArrayList<>();
    }

    public ArrayList<Organization> getOrganizationlist() {
        return organizationlist;
    }

    public void setOrganizationlist(ArrayList<Organization> organizationlist) {
        this.organizationlist = organizationlist;
    }
    
    public Organization createOrganization(Type type)
    {
        Organization organization = null;
        if(type.getValue().equals(Type.PublisherAdmin.getValue()))
        {
            organization = new PublisherAdminOrganization();
            organizationlist.add(organization);
        }
        else if(type.getValue().equals(Type.AdvertiserAdmin.getValue()))
        {
            organization = new AdvertiserAdminOrganization();
            organizationlist.add(organization);
        }
        else if(type.getValue().equals(Type.AdExchangeAdmin.getValue()))
        {
            organization = new AdExchangeAdminOrganization();
            organizationlist.add(organization);
        }
        else if(type.getValue().equals(Type.ConsumerAdmin.getValue()))
        {
            organization = new ConsumerAdminOrganization();
            organizationlist.add(organization);
        }
        else if(type.getValue().equals(Type.PublisherFinance.getValue())){
            organization = new PublisherFinanceOrganization();
            organizationlist.add(organization);
        }
        else if(type.getValue().equals(Type.Website.getValue())){
            organization = new WebsiteOrganization();
            organizationlist.add(organization);
        }
        else if(type.getValue().equals(Type.AdvertiserFinance.getValue())){
            organization = new AdvertiserFinanceOrganization();
            organizationlist.add(organization);
        }
        else if(type.getValue().equals(Type.Marketer.getValue()))
        {
            organization = new MarketingOrganization();
            organizationlist.add(organization);
        }
        else if(type.getValue().equals(Type.Advertiser.getValue()))
        {
            organization = new AdvertisingOrganization();
            organizationlist.add(organization);
        }
        else if(type.getValue().equals(Type.Auction.getValue()))
        {
            organization = new AuctionOrganization();
            organizationlist.add(organization);
        }
        else if(type.getValue().equals(Type.Consumer.getValue()))
        {
            organization = new ConsumerOrganization();
            organizationlist.add(organization);
        }
        return organization;
    }
    
}
