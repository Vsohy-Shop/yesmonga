package androidx.navigation;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.annotation.C0329d0;
import androidx.annotation.C0357m0;
import androidx.core.app.C17061d6;
import androidx.navigation.Navigator;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.urbanairship.iam.events.C9175a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.C11076d0;
import kotlin.collections.C10944i;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.C11315i;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

/* renamed from: androidx.navigation.t */
public final class C19801t {
    @C12579k

    /* renamed from: a */
    public final Context f50651a;
    @C12579k

    /* renamed from: b */
    public final Intent f50652b;
    @C12580l

    /* renamed from: c */
    public NavGraph f50653c;
    @C12579k

    /* renamed from: d */
    public final List<C19802a> f50654d;
    @C12580l

    /* renamed from: e */
    public Bundle f50655e;

    /* renamed from: androidx.navigation.t$a */
    public static final class C19802a {

        /* renamed from: a */
        public final int f50656a;
        @C12580l

        /* renamed from: b */
        public final Bundle f50657b;

        public C19802a(int i, @C12580l Bundle bundle) {
            this.f50656a = i;
            this.f50657b = bundle;
        }

        @C12580l
        /* renamed from: a */
        public final Bundle mo58587a() {
            return this.f50657b;
        }

        /* renamed from: b */
        public final int mo58588b() {
            return this.f50656a;
        }
    }

    /* renamed from: androidx.navigation.t$b */
    public static final class C19803b extends C19795r0 {
        @C12579k

        /* renamed from: d */
        public final Navigator<NavDestination> f50658d = new C19804a();

        @C11076d0(mo22515d1 = {"\u0000-\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0016J0\u0010\u000b\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0004\u001a\u00020\u00022\b\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\u0010\b\u001a\u0004\u0018\u00010\u00072\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0016J\b\u0010\r\u001a\u00020\fH\u0016¨\u0006\u000e"}, mo22516d2 = {"androidx/navigation/t$b$a", "Landroidx/navigation/Navigator;", "Landroidx/navigation/NavDestination;", "a", "destination", "Landroid/os/Bundle;", "args", "Landroidx/navigation/k0;", "navOptions", "Landroidx/navigation/Navigator$a;", "navigatorExtras", "d", "", "k", "navigation-runtime_release"}, mo22517k = 1, mo22518mv = {1, 6, 0})
        /* renamed from: androidx.navigation.t$b$a */
        public static final class C19804a extends Navigator<NavDestination> {
            @C12579k
            /* renamed from: a */
            public NavDestination mo58032a() {
                return new NavDestination("permissive");
            }

            @C12580l
            /* renamed from: d */
            public NavDestination mo58033d(@C12579k NavDestination navDestination, @C12580l Bundle bundle, @C12580l C19761k0 k0Var, @C12580l Navigator.C19688a aVar) {
                Intrinsics.checkNotNullParameter(navDestination, FirebaseAnalytics.C32532b.f78977z);
                throw new IllegalStateException("navigate is not supported");
            }

            /* renamed from: k */
            public boolean mo58034k() {
                throw new IllegalStateException("popBackStack is not supported");
            }
        }

        public C19803b() {
            mo58559b(new C19724f0(this));
        }

        @C12579k
        /* renamed from: f */
        public <T extends Navigator<? extends NavDestination>> T mo58562f(@C12579k String str) {
            Intrinsics.checkNotNullParameter(str, "name");
            try {
                return super.mo58562f(str);
            } catch (IllegalStateException unused) {
                return this.f50658d;
            }
        }
    }

    public C19801t(@C12579k Context context) {
        Intent intent;
        Intrinsics.checkNotNullParameter(context, C9175a.f24932Y);
        this.f50651a = context;
        if (context instanceof Activity) {
            intent = new Intent(context, context.getClass());
        } else {
            intent = context.getPackageManager().getLaunchIntentForPackage(context.getPackageName());
            if (intent == null) {
                intent = new Intent();
            }
        }
        intent.addFlags(268468224);
        this.f50652b = intent;
        this.f50654d = new ArrayList();
    }

