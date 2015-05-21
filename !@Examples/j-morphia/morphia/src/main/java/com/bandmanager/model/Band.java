package com.bandmanager.model;

import com.google.code.morphia.annotations.*;
import com.google.code.morphia.utils.IndexDirection;
import org.bson.types.ObjectId;

import java.util.ArrayList;
import java.util.List;

@Entity("bands")
public class Band {

    @Id
    ObjectId id;

    @Indexed(value = IndexDirection.ASC, name = "bandName", unique = true)
    String name;

    @Indexed(value = IndexDirection.ASC, name = "bandGenre")
    String genre;

    @Reference
    Distributor distributor;

    @Reference("catalog")
    List<Song> songs = new ArrayList<Song>();

    @Embedded
    List<String> members = new ArrayList<String>();

    @Embedded("info")
    ContactInfo info;

    public ObjectId getId() {
        return id;
    }

    public void setId(ObjectId id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public Distributor getDistributor() {
        return distributor;
    }

    public void setDistributor(Distributor distributor) {
        this.distributor = distributor;
    }

    public List<Song> getSongs() {
        return songs;
    }

    public void setSongs(List<Song> songs) {
        this.songs = songs;
    }

    public List<String> getMembers() {
        return members;
    }

    public void setMembers(List<String> members) {
        this.members = members;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public ContactInfo getInfo() {
        return info;
    }

    public void setInfo(ContactInfo info) {
        this.info = info;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Band band = (Band) o;

        if (distributor != null ? !distributor.equals(band.distributor) : band.distributor != null) return false;
        if (genre != null ? !genre.equals(band.genre) : band.genre != null) return false;
        if (id != null ? !id.equals(band.id) : band.id != null) return false;
        if (info != null ? !info.equals(band.info) : band.info != null) return false;
        if (members != null ? !members.equals(band.members) : band.members != null) return false;
        if (name != null ? !name.equals(band.name) : band.name != null) return false;
        if (songs != null ? !songs.equals(band.songs) : band.songs != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (genre != null ? genre.hashCode() : 0);
        result = 31 * result + (distributor != null ? distributor.hashCode() : 0);
        result = 31 * result + (songs != null ? songs.hashCode() : 0);
        result = 31 * result + (members != null ? members.hashCode() : 0);
        result = 31 * result + (info != null ? info.hashCode() : 0);
        return result;
    }
}
