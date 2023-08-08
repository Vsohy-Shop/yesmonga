package androidx.compose.p004ui.platform;

import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.res.Configuration;
import android.view.View;
import androidx.compose.p004ui.platform.AndroidComposeView;
import androidx.compose.p004ui.res.C16012e;
import androidx.compose.runtime.C8415c2;
import androidx.compose.runtime.C8540g;
import androidx.compose.runtime.C8544h;
import androidx.compose.runtime.C8547h2;
import androidx.compose.runtime.C8550i1;
import androidx.compose.runtime.C8572j1;
import androidx.compose.runtime.C8592o;
import androidx.compose.runtime.C8678t1;
import androidx.compose.runtime.C8700z0;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.internal.C8553b;
import androidx.compose.runtime.saveable.SaveableStateRegistryKt;
import androidx.lifecycle.C19499w;
import androidx.savedstate.C20437e;
import com.urbanairship.iam.events.C9175a;
import com.usabilla.sdk.ubform.sdk.banner.BannerConfigurableFragment;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11363r0({"SMAP\nAndroidCompositionLocals.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidCompositionLocals.android.kt\nandroidx/compose/ui/platform/AndroidCompositionLocals_androidKt\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 5 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,170:1\n25#2:171\n36#2:178\n25#2:185\n25#2:192\n25#2:199\n25#2:206\n25#2:214\n1114#3,6:172\n1114#3,6:179\n1114#3,6:186\n1114#3,6:193\n1114#3,6:200\n1114#3,3:207\n1117#3,3:211\n1114#3,6:215\n1#4:210\n76#5:221\n102#5,2:222\n*S KotlinDebug\n*F\n+ 1 AndroidCompositionLocals.android.kt\nandroidx/compose/ui/platform/AndroidCompositionLocals_androidKt\n*L\n90#1:171\n97#1:178\n99#1:185\n104#1:192\n137#1:199\n138#1:206\n141#1:214\n90#1:172,6\n97#1:179,6\n99#1:186,6\n104#1:193,6\n137#1:200,6\n138#1:207,3\n138#1:211,3\n141#1:215,6\n90#1:221\n90#1:222,2\n*E\n"})
/* renamed from: androidx.compose.ui.platform.AndroidCompositionLocals_androidKt */
public final class AndroidCompositionLocals_androidKt {
    @C12579k

    /* renamed from: a */
    public static final C8550i1<Configuration> f39269a = CompositionLocalKt.m29857c(C8415c2.m30243l(), AndroidCompositionLocals_androidKt$LocalConfiguration$1.f39277f);
    @C12579k

    /* renamed from: b */
    public static final C8550i1<Context> f39270b = CompositionLocalKt.m29859e(AndroidCompositionLocals_androidKt$LocalContext$1.f39278f);
    @C12579k

    /* renamed from: c */
    public static final C8550i1<C16012e> f39271c = CompositionLocalKt.m29859e(AndroidCompositionLocals_androidKt$LocalImageVectorCache$1.f39279f);
    @C12579k

    /* renamed from: d */
    public static final C8550i1<C19499w> f39272d = CompositionLocalKt.m29859e(AndroidCompositionLocals_androidKt$LocalLifecycleOwner$1.f39280f);
    @C12579k

    /* renamed from: e */
    public static final C8550i1<C20437e> f39273e = CompositionLocalKt.m29859e(C15786x7efe3756.f39281f);
    @C12579k

    /* renamed from: f */
    public static final C8550i1<View> f39274f = CompositionLocalKt.m29859e(AndroidCompositionLocals_androidKt$LocalView$1.f39282f);

    /* renamed from: androidx.compose.ui.platform.AndroidCompositionLocals_androidKt$a */
    public static final class C15785a implements ComponentCallbacks2 {

        /* renamed from: a */
        public final /* synthetic */ Configuration f39275a;

        /* renamed from: b */
        public final /* synthetic */ C16012e f39276b;

        public C15785a(Configuration configuration, C16012e eVar) {
            this.f39275a = configuration;
            this.f39276b = eVar;
        }

        public void onConfigurationChanged(@C12579k Configuration configuration) {
            Intrinsics.checkNotNullParameter(configuration, BannerConfigurableFragment.f27258E0);
            this.f39276b.mo45989c(this.f39275a.updateFrom(configuration));
            this.f39275a.setTo(configuration);
        }

        public void onLowMemory() {
            this.f39276b.mo45987a();
        }

        public void onTrimMemory(int i) {
            this.f39276b.mo45987a();
        }
    }

