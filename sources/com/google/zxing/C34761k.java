package com.google.zxing;

import java.util.EnumMap;
import java.util.Map;

/* renamed from: com.google.zxing.k */
public final class C34761k {

    /* renamed from: a */
    public final String f84271a;

    /* renamed from: b */
    public final byte[] f84272b;

    /* renamed from: c */
    public final int f84273c;

    /* renamed from: d */
    public C34762l[] f84274d;

    /* renamed from: e */
    public final BarcodeFormat f84275e;

    /* renamed from: f */
    public Map<ResultMetadataType, Object> f84276f;

    /* renamed from: g */
    public final long f84277g;

    public C34761k(String str, byte[] bArr, C34762l[] lVarArr, BarcodeFormat barcodeFormat) {
        this(str, bArr, lVarArr, barcodeFormat, System.currentTimeMillis());
    }

    /* renamed from: a */
    public void mo102872a(C34762l[] lVarArr) {
        C34762l[] lVarArr2 = this.f84274d;
        if (lVarArr2 == null) {
            this.f84274d = lVarArr;
        } else if (lVarArr != null && lVarArr.length > 0) {
            C34762l[] lVarArr3 = new C34762l[(lVarArr2.length + lVarArr.length)];
            System.arraycopy(lVarArr2, 0, lVarArr3, 0, lVarArr2.length);
            System.arraycopy(lVarArr, 0, lVarArr3, lVarArr2.length, lVarArr.length);
            this.f84274d = lVarArr3;
        }
    }

    /* renamed from: b */
    public BarcodeFormat mo102873b() {
        return this.f84275e;
    }

    /* renamed from: c */
    public int mo102874c() {
        return this.f84273c;
    }

    /* renamed from: d */
    public byte[] mo102875d() {
        return this.f84272b;
    }

    /* renamed from: e */
    public Map<ResultMetadataType, Object> mo102876e() {
        return this.f84276f;
    }

    /* renamed from: f */
    public C34762l[] mo102877f() {
        return this.f84274d;
    }

    /* renamed from: g */
    public String mo102878g() {
        return this.f84271a;
    }

    /* renamed from: h */
    public long mo102879h() {
        return this.f84277g;
    }

    /* renamed from: i */
    public void mo102880i(Map<ResultMetadataType, Object> map) {
        if (map != null) {
            Map<ResultMetadataType, Object> map2 = this.f84276f;
            if (map2 == null) {
                this.f84276f = map;
            } else {
                map2.putAll(map);
            }
        }
    }

    /* renamed from: j */
    public void mo102881j(ResultMetadataType resultMetadataType, Object obj) {
        if (this.f84276f == null) {
            this.f84276f = new EnumMap(ResultMetadataType.class);
        }
        this.f84276f.put(resultMetadataType, obj);
    }

    public String toString() {
        return this.f84271a;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public C34761k(String str, byte[] bArr, C34762l[] lVarArr, BarcodeFormat barcodeFormat, long j) {
        this(str, bArr, bArr == null ? 0 : bArr.length * 8, lVarArr, barcodeFormat, j);
    }

    public C34761k(String str, byte[] bArr, int i, C34762l[] lVarArr, BarcodeFormat barcodeFormat, long j) {
        this.f84271a = str;
        this.f84272b = bArr;
        this.f84273c = i;
        this.f84274d = lVarArr;
        this.f84275e = barcodeFormat;
        this.f84276f = null;
        this.f84277g = j;
    }
}
