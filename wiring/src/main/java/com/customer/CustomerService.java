package com.customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;


@Service
public class CustomerService {
    @Qualifier("customerDaoImpl")
    private CustomerDao customerDao;

    public CustomerService() {
        System.out.println("default ctor");
    }

    // @Autowired
    public CustomerService(CustomerDao customerDao) {
        this.customerDao = customerDao;

    }

    public CustomerDao getCustomerDao(){
        return customerDao;
    }

    public void setCustomerDao(CustomerDao customerDao){
        System.out.println("SetCustomerDaoter");
        this.customerDao = customerDao;
    }
}
