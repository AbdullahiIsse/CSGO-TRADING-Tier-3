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

        private String Chatlist;

        private long user_id;

        public Chat() {

        }

        public long getId() {
            return id;
        }

        public void setId(long id) {
            this.id = id;
        }

        public String getChatlist() {
            return Chatlist;
        }

        public void setChatlist(String chatlist) {
            Chatlist = chatlist;
        }

        public long getUser_id() {
            return user_id;
        }

        public void setUser_id(long user_id) {
            this.user_id = user_id;
        }
    }
