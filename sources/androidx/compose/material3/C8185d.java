package androidx.compose.material3;

import androidx.compose.foundation.layout.C2366i0;
import androidx.compose.p004ui.unit.C16483g;
import androidx.compose.p004ui.unit.LayoutDirection;
import androidx.compose.runtime.C8547h2;
import androidx.compose.runtime.C8578k2;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

@C8547h2
@C11363r0({"SMAP\nSearchBar.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SearchBar.kt\nandroidx/compose/material3/AnimatedPaddingValues\n+ 2 Dp.kt\nandroidx/compose/ui/unit/Dp\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,746:1\n88#2:747\n88#2:748\n154#3:749\n154#3:750\n*S KotlinDebug\n*F\n+ 1 SearchBar.kt\nandroidx/compose/material3/AnimatedPaddingValues\n*L\n674#1:747\n675#1:748\n677#1:749\n678#1:750\n*E\n"})
/* renamed from: androidx.compose.material3.d */
public final class C8185d implements C2366i0 {
    @C12579k

    /* renamed from: a */
    public final C8578k2<Float> f20042a;
    @C12579k

    /* renamed from: b */
    public final C8578k2<C16483g> f20043b;

    public C8185d(@C12579k C8578k2<Float> k2Var, @C12579k C8578k2<C16483g> k2Var2) {
        Intrinsics.checkNotNullParameter(k2Var, "animationProgress");
        Intrinsics.checkNotNullParameter(k2Var2, "topPadding");
        this.f20042a = k2Var;
        this.f20043b = k2Var2;
    }

    /* renamed from: a */
    public float mo8090a() {
        return C16483g.m74435M(SearchBarKt.m26103o() * this.f20042a.getValue().floatValue());
    }

    /* renamed from: b */
    public float mo8091b(@C12579k LayoutDirection layoutDirection) {
        Intrinsics.checkNotNullParameter(layoutDirection, "layoutDirection");
        return C16483g.m74435M((float) 0);
    }

    /* renamed from: c */
    public float mo8092c(@C12579k LayoutDirection layoutDirection) {
        Intrinsics.checkNotNullParameter(layoutDirection, "layoutDirection");
        return C16483g.m74435M((float) 0);
    }

    /* renamed from: d */
    public float mo8093d() {
        return C16483g.m74435M(this.f20043b.getValue().mo47823t0() * this.f20042a.getValue().floatValue());
    }

    @C12579k
    /* renamed from: e */
    public final C8578k2<Float> mo12517e() {
        return this.f20042a;
    }

    @C12579k
    /* renamed from: f */
    public final C8578k2<C16483g> mo12518f() {
        return this.f20043b;
    }
}
