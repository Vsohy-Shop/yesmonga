package com.carrefour.fid.android.presentation.p035ui.orders.online.additionalorders.checkout;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.style.AbsoluteSizeSpan;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.compose.runtime.internal.C8553b;
import androidx.compose.runtime.internal.C8567o;
import androidx.constraintlayout.widget.Group;
import androidx.fragment.app.C19232h;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.C19499w;
import androidx.lifecycle.C19501x;
import androidx.navigation.C19766m;
import androidx.navigation.fragment.C19736g;
import com.carrefour.fid.android.R;
import com.carrefour.fid.android.app.extensions.FragmentExtensionKt;
import com.carrefour.fid.android.core.type.PaymentErrorType;
import com.carrefour.fid.android.databinding.C36729j0;
import com.carrefour.fid.android.presentation.viewmodels.order.online.additionalorders.checkout.CheckoutPaymentErrorViewModel;
import com.carrefour.fid.android.shared.constant.C28561l1;
import com.carrefour.fid.android.shared.extension.FragmentKt;
import com.google.android.gms.analytics.ecommerce.C40383c;
import dagger.hilt.android.C10164b;
import kotlin.C10864b0;
import kotlin.C11076d0;
import kotlin.C11677z;
import kotlin.LazyThreadSafetyMode;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.internal.C11342l0;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import kotlinx.coroutines.C11723c2;
import kotlinx.coroutines.C12038j;
import kotlinx.coroutines.CoroutineStart;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C10164b
@C11076d0(mo22515d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\r\b\u0007\u0018\u0000 02\b\u0012\u0004\u0012\u00020\u00020\u0001:\u00011B\u0007¢\u0006\u0004\b.\u0010/J\u001a\u0010\b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00032\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0016J\u0010\u0010\u000b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0002J\u0010\u0010\u000e\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\fH\u0002J\b\u0010\u000f\u001a\u00020\u0007H\u0002J\b\u0010\u0010\u001a\u00020\u0007H\u0002J\b\u0010\u0011\u001a\u00020\u0007H\u0002J\u0010\u0010\u0014\u001a\u00020\u00072\u0006\u0010\u0013\u001a\u00020\u0012H\u0002J\b\u0010\u0015\u001a\u00020\u0007H\u0002J\u0010\u0010\u0018\u001a\u00020\u00072\u0006\u0010\u0017\u001a\u00020\u0016H\u0002R\u001b\u0010\u001e\u001a\u00020\u00198BX\u0002¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u001b\u0010$\u001a\u00020\u001f8BX\u0002¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R\u001b\u0010)\u001a\u00020%8BX\u0002¢\u0006\f\n\u0004\b&\u0010\u001b\u001a\u0004\b'\u0010(R\u001d\u0010-\u001a\u0004\u0018\u00010\u00168BX\u0002¢\u0006\f\n\u0004\b*\u0010\u001b\u001a\u0004\b+\u0010,¨\u00062"}, mo22516d2 = {"Lcom/carrefour/fid/android/presentation/ui/orders/online/additionalorders/checkout/CheckoutPaymentErrorFragment;", "Lcom/carrefour/fid/android/shared/base/o;", "Lcom/carrefour/fid/android/databinding/j0;", "Landroid/view/View;", "view", "Landroid/os/Bundle;", "savedInstanceState", "Lkotlin/d2;", "onViewCreated", "Lcom/carrefour/fid/android/presentation/viewmodels/order/online/additionalorders/checkout/CheckoutPaymentErrorViewModel$a;", "uiEvent", "e1", "Lcom/carrefour/fid/android/presentation/viewmodels/order/online/additionalorders/checkout/CheckoutPaymentErrorViewModel$b;", "uiState", "i1", "d1", "initUi", "initHeader", "", "isDeliveryStore", "c1", "b1", "", "url", "j1", "Lcom/carrefour/fid/android/presentation/viewmodels/order/online/additionalorders/checkout/CheckoutPaymentErrorViewModel;", "f", "Lkotlin/z;", "a1", "()Lcom/carrefour/fid/android/presentation/viewmodels/order/online/additionalorders/checkout/CheckoutPaymentErrorViewModel;", "viewModel", "Lcom/carrefour/fid/android/presentation/ui/orders/online/additionalorders/checkout/l;", "g", "Landroidx/navigation/m;", "X0", "()Lcom/carrefour/fid/android/presentation/ui/orders/online/additionalorders/checkout/l;", "args", "Lcom/carrefour/fid/android/core/type/PaymentErrorType;", "v", "Y0", "()Lcom/carrefour/fid/android/core/type/PaymentErrorType;", "errorType", "w", "Z0", "()Ljava/lang/String;", "paymentMethod", "<init>", "()V", "x", "a", "app_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
@C8567o(parameters = 0)
@C11363r0({"SMAP\nCheckoutPaymentErrorFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CheckoutPaymentErrorFragment.kt\ncom/carrefour/fid/android/presentation/ui/orders/online/additionalorders/checkout/CheckoutPaymentErrorFragment\n+ 2 FragmentViewModelLazy.kt\nandroidx/fragment/app/FragmentViewModelLazyKt\n+ 3 FragmentNavArgsLazy.kt\nandroidx/navigation/fragment/FragmentNavArgsLazyKt\n+ 4 Fragment.kt\ncom/carrefour/fid/android/shared/extension/FragmentKt\n*L\n1#1,172:1\n106#2,15:173\n42#3,3:188\n168#4,7:191\n183#4,6:198\n*S KotlinDebug\n*F\n+ 1 CheckoutPaymentErrorFragment.kt\ncom/carrefour/fid/android/presentation/ui/orders/online/additionalorders/checkout/CheckoutPaymentErrorFragment\n*L\n44#1:173,15\n46#1:188,3\n63#1:191,7\n64#1:198,6\n*E\n"})
/* renamed from: com.carrefour.fid.android.presentation.ui.orders.online.additionalorders.checkout.CheckoutPaymentErrorFragment */
public final class CheckoutPaymentErrorFragment extends C25144n0<C36729j0> {
    @C12579k

