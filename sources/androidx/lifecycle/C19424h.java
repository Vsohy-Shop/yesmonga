package androidx.lifecycle;

import androidx.annotation.C0344h1;
import androidx.annotation.C0348i1;
import androidx.annotation.RestrictTo;
import androidx.arch.core.executor.C0829c;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.C11287e;
import kotlin.jvm.C11315i;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
/* renamed from: androidx.lifecycle.h */
public abstract class C19424h<T> {
    @C12579k

    /* renamed from: a */
    public final Executor f49798a;
    @C12579k

    /* renamed from: b */
    public final LiveData<T> f49799b;
    @C12579k

    /* renamed from: c */
    public final LiveData<T> f49800c;
    @C12579k

    /* renamed from: d */
    public final AtomicBoolean f49801d;
    @C12579k

    /* renamed from: e */
    public final AtomicBoolean f49802e;
    @C12579k
    @C11287e

    /* renamed from: f */
    public final Runnable f49803f;
    @C12579k
    @C11287e

    /* renamed from: g */
    public final Runnable f49804g;

    /* renamed from: androidx.lifecycle.h$a */
    public static final class C19425a extends LiveData<T> {

        /* renamed from: m */
        public final /* synthetic */ C19424h<T> f49805m;

        public C19425a(C19424h<T> hVar) {
            this.f49805m = hVar;
        }

        /* renamed from: m */
        public void mo57444m() {
            this.f49805m.mo57579e().execute(this.f49805m.f49803f);
        }
    }

    @C11315i
    public C19424h() {
        this((Executor) null, 1, (DefaultConstructorMarker) null);
    }

    @C0344h1
    /* renamed from: g */
    public static /* synthetic */ void m90693g() {
    }

    @C0344h1
    /* renamed from: i */
    public static /* synthetic */ void m90694i() {
    }

    /* renamed from: k */
    public static final void m90695k(C19424h hVar) {
        Intrinsics.checkNotNullParameter(hVar, "this$0");
        boolean h = hVar.mo57581h().mo57488h();
        if (hVar.f49801d.compareAndSet(false, true) && h) {
            hVar.f49798a.execute(hVar.f49803f);
        }
    }

    /* JADX INFO: finally extract failed */
    /* JADX WARNING: Removed duplicated region for block: B:3:0x000f  */
    /* renamed from: l */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m90696l(androidx.lifecycle.C19424h r5) {
        /*
            java.lang.String r0 = "this$0"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
        L_0x0005:
            java.util.concurrent.atomic.AtomicBoolean r0 = r5.f49802e
            r1 = 0
            r2 = 1
            boolean r0 = r0.compareAndSet(r1, r2)
            if (r0 == 0) goto L_0x0036
            r0 = 0
            r3 = r1
        L_0x0011:
            java.util.concurrent.atomic.AtomicBoolean r4 = r5.f49801d     // Catch:{ all -> 0x002f }
            boolean r4 = r4.compareAndSet(r2, r1)     // Catch:{ all -> 0x002f }
            if (r4 == 0) goto L_0x001f
            java.lang.Object r0 = r5.mo57577c()     // Catch:{ all -> 0x002f }
            r3 = r2
            goto L_0x0011
        L_0x001f:
            if (r3 == 0) goto L_0x0028
            androidx.lifecycle.LiveData r2 = r5.mo57581h()     // Catch:{ all -> 0x002f }
            r2.mo57493o(r0)     // Catch:{ all -> 0x002f }
        L_0x0028:
            java.util.concurrent.atomic.AtomicBoolean r0 = r5.f49802e
            r0.set(r1)
            r1 = r3
            goto L_0x0036
        L_0x002f:
            r0 = move-exception
            java.util.concurrent.atomic.AtomicBoolean r5 = r5.f49802e
            r5.set(r1)
            throw r0
        L_0x0036:
            if (r1 == 0) goto L_0x0040
            java.util.concurrent.atomic.AtomicBoolean r0 = r5.f49801d
            boolean r0 = r0.get()
            if (r0 != 0) goto L_0x0005
        L_0x0040:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.lifecycle.C19424h.m90696l(androidx.lifecycle.h):void");
    }

    @C0348i1
    /* renamed from: c */
    public abstract T mo57577c();

    @C12579k
    /* renamed from: d */
    public final AtomicBoolean mo57578d() {
        return this.f49802e;
    }

    @C12579k
    /* renamed from: e */
    public final Executor mo57579e() {
        return this.f49798a;
    }

    @C12579k
    /* renamed from: f */
    public final AtomicBoolean mo57580f() {
        return this.f49801d;
    }

    @C12579k
    /* renamed from: h */
    public LiveData<T> mo57581h() {
        return this.f49800c;
    }

    /* renamed from: j */
    public void mo57582j() {
        C0829c.m3971h().mo3800b(this.f49804g);
    }

    @C11315i
    public C19424h(@C12579k Executor executor) {
        Intrinsics.checkNotNullParameter(executor, "executor");
        this.f49798a = executor;
        C19425a aVar = new C19425a(this);
        this.f49799b = aVar;
        this.f49800c = aVar;
        this.f49801d = new AtomicBoolean(true);
        this.f49802e = new AtomicBoolean(false);
        this.f49803f = new C19420f(this);
        this.f49804g = new C19422g(this);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ C19424h(java.util.concurrent.Executor r1, int r2, kotlin.jvm.internal.DefaultConstructorMarker r3) {
        /*
            r0 = this;
            r2 = r2 & 1
            if (r2 == 0) goto L_0x000d
            java.util.concurrent.Executor r1 = androidx.arch.core.executor.C0829c.m3970g()
            java.lang.String r2 = "getIOThreadExecutor()"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r2)
        L_0x000d:
            r0.<init>(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.lifecycle.C19424h.<init>(java.util.concurrent.Executor, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
