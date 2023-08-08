package com.google.android.gms.common.api;

import android.accounts.Account;
import android.app.Activity;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import androidx.annotation.C0348i1;
import androidx.annotation.C0353k0;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.annotation.C40473a;
import com.google.android.gms.common.api.C40477a;
import com.google.android.gms.common.api.C40477a.C40481d;
import com.google.android.gms.common.api.internal.C40513a0;
import com.google.android.gms.common.api.internal.C40516a2;
import com.google.android.gms.common.api.internal.C40519b;
import com.google.android.gms.common.api.internal.C40525c;
import com.google.android.gms.common.api.internal.C40526c0;
import com.google.android.gms.common.api.internal.C40538e;
import com.google.android.gms.common.api.internal.C40564i;
import com.google.android.gms.common.api.internal.C40565i0;
import com.google.android.gms.common.api.internal.C40592n;
import com.google.android.gms.common.api.internal.C40599o;
import com.google.android.gms.common.api.internal.C40604p;
import com.google.android.gms.common.api.internal.C40624t;
import com.google.android.gms.common.api.internal.C40629u;
import com.google.android.gms.common.api.internal.C40637v1;
import com.google.android.gms.common.api.internal.C40650y;
import com.google.android.gms.common.api.internal.C40658z2;
import com.google.android.gms.common.internal.C40747e;
import com.google.android.gms.common.internal.C40756f;
import com.google.android.gms.common.internal.C40808s;
import com.google.android.gms.common.internal.C40843u;
import com.google.android.gms.common.util.C40996v;
import com.google.android.gms.tasks.C31047k;
import com.google.android.gms.tasks.C31049l;
import com.google.errorprone.annotations.C32488a;
import java.lang.reflect.InvocationTargetException;
import java.util.Collections;
import java.util.Set;
import org.checkerframework.checker.initialization.qual.NotOnlyInitialized;

/* renamed from: com.google.android.gms.common.api.h */
public abstract class C40504h<O extends C40477a.C40481d> implements C40660j<O> {

    /* renamed from: a */
    public final Context f103235a;
    @C0363p0

    /* renamed from: b */
    public final String f103236b;

    /* renamed from: c */
    public final C40477a f103237c;

    /* renamed from: d */
    public final C40477a.C40481d f103238d;

    /* renamed from: e */
    public final C40525c f103239e;

    /* renamed from: f */
    public final Looper f103240f;

    /* renamed from: g */
    public final int f103241g;
    @NotOnlyInitialized

    /* renamed from: h */
    public final C40507i f103242h;

    /* renamed from: i */
    public final C40650y f103243i;
    @C0359n0

    /* renamed from: j */
    public final C40564i f103244j;

    @C40473a
    /* renamed from: com.google.android.gms.common.api.h$a */
    public static class C40505a {
        @C40473a
        @C0359n0

        /* renamed from: c */
        public static final C40505a f103245c = new C40506a().mo133733a();
        @C0359n0

        /* renamed from: a */
        public final C40650y f103246a;
        @C0359n0

        /* renamed from: b */
        public final Looper f103247b;

        @C40473a
        /* renamed from: com.google.android.gms.common.api.h$a$a */
        public static class C40506a {

            /* renamed from: a */
            public C40650y f103248a;

            /* renamed from: b */
            public Looper f103249b;

            @C40473a
            @C0359n0
            /* renamed from: a */
            public C40505a mo133733a() {
                if (this.f103248a == null) {
                    this.f103248a = new C40519b();
                }
                if (this.f103249b == null) {
                    this.f103249b = Looper.getMainLooper();
                }
                return new C40505a(this.f103248a, this.f103249b);
            }

            @C40473a
            @C0359n0
            @C32488a
            /* renamed from: b */
            public C40506a mo133734b(@C0359n0 Looper looper) {
                C40843u.m166203m(looper, "Looper must not be null.");
                this.f103249b = looper;
                return this;
            }

            @C40473a
            @C0359n0
            @C32488a
            /* renamed from: c */
            public C40506a mo133735c(@C0359n0 C40650y yVar) {
                C40843u.m166203m(yVar, "StatusExceptionMapper must not be null.");
                this.f103248a = yVar;
                return this;
            }
        }

        @C40473a
        public C40505a(C40650y yVar, Account account, Looper looper) {
            this.f103246a = yVar;
            this.f103247b = looper;
        }
    }

