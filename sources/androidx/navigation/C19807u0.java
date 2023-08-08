package androidx.navigation;

import android.os.Bundle;
import androidx.annotation.RestrictTo;
import androidx.navigation.Navigator;
import com.google.firebase.analytics.FirebaseAnalytics;
import kotlin.C11076d0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@Navigator.C19689b("NoOp")
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
@C11076d0(mo22515d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ\b\u0010\u0003\u001a\u00020\u0002H\u0016J.\u0010\u000b\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\b\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\u0010\b\u001a\u0004\u0018\u00010\u00072\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0016J\b\u0010\r\u001a\u00020\fH\u0016¨\u0006\u0010"}, mo22516d2 = {"Landroidx/navigation/u0;", "Landroidx/navigation/Navigator;", "Landroidx/navigation/NavDestination;", "a", "destination", "Landroid/os/Bundle;", "args", "Landroidx/navigation/k0;", "navOptions", "Landroidx/navigation/Navigator$a;", "navigatorExtras", "d", "", "k", "<init>", "()V", "navigation-common_release"}, mo22517k = 1, mo22518mv = {1, 6, 0})
/* renamed from: androidx.navigation.u0 */
public final class C19807u0 extends Navigator<NavDestination> {
    @C12579k
    /* renamed from: a */
    public NavDestination mo58032a() {
        return new NavDestination((Navigator<? extends NavDestination>) this);
    }

    @C12579k
    /* renamed from: d */
    public NavDestination mo58033d(@C12579k NavDestination navDestination, @C12580l Bundle bundle, @C12580l C19761k0 k0Var, @C12580l Navigator.C19688a aVar) {
        Intrinsics.checkNotNullParameter(navDestination, FirebaseAnalytics.C32532b.f78977z);
        return navDestination;
    }

    /* renamed from: k */
    public boolean mo58034k() {
        return true;
    }
}
