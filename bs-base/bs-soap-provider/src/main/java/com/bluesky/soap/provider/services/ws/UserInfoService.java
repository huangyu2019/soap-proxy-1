package com.bluesky.soap.provider.services.ws;

import com.bluesky.soap.provider.services.ws.entity.User
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import javax.xml.ws.BindingType;
import javax.xml.ws.soap.SOAPBinding;

/**
 * @ClassName UserInfoService
 * @Description TO DO
 * @Author lenovo
 * @Date 2024/5/3
 * @Version 1.0
 **/
@WebService(name = "UserInfoService",
        targetNamespace = "http://ws.services.provider.soap.bluesky.com"
)
@javax.jws.soap.SOAPBinding
@BindingType(value= SOAPBinding.SOAP12HTTP_BINDING)
public interface UserInfoService {

    @WebMethod
    String getUserAddress(@WebParam(name = "address", targetNamespace = "http://ws.services.provider.soap.bluesky.com") String address,
                         @WebParam(name = "user", targetNamespace = "http://ws.services.provider.soap.bluesky.com") User user);

}
