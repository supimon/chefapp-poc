package com.supimon.chefapppoc.resources;

import com.supimon.chefapppoc.models.ChefDetailsItem;
import com.supimon.chefapppoc.models.ChefListWrapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/chefs")
public class ChefappResource {

    @Autowired
    private RestTemplate restTemplate;

    @RequestMapping("/filterBy/" +
            "{filterKeyword}")
    public ChefListWrapper getChefs(@PathVariable("filterKeyword") String filterKeyword){

        ChefListWrapper chefListWrapper = restTemplate
                .getForObject("http://localhost:8085/chef-listing/" + filterKeyword, ChefListWrapper.class);

        return chefListWrapper;
    }

    @RequestMapping("{chefId}")
    public ChefDetailsItem getChefDetails(@PathVariable("chefId") String chefId){

        ChefDetailsItem chefDetailsItem = restTemplate
                .getForObject("http://localhost:8084/chefDetails/" + chefId, ChefDetailsItem.class);

        return chefDetailsItem;
    }
}
