package com.res.spring.basics.xmlcontext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

public class XMLPersonDAO {

    XMLJdbcConnection XMLJdbcConnection;

    public XMLJdbcConnection getJdbcConnection() {
        return XMLJdbcConnection;
    }

    public com.res.spring.basics.xmlcontext.XMLJdbcConnection getXMLJdbcConnection() {
        return XMLJdbcConnection;
    }

    public void setXMLJdbcConnection(com.res.spring.basics.xmlcontext.XMLJdbcConnection XMLJdbcConnection) {
        this.XMLJdbcConnection = XMLJdbcConnection;
    }

    public void setJdbcConnection(XMLJdbcConnection XMLJdbcConnection) {
        this.XMLJdbcConnection = XMLJdbcConnection;
    }
}
