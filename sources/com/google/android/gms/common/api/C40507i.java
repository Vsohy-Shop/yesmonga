package com.google.android.gms.common.api;

import android.accounts.Account;
import android.app.Activity;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.collection.C1866a;
import androidx.fragment.app.C19232h;
import com.bumptech.glide.load.engine.GlideException;
import com.google.android.gms.common.C40713g;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.annotation.C40473a;
import com.google.android.gms.common.api.C40477a;
import com.google.android.gms.common.api.internal.C40538e;
import com.google.android.gms.common.api.internal.C40546f;
import com.google.android.gms.common.api.internal.C40562h3;
import com.google.android.gms.common.api.internal.C40582l;
import com.google.android.gms.common.api.internal.C40592n;
import com.google.android.gms.common.api.internal.C40609q;
import com.google.android.gms.common.api.internal.C40640w;
import com.google.android.gms.common.internal.C40733b;
import com.google.android.gms.common.internal.C40756f;
import com.google.android.gms.common.internal.C40770i0;
import com.google.android.gms.common.internal.C40843u;
import com.google.android.gms.common.util.C40974d0;
import com.google.android.gms.signin.C30974a;
import com.google.android.gms.signin.C30978e;
import com.google.errorprone.annotations.C32488a;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.TimeUnit;
import javax.annotation.concurrent.GuardedBy;

@Deprecated
/* renamed from: com.google.android.gms.common.api.i */
public abstract class C40507i {
    @C40473a
    @C0359n0

    /* renamed from: a */
    public static final String f103250a = "<<default account>>";

    /* renamed from: b */
    public static final int f103251b = 1;

    /* renamed from: c */
    public static final int f103252c = 2;
    @GuardedBy("sAllClients")

    /* renamed from: d */
    public static final Set f103253d = Collections.newSetFromMap(new WeakHashMap());

    @Deprecated
    /* renamed from: com.google.android.gms.common.api.i$b */
    public interface C40509b extends C40546f {

        /* renamed from: l */
        public static final int f103272l = 1;

        /* renamed from: m */
        public static final int f103273m = 2;
    }

    @Deprecated
    /* renamed from: com.google.android.gms.common.api.i$c */
    public interface C40510c extends C40609q {
    }

    /* renamed from: k */
    public static void m164795k(@C0359n0 String str, @C0359n0 FileDescriptor fileDescriptor, @C0359n0 PrintWriter printWriter, @C0359n0 String[] strArr) {
        Set<C40507i> set = f103253d;
        synchronized (set) {
            String str2 = str + GlideException.C22148a.f56917d;
            int i = 0;
            for (C40507i j : set) {
                printWriter.append(str).append("GoogleApiClient#").println(i);
                j.mo133751j(str2, fileDescriptor, printWriter, strArr);
                i++;
            }
        }
    }

    @C40473a
    @C0359n0
    /* renamed from: n */
    public static Set<C40507i> m164796n() {
        Set<C40507i> set = f103253d;
        synchronized (set) {
        }
        return set;
    }

    /* renamed from: A */
    public abstract void mo133736A();

    /* renamed from: B */
    public abstract void mo133737B(@C0359n0 C40509b bVar);

    /* renamed from: C */
    public abstract void mo133738C(@C0359n0 C40510c cVar);

    @C40473a
    @C0359n0
    /* renamed from: D */
    public <L> C40592n<L> mo133739D(@C0359n0 L l) {
        throw new UnsupportedOperationException();
    }

    /* renamed from: E */
    public abstract void mo133740E(@C0359n0 C19232h hVar);

    /* renamed from: F */
    public abstract void mo133741F(@C0359n0 C40509b bVar);

    /* renamed from: G */
    public abstract void mo133742G(@C0359n0 C40510c cVar);

    /* renamed from: H */
    public void mo133743H(C40562h3 h3Var) {
        throw new UnsupportedOperationException();
    }

    /* renamed from: I */
    public void mo133744I(C40562h3 h3Var) {
        throw new UnsupportedOperationException();
    }

    @C0359n0
    /* renamed from: d */
    public abstract ConnectionResult mo133745d();

    @C0359n0
    /* renamed from: e */
    public abstract ConnectionResult mo133746e(long j, @C0359n0 TimeUnit timeUnit);

    @C0359n0
    /* renamed from: f */
    public abstract C40663m<Status> mo133747f();

    /* renamed from: g */
    public abstract void mo133748g();

