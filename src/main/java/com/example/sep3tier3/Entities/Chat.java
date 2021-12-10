package com.example.sep3tier3.Entities;

import javax.persistence.*;


    @Entity
    @Table(name = "Chat")
    public class Chat {
        @Id
        @Column(name = "id", nullable = true)
        private Long id;

        private String chat;

        private long star;

        public Long getId() {
            return id;
        }

        public void setId(Long id) {
            this.id = id;
        }


        public Chat() {

        }

        public String getChat() {
            return chat;
        }

        public void setChat(String chat) {
            this.chat = chat;
        }

        public long getStar() {
            return star;
        }

        public void setStar(long star) {
            this.star = star;
        }
    }
