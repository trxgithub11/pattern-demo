package com.trx.example.proxy.staticproxy;

public class ZhangLaoSan  implements  IPerson{

private ZhangSan zhangsan;

    public ZhangLaoSan(ZhangSan zhangsan) {
        this.zhangsan = zhangsan;
    }

    public void findLove() {
        System.out.println("��������ʼ��ɫ");
        zhangsan.findLove();
        System.out.println("��ʼ����");
    }
}
