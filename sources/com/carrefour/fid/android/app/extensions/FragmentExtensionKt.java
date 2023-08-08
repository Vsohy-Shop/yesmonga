package com.carrefour.fid.android.app.extensions;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import androidx.appcompat.widget.C0696c;
import androidx.fragment.app.C19215c;
import androidx.fragment.app.C19232h;
import androidx.fragment.app.C19234h0;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.navigation.C19758j0;
import com.carrefour.fid.android.R;
import com.carrefour.fid.android.core.constants.C36174e;
import com.carrefour.fid.android.design.components.widgets.C37185a;
import com.carrefour.fid.android.navigation.BottomNavActivity;
import com.carrefour.fid.android.presentation.components.toolbar.ToolBarDefaultView;
import com.carrefour.fid.android.presentation.models.CouponModel;
import com.carrefour.fid.android.presentation.models.OfferProductModel;
import com.carrefour.fid.android.presentation.models.ProductListSettingsModel;
import com.carrefour.fid.android.presentation.p035ui.coupons.overlay.CouponProductsOverlayBottomSheetFragment;
import com.carrefour.fid.android.presentation.p035ui.orders.online.additionalorders.AdditionalOrderBottomSheetFragment;
import com.carrefour.fid.android.presentation.p035ui.orders.online.additionalorders.ExitAdditionalOrderBottomSheetFragment;
import com.carrefour.fid.android.presentation.p035ui.orders.online.additionalorders.ExpiredAdditionalOrderBottomSheetFragment;
import com.carrefour.fid.android.presentation.p035ui.product.mixing.MixingProductsBottomSheetDialogFragment;
import com.carrefour.fid.android.service.presentation.p044ui.selection.ServiceSelectionBackDropFragment;
import com.carrefour.fid.android.shared.extension.FragmentKt;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.C11342l0;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11363r0({"SMAP\nFragmentExtension.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FragmentExtension.kt\ncom/carrefour/fid/android/app/extensions/FragmentExtensionKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,174:1\n1#2:175\n*E\n"})
public final class FragmentExtensionKt {
    /* renamed from: b */
    public static final void m58751b(@C12579k Fragment fragment, @C12580l String str) {
        Intrinsics.checkNotNullParameter(fragment, "<this>");
        AdditionalOrderBottomSheetFragment.f61709v.mo72662a(str).show(fragment.requireActivity().mo57175g0(), (String) null);
    }

    /* renamed from: c */
    public static final void m58752c(@C12579k Fragment fragment, @C12580l CouponModel couponModel) {
        Intrinsics.checkNotNullParameter(fragment, "<this>");
        CouponProductsOverlayBottomSheetFragment.f60077x.mo70025a(couponModel).show(fragment.requireActivity().mo57175g0(), (String) null);
    }

    /* renamed from: d */
    public static final void m58753d(@C12579k Fragment fragment) {
        Intrinsics.checkNotNullParameter(fragment, "<this>");
        new ExitAdditionalOrderBottomSheetFragment().show(fragment.requireActivity().mo57175g0(), (String) null);
    }

    /* renamed from: e */
    public static final void m58754e(@C12579k Fragment fragment) {
        Intrinsics.checkNotNullParameter(fragment, "<this>");
        ExpiredAdditionalOrderBottomSheetFragment expiredAdditionalOrderBottomSheetFragment = new ExpiredAdditionalOrderBottomSheetFragment();
        expiredAdditionalOrderBottomSheetFragment.setCancelable(false);
        expiredAdditionalOrderBottomSheetFragment.show(fragment.requireActivity().mo57175g0(), (String) null);
    }

    /* renamed from: f */
    public static final void m58755f(@C12579k Fragment fragment, @C12580l OfferProductModel offerProductModel, @C12579k MixingProductsBottomSheetDialogFragment.ParentScreen parentScreen, @C12580l ProductListSettingsModel productListSettingsModel) {
        Intrinsics.checkNotNullParameter(fragment, "<this>");
        Intrinsics.checkNotNullParameter(parentScreen, "from");
        MixingProductsBottomSheetDialogFragment.f62707w.mo74263a(parentScreen, offerProductModel, productListSettingsModel, (String) null, MixingProductsBottomSheetDialogFragment.TypeOfProducts.CLASSIC).show(fragment.requireActivity().mo57175g0(), (String) null);
    }

