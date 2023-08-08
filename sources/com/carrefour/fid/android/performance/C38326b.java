package com.carrefour.fid.android.performance;

import com.google.firebase.perf.C33314e;
import com.google.firebase.perf.metrics.Trace;
import javax.inject.Inject;
import kotlin.C11079d2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

/* renamed from: com.carrefour.fid.android.performance.b */
public final class C38326b extends C38335g {
    @C12579k

    /* renamed from: c */
    public final String f97077c = "list";

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @Inject
    public C38326b(@C12579k C33314e eVar) {
        super(eVar, (DefaultConstructorMarker) null);
        Intrinsics.checkNotNullParameter(eVar, "performance");
    }

    @C12579k
    /* renamed from: b */
    public String mo121183b() {
        return this.f97077c;
    }

    @C12580l
    /* renamed from: f */
    public final C11079d2 mo121184f(int i) {
        Trace a = mo121193a();
        if (a == null) {
            return null;
        }
        a.putAttribute("items", String.valueOf(i));
        return C11079d2.f28267a;
    }
}