    @C40473a
    @C0353k0
    public C40504h(@C0359n0 Activity activity, @C0359n0 C40477a<O> aVar, @C0359n0 O o, @C0359n0 C40505a aVar2) {
        this((Context) activity, activity, (C40477a) aVar, (C40477a.C40481d) o, aVar2);
    }

    @C40473a
    @C0359n0
    /* renamed from: A */
    public <L> C40592n<L> mo133708A(@C0359n0 L l, @C0359n0 String str) {
        return C40599o.m165304a(l, this.f103240f, str);
    }

    /* renamed from: B */
    public final int mo133709B() {
        return this.f103241g;
    }

    @C0348i1
    /* renamed from: C */
    public final C40477a.C40489f mo133710C(Looper looper, C40637v1 v1Var) {
        Looper looper2 = looper;
        C40477a.C40489f c = ((C40477a.C40478a) C40843u.m166202l(this.f103237c.mo133660a())).mo85653c(this.f103235a, looper2, mo133716j().mo134395a(), this.f103238d, v1Var, v1Var);
        String x = mo133730x();
        if (x != null && (c instanceof C40747e)) {
            ((C40747e) c).mo134349X(x);
        }
        if (x != null && (c instanceof C40604p)) {
            ((C40604p) c).mo134003A(x);
        }
        return c;
    }

    /* renamed from: D */
    public final C40658z2 mo133711D(Context context, Handler handler) {
        return new C40658z2(context, handler, mo133716j().mo134395a());
    }

    /* renamed from: E */
    public final C40538e.C40539a mo133712E(int i, @C0359n0 C40538e.C40539a aVar) {
        aVar.mo133796s();
        this.f103244j.mo133943J(this, i, aVar);
        return aVar;
    }

    /* renamed from: F */
    public final C31047k mo133713F(int i, @C0359n0 C40513a0 a0Var) {
        C31049l lVar = new C31049l();
        this.f103244j.mo133944K(this, i, a0Var, lVar, this.f103243i);
        return lVar.mo87741a();
    }

    @C0359n0
    /* renamed from: h */
    public final C40525c<O> mo133714h() {
        return this.f103239e;
    }

    @C40473a
    @C0359n0
    /* renamed from: i */
    public C40507i mo133715i() {
        return this.f103242h;
    }

    @C40473a
    @C0359n0
    /* renamed from: j */
    public C40756f.C40757a mo133716j() {
        Account account;
        Set<Scope> set;
        GoogleSignInAccount w;
        C40756f.C40757a aVar = new C40756f.C40757a();
        C40477a.C40481d dVar = this.f103238d;
        if (!(dVar instanceof C40477a.C40481d.C40483b) || (w = ((C40477a.C40481d.C40483b) dVar).mo133666w()) == null) {
            C40477a.C40481d dVar2 = this.f103238d;
            if (dVar2 instanceof C40477a.C40481d.C40482a) {
                account = ((C40477a.C40481d.C40482a) dVar2).mo133665y();
            } else {
                account = null;
            }
        } else {
            account = w.mo133469y();
        }
        aVar.mo134398d(account);
        C40477a.C40481d dVar3 = this.f103238d;
        if (dVar3 instanceof C40477a.C40481d.C40483b) {
            GoogleSignInAccount w2 = ((C40477a.C40481d.C40483b) dVar3).mo133666w();
            if (w2 == null) {
                set = Collections.emptySet();
            } else {
                set = w2.mo133453C0();
            }
        } else {
            set = Collections.emptySet();
        }
        aVar.mo134397c(set);
        aVar.mo134399e(this.f103235a.getClass().getName());
        aVar.mo134396b(this.f103235a.getPackageName());
        return aVar;
    }

    @C40473a
    @C0359n0
    /* renamed from: k */
    public C31047k<Boolean> mo133717k() {
        return this.f103244j.mo133940C(this);
    }

    @C40473a
    @C0359n0
    /* renamed from: l */
    public <A extends C40477a.C40479b, T extends C40538e.C40539a<? extends C40669r, A>> T mo133718l(@C0359n0 T t) {
        mo133712E(2, t);
        return t;
    }

