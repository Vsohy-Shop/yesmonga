package com.google.mlkit.vision.barcode.internal;

import android.content.Context;
import com.google.android.gms.common.C40715h;
import com.google.android.gms.internal.mlkit_vision_barcode.C38557ba;
import com.google.android.gms.internal.mlkit_vision_barcode.C38700ma;
import com.google.mlkit.common.sdkinternal.C33939f;
import com.google.mlkit.common.sdkinternal.C33947j;
import com.google.mlkit.vision.barcode.C34004c;

/* renamed from: com.google.mlkit.vision.barcode.internal.f */
public final class C34014f extends C33939f<C34004c, C34017i> {

    /* renamed from: b */
    public final C33947j f82614b;

    public C34014f(C33947j jVar) {
        this.f82614b = jVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo85076a(Object obj) {
        C34018j jVar;
        C34004c cVar = (C34004c) obj;
        Context b = this.f82614b.mo98718b();
        C38557ba b2 = C38700ma.m160072b(C34010b.m136825d());
        if (C34021m.m136871b(b) || C40715h.m165670i().mo134221b(b) >= 204500000) {
            jVar = new C34021m(b, cVar, b2);
        } else {
            jVar = new C34023o(b, cVar, b2);
        }
        return new C34017i(this.f82614b, cVar, jVar, b2);
    }
}
