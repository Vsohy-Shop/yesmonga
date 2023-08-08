package androidx.compose.foundation.layout;

import androidx.compose.p004ui.unit.C16479d;
import androidx.compose.p004ui.unit.C16483g;
import androidx.compose.p004ui.unit.LayoutDirection;
import androidx.compose.runtime.C8585m0;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C8585m0
@C11363r0({"SMAP\nWindowInsets.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WindowInsets.kt\nandroidx/compose/foundation/layout/FixedDpInsets\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,674:1\n1#2:675\n*E\n"})
/* renamed from: androidx.compose.foundation.layout.q */
public final class C2399q implements C2354e1 {

    /* renamed from: b */
    public final float f6312b;

    /* renamed from: c */
    public final float f6313c;

    /* renamed from: d */
    public final float f6314d;

    /* renamed from: e */
    public final float f6315e;

    public /* synthetic */ C2399q(float f, float f2, float f3, float f4, DefaultConstructorMarker defaultConstructorMarker) {
        this(f, f2, f3, f4);
    }

    /* renamed from: a */
    public int mo7984a(@C12579k C16479d dVar) {
        Intrinsics.checkNotNullParameter(dVar, "density");
        return dVar.mo7429n2(this.f6313c);
    }

    /* renamed from: b */
    public int mo7985b(@C12579k C16479d dVar, @C12579k LayoutDirection layoutDirection) {
        Intrinsics.checkNotNullParameter(dVar, "density");
        Intrinsics.checkNotNullParameter(layoutDirection, "layoutDirection");
        return dVar.mo7429n2(this.f6314d);
    }

    /* renamed from: c */
    public int mo7986c(@C12579k C16479d dVar) {
        Intrinsics.checkNotNullParameter(dVar, "density");
        return dVar.mo7429n2(this.f6315e);
    }

    /* renamed from: d */
    public int mo7987d(@C12579k C16479d dVar, @C12579k LayoutDirection layoutDirection) {
        Intrinsics.checkNotNullParameter(dVar, "density");
        Intrinsics.checkNotNullParameter(layoutDirection, "layoutDirection");
        return dVar.mo7429n2(this.f6312b);
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2399q)) {
            return false;
        }
        C2399q qVar = (C2399q) obj;
        if (!C16483g.m74440e0(this.f6312b, qVar.f6312b) || !C16483g.m74440e0(this.f6313c, qVar.f6313c) || !C16483g.m74440e0(this.f6314d, qVar.f6314d) || !C16483g.m74440e0(this.f6315e, qVar.f6315e)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return (((((C16483g.m74442h0(this.f6312b) * 31) + C16483g.m74442h0(this.f6313c)) * 31) + C16483g.m74442h0(this.f6314d)) * 31) + C16483g.m74442h0(this.f6315e);
    }

    @C12579k
    public String toString() {
        return "Insets(left=" + C16483g.m74447o0(this.f6312b) + ", top=" + C16483g.m74447o0(this.f6313c) + ", right=" + C16483g.m74447o0(this.f6314d) + ", bottom=" + C16483g.m74447o0(this.f6315e) + ')';
    }

    public C2399q(float f, float f2, float f3, float f4) {
        this.f6312b = f;
        this.f6313c = f2;
        this.f6314d = f3;
        this.f6315e = f4;
    }
}
