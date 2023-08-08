package androidx.compose.foundation;

import androidx.compose.foundation.layout.C2366i0;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.p004ui.graphics.C15240j2;
import androidx.compose.p004ui.graphics.C15258l2;
import androidx.compose.runtime.C8547h2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C8547h2
@C2855v
/* renamed from: androidx.compose.foundation.j0 */
public final class C2251j0 {

    /* renamed from: c */
    public static final int f6004c = 0;

    /* renamed from: a */
    public final long f6005a;
    @C12579k

    /* renamed from: b */
    public final C2366i0 f6006b;

    public /* synthetic */ C2251j0(long j, C2366i0 i0Var, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, i0Var);
    }

    @C12579k
    /* renamed from: a */
    public final C2366i0 mo7610a() {
        return this.f6006b;
    }

    /* renamed from: b */
    public final long mo7611b() {
        return this.f6005a;
    }

    public boolean equals(@C12580l Object obj) {
        Class<?> cls;
        if (this == obj) {
            return true;
        }
        Class<C2251j0> cls2 = C2251j0.class;
        if (obj != null) {
            cls = obj.getClass();
        } else {
            cls = null;
        }
        if (!Intrinsics.areEqual((Object) cls2, (Object) cls)) {
            return false;
        }
        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type androidx.compose.foundation.OverscrollConfiguration");
        C2251j0 j0Var = (C2251j0) obj;
        if (C15240j2.m66082y(this.f6005a, j0Var.f6005a) && Intrinsics.areEqual((Object) this.f6006b, (Object) j0Var.f6006b)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (C15240j2.m66056K(this.f6005a) * 31) + this.f6006b.hashCode();
    }

    @C12579k
    public String toString() {
        return "OverscrollConfiguration(glowColor=" + C15240j2.m66057L(this.f6005a) + ", drawPadding=" + this.f6006b + ')';
    }

    public C2251j0(long j, C2366i0 i0Var) {
        this.f6005a = j;
        this.f6006b = i0Var;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C2251j0(long j, C2366i0 i0Var, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? C15258l2.m66179d(4284900966L) : j, (i & 2) != 0 ? PaddingKt.m10016c(0.0f, 0.0f, 3, (Object) null) : i0Var, (DefaultConstructorMarker) null);
    }
}
