package com.carrefour.fid.android.analytics.presentation;

import com.carrefour.fid.android.shared.constant.C28526d;
import java.util.Map;
import kotlin.C11078d1;
import kotlin.collections.C10977s0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

/* renamed from: com.carrefour.fid.android.analytics.presentation.a */
public final class C13821a {
    @C12579k
    /* renamed from: a */
    public static final Map<String, String> m58743a(@C12579k String str, @C12579k String str2, @C12579k String str3, @C12579k String str4, @C12580l String str5) {
        Intrinsics.checkNotNullParameter(str, "screenName");
        Intrinsics.checkNotNullParameter(str2, "screenTemplate");
        Intrinsics.checkNotNullParameter(str3, "eventCategory");
        Intrinsics.checkNotNullParameter(str4, "eventAction");
        Map<String, String> W = C10977s0.m41456W(C11078d1.m42659a(C28526d.f68891a, "event"), C11078d1.m42659a(C28526d.f68906d, str2), C11078d1.m42659a("screen_name", str), C11078d1.m42659a(C28526d.f68929i, str3), C11078d1.m42659a(C28526d.f68933j, str4));
        if (str5 != null) {
            return C10977s0.m41474o0(W, C11078d1.m42659a(C28526d.f68937k, str5));
        }
        return W;
    }
}
