package com.koreait.exam.acc_app_2024_04.app.song.repository;

import com.koreait.exam.acc_app_2024_04.app.song.entity.Song;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SongRepository extends JpaRepository<Song, Long> {
}