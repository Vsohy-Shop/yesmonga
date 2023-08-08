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
/* renamed from: androidx.compose.foundation.shape.h */
public final class C2687h extends C2683e {

    /* renamed from: f */
    public static final int f7050f = 0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C2687h(@C12579k C2684f fVar, @C12579k C2684f fVar2, @C12579k C2684f fVar3, @C12579k C2684f fVar4) {
        super(fVar, fVar2, fVar3, fVar4);
        Intrinsics.checkNotNullParameter(fVar, "topStart");
        Intrinsics.checkNotNullParameter(fVar2, "topEnd");
        Intrinsics.checkNotNullParameter(fVar3, "bottomEnd");
        Intrinsics.checkNotNullParameter(fVar4, "bottomStart");
    }

    @C12579k
    /* renamed from: e */
    public C15174d3 mo9158e(long j, float f, float f2, float f3, float f4, @C12579k LayoutDirection layoutDirection) {
        boolean z;
        float f5;
        float f6;
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
        LayoutDirection layoutDirection2 = LayoutDirection.Ltr;
        if (layoutDirection == layoutDirection2) {
            f5 = f;
        } else {
            f5 = f2;
        }
        a.mo42815p(0.0f, f5);
        a.mo42823w(f5, 0.0f);
        if (layoutDirection == layoutDirection2) {
            f = f2;
        }
        a.mo42823w(C15104m.m65023t(j) - f, 0.0f);
        a.mo42823w(C15104m.m65023t(j), f);
        if (layoutDirection == layoutDirection2) {
            f6 = f3;
        } else {
            f6 = f4;
        }
        a.mo42823w(C15104m.m65023t(j), C15104m.m65016m(j) - f6);
        a.mo42823w(C15104m.m65023t(j) - f6, C15104m.m65016m(j));
        if (layoutDirection == layoutDirection2) {
            f3 = f4;
        }
        a.mo42823w(f3, C15104m.m65016m(j));
        a.mo42823w(0.0f, C15104m.m65016m(j) - f3);
        a.close();
        return new C15174d3.C15175a(a);
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2687h)) {
            return false;
        }
        C2687h hVar = (C2687h) obj;
        if (Intrinsics.areEqual((Object) mo9172i(), (Object) hVar.mo9172i()) && Intrinsics.areEqual((Object) mo9171h(), (Object) hVar.mo9171h()) && Intrinsics.areEqual((Object) mo9169f(), (Object) hVar.mo9169f()) && Intrinsics.areEqual((Object) mo9170g(), (Object) hVar.mo9170g())) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (((((mo9172i().hashCode() * 31) + mo9171h().hashCode()) * 31) + mo9169f().hashCode()) * 31) + mo9170g().hashCode();
    }

    @C12579k
    /* renamed from: j */
    public C2687h mo9157c(@C12579k C2684f fVar, @C12579k C2684f fVar2, @C12579k C2684f fVar3, @C12579k C2684f fVar4) {
        Intrinsics.checkNotNullParameter(fVar, "topStart");
        Intrinsics.checkNotNullParameter(fVar2, "topEnd");
        Intrinsics.checkNotNullParameter(fVar3, "bottomEnd");
        Intrinsics.checkNotNullParameter(fVar4, "bottomStart");
        return new C2687h(fVar, fVar2, fVar3, fVar4);
    }

    @C12579k
    public String toString() {
        return "CutCornerShape(topStart = " + mo9172i() + ", topEnd = " + mo9171h() + ", bottomEnd = " + mo9169f() + ", bottomStart = " + mo9170g() + ')';
    }
}
