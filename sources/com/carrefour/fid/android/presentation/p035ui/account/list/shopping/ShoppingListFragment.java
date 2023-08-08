package com.carrefour.fid.android.presentation.p035ui.account.list.shopping;

import android.content.Context;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.material.C3044g0;
import androidx.compose.p004ui.platform.ComposeView;
import androidx.compose.p004ui.platform.ViewCompositionStrategy;
import androidx.compose.runtime.internal.C8553b;
import androidx.lifecycle.C19499w;
import androidx.navigation.fragment.C19736g;
import com.carrefour.fid.android.app.extensions.FragmentExtensionKt;
import com.carrefour.fid.android.domain.models.basket.BasketType;
import com.carrefour.fid.android.domain.models.offer.Discount;
import com.carrefour.fid.android.domain.models.offer.OfferIdentifier;
import com.carrefour.fid.android.domain.models.product.Gtin;
import com.carrefour.fid.android.domain.models.product.plp.C38115c;
import com.carrefour.fid.android.domain.models.product.plp.PlpOffer;
import com.carrefour.fid.android.presentation.viewmodels.account.list.shopping.C25882a;
import com.carrefour.fid.android.product.presentation.analytics.PlpProductAnalytics;
import com.carrefour.fid.android.product.presentation.p039ui.bottomsheet.AlternativeProductsBottomSheetFragment;
import com.carrefour.fid.android.product.presentation.p039ui.bottomsheet.MixingProductsBottomSheetFragment;
import com.carrefour.fid.android.product.presentation.p039ui.quantity.QuantityBackDropFragment;
import com.carrefour.fid.android.shared.navigation.C28796c;
import com.google.android.gms.analytics.ecommerce.C40383c;
import dagger.hilt.android.C10164b;
import java.util.List;
import javax.inject.Inject;
import kotlin.C11076d0;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.C11384m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C3044g0
@C10164b
@C11076d0(mo22515d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\f\b\u0001\u0018\u0000 /2\u00020\u0001:\u00010B\u0007¢\u0006\u0004\b-\u0010.J$\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016J\u001a\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016J-\u0010\u0012\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u000fH\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0018\u0010\u0018\u001a\u00020\u000b2\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u0016H\u0002J\u0010\u0010\u001a\u001a\u00020\u000b2\u0006\u0010\u0015\u001a\u00020\u0019H\u0002J\u001d\u0010\u001b\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001b\u0010\u001cR\"\u0010$\u001a\u00020\u001d8\u0006@\u0006X.¢\u0006\u0012\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R\"\u0010,\u001a\u00020%8\u0006@\u0006X.¢\u0006\u0012\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)\"\u0004\b*\u0010+\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u00061"}, mo22516d2 = {"Lcom/carrefour/fid/android/presentation/ui/account/list/shopping/ShoppingListFragment;", "Lcom/carrefour/fid/android/shared/base/q;", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "Landroid/view/View;", "onCreateView", "view", "Lkotlin/d2;", "onViewCreated", "Lcom/carrefour/fid/android/domain/models/product/Gtin;", "gtin", "", "position", "quantity", "S0", "(Ljava/lang/String;II)V", "Lcom/carrefour/fid/android/domain/models/offer/OfferIdentifier;", "offer", "", "isFood", "O0", "Lcom/carrefour/fid/android/domain/models/product/plp/PlpOffer;", "P0", "N0", "(Ljava/lang/String;)V", "Lcom/carrefour/fid/android/shared/navigation/c;", "f", "Lcom/carrefour/fid/android/shared/navigation/c;", "getNavigator", "()Lcom/carrefour/fid/android/shared/navigation/c;", "setNavigator", "(Lcom/carrefour/fid/android/shared/navigation/c;)V", "navigator", "Lcom/carrefour/fid/android/presentation/viewmodels/account/list/shopping/a;", "g", "Lcom/carrefour/fid/android/presentation/viewmodels/account/list/shopping/a;", "M0", "()Lcom/carrefour/fid/android/presentation/viewmodels/account/list/shopping/a;", "R0", "(Lcom/carrefour/fid/android/presentation/viewmodels/account/list/shopping/a;)V", "accountListShoppingAnalytics", "<init>", "()V", "v", "a", "app_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
/* renamed from: com.carrefour.fid.android.presentation.ui.account.list.shopping.ShoppingListFragment */
public final class ShoppingListFragment extends C23065e {
    @C12579k

    /* renamed from: v */
    public static final C23036a f58690v = new C23036a((DefaultConstructorMarker) null);
    @C12579k

    /* renamed from: w */
    public static final String f58691w = "ShoppingListFragment";
    @Inject

    /* renamed from: f */
    public C28796c f58692f;
    @Inject

    /* renamed from: g */
    public C25882a f58693g;

    /* renamed from: com.carrefour.fid.android.presentation.ui.account.list.shopping.ShoppingListFragment$a */
    public static final class C23036a {
        public /* synthetic */ C23036a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: b */
        public static /* synthetic */ ShoppingListFragment m103524b(C23036a aVar, Bundle bundle, int i, Object obj) {
            if ((i & 1) != 0) {
                bundle = null;
            }
            return aVar.mo67686a(bundle);
        }

        @C12579k
        @C11384m
        /* renamed from: a */
        public final ShoppingListFragment mo67686a(@C12580l Bundle bundle) {
            ShoppingListFragment shoppingListFragment = new ShoppingListFragment();
            shoppingListFragment.setArguments(bundle);
            return shoppingListFragment;
        }

        public C23036a() {
        }
    }

    @C12579k
    @C11384m
    /* renamed from: Q0 */
    public static final ShoppingListFragment m103517Q0(@C12580l Bundle bundle) {
        return f58690v.mo67686a(bundle);
    }

    @C12579k
    /* renamed from: M0 */
    public final C25882a mo67678M0() {
        C25882a aVar = this.f58693g;
        if (aVar != null) {
            return aVar;
        }
        Intrinsics.throwUninitializedPropertyAccessException("accountListShoppingAnalytics");
        return null;
    }

    /* renamed from: N0 */
    public final void mo67679N0(String str) {
        AlternativeProductsBottomSheetFragment.f67217v.mo80464a(str).show(getParentFragmentManager(), (String) null);
    }

    /* renamed from: O0 */
    public final void mo67680O0(OfferIdentifier offerIdentifier, boolean z) {
        getNavigator().mo83838n(C19736g.m91827a(this), offerIdentifier, !z);
    }

    /* renamed from: P0 */
    public final void mo67681P0(PlpOffer plpOffer) {
        List<Gtin> list;
        String str;
        MixingProductsBottomSheetFragment.C27727a aVar = MixingProductsBottomSheetFragment.f67233P0;
        Discount discount = (Discount) CollectionsKt___CollectionsKt.m40479B2(plpOffer.mo118816t());
        if (discount != null) {
            list = discount.mo117984w();
        } else {
            list = null;
        }
        if (list == null) {
            list = CollectionsKt__CollectionsKt.m40441E();
        }
        Discount discount2 = (Discount) CollectionsKt___CollectionsKt.m40479B2(plpOffer.mo118816t());
        if (discount2 != null) {
            str = discount2.mo117986x();
        } else {
            str = null;
        }
        if (str == null) {
            str = "";
        }
        aVar.mo80503a(list, str).show(getParentFragmentManager(), (String) null);
    }

    /* renamed from: R0 */
    public final void mo67682R0(@C12579k C25882a aVar) {
        Intrinsics.checkNotNullParameter(aVar, "<set-?>");
        this.f58693g = aVar;
    }

    /* renamed from: S0 */
    public final void mo67683S0(String str, int i, int i2) {
        QuantityBackDropFragment.C28089a.m117643b(QuantityBackDropFragment.f68038Z, str, Integer.valueOf(i), i2, (PlpProductAnalytics) null, (BasketType) null, (String) null, (C38115c) null, 120, (Object) null).show(getParentFragmentManager(), (String) null);
    }

    @C12579k
    public final C28796c getNavigator() {
        C28796c cVar = this.f58692f;
        if (cVar != null) {
            return cVar;
        }
        Intrinsics.throwUninitializedPropertyAccessException("navigator");
        return null;
    }

    @C12579k
    public View onCreateView(@C12579k LayoutInflater layoutInflater, @C12580l ViewGroup viewGroup, @C12580l Bundle bundle) {
        Intrinsics.checkNotNullParameter(layoutInflater, "inflater");
        Context requireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext()");
        ComposeView composeView = new ComposeView(requireContext, (AttributeSet) null, 0, 6, (DefaultConstructorMarker) null);
        C19499w viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "viewLifecycleOwner");
        composeView.setViewCompositionStrategy(new ViewCompositionStrategy.C15808b(viewLifecycleOwner));
        mo67678M0().mo75150g();
        composeView.setContent(C8553b.m31049c(-1852315503, true, new ShoppingListFragment$onCreateView$1$1(this, composeView)));
        return composeView;
    }

    public void onViewCreated(@C12579k View view, @C12580l Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, C40383c.f102945c);
        super.onViewCreated(view, bundle);
        FragmentExtensionKt.m58757h(this);
    }

    public final void setNavigator(@C12579k C28796c cVar) {
        Intrinsics.checkNotNullParameter(cVar, "<set-?>");
        this.f58692f = cVar;
    }
}
