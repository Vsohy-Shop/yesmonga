package com.google.mlkit.vision.barcode.internal;

import androidx.annotation.C0359n0;
import com.google.android.gms.internal.mlkit_vision_barcode.C38700ma;
import com.google.mlkit.common.sdkinternal.C33937e;
import com.google.mlkit.vision.barcode.C34004c;

/* renamed from: com.google.mlkit.vision.barcode.internal.e */
public final class C34013e {

    /* renamed from: a */
    public final C34014f f82612a;

    /* renamed from: b */
    public final C33937e f82613b;

    public C34013e(C34014f fVar, C33937e eVar) {
        this.f82612a = fVar;
        this.f82613b = eVar;
    }

    /* renamed from: a */
    public final BarcodeScannerImpl mo98930a() {
        return mo98931b(BarcodeScannerImpl.f82604g);
    }

    /* renamed from: b */
    public final BarcodeScannerImpl mo98931b(@C0359n0 C34004c cVar) {
        return new BarcodeScannerImpl(cVar, (C34017i) this.f82612a.mo98709b(cVar), this.f82613b.mo98707a(cVar.mo98923b()), C38700ma.m160072b(C34010b.m136825d()));
    }
}
