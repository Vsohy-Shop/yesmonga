package androidx.compose.animation.core;

import androidx.compose.runtime.C8585m0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C8585m0
/* renamed from: androidx.compose.animation.core.r0 */
public final class C2006r0<T> implements C2020y<T> {

    /* renamed from: b */
    public static final int f5595b = 0;

    /* renamed from: a */
    public final int f5596a;

    public C2006r0() {
        this(0, 1, (DefaultConstructorMarker) null);
    }

    public boolean equals(@C12580l Object obj) {
        if (!(obj instanceof C2006r0) || ((C2006r0) obj).f5596a != this.f5596a) {
            return false;
        }
        return true;
    }

    /* renamed from: h */
    public final int mo6974h() {
        return this.f5596a;
    }

    public int hashCode() {
        return this.f5596a;
    }

    public C2006r0(int i) {
        this.f5596a = i;
    }

    @C12579k
    /* renamed from: a */
    public <V extends C1997o> C1966f1<V> m8606a(@C12579k C1945a1<T, V> a1Var) {
        Intrinsics.checkNotNullParameter(a1Var, "converter");
        return new C1993m1(this.f5596a);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C2006r0(int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 0 : i);
    }
}
