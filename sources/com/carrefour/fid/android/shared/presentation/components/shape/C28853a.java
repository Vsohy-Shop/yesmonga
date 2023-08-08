package com.carrefour.fid.android.shared.presentation.components.shape;

import androidx.compose.p004ui.geometry.C15096g;
import androidx.compose.p004ui.geometry.C15100j;
import androidx.compose.p004ui.geometry.C15104m;
import androidx.compose.p004ui.geometry.C15106n;
import androidx.compose.p004ui.graphics.C15174d3;
import androidx.compose.p004ui.graphics.C15218g4;
import androidx.compose.p004ui.graphics.C15231i3;
import androidx.compose.p004ui.graphics.C15318t0;
import androidx.compose.p004ui.unit.C16479d;
import androidx.compose.p004ui.unit.C16483g;
import androidx.compose.p004ui.unit.LayoutDirection;
import androidx.compose.runtime.internal.C8567o;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.math.C11409d;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C8567o(parameters = 0)
@C11363r0({"SMAP\nDottedShape.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DottedShape.kt\ncom/carrefour/fid/android/shared/presentation/components/shape/DottedShape\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,37:1\n1#2:38\n*E\n"})
/* renamed from: com.carrefour.fid.android.shared.presentation.components.shape.a */
public final class C28853a implements C15218g4 {

    /* renamed from: b */
    public static final int f70677b = 0;

    /* renamed from: a */
    public final float f70678a;

    public /* synthetic */ C28853a(float f, DefaultConstructorMarker defaultConstructorMarker) {
        this(f);
    }

    /* renamed from: d */
    public static /* synthetic */ C28853a m119334d(C28853a aVar, float f, int i, Object obj) {
        if ((i & 1) != 0) {
            f = aVar.f70678a;
        }
        return aVar.mo83968c(f);
    }

    /* renamed from: b */
    public final float mo83967b() {
        return this.f70678a;
    }

    @C12579k
    /* renamed from: c */
    public final C28853a mo83968c(float f) {
        return new C28853a(f, (DefaultConstructorMarker) null);
    }

    @C12579k
    /* renamed from: e */
    public C15174d3.C15175a mo7615a(long j, @C12579k LayoutDirection layoutDirection, @C12579k C16479d dVar) {
        Intrinsics.checkNotNullParameter(layoutDirection, "layoutDirection");
        Intrinsics.checkNotNullParameter(dVar, "density");
        C15231i3 a = C15318t0.m66550a();
        int L0 = C11409d.m43851L0(C15104m.m65023t(j) / dVar.mo7425g5(this.f70678a));
        float t = C15104m.m65023t(j) / ((float) L0);
        long a2 = C15106n.m65033a(t / ((float) 2), C15104m.m65016m(j));
        for (int i = 0; i < L0; i++) {
            a.mo42814o(C15100j.m64956c(C15096g.m64898a(((float) i) * t, 0.0f), a2));
        }
        a.close();
        return new C15174d3.C15175a(a);
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C28853a) && C16483g.m74440e0(this.f70678a, ((C28853a) obj).f70678a);
    }

    /* renamed from: f */
    public final float mo83971f() {
        return this.f70678a;
    }

    public int hashCode() {
        return C16483g.m74442h0(this.f70678a);
    }

    @C12579k
    public String toString() {
        String o0 = C16483g.m74447o0(this.f70678a);
        return "DottedShape(step=" + o0 + ")";
    }

    public C28853a(float f) {
        this.f70678a = f;
    }
}
