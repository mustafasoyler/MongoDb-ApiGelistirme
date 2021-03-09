package com.mustafa.api;

import com.mustafa.entity.Kisi;
import com.mustafa.repository.KisiRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.annotation.PostConstruct;
import java.util.List;

@RestController
@RequestMapping("/kisi")
public class KisiApi {

    @Autowired
    private KisiRepository kisiRepository;

    @PostConstruct
    public  void  init(){
        Kisi kisi=new Kisi();
        kisi.setAdi("Mustafa");
        kisi.setSoyadi("Söyler");
        kisiRepository.save(kisi);

    }

    @PostMapping
    public ResponseEntity<Kisi> kisiEkle(@RequestBody Kisi kisi){
        return ResponseEntity.ok(kisiRepository.save(kisi));

    }

    @GetMapping
    public ResponseEntity<List<Kisi>> tümünüListele(){
        return ResponseEntity.ok(kisiRepository.findAll());
    }
}
