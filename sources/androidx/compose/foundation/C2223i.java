package androidx.compose.foundation;

import androidx.compose.p004ui.graphics.C15421z1;
import androidx.compose.p004ui.unit.C16483g;
import androidx.compose.runtime.C8585m0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C8585m0
/* renamed from: androidx.compose.foundation.i */
public final class C2223i {

    /* renamed from: c */
    public static final int f5974c = 0;

    /* renamed from: a */
    public final float f5975a;
    @C12579k

    /* renamed from: b */
    public final C15421z1 f5976b;

    public /* synthetic */ C2223i(float f, C15421z1 z1Var, DefaultConstructorMarker defaultConstructorMarker) {
        this(f, z1Var);
    }

    /* renamed from: b */
    public static /* synthetic */ C2223i m9659b(C2223i iVar, float f, C15421z1 z1Var, int i, Object obj) {
        if ((i & 1) != 0) {
            f = iVar.f5975a;
        }
        if ((i & 2) != 0) {
            z1Var = iVar.f5976b;
        }
        return iVar.mo7585a(f, z1Var);
    }

    @C12579k
    /* renamed from: a */
    public final C2223i mo7585a(float f, @C12579k C15421z1 z1Var) {
        Intrinsics.checkNotNullParameter(z1Var, "brush");
        return new C2223i(f, z1Var, (DefaultConstructorMarker) null);
    }

    @C12579k
    /* renamed from: c */
    public final C15421z1 mo7586c() {
        return this.f5976b;
    }

    /* renamed from: d */
    public final float mo7587d() {
        return this.f5975a;
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2223i)) {
            return false;
        }
        C2223i iVar = (C2223i) obj;
        if (C16483g.m74440e0(this.f5975a, iVar.f5975a) && Intrinsics.areEqual((Object) this.f5976b, (Object) iVar.f5976b)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (C16483g.m74442h0(this.f5975a) * 31) + this.f5976b.hashCode();
    }

    @C12579k
    public String toString() {
        return "BorderStroke(width=" + C16483g.m74447o0(this.f5975a) + ", brush=" + this.f5976b + ')';
    }

    public C2223i(float f, C15421z1 z1Var) {
        this.f5975a = f;
        this.f5976b = z1Var;
    }
}
