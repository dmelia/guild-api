package com.herpderp9000.guildapi.dtos.adapters;

import com.herpderp9000.guildapi.dtos.ProfileDto;
import com.herpderp9000.guildapi.models.Profile;

/**
 * Created by Dmelia on 27/11/2019
 */
public class ProfileDtoAdapter implements Adapter<ProfileDto, Profile> {
    /**
     * Private constructor
     */
    private ProfileDtoAdapter() {
    }

    /**
     * Static method to obtain an instance
     *
     * @return {@link ProfileDtoAdapter}
     */
    public static ProfileDtoAdapter adapter() {
        return new ProfileDtoAdapter();
    }

    /**
     * Adapts the {@link ProfileDto} to a usable {@link Profile}
     *
     * @param profileDto the {@link ProfileDto} to adapt
     * @return {@link Profile} the generated model
     */
    @Override
    public Profile adaptDto(ProfileDto profileDto) {
        return Profile.builder()
                .ageVisible(profileDto.getAgeVisible())
                .birthDate(profileDto.getBirthDate())
                .contact(profileDto.getContact())
                .description(profileDto.getDescription())
                .email(profileDto.getEmail())
                .firstName(profileDto.getFirstName())
                .id(profileDto.getId())
                .nameVisible(profileDto.getNameVisible())
                .username(profileDto.getUsername())
                .build();
    }

    /**
     * Adapts a {@link Profile} to a {@link ProfileDto} to be used as an external message
     *
     * @param profile {@link Profile} the profile to adapt
     * @return {@link ProfileDto} the generated Dto
     */
    @Override
    public ProfileDto adaptModel(Profile profile) {
        return ProfileDto.builder()
                .ageVisible(profile.getAgeVisible())
                .birthDate(profile.getBirthDate())
                .contact(profile.getContact())
                .description(profile.getDescription())
                .email(profile.getEmail())
                .firstName(profile.getFirstName())
                .id(profile.getId())
                .nameVisible(profile.getNameVisible())
                .username(profile.getUsername())
                .build();
    }
}
