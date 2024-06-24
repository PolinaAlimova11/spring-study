package org.lesson1.repository;

import lombok.AllArgsConstructor;
import org.lesson1.configure.AppProperties;
import org.springframework.stereotype.Repository;

@Repository
@AllArgsConstructor
public class RepositoryApplication {
    private final AppProperties appProperties;
}