    @C40473a
    @C0359n0
    /* renamed from: m */
    public <TResult, A extends C40477a.C40479b> C31047k<TResult> mo133719m(@C0359n0 C40513a0<A, TResult> a0Var) {
        return mo133713F(2, a0Var);
    }

    @C40473a
    @C0359n0
    /* renamed from: n */
    public <A extends C40477a.C40479b, T extends C40538e.C40539a<? extends C40669r, A>> T mo133720n(@C0359n0 T t) {
        mo133712E(0, t);
        return t;
    }

    @C40473a
    @C0359n0
    /* renamed from: o */
    public <TResult, A extends C40477a.C40479b> C31047k<TResult> mo133721o(@C0359n0 C40513a0<A, TResult> a0Var) {
        return mo133713F(0, a0Var);
    }

    @C40473a
    @C0359n0
    @Deprecated
    /* renamed from: p */
    public <A extends C40477a.C40479b, T extends C40624t<A, ?>, U extends C40526c0<A, ?>> C31047k<Void> mo133722p(@C0359n0 T t, @C0359n0 U u) {
        C40843u.m166202l(t);
        C40843u.m166202l(u);
        C40843u.m166203m(t.mo134028b(), "Listener has already been released.");
        C40843u.m166203m(u.mo133844a(), "Listener has already been released.");
        C40843u.m166192b(C40808s.m166010b(t.mo134028b(), u.mo133844a()), "Listener registration and unregistration methods must be constructed with the same ListenerHolder.");
        return this.f103244j.mo133941D(this, t, u, C40677z.f103639a);
    }

    @C40473a
    @C0359n0
    /* renamed from: q */
    public <A extends C40477a.C40479b> C31047k<Void> mo133723q(@C0359n0 C40629u<A, ?> uVar) {
        C40843u.m166202l(uVar);
        C40843u.m166203m(uVar.f103572a.mo134028b(), "Listener has already been released.");
        C40843u.m166203m(uVar.f103573b.mo133844a(), "Listener has already been released.");
        return this.f103244j.mo133941D(this, uVar.f103572a, uVar.f103573b, uVar.f103574c);
    }

    @C40473a
    @C0359n0
    /* renamed from: r */
    public C31047k<Boolean> mo133724r(@C0359n0 C40592n.C40593a<?> aVar) {
        return mo133725s(aVar, 0);
    }

    @C40473a
    @C0359n0
    /* renamed from: s */
    public C31047k<Boolean> mo133725s(@C0359n0 C40592n.C40593a<?> aVar, int i) {
        C40843u.m166203m(aVar, "Listener key cannot be null.");
        return this.f103244j.mo133942E(this, aVar, i);
    }

    @C40473a
    @C0359n0
    /* renamed from: t */
    public <A extends C40477a.C40479b, T extends C40538e.C40539a<? extends C40669r, A>> T mo133726t(@C0359n0 T t) {
        mo133712E(1, t);
        return t;
    }

    @C40473a
    @C0359n0
    /* renamed from: u */
    public <TResult, A extends C40477a.C40479b> C31047k<TResult> mo133727u(@C0359n0 C40513a0<A, TResult> a0Var) {
        return mo133713F(1, a0Var);
    }

    @C40473a
    @C0359n0
    /* renamed from: v */
    public O mo133728v() {
        return this.f103238d;
    }

    @C40473a
    @C0359n0
    /* renamed from: w */
    public Context mo133729w() {
        return this.f103235a;
    }

    @C0363p0
    @C40473a
    /* renamed from: x */
    public String mo133730x() {
        return this.f103236b;
    }

    @C0363p0
    @C40473a
    @Deprecated
    /* renamed from: y */
    public String mo133731y() {
        return this.f103236b;
    }

