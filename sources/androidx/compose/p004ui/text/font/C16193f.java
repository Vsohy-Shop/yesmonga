package androidx.compose.p004ui.text.font;

import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.C11479u;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

/* renamed from: androidx.compose.ui.text.font.f */
public final class C16193f implements C16229p0 {

    /* renamed from: b */
    public final int f40256b;

    public C16193f(int i) {
        this.f40256b = i;
    }

    /* renamed from: g */
    public static /* synthetic */ C16193f m72960g(C16193f fVar, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = fVar.f40256b;
        }
        return fVar.mo46888f(i);
    }

    @C12579k
    /* renamed from: a */
    public C16209i0 mo46885a(@C12579k C16209i0 i0Var) {
        Intrinsics.checkNotNullParameter(i0Var, "fontWeight");
        int i = this.f40256b;
        if (i == 0 || i == Integer.MAX_VALUE) {
            return i0Var;
        }
        return new C16209i0(C11479u.m44334I(i0Var.mo46939t0() + this.f40256b, 1, 1000));
    }

    /* renamed from: e */
    public final int mo46886e() {
        return this.f40256b;
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C16193f) && this.f40256b == ((C16193f) obj).f40256b;
    }

    @C12579k
    /* renamed from: f */
    public final C16193f mo46888f(int i) {
        return new C16193f(i);
    }

    public int hashCode() {
        return Integer.hashCode(this.f40256b);
    }

    @C12579k
    public String toString() {
        return "AndroidFontResolveInterceptor(fontWeightAdjustment=" + this.f40256b + ')';
    }
}