    /* renamed from: h */
    public void mo133749h(int i) {
        throw new UnsupportedOperationException();
    }

    /* renamed from: i */
    public abstract void mo133750i();

    /* renamed from: j */
    public abstract void mo133751j(@C0359n0 String str, @C0359n0 FileDescriptor fileDescriptor, @C0359n0 PrintWriter printWriter, @C0359n0 String[] strArr);

    @C40473a
    @C0359n0
    /* renamed from: l */
    public <A extends C40477a.C40479b, R extends C40669r, T extends C40538e.C40539a<R, A>> T mo133752l(@C0359n0 T t) {
        throw new UnsupportedOperationException();
    }

    @C40473a
    @C0359n0
    /* renamed from: m */
    public <A extends C40477a.C40479b, T extends C40538e.C40539a<? extends C40669r, A>> T mo133753m(@C0359n0 T t) {
        throw new UnsupportedOperationException();
    }

    @C40473a
    @C0359n0
    /* renamed from: o */
    public <C extends C40477a.C40489f> C mo133754o(@C0359n0 C40477a.C40480c<C> cVar) {
        throw new UnsupportedOperationException();
    }

    @C0359n0
    /* renamed from: p */
    public abstract ConnectionResult mo133755p(@C0359n0 C40477a<?> aVar);

    @C40473a
    @C0359n0
    /* renamed from: q */
    public Context mo133756q() {
        throw new UnsupportedOperationException();
    }

    @C40473a
    @C0359n0
    /* renamed from: r */
    public Looper mo133757r() {
        throw new UnsupportedOperationException();
    }

    @C40473a
    /* renamed from: s */
    public boolean mo133758s(@C0359n0 C40477a<?> aVar) {
        throw new UnsupportedOperationException();
    }

    /* renamed from: t */
    public abstract boolean mo133759t(@C0359n0 C40477a<?> aVar);

    /* renamed from: u */
    public abstract boolean mo133760u();

    /* renamed from: v */
    public abstract boolean mo133761v();

    /* renamed from: w */
    public abstract boolean mo133762w(@C0359n0 C40509b bVar);

    /* renamed from: x */
    public abstract boolean mo133763x(@C0359n0 C40510c cVar);

    @C40473a
    /* renamed from: y */
    public boolean mo133764y(@C0359n0 C40640w wVar) {
        throw new UnsupportedOperationException();
    }

    @C40473a
    /* renamed from: z */
    public void mo133765z() {
        throw new UnsupportedOperationException();
    }

    @Deprecated
    /* renamed from: com.google.android.gms.common.api.i$a */
    public static final class C40508a {
        @C0363p0

        /* renamed from: a */
        public Account f103254a;

        /* renamed from: b */
        public final Set f103255b;

        /* renamed from: c */
        public final Set f103256c;

        /* renamed from: d */
        public int f103257d;

        /* renamed from: e */
        public View f103258e;

        /* renamed from: f */
        public String f103259f;

        /* renamed from: g */
        public String f103260g;

        /* renamed from: h */
        public final Map f103261h;

        /* renamed from: i */
        public final Context f103262i;

        /* renamed from: j */
        public final Map f103263j;

        /* renamed from: k */
        public C40582l f103264k;

        /* renamed from: l */
        public int f103265l;
        @C0363p0

        /* renamed from: m */
        public C40510c f103266m;

        /* renamed from: n */
        public Looper f103267n;

        /* renamed from: o */
        public C40713g f103268o;

        /* renamed from: p */
        public C40477a.C40478a f103269p;

        /* renamed from: q */
        public final ArrayList f103270q;

        /* renamed from: r */
        public final ArrayList f103271r;

        public C40508a(@C0359n0 Context context) {
            this.f103255b = new HashSet();
            this.f103256c = new HashSet();
            this.f103261h = new C1866a();
            this.f103263j = new C1866a();
            this.f103265l = -1;
            this.f103268o = C40713g.m165640x();
            this.f103269p = C30978e.f74219c;
            this.f103270q = new ArrayList();
            this.f103271r = new ArrayList();
            this.f103262i = context;
            this.f103267n = context.getMainLooper();
            this.f103259f = context.getPackageName();
            this.f103260g = context.getClass().getName();
        }

