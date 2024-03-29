package com.vince.vchat12.data;

import java.util.List;
import com.vince.vchat12.data.DaoSession;
import de.greenrobot.dao.DaoException;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT. Enable "keep" sections if you want to edit. 
/**
 * Entity mapped to table "LOCAL_MSG".
 */
public class LocalMsg {

    private Long id;
    private java.util.Date create_time;
    private java.util.Date update_time;
    private String msg_web_id;
    private Integer type;
    private Integer status;
    private String content;
    private String attachment;
    private Boolean isGroupChat;
    private long localMsg_sender;
    private long localMsg_receiver;
    private long localMsg_groupReceiver;

    /** Used to resolve relations */
    private transient DaoSession daoSession;

    /** Used for active entity operations. */
    private transient LocalMsgDao myDao;

    private Friends o2o_localMsg_sender;
    private Long o2o_localMsg_sender__resolvedKey;

    private Friends o2o_localMsg_receiver;
    private Long o2o_localMsg_receiver__resolvedKey;

    private List<Friends> o2m_localMsg_groupReceiver;

    public LocalMsg() {
    }

    public LocalMsg(Long id) {
        this.id = id;
    }

    public LocalMsg(Long id, java.util.Date create_time, java.util.Date update_time, String msg_web_id, Integer type, Integer status, String content, String attachment, Boolean isGroupChat, long localMsg_sender, long localMsg_receiver, long localMsg_groupReceiver) {
        this.id = id;
        this.create_time = create_time;
        this.update_time = update_time;
        this.msg_web_id = msg_web_id;
        this.type = type;
        this.status = status;
        this.content = content;
        this.attachment = attachment;
        this.isGroupChat = isGroupChat;
        this.localMsg_sender = localMsg_sender;
        this.localMsg_receiver = localMsg_receiver;
        this.localMsg_groupReceiver = localMsg_groupReceiver;
    }

    /** called by internal mechanisms, do not call yourself. */
    public void __setDaoSession(DaoSession daoSession) {
        this.daoSession = daoSession;
        myDao = daoSession != null ? daoSession.getLocalMsgDao() : null;
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

    public String getMsg_web_id() {
        return msg_web_id;
    }

    public void setMsg_web_id(String msg_web_id) {
        this.msg_web_id = msg_web_id;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getAttachment() {
        return attachment;
    }

    public void setAttachment(String attachment) {
        this.attachment = attachment;
    }

    public Boolean getIsGroupChat() {
        return isGroupChat;
    }

    public void setIsGroupChat(Boolean isGroupChat) {
        this.isGroupChat = isGroupChat;
    }

    public long getLocalMsg_sender() {
        return localMsg_sender;
    }

    public void setLocalMsg_sender(long localMsg_sender) {
        this.localMsg_sender = localMsg_sender;
    }

    public long getLocalMsg_receiver() {
        return localMsg_receiver;
    }

    public void setLocalMsg_receiver(long localMsg_receiver) {
        this.localMsg_receiver = localMsg_receiver;
    }

    public long getLocalMsg_groupReceiver() {
        return localMsg_groupReceiver;
    }

    public void setLocalMsg_groupReceiver(long localMsg_groupReceiver) {
        this.localMsg_groupReceiver = localMsg_groupReceiver;
    }

    /** To-one relationship, resolved on first access. */
    public Friends getO2o_localMsg_sender() {
        long __key = this.localMsg_sender;
        if (o2o_localMsg_sender__resolvedKey == null || !o2o_localMsg_sender__resolvedKey.equals(__key)) {
            if (daoSession == null) {
                throw new DaoException("Entity is detached from DAO context");
            }
            FriendsDao targetDao = daoSession.getFriendsDao();
            Friends o2o_localMsg_senderNew = targetDao.load(__key);
            synchronized (this) {
                o2o_localMsg_sender = o2o_localMsg_senderNew;
            	o2o_localMsg_sender__resolvedKey = __key;
            }
        }
        return o2o_localMsg_sender;
    }

    public void setO2o_localMsg_sender(Friends o2o_localMsg_sender) {
        if (o2o_localMsg_sender == null) {
            throw new DaoException("To-one property 'localMsg_sender' has not-null constraint; cannot set to-one to null");
        }
        synchronized (this) {
            this.o2o_localMsg_sender = o2o_localMsg_sender;
            localMsg_sender = o2o_localMsg_sender.getId();
            o2o_localMsg_sender__resolvedKey = localMsg_sender;
        }
    }

    /** To-one relationship, resolved on first access. */
    public Friends getO2o_localMsg_receiver() {
        long __key = this.localMsg_receiver;
        if (o2o_localMsg_receiver__resolvedKey == null || !o2o_localMsg_receiver__resolvedKey.equals(__key)) {
            if (daoSession == null) {
                throw new DaoException("Entity is detached from DAO context");
            }
            FriendsDao targetDao = daoSession.getFriendsDao();
            Friends o2o_localMsg_receiverNew = targetDao.load(__key);
            synchronized (this) {
                o2o_localMsg_receiver = o2o_localMsg_receiverNew;
            	o2o_localMsg_receiver__resolvedKey = __key;
            }
        }
        return o2o_localMsg_receiver;
    }

    public void setO2o_localMsg_receiver(Friends o2o_localMsg_receiver) {
        if (o2o_localMsg_receiver == null) {
            throw new DaoException("To-one property 'localMsg_receiver' has not-null constraint; cannot set to-one to null");
        }
        synchronized (this) {
            this.o2o_localMsg_receiver = o2o_localMsg_receiver;
            localMsg_receiver = o2o_localMsg_receiver.getId();
            o2o_localMsg_receiver__resolvedKey = localMsg_receiver;
        }
    }

    /** To-many relationship, resolved on first access (and after reset). Changes to to-many relations are not persisted, make changes to the target entity. */
    public List<Friends> getO2m_localMsg_groupReceiver() {
        if (o2m_localMsg_groupReceiver == null) {
            if (daoSession == null) {
                throw new DaoException("Entity is detached from DAO context");
            }
            FriendsDao targetDao = daoSession.getFriendsDao();
            List<Friends> o2m_localMsg_groupReceiverNew = targetDao._queryLocalMsg_O2m_localMsg_groupReceiver(id);
            synchronized (this) {
                if(o2m_localMsg_groupReceiver == null) {
                    o2m_localMsg_groupReceiver = o2m_localMsg_groupReceiverNew;
                }
            }
        }
        return o2m_localMsg_groupReceiver;
    }

    /** Resets a to-many relationship, making the next get call to query for a fresh result. */
    public synchronized void resetO2m_localMsg_groupReceiver() {
        o2m_localMsg_groupReceiver = null;
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
