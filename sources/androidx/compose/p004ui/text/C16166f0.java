package androidx.compose.p004ui.text;

import androidx.compose.p004ui.text.caches.C16153b;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

/* renamed from: androidx.compose.ui.text.f0 */
public final class C16166f0 {
    @C12579k

    /* renamed from: a */
    public final C16153b<C16162e, C16260h0> f40198a;

    public C16166f0() {
        this(0, 1, (DefaultConstructorMarker) null);
    }

    @C12580l
    /* renamed from: a */
    public final C16260h0 mo46751a(@C12579k C16258g0 g0Var) {
        Intrinsics.checkNotNullParameter(g0Var, "key");
        C16260h0 g = this.f40198a.mo46628g(new C16162e(g0Var));
        if (g != null && !g.mo47069w().mo47407i().mo46229c()) {
            return g;
        }
        return null;
    }

    @C12580l
    /* renamed from: b */
    public final C16260h0 mo46752b(@C12579k C16258g0 g0Var, @C12579k C16260h0 h0Var) {
        Intrinsics.checkNotNullParameter(g0Var, "key");
        Intrinsics.checkNotNullParameter(h0Var, "value");
        return this.f40198a.mo46632k(new C16162e(g0Var), h0Var);
    }

    @C12580l
    /* renamed from: c */
    public final C16260h0 mo46753c(@C12579k C16258g0 g0Var) {
        Intrinsics.checkNotNullParameter(g0Var, "key");
        return this.f40198a.mo46634m(new C16162e(g0Var));
    }

    public C16166f0(int i) {
        this.f40198a = new C16153b<>(i);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C16166f0(int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? C16350k0.m73677a() : i);
    }
}
