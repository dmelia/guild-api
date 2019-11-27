package com.herpderp9000.guildapi.repositories;

import com.herpderp9000.guildapi.models.Profile;
import org.springframework.data.repository.Repository;

/**
 * Created By Dmelia on 27/11/2019
 */
public interface ProfileJpaRepository extends Repository<Profile, Long> {
    /**
     * Searches the database for a {@link Profile} by id
     *
     * @param id the id
     * @return {@link Profile} the found profile
     */
    Profile findById(Long id);
}
