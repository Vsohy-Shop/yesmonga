package androidx.compose.p004ui.platform;

import android.os.Handler;
import android.os.Looper;
import android.view.Choreographer;
import androidx.compose.runtime.C8686v0;
import androidx.compose.runtime.internal.C8567o;
import androidx.core.p027os.C17800k;
import com.carrefour.fid.android.shared.constant.C28534f;
import com.urbanairship.iam.events.C9175a;
import com.usabilla.sdk.ubform.telemetry.C10108c;
import java.util.ArrayList;
import java.util.List;
import kotlin.C10864b0;
import kotlin.C11079d2;
import kotlin.C11677z;
import kotlin.collections.C10944i;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineDispatcher;
import org.jetbrains.annotations.C12579k;

@C8567o(parameters = 0)
@C11363r0({"SMAP\nAndroidUiDispatcher.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidUiDispatcher.android.kt\nandroidx/compose/ui/platform/AndroidUiDispatcher\n+ 2 JvmActuals.jvm.kt\nandroidx/compose/ui/platform/JvmActuals_jvmKt\n*L\n1#1,191:1\n34#2:192\n34#2:193\n34#2:194\n34#2:195\n34#2:196\n34#2:197\n*S KotlinDebug\n*F\n+ 1 AndroidUiDispatcher.android.kt\nandroidx/compose/ui/platform/AndroidUiDispatcher\n*L\n73#1:192\n89#1:193\n99#1:194\n115#1:195\n125#1:196\n137#1:197\n*E\n"})
/* renamed from: androidx.compose.ui.platform.AndroidUiDispatcher */
public final class AndroidUiDispatcher extends CoroutineDispatcher {
    @C12579k

    /* renamed from: E0 */
    public static final ThreadLocal<CoroutineContext> f39290E0 = new C15793a();
    @C12579k

    /* renamed from: X */
    public static final C15794b f39291X = new C15794b((DefaultConstructorMarker) null);

    /* renamed from: Y */
    public static final int f39292Y = 8;
    @C12579k

    /* renamed from: Z */
    public static final C11677z<CoroutineContext> f39293Z = C10864b0.m38748c(AndroidUiDispatcher$Companion$Main$2.f39305f);
    @C12579k

    /* renamed from: c */
    public final Choreographer f39294c;
    @C12579k

    /* renamed from: d */
    public final Handler f39295d;
    @C12579k

    /* renamed from: e */
    public final Object f39296e;
    @C12579k

    /* renamed from: f */
    public final C10944i<Runnable> f39297f;
    @C12579k

    /* renamed from: g */
    public List<Choreographer.FrameCallback> f39298g;
    @C12579k

    /* renamed from: v */
    public List<Choreographer.FrameCallback> f39299v;

    /* renamed from: w */
    public boolean f39300w;

    /* renamed from: x */
    public boolean f39301x;
    @C12579k

    /* renamed from: y */
    public final C15795c f39302y;
    @C12579k

    /* renamed from: z */
    public final C8686v0 f39303z;

    @C11363r0({"SMAP\nAndroidUiDispatcher.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidUiDispatcher.android.kt\nandroidx/compose/ui/platform/AndroidUiDispatcher$Companion$currentThread$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,191:1\n1#2:192\n*E\n"})
    /* renamed from: androidx.compose.ui.platform.AndroidUiDispatcher$a */
    public static final class C15793a extends ThreadLocal<CoroutineContext> {
        @C12579k
        /* renamed from: a */
        public CoroutineContext initialValue() {
            Choreographer instance = Choreographer.getInstance();
            Intrinsics.checkNotNullExpressionValue(instance, "getInstance()");
            Looper myLooper = Looper.myLooper();
            if (myLooper != null) {
                Handler a = C17800k.m81188a(myLooper);
                Intrinsics.checkNotNullExpressionValue(a, "createAsync(\n           …d\")\n                    )");
                AndroidUiDispatcher androidUiDispatcher = new AndroidUiDispatcher(instance, a, (DefaultConstructorMarker) null);
                return androidUiDispatcher.mo7443Q(androidUiDispatcher.mo45488C0());
            }
            throw new IllegalStateException("no Looper on this thread".toString());
        }
    }

    /* renamed from: androidx.compose.ui.platform.AndroidUiDispatcher$b */
    public static final class C15794b {
        public /* synthetic */ C15794b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @C12579k
        /* renamed from: a */
        public final CoroutineContext mo45496a() {
            if (C15853b0.m71259b()) {
                return mo45497b();
            }
            CoroutineContext coroutineContext = (CoroutineContext) AndroidUiDispatcher.f39290E0.get();
            if (coroutineContext != null) {
                return coroutineContext;
            }
            throw new IllegalStateException("no AndroidUiDispatcher for this thread".toString());
        }

        @C12579k
        /* renamed from: b */
        public final CoroutineContext mo45497b() {
            return (CoroutineContext) AndroidUiDispatcher.f39293Z.getValue();
        }

        public C15794b() {
        }
    }

    @C11363r0({"SMAP\nAndroidUiDispatcher.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidUiDispatcher.android.kt\nandroidx/compose/ui/platform/AndroidUiDispatcher$dispatchCallback$1\n+ 2 JvmActuals.jvm.kt\nandroidx/compose/ui/platform/JvmActuals_jvmKt\n*L\n1#1,191:1\n34#2:192\n*S KotlinDebug\n*F\n+ 1 AndroidUiDispatcher.android.kt\nandroidx/compose/ui/platform/AndroidUiDispatcher$dispatchCallback$1\n*L\n58#1:192\n*E\n"})
    /* renamed from: androidx.compose.ui.platform.AndroidUiDispatcher$c */
    public static final class C15795c implements Choreographer.FrameCallback, Runnable {

