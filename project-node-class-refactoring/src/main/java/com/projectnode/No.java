package com.projectnode;

public class No<T> {
    public T conteudo;
    public No proximoNo = null;

    public No(T conteudo) {
        this.conteudo = conteudo;
    }

    public T getConteudo() {
        return this.conteudo;
    }

    public void setConteudo(T conteudo) {
        this.conteudo = conteudo;
    }

    public No getProximoNo() {
        return this.proximoNo;
    }

    public void setProximoNo(No proximoNo) {
        this.proximoNo = proximoNo;
    }

    public String toString() {
        return "No{" + this.conteudo + "}";
    }

    public String toStringEncadeado() {
        String str = "No{" + this.conteudo + "}";
        if (this.proximoNo != null) {
            str = str + "->" + this.proximoNo.toString();
        } else {
            str = str + "->null";
        }

        return str;
    }
}
