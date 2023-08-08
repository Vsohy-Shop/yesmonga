package com.google.android.gms.internal.gtm;

/* renamed from: com.google.android.gms.internal.gtm.fl */
public final class C41267fl implements C41555rk {

    /* renamed from: a */
    public final C41627uk f104602a;

    /* renamed from: b */
    public final String f104603b;

    /* renamed from: c */
    public final Object[] f104604c;

    /* renamed from: d */
    public final int f104605d;

    public C41267fl(C41627uk ukVar, String str, Object[] objArr) {
        this.f104602a = ukVar;
        this.f104603b = str;
        this.f104604c = objArr;
        char charAt = str.charAt(0);
        if (charAt < 55296) {
            this.f104605d = charAt;
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
                this.f104605d = c | (charAt2 << i);
                return;
            }
        }
    }

    /* renamed from: a */
    public final String mo135376a() {
        return this.f104603b;
    }

    /* renamed from: b */
    public final Object[] mo135377b() {
        return this.f104604c;
    }

    /* renamed from: d */
    public final int mo135378d() {
        return (this.f104605d & 1) == 1 ? 1 : 2;
    }

    public final C41627uk zza() {
        return this.f104602a;
    }

    public final boolean zzb() {
        return (this.f104605d & 2) == 2;
    }
}
