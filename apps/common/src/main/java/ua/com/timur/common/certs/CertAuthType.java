package ua.com.timur.common.certs;

/**
 * Created by тимур50 on 26.02.2019.
 */
public enum CertAuthType {
    MAIN(1),
    EXTERNAL(2),
    BANK(3);

    private int code;

    CertAuthType (int code){
        this.code = code;
    }

    public int getCode() {
        return code;
    }

    public static CertAuthType valueOf(int code) {
        for(CertAuthType certAuthType : CertAuthType.values()) {
            if(certAuthType.getCode() == code)
                return certAuthType;
        }
        return null;
    }
}
