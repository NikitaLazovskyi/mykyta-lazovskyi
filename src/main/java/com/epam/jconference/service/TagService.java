package com.epam.jconference.service;

import com.epam.jconference.dto.TagDto;

import java.util.List;
import java.util.Map;

public interface TagService {
    TagDto create(TagDto tag);

    TagDto getById(Long id);

    TagDto update(TagDto tag);

    TagDto addTranslations(Long id, Map<String, String> translations);

    List<TagDto> findAll();

    List<TagDto> findAllByID(List<Long> ids);
}
