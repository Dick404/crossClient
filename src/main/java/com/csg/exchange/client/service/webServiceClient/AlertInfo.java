
package com.csg.exchange.client.service.webserviceClient;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>alertInfo complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="alertInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="areaCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="originalID" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="iPAddress" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="alarmID" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="alarmCate" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="alarmType" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="alarmLevel" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="alarmContent" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="alarmStatus" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="firstTime" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="endTime" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="alarmCount" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="closeTime" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="orderID" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="className" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="scene" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="time" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="mainData" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="sendto" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="subject" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "alertInfo", propOrder = {
    "areaCode",
    "id",
    "originalID",
    "iPAddress",
    "alarmID",
    "alarmCate",
    "alarmType",
    "alarmLevel",
    "alarmContent",
    "alarmStatus",
    "firstTime",
    "endTime",
    "alarmCount",
    "closeTime",
    "orderID",
    "className",
    "scene",
    "time",
    "mainData",
    "sendto",
    "subject",
        "platform",
        "host"
})
public class AlertInfo {

    @XmlElement(required = true)
    protected String areaCode;
    @XmlElement(required = true)
    protected String id;
    @XmlElement(required = true)
    protected String originalID;
    @XmlElement(required = true)
    protected String iPAddress;
    @XmlElement(required = true)
    protected String alarmID;
    @XmlElement(required = true)
    protected String alarmCate;
    @XmlElement(required = true)
    protected String alarmType;
    @XmlElement(required = true)
    protected String alarmLevel;
    @XmlElement(required = true)
    protected String alarmContent;
    @XmlElement(required = true)
    protected String alarmStatus;
    @XmlElement(required = true)
    protected String firstTime;
    @XmlElement(required = true)
    protected String endTime;
    @XmlElement(required = true)
    protected String alarmCount;
    @XmlElement(required = true)
    protected String closeTime;
    @XmlElement(required = true)
    protected String orderID;
    @XmlElement(required = true)
    protected String className;
    @XmlElement(required = true)
    protected String scene;
    @XmlElement(required = true)
    protected String time;
    @XmlElement(required = true)
    protected String mainData;
    @XmlElement(required = true)
    protected String sendto;
    @XmlElement(required = true)
    protected String subject;
    @XmlElement(namespace = "http://spring.io/guides/gs-producing-web-service", required = true)
    protected String platform;
    @XmlElement(namespace = "http://spring.io/guides/gs-producing-web-service", required = true)
    protected String host;
    /**
     * ��ȡareaCode���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAreaCode() {
        return areaCode;
    }

    /**
     * ����areaCode���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAreaCode(String value) {
        this.areaCode = value;
    }

    /**
     * ��ȡid���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * ����id���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
    }

    /**
     * ��ȡoriginalID���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOriginalID() {
        return originalID;
    }

    /**
     * ����originalID���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOriginalID(String value) {
        this.originalID = value;
    }

    /**
     * ��ȡipAddress���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getiPAddress() {
        return iPAddress;
    }

    /**
     * ����ipAddress���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setiPAddress(String value) {
        this.iPAddress = value;
    }

    /**
     * ��ȡalarmID���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAlarmID() {
        return alarmID;
    }

    /**
     * ����alarmID���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAlarmID(String value) {
        this.alarmID = value;
    }

    /**
     * ��ȡalarmCate���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAlarmCate() {
        return alarmCate;
    }

    /**
     * ����alarmCate���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAlarmCate(String value) {
        this.alarmCate = value;
    }

    /**
     * ��ȡalarmType���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAlarmType() {
        return alarmType;
    }

    /**
     * ����alarmType���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAlarmType(String value) {
        this.alarmType = value;
    }

    /**
     * ��ȡalarmLevel���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAlarmLevel() {
        return alarmLevel;
    }

    /**
     * ����alarmLevel���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAlarmLevel(String value) {
        this.alarmLevel = value;
    }

    /**
     * ��ȡalarmContent���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAlarmContent() {
        return alarmContent;
    }

    /**
     * ����alarmContent���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAlarmContent(String value) {
        this.alarmContent = value;
    }

    /**
     * ��ȡalarmStatus���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAlarmStatus() {
        return alarmStatus;
    }

    /**
     * ����alarmStatus���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAlarmStatus(String value) {
        this.alarmStatus = value;
    }

    /**
     * ��ȡfirstTime���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFirstTime() {
        return firstTime;
    }

    /**
     * ����firstTime���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFirstTime(String value) {
        this.firstTime = value;
    }

    /**
     * ��ȡendTime���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEndTime() {
        return endTime;
    }

    /**
     * ����endTime���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEndTime(String value) {
        this.endTime = value;
    }

    /**
     * ��ȡalarmCount���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAlarmCount() {
        return alarmCount;
    }

    /**
     * ����alarmCount���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAlarmCount(String value) {
        this.alarmCount = value;
    }

    /**
     * ��ȡcloseTime���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCloseTime() {
        return closeTime;
    }

    /**
     * ����closeTime���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCloseTime(String value) {
        this.closeTime = value;
    }

    /**
     * ��ȡorderID���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrderID() {
        return orderID;
    }

    /**
     * ����orderID���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrderID(String value) {
        this.orderID = value;
    }

    /**
     * ��ȡclassName���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClassName() {
        return className;
    }

    /**
     * ����className���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClassName(String value) {
        this.className = value;
    }

    /**
     * ��ȡscene���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getScene() {
        return scene;
    }

    /**
     * ����scene���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setScene(String value) {
        this.scene = value;
    }

    /**
     * ��ȡtime���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTime() {
        return time;
    }

    /**
     * ����time���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTime(String value) {
        this.time = value;
    }

    /**
     * ��ȡmainData���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMainData() {
        return mainData;
    }

    /**
     * ����mainData���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMainData(String value) {
        this.mainData = value;
    }

    /**
     * ��ȡsendto���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSendto() {
        return sendto;
    }

    /**
     * ����sendto���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSendto(String value) {
        this.sendto = value;
    }

    /**
     * ��ȡsubject���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubject() {
        return subject;
    }

    /**
     * ����subject���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubject(String value) {
        this.subject = value;
    }

    /**
     * ��ȡplatform���Ե�ֵ��
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getPlatform() {
        return platform;
    }

    public void setPlatform(String value) {
        this.platform = value;
    }

    public String getHost() {
        return host;
    }

    public void setHost(String value) {
        this.host = value;
    }
}
