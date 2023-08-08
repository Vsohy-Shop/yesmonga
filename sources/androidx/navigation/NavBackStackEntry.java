package androidx.navigation;

import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import androidx.annotation.RestrictTo;
import androidx.lifecycle.C19389a;
import androidx.lifecycle.C19392a1;
import androidx.lifecycle.C19395b1;
import androidx.lifecycle.C19455p;
import androidx.lifecycle.C19456p0;
import androidx.lifecycle.C19463r0;
import androidx.lifecycle.C19476v0;
import androidx.lifecycle.C19499w;
import androidx.lifecycle.C19502x0;
import androidx.lifecycle.C19512y;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.SavedStateHandleSupport;
import androidx.lifecycle.viewmodel.C19477a;
import androidx.lifecycle.viewmodel.C19492e;
import androidx.savedstate.C20431c;
import androidx.savedstate.C20435d;
import androidx.savedstate.C20437e;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.remoteconfig.internal.C33541p;
import java.util.Set;
import java.util.UUID;
import kotlin.C10864b0;
import kotlin.C11677z;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

public final class NavBackStackEntry implements C19499w, C19395b1, C19455p, C20437e {
    @C12579k

    /* renamed from: Y */
    public static final C19670a f50342Y = new C19670a((DefaultConstructorMarker) null);
    @C12579k

    /* renamed from: X */
    public Lifecycle.State f50343X;
    @C12580l

    /* renamed from: a */
    public final Context f50344a;
    @C12579k

    /* renamed from: b */
    public NavDestination f50345b;
    @C12580l

    /* renamed from: c */
    public final Bundle f50346c;
    @C12579k

    /* renamed from: d */
    public Lifecycle.State f50347d;
    @C12580l

    /* renamed from: e */
    public final C19789o0 f50348e;
    @C12579k

    /* renamed from: f */
    public final String f50349f;
    @C12580l

    /* renamed from: g */
    public final Bundle f50350g;
    @C12579k

    /* renamed from: v */
    public C19512y f50351v;
    @C12579k

    /* renamed from: w */
    public final C20435d f50352w;

    /* renamed from: x */
    public boolean f50353x;
    @C12579k

    /* renamed from: y */
    public final C11677z f50354y;
    @C12579k

    /* renamed from: z */
    public final C11677z f50355z;

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* renamed from: androidx.navigation.NavBackStackEntry$a */
    public static final class C19670a {
        public /* synthetic */ C19670a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: b */
        public static /* synthetic */ NavBackStackEntry m91363b(C19670a aVar, Context context, NavDestination navDestination, Bundle bundle, Lifecycle.State state, C19789o0 o0Var, String str, Bundle bundle2, int i, Object obj) {
            Bundle bundle3;
            Lifecycle.State state2;
            C19789o0 o0Var2;
            String str2;
            Bundle bundle4;
            if ((i & 4) != 0) {
                bundle3 = null;
            } else {
                bundle3 = bundle;
            }
            if ((i & 8) != 0) {
                state2 = Lifecycle.State.CREATED;
            } else {
                state2 = state;
            }
            if ((i & 16) != 0) {
                o0Var2 = null;
            } else {
                o0Var2 = o0Var;
            }
            if ((i & 32) != 0) {
                String uuid = UUID.randomUUID().toString();
                Intrinsics.checkNotNullExpressionValue(uuid, "randomUUID().toString()");
                str2 = uuid;
            } else {
                str2 = str;
            }
            if ((i & 64) != 0) {
                bundle4 = null;
            } else {
                bundle4 = bundle2;
            }
            return aVar.mo58075a(context, navDestination, bundle3, state2, o0Var2, str2, bundle4);
        }

        @C12579k
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        /* renamed from: a */
        public final NavBackStackEntry mo58075a(@C12580l Context context, @C12579k NavDestination navDestination, @C12580l Bundle bundle, @C12579k Lifecycle.State state, @C12580l C19789o0 o0Var, @C12579k String str, @C12580l Bundle bundle2) {
            Intrinsics.checkNotNullParameter(navDestination, FirebaseAnalytics.C32532b.f78977z);
            Intrinsics.checkNotNullParameter(state, "hostLifecycleState");
            String str2 = str;
            Intrinsics.checkNotNullParameter(str2, "id");
            return new NavBackStackEntry(context, navDestination, bundle, state, o0Var, str2, bundle2, (DefaultConstructorMarker) null);
        }

