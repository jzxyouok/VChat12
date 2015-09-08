package com.vince.vchat12.data;

import com.vince.vchat12.data.DaoSession;
import de.greenrobot.dao.DaoException;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT. Enable "keep" sections if you want to edit. 
/**
 * Entity mapped to table "FRIENDS".
 */
public class Friends {

    private Long id;
    private java.util.Date create_time;
    private java.util.Date update_time;
    private String contacts_web_id;
    private String target_user_web_id;
    private Integer sys_group_type;
    private String remark;
    private String nick;
    private String avatar;
    private String first_letter;
    private long friends_group;

    /** Used to resolve relations */
    private transient DaoSession daoSession;

    /** Used for active entity operations. */
    private transient FriendsDao myDao;

    private Group o2o_friends_group;
    private Long o2o_friends_group__resolvedKey;


    public Friends() {
    }

    public Friends(Long id) {
        this.id = id;
    }

    public Friends(Long id, java.util.Date create_time, java.util.Date update_time, String contacts_web_id, String target_user_web_id, Integer sys_group_type, String remark, String nick, String avatar, String first_letter, long friends_group) {
        this.id = id;
        this.create_time = create_time;
        this.update_time = update_time;
        this.contacts_web_id = contacts_web_id;
        this.target_user_web_id = target_user_web_id;
        this.sys_group_type = sys_group_type;
        this.remark = remark;
        this.nick = nick;
        this.avatar = avatar;
        this.first_letter = first_letter;
        this.friends_group = friends_group;
    }

    /** called by internal mechanisms, do not call yourself. */
    public void __setDaoSession(DaoSession daoSession) {
        this.daoSession = daoSession;
        myDao = daoSession != null ? daoSession.getFriendsDao() : null;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public java.util.Date getCreate_time() {
        return create_time;
    }

    public void setCreate_time(java.util.Date create_time) {
        this.create_time = create_time;
    }

    public java.util.Date getUpdate_time() {
        return update_time;
    }

    public void setUpdate_time(java.util.Date update_time) {
        this.update_time = update_time;
    }

    public String getContacts_web_id() {
        return contacts_web_id;
    }

    public void setContacts_web_id(String contacts_web_id) {
        this.contacts_web_id = contacts_web_id;
    }

    public String getTarget_user_web_id() {
        return target_user_web_id;
    }

    public void setTarget_user_web_id(String target_user_web_id) {
        this.target_user_web_id = target_user_web_id;
    }

    public Integer getSys_group_type() {
        return sys_group_type;
    }

    public void setSys_group_type(Integer sys_group_type) {
        this.sys_group_type = sys_group_type;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getNick() {
        return nick;
    }

    public void setNick(String nick) {
        this.nick = nick;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    public String getFirst_letter() {
        return first_letter;
    }

    public void setFirst_letter(String first_letter) {
        this.first_letter = first_letter;
    }

    public long getFriends_group() {
        return friends_group;
    }

    public void setFriends_group(long friends_group) {
        this.friends_group = friends_group;
    }

    /** To-one relationship, resolved on first access. */
    public Group getO2o_friends_group() {
        long __key = this.friends_group;
        if (o2o_friends_group__resolvedKey == null || !o2o_friends_group__resolvedKey.equals(__key)) {
            if (daoSession == null) {
                throw new DaoException("Entity is detached from DAO context");
            }
            GroupDao targetDao = daoSession.getGroupDao();
            Group o2o_friends_groupNew = targetDao.load(__key);
            synchronized (this) {
                o2o_friends_group = o2o_friends_groupNew;
            	o2o_friends_group__resolvedKey = __key;
            }
        }
        return o2o_friends_group;
    }

    public void setO2o_friends_group(Group o2o_friends_group) {
        if (o2o_friends_group == null) {
            throw new DaoException("To-one property 'friends_group' has not-null constraint; cannot set to-one to null");
        }
        synchronized (this) {
            this.o2o_friends_group = o2o_friends_group;
            friends_group = o2o_friends_group.getId();
            o2o_friends_group__resolvedKey = friends_group;
        }
    }

    /** Convenient call for {@link AbstractDao#delete(Object)}. Entity must attached to an entity context. */
    public void delete() {
        if (myDao == null) {
            throw new DaoException("Entity is detached from DAO context");
        }    
        myDao.delete(this);
    }

    /** Convenient call for {@link AbstractDao#update(Object)}. Entity must attached to an entity context. */
    public void update() {
        if (myDao == null) {
            throw new DaoException("Entity is detached from DAO context");
        }    
        myDao.update(this);
    }

    /** Convenient call for {@link AbstractDao#refresh(Object)}. Entity must attached to an entity context. */
    public void refresh() {
        if (myDao == null) {
            throw new DaoException("Entity is detached from DAO context");
        }    
        myDao.refresh(this);
    }

}
