package com.trx.example.facade.point;

public class Test {

    public static void main(String args[]){

        GiftInfo  giftInfo = new GiftInfo("�ʼǱ�����");
        FacadeService  facadeService = new FacadeService();
        facadeService.exchange(giftInfo);
    }
}
