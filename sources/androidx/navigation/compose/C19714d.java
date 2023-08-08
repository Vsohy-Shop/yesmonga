package androidx.navigation.compose;

import androidx.compose.p004ui.window.C16541b;
import androidx.compose.p004ui.window.SecureFlagPolicy;
import androidx.compose.runtime.C8540g;
import androidx.compose.runtime.C8592o;
import androidx.compose.runtime.internal.C8567o;
import androidx.navigation.C19751g;
import androidx.navigation.C19761k0;
import androidx.navigation.NavBackStackEntry;
import androidx.navigation.NavDestination;
import androidx.navigation.Navigator;
import com.google.firebase.remoteconfig.C33585u;
import com.google.firebase.remoteconfig.internal.C33541p;
import java.util.List;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11305q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.C11952u;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@Navigator.C19689b("dialog")
@C11076d0(mo22515d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u0000 \u001c2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u001d\u001eB\u0007¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0000¢\u0006\u0004\b\u0006\u0010\u0007J*\u0010\u000e\u001a\u00020\u00052\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0016J\b\u0010\u000f\u001a\u00020\u0002H\u0016J\u0018\u0010\u0013\u001a\u00020\u00052\u0006\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u0012\u001a\u00020\u0011H\u0016J\u0017\u0010\u0015\u001a\u00020\u00052\u0006\u0010\u0014\u001a\u00020\u0003H\u0000¢\u0006\u0004\b\u0015\u0010\u0007R \u0010\u0019\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\b0\u00168@X\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u001f"}, mo22516d2 = {"Landroidx/navigation/compose/d;", "Landroidx/navigation/Navigator;", "Landroidx/navigation/compose/d$b;", "Landroidx/navigation/NavBackStackEntry;", "backStackEntry", "Lkotlin/d2;", "m", "(Landroidx/navigation/NavBackStackEntry;)V", "", "entries", "Landroidx/navigation/k0;", "navOptions", "Landroidx/navigation/Navigator$a;", "navigatorExtras", "e", "l", "popUpTo", "", "savedState", "j", "entry", "o", "Lkotlinx/coroutines/flow/u;", "n", "()Lkotlinx/coroutines/flow/u;", "backStack", "<init>", "()V", "c", "a", "b", "navigation-compose_release"}, mo22517k = 1, mo22518mv = {1, 6, 0})
@C8567o(parameters = 0)
/* renamed from: androidx.navigation.compose.d */
public final class C19714d extends Navigator<C19716b> {
    @C12579k

    /* renamed from: c */
    public static final C19715a f50520c = new C19715a((DefaultConstructorMarker) null);

    /* renamed from: d */
    public static final int f50521d = 0;
    @C12579k

    /* renamed from: e */
    public static final String f50522e = "dialog";

    /* renamed from: androidx.navigation.compose.d$a */
    public static final class C19715a {
        public /* synthetic */ C19715a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public C19715a() {
        }
    }

    /* renamed from: e */
    public void mo58317e(@C12579k List<NavBackStackEntry> list, @C12580l C19761k0 k0Var, @C12580l Navigator.C19688a aVar) {
        Intrinsics.checkNotNullParameter(list, C33585u.C33588c.f81747z3);
        for (NavBackStackEntry i : list) {
            mo58315b().mo58173i(i);
        }
    }

    /* renamed from: j */
    public void mo58322j(@C12579k NavBackStackEntry navBackStackEntry, boolean z) {
        Intrinsics.checkNotNullParameter(navBackStackEntry, "popUpTo");
        mo58315b().mo58172h(navBackStackEntry, z);
    }

    @C12579k
    /* renamed from: l */
    public C19716b mo58032a() {
        return new C19716b(this, (C16541b) null, ComposableSingletons$DialogNavigatorKt.f50497a.mo58350a(), 2, (DefaultConstructorMarker) null);
    }

    /* renamed from: m */
    public final void mo58381m(@C12579k NavBackStackEntry navBackStackEntry) {
        Intrinsics.checkNotNullParameter(navBackStackEntry, "backStackEntry");
        mo58315b().mo58172h(navBackStackEntry, false);
    }

    @C12579k
    /* renamed from: n */
    public final C11952u<List<NavBackStackEntry>> mo58382n() {
        return mo58315b().mo58589b();
    }

    /* renamed from: o */
    public final void mo58383o(@C12579k NavBackStackEntry navBackStackEntry) {
        Intrinsics.checkNotNullParameter(navBackStackEntry, C33541p.f81644a);
        mo58315b().mo58170e(navBackStackEntry);
    }

    @NavDestination.C19685a(C8540g.class)
    @C8567o(parameters = 0)
    /* renamed from: androidx.navigation.compose.d$b */
    public static final class C19716b extends NavDestination implements C19751g {

        /* renamed from: Y */
        public static final int f50523Y = 0;
        @C12579k

        /* renamed from: X */
        public final C11305q<NavBackStackEntry, C8592o, Integer, C11079d2> f50524X;
        @C12579k

        /* renamed from: z */
        public final C16541b f50525z;

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ C19716b(C19714d dVar, C16541b bVar, C11305q qVar, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(dVar, (i & 2) != 0 ? new C16541b(false, false, (SecureFlagPolicy) null, 7, (DefaultConstructorMarker) null) : bVar, qVar);
        }

        @C12579k
        /* renamed from: F0 */
        public final C11305q<NavBackStackEntry, C8592o, Integer, C11079d2> mo58384F0() {
            return this.f50524X;
        }

        @C12579k
        /* renamed from: G0 */
        public final C16541b mo58385G0() {
            return this.f50525z;
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C19716b(@C12579k C19714d dVar, @C12579k C16541b bVar, @C12579k C11305q<? super NavBackStackEntry, ? super C8592o, ? super Integer, C11079d2> qVar) {
            super((Navigator<? extends NavDestination>) dVar);
            Intrinsics.checkNotNullParameter(dVar, "navigator");
            Intrinsics.checkNotNullParameter(bVar, "dialogProperties");
            Intrinsics.checkNotNullParameter(qVar, "content");
            this.f50525z = bVar;
            this.f50524X = qVar;
        }
    }
}