        public C19670a() {
        }
    }

    /* renamed from: androidx.navigation.NavBackStackEntry$b */
    public static final class C19671b extends C19389a {
        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C19671b(@C12579k C20437e eVar) {
            super(eVar, (Bundle) null);
            Intrinsics.checkNotNullParameter(eVar, "owner");
        }

        @C12579k
        /* renamed from: f */
        public <T extends C19476v0> T mo21646f(@C12579k String str, @C12579k Class<T> cls, @C12579k C19456p0 p0Var) {
            Intrinsics.checkNotNullParameter(str, "key");
            Intrinsics.checkNotNullParameter(cls, "modelClass");
            Intrinsics.checkNotNullParameter(p0Var, "handle");
            return new C19672c(p0Var);
        }
    }

    /* renamed from: androidx.navigation.NavBackStackEntry$c */
    public static final class C19672c extends C19476v0 {
        @C12579k

        /* renamed from: a */
        public final C19456p0 f50356a;

        public C19672c(@C12579k C19456p0 p0Var) {
            Intrinsics.checkNotNullParameter(p0Var, "handle");
            this.f50356a = p0Var;
        }

        @C12579k
        /* renamed from: c0 */
        public final C19456p0 mo58076c0() {
            return this.f50356a;
        }
    }

    public /* synthetic */ NavBackStackEntry(Context context, NavDestination navDestination, Bundle bundle, Lifecycle.State state, C19789o0 o0Var, String str, Bundle bundle2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, navDestination, bundle, state, o0Var, str, bundle2);
    }

    @C12580l
    /* renamed from: d */
    public final Bundle mo58062d() {
        return this.f50346c;
    }

    /* renamed from: e */
    public final C19463r0 mo58063e() {
        return (C19463r0) this.f50354y.getValue();
    }

    /* JADX WARNING: Removed duplicated region for block: B:46:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(@org.jetbrains.annotations.C12580l java.lang.Object r7) {
        /*
            r6 = this;
            r0 = 0
            if (r7 == 0) goto L_0x008c
            boolean r1 = r7 instanceof androidx.navigation.NavBackStackEntry
            if (r1 != 0) goto L_0x0009
            goto L_0x008c
        L_0x0009:
            java.lang.String r1 = r6.f50349f
            androidx.navigation.NavBackStackEntry r7 = (androidx.navigation.NavBackStackEntry) r7
            java.lang.String r2 = r7.f50349f
            boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r1, (java.lang.Object) r2)
            if (r1 == 0) goto L_0x008c
            androidx.navigation.NavDestination r1 = r6.f50345b
            androidx.navigation.NavDestination r2 = r7.f50345b
            boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r1, (java.lang.Object) r2)
            if (r1 == 0) goto L_0x008c
            androidx.lifecycle.y r1 = r6.f50351v
            androidx.lifecycle.y r2 = r7.f50351v
            boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r1, (java.lang.Object) r2)
            if (r1 == 0) goto L_0x008c
            androidx.savedstate.c r1 = r6.getSavedStateRegistry()
            androidx.savedstate.c r2 = r7.getSavedStateRegistry()
            boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r1, (java.lang.Object) r2)
            if (r1 == 0) goto L_0x008c
            android.os.Bundle r1 = r6.f50346c
            android.os.Bundle r2 = r7.f50346c
            boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r1, (java.lang.Object) r2)
            r2 = 1
            if (r1 != 0) goto L_0x008b
            android.os.Bundle r1 = r6.f50346c
            if (r1 == 0) goto L_0x0088
            java.util.Set r1 = r1.keySet()
            if (r1 == 0) goto L_0x0088
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            boolean r3 = r1 instanceof java.util.Collection
            if (r3 == 0) goto L_0x005d
            r3 = r1
            java.util.Collection r3 = (java.util.Collection) r3
            boolean r3 = r3.isEmpty()
            if (r3 == 0) goto L_0x005d
        L_0x005b:
            r7 = r2
            goto L_0x0084
        L_0x005d:
            java.util.Iterator r1 = r1.iterator()
        L_0x0061:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L_0x005b
            java.lang.Object r3 = r1.next()
            java.lang.String r3 = (java.lang.String) r3
            android.os.Bundle r4 = r6.f50346c
            java.lang.Object r4 = r4.get(r3)
            android.os.Bundle r5 = r7.f50346c
            if (r5 == 0) goto L_0x007c
            java.lang.Object r3 = r5.get(r3)
            goto L_0x007d
        L_0x007c:
            r3 = 0
        L_0x007d:
            boolean r3 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r4, (java.lang.Object) r3)
            if (r3 != 0) goto L_0x0061
            r7 = r0
        L_0x0084:
            if (r7 != r2) goto L_0x0088
            r7 = r2
            goto L_0x0089
        L_0x0088:
            r7 = r0
        L_0x0089:
            if (r7 == 0) goto L_0x008c
        L_0x008b:
            r0 = r2
        L_0x008c:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.navigation.NavBackStackEntry.equals(java.lang.Object):boolean");
    }

    @C12579k
    /* renamed from: f */
    public final NavDestination mo58065f() {
        return this.f50345b;
    }

    @C12579k
    /* renamed from: g */
    public final String mo58066g() {
        return this.f50349f;
    }

    @C12579k
    public C19477a getDefaultViewModelCreationExtras() {
        Context context;
        Application application = null;
        C19492e eVar = new C19492e((C19477a) null, 1, (DefaultConstructorMarker) null);
        Context context2 = this.f50344a;
        if (context2 != null) {
            context = context2.getApplicationContext();
        } else {
            context = null;
        }
        if (context instanceof Application) {
            application = (Application) context;
        }
        if (application != null) {
            eVar.mo57690c(C19502x0.C19503a.f49893i, application);
        }
        eVar.mo57690c(SavedStateHandleSupport.f49731c, this);
        eVar.mo57690c(SavedStateHandleSupport.f49732d, this);
        Bundle bundle = this.f50346c;
        if (bundle != null) {
            eVar.mo57690c(SavedStateHandleSupport.f49733e, bundle);
        }
        return eVar;
    }

    @C12579k
    public C19502x0.C19506b getDefaultViewModelProviderFactory() {
        return mo58063e();
    }

    @C12579k
    public Lifecycle getLifecycle() {
        return this.f50351v;
    }

    @C12579k
    public C20431c getSavedStateRegistry() {
        return this.f50352w.mo61295b();
    }

    @C12579k
    public C19392a1 getViewModelStore() {
        boolean z;
        if (this.f50353x) {
            if (this.f50351v.mo57465b() != Lifecycle.State.DESTROYED) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                C19789o0 o0Var = this.f50348e;
                if (o0Var != null) {
                    return o0Var.mo58549e(this.f50349f);
                }
                throw new IllegalStateException("You must call setViewModelStore() on your NavHostController before accessing the ViewModelStore of a navigation graph.".toString());
            }
            throw new IllegalStateException("You cannot access the NavBackStackEntry's ViewModels after the NavBackStackEntry is destroyed.".toString());
        }
        throw new IllegalStateException("You cannot access the NavBackStackEntry's ViewModels until it is added to the NavController's back stack (i.e., the Lifecycle of the NavBackStackEntry reaches the CREATED state).".toString());
    }

    @C12579k
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* renamed from: h */
    public final Lifecycle.State mo58067h() {
        return this.f50343X;
    }

    public int hashCode() {
        Set<String> keySet;
        int i;
        int hashCode = (this.f50349f.hashCode() * 31) + this.f50345b.hashCode();
        Bundle bundle = this.f50346c;
        if (!(bundle == null || (keySet = bundle.keySet()) == null)) {
            for (String str : keySet) {
                int i2 = hashCode * 31;
                Object obj = this.f50346c.get(str);
                if (obj != null) {
                    i = obj.hashCode();
                } else {
                    i = 0;
                }
                hashCode = i2 + i;
            }
        }
        return (((hashCode * 31) + this.f50351v.hashCode()) * 31) + getSavedStateRegistry().hashCode();
    }

    @C12579k
    /* renamed from: i */
    public final C19456p0 mo58069i() {
        return (C19456p0) this.f50355z.getValue();
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* renamed from: j */
    public final void mo58070j(@C12579k Lifecycle.C19372Event event) {
        Intrinsics.checkNotNullParameter(event, "event");
        Lifecycle.State w = event.mo57469w();
        Intrinsics.checkNotNullExpressionValue(w, "event.targetState");
        this.f50347d = w;
        mo58074n();
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* renamed from: k */
    public final void mo58071k(@C12579k Bundle bundle) {
        Intrinsics.checkNotNullParameter(bundle, "outBundle");
        this.f50352w.mo61298e(bundle);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* renamed from: l */
    public final void mo58072l(@C12579k NavDestination navDestination) {
        Intrinsics.checkNotNullParameter(navDestination, "<set-?>");
        this.f50345b = navDestination;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* renamed from: m */
    public final void mo58073m(@C12579k Lifecycle.State state) {
        Intrinsics.checkNotNullParameter(state, "maxState");
        this.f50343X = state;
        mo58074n();
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* renamed from: n */
    public final void mo58074n() {
        if (!this.f50353x) {
            this.f50352w.mo61296c();
            this.f50353x = true;
            if (this.f50348e != null) {
                SavedStateHandleSupport.m90591c(this);
            }
            this.f50352w.mo61297d(this.f50350g);
        }
        if (this.f50347d.ordinal() < this.f50343X.ordinal()) {
            this.f50351v.mo57711s(this.f50347d);
        } else {
            this.f50351v.mo57711s(this.f50343X);
        }
    }

    public NavBackStackEntry(Context context, NavDestination navDestination, Bundle bundle, Lifecycle.State state, C19789o0 o0Var, String str, Bundle bundle2) {
        this.f50344a = context;
        this.f50345b = navDestination;
        this.f50346c = bundle;
        this.f50347d = state;
        this.f50348e = o0Var;
        this.f50349f = str;
        this.f50350g = bundle2;
        this.f50351v = new C19512y(this);
        this.f50352w = C20435d.f52691d.mo61299a(this);
        this.f50354y = C10864b0.m38748c(new NavBackStackEntry$defaultFactory$2(this));
        this.f50355z = C10864b0.m38748c(new NavBackStackEntry$savedStateHandle$2(this));
        this.f50343X = Lifecycle.State.INITIALIZED;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ NavBackStackEntry(android.content.Context r11, androidx.navigation.NavDestination r12, android.os.Bundle r13, androidx.lifecycle.Lifecycle.State r14, androidx.navigation.C19789o0 r15, java.lang.String r16, android.os.Bundle r17, int r18, kotlin.jvm.internal.DefaultConstructorMarker r19) {
        /*
            r10 = this;
            r0 = r18 & 4
            r1 = 0
            if (r0 == 0) goto L_0x0007
            r5 = r1
            goto L_0x0008
        L_0x0007:
            r5 = r13
        L_0x0008:
            r0 = r18 & 8
            if (r0 == 0) goto L_0x0010
            androidx.lifecycle.Lifecycle$State r0 = androidx.lifecycle.Lifecycle.State.CREATED
            r6 = r0
            goto L_0x0011
        L_0x0010:
            r6 = r14
        L_0x0011:
            r0 = r18 & 16
            if (r0 == 0) goto L_0x0017
            r7 = r1
            goto L_0x0018
        L_0x0017:
            r7 = r15
        L_0x0018:
            r0 = r18 & 32
            if (r0 == 0) goto L_0x002b
            java.util.UUID r0 = java.util.UUID.randomUUID()
            java.lang.String r0 = r0.toString()
            java.lang.String r2 = "randomUUID().toString()"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r2)
            r8 = r0
            goto L_0x002d
        L_0x002b:
            r8 = r16
        L_0x002d:
            r0 = r18 & 64
            if (r0 == 0) goto L_0x0033
            r9 = r1
            goto L_0x0035
        L_0x0033:
            r9 = r17
        L_0x0035:
            r2 = r10
            r3 = r11
            r4 = r12
            r2.<init>(r3, r4, r5, r6, r7, r8, r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.navigation.NavBackStackEntry.<init>(android.content.Context, androidx.navigation.NavDestination, android.os.Bundle, androidx.lifecycle.Lifecycle$State, androidx.navigation.o0, java.lang.String, android.os.Bundle, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ NavBackStackEntry(NavBackStackEntry navBackStackEntry, Bundle bundle, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(navBackStackEntry, (i & 2) != 0 ? navBackStackEntry.f50346c : bundle);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public NavBackStackEntry(@C12579k NavBackStackEntry navBackStackEntry, @C12580l Bundle bundle) {
        this(navBackStackEntry.f50344a, navBackStackEntry.f50345b, bundle, navBackStackEntry.f50347d, navBackStackEntry.f50348e, navBackStackEntry.f50349f, navBackStackEntry.f50350g);
        Intrinsics.checkNotNullParameter(navBackStackEntry, C33541p.f81644a);
        this.f50347d = navBackStackEntry.f50347d;
        mo58073m(navBackStackEntry.f50343X);
    }
}
