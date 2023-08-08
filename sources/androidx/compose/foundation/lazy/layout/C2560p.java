package androidx.compose.foundation.lazy.layout;

import android.os.Trace;
import android.view.Choreographer;
import android.view.View;
import androidx.compose.foundation.C2855v;
import androidx.compose.foundation.lazy.layout.C2557o;
import androidx.compose.p004ui.layout.SubcomposeLayoutState;
import androidx.compose.runtime.C8616s1;
import androidx.compose.runtime.collection.C8423g;
import com.google.android.gms.analytics.ecommerce.C40383c;
import java.util.concurrent.TimeUnit;
import kotlin.C11079d2;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C2855v
@C11363r0({"SMAP\nLazyLayoutPrefetcher.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyLayoutPrefetcher.android.kt\nandroidx/compose/foundation/lazy/layout/LazyLayoutPrefetcher\n+ 2 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVectorKt\n+ 3 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n+ 4 AndroidTrace.android.kt\nandroidx/compose/ui/util/AndroidTrace_androidKt\n*L\n1#1,311:1\n1182#2:312\n1161#2,2:313\n523#3:315\n26#4,5:316\n26#4,5:321\n*S KotlinDebug\n*F\n+ 1 LazyLayoutPrefetcher.android.kt\nandroidx/compose/foundation/lazy/layout/LazyLayoutPrefetcher\n*L\n122#1:312\n122#1:313,2\n159#1:315\n164#1:316,5\n182#1:321,5\n*E\n"})
/* renamed from: androidx.compose.foundation.lazy.layout.p */
public final class C2560p implements C8616s1, C2557o.C2559b, Runnable, Choreographer.FrameCallback {
    @C12579k

    /* renamed from: y */
    public static final C2561a f6742y = new C2561a((DefaultConstructorMarker) null);

    /* renamed from: z */
    public static long f6743z;
    @C12579k

    /* renamed from: a */
    public final C2557o f6744a;
    @C12579k

    /* renamed from: b */
    public final SubcomposeLayoutState f6745b;
    @C12579k

    /* renamed from: c */
    public final LazyLayoutItemContentFactory f6746c;
    @C12579k

    /* renamed from: d */
    public final View f6747d;
    @C12579k

    /* renamed from: e */
    public final C8423g<C2562b> f6748e = new C8423g<>(new C2562b[16], 0);

    /* renamed from: f */
    public long f6749f;

    /* renamed from: g */
    public long f6750g;

    /* renamed from: v */
    public boolean f6751v;

    /* renamed from: w */
    public final Choreographer f6752w = Choreographer.getInstance();

    /* renamed from: x */
    public boolean f6753x;

