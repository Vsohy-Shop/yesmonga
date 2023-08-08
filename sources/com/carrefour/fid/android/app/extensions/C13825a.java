package com.carrefour.fid.android.app.extensions;

import android.app.Activity;
import android.app.ActivityOptions;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import androidx.activity.result.ActivityResult;
import androidx.activity.result.C0263a;
import androidx.activity.result.C0302g;
import androidx.activity.result.contract.C0268b;
import androidx.appcompat.app.C0475e;
import androidx.compose.runtime.C8698y1;
import androidx.core.app.C17125i;
import androidx.fragment.app.C19232h;
import androidx.fragment.app.C19234h0;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.carrefour.fid.android.R;
import com.carrefour.fid.android.account.presentation.p018ui.AccountActivity;
import com.carrefour.fid.android.design.components.widgets.NotificationComponent;
import com.carrefour.fid.android.navigation.BottomNavActivity;
import com.carrefour.fid.android.presentation.p035ui.account.consent.C22925d;
import com.carrefour.fid.android.presentation.p035ui.onboarding.SplashOnBoardingActivity;
import com.carrefour.fid.android.service.presentation.p044ui.selection.ServiceSelectionBackDropFragment;
import com.carrefour.fid.android.shared.constant.C28539g;
import com.carrefour.fid.android.shared.extension.ActivityKt;
import com.carrefour.fid.android.shared.util.C28951s;
import kotlin.C11079d2;
import kotlin.C11395k;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11363r0({"SMAP\nActivityExtension.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ActivityExtension.kt\ncom/carrefour/fid/android/app/extensions/ActivityExtensionKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,291:1\n1#2:292\n*E\n"})
/* renamed from: com.carrefour.fid.android.app.extensions.a */
public final class C13825a {
    @C12579k

    /* renamed from: a */
    public static final String f33737a = "to_login";
    @C12579k

    /* renamed from: b */
    public static final String f33738b = "to_sign_up";

    /* renamed from: com.carrefour.fid.android.app.extensions.a$a */
    public static final class C13826a implements C0263a<ActivityResult> {

        /* renamed from: a */
        public final /* synthetic */ BottomNavActivity f33739a;

        public C13826a(BottomNavActivity bottomNavActivity) {
            this.f33739a = bottomNavActivity;
        }

        /* renamed from: b */
        public final void mo790a(ActivityResult activityResult) {
            Intent a = activityResult.mo854a();
            int i = 0;
            if (a != null) {
                i = a.getIntExtra(C28539g.f69243a, 0);
            }
            this.f33739a.mo121127d2(i, activityResult.mo855b(), activityResult.mo854a());
        }
    }

    /* renamed from: a */
    public static final void m58772a(@C12579k FragmentManager fragmentManager, @C12579k Fragment fragment, int i, boolean z, @C12580l String str, int i2, int i3, int i4, int i5) {
        Intrinsics.checkNotNullParameter(fragmentManager, "fragmentManager");
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        if (!fragment.isVisible()) {
            C19234h0 u = fragmentManager.mo56909u();
            u.mo57212N(i2, i3, i4, i5);
            u.mo57217g(i, fragment, str);
            if (z) {
                u.mo57225o(str);
            }
            u.mo57053r();
        }
    }

    /* renamed from: b */
    public static /* synthetic */ void m58773b(FragmentManager fragmentManager, Fragment fragment, int i, boolean z, String str, int i2, int i3, int i4, int i5, int i6, Object obj) {
        String str2;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11 = i6;
        if ((i11 & 16) != 0) {
            str2 = "TAG";
        } else {
            str2 = str;
        }
        if ((i11 & 32) != 0) {
            i7 = 0;
        } else {
            i7 = i2;
        }
        if ((i11 & 64) != 0) {
            i8 = 0;
        } else {
            i8 = i3;
        }
        if ((i11 & 128) != 0) {
            i9 = 0;
        } else {
            i9 = i4;
        }
        if ((i11 & 256) != 0) {
            i10 = 0;
        } else {
            i10 = i5;
        }
        m58772a(fragmentManager, fragment, i, z, str2, i7, i8, i9, i10);
    }

