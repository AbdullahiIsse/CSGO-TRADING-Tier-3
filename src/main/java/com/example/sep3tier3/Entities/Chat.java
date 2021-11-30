package com.example.sep3tier3.Entities;

import javax.persistence.*;


    @Entity
    @Table(name = "Chat")
    public class Chat {

        @Id
        @Column(name ="ChatID")
        @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "chat_generator")
        @SequenceGenerator(name = "chat_generator",sequenceName = "chat_seq", allocationSize = 1)

        private long id;

        private String ChatList;

        public Chat() {

        }

        public long getId() {
            return id;
        }

        public void setId(long id) {
            this.id = id;
        }

        public String getChatList() {
            return ChatList;
        }

        public void setChatList(String chatList) {
            ChatList = chatList;
        }


        @Override
        public String toString() {
            return "Chat{" +
                    "id=" + id +
                    ", ChatList='" + ChatList + '\'' +
                    '}';
        }
    }
