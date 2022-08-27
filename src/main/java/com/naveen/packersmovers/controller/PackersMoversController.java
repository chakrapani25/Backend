package com.naveen.packersmovers.controller;

import com.naveen.packersmovers.messageservice.MessageService;
import com.naveen.packersmovers.model.Customer;
import com.naveen.packersmovers.service.PackersMoversService;

//import com.naveen.userinfo.service.UserServiceImplementation;
import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/home")
@CrossOrigin

public class PackersMoversController {
        @Autowired
        private PackersMoversService userService;
                
        @Autowired
        private MessageService messageService;
        
        @PostMapping("/customerDetails")
        public String customerDetails(@RequestBody Customer customer){
            userService.saveUser(customer);
            //messageService.sendMessage(customer);
            return "New user is added";
        }
        
        
        @GetMapping("/ping")
        public String ping() {  return "Features\r\n"
        		+ "Add support for Kubernetes 1.23 (#5519)\r\n"
        		+ "Improvements\r\n"
        		+ "Remove support for 1.19 (#5536)\r\n"
        		+ "Remove support for WindowsServer20H2CoreContainer and WindowsServer2004CoreContainer (#5610)\r\n"
        		+ "Update docs about ASG tags (#5574)\r\n"
        		+ "Changed albIngress to awsLoadBalancerController in usage iam-policies example (#5566)\r\n"
        		+ "Fix typo in error message for IAM service account (#5555)\r\n"
        		+ "Bug Fixes\r\n"
        		+ "Fix coredns wait when there are no nodes (#5571)\r\n"
        		+ "Acknowledgments\r\n"
        		+ "Weaveworks would like to sincerely thank:\r\n"
        		+ "@neha-viswanathan, @akhal3d96, @jinnuae40 and @matti" ;
        			
        }

    }

