package androidx.window.layout;

import android.annotation.SuppressLint;
import android.app.Activity;
import androidx.annotation.C0323b0;
import androidx.appcompat.widget.C0696c;
import androidx.core.util.C17970d;
import androidx.window.extensions.layout.WindowLayoutComponent;
import androidx.window.extensions.layout.WindowLayoutInfo;
import com.google.android.gms.common.internal.C40852x;
import com.urbanairship.job.C9314l;
import com.usabilla.sdk.ubform.telemetry.C10108c;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.locks.ReentrantLock;
import java.util.function.Consumer;
import kotlin.C11079d2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

/* renamed from: androidx.window.layout.j */
public final class C21049j implements C21068p {
    @C12579k

    /* renamed from: a */
    public final WindowLayoutComponent f54276a;
    @C12579k

    /* renamed from: b */
    public final ReentrantLock f54277b = new ReentrantLock();
    @C0323b0("lock")
    @C12579k

    /* renamed from: c */
    public final Map<Activity, C21050a> f54278c = new LinkedHashMap();
    @C0323b0("lock")
    @C12579k

    /* renamed from: d */
    public final Map<C17970d<C21073t>, Activity> f54279d = new LinkedHashMap();

    @SuppressLint({"NewApi"})
    /* renamed from: androidx.window.layout.j$a */
    public static final class C21050a implements Consumer<WindowLayoutInfo> {
        @C12579k

        /* renamed from: a */
        public final Activity f54280a;
        @C12579k

        /* renamed from: b */
        public final ReentrantLock f54281b = new ReentrantLock();
        @C12580l
        @C0323b0("lock")

        /* renamed from: c */
        public C21073t f54282c;
        @C0323b0("lock")
        @C12579k

        /* renamed from: d */
        public final Set<C17970d<C21073t>> f54283d = new LinkedHashSet();

        public C21050a(@C12579k Activity activity) {
            Intrinsics.checkNotNullParameter(activity, C0696c.f2306r);
            this.f54280a = activity;
        }

        /* renamed from: a */
        public void accept(@C12579k WindowLayoutInfo windowLayoutInfo) {
            Intrinsics.checkNotNullParameter(windowLayoutInfo, "value");
            ReentrantLock reentrantLock = this.f54281b;
            reentrantLock.lock();
            try {
                this.f54282c = C21051k.f54284a.mo62980b(this.f54280a, windowLayoutInfo);
                for (C17970d accept : this.f54283d) {
                    accept.accept(this.f54282c);
                }
                C11079d2 d2Var = C11079d2.f28267a;
            } finally {
                reentrantLock.unlock();
            }
        }

        /* renamed from: b */
        public final void mo62976b(@C12579k C17970d<C21073t> dVar) {
            Intrinsics.checkNotNullParameter(dVar, C40852x.C40853a.f103958a);
            ReentrantLock reentrantLock = this.f54281b;
            reentrantLock.lock();
            try {
                C21073t tVar = this.f54282c;
                if (tVar != null) {
                    dVar.accept(tVar);
                }
                this.f54283d.add(dVar);
            } finally {
                reentrantLock.unlock();
            }
        }

        /* renamed from: c */
        public final boolean mo62977c() {
            return this.f54283d.isEmpty();
        }

        /* renamed from: d */
        public final void mo62978d(@C12579k C17970d<C21073t> dVar) {
            Intrinsics.checkNotNullParameter(dVar, C40852x.C40853a.f103958a);
            ReentrantLock reentrantLock = this.f54281b;
            reentrantLock.lock();
            try {
                this.f54283d.remove(dVar);
            } finally {
                reentrantLock.unlock();
            }
        }
    }

    public C21049j(@C12579k WindowLayoutComponent windowLayoutComponent) {
        Intrinsics.checkNotNullParameter(windowLayoutComponent, C9314l.f25417c);
        this.f54276a = windowLayoutComponent;
    }

    /* renamed from: a */
    public void mo62972a(@C12579k Activity activity, @C12579k Executor executor, @C12579k C17970d<C21073t> dVar) {
        C11079d2 d2Var;
        Intrinsics.checkNotNullParameter(activity, C0696c.f2306r);
        Intrinsics.checkNotNullParameter(executor, "executor");
        Intrinsics.checkNotNullParameter(dVar, C10108c.f27778C);
        ReentrantLock reentrantLock = this.f54277b;
        reentrantLock.lock();
        try {
            C21050a aVar = this.f54278c.get(activity);
            if (aVar == null) {
                d2Var = null;
            } else {
                aVar.mo62976b(dVar);
                this.f54279d.put(dVar, activity);
                d2Var = C11079d2.f28267a;
            }
            if (d2Var == null) {
                C21050a aVar2 = new C21050a(activity);
                this.f54278c.put(activity, aVar2);
                this.f54279d.put(dVar, activity);
                aVar2.mo62976b(dVar);
                this.f54276a.addWindowLayoutInfoListener(activity, aVar2);
            }
            C11079d2 d2Var2 = C11079d2.f28267a;
        } finally {
            reentrantLock.unlock();
        }
    }

    /* renamed from: b */
    public void mo62973b(@C12579k C17970d<C21073t> dVar) {
        Intrinsics.checkNotNullParameter(dVar, C10108c.f27778C);
        ReentrantLock reentrantLock = this.f54277b;
        reentrantLock.lock();
        try {
            Activity activity = this.f54279d.get(dVar);
            if (activity != null) {
                C21050a aVar = this.f54278c.get(activity);
                if (aVar == null) {
                    reentrantLock.unlock();
                    return;
                }
                aVar.mo62978d(dVar);
                if (aVar.mo62977c()) {
                    this.f54276a.removeWindowLayoutInfoListener(aVar);
                }
                C11079d2 d2Var = C11079d2.f28267a;
                reentrantLock.unlock();
            }
        } finally {
            reentrantLock.unlock();
        }
    }
}
