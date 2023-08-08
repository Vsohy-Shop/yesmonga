package com.journeyapps.barcodescanner;

import com.google.zxing.C34644b;
import com.google.zxing.C34752e;
import com.google.zxing.C34760j;
import com.google.zxing.common.C34720i;

/* renamed from: com.journeyapps.barcodescanner.q */
public class C34954q extends C34946k {

    /* renamed from: c */
    public boolean f85037c = true;

    public C34954q(C34760j jVar) {
        super(jVar);
    }

    /* renamed from: f */
    public C34644b mo103528f(C34752e eVar) {
        if (this.f85037c) {
            this.f85037c = false;
            return new C34644b(new C34720i(eVar.mo102744f()));
        }
        this.f85037c = true;
        return new C34644b(new C34720i(eVar));
    }
}
