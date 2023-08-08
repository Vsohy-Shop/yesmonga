package androidx.compose.p004ui.text.platform;

import android.graphics.Typeface;
import androidx.compose.runtime.C8578k2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

/* renamed from: androidx.compose.ui.text.platform.a0 */
public final class C16364a0 {
    @C12579k

    /* renamed from: a */
    public final C8578k2<Object> f40621a;
    @C12580l

    /* renamed from: b */
    public final C16364a0 f40622b;
    @C12579k

    /* renamed from: c */
    public final Object f40623c;

    public C16364a0(@C12579k C8578k2<? extends Object> k2Var, @C12580l C16364a0 a0Var) {
        Intrinsics.checkNotNullParameter(k2Var, "resolveResult");
        this.f40621a = k2Var;
        this.f40622b = a0Var;
        this.f40623c = k2Var.getValue();
    }

    @C12579k
    /* renamed from: a */
    public final Object mo47531a() {
        return this.f40623c;
    }

    @C12579k
    /* renamed from: b */
    public final Typeface mo47532b() {
        Object obj = this.f40623c;
        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type android.graphics.Typeface");
        return (Typeface) obj;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x000a, code lost:
        r0 = r2.f40622b;
     */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo47533c() {
        /*
            r2 = this;
            androidx.compose.runtime.k2<java.lang.Object> r0 = r2.f40621a
            java.lang.Object r0 = r0.getValue()
            java.lang.Object r1 = r2.f40623c
            if (r0 != r1) goto L_0x0017
            androidx.compose.ui.text.platform.a0 r0 = r2.f40622b
            if (r0 == 0) goto L_0x0015
            boolean r0 = r0.mo47533c()
            if (r0 == 0) goto L_0x0015
            goto L_0x0017
        L_0x0015:
            r0 = 0
            goto L_0x0018
        L_0x0017:
            r0 = 1
        L_0x0018:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.p004ui.text.platform.C16364a0.mo47533c():boolean");
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C16364a0(C8578k2 k2Var, C16364a0 a0Var, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(k2Var, (i & 2) != 0 ? null : a0Var);
    }
}
