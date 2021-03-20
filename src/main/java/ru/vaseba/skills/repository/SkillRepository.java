package ru.vaseba.skills.repository;

import org.springframework.data.cassandra.repository.CassandraRepository;
import org.springframework.data.cassandra.repository.Query;
import org.springframework.stereotype.Repository;
import ru.vaseba.skills.entity.Skill;

import java.util.Optional;

@Repository
public interface SkillRepository extends CassandraRepository<Skill, Long> {

    @Query("select * from keyspace.skills where title = ?0 ALLOW FILTERING")
    Optional<Skill> findByTitle(String title);
}
