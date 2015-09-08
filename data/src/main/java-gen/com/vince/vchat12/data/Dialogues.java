package com.vince.vchat12.data;

import java.util.List;
import com.vince.vchat12.data.DaoSession;
import de.greenrobot.dao.DaoException;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT. Enable "keep" sections if you want to edit. 
/**
 * Entity mapped to table "DIALOGUES".
 */
public class Dialogues {

    private Long id;
    private java.util.Date create_time;
    private java.util.Date update_time;
    private Boolean isGroupChat;
    private String last_msg_content;
    private String remark;
    private String nick;
    private String avatar;
    private long dialogues_friend;
    private long dialogues_groupReceiver;
    private long dialogues_msg_list;

    /** Used to resolve relations */
    private transient DaoSession daoSession;

    /** Used for active entity operations. */
    private transient DialoguesDao myDao;

    private Friends o2o_dialogues_friend;
    private Long o2o_dialogues_friend__resolvedKey;

    private List<Friends> o2m_dialogues_groupReceiver;
    private List<LocalMsg> o2m_dialogues_msg_list;

    public Dialogues() {
    }

    public Dialogues(Long id) {
        this.id = id;
    }

    public Dialogues(Long id, java.util.Date create_time, java.util.Date update_time, Boolean isGroupChat, String last_msg_content, String remark, String nick, String avatar, long dialogues_friend, long dialogues_groupReceiver, long dialogues_msg_list) {
        this.id = id;
        this.create_time = create_time;
        this.update_time = update_time;
        this.isGroupChat = isGroupChat;
        this.last_msg_content = last_msg_content;
        this.remark = remark;
        this.nick = nick;
        this.avatar = avatar;
        this.dialogues_friend = dialogues_friend;
        this.dialogues_groupReceiver = dialogues_groupReceiver;
        this.dialogues_msg_list = dialogues_msg_list;
    }

    /** called by internal mechanisms, do not call yourself. */
    public void __setDaoSession(DaoSession daoSession) {
        this.daoSession = daoSession;
        myDao = daoSession != null ? daoSession.getDialoguesDao() : null;
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

    public Boolean getIsGroupChat() {
        return isGroupChat;
    }

    public void setIsGroupChat(Boolean isGroupChat) {
        this.isGroupChat = isGroupChat;
    }

    public String getLast_msg_content() {
        return last_msg_content;
    }

    public void setLast_msg_content(String last_msg_content) {
        this.last_msg_content = last_msg_content;
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

    public long getDialogues_friend() {
        return dialogues_friend;
    }

    public void setDialogues_friend(long dialogues_friend) {
        this.dialogues_friend = dialogues_friend;
    }

    public long getDialogues_groupReceiver() {
        return dialogues_groupReceiver;
    }

    public void setDialogues_groupReceiver(long dialogues_groupReceiver) {
        this.dialogues_groupReceiver = dialogues_groupReceiver;
    }

    public long getDialogues_msg_list() {
        return dialogues_msg_list;
    }

    public void setDialogues_msg_list(long dialogues_msg_list) {
        this.dialogues_msg_list = dialogues_msg_list;
    }

    /** To-one relationship, resolved on first access. */
    public Friends getO2o_dialogues_friend() {
        long __key = this.dialogues_friend;
        if (o2o_dialogues_friend__resolvedKey == null || !o2o_dialogues_friend__resolvedKey.equals(__key)) {
            if (daoSession == null) {
                throw new DaoException("Entity is detached from DAO context");
            }
            FriendsDao targetDao = daoSession.getFriendsDao();
            Friends o2o_dialogues_friendNew = targetDao.load(__key);
            synchronized (this) {
                o2o_dialogues_friend = o2o_dialogues_friendNew;
            	o2o_dialogues_friend__resolvedKey = __key;
            }
        }
        return o2o_dialogues_friend;
    }

    public void setO2o_dialogues_friend(Friends o2o_dialogues_friend) {
        if (o2o_dialogues_friend == null) {
            throw new DaoException("To-one property 'dialogues_friend' has not-null constraint; cannot set to-one to null");
        }
        synchronized (this) {
            this.o2o_dialogues_friend = o2o_dialogues_friend;
            dialogues_friend = o2o_dialogues_friend.getId();
            o2o_dialogues_friend__resolvedKey = dialogues_friend;
        }
    }

    /** To-many relationship, resolved on first access (and after reset). Changes to to-many relations are not persisted, make changes to the target entity. */
    public List<Friends> getO2m_dialogues_groupReceiver() {
        if (o2m_dialogues_groupReceiver == null) {
            if (daoSession == null) {
                throw new DaoException("Entity is detached from DAO context");
            }
            FriendsDao targetDao = daoSession.getFriendsDao();
            List<Friends> o2m_dialogues_groupReceiverNew = targetDao._queryDialogues_O2m_dialogues_groupReceiver(id);
            synchronized (this) {
                if(o2m_dialogues_groupReceiver == null) {
                    o2m_dialogues_groupReceiver = o2m_dialogues_groupReceiverNew;
                }
            }
        }
        return o2m_dialogues_groupReceiver;
    }

    /** Resets a to-many relationship, making the next get call to query for a fresh result. */
    public synchronized void resetO2m_dialogues_groupReceiver() {
        o2m_dialogues_groupReceiver = null;
    }

    /** To-many relationship, resolved on first access (and after reset). Changes to to-many relations are not persisted, make changes to the target entity. */
    public List<LocalMsg> getO2m_dialogues_msg_list() {
        if (o2m_dialogues_msg_list == null) {
            if (daoSession == null) {
                throw new DaoException("Entity is detached from DAO context");
            }
            LocalMsgDao targetDao = daoSession.getLocalMsgDao();
            List<LocalMsg> o2m_dialogues_msg_listNew = targetDao._queryDialogues_O2m_dialogues_msg_list(id);
            synchronized (this) {
                if(o2m_dialogues_msg_list == null) {
                    o2m_dialogues_msg_list = o2m_dialogues_msg_listNew;
                }
            }
        }
        return o2m_dialogues_msg_list;
    }

    /** Resets a to-many relationship, making the next get call to query for a fresh result. */
    public synchronized void resetO2m_dialogues_msg_list() {
        o2m_dialogues_msg_list = null;
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