    /* renamed from: g */
    public static /* synthetic */ void m58756g(Fragment fragment, OfferProductModel offerProductModel, MixingProductsBottomSheetDialogFragment.ParentScreen parentScreen, ProductListSettingsModel productListSettingsModel, int i, Object obj) {
        if ((i & 4) != 0) {
            productListSettingsModel = null;
        }
        m58755f(fragment, offerProductModel, parentScreen, productListSettingsModel);
    }

    /* renamed from: h */
    public static final void m58757h(@C12579k Fragment fragment) {
        BottomNavActivity bottomNavActivity;
        Intrinsics.checkNotNullParameter(fragment, "<this>");
        C19232h activity = fragment.getActivity();
        if (activity instanceof BottomNavActivity) {
            bottomNavActivity = (BottomNavActivity) activity;
        } else {
            bottomNavActivity = null;
        }
        if (bottomNavActivity != null) {
            ToolBarDefaultView.setup$default(bottomNavActivity.mo121107M1(), (C11300l) null, FragmentExtensionKt$hideActivityToolbar$1$1.f33736f, 1, (Object) null);
        }
    }

    /* renamed from: i */
    public static final void m58758i(@C12579k C19232h hVar) {
        Intrinsics.checkNotNullParameter(hVar, C0696c.f2306r);
        if (hVar.getCurrentFocus() != null) {
            Object systemService = hVar.getSystemService("input_method");
            Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
            View currentFocus = hVar.getCurrentFocus();
            Intrinsics.checkNotNull(currentFocus);
            ((InputMethodManager) systemService).hideSoftInputFromWindow(currentFocus.getWindowToken(), 0);
        }
    }

    /* renamed from: j */
    public static final void m58759j(@C12579k Fragment fragment, @C12579k C11300l<? super Bundle, C11079d2> lVar) {
        Intrinsics.checkNotNullParameter(fragment, "<this>");
        Intrinsics.checkNotNullParameter(lVar, "onBackdropDismissed");
        fragment.requireActivity().mo57175g0().mo56861b(C37185a.ON_DISMISS_FRAGMENT_RESULT_KEY, fragment, new C13827b(lVar, fragment));
    }

    /* renamed from: k */
    public static final void m58760k(C11300l lVar, Fragment fragment, String str, Bundle bundle) {
        Intrinsics.checkNotNullParameter(lVar, "$onBackdropDismissed");
        Intrinsics.checkNotNullParameter(fragment, "$this_setOnBackdropDismissCallback");
        Intrinsics.checkNotNullParameter(str, "<anonymous parameter 0>");
        Intrinsics.checkNotNullParameter(bundle, "bundle");
        lVar.invoke(bundle);
        fragment.requireActivity().mo57175g0().mo56865c(C37185a.ON_DISMISS_FRAGMENT_RESULT_KEY);
    }

    /* renamed from: l */
    public static final void m58761l(@C12579k C19215c cVar, @C12579k FragmentManager fragmentManager, @C12580l String str) {
        Intrinsics.checkNotNullParameter(cVar, "<this>");
        Intrinsics.checkNotNullParameter(fragmentManager, "manager");
        C19234h0 u = fragmentManager.mo56909u();
        Intrinsics.checkNotNullExpressionValue(u, "manager.beginTransaction()");
        u.mo57221k(cVar, str);
        u.mo57053r();
    }

    /* renamed from: m */
    public static final void m58762m(@C12579k C19215c cVar, @C12579k FragmentManager fragmentManager) {
        Intrinsics.checkNotNullParameter(cVar, "<this>");
        Intrinsics.checkNotNullParameter(fragmentManager, "manager");
        String s = C11342l0.m43547d(cVar.getClass()).mo22848s();
        if (fragmentManager.mo56903s0(s) == null) {
            cVar.show(fragmentManager, s);
        }
    }

