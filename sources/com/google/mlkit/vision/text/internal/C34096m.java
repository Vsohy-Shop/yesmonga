package com.google.mlkit.vision.text.internal;

import androidx.annotation.C0359n0;
import com.google.android.gms.internal.mlkit_vision_text_common.C30044ea;
import com.google.mlkit.common.sdkinternal.C33937e;
import com.google.mlkit.vision.text.C34078d;
import com.google.mlkit.vision.text.C34079e;

/* renamed from: com.google.mlkit.vision.text.internal.m */
public final class C34096m {

    /* renamed from: a */
    public final C34097n f82755a;

    /* renamed from: b */
    public final C33937e f82756b;

    public C34096m(@C0359n0 C34097n nVar, @C0359n0 C33937e eVar) {
        this.f82755a = nVar;
        this.f82756b = eVar;
    }

    @C0359n0
    /* renamed from: a */
    public final C34078d mo99060a(@C0359n0 C34079e eVar) {
        return new TextRecognizerImpl((C34085b) this.f82755a.mo98709b(eVar), this.f82756b.mo98707a(eVar.mo99045a()), C30044ea.m121656b(eVar.mo99046b()), eVar);
    }
}
