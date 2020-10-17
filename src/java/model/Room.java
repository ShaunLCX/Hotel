/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author ShaunLee
 */
public class Room {
    public int RoomID;
    public String RoomName;
    public String RoomType;

    public Room(int RoomID, String RoomName, String RoomType) {
        this.RoomID = RoomID;
        this.RoomName = RoomName;
        this.RoomType = RoomType;
    }
    

    public int getRoomID() {
        return RoomID;
    }

    public void setRoomID(int RoomID) {
        this.RoomID = RoomID;
    }

    public String getRoomName() {
        return RoomName;
    }

    public void setRoomName(String RoomName) {
        this.RoomName = RoomName;
    }

    public String getRoomType() {
        return RoomType;
    }

    public void setRoomType(String RoomType) {
        this.RoomType = RoomType;
    }

}
