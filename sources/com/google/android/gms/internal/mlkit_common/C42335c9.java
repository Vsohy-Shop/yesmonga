package com.google.android.gms.internal.mlkit_common;

import android.os.SystemClock;
import androidx.annotation.C0348i1;
import com.google.android.gms.common.internal.C40777k;
import com.google.mlkit.common.model.C33920d;
import com.google.mlkit.common.sdkinternal.C33970o;
import com.google.mlkit.common.sdkinternal.ModelType;

/* renamed from: com.google.android.gms.internal.mlkit_common.c9 */
public final class C42335c9 {

    /* renamed from: a */
    public static final C40777k f106948a = new C40777k("RemoteModelUtils", "");

    @C0348i1
    /* renamed from: a */
    public static C42354e6 m171443a(C33920d dVar, C33970o oVar, C42499r8 r8Var) {
        zzhi zzhi;
        ModelType b = r8Var.mo137673b();
        String b2 = dVar.mo98678b();
        C42398i6 i6Var = new C42398i6();
        C42365f6 f6Var = new C42365f6();
        f6Var.mo137669c(dVar.mo98680d());
        f6Var.mo137670d(zzhj.CLOUD);
        f6Var.mo137667a(C42358f.m171477b(b2));
        ModelType modelType = ModelType.UNKNOWN;
        int ordinal = b.ordinal();
        if (ordinal == 2) {
            zzhi = zzhi.BASE_TRANSLATE;
        } else if (ordinal == 4) {
            zzhi = zzhi.CUSTOM;
        } else if (ordinal != 5) {
            zzhi = zzhi.TYPE_UNKNOWN;
        } else {
            zzhi = zzhi.BASE_DIGITAL_INK;
        }
        f6Var.mo137668b(zzhi);
        i6Var.mo137715b(f6Var.mo137671g());
        C42431l6 c = i6Var.mo137716c();
        C42332c6 c6Var = new C42332c6();
        c6Var.mo137636d(r8Var.mo137674c());
        c6Var.mo137635c(r8Var.mo137675d());
        c6Var.mo137634b(Long.valueOf((long) r8Var.mo137672a()));
        c6Var.mo137638f(c);
        if (r8Var.mo137679g()) {
            long j = oVar.mo98816j(dVar);
            if (j == 0) {
                f106948a.mo134441n("RemoteModelUtils", "Model downloaded without its beginning time recorded.");
            } else {
                long k = oVar.mo98817k(dVar);
                if (k == 0) {
                    k = SystemClock.elapsedRealtime();
                    oVar.mo98822p(dVar, k);
                }
                c6Var.mo137639g(Long.valueOf(k - j));
            }
        }
        if (r8Var.mo137678f()) {
            long j2 = oVar.mo98816j(dVar);
            if (j2 == 0) {
                f106948a.mo134441n("RemoteModelUtils", "Model downloaded without its beginning time recorded.");
            } else {
                c6Var.mo137637e(Long.valueOf(SystemClock.elapsedRealtime() - j2));
            }
        }
        return c6Var.mo137640i();
    }
}
