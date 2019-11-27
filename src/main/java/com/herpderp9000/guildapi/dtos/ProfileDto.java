package com.herpderp9000.guildapi.dtos;

import com.sun.istack.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Date;

/**
 * Created by Dmelia on 27/11/2019
 */
@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ProfileDto implements Serializable {

    private static final long serialVersionUID = -785085837505914402L;

    private Long id;

    @NotNull
    private String username;

    @NotNull
    private String email;

    private Date birthDate;

    private Boolean ageVisible;

    private String firstName;

    private Boolean nameVisible;

    private String description;

    private String contact;
}
