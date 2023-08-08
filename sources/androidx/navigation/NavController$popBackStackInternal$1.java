package androidx.navigation;

import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22515d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, mo22516d2 = {"Landroidx/navigation/NavBackStackEntry;", "it", "Lkotlin/d2;", "a", "(Landroidx/navigation/NavBackStackEntry;)V"}, mo22517k = 3, mo22518mv = {1, 6, 0})
public final class NavController$popBackStackInternal$1 extends Lambda implements C11300l<NavBackStackEntry, C11079d2> {

    /* renamed from: f */
    public static final NavController$popBackStackInternal$1 f50416f = new NavController$popBackStackInternal$1();

    public NavController$popBackStackInternal$1() {
        super(1);
    }

    /* renamed from: a */
    public final void mo58185a(@C12579k NavBackStackEntry navBackStackEntry) {
        Intrinsics.checkNotNullParameter(navBackStackEntry, "it");
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        mo58185a((NavBackStackEntry) obj);
        return C11079d2.f28267a;
    }
}
