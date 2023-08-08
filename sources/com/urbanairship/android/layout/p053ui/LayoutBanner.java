package com.urbanairship.android.layout.p053ui;

import android.app.Activity;
import android.content.Context;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.C0353k0;
import androidx.appcompat.widget.C0696c;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.view.C18026a4;
import androidx.core.view.C18196h2;
import androidx.lifecycle.C19502x0;
import com.urbanairship.C36059m;
import com.urbanairship.C36064q;
import com.urbanairship.android.layout.C35572a;
import com.urbanairship.android.layout.C35573b;
import com.urbanairship.android.layout.C35581e;
import com.urbanairship.android.layout.C35625g;
import com.urbanairship.android.layout.C35700k;
import com.urbanairship.android.layout.ModelFactoryException;
import com.urbanairship.android.layout.display.C35578a;
import com.urbanairship.android.layout.environment.C35596f;
import com.urbanairship.android.layout.environment.C35598h;
import com.urbanairship.android.layout.environment.C35603k;
import com.urbanairship.android.layout.environment.C35606m;
import com.urbanairship.android.layout.environment.LayoutEvent;
import com.urbanairship.android.layout.environment.ModelEnvironment;
import com.urbanairship.android.layout.event.ReportingEvent;
import com.urbanairship.android.layout.info.C35696x;
import com.urbanairship.android.layout.p053ui.ThomasBannerView;
import com.urbanairship.android.layout.property.C35828a;
import com.urbanairship.android.layout.property.C35843n;
import com.urbanairship.android.layout.property.VerticalPosition;
import com.urbanairship.android.layout.reporting.C35868d;
import com.urbanairship.android.layout.reporting.DisplayTimer;
import com.urbanairship.android.layout.util.C35910d;
import com.urbanairship.android.layout.util.C35911e;
import com.urbanairship.app.C36029a;
import com.urbanairship.app.C36030b;
import com.urbanairship.app.C36038h;
import com.urbanairship.iam.events.C9175a;
import com.urbanairship.util.C9640b0;
import com.urbanairship.webkit.C9711g;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CancellationException;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.C11702a0;
import kotlinx.coroutines.C11719b3;
import kotlinx.coroutines.C11723c2;
import kotlinx.coroutines.C11768d1;
import kotlinx.coroutines.C11968h2;
import kotlinx.coroutines.C12038j;
import kotlinx.coroutines.C12074o0;
import kotlinx.coroutines.C12079p0;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.flow.C11907e;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

/* renamed from: com.urbanairship.android.layout.ui.LayoutBanner */
public final class LayoutBanner {
    @C12579k

    /* renamed from: p */
    public static final C35871a f88714p = new C35871a((DefaultConstructorMarker) null);
    @C12579k

    /* renamed from: q */
    public static final String f88715q = "com.urbanairship.iam.banner.BANNER_CONTAINER_ID";
    @C12579k

    /* renamed from: r */
    public static final Map<Class<?>, Integer> f88716r = new HashMap();
    @C12579k

    /* renamed from: a */
    public final Context f88717a;
    @C12579k

    /* renamed from: b */
    public final C11702a0 f88718b;
    @C12579k

    /* renamed from: c */
    public final C12074o0 f88719c;
    @C12579k

    /* renamed from: d */
    public final C36030b f88720d;
    @C12580l

    /* renamed from: e */
    public final C35910d<C9711g> f88721e;
    @C12580l

    /* renamed from: f */
    public final C35911e f88722f;
    @C12579k

    /* renamed from: g */
    public final C35696x f88723g;
    @C12579k

    /* renamed from: h */
    public final C35700k f88724h;
    @C12579k

    /* renamed from: i */
    public final String f88725i;
    @C12579k

    /* renamed from: j */
    public final C35606m f88726j;
    @C12579k

    /* renamed from: k */
    public final C36064q<Activity> f88727k;
    @C12579k

    /* renamed from: l */
    public final DisplayTimer f88728l;
    @C12579k

    /* renamed from: m */
    public final C36029a f88729m;
    @C12580l

    /* renamed from: n */
    public WeakReference<Activity> f88730n;
    @C12580l

    /* renamed from: o */
    public WeakReference<ThomasBannerView> f88731o;

