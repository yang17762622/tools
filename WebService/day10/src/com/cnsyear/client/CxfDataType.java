package com.cnsyear.client;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

/**
 * This class was generated by Apache CXF 2.5.9
 * 2018-03-06T23:08:42.047+08:00
 * Generated source version: 2.5.9
 * 
 */
@WebService(targetNamespace = "http://sevice.cnsyear.com/", name = "CxfDataType")
@XmlSeeAlso({ObjectFactory.class})
public interface CxfDataType {

    @WebMethod
    @RequestWrapper(localName = "getAllStudentsMap", targetNamespace = "http://sevice.cnsyear.com/", className = "com.cnsyear.client.GetAllStudentsMap")
    @ResponseWrapper(localName = "getAllStudentsMapResponse", targetNamespace = "http://sevice.cnsyear.com/", className = "com.cnsyear.client.GetAllStudentsMapResponse")
    @WebResult(name = "_return", targetNamespace = "")
    public com.cnsyear.client.GetAllStudentsMapResponse.Return getAllStudentsMap();

    @WebMethod
    @RequestWrapper(localName = "getStudentById", targetNamespace = "http://sevice.cnsyear.com/", className = "com.cnsyear.client.GetStudentById")
    @ResponseWrapper(localName = "getStudentByIdResponse", targetNamespace = "http://sevice.cnsyear.com/", className = "com.cnsyear.client.GetStudentByIdResponse")
    @WebResult(name = "return", targetNamespace = "")
    public com.cnsyear.client.Student getStudentById(
        @WebParam(name = "arg0", targetNamespace = "")
        int arg0
    );

    @WebMethod
    @RequestWrapper(localName = "addStudent", targetNamespace = "http://sevice.cnsyear.com/", className = "com.cnsyear.client.AddStudent")
    @ResponseWrapper(localName = "addStudentResponse", targetNamespace = "http://sevice.cnsyear.com/", className = "com.cnsyear.client.AddStudentResponse")
    @WebResult(name = "return", targetNamespace = "")
    public boolean addStudent(
        @WebParam(name = "arg0", targetNamespace = "")
        com.cnsyear.client.Student arg0
    );

    @WebMethod
    @RequestWrapper(localName = "getStudentsByPrice", targetNamespace = "http://sevice.cnsyear.com/", className = "com.cnsyear.client.GetStudentsByPrice")
    @ResponseWrapper(localName = "getStudentsByPriceResponse", targetNamespace = "http://sevice.cnsyear.com/", className = "com.cnsyear.client.GetStudentsByPriceResponse")
    @WebResult(name = "return", targetNamespace = "")
    public java.util.List<com.cnsyear.client.Student> getStudentsByPrice(
        @WebParam(name = "arg0", targetNamespace = "")
        float arg0
    );
}
