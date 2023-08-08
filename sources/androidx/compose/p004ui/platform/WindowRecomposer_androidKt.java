package androidx.compose.p004ui.platform;

import android.content.ContentResolver;
import android.content.Context;
import android.database.ContentObserver;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.provider.Settings;
import android.view.View;
import android.view.ViewParent;
import androidx.compose.p004ui.C8761g;
import androidx.compose.p004ui.C8773n;
import androidx.compose.p004ui.C8776o;
import androidx.compose.runtime.C8602q;
import androidx.compose.runtime.C8686v0;
import androidx.compose.runtime.PausableMonotonicFrameClock;
import androidx.compose.runtime.Recomposer;
import androidx.core.p027os.C17800k;
import androidx.lifecycle.C19499w;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import com.usabilla.sdk.ubform.net.C9851c;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.C11079d2;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.C11047d;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.C12074o0;
import kotlinx.coroutines.C12079p0;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.channels.C11744g;
import kotlinx.coroutines.channels.C11748i;
import kotlinx.coroutines.flow.C11909g;
import kotlinx.coroutines.flow.C11948r;
import kotlinx.coroutines.flow.C11952u;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11363r0({"SMAP\nWindowRecomposer.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WindowRecomposer.android.kt\nandroidx/compose/ui/platform/WindowRecomposer_androidKt\n+ 2 JvmActuals.jvm.kt\nandroidx/compose/ui/platform/JvmActuals_jvmKt\n+ 3 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,426:1\n34#2:427\n361#3,7:428\n1#4:435\n*S KotlinDebug\n*F\n+ 1 WindowRecomposer.android.kt\nandroidx/compose/ui/platform/WindowRecomposer_androidKt\n*L\n98#1:427\n99#1:428,7\n*E\n"})
/* renamed from: androidx.compose.ui.platform.WindowRecomposer_androidKt */
public final class WindowRecomposer_androidKt {
    @C12579k

    /* renamed from: a */
    public static final Map<Context, C11952u<Float>> f39433a = new LinkedHashMap();

    /* renamed from: androidx.compose.ui.platform.WindowRecomposer_androidKt$a */
    public static final class C15819a implements View.OnAttachStateChangeListener {

        /* renamed from: a */
        public final /* synthetic */ View f39434a;

        /* renamed from: b */
        public final /* synthetic */ Recomposer f39435b;

        public C15819a(View view, Recomposer recomposer) {
            this.f39434a = view;
            this.f39435b = recomposer;
        }

        public void onViewAttachedToWindow(@C12579k View view) {
            Intrinsics.checkNotNullParameter(view, C9851c.f26937h);
        }

        public void onViewDetachedFromWindow(@C12579k View view) {
            Intrinsics.checkNotNullParameter(view, C9851c.f26937h);
            this.f39434a.removeOnAttachStateChangeListener(this);
            this.f39435b.mo15243j0();
        }
    }

    /* renamed from: androidx.compose.ui.platform.WindowRecomposer_androidKt$b */
    public static final class C15820b extends ContentObserver {

        /* renamed from: a */
        public final /* synthetic */ C11744g<C11079d2> f39436a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C15820b(C11744g<C11079d2> gVar, Handler handler) {
            super(handler);
            this.f39436a = gVar;
        }

        public void onChange(boolean z, @C12580l Uri uri) {
            this.f39436a.mo23751L(C11079d2.f28267a);
        }
    }

    @C8761g
    @C12579k
    /* renamed from: b */
    public static final Recomposer m71143b(@C12579k View view, @C12579k CoroutineContext coroutineContext, @C12580l Lifecycle lifecycle) {
        PausableMonotonicFrameClock pausableMonotonicFrameClock;
        CoroutineContext coroutineContext2;
        Intrinsics.checkNotNullParameter(view, "<this>");
        Intrinsics.checkNotNullParameter(coroutineContext, "coroutineContext");
        if (coroutineContext.mo7444b(C11047d.f28247u0) == null || coroutineContext.mo7444b(C8686v0.f23251h) == null) {
            coroutineContext = AndroidUiDispatcher.f39291X.mo45496a().mo7443Q(coroutineContext);
        }
        C8686v0 v0Var = (C8686v0) coroutineContext.mo7444b(C8686v0.f23251h);
        if (v0Var != null) {
            PausableMonotonicFrameClock pausableMonotonicFrameClock2 = new PausableMonotonicFrameClock(v0Var);
            pausableMonotonicFrameClock2.mo15171g();
            pausableMonotonicFrameClock = pausableMonotonicFrameClock2;
        } else {
            pausableMonotonicFrameClock = null;
        }
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        T t = (C8773n) coroutineContext.mo7444b(C8773n.f23491k);
        if (t == null) {
            t = new C15843a1();
            objectRef.element = t;
        }
        if (pausableMonotonicFrameClock != null) {
            coroutineContext2 = pausableMonotonicFrameClock;
        } else {
            coroutineContext2 = EmptyCoroutineContext.f28243a;
        }
        CoroutineContext Q = coroutineContext.mo7443Q(coroutineContext2).mo7443Q(t);
        Recomposer recomposer = new Recomposer(Q);
        C12074o0 a = C12079p0.m48260a(Q);
        if (lifecycle == null) {
            C19499w a2 = ViewTreeLifecycleOwner.m90620a(view);
            if (a2 != null) {
                lifecycle = a2.getLifecycle();
            } else {
                lifecycle = null;
            }
        }
        if (lifecycle != null) {
            view.addOnAttachStateChangeListener(new C15819a(view, recomposer));
            lifecycle.mo57464a(new C15821xff837ba9(a, pausableMonotonicFrameClock, recomposer, objectRef, view));
            return recomposer;
        }
        throw new IllegalStateException(("ViewTreeLifecycleOwner not found from " + view).toString());
    }

