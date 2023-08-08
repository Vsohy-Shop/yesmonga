package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

/* renamed from: com.google.android.gms.internal.mlkit_vision_barcode_bundled.i4 */
public final class C38947i4 implements C39049t3 {

    /* renamed from: a */
    public final C39076w3 f98867a;

    /* renamed from: b */
    public final String f98868b;

    /* renamed from: c */
    public final Object[] f98869c;

    /* renamed from: d */
    public final int f98870d;

    public C38947i4(C39076w3 w3Var, String str, Object[] objArr) {
        this.f98867a = w3Var;
        this.f98868b = str;
        this.f98869c = objArr;
        char charAt = str.charAt(0);
        if (charAt < 55296) {
            this.f98870d = charAt;
            return;
        }
        char c = charAt & 8191;
        int i = 13;
        int i2 = 1;
        while (true) {
            int i3 = i2 + 1;
            char charAt2 = str.charAt(i2);
            if (charAt2 >= 55296) {
                c |= (charAt2 & 8191) << i;
                i += 13;
                i2 = i3;
            } else {
                this.f98870d = c | (charAt2 << i);
                return;
            }
        }
    }

    /* renamed from: a */
    public final String mo122933a() {
        return this.f98868b;
    }

    /* renamed from: b */
    public final Object[] mo122934b() {
        return this.f98869c;
    }

    /* renamed from: d */
    public final int mo122846d() {
        return (this.f98870d & 1) == 1 ? 1 : 2;
    }

    public final C39076w3 zza() {
        return this.f98867a;
    }

    public final boolean zzb() {
        return (this.f98870d & 2) == 2;
    }
}