    @C8540g
    @C8544h(scheme = "[0[0]]")
    /* renamed from: a */
    public static final void m70946a(@C12579k AndroidComposeView androidComposeView, @C12579k C11304p<? super C8592o, ? super Integer, C11079d2> pVar, @C12580l C8592o oVar, int i) {
        Intrinsics.checkNotNullParameter(androidComposeView, "owner");
        Intrinsics.checkNotNullParameter(pVar, "content");
        C8592o o = oVar.mo15009o(1396852028);
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29845w0(1396852028, i, -1, "androidx.compose.ui.platform.ProvideAndroidCompositionLocals (AndroidCompositionLocals.android.kt:83)");
        }
        Context context = androidComposeView.getContext();
        o.mo14918M(-492369756);
        Object N = o.mo14921N();
        C8592o.C8593a aVar = C8592o.f23032a;
        if (N == aVar.mo16277a()) {
            N = C8415c2.m30241j(context.getResources().getConfiguration(), C8415c2.m30243l());
            o.mo14893C(N);
        }
        o.mo15002m0();
        C8700z0 z0Var = (C8700z0) N;
        o.mo14918M(1157296644);
        boolean n0 = o.mo15006n0(z0Var);
        Object N2 = o.mo14921N();
        if (n0 || N2 == aVar.mo16277a()) {
            N2 = new C15787x68d8e1f6(z0Var);
            o.mo14893C(N2);
        }
        o.mo15002m0();
        androidComposeView.setConfigurationChangeObserver((C11300l) N2);
        o.mo14918M(-492369756);
        Object N3 = o.mo14921N();
        if (N3 == aVar.mo16277a()) {
            Intrinsics.checkNotNullExpressionValue(context, C9175a.f24932Y);
            N3 = new C15859c0(context);
            o.mo14893C(N3);
        }
        o.mo15002m0();
        C15859c0 c0Var = (C15859c0) N3;
        AndroidComposeView.C15753b viewTreeOwners = androidComposeView.getViewTreeOwners();
        if (viewTreeOwners != null) {
            o.mo14918M(-492369756);
            Object N4 = o.mo14921N();
            if (N4 == aVar.mo16277a()) {
                N4 = DisposableSaveableStateRegistry_androidKt.m71046a(androidComposeView, viewTreeOwners.mo45366b());
                o.mo14893C(N4);
            }
            o.mo15002m0();
            C15951q0 q0Var = (C15951q0) N4;
            EffectsKt.m29891c(C11079d2.f28267a, new C15788x611323aa(q0Var), o, 6);
            Intrinsics.checkNotNullExpressionValue(context, C9175a.f24932Y);
            C16012e m = m70958m(context, m70947b(z0Var), o, 72);
            C8550i1<Configuration> i1Var = f39269a;
            Configuration b = m70947b(z0Var);
            Intrinsics.checkNotNullExpressionValue(b, BannerConfigurableFragment.f27258E0);
            CompositionLocalKt.m29856b(new C8572j1[]{i1Var.mo16141f(b), f39270b.mo16141f(context), f39272d.mo16141f(viewTreeOwners.mo45365a()), f39273e.mo16141f(viewTreeOwners.mo45366b()), SaveableStateRegistryKt.m31373b().mo16141f(q0Var), f39274f.mo16141f(androidComposeView.getView()), f39271c.mo16141f(m)}, C8553b.m31048b(o, 1471621628, true, new C15790x611323ab(androidComposeView, c0Var, pVar, i)), o, 56);
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29843v0();
            }
            C8678t1 s = o.mo15020s();
            if (s != null) {
                s.mo15202a(new C15791x611323ac(androidComposeView, pVar, i));
                return;
            }
            return;
        }
        throw new IllegalStateException("Called when the ViewTreeOwnersAvailability is not yet in Available state");
    }

    /* renamed from: b */
    public static final Configuration m70947b(C8700z0<Configuration> z0Var) {
        return z0Var.getValue();
    }

    /* renamed from: c */
    public static final void m70948c(C8700z0<Configuration> z0Var, Configuration configuration) {
        z0Var.setValue(configuration);
    }

    @C12579k
    /* renamed from: f */
    public static final C8550i1<Configuration> m70951f() {
        return f39269a;
    }

    @C12579k
    /* renamed from: g */
    public static final C8550i1<Context> m70952g() {
        return f39270b;
    }

    @C12579k
    /* renamed from: h */
    public static final C8550i1<C16012e> m70953h() {
        return f39271c;
    }

    @C12579k
    /* renamed from: i */
    public static final C8550i1<C19499w> m70954i() {
        return f39272d;
    }

    @C12579k
    /* renamed from: j */
    public static final C8550i1<C20437e> m70955j() {
        return f39273e;
    }

    @C12579k
    /* renamed from: k */
    public static final C8550i1<View> m70956k() {
        return f39274f;
    }

    /* renamed from: l */
    public static final Void m70957l(String str) {
        throw new IllegalStateException(("CompositionLocal " + str + " not present").toString());
    }

    @C8540g
    @C8547h2
    /* renamed from: m */
    public static final C16012e m70958m(Context context, Configuration configuration, C8592o oVar, int i) {
        oVar.mo14918M(-485908294);
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29845w0(-485908294, i, -1, "androidx.compose.ui.platform.obtainImageVectorCache (AndroidCompositionLocals.android.kt:132)");
        }
        oVar.mo14918M(-492369756);
        Object N = oVar.mo14921N();
        C8592o.C8593a aVar = C8592o.f23032a;
        if (N == aVar.mo16277a()) {
            N = new C16012e();
            oVar.mo14893C(N);
        }
        oVar.mo15002m0();
        C16012e eVar = (C16012e) N;
        oVar.mo14918M(-492369756);
        Object N2 = oVar.mo14921N();
        Configuration configuration2 = N2;
        if (N2 == aVar.mo16277a()) {
            Configuration configuration3 = new Configuration();
            if (configuration != null) {
                configuration3.setTo(configuration);
            }
            oVar.mo14893C(configuration3);
            configuration2 = configuration3;
        }
        oVar.mo15002m0();
        Configuration configuration4 = (Configuration) configuration2;
        oVar.mo14918M(-492369756);
        Object N3 = oVar.mo14921N();
        if (N3 == aVar.mo16277a()) {
            N3 = new C15785a(configuration4, eVar);
            oVar.mo14893C(N3);
        }
        oVar.mo15002m0();
        EffectsKt.m29891c(eVar, new AndroidCompositionLocals_androidKt$obtainImageVectorCache$1(context, (C15785a) N3), oVar, 8);
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29843v0();
        }
        oVar.mo15002m0();
        return eVar;
    }
}
