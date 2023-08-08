package androidx.navigation.compose;

import androidx.compose.runtime.C8540g;
import androidx.compose.runtime.C8592o;
import androidx.compose.runtime.internal.C8567o;
import androidx.navigation.C19761k0;
import androidx.navigation.NavBackStackEntry;
import androidx.navigation.NavDestination;
import androidx.navigation.Navigator;
import com.google.firebase.remoteconfig.C33585u;
import com.google.firebase.remoteconfig.internal.C33541p;
import java.util.List;
import java.util.Set;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11305q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.C11952u;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@Navigator.C19689b("composable")
@C11076d0(mo22515d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\"\n\u0002\b\u000b\b\u0007\u0018\u0000 \u001d2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u001e\u001fB\u0007¢\u0006\u0004\b\u001b\u0010\u001cJ*\u0010\u000b\u001a\u00020\n2\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0016J\b\u0010\f\u001a\u00020\u0002H\u0016J\u0018\u0010\u0010\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u000eH\u0016J\u0017\u0010\u0012\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u0012\u0010\u0013R \u0010\u0018\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00150\u00148@X\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017R \u0010\u001a\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u00148@X\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u0017¨\u0006 "}, mo22516d2 = {"Landroidx/navigation/compose/b;", "Landroidx/navigation/Navigator;", "Landroidx/navigation/compose/b$b;", "", "Landroidx/navigation/NavBackStackEntry;", "entries", "Landroidx/navigation/k0;", "navOptions", "Landroidx/navigation/Navigator$a;", "navigatorExtras", "Lkotlin/d2;", "e", "l", "popUpTo", "", "savedState", "j", "entry", "o", "(Landroidx/navigation/NavBackStackEntry;)V", "Lkotlinx/coroutines/flow/u;", "", "n", "()Lkotlinx/coroutines/flow/u;", "transitionsInProgress", "m", "backStack", "<init>", "()V", "c", "a", "b", "navigation-compose_release"}, mo22517k = 1, mo22518mv = {1, 6, 0})
@C8567o(parameters = 0)
/* renamed from: androidx.navigation.compose.b */
public final class C19710b extends Navigator<C19712b> {
    @C12579k

    /* renamed from: c */
    public static final C19711a f50513c = new C19711a((DefaultConstructorMarker) null);

    /* renamed from: d */
    public static final int f50514d = 0;
    @C12579k

    /* renamed from: e */
    public static final String f50515e = "composable";

    /* renamed from: androidx.navigation.compose.b$a */
    public static final class C19711a {
        public /* synthetic */ C19711a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public C19711a() {
        }
    }

    @NavDestination.C19685a(C8540g.class)
    @C8567o(parameters = 0)
    /* renamed from: androidx.navigation.compose.b$b */
    public static final class C19712b extends NavDestination {

        /* renamed from: X */
        public static final int f50516X = 0;
        @C12579k

        /* renamed from: z */
        public final C11305q<NavBackStackEntry, C8592o, Integer, C11079d2> f50517z;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C19712b(@C12579k C19710b bVar, @C12579k C11305q<? super NavBackStackEntry, ? super C8592o, ? super Integer, C11079d2> qVar) {
            super((Navigator<? extends NavDestination>) bVar);
            Intrinsics.checkNotNullParameter(bVar, "navigator");
            Intrinsics.checkNotNullParameter(qVar, "content");
            this.f50517z = qVar;
        }

        @C12579k
        /* renamed from: F0 */
        public final C11305q<NavBackStackEntry, C8592o, Integer, C11079d2> mo58379F0() {
            return this.f50517z;
        }
    }

    /* renamed from: e */
    public void mo58317e(@C12579k List<NavBackStackEntry> list, @C12580l C19761k0 k0Var, @C12580l Navigator.C19688a aVar) {
        Intrinsics.checkNotNullParameter(list, C33585u.C33588c.f81747z3);
        for (NavBackStackEntry j : list) {
            mo58315b().mo58593j(j);
        }
    }

    /* renamed from: j */
    public void mo58322j(@C12579k NavBackStackEntry navBackStackEntry, boolean z) {
        Intrinsics.checkNotNullParameter(navBackStackEntry, "popUpTo");
        mo58315b().mo58172h(navBackStackEntry, z);
    }

    @C12579k
    /* renamed from: l */
    public C19712b mo58032a() {
        return new C19712b(this, ComposableSingletons$ComposeNavigatorKt.f50494a.mo58348a());
    }

    @C12579k
    /* renamed from: m */
    public final C11952u<List<NavBackStackEntry>> mo58376m() {
        return mo58315b().mo58589b();
    }

    @C12579k
    /* renamed from: n */
    public final C11952u<Set<NavBackStackEntry>> mo58377n() {
        return mo58315b().mo58590c();
    }

    /* renamed from: o */
    public final void mo58378o(@C12579k NavBackStackEntry navBackStackEntry) {
        Intrinsics.checkNotNullParameter(navBackStackEntry, C33541p.f81644a);
        mo58315b().mo58170e(navBackStackEntry);
    }
}
