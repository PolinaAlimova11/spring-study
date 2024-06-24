package org.lesson1.service;

import lombok.AllArgsConstructor;
import org.lesson1.repository.RepositoryApplication;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class ServiceApplication {
    private final RepositoryApplication repositoryApplication;
}
