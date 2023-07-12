package com.mandis.dslist.services;

import com.mandis.dslist.dto.GameDto;
import com.mandis.dslist.dto.GameListDto;
import com.mandis.dslist.dto.GameMinDto;
import com.mandis.dslist.entities.Game;
import com.mandis.dslist.entities.GameList;
import com.mandis.dslist.repositories.GameListRepository;
import com.mandis.dslist.repositories.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class GameListServices {

    @Autowired
    private GameListRepository gameListRepository;

    @Transactional(readOnly = true)
    public List<GameListDto> findAll() {
        List<GameList> result = gameListRepository.findAll();
        return result.stream().map(x -> new GameListDto(x)).toList();
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