package com.google.accompanist.placeholder;

import androidx.annotation.C0379x;
import androidx.compose.animation.core.C1984k0;
import com.google.accompanist.placeholder.C15037b;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

/* renamed from: com.google.accompanist.placeholder.c */
public final class C15039c {
    @C12579k
    /* renamed from: a */
    public static final C15037b m64453a(@C12579k C15037b.C15038a aVar, long j, @C12579k C1984k0<Float> k0Var) {
        Intrinsics.checkNotNullParameter(aVar, "$this$fade");
        Intrinsics.checkNotNullParameter(k0Var, "animationSpec");
        return new C15036a(j, k0Var, (DefaultConstructorMarker) null);
    }

    /* renamed from: b */
    public static /* synthetic */ C15037b m64454b(C15037b.C15038a aVar, long j, C1984k0<Float> k0Var, int i, Object obj) {
        if ((i & 2) != 0) {
            k0Var = PlaceholderDefaults.f37155a.mo42030a();
        }
        return m64453a(aVar, j, k0Var);
    }

    @C12579k
    /* renamed from: c */
    public static final C15037b m64455c(@C12579k C15037b.C15038a aVar, long j, @C12579k C1984k0<Float> k0Var, @C0379x(from = 0.0d, mo1016to = 1.0d) float f) {
        Intrinsics.checkNotNullParameter(aVar, "$this$shimmer");
        Intrinsics.checkNotNullParameter(k0Var, "animationSpec");
        return new C15045e(j, k0Var, f, (DefaultConstructorMarker) null);
    }

    /* renamed from: d */
    public static /* synthetic */ C15037b m64456d(C15037b.C15038a aVar, long j, C1984k0<Float> k0Var, float f, int i, Object obj) {
        if ((i & 2) != 0) {
            k0Var = PlaceholderDefaults.f37155a.mo42031b();
        }
        if ((i & 4) != 0) {
            f = 0.6f;
        }
        return m64455c(aVar, j, k0Var, f);
    }
}
