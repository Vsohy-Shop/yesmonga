package com.google.android.gms.internal.mlkit_vision_barcode;

public enum zzir implements C38743q1 {
    UNKNOWN_FORMAT(0),
    NV16(1),
    NV21(2),
    YV12(3),
    YUV_420_888(7),
    JPEG(8),
    BITMAP(4),
    CM_SAMPLE_BUFFER_REF(5),
    UI_IMAGE(6),
    CV_PIXEL_BUFFER_REF(9);
    
    private final int zzl;

    /* access modifiers changed from: public */
    zzir(int i) {
        this.zzl = i;
    }

    public final int zza() {
        return this.zzl;
    }
}
