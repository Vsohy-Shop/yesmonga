package com.carrefour.fid.android.shared.util;

import com.carrefour.fid.android.shared.data.headers.C28642c;
import kotlin.C11395k;
import kotlin.C11587t0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

/* renamed from: com.carrefour.fid.android.shared.util.c */
public final class C28905c {
    @C11395k(message = "Unsafe injection of token", replaceWith = @C11587t0(expression = "TokenProvider.getToken()", imports = {}))
    @C12580l
    /* renamed from: a */
    public static final String m119542a(@C12579k C28642c cVar) {
        boolean z;
        Intrinsics.checkNotNullParameter(cVar, "<this>");
        String a = cVar.mo31358a();
        if (a.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return null;
        }
        return "Bearer " + a;
    }

    @C12580l
    /* renamed from: b */
    public static final String m119543b(@C12579k C28642c cVar) {
        boolean z;
        Intrinsics.checkNotNullParameter(cVar, "<this>");
        String c = cVar.mo31360c();
        if (c.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return null;
        }
        return "Bearer " + c;
    }
}
