package com.namafunction.namafunction.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.namafunction.namafunction.entity.Event;

public interface EventRepository extends JpaRepository<Event, Long> {

}
