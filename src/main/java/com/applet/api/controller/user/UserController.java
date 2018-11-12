package com.applet.api.controller.user;

import com.applet.api.service.other.ShippingAddressService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author zhouhuahu
 * @date 2018/9/19
 */
@RestController
@RequestMapping(value = "/appletApi/user")
public class UserController {
    private static final Logger log = LoggerFactory.getLogger(UserController.class);
    @Autowired
    private ShippingAddressService shippingAddressService;


}
