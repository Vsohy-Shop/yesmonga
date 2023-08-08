package com.carrefour.fid.android.product.presentation.p039ui.quantity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import androidx.compose.runtime.internal.C8567o;
import androidx.core.p027os.C17779d;
import androidx.fragment.app.C19232h;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.C19499w;
import androidx.lifecycle.C19501x;
import androidx.navigation.compose.C19714d;
import com.carrefour.fid.android.design.components.widgets.C37185a;
import com.carrefour.fid.android.design.components.widgets.NotificationComponent;
import com.carrefour.fid.android.design.components.widgets.list.C37268h;
import com.carrefour.fid.android.domain.exceptions.BasketClosedStoreThrowable;
import com.carrefour.fid.android.domain.exceptions.BasketExpiredFacilityStoreIdThrowable;
import com.carrefour.fid.android.domain.exceptions.BasketItemQuantityExceededThrowable;
import com.carrefour.fid.android.domain.exceptions.BasketThrowable;
import com.carrefour.fid.android.domain.exceptions.CategoryLimitationExceededThrowable;
import com.carrefour.fid.android.domain.models.basket.BasketType;
import com.carrefour.fid.android.domain.models.offer.CategoryLimit;
import com.carrefour.fid.android.domain.models.product.Gtin;
import com.carrefour.fid.android.domain.models.product.plp.C38115c;
import com.carrefour.fid.android.product.C27609f;
import com.carrefour.fid.android.product.databinding.C27486f;
import com.carrefour.fid.android.product.presentation.analytics.C27631a;
import com.carrefour.fid.android.product.presentation.analytics.PlpProductAnalytics;
import com.carrefour.fid.android.product.presentation.models.extensions.C27657a;
import com.carrefour.fid.android.product.presentation.viewmodel.quantity.QuantityBackDropViewModel;
import com.carrefour.fid.android.shared.extension.ActivityKt;
import com.carrefour.fid.android.shared.extension.FragmentKt;
import com.carrefour.fid.android.shared.navigation.C28796c;
import com.carrefour.fid.android.shared.p046io.NetworkException;
import com.carrefour.fid.android.shared.util.C28935i;
import com.google.android.gms.analytics.ecommerce.C40383c;
import dagger.hilt.android.C10164b;
import java.util.ArrayList;
import javax.inject.Inject;
import kotlin.C10864b0;
import kotlin.C11076d0;
import kotlin.C11078d1;
import kotlin.C11079d2;
import kotlin.C11677z;
import kotlin.LazyThreadSafetyMode;
import kotlin.collections.C10976s;
import kotlin.collections.C10978t;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.internal.C11342l0;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.C11723c2;
import kotlinx.coroutines.C12038j;
import kotlinx.coroutines.CoroutineStart;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C10164b
@C11076d0(mo22515d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000 @2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001HB\u0007¢\u0006\u0004\bF\u0010GJ\u001a\u0010\b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00032\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0016J\u0010\u0010\u000b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0016J\u0010\u0010\u000e\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\fH\u0002J\u0010\u0010\u0011\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u000fH\u0002J\b\u0010\u0012\u001a\u00020\u0007H\u0002J\u0010\u0010\u0015\u001a\u00020\u00072\u0006\u0010\u0014\u001a\u00020\u0013H\u0002J\u0010\u0010\u0017\u001a\u00020\u00072\u0006\u0010\u0014\u001a\u00020\u0016H\u0002J\u0010\u0010\u0018\u001a\u00020\u00072\u0006\u0010\u0014\u001a\u00020\u0016H\u0002R\"\u0010 \u001a\u00020\u00198\u0006@\u0006X.¢\u0006\u0012\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR\"\u0010(\u001a\u00020!8\u0006@\u0006X.¢\u0006\u0012\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%\"\u0004\b&\u0010'R\u001b\u0010.\u001a\u00020)8BX\u0002¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-R\u0018\u00102\u001a\u0004\u0018\u00010/8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b0\u00101R\u0018\u00106\u001a\u0004\u0018\u0001038\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b4\u00105R\u0016\u00109\u001a\u0002038\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b7\u00108R\u0018\u0010=\u001a\u0004\u0018\u00010:8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b;\u0010<R\u0016\u0010A\u001a\u00020>8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b?\u0010@R\u0018\u0010E\u001a\u0004\u0018\u00010B8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\bC\u0010D¨\u0006I"}, mo22516d2 = {"Lcom/carrefour/fid/android/product/presentation/ui/quantity/QuantityBackDropFragment;", "Lcom/carrefour/fid/android/design/components/widgets/a;", "Lcom/carrefour/fid/android/product/databinding/f;", "Landroid/view/View;", "view", "Landroid/os/Bundle;", "savedInstanceState", "Lkotlin/d2;", "onViewCreated", "Landroid/content/DialogInterface;", "dialog", "onDismiss", "", "throwable", "d1", "Lcom/carrefour/fid/android/product/presentation/viewmodel/quantity/QuantityBackDropViewModel$c;", "uiState", "c1", "f1", "Lcom/carrefour/fid/android/product/presentation/viewmodel/quantity/QuantityBackDropViewModel$b;", "event", "b1", "Lcom/carrefour/fid/android/product/presentation/viewmodel/quantity/QuantityBackDropViewModel$b$b;", "X0", "Y0", "Lcom/carrefour/fid/android/shared/navigation/c;", "f", "Lcom/carrefour/fid/android/shared/navigation/c;", "getNavigator", "()Lcom/carrefour/fid/android/shared/navigation/c;", "setNavigator", "(Lcom/carrefour/fid/android/shared/navigation/c;)V", "navigator", "Lcom/carrefour/fid/android/product/presentation/analytics/a;", "g", "Lcom/carrefour/fid/android/product/presentation/analytics/a;", "Z0", "()Lcom/carrefour/fid/android/product/presentation/analytics/a;", "e1", "(Lcom/carrefour/fid/android/product/presentation/analytics/a;)V", "alternativeProductsBottomSheetAnalytics", "Lcom/carrefour/fid/android/product/presentation/viewmodel/quantity/QuantityBackDropViewModel;", "v", "Lkotlin/z;", "a1", "()Lcom/carrefour/fid/android/product/presentation/viewmodel/quantity/QuantityBackDropViewModel;", "viewModel", "Lcom/carrefour/fid/android/product/presentation/analytics/PlpProductAnalytics;", "w", "Lcom/carrefour/fid/android/product/presentation/analytics/PlpProductAnalytics;", "productListAnalytics", "", "x", "Ljava/lang/Integer;", "position", "y", "I", "currentQuantity", "", "z", "Ljava/lang/String;", "criteoBeaconBasketChangeUrl", "", "X", "Z", "hasReceivedErrorUpdate", "Lcom/carrefour/fid/android/domain/models/product/plp/c;", "Y", "Lcom/carrefour/fid/android/domain/models/product/plp/c;", "initialProduct", "<init>", "()V", "a", "product_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
@C8567o(parameters = 0)
@C11363r0({"SMAP\nQuantityBackDropFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 QuantityBackDropFragment.kt\ncom/carrefour/fid/android/product/presentation/ui/quantity/QuantityBackDropFragment\n+ 2 FragmentViewModelLazy.kt\nandroidx/fragment/app/FragmentViewModelLazyKt\n+ 3 Fragment.kt\ncom/carrefour/fid/android/shared/extension/FragmentKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 5 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,249:1\n106#2,15:250\n183#3,6:265\n168#3,7:271\n1#4:278\n1549#5:279\n1620#5,3:280\n*S KotlinDebug\n*F\n+ 1 QuantityBackDropFragment.kt\ncom/carrefour/fid/android/product/presentation/ui/quantity/QuantityBackDropFragment\n*L\n83#1:250,15\n100#1:265,6\n101#1:271,7\n170#1:279\n170#1:280,3\n*E\n"})
/* renamed from: com.carrefour.fid.android.product.presentation.ui.quantity.QuantityBackDropFragment */
public final class QuantityBackDropFragment extends C28098a<C27486f> {

    /* renamed from: E0 */
    public static final int f68031E0 = 8;
    @C12579k

    /* renamed from: F0 */
    public static final String f68032F0 = "offerGtin";
    @C12579k

    /* renamed from: G0 */
    public static final String f68033G0 = "offerPosition";
    @C12579k

    /* renamed from: H0 */
    public static final String f68034H0 = "basketType";
    @C12579k

    /* renamed from: I0 */
    public static final String f68035I0 = "currentQuantity";
    @C12579k

    /* renamed from: J0 */
    public static final String f68036J0 = "criteoBeaconBasketChange";
    @C12579k

    /* renamed from: K0 */
    public static final String f68037K0 = "hasReceivedErrorUpdate";
    @C12579k

    /* renamed from: Z */
    public static final C28089a f68038Z = new C28089a((DefaultConstructorMarker) null);

    /* renamed from: X */
    public boolean f68039X;
    @C12580l

    /* renamed from: Y */
    public C38115c f68040Y;
    @Inject

    /* renamed from: f */
    public C28796c f68041f;
    @Inject

    /* renamed from: g */
    public C27631a f68042g;
    @C12579k

    /* renamed from: v */
    public final C11677z f68043v;
    @C12580l

    /* renamed from: w */
    public PlpProductAnalytics f68044w;
    @C12580l

    /* renamed from: x */
    public Integer f68045x;

    /* renamed from: y */
    public int f68046y;
    @C12580l

    /* renamed from: z */
    public String f68047z;

    /* renamed from: com.carrefour.fid.android.product.presentation.ui.quantity.QuantityBackDropFragment$a */
    public static final class C28089a {
        public /* synthetic */ C28089a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: b */
        public static /* synthetic */ QuantityBackDropFragment m117643b(C28089a aVar, String str, Integer num, int i, PlpProductAnalytics plpProductAnalytics, BasketType basketType, String str2, C38115c cVar, int i2, Object obj) {
            Integer num2;
            int i3;
            PlpProductAnalytics plpProductAnalytics2;
            BasketType basketType2;
            String str3;
            C38115c cVar2 = null;
            if ((i2 & 2) != 0) {
                num2 = null;
            } else {
                num2 = num;
            }
            if ((i2 & 4) != 0) {
                i3 = 0;
            } else {
                i3 = i;
            }
            if ((i2 & 8) != 0) {
                plpProductAnalytics2 = null;
            } else {
                plpProductAnalytics2 = plpProductAnalytics;
            }
            if ((i2 & 16) != 0) {
                basketType2 = BasketType.BASKET_V4_DRIVE;
            } else {
                basketType2 = basketType;
            }
            if ((i2 & 32) != 0) {
                str3 = null;
            } else {
                str3 = str2;
            }
            if ((i2 & 64) == 0) {
                cVar2 = cVar;
            }
            return aVar.mo81672a(str, num2, i3, plpProductAnalytics2, basketType2, str3, cVar2);
        }

        @C12579k
        /* renamed from: a */
        public final QuantityBackDropFragment mo81672a(@C12579k String str, @C12580l Integer num, int i, @C12580l PlpProductAnalytics plpProductAnalytics, @C12579k BasketType basketType, @C12580l String str2, @C12580l C38115c cVar) {
            Intrinsics.checkNotNullParameter(str, QuantityBackDropFragment.f68032F0);
            Intrinsics.checkNotNullParameter(basketType, "basketType");
            QuantityBackDropFragment quantityBackDropFragment = new QuantityBackDropFragment();
            quantityBackDropFragment.f68044w = plpProductAnalytics;
            quantityBackDropFragment.f68040Y = cVar;
            quantityBackDropFragment.setArguments(C17779d.m81164b(C11078d1.m42659a(QuantityBackDropFragment.f68032F0, Gtin.m157307a(str)), C11078d1.m42659a(QuantityBackDropFragment.f68033G0, num), C11078d1.m42659a("basketType", basketType.mo117008q()), C11078d1.m42659a(QuantityBackDropFragment.f68035I0, Integer.valueOf(i)), C11078d1.m42659a(QuantityBackDropFragment.f68036J0, str2)));
            return quantityBackDropFragment;
        }

        public C28089a() {
        }
    }

    public QuantityBackDropFragment() {
        super(C280871.f68048a, C280882.f68049a, false);
        C11677z b = C10864b0.m38747b(LazyThreadSafetyMode.NONE, new QuantityBackDropFragment$special$$inlined$viewModels$default$2(new QuantityBackDropFragment$special$$inlined$viewModels$default$1(this)));
        this.f68043v = FragmentViewModelLazyKt.m89923h(this, C11342l0.m43547d(QuantityBackDropViewModel.class), new QuantityBackDropFragment$special$$inlined$viewModels$default$3(b), new QuantityBackDropFragment$special$$inlined$viewModels$default$4((C11289a) null, b), new QuantityBackDropFragment$special$$inlined$viewModels$default$5(this, b));
    }

    /* renamed from: X0 */
    public final void mo81659X0(QuantityBackDropViewModel.C28209b.C28211b bVar) {
        int i;
        C38115c cVar = this.f68040Y;
        int i2 = 0;
        if (cVar != null) {
            C27631a Z0 = mo81661Z0();
            C38115c j = bVar.mo82150e().mo118842j();
            int f = bVar.mo82152f() - this.f68046y;
            Integer num = this.f68045x;
            if (num != null) {
                i = num.intValue();
            } else {
                i = 0;
            }
            Z0.mo80244e(cVar, j, f, i);
        }
        PlpProductAnalytics plpProductAnalytics = this.f68044w;
        if (plpProductAnalytics != null) {
            C38115c j2 = bVar.mo82150e().mo118842j();
            int f2 = bVar.mo82152f() - this.f68046y;
            Integer num2 = this.f68045x;
            if (num2 != null) {
                i2 = num2.intValue();
            }
            plpProductAnalytics.mo80227d(j2, f2, i2);
        }
    }

    /* renamed from: Y0 */
    public final void mo81660Y0(QuantityBackDropViewModel.C28209b.C28211b bVar) {
        int i;
        C38115c cVar = this.f68040Y;
        int i2 = 0;
        if (cVar != null) {
            C27631a Z0 = mo81661Z0();
            C38115c j = bVar.mo82150e().mo118842j();
            int f = this.f68046y - bVar.mo82152f();
            Integer num = this.f68045x;
            if (num != null) {
                i = num.intValue();
            } else {
                i = 0;
            }
            Z0.mo80245f(cVar, j, f, i);
        }
        PlpProductAnalytics plpProductAnalytics = this.f68044w;
        if (plpProductAnalytics != null) {
            C38115c j2 = bVar.mo82150e().mo118842j();
            int f2 = this.f68046y - bVar.mo82152f();
            Integer num2 = this.f68045x;
            if (num2 != null) {
                i2 = num2.intValue();
            }
            plpProductAnalytics.mo80229f(j2, f2, i2);
        }
    }

    @C12579k
    /* renamed from: Z0 */
    public final C27631a mo81661Z0() {
        C27631a aVar = this.f68042g;
        if (aVar != null) {
            return aVar;
        }
        Intrinsics.throwUninitializedPropertyAccessException("alternativeProductsBottomSheetAnalytics");
        return null;
    }

    /* renamed from: a1 */
    public final QuantityBackDropViewModel mo81662a1() {
        return (QuantityBackDropViewModel) this.f68043v.getValue();
    }

    /* renamed from: b1 */
    public final void mo81663b1(QuantityBackDropViewModel.C28209b bVar) {
        if (bVar instanceof QuantityBackDropViewModel.C28209b.C28211b) {
            QuantityBackDropViewModel.C28209b.C28211b bVar2 = (QuantityBackDropViewModel.C28209b.C28211b) bVar;
            int k = bVar2.mo82150e().mo118843k();
            if (k > bVar2.mo82152f()) {
                mo81660Y0(bVar2);
            } else if (k < bVar2.mo82152f()) {
                mo81659X0(bVar2);
            }
            dismiss();
        } else if (bVar instanceof QuantityBackDropViewModel.C28209b.C28210a) {
            mo81665d1(((QuantityBackDropViewModel.C28209b.C28210a) bVar).mo82143d());
        }
    }

    /* renamed from: c1 */
    public final void mo81664c1(QuantityBackDropViewModel.C28212c cVar) {
        if (Intrinsics.areEqual((Object) cVar, (Object) QuantityBackDropViewModel.C28212c.C28215c.f68333b)) {
            dismiss();
        } else if (Intrinsics.areEqual((Object) cVar, (Object) QuantityBackDropViewModel.C28212c.C28216d.f68335b)) {
            mo81667f1();
        } else if (cVar instanceof QuantityBackDropViewModel.C28212c.C28217e) {
            Iterable<QuantityBackDropViewModel.C28208a> h = ((QuantityBackDropViewModel.C28212c.C28217e) cVar).mo82159h();
            ArrayList arrayList = new ArrayList(C10978t.m41495Y(h, 10));
            for (QuantityBackDropViewModel.C28208a aVar : h) {
                arrayList.add(new C37268h(String.valueOf(aVar.mo82136f()), aVar.mo82138h(), aVar.mo82137g(), new QuantityBackDropFragment$handleState$items$1$1(this, aVar)));
            }
            ((C27486f) getBinding()).f66663b.setList(arrayList);
        }
    }

    /* renamed from: d1 */
    public final void mo81665d1(Throwable th) {
        boolean z;
        Throwable th2;
        Throwable th3 = th;
        this.f68039X = true;
        if (th3 instanceof CategoryLimitationExceededThrowable) {
            NotificationComponent.Variant variant = NotificationComponent.Variant.WARNING;
            CategoryLimit a = ((CategoryLimitationExceededThrowable) th3).mo114268a();
            C19232h requireActivity = requireActivity();
            Intrinsics.checkNotNullExpressionValue(requireActivity, "requireActivity()");
            FragmentKt.m118811B(this, variant, C27657a.m116359a(a, requireActivity), (String) null, (String) null, (C11289a) null, false, false, (Integer) null, (Integer) null, (Integer) null, (Integer) null, 2044, (Object) null);
        } else if (th3 instanceof BasketItemQuantityExceededThrowable) {
            C28935i iVar = C28935i.f70940a;
            String message = th.getMessage();
            Intrinsics.checkNotNull(message, "null cannot be cast to non-null type kotlin.String");
            C28935i.m119706i(iVar, message, (Throwable) null, 0, 6, (Object) null);
            NotificationComponent.Variant variant2 = NotificationComponent.Variant.ERROR;
            String string = requireActivity().getString(C27609f.C27627r.fec_basket_module_product_quantity_excecced);
            Intrinsics.checkNotNullExpressionValue(string, "requireActivity().getStr…roduct_quantity_excecced)");
            FragmentKt.m118811B(this, variant2, string, (String) null, (String) null, (C11289a) null, false, false, (Integer) null, (Integer) null, (Integer) null, (Integer) null, 2044, (Object) null);
        } else if (th3 instanceof BasketThrowable) {
            C19232h requireActivity2 = requireActivity();
            Intrinsics.checkNotNullExpressionValue(requireActivity2, "requireActivity()");
            NotificationComponent.Variant variant3 = NotificationComponent.Variant.ERROR;
            String string2 = requireActivity().getString(((BasketThrowable) th3).mo114267a().mo114265q());
            Intrinsics.checkNotNullExpressionValue(string2, "requireActivity().getStr…rowable.error.resourceId)");
            ActivityKt.m118716z(requireActivity2, variant3, string2, (String) null, (String) null, (C11289a) null, false, false, (Integer) null, (Integer) null, (Integer) null, (Integer) null, 2044, (Object) null);
        } else {
            if (th3 instanceof BasketClosedStoreThrowable) {
                z = true;
            } else {
                z = th3 instanceof BasketExpiredFacilityStoreIdThrowable;
            }
            if (z) {
                C19232h requireActivity3 = requireActivity();
                Intrinsics.checkNotNullExpressionValue(requireActivity3, "requireActivity()");
                String string3 = requireActivity().getString(C27609f.C27627r.basket_error_closed_store);
                Intrinsics.checkNotNullExpressionValue(string3, "requireActivity().getStr…asket_error_closed_store)");
                ActivityKt.m118689B(requireActivity3, true, string3);
                getNavigator().mo83826b(this);
            } else if (th3 instanceof NetworkException) {
                C19232h requireActivity4 = requireActivity();
                Intrinsics.checkNotNullExpressionValue(requireActivity4, "requireActivity()");
                NotificationComponent.Variant variant4 = NotificationComponent.Variant.ERROR;
                String string4 = requireActivity().getString(C27609f.C27627r.general_error_no_network_message);
                Intrinsics.checkNotNullExpressionValue(string4, "requireActivity().getStr…error_no_network_message)");
                ActivityKt.m118716z(requireActivity4, variant4, string4, (String) null, (String) null, (C11289a) null, false, false, (Integer) null, (Integer) null, (Integer) null, (Integer) null, 2044, (Object) null);
            } else {
                C28935i iVar2 = C28935i.f70940a;
                String message2 = th.getMessage();
                Intrinsics.checkNotNull(message2, "null cannot be cast to non-null type kotlin.String");
                Throwable cause = th.getCause();
                if (cause == null) {
                    th2 = th3;
                } else {
                    th2 = cause;
                }
                C28935i.m119705e(iVar2, message2, th2, 0, 4, (Object) null);
                C19232h requireActivity5 = requireActivity();
                Intrinsics.checkNotNullExpressionValue(requireActivity5, "requireActivity()");
                NotificationComponent.Variant variant5 = NotificationComponent.Variant.ERROR;
                String string5 = requireActivity().getString(C27609f.C27627r.general_error_parameters_server_not_responding_03);
                Intrinsics.checkNotNullExpressionValue(string5, "requireActivity().getStr…server_not_responding_03)");
                ActivityKt.m118716z(requireActivity5, variant5, string5, (String) null, (String) null, (C11289a) null, false, false, (Integer) null, (Integer) null, (Integer) null, (Integer) null, 2044, (Object) null);
            }
        }
    }

    /* renamed from: e1 */
    public final void mo81666e1(@C12579k C27631a aVar) {
        Intrinsics.checkNotNullParameter(aVar, "<set-?>");
        this.f68042g = aVar;
    }

    /* renamed from: f1 */
    public final void mo81667f1() {
        ((C27486f) getBinding()).f66663b.setList(C10976s.m41419k(new C37268h("", true, true, (C11289a) null, 8, (DefaultConstructorMarker) null)));
    }

    @C12579k
    public final C28796c getNavigator() {
        C28796c cVar = this.f68041f;
        if (cVar != null) {
            return cVar;
        }
        Intrinsics.throwUninitializedPropertyAccessException("navigator");
        return null;
    }

    public void onDismiss(@C12579k DialogInterface dialogInterface) {
        Intrinsics.checkNotNullParameter(dialogInterface, C19714d.f50522e);
        FragmentManager g0 = requireActivity().mo57175g0();
        Bundle bundle = new Bundle();
        bundle.putBoolean(f68037K0, this.f68039X);
        C11079d2 d2Var = C11079d2.f28267a;
        g0.mo56857a(C37185a.ON_DISMISS_FRAGMENT_RESULT_KEY, bundle);
        super.onDismiss(dialogInterface);
    }

    public void onViewCreated(@C12579k View view, @C12580l Bundle bundle) {
        String str;
        Intrinsics.checkNotNullParameter(view, C40383c.f102945c);
        super.onViewCreated(view, bundle);
        this.f68045x = Integer.valueOf(requireArguments().getInt(f68033G0));
        this.f68047z = requireArguments().getString(f68036J0);
        this.f68046y = requireArguments().getInt(f68035I0);
        Gtin gtin = (Gtin) requireArguments().getParcelable(f68032F0);
        if (gtin != null) {
            str = gtin.mo118380i();
        } else {
            str = null;
        }
        if (str != null) {
            QuantityBackDropViewModel a1 = mo81662a1();
            C19499w viewLifecycleOwner = getViewLifecycleOwner();
            Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "viewLifecycleOwner");
            C11723c2 unused = C12038j.m48061f(C19501x.m90847a(viewLifecycleOwner), (CoroutineContext) null, (CoroutineStart) null, new QuantityBackDropFragment$onViewCreated$$inlined$processEvent$1(this, a1, (C11045c) null, this), 3, (Object) null);
            QuantityBackDropViewModel a12 = mo81662a1();
            C19499w viewLifecycleOwner2 = getViewLifecycleOwner();
            Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner2, "viewLifecycleOwner");
            C11723c2 unused2 = C12038j.m48061f(C19501x.m90847a(viewLifecycleOwner2), (CoroutineContext) null, (CoroutineStart) null, new QuantityBackDropFragment$onViewCreated$$inlined$processState$1(this, a12, (C11045c) null, this), 3, (Object) null);
            mo81662a1().sendIntent(new QuantityBackDropViewModel.C28218d.C28219a(str, (DefaultConstructorMarker) null));
            return;
        }
        throw new IllegalStateException("Error getting mandatory parameter for " + C11342l0.m43547d(QuantityBackDropFragment.class).mo22848s() + ": offerGtin");
    }

    public final void setNavigator(@C12579k C28796c cVar) {
        Intrinsics.checkNotNullParameter(cVar, "<set-?>");
        this.f68041f = cVar;
    }
}
