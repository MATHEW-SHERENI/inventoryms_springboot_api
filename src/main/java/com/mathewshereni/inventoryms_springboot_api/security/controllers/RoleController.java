package com.mathewshereni.inventoryms_springboot_api.security.controllers;



import com.mathewshereni.inventoryms_springboot_api.security.services.RoleService;
import com.mathewshereni.inventoryms_springboot_api.security.models.Role;
import com.mathewshereni.inventoryms_springboot_api.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class RoleController {

    @Autowired
    private RoleService roleService;

    @Autowired
    private UserService userService;

    @GetMapping("/roles")
    public List<Role> parameters(Model model) {
        return roleService.findAll();
    }

    @GetMapping("/role/{id}")
    @ResponseBody
    public Role getById(@PathVariable Integer id) {
        return roleService.findById(id);
    }

    @PostMapping("/roles")
    public Role save(Role role) {
        return roleService.save(role);
    }

    @RequestMapping(value = "/role/delete/{id}", method = {RequestMethod.DELETE, RequestMethod.GET})
    public void delete(@PathVariable Integer id) {
        roleService.delete(id);
    }
}
