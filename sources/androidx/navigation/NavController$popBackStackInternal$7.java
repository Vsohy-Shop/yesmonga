package androidx.navigation;

import com.google.firebase.analytics.FirebaseAnalytics;
import kotlin.C11076d0;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22515d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, mo22516d2 = {"Landroidx/navigation/NavDestination;", "destination", "", "a", "(Landroidx/navigation/NavDestination;)Ljava/lang/Boolean;"}, mo22517k = 3, mo22518mv = {1, 6, 0})
public final class NavController$popBackStackInternal$7 extends Lambda implements C11300l<NavDestination, Boolean> {
    final /* synthetic */ NavController this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public NavController$popBackStackInternal$7(NavController navController) {
        super(1);
        this.this$0 = navController;
    }

    @C12579k
    /* renamed from: a */
    public final Boolean invoke(@C12579k NavDestination navDestination) {
        Intrinsics.checkNotNullParameter(navDestination, FirebaseAnalytics.C32532b.f78977z);
        return Boolean.valueOf(!this.this$0.f50395m.containsKey(Integer.valueOf(navDestination.mo58238f0())));
    }
}