        @C0359n0
        @C32488a
        /* renamed from: a */
        public C40508a mo133766a(@C0359n0 C40477a<? extends C40477a.C40481d.C40486e> aVar) {
            C40843u.m166203m(aVar, "Api must not be null");
            this.f103263j.put(aVar, (Object) null);
            List<Scope> a = ((C40477a.C40488e) C40843u.m166203m(aVar.mo133662c(), "Base client builder must not be null")).mo133667a(null);
            this.f103256c.addAll(a);
            this.f103255b.addAll(a);
            return this;
        }

        @C0359n0
        @C32488a
        /* renamed from: b */
        public <O extends C40477a.C40481d.C40484c> C40508a mo133767b(@C0359n0 C40477a<O> aVar, @C0359n0 O o) {
            C40843u.m166203m(aVar, "Api must not be null");
            C40843u.m166203m(o, "Null options are not permitted for this Api");
            this.f103263j.put(aVar, o);
            List<Scope> a = ((C40477a.C40488e) C40843u.m166203m(aVar.mo133662c(), "Base client builder must not be null")).mo133667a(o);
            this.f103256c.addAll(a);
            this.f103255b.addAll(a);
            return this;
        }

        @C0359n0
        @C32488a
        /* renamed from: c */
        public <O extends C40477a.C40481d.C40484c> C40508a mo133768c(@C0359n0 C40477a<O> aVar, @C0359n0 O o, @C0359n0 Scope... scopeArr) {
            C40843u.m166203m(aVar, "Api must not be null");
            C40843u.m166203m(o, "Null options are not permitted for this Api");
            this.f103263j.put(aVar, o);
            mo133782q(aVar, o, scopeArr);
            return this;
        }

        @C0359n0
        @C32488a
        /* renamed from: d */
        public <T extends C40477a.C40481d.C40486e> C40508a mo133769d(@C0359n0 C40477a<? extends C40477a.C40481d.C40486e> aVar, @C0359n0 Scope... scopeArr) {
            C40843u.m166203m(aVar, "Api must not be null");
            this.f103263j.put(aVar, (Object) null);
            mo133782q(aVar, (C40477a.C40481d) null, scopeArr);
            return this;
        }

        @C0359n0
        @C32488a
        /* renamed from: e */
        public C40508a mo133770e(@C0359n0 C40509b bVar) {
            C40843u.m166203m(bVar, "Listener must not be null");
            this.f103270q.add(bVar);
            return this;
        }

        @C0359n0
        @C32488a
        /* renamed from: f */
        public C40508a mo133771f(@C0359n0 C40510c cVar) {
            C40843u.m166203m(cVar, "Listener must not be null");
            this.f103271r.add(cVar);
            return this;
        }

