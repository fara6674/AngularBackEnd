package com.capstone.app.com.capstone.app.repositories;


import com.capstone.app.api.TrackedDependency;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface DependencyRepository extends JpaRepository<TrackedDependency, Long> {

    List<TrackedDependency> findBySprintNumber(String SprintNumber);


}

