package androidx.compose.foundation.shape;

import androidx.compose.p004ui.geometry.C15090b;
import androidx.compose.p004ui.geometry.C15098i;
import androidx.compose.p004ui.geometry.C15103l;
import androidx.compose.p004ui.geometry.C15106n;
import androidx.compose.p004ui.graphics.C15174d3;
import androidx.compose.p004ui.unit.LayoutDirection;
import androidx.compose.runtime.internal.C8567o;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C8567o(parameters = 0)
/* renamed from: androidx.compose.foundation.shape.n */
public final class C2693n extends C2683e {

    /* renamed from: f */
    public static final int f7056f = 0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C2693n(@C12579k C2684f fVar, @C12579k C2684f fVar2, @C12579k C2684f fVar3, @C12579k C2684f fVar4) {
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
        float f7;
        float f8;
        LayoutDirection layoutDirection2 = layoutDirection;
        Intrinsics.checkNotNullParameter(layoutDirection2, "layoutDirection");
        if (f + f2 + f3 + f4 == 0.0f) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return new C15174d3.C15176b(C15106n.m65045m(j));
        }
        C15098i m = C15106n.m65045m(j);
        LayoutDirection layoutDirection3 = LayoutDirection.Ltr;
        if (layoutDirection2 == layoutDirection3) {
            f5 = f;
        } else {
            f5 = f2;
        }
        long b = C15090b.m64846b(f5, 0.0f, 2, (Object) null);
        if (layoutDirection2 == layoutDirection3) {
            f6 = f2;
        } else {
            f6 = f;
        }
        long b2 = C15090b.m64846b(f6, 0.0f, 2, (Object) null);
        if (layoutDirection2 == layoutDirection3) {
            f7 = f3;
        } else {
            f7 = f4;
        }
        long b3 = C15090b.m64846b(f7, 0.0f, 2, (Object) null);
        if (layoutDirection2 == layoutDirection3) {
            f8 = f4;
        } else {
            f8 = f3;
        }
        return new C15174d3.C15177c(C15103l.m64987c(m, b, b2, b3, C15090b.m64846b(f8, 0.0f, 2, (Object) null)));
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2693n)) {
            return false;
        }
        C2693n nVar = (C2693n) obj;
        if (Intrinsics.areEqual((Object) mo9172i(), (Object) nVar.mo9172i()) && Intrinsics.areEqual((Object) mo9171h(), (Object) nVar.mo9171h()) && Intrinsics.areEqual((Object) mo9169f(), (Object) nVar.mo9169f()) && Intrinsics.areEqual((Object) mo9170g(), (Object) nVar.mo9170g())) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (((((mo9172i().hashCode() * 31) + mo9171h().hashCode()) * 31) + mo9169f().hashCode()) * 31) + mo9170g().hashCode();
    }

    @C12579k
    /* renamed from: j */
    public C2693n mo9157c(@C12579k C2684f fVar, @C12579k C2684f fVar2, @C12579k C2684f fVar3, @C12579k C2684f fVar4) {
        Intrinsics.checkNotNullParameter(fVar, "topStart");
        Intrinsics.checkNotNullParameter(fVar2, "topEnd");
        Intrinsics.checkNotNullParameter(fVar3, "bottomEnd");
        Intrinsics.checkNotNullParameter(fVar4, "bottomStart");
        return new C2693n(fVar, fVar2, fVar3, fVar4);
    }

    @C12579k
    public String toString() {
        return "RoundedCornerShape(topStart = " + mo9172i() + ", topEnd = " + mo9171h() + ", bottomEnd = " + mo9169f() + ", bottomStart = " + mo9170g() + ')';
    }
}