    /* renamed from: e */
    public static /* synthetic */ C19801t m92070e(C19801t tVar, int i, Bundle bundle, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            bundle = null;
        }
        return tVar.mo58570b(i, bundle);
    }

    /* renamed from: f */
    public static /* synthetic */ C19801t m92071f(C19801t tVar, String str, Bundle bundle, int i, Object obj) {
        if ((i & 2) != 0) {
            bundle = null;
        }
        return tVar.mo58572d(str, bundle);
    }

    /* renamed from: r */
    public static /* synthetic */ C19801t m92072r(C19801t tVar, int i, Bundle bundle, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            bundle = null;
        }
        return tVar.mo58581o(i, bundle);
    }

    /* renamed from: s */
    public static /* synthetic */ C19801t m92073s(C19801t tVar, String str, Bundle bundle, int i, Object obj) {
        if ((i & 2) != 0) {
            bundle = null;
        }
        return tVar.mo58583q(str, bundle);
    }

    @C12579k
    @C11315i
    /* renamed from: a */
    public final C19801t mo58569a(@C0329d0 int i) {
        return m92070e(this, i, (Bundle) null, 2, (Object) null);
    }

    @C12579k
    @C11315i
    /* renamed from: b */
    public final C19801t mo58570b(@C0329d0 int i, @C12580l Bundle bundle) {
        this.f50654d.add(new C19802a(i, bundle));
        if (this.f50653c != null) {
            mo58586v();
        }
        return this;
    }

    @C12579k
    @C11315i
    /* renamed from: c */
    public final C19801t mo58571c(@C12579k String str) {
        Intrinsics.checkNotNullParameter(str, "route");
        return m92071f(this, str, (Bundle) null, 2, (Object) null);
    }

    @C12579k
    @C11315i
    /* renamed from: d */
    public final C19801t mo58572d(@C12579k String str, @C12580l Bundle bundle) {
        Intrinsics.checkNotNullParameter(str, "route");
        this.f50654d.add(new C19802a(NavDestination.f50441x.mo58258a(str).hashCode(), bundle));
        if (this.f50653c != null) {
            mo58586v();
        }
        return this;
    }

    @C12579k
    /* renamed from: g */
    public final PendingIntent mo58573g() {
        int i;
        int i2;
        int i3;
        Bundle bundle = this.f50655e;
        if (bundle != null) {
            i = 0;
            for (String str : bundle.keySet()) {
                Object obj = bundle.get(str);
                int i4 = i * 31;
                if (obj != null) {
                    i3 = obj.hashCode();
                } else {
                    i3 = 0;
                }
                i = i4 + i3;
            }
        } else {
            i = 0;
        }
        for (C19802a next : this.f50654d) {
            int b = (i * 31) + next.mo58588b();
            Bundle a = next.mo58587a();
            if (a != null) {
                for (String str2 : a.keySet()) {
                    Object obj2 = a.get(str2);
                    int i5 = b * 31;
                    if (obj2 != null) {
                        i2 = obj2.hashCode();
                    } else {
                        i2 = 0;
                    }
                    b = i5 + i2;
                }
            }
        }
        PendingIntent Q = mo58574h().mo51257Q(i, 201326592);
        Intrinsics.checkNotNull(Q);
        return Q;
    }

    @C12579k
    /* renamed from: h */
    public final C17061d6 mo58574h() {
        if (this.f50653c == null) {
            throw new IllegalStateException("You must call setGraph() before constructing the deep link".toString());
        } else if (!this.f50654d.isEmpty()) {
            mo58575i();
            C17061d6 h = C17061d6.m78884r(this.f50651a).mo51262h(new Intent(this.f50652b));
            Intrinsics.checkNotNullExpressionValue(h, "create(context)\n        …rentStack(Intent(intent))");
            int H = h.mo51255H();
            for (int i = 0; i < H; i++) {
                Intent w = h.mo51267w(i);
                if (w != null) {
                    w.putExtra(NavController.f50375T, this.f50652b);
                }
            }
            return h;
        } else {
            throw new IllegalStateException("You must call setDestination() or addDestination() before constructing the deep link".toString());
        }
    }

    /* renamed from: i */
    public final void mo58575i() {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        NavDestination navDestination = null;
        for (C19802a next : this.f50654d) {
            int b = next.mo58588b();
            Bundle a = next.mo58587a();
            NavDestination j = mo58576j(b);
            if (j != null) {
                for (int valueOf : j.mo58255y(navDestination)) {
                    arrayList.add(Integer.valueOf(valueOf));
                    arrayList2.add(a);
                }
                navDestination = j;
            } else {
                throw new IllegalArgumentException("Navigation destination " + NavDestination.f50441x.mo58259b(this.f50651a, b) + " cannot be found in the navigation graph " + this.f50653c);
            }
        }
        this.f50652b.putExtra(NavController.f50371P, CollectionsKt___CollectionsKt.m40552P5(arrayList));
        this.f50652b.putParcelableArrayListExtra(NavController.f50372Q, arrayList2);
    }

    /* renamed from: j */
    public final NavDestination mo58576j(@C0329d0 int i) {
        C10944i iVar = new C10944i();
        NavGraph navGraph = this.f50653c;
        Intrinsics.checkNotNull(navGraph);
        iVar.add(navGraph);
        while (!iVar.isEmpty()) {
            NavDestination navDestination = (NavDestination) iVar.mo22306o0();
            if (navDestination.mo58238f0() == i) {
                return navDestination;
            }
            if (navDestination instanceof NavGraph) {
                Iterator<NavDestination> it = ((NavGraph) navDestination).iterator();
                while (it.hasNext()) {
                    iVar.add(it.next());
                }
            }
        }
        return null;
    }

    @C12579k
    /* renamed from: k */
    public final C19801t mo58577k(@C12580l Bundle bundle) {
        this.f50655e = bundle;
        this.f50652b.putExtra(NavController.f50373R, bundle);
        return this;
    }

    @C12579k
    /* renamed from: l */
    public final C19801t mo58578l(@C12579k ComponentName componentName) {
        Intrinsics.checkNotNullParameter(componentName, "componentName");
        this.f50652b.setComponent(componentName);
        return this;
    }

    @C12579k
    /* renamed from: m */
    public final C19801t mo58579m(@C12579k Class<? extends Activity> cls) {
        Intrinsics.checkNotNullParameter(cls, "activityClass");
        return mo58578l(new ComponentName(this.f50651a, cls));
    }

    @C12579k
    @C11315i
    /* renamed from: n */
    public final C19801t mo58580n(@C0329d0 int i) {
        return m92072r(this, i, (Bundle) null, 2, (Object) null);
    }

    @C12579k
    @C11315i
    /* renamed from: o */
    public final C19801t mo58581o(@C0329d0 int i, @C12580l Bundle bundle) {
        this.f50654d.clear();
        this.f50654d.add(new C19802a(i, bundle));
        if (this.f50653c != null) {
            mo58586v();
        }
        return this;
    }

    @C12579k
    @C11315i
    /* renamed from: p */
    public final C19801t mo58582p(@C12579k String str) {
        Intrinsics.checkNotNullParameter(str, "destRoute");
        return m92073s(this, str, (Bundle) null, 2, (Object) null);
    }

    @C12579k
    @C11315i
    /* renamed from: q */
    public final C19801t mo58583q(@C12579k String str, @C12580l Bundle bundle) {
        Intrinsics.checkNotNullParameter(str, "destRoute");
        this.f50654d.clear();
        this.f50654d.add(new C19802a(NavDestination.f50441x.mo58258a(str).hashCode(), bundle));
        if (this.f50653c != null) {
            mo58586v();
        }
        return this;
    }

    @C12579k
    /* renamed from: t */
    public final C19801t mo58584t(@C0357m0 int i) {
        return mo58585u(new C19758j0(this.f50651a, new C19803b()).mo58438b(i));
    }

    @C12579k
    /* renamed from: u */
    public final C19801t mo58585u(@C12579k NavGraph navGraph) {
        Intrinsics.checkNotNullParameter(navGraph, "navGraph");
        this.f50653c = navGraph;
        mo58586v();
        return this;
    }

    /* renamed from: v */
    public final void mo58586v() {
        for (C19802a b : this.f50654d) {
            int b2 = b.mo58588b();
            if (mo58576j(b2) == null) {
                String b3 = NavDestination.f50441x.mo58259b(this.f50651a, b2);
                throw new IllegalArgumentException("Navigation destination " + b3 + " cannot be found in the navigation graph " + this.f50653c);
            }
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public C19801t(@C12579k NavController navController) {
        this(navController.mo58097F());
        Intrinsics.checkNotNullParameter(navController, "navController");
        this.f50653c = navController.mo58107K();
    }
}
