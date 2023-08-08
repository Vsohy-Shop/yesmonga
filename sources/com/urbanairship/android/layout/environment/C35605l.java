package com.urbanairship.android.layout.environment;

import com.urbanairship.android.layout.environment.C35608o;
import com.urbanairship.android.layout.reporting.FormData;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

/* renamed from: com.urbanairship.android.layout.environment.l */
public final class C35605l {
    @C12580l
    /* renamed from: a */
    public static final <T extends FormData<?>> T m146922a(@C12579k C35607n<C35608o.C35610b> nVar, @C12579k String str) {
        Intrinsics.checkNotNullParameter(nVar, "<this>");
        Intrinsics.checkNotNullParameter(str, "identifier");
        return m146923b(nVar.mo106666a().getValue(), str);
    }

    @C12580l
    /* renamed from: b */
    public static final <T extends FormData<?>> T m146923b(@C12579k C35608o.C35610b bVar, @C12579k String str) {
        Intrinsics.checkNotNullParameter(bVar, "<this>");
        Intrinsics.checkNotNullParameter(str, "identifier");
        T t = bVar.mo106704r().get(str);
        if (t instanceof FormData) {
            return (FormData) t;
        }
        return null;
    }
}
