package com.carrefour.fid.android.shared.extension;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.view.Window;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import androidx.activity.C0309t;
import androidx.activity.OnBackPressedDispatcher;
import androidx.activity.result.ActivityResult;
import androidx.activity.result.C0263a;
import androidx.activity.result.C0302g;
import androidx.activity.result.contract.C0268b;
import androidx.annotation.C0329d0;
import androidx.annotation.C0358n;
import androidx.annotation.C0375v;
import androidx.core.content.res.C17465i;
import androidx.fragment.app.C19232h;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.C19499w;
import androidx.lifecycle.C19501x;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleCoroutineScope;
import androidx.navigation.C19693b0;
import androidx.navigation.NavController;
import androidx.navigation.NavDestination;
import androidx.navigation.Navigator;
import androidx.navigation.fragment.C19736g;
import androidx.navigation.fragment.NavHostFragment;
import com.carrefour.fid.android.design.components.widgets.C37185a;
import com.carrefour.fid.android.design.components.widgets.C37248j0;
import com.carrefour.fid.android.design.components.widgets.NotificationComponent;
import com.carrefour.fid.android.shared.C28444b;
import com.carrefour.fid.android.shared.base.BaseMVIViewModel;
import com.carrefour.fid.android.shared.base.C28505u;
import com.carrefour.fid.android.shared.constant.C28534f;
import com.carrefour.fid.android.shared.util.C28937k;
import com.usabilla.sdk.ubform.telemetry.C10108c;
import java.util.List;
import kotlin.C11079d2;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.C11723c2;
import kotlinx.coroutines.C12038j;
import kotlinx.coroutines.C12074o0;
import kotlinx.coroutines.CoroutineStart;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11363r0({"SMAP\nFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Fragment.kt\ncom/carrefour/fid/android/shared/extension/FragmentKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,261:1\n1#2:262\n*E\n"})
public final class FragmentKt {

    /* renamed from: com.carrefour.fid.android.shared.extension.FragmentKt$a */
    public static final class C28711a extends C0309t {

        /* renamed from: d */
        public final /* synthetic */ C11289a<C11079d2> f70360d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C28711a(C11289a<C11079d2> aVar) {
            super(true);
            this.f70360d = aVar;
        }

        /* renamed from: f */
        public void mo792f() {
            this.f70360d.invoke();
        }
    }

    /* renamed from: com.carrefour.fid.android.shared.extension.FragmentKt$b */
    public static final class C28712b implements C0263a<ActivityResult> {

        /* renamed from: a */
        public final /* synthetic */ C11289a<C11079d2> f70361a;

        /* renamed from: b */
        public final /* synthetic */ C11289a<C11079d2> f70362b;

        public C28712b(C11289a<C11079d2> aVar, C11289a<C11079d2> aVar2) {
            this.f70361a = aVar;
            this.f70362b = aVar2;
        }

        /* renamed from: b */
        public final void mo790a(ActivityResult activityResult) {
            if (activityResult.mo855b() == -1) {
                this.f70361a.invoke();
                return;
            }
            C11289a<C11079d2> aVar = this.f70362b;
            if (aVar != null) {
                aVar.invoke();
            }
        }
    }

    /* renamed from: com.carrefour.fid.android.shared.extension.FragmentKt$c */
    public static final class C28713c implements C0263a<Boolean> {

        /* renamed from: a */
        public final /* synthetic */ C11289a<C11079d2> f70363a;

        /* renamed from: b */
        public final /* synthetic */ C11289a<C11079d2> f70364b;

        public C28713c(C11289a<C11079d2> aVar, C11289a<C11079d2> aVar2) {
            this.f70363a = aVar;
            this.f70364b = aVar2;
        }

        /* renamed from: b */
        public final void mo790a(Boolean bool) {
            Intrinsics.checkNotNullExpressionValue(bool, "granted");
            if (bool.booleanValue()) {
                this.f70363a.invoke();
            } else {
                this.f70364b.invoke();
            }
        }
    }

    @C12579k
    /* renamed from: A */
    public static final C37248j0 m118810A(@C12579k Fragment fragment, @C12579k NotificationComponent.Variant variant, @C12579k String str, @C12580l String str2, @C12580l String str3, @C12580l C11289a<C11079d2> aVar, boolean z, boolean z2, @C12580l Integer num, @C12580l Integer num2, @C12580l Integer num3, @C12580l Integer num4) {
        Fragment fragment2 = fragment;
        Intrinsics.checkNotNullParameter(fragment, "<this>");
        Intrinsics.checkNotNullParameter(variant, "variant");
        Intrinsics.checkNotNullParameter(str, "title");
        C19232h requireActivity = fragment.requireActivity();
        Intrinsics.checkNotNullExpressionValue(requireActivity, "requireActivity()");
        return ActivityKt.m118715y(requireActivity, variant, str, str2, str3, aVar, z, z2, num, num2, num3, num4);
    }

