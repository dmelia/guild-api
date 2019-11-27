package com.herpderp9000.guildapi.controllers;

import com.herpderp9000.guildapi.dtos.ProfileDto;
import com.herpderp9000.guildapi.dtos.adapters.ProfileDtoAdapter;
import com.herpderp9000.guildapi.models.Profile;
import com.herpderp9000.guildapi.services.ProfilesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Dmelia on 27/11/2019
 */
@RestController
public class ProfilesController {

    @Autowired
    ProfilesService profilesService;

    /**
     * Returns a {@link ResponseEntity<ProfileDto>} of a profile by id
     *
     * @param id the id of the profile to find
     * @return {@link ResponseEntity<ProfileDto>} the response entity containing the profile dto
     */
    public ResponseEntity<ProfileDto> getProfile(@RequestParam Long id) {
        Profile profile = this.profilesService.getProfile(id);

        return new ResponseEntity<ProfileDto>(ProfileDtoAdapter.adapter().adaptModel(profile), HttpStatus.OK);
    }
}
