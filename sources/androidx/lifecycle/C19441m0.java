package androidx.lifecycle;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import androidx.annotation.C0344h1;
import androidx.annotation.C0373u;
import androidx.annotation.C0376v0;
import androidx.appcompat.widget.C0696c;
import androidx.lifecycle.C19448n0;
import androidx.lifecycle.Lifecycle;
import com.urbanairship.iam.events.C9175a;
import com.usabilla.sdk.ubform.telemetry.C10108c;
import kotlin.jvm.C11384m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

/* renamed from: androidx.lifecycle.m0 */
public final class C19441m0 implements C19499w {
    @C12579k

    /* renamed from: w */
    public static final C19443b f49815w = new C19443b((DefaultConstructorMarker) null);

    /* renamed from: x */
    public static final long f49816x = 700;
    @C12579k

    /* renamed from: y */
    public static final C19441m0 f49817y = new C19441m0();

    /* renamed from: a */
    public int f49818a;

    /* renamed from: b */
    public int f49819b;

    /* renamed from: c */
    public boolean f49820c = true;

    /* renamed from: d */
    public boolean f49821d = true;
    @C12580l

    /* renamed from: e */
    public Handler f49822e;
    @C12579k

    /* renamed from: f */
    public final C19512y f49823f = new C19512y(this);
    @C12579k

    /* renamed from: g */
    public final Runnable f49824g = new C19432k0(this);
    @C12579k

    /* renamed from: v */
    public final C19448n0.C19449a f49825v = new C19446d(this);

    @C0376v0(29)
    /* renamed from: androidx.lifecycle.m0$a */
    public static final class C19442a {
        @C12579k

        /* renamed from: a */
        public static final C19442a f49826a = new C19442a();

        @C0373u
        @C11384m
        /* renamed from: a */
        public static final void m90734a(@C12579k Activity activity, @C12579k Application.ActivityLifecycleCallbacks activityLifecycleCallbacks) {
            Intrinsics.checkNotNullParameter(activity, C0696c.f2306r);
            Intrinsics.checkNotNullParameter(activityLifecycleCallbacks, C10108c.f27778C);
            activity.registerActivityLifecycleCallbacks(activityLifecycleCallbacks);
        }
    }

    /* renamed from: androidx.lifecycle.m0$b */
    public static final class C19443b {
        public /* synthetic */ C19443b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @C0344h1
        /* renamed from: b */
        public static /* synthetic */ void m90735b() {
        }

        @C12579k
        @C11384m
        /* renamed from: a */
        public final C19499w mo57609a() {
            return C19441m0.f49817y;
        }

        @C11384m
        /* renamed from: c */
        public final void mo57610c(@C12579k Context context) {
            Intrinsics.checkNotNullParameter(context, C9175a.f24932Y);
            C19441m0.f49817y.mo57606h(context);
        }

        public C19443b() {
        }
    }

    /* renamed from: androidx.lifecycle.m0$c */
    public static final class C19444c extends C19434l {
        final /* synthetic */ C19441m0 this$0;

        /* renamed from: androidx.lifecycle.m0$c$a */
        public static final class C19445a extends C19434l {
            final /* synthetic */ C19441m0 this$0;

            public C19445a(C19441m0 m0Var) {
                this.this$0 = m0Var;
            }

            public void onActivityPostResumed(@C12579k Activity activity) {
                Intrinsics.checkNotNullParameter(activity, C0696c.f2306r);
                this.this$0.mo57603e();
            }

            public void onActivityPostStarted(@C12579k Activity activity) {
                Intrinsics.checkNotNullParameter(activity, C0696c.f2306r);
                this.this$0.mo57604f();
            }
        }

        public C19444c(C19441m0 m0Var) {
            this.this$0 = m0Var;
        }

        public void onActivityCreated(@C12579k Activity activity, @C12580l Bundle bundle) {
            Intrinsics.checkNotNullParameter(activity, C0696c.f2306r);
            if (Build.VERSION.SDK_INT < 29) {
                C19448n0.f49828b.mo57630b(activity).mo57622h(this.this$0.f49825v);
            }
        }

