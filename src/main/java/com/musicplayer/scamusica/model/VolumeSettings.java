package com.musicplayer.scamusica.model;

import java.util.List;

public class VolumeSettings {
    private String volume_source;
    private int music_volume;
    private int ad_volume;
    private List<VolumeSchedule> schedules;

    public String getVolumeSource() {
        return volume_source;
    }

    public void setVolumeSource(String volume_source) {
        this.volume_source = volume_source;
    }

    public int getMusicVolume() {
        return music_volume;
    }

    public void setMusicVolume(int music_volume) {
        this.music_volume = music_volume;
    }

    public int getAdVolume() {
        return ad_volume;
    }

    public void setAdVolume(int ad_volume) {
        this.ad_volume = ad_volume;
    }

    public List<VolumeSchedule> getSchedules() {
        return schedules;
    }

    public void setSchedules(List<VolumeSchedule> schedules) {
        this.schedules = schedules;
    }
}
