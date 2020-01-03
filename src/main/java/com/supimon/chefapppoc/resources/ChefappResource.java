package com.supimon.chefapppoc.resources;

import com.supimon.chefapppoc.models.ChefFullItem;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collections;
import java.util.List;

@RestController
@RequestMapping("/chefs")
public class ChefappResource {

    @RequestMapping("/filterBy/" +
            "{filterKeyword}")
    public List<ChefFullItem> getChefs(@PathVariable("filterKeyword") String filterKeyword){
        return Collections.singletonList(
                new ChefFullItem(
                        "1234",
                        "Bhajan Singh",
                        "https://upload.wikimedia.org/wikipedia/commons/4/48/Outdoors-man-portrait_%28cropped%29.jpg",
                        "chinese, indian, american",
                        10,
                        4.5,
                        true,
                        12,
                        "1234567890",
                        "chinese",
                        "I am an excellent chef",
                        20000,
                        "Asamese",
                        "bhajan@bhajan.com",
                        20)
        );
    }
}
