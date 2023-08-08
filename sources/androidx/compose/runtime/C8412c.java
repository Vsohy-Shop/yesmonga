package androidx.compose.runtime;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

/* renamed from: androidx.compose.runtime.c */
public final class C8412c {

    /* renamed from: a */
    public int f22763a;

    public C8412c(int i) {
        this.f22763a = i;
    }

    /* renamed from: a */
    public final int mo15338a() {
        return this.f22763a;
    }

    /* renamed from: b */
    public final boolean mo15339b() {
        return this.f22763a != Integer.MIN_VALUE;
    }

    /* renamed from: c */
    public final void mo15340c(int i) {
        this.f22763a = i;
    }

    /* renamed from: d */
    public final int mo15341d(@C12579k C8692w1 w1Var) {
        Intrinsics.checkNotNullParameter(w1Var, "slots");
        return w1Var.mo16848X(this);
    }

    /* renamed from: e */
    public final int mo15342e(@C12579k C8701z1 z1Var) {
        Intrinsics.checkNotNullParameter(z1Var, "writer");
        return z1Var.mo16898D(this);
    }
}
