package com.carrefour.fid.android.shared.util;

import android.content.Context;
import androidx.core.app.C17180n4;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

/* renamed from: com.carrefour.fid.android.shared.util.n */
public final class C28944n {
    /* renamed from: a */
    public static final boolean m119738a(@C12579k Context context) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        return C17180n4.m79433p(context).mo51601a();
    }

    /* renamed from: b */
    public static final boolean m119739b(@C12579k Context context) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        if (context.checkCallingOrSelfPermission("android.permission.CAMERA") == 0) {
            return true;
        }
        return false;
    }

    /* renamed from: c */
    public static final boolean m119740c(@C12579k Context context) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        if (context.checkCallingOrSelfPermission("android.permission.ACCESS_FINE_LOCATION") == 0) {
            return true;
        }
        return false;
    }
}
