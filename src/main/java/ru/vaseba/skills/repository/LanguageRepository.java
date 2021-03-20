package ru.vaseba.skills.repository;

import org.springframework.data.cassandra.repository.CassandraRepository;
import org.springframework.stereotype.Repository;
import ru.vaseba.skills.entity.Language;


@Repository
public interface LanguageRepository extends CassandraRepository<Language, Long> {

}
