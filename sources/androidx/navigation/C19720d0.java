package androidx.navigation;

import androidx.annotation.C0329d0;
import kotlin.C11079d2;
import kotlin.C11395k;
import kotlin.C11587t0;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

/* renamed from: androidx.navigation.d0 */
public final class C19720d0 {
    @C11395k(message = "Use routes to build your NavGraph instead", replaceWith = @C11587t0(expression = "navigation(startDestination = startDestination.toString(), route = id.toString()) { builder.invoke() }", imports = {}))
    @C12579k
    /* renamed from: a */
    public static final NavGraph m91755a(@C12579k C19795r0 r0Var, @C0329d0 int i, @C0329d0 int i2, @C12579k C11300l<? super C19695c0, C11079d2> lVar) {
        Intrinsics.checkNotNullParameter(r0Var, "<this>");
        Intrinsics.checkNotNullParameter(lVar, "builder");
        C19695c0 c0Var = new C19695c0(r0Var, i, i2);
        lVar.invoke(c0Var);
        return c0Var.mo58331c();
    }

    @C12579k
    /* renamed from: b */
    public static final NavGraph m91756b(@C12579k C19795r0 r0Var, @C12579k String str, @C12580l String str2, @C12579k C11300l<? super C19695c0, C11079d2> lVar) {
        Intrinsics.checkNotNullParameter(r0Var, "<this>");
        Intrinsics.checkNotNullParameter(str, "startDestination");
        Intrinsics.checkNotNullParameter(lVar, "builder");
        C19695c0 c0Var = new C19695c0(r0Var, str, str2);
        lVar.invoke(c0Var);
        return c0Var.mo58331c();
    }

    @C11395k(message = "Use routes to build your nested NavGraph instead", replaceWith = @C11587t0(expression = "navigation(startDestination = startDestination.toString(), route = id.toString()) { builder.invoke() }", imports = {}))
    /* renamed from: c */
    public static final void m91757c(@C12579k C19695c0 c0Var, @C0329d0 int i, @C0329d0 int i2, @C12579k C11300l<? super C19695c0, C11079d2> lVar) {
        Intrinsics.checkNotNullParameter(c0Var, "<this>");
        Intrinsics.checkNotNullParameter(lVar, "builder");
        C19695c0 c0Var2 = new C19695c0(c0Var.mo58346n(), i, i2);
        lVar.invoke(c0Var2);
        c0Var.mo58345m(c0Var2);
    }

    /* renamed from: d */
    public static final void m91758d(@C12579k C19695c0 c0Var, @C12579k String str, @C12579k String str2, @C12579k C11300l<? super C19695c0, C11079d2> lVar) {
        Intrinsics.checkNotNullParameter(c0Var, "<this>");
        Intrinsics.checkNotNullParameter(str, "startDestination");
        Intrinsics.checkNotNullParameter(str2, "route");
        Intrinsics.checkNotNullParameter(lVar, "builder");
        C19695c0 c0Var2 = new C19695c0(c0Var.mo58346n(), str, str2);
        lVar.invoke(c0Var2);
        c0Var.mo58345m(c0Var2);
    }

    /* renamed from: e */
    public static /* synthetic */ NavGraph m91759e(C19795r0 r0Var, int i, int i2, C11300l lVar, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = 0;
        }
        Intrinsics.checkNotNullParameter(r0Var, "<this>");
        Intrinsics.checkNotNullParameter(lVar, "builder");
        C19695c0 c0Var = new C19695c0(r0Var, i, i2);
        lVar.invoke(c0Var);
        return c0Var.mo58331c();
    }

    /* renamed from: f */
    public static /* synthetic */ NavGraph m91760f(C19795r0 r0Var, String str, String str2, C11300l lVar, int i, Object obj) {
        if ((i & 2) != 0) {
            str2 = null;
        }
        Intrinsics.checkNotNullParameter(r0Var, "<this>");
        Intrinsics.checkNotNullParameter(str, "startDestination");
        Intrinsics.checkNotNullParameter(lVar, "builder");
        C19695c0 c0Var = new C19695c0(r0Var, str, str2);
        lVar.invoke(c0Var);
        return c0Var.mo58331c();
    }
}
