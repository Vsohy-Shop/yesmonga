package androidx.window.layout;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import androidx.annotation.C0323b0;
import androidx.annotation.C0344h1;
import androidx.appcompat.widget.C0696c;
import androidx.core.util.C17970d;
import androidx.window.core.Version;
import androidx.window.layout.C21047i;
import com.urbanairship.iam.events.C9175a;
import com.usabilla.sdk.ubform.telemetry.C10108c;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.C11079d2;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

/* renamed from: androidx.window.layout.n */
public final class C21063n implements C21068p {
    @C12579k

    /* renamed from: c */
    public static final C21064a f54305c = new C21064a((DefaultConstructorMarker) null);

    /* renamed from: d */
    public static final boolean f54306d = false;
    @C12580l

    /* renamed from: e */
    public static volatile C21063n f54307e = null;
    @C12579k

    /* renamed from: f */
    public static final ReentrantLock f54308f = new ReentrantLock();
    @C12579k

    /* renamed from: g */
    public static final String f54309g = "WindowServer";
    @C0344h1
    @C12580l
    @C0323b0("globalLock")

    /* renamed from: a */
    public C21047i f54310a;
    @C12579k

    /* renamed from: b */
    public final CopyOnWriteArrayList<C21066c> f54311b = new CopyOnWriteArrayList<>();

    /* renamed from: androidx.window.layout.n$a */
    public static final class C21064a {
        public /* synthetic */ C21064a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @C12579k
        /* renamed from: a */
        public final C21063n mo63002a(@C12579k Context context) {
            Intrinsics.checkNotNullParameter(context, C9175a.f24932Y);
            if (C21063n.f54307e == null) {
                ReentrantLock d = C21063n.f54308f;
                d.lock();
                try {
                    if (C21063n.f54307e == null) {
                        C21063n.f54307e = new C21063n(C21063n.f54305c.mo63003b(context));
                    }
                    C11079d2 d2Var = C11079d2.f28267a;
                } finally {
                    d.unlock();
                }
            }
            C21063n c = C21063n.f54307e;
            Intrinsics.checkNotNull(c);
            return c;
        }

        @C12580l
        /* renamed from: b */
        public final C21047i mo63003b(@C12579k Context context) {
            Intrinsics.checkNotNullParameter(context, C9175a.f24932Y);
            try {
                if (!mo63004c(SidecarCompat.f54242f.mo62946c())) {
                    return null;
                }
                SidecarCompat sidecarCompat = new SidecarCompat(context);
                if (!sidecarCompat.mo62934d()) {
                    return null;
                }
                return sidecarCompat;
            } catch (Throwable unused) {
                return null;
            }
        }

        @C0344h1
        /* renamed from: c */
        public final boolean mo63004c(@C12580l Version version) {
            return version != null && version.compareTo(Version.f54142f.mo62759c()) >= 0;
        }

        @C0344h1
        /* renamed from: d */
        public final void mo63005d() {
            C21063n.f54307e = null;
        }

        public C21064a() {
        }
    }

    @C0344h1
    /* renamed from: androidx.window.layout.n$b */
    public final class C21065b implements C21047i.C21048a {

        /* renamed from: a */
        public final /* synthetic */ C21063n f54312a;

        public C21065b(C21063n nVar) {
            Intrinsics.checkNotNullParameter(nVar, "this$0");
            this.f54312a = nVar;
        }

        @SuppressLint({"SyntheticAccessor"})
        /* renamed from: a */
        public void mo62947a(@C12579k Activity activity, @C12579k C21073t tVar) {
            Intrinsics.checkNotNullParameter(activity, C0696c.f2306r);
            Intrinsics.checkNotNullParameter(tVar, "newLayout");
            Iterator<C21066c> it = this.f54312a.mo62999h().iterator();
            while (it.hasNext()) {
                C21066c next = it.next();
                if (Intrinsics.areEqual((Object) next.mo63007d(), (Object) activity)) {
                    next.mo63006b(tVar);
                }
            }
        }
    }

    /* renamed from: androidx.window.layout.n$c */
    public static final class C21066c {
        @C12579k

        /* renamed from: a */
        public final Activity f54313a;
        @C12579k

        /* renamed from: b */
        public final Executor f54314b;
        @C12579k

        /* renamed from: c */
        public final C17970d<C21073t> f54315c;
        @C12580l

        /* renamed from: d */
        public C21073t f54316d;

        public C21066c(@C12579k Activity activity, @C12579k Executor executor, @C12579k C17970d<C21073t> dVar) {
            Intrinsics.checkNotNullParameter(activity, C0696c.f2306r);
            Intrinsics.checkNotNullParameter(executor, "executor");
            Intrinsics.checkNotNullParameter(dVar, C10108c.f27778C);
            this.f54313a = activity;
            this.f54314b = executor;
            this.f54315c = dVar;
        }

        /* renamed from: c */
        public static final void m97421c(C21066c cVar, C21073t tVar) {
            Intrinsics.checkNotNullParameter(cVar, "this$0");
            Intrinsics.checkNotNullParameter(tVar, "$newLayoutInfo");
            cVar.f54315c.accept(tVar);
        }

