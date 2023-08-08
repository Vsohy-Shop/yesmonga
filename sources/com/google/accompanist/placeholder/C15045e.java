package com.google.accompanist.placeholder;

import androidx.compose.animation.core.C1984k0;
import androidx.compose.p004ui.geometry.C15096g;
import androidx.compose.p004ui.geometry.C15104m;
import androidx.compose.p004ui.graphics.C15240j2;
import androidx.compose.p004ui.graphics.C15421z1;
import androidx.compose.p004ui.util.C16515d;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.C11479u;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

/* renamed from: com.google.accompanist.placeholder.e */
public final class C15045e implements C15037b {

    /* renamed from: b */
    public final long f37169b;
    @C12579k

    /* renamed from: c */
    public final C1984k0<Float> f37170c;

    /* renamed from: d */
    public final float f37171d;

    public /* synthetic */ C15045e(long j, C1984k0 k0Var, float f, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, k0Var, f);
    }

    /* renamed from: h */
    public static /* synthetic */ C15045e m64457h(C15045e eVar, long j, C1984k0<Float> k0Var, float f, int i, Object obj) {
        if ((i & 1) != 0) {
            j = eVar.f37169b;
        }
        if ((i & 2) != 0) {
            k0Var = eVar.mo42040b();
        }
        if ((i & 4) != 0) {
            f = eVar.f37171d;
        }
        return eVar.mo42052g(j, k0Var, f);
    }

    @C12579k
    /* renamed from: a */
    public C15421z1 mo42039a(float f, long j) {
        return C15421z1.C15422a.m67316k(C15421z1.f38108b, CollectionsKt__CollectionsKt.m40448L(C15240j2.m66071n(C15240j2.m66080w(this.f37169b, 0.0f, 0.0f, 0.0f, 0.0f, 14, (Object) null)), C15240j2.m66071n(this.f37169b), C15240j2.m66071n(C15240j2.m66080w(this.f37169b, 0.0f, 0.0f, 0.0f, 0.0f, 14, (Object) null))), C15096g.m64898a(0.0f, 0.0f), C11479u.m44444t(Math.max(C15104m.m65023t(j), C15104m.m65016m(j)) * f * ((float) 2), 0.01f), 0, 8, (Object) null);
    }

    @C12579k
    /* renamed from: b */
    public C1984k0<Float> mo42040b() {
        return this.f37170c;
    }

    /* renamed from: c */
    public float mo42041c(float f) {
        float f2 = this.f37171d;
        if (f <= f2) {
            return C16515d.m74781a(0.0f, 1.0f, f / f2);
        }
        return C16515d.m74781a(1.0f, 0.0f, (f - f2) / (1.0f - f2));
    }

    /* renamed from: d */
    public final long mo42048d() {
        return this.f37169b;
    }

    @C12579k
    /* renamed from: e */
    public final C1984k0<Float> mo42049e() {
        return mo42040b();
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C15045e)) {
            return false;
        }
        C15045e eVar = (C15045e) obj;
        return C15240j2.m66082y(this.f37169b, eVar.f37169b) && Intrinsics.areEqual((Object) mo42040b(), (Object) eVar.mo42040b()) && Float.compare(this.f37171d, eVar.f37171d) == 0;
    }

    /* renamed from: f */
    public final float mo42051f() {
        return this.f37171d;
    }

    @C12579k
    /* renamed from: g */
    public final C15045e mo42052g(long j, @C12579k C1984k0<Float> k0Var, float f) {
        Intrinsics.checkNotNullParameter(k0Var, "animationSpec");
        return new C15045e(j, k0Var, f, (DefaultConstructorMarker) null);
    }

    public int hashCode() {
        return (((C15240j2.m66056K(this.f37169b) * 31) + mo42040b().hashCode()) * 31) + Float.hashCode(this.f37171d);
    }

    @C12579k
    public String toString() {
        return "Shimmer(highlightColor=" + C15240j2.m66057L(this.f37169b) + ", animationSpec=" + mo42040b() + ", progressForMaxAlpha=" + this.f37171d + ')';
    }

    public C15045e(long j, C1984k0<Float> k0Var, float f) {
        this.f37169b = j;
        this.f37170c = k0Var;
        this.f37171d = f;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C15045e(long j, C1984k0 k0Var, float f, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, k0Var, (i & 4) != 0 ? 0.6f : f, (DefaultConstructorMarker) null);
    }
}
