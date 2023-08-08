package androidx.compose.foundation.shape;

import androidx.compose.p004ui.geometry.C15104m;
import androidx.compose.p004ui.geometry.C15106n;
import androidx.compose.p004ui.graphics.C15174d3;
import androidx.compose.p004ui.graphics.C15231i3;
import androidx.compose.p004ui.graphics.C15318t0;
import androidx.compose.p004ui.unit.LayoutDirection;
import androidx.compose.runtime.internal.C8567o;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C8567o(parameters = 0)
/* renamed from: androidx.compose.foundation.shape.a */
public final class C2679a extends C2683e {

    /* renamed from: f */
    public static final int f7042f = 0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C2679a(@C12579k C2684f fVar, @C12579k C2684f fVar2, @C12579k C2684f fVar3, @C12579k C2684f fVar4) {
        super(fVar, fVar2, fVar3, fVar4);
        Intrinsics.checkNotNullParameter(fVar, "topLeft");
        Intrinsics.checkNotNullParameter(fVar2, "topRight");
        Intrinsics.checkNotNullParameter(fVar3, "bottomRight");
        Intrinsics.checkNotNullParameter(fVar4, "bottomLeft");
    }

    @C12579k
    /* renamed from: e */
    public C15174d3 mo9158e(long j, float f, float f2, float f3, float f4, @C12579k LayoutDirection layoutDirection) {
        boolean z;
        Intrinsics.checkNotNullParameter(layoutDirection, "layoutDirection");
        if (f + f2 + f4 + f3 == 0.0f) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return new C15174d3.C15176b(C15106n.m65045m(j));
        }
        C15231i3 a = C15318t0.m66550a();
        a.mo42815p(0.0f, f);
        a.mo42823w(f, 0.0f);
        a.mo42823w(C15104m.m65023t(j) - f2, 0.0f);
        a.mo42823w(C15104m.m65023t(j), f2);
        a.mo42823w(C15104m.m65023t(j), C15104m.m65016m(j) - f3);
        a.mo42823w(C15104m.m65023t(j) - f3, C15104m.m65016m(j));
        a.mo42823w(f4, C15104m.m65016m(j));
        a.mo42823w(0.0f, C15104m.m65016m(j) - f4);
        a.close();
        return new C15174d3.C15175a(a);
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2679a)) {
            return false;
        }
        C2679a aVar = (C2679a) obj;
        if (Intrinsics.areEqual((Object) mo9172i(), (Object) aVar.mo9172i()) && Intrinsics.areEqual((Object) mo9171h(), (Object) aVar.mo9171h()) && Intrinsics.areEqual((Object) mo9169f(), (Object) aVar.mo9169f()) && Intrinsics.areEqual((Object) mo9170g(), (Object) aVar.mo9170g())) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (((((mo9172i().hashCode() * 31) + mo9171h().hashCode()) * 31) + mo9169f().hashCode()) * 31) + mo9170g().hashCode();
    }

    @C12579k
    /* renamed from: j */
    public C2679a mo9157c(@C12579k C2684f fVar, @C12579k C2684f fVar2, @C12579k C2684f fVar3, @C12579k C2684f fVar4) {
        Intrinsics.checkNotNullParameter(fVar, "topStart");
        Intrinsics.checkNotNullParameter(fVar2, "topEnd");
        Intrinsics.checkNotNullParameter(fVar3, "bottomEnd");
        Intrinsics.checkNotNullParameter(fVar4, "bottomStart");
        return new C2679a(fVar, fVar2, fVar3, fVar4);
    }

    @C12579k
    public String toString() {
        return "AbsoluteCutCornerShape(topLeft = " + mo9172i() + ", topRight = " + mo9171h() + ", bottomRight = " + mo9169f() + ", bottomLeft = " + mo9170g() + ')';
    }
}
