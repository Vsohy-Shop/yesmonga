package com.carrefour.fid.android.shared.extension;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.Dialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.inputmethod.InputMethodManager;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import androidx.activity.result.C0263a;
import androidx.activity.result.C0302g;
import androidx.activity.result.contract.C0268b;
import androidx.appcompat.app.C0467d;
import androidx.appcompat.app.C0475e;
import androidx.compose.runtime.C8698y1;
import androidx.core.content.C17318d;
import androidx.lifecycle.C19501x;
import androidx.lifecycle.Lifecycle;
import com.carrefour.fid.android.design.components.extension.C37116g;
import com.carrefour.fid.android.design.components.widgets.C37248j0;
import com.carrefour.fid.android.design.components.widgets.NotificationComponent;
import com.carrefour.fid.android.shared.C28444b;
import com.carrefour.fid.android.shared.base.BaseMVIViewModel;
import com.carrefour.fid.android.shared.base.C28505u;
import com.carrefour.fid.android.shared.base.ObserverWhileResumedImpl;
import com.carrefour.fid.android.shared.constant.C28534f;
import com.carrefour.fid.android.shared.util.C28904b;
import com.carrefour.fid.android.shared.util.C28951s;
import kotlin.C11079d2;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.C11723c2;
import kotlinx.coroutines.C12038j;
import kotlinx.coroutines.C12074o0;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.flow.C11944n;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11363r0({"SMAP\nActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Activity.kt\ncom/carrefour/fid/android/shared/extension/ActivityKt\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 3 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt\n+ 4 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt\n+ 5 Lifecycle.kt\ncom/carrefour/fid/android/shared/base/LifecycleKt\n*L\n1#1,311:1\n53#2:312\n55#2:316\n53#2:319\n55#2:323\n50#3:313\n55#3:315\n50#3:320\n55#3:322\n106#4:314\n106#4:321\n47#5,2:317\n47#5,2:324\n*S KotlinDebug\n*F\n+ 1 Activity.kt\ncom/carrefour/fid/android/shared/extension/ActivityKt\n*L\n201#1:312\n201#1:316\n212#1:319\n212#1:323\n201#1:313\n201#1:315\n212#1:320\n212#1:322\n201#1:314\n212#1:321\n202#1:317,2\n213#1:324,2\n*E\n"})
public final class ActivityKt {
    @C12579k

    /* renamed from: a */
    public static final String f70305a = "android.settings.APP_NOTIFICATION_SETTINGS";
    @C12579k

    /* renamed from: b */
    public static final String f70306b = "android.provider.extra.APP_PACKAGE";
    @C12579k

    /* renamed from: c */
    public static final String f70307c = "app_package";
    @C12579k

    /* renamed from: d */
    public static final String f70308d = "app_uid";

    /* renamed from: com.carrefour.fid.android.shared.extension.ActivityKt$a */
    public static final class C28693a implements C0263a<Boolean> {

        /* renamed from: a */
        public final /* synthetic */ C11289a<C11079d2> f70309a;

        /* renamed from: b */
        public final /* synthetic */ C11289a<C11079d2> f70310b;

        public C28693a(C11289a<C11079d2> aVar, C11289a<C11079d2> aVar2) {
            this.f70309a = aVar;
            this.f70310b = aVar2;
        }

        /* renamed from: b */
        public final void mo790a(Boolean bool) {
            Intrinsics.checkNotNullExpressionValue(bool, "granted");
            if (bool.booleanValue()) {
                this.f70309a.invoke();
            } else {
                this.f70310b.invoke();
            }
        }
    }

    /* renamed from: A */
    public static final void m118688A(C11289a aVar, boolean z, C37248j0 j0Var, View view) {
        Intrinsics.checkNotNullParameter(j0Var, "$snackbar");
        if (aVar != null) {
            aVar.invoke();
        }
        if (z) {
            j0Var.mo91163t();
        }
    }

