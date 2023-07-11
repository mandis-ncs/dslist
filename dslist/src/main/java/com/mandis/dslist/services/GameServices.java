package com.mandis.dslist.services;

import com.mandis.dslist.dto.GameMinDto;
import com.mandis.dslist.entities.Game;
import com.mandis.dslist.repositories.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class GameServices {

    @Autowired
    private GameRepository gameRepository;

//    @Transactional(readOnly = true)
    public List<GameMinDto> findAll() {
        List<Game> result = gameRepository.findAll();
        return result.stream().map(x -> new GameMinDto(x)).toList();
    }
}








// findAll
// map -> faz com que todos os 'result' no formato Game será representado por 'x' e transformado para GameMinDto
// antes de simplificar:
//public List<Game> findAll() {
//    List<Game> result = gameRepository.findAll();
//    List<GameMinDto> dto = result
//            .stream()
//            .map(x -> new GameMinDto(x)).toList();
//    return result;
//}