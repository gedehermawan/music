package com.music.backend.eventorganizer;

import javax.persistence.Table;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.GenerationType;
import javax.persistence.GeneratedValue;
import javax.persistence.Column;
import java.util.Date;

@Entity
@Table(name = "event_organizer")
public class EventOrganizer {
  @Id
  @GeneratedValue(strategy= GenerationType.IDENTITY)
  @Column(name="event_organizer_id")
  long eventOrganizerId;

  @Column(name = "name")
  String name;

  @Column(name = "phone")
  String phone;

  @Column(name = "create_at")
  Date createAt;

  @Column(name = "update_at")
  Date updateAt;

  @Column(name = "deleted")
  char deleted;

  public EventOrganizer() {
  }

  public Date getCreateAt() {
    return createAt;
  }

  public void setCreateAt(Date createAt) {
    this.createAt = createAt;
  }

  public Date getUpdateAt() {
    return updateAt;
  }

  public void setUpdateAt(Date updateAt) {
    this.updateAt = updateAt;
  }

  public char getDeleted() {
    return deleted;
  }

  public void setDeleted(char deleted) {
    this.deleted = deleted;
  }

  public long getEventOrganizerId() {
    return eventOrganizerId;
  }

  public void setEventOrganizerId(long eventOrganizerId) {
    this.eventOrganizerId = eventOrganizerId;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getPhone() {
    return phone;
  }

  public void setPhone(String phone) {
    this.phone = phone;
  }
}
