package org.example.format

class Arquivos {

    String name
    String versao
    String link

    Arquivos(String name, String versao, String link) {
        this.name = name
        this.versao = versao
        this.link = link
    }


    @Override
    String toString() {
        return "name='" + name + '\'' +
                ", versao='" + versao + '\'' +
                ", link='" + link;
    }
}
