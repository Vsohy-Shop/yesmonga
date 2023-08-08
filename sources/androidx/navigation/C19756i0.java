package androidx.navigation;

import androidx.annotation.C0329d0;
import kotlin.C11079d2;
import kotlin.C11395k;
import kotlin.C11587t0;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

/* renamed from: androidx.navigation.i0 */
public final class C19756i0 {
    @C11395k(message = "Use routes to create your NavGraph instead", replaceWith = @C11587t0(expression = "createGraph(startDestination = startDestination.toString(), route = id.toString()) { builder.invoke() }", imports = {}))
    @C12579k
    /* renamed from: a */
    public static final NavGraph m91860a(@C12579k C19752g0 g0Var, @C0329d0 int i, @C0329d0 int i2, @C12579k C11300l<? super C19695c0, C11079d2> lVar) {
        Intrinsics.checkNotNullParameter(g0Var, "<this>");
        Intrinsics.checkNotNullParameter(lVar, "builder");
        C19695c0 c0Var = new C19695c0(g0Var.mo58400k().mo58113N(), i, i2);
        lVar.invoke(c0Var);
        return c0Var.mo58331c();
    }

    @C12579k
    /* renamed from: b */
    public static final NavGraph m91861b(@C12579k C19752g0 g0Var, @C12579k String str, @C12580l String str2, @C12579k C11300l<? super C19695c0, C11079d2> lVar) {
        Intrinsics.checkNotNullParameter(g0Var, "<this>");
        Intrinsics.checkNotNullParameter(str, "startDestination");
        Intrinsics.checkNotNullParameter(lVar, "builder");
        C19695c0 c0Var = new C19695c0(g0Var.mo58400k().mo58113N(), str, str2);
        lVar.invoke(c0Var);
        return c0Var.mo58331c();
    }

    /* renamed from: c */
    public static /* synthetic */ NavGraph m91862c(C19752g0 g0Var, int i, int i2, C11300l lVar, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = 0;
        }
        Intrinsics.checkNotNullParameter(g0Var, "<this>");
        Intrinsics.checkNotNullParameter(lVar, "builder");
        C19695c0 c0Var = new C19695c0(g0Var.mo58400k().mo58113N(), i, i2);
        lVar.invoke(c0Var);
        return c0Var.mo58331c();
    }

    /* renamed from: d */
    public static /* synthetic */ NavGraph m91863d(C19752g0 g0Var, String str, String str2, C11300l lVar, int i, Object obj) {
        if ((i & 2) != 0) {
            str2 = null;
        }
        Intrinsics.checkNotNullParameter(g0Var, "<this>");
        Intrinsics.checkNotNullParameter(str, "startDestination");
        Intrinsics.checkNotNullParameter(lVar, "builder");
        C19695c0 c0Var = new C19695c0(g0Var.mo58400k().mo58113N(), str, str2);
        lVar.invoke(c0Var);
        return c0Var.mo58331c();
    }
}
