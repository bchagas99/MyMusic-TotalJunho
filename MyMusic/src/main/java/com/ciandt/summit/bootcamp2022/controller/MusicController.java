package com.ciandt.summit.bootcamp2022.controller;

import com.ciandt.summit.bootcamp2022.DTO.ObjectDTO;
import com.ciandt.summit.bootcamp2022.entity.Music;
import com.ciandt.summit.bootcamp2022.service.MusicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/music")
public class MusicController {

    @Autowired
    private MusicService musicService;

    @GetMapping
    public ResponseEntity<ObjectDTO> findMusicsByMusicNameOrArtistName(@RequestParam(required = false, name = "filtro") String name) {

        ObjectDTO objectDTO = musicService.findMusicsByMusicNameOrArtistName(name);

        return ResponseEntity.ok(objectDTO);

    }

}
