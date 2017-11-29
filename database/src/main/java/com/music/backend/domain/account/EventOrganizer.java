package com.music.backend.domain.account;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.Table;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.GenerationType;
import javax.persistence.GeneratedValue;
import javax.persistence.Column;
import javax.persistence.ManyToOne;
import javax.persistence.JoinColumn;
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

  @Column(name = "email")
  String email;

  @JsonIgnore
  @Column(name = "password")
  String password;

  @Column(name = "create_at")
  Date createAt;

  @Column(name = "update_at")
  Date updateAt;

  @Column(name = "deleted")
  char deleted;

  @ManyToOne
  @JoinColumn(name = "create_by")
  EventOrganizer createBy;

  @ManyToOne
  @JoinColumn(name = "update_by")
  EventOrganizer updateBy;

  public EventOrganizer() {
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
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

  public EventOrganizer getCreateBy() {
    return createBy;
  }

  public void setCreateBy(EventOrganizer createBy) {
    this.createBy = createBy;
  }

  public EventOrganizer getUpdateBy() {
    return updateBy;
  }

  public void setUpdateBy(EventOrganizer updateBy) {
    this.updateBy = updateBy;
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
