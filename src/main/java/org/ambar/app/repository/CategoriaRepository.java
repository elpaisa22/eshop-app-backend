package org.ambar.app.repository;

import org.ambar.app.domain.Categoria;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.transaction.annotation.Transactional;

@RepositoryRestResource(exported = false)
@Transactional
public interface CategoriaRepository extends PagingAndSortingRepository<Categoria, Long> {
}