    @C40473a
    @C0359n0
    /* renamed from: z */
    public Looper mo133732z() {
        return this.f103240f;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    @com.google.android.gms.common.annotation.C40473a
    @java.lang.Deprecated
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C40504h(@androidx.annotation.C0359n0 android.app.Activity r2, @androidx.annotation.C0359n0 com.google.android.gms.common.api.C40477a<O> r3, @androidx.annotation.C0359n0 O r4, @androidx.annotation.C0359n0 com.google.android.gms.common.api.internal.C40650y r5) {
        /*
            r1 = this;
            com.google.android.gms.common.api.h$a$a r0 = new com.google.android.gms.common.api.h$a$a
            r0.<init>()
            r0.mo133735c(r5)
            android.os.Looper r5 = r2.getMainLooper()
            r0.mo133734b(r5)
            com.google.android.gms.common.api.h$a r5 = r0.mo133733a()
            r1.<init>((android.app.Activity) r2, r3, r4, (com.google.android.gms.common.api.C40504h.C40505a) r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.api.C40504h.<init>(android.app.Activity, com.google.android.gms.common.api.a, com.google.android.gms.common.api.a$d, com.google.android.gms.common.api.internal.y):void");
    }

    public C40504h(@C0359n0 Context context, @C0363p0 Activity activity, C40477a aVar, C40477a.C40481d dVar, C40505a aVar2) {
        C40843u.m166203m(context, "Null context is not permitted.");
        C40843u.m166203m(aVar, "Api must not be null.");
        C40843u.m166203m(aVar2, "Settings must not be null; use Settings.DEFAULT_SETTINGS instead.");
        this.f103235a = context.getApplicationContext();
        String str = null;
        if (C40996v.m166692q()) {
            try {
                str = (String) Context.class.getMethod("getAttributionTag", new Class[0]).invoke(context, new Object[0]);
            } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
            }
        }
        this.f103236b = str;
        this.f103237c = aVar;
        this.f103238d = dVar;
        this.f103240f = aVar2.f103247b;
        C40525c a = C40525c.m164950a(aVar, dVar, str);
        this.f103239e = a;
        this.f103242h = new C40516a2(this);
        C40564i z = C40564i.m165102z(this.f103235a);
        this.f103244j = z;
        this.f103241g = z.mo133958n();
        this.f103243i = aVar2.f103246a;
        if (activity != null && !(activity instanceof GoogleApiActivity) && Looper.myLooper() == Looper.getMainLooper()) {
            C40565i0.m165123v(activity, z, a);
        }
        z.mo133948c(this);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    @com.google.android.gms.common.annotation.C40473a
    @java.lang.Deprecated
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C40504h(@androidx.annotation.C0359n0 android.content.Context r2, @androidx.annotation.C0359n0 com.google.android.gms.common.api.C40477a<O> r3, @androidx.annotation.C0359n0 O r4, @androidx.annotation.C0359n0 android.os.Looper r5, @androidx.annotation.C0359n0 com.google.android.gms.common.api.internal.C40650y r6) {
        /*
            r1 = this;
            com.google.android.gms.common.api.h$a$a r0 = new com.google.android.gms.common.api.h$a$a
            r0.<init>()
            r0.mo133734b(r5)
            r0.mo133735c(r6)
            com.google.android.gms.common.api.h$a r5 = r0.mo133733a()
            r1.<init>((android.content.Context) r2, r3, r4, (com.google.android.gms.common.api.C40504h.C40505a) r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.api.C40504h.<init>(android.content.Context, com.google.android.gms.common.api.a, com.google.android.gms.common.api.a$d, android.os.Looper, com.google.android.gms.common.api.internal.y):void");
    }

    @C40473a
    public C40504h(@C0359n0 Context context, @C0359n0 C40477a<O> aVar, @C0359n0 O o, @C0359n0 C40505a aVar2) {
        this(context, (Activity) null, (C40477a) aVar, (C40477a.C40481d) o, aVar2);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    @com.google.android.gms.common.annotation.C40473a
    @java.lang.Deprecated
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C40504h(@androidx.annotation.C0359n0 android.content.Context r2, @androidx.annotation.C0359n0 com.google.android.gms.common.api.C40477a<O> r3, @androidx.annotation.C0359n0 O r4, @androidx.annotation.C0359n0 com.google.android.gms.common.api.internal.C40650y r5) {
        /*
            r1 = this;
            com.google.android.gms.common.api.h$a$a r0 = new com.google.android.gms.common.api.h$a$a
            r0.<init>()
            r0.mo133735c(r5)
            com.google.android.gms.common.api.h$a r5 = r0.mo133733a()
            r1.<init>((android.content.Context) r2, r3, r4, (com.google.android.gms.common.api.C40504h.C40505a) r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.api.C40504h.<init>(android.content.Context, com.google.android.gms.common.api.a, com.google.android.gms.common.api.a$d, com.google.android.gms.common.api.internal.y):void");
    }
}
