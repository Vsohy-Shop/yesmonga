package androidx.room;

import android.annotation.SuppressLint;
import androidx.arch.core.executor.C0829c;
import androidx.lifecycle.LiveData;
import androidx.room.C20295e0;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

@SuppressLint({"RestrictedApi"})
/* renamed from: androidx.room.y1 */
public final class C20415y1<T> extends LiveData<T> {
    @C12579k

    /* renamed from: m */
    public final RoomDatabase f52638m;
    @C12579k

    /* renamed from: n */
    public final C20287c0 f52639n;

    /* renamed from: o */
    public final boolean f52640o;
    @C12579k

    /* renamed from: p */
    public final Callable<T> f52641p;
    @C12579k

    /* renamed from: q */
    public final C20295e0.C20299c f52642q;
    @C12579k

    /* renamed from: r */
    public final AtomicBoolean f52643r = new AtomicBoolean(true);
    @C12579k

    /* renamed from: s */
    public final AtomicBoolean f52644s = new AtomicBoolean(false);
    @C12579k

    /* renamed from: t */
    public final AtomicBoolean f52645t = new AtomicBoolean(false);
    @C12579k

    /* renamed from: u */
    public final Runnable f52646u = new C20406w1(this);
    @C12579k

    /* renamed from: v */
    public final Runnable f52647v = new C20409x1(this);

    /* renamed from: androidx.room.y1$a */
    public static final class C20416a extends C20295e0.C20299c {

        /* renamed from: b */
        public final /* synthetic */ C20415y1<T> f52648b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C20416a(String[] strArr, C20415y1<T> y1Var) {
            super(strArr);
            this.f52648b = y1Var;
        }

        /* renamed from: c */
        public void mo61047c(@C12579k Set<String> set) {
            Intrinsics.checkNotNullParameter(set, "tables");
            C0829c.m3971h().mo3800b(this.f52648b.mo61273z());
        }
    }

    public C20415y1(@C12579k RoomDatabase roomDatabase, @C12579k C20287c0 c0Var, boolean z, @C12579k Callable<T> callable, @C12579k String[] strArr) {
        Intrinsics.checkNotNullParameter(roomDatabase, "database");
        Intrinsics.checkNotNullParameter(c0Var, "container");
        Intrinsics.checkNotNullParameter(callable, "computeFunction");
        Intrinsics.checkNotNullParameter(strArr, "tableNames");
        this.f52638m = roomDatabase;
        this.f52639n = c0Var;
        this.f52640o = z;
        this.f52641p = callable;
        this.f52642q = new C20416a(strArr, this);
    }

    /* renamed from: E */
    public static final void m95219E(C20415y1 y1Var) {
        Intrinsics.checkNotNullParameter(y1Var, "this$0");
        boolean h = y1Var.mo57488h();
        if (y1Var.f52643r.compareAndSet(false, true) && h) {
            y1Var.mo61265B().execute(y1Var.f52646u);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:22:0x004f  */
    /* JADX WARNING: Removed duplicated region for block: B:5:0x0022  */
    /* renamed from: F */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m95220F(androidx.room.C20415y1 r5) {
        /*
            java.lang.String r0 = "this$0"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
            java.util.concurrent.atomic.AtomicBoolean r0 = r5.f52645t
            r1 = 0
            r2 = 1
            boolean r0 = r0.compareAndSet(r1, r2)
            if (r0 == 0) goto L_0x001a
            androidx.room.RoomDatabase r0 = r5.f52638m
            androidx.room.e0 r0 = r0.mo60912p()
            androidx.room.e0$c r3 = r5.f52642q
            r0.mo61013c(r3)
        L_0x001a:
            java.util.concurrent.atomic.AtomicBoolean r0 = r5.f52644s
            boolean r0 = r0.compareAndSet(r1, r2)
            if (r0 == 0) goto L_0x004f
            r0 = 0
            r3 = r1
        L_0x0024:
            java.util.concurrent.atomic.AtomicBoolean r4 = r5.f52643r     // Catch:{ all -> 0x0048 }
            boolean r4 = r4.compareAndSet(r2, r1)     // Catch:{ all -> 0x0048 }
            if (r4 == 0) goto L_0x003d
            java.util.concurrent.Callable<T> r0 = r5.f52641p     // Catch:{ Exception -> 0x0034 }
            java.lang.Object r0 = r0.call()     // Catch:{ Exception -> 0x0034 }
            r3 = r2
            goto L_0x0024
        L_0x0034:
            r0 = move-exception
            java.lang.RuntimeException r2 = new java.lang.RuntimeException     // Catch:{ all -> 0x0048 }
            java.lang.String r3 = "Exception while computing database live data."
            r2.<init>(r3, r0)     // Catch:{ all -> 0x0048 }
            throw r2     // Catch:{ all -> 0x0048 }
        L_0x003d:
            if (r3 == 0) goto L_0x0042
            r5.mo57493o(r0)     // Catch:{ all -> 0x0048 }
        L_0x0042:
            java.util.concurrent.atomic.AtomicBoolean r0 = r5.f52644s
            r0.set(r1)
            goto L_0x0050
        L_0x0048:
            r0 = move-exception
            java.util.concurrent.atomic.AtomicBoolean r5 = r5.f52644s
            r5.set(r1)
            throw r0
        L_0x004f:
            r3 = r1
        L_0x0050:
            if (r3 == 0) goto L_0x005a
            java.util.concurrent.atomic.AtomicBoolean r0 = r5.f52643r
            boolean r0 = r0.get()
            if (r0 != 0) goto L_0x001a
        L_0x005a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.room.C20415y1.m95220F(androidx.room.y1):void");
    }

    @C12579k
    /* renamed from: A */
    public final C20295e0.C20299c mo61264A() {
        return this.f52642q;
    }

    @C12579k
    /* renamed from: B */
    public final Executor mo61265B() {
        if (this.f52640o) {
            return this.f52638m.mo60916x();
        }
        return this.f52638m.mo60914t();
    }

    @C12579k
    /* renamed from: C */
    public final Runnable mo61266C() {
        return this.f52646u;
    }

    @C12579k
    /* renamed from: D */
    public final AtomicBoolean mo61267D() {
        return this.f52645t;
    }

    /* renamed from: m */
    public void mo57444m() {
        super.mo57444m();
        C20287c0 c0Var = this.f52639n;
        Intrinsics.checkNotNull(this, "null cannot be cast to non-null type androidx.lifecycle.LiveData<kotlin.Any>");
        c0Var.mo60999c(this);
        mo61265B().execute(this.f52646u);
    }

    /* renamed from: n */
    public void mo57445n() {
        super.mo57445n();
        C20287c0 c0Var = this.f52639n;
        Intrinsics.checkNotNull(this, "null cannot be cast to non-null type androidx.lifecycle.LiveData<kotlin.Any>");
        c0Var.mo61000d(this);
    }

    @C12579k
    /* renamed from: u */
    public final Callable<T> mo61268u() {
        return this.f52641p;
    }

    @C12579k
    /* renamed from: v */
    public final AtomicBoolean mo61269v() {
        return this.f52644s;
    }

    @C12579k
    /* renamed from: w */
    public final RoomDatabase mo61270w() {
        return this.f52638m;
    }

    /* renamed from: x */
    public final boolean mo61271x() {
        return this.f52640o;
    }

    @C12579k
    /* renamed from: y */
    public final AtomicBoolean mo61272y() {
        return this.f52643r;
    }

    @C12579k
    /* renamed from: z */
    public final Runnable mo61273z() {
        return this.f52647v;
    }
}
