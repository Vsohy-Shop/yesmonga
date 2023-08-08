package com.google.zxing.qrcode.decoder;

public enum ErrorCorrectionLevel {
    L(1),
    M(0),
    Q(3),
    H(2);
    

    /* renamed from: e */
    public static final ErrorCorrectionLevel[] f84714e = null;
    private final int bits;

    /* access modifiers changed from: public */
    static {
        ErrorCorrectionLevel errorCorrectionLevel;
        ErrorCorrectionLevel errorCorrectionLevel2;
        ErrorCorrectionLevel errorCorrectionLevel3;
        ErrorCorrectionLevel errorCorrectionLevel4;
        f84714e = new ErrorCorrectionLevel[]{errorCorrectionLevel2, errorCorrectionLevel, errorCorrectionLevel4, errorCorrectionLevel3};
    }

    /* access modifiers changed from: public */
    ErrorCorrectionLevel(int i) {
        this.bits = i;
    }

    /* renamed from: b */
    public static ErrorCorrectionLevel m142435b(int i) {
        if (i >= 0) {
            ErrorCorrectionLevel[] errorCorrectionLevelArr = f84714e;
            if (i < errorCorrectionLevelArr.length) {
                return errorCorrectionLevelArr[i];
            }
        }
        throw new IllegalArgumentException();
    }

    /* renamed from: g */
    public int mo103156g() {
        return this.bits;
    }
}
