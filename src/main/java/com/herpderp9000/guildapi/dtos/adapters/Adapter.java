package com.herpderp9000.guildapi.dtos.adapters;


import java.util.ArrayList;
import java.util.List;

/**
 * Created by Dmelia on 27/11/2019
 * Used for adapting models and dtos to their respective equivalents
 *
 * @param <Dto>   the Dto
 * @param <Model> the Model
 */
public interface Adapter<Dto, Model> {

    /**
     * Adapts the dto to an instance of the Model class
     *
     * @param dto the dto to adapt
     * @return the model
     */
    Model adaptDto(Dto dto);

    /**
     * Adapts the model to an instance of the Dto class
     *
     * @param model the model to adapt
     * @return the dto
     */
    Dto adaptModel(Model model);

    default List<Model> adaptDtoList(List<Dto> dtos) {
        List<Model> models = new ArrayList<>();
        dtos.forEach(dto -> models.add(this.adaptDto(dto)));
        return models;
    }

    default List<Dto> adaptModelList(List<Model> models) {
        List<Dto> dtos = new ArrayList<>();
        models.forEach(model -> dtos.add(this.adaptModel(model)));
        return dtos;
    }
}
