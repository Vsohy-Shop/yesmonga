package androidx.navigation;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcelable;
import androidx.activity.C0309t;
import androidx.activity.OnBackPressedDispatcher;
import androidx.annotation.C0329d0;
import androidx.annotation.C0346i;
import androidx.annotation.C0353k0;
import androidx.annotation.C0357m0;
import androidx.annotation.RestrictTo;
import androidx.core.p027os.C17779d;
import androidx.lifecycle.C19392a1;
import androidx.lifecycle.C19395b1;
import androidx.lifecycle.C19475v;
import androidx.lifecycle.C19499w;
import androidx.lifecycle.Lifecycle;
import androidx.navigation.C19797s;
import androidx.navigation.C19848x;
import androidx.navigation.NavBackStackEntry;
import androidx.navigation.NavDestination;
import androidx.navigation.Navigator;
import com.google.android.gms.common.internal.C40852x;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.remoteconfig.internal.C33541p;
import com.urbanairship.iam.events.C9175a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.C10864b0;
import kotlin.C11078d1;
import kotlin.C11079d2;
import kotlin.C11677z;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.C10944i;
import kotlin.collections.C10994x;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.C11315i;
import kotlin.jvm.C11384m;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.C11333h;
import kotlin.jvm.internal.C11370u0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.sequences.SequencesKt__SequencesKt;
import kotlin.sequences.SequencesKt___SequencesKt;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.C11907e;
import kotlinx.coroutines.flow.C11909g;
import kotlinx.coroutines.flow.C11911i;
import kotlinx.coroutines.flow.C11940j;
import kotlinx.coroutines.flow.C11945o;
import kotlinx.coroutines.flow.C11952u;
import kotlinx.coroutines.flow.C11953v;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

public class NavController {
    @C12579k

    /* renamed from: G */
    public static final C19675a f50362G = new C19675a((DefaultConstructorMarker) null);
    @C12579k

    /* renamed from: H */
    public static final String f50363H = "NavController";
    @C12579k

    /* renamed from: I */
    public static final String f50364I = "android-support-nav:controller:navigatorState";
    @C12579k

    /* renamed from: J */
    public static final String f50365J = "android-support-nav:controller:navigatorState:names";
    @C12579k

    /* renamed from: K */
    public static final String f50366K = "android-support-nav:controller:backStack";
    @C12579k

    /* renamed from: L */
    public static final String f50367L = "android-support-nav:controller:backStackDestIds";
    @C12579k

    /* renamed from: M */
    public static final String f50368M = "android-support-nav:controller:backStackIds";
    @C12579k

    /* renamed from: N */
    public static final String f50369N = "android-support-nav:controller:backStackStates";
    @C12579k