        public void onActivityPaused(@C12579k Activity activity) {
            Intrinsics.checkNotNullParameter(activity, C0696c.f2306r);
            this.this$0.mo57602d();
        }

        @C0376v0(29)
        public void onActivityPreCreated(@C12579k Activity activity, @C12580l Bundle bundle) {
            Intrinsics.checkNotNullParameter(activity, C0696c.f2306r);
            C19442a.m90734a(activity, new C19445a(this.this$0));
        }

        public void onActivityStopped(@C12579k Activity activity) {
            Intrinsics.checkNotNullParameter(activity, C0696c.f2306r);
            this.this$0.mo57605g();
        }
    }

    /* renamed from: androidx.lifecycle.m0$d */
    public static final class C19446d implements C19448n0.C19449a {

        /* renamed from: a */
        public final /* synthetic */ C19441m0 f49827a;

        public C19446d(C19441m0 m0Var) {
            this.f49827a = m0Var;
        }

        /* renamed from: b */
        public void mo57614b() {
            this.f49827a.mo57604f();
        }

        /* renamed from: g */
        public void mo57615g() {
            this.f49827a.mo57603e();
        }

        public void onCreate() {
        }
    }

    /* renamed from: i */
    public static final void m90724i(C19441m0 m0Var) {
        Intrinsics.checkNotNullParameter(m0Var, "this$0");
        m0Var.mo57607j();
        m0Var.mo57608k();
    }

    @C12579k
    @C11384m
    /* renamed from: l */
    public static final C19499w m90725l() {
        return f49815w.mo57609a();
    }

    @C11384m
    /* renamed from: m */
    public static final void m90726m(@C12579k Context context) {
        f49815w.mo57610c(context);
    }

    /* renamed from: d */
    public final void mo57602d() {
        int i = this.f49819b - 1;
        this.f49819b = i;
        if (i == 0) {
            Handler handler = this.f49822e;
            Intrinsics.checkNotNull(handler);
            handler.postDelayed(this.f49824g, 700);
        }
    }

    /* renamed from: e */
    public final void mo57603e() {
        int i = this.f49819b + 1;
        this.f49819b = i;
        if (i != 1) {
            return;
        }
        if (this.f49820c) {
            this.f49823f.mo57705l(Lifecycle.C19372Event.ON_RESUME);
            this.f49820c = false;
            return;
        }
        Handler handler = this.f49822e;
        Intrinsics.checkNotNull(handler);
        handler.removeCallbacks(this.f49824g);
    }

    /* renamed from: f */
    public final void mo57604f() {
        int i = this.f49818a + 1;
        this.f49818a = i;
        if (i == 1 && this.f49821d) {
            this.f49823f.mo57705l(Lifecycle.C19372Event.ON_START);
            this.f49821d = false;
        }
    }

    /* renamed from: g */
    public final void mo57605g() {
        this.f49818a--;
        mo57608k();
    }

    @C12579k
    public Lifecycle getLifecycle() {
        return this.f49823f;
    }

    /* renamed from: h */
    public final void mo57606h(@C12579k Context context) {
        Intrinsics.checkNotNullParameter(context, C9175a.f24932Y);
        this.f49822e = new Handler();
        this.f49823f.mo57705l(Lifecycle.C19372Event.ON_CREATE);
        Context applicationContext = context.getApplicationContext();
        Intrinsics.checkNotNull(applicationContext, "null cannot be cast to non-null type android.app.Application");
        ((Application) applicationContext).registerActivityLifecycleCallbacks(new C19444c(this));
    }

    /* renamed from: j */
    public final void mo57607j() {
        if (this.f49819b == 0) {
            this.f49820c = true;
            this.f49823f.mo57705l(Lifecycle.C19372Event.ON_PAUSE);
        }
    }

    /* renamed from: k */
    public final void mo57608k() {
        if (this.f49818a == 0 && this.f49820c) {
            this.f49823f.mo57705l(Lifecycle.C19372Event.ON_STOP);
            this.f49821d = true;
        }
    }
}