    /* renamed from: com.urbanairship.android.layout.ui.LayoutBanner$a */
    public static final class C35871a {
        public /* synthetic */ C35871a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public C35871a() {
        }
    }

    /* renamed from: com.urbanairship.android.layout.ui.LayoutBanner$b */
    public static final class C35872b extends C36038h {

        /* renamed from: a */
        public final /* synthetic */ LayoutBanner f88732a;

        public C35872b(LayoutBanner layoutBanner) {
            this.f88732a = layoutBanner;
        }

        public void onActivityPaused(@C12579k Activity activity) {
            Intrinsics.checkNotNullParameter(activity, C0696c.f2306r);
            if (this.f88732a.f88727k.apply(activity)) {
                this.f88732a.mo107488n(activity);
            }
        }

        public void onActivityResumed(@C12579k Activity activity) {
            Intrinsics.checkNotNullParameter(activity, C0696c.f2306r);
            if (this.f88732a.f88727k.apply(activity)) {
                this.f88732a.mo107489o(activity);
            }
        }

        public void onActivityStopped(@C12579k Activity activity) {
            Intrinsics.checkNotNullParameter(activity, C0696c.f2306r);
            if (this.f88732a.f88727k.apply(activity)) {
                this.f88732a.mo107490p(activity);
            }
        }
    }

    /* renamed from: com.urbanairship.android.layout.ui.LayoutBanner$c */
    public static final class C35873c implements ThomasBannerView.C35886c {

        /* renamed from: a */
        public final /* synthetic */ LayoutBanner f88733a;

        /* renamed from: b */
        public final /* synthetic */ ThomasBannerView f88734b;

        public C35873c(LayoutBanner layoutBanner, ThomasBannerView thomasBannerView) {
            this.f88733a = layoutBanner;
            this.f88734b = thomasBannerView;
        }

        /* renamed from: a */
        public void mo107493a(int i) {
            if (i != 0) {
                if (i == 1) {
                    this.f88734b.getDisplayTimer().mo107584e();
                }
            } else if (this.f88734b.mo107508D()) {
                this.f88734b.getDisplayTimer().mo107583d();
            }
        }

        /* renamed from: b */
        public void mo107494b() {
            this.f88733a.mo107491q();
        }

        /* renamed from: c */
        public void mo107495c() {
            LayoutBanner.m147965s(this.f88733a, (C35868d) null, 1, (Object) null);
            this.f88733a.mo107491q();
        }
    }

    public LayoutBanner(@C12579k Context context, @C12579k C35578a aVar) {
        Intrinsics.checkNotNullParameter(context, C9175a.f24932Y);
        Intrinsics.checkNotNullParameter(aVar, "args");
        this.f88717a = context;
        C11702a0 c = C11719b3.m46155c((C11723c2) null, 1, (Object) null);
        this.f88718b = c;
        this.f88719c = C12079p0.m48260a(C11768d1.m46783e().mo23706a0().mo7443Q(c));
        C36030b b = aVar.mo106595b();
        Intrinsics.checkNotNullExpressionValue(b, "args.inAppActivityMonitor");
        this.f88720d = b;
        this.f88721e = aVar.mo106598e();
        this.f88722f = aVar.mo106594a();
        C35696x d = aVar.mo106597d();
        Intrinsics.checkNotNullExpressionValue(d, "args.payload");
        this.f88723g = d;
        C35700k c2 = aVar.mo106596c();
        Intrinsics.checkNotNullExpressionValue(c2, "args.listener");
        this.f88724h = c2;
        this.f88725i = String.valueOf(aVar.hashCode());
        this.f88726j = new C35598h(c2);
        C35894c cVar = new C35894c(this);
        this.f88727k = cVar;
        this.f88728l = new DisplayTimer(b, cVar, 0);
        C35872b bVar = new C35872b(this);
        this.f88729m = bVar;
        b.mo18484e(bVar);
    }

    /* renamed from: g */
    public static final boolean m147963g(LayoutBanner layoutBanner, Activity activity) {
        Intrinsics.checkNotNullParameter(layoutBanner, "this$0");
        Intrinsics.checkNotNullParameter(activity, C0696c.f2306r);
        try {
            if (layoutBanner.mo107486l(activity) != null) {
                return true;
            }
            C36059m.m148409e("BannerAdapter - Unable to display in-app message. No view group found.", new Object[0]);
            return false;
        } catch (Exception e) {
            C36059m.m148409e("Failed to find container view.", e);
            return false;
        }
    }