    /* renamed from: c */
    public static /* synthetic */ Recomposer m71144c(View view, CoroutineContext coroutineContext, Lifecycle lifecycle, int i, Object obj) {
        if ((i & 1) != 0) {
            coroutineContext = EmptyCoroutineContext.f28243a;
        }
        if ((i & 2) != 0) {
            lifecycle = null;
        }
        return m71143b(view, coroutineContext, lifecycle);
    }

    @C12580l
    /* renamed from: d */
    public static final C8602q m71145d(@C12579k View view) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        C8602q f = m71147f(view);
        if (f != null) {
            return f;
        }
        ViewParent parent = view.getParent();
        while (f == null && (parent instanceof View)) {
            f = m71147f((View) parent);
            parent = parent.getParent();
        }
        return f;
    }

    /* renamed from: e */
    public static final C11952u<Float> m71146e(Context context) {
        C11952u<Float> uVar;
        Map<Context, C11952u<Float>> map = f39433a;
        synchronized (map) {
            C11952u<Float> uVar2 = map.get(context);
            if (uVar2 == null) {
                ContentResolver contentResolver = context.getContentResolver();
                Uri uriFor = Settings.Global.getUriFor("animator_duration_scale");
                C11744g d = C11748i.m46625d(-1, (BufferOverflow) null, (C11300l) null, 6, (Object) null);
                uVar2 = C11909g.m47392O1(C11909g.m47376J0(new WindowRecomposer_androidKt$getAnimationScaleFlowFor$1$1$1(contentResolver, uriFor, new C15820b(d, C17800k.m81188a(Looper.getMainLooper())), d, context, (C11045c<? super WindowRecomposer_androidKt$getAnimationScaleFlowFor$1$1$1>) null)), C12079p0.m48261b(), C11948r.C11949a.m47621b(C11948r.f29534a, 0, 0, 3, (Object) null), Float.valueOf(Settings.Global.getFloat(context.getContentResolver(), "animator_duration_scale", 1.0f)));
                map.put(context, uVar2);
            }
            uVar = uVar2;
        }
        return uVar;
    }

    @C12580l
    /* renamed from: f */
    public static final C8602q m71147f(@C12579k View view) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        Object tag = view.getTag(C8776o.C8778b.androidx_compose_ui_view_composition_context);
        if (tag instanceof C8602q) {
            return (C8602q) tag;
        }
        return null;
    }

    /* renamed from: g */
    public static final View m71148g(View view) {
        ViewParent parent = view.getParent();
        while (parent instanceof View) {
            View view2 = (View) parent;
            if (view2.getId() == 16908290) {
                return view;
            }
            View view3 = view2;
            parent = view2.getParent();
            view = view3;
        }
        return view;
    }

    @C12579k
    /* renamed from: h */
    public static final Recomposer m71149h(@C12579k View view) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        if (view.isAttachedToWindow()) {
            View g = m71148g(view);
            C8602q f = m71147f(g);
            if (f == null) {
                return WindowRecomposerPolicy.f39429a.mo45595b(g);
            }
            if (f instanceof Recomposer) {
                return (Recomposer) f;
            }
            throw new IllegalStateException("root viewTreeParentCompositionContext is not a Recomposer".toString());
        }
        throw new IllegalStateException(("Cannot locate windowRecomposer; View " + view + " is not attached to a window").toString());
    }

    /* renamed from: i */
    public static /* synthetic */ void m71150i(View view) {
    }

    /* renamed from: j */
    public static final void m71151j(@C12579k View view, @C12580l C8602q qVar) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        view.setTag(C8776o.C8778b.androidx_compose_ui_view_composition_context, qVar);
    }
}