        @C0359n0
        @C32488a
        /* renamed from: g */
        public C40508a mo133772g(@C0359n0 Scope scope) {
            C40843u.m166203m(scope, "Scope must not be null");
            this.f103255b.add(scope);
            return this;
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v10, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v1, resolved type: com.google.android.gms.common.api.a} */
        /* JADX WARNING: Multi-variable type inference failed */
        @androidx.annotation.C0359n0
        /* renamed from: h */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public com.google.android.gms.common.api.C40507i mo133773h() {
            /*
                r22 = this;
                r1 = r22
                java.util.Map r0 = r1.f103263j
                boolean r0 = r0.isEmpty()
                r2 = 1
                r0 = r0 ^ r2
                java.lang.String r3 = "must call addApi() to add at least one API"
                com.google.android.gms.common.internal.C40843u.m166192b(r0, r3)
                com.google.android.gms.common.internal.f r0 = r22.mo133781p()
                java.util.Map r3 = r0.mo134393n()
                androidx.collection.a r11 = new androidx.collection.a
                r11.<init>()
                androidx.collection.a r14 = new androidx.collection.a
                r14.<init>()
                java.util.ArrayList r15 = new java.util.ArrayList
                r15.<init>()
                java.util.Map r4 = r1.f103263j
                java.util.Set r4 = r4.keySet()
                java.util.Iterator r12 = r4.iterator()
                r4 = 0
                r13 = 0
                r16 = r4
                r17 = r13
            L_0x0036:
                boolean r4 = r12.hasNext()
                if (r4 == 0) goto L_0x00c1
                java.lang.Object r4 = r12.next()
                r10 = r4
                com.google.android.gms.common.api.a r10 = (com.google.android.gms.common.api.C40477a) r10
                java.util.Map r4 = r1.f103263j
                java.lang.Object r18 = r4.get(r10)
                java.lang.Object r4 = r3.get(r10)
                if (r4 == 0) goto L_0x0051
                r4 = r2
                goto L_0x0052
            L_0x0051:
                r4 = r13
            L_0x0052:
                java.lang.Boolean r5 = java.lang.Boolean.valueOf(r4)
                r11.put(r10, r5)
                com.google.android.gms.common.api.internal.z3 r9 = new com.google.android.gms.common.api.internal.z3
                r9.<init>(r10, r4)
                r15.add(r9)
                com.google.android.gms.common.api.a$a r4 = r10.mo133660a()
                java.lang.Object r4 = com.google.android.gms.common.internal.C40843u.m166202l(r4)
                r19 = r4
                com.google.android.gms.common.api.a$a r19 = (com.google.android.gms.common.api.C40477a.C40478a) r19
                android.content.Context r5 = r1.f103262i
                android.os.Looper r6 = r1.f103267n
                r4 = r19
                r7 = r0
                r8 = r18
                r20 = r9
                r21 = r10
                r10 = r20
                com.google.android.gms.common.api.a$f r4 = r4.mo85653c(r5, r6, r7, r8, r9, r10)
                com.google.android.gms.common.api.a$c r5 = r21.mo133661b()
                r14.put(r5, r4)
                int r5 = r19.mo133668b()
                if (r5 != r2) goto L_0x0094
                if (r18 == 0) goto L_0x0092
                r17 = r2
                goto L_0x0094
            L_0x0092:
                r17 = r13
            L_0x0094:
                boolean r4 = r4.mo133671c()
                if (r4 == 0) goto L_0x0036
                if (r16 != 0) goto L_0x009f
                r16 = r21
                goto L_0x0036
            L_0x009f:
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                java.lang.String r2 = r21.mo133663d()
                java.lang.String r3 = r16.mo133663d()
                java.lang.StringBuilder r4 = new java.lang.StringBuilder
                r4.<init>()
                r4.append(r2)
                java.lang.String r2 = " cannot be used with "
                r4.append(r2)
                r4.append(r3)
                java.lang.String r2 = r4.toString()
                r0.<init>(r2)
                throw r0
            L_0x00c1:
                if (r16 == 0) goto L_0x010f
                if (r17 != 0) goto L_0x00ef
                android.accounts.Account r3 = r1.f103254a
                if (r3 != 0) goto L_0x00cb
                r3 = r2
                goto L_0x00cc
            L_0x00cb:
                r3 = r13
            L_0x00cc:
                java.lang.Object[] r4 = new java.lang.Object[r2]
                java.lang.String r5 = r16.mo133663d()
                r4[r13] = r5
                java.lang.String r5 = "Must not set an account in GoogleApiClient.Builder when using %s. Set account in GoogleSignInOptions.Builder instead"
                com.google.android.gms.common.internal.C40843u.m166210t(r3, r5, r4)
                java.util.Set r3 = r1.f103255b
                java.util.Set r4 = r1.f103256c
                boolean r3 = r3.equals(r4)
                java.lang.Object[] r4 = new java.lang.Object[r2]
                java.lang.String r5 = r16.mo133663d()
                r4[r13] = r5
                java.lang.String r5 = "Must not set scopes in GoogleApiClient.Builder when using %s. Set account in GoogleSignInOptions.Builder instead."
                com.google.android.gms.common.internal.C40843u.m166210t(r3, r5, r4)
                goto L_0x010f
            L_0x00ef:
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                java.lang.String r2 = r16.mo133663d()
                java.lang.StringBuilder r3 = new java.lang.StringBuilder
                r3.<init>()
                java.lang.String r4 = "With using "
                r3.append(r4)
                r3.append(r2)
                java.lang.String r2 = ", GamesOptions can only be specified within GoogleSignInOptions.Builder"
                r3.append(r2)
                java.lang.String r2 = r3.toString()
                r0.<init>(r2)
                throw r0
            L_0x010f:
                java.util.Collection r3 = r14.values()
                int r16 = com.google.android.gms.common.api.internal.C40572j1.m165147K(r3, r2)
                com.google.android.gms.common.api.internal.j1 r2 = new com.google.android.gms.common.api.internal.j1
                android.content.Context r5 = r1.f103262i
                java.util.concurrent.locks.ReentrantLock r6 = new java.util.concurrent.locks.ReentrantLock
                r6.<init>()
                android.os.Looper r7 = r1.f103267n
                com.google.android.gms.common.g r9 = r1.f103268o
                com.google.android.gms.common.api.a$a r10 = r1.f103269p
                java.util.ArrayList r12 = r1.f103270q
                java.util.ArrayList r13 = r1.f103271r
                int r3 = r1.f103265l
                r4 = r2
                r8 = r0
                r0 = r15
                r15 = r3
                r17 = r0
                r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17)
                java.util.Set r3 = com.google.android.gms.common.api.C40507i.f103253d
                monitor-enter(r3)
                java.util.Set r0 = com.google.android.gms.common.api.C40507i.f103253d     // Catch:{ all -> 0x0154 }
                r0.add(r2)     // Catch:{ all -> 0x0154 }
                monitor-exit(r3)     // Catch:{ all -> 0x0154 }
                int r0 = r1.f103265l
                if (r0 < 0) goto L_0x0153
                com.google.android.gms.common.api.internal.l r0 = r1.f103264k
                com.google.android.gms.common.api.internal.q3 r0 = com.google.android.gms.common.api.internal.C40613q3.m165347u(r0)
                int r3 = r1.f103265l
                com.google.android.gms.common.api.i$c r4 = r1.f103266m
                r0.mo134014v(r3, r2, r4)
            L_0x0153:
                return r2
            L_0x0154:
                r0 = move-exception
                monitor-exit(r3)     // Catch:{ all -> 0x0154 }
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.api.C40507i.C40508a.mo133773h():com.google.android.gms.common.api.i");
        }

        @C0359n0
        /* renamed from: i */
        public C40508a mo133774i(@C0359n0 C19232h hVar, int i, @C0363p0 C40510c cVar) {
            boolean z;
            C40582l lVar = new C40582l((Activity) hVar);
            if (i >= 0) {
                z = true;
            } else {
                z = false;
            }
            C40843u.m166192b(z, "clientId must be non-negative");
            this.f103265l = i;
            this.f103266m = cVar;
            this.f103264k = lVar;
            return this;
        }

        @C0359n0
        /* renamed from: j */
        public C40508a mo133775j(@C0359n0 C19232h hVar, @C0363p0 C40510c cVar) {
            mo133774i(hVar, 0, cVar);
            return this;
        }

        @C0359n0
        @C32488a
        /* renamed from: k */
        public C40508a mo133776k(@C0359n0 String str) {
            this.f103254a = str == null ? null : new Account(str, C40733b.f103787a);
            return this;
        }

        @C0359n0
        @C32488a
        /* renamed from: l */
        public C40508a mo133777l(int i) {
            this.f103257d = i;
            return this;
        }

        @C0359n0
        @C32488a
        /* renamed from: m */
        public C40508a mo133778m(@C0359n0 Handler handler) {
            C40843u.m166203m(handler, "Handler must not be null");
            this.f103267n = handler.getLooper();
            return this;
        }

        @C0359n0
        @C32488a
        /* renamed from: n */
        public C40508a mo133779n(@C0359n0 View view) {
            C40843u.m166203m(view, "View must not be null");
            this.f103258e = view;
            return this;
        }

        @C0359n0
        /* renamed from: o */
        public C40508a mo133780o() {
            mo133776k("<<default account>>");
            return this;
        }

        @C0359n0
        @C40974d0
        /* renamed from: p */
        public final C40756f mo133781p() {
            C30974a aVar = C30974a.f74207x;
            Map map = this.f103263j;
            C40477a aVar2 = C30978e.f74223g;
            if (map.containsKey(aVar2)) {
                aVar = (C30974a) this.f103263j.get(aVar2);
            }
            return new C40756f(this.f103254a, this.f103255b, this.f103261h, this.f103257d, this.f103258e, this.f103259f, this.f103260g, aVar, false);
        }

        /* renamed from: q */
        public final void mo133782q(C40477a aVar, @C0363p0 C40477a.C40481d dVar, Scope... scopeArr) {
            HashSet hashSet = new HashSet(((C40477a.C40488e) C40843u.m166203m(aVar.mo133662c(), "Base client builder must not be null")).mo133667a(dVar));
            for (Scope add : scopeArr) {
                hashSet.add(add);
            }
            this.f103261h.put(aVar, new C40770i0(hashSet));
        }

        public C40508a(@C0359n0 Context context, @C0359n0 C40509b bVar, @C0359n0 C40510c cVar) {
            this(context);
            C40843u.m166203m(bVar, "Must provide a connected listener");
            this.f103270q.add(bVar);
            C40843u.m166203m(cVar, "Must provide a connection failed listener");
            this.f103271r.add(cVar);
        }
    }
}