    /* renamed from: i */
    public static /* synthetic */ void m147964i(LayoutBanner layoutBanner, boolean z, boolean z2, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        if ((i & 2) != 0) {
            z2 = false;
        }
        layoutBanner.mo107483h(z, z2);
    }

    /* renamed from: s */
    public static /* synthetic */ void m147965s(LayoutBanner layoutBanner, C35868d dVar, int i, Object obj) {
        if ((i & 1) != 0) {
            dVar = C35868d.m147936b();
            Intrinsics.checkNotNullExpressionValue(dVar, "empty()");
        }
        layoutBanner.mo107492r(dVar);
    }

    /* renamed from: h */
    public final void mo107483h(boolean z, boolean z2) {
        ThomasBannerView thomasBannerView;
        WeakReference<ThomasBannerView> weakReference = this.f88731o;
        if (weakReference != null && (thomasBannerView = weakReference.get()) != null) {
            thomasBannerView.mo107505A(z, z2);
        }
    }

    /* renamed from: j */
    public final void mo107484j() {
        C35572a aVar;
        Activity activity;
        List<Activity> g = this.f88720d.mo18486g(this.f88727k);
        Intrinsics.checkNotNullExpressionValue(g, "activityMonitor.getResum…vities(activityPredicate)");
        Activity activity2 = (Activity) CollectionsKt___CollectionsKt.m40479B2(g);
        if (activity2 != null) {
            C35573b f = this.f88723g.mo106855f();
            VerticalPosition verticalPosition = null;
            if (f instanceof C35572a) {
                aVar = (C35572a) f;
            } else {
                aVar = null;
            }
            if (aVar != null) {
                C35828a g2 = aVar.mo106579g(this.f88717a);
                Intrinsics.checkNotNullExpressionValue(g2, "presentation.getResolvedPlacement(context)");
                if (g2.mo107236a()) {
                    C18026a4.m81880c(activity2.getWindow(), false);
                }
                C35596f fVar = new C35596f(activity2, this.f88720d, this.f88721e, this.f88722f, g2.mo107236a());
                ViewGroup l = mo107486l(activity2);
                if (l != null) {
                    C35895d dVar = (C35895d) new C19502x0(C35893b.f88782a).mo57694b(this.f88725i, C35895d.class);
                    try {
                        ModelEnvironment e0 = C35895d.m148014e0(dVar, this.f88726j, this.f88724h, this.f88728l, (C35603k) null, 8, (Object) null);
                        ThomasBannerView thomasBannerView = new ThomasBannerView(this.f88717a, C35895d.m148015h0(dVar, this.f88723g.mo106857h(), e0, (C35581e) null, 4, (Object) null), aVar, fVar);
                        thomasBannerView.setLayoutParams(new ConstraintLayout.C16926b(-1, -1));
                        WeakReference<Activity> weakReference = this.f88730n;
                        if (weakReference != null) {
                            activity = weakReference.get();
                        } else {
                            activity = null;
                        }
                        if (activity != activity2) {
                            VerticalPosition verticalPosition2 = VerticalPosition.BOTTOM;
                            C35843n e = g2.mo107329e();
                            if (e != null) {
                                verticalPosition = e.mo107359d();
                            }
                            if (verticalPosition2 == verticalPosition) {
                                thomasBannerView.setAnimations(C35625g.C35627b.ua_layout_slide_in_bottom, C35625g.C35627b.ua_layout_slide_out_bottom);
                            } else {
                                thomasBannerView.setAnimations(C35625g.C35627b.ua_layout_slide_in_top, C35625g.C35627b.ua_layout_slide_out_top);
                            }
                        }
                        mo107487m(e0.mo106631e());
                        thomasBannerView.setListener(new C35873c(this, thomasBannerView));
                        if (thomasBannerView.getParent() == null) {
                            l.addView(thomasBannerView);
                        }
                        this.f88730n = new WeakReference<>(activity2);
                        this.f88731o = new WeakReference<>(thomasBannerView);
                    } catch (ModelFactoryException e2) {
                        C36059m.m148409e("Failed to load model!", e2);
                    }
                }
            }
        }
    }

