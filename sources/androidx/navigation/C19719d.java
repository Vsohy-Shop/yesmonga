package androidx.navigation;

import androidx.annotation.C0329d0;
import kotlin.C11079d2;
import kotlin.C11395k;
import kotlin.C11587t0;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

/* renamed from: androidx.navigation.d */
public final class C19719d {
    @C11395k(message = "Use routes to build your ActivityDestination instead", replaceWith = @C11587t0(expression = "activity(route = id.toString()) { builder.invoke() }", imports = {}))
    /* renamed from: a */
    public static final void m91753a(@C12579k C19695c0 c0Var, @C0329d0 int i, @C12579k C11300l<? super C19694c, C11079d2> lVar) {
        Intrinsics.checkNotNullParameter(c0Var, "<this>");
        Intrinsics.checkNotNullParameter(lVar, "builder");
        C19694c cVar = new C19694c((ActivityNavigator) c0Var.mo58346n().mo58561e(ActivityNavigator.class), i);
        lVar.invoke(cVar);
        c0Var.mo58345m(cVar);
    }

    /* renamed from: b */
    public static final void m91754b(@C12579k C19695c0 c0Var, @C12579k String str, @C12579k C11300l<? super C19694c, C11079d2> lVar) {
        Intrinsics.checkNotNullParameter(c0Var, "<this>");
        Intrinsics.checkNotNullParameter(str, "route");
        Intrinsics.checkNotNullParameter(lVar, "builder");
        C19694c cVar = new C19694c((ActivityNavigator) c0Var.mo58346n().mo58561e(ActivityNavigator.class), str);
        lVar.invoke(cVar);
        c0Var.mo58345m(cVar);
    }
}
