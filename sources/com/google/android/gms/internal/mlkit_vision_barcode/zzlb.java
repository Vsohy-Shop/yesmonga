package com.google.android.gms.internal.mlkit_vision_barcode;

public enum zzlb implements C38743q1 {
    UNRECOGNIZED(0),
    CODE_128(1),
    CODE_39(2),
    CODE_93(3),
    CODABAR(4),
    DATA_MATRIX(5),
    EAN_13(6),
    EAN_8(7),
    ITF(8),
    QR_CODE(9),
    UPC_A(10),
    UPC_E(11),
    PDF417(12),
    AZTEC(13),
    DATABAR(14),
    TEZ_CODE(16);
    
    private final int zzr;

    /* access modifiers changed from: public */
    zzlb(int i) {
        this.zzr = i;
    }

    public final int zza() {
        return this.zzr;
    }
}
