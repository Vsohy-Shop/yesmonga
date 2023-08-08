package com.google.android.gms.internal.common;

import javax.annotation.CheckForNull;

/* renamed from: com.google.android.gms.internal.common.d0 */
public abstract class C41099d0 extends C41115q {

    /* renamed from: c */
    public final CharSequence f104389c;

    /* renamed from: d */
    public final C41120v f104390d;

    /* renamed from: e */
    public final boolean f104391e;

    /* renamed from: f */
    public int f104392f = 0;

    /* renamed from: g */
    public int f104393g;

    public C41099d0(C41101e0 e0Var, CharSequence charSequence) {
        this.f104390d = e0Var.f104395a;
        this.f104391e = e0Var.f104396b;
        this.f104393g = Integer.MAX_VALUE;
        this.f104389c = charSequence;
    }

    @CheckForNull
    /* renamed from: b */
    public final /* bridge */ /* synthetic */ Object mo134916b() {
        int e;
        int i;
        int i2 = this.f104392f;
        while (true) {
            int i3 = this.f104392f;
            if (i3 != -1) {
                e = mo134909e(i3);
                if (e == -1) {
                    e = this.f104389c.length();
                    this.f104392f = -1;
                    i = -1;
                } else {
                    i = mo134908d(e);
                    this.f104392f = i;
                }
                if (i == i2) {
                    int i4 = i + 1;
                    this.f104392f = i4;
                    if (i4 > this.f104389c.length()) {
                        this.f104392f = -1;
                    }
                } else {
                    if (i2 < e) {
                        this.f104389c.charAt(i2);
                    }
                    if (i2 < e) {
                        this.f104389c.charAt(e - 1);
                    }
                    if (!this.f104391e || i2 != e) {
                        int i5 = this.f104393g;
                    } else {
                        i2 = this.f104392f;
                    }
                }
            } else {
                mo134933c();
                return null;
            }
        }
        int i52 = this.f104393g;
        if (i52 == 1) {
            e = this.f104389c.length();
            this.f104392f = -1;
            if (e > i2) {
                this.f104389c.charAt(e - 1);
            }
        } else {
            this.f104393g = i52 - 1;
        }
        return this.f104389c.subSequence(i2, e).toString();
    }

    /* renamed from: d */
    public abstract int mo134908d(int i);

    /* renamed from: e */
    public abstract int mo134909e(int i);
}
