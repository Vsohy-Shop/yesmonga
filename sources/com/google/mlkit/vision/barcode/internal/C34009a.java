package com.google.mlkit.vision.barcode.internal;

import com.google.android.gms.internal.mlkit_vision_barcode.C38596ea;
import com.google.android.gms.internal.mlkit_vision_barcode.C38620g8;
import com.google.android.gms.internal.mlkit_vision_barcode.C38786t7;
import com.google.android.gms.internal.mlkit_vision_barcode.C38860z9;
import com.google.android.gms.internal.mlkit_vision_barcode.zzjd;
import com.google.android.gms.internal.mlkit_vision_barcode.zzje;

/* renamed from: com.google.mlkit.vision.barcode.internal.a */
public final /* synthetic */ class C34009a implements C38860z9 {

    /* renamed from: a */
    public final /* synthetic */ zzje f82605a;

    public /* synthetic */ C34009a(zzje zzje) {
        this.f82605a = zzje;
    }

    public final C38596ea zza() {
        zzjd zzjd;
        zzje zzje = this.f82605a;
        C38786t7 t7Var = new C38786t7();
        if (C34010b.m136827f()) {
            zzjd = zzjd.TYPE_THICK;
        } else {
            zzjd = zzjd.TYPE_THIN;
        }
        t7Var.mo122515e(zzjd);
        C38620g8 g8Var = new C38620g8();
        g8Var.mo122342b(zzje);
        t7Var.mo122518h(g8Var.mo122343c());
        return C38596ea.m159934d(t7Var);
    }
}
