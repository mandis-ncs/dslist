package com.mandis.dslist.controllers;

import com.mandis.dslist.dto.GameDto;
import com.mandis.dslist.dto.GameListDto;
import com.mandis.dslist.dto.GameMinDto;
import com.mandis.dslist.services.GameListServices;
import com.mandis.dslist.services.GameServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/lists")
public class GameListController {

    @Autowired
    private GameListServices gameListServices;

    @Autowired
    private GameServices gameService;

    @GetMapping
    public List<GameListDto> findAll() {
        List<GameListDto> result = gameListServices.findAll();
        return result;
    }

    @GetMapping(value = "/{listId}/games")
    public List<GameMinDto> findByList(@PathVariable Long listId) {
        List<GameMinDto> result = gameService.findByList(listId);
        return result;
    }

}