    /* renamed from: k */
    public final int mo107485k(Activity activity) {
        Bundle bundle;
        Map<Class<?>, Integer> map = f88716r;
        synchronized (map) {
            Integer num = map.get(activity.getClass());
            if (num != null) {
                int intValue = num.intValue();
                return intValue;
            }
            ActivityInfo a = C9640b0.m36123a(activity.getClass());
            if (a != null) {
                bundle = a.metaData;
            } else {
                bundle = null;
            }
            int i = 0;
            if (bundle != null) {
                i = a.metaData.getInt("com.urbanairship.iam.banner.BANNER_CONTAINER_ID", 0);
            }
            map.put(activity.getClass(), Integer.valueOf(i));
            return i;
        }
    }

    /* renamed from: l */
    public final ViewGroup mo107486l(Activity activity) {
        View view;
        int k = mo107485k(activity);
        if (k != 0) {
            view = activity.findViewById(k);
        } else {
            view = null;
        }
        if (view == null) {
            view = activity.findViewById(16908290);
        }
        if (view instanceof ViewGroup) {
            return (ViewGroup) view;
        }
        return null;
    }

    /* renamed from: m */
    public final C11723c2 mo107487m(C11907e<? extends LayoutEvent> eVar) {
        return C12038j.m48061f(this.f88719c, (CoroutineContext) null, (CoroutineStart) null, new LayoutBanner$observeLayoutEvents$1(eVar, this, (C11045c<? super LayoutBanner$observeLayoutEvents$1>) null), 3, (Object) null);
    }

    @C0353k0
    /* renamed from: n */
    public final void mo107488n(Activity activity) {
        Activity activity2;
        WeakReference<ThomasBannerView> weakReference;
        ThomasBannerView thomasBannerView;
        WeakReference<Activity> weakReference2 = this.f88730n;
        if (weakReference2 != null) {
            activity2 = weakReference2.get();
        } else {
            activity2 = null;
        }
        if (activity == activity2 && (weakReference = this.f88731o) != null && (thomasBannerView = weakReference.get()) != null) {
            thomasBannerView.mo107510F();
        }
    }

    @C0353k0
    /* renamed from: o */
    public final void mo107489o(Activity activity) {
        ThomasBannerView thomasBannerView;
        WeakReference<ThomasBannerView> weakReference = this.f88731o;
        Activity activity2 = null;
        if (weakReference != null) {
            thomasBannerView = weakReference.get();
        } else {
            thomasBannerView = null;
        }
        if (thomasBannerView == null || !C18196h2.m82521O0(thomasBannerView)) {
            mo107484j();
            return;
        }
        WeakReference<Activity> weakReference2 = this.f88730n;
        if (weakReference2 != null) {
            activity2 = weakReference2.get();
        }
        if (activity == activity2) {
            thomasBannerView.mo107511G();
        }
    }

    @C0353k0
    /* renamed from: p */
    public final void mo107490p(Activity activity) {
        Activity activity2;
        ThomasBannerView thomasBannerView;
        WeakReference<Activity> weakReference = this.f88730n;
        if (weakReference != null) {
            activity2 = weakReference.get();
        } else {
            activity2 = null;
        }
        if (activity == activity2) {
            WeakReference<ThomasBannerView> weakReference2 = this.f88731o;
            if (weakReference2 != null) {
                thomasBannerView = weakReference2.get();
            } else {
                thomasBannerView = null;
            }
            if (thomasBannerView != null) {
                this.f88731o = null;
                this.f88730n = null;
                thomasBannerView.mo107505A(false, true);
                mo107484j();
            }
        }
    }

    @C0353k0
    /* renamed from: q */
    public final void mo107491q() {
        this.f88720d.mo18480a(this.f88729m);
        C11968h2.m47702v(this.f88718b, (CancellationException) null, 1, (Object) null);
        C35892a.f88781b.mo57550a();
    }

    /* renamed from: r */
    public final void mo107492r(C35868d dVar) {
        this.f88726j.mo106647a(new ReportingEvent.C35617c(this.f88728l.mo107378b()), dVar);
    }
}
