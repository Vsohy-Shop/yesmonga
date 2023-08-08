package androidx.activity;

import androidx.annotation.C0323b0;
import androidx.annotation.RestrictTo;
import com.usabilla.sdk.ubform.telemetry.C10108c;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

@C11363r0({"SMAP\nFullyDrawnReporter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FullyDrawnReporter.kt\nandroidx/activity/FullyDrawnReporter\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,192:1\n1#2:193\n1855#3,2:194\n*S KotlinDebug\n*F\n+ 1 FullyDrawnReporter.kt\nandroidx/activity/FullyDrawnReporter\n*L\n157#1:194,2\n*E\n"})
/* renamed from: androidx.activity.r */
public final class C0251r {
    @C12579k

    /* renamed from: a */
    public final Executor f745a;
    @C12579k

    /* renamed from: b */
    public final C11289a<C11079d2> f746b;
    @C12579k

    /* renamed from: c */
    public final Object f747c = new Object();
    @C0323b0("lock")

    /* renamed from: d */
    public int f748d;
    @C0323b0("lock")

    /* renamed from: e */
    public boolean f749e;
    @C0323b0("lock")

    /* renamed from: f */
    public boolean f750f;
    @C0323b0("lock")
    @C12579k

    /* renamed from: g */
    public final List<C11289a<C11079d2>> f751g = new ArrayList();
    @C12579k

    /* renamed from: h */
    public final Runnable f752h = new C0250q(this);

    public C0251r(@C12579k Executor executor, @C12579k C11289a<C11079d2> aVar) {
        Intrinsics.checkNotNullParameter(executor, "executor");
        Intrinsics.checkNotNullParameter(aVar, "reportFullyDrawn");
        this.f745a = executor;
        this.f746b = aVar;
    }

    /* renamed from: i */
    public static final void m1343i(C0251r rVar) {
        Intrinsics.checkNotNullParameter(rVar, "this$0");
        synchronized (rVar.f747c) {
            rVar.f749e = false;
            if (rVar.f748d == 0 && !rVar.f750f) {
                rVar.f746b.invoke();
                rVar.mo849d();
            }
            C11079d2 d2Var = C11079d2.f28267a;
        }
    }

    /* renamed from: b */
    public final void mo847b(@C12579k C11289a<C11079d2> aVar) {
        boolean z;
        Intrinsics.checkNotNullParameter(aVar, C10108c.f27778C);
        synchronized (this.f747c) {
            if (this.f750f) {
                z = true;
            } else {
                this.f751g.add(aVar);
                z = false;
            }
        }
        if (z) {
            aVar.invoke();
        }
    }

    /* renamed from: c */
    public final void mo848c() {
        synchronized (this.f747c) {
            if (!this.f750f) {
                this.f748d++;
            }
            C11079d2 d2Var = C11079d2.f28267a;
        }
    }

    @RestrictTo({RestrictTo.Scope.f843b})
    /* renamed from: d */
    public final void mo849d() {
        synchronized (this.f747c) {
            this.f750f = true;
            for (C11289a invoke : this.f751g) {
                invoke.invoke();
            }
            this.f751g.clear();
            C11079d2 d2Var = C11079d2.f28267a;
        }
    }

    /* renamed from: e */
    public final boolean mo850e() {
        boolean z;
        synchronized (this.f747c) {
            z = this.f750f;
        }
        return z;
    }

    /* renamed from: f */
    public final void mo851f() {
        if (!this.f749e && this.f748d == 0) {
            this.f749e = true;
            this.f745a.execute(this.f752h);
        }
    }

    /* renamed from: g */
    public final void mo852g(@C12579k C11289a<C11079d2> aVar) {
        Intrinsics.checkNotNullParameter(aVar, C10108c.f27778C);
        synchronized (this.f747c) {
            this.f751g.remove(aVar);
            C11079d2 d2Var = C11079d2.f28267a;
        }
    }

    /* renamed from: h */
    public final void mo853h() {
        boolean z;
        synchronized (this.f747c) {
            if (!this.f750f) {
                int i = this.f748d;
                if (i > 0) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    this.f748d = i - 1;
                    mo851f();
                } else {
                    throw new IllegalStateException("removeReporter() called when all reporters have already been removed.".toString());
                }
            }
            C11079d2 d2Var = C11079d2.f28267a;
        }
    }
}