    /* renamed from: x */
    public static final C25011a f61820x = new C25011a((DefaultConstructorMarker) null);

    /* renamed from: y */
    public static final int f61821y = 8;
    @C12579k

    /* renamed from: z */
    public static final String f61822z = "CheckoutPaymentErrorFragment";
    @C12579k

    /* renamed from: f */
    public final C11677z f61823f;
    @C12579k

    /* renamed from: g */
    public final C19766m f61824g = new C19766m(C11342l0.m43547d(C25137l.class), new CheckoutPaymentErrorFragment$special$$inlined$navArgs$1(this));
    @C12579k

    /* renamed from: v */
    public final C11677z f61825v = C10864b0.m38748c(new CheckoutPaymentErrorFragment$errorType$2(this));
    @C12579k

    /* renamed from: w */
    public final C11677z f61826w = C10864b0.m38748c(new CheckoutPaymentErrorFragment$paymentMethod$2(this));

    /* renamed from: com.carrefour.fid.android.presentation.ui.orders.online.additionalorders.checkout.CheckoutPaymentErrorFragment$a */
    public static final class C25011a {
        public /* synthetic */ C25011a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public C25011a() {
        }
    }

    public CheckoutPaymentErrorFragment() {
        super(C250101.f61827a);
        C11677z b = C10864b0.m38747b(LazyThreadSafetyMode.NONE, new C25023xcf592e20(new C25022xcf592e1f(this)));
        this.f61823f = FragmentViewModelLazyKt.m89923h(this, C11342l0.m43547d(CheckoutPaymentErrorViewModel.class), new C25024xcf592e21(b), new C25025xcf592e22((C11289a) null, b), new C25026xcf592e23(this, b));
    }

    /* renamed from: f1 */
    public static final void m108527f1(CheckoutPaymentErrorFragment checkoutPaymentErrorFragment, View view) {
        Intrinsics.checkNotNullParameter(checkoutPaymentErrorFragment, "this$0");
        view.setEnabled(false);
        C19232h activity = checkoutPaymentErrorFragment.getActivity();
        if (activity != null) {
            activity.onBackPressed();
        }
    }

    /* renamed from: g1 */
    public static final void m108528g1(CheckoutPaymentErrorFragment checkoutPaymentErrorFragment, View view) {
        Intrinsics.checkNotNullParameter(checkoutPaymentErrorFragment, "this$0");
        checkoutPaymentErrorFragment.mo72835a1().sendIntent(CheckoutPaymentErrorViewModel.C26761c.C26762a.f65301a);
    }

    /* renamed from: h1 */
    public static final void m108529h1(CheckoutPaymentErrorFragment checkoutPaymentErrorFragment, View view) {
        Intrinsics.checkNotNullParameter(checkoutPaymentErrorFragment, "this$0");
        checkoutPaymentErrorFragment.mo72836b1();
    }

    /* renamed from: X0 */
    public final C25137l mo72832X0() {
        return (C25137l) this.f61824g.getValue();
    }

    /* renamed from: Y0 */
    public final PaymentErrorType mo72833Y0() {
        return (PaymentErrorType) this.f61825v.getValue();
    }

    /* renamed from: Z0 */
    public final String mo72834Z0() {
        return (String) this.f61826w.getValue();
    }

    /* renamed from: a1 */
    public final CheckoutPaymentErrorViewModel mo72835a1() {
        return (CheckoutPaymentErrorViewModel) this.f61823f.getValue();
    }

    /* renamed from: b1 */
    public final void mo72836b1() {
        Intent intent = new Intent("android.intent.action.DIAL");
        String string = getString(R.string.checkout_payment_contact_bank_phone_number);
        Intrinsics.checkNotNullExpressionValue(string, "getString(R.string.check…ontact_bank_phone_number)");
        intent.setData(Uri.parse("tel:" + string));
        startActivity(intent);
    }

