package ua.com.timur.entities;

import ua.com.timur.common.certs.CertAuthType;

import java.sql.Date;

/**
 * Created by тимур50 on 26.02.2019.
 */
public class UserCertVO {
    private int id;
    private int userId;
    private int caCertId;
    private Date insertDate;
    private Date endDate;
    private byte[] cert;
    private byte[] certExt;
    private String certSerial;
    private String certExtSerial;
    private int certTypyId;
    private int isBlocked;
    private String caUserSerialNumber;
    private CertAuthType certAuthType;
    private int certTypeState;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public int getCaCertId() {
        return caCertId;
    }

    public void setCaCertId(int caCertId) {
        this.caCertId = caCertId;
    }

    public Date getInsertDate() {
        return insertDate;
    }

    public void setInsertDate(Date insertDate) {
        this.insertDate = insertDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public byte[] getCert() {
        return cert;
    }

    public void setCert(byte[] cert) {
        this.cert = cert;
    }

    public byte[] getCertExt() {
        return certExt;
    }

    public void setCertExt(byte[] certExt) {
        this.certExt = certExt;
    }

    public String getCertSerial() {
        return certSerial;
    }

    public void setCertSerial(String certSerial) {
        this.certSerial = certSerial;
    }

    public String getCertExtSerial() {
        return certExtSerial;
    }

    public void setCertExtSerial(String certExtSerial) {
        this.certExtSerial = certExtSerial;
    }

    public int getCertTypyId() {
        return certTypyId;
    }

    public void setCertTypyId(int certTypyId) {
        this.certTypyId = certTypyId;
    }

    public int getIsBlocked() {
        return isBlocked;
    }

    public void setIsBlocked(int isBlocked) {
        this.isBlocked = isBlocked;
    }

    public String getCaUserSerialNumber() {
        return caUserSerialNumber;
    }

    public void setCaUserSerialNumber(String caUserSerialNumber) {
        this.caUserSerialNumber = caUserSerialNumber;
    }

    public CertAuthType getCertAuthType() {
        return certAuthType;
    }

    public void setCertAuthType(int certAuthType) {
        this.certAuthType = CertAuthType.valueOf(certAuthType);
    }

    public int getCertTypeState() {
        return certTypeState;
    }

    public void setCertTypeState(int certTypeState) {
        this.certTypeState = certTypeState;
    }
}
