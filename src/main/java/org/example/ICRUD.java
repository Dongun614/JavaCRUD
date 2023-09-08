package org.example;


public interface ICRUD {
    public Object add(); // 데이터를 추가할때
    public int update(Object obj); // 데이터를 수정할때
    public int delete(Object obj); // 데이터를 삭제할때
    public void selectOne(int id); // 데이터를 조회할때
}