    /* renamed from: c1 */
    public final void mo72837c1(boolean z) {
        String string = getString(z ? R.string.checkout_payment_customer_service_delivery_url : R.string.checkout_payment_customer_service_drive_url);
        Intrinsics.checkNotNullExpressionValue(string, "getString(url)");
        mo72843j1(string);
    }

    /* renamed from: d1 */
    public final void mo72838d1() {
        if (!C19736g.m91827a(this).mo58156s0()) {
            C19736g.m91827a(this).mo58152q0();
        }
    }

    /* renamed from: e1 */
    public final void mo72839e1(CheckoutPaymentErrorViewModel.C26758a aVar) {
        if (aVar instanceof CheckoutPaymentErrorViewModel.C26758a.C26759a) {
            mo72837c1(((CheckoutPaymentErrorViewModel.C26758a.C26759a) aVar).mo77776d());
        }
    }

    /* renamed from: i1 */
    public final void mo72840i1(CheckoutPaymentErrorViewModel.C26760b bVar) {
        TextView textView = ((C36729j0) getBinding()).f91052l;
        SpannableString spannableString = new SpannableString(getString(mo72833Y0().mo108573w(), bVar.mo77785i()));
        spannableString.setSpan(new AbsoluteSizeSpan((int) getResources().getDimension(R.dimen.ds_font_size_s)), StringsKt__StringsKt.indexOf$default((CharSequence) spannableString, "\n", 0, false, 6, (Object) null), spannableString.length(), 33);
        textView.setText(spannableString);
    }

    public final void initHeader() {
        FragmentExtensionKt.m58757h(this);
        ((C36729j0) getBinding()).f91042b.setContent(C8553b.m31049c(638007847, true, new CheckoutPaymentErrorFragment$initHeader$1(this)));
    }

    public final void initUi() {
        int i;
        initHeader();
        ((C36729j0) getBinding()).f91051k.setText(getString(mo72833Y0().mo108572r()));
        ImageView imageView = ((C36729j0) getBinding()).f91046f;
        PaymentErrorType Y0 = mo72833Y0();
        PaymentErrorType paymentErrorType = PaymentErrorType.TECHNICAL_ERROR;
        if (Y0 == paymentErrorType) {
            i = mo72833Y0().mo108571q();
        } else if (Intrinsics.areEqual((Object) mo72834Z0(), (Object) C28561l1.f69517j)) {
            i = R.drawable.checkout_payment_pass_card;
        } else {
            i = mo72833Y0().mo108571q();
        }
        imageView.setImageResource(i);
        ((C36729j0) getBinding()).f91044d.setOnClickListener(new C25127i(this));
        TextView textView = ((C36729j0) getBinding()).f91050j;
        int i2 = 0;
        if (mo72833Y0() == paymentErrorType) {
            textView.setVisibility(0);
            textView.setOnClickListener(new C25133j(this));
        } else {
            textView.setVisibility(8);
        }
        Group group = ((C36729j0) getBinding()).f91045e;
        if (mo72833Y0() == paymentErrorType || !Intrinsics.areEqual((Object) mo72834Z0(), (Object) C28561l1.f69517j)) {
            i2 = 8;
        }
        group.setVisibility(i2);
        ((C36729j0) getBinding()).f91048h.setOnClickListener(new C25135k(this));
    }

    /* renamed from: j1 */
    public final void mo72843j1(String str) {
        String str2 = new String();
        String string = getString(R.string.customer_dialog_text);
        Intrinsics.checkNotNullExpressionValue(string, "getString(R.string.customer_dialog_text)");
        FragmentKt.m118838z(this, str2, string, getString(R.string.general_cancel), (C11289a) null, getString(R.string.general_see), false, new CheckoutPaymentErrorFragment$showWebViewDialog$1(this, str), (String) null, (C11289a) null, (C11289a) null, (Drawable) null, 0, 4008, (Object) null);
    }

    public void onViewCreated(@C12579k View view, @C12580l Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, C40383c.f102945c);
        super.onViewCreated(view, bundle);
        FragmentKt.m118815c(this, new CheckoutPaymentErrorFragment$onViewCreated$1(this));
        initUi();
        CheckoutPaymentErrorViewModel a1 = mo72835a1();
        C19499w viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "viewLifecycleOwner");
        C11723c2 unused = C12038j.m48061f(C19501x.m90847a(viewLifecycleOwner), (CoroutineContext) null, (CoroutineStart) null, new C25017xfaca0e0(this, a1, (C11045c) null, this), 3, (Object) null);
        CheckoutPaymentErrorViewModel a12 = mo72835a1();
        C19499w viewLifecycleOwner2 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner2, "viewLifecycleOwner");
        C11723c2 unused2 = C12038j.m48061f(C19501x.m90847a(viewLifecycleOwner2), (CoroutineContext) null, (CoroutineStart) null, new C25012x2eb4f0a9(this, a12, (C11045c) null, this), 3, (Object) null);
    }
}