        /* renamed from: a */
        public final /* synthetic */ AndroidUiDispatcher f39304a;

        public C15795c(AndroidUiDispatcher androidUiDispatcher) {
            this.f39304a = androidUiDispatcher;
        }

        public void doFrame(long j) {
            this.f39304a.f39295d.removeCallbacks(this);
            this.f39304a.mo45491F0();
            this.f39304a.mo45490E0(j);
        }

        public void run() {
            this.f39304a.mo45491F0();
            Object c0 = this.f39304a.f39296e;
            AndroidUiDispatcher androidUiDispatcher = this.f39304a;
            synchronized (c0) {
                if (androidUiDispatcher.f39298g.isEmpty()) {
                    androidUiDispatcher.mo45487A0().removeFrameCallback(this);
                    androidUiDispatcher.f39301x = false;
                }
                C11079d2 d2Var = C11079d2.f28267a;
            }
        }
    }

    public /* synthetic */ AndroidUiDispatcher(Choreographer choreographer, Handler handler, DefaultConstructorMarker defaultConstructorMarker) {
        this(choreographer, handler);
    }

    @C12579k
    /* renamed from: A0 */
    public final Choreographer mo45487A0() {
        return this.f39294c;
    }

    @C12579k
    /* renamed from: C0 */
    public final C8686v0 mo45488C0() {
        return this.f39303z;
    }

    /* renamed from: D0 */
    public final Runnable mo45489D0() {
        Runnable p0;
        synchronized (this.f39296e) {
            p0 = this.f39297f.mo22307p0();
        }
        return p0;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0015, code lost:
        r0 = r2.size();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0019, code lost:
        if (r1 >= r0) goto L_0x0027;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x001b, code lost:
        r2.get(r1).doFrame(r5);
        r1 = r1 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0027, code lost:
        r2.clear();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x002a, code lost:
        return;
     */
    /* renamed from: E0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo45490E0(long r5) {
        /*
            r4 = this;
            java.lang.Object r0 = r4.f39296e
            monitor-enter(r0)
            boolean r1 = r4.f39301x     // Catch:{ all -> 0x002b }
            if (r1 != 0) goto L_0x0009
            monitor-exit(r0)
            return
        L_0x0009:
            r1 = 0
            r4.f39301x = r1     // Catch:{ all -> 0x002b }
            java.util.List<android.view.Choreographer$FrameCallback> r2 = r4.f39298g     // Catch:{ all -> 0x002b }
            java.util.List<android.view.Choreographer$FrameCallback> r3 = r4.f39299v     // Catch:{ all -> 0x002b }
            r4.f39298g = r3     // Catch:{ all -> 0x002b }
            r4.f39299v = r2     // Catch:{ all -> 0x002b }
            monitor-exit(r0)
            int r0 = r2.size()
        L_0x0019:
            if (r1 >= r0) goto L_0x0027
            java.lang.Object r3 = r2.get(r1)
            android.view.Choreographer$FrameCallback r3 = (android.view.Choreographer.FrameCallback) r3
            r3.doFrame(r5)
            int r1 = r1 + 1
            goto L_0x0019
        L_0x0027:
            r2.clear()
            return
        L_0x002b:
            r5 = move-exception
            monitor-exit(r0)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.p004ui.platform.AndroidUiDispatcher.mo45490E0(long):void");
    }

    /* renamed from: F0 */
    public final void mo45491F0() {
        boolean z;
        do {
            Runnable D0 = mo45489D0();
            while (D0 != null) {
                D0.run();
                D0 = mo45489D0();
            }
            synchronized (this.f39296e) {
                if (this.f39297f.isEmpty()) {
                    z = false;
                    this.f39300w = false;
                } else {
                    z = true;
                }
            }
        } while (z);
    }

    /* renamed from: H0 */
    public final void mo45492H0(@C12579k Choreographer.FrameCallback frameCallback) {
        Intrinsics.checkNotNullParameter(frameCallback, C10108c.f27778C);
        synchronized (this.f39296e) {
            this.f39298g.add(frameCallback);
            if (!this.f39301x) {
                this.f39301x = true;
                this.f39294c.postFrameCallback(this.f39302y);
            }
            C11079d2 d2Var = C11079d2.f28267a;
        }
    }

    /* renamed from: K0 */
    public final void mo45493K0(@C12579k Choreographer.FrameCallback frameCallback) {
        Intrinsics.checkNotNullParameter(frameCallback, C10108c.f27778C);
        synchronized (this.f39296e) {
            this.f39298g.remove(frameCallback);
        }
    }

    /* renamed from: O */
    public void mo23563O(@C12579k CoroutineContext coroutineContext, @C12579k Runnable runnable) {
        Intrinsics.checkNotNullParameter(coroutineContext, C9175a.f24932Y);
        Intrinsics.checkNotNullParameter(runnable, C28534f.f69159i0);
        synchronized (this.f39296e) {
            this.f39297f.mo22308q(runnable);
            if (!this.f39300w) {
                this.f39300w = true;
                this.f39295d.post(this.f39302y);
                if (!this.f39301x) {
                    this.f39301x = true;
                    this.f39294c.postFrameCallback(this.f39302y);
                }
            }
            C11079d2 d2Var = C11079d2.f28267a;
        }
    }

    public AndroidUiDispatcher(Choreographer choreographer, Handler handler) {
        this.f39294c = choreographer;
        this.f39295d = handler;
        this.f39296e = new Object();
        this.f39297f = new C10944i<>();
        this.f39298g = new ArrayList();
        this.f39299v = new ArrayList();
        this.f39302y = new C15795c(this);
        this.f39303z = new AndroidUiFrameClock(choreographer);
    }
}
