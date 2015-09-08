package pl.surecase.eu;

import de.greenrobot.daogenerator.DaoGenerator;
import de.greenrobot.daogenerator.Entity;
import de.greenrobot.daogenerator.Property;
import de.greenrobot.daogenerator.Schema;

/**
 * 用来为GreenDao框架生成Dao文件
 */
public class MyDaoGenerator {

    //辅助文件生成的相对路径
    public static final String DAO_PATH = "../data/src/main/java-gen";
    //辅助文件的包名
    public static final String PACKAGE_NAME = "com.vince.vchat12.data";
    //数据库的版本号
    public static final int DATA_VERSION_CODE = 1;


    public static void main(String[] args) throws Exception {

        Schema schema = new Schema(DATA_VERSION_CODE, PACKAGE_NAME);
        init(schema);
        new DaoGenerator().generateAll(schema, DAO_PATH);//生成Dao文件路径

    }


    /**
     * 实例化
     */
    private static void init(Schema schema) {

        /**
         * 创建表 分组 Group
         */
        Entity group = schema.addEntity("Group");
        group.addIdProperty().primaryKey().autoincrement();
        group.addDateProperty("create_time");
        group.addDateProperty("update_time");
        group.addStringProperty("web_id");
        group.addStringProperty("group_name");


        /**
         * 创建表联系人表 friends
         */
        Entity friends = schema.addEntity("Friends");
        friends.addIdProperty().primaryKey().autoincrement();
        friends.addDateProperty("create_time");
        friends.addDateProperty("update_time");
        friends.addStringProperty("contacts_web_id");
        friends.addStringProperty("target_user_web_id");
        friends.addIntProperty("sys_group_type");
        friends.addStringProperty("remark");
        friends.addStringProperty("nick");
        friends.addStringProperty("avatar");
        friends.addStringProperty("first_letter");
        Property friends_group = friends.addLongProperty("friends_group").notNull().getProperty();
        friends.addToOne(group, friends_group,"o2o_friends_group");


        /**
         * 消息表 localMsg
         *
         * 包含字段：_id（自增主键），create_time(创建时间), update_time(更新时间)，
         *         msg_web_id（消息云id），sender_id（发送者id），received_id（接受者id），
         *         type（类型），status（状态），content（消息内容），attachment（附件地址），
         *         isGroupChat（是否群聊），group_receiver_id(群聊接受者),
         */
        Entity localMsg = schema.addEntity("LocalMsg");
        localMsg.addIdProperty().primaryKey().autoincrement();
        localMsg.addDateProperty("create_time");
        localMsg.addDateProperty("update_time");
        localMsg.addStringProperty("msg_web_id");
        localMsg.addIntProperty("type");
        localMsg.addIntProperty("status");
        localMsg.addStringProperty("content");
        localMsg.addStringProperty("attachment");
        localMsg.addBooleanProperty("isGroupChat");
        Property localMsg_sender = localMsg.addLongProperty("localMsg_sender").notNull().getProperty();
        localMsg.addToOne(friends, localMsg_sender, "o2o_localMsg_sender");
        Property localMsg_receiver = localMsg.addLongProperty("localMsg_receiver").notNull().getProperty();
        localMsg.addToOne(friends, localMsg_receiver, "o2o_localMsg_receiver");
        Property localMsg_groupReceiver = localMsg.addLongProperty("localMsg_groupReceiver").notNull().getProperty();
        localMsg.addToMany(friends, localMsg_groupReceiver, "o2m_localMsg_groupReceiver");


        /**
         * 对话表 dialogues
         * 包含字段：_id（自增主键），create_time(创建时间), update_time(更新时间)，
         *          isGroupChat（是否群聊），group_receiver_id(群聊接受者),
         *          last_msg_content（最后一条消息内容），group_receiver_id(群聊接受者),
         *
         *
         */
        Entity dialogues = schema.addEntity("Dialogues");
        dialogues.addIdProperty().primaryKey().autoincrement(); // 定义ID主键
        dialogues.addDateProperty("create_time");
        dialogues.addDateProperty("update_time");
        dialogues.addBooleanProperty("isGroupChat");
        dialogues.addStringProperty("last_msg_content");
        dialogues.addStringProperty("remark");
        dialogues.addStringProperty("nick");
        dialogues.addStringProperty("avatar");

        Property dialogues_friend = dialogues.addLongProperty("dialogues_friend").notNull().getProperty();
        dialogues.addToOne(friends, dialogues_friend, "o2o_dialogues_friend");

        Property dialogues_groupReceiver = dialogues.addLongProperty("dialogues_groupReceiver").notNull().getProperty();
        dialogues.addToMany(friends, dialogues_groupReceiver, "o2m_dialogues_groupReceiver");

        Property dialogues_msg_list = dialogues.addLongProperty("dialogues_msg_list").notNull().getProperty();
        dialogues.addToMany(localMsg, dialogues_msg_list, "o2m_dialogues_msg_list");

    }



}