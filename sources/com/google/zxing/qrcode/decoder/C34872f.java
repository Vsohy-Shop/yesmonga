package com.google.zxing.qrcode.decoder;

import com.google.zxing.C34762l;

/* renamed from: com.google.zxing.qrcode.decoder.f */
public final class C34872f {

    /* renamed from: a */
    public final boolean f84741a;

    public C34872f(boolean z) {
        this.f84741a = z;
    }

    /* renamed from: a */
    public void mo103178a(C34762l[] lVarArr) {
        if (this.f84741a && lVarArr != null && lVarArr.length >= 3) {
            C34762l lVar = lVarArr[0];
            lVarArr[0] = lVarArr[2];
            lVarArr[2] = lVar;
        }
    }

    /* renamed from: b */
    public boolean mo103179b() {
        return this.f84741a;
    }
}
