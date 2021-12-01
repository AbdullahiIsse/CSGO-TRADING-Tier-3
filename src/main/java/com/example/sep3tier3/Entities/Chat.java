package com.example.sep3tier3.Entities;

import javax.persistence.*;


    @Entity
    @Table(name = "Chat")
    public class Chat {

        @Id
        @Column(name ="user_id")
        @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "chat_generator")
        @SequenceGenerator(name = "chat_generator",sequenceName = "chat_seq", allocationSize = 1)

        private long user_id;

        private String Chatlist;


        public Chat() {

        }

        public long getUser_id() {
            return user_id;
        }

        public void setUser_id(long user_id) {
            this.user_id = user_id;
        }

        public String getChatlist() {
            return Chatlist;
        }

        public void setChatlist(String chatlist) {
            Chatlist = chatlist;
        }
    }
