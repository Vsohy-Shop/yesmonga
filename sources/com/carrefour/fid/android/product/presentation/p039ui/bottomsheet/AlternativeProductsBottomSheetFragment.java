package com.carrefour.fid.android.product.presentation.p039ui.bottomsheet;

import android.content.Context;
import android.content.DialogInterface;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import androidx.compose.p004ui.platform.ComposeView;
import androidx.compose.p004ui.platform.ViewCompositionStrategy;
import androidx.compose.runtime.internal.C8553b;
import androidx.compose.runtime.internal.C8567o;
import androidx.fragment.app.C19232h;
import androidx.fragment.app.C19259o;
import androidx.navigation.compose.C19714d;
import com.carrefour.fid.android.design.components.widgets.NotificationComponent;
import com.carrefour.fid.android.domain.exceptions.BasketClosedStoreThrowable;
import com.carrefour.fid.android.domain.exceptions.BasketExpiredFacilityStoreIdThrowable;
import com.carrefour.fid.android.domain.exceptions.BasketItemQuantityExceededThrowable;
import com.carrefour.fid.android.domain.exceptions.BasketThrowable;
import com.carrefour.fid.android.domain.exceptions.CategoryLimitationExceededThrowable;
import com.carrefour.fid.android.domain.exceptions.RequireServiceSelectionThrowable;
import com.carrefour.fid.android.domain.exceptions.ShoppingListThrowable;
import com.carrefour.fid.android.domain.models.offer.CategoryLimit;
import com.carrefour.fid.android.domain.models.product.Gtin;
import com.carrefour.fid.android.product.C27609f;
import com.carrefour.fid.android.product.databinding.C27476a;
import com.carrefour.fid.android.product.presentation.analytics.C27631a;
import com.carrefour.fid.android.product.presentation.models.extensions.C27657a;
import com.carrefour.fid.android.shared.extension.ActivityKt;
import com.carrefour.fid.android.shared.extension.FragmentKt;
import com.carrefour.fid.android.shared.navigation.C28796c;
import com.carrefour.fid.android.shared.p046io.NetworkException;
import com.carrefour.fid.android.shared.p046io.RequireSignInThrowable;
import com.carrefour.fid.android.shared.util.C28935i;
import com.google.android.gms.analytics.ecommerce.C40383c;
import dagger.hilt.android.C10164b;
import javax.inject.Inject;
import kotlin.C11076d0;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C10164b
@C11076d0(mo22515d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\f\b\u0007\u0018\u0000 !2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\"B\u0007¢\u0006\u0004\b\u001f\u0010 J\u001a\u0010\b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00032\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0016J\u0010\u0010\u000b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0016J\u0010\u0010\u000e\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\fH\u0002R\"\u0010\u0016\u001a\u00020\u000f8\u0000@\u0000X.¢\u0006\u0012\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\"\u0010\u001e\u001a\u00020\u00178\u0000@\u0000X.¢\u0006\u0012\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001d¨\u0006#"}, mo22516d2 = {"Lcom/carrefour/fid/android/product/presentation/ui/bottomsheet/AlternativeProductsBottomSheetFragment;", "Lcom/carrefour/fid/android/design/components/widgets/a;", "Lcom/carrefour/fid/android/product/databinding/a;", "Landroid/view/View;", "view", "Landroid/os/Bundle;", "savedInstanceState", "Lkotlin/d2;", "onViewCreated", "Landroid/content/DialogInterface;", "dialog", "onDismiss", "", "throwable", "U0", "Lcom/carrefour/fid/android/shared/navigation/c;", "f", "Lcom/carrefour/fid/android/shared/navigation/c;", "T0", "()Lcom/carrefour/fid/android/shared/navigation/c;", "W0", "(Lcom/carrefour/fid/android/shared/navigation/c;)V", "navigator", "Lcom/carrefour/fid/android/product/presentation/analytics/a;", "g", "Lcom/carrefour/fid/android/product/presentation/analytics/a;", "S0", "()Lcom/carrefour/fid/android/product/presentation/analytics/a;", "V0", "(Lcom/carrefour/fid/android/product/presentation/analytics/a;)V", "analytics", "<init>", "()V", "v", "a", "product_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
@C8567o(parameters = 0)
@C11363r0({"SMAP\nAlternativeProductsBottomSheetFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AlternativeProductsBottomSheetFragment.kt\ncom/carrefour/fid/android/product/presentation/ui/bottomsheet/AlternativeProductsBottomSheetFragment\n+ 2 Parcelable.kt\ncom/carrefour/fid/android/shared/util/ParcelableKt\n*L\n1#1,172:1\n7#2,4:173\n*S KotlinDebug\n*F\n+ 1 AlternativeProductsBottomSheetFragment.kt\ncom/carrefour/fid/android/product/presentation/ui/bottomsheet/AlternativeProductsBottomSheetFragment\n*L\n69#1:173,4\n*E\n"})
/* renamed from: com.carrefour.fid.android.product.presentation.ui.bottomsheet.AlternativeProductsBottomSheetFragment */
public final class AlternativeProductsBottomSheetFragment extends C27741g<C27476a> {
    @C12579k

    /* renamed from: v */
    public static final C27691a f67217v = new C27691a((DefaultConstructorMarker) null);

    /* renamed from: w */
    public static final int f67218w = 8;
    @C12579k

    /* renamed from: x */
    public static final String f67219x = "InitialGtinKey";
    @Inject

    /* renamed from: f */
    public C28796c f67220f;
    @Inject

    /* renamed from: g */
    public C27631a f67221g;

    /* renamed from: com.carrefour.fid.android.product.presentation.ui.bottomsheet.AlternativeProductsBottomSheetFragment$a */
    public static final class C27691a {
        public /* synthetic */ C27691a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @C12579k
        /* renamed from: a */
        public final AlternativeProductsBottomSheetFragment mo80464a(@C12579k String str) {
            Intrinsics.checkNotNullParameter(str, "gtin");
            AlternativeProductsBottomSheetFragment alternativeProductsBottomSheetFragment = new AlternativeProductsBottomSheetFragment();
            Bundle bundle = new Bundle();
            bundle.putParcelable(AlternativeProductsBottomSheetFragment.f67219x, Gtin.m157307a(str));
            alternativeProductsBottomSheetFragment.setArguments(bundle);
            return alternativeProductsBottomSheetFragment;
        }

        public C27691a() {
        }
    }

    public AlternativeProductsBottomSheetFragment() {
        super(C276891.f67222a, C276902.f67223a, false);
    }

    @C12579k
    /* renamed from: S0 */
    public final C27631a mo80457S0() {
        C27631a aVar = this.f67221g;
        if (aVar != null) {
            return aVar;
        }
        Intrinsics.throwUninitializedPropertyAccessException("analytics");
        return null;
    }

    @C12579k
    /* renamed from: T0 */
    public final C28796c mo80458T0() {
        C28796c cVar = this.f67220f;
        if (cVar != null) {
            return cVar;
        }
        Intrinsics.throwUninitializedPropertyAccessException("navigator");
        return null;
    }

    /* renamed from: U0 */
    public final void mo80459U0(Throwable th) {
        boolean z;
        Throwable th2;
        Throwable th3;
        Throwable th4;
        Throwable th5 = th;
        if (th5 instanceof RequireSignInThrowable) {
            mo80458T0().mo83841q(this);
        } else if (th5 instanceof CategoryLimitationExceededThrowable) {
            NotificationComponent.Variant variant = NotificationComponent.Variant.WARNING;
            CategoryLimit a = ((CategoryLimitationExceededThrowable) th5).mo114268a();
            Context requireContext = requireContext();
            Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext()");
            FragmentKt.m118811B(this, variant, C27657a.m116359a(a, requireContext), (String) null, (String) null, (C11289a) null, false, false, (Integer) null, (Integer) null, (Integer) null, (Integer) null, 2044, (Object) null);
        } else if (th5 instanceof BasketItemQuantityExceededThrowable) {
            C28935i iVar = C28935i.f70940a;
            String message = th.getMessage();
            Intrinsics.checkNotNull(message, "null cannot be cast to non-null type kotlin.String");
            C28935i.m119706i(iVar, message, (Throwable) null, 0, 6, (Object) null);
            NotificationComponent.Variant variant2 = NotificationComponent.Variant.ERROR;
            String string = getString(C27609f.C27627r.fec_basket_module_product_quantity_excecced);
            Intrinsics.checkNotNullExpressionValue(string, "getString(R.string.fec_b…roduct_quantity_excecced)");
            FragmentKt.m118811B(this, variant2, string, (String) null, (String) null, (C11289a) null, false, false, (Integer) null, (Integer) null, (Integer) null, (Integer) null, 2044, (Object) null);
        } else if (th5 instanceof BasketThrowable) {
            NotificationComponent.Variant variant3 = NotificationComponent.Variant.ERROR;
            String string2 = getString(((BasketThrowable) th5).mo114267a().mo114265q());
            Intrinsics.checkNotNullExpressionValue(string2, "getString(throwable.error.resourceId)");
            FragmentKt.m118811B(this, variant3, string2, (String) null, (String) null, (C11289a) null, false, false, (Integer) null, (Integer) null, (Integer) null, (Integer) null, 2044, (Object) null);
        } else if (th5 instanceof ShoppingListThrowable) {
            C28935i iVar2 = C28935i.f70940a;
            String message2 = th.getMessage();
            Intrinsics.checkNotNull(message2, "null cannot be cast to non-null type kotlin.String");
            Throwable cause = th.getCause();
            if (cause == null) {
                th4 = th5;
            } else {
                th4 = cause;
            }
            C28935i.m119705e(iVar2, message2, th4, 0, 4, (Object) null);
            NotificationComponent.Variant variant4 = NotificationComponent.Variant.WARNING;
            String string3 = getString(C27609f.C27627r.general_error_parameters_server_not_responding_03);
            Intrinsics.checkNotNullExpressionValue(string3, "getString(R.string.gener…server_not_responding_03)");
            FragmentKt.m118811B(this, variant4, string3, (String) null, (String) null, (C11289a) null, false, false, (Integer) null, (Integer) null, (Integer) null, (Integer) null, 2044, (Object) null);
        } else {
            if (th5 instanceof BasketClosedStoreThrowable) {
                z = true;
            } else {
                z = th5 instanceof BasketExpiredFacilityStoreIdThrowable;
            }
            if (z) {
                C19232h requireActivity = requireActivity();
                Intrinsics.checkNotNullExpressionValue(requireActivity, "requireActivity()");
                String string4 = getString(C27609f.C27627r.basket_error_closed_store);
                Intrinsics.checkNotNullExpressionValue(string4, "getString(R.string.basket_error_closed_store)");
                ActivityKt.m118689B(requireActivity, true, string4);
                mo80458T0().mo83826b(this);
            } else if (th5 instanceof RequireServiceSelectionThrowable) {
                mo80458T0().mo83826b(this);
            } else if (th5 instanceof NetworkException) {
                C28935i iVar3 = C28935i.f70940a;
                String message3 = th.getMessage();
                Intrinsics.checkNotNull(message3, "null cannot be cast to non-null type kotlin.String");
                Throwable cause2 = th.getCause();
                if (cause2 == null) {
                    th3 = th5;
                } else {
                    th3 = cause2;
                }
                C28935i.m119705e(iVar3, message3, th3, 0, 4, (Object) null);
                NotificationComponent.Variant variant5 = NotificationComponent.Variant.ERROR;
                String string5 = getString(C27609f.C27627r.general_error_no_network_message);
                Intrinsics.checkNotNullExpressionValue(string5, "getString(R.string.gener…error_no_network_message)");
                FragmentKt.m118811B(this, variant5, string5, (String) null, (String) null, (C11289a) null, false, false, (Integer) null, (Integer) null, (Integer) null, (Integer) null, 2044, (Object) null);
            } else {
                C28935i iVar4 = C28935i.f70940a;
                String message4 = th.getMessage();
                Intrinsics.checkNotNull(message4, "null cannot be cast to non-null type kotlin.String");
                Throwable cause3 = th.getCause();
                if (cause3 == null) {
                    th2 = th5;
                } else {
                    th2 = cause3;
                }
                C28935i.m119705e(iVar4, message4, th2, 0, 4, (Object) null);
                NotificationComponent.Variant variant6 = NotificationComponent.Variant.ERROR;
                String string6 = getString(C27609f.C27627r.general_error_parameters_server_not_responding_03);
                Intrinsics.checkNotNullExpressionValue(string6, "getString(R.string.gener…server_not_responding_03)");
                FragmentKt.m118811B(this, variant6, string6, (String) null, (String) null, (C11289a) null, false, false, (Integer) null, (Integer) null, (Integer) null, (Integer) null, 2044, (Object) null);
            }
        }
    }

    /* renamed from: V0 */
    public final void mo80460V0(@C12579k C27631a aVar) {
        Intrinsics.checkNotNullParameter(aVar, "<set-?>");
        this.f67221g = aVar;
    }

    /* renamed from: W0 */
    public final void mo80461W0(@C12579k C28796c cVar) {
        Intrinsics.checkNotNullParameter(cVar, "<set-?>");
        this.f67220f = cVar;
    }

    public void onDismiss(@C12579k DialogInterface dialogInterface) {
        Intrinsics.checkNotNullParameter(dialogInterface, C19714d.f50522e);
        C19259o.m90349d(this, C27736c.f67260a, new Bundle());
        super.onDismiss(dialogInterface);
    }

    public void onViewCreated(@C12579k View view, @C12580l Bundle bundle) {
        Object obj;
        String str;
        Intrinsics.checkNotNullParameter(view, C40383c.f102945c);
        super.onViewCreated(view, bundle);
        Bundle requireArguments = requireArguments();
        Intrinsics.checkNotNullExpressionValue(requireArguments, "requireArguments()");
        if (Build.VERSION.SDK_INT >= 33) {
            obj = (Parcelable) requireArguments.getParcelable(f67219x, Gtin.class);
        } else {
            obj = (Gtin) requireArguments.getParcelable(f67219x);
        }
        Gtin gtin = (Gtin) obj;
        if (gtin != null) {
            str = gtin.mo118380i();
        } else {
            str = null;
        }
        if (str != null) {
            ComposeView composeView = ((C27476a) getBinding()).f66611b;
            composeView.setViewCompositionStrategy(ViewCompositionStrategy.DisposeOnDetachedFromWindow.f39390b);
            composeView.setContent(C8553b.m31049c(1576446182, true, new AlternativeProductsBottomSheetFragment$onViewCreated$1$1(this, str)));
            return;
        }
        throw new IllegalStateException("No Gtin passed... Can not fetch alternative products");
    }
}
