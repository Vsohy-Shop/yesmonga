package com.google.zxing.aztec.encoder;

import com.google.zxing.common.C34709a;

/* renamed from: com.google.zxing.aztec.encoder.g */
public abstract class C34643g {

    /* renamed from: b */
    public static final C34643g f83812b = new C34641e((C34643g) null, 0, 0);

    /* renamed from: a */
    public final C34643g f83813a;

    public C34643g(C34643g gVar) {
        this.f83813a = gVar;
    }

    /* renamed from: a */
    public final C34643g mo102474a(int i, int i2) {
        return new C34641e(this, i, i2);
    }

    /* renamed from: b */
    public final C34643g mo102475b(int i, int i2) {
        return new C34637b(this, i, i2);
    }

    /* renamed from: c */
    public abstract void mo102455c(C34709a aVar, byte[] bArr);

    /* renamed from: d */
    public final C34643g mo102476d() {
        return this.f83813a;
    }
}
