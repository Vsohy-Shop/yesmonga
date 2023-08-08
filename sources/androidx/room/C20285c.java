package androidx.room;

import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import androidx.annotation.C0323b0;
import androidx.annotation.C0344h1;
import androidx.sqlite.p031db.C20466f;
import androidx.sqlite.p031db.C20481g;
import com.carrefour.fid.android.shared.constant.C28534f;
import java.io.IOException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

/* renamed from: androidx.room.c */
public final class C20285c {
    @C12579k

    /* renamed from: m */
    public static final C20286a f52345m = new C20286a((DefaultConstructorMarker) null);
    @C12579k

    /* renamed from: n */
    public static final String f52346n = "https://issuetracker.google.com/issues/new?component=413107&template=1096568";

    /* renamed from: a */
    public C20481g f52347a;
    @C12579k

    /* renamed from: b */
    public final Handler f52348b = new Handler(Looper.getMainLooper());
    @C12580l

    /* renamed from: c */
    public Runnable f52349c;
    @C12579k

    /* renamed from: d */
    public final Object f52350d = new Object();

    /* renamed from: e */
    public long f52351e;
    @C12579k

    /* renamed from: f */
    public final Executor f52352f;
    @C0323b0("lock")

    /* renamed from: g */
    public int f52353g;
    @C0323b0("lock")

    /* renamed from: h */
    public long f52354h;
    @C12580l
    @C0323b0("lock")

    /* renamed from: i */
    public C20466f f52355i;

    /* renamed from: j */
    public boolean f52356j;
    @C12579k

    /* renamed from: k */
    public final Runnable f52357k;
    @C12579k

    /* renamed from: l */
    public final Runnable f52358l;

    /* renamed from: androidx.room.c$a */
    public static final class C20286a {
        public /* synthetic */ C20286a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public C20286a() {
        }
    }

    public C20285c(long j, @C12579k TimeUnit timeUnit, @C12579k Executor executor) {
        Intrinsics.checkNotNullParameter(timeUnit, "autoCloseTimeUnit");
        Intrinsics.checkNotNullParameter(executor, "autoCloseExecutor");
        this.f52351e = timeUnit.toMillis(j);
        this.f52352f = executor;
        this.f52354h = SystemClock.uptimeMillis();
        this.f52357k = new C20276a(this);
        this.f52358l = new C20281b(this);
    }

    /* renamed from: c */
    public static final void m94872c(C20285c cVar) {
        C11079d2 d2Var;
        Intrinsics.checkNotNullParameter(cVar, "this$0");
        synchronized (cVar.f52350d) {
            if (SystemClock.uptimeMillis() - cVar.f52354h >= cVar.f52351e) {
                if (cVar.f52353g == 0) {
                    Runnable runnable = cVar.f52349c;
                    if (runnable != null) {
                        runnable.run();
                        d2Var = C11079d2.f28267a;
                    } else {
                        d2Var = null;
                    }
                    if (d2Var != null) {
                        C20466f fVar = cVar.f52355i;
                        if (fVar != null && fVar.isOpen()) {
                            fVar.close();
                        }
                        cVar.f52355i = null;
                        C11079d2 d2Var2 = C11079d2.f28267a;
                        return;
                    }
                    throw new IllegalStateException("onAutoCloseCallback is null but it should have been set before use. Please file a bug against Room at: https://issuetracker.google.com/issues/new?component=413107&template=1096568".toString());
                }
            }
        }
    }

    /* renamed from: f */
    public static final void m94873f(C20285c cVar) {
        Intrinsics.checkNotNullParameter(cVar, "this$0");
        cVar.f52352f.execute(cVar.f52358l);
    }

    /* renamed from: d */
    public final void mo60979d() throws IOException {
        synchronized (this.f52350d) {
            this.f52356j = true;
            C20466f fVar = this.f52355i;
            if (fVar != null) {
                fVar.close();
            }
            this.f52355i = null;
            C11079d2 d2Var = C11079d2.f28267a;
        }
    }

    /* renamed from: e */
    public final void mo60980e() {
        boolean z;
        synchronized (this.f52350d) {
            int i = this.f52353g;
            if (i > 0) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                int i2 = i - 1;
                this.f52353g = i2;
                if (i2 == 0) {
                    if (this.f52355i != null) {
                        this.f52348b.postDelayed(this.f52357k, this.f52351e);
                    } else {
                        return;
                    }
                }
                C11079d2 d2Var = C11079d2.f28267a;
                return;
            }
            throw new IllegalStateException("ref count is 0 or lower but we're supposed to decrement".toString());
        }
    }

    /* renamed from: g */
    public final <V> V mo60981g(@C12579k C11300l<? super C20466f, ? extends V> lVar) {
        Intrinsics.checkNotNullParameter(lVar, C28534f.f69159i0);
        try {
            return lVar.invoke(mo60988n());
        } finally {
            mo60980e();
        }
    }

    @C12580l
    /* renamed from: h */
    public final C20466f mo60982h() {
        return this.f52355i;
    }

    @C12579k
    /* renamed from: i */
    public final C20481g mo60983i() {
        C20481g gVar = this.f52347a;
        if (gVar != null) {
            return gVar;
        }
        Intrinsics.throwUninitializedPropertyAccessException("delegateOpenHelper");
        return null;
    }

    /* renamed from: j */
    public final long mo60984j() {
        return this.f52354h;
    }

    @C12580l
    /* renamed from: k */
    public final Runnable mo60985k() {
        return this.f52349c;
    }

    /* renamed from: l */
    public final int mo60986l() {
        return this.f52353g;
    }

    @C0344h1
    /* renamed from: m */
    public final int mo60987m() {
        int i;
        synchronized (this.f52350d) {
            i = this.f52353g;
        }
        return i;
    }

    @C12579k
    /* renamed from: n */
    public final C20466f mo60988n() {
        synchronized (this.f52350d) {
            this.f52348b.removeCallbacks(this.f52357k);
            this.f52353g++;
            if (!this.f52356j) {
                C20466f fVar = this.f52355i;
                if (fVar != null && fVar.isOpen()) {
                    return fVar;
                }
                C20466f d3 = mo60983i().mo18117d3();
                this.f52355i = d3;
                return d3;
            }
            throw new IllegalStateException("Attempting to open already closed database.".toString());
        }
    }

    /* renamed from: o */
    public final void mo60989o(@C12579k C20481g gVar) {
        Intrinsics.checkNotNullParameter(gVar, "delegateOpenHelper");
        mo60993s(gVar);
    }

    /* renamed from: p */
    public final boolean mo60990p() {
        return !this.f52356j;
    }

    /* renamed from: q */
    public final void mo60991q(@C12579k Runnable runnable) {
        Intrinsics.checkNotNullParameter(runnable, "onAutoClose");
        this.f52349c = runnable;
    }

    /* renamed from: r */
    public final void mo60992r(@C12580l C20466f fVar) {
        this.f52355i = fVar;
    }

    /* renamed from: s */
    public final void mo60993s(@C12579k C20481g gVar) {
        Intrinsics.checkNotNullParameter(gVar, "<set-?>");
        this.f52347a = gVar;
    }

    /* renamed from: t */
    public final void mo60994t(long j) {
        this.f52354h = j;
    }

    /* renamed from: u */
    public final void mo60995u(@C12580l Runnable runnable) {
        this.f52349c = runnable;
    }

    /* renamed from: v */
    public final void mo60996v(int i) {
        this.f52353g = i;
    }
}
