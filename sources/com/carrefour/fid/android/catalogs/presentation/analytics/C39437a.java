package com.carrefour.fid.android.catalogs.presentation.analytics;

import com.carrefour.fid.android.analytics.presentation.C13821a;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

/* renamed from: com.carrefour.fid.android.catalogs.presentation.analytics.a */
public final class C39437a {
    @C12579k

    /* renamed from: a */
    public static final String f100912a = "catalogues";
    @C12579k

    /* renamed from: b */
    public static final String f100913b = "catalogues";

    @C12579k
    /* renamed from: a */
    public static final Map<String, String> m161625a(@C12579k String str, @C12579k String str2, @C12579k String str3, @C12579k String str4, @C12580l String str5) {
        Intrinsics.checkNotNullParameter(str, "screenName");
        Intrinsics.checkNotNullParameter(str2, "screenTemplate");
        Intrinsics.checkNotNullParameter(str3, "eventCategory");
        Intrinsics.checkNotNullParameter(str4, "action");
        return C13821a.m58743a(str, str2, str3, str4, str5);
    }

    /* renamed from: b */
    public static /* synthetic */ Map m161626b(String str, String str2, String str3, String str4, String str5, int i, Object obj) {
        if ((i & 1) != 0) {
            str = "catalogues";
        }
        if ((i & 2) != 0) {
            str2 = "catalogues";
        }
        if ((i & 4) != 0) {
            str3 = "catalogues";
        }
        if ((i & 16) != 0) {
            str5 = null;
        }
        return m161625a(str, str2, str3, str4, str5);
    }
}
