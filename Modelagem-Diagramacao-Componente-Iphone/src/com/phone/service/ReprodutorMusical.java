package com.phone.service;

import java.util.List;

public interface ReprodutorMusical {
    void play();
    boolean pause();
    void stop();
    List<String> addMusic();
}
