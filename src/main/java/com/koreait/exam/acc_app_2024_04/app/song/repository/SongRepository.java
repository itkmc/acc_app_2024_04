package com.koreait.exam.acc_app_2024_04.app.song.repository;

import com.koreait.exam.acc_app_2024_04.app.song.entity.Song;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface SongRepository extends JpaRepository<Song, Long> {

    List<Song> findAllByAuthorId(Long id);
}