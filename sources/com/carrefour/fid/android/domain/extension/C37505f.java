package com.carrefour.fid.android.domain.extension;

import com.carrefour.fid.android.domain.models.C38042l;
import com.carrefour.fid.android.ecommerce.utils.C38212b;
import com.carrefour.fid.android.shared.extension.DateExtensionsKt;
import com.carrefour.fid.android.shared.extension.StringKt;
import java.util.HashMap;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

/* renamed from: com.carrefour.fid.android.domain.extension.f */
public final class C37505f {
    /* renamed from: a */
    public static final void m153944a(@C12579k C38042l lVar, @C12579k String str) {
        Intrinsics.checkNotNullParameter(lVar, "$this$prepareParamsForDelivery");
        Intrinsics.checkNotNullParameter(str, "anabelKey");
        HashMap<String, String> a = lVar.mo117788a();
        a.put("tag", C38212b.f96786F);
        a.put("version", C38212b.f96788H);
        String p = StringKt.m118936p(str);
        lVar.mo117792e("e_" + p);
    }

    /* renamed from: b */
    public static final void m153945b(@C12579k C38042l lVar, @C12579k String str) {
        boolean z;
        Intrinsics.checkNotNullParameter(lVar, "$this$prepareParamsForDrive");
        Intrinsics.checkNotNullParameter(str, "anabelKey");
        HashMap<String, String> a = lVar.mo117788a();
        a.put("x_crf_one", C38212b.f96812t);
        a.put("tag", C38212b.f96809q);
        a.put("version", "drive");
        a.put("x_crf_one", C38212b.f96812t);
        if (lVar.mo117789b().length() > 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            a.put(C38212b.f96782B, lVar.mo117789b());
        }
        a.put(C38212b.f96781A, DateExtensionsKt.m118764j(lVar.mo117790c()));
        String p = StringKt.m118936p(str);
        lVar.mo117792e("d_" + p);
    }

    /* renamed from: c */
    public static final void m153946c(@C12579k C38042l lVar, @C12579k String str) {
        Intrinsics.checkNotNullParameter(lVar, "$this$prepareParamsPEFormat");
        Intrinsics.checkNotNullParameter(str, "anabelKey");
        HashMap<String, String> a = lVar.mo117788a();
        a.put("tag", C38212b.f96785E);
        a.put("version", "clcv");
        lVar.mo117792e(StringKt.m118936p(str));
    }
}
