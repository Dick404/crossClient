package com.csg.exchange.client.service.receiver;

import com.csg.exchange.client.service.webserviceClient.AlertInfo;
import com.csg.exchange.client.service.webserviceClient.CountriesPort;
import com.csg.exchange.client.service.webserviceClient.CountriesPortService;
import com.csg.exchange.client.service.webserviceClient.PushAlertInfoRequest;

public class Receiver extends AbstractReceiver{
    @Override
    public void receive(com.csg.exchange.client.dao.AlertInfo alertInfo) {
        CountriesPort service = new CountriesPortService().getCountriesPortSoap11();
        PushAlertInfoRequest push = new PushAlertInfoRequest();
        AlertInfo info = new AlertInfo();

        info.setAreaCode(alertInfo.getAreaCode());
        info.setId(alertInfo.getId());
        info.setOriginalID(alertInfo.getOriginalID());
        info.setIPAddress(alertInfo.getIpAddress());
        info.setAlarmID(alertInfo.getAlarmID());
        info.setAlarmCate(alertInfo.getAlarmCate());
        info.setAlarmType(alertInfo.getAlarmType());
        info.setAlarmLevel(alertInfo.getAlarmLevel());
        info.setAlarmContent(alertInfo.getAlarmContent());
        info.setAlarmStatus(alertInfo.getAlarmStatus());
        info.setFirstTime(alertInfo.getFirstTime());
        info.setEndTime(alertInfo.getEndTime());
        info.setAlarmCount(alertInfo.getAlarmCount());
        info.setCloseTime(alertInfo.getCloseTime());
        info.setOrderID(alertInfo.getOrderID());
        info.setClassName(alertInfo.getClassName());
        info.setScene(alertInfo.getScene());
        info.setTime(alertInfo.getTime());
        info.setMainData(alertInfo.getMainData());
        info.setSendto(alertInfo.getSendto());
        info.setSubject(alertInfo.getSubject());
        info.setPlatform(alertInfo.getSubject());
        info.setHost(alertInfo.getHost());

        push.setName(info);

        try {
            service.pushAlertInfo(push);
        } catch (Exception e) {
            System.out.print(e);
        }
    }
}