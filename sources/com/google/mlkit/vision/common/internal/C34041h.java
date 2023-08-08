package com.google.mlkit.vision.common.internal;

import com.google.android.gms.tasks.C31035e;
import com.google.android.gms.tasks.C31047k;
import com.google.android.odml.image.C31850h;

/* renamed from: com.google.mlkit.vision.common.internal.h */
public final /* synthetic */ class C34041h implements C31035e {

    /* renamed from: a */
    public final /* synthetic */ C31850h f82681a;

    public /* synthetic */ C34041h(C31850h hVar) {
        this.f82681a = hVar;
    }

    public final void onComplete(C31047k kVar) {
        C31850h hVar = this.f82681a;
        int i = MobileVisionBase.f82660f;
        hVar.close();
    }
}
