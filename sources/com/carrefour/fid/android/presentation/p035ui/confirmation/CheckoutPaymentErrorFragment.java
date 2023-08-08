package com.carrefour.fid.android.presentation.p035ui.confirmation;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.style.AbsoluteSizeSpan;
import android.view.View;
import androidx.compose.runtime.internal.C8567o;
import androidx.fragment.app.C19232h;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.C19501x;
import androidx.navigation.C19766m;
import androidx.navigation.fragment.C19736g;
import com.carrefour.fid.android.R;
import com.carrefour.fid.android.app.extensions.FragmentExtensionKt;
import com.carrefour.fid.android.core.type.BasketService;
import com.carrefour.fid.android.core.type.BasketType;
import com.carrefour.fid.android.databinding.C36710h1;
import com.carrefour.fid.android.databinding.C36757l8;
import com.carrefour.fid.android.domain.models.BasketDomain;
import com.carrefour.fid.android.domain.models.BasketServiceType;
import com.carrefour.fid.android.presentation.analytics.C38362d;
import com.carrefour.fid.android.presentation.viewmodels.confirmation.C26196a;
import com.carrefour.fid.android.presentation.viewmodels.confirmation.CheckoutConfirmationViewModel;
import com.carrefour.fid.android.shared.extension.FragmentKt;
import com.google.android.gms.analytics.ecommerce.C40383c;
import dagger.hilt.android.C10164b;
import javax.inject.Inject;
import kotlin.C10864b0;
import kotlin.C11076d0;
import kotlin.C11677z;
import kotlin.LazyThreadSafetyMode;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.internal.C11342l0;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import kotlinx.coroutines.C11723c2;
import kotlinx.coroutines.C12038j;
import kotlinx.coroutines.CoroutineStart;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C10164b
@C11076d0(mo22515d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b+\u0010,J\u001a\u0010\b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00032\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0016J\b\u0010\t\u001a\u00020\u0007H\u0002J\b\u0010\u000b\u001a\u00020\nH\u0002J\b\u0010\f\u001a\u00020\u0007H\u0002J\u0010\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\rH\u0002J\u0013\u0010\u0011\u001a\u00020\u0007H@ø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\u0012J\b\u0010\u0013\u001a\u00020\u0007H\u0002J\b\u0010\u0014\u001a\u00020\u0007H\u0002J\u0010\u0010\u0016\u001a\u00020\u00072\u0006\u0010\u0015\u001a\u00020\rH\u0002R\"\u0010\u001e\u001a\u00020\u00178\u0006@\u0006X.¢\u0006\u0012\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\u001b\u0010$\u001a\u00020\u001f8BX\u0002¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R\u001b\u0010*\u001a\u00020%8BX\u0002¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)\u0002\u0004\n\u0002\b\u0019¨\u0006-"}, mo22516d2 = {"Lcom/carrefour/fid/android/presentation/ui/confirmation/CheckoutPaymentErrorFragment;", "Lcom/carrefour/fid/android/shared/base/o;", "Lcom/carrefour/fid/android/databinding/h1;", "Landroid/view/View;", "view", "Landroid/os/Bundle;", "savedInstanceState", "Lkotlin/d2;", "onViewCreated", "e1", "Lkotlinx/coroutines/c2;", "f1", "i1", "", "title", "Landroid/text/SpannableString;", "Y0", "d1", "(Lkotlin/coroutines/c;)Ljava/lang/Object;", "c1", "g1", "url", "k1", "Lcom/carrefour/fid/android/presentation/viewmodels/confirmation/a;", "f", "Lcom/carrefour/fid/android/presentation/viewmodels/confirmation/a;", "a1", "()Lcom/carrefour/fid/android/presentation/viewmodels/confirmation/a;", "h1", "(Lcom/carrefour/fid/android/presentation/viewmodels/confirmation/a;)V", "checkoutConfirmationAnalyticsViewModel", "Lcom/carrefour/fid/android/presentation/viewmodels/confirmation/CheckoutConfirmationViewModel;", "g", "Lkotlin/z;", "b1", "()Lcom/carrefour/fid/android/presentation/viewmodels/confirmation/CheckoutConfirmationViewModel;", "checkoutConfirmationViewModel", "Lcom/carrefour/fid/android/presentation/ui/confirmation/p;", "v", "Landroidx/navigation/m;", "Z0", "()Lcom/carrefour/fid/android/presentation/ui/confirmation/p;", "args", "<init>", "()V", "app_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
@C8567o(parameters = 0)
@C11363r0({"SMAP\nCheckoutPaymentErrorFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CheckoutPaymentErrorFragment.kt\ncom/carrefour/fid/android/presentation/ui/confirmation/CheckoutPaymentErrorFragment\n+ 2 FragmentViewModelLazy.kt\nandroidx/fragment/app/FragmentViewModelLazyKt\n+ 3 FragmentNavArgsLazy.kt\nandroidx/navigation/fragment/FragmentNavArgsLazyKt\n*L\n1#1,175:1\n106#2,15:176\n42#3,3:191\n*S KotlinDebug\n*F\n+ 1 CheckoutPaymentErrorFragment.kt\ncom/carrefour/fid/android/presentation/ui/confirmation/CheckoutPaymentErrorFragment\n*L\n38#1:176,15\n40#1:191,3\n*E\n"})
/* renamed from: com.carrefour.fid.android.presentation.ui.confirmation.CheckoutPaymentErrorFragment */
public final class CheckoutPaymentErrorFragment extends C23770t<C36710h1> {

    /* renamed from: w */
    public static final int f59807w = 8;
    @Inject

    /* renamed from: f */
    public C26196a f59808f;
    @C12579k

    /* renamed from: g */
    public final C11677z f59809g;
    @C12579k

    /* renamed from: v */
    public final C19766m f59810v = new C19766m(C11342l0.m43547d(C23765p.class), new CheckoutPaymentErrorFragment$special$$inlined$navArgs$1(this));

    public CheckoutPaymentErrorFragment() {
        super(C237401.f59811a);
        C11677z b = C10864b0.m38747b(LazyThreadSafetyMode.NONE, new C23742xcf592e20(new C23741xcf592e1f(this)));
        this.f59809g = FragmentViewModelLazyKt.m89923h(this, C11342l0.m43547d(CheckoutConfirmationViewModel.class), new C23743xcf592e21(b), new C23744xcf592e22((C11289a) null, b), new C23745xcf592e23(this, b));
    }

    /* renamed from: T0 */
    public static final /* synthetic */ C36710h1 m105321T0(CheckoutPaymentErrorFragment checkoutPaymentErrorFragment) {
        return (C36710h1) checkoutPaymentErrorFragment.getBinding();
    }

    /* renamed from: j1 */
    public static final void m105326j1(CheckoutPaymentErrorFragment checkoutPaymentErrorFragment, View view) {
        Intrinsics.checkNotNullParameter(checkoutPaymentErrorFragment, "this$0");
        view.setEnabled(false);
        C19232h activity = checkoutPaymentErrorFragment.getActivity();
        if (activity != null) {
            activity.onBackPressed();
        }
    }

    /* renamed from: Y0 */
    public final SpannableString mo69572Y0(String str) {
        SpannableString spannableString = new SpannableString(str);
        spannableString.setSpan(new AbsoluteSizeSpan((int) getResources().getDimension(R.dimen.ds_font_size_s)), StringsKt__StringsKt.indexOf$default((CharSequence) spannableString, "\n", 0, false, 6, (Object) null), spannableString.length(), 33);
        return spannableString;
    }

    /* renamed from: Z0 */
    public final C23765p mo69573Z0() {
        return (C23765p) this.f59810v.getValue();
    }

    @C12579k
    /* renamed from: a1 */
    public final C26196a mo69574a1() {
        C26196a aVar = this.f59808f;
        if (aVar != null) {
            return aVar;
        }
        Intrinsics.throwUninitializedPropertyAccessException("checkoutConfirmationAnalyticsViewModel");
        return null;
    }

    /* renamed from: b1 */
    public final CheckoutConfirmationViewModel mo69575b1() {
        return (CheckoutConfirmationViewModel) this.f59809g.getValue();
    }

    /* renamed from: c1 */
    public final void mo69576c1() {
        Intent intent = new Intent("android.intent.action.DIAL");
        String string = getString(R.string.checkout_payment_contact_bank_phone_number);
        Intrinsics.checkNotNullExpressionValue(string, "getString(R.string.check…ontact_bank_phone_number)");
        intent.setData(Uri.parse("tel:" + string));
        startActivity(intent);
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0035  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0050  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0054  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* renamed from: d1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo69577d1(kotlin.coroutines.C11045c<? super kotlin.C11079d2> r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof com.carrefour.fid.android.presentation.p035ui.confirmation.CheckoutPaymentErrorFragment$handleCustomerService$1
            if (r0 == 0) goto L_0x0013
            r0 = r5
            com.carrefour.fid.android.presentation.ui.confirmation.CheckoutPaymentErrorFragment$handleCustomerService$1 r0 = (com.carrefour.fid.android.presentation.p035ui.confirmation.CheckoutPaymentErrorFragment$handleCustomerService$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.carrefour.fid.android.presentation.ui.confirmation.CheckoutPaymentErrorFragment$handleCustomerService$1 r0 = new com.carrefour.fid.android.presentation.ui.confirmation.CheckoutPaymentErrorFragment$handleCustomerService$1
            r0.<init>(r4, r5)
        L_0x0018:
            java.lang.Object r5 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L_0x0035
            if (r2 != r3) goto L_0x002d
            java.lang.Object r0 = r0.L$0
            com.carrefour.fid.android.presentation.ui.confirmation.CheckoutPaymentErrorFragment r0 = (com.carrefour.fid.android.presentation.p035ui.confirmation.CheckoutPaymentErrorFragment) r0
            kotlin.C11661u0.m45747n(r5)
            goto L_0x0048
        L_0x002d:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L_0x0035:
            kotlin.C11661u0.m45747n(r5)
            com.carrefour.fid.android.presentation.viewmodels.confirmation.CheckoutConfirmationViewModel r5 = r4.mo69575b1()
            r0.L$0 = r4
            r0.label = r3
            java.lang.Object r5 = r5.mo76184F0(r0)
            if (r5 != r1) goto L_0x0047
            return r1
        L_0x0047:
            r0 = r4
        L_0x0048:
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            boolean r5 = r5.booleanValue()
            if (r5 == 0) goto L_0x0054
            r5 = 2131952201(0x7f130249, float:1.9540838E38)
            goto L_0x0057
        L_0x0054:
            r5 = 2131952202(0x7f13024a, float:1.954084E38)
        L_0x0057:
            java.lang.String r5 = r0.getString(r5)
            java.lang.String r1 = "getString(url)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r5, r1)
            r0.mo69583k1(r5)
            kotlin.d2 r5 = kotlin.C11079d2.f28267a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.presentation.p035ui.confirmation.CheckoutPaymentErrorFragment.mo69577d1(kotlin.coroutines.c):java.lang.Object");
    }

    /* renamed from: e1 */
    public final void mo69578e1() {
        if (!C19736g.m91827a(this).mo58156s0()) {
            C19736g.m91827a(this).mo58152q0();
        }
    }

    /* renamed from: f1 */
    public final C11723c2 mo69579f1() {
        return C12038j.m48061f(C19501x.m90847a(this), (CoroutineContext) null, (CoroutineStart) null, new CheckoutPaymentErrorFragment$initUi$1(this, (C11045c<? super CheckoutPaymentErrorFragment$initUi$1>) null), 3, (Object) null);
    }

    /* renamed from: g1 */
    public final void mo69580g1() {
        BasketType basketType;
        boolean z;
        BasketServiceType I;
        BasketDomain f = mo69575b1().mo76193w0().mo4610f();
        C38362d dVar = C38362d.f97145a;
        BasketService basketService = null;
        if (f != null) {
            basketType = f.mo115499w();
        } else {
            basketType = null;
        }
        if (!(f == null || (I = f.mo115466I()) == null)) {
            basketService = I.mo115633d();
        }
        if (f != null) {
            z = f.mo115470M();
        } else {
            z = false;
        }
        mo69574a1().mo76202b(dVar.mo121199b(basketType, basketService, z));
    }

    /* renamed from: h1 */
    public final void mo69581h1(@C12579k C26196a aVar) {
        Intrinsics.checkNotNullParameter(aVar, "<set-?>");
        this.f59808f = aVar;
    }

    /* renamed from: i1 */
    public final void mo69582i1() {
        FragmentExtensionKt.m58757h(this);
        C36757l8 l8Var = ((C36710h1) getBinding()).f90938k;
        l8Var.f91230c.setText(R.string.checkout_payment_error_title);
        l8Var.f91229b.setOnClickListener(new C23761l(this));
    }

    /* renamed from: k1 */
    public final void mo69583k1(String str) {
        String str2 = new String();
        String string = getString(R.string.customer_dialog_text);
        Intrinsics.checkNotNullExpressionValue(string, "getString(R.string.customer_dialog_text)");
        FragmentKt.m118838z(this, str2, string, getString(R.string.general_cancel), (C11289a) null, getString(R.string.general_see), false, new CheckoutPaymentErrorFragment$showWebViewDialog$1(this, str), (String) null, (C11289a) null, (C11289a) null, (Drawable) null, 0, 4008, (Object) null);
    }

    public void onViewCreated(@C12579k View view, @C12580l Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, C40383c.f102945c);
        super.onViewCreated(view, bundle);
        FragmentKt.m118815c(this, new CheckoutPaymentErrorFragment$onViewCreated$1(this));
        mo69579f1();
        mo69582i1();
        mo69580g1();
    }
}