    /* renamed from: androidx.compose.foundation.lazy.layout.p$a */
    public static final class C2561a {
        public /* synthetic */ C2561a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX WARNING: Code restructure failed: missing block: B:6:0x001e, code lost:
            if (r5 >= 30.0f) goto L_0x0023;
         */
        /* renamed from: b */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void mo8804b(android.view.View r5) {
            /*
                r4 = this;
                long r0 = androidx.compose.foundation.lazy.layout.C2560p.f6743z
                r2 = 0
                int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
                if (r0 != 0) goto L_0x002c
                android.view.Display r0 = r5.getDisplay()
                boolean r5 = r5.isInEditMode()
                if (r5 != 0) goto L_0x0021
                if (r0 == 0) goto L_0x0021
                float r5 = r0.getRefreshRate()
                r0 = 1106247680(0x41f00000, float:30.0)
                int r0 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
                if (r0 < 0) goto L_0x0021
                goto L_0x0023
            L_0x0021:
                r5 = 1114636288(0x42700000, float:60.0)
            L_0x0023:
                r0 = 1000000000(0x3b9aca00, float:0.0047237873)
                float r0 = (float) r0
                float r0 = r0 / r5
                long r0 = (long) r0
                androidx.compose.foundation.lazy.layout.C2560p.f6743z = r0
            L_0x002c:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.lazy.layout.C2560p.C2561a.mo8804b(android.view.View):void");
        }

        public C2561a() {
        }
    }

    /* renamed from: androidx.compose.foundation.lazy.layout.p$b */
    public static final class C2562b implements C2557o.C2558a {

        /* renamed from: a */
        public final int f6754a;

        /* renamed from: b */
        public final long f6755b;
        @C12580l

        /* renamed from: c */
        public SubcomposeLayoutState.C15528a f6756c;

        /* renamed from: d */
        public boolean f6757d;

        /* renamed from: e */
        public boolean f6758e;

        public /* synthetic */ C2562b(int i, long j, DefaultConstructorMarker defaultConstructorMarker) {
            this(i, j);
        }

        /* renamed from: a */
        public final boolean mo8805a() {
            return this.f6757d;
        }

        /* renamed from: b */
        public final long mo8806b() {
            return this.f6755b;
        }

        /* renamed from: c */
        public final int mo8807c() {
            return this.f6754a;
        }

        public void cancel() {
            if (!this.f6757d) {
                this.f6757d = true;
                SubcomposeLayoutState.C15528a aVar = this.f6756c;
                if (aVar != null) {
                    aVar.mo44299g();
                }
                this.f6756c = null;
            }
        }

        /* renamed from: d */
        public final boolean mo8808d() {
            return this.f6758e;
        }

        @C12580l
        /* renamed from: e */
        public final SubcomposeLayoutState.C15528a mo8809e() {
            return this.f6756c;
        }

        /* renamed from: f */
        public final void mo8810f(boolean z) {
            this.f6757d = z;
        }

        /* renamed from: g */
        public final void mo8811g(boolean z) {
            this.f6758e = z;
        }

        /* renamed from: h */
        public final void mo8812h(@C12580l SubcomposeLayoutState.C15528a aVar) {
            this.f6756c = aVar;
        }

        public C2562b(int i, long j) {
            this.f6754a = i;
            this.f6755b = j;
        }
    }

    public C2560p(@C12579k C2557o oVar, @C12579k SubcomposeLayoutState subcomposeLayoutState, @C12579k LazyLayoutItemContentFactory lazyLayoutItemContentFactory, @C12579k View view) {
        Intrinsics.checkNotNullParameter(oVar, "prefetchState");
        Intrinsics.checkNotNullParameter(subcomposeLayoutState, "subcomposeLayoutState");
        Intrinsics.checkNotNullParameter(lazyLayoutItemContentFactory, "itemContentFactory");
        Intrinsics.checkNotNullParameter(view, C40383c.f102945c);
        this.f6744a = oVar;
        this.f6745b = subcomposeLayoutState;
        this.f6746c = lazyLayoutItemContentFactory;
        this.f6747d = view;
        f6742y.mo8804b(view);
    }

    @C12579k
    /* renamed from: a */
    public C2557o.C2558a mo8796a(int i, long j) {
        C2562b bVar = new C2562b(i, j, (DefaultConstructorMarker) null);
        this.f6748e.mo15463e(bVar);
        if (!this.f6751v) {
            this.f6751v = true;
            this.f6747d.post(this);
        }
        return bVar;
    }

    /* renamed from: d */
    public void mo8797d() {
        this.f6744a.mo8795c(this);
        this.f6753x = true;
    }

    public void doFrame(long j) {
        if (this.f6753x) {
            this.f6747d.post(this);
        }
    }

    /* renamed from: e */
    public void mo8799e() {
    }

    /* renamed from: g */
    public void mo8800g() {
        this.f6753x = false;
        this.f6744a.mo8795c((C2557o.C2559b) null);
        this.f6747d.removeCallbacks(this);
        this.f6752w.removeFrameCallback(this);
    }

    /* renamed from: h */
    public final long mo8801h(long j, long j2) {
        if (j2 == 0) {
            return j;
        }
        long j3 = (long) 4;
        return (j / j3) + ((j2 / j3) * ((long) 3));
    }

    /* renamed from: i */
    public final boolean mo8802i(long j, long j2, long j3) {
        return j > j2 || j + j3 < j2;
    }

    public void run() {
        boolean z;
        if (this.f6748e.mo15476l0() || !this.f6751v || !this.f6753x || this.f6747d.getWindowVisibility() != 0) {
            this.f6751v = false;
            return;
        }
        long nanos = TimeUnit.MILLISECONDS.toNanos(this.f6747d.getDrawingTime()) + f6743z;
        boolean z2 = false;
        while (this.f6748e.mo15477m0() && !z2) {
            C2562b bVar = (C2562b) this.f6748e.mo15462d0()[0];
            C2549h invoke = this.f6746c.mo8680d().invoke();
            if (!bVar.mo8805a()) {
                int a = invoke.mo8288a();
                int c = bVar.mo8807c();
                if (c < 0 || c >= a) {
                    z = false;
                } else {
                    z = true;
                }
                if (z) {
                    if (bVar.mo8809e() == null) {
                        Trace.beginSection("compose:lazylist:prefetch:compose");
                        try {
                            long nanoTime = System.nanoTime();
                            if (mo8802i(nanoTime, nanos, this.f6749f)) {
                                Object g = invoke.mo8293g(bVar.mo8807c());
                                bVar.mo8812h(this.f6745b.mo44349j(g, this.f6746c.mo8678b(bVar.mo8807c(), g)));
                                this.f6749f = mo8801h(System.nanoTime() - nanoTime, this.f6749f);
                            } else {
                                z2 = true;
                            }
                            C11079d2 d2Var = C11079d2.f28267a;
                        } finally {
                            Trace.endSection();
                        }
                    } else if (!bVar.mo8808d()) {
                        Trace.beginSection("compose:lazylist:prefetch:measure");
                        try {
                            long nanoTime2 = System.nanoTime();
                            if (mo8802i(nanoTime2, nanos, this.f6750g)) {
                                SubcomposeLayoutState.C15528a e = bVar.mo8809e();
                                Intrinsics.checkNotNull(e);
                                int a2 = e.mo44297a();
                                for (int i = 0; i < a2; i++) {
                                    e.mo44298b(i, bVar.mo8806b());
                                }
                                this.f6750g = mo8801h(System.nanoTime() - nanoTime2, this.f6750g);
                                this.f6748e.mo15437D0(0);
                            } else {
                                C11079d2 d2Var2 = C11079d2.f28267a;
                                z2 = true;
                            }
                        } finally {
                            Trace.endSection();
                        }
                    } else {
                        throw new IllegalStateException("Check failed.".toString());
                    }
                }
            }
            this.f6748e.mo15437D0(0);
        }
        if (z2) {
            this.f6752w.postFrameCallback(this);
        } else {
            this.f6751v = false;
        }
    }
}
