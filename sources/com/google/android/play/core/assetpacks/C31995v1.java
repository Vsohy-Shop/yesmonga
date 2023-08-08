package com.google.android.play.core.assetpacks;

import android.support.annotation.Nullable;
import java.util.Arrays;

/* renamed from: com.google.android.play.core.assetpacks.v1 */
public final class C31995v1 {

    /* renamed from: a */
    public byte[] f78156a = new byte[4096];

    /* renamed from: b */
    public int f78157b;

    /* renamed from: c */
    public long f78158c;

    /* renamed from: d */
    public long f78159d;

    /* renamed from: e */
    public int f78160e;

    /* renamed from: f */
    public int f78161f;

    /* renamed from: g */
    public int f78162g;

    /* renamed from: h */
    public boolean f78163h;
    @Nullable

    /* renamed from: i */
    public String f78164i;

    public C31995v1() {
        mo92698d();
    }

    /* renamed from: a */
    public final int mo92695a(byte[] bArr, int i, int i2) {
        int e = mo92699e(30, bArr, i, i2);
        if (e == -1) {
            return -1;
        }
        if (this.f78158c == -1) {
            long d = C31987t1.m129669d(this.f78156a, 0);
            this.f78158c = d;
            if (d == 67324752) {
                this.f78163h = false;
                this.f78159d = C31987t1.m129669d(this.f78156a, 18);
                this.f78162g = C31987t1.m129670e(this.f78156a, 8);
                this.f78160e = C31987t1.m129670e(this.f78156a, 26);
                int e2 = this.f78160e + 30 + C31987t1.m129670e(this.f78156a, 28);
                this.f78161f = e2;
                int length = this.f78156a.length;
                if (length < e2) {
                    do {
                        length += length;
                    } while (length < e2);
                    this.f78156a = Arrays.copyOf(this.f78156a, length);
                }
            } else {
                this.f78163h = true;
            }
        }
        int e3 = mo92699e(this.f78161f, bArr, i + e, i2 - e);
        if (e3 == -1) {
            return -1;
        }
        int i3 = e + e3;
        if (!this.f78163h && this.f78164i == null) {
            this.f78164i = new String(this.f78156a, 30, this.f78160e);
        }
        return i3;
    }

    /* renamed from: b */
    public final C31968o2 mo92696b() {
        int i = this.f78157b;
        int i2 = this.f78161f;
        if (i < i2) {
            return C31968o2.m129601a(this.f78164i, this.f78159d, this.f78162g, true, Arrays.copyOf(this.f78156a, i), this.f78163h);
        }
        C31968o2 a = C31968o2.m129601a(this.f78164i, this.f78159d, this.f78162g, false, Arrays.copyOf(this.f78156a, i2), this.f78163h);
        mo92698d();
        return a;
    }

    /* renamed from: c */
    public final int mo92697c() {
        return this.f78161f;
    }

    /* renamed from: d */
    public final void mo92698d() {
        this.f78157b = 0;
        this.f78160e = -1;
        this.f78158c = -1;
        this.f78163h = false;
        this.f78161f = 30;
        this.f78159d = -1;
        this.f78162g = -1;
        this.f78164i = null;
    }

    /* renamed from: e */
    public final int mo92699e(int i, byte[] bArr, int i2, int i3) {
        int i4 = this.f78157b;
        if (i4 >= i) {
            return 0;
        }
        int min = Math.min(i3, i - i4);
        System.arraycopy(bArr, i2, this.f78156a, this.f78157b, min);
        int i5 = this.f78157b + min;
        this.f78157b = i5;
        if (i5 < i) {
            return -1;
        }
        return min;
    }
}
