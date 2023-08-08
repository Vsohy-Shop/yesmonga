package com.google.android.gms.internal.mlkit_vision_text_bundled_common;

public final class i10 implements u00 {

    /* renamed from: a */
    public final x00 f71284a;

    /* renamed from: b */
    public final String f71285b;

    /* renamed from: c */
    public final Object[] f71286c;

    /* renamed from: d */
    public final int f71287d;

    public i10(x00 x00, String str, Object[] objArr) {
        this.f71284a = x00;
        this.f71285b = str;
        this.f71286c = objArr;
        char charAt = str.charAt(0);
        if (charAt < 55296) {
            this.f71287d = charAt;
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
                this.f71287d = c | (charAt2 << i);
                return;
            }
        }
    }

    /* renamed from: I */
    public final boolean mo84657I() {
        return (this.f71287d & 2) == 2;
    }

    /* renamed from: a */
    public final String mo84674a() {
        return this.f71285b;
    }

    /* renamed from: b */
    public final Object[] mo84675b() {
        return this.f71286c;
    }

    /* renamed from: i */
    public final x00 mo84658i() {
        return this.f71284a;
    }

    /* renamed from: z */
    public final int mo84659z() {
        return (this.f71287d & 1) == 1 ? 1 : 2;
    }
}