    /* renamed from: n */
    public static final void m58763n(@C12579k C19215c cVar, @C12579k FragmentManager fragmentManager) {
        Intrinsics.checkNotNullParameter(cVar, "<this>");
        Intrinsics.checkNotNullParameter(fragmentManager, "manager");
        String s = C11342l0.m43547d(cVar.getClass()).mo22848s();
        if (fragmentManager.mo56903s0(s) == null) {
            m58761l(cVar, fragmentManager, s);
        }
    }

    /* renamed from: o */
    public static final void m58764o(@C12579k Fragment fragment) {
        Intrinsics.checkNotNullParameter(fragment, "<this>");
        new ServiceSelectionBackDropFragment().show(fragment.requireActivity().mo57175g0(), (String) null);
    }

    /* renamed from: p */
    public static final void m58765p(@C12579k Fragment fragment, @C12580l C11289a<C11079d2> aVar) {
        Intrinsics.checkNotNullParameter(fragment, "<this>");
        String str = new String();
        String string = fragment.getString(R.string.customer_dialog_text);
        Intrinsics.checkNotNullExpressionValue(string, "getString(R.string.customer_dialog_text)");
        FragmentKt.m118838z(fragment, str, string, fragment.getString(R.string.general_cancel), (C11289a) null, fragment.getString(R.string.general_see), false, new FragmentExtensionKt$startCustomerServiceRedirection$1(aVar, fragment), (String) null, (C11289a) null, (C11289a) null, (Drawable) null, 0, 4008, (Object) null);
    }

    /* renamed from: q */
    public static /* synthetic */ void m58766q(Fragment fragment, C11289a aVar, int i, Object obj) {
        if ((i & 1) != 0) {
            aVar = null;
        }
        m58765p(fragment, aVar);
    }

    /* renamed from: r */
    public static final void m58767r(@C12579k Fragment fragment, @C12579k String str) {
        Intrinsics.checkNotNullParameter(fragment, "<this>");
        Intrinsics.checkNotNullParameter(str, C19758j0.f50575e);
        try {
            Intent intent = new Intent(fragment.requireContext(), BottomNavActivity.class);
            intent.setData(Uri.parse(str));
            intent.addFlags(65536);
            fragment.requireActivity().startActivity(intent);
        } catch (ActivityNotFoundException e) {
            e.printStackTrace();
        }
    }

    /* renamed from: s */
    public static final void m58768s(@C12579k Fragment fragment, @C12579k String str, @C12579k C11300l<? super Throwable, C11079d2> lVar) {
        Intrinsics.checkNotNullParameter(fragment, "<this>");
        Intrinsics.checkNotNullParameter(str, "uri");
        Intrinsics.checkNotNullParameter(lVar, "error");
        try {
            Intent intent = new Intent("android.intent.action.VIEW");
            intent.setDataAndType(Uri.parse(str), C36174e.f89293e);
            fragment.requireActivity().startActivity(intent);
        } catch (ActivityNotFoundException e) {
            lVar.invoke(e);
        }
    }

    /* renamed from: t */
    public static final void m58769t(@C12579k Fragment fragment, boolean z, int i, int i2, int i3, @C12580l Bundle bundle) {
        Intrinsics.checkNotNullParameter(fragment, "<this>");
        C19232h requireActivity = fragment.requireActivity();
        Intrinsics.checkNotNullExpressionValue(requireActivity, "requireActivity()");
        C13825a.m58794w(requireActivity, z, i, i2, i3, bundle);
    }

    /* renamed from: u */
    public static /* synthetic */ void m58770u(Fragment fragment, boolean z, int i, int i2, int i3, Bundle bundle, int i4, Object obj) {
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
        m58769t(fragment, z, i6, i5, i7, bundle);
    }
}
