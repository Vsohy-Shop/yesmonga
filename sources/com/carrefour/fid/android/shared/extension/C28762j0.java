package com.carrefour.fid.android.shared.extension;

import com.carrefour.fid.android.domain.models.service.models.C38162k;
import com.carrefour.fid.android.domain.models.service.models.C38163l;
import com.carrefour.fid.android.domain.models.service.models.StoreService;
import com.carrefour.fid.android.shared.constant.C28533e2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.C11622t;
import org.jetbrains.annotations.C12579k;

/* renamed from: com.carrefour.fid.android.shared.extension.j0 */
public final class C28762j0 {
    @C12579k
    /* renamed from: a */
    public static final String m119068a(@C12579k C38162k kVar) {
        String G;
        Intrinsics.checkNotNullParameter(kVar, "<this>");
        StoreService f = kVar.mo119354f();
        boolean z = true;
        if (!Intrinsics.areEqual((Object) m119069b(kVar), (Object) C28533e2.f69109b)) {
            if (f == null || (G = f.mo119163G()) == null || !(!C11622t.isBlank(G))) {
                z = false;
            }
            if (z) {
                return f.mo119163G();
            }
        }
        return "0261-150-6";
    }

    @C12579k
    /* renamed from: b */
    public static final String m119069b(@C12579k C38162k kVar) {
        String w;
        Intrinsics.checkNotNullParameter(kVar, "<this>");
        C38163l e = kVar.mo119352e();
        boolean z = false;
        if (!(e == null || (w = e.mo119393w()) == null || !(!C11622t.isBlank(w)))) {
            z = true;
        }
        if (z) {
            return e.mo119393w();
        }
        return C28533e2.f69109b;
    }

    @C12579k
    /* renamed from: c */
    public static final String m119070c(@C12579k C38162k kVar) {
        String K;
        Intrinsics.checkNotNullParameter(kVar, "<this>");
        StoreService f = kVar.mo119354f();
        boolean z = false;
        if (!(f == null || (K = f.mo119167K()) == null || !(!C11622t.isBlank(K)))) {
            z = true;
        }
        if (z) {
            return f.mo119167K();
        }
        return "6";
    }
}
