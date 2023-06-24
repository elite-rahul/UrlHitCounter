package com.example.urlHitController.service;

import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class UrlHitService {

    private Map<String, Integer> hitCountMap = new HashMap<>();

    public int getHitCountByUsername(String username) {
        hitCountMap.putIfAbsent(username, 0);
        int hitCount = hitCountMap.get(username);
        hitCount++;
        hitCountMap.put(username, hitCount);
        return hitCount;
    }
}

