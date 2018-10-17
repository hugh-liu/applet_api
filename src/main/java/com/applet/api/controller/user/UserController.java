package com.applet.api.controller.user;

import com.applet.api.core.anno.SessionScope;
import com.applet.api.entity.ShippingAddress;
import com.applet.api.entity.WeChantInfo;
import com.applet.api.service.other.ShippingAddressService;
import com.applet.api.util.NullUtil;
import com.applet.api.util.RegularUtil;
import com.applet.api.util.TencentLocationUtils;
import com.applet.api.util.ajax.AjaxResponse;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

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