    /* renamed from: O */
    public static final String f50370O = "android-support-nav:controller:backStackStates:";
    @C12579k
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})

    /* renamed from: P */
    public static final String f50371P = "android-support-nav:controller:deepLinkIds";
    @C12579k
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})

    /* renamed from: Q */
    public static final String f50372Q = "android-support-nav:controller:deepLinkArgs";
    @C12579k
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})

    /* renamed from: R */
    public static final String f50373R = "android-support-nav:controller:deepLinkExtras";
    @C12579k
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})

    /* renamed from: S */
    public static final String f50374S = "android-support-nav:controller:deepLinkHandled";
    @C12579k

    /* renamed from: T */
    public static final String f50375T = "android-support-nav:controller:deepLinkIntent";

    /* renamed from: U */
    public static boolean f50376U = true;
    @C12579k

    /* renamed from: A */
    public final Map<NavBackStackEntry, Boolean> f50377A;

    /* renamed from: B */
    public int f50378B;
    @C12579k

    /* renamed from: C */
    public final List<NavBackStackEntry> f50379C;
    @C12579k

    /* renamed from: D */
    public final C11677z f50380D;
    @C12579k

    /* renamed from: E */
    public final C11911i<NavBackStackEntry> f50381E;
    @C12579k

    /* renamed from: F */
    public final C11907e<NavBackStackEntry> f50382F;
    @C12579k

    /* renamed from: a */
    public final Context f50383a;
    @C12580l

    /* renamed from: b */
    public Activity f50384b;
    @C12580l

    /* renamed from: c */
    public C19758j0 f50385c;
    @C12580l

    /* renamed from: d */
    public NavGraph f50386d;
    @C12580l

    /* renamed from: e */
    public Bundle f50387e;
    @C12580l

    /* renamed from: f */
    public Parcelable[] f50388f;

    /* renamed from: g */
    public boolean f50389g;
    @C12579k

    /* renamed from: h */
    public final C10944i<NavBackStackEntry> f50390h;
    @C12579k

    /* renamed from: i */
    public final C11940j<List<NavBackStackEntry>> f50391i;
    @C12579k

    /* renamed from: j */
    public final C11952u<List<NavBackStackEntry>> f50392j;
    @C12579k

    /* renamed from: k */
    public final Map<NavBackStackEntry, NavBackStackEntry> f50393k;
    @C12579k

    /* renamed from: l */
    public final Map<NavBackStackEntry, AtomicInteger> f50394l;
    @C12579k

    /* renamed from: m */
    public final Map<Integer, String> f50395m;
    @C12579k

    /* renamed from: n */
    public final Map<String, C10944i<NavBackStackEntryState>> f50396n;
    @C12580l

    /* renamed from: o */
    public C19499w f50397o;
    @C12580l

    /* renamed from: p */
    public OnBackPressedDispatcher f50398p;
    @C12580l

    /* renamed from: q */
    public C19797s f50399q;
    @C12579k

    /* renamed from: r */
    public final CopyOnWriteArrayList<C19676b> f50400r;
    @C12579k

    /* renamed from: s */
    public Lifecycle.State f50401s;
    @C12579k

    /* renamed from: t */
    public final C19475v f50402t;
    @C12579k

    /* renamed from: u */
    public final C0309t f50403u;

    /* renamed from: v */
    public boolean f50404v;
    @C12579k

    /* renamed from: w */
    public C19795r0 f50405w;
    @C12579k

    /* renamed from: x */
    public final Map<Navigator<? extends NavDestination>, NavControllerNavigatorState> f50406x;
    @C12580l

    /* renamed from: y */
    public C11300l<? super NavBackStackEntry, C11079d2> f50407y;
    @C12580l

    /* renamed from: z */
    public C11300l<? super NavBackStackEntry, C11079d2> f50408z;

    public final class NavControllerNavigatorState extends C19805t0 {
        @C12579k

        /* renamed from: g */
        public final Navigator<? extends NavDestination> f50409g;

        /* renamed from: h */
        public final /* synthetic */ NavController f50410h;

        public NavControllerNavigatorState(@C12579k NavController navController, Navigator<? extends NavDestination> navigator) {
            Intrinsics.checkNotNullParameter(navigator, "navigator");
            this.f50410h = navController;
            this.f50409g = navigator;
        }

        @C12579k
        /* renamed from: a */
        public NavBackStackEntry mo58169a(@C12579k NavDestination navDestination, @C12580l Bundle bundle) {
            Intrinsics.checkNotNullParameter(navDestination, FirebaseAnalytics.C32532b.f78977z);
            return NavBackStackEntry.C19670a.m91363b(NavBackStackEntry.f50342Y, this.f50410h.mo58097F(), navDestination, bundle, this.f50410h.mo58109L(), this.f50410h.f50399q, (String) null, (Bundle) null, 96, (Object) null);
        }

        /* renamed from: e */
        public void mo58170e(@C12579k NavBackStackEntry navBackStackEntry) {
            C19797s j;
            Intrinsics.checkNotNullParameter(navBackStackEntry, C33541p.f81644a);
            boolean areEqual = Intrinsics.areEqual(this.f50410h.f50377A.get(navBackStackEntry), (Object) Boolean.TRUE);
            super.mo58170e(navBackStackEntry);
            this.f50410h.f50377A.remove(navBackStackEntry);
            if (!this.f50410h.mo58093C().contains(navBackStackEntry)) {
                this.f50410h.mo58129V0(navBackStackEntry);
                if (navBackStackEntry.getLifecycle().mo57465b().mo57474q(Lifecycle.State.CREATED)) {
                    navBackStackEntry.mo58073m(Lifecycle.State.DESTROYED);
                }
                C10944i<NavBackStackEntry> C = this.f50410h.mo58093C();
                boolean z = true;
                if (!(C instanceof Collection) || !C.isEmpty()) {
                    Iterator<T> it = C.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            if (Intrinsics.areEqual((Object) ((NavBackStackEntry) it.next()).mo58066g(), (Object) navBackStackEntry.mo58066g())) {
                                z = false;
                                break;
                            }
                        } else {
                            break;
                        }
                    }
                }
                if (z && !areEqual && (j = this.f50410h.f50399q) != null) {
                    j.mo58566d0(navBackStackEntry.mo58066g());
                }
                this.f50410h.mo58131W0();
                this.f50410h.f50391i.mo24198a(this.f50410h.mo58098F0());
            } else if (!mo58591d()) {
                this.f50410h.mo58131W0();
                this.f50410h.f50391i.mo24198a(this.f50410h.mo58098F0());
            }
        }

        /* renamed from: g */
        public void mo58171g(@C12579k NavBackStackEntry navBackStackEntry, boolean z) {
            Intrinsics.checkNotNullParameter(navBackStackEntry, "popUpTo");
            Navigator f = this.f50410h.f50405w.mo58562f(navBackStackEntry.mo58065f().mo58242i0());
            if (Intrinsics.areEqual((Object) f, (Object) this.f50409g)) {
                C11300l i = this.f50410h.f50408z;
                if (i != null) {
                    i.invoke(navBackStackEntry);
                    super.mo58171g(navBackStackEntry, z);
                    return;
                }
                this.f50410h.mo58166y0(navBackStackEntry, new NavController$NavControllerNavigatorState$pop$1(this, navBackStackEntry, z));
                return;
            }
            Object obj = this.f50410h.f50406x.get(f);
            Intrinsics.checkNotNull(obj);
            ((NavControllerNavigatorState) obj).mo58171g(navBackStackEntry, z);
        }

        /* renamed from: h */
        public void mo58172h(@C12579k NavBackStackEntry navBackStackEntry, boolean z) {
            Intrinsics.checkNotNullParameter(navBackStackEntry, "popUpTo");
            super.mo58172h(navBackStackEntry, z);
            this.f50410h.f50377A.put(navBackStackEntry, Boolean.valueOf(z));
        }

        /* renamed from: i */
        public void mo58173i(@C12579k NavBackStackEntry navBackStackEntry) {
            Intrinsics.checkNotNullParameter(navBackStackEntry, "backStackEntry");
            Navigator f = this.f50410h.f50405w.mo58562f(navBackStackEntry.mo58065f().mo58242i0());
            if (Intrinsics.areEqual((Object) f, (Object) this.f50409g)) {
                C11300l c = this.f50410h.f50407y;
                if (c != null) {
                    c.invoke(navBackStackEntry);
                    mo58174m(navBackStackEntry);
                    return;
                }
                StringBuilder sb = new StringBuilder();
                sb.append("Ignoring add of destination ");
                sb.append(navBackStackEntry.mo58065f());
                sb.append(" outside of the call to navigate(). ");
                return;
            }
            Object obj = this.f50410h.f50406x.get(f);
            if (obj != null) {
                ((NavControllerNavigatorState) obj).mo58173i(navBackStackEntry);
                return;
            }
            throw new IllegalStateException(("NavigatorBackStack for " + navBackStackEntry.mo58065f().mo58242i0() + " should already be created").toString());
        }

        /* renamed from: m */
        public final void mo58174m(@C12579k NavBackStackEntry navBackStackEntry) {
            Intrinsics.checkNotNullParameter(navBackStackEntry, "backStackEntry");
            super.mo58173i(navBackStackEntry);
        }

        @C12579k
        /* renamed from: n */
        public final Navigator<? extends NavDestination> mo58175n() {
            return this.f50409g;
        }
    }

    /* renamed from: androidx.navigation.NavController$a */
    public static final class C19675a {
        public /* synthetic */ C19675a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: b */
        public static /* synthetic */ void m91486b() {
        }

        @C19852y
        @C11384m
        /* renamed from: a */
        public final void mo58176a(boolean z) {
            NavController.f50376U = z;
        }

        public C19675a() {
        }
    }

    /* renamed from: androidx.navigation.NavController$b */
    public interface C19676b {
        /* renamed from: a */
        void mo58177a(@C12579k NavController navController, @C12579k NavDestination navDestination, @C12580l Bundle bundle);
    }

    /* renamed from: androidx.navigation.NavController$c */
    public static final class C19677c extends C0309t {

        /* renamed from: d */
        public final /* synthetic */ NavController f50411d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C19677c(NavController navController) {
            super(false);
            this.f50411d = navController;
        }

        /* renamed from: f */
        public void mo792f() {
            this.f50411d.mo58156s0();
        }
    }

    public NavController(@C12579k Context context) {
        Object obj;
        Intrinsics.checkNotNullParameter(context, C9175a.f24932Y);
        this.f50383a = context;
        Iterator it = SequencesKt__SequencesKt.m44595l(context, NavController$activity$1.f50412f).iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((Context) obj) instanceof Activity) {
                break;
            }
        }
        this.f50384b = (Activity) obj;
        this.f50390h = new C10944i<>();
        C11940j<List<NavBackStackEntry>> a = C11953v.m47628a(CollectionsKt__CollectionsKt.m40441E());
        this.f50391i = a;
        this.f50392j = C11909g.m47470m(a);
        this.f50393k = new LinkedHashMap();
        this.f50394l = new LinkedHashMap();
        this.f50395m = new LinkedHashMap();
        this.f50396n = new LinkedHashMap();
        this.f50400r = new CopyOnWriteArrayList<>();
        this.f50401s = Lifecycle.State.INITIALIZED;
        this.f50402t = new C19792q(this);
        this.f50403u = new C19677c(this);
        this.f50404v = true;
        this.f50405w = new C19795r0();
        this.f50406x = new LinkedHashMap();
        this.f50377A = new LinkedHashMap();
        C19795r0 r0Var = this.f50405w;
        r0Var.mo58559b(new C19724f0(r0Var));
        this.f50405w.mo58559b(new ActivityNavigator(this.f50383a));
        this.f50379C = new ArrayList();
        this.f50380D = C10864b0.m38748c(new NavController$navInflater$2(this));
        C11911i<NavBackStackEntry> b = C11945o.m47610b(1, 0, BufferOverflow.DROP_OLDEST, 2, (Object) null);
        this.f50381E = b;
        this.f50382F = C11909g.m47467l(b);
    }

    /* renamed from: B0 */
    public static /* synthetic */ void m91376B0(NavController navController, Navigator navigator, NavBackStackEntry navBackStackEntry, boolean z, C11300l lVar, int i, Object obj) {
        if (obj == null) {
            if ((i & 4) != 0) {
                lVar = NavController$popBackStackInternal$1.f50416f;
            }
            navController.mo58168z0(navigator, navBackStackEntry, z, lVar);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: popBackStackInternal");
    }

    /* renamed from: C0 */
    public static /* synthetic */ boolean m91377C0(NavController navController, int i, boolean z, boolean z2, int i2, Object obj) {
        if (obj == null) {
            if ((i2 & 4) != 0) {
                z2 = false;
            }
            return navController.mo58091A0(i, z, z2);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: popBackStackInternal");
    }

    /* renamed from: E0 */
    public static /* synthetic */ void m91378E0(NavController navController, NavBackStackEntry navBackStackEntry, boolean z, C10944i iVar, int i, Object obj) {
        if (obj == null) {
            if ((i & 2) != 0) {
                z = false;
            }
            if ((i & 4) != 0) {
                iVar = new C10944i();
            }
            navController.mo58095D0(navBackStackEntry, z, iVar);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: popEntryFromBackStack");
    }

    /* renamed from: T */
    public static final void m91379T(NavController navController, C19499w wVar, Lifecycle.C19372Event event) {
        Intrinsics.checkNotNullParameter(navController, "this$0");
        Intrinsics.checkNotNullParameter(wVar, "<anonymous parameter 0>");
        Intrinsics.checkNotNullParameter(event, "event");
        Lifecycle.State w = event.mo57469w();
        Intrinsics.checkNotNullExpressionValue(w, "event.targetState");
        navController.f50401s = w;
        if (navController.f50386d != null) {
            Iterator<NavBackStackEntry> it = navController.mo58093C().iterator();
            while (it.hasNext()) {
                it.next().mo58070j(event);
            }
        }
    }

    /* renamed from: n0 */
    public static /* synthetic */ void m91394n0(NavController navController, String str, C19761k0 k0Var, Navigator.C19688a aVar, int i, Object obj) {
        if (obj == null) {
            if ((i & 2) != 0) {
                k0Var = null;
            }
            if ((i & 4) != 0) {
                aVar = null;
            }
            navController.mo58147l0(str, k0Var, aVar);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: navigate");
    }

    /* renamed from: p */
    public static /* synthetic */ void m91395p(NavController navController, NavDestination navDestination, Bundle bundle, NavBackStackEntry navBackStackEntry, List list, int i, Object obj) {
        if (obj == null) {
            if ((i & 8) != 0) {
                list = CollectionsKt__CollectionsKt.m40441E();
            }
            navController.mo58149o(navDestination, bundle, navBackStackEntry, list);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: addEntryToBackStack");
    }

    /* renamed from: p0 */
    public static /* synthetic */ void m91396p0(NavController navController, Navigator navigator, List list, C19761k0 k0Var, Navigator.C19688a aVar, C11300l lVar, int i, Object obj) {
        if (obj == null) {
            if ((i & 8) != 0) {
                lVar = NavController$navigateInternal$1.f50415f;
            }
            navController.mo58150o0(navigator, list, k0Var, aVar, lVar);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: navigateInternal");
    }

    @C19852y
    @C11384m
    /* renamed from: w */
    public static final void m91397w(boolean z) {
        f50362G.mo58176a(z);
    }

    /* renamed from: x0 */
    public static /* synthetic */ boolean m91398x0(NavController navController, String str, boolean z, boolean z2, int i, Object obj) {
        if (obj == null) {
            if ((i & 4) != 0) {
                z2 = false;
            }
            return navController.mo58163w0(str, z, z2);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: popBackStack");
    }

    @C12580l
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* renamed from: A */
    public final NavDestination mo58090A(@C12579k String str) {
        NavDestination navDestination;
        NavGraph navGraph;
        Intrinsics.checkNotNullParameter(str, "destinationRoute");
        NavGraph navGraph2 = this.f50386d;
        if (navGraph2 == null) {
            return null;
        }
        Intrinsics.checkNotNull(navGraph2);
        if (Intrinsics.areEqual((Object) navGraph2.mo58244l0(), (Object) str)) {
            return this.f50386d;
        }
        NavBackStackEntry l0 = mo58093C().mo22301l0();
        if (l0 == null || (navDestination = l0.mo58065f()) == null) {
            navDestination = this.f50386d;
            Intrinsics.checkNotNull(navDestination);
        }
        if (navDestination instanceof NavGraph) {
            navGraph = (NavGraph) navDestination;
        } else {
            navGraph = navDestination.mo58243j0();
            Intrinsics.checkNotNull(navGraph);
        }
        return navGraph.mo58275L0(str);
    }

    @C0353k0
    /* renamed from: A0 */
    public final boolean mo58091A0(@C0329d0 int i, boolean z, boolean z2) {
        NavDestination navDestination;
        String str;
        int i2 = i;
        boolean z3 = z2;
        if (mo58093C().isEmpty()) {
            return false;
        }
        ArrayList<Navigator> arrayList = new ArrayList<>();
        Iterator<T> it = CollectionsKt___CollectionsKt.m40566S4(mo58093C()).iterator();
        while (true) {
            if (!it.hasNext()) {
                navDestination = null;
                break;
            }
            NavDestination f = ((NavBackStackEntry) it.next()).mo58065f();
            Navigator f2 = this.f50405w.mo58562f(f.mo58242i0());
            if (z || f.mo58238f0() != i2) {
                arrayList.add(f2);
            }
            if (f.mo58238f0() == i2) {
                navDestination = f;
                break;
            }
        }
        if (navDestination == null) {
            String b = NavDestination.f50441x.mo58259b(this.f50383a, i2);
            StringBuilder sb = new StringBuilder();
            sb.append("Ignoring popBackStack to destination ");
            sb.append(b);
            sb.append(" as it was not found on the current back stack");
            return false;
        }
        Ref.BooleanRef booleanRef = new Ref.BooleanRef();
        C10944i iVar = new C10944i();
        for (Navigator z0 : arrayList) {
            Ref.BooleanRef booleanRef2 = new Ref.BooleanRef();
            NavController$popBackStackInternal$2 navController$popBackStackInternal$2 = r0;
            NavController$popBackStackInternal$2 navController$popBackStackInternal$22 = new NavController$popBackStackInternal$2(booleanRef2, booleanRef, this, z2, iVar);
            mo58168z0(z0, mo58093C().last(), z3, navController$popBackStackInternal$2);
            if (!booleanRef2.element) {
                break;
            }
        }
        if (z3) {
            if (!z) {
                for (NavDestination f0 : SequencesKt___SequencesKt.m44719Z2(SequencesKt__SequencesKt.m44595l(navDestination, NavController$popBackStackInternal$3.f50417f), new NavController$popBackStackInternal$4(this))) {
                    Map<Integer, String> map = this.f50395m;
                    Integer valueOf = Integer.valueOf(f0.mo58238f0());
                    NavBackStackEntryState navBackStackEntryState = (NavBackStackEntryState) iVar.mo22286Q();
                    if (navBackStackEntryState != null) {
                        str = navBackStackEntryState.mo58081c();
                    } else {
                        str = null;
                    }
                    map.put(valueOf, str);
                }
            }
            if (!iVar.isEmpty()) {
                NavBackStackEntryState navBackStackEntryState2 = (NavBackStackEntryState) iVar.first();
                for (NavDestination f02 : SequencesKt___SequencesKt.m44719Z2(SequencesKt__SequencesKt.m44595l(mo58165y(navBackStackEntryState2.mo58080b()), NavController$popBackStackInternal$6.f50418f), new NavController$popBackStackInternal$7(this))) {
                    this.f50395m.put(Integer.valueOf(f02.mo58238f0()), navBackStackEntryState2.mo58081c());
                }
                this.f50396n.put(navBackStackEntryState2.mo58081c(), iVar);
            }
        }
        mo58133X0();
        return booleanRef.element;
    }

    /* renamed from: B */
    public final String mo58092B(int[] iArr) {
        NavGraph navGraph;
        NavGraph navGraph2 = this.f50386d;
        int length = iArr.length;
        int i = 0;
        while (true) {
            NavDestination navDestination = null;
            if (i >= length) {
                return null;
            }
            int i2 = iArr[i];
            if (i == 0) {
                NavGraph navGraph3 = this.f50386d;
                Intrinsics.checkNotNull(navGraph3);
                if (navGraph3.mo58238f0() == i2) {
                    navDestination = this.f50386d;
                }
            } else {
                Intrinsics.checkNotNull(navGraph2);
                navDestination = navGraph2.mo58273J0(i2);
            }
            if (navDestination == null) {
                return NavDestination.f50441x.mo58259b(this.f50383a, i2);
            }
            if (i != iArr.length - 1 && (navDestination instanceof NavGraph)) {
                while (true) {
                    navGraph = (NavGraph) navDestination;
                    Intrinsics.checkNotNull(navGraph);
                    if (!(navGraph.mo58273J0(navGraph.mo58280S0()) instanceof NavGraph)) {
                        break;
                    }
                    navDestination = navGraph.mo58273J0(navGraph.mo58280S0());
                }
                navGraph2 = navGraph;
            }
            i++;
        }
    }

    @C12579k
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* renamed from: C */
    public C10944i<NavBackStackEntry> mo58093C() {
        return this.f50390h;
    }

    @C12579k
    /* renamed from: D */
    public NavBackStackEntry mo58094D(@C0329d0 int i) {
        NavBackStackEntry navBackStackEntry;
        boolean z;
        C10944i<NavBackStackEntry> C = mo58093C();
        ListIterator<NavBackStackEntry> listIterator = C.listIterator(C.size());
        while (true) {
            if (!listIterator.hasPrevious()) {
                navBackStackEntry = null;
                break;
            }
            navBackStackEntry = listIterator.previous();
            if (navBackStackEntry.mo58065f().mo58238f0() == i) {
                z = true;
                continue;
            } else {
                z = false;
                continue;
            }
            if (z) {
                break;
            }
        }
        NavBackStackEntry navBackStackEntry2 = navBackStackEntry;
        if (navBackStackEntry2 != null) {
            return navBackStackEntry2;
        }
        throw new IllegalArgumentException(("No destination with ID " + i + " is on the NavController's back stack. The current destination is " + mo58103I()).toString());
    }

    /* renamed from: D0 */
    public final void mo58095D0(NavBackStackEntry navBackStackEntry, boolean z, C10944i<NavBackStackEntryState> iVar) {
        boolean z2;
        C19797s sVar;
        C11952u<Set<NavBackStackEntry>> c;
        Set value;
        NavBackStackEntry last = mo58093C().last();
        if (Intrinsics.areEqual((Object) last, (Object) navBackStackEntry)) {
            mo58093C().mo22310r0();
            NavControllerNavigatorState navControllerNavigatorState = this.f50406x.get(mo58113N().mo58562f(last.mo58065f().mo58242i0()));
            boolean z3 = true;
            if (navControllerNavigatorState == null || (c = navControllerNavigatorState.mo58590c()) == null || (value = c.getValue()) == null || !value.contains(last)) {
                z2 = false;
            } else {
                z2 = true;
            }
            if (!z2 && !this.f50394l.containsKey(last)) {
                z3 = false;
            }
            Lifecycle.State b = last.getLifecycle().mo57465b();
            Lifecycle.State state = Lifecycle.State.CREATED;
            if (b.mo57474q(state)) {
                if (z) {
                    last.mo58073m(state);
                    iVar.mo22298i(new NavBackStackEntryState(last));
                }
                if (!z3) {
                    last.mo58073m(Lifecycle.State.DESTROYED);
                    mo58129V0(last);
                } else {
                    last.mo58073m(state);
                }
            }
            if (!z && !z3 && (sVar = this.f50399q) != null) {
                sVar.mo58566d0(last.mo58066g());
                return;
            }
            return;
        }
        throw new IllegalStateException(("Attempted to pop " + navBackStackEntry.mo58065f() + ", which is not the top of the back stack (" + last.mo58065f() + ')').toString());
    }

    @C12579k
    /* renamed from: E */
    public final NavBackStackEntry mo58096E(@C12579k String str) {
        NavBackStackEntry navBackStackEntry;
        Intrinsics.checkNotNullParameter(str, "route");
        C10944i<NavBackStackEntry> C = mo58093C();
        ListIterator<NavBackStackEntry> listIterator = C.listIterator(C.size());
        while (true) {
            if (!listIterator.hasPrevious()) {
                navBackStackEntry = null;
                break;
            }
            navBackStackEntry = listIterator.previous();
            if (Intrinsics.areEqual((Object) navBackStackEntry.mo58065f().mo58244l0(), (Object) str)) {
                break;
            }
        }
        NavBackStackEntry navBackStackEntry2 = navBackStackEntry;
        if (navBackStackEntry2 != null) {
            return navBackStackEntry2;
        }
        throw new IllegalArgumentException(("No destination with route " + str + " is on the NavController's back stack. The current destination is " + mo58103I()).toString());
    }

    @C12579k
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* renamed from: F */
    public final Context mo58097F() {
        return this.f50383a;
    }

    @C12579k
    /* renamed from: F0 */
    public final List<NavBackStackEntry> mo58098F0() {
        boolean z;
        boolean z2;
        ArrayList arrayList = new ArrayList();
        for (NavControllerNavigatorState c : this.f50406x.values()) {
            ArrayList arrayList2 = new ArrayList();
            for (Object next : c.mo58590c().getValue()) {
                NavBackStackEntry navBackStackEntry = (NavBackStackEntry) next;
                if (arrayList.contains(navBackStackEntry) || navBackStackEntry.mo58067h().mo57474q(Lifecycle.State.STARTED)) {
                    z2 = false;
                } else {
                    z2 = true;
                }
                if (z2) {
                    arrayList2.add(next);
                }
            }
            C10994x.m42360n0(arrayList, arrayList2);
        }
        C10944i<NavBackStackEntry> C = mo58093C();
        ArrayList arrayList3 = new ArrayList();
        for (T next2 : C) {
            NavBackStackEntry navBackStackEntry2 = (NavBackStackEntry) next2;
            if (arrayList.contains(navBackStackEntry2) || !navBackStackEntry2.mo58067h().mo57474q(Lifecycle.State.STARTED)) {
                z = false;
            } else {
                z = true;
            }
            if (z) {
                arrayList3.add(next2);
            }
        }
        C10994x.m42360n0(arrayList, arrayList3);
        ArrayList arrayList4 = new ArrayList();
        for (Object next3 : arrayList) {
            if (!(((NavBackStackEntry) next3).mo58065f() instanceof NavGraph)) {
                arrayList4.add(next3);
            }
        }
        return arrayList4;
    }

    @C12580l
    /* renamed from: G */
    public NavBackStackEntry mo58099G() {
        return mo58093C().mo22301l0();
    }

    /* renamed from: G0 */
    public void mo58100G0(@C12579k C19676b bVar) {
        Intrinsics.checkNotNullParameter(bVar, C40852x.C40853a.f103958a);
        this.f50400r.remove(bVar);
    }

    @C12579k
    /* renamed from: H */
    public final C11907e<NavBackStackEntry> mo58101H() {
        return this.f50382F;
    }

    @C0346i
    /* renamed from: H0 */
    public void mo58102H0(@C12580l Bundle bundle) {
        if (bundle != null) {
            bundle.setClassLoader(this.f50383a.getClassLoader());
            this.f50387e = bundle.getBundle(f50364I);
            this.f50388f = bundle.getParcelableArray(f50366K);
            this.f50396n.clear();
            int[] intArray = bundle.getIntArray(f50367L);
            ArrayList<String> stringArrayList = bundle.getStringArrayList(f50368M);
            if (!(intArray == null || stringArrayList == null)) {
                int length = intArray.length;
                int i = 0;
                int i2 = 0;
                while (i < length) {
                    this.f50395m.put(Integer.valueOf(intArray[i]), stringArrayList.get(i2));
                    i++;
                    i2++;
                }
            }
            ArrayList<String> stringArrayList2 = bundle.getStringArrayList(f50369N);
            if (stringArrayList2 != null) {
                for (String str : stringArrayList2) {
                    Parcelable[] parcelableArray = bundle.getParcelableArray(f50370O + str);
                    if (parcelableArray != null) {
                        Map<String, C10944i<NavBackStackEntryState>> map = this.f50396n;
                        Intrinsics.checkNotNullExpressionValue(str, "id");
                        C10944i iVar = new C10944i(parcelableArray.length);
                        Iterator a = C11333h.m43500a(parcelableArray);
                        while (a.hasNext()) {
                            Parcelable parcelable = (Parcelable) a.next();
                            if (parcelable != null) {
                                iVar.add((NavBackStackEntryState) parcelable);
                            } else {
                                throw new NullPointerException("null cannot be cast to non-null type androidx.navigation.NavBackStackEntryState");
                            }
                        }
                        map.put(str, iVar);
                    }
                }
            }
            this.f50389g = bundle.getBoolean(f50374S);
        }
    }

    @C12580l
    /* renamed from: I */
    public NavDestination mo58103I() {
        NavBackStackEntry G = mo58099G();
        if (G != null) {
            return G.mo58065f();
        }
        return null;
    }

    /* renamed from: I0 */
    public final boolean mo58104I0(int i, Bundle bundle, C19761k0 k0Var, Navigator.C19688a aVar) {
        String str;
        NavBackStackEntry navBackStackEntry;
        NavDestination f;
        if (!this.f50395m.containsKey(Integer.valueOf(i))) {
            return false;
        }
        String str2 = this.f50395m.get(Integer.valueOf(i));
        C10994x.m42343D0(this.f50395m.values(), new NavController$restoreStateInternal$1(str2));
        List<NavBackStackEntry> S = mo58123S((C10944i) C11370u0.m43695k(this.f50396n).remove(str2));
        ArrayList<List> arrayList = new ArrayList<>();
        ArrayList<NavBackStackEntry> arrayList2 = new ArrayList<>();
        for (Object next : S) {
            if (!(((NavBackStackEntry) next).mo58065f() instanceof NavGraph)) {
                arrayList2.add(next);
            }
        }
        for (NavBackStackEntry navBackStackEntry2 : arrayList2) {
            List list = (List) CollectionsKt___CollectionsKt.m40677q3(arrayList);
            if (list == null || (navBackStackEntry = (NavBackStackEntry) CollectionsKt___CollectionsKt.m40653k3(list)) == null || (f = navBackStackEntry.mo58065f()) == null) {
                str = null;
            } else {
                str = f.mo58242i0();
            }
            if (Intrinsics.areEqual((Object) str, (Object) navBackStackEntry2.mo58065f().mo58242i0())) {
                list.add(navBackStackEntry2);
            } else {
                arrayList.add(CollectionsKt__CollectionsKt.m40452P(navBackStackEntry2));
            }
        }
        Ref.BooleanRef booleanRef = new Ref.BooleanRef();
        for (List list2 : arrayList) {
            mo58150o0(this.f50405w.mo58562f(((NavBackStackEntry) CollectionsKt___CollectionsKt.m40706w2(list2)).mo58065f().mo58242i0()), list2, k0Var, aVar, new NavController$restoreStateInternal$4(booleanRef, S, new Ref.IntRef(), this, bundle));
        }
        return booleanRef.element;
    }

    /* renamed from: J */
    public final int mo58105J() {
        C10944i<NavBackStackEntry> C = mo58093C();
        int i = 0;
        if (!(C instanceof Collection) || !C.isEmpty()) {
            for (NavBackStackEntry f : C) {
                if ((!(f.mo58065f() instanceof NavGraph)) && (i = i + 1) < 0) {
                    CollectionsKt__CollectionsKt.m40458V();
                }
            }
        }
        return i;
    }

    @C12580l
    @C0346i
    /* renamed from: J0 */
    public Bundle mo58106J0() {
        Bundle bundle;
        ArrayList arrayList = new ArrayList();
        Bundle bundle2 = new Bundle();
        for (Map.Entry next : this.f50405w.mo58563g().entrySet()) {
            String str = (String) next.getKey();
            Bundle i = ((Navigator) next.getValue()).mo58321i();
            if (i != null) {
                arrayList.add(str);
                bundle2.putBundle(str, i);
            }
        }
        if (!arrayList.isEmpty()) {
            bundle = new Bundle();
            bundle2.putStringArrayList(f50365J, arrayList);
            bundle.putBundle(f50364I, bundle2);
        } else {
            bundle = null;
        }
        if (!mo58093C().isEmpty()) {
            if (bundle == null) {
                bundle = new Bundle();
            }
            Parcelable[] parcelableArr = new Parcelable[mo58093C().size()];
            Iterator<NavBackStackEntry> it = mo58093C().iterator();
            int i2 = 0;
            while (it.hasNext()) {
                parcelableArr[i2] = new NavBackStackEntryState(it.next());
                i2++;
            }
            bundle.putParcelableArray(f50366K, parcelableArr);
        }
        if (!this.f50395m.isEmpty()) {
            if (bundle == null) {
                bundle = new Bundle();
            }
            int[] iArr = new int[this.f50395m.size()];
            ArrayList arrayList2 = new ArrayList();
            int i3 = 0;
            for (Map.Entry next2 : this.f50395m.entrySet()) {
                iArr[i3] = ((Number) next2.getKey()).intValue();
                arrayList2.add((String) next2.getValue());
                i3++;
            }
            bundle.putIntArray(f50367L, iArr);
            bundle.putStringArrayList(f50368M, arrayList2);
        }
        if (!this.f50396n.isEmpty()) {
            if (bundle == null) {
                bundle = new Bundle();
            }
            ArrayList arrayList3 = new ArrayList();
            for (Map.Entry next3 : this.f50396n.entrySet()) {
                String str2 = (String) next3.getKey();
                C10944i iVar = (C10944i) next3.getValue();
                arrayList3.add(str2);
                Parcelable[] parcelableArr2 = new Parcelable[iVar.size()];
                int i4 = 0;
                for (Object next4 : iVar) {
                    int i5 = i4 + 1;
                    if (i4 < 0) {
                        CollectionsKt__CollectionsKt.m40459W();
                    }
                    parcelableArr2[i4] = (NavBackStackEntryState) next4;
                    i4 = i5;
                }
                bundle.putParcelableArray(f50370O + str2, parcelableArr2);
            }
            bundle.putStringArrayList(f50369N, arrayList3);
        }
        if (this.f50389g) {
            if (bundle == null) {
                bundle = new Bundle();
            }
            bundle.putBoolean(f50374S, this.f50389g);
        }
        return bundle;
    }

    @C0353k0
    @C12579k
    /* renamed from: K */
    public NavGraph mo58107K() {
        NavGraph navGraph = this.f50386d;
        if (navGraph == null) {
            throw new IllegalStateException("You must call setGraph() before calling getGraph()".toString());
        } else if (navGraph != null) {
            return navGraph;
        } else {
            throw new NullPointerException("null cannot be cast to non-null type androidx.navigation.NavGraph");
        }
    }

    @C0353k0
    @C0346i
    /* renamed from: K0 */
    public void mo58108K0(@C0357m0 int i) {
        mo58114N0(mo58111M().mo58438b(i), (Bundle) null);
    }

    @C12579k
    /* renamed from: L */
    public final Lifecycle.State mo58109L() {
        if (this.f50397o == null) {
            return Lifecycle.State.CREATED;
        }
        return this.f50401s;
    }

    @C0353k0
    @C0346i
    /* renamed from: L0 */
    public void mo58110L0(@C0357m0 int i, @C12580l Bundle bundle) {
        mo58114N0(mo58111M().mo58438b(i), bundle);
    }

    @C12579k
    /* renamed from: M */
    public C19758j0 mo58111M() {
        return (C19758j0) this.f50380D.getValue();
    }

    @C0353k0
    @C0346i
    /* renamed from: M0 */
    public void mo58112M0(@C12579k NavGraph navGraph) {
        Intrinsics.checkNotNullParameter(navGraph, "graph");
        mo58114N0(navGraph, (Bundle) null);
    }

    @C12579k
    /* renamed from: N */
    public C19795r0 mo58113N() {
        return this.f50405w;
    }

    @C0353k0
    @C0346i
    /* renamed from: N0 */
    public void mo58114N0(@C12579k NavGraph navGraph, @C12580l Bundle bundle) {
        boolean z;
        Intrinsics.checkNotNullParameter(navGraph, "graph");
        if (!Intrinsics.areEqual((Object) this.f50386d, (Object) navGraph)) {
            NavGraph navGraph2 = this.f50386d;
            if (navGraph2 != null) {
                for (Integer num : new ArrayList(this.f50395m.keySet())) {
                    Intrinsics.checkNotNullExpressionValue(num, "id");
                    mo58157t(num.intValue());
                }
                m91377C0(this, navGraph2.mo58238f0(), true, false, 4, (Object) null);
            }
            this.f50386d = navGraph;
            mo58154r0(bundle);
            return;
        }
        int G = navGraph.mo58277O0().mo6353G();
        for (int i = 0; i < G; i++) {
            NavDestination H = navGraph.mo58277O0().mo6354H(i);
            NavGraph navGraph3 = this.f50386d;
            Intrinsics.checkNotNull(navGraph3);
            navGraph3.mo58277O0().mo6350D(i, H);
            C10944i<NavBackStackEntry> C = mo58093C();
            ArrayList<NavBackStackEntry> arrayList = new ArrayList<>();
            for (T next : C) {
                NavBackStackEntry navBackStackEntry = (NavBackStackEntry) next;
                if (H == null || navBackStackEntry.mo58065f().mo58238f0() != H.mo58238f0()) {
                    z = false;
                } else {
                    z = true;
                }
                if (z) {
                    arrayList.add(next);
                }
            }
            for (NavBackStackEntry l : arrayList) {
                Intrinsics.checkNotNullExpressionValue(H, "newDestination");
                l.mo58072l(H);
            }
        }
    }

    @C12580l
    /* renamed from: O */
    public NavBackStackEntry mo58115O() {
        T t;
        Iterator<T> it = CollectionsKt___CollectionsKt.m40566S4(mo58093C()).iterator();
        if (it.hasNext()) {
            it.next();
        }
        Iterator<T> it2 = SequencesKt__SequencesKt.m44588e(it).iterator();
        while (true) {
            if (!it2.hasNext()) {
                t = null;
                break;
            }
            t = it2.next();
            if (!(((NavBackStackEntry) t).mo58065f() instanceof NavGraph)) {
                break;
            }
        }
        return (NavBackStackEntry) t;
    }

    /* renamed from: O0 */
    public final void mo58116O0(@C12579k Lifecycle.State state) {
        Intrinsics.checkNotNullParameter(state, "<set-?>");
        this.f50401s = state;
    }

    @C12579k
    /* renamed from: P */
    public C19395b1 mo58117P(@C0329d0 int i) {
        if (this.f50399q != null) {
            NavBackStackEntry D = mo58094D(i);
            if (D.mo58065f() instanceof NavGraph) {
                return D;
            }
            throw new IllegalArgumentException(("No NavGraph with ID " + i + " is on the NavController's back stack").toString());
        }
        throw new IllegalStateException("You must call setViewModelStore() before calling getViewModelStoreOwner().".toString());
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* renamed from: P0 */
    public void mo58118P0(@C12579k C19499w wVar) {
        Lifecycle lifecycle;
        Intrinsics.checkNotNullParameter(wVar, "owner");
        if (!Intrinsics.areEqual((Object) wVar, (Object) this.f50397o)) {
            C19499w wVar2 = this.f50397o;
            if (!(wVar2 == null || (lifecycle = wVar2.getLifecycle()) == null)) {
                lifecycle.mo57467d(this.f50402t);
            }
            this.f50397o = wVar;
            wVar.getLifecycle().mo57464a(this.f50402t);
        }
    }

    @C12579k
    /* renamed from: Q */
    public final C11952u<List<NavBackStackEntry>> mo58119Q() {
        return this.f50392j;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* renamed from: Q0 */
    public void mo58120Q0(@C12579k C19795r0 r0Var) {
        Intrinsics.checkNotNullParameter(r0Var, "navigatorProvider");
        if (mo58093C().isEmpty()) {
            this.f50405w = r0Var;
            return;
        }
        throw new IllegalStateException("NavigatorProvider must be set before setGraph call".toString());
    }

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x003e, code lost:
        if (r1 != false) goto L_0x0040;
     */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x006b  */
    @androidx.annotation.C0353k0
    /* renamed from: R */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo58121R(@org.jetbrains.annotations.C12580l android.content.Intent r20) {
        /*
            r19 = this;
            r6 = r19
            r0 = r20
            r7 = 0
            if (r0 != 0) goto L_0x0008
            return r7
        L_0x0008:
            android.os.Bundle r1 = r20.getExtras()
            r8 = 0
            if (r1 == 0) goto L_0x0016
            java.lang.String r2 = "android-support-nav:controller:deepLinkIds"
            int[] r2 = r1.getIntArray(r2)
            goto L_0x0017
        L_0x0016:
            r2 = r8
        L_0x0017:
            if (r1 == 0) goto L_0x0020
            java.lang.String r3 = "android-support-nav:controller:deepLinkArgs"
            java.util.ArrayList r3 = r1.getParcelableArrayList(r3)
            goto L_0x0021
        L_0x0020:
            r3 = r8
        L_0x0021:
            android.os.Bundle r4 = new android.os.Bundle
            r4.<init>()
            if (r1 == 0) goto L_0x002f
            java.lang.String r5 = "android-support-nav:controller:deepLinkExtras"
            android.os.Bundle r1 = r1.getBundle(r5)
            goto L_0x0030
        L_0x002f:
            r1 = r8
        L_0x0030:
            if (r1 == 0) goto L_0x0035
            r4.putAll(r1)
        L_0x0035:
            r9 = 1
            if (r2 == 0) goto L_0x0040
            int r1 = r2.length
            if (r1 != 0) goto L_0x003d
            r1 = r9
            goto L_0x003e
        L_0x003d:
            r1 = r7
        L_0x003e:
            if (r1 == 0) goto L_0x0068
        L_0x0040:
            androidx.navigation.NavGraph r1 = r6.f50386d
            kotlin.jvm.internal.Intrinsics.checkNotNull(r1)
            androidx.navigation.x r5 = new androidx.navigation.x
            r5.<init>(r0)
            androidx.navigation.NavDestination$b r1 = r1.mo58247o0(r5)
            if (r1 == 0) goto L_0x0068
            androidx.navigation.NavDestination r2 = r1.mo58266g()
            int[] r3 = androidx.navigation.NavDestination.m91545H(r2, r8, r9, r8)
            android.os.Bundle r1 = r1.mo58267q()
            android.os.Bundle r1 = r2.mo58249r(r1)
            if (r1 == 0) goto L_0x0065
            r4.putAll(r1)
        L_0x0065:
            r10 = r3
            r3 = r8
            goto L_0x0069
        L_0x0068:
            r10 = r2
        L_0x0069:
            if (r10 == 0) goto L_0x01de
            int r1 = r10.length
            if (r1 != 0) goto L_0x0070
            r1 = r9
            goto L_0x0071
        L_0x0070:
            r1 = r7
        L_0x0071:
            if (r1 == 0) goto L_0x0075
            goto L_0x01de
        L_0x0075:
            java.lang.String r1 = r6.mo58092B(r10)
            if (r1 == 0) goto L_0x0091
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Could not find destination "
            r2.append(r3)
            r2.append(r1)
            java.lang.String r1 = " in the navigation graph, ignoring the deep link from "
            r2.append(r1)
            r2.append(r0)
            return r7
        L_0x0091:
            java.lang.String r1 = "android-support-nav:controller:deepLinkIntent"
            r4.putParcelable(r1, r0)
            int r1 = r10.length
            android.os.Bundle[] r11 = new android.os.Bundle[r1]
            r2 = r7
        L_0x009a:
            if (r2 >= r1) goto L_0x00b6
            android.os.Bundle r5 = new android.os.Bundle
            r5.<init>()
            r5.putAll(r4)
            if (r3 == 0) goto L_0x00b1
            java.lang.Object r12 = r3.get(r2)
            android.os.Bundle r12 = (android.os.Bundle) r12
            if (r12 == 0) goto L_0x00b1
            r5.putAll(r12)
        L_0x00b1:
            r11[r2] = r5
            int r2 = r2 + 1
            goto L_0x009a
        L_0x00b6:
            int r1 = r20.getFlags()
            r2 = 268435456(0x10000000, float:2.5243549E-29)
            r2 = r2 & r1
            if (r2 == 0) goto L_0x00e5
            r3 = 32768(0x8000, float:4.5918E-41)
            r1 = r1 & r3
            if (r1 != 0) goto L_0x00e5
            r0.addFlags(r3)
            android.content.Context r1 = r6.f50383a
            androidx.core.app.d6 r1 = androidx.core.app.C17061d6.m78884r(r1)
            androidx.core.app.d6 r0 = r1.mo51262h(r0)
            java.lang.String r1 = "create(context)\n        …ntWithParentStack(intent)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
            r0.mo51259X()
            android.app.Activity r0 = r6.f50384b
            if (r0 == 0) goto L_0x00e4
            r0.finish()
            r0.overridePendingTransition(r7, r7)
        L_0x00e4:
            return r9
        L_0x00e5:
            java.lang.String r12 = "Deep Linking failed: destination "
            if (r2 == 0) goto L_0x014c
            kotlin.collections.i r0 = r19.mo58093C()
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x0105
            androidx.navigation.NavGraph r0 = r6.f50386d
            kotlin.jvm.internal.Intrinsics.checkNotNull(r0)
            int r1 = r0.mo58238f0()
            r2 = 1
            r3 = 0
            r4 = 4
            r5 = 0
            r0 = r19
            m91377C0(r0, r1, r2, r3, r4, r5)
        L_0x0105:
            int r0 = r10.length
            if (r7 >= r0) goto L_0x014b
            r0 = r10[r7]
            int r1 = r7 + 1
            r2 = r11[r7]
            androidx.navigation.NavDestination r3 = r6.mo58165y(r0)
            if (r3 == 0) goto L_0x0122
            androidx.navigation.NavController$handleDeepLink$2 r0 = new androidx.navigation.NavController$handleDeepLink$2
            r0.<init>(r3, r6)
            androidx.navigation.k0 r0 = androidx.navigation.C19765l0.m91906a(r0)
            r6.mo58141f0(r3, r2, r0, r8)
            r7 = r1
            goto L_0x0105
        L_0x0122:
            androidx.navigation.NavDestination$Companion r1 = androidx.navigation.NavDestination.f50441x
            android.content.Context r2 = r6.f50383a
            java.lang.String r0 = r1.mo58259b(r2, r0)
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r12)
            r2.append(r0)
            java.lang.String r0 = " cannot be found from the current destination "
            r2.append(r0)
            androidx.navigation.NavDestination r0 = r19.mo58103I()
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            r1.<init>(r0)
            throw r1
        L_0x014b:
            return r9
        L_0x014c:
            androidx.navigation.NavGraph r0 = r6.f50386d
            int r1 = r10.length
            r2 = r7
        L_0x0150:
            if (r2 >= r1) goto L_0x01db
            r3 = r10[r2]
            r4 = r11[r2]
            if (r2 != 0) goto L_0x015b
            androidx.navigation.NavGraph r5 = r6.f50386d
            goto L_0x0162
        L_0x015b:
            kotlin.jvm.internal.Intrinsics.checkNotNull(r0)
            androidx.navigation.NavDestination r5 = r0.mo58273J0(r3)
        L_0x0162:
            if (r5 == 0) goto L_0x01b6
            int r3 = r10.length
            int r3 = r3 - r9
            if (r2 == r3) goto L_0x018b
            boolean r3 = r5 instanceof androidx.navigation.NavGraph
            if (r3 == 0) goto L_0x01b3
            androidx.navigation.NavGraph r5 = (androidx.navigation.NavGraph) r5
        L_0x016e:
            kotlin.jvm.internal.Intrinsics.checkNotNull(r5)
            int r0 = r5.mo58280S0()
            androidx.navigation.NavDestination r0 = r5.mo58273J0(r0)
            boolean r0 = r0 instanceof androidx.navigation.NavGraph
            if (r0 == 0) goto L_0x0189
            int r0 = r5.mo58280S0()
            androidx.navigation.NavDestination r0 = r5.mo58273J0(r0)
            r5 = r0
            androidx.navigation.NavGraph r5 = (androidx.navigation.NavGraph) r5
            goto L_0x016e
        L_0x0189:
            r0 = r5
            goto L_0x01b3
        L_0x018b:
            androidx.navigation.k0$a r13 = new androidx.navigation.k0$a
            r13.<init>()
            androidx.navigation.NavGraph r3 = r6.f50386d
            kotlin.jvm.internal.Intrinsics.checkNotNull(r3)
            int r14 = r3.mo58238f0()
            r15 = 1
            r16 = 0
            r17 = 4
            r18 = 0
            androidx.navigation.k0$a r3 = androidx.navigation.C19761k0.C19762a.m91893k(r13, r14, r15, r16, r17, r18)
            androidx.navigation.k0$a r3 = r3.mo58464b(r7)
            androidx.navigation.k0$a r3 = r3.mo58465c(r7)
            androidx.navigation.k0 r3 = r3.mo58463a()
            r6.mo58141f0(r5, r4, r3, r8)
        L_0x01b3:
            int r2 = r2 + 1
            goto L_0x0150
        L_0x01b6:
            androidx.navigation.NavDestination$Companion r1 = androidx.navigation.NavDestination.f50441x
            android.content.Context r2 = r6.f50383a
            java.lang.String r1 = r1.mo58259b(r2, r3)
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r12)
            r3.append(r1)
            java.lang.String r1 = " cannot be found in graph "
            r3.append(r1)
            r3.append(r0)
            java.lang.String r0 = r3.toString()
            r2.<init>(r0)
            throw r2
        L_0x01db:
            r6.f50389g = r9
            return r9
        L_0x01de:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.navigation.NavController.mo58121R(android.content.Intent):boolean");
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* renamed from: R0 */
    public void mo58122R0(@C12579k OnBackPressedDispatcher onBackPressedDispatcher) {
        Intrinsics.checkNotNullParameter(onBackPressedDispatcher, "dispatcher");
        if (!Intrinsics.areEqual((Object) onBackPressedDispatcher, (Object) this.f50398p)) {
            C19499w wVar = this.f50397o;
            if (wVar != null) {
                this.f50403u.mo968h();
                this.f50398p = onBackPressedDispatcher;
                onBackPressedDispatcher.mo764c(wVar, this.f50403u);
                Lifecycle lifecycle = wVar.getLifecycle();
                lifecycle.mo57467d(this.f50402t);
                lifecycle.mo57464a(this.f50402t);
                return;
            }
            throw new IllegalStateException("You must call setLifecycleOwner() before calling setOnBackPressedDispatcher()".toString());
        }
    }

    /* renamed from: S */
    public final List<NavBackStackEntry> mo58123S(C10944i<NavBackStackEntryState> iVar) {
        NavDestination navDestination;
        ArrayList arrayList = new ArrayList();
        NavBackStackEntry l0 = mo58093C().mo22301l0();
        if (l0 == null || (navDestination = l0.mo58065f()) == null) {
            navDestination = mo58107K();
        }
        if (iVar != null) {
            for (NavBackStackEntryState navBackStackEntryState : iVar) {
                NavDestination z = mo58167z(navDestination, navBackStackEntryState.mo58080b());
                if (z != null) {
                    arrayList.add(navBackStackEntryState.mo58084e(this.f50383a, z, mo58109L(), this.f50399q));
                    navDestination = z;
                } else {
                    String b = NavDestination.f50441x.mo58259b(this.f50383a, navBackStackEntryState.mo58080b());
                    throw new IllegalStateException(("Restore State failed: destination " + b + " cannot be found from the current destination " + navDestination).toString());
                }
            }
        }
        return arrayList;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* renamed from: S0 */
    public void mo58124S0(@C12579k C19392a1 a1Var) {
        Intrinsics.checkNotNullParameter(a1Var, "viewModelStore");
        C19797s sVar = this.f50399q;
        C19797s.C19799b bVar = C19797s.f50648b;
        if (!Intrinsics.areEqual((Object) sVar, (Object) bVar.mo58568a(a1Var))) {
            if (mo58093C().isEmpty()) {
                this.f50399q = bVar.mo58568a(a1Var);
                return;
            }
            throw new IllegalStateException("ViewModelStore should be set before setGraph call".toString());
        }
    }

    /* renamed from: T0 */
    public final boolean mo58125T0() {
        boolean z;
        Bundle bundle;
        int i = 0;
        if (!this.f50389g) {
            return false;
        }
        Activity activity = this.f50384b;
        Intrinsics.checkNotNull(activity);
        Intent intent = activity.getIntent();
        Bundle extras = intent.getExtras();
        Intrinsics.checkNotNull(extras);
        int[] intArray = extras.getIntArray(f50371P);
        Intrinsics.checkNotNull(intArray);
        List<Integer> sz = ArraysKt___ArraysKt.m40203sz(intArray);
        ArrayList parcelableArrayList = extras.getParcelableArrayList(f50372Q);
        int intValue = ((Number) C10994x.m42351L0(sz)).intValue();
        if (parcelableArrayList != null) {
            Bundle bundle2 = (Bundle) C10994x.m42351L0(parcelableArrayList);
        }
        if (sz.isEmpty()) {
            return false;
        }
        NavDestination z2 = mo58167z(mo58107K(), intValue);
        if (z2 instanceof NavGraph) {
            intValue = NavGraph.f50458E0.mo58289a((NavGraph) z2).mo58238f0();
        }
        NavDestination I = mo58103I();
        if (I == null || intValue != I.mo58238f0()) {
            z = false;
        } else {
            z = true;
        }
        if (!z) {
            return false;
        }
        C19801t u = mo58159u();
        Bundle b = C17779d.m81164b(C11078d1.m42659a(f50375T, intent));
        Bundle bundle3 = extras.getBundle(f50373R);
        if (bundle3 != null) {
            b.putAll(bundle3);
        }
        u.mo58577k(b);
        for (Object next : sz) {
            int i2 = i + 1;
            if (i < 0) {
                CollectionsKt__CollectionsKt.m40459W();
            }
            int intValue2 = ((Number) next).intValue();
            if (parcelableArrayList != null) {
                bundle = (Bundle) parcelableArrayList.get(i);
            } else {
                bundle = null;
            }
            u.mo58570b(intValue2, bundle);
            i = i2;
        }
        u.mo58574h().mo51259X();
        Activity activity2 = this.f50384b;
        if (activity2 != null) {
            activity2.finish();
        }
        return true;
    }

    /* renamed from: U */
    public final void mo58126U(NavBackStackEntry navBackStackEntry, NavBackStackEntry navBackStackEntry2) {
        this.f50393k.put(navBackStackEntry, navBackStackEntry2);
        if (this.f50394l.get(navBackStackEntry2) == null) {
            this.f50394l.put(navBackStackEntry2, new AtomicInteger(0));
        }
        AtomicInteger atomicInteger = this.f50394l.get(navBackStackEntry2);
        Intrinsics.checkNotNull(atomicInteger);
        atomicInteger.incrementAndGet();
    }

    /* renamed from: U0 */
    public final boolean mo58127U0() {
        NavDestination I = mo58103I();
        Intrinsics.checkNotNull(I);
        int f0 = I.mo58238f0();
        for (NavGraph j0 = I.mo58243j0(); j0 != null; j0 = j0.mo58243j0()) {
            if (j0.mo58280S0() != f0) {
                Bundle bundle = new Bundle();
                Activity activity = this.f50384b;
                if (activity != null) {
                    Intrinsics.checkNotNull(activity);
                    if (activity.getIntent() != null) {
                        Activity activity2 = this.f50384b;
                        Intrinsics.checkNotNull(activity2);
                        if (activity2.getIntent().getData() != null) {
                            Activity activity3 = this.f50384b;
                            Intrinsics.checkNotNull(activity3);
                            bundle.putParcelable(f50375T, activity3.getIntent());
                            NavGraph navGraph = this.f50386d;
                            Intrinsics.checkNotNull(navGraph);
                            Activity activity4 = this.f50384b;
                            Intrinsics.checkNotNull(activity4);
                            Intent intent = activity4.getIntent();
                            Intrinsics.checkNotNullExpressionValue(intent, "activity!!.intent");
                            NavDestination.C19686b o0 = navGraph.mo58247o0(new C19848x(intent));
                            if (o0 != null) {
                                bundle.putAll(o0.mo58266g().mo58249r(o0.mo58267q()));
                            }
                        }
                    }
                }
                C19801t.m92072r(new C19801t(this), j0.mo58238f0(), (Bundle) null, 2, (Object) null).mo58577k(bundle).mo58574h().mo51259X();
                Activity activity5 = this.f50384b;
                if (activity5 == null) {
                    return true;
                }
                activity5.finish();
                return true;
            }
            f0 = j0.mo58238f0();
        }
        return false;
    }

    @C0353k0
    /* renamed from: V */
    public void mo58128V(@C0329d0 int i) {
        mo58130W(i, (Bundle) null);
    }

    @C12580l
    /* renamed from: V0 */
    public final NavBackStackEntry mo58129V0(@C12579k NavBackStackEntry navBackStackEntry) {
        Intrinsics.checkNotNullParameter(navBackStackEntry, "child");
        NavBackStackEntry remove = this.f50393k.remove(navBackStackEntry);
        Integer num = null;
        if (remove == null) {
            return null;
        }
        AtomicInteger atomicInteger = this.f50394l.get(remove);
        if (atomicInteger != null) {
            num = Integer.valueOf(atomicInteger.decrementAndGet());
        }
        if (num != null && num.intValue() == 0) {
            NavControllerNavigatorState navControllerNavigatorState = this.f50406x.get(this.f50405w.mo58562f(remove.mo58065f().mo58242i0()));
            if (navControllerNavigatorState != null) {
                navControllerNavigatorState.mo58170e(remove);
            }
            this.f50394l.remove(remove);
        }
        return remove;
    }

    @C0353k0
    /* renamed from: W */
    public void mo58130W(@C0329d0 int i, @C12580l Bundle bundle) {
        mo58132X(i, bundle, (C19761k0) null);
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x0059  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x0107  */
    /* renamed from: W0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo58131W0() {
        /*
            r11 = this;
            kotlin.collections.i r0 = r11.mo58093C()
            java.util.List r0 = kotlin.collections.CollectionsKt___CollectionsKt.m40572T5(r0)
            boolean r1 = r0.isEmpty()
            if (r1 == 0) goto L_0x000f
            return
        L_0x000f:
            java.lang.Object r1 = kotlin.collections.CollectionsKt___CollectionsKt.m40653k3(r0)
            androidx.navigation.NavBackStackEntry r1 = (androidx.navigation.NavBackStackEntry) r1
            androidx.navigation.NavDestination r1 = r1.mo58065f()
            boolean r2 = r1 instanceof androidx.navigation.C19751g
            r3 = 0
            if (r2 == 0) goto L_0x0042
            r2 = r0
            java.lang.Iterable r2 = (java.lang.Iterable) r2
            java.util.List r2 = kotlin.collections.CollectionsKt___CollectionsKt.m40566S4(r2)
            java.util.Iterator r2 = r2.iterator()
        L_0x0029:
            boolean r4 = r2.hasNext()
            if (r4 == 0) goto L_0x0042
            java.lang.Object r4 = r2.next()
            androidx.navigation.NavBackStackEntry r4 = (androidx.navigation.NavBackStackEntry) r4
            androidx.navigation.NavDestination r4 = r4.mo58065f()
            boolean r5 = r4 instanceof androidx.navigation.NavGraph
            if (r5 != 0) goto L_0x0029
            boolean r5 = r4 instanceof androidx.navigation.C19751g
            if (r5 != 0) goto L_0x0029
            goto L_0x0043
        L_0x0042:
            r4 = r3
        L_0x0043:
            java.util.HashMap r2 = new java.util.HashMap
            r2.<init>()
            r5 = r0
            java.lang.Iterable r5 = (java.lang.Iterable) r5
            java.util.List r5 = kotlin.collections.CollectionsKt___CollectionsKt.m40566S4(r5)
            java.util.Iterator r5 = r5.iterator()
        L_0x0053:
            boolean r6 = r5.hasNext()
            if (r6 == 0) goto L_0x00fd
            java.lang.Object r6 = r5.next()
            androidx.navigation.NavBackStackEntry r6 = (androidx.navigation.NavBackStackEntry) r6
            androidx.lifecycle.Lifecycle$State r7 = r6.mo58067h()
            androidx.navigation.NavDestination r8 = r6.mo58065f()
            if (r1 == 0) goto L_0x00d3
            int r9 = r8.mo58238f0()
            int r10 = r1.mo58238f0()
            if (r9 != r10) goto L_0x00d3
            androidx.lifecycle.Lifecycle$State r8 = androidx.lifecycle.Lifecycle.State.RESUMED
            if (r7 == r8) goto L_0x00ce
            androidx.navigation.r0 r7 = r11.mo58113N()
            androidx.navigation.NavDestination r9 = r6.mo58065f()
            java.lang.String r9 = r9.mo58242i0()
            androidx.navigation.Navigator r7 = r7.mo58562f(r9)
            java.util.Map<androidx.navigation.Navigator<? extends androidx.navigation.NavDestination>, androidx.navigation.NavController$NavControllerNavigatorState> r9 = r11.f50406x
            java.lang.Object r7 = r9.get(r7)
            androidx.navigation.NavController$NavControllerNavigatorState r7 = (androidx.navigation.NavController.NavControllerNavigatorState) r7
            if (r7 == 0) goto L_0x00a8
            kotlinx.coroutines.flow.u r7 = r7.mo58590c()
            if (r7 == 0) goto L_0x00a8
            java.lang.Object r7 = r7.getValue()
            java.util.Set r7 = (java.util.Set) r7
            if (r7 == 0) goto L_0x00a8
            boolean r7 = r7.contains(r6)
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r7)
            goto L_0x00a9
        L_0x00a8:
            r7 = r3
        L_0x00a9:
            java.lang.Boolean r9 = java.lang.Boolean.TRUE
            boolean r7 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r7, (java.lang.Object) r9)
            if (r7 != 0) goto L_0x00c9
            java.util.Map<androidx.navigation.NavBackStackEntry, java.util.concurrent.atomic.AtomicInteger> r7 = r11.f50394l
            java.lang.Object r7 = r7.get(r6)
            java.util.concurrent.atomic.AtomicInteger r7 = (java.util.concurrent.atomic.AtomicInteger) r7
            r9 = 0
            if (r7 == 0) goto L_0x00c3
            int r7 = r7.get()
            if (r7 != 0) goto L_0x00c3
            r9 = 1
        L_0x00c3:
            if (r9 != 0) goto L_0x00c9
            r2.put(r6, r8)
            goto L_0x00ce
        L_0x00c9:
            androidx.lifecycle.Lifecycle$State r7 = androidx.lifecycle.Lifecycle.State.STARTED
            r2.put(r6, r7)
        L_0x00ce:
            androidx.navigation.NavGraph r1 = r1.mo58243j0()
            goto L_0x0053
        L_0x00d3:
            if (r4 == 0) goto L_0x00f6
            int r8 = r8.mo58238f0()
            int r9 = r4.mo58238f0()
            if (r8 != r9) goto L_0x00f6
            androidx.lifecycle.Lifecycle$State r8 = androidx.lifecycle.Lifecycle.State.RESUMED
            if (r7 != r8) goto L_0x00e9
            androidx.lifecycle.Lifecycle$State r7 = androidx.lifecycle.Lifecycle.State.STARTED
            r6.mo58073m(r7)
            goto L_0x00f0
        L_0x00e9:
            androidx.lifecycle.Lifecycle$State r8 = androidx.lifecycle.Lifecycle.State.STARTED
            if (r7 == r8) goto L_0x00f0
            r2.put(r6, r8)
        L_0x00f0:
            androidx.navigation.NavGraph r4 = r4.mo58243j0()
            goto L_0x0053
        L_0x00f6:
            androidx.lifecycle.Lifecycle$State r7 = androidx.lifecycle.Lifecycle.State.CREATED
            r6.mo58073m(r7)
            goto L_0x0053
        L_0x00fd:
            java.util.Iterator r0 = r0.iterator()
        L_0x0101:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x011d
            java.lang.Object r1 = r0.next()
            androidx.navigation.NavBackStackEntry r1 = (androidx.navigation.NavBackStackEntry) r1
            java.lang.Object r3 = r2.get(r1)
            androidx.lifecycle.Lifecycle$State r3 = (androidx.lifecycle.Lifecycle.State) r3
            if (r3 == 0) goto L_0x0119
            r1.mo58073m(r3)
            goto L_0x0101
        L_0x0119:
            r1.mo58074n()
            goto L_0x0101
        L_0x011d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.navigation.NavController.mo58131W0():void");
    }

    @C0353k0
    /* renamed from: X */
    public void mo58132X(@C0329d0 int i, @C12580l Bundle bundle, @C12580l C19761k0 k0Var) {
        mo58134Y(i, bundle, k0Var, (Navigator.C19688a) null);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000b, code lost:
        if (mo58105J() > 1) goto L_0x000f;
     */
    /* renamed from: X0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo58133X0() {
        /*
            r3 = this;
            androidx.activity.t r0 = r3.f50403u
            boolean r1 = r3.f50404v
            if (r1 == 0) goto L_0x000e
            int r1 = r3.mo58105J()
            r2 = 1
            if (r1 <= r2) goto L_0x000e
            goto L_0x000f
        L_0x000e:
            r2 = 0
        L_0x000f:
            r0.mo970j(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.navigation.NavController.mo58133X0():void");
    }

    @C0353k0
    /* renamed from: Y */
    public void mo58134Y(@C0329d0 int i, @C12580l Bundle bundle, @C12580l C19761k0 k0Var, @C12580l Navigator.C19688a aVar) {
        NavDestination navDestination;
        int i2;
        boolean z;
        if (mo58093C().isEmpty()) {
            navDestination = this.f50386d;
        } else {
            navDestination = mo58093C().last().mo58065f();
        }
        if (navDestination != null) {
            C19757j M = navDestination.mo58235M(i);
            Bundle bundle2 = null;
            if (M != null) {
                if (k0Var == null) {
                    k0Var = M.mo58434c();
                }
                i2 = M.mo58433b();
                Bundle a = M.mo58432a();
                if (a != null) {
                    bundle2 = new Bundle();
                    bundle2.putAll(a);
                }
            } else {
                i2 = i;
            }
            if (bundle != null) {
                if (bundle2 == null) {
                    bundle2 = new Bundle();
                }
                bundle2.putAll(bundle);
            }
            if (i2 != 0 || k0Var == null || k0Var.mo58456f() == -1) {
                boolean z2 = true;
                if (i2 != 0) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    NavDestination y = mo58165y(i2);
                    if (y == null) {
                        NavDestination.Companion companion = NavDestination.f50441x;
                        String b = companion.mo58259b(this.f50383a, i2);
                        if (M != null) {
                            z2 = false;
                        }
                        if (!z2) {
                            throw new IllegalArgumentException(("Navigation destination " + b + " referenced from action " + companion.mo58259b(this.f50383a, i) + " cannot be found from the current destination " + navDestination).toString());
                        }
                        throw new IllegalArgumentException("Navigation action/destination " + b + " cannot be found from the current destination " + navDestination);
                    }
                    mo58141f0(y, bundle2, k0Var, aVar);
                    return;
                }
                throw new IllegalArgumentException("Destination id == 0 can only be used in conjunction with a valid navOptions.popUpTo".toString());
            }
            mo58158t0(k0Var.mo58456f(), k0Var.mo58458h());
            return;
        }
        throw new IllegalStateException("no current navigation node");
    }

    @C0353k0
    /* renamed from: Z */
    public void mo58135Z(@C12579k Uri uri) {
        Intrinsics.checkNotNullParameter(uri, C19758j0.f50575e);
        mo58138c0(new C19848x(uri, (String) null, (String) null));
    }

    @C0353k0
    /* renamed from: a0 */
    public void mo58136a0(@C12579k Uri uri, @C12580l C19761k0 k0Var) {
        Intrinsics.checkNotNullParameter(uri, C19758j0.f50575e);
        mo58140e0(new C19848x(uri, (String) null, (String) null), k0Var, (Navigator.C19688a) null);
    }

    @C0353k0
    /* renamed from: b0 */
    public void mo58137b0(@C12579k Uri uri, @C12580l C19761k0 k0Var, @C12580l Navigator.C19688a aVar) {
        Intrinsics.checkNotNullParameter(uri, C19758j0.f50575e);
        mo58140e0(new C19848x(uri, (String) null, (String) null), k0Var, aVar);
    }

    @C0353k0
    /* renamed from: c0 */
    public void mo58138c0(@C12579k C19848x xVar) {
        Intrinsics.checkNotNullParameter(xVar, "request");
        mo58139d0(xVar, (C19761k0) null);
    }

    @C0353k0
    /* renamed from: d0 */
    public void mo58139d0(@C12579k C19848x xVar, @C12580l C19761k0 k0Var) {
        Intrinsics.checkNotNullParameter(xVar, "request");
        mo58140e0(xVar, k0Var, (Navigator.C19688a) null);
    }

    @C0353k0
    /* renamed from: e0 */
    public void mo58140e0(@C12579k C19848x xVar, @C12580l C19761k0 k0Var, @C12580l Navigator.C19688a aVar) {
        Intrinsics.checkNotNullParameter(xVar, "request");
        NavGraph navGraph = this.f50386d;
        Intrinsics.checkNotNull(navGraph);
        NavDestination.C19686b o0 = navGraph.mo58247o0(xVar);
        if (o0 != null) {
            Bundle r = o0.mo58266g().mo58249r(o0.mo58267q());
            if (r == null) {
                r = new Bundle();
            }
            NavDestination g = o0.mo58266g();
            Intent intent = new Intent();
            intent.setDataAndType(xVar.mo58626c(), xVar.mo58625b());
            intent.setAction(xVar.mo58624a());
            r.putParcelable(f50375T, intent);
            mo58141f0(g, r, k0Var, aVar);
            return;
        }
        throw new IllegalArgumentException("Navigation destination that matches request " + xVar + " cannot be found in the navigation graph " + this.f50386d);
    }

    /* JADX WARNING: Removed duplicated region for block: B:44:0x011d A[LOOP:1: B:42:0x0117->B:44:0x011d, LOOP_END] */
    @androidx.annotation.C0353k0
    /* renamed from: f0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo58141f0(androidx.navigation.NavDestination r21, android.os.Bundle r22, androidx.navigation.C19761k0 r23, androidx.navigation.Navigator.C19688a r24) {
        /*
            r20 = this;
            r6 = r20
            r3 = r23
            java.util.Map<androidx.navigation.Navigator<? extends androidx.navigation.NavDestination>, androidx.navigation.NavController$NavControllerNavigatorState> r0 = r6.f50406x
            java.util.Collection r0 = r0.values()
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.util.Iterator r0 = r0.iterator()
        L_0x0010:
            boolean r1 = r0.hasNext()
            r2 = 1
            if (r1 == 0) goto L_0x0021
            java.lang.Object r1 = r0.next()
            androidx.navigation.NavController$NavControllerNavigatorState r1 = (androidx.navigation.NavController.NavControllerNavigatorState) r1
            r1.mo58594k(r2)
            goto L_0x0010
        L_0x0021:
            kotlin.jvm.internal.Ref$BooleanRef r7 = new kotlin.jvm.internal.Ref$BooleanRef
            r7.<init>()
            r8 = 0
            if (r3 == 0) goto L_0x0042
            int r0 = r23.mo58456f()
            r1 = -1
            if (r0 == r1) goto L_0x0042
            int r0 = r23.mo58456f()
            boolean r1 = r23.mo58458h()
            boolean r4 = r23.mo58461j()
            boolean r0 = r6.mo58091A0(r0, r1, r4)
            r9 = r0
            goto L_0x0043
        L_0x0042:
            r9 = r8
        L_0x0043:
            android.os.Bundle r0 = r21.mo58249r(r22)
            if (r3 == 0) goto L_0x0051
            boolean r1 = r23.mo58462k()
            if (r1 != r2) goto L_0x0051
            r1 = r2
            goto L_0x0052
        L_0x0051:
            r1 = r8
        L_0x0052:
            if (r1 == 0) goto L_0x0072
            java.util.Map<java.lang.Integer, java.lang.String> r1 = r6.f50395m
            int r4 = r21.mo58238f0()
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            boolean r1 = r1.containsKey(r4)
            if (r1 == 0) goto L_0x0072
            int r1 = r21.mo58238f0()
            r4 = r24
            boolean r0 = r6.mo58104I0(r1, r0, r3, r4)
            r7.element = r0
            goto L_0x0107
        L_0x0072:
            r4 = r24
            androidx.navigation.NavBackStackEntry r1 = r20.mo58099G()
            androidx.navigation.r0 r5 = r6.f50405w
            java.lang.String r10 = r21.mo58242i0()
            androidx.navigation.Navigator r5 = r5.mo58562f(r10)
            if (r3 == 0) goto L_0x008c
            boolean r10 = r23.mo58460i()
            if (r10 != r2) goto L_0x008c
            r10 = r2
            goto L_0x008d
        L_0x008c:
            r10 = r8
        L_0x008d:
            if (r10 == 0) goto L_0x00d8
            if (r1 == 0) goto L_0x00a3
            androidx.navigation.NavDestination r10 = r1.mo58065f()
            if (r10 == 0) goto L_0x00a3
            int r11 = r21.mo58238f0()
            int r10 = r10.mo58238f0()
            if (r11 != r10) goto L_0x00a3
            r10 = r2
            goto L_0x00a4
        L_0x00a3:
            r10 = r8
        L_0x00a4:
            if (r10 == 0) goto L_0x00d8
            kotlin.collections.i r3 = r20.mo58093C()
            java.lang.Object r3 = r3.mo22310r0()
            androidx.navigation.NavBackStackEntry r3 = (androidx.navigation.NavBackStackEntry) r3
            r6.mo58129V0(r3)
            androidx.navigation.NavBackStackEntry r3 = new androidx.navigation.NavBackStackEntry
            r3.<init>(r1, r0)
            kotlin.collections.i r0 = r20.mo58093C()
            r0.mo22308q(r3)
            androidx.navigation.NavDestination r0 = r3.mo58065f()
            androidx.navigation.NavGraph r0 = r0.mo58243j0()
            if (r0 == 0) goto L_0x00d4
            int r0 = r0.mo58238f0()
            androidx.navigation.NavBackStackEntry r0 = r6.mo58094D(r0)
            r6.mo58126U(r3, r0)
        L_0x00d4:
            r5.mo58319g(r3)
            goto L_0x0108
        L_0x00d8:
            androidx.navigation.NavBackStackEntry$a r10 = androidx.navigation.NavBackStackEntry.f50342Y
            android.content.Context r11 = r6.f50383a
            androidx.lifecycle.Lifecycle$State r14 = r20.mo58109L()
            androidx.navigation.s r15 = r6.f50399q
            r16 = 0
            r17 = 0
            r18 = 96
            r19 = 0
            r12 = r21
            r13 = r0
            androidx.navigation.NavBackStackEntry r1 = androidx.navigation.NavBackStackEntry.C19670a.m91363b(r10, r11, r12, r13, r14, r15, r16, r17, r18, r19)
            java.util.List r2 = kotlin.collections.C10976s.m41419k(r1)
            androidx.navigation.NavController$navigate$4 r10 = new androidx.navigation.NavController$navigate$4
            r1 = r21
            r10.<init>(r7, r6, r1, r0)
            r0 = r20
            r1 = r5
            r3 = r23
            r4 = r24
            r5 = r10
            r0.mo58150o0(r1, r2, r3, r4, r5)
        L_0x0107:
            r2 = r8
        L_0x0108:
            r20.mo58133X0()
            java.util.Map<androidx.navigation.Navigator<? extends androidx.navigation.NavDestination>, androidx.navigation.NavController$NavControllerNavigatorState> r0 = r6.f50406x
            java.util.Collection r0 = r0.values()
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.util.Iterator r0 = r0.iterator()
        L_0x0117:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x0127
            java.lang.Object r1 = r0.next()
            androidx.navigation.NavController$NavControllerNavigatorState r1 = (androidx.navigation.NavController.NavControllerNavigatorState) r1
            r1.mo58594k(r8)
            goto L_0x0117
        L_0x0127:
            if (r9 != 0) goto L_0x0134
            boolean r0 = r7.element
            if (r0 != 0) goto L_0x0134
            if (r2 == 0) goto L_0x0130
            goto L_0x0134
        L_0x0130:
            r20.mo58131W0()
            goto L_0x0137
        L_0x0134:
            r20.mo58161v()
        L_0x0137:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.navigation.NavController.mo58141f0(androidx.navigation.NavDestination, android.os.Bundle, androidx.navigation.k0, androidx.navigation.Navigator$a):void");
    }

    @C0353k0
    /* renamed from: g0 */
    public void mo58142g0(@C12579k C19693b0 b0Var) {
        Intrinsics.checkNotNullParameter(b0Var, "directions");
        mo58132X(b0Var.getActionId(), b0Var.getArguments(), (C19761k0) null);
    }

    @C0353k0
    /* renamed from: h0 */
    public void mo58143h0(@C12579k C19693b0 b0Var, @C12580l C19761k0 k0Var) {
        Intrinsics.checkNotNullParameter(b0Var, "directions");
        mo58132X(b0Var.getActionId(), b0Var.getArguments(), k0Var);
    }

    @C0353k0
    /* renamed from: i0 */
    public void mo58144i0(@C12579k C19693b0 b0Var, @C12579k Navigator.C19688a aVar) {
        Intrinsics.checkNotNullParameter(b0Var, "directions");
        Intrinsics.checkNotNullParameter(aVar, "navigatorExtras");
        mo58134Y(b0Var.getActionId(), b0Var.getArguments(), (C19761k0) null, aVar);
    }

    @C11315i
    /* renamed from: j0 */
    public final void mo58145j0(@C12579k String str) {
        Intrinsics.checkNotNullParameter(str, "route");
        m91394n0(this, str, (C19761k0) null, (Navigator.C19688a) null, 6, (Object) null);
    }

    @C11315i
    /* renamed from: k0 */
    public final void mo58146k0(@C12579k String str, @C12580l C19761k0 k0Var) {
        Intrinsics.checkNotNullParameter(str, "route");
        m91394n0(this, str, k0Var, (Navigator.C19688a) null, 4, (Object) null);
    }

    @C11315i
    /* renamed from: l0 */
    public final void mo58147l0(@C12579k String str, @C12580l C19761k0 k0Var, @C12580l Navigator.C19688a aVar) {
        Intrinsics.checkNotNullParameter(str, "route");
        C19848x.C19849a.C19850a aVar2 = C19848x.C19849a.f50714d;
        Uri parse = Uri.parse(NavDestination.f50441x.mo58258a(str));
        Intrinsics.checkExpressionValueIsNotNull(parse, "Uri.parse(this)");
        mo58140e0(aVar2.mo58634c(parse).mo58628a(), k0Var, aVar);
    }

    /* renamed from: m0 */
    public final void mo58148m0(@C12579k String str, @C12579k C11300l<? super NavOptionsBuilder, C11079d2> lVar) {
        Intrinsics.checkNotNullParameter(str, "route");
        Intrinsics.checkNotNullParameter(lVar, "builder");
        m91394n0(this, str, C19765l0.m91906a(lVar), (Navigator.C19688a) null, 4, (Object) null);
    }

    /* renamed from: o */
    public final void mo58149o(NavDestination navDestination, Bundle bundle, NavBackStackEntry navBackStackEntry, List<NavBackStackEntry> list) {
        NavDestination navDestination2;
        Bundle bundle2;
        List<NavBackStackEntry> list2;
        C10944i<NavBackStackEntry> iVar;
        NavBackStackEntry navBackStackEntry2;
        NavDestination navDestination3;
        NavDestination navDestination4;
        NavBackStackEntry navBackStackEntry3;
        NavGraph navGraph;
        NavBackStackEntry navBackStackEntry4;
        Bundle bundle3;
        List<NavBackStackEntry> list3;
        NavDestination navDestination5 = navDestination;
        Bundle bundle4 = bundle;
        NavBackStackEntry navBackStackEntry5 = navBackStackEntry;
        List<NavBackStackEntry> list4 = list;
        NavDestination f = navBackStackEntry.mo58065f();
        if (!(f instanceof C19751g)) {
            while (!mo58093C().isEmpty() && (mo58093C().last().mo58065f() instanceof C19751g)) {
                if (!m91377C0(this, mo58093C().last().mo58065f().mo58238f0(), true, false, 4, (Object) null)) {
                    break;
                }
            }
        }
        C10944i iVar2 = new C10944i();
        NavBackStackEntry navBackStackEntry6 = null;
        if (navDestination5 instanceof NavGraph) {
            NavGraph navGraph2 = f;
            while (true) {
                Intrinsics.checkNotNull(navGraph2);
                NavGraph j0 = navGraph2.mo58243j0();
                if (j0 != null) {
                    ListIterator<NavBackStackEntry> listIterator = list4.listIterator(list.size());
                    while (true) {
                        if (!listIterator.hasPrevious()) {
                            navBackStackEntry4 = null;
                            break;
                        }
                        navBackStackEntry4 = listIterator.previous();
                        if (Intrinsics.areEqual((Object) navBackStackEntry4.mo58065f(), (Object) j0)) {
                            break;
                        }
                    }
                    NavBackStackEntry navBackStackEntry7 = navBackStackEntry4;
                    if (navBackStackEntry7 == null) {
                        navDestination2 = f;
                        list3 = list4;
                        bundle3 = bundle4;
                        NavBackStackEntry b = NavBackStackEntry.C19670a.m91363b(NavBackStackEntry.f50342Y, this.f50383a, j0, bundle, mo58109L(), this.f50399q, (String) null, (Bundle) null, 96, (Object) null);
                        navBackStackEntry2 = navBackStackEntry5;
                        navBackStackEntry7 = b;
                    } else {
                        navDestination2 = f;
                        list3 = list4;
                        navBackStackEntry2 = navBackStackEntry5;
                        bundle3 = bundle4;
                    }
                    iVar2.mo22298i(navBackStackEntry7);
                    if (!(!mo58093C().isEmpty()) || mo58093C().last().mo58065f() != j0) {
                        list2 = list3;
                        bundle2 = bundle3;
                        navGraph = j0;
                        iVar = iVar2;
                    } else {
                        list2 = list3;
                        bundle2 = bundle3;
                        navGraph = j0;
                        iVar = iVar2;
                        m91378E0(this, mo58093C().last(), false, (C10944i) null, 6, (Object) null);
                    }
                } else {
                    navGraph = j0;
                    iVar = iVar2;
                    navDestination2 = f;
                    list2 = list4;
                    navBackStackEntry2 = navBackStackEntry5;
                    bundle2 = bundle4;
                }
                if (navGraph == null || navGraph == navDestination5) {
                    break;
                }
                navBackStackEntry5 = navBackStackEntry2;
                navGraph2 = navGraph;
                iVar2 = iVar;
                bundle4 = bundle2;
                list4 = list2;
                f = navDestination2;
            }
        } else {
            iVar = iVar2;
            navDestination2 = f;
            list2 = list4;
            navBackStackEntry2 = navBackStackEntry5;
            bundle2 = bundle4;
        }
        if (iVar.isEmpty()) {
            navDestination3 = navDestination2;
        } else {
            navDestination3 = ((NavBackStackEntry) iVar.first()).mo58065f();
        }
        while (navDestination3 != null && mo58165y(navDestination3.mo58238f0()) == null) {
            navDestination3 = navDestination3.mo58243j0();
            if (navDestination3 != null) {
                ListIterator<NavBackStackEntry> listIterator2 = list2.listIterator(list.size());
                while (true) {
                    if (!listIterator2.hasPrevious()) {
                        navBackStackEntry3 = null;
                        break;
                    }
                    navBackStackEntry3 = listIterator2.previous();
                    if (Intrinsics.areEqual((Object) navBackStackEntry3.mo58065f(), (Object) navDestination3)) {
                        break;
                    }
                }
                NavBackStackEntry navBackStackEntry8 = navBackStackEntry3;
                if (navBackStackEntry8 == null) {
                    navBackStackEntry8 = NavBackStackEntry.C19670a.m91363b(NavBackStackEntry.f50342Y, this.f50383a, navDestination3, navDestination3.mo58249r(bundle2), mo58109L(), this.f50399q, (String) null, (Bundle) null, 96, (Object) null);
                }
                iVar.mo22298i(navBackStackEntry8);
            }
        }
        if (!iVar.isEmpty()) {
            navDestination2 = ((NavBackStackEntry) iVar.first()).mo58065f();
        }
        while (!mo58093C().isEmpty() && (mo58093C().last().mo58065f() instanceof NavGraph) && ((NavGraph) mo58093C().last().mo58065f()).mo58274K0(navDestination2.mo58238f0(), false) == null) {
            m91378E0(this, mo58093C().last(), false, (C10944i) null, 6, (Object) null);
        }
        NavBackStackEntry Q = mo58093C().mo22286Q();
        if (Q == null) {
            Q = (NavBackStackEntry) iVar.mo22286Q();
        }
        if (Q != null) {
            navDestination4 = Q.mo58065f();
        } else {
            navDestination4 = null;
        }
        if (!Intrinsics.areEqual((Object) navDestination4, (Object) this.f50386d)) {
            ListIterator<NavBackStackEntry> listIterator3 = list2.listIterator(list.size());
            while (true) {
                if (!listIterator3.hasPrevious()) {
                    break;
                }
                NavBackStackEntry previous = listIterator3.previous();
                NavDestination f2 = previous.mo58065f();
                NavGraph navGraph3 = this.f50386d;
                Intrinsics.checkNotNull(navGraph3);
                if (Intrinsics.areEqual((Object) f2, (Object) navGraph3)) {
                    navBackStackEntry6 = previous;
                    break;
                }
            }
            NavBackStackEntry navBackStackEntry9 = navBackStackEntry6;
            if (navBackStackEntry9 == null) {
                NavBackStackEntry.C19670a aVar = NavBackStackEntry.f50342Y;
                Context context = this.f50383a;
                NavGraph navGraph4 = this.f50386d;
                Intrinsics.checkNotNull(navGraph4);
                NavGraph navGraph5 = this.f50386d;
                Intrinsics.checkNotNull(navGraph5);
                navBackStackEntry9 = NavBackStackEntry.C19670a.m91363b(aVar, context, navGraph4, navGraph5.mo58249r(bundle2), mo58109L(), this.f50399q, (String) null, (Bundle) null, 96, (Object) null);
            }
            iVar.mo22298i(navBackStackEntry9);
        }
        for (NavBackStackEntry navBackStackEntry10 : iVar) {
            NavControllerNavigatorState navControllerNavigatorState = this.f50406x.get(this.f50405w.mo58562f(navBackStackEntry10.mo58065f().mo58242i0()));
            if (navControllerNavigatorState != null) {
                navControllerNavigatorState.mo58174m(navBackStackEntry10);
            } else {
                throw new IllegalStateException(("NavigatorBackStack for " + navDestination.mo58242i0() + " should already be created").toString());
            }
        }
        mo58093C().addAll(iVar);
        mo58093C().add(navBackStackEntry2);
        for (NavBackStackEntry navBackStackEntry11 : CollectionsKt___CollectionsKt.m40723z4(iVar, navBackStackEntry2)) {
            NavGraph j02 = navBackStackEntry11.mo58065f().mo58243j0();
            if (j02 != null) {
                mo58126U(navBackStackEntry11, mo58094D(j02.mo58238f0()));
            }
        }
    }

    /* renamed from: o0 */
    public final void mo58150o0(Navigator<? extends NavDestination> navigator, List<NavBackStackEntry> list, C19761k0 k0Var, Navigator.C19688a aVar, C11300l<? super NavBackStackEntry, C11079d2> lVar) {
        this.f50407y = lVar;
        navigator.mo58317e(list, k0Var, aVar);
        this.f50407y = null;
    }

    /* renamed from: q */
    public void mo58151q(@C12579k C19676b bVar) {
        Intrinsics.checkNotNullParameter(bVar, C40852x.C40853a.f103958a);
        this.f50400r.add(bVar);
        if (!mo58093C().isEmpty()) {
            NavBackStackEntry last = mo58093C().last();
            bVar.mo58177a(this, last.mo58065f(), last.mo58062d());
        }
    }

    @C0353k0
    /* renamed from: q0 */
    public boolean mo58152q0() {
        Bundle bundle;
        Intent intent;
        if (mo58105J() != 1) {
            return mo58156s0();
        }
        Activity activity = this.f50384b;
        int[] iArr = null;
        if (activity == null || (intent = activity.getIntent()) == null) {
            bundle = null;
        } else {
            bundle = intent.getExtras();
        }
        if (bundle != null) {
            iArr = bundle.getIntArray(f50371P);
        }
        if (iArr != null) {
            return mo58125T0();
        }
        return mo58127U0();
    }

    @C0353k0
    /* renamed from: r */
    public final boolean mo58153r(@C0329d0 int i) {
        if (!mo58157t(i) || !mo58161v()) {
            return false;
        }
        return true;
    }

    @C0353k0
    /* renamed from: r0 */
    public final void mo58154r0(Bundle bundle) {
        Activity activity;
        ArrayList<String> stringArrayList;
        Bundle bundle2 = this.f50387e;
        if (!(bundle2 == null || (stringArrayList = bundle2.getStringArrayList(f50365J)) == null)) {
            Iterator<String> it = stringArrayList.iterator();
            while (it.hasNext()) {
                String next = it.next();
                C19795r0 r0Var = this.f50405w;
                Intrinsics.checkNotNullExpressionValue(next, "name");
                Navigator f = r0Var.mo58562f(next);
                Bundle bundle3 = bundle2.getBundle(next);
                if (bundle3 != null) {
                    f.mo58320h(bundle3);
                }
            }
        }
        Parcelable[] parcelableArr = this.f50388f;
        boolean z = false;
        if (parcelableArr != null) {
            int length = parcelableArr.length;
            int i = 0;
            while (i < length) {
                NavBackStackEntryState navBackStackEntryState = (NavBackStackEntryState) parcelableArr[i];
                NavDestination y = mo58165y(navBackStackEntryState.mo58080b());
                if (y != null) {
                    NavBackStackEntry e = navBackStackEntryState.mo58084e(this.f50383a, y, mo58109L(), this.f50399q);
                    Navigator f2 = this.f50405w.mo58562f(y.mo58242i0());
                    Map<Navigator<? extends NavDestination>, NavControllerNavigatorState> map = this.f50406x;
                    NavControllerNavigatorState navControllerNavigatorState = map.get(f2);
                    if (navControllerNavigatorState == null) {
                        navControllerNavigatorState = new NavControllerNavigatorState(this, f2);
                        map.put(f2, navControllerNavigatorState);
                    }
                    mo58093C().add(e);
                    navControllerNavigatorState.mo58174m(e);
                    NavGraph j0 = e.mo58065f().mo58243j0();
                    if (j0 != null) {
                        mo58126U(e, mo58094D(j0.mo58238f0()));
                    }
                    i++;
                } else {
                    throw new IllegalStateException("Restoring the Navigation back stack failed: destination " + NavDestination.f50441x.mo58259b(this.f50383a, navBackStackEntryState.mo58080b()) + " cannot be found from the current destination " + mo58103I());
                }
            }
            mo58133X0();
            this.f50388f = null;
        }
        ArrayList<Navigator> arrayList = new ArrayList<>();
        for (Object next2 : this.f50405w.mo58563g().values()) {
            if (!((Navigator) next2).mo58316c()) {
                arrayList.add(next2);
            }
        }
        for (Navigator navigator : arrayList) {
            Map<Navigator<? extends NavDestination>, NavControllerNavigatorState> map2 = this.f50406x;
            NavControllerNavigatorState navControllerNavigatorState2 = map2.get(navigator);
            if (navControllerNavigatorState2 == null) {
                navControllerNavigatorState2 = new NavControllerNavigatorState(this, navigator);
                map2.put(navigator, navControllerNavigatorState2);
            }
            navigator.mo58318f(navControllerNavigatorState2);
        }
        if (this.f50386d == null || !mo58093C().isEmpty()) {
            mo58161v();
            return;
        }
        if (!this.f50389g && (activity = this.f50384b) != null) {
            Intrinsics.checkNotNull(activity);
            if (mo58121R(activity.getIntent())) {
                z = true;
            }
        }
        if (!z) {
            NavGraph navGraph = this.f50386d;
            Intrinsics.checkNotNull(navGraph);
            mo58141f0(navGraph, bundle, (C19761k0) null, (Navigator.C19688a) null);
        }
    }

    @C0353k0
    /* renamed from: s */
    public final boolean mo58155s(@C12579k String str) {
        Intrinsics.checkNotNullParameter(str, "route");
        return mo58153r(NavDestination.f50441x.mo58258a(str).hashCode());
    }

    @C0353k0
    /* renamed from: s0 */
    public boolean mo58156s0() {
        if (mo58093C().isEmpty()) {
            return false;
        }
        NavDestination I = mo58103I();
        Intrinsics.checkNotNull(I);
        return mo58158t0(I.mo58238f0(), true);
    }

    @C0353k0
    /* renamed from: t */
    public final boolean mo58157t(@C0329d0 int i) {
        for (NavControllerNavigatorState k : this.f50406x.values()) {
            k.mo58594k(true);
        }
        boolean I0 = mo58104I0(i, (Bundle) null, (C19761k0) null, (Navigator.C19688a) null);
        for (NavControllerNavigatorState k2 : this.f50406x.values()) {
            k2.mo58594k(false);
        }
        if (!I0 || !mo58091A0(i, true, false)) {
            return false;
        }
        return true;
    }

    @C0353k0
    /* renamed from: t0 */
    public boolean mo58158t0(@C0329d0 int i, boolean z) {
        return mo58160u0(i, z, false);
    }

    @C12579k
    /* renamed from: u */
    public C19801t mo58159u() {
        return new C19801t(this);
    }

    @C0353k0
    /* renamed from: u0 */
    public boolean mo58160u0(@C0329d0 int i, boolean z, boolean z2) {
        if (!mo58091A0(i, z, z2) || !mo58161v()) {
            return false;
        }
        return true;
    }

    /* renamed from: v */
    public final boolean mo58161v() {
        while (!mo58093C().isEmpty() && (mo58093C().last().mo58065f() instanceof NavGraph)) {
            m91378E0(this, mo58093C().last(), false, (C10944i) null, 6, (Object) null);
        }
        NavBackStackEntry l0 = mo58093C().mo22301l0();
        if (l0 != null) {
            this.f50379C.add(l0);
        }
        this.f50378B++;
        mo58131W0();
        int i = this.f50378B - 1;
        this.f50378B = i;
        if (i == 0) {
            List<NavBackStackEntry> T5 = CollectionsKt___CollectionsKt.m40572T5(this.f50379C);
            this.f50379C.clear();
            for (NavBackStackEntry navBackStackEntry : T5) {
                Iterator<C19676b> it = this.f50400r.iterator();
                while (it.hasNext()) {
                    it.next().mo58177a(this, navBackStackEntry.mo58065f(), navBackStackEntry.mo58062d());
                }
                this.f50381E.mo24198a(navBackStackEntry);
            }
            this.f50391i.mo24198a(mo58098F0());
        }
        if (l0 != null) {
            return true;
        }
        return false;
    }

    @C0353k0
    @C11315i
    /* renamed from: v0 */
    public final boolean mo58162v0(@C12579k String str, boolean z) {
        Intrinsics.checkNotNullParameter(str, "route");
        return m91398x0(this, str, z, false, 4, (Object) null);
    }

    @C0353k0
    @C11315i
    /* renamed from: w0 */
    public final boolean mo58163w0(@C12579k String str, boolean z, boolean z2) {
        Intrinsics.checkNotNullParameter(str, "route");
        return mo58160u0(NavDestination.f50441x.mo58258a(str).hashCode(), z, z2);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* renamed from: x */
    public void mo58164x(boolean z) {
        this.f50404v = z;
        mo58133X0();
    }

    @C12580l
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* renamed from: y */
    public final NavDestination mo58165y(@C0329d0 int i) {
        NavDestination navDestination;
        NavGraph navGraph = this.f50386d;
        if (navGraph == null) {
            return null;
        }
        Intrinsics.checkNotNull(navGraph);
        if (navGraph.mo58238f0() == i) {
            return this.f50386d;
        }
        NavBackStackEntry l0 = mo58093C().mo22301l0();
        if (l0 == null || (navDestination = l0.mo58065f()) == null) {
            navDestination = this.f50386d;
            Intrinsics.checkNotNull(navDestination);
        }
        return mo58167z(navDestination, i);
    }

    /* renamed from: y0 */
    public final void mo58166y0(@C12579k NavBackStackEntry navBackStackEntry, @C12579k C11289a<C11079d2> aVar) {
        Intrinsics.checkNotNullParameter(navBackStackEntry, "popUpTo");
        Intrinsics.checkNotNullParameter(aVar, "onComplete");
        int indexOf = mo58093C().indexOf(navBackStackEntry);
        if (indexOf < 0) {
            StringBuilder sb = new StringBuilder();
            sb.append("Ignoring pop of ");
            sb.append(navBackStackEntry);
            sb.append(" as it was not found on the current back stack");
            return;
        }
        int i = indexOf + 1;
        if (i != mo58093C().size()) {
            mo58091A0(mo58093C().get(i).mo58065f().mo58238f0(), true, false);
        }
        m91378E0(this, navBackStackEntry, false, (C10944i) null, 6, (Object) null);
        aVar.invoke();
        mo58133X0();
        mo58161v();
    }

    /* renamed from: z */
    public final NavDestination mo58167z(NavDestination navDestination, @C0329d0 int i) {
        NavGraph navGraph;
        if (navDestination.mo58238f0() == i) {
            return navDestination;
        }
        if (navDestination instanceof NavGraph) {
            navGraph = (NavGraph) navDestination;
        } else {
            navGraph = navDestination.mo58243j0();
            Intrinsics.checkNotNull(navGraph);
        }
        return navGraph.mo58273J0(i);
    }

    /* renamed from: z0 */
    public final void mo58168z0(Navigator<? extends NavDestination> navigator, NavBackStackEntry navBackStackEntry, boolean z, C11300l<? super NavBackStackEntry, C11079d2> lVar) {
        this.f50408z = lVar;
        navigator.mo58322j(navBackStackEntry, z);
        this.f50408z = null;
    }
}