    /* renamed from: B */
    public static final void m118689B(@C12579k Activity activity, boolean z, @C12579k String str) {
        Intrinsics.checkNotNullParameter(activity, "<this>");
        Intrinsics.checkNotNullParameter(str, "message");
        View inflate = activity.getLayoutInflater().inflate(C28444b.C28457m.banner_layout, (ViewGroup) activity.findViewById(C28444b.C28454j.bannerContainer));
        ImageView imageView = (ImageView) inflate.findViewById(C28444b.C28454j.pictoBanner);
        ((TextView) inflate.findViewById(C28444b.C28454j.mainText)).setText(str);
        if (z) {
            inflate.setBackground(C17318d.m79726i(activity, C28444b.C28452h.shape_error_banner));
            imageView.setImageDrawable(C17318d.m79726i(activity, C28444b.C28452h.ic_toast_ko));
        } else {
            inflate.setBackground(C17318d.m79726i(activity, C28444b.C28452h.shape_valid_banner));
            imageView.setImageDrawable(C17318d.m79726i(activity, C28444b.C28452h.ic_toast_ok));
        }
        Toast toast = new Toast(activity);
        toast.setGravity(49, 0, C28951s.f70964a.mo84277c(63, activity));
        toast.setDuration(1);
        toast.setView(inflate);
        toast.show();
    }

