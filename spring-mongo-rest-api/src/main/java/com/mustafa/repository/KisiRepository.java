package com.mustafa.repository;

import com.mustafa.entity.Kisi;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface KisiRepository extends MongoRepository<Kisi,String> {
}
