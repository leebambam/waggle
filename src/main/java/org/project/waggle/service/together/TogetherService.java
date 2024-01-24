package org.project.waggle.service.together;

import org.project.waggle.repository.together.togetherRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TogetherService {
    @Autowired
    private togetherRepository togetherRepository;

}