    /* renamed from: C */
    public static final void m118690C(@C12579k Activity activity, @C12579k String str) {
        Intrinsics.checkNotNullParameter(activity, "<this>");
        Intrinsics.checkNotNullParameter(str, "uri");
        try {
            activity.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(str)));
        } catch (RuntimeException e) {
            e.printStackTrace();
        }
    }

    /* renamed from: g */
    public static final void m118697g(@C12579k Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "<this>");
        Window window = activity.getWindow();
        window.clearFlags(C8698y1.f23302n);
        window.addFlags(Integer.MIN_VALUE);
        int systemUiVisibility = window.getDecorView().getSystemUiVisibility();
        window.setStatusBarColor(C17318d.m79723f(window.getContext(), C28444b.C28450f.ds_grey_white));
        window.getDecorView().setSystemUiVisibility(systemUiVisibility | 8192);
    }

    /* renamed from: h */
    public static final void m118698h(@C12579k Dialog dialog) {
        Intrinsics.checkNotNullParameter(dialog, "<this>");
        Window window = dialog.getWindow();
        if (window != null) {
            window.clearFlags(C8698y1.f23302n);
            window.addFlags(Integer.MIN_VALUE);
            int systemUiVisibility = window.getDecorView().getSystemUiVisibility();
            window.setStatusBarColor(C17318d.m79723f(window.getContext(), C28444b.C28450f.ds_grey_white));
            window.getDecorView().setSystemUiVisibility(systemUiVisibility | 8192);
        }
    }

    /* renamed from: i */
    public static final void m118699i(@C12579k Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "<this>");
        InputMethodManager e = C28775q.m119097e(activity);
        View currentFocus = activity.getCurrentFocus();
        if (currentFocus != null && e != null) {
            e.hideSoftInputFromWindow(currentFocus.getWindowToken(), 0);
        }
    }

    /* renamed from: j */
    public static final void m118700j(@C12579k C0475e eVar, @C12579k Lifecycle.State state, @C12579k C11304p<? super C12074o0, ? super C11045c<? super C11079d2>, ? extends Object> pVar) {
        Intrinsics.checkNotNullParameter(eVar, "<this>");
        Intrinsics.checkNotNullParameter(state, "lifecycleState");
        Intrinsics.checkNotNullParameter(pVar, C28534f.f69159i0);
        C11723c2 unused = C12038j.m48061f(C19501x.m90847a(eVar), (CoroutineContext) null, (CoroutineStart) null, new ActivityKt$launchAndRepeatWithViewLifecycle$1(eVar, state, pVar, (C11045c<? super ActivityKt$launchAndRepeatWithViewLifecycle$1>) null), 3, (Object) null);
    }

    /* renamed from: k */
    public static /* synthetic */ void m118701k(C0475e eVar, Lifecycle.State state, C11304p pVar, int i, Object obj) {
        if ((i & 1) != 0) {
            state = Lifecycle.State.STARTED;
        }
        Intrinsics.checkNotNullParameter(eVar, "<this>");
        Intrinsics.checkNotNullParameter(state, "lifecycleState");
        Intrinsics.checkNotNullParameter(pVar, C28534f.f69159i0);
        C11723c2 unused = C12038j.m48061f(C19501x.m90847a(eVar), (CoroutineContext) null, (CoroutineStart) null, new ActivityKt$launchAndRepeatWithViewLifecycle$1(eVar, state, pVar, (C11045c<? super ActivityKt$launchAndRepeatWithViewLifecycle$1>) null), 3, (Object) null);
    }

    /* renamed from: l */
    public static final void m118702l(@C12579k Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "<this>");
        Bundle bundle = new Bundle();
        bundle.putString(f70307c, activity.getPackageName());
        bundle.putInt(f70308d, activity.getApplicationInfo().uid);
        bundle.putString(f70306b, activity.getPackageName());
        Intent intent = new Intent();
        intent.setAction("android.settings.APP_NOTIFICATION_SETTINGS");
        intent.putExtras(bundle);
        activity.startActivity(intent);
    }

    /* renamed from: m */
    public static final /* synthetic */ <E extends C28505u.C28506a> void m118703m(C0475e eVar, BaseMVIViewModel<?, ?> baseMVIViewModel, C11300l<? super E, C11079d2> lVar) {
        Intrinsics.checkNotNullParameter(eVar, "<this>");
        Intrinsics.checkNotNullParameter(baseMVIViewModel, "viewModel");
        Intrinsics.checkNotNullParameter(lVar, "action");
        C11944n<C28505u.C28506a> uiEvent = baseMVIViewModel.getUiEvent();
        Intrinsics.needClassReification();
        new ObserverWhileResumedImpl(eVar, new ActivityKt$processEvent$$inlined$map$1(uiEvent, lVar), new ActivityKt$processEvent$$inlined$collectWhileResumedIn$1((C11045c) null));
    }

    /* renamed from: n */
    public static final <S extends C28505u.C28509d, I extends C28505u.C28507b> void m118704n(@C12579k C0475e eVar, @C12579k BaseMVIViewModel<S, I> baseMVIViewModel, @C12579k C11300l<? super S, C11079d2> lVar) {
        Intrinsics.checkNotNullParameter(eVar, "<this>");
        Intrinsics.checkNotNullParameter(baseMVIViewModel, "viewModel");
        Intrinsics.checkNotNullParameter(lVar, "action");
        new ObserverWhileResumedImpl(eVar, new ActivityKt$processState$$inlined$map$1(baseMVIViewModel.getUiState(), lVar), new ActivityKt$processState$$inlined$collectWhileResumedIn$1((C11045c) null));
    }

    /* renamed from: o */
    public static final void m118705o(@C12579k Activity activity, @C12579k String str, @C12579k String str2, @C12579k C11289a<C11079d2> aVar) {
        Activity activity2 = activity;
        Intrinsics.checkNotNullParameter(activity2, "<this>");
        Intrinsics.checkNotNullParameter(str, "title");
        Intrinsics.checkNotNullParameter(str2, "message");
        C11289a<C11079d2> aVar2 = aVar;
        Intrinsics.checkNotNullParameter(aVar2, "leftAction");
        m118709s(activity2, str, str2, (Drawable) null, activity2.getString(C28444b.C28462r.yes), aVar2, activity2.getString(C28444b.C28462r.general_cancel), false, ActivityKt$redirectToWebApp$1.f70319f, (String) null, (C11289a) null, (C11289a) null, 0, 3908, (Object) null);
    }

    /* renamed from: p */
    public static /* synthetic */ void m118706p(Activity activity, String str, String str2, C11289a aVar, int i, Object obj) {
        if ((i & 1) != 0) {
            str = activity.getString(C28444b.C28462r.general_external_link_popup_title);
            Intrinsics.checkNotNullExpressionValue(str, "getString(R.string.gener…xternal_link_popup_title)");
        }
        if ((i & 2) != 0) {
            str2 = activity.getString(C28444b.C28462r.general_external_link_popup_message);
            Intrinsics.checkNotNullExpressionValue(str2, "getString(R.string.gener…ernal_link_popup_message)");
        }
        m118705o(activity, str, str2, aVar);
    }

    @C12579k
    /* renamed from: q */
    public static final C0302g<String> m118707q(@C12579k C0475e eVar, @C12579k C11289a<C11079d2> aVar, @C12579k C11289a<C11079d2> aVar2) {
        Intrinsics.checkNotNullParameter(eVar, "<this>");
        Intrinsics.checkNotNullParameter(aVar, "onPermissionGranted");
        Intrinsics.checkNotNullParameter(aVar2, "onPermissionDenied");
        C0302g<String> registerForActivityResult = eVar.registerForActivityResult(new C0268b.C0289l(), new C28693a(aVar, aVar2));
        Intrinsics.checkNotNullExpressionValue(registerForActivityResult, "onPermissionGranted: () …se onPermissionDenied()\n}");
        return registerForActivityResult;
    }

    @SuppressLint({"InflateParams"})
    /* renamed from: r */
    public static final void m118708r(@C12579k Activity activity, @C12579k String str, @C12579k String str2, @C12580l Drawable drawable, @C12580l String str3, @C12580l C11289a<C11079d2> aVar, @C12580l String str4, boolean z, @C12580l C11289a<C11079d2> aVar2, @C12580l String str5, @C12580l C11289a<C11079d2> aVar3, @C12580l C11289a<C11079d2> aVar4, int i) {
        String str6;
        Activity activity2 = activity;
        String str7 = str;
        String str8 = str2;
        String str9 = str3;
        String str10 = str5;
        C11289a<C11079d2> aVar5 = aVar4;
        int i2 = i;
        Intrinsics.checkNotNullParameter(activity, "<this>");
        Intrinsics.checkNotNullParameter(str, "title");
        Intrinsics.checkNotNullParameter(str2, "message");
        C0467d a = new C0467d.C0468a(activity).mo1403a();
        Intrinsics.checkNotNullExpressionValue(a, "Builder(this).create()");
        if (str4 == null) {
            str6 = activity.getString(17039370);
            Intrinsics.checkNotNullExpressionValue(str6, "getString(android.R.string.ok)");
        } else {
            str6 = str4;
        }
        activity.getTheme().resolveAttribute(16843605, new TypedValue(), true);
        View inflate = LayoutInflater.from(activity).inflate(C28444b.C28457m.alert_dialog_title_view, (ViewGroup) null);
        TextView textView = (TextView) inflate.findViewById(C28444b.C28454j.txtTitleDialog);
        textView.setText(str);
        if (i2 != 0) {
            Intrinsics.checkNotNullExpressionValue(textView, "titleView");
            C37116g.m152165c(textView, i2, (Integer) null, 2, (Object) null);
        }
        a.mo1383t(inflate);
        a.mo1387x(str2);
        a.setCancelable(false);
        Window window = a.getWindow();
        if (window != null) {
            window.setBackgroundDrawable(drawable);
        }
        a.mo1378p(-1, str6, new C28745b(aVar2));
        if (str9 != null) {
            a.mo1378p(-2, str9, new C28747c(aVar));
        }
        if (str10 != null) {
            a.mo1378p(-3, str10, new C28749d(aVar3));
        }
        if (aVar5 != null) {
            a.setOnCancelListener(new C28751e(aVar5));
        }
        if (z) {
            a.setOnShowListener(new C28753f());
        }
        a.show();
    }

    /* renamed from: s */
    public static /* synthetic */ void m118709s(Activity activity, String str, String str2, Drawable drawable, String str3, C11289a aVar, String str4, boolean z, C11289a aVar2, String str5, C11289a aVar3, C11289a aVar4, int i, int i2, Object obj) {
        int i3 = i2;
        m118708r(activity, str, str2, (i3 & 4) != 0 ? null : drawable, (i3 & 8) != 0 ? null : str3, (i3 & 16) != 0 ? null : aVar, (i3 & 32) != 0 ? null : str4, (i3 & 64) != 0 ? false : z, (i3 & 128) != 0 ? null : aVar2, (i3 & 256) != 0 ? null : str5, (i3 & 512) != 0 ? null : aVar3, (i3 & 1024) != 0 ? null : aVar4, (i3 & 2048) != 0 ? 0 : i);
    }

    /* renamed from: t */
    public static final void m118710t(C11289a aVar, DialogInterface dialogInterface, int i) {
        if (aVar != null) {
            aVar.invoke();
        }
        dialogInterface.dismiss();
    }

    /* renamed from: u */
    public static final void m118711u(C11289a aVar, DialogInterface dialogInterface, int i) {
        if (aVar != null) {
            aVar.invoke();
        }
        dialogInterface.dismiss();
    }

    /* renamed from: v */
    public static final void m118712v(C11289a aVar, DialogInterface dialogInterface, int i) {
        if (aVar != null) {
            aVar.invoke();
        }
        dialogInterface.dismiss();
    }

    /* renamed from: w */
    public static final void m118713w(C11289a aVar, DialogInterface dialogInterface) {
        aVar.invoke();
    }

    /* renamed from: x */
    public static final void m118714x(DialogInterface dialogInterface) {
        Intrinsics.checkNotNull(dialogInterface, "null cannot be cast to non-null type androidx.appcompat.app.AlertDialog");
        ((C0467d) dialogInterface).mo1374m(-1).setTypeface(Typeface.DEFAULT, 1);
    }

    @C12579k
    /* renamed from: y */
    public static final C37248j0 m118715y(@C12579k Activity activity, @C12579k NotificationComponent.Variant variant, @C12579k String str, @C12580l String str2, @C12580l String str3, @C12580l C11289a<C11079d2> aVar, boolean z, boolean z2, @C12580l Integer num, @C12580l Integer num2, @C12580l Integer num3, @C12580l Integer num4) {
        int i;
        C28904b bVar;
        int i2;
        int i3;
        int i4;
        int i5;
        Activity activity2 = activity;
        NotificationComponent.Variant variant2 = variant;
        String str4 = str;
        Intrinsics.checkNotNullParameter(activity, "<this>");
        Intrinsics.checkNotNullParameter(variant, "variant");
        Intrinsics.checkNotNullParameter(str, "title");
        int i6 = 0;
        String str5 = str2;
        String str6 = str3;
        NotificationComponent.C37156a aVar2 = new NotificationComponent.C37156a(str, str2, str3, false);
        NotificationComponent notificationComponent = new NotificationComponent(activity, (AttributeSet) null, 0, 6, (DefaultConstructorMarker) null);
        notificationComponent.mo112945y(variant);
        notificationComponent.mo112943w(aVar2);
        if (z2) {
            i = -2;
        } else {
            i = 0;
        }
        C37248j0.C37249a aVar3 = C37248j0.f93415K;
        View findViewById = activity.findViewById(16908290);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(android.R.id.content)");
        C37248j0 b = aVar3.mo113416b((ViewGroup) findViewById, notificationComponent, i);
        if (activity2 instanceof C28904b) {
            bVar = (C28904b) activity2;
        } else {
            bVar = null;
        }
        if (bVar != null) {
            i6 = bVar.mo84136o();
        }
        if (num != null) {
            i2 = num.intValue();
        } else {
            i2 = b.mo91125G().getPaddingLeft();
        }
        if (num2 != null) {
            i3 = num2.intValue();
        } else {
            i3 = b.mo91125G().getPaddingTop();
        }
        if (num3 != null) {
            i4 = num3.intValue();
        } else {
            i4 = b.mo91125G().getPaddingRight();
        }
        if (num4 != null) {
            i5 = num4.intValue();
        } else {
            i5 = b.mo91125G().getPaddingBottom();
        }
        b.mo113413o0(i2, i3, i4, i5 + i6);
        notificationComponent.setOnActionClickListener(new C28743a(aVar, z, b));
        b.mo91151g0();
        return b;
    }

    /* renamed from: z */
    public static /* synthetic */ C37248j0 m118716z(Activity activity, NotificationComponent.Variant variant, String str, String str2, String str3, C11289a aVar, boolean z, boolean z2, Integer num, Integer num2, Integer num3, Integer num4, int i, Object obj) {
        int i2 = i;
        return m118715y(activity, variant, str, (i2 & 4) != 0 ? null : str2, (i2 & 8) != 0 ? null : str3, (i2 & 16) != 0 ? null : aVar, (i2 & 32) != 0 ? false : z, (i2 & 64) != 0 ? false : z2, (i2 & 128) != 0 ? null : num, (i2 & 256) != 0 ? null : num2, (i2 & 512) != 0 ? null : num3, (i2 & 1024) != 0 ? null : num4);
    }
}
