package androidx.navigation.compose;

import androidx.compose.p004ui.window.C16541b;
import androidx.compose.p004ui.window.SecureFlagPolicy;
import androidx.compose.runtime.C8592o;
import androidx.navigation.C19695c0;
import androidx.navigation.C19753h;
import androidx.navigation.NavBackStackEntry;
import androidx.navigation.NavDeepLink;
import androidx.navigation.NavGraph;
import androidx.navigation.compose.C19710b;
import androidx.navigation.compose.C19714d;
import java.util.List;
import kotlin.C11079d2;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.functions.C11305q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

/* renamed from: androidx.navigation.compose.e */
public final class C19717e {
    /* renamed from: a */
    public static final void m91747a(@C12579k C19695c0 c0Var, @C12579k String str, @C12579k List<C19753h> list, @C12579k List<NavDeepLink> list2, @C12579k C11305q<? super NavBackStackEntry, ? super C8592o, ? super Integer, C11079d2> qVar) {
        Intrinsics.checkNotNullParameter(c0Var, "<this>");
        Intrinsics.checkNotNullParameter(str, "route");
        Intrinsics.checkNotNullParameter(list, "arguments");
        Intrinsics.checkNotNullParameter(list2, "deepLinks");
        Intrinsics.checkNotNullParameter(qVar, "content");
        C19710b.C19712b bVar = new C19710b.C19712b((C19710b) c0Var.mo58346n().mo58561e(C19710b.class), qVar);
        bVar.mo58234B0(str);
        for (C19753h hVar : list) {
            bVar.mo58239h(hVar.mo58428a(), hVar.mo58429b());
        }
        for (NavDeepLink i : list2) {
            bVar.mo58241i(i);
        }
        c0Var.mo58343k(bVar);
    }

    /* renamed from: b */
    public static /* synthetic */ void m91748b(C19695c0 c0Var, String str, List list, List list2, C11305q qVar, int i, Object obj) {
        if ((i & 2) != 0) {
            list = CollectionsKt__CollectionsKt.m40441E();
        }
        if ((i & 4) != 0) {
            list2 = CollectionsKt__CollectionsKt.m40441E();
        }
        m91747a(c0Var, str, list, list2, qVar);
    }

    /* renamed from: c */
    public static final void m91749c(@C12579k C19695c0 c0Var, @C12579k String str, @C12579k List<C19753h> list, @C12579k List<NavDeepLink> list2, @C12579k C16541b bVar, @C12579k C11305q<? super NavBackStackEntry, ? super C8592o, ? super Integer, C11079d2> qVar) {
        Intrinsics.checkNotNullParameter(c0Var, "<this>");
        Intrinsics.checkNotNullParameter(str, "route");
        Intrinsics.checkNotNullParameter(list, "arguments");
        Intrinsics.checkNotNullParameter(list2, "deepLinks");
        Intrinsics.checkNotNullParameter(bVar, "dialogProperties");
        Intrinsics.checkNotNullParameter(qVar, "content");
        C19714d.C19716b bVar2 = new C19714d.C19716b((C19714d) c0Var.mo58346n().mo58561e(C19714d.class), bVar, qVar);
        bVar2.mo58234B0(str);
        for (C19753h hVar : list) {
            bVar2.mo58239h(hVar.mo58428a(), hVar.mo58429b());
        }
        for (NavDeepLink i : list2) {
            bVar2.mo58241i(i);
        }
        c0Var.mo58343k(bVar2);
    }

    /* renamed from: d */
    public static /* synthetic */ void m91750d(C19695c0 c0Var, String str, List list, List list2, C16541b bVar, C11305q qVar, int i, Object obj) {
        List list3;
        List list4;
        C16541b bVar2;
        if ((i & 2) != 0) {
            list3 = CollectionsKt__CollectionsKt.m40441E();
        } else {
            list3 = list;
        }
        if ((i & 4) != 0) {
            list4 = CollectionsKt__CollectionsKt.m40441E();
        } else {
            list4 = list2;
        }
        if ((i & 8) != 0) {
            bVar2 = new C16541b(false, false, (SecureFlagPolicy) null, 7, (DefaultConstructorMarker) null);
        } else {
            bVar2 = bVar;
        }
        m91749c(c0Var, str, list3, list4, bVar2, qVar);
    }

    /* renamed from: e */
    public static final void m91751e(@C12579k C19695c0 c0Var, @C12579k String str, @C12579k String str2, @C12579k List<C19753h> list, @C12579k List<NavDeepLink> list2, @C12579k C11300l<? super C19695c0, C11079d2> lVar) {
        Intrinsics.checkNotNullParameter(c0Var, "<this>");
        Intrinsics.checkNotNullParameter(str, "startDestination");
        Intrinsics.checkNotNullParameter(str2, "route");
        Intrinsics.checkNotNullParameter(list, "arguments");
        Intrinsics.checkNotNullParameter(list2, "deepLinks");
        Intrinsics.checkNotNullParameter(lVar, "builder");
        C19695c0 c0Var2 = new C19695c0(c0Var.mo58346n(), str, str2);
        lVar.invoke(c0Var2);
        NavGraph l = c0Var2.mo58331c();
        for (C19753h hVar : list) {
            l.mo58239h(hVar.mo58428a(), hVar.mo58429b());
        }
        for (NavDeepLink i : list2) {
            l.mo58241i(i);
        }
        c0Var.mo58343k(l);
    }

    /* renamed from: f */
    public static /* synthetic */ void m91752f(C19695c0 c0Var, String str, String str2, List list, List list2, C11300l lVar, int i, Object obj) {
        if ((i & 4) != 0) {
            list = CollectionsKt__CollectionsKt.m40441E();
        }
        List list3 = list;
        if ((i & 8) != 0) {
            list2 = CollectionsKt__CollectionsKt.m40441E();
        }
        m91751e(c0Var, str, str2, list3, list2, lVar);
    }
}
