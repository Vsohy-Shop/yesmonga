package com.carrefour.fid.android.shared.extension;

import com.carrefour.fid.android.domain.models.service.models.FacilityServiceId;
import com.carrefour.fid.android.shared.constant.C28533e2;
import java.util.List;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.C11611k;
import kotlin.text.Regex;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

/* renamed from: com.carrefour.fid.android.shared.extension.y */
public final class C28789y {
    @C12579k

    /* renamed from: a */
    public static final Regex f70455a = new Regex("(\\w+)-(\\w+)-(\\w+)");

    @C12579k
    /* renamed from: a */
    public static final String m119118a(@C12579k String str) {
        C11611k.C11613b a;
        String str2;
        Intrinsics.checkNotNullParameter(str, "$this$anabelKey");
        C11611k d = Regex.m45042d(f70455a, str, 0, 2, (Object) null);
        if (d == null || (a = d.mo23312a()) == null || (str2 = a.mo23407k().mo23313b().get(1)) == null) {
            return C28533e2.f69109b;
        }
        return str2;
    }

    @C12580l
    /* renamed from: b */
    public static final String m119119b(@C12579k String str) {
        C11611k.C11613b a;
        Intrinsics.checkNotNullParameter(str, "$this$metiRef");
        C11611k d = Regex.m45042d(f70455a, str, 0, 2, (Object) null);
        if (d == null || (a = d.mo23312a()) == null) {
            return null;
        }
        return a.mo23407k().mo23313b().get(3);
    }

    @C12580l
    /* renamed from: c */
    public static final String m119120c(@C12579k String str) {
        C11611k.C11613b a;
        Intrinsics.checkNotNullParameter(str, "$this$service");
        C11611k d = Regex.m45042d(f70455a, str, 0, 2, (Object) null);
        if (d == null || (a = d.mo23312a()) == null) {
            return null;
        }
        return a.mo23407k().mo23313b().get(2);
    }

    /* renamed from: d */
    public static final boolean m119121d(@C12579k String str) {
        Intrinsics.checkNotNullParameter(str, "$this$isClcv");
        return Intrinsics.areEqual((Object) "151", (Object) m119120c(str));
    }

    /* renamed from: e */
    public static final boolean m119122e(@C12579k String str) {
        Intrinsics.checkNotNullParameter(str, "$this$isDrive");
        List L = CollectionsKt__CollectionsKt.m40448L("150", "308", "309", "310", "294");
        String c = m119120c(str);
        if (c == null) {
            c = "";
        }
        return L.contains(c);
    }

    /* renamed from: f */
    public static final boolean m119123f(@C12579k String str) {
        Intrinsics.checkNotNullParameter(str, "$this$isH1h3");
        return Intrinsics.areEqual((Object) "288", (Object) m119120c(str));
    }

    /* renamed from: g */
    public static final boolean m119124g(@C12579k String str) {
        Intrinsics.checkNotNullParameter(str, "$this$isHomeDelivery");
        return Intrinsics.areEqual((Object) "A1QD-151-4000", (Object) str);
    }

    @C12579k
    /* renamed from: h */
    public static final String m119125h(@C12579k String str) {
        Intrinsics.checkNotNullParameter(str, "$this$toGenericIfDrive");
        if (!m119122e(str)) {
            return str;
        }
        String a = m119118a(str);
        String b = m119119b(str);
        return FacilityServiceId.m157958b(a + "-150-" + b);
    }
}
