package com.herpderp9000.guildapi.services;

import com.herpderp9000.guildapi.models.Profile;
import com.herpderp9000.guildapi.repositories.ProfileJpaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by Dmelia on 27/11/2019
 */
@Service
public class ProfilesService {

    @Autowired
    private ProfileJpaRepository profileJpaRepository;

    /**
     * Returns a {@link Profile} found in the database by id
     *
     * @param id the id of the profile to find
     * @return {@link Profile}
     */
    public Profile getProfile(Long id) {
        if (id == null) {
            throw new IllegalArgumentException("Profile id is required");
        }

        return this.profileJpaRepository.findById(id);
    }
}
