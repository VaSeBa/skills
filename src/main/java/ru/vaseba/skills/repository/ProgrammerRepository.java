package ru.vaseba.skills.repository;

import org.springframework.data.cassandra.repository.CassandraRepository;
import org.springframework.stereotype.Repository;
import ru.vaseba.skills.entity.Programmer;


@Repository
public interface ProgrammerRepository extends CassandraRepository<Programmer, Long> {

}
