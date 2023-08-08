package com.carrefour.fid.android.app.utils;

import android.content.Context;
import androidx.compose.runtime.internal.C8567o;
import com.carrefour.fid.android.shared.util.C28935i;
import com.google.android.play.core.splitinstall.C32158c;
import com.google.android.play.core.splitinstall.C32161d;
import com.urbanairship.iam.events.C9175a;
import kotlin.collections.C10976s;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

@C8567o(parameters = 0)
public final class CrfPayUtils {
    @C12579k

    /* renamed from: a */
    public static final CrfPayUtils f33757a = new CrfPayUtils();

    /* renamed from: b */
    public static final int f33758b = 0;

    /* renamed from: d */
    public static final void m58820d(C11300l lVar, Object obj) {
        Intrinsics.checkNotNullParameter(lVar, "$tmp0");
        lVar.invoke(obj);
    }

    /* renamed from: e */
    public static final void m58821e(Exception exc) {
        C28935i.m119704b(C28935i.f70940a, "CPAY removal : cpay failed to be removed", (Throwable) null, 0, 6, (Object) null);
    }

    /* renamed from: c */
    public final void mo32772c(@C12579k Context context) {
        Intrinsics.checkNotNullParameter(context, C9175a.f24932Y);
        C28935i.m119704b(C28935i.f70940a, "CPAY removal : check if cpay is installed", (Throwable) null, 0, 6, (Object) null);
        C32158c a = C32161d.m130147a(context);
        Intrinsics.checkNotNullExpressionValue(a, "create(context)");
        if (a.mo92932l().contains(C13839e.f33762a)) {
            a.mo92929i(C10976s.m41419k(C13839e.f33762a)).mo93017e(new C13837c(new CrfPayUtils$removeCpayIfInstalled$1(context))).mo93015c(new C13838d());
        }
    }
}
