package com.supimon.chefapppoc.resources;

import com.supimon.chefapppoc.models.ChefItem;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collections;
import java.util.List;

@RestController
@RequestMapping("/chefs")
public class ChefappResource {

    @RequestMapping("/{filterKeyword}")
    public List<ChefItem> getChefs(@PathVariable("filterKeyword") String filterKeyword){
        return Collections.singletonList(
                new ChefItem(
                        "Bhajan Kumar",
                        "good chinese cook",
                        "https://upload.wikimedia.org/wikipedia/commons/4/48/Outdoors-man-portrait_%28cropped%29.jpg",
                        new String[]{"chinese", "continental", "north-indian"},
                        new String[]{"chinese"},
                        10,
                        4.5,
                        "hindi",
                        true, 20000, 15000)
        );
    }
}
