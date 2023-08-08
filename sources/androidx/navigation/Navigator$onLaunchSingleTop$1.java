package androidx.navigation;

import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22515d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003\"\b\b\u0000\u0010\u0001*\u00020\u0000*\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, mo22516d2 = {"Landroidx/navigation/NavDestination;", "D", "Landroidx/navigation/NavOptionsBuilder;", "Lkotlin/d2;", "invoke", "(Landroidx/navigation/NavOptionsBuilder;)V", "<anonymous>"}, mo22517k = 3, mo22518mv = {1, 6, 0})
public final class Navigator$onLaunchSingleTop$1 extends Lambda implements C11300l<NavOptionsBuilder, C11079d2> {

    /* renamed from: f */
    public static final Navigator$onLaunchSingleTop$1 f50481f = new Navigator$onLaunchSingleTop$1();

    public Navigator$onLaunchSingleTop$1() {
        super(1);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((NavOptionsBuilder) obj);
        return C11079d2.f28267a;
    }

    public final void invoke(@C12579k NavOptionsBuilder navOptionsBuilder) {
        Intrinsics.checkNotNullParameter(navOptionsBuilder, "$this$navOptions");
        navOptionsBuilder.mo58304m(true);
    }
}
