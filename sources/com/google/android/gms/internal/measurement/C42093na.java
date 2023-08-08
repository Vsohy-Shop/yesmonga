package com.google.android.gms.internal.measurement;

/* renamed from: com.google.android.gms.internal.measurement.na */
public final class C42093na implements C42212ua {

    /* renamed from: a */
    public final C42212ua[] f106310a;

    public C42093na(C42212ua... uaVarArr) {
        this.f106310a = uaVarArr;
    }

    /* renamed from: a */
    public final C42195ta mo137154a(Class cls) {
        C42212ua[] uaVarArr = this.f106310a;
        for (int i = 0; i < 2; i++) {
            C42212ua uaVar = uaVarArr[i];
            if (uaVar.mo137155b(cls)) {
                return uaVar.mo137154a(cls);
            }
        }
        throw new UnsupportedOperationException("No factory is available for message type: ".concat(cls.getName()));
    }

    /* renamed from: b */
    public final boolean mo137155b(Class cls) {
        C42212ua[] uaVarArr = this.f106310a;
        for (int i = 0; i < 2; i++) {
            if (uaVarArr[i].mo137155b(cls)) {
                return true;
            }
        }
        return false;
    }
}
