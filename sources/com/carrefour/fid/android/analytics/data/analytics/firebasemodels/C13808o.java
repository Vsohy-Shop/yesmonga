package com.carrefour.fid.android.analytics.data.analytics.firebasemodels;

import com.carrefour.fid.android.shared.constant.C28526d;
import java.util.Map;
import kotlin.C11078d1;
import kotlin.collections.C10977s0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

/* renamed from: com.carrefour.fid.android.analytics.data.analytics.firebasemodels.o */
public final class C13808o implements C13794f {
    @C12579k

    /* renamed from: a */
    public final String f33656a;
    @C12579k

    /* renamed from: b */
    public final String f33657b;

    public C13808o(@C12579k String str, @C12579k String str2) {
        Intrinsics.checkNotNullParameter(str, "eventCategory");
        Intrinsics.checkNotNullParameter(str2, "eventAction");
        this.f33656a = str;
        this.f33657b = str2;
    }

    @C12579k
    /* renamed from: a */
    public Map<String, Object> mo32723a() {
        return C10977s0.m41456W(C11078d1.m42659a(C28526d.f68933j, this.f33657b), C11078d1.m42659a(C28526d.f68929i, this.f33656a));
    }
}
