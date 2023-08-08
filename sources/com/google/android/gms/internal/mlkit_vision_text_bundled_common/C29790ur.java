package com.google.android.gms.internal.mlkit_vision_text_bundled_common;

import javax.annotation.CheckForNull;

/* renamed from: com.google.android.gms.internal.mlkit_vision_text_bundled_common.ur */
public abstract class C29790ur extends C29236fr<String> {

    /* renamed from: c */
    public final CharSequence f71492c;

    /* renamed from: d */
    public final C29383jr f71493d;

    /* renamed from: e */
    public int f71494e = 0;

    /* renamed from: f */
    public int f71495f;

    public C29790ur(C29827vr vrVar, CharSequence charSequence) {
        this.f71493d = vrVar.f71509a;
        this.f71495f = Integer.MAX_VALUE;
        this.f71492c = charSequence;
    }

    @CheckForNull
    /* renamed from: b */
    public final /* bridge */ /* synthetic */ Object mo84607b() {
        int i;
        int i2 = this.f71494e;
        while (true) {
            int i3 = this.f71494e;
            if (i3 != -1) {
                int e = mo84831e(i3);
                if (e == -1) {
                    e = this.f71492c.length();
                    this.f71494e = -1;
                    i = -1;
                } else {
                    i = mo84830d(e);
                    this.f71494e = i;
                }
                if (i == i2) {
                    int i4 = i + 1;
                    this.f71494e = i4;
                    if (i4 > this.f71492c.length()) {
                        this.f71494e = -1;
                    }
                } else {
                    if (i2 < e) {
                        this.f71492c.charAt(i2);
                    }
                    if (i2 < e) {
                        this.f71492c.charAt(e - 1);
                    }
                    int i5 = this.f71495f;
                    if (i5 == 1) {
                        e = this.f71492c.length();
                        this.f71494e = -1;
                        if (e > i2) {
                            this.f71492c.charAt(e - 1);
                        }
                    } else {
                        this.f71495f = i5 - 1;
                    }
                    return this.f71492c.subSequence(i2, e).toString();
                }
            } else {
                mo84608c();
                return null;
            }
        }
    }

    /* renamed from: d */
    public abstract int mo84830d(int i);

    /* renamed from: e */
    public abstract int mo84831e(int i);
}