        /* renamed from: b */
        public final void mo63006b(@C12579k C21073t tVar) {
            Intrinsics.checkNotNullParameter(tVar, "newLayoutInfo");
            this.f54316d = tVar;
            this.f54314b.execute(new C21067o(this, tVar));
        }

        @C12579k
        /* renamed from: d */
        public final Activity mo63007d() {
            return this.f54313a;
        }

        @C12579k
        /* renamed from: e */
        public final C17970d<C21073t> mo63008e() {
            return this.f54315c;
        }

        @C12580l
        /* renamed from: f */
        public final C21073t mo63009f() {
            return this.f54316d;
        }

        /* renamed from: g */
        public final void mo63010g(@C12580l C21073t tVar) {
            this.f54316d = tVar;
        }
    }

    @C0344h1
    public C21063n(@C12580l C21047i iVar) {
        this.f54310a = iVar;
        C21047i iVar2 = this.f54310a;
        if (iVar2 != null) {
            iVar2.mo62931a(new C21065b(this));
        }
    }

    @C0344h1
    /* renamed from: i */
    public static /* synthetic */ void m97407i() {
    }

    /* renamed from: a */
    public void mo62972a(@C12579k Activity activity, @C12579k Executor executor, @C12579k C17970d<C21073t> dVar) {
        C21073t tVar;
        T t;
        Intrinsics.checkNotNullParameter(activity, C0696c.f2306r);
        Intrinsics.checkNotNullParameter(executor, "executor");
        Intrinsics.checkNotNullParameter(dVar, C10108c.f27778C);
        ReentrantLock reentrantLock = f54308f;
        reentrantLock.lock();
        try {
            C21047i g = mo62998g();
            if (g == null) {
                dVar.accept(new C21073t(CollectionsKt__CollectionsKt.m40441E()));
                return;
            }
            boolean j = mo63000j(activity);
            C21066c cVar = new C21066c(activity, executor, dVar);
            mo62999h().add(cVar);
            if (!j) {
                g.mo62932b(activity);
            } else {
                Iterator<T> it = mo62999h().iterator();
                while (true) {
                    tVar = null;
                    if (!it.hasNext()) {
                        t = null;
                        break;
                    }
                    t = it.next();
                    if (Intrinsics.areEqual((Object) activity, (Object) ((C21066c) t).mo63007d())) {
                        break;
                    }
                }
                C21066c cVar2 = (C21066c) t;
                if (cVar2 != null) {
                    tVar = cVar2.mo63009f();
                }
                if (tVar != null) {
                    cVar.mo63006b(tVar);
                }
            }
            C11079d2 d2Var = C11079d2.f28267a;
            reentrantLock.unlock();
        } finally {
            reentrantLock.unlock();
        }
    }

    /* renamed from: b */
    public void mo62973b(@C12579k C17970d<C21073t> dVar) {
        Intrinsics.checkNotNullParameter(dVar, C10108c.f27778C);
        synchronized (f54308f) {
            if (mo62998g() != null) {
                ArrayList<C21066c> arrayList = new ArrayList<>();
                Iterator<C21066c> it = mo62999h().iterator();
                while (it.hasNext()) {
                    C21066c next = it.next();
                    if (next.mo63008e() == dVar) {
                        Intrinsics.checkNotNullExpressionValue(next, "callbackWrapper");
                        arrayList.add(next);
                    }
                }
                mo62999h().removeAll(arrayList);
                for (C21066c d : arrayList) {
                    mo62997f(d.mo63007d());
                }
                C11079d2 d2Var = C11079d2.f28267a;
            }
        }
    }

    @C0323b0("sLock")
    /* renamed from: f */
    public final void mo62997f(Activity activity) {
        C21047i iVar;
        CopyOnWriteArrayList<C21066c> copyOnWriteArrayList = this.f54311b;
        boolean z = false;
        if (!(copyOnWriteArrayList instanceof Collection) || !copyOnWriteArrayList.isEmpty()) {
            Iterator<T> it = copyOnWriteArrayList.iterator();
            while (true) {
                if (it.hasNext()) {
                    if (Intrinsics.areEqual((Object) ((C21066c) it.next()).mo63007d(), (Object) activity)) {
                        z = true;
                        break;
                    }
                } else {
                    break;
                }
            }
        }
        if (!z && (iVar = this.f54310a) != null) {
            iVar.mo62933c(activity);
        }
    }

    @C12580l
    /* renamed from: g */
    public final C21047i mo62998g() {
        return this.f54310a;
    }

    @C12579k
    /* renamed from: h */
    public final CopyOnWriteArrayList<C21066c> mo62999h() {
        return this.f54311b;
    }

    /* renamed from: j */
    public final boolean mo63000j(Activity activity) {
        CopyOnWriteArrayList<C21066c> copyOnWriteArrayList = this.f54311b;
        if ((copyOnWriteArrayList instanceof Collection) && copyOnWriteArrayList.isEmpty()) {
            return false;
        }
        for (C21066c d : copyOnWriteArrayList) {
            if (Intrinsics.areEqual((Object) d.mo63007d(), (Object) activity)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: k */
    public final void mo63001k(@C12580l C21047i iVar) {
        this.f54310a = iVar;
    }
}