    /* renamed from: B */
    public static /* synthetic */ C37248j0 m118811B(Fragment fragment, NotificationComponent.Variant variant, String str, String str2, String str3, C11289a aVar, boolean z, boolean z2, Integer num, Integer num2, Integer num3, Integer num4, int i, Object obj) {
        int i2 = i;
        return m118810A(fragment, variant, str, (i2 & 4) != 0 ? null : str2, (i2 & 8) != 0 ? null : str3, (i2 & 16) != 0 ? null : aVar, (i2 & 32) != 0 ? false : z, (i2 & 64) != 0 ? false : z2, (i2 & 128) != 0 ? null : num, (i2 & 256) != 0 ? null : num2, (i2 & 512) != 0 ? null : num3, (i2 & 1024) != 0 ? null : num4);
    }

    /* renamed from: C */
    public static final void m118812C(@C12579k Fragment fragment, @C12579k String str) {
        Intrinsics.checkNotNullParameter(fragment, "<this>");
        Intrinsics.checkNotNullParameter(str, "uri");
        try {
            Intent intent = new Intent("android.intent.action.VIEW");
            intent.setDataAndType(Uri.parse(str), C28937k.f70947d);
            fragment.requireActivity().startActivity(intent);
        } catch (ActivityNotFoundException e) {
            e.printStackTrace();
        }
    }

    /* renamed from: b */
    public static final void m118814b(@C12579k Fragment fragment) {
        Window window;
        Intrinsics.checkNotNullParameter(fragment, "<this>");
        C19232h activity = fragment.getActivity();
        if (activity != null && (window = activity.getWindow()) != null) {
            window.addFlags(8192);
        }
    }