    /* renamed from: c */
    public static final void m58774c(@C12579k Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "<this>");
        activity.startActivity(new Intent("android.settings.APPLICATION_DETAILS_SETTINGS", Uri.fromParts(C22925d.f58520a, activity.getPackageName(), (String) null)));
    }

    /* renamed from: d */
    public static final void m58775d(@C12579k Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "<this>");
        Object systemService = activity.getSystemService("input_method");
        Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
        InputMethodManager inputMethodManager = (InputMethodManager) systemService;
        if (activity.getCurrentFocus() != null) {
            View currentFocus = activity.getCurrentFocus();
            Intrinsics.checkNotNull(currentFocus);
            inputMethodManager.hideSoftInputFromWindow(currentFocus.getWindowToken(), 0);
        }
    }

    /* renamed from: e */
    public static final void m58776e(@C12579k Activity activity, @C12579k Uri uri, @C12579k String str) {
        Intrinsics.checkNotNullParameter(activity, "<this>");
        Intrinsics.checkNotNullParameter(uri, "uri");
        Intrinsics.checkNotNullParameter(str, "action");
        Intent intent = new Intent(str);
        intent.setData(uri);
        activity.startActivity(intent);
    }

    @C12579k
    /* renamed from: f */
    public static final C0302g<Intent> m58777f(@C12579k BottomNavActivity bottomNavActivity) {
        Intrinsics.checkNotNullParameter(bottomNavActivity, "<this>");
        C0302g<Intent> registerForActivityResult = bottomNavActivity.registerForActivityResult(new C0268b.C0290m(), new C13826a(bottomNavActivity));
        Intrinsics.checkNotNullExpressionValue(registerForActivityResult, "BottomNavActivity.regist…tCode, result.data)\n    }");
        return registerForActivityResult;
    }

    /* renamed from: g */
    public static final synchronized void m58778g(@C12579k FragmentManager fragmentManager, @C12579k Fragment fragment, int i, boolean z, @C12580l String str, int i2, int i3, boolean z2, int i4, int i5) {
        boolean z3;
        synchronized (C13825a.class) {
            Intrinsics.checkNotNullParameter(fragmentManager, "fragmentManager");
            Intrinsics.checkNotNullParameter(fragment, "fragment");
            C19232h activity = fragment.getActivity();
            if (activity != null) {
                z3 = activity.isFinishing();
            } else {
                z3 = false;
            }
            if (!fragment.isVisible() && !z3) {
                C19234h0 u = fragmentManager.mo56909u();
                Intrinsics.checkNotNullExpressionValue(u, "fragmentManager.beginTransaction()");
                u.mo57212N(i2, i3, i4, i5);
                u.mo57202D(i, fragment, str);
                if (z && str != null) {
                    u.mo57225o(str);
                }
                if (z2) {
                    u.mo57053r();
                } else {
                    u.mo57052q();
                }
            }
        }
    }

    /* renamed from: h */
    public static /* synthetic */ void m58779h(FragmentManager fragmentManager, Fragment fragment, int i, boolean z, String str, int i2, int i3, boolean z2, int i4, int i5, int i6, Object obj) {
        int i7 = i6;
        m58778g(fragmentManager, fragment, i, (i7 & 8) != 0 ? false : z, (i7 & 16) != 0 ? null : str, (i7 & 32) != 0 ? 0 : i2, (i7 & 64) != 0 ? 0 : i3, (i7 & 128) != 0 ? true : z2, (i7 & 256) != 0 ? 0 : i4, (i7 & 512) != 0 ? 0 : i5);
    }

    /* renamed from: i */
    public static final void m58780i(@C12579k FragmentManager fragmentManager, @C12579k Fragment fragment, int i, @C12579k String str) {
        Intrinsics.checkNotNullParameter(fragmentManager, "fragmentManager");
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        Intrinsics.checkNotNullParameter(str, "tag");
        if (!fragment.isVisible()) {
            C19234h0 u = fragmentManager.mo56909u();
            Intrinsics.checkNotNullExpressionValue(u, "fragmentManager.beginTransaction()");
            u.mo57202D(i, fragment, str);
            u.mo57052q();
        }
    }

    /* renamed from: j */
    public static final void m58781j(@C12579k Activity activity, @C12579k String str) {
        Activity activity2 = activity;
        Intrinsics.checkNotNullParameter(activity, "<this>");
        Intrinsics.checkNotNullParameter(str, "message");
        C28951s sVar = C28951s.f70964a;
        Context applicationContext = activity.getApplicationContext();
        Intrinsics.checkNotNullExpressionValue(applicationContext, "applicationContext");
        if (!sVar.mo84281g(applicationContext)) {
            ActivityKt.m118716z(activity, NotificationComponent.Variant.ERROR, str, (String) null, (String) null, (C11289a) null, false, false, (Integer) null, (Integer) null, (Integer) null, (Integer) null, 2044, (Object) null);
        }
    }

    /* renamed from: k */
    public static /* synthetic */ void m58782k(Activity activity, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = activity.getString(R.string.general_error_no_network_message);
            Intrinsics.checkNotNullExpressionValue(str, "this.getString(R.string.…error_no_network_message)");
        }
        m58781j(activity, str);
    }

    /* renamed from: l */
    public static final void m58783l(@C12579k C0475e eVar) {
        Intrinsics.checkNotNullParameter(eVar, "<this>");
        new ServiceSelectionBackDropFragment().show(eVar.mo57175g0(), (String) null);
    }

    /* renamed from: m */
    public static final void m58784m(@C12579k Activity activity, @C12579k Class<?> cls, boolean z, int i, int i2, int i3, @C12580l Bundle bundle, int i4) {
        Intrinsics.checkNotNullParameter(activity, "<this>");
        Intrinsics.checkNotNullParameter(cls, "cls");
        Intent intent = new Intent(activity, cls);
        if (bundle != null) {
            intent.putExtras(bundle);
        }
        if (i4 != 0) {
            intent.addFlags(i4);
        }
        if (i != 0 && i2 != 0 && Build.VERSION.SDK_INT > 26) {
            ActivityOptions makeCustomAnimation = ActivityOptions.makeCustomAnimation(activity.getBaseContext(), i, i2);
            if (i3 == 0) {
                activity.startActivity(intent, makeCustomAnimation.toBundle());
            } else {
                activity.startActivityForResult(intent, i3, makeCustomAnimation.toBundle());
            }
        } else if (i3 == 0) {
            activity.startActivity(intent);
        } else {
            activity.startActivityForResult(intent, i3);
        }
        if (z && !Intrinsics.areEqual((Object) activity.getClass(), (Object) cls)) {
            activity.finish();
        }
    }

    /* renamed from: n */
    public static /* synthetic */ void m58785n(Activity activity, Class cls, boolean z, int i, int i2, int i3, Bundle bundle, int i4, int i5, Object obj) {
        m58784m(activity, cls, z, (i5 & 4) != 0 ? R.anim.slide_in_right : i, (i5 & 8) != 0 ? R.anim.no_change : i2, (i5 & 16) != 0 ? 0 : i3, (i5 & 32) != 0 ? null : bundle, (i5 & 64) != 0 ? 0 : i4);
    }

    /* renamed from: o */
    public static final void m58786o(@C12579k Activity activity, boolean z, int i, int i2) {
        Intrinsics.checkNotNullParameter(activity, "<this>");
        Bundle bundle = new Bundle();
        bundle.putInt(BottomNavActivity.f97025A1, R.id.departments_graph);
        C11079d2 d2Var = C11079d2.f28267a;
        m58785n(activity, BottomNavActivity.class, z, i, i2, 0, bundle, C8698y1.f23302n, 16, (Object) null);
    }

    /* renamed from: p */
    public static /* synthetic */ void m58787p(Activity activity, boolean z, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            z = true;
        }
        if ((i3 & 2) != 0) {
            i = R.anim.fade_in_short;
        }
        if ((i3 & 4) != 0) {
            i2 = R.anim.slide_out_down;
        }
        m58786o(activity, z, i, i2);
    }

    /* renamed from: q */
    public static final void m58788q(@C12579k Activity activity, @C12579k C0302g<Intent> gVar, @C12579k Class<?> cls, boolean z, int i, int i2, int i3, @C12580l Bundle bundle, int i4) {
        Intrinsics.checkNotNullParameter(activity, "<this>");
        Intrinsics.checkNotNullParameter(gVar, "launcher");
        Intrinsics.checkNotNullParameter(cls, "cls");
        Intent intent = new Intent(activity, cls);
        intent.putExtra(C28539g.f69243a, i3);
        if (bundle != null) {
            intent.putExtras(bundle);
        }
        if (i4 != 0) {
            intent.addFlags(i4);
        }
        if (i == 0 || i2 == 0 || Build.VERSION.SDK_INT <= 26) {
            gVar.mo960b(intent);
        } else {
            C17125i d = C17125i.m79331d(activity.getBaseContext(), i, i2);
            Intrinsics.checkNotNullExpressionValue(d, "makeCustomAnimation(this…ext, enterAnim, exitAnim)");
            gVar.mo821c(intent, d);
        }
        if (z && !Intrinsics.areEqual((Object) activity.getClass(), (Object) cls)) {
            activity.finish();
        }
    }

    /* renamed from: r */
    public static /* synthetic */ void m58789r(Activity activity, C0302g gVar, Class cls, boolean z, int i, int i2, int i3, Bundle bundle, int i4, int i5, Object obj) {
        int i6 = i5;
        m58788q(activity, gVar, cls, z, (i6 & 8) != 0 ? R.anim.slide_in_right : i, (i6 & 16) != 0 ? R.anim.no_change : i2, (i6 & 32) != 0 ? 0 : i3, (i6 & 64) != 0 ? null : bundle, (i6 & 128) != 0 ? 0 : i4);
    }

    /* renamed from: s */
    public static final void m58790s(@C12579k Activity activity, boolean z, @C12580l Bundle bundle) {
        Intrinsics.checkNotNullParameter(activity, "<this>");
        m58785n(activity, BottomNavActivity.class, z, R.anim.no_change, R.anim.no_change, 0, bundle, 0, 80, (Object) null);
    }

    /* renamed from: t */
    public static /* synthetic */ void m58791t(Activity activity, boolean z, Bundle bundle, int i, Object obj) {
        if ((i & 1) != 0) {
            z = true;
        }
        if ((i & 2) != 0) {
            bundle = null;
        }
        m58790s(activity, z, bundle);
    }

    /* renamed from: u */
    public static final void m58792u(@C12579k Activity activity, boolean z, int i, int i2) {
        Intrinsics.checkNotNullParameter(activity, "<this>");
        m58785n(activity, SplashOnBoardingActivity.class, z, i, i2, 0, (Bundle) null, C8698y1.f23302n, 48, (Object) null);
    }

    /* renamed from: v */
    public static /* synthetic */ void m58793v(Activity activity, boolean z, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            z = true;
        }
        if ((i3 & 2) != 0) {
            i = R.anim.fade_in_short;
        }
        if ((i3 & 4) != 0) {
            i2 = R.anim.slide_out_down;
        }
        m58792u(activity, z, i, i2);
    }

    @C11395k(message = "Replace with inter-module navigation")
    /* renamed from: w */
    public static final void m58794w(@C12579k C19232h hVar, boolean z, int i, int i2, int i3, @C12580l Bundle bundle) {
        BottomNavActivity bottomNavActivity;
        Intrinsics.checkNotNullParameter(hVar, "<this>");
        if (hVar instanceof BottomNavActivity) {
            bottomNavActivity = (BottomNavActivity) hVar;
        } else {
            bottomNavActivity = null;
        }
        if (bottomNavActivity != null) {
            m58788q(hVar, bottomNavActivity.mo121145x1(), AccountActivity.class, z, i, i2, i3, bundle, C8698y1.f23302n);
        }
    }

    /* renamed from: x */
    public static /* synthetic */ void m58795x(C19232h hVar, boolean z, int i, int i2, int i3, Bundle bundle, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            z = true;
        }
        int i5 = 0;
        int i6 = (i4 & 2) != 0 ? 0 : i;
        if ((i4 & 4) == 0) {
            i5 = i2;
        }
        if ((i4 & 8) != 0) {
            i3 = 123;
        }
        int i7 = i3;
        if ((i4 & 16) != 0) {
            bundle = null;
        }
        m58794w(hVar, z, i6, i5, i7, bundle);
    }
}
