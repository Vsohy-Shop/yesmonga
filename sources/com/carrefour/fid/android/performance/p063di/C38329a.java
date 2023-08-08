package com.carrefour.fid.android.performance.p063di;

import com.carrefour.fid.android.performance.C38326b;
import com.carrefour.fid.android.performance.C38328d;
import com.google.firebase.ktx.C33135b;
import com.google.firebase.perf.C33314e;
import com.google.firebase.perf.ktx.C33347b;
import dagger.C10159h;
import dagger.C10315i;
import dagger.hilt.C10267e;
import dagger.hilt.components.C10265a;
import javax.inject.Singleton;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

@C10159h
@C10267e({C10265a.class})
/* renamed from: com.carrefour.fid.android.performance.di.a */
public final class C38329a {
    @Singleton
    @C10315i
    @C12579k
    /* renamed from: a */
    public final C33314e mo121186a() {
        return C33347b.m134445a(C33135b.f80374a);
    }

    @Singleton
    @C10315i
    @C12579k
    /* renamed from: b */
    public final C38326b mo121187b(@C12579k C33314e eVar) {
        Intrinsics.checkNotNullParameter(eVar, "performance");
        return new C38326b(eVar);
    }

    @Singleton
    @C10315i
    @C12579k
    /* renamed from: c */
    public final C38328d mo121188c(@C12579k C33314e eVar) {
        Intrinsics.checkNotNullParameter(eVar, "performance");
        return new C38328d(eVar);
    }
}