    /* renamed from: c */
    public static final void m118815c(@C12579k Fragment fragment, @C12579k C11289a<C11079d2> aVar) {
        OnBackPressedDispatcher Z;
        Intrinsics.checkNotNullParameter(fragment, "<this>");
        Intrinsics.checkNotNullParameter(aVar, C10108c.f27778C);
        C19232h activity = fragment.getActivity();
        if (activity != null && (Z = activity.mo702Z()) != null) {
            C19499w viewLifecycleOwner = fragment.getViewLifecycleOwner();
            Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "viewLifecycleOwner");
            Z.mo764c(viewLifecycleOwner, new C28711a(aVar));
        }
    }

    /* renamed from: d */
    public static final void m118816d(@C12579k Fragment fragment, @C12579k String str) {
        Intrinsics.checkNotNullParameter(fragment, "<this>");
        Intrinsics.checkNotNullParameter(str, "text");
        Object systemService = fragment.requireContext().getSystemService("accessibility");
        Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.view.accessibility.AccessibilityManager");
        AccessibilityManager accessibilityManager = (AccessibilityManager) systemService;
        if (accessibilityManager.isEnabled()) {
            AccessibilityEvent obtain = AccessibilityEvent.obtain();
            obtain.setEventType(16384);
            obtain.setClassName(fragment.getClass().getName());
            obtain.setPackageName(fragment.requireContext().getPackageName());
            obtain.getText().add(str);
            accessibilityManager.sendAccessibilityEvent(obtain);
        }
    }

    /* renamed from: e */
    public static final int m118817e(@C12579k FragmentManager fragmentManager) {
        FragmentManager childFragmentManager;
        List<Fragment> I0;
        Intrinsics.checkNotNullParameter(fragmentManager, "<this>");
        Fragment N0 = fragmentManager.mo56822N0();
        if (N0 == null || (childFragmentManager = N0.getChildFragmentManager()) == null || (I0 = childFragmentManager.mo56807I0()) == null) {
            return 0;
        }
        return I0.size();
    }

    @C12580l
    /* renamed from: f */
    public static final Fragment m118818f(@C12579k FragmentManager fragmentManager) {
        FragmentManager childFragmentManager;
        List<Fragment> I0;
        Intrinsics.checkNotNullParameter(fragmentManager, "<this>");
        Fragment N0 = fragmentManager.mo56822N0();
        if (N0 == null || (childFragmentManager = N0.getChildFragmentManager()) == null || (I0 = childFragmentManager.mo56807I0()) == null) {
            return null;
        }
        return (Fragment) CollectionsKt___CollectionsKt.m40653k3(I0);
    }

    @C12579k
    /* renamed from: g */
    public static final Drawable m118819g(@C12579k Fragment fragment, @C0375v int i, @C0358n @C12580l Integer num) {
        Intrinsics.checkNotNullParameter(fragment, "<this>");
        Drawable g = C17465i.m80175g(fragment.getResources(), i, fragment.requireContext().getTheme());
        if (g != null) {
            if (num != null) {
                g.setTint(C17465i.m80173e(fragment.getResources(), num.intValue(), fragment.requireContext().getTheme()));
            }
            return g;
        }
        String resourceName = fragment.getResources().getResourceName(i);
        throw new IllegalStateException("Can't find drawable: " + resourceName);
    }

    /* renamed from: h */
    public static /* synthetic */ Drawable m118820h(Fragment fragment, int i, Integer num, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            num = null;
        }
        return m118819g(fragment, i, num);
    }

    /* renamed from: i */
    public static final void m118821i(@C12579k Fragment fragment, @C12579k Lifecycle.State state, @C12579k C11304p<? super C12074o0, ? super C11045c<? super C11079d2>, ? extends Object> pVar) {
        Intrinsics.checkNotNullParameter(fragment, "<this>");
        Intrinsics.checkNotNullParameter(state, "lifecycleState");
        Intrinsics.checkNotNullParameter(pVar, C28534f.f69159i0);
        C19499w viewLifecycleOwner = fragment.getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "viewLifecycleOwner");
        C11723c2 unused = C12038j.m48061f(C19501x.m90847a(viewLifecycleOwner), (CoroutineContext) null, (CoroutineStart) null, new FragmentKt$launchAndRepeatWithViewLifecycle$1(fragment, state, pVar, (C11045c<? super FragmentKt$launchAndRepeatWithViewLifecycle$1>) null), 3, (Object) null);
    }

    /* renamed from: j */
    public static /* synthetic */ void m118822j(Fragment fragment, Lifecycle.State state, C11304p pVar, int i, Object obj) {
        if ((i & 1) != 0) {
            state = Lifecycle.State.STARTED;
        }
        Intrinsics.checkNotNullParameter(fragment, "<this>");
        Intrinsics.checkNotNullParameter(state, "lifecycleState");
        Intrinsics.checkNotNullParameter(pVar, C28534f.f69159i0);
        C19499w viewLifecycleOwner = fragment.getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "viewLifecycleOwner");
        C11723c2 unused = C12038j.m48061f(C19501x.m90847a(viewLifecycleOwner), (CoroutineContext) null, (CoroutineStart) null, new FragmentKt$launchAndRepeatWithViewLifecycle$1(fragment, state, pVar, (C11045c<? super FragmentKt$launchAndRepeatWithViewLifecycle$1>) null), 3, (Object) null);
    }

    /* renamed from: k */
    public static final void m118823k(@C12579k Fragment fragment, @C12580l C19693b0 b0Var) {
        Intrinsics.checkNotNullParameter(fragment, "<this>");
        NavController d = NavHostFragment.f50531f.mo58403d(fragment);
        if (b0Var != null) {
            int intValue = Integer.valueOf(b0Var.getActionId()).intValue();
            NavDestination I = d.mo58103I();
            if (I != null && I.mo58235M(intValue) != null) {
                d.mo58142g0(b0Var);
            }
        }
    }

    /* renamed from: l */
    public static final void m118824l(@C12579k Fragment fragment, @C12579k C19693b0 b0Var, @C12579k Navigator.C19688a aVar) {
        Intrinsics.checkNotNullParameter(fragment, "<this>");
        Intrinsics.checkNotNullParameter(b0Var, "navDirections");
        Intrinsics.checkNotNullParameter(aVar, "navigatorExtras");
        NavController d = NavHostFragment.f50531f.mo58403d(fragment);
        NavDestination I = d.mo58103I();
        if (I != null && I.mo58235M(b0Var.getActionId()) != null) {
            d.mo58144i0(b0Var, aVar);
        }
    }

    /* renamed from: m */
    public static final boolean m118825m(@C12579k Fragment fragment, @C0329d0 int i) {
        Intrinsics.checkNotNullParameter(fragment, "<this>");
        return C19736g.m91827a(fragment).mo58158t0(i, false);
    }

    /* renamed from: n */
    public static final /* synthetic */ <E extends C28505u.C28506a> void m118826n(Fragment fragment, BaseMVIViewModel<?, ?> baseMVIViewModel, C11300l<? super E, C11079d2> lVar) {
        Intrinsics.checkNotNullParameter(fragment, "<this>");
        Intrinsics.checkNotNullParameter(baseMVIViewModel, "viewModel");
        Intrinsics.checkNotNullParameter(lVar, "action");
        C19499w viewLifecycleOwner = fragment.getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "viewLifecycleOwner");
        LifecycleCoroutineScope a = C19501x.m90847a(viewLifecycleOwner);
        Intrinsics.needClassReification();
        C11723c2 unused = C12038j.m48061f(a, (CoroutineContext) null, (CoroutineStart) null, new FragmentKt$processEvent$1(fragment, baseMVIViewModel, lVar, (C11045c<? super FragmentKt$processEvent$1>) null), 3, (Object) null);
    }

    /* renamed from: o */
    public static final <S extends C28505u.C28509d, I extends C28505u.C28507b> void m118827o(@C12579k Fragment fragment, @C12579k BaseMVIViewModel<S, I> baseMVIViewModel, @C12579k C11300l<? super S, C11079d2> lVar) {
        Intrinsics.checkNotNullParameter(fragment, "<this>");
        Intrinsics.checkNotNullParameter(baseMVIViewModel, "viewModel");
        Intrinsics.checkNotNullParameter(lVar, "action");
        C19499w viewLifecycleOwner = fragment.getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "viewLifecycleOwner");
        C11723c2 unused = C12038j.m48061f(C19501x.m90847a(viewLifecycleOwner), (CoroutineContext) null, (CoroutineStart) null, new FragmentKt$processState$1(fragment, baseMVIViewModel, lVar, (C11045c<? super FragmentKt$processState$1>) null), 3, (Object) null);
    }

    /* renamed from: p */
    public static final void m118828p(@C12579k Fragment fragment, @C12579k String str, @C12579k String str2, @C12579k C11289a<C11079d2> aVar) {
        Intrinsics.checkNotNullParameter(fragment, "<this>");
        Intrinsics.checkNotNullParameter(str, "title");
        Intrinsics.checkNotNullParameter(str2, "message");
        Intrinsics.checkNotNullParameter(aVar, "leftAction");
        C19232h requireActivity = fragment.requireActivity();
        Intrinsics.checkNotNullExpressionValue(requireActivity, "requireActivity()");
        ActivityKt.m118705o(requireActivity, str, str2, aVar);
    }

    /* renamed from: q */
    public static /* synthetic */ void m118829q(Fragment fragment, String str, String str2, C11289a aVar, int i, Object obj) {
        if ((i & 1) != 0) {
            str = fragment.getString(C28444b.C28462r.general_external_link_popup_title);
            Intrinsics.checkNotNullExpressionValue(str, "getString(R.string.gener…xternal_link_popup_title)");
        }
        if ((i & 2) != 0) {
            str2 = fragment.getString(C28444b.C28462r.general_external_link_popup_message);
            Intrinsics.checkNotNullExpressionValue(str2, "getString(R.string.gener…ernal_link_popup_message)");
        }
        m118828p(fragment, str, str2, aVar);
    }

    @C12579k
    /* renamed from: r */
    public static final C0302g<Intent> m118830r(@C12579k Fragment fragment, @C12580l C11289a<C11079d2> aVar, @C12579k C11289a<C11079d2> aVar2) {
        Intrinsics.checkNotNullParameter(fragment, "<this>");
        Intrinsics.checkNotNullParameter(aVar2, "successAction");
        C0302g<Intent> registerForActivityResult = fragment.registerForActivityResult(new C0268b.C0290m(), new C28712b(aVar2, aVar));
        Intrinsics.checkNotNullExpressionValue(registerForActivityResult, "cancelAction: (() -> Uni….invoke()\n        }\n    }");
        return registerForActivityResult;
    }

    /* renamed from: s */
    public static /* synthetic */ C0302g m118831s(Fragment fragment, C11289a aVar, C11289a aVar2, int i, Object obj) {
        if ((i & 1) != 0) {
            aVar = null;
        }
        return m118830r(fragment, aVar, aVar2);
    }

    /* renamed from: t */
    public static final void m118832t(@C12579k Fragment fragment) {
        Window window;
        Intrinsics.checkNotNullParameter(fragment, "<this>");
        C19232h activity = fragment.getActivity();
        if (activity != null && (window = activity.getWindow()) != null) {
            window.clearFlags(8192);
        }
    }

    @C12579k
    /* renamed from: u */
    public static final C0302g<String> m118833u(@C12579k Fragment fragment, @C12579k C11289a<C11079d2> aVar, @C12579k C11289a<C11079d2> aVar2) {
        Intrinsics.checkNotNullParameter(fragment, "<this>");
        Intrinsics.checkNotNullParameter(aVar, "onPermissionGranted");
        Intrinsics.checkNotNullParameter(aVar2, "onPermissionDenied");
        C0302g<String> registerForActivityResult = fragment.registerForActivityResult(new C0268b.C0289l(), new C28713c(aVar, aVar2));
        Intrinsics.checkNotNullExpressionValue(registerForActivityResult, "onPermissionGranted: () …se onPermissionDenied()\n}");
        return registerForActivityResult;
    }

    /* renamed from: v */
    public static final void m118834v(@C12579k Fragment fragment, @C12579k String str, @C12579k C11300l<? super Bundle, C11079d2> lVar) {
        Intrinsics.checkNotNullParameter(fragment, "<this>");
        Intrinsics.checkNotNullParameter(str, "fragmentResultKey");
        Intrinsics.checkNotNullParameter(lVar, "onBackdropDismissed");
        fragment.requireActivity().mo57175g0().mo56861b(str, fragment, new C28790z(lVar, fragment, str));
    }

    /* renamed from: w */
    public static /* synthetic */ void m118835w(Fragment fragment, String str, C11300l lVar, int i, Object obj) {
        if ((i & 1) != 0) {
            str = C37185a.ON_DISMISS_FRAGMENT_RESULT_KEY;
        }
        m118834v(fragment, str, lVar);
    }

    /* renamed from: x */
    public static final void m118836x(C11300l lVar, Fragment fragment, String str, String str2, Bundle bundle) {
        Intrinsics.checkNotNullParameter(lVar, "$onBackdropDismissed");
        Intrinsics.checkNotNullParameter(fragment, "$this_setBackdropDismissCallback");
        Intrinsics.checkNotNullParameter(str, "$fragmentResultKey");
        Intrinsics.checkNotNullParameter(str2, "<anonymous parameter 0>");
        Intrinsics.checkNotNullParameter(bundle, "bundle");
        lVar.invoke(bundle);
        fragment.requireActivity().mo57175g0().mo56865c(str);
    }

    /* renamed from: y */
    public static final void m118837y(@C12579k Fragment fragment, @C12579k String str, @C12579k String str2, @C12580l String str3, @C12580l C11289a<C11079d2> aVar, @C12580l String str4, boolean z, @C12580l C11289a<C11079d2> aVar2, @C12580l String str5, @C12580l C11289a<C11079d2> aVar3, @C12580l C11289a<C11079d2> aVar4, @C12580l Drawable drawable, int i) {
        Fragment fragment2 = fragment;
        Intrinsics.checkNotNullParameter(fragment, "<this>");
        Intrinsics.checkNotNullParameter(str, "title");
        String str6 = str2;
        Intrinsics.checkNotNullParameter(str6, "message");
        C19232h requireActivity = fragment.requireActivity();
        Intrinsics.checkNotNullExpressionValue(requireActivity, "requireActivity()");
        ActivityKt.m118708r(requireActivity, str, str6, drawable, str3, aVar, str4, z, aVar2, str5, aVar3, aVar4, i);
    }

    /* renamed from: z */
    public static /* synthetic */ void m118838z(Fragment fragment, String str, String str2, String str3, C11289a aVar, String str4, boolean z, C11289a aVar2, String str5, C11289a aVar3, C11289a aVar4, Drawable drawable, int i, int i2, Object obj) {
        int i3 = i2;
        m118837y(fragment, str, str2, (i3 & 4) != 0 ? null : str3, (i3 & 8) != 0 ? null : aVar, (i3 & 16) != 0 ? null : str4, (i3 & 32) != 0 ? false : z, (i3 & 64) != 0 ? null : aVar2, (i3 & 128) != 0 ? null : str5, (i3 & 256) != 0 ? null : aVar3, (i3 & 512) != 0 ? null : aVar4, (i3 & 1024) != 0 ? null : drawable, (i3 & 2048) != 0 ? 0 : i);
    }
}
