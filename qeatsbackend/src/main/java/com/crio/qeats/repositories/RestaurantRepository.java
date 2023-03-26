/*
 *
 *  * Copyright (c) Crio.Do 2019. All rights reserved
 *
 */

package com.crio.qeats.repositories;


import java.util.List;
import com.crio.qeats.dto.Restaurant;
import com.crio.qeats.models.RestaurantEntity;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface RestaurantRepository extends MongoRepository<RestaurantEntity, String> {
    List<RestaurantEntity> findAll();
}

