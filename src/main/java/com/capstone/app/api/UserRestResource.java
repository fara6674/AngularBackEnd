package com.capstone.app.api;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

/**
 * Created by Lbenz on 14/06/2017.
 *
 */

@RepositoryRestResource(path = "user", collectionResourceRel = "user")

interface UserRestResource extends PagingAndSortingRepository<User, Long> {

     User findByUsername(@Param("username") String username);

}
