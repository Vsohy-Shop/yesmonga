package com.carrefour.fid.android.product.presentation.p039ui.details;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.view.ViewStub;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.compose.runtime.internal.C8567o;
import androidx.core.content.C17318d;
import androidx.fragment.app.C19232h;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.C19499w;
import androidx.lifecycle.C19501x;
import androidx.navigation.C19766m;
import androidx.navigation.fragment.C19736g;
import androidx.recyclerview.widget.C20227z;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bumptech.glide.load.data.mediastore.C22132b;
import com.carrefour.fid.android.design.components.extension.C37106a;
import com.carrefour.fid.android.design.components.widgets.MessageComponent;
import com.carrefour.fid.android.design.components.widgets.NotificationComponent;
import com.carrefour.fid.android.design.components.widgets.NutriscoreComponent;
import com.carrefour.fid.android.design.components.widgets.PageControlsComponent;
import com.carrefour.fid.android.design.components.widgets.productcard.C37353b;
import com.carrefour.fid.android.design.components.widgets.productcard.C37390r;
import com.carrefour.fid.android.design.components.widgets.productcard.ProductCardSComponent;
import com.carrefour.fid.android.design.components.widgets.productcard.list.C37370b;
import com.carrefour.fid.android.domain.exceptions.BasketClosedStoreThrowable;
import com.carrefour.fid.android.domain.exceptions.BasketExpiredFacilityStoreIdThrowable;
import com.carrefour.fid.android.domain.exceptions.BasketItemMaxQuantityReachedThrowable;
import com.carrefour.fid.android.domain.exceptions.BasketItemQuantityExceededThrowable;
import com.carrefour.fid.android.domain.exceptions.BasketThrowable;
import com.carrefour.fid.android.domain.exceptions.CategoryLimitationExceededThrowable;
import com.carrefour.fid.android.domain.exceptions.RequireServiceSelectionThrowable;
import com.carrefour.fid.android.domain.exceptions.ShoppingListThrowable;
import com.carrefour.fid.android.domain.models.favorites.shoppinglist.extensions.C38036a;
import com.carrefour.fid.android.domain.models.offer.CategoryLimit;
import com.carrefour.fid.android.domain.models.offer.Discount;
import com.carrefour.fid.android.domain.models.offer.Offer;
import com.carrefour.fid.android.domain.models.offer.OfferAvailability;
import com.carrefour.fid.android.domain.models.offer.OfferDiscountType;
import com.carrefour.fid.android.domain.models.offer.OfferFlag;
import com.carrefour.fid.android.domain.models.offer.OfferIdentifier;
import com.carrefour.fid.android.domain.models.offer.PromoType;
import com.carrefour.fid.android.domain.models.product.plp.C38114b;
import com.carrefour.fid.android.domain.models.product.plp.C38115c;
import com.carrefour.fid.android.domain.models.product.plp.PlpOffer;
import com.carrefour.fid.android.product.C27609f;
import com.carrefour.fid.android.product.databinding.C27480c;
import com.carrefour.fid.android.product.databinding.C27485e0;
import com.carrefour.fid.android.product.databinding.C27507t;
import com.carrefour.fid.android.product.databinding.C27510w;
import com.carrefour.fid.android.product.databinding.C27511x;
import com.carrefour.fid.android.product.presentation.mapper.PlpItemDataToProductCardSMapperKt;
import com.carrefour.fid.android.product.presentation.models.C27653d;
import com.carrefour.fid.android.product.presentation.models.ProductDetailsModel;
import com.carrefour.fid.android.product.presentation.models.ProductEcoScore;
import com.carrefour.fid.android.product.presentation.models.extensions.C27657a;
import com.carrefour.fid.android.product.presentation.models.extensions.C27659c;
import com.carrefour.fid.android.product.presentation.models.extensions.C27662e;
import com.carrefour.fid.android.product.presentation.models.extensions.C27665g;
import com.carrefour.fid.android.product.presentation.models.extensions.C27666h;
import com.carrefour.fid.android.product.presentation.p039ui.bottomsheet.MixingProductsBottomSheetFragment;
import com.carrefour.fid.android.product.presentation.p039ui.details.adapter.C27771c;
import com.carrefour.fid.android.product.presentation.p039ui.details.adapter.C27774e;
import com.carrefour.fid.android.product.presentation.p039ui.details.views.EcoscoreView;
import com.carrefour.fid.android.product.presentation.p039ui.details.views.MixingProductDetailsView;
import com.carrefour.fid.android.product.presentation.p039ui.details.views.ProductFlagListView;
import com.carrefour.fid.android.product.presentation.p039ui.details.views.QuantityView;
import com.carrefour.fid.android.product.presentation.viewmodel.details.ProductDetailsViewModel;
import com.carrefour.fid.android.product.presentation.viewmodel.details.mvi.C28135b;
import com.carrefour.fid.android.shared.base.C28500r;
import com.carrefour.fid.android.shared.extension.ActivityKt;
import com.carrefour.fid.android.shared.extension.FragmentKt;
import com.carrefour.fid.android.shared.extension.TextViewKt;
import com.carrefour.fid.android.shared.extension.ViewKt;
import com.carrefour.fid.android.shared.navigation.C28796c;
import com.carrefour.fid.android.shared.p046io.NetworkException;
import com.carrefour.fid.android.shared.p046io.RequireSignInThrowable;
import com.carrefour.fid.android.shared.util.C28935i;
import com.google.android.gms.analytics.ecommerce.C40383c;
import com.urbanairship.iam.events.C9175a;
import dagger.hilt.android.C10164b;
import java.util.ArrayList;
import java.util.List;
import javax.inject.Inject;
import kotlin.C10864b0;
import kotlin.C11076d0;
import kotlin.C11677z;
import kotlin.LazyThreadSafetyMode;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.C11342l0;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.C11622t;
import kotlinx.coroutines.C11723c2;
import kotlinx.coroutines.C11768d1;
import kotlinx.coroutines.C12038j;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.flow.C11909g;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C10164b
@C11076d0(mo22515d1 = {"\u0000Ø\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\b\u0004\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007*\u0002cg\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001}B\u0007¢\u0006\u0004\b{\u0010|J\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0002J\u0010\u0010\t\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0002J\b\u0010\n\u001a\u00020\u0005H\u0002J\u0010\u0010\r\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\u000bH\u0002J\u0010\u0010\u000e\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\u000bH\u0002J\u0010\u0010\u000f\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\u000bH\u0002J\u0010\u0010\u0010\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\u000bH\u0002J\u0010\u0010\u0011\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\u000bH\u0002J\u0018\u0010\u0014\u001a\u00020\u00052\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\f\u001a\u00020\u000bH\u0002J \u0010\u0017\u001a\u00020\u00052\u0006\u0010\u0015\u001a\u00020\u00122\u0006\u0010\u0016\u001a\u00020\u00122\u0006\u0010\f\u001a\u00020\u000bH\u0002J\u0010\u0010\u0018\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\u000bH\u0002J\u0010\u0010\u0019\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\u000bH\u0002J\u0010\u0010\u001a\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\u000bH\u0002J\b\u0010\u001b\u001a\u00020\u0005H\u0002J\u0010\u0010\u001c\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\u000bH\u0002J\u0010\u0010\u001d\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\u000bH\u0002J\u0010\u0010\u001e\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\u000bH\u0002J\u0010\u0010!\u001a\u00020\u00052\u0006\u0010 \u001a\u00020\u001fH\u0002J\u0010\u0010\"\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\u000bH\u0002J\u0010\u0010#\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\u000bH\u0002J\u0010\u0010$\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\u000bH\u0002J\u0010\u0010%\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\u000bH\u0002J\u0010\u0010&\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\u000bH\u0002J\u0012\u0010)\u001a\u00020\u00052\b\u0010(\u001a\u0004\u0018\u00010'H\u0002J\u0010\u0010*\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\u000bH\u0002J\u001e\u00100\u001a\u00020\u00052\f\u0010-\u001a\b\u0012\u0004\u0012\u00020,0+2\u0006\u0010/\u001a\u00020.H\u0002J\u0010\u00101\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\u000bH\u0002J\u0010\u00102\u001a\u00020\u00052\u0006\u0010 \u001a\u00020\u001fH\u0002J\b\u00103\u001a\u00020\u0005H\u0002J \u00108\u001a\u00020\u00052\f\u00105\u001a\b\u0012\u0004\u0012\u0002040+2\b\u00107\u001a\u0004\u0018\u000106H\u0002J\u0010\u0010;\u001a\u00020\u00052\u0006\u0010:\u001a\u000209H\u0002J\u0010\u0010>\u001a\u00020\u00052\u0006\u0010=\u001a\u00020<H\u0002J\u001a\u0010C\u001a\u00020\u00052\u0006\u0010@\u001a\u00020?2\b\u0010B\u001a\u0004\u0018\u00010AH\u0016J\b\u0010E\u001a\u00020DH\u0016R\"\u0010M\u001a\u00020F8\u0006@\u0006X.¢\u0006\u0012\n\u0004\bG\u0010H\u001a\u0004\bI\u0010J\"\u0004\bK\u0010LR\u001b\u0010S\u001a\u00020N8BX\u0002¢\u0006\f\n\u0004\bO\u0010P\u001a\u0004\bQ\u0010RR\u001b\u0010Y\u001a\u00020T8BX\u0002¢\u0006\f\n\u0004\bU\u0010V\u001a\u0004\bW\u0010XR\u001b\u0010^\u001a\u00020Z8BX\u0002¢\u0006\f\n\u0004\b[\u0010V\u001a\u0004\b\\\u0010]R\u0018\u0010b\u001a\u0004\u0018\u00010_8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b`\u0010aR\u0014\u0010f\u001a\u00020c8\u0002X\u0004¢\u0006\u0006\n\u0004\bd\u0010eR\u0014\u0010j\u001a\u00020g8\u0002X\u0004¢\u0006\u0006\n\u0004\bh\u0010iR\u0014\u0010n\u001a\u00020k8BX\u0004¢\u0006\u0006\u001a\u0004\bl\u0010mR\u0014\u0010r\u001a\u00020o8BX\u0004¢\u0006\u0006\u001a\u0004\bp\u0010qR\u0014\u0010v\u001a\u00020s8BX\u0004¢\u0006\u0006\u001a\u0004\bt\u0010uR\u0014\u0010z\u001a\u00020w8BX\u0004¢\u0006\u0006\u001a\u0004\bx\u0010y¨\u0006~"}, mo22516d2 = {"Lcom/carrefour/fid/android/product/presentation/ui/details/ProductDetailsFragment;", "Lcom/carrefour/fid/android/shared/base/o;", "Lcom/carrefour/fid/android/product/databinding/c;", "Lcom/carrefour/fid/android/product/presentation/viewmodel/details/mvi/b$b;", "state", "Lkotlin/d2;", "w1", "Lcom/carrefour/fid/android/product/presentation/viewmodel/details/mvi/b$a;", "event", "v1", "initUi", "Lcom/carrefour/fid/android/domain/models/offer/Offer;", "offer", "E1", "L1", "M1", "W1", "T1", "Landroid/widget/TextView;", "textView", "F1", "primary", "secondary", "u1", "A1", "K1", "N1", "f1", "U1", "V1", "C1", "Lcom/carrefour/fid/android/product/presentation/models/ProductDetailsModel;", "productDetailsModel", "y1", "D1", "H1", "z1", "B1", "G1", "", "exception", "q1", "p1", "", "Lcom/carrefour/fid/android/domain/models/product/plp/c;", "offerProductModels", "", "isSyncingInBasket", "o1", "s1", "x1", "I1", "Lcom/carrefour/fid/android/domain/models/product/plp/b;", "criteoPlpItemDataList", "", "onAddBasketTrackingUrl", "n1", "Lcom/carrefour/fid/android/product/presentation/viewmodel/details/mvi/b$b$f;", "shoppingListButtonState", "r1", "Lcom/carrefour/fid/android/domain/models/offer/OfferFlag;", "flag", "J1", "Landroid/view/View;", "view", "Landroid/os/Bundle;", "savedInstanceState", "onViewCreated", "Landroid/view/ViewStub;", "errorMessageLayout", "Lcom/carrefour/fid/android/shared/navigation/c;", "f", "Lcom/carrefour/fid/android/shared/navigation/c;", "getNavigator", "()Lcom/carrefour/fid/android/shared/navigation/c;", "setNavigator", "(Lcom/carrefour/fid/android/shared/navigation/c;)V", "navigator", "Lcom/carrefour/fid/android/product/presentation/ui/details/i;", "g", "Landroidx/navigation/m;", "g1", "()Lcom/carrefour/fid/android/product/presentation/ui/details/i;", "args", "Lcom/carrefour/fid/android/product/presentation/viewmodel/details/ProductDetailsViewModel;", "v", "Lkotlin/z;", "m1", "()Lcom/carrefour/fid/android/product/presentation/viewmodel/details/ProductDetailsViewModel;", "viewModel", "Lcom/carrefour/fid/android/product/presentation/ui/details/adapter/e;", "w", "l1", "()Lcom/carrefour/fid/android/product/presentation/ui/details/adapter/e;", "productImageAdapter", "Lcom/carrefour/fid/android/design/components/widgets/productcard/list/b;", "x", "Lcom/carrefour/fid/android/design/components/widgets/productcard/list/b;", "adapter", "com/carrefour/fid/android/product/presentation/ui/details/ProductDetailsFragment$b", "y", "Lcom/carrefour/fid/android/product/presentation/ui/details/ProductDetailsFragment$b;", "itemImageClickListener", "com/carrefour/fid/android/product/presentation/ui/details/ProductDetailsFragment$componentHolderCallback$1", "z", "Lcom/carrefour/fid/android/product/presentation/ui/details/ProductDetailsFragment$componentHolderCallback$1;", "componentHolderCallback", "Lcom/carrefour/fid/android/product/databinding/e0;", "k1", "()Lcom/carrefour/fid/android/product/databinding/e0;", "bindingProductDetailsBottomSheet", "Lcom/carrefour/fid/android/product/databinding/t;", "h1", "()Lcom/carrefour/fid/android/product/databinding/t;", "bindingIncludePdpDetails", "Lcom/carrefour/fid/android/product/databinding/x;", "j1", "()Lcom/carrefour/fid/android/product/databinding/x;", "bindingOfferDetailsSponsoredProducts", "Lcom/carrefour/fid/android/product/databinding/w;", "i1", "()Lcom/carrefour/fid/android/product/databinding/w;", "bindingOfferDetailsHeader", "<init>", "()V", "a", "product_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
@C8567o(parameters = 0)
@C11363r0({"SMAP\nProductDetailsFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ProductDetailsFragment.kt\ncom/carrefour/fid/android/product/presentation/ui/details/ProductDetailsFragment\n+ 2 FragmentNavArgsLazy.kt\nandroidx/navigation/fragment/FragmentNavArgsLazyKt\n+ 3 FragmentViewModelLazy.kt\nandroidx/fragment/app/FragmentViewModelLazyKt\n+ 4 Fragment.kt\ncom/carrefour/fid/android/shared/extension/FragmentKt\n+ 5 View.kt\nandroidx/core/view/ViewKt\n+ 6 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 7 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,939:1\n42#2,3:940\n106#3,15:943\n168#4,7:958\n183#4,6:965\n262#5,2:971\n262#5,2:973\n262#5,2:975\n262#5,2:977\n262#5,2:979\n262#5,2:981\n262#5,2:983\n262#5,2:985\n1603#6,9:987\n1855#6:996\n1856#6:998\n1612#6:999\n1#7:997\n*S KotlinDebug\n*F\n+ 1 ProductDetailsFragment.kt\ncom/carrefour/fid/android/product/presentation/ui/details/ProductDetailsFragment\n*L\n115#1:940,3\n117#1:943,15\n173#1:958,7\n174#1:965,6\n435#1:971,2\n436#1:973,2\n590#1:975,2\n674#1:977,2\n793#1:979,2\n797#1:981,2\n799#1:983,2\n811#1:985,2\n851#1:987,9\n851#1:996\n851#1:998\n851#1:999\n851#1:997\n*E\n"})
/* renamed from: com.carrefour.fid.android.product.presentation.ui.details.ProductDetailsFragment */
public final class ProductDetailsFragment extends C27761a<C27480c> {

    /* renamed from: X */
    public static final int f67285X = 8;
    @Inject

    /* renamed from: f */
    public C28796c f67286f;
    @C12579k

    /* renamed from: g */
    public final C19766m f67287g = new C19766m(C11342l0.m43547d(C27808i.class), new ProductDetailsFragment$special$$inlined$navArgs$1(this));
    @C12579k

    /* renamed from: v */
    public final C11677z f67288v;
    @C12579k

    /* renamed from: w */
    public final C11677z f67289w;
    @C12580l

    /* renamed from: x */
    public C37370b f67290x;
    @C12579k

    /* renamed from: y */
    public final C27748b f67291y;
    @C12579k

    /* renamed from: z */
    public final ProductDetailsFragment$componentHolderCallback$1 f67292z;

    /* renamed from: com.carrefour.fid.android.product.presentation.ui.details.ProductDetailsFragment$a */
    public interface C27747a {
        /* renamed from: a */
        void mo80594a(int i);

        /* renamed from: b */
        void mo80595b();
    }

    /* renamed from: com.carrefour.fid.android.product.presentation.ui.details.ProductDetailsFragment$b */
    public static final class C27748b implements C27774e.C27775a {

        /* renamed from: a */
        public final /* synthetic */ ProductDetailsFragment f67294a;

        public C27748b(ProductDetailsFragment productDetailsFragment) {
            this.f67294a = productDetailsFragment;
        }

        /* renamed from: a */
        public void mo80596a(int i) {
            this.f67294a.mo80579m1().sendIntent(new C28135b.C28151c.C28157f(i));
        }
    }

    /* renamed from: com.carrefour.fid.android.product.presentation.ui.details.ProductDetailsFragment$c */
    public static final class C27749c implements ProductFlagListView.C27921a {

        /* renamed from: a */
        public final /* synthetic */ ProductDetailsFragment f67295a;

        public C27749c(ProductDetailsFragment productDetailsFragment) {
            this.f67295a = productDetailsFragment;
        }

        /* renamed from: a */
        public void mo80597a(@C12579k OfferFlag offerFlag) {
            Intrinsics.checkNotNullParameter(offerFlag, "flag");
            this.f67295a.mo80561J1(offerFlag);
        }
    }

    public ProductDetailsFragment() {
        super(C277461.f67293a);
        C11677z b = C10864b0.m38747b(LazyThreadSafetyMode.NONE, new ProductDetailsFragment$special$$inlined$viewModels$default$2(new ProductDetailsFragment$special$$inlined$viewModels$default$1(this)));
        this.f67288v = FragmentViewModelLazyKt.m89923h(this, C11342l0.m43547d(ProductDetailsViewModel.class), new ProductDetailsFragment$special$$inlined$viewModels$default$3(b), new ProductDetailsFragment$special$$inlined$viewModels$default$4((C11289a) null, b), new ProductDetailsFragment$special$$inlined$viewModels$default$5(this, b));
        this.f67289w = C10864b0.m38748c(ProductDetailsFragment$productImageAdapter$2.f67308f);
        this.f67291y = new C27748b(this);
        this.f67292z = new ProductDetailsFragment$componentHolderCallback$1(this);
    }

    /* renamed from: O1 */
    public static final void m116580O1(ProductDetailsFragment productDetailsFragment, Offer offer, View view) {
        Intrinsics.checkNotNullParameter(productDetailsFragment, "this$0");
        Intrinsics.checkNotNullParameter(offer, "$offer");
        boolean isActivated = view.isActivated();
        productDetailsFragment.mo80579m1().sendIntent(new C28135b.C28151c.C28153b(view.isActivated(), C38036a.m156827a(offer.mo118010S()), false, 4, (DefaultConstructorMarker) null));
        if (isActivated) {
            productDetailsFragment.mo80579m1().mo80283j(offer);
        } else {
            productDetailsFragment.mo80579m1().mo80281d(offer);
        }
    }

    /* renamed from: P1 */
    public static final void m116581P1(ProductDetailsFragment productDetailsFragment, View view) {
        Intrinsics.checkNotNullParameter(productDetailsFragment, "this$0");
        productDetailsFragment.requireActivity().onBackPressed();
    }

    /* renamed from: Q1 */
    public static final void m116583Q1(ProductDetailsFragment productDetailsFragment, View view) {
        Intrinsics.checkNotNullParameter(productDetailsFragment, "this$0");
        TextView textView = productDetailsFragment.mo80574i1().f66753b;
        C11723c2 unused = C12038j.m48061f(C19501x.m90847a(productDetailsFragment), (CoroutineContext) null, (CoroutineStart) null, new ProductDetailsFragment$updateListeners$5$1$1$1(productDetailsFragment.mo80573h1().getRoot(), textView, (C11045c<? super ProductDetailsFragment$updateListeners$5$1$1$1>) null), 3, (Object) null);
    }

    /* renamed from: R1 */
    public static final void m116585R1(ProductDetailsFragment productDetailsFragment, View view) {
        Intrinsics.checkNotNullParameter(productDetailsFragment, "this$0");
        productDetailsFragment.mo80579m1().mo80278S();
        String string = productDetailsFragment.getString(C27609f.C27627r.general_information);
        Intrinsics.checkNotNullExpressionValue(string, "getString(R.string.general_information)");
        String string2 = productDetailsFragment.getString(C27609f.C27627r.customer_dialog_text);
        Intrinsics.checkNotNullExpressionValue(string2, "getString(R.string.customer_dialog_text)");
        FragmentKt.m118828p(productDetailsFragment, string, string2, new ProductDetailsFragment$updateListeners$6$1(productDetailsFragment));
    }

    /* renamed from: S1 */
    public static final void m116587S1(ProductDetailsFragment productDetailsFragment, Offer offer, View view) {
        Intrinsics.checkNotNullParameter(productDetailsFragment, "this$0");
        Intrinsics.checkNotNullParameter(offer, "$offer");
        String string = productDetailsFragment.getString(C27609f.C27627r.pdp_variable_weight);
        String string2 = productDetailsFragment.getString(C27609f.C27627r.pdp_variable_weight_pop_up_message, offer.mo118013V());
        int i = C27609f.C27617h.ds_ic_variable_weight;
        String string3 = productDetailsFragment.getString(C27609f.C27627r.general_i_understand);
        Intrinsics.checkNotNullExpressionValue(string, "getString(R.string.pdp_variable_weight)");
        Intrinsics.checkNotNullExpressionValue(string2, "getString(R.string.pdp_v…riableWeightSafetyMargin)");
        FragmentKt.m118838z(productDetailsFragment, string, string2, (String) null, (C11289a) null, string3, false, (C11289a) null, (String) null, (C11289a) null, (C11289a) null, (Drawable) null, i, 2028, (Object) null);
    }

    /* renamed from: t1 */
    public static final void m116600t1(ProductDetailsFragment productDetailsFragment, View view) {
        Intrinsics.checkNotNullParameter(productDetailsFragment, "this$0");
        C19736g.m91827a(productDetailsFragment).mo58156s0();
    }

    /* renamed from: A1 */
    public final void mo80552A1(Offer offer) {
        String I = offer.mo118000I();
        if (I != null) {
            mo80574i1().f66755d.mo81279u(I);
            mo80574i1().f66753b.setVisibility(0);
            mo80574i1().f66754c.setVisibility(0);
            mo80574i1().f66756e.setVisibility(0);
            mo80574i1().f66754c.setText(getString(C27609f.C27627r.freshness_guarantee_description, I));
        }
    }

    /* renamed from: B1 */
    public final void mo80553B1(Offer offer) {
        C27774e l1 = mo80578l1();
        l1.mo80711r(offer.mo118010S().mo118416Q());
        l1.mo80710q(this.f67291y);
        RecyclerView recyclerView = mo80574i1().f66762k;
        recyclerView.setAdapter(mo80578l1());
        PageControlsComponent pageControlsComponent = mo80574i1().f66763l;
        Intrinsics.checkNotNullExpressionValue(recyclerView, "this");
        pageControlsComponent.mo113006u(recyclerView);
        recyclerView.mo59479G1(mo80571g1().mo80764h());
    }

    /* renamed from: C1 */
    public final void mo80554C1(Offer offer) {
        NutriscoreComponent.C37157a b = C27666h.m116403b(offer.mo118010S(), true, NutriscoreComponent.Size.LARGE);
        if (b != null) {
            mo80574i1().f66773v.mo112961a(b);
        }
    }

    /* renamed from: D1 */
    public final void mo80555D1(Offer offer) {
        mo80574i1().f66766o.setText(offer.mo118010S().mo118422W());
    }

    /* renamed from: E1 */
    public final void mo80556E1(Offer offer) {
        int i;
        mo80553B1(offer);
        TextView textView = mo80574i1().f66764m;
        ImageView imageView = mo80574i1().f66758g;
        Intrinsics.checkNotNullExpressionValue(imageView, "bindingOfferDetailsHeader.imageMention");
        LinearLayout linearLayout = mo80574i1().f66759h;
        Intrinsics.checkNotNullExpressionValue(linearLayout, "bindingOfferDetailsHeader.layoutMention");
        C27659c.m116368f(offer, textView, imageView, linearLayout);
        mo80559H1(offer);
        mo80555D1(offer);
        TextView textView2 = mo80574i1().f66765n;
        if (C11622t.isBlank(offer.mo118010S().mo118421V())) {
            i = 8;
        } else {
            textView2.setText(offer.mo118010S().mo118421V());
            i = 0;
        }
        textView2.setVisibility(i);
        TextView textView3 = mo80574i1().f66767p;
        Intrinsics.checkNotNullExpressionValue(textView3, "bindingOfferDetailsHeade…HolderProductDetailsPromo");
        mo80557F1(textView3, offer);
        mo80592z1(offer);
        mo80554C1(offer);
        mo80558G1(offer);
        TextView textView4 = mo80577k1().f66656e;
        Intrinsics.checkNotNullExpressionValue(textView4, "bindingProductDetailsBot…BottomProductDetailsPromo");
        mo80557F1(textView4, offer);
        TextView textView5 = mo80577k1().f66657f;
        Intrinsics.checkNotNullExpressionValue(textView5, "bindingProductDetailsBot…HolderProductDetailsPrice");
        TextView textView6 = mo80577k1().f66659h;
        Intrinsics.checkNotNullExpressionValue(textView6, "bindingProductDetailsBot…ProductDetailsWeightPrice");
        mo80587u1(textView5, textView6, offer);
        mo80566T1(offer);
        mo80552A1(offer);
        mo80567U1(offer);
        mo80564M1(offer);
        mo80569W1(offer);
        hideLoading();
        hideErrorView();
        mo80563L1(offer);
    }

    /* renamed from: F1 */
    public final void mo80557F1(TextView textView, Offer offer) {
        String str;
        PromoType A;
        OfferDiscountType k;
        int i = 8;
        if (!C27659c.m116365c(offer)) {
            textView.setVisibility(8);
            return;
        }
        if (C27659c.m116365c(offer)) {
            Discount T = offer.mo118011T();
            if (T != null) {
                str = T.mo117986x();
            } else {
                str = null;
            }
            textView.setText(str);
            Discount T2 = offer.mo118011T();
            i = 0;
            if (!(T2 == null || (A = T2.mo117953A()) == null || (k = C27659c.m116373k(A)) == null)) {
                textView.setTextColor(C17318d.m79723f(textView.getContext(), k.mo118121r()));
                textView.setCompoundDrawablesRelativeWithIntrinsicBounds(k.mo118122w(), 0, 0, 0);
                textView.setBackgroundTintList(ColorStateList.valueOf(C17318d.m79723f(textView.getContext(), k.mo118120q())));
            }
        }
        textView.setVisibility(i);
    }

    /* renamed from: G1 */
    public final void mo80558G1(Offer offer) {
        PromoType A;
        boolean z;
        Discount T = offer.mo118011T();
        if (T != null && (A = T.mo117953A()) != null) {
            C27653d.C27654a aVar = C27653d.f67180a;
            Context requireContext = requireContext();
            Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext()");
            String a = aVar.mo80352a(requireContext, A).mo80351a(offer);
            if (a == null || C11622t.isBlank(a)) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                mo80574i1().f66767p.setVisibility(0);
                mo80574i1().f66769r.setVisibility(0);
                mo80574i1().f66769r.setText(a);
            }
        }
    }

    /* renamed from: H1 */
    public final void mo80559H1(Offer offer) {
        mo80574i1().f66768q.setText(offer.mo118010S().mo118418S());
        Context context = getContext();
        if (context != null) {
            mo80574i1().f66768q.setContentDescription(C37106a.m152136a(offer.mo118010S().mo118418S(), context));
        }
    }

    /* renamed from: I1 */
    public final void mo80560I1() {
        EcoscoreView ecoscoreView = mo80574i1().f66772u;
        Intrinsics.checkNotNullExpressionValue(ecoscoreView, "bindingOfferDetailsHeader.viewHolderEcoscore");
        String string = getString(C27609f.C27627r.ecoscore);
        String string2 = getString(C27609f.C27627r.accessibility_ecoscore);
        ViewKt.m118994g(ecoscoreView, string + ". " + string2);
    }

    /* renamed from: J1 */
    public final void mo80561J1(OfferFlag offerFlag) {
        if (offerFlag.mo118128y() != 0 && offerFlag.mo118125q() != 0) {
            String string = getString(offerFlag.mo118128y());
            Intrinsics.checkNotNullExpressionValue(string, "getString(flag.titleResourceId)");
            String string2 = getString(offerFlag.mo118125q());
            Intrinsics.checkNotNullExpressionValue(string2, "getString(flag.descriptionResourceId)");
            FragmentKt.m118838z(this, string, string2, (String) null, (C11289a) null, getString(C27609f.C27627r.general_i_understand), false, (C11289a) null, (String) null, (C11289a) null, (C11289a) null, (Drawable) null, 0, 4076, (Object) null);
        }
    }

    /* renamed from: K1 */
    public final void mo80562K1(Offer offer) {
        int i;
        QuantityView quantityView = mo80577k1().f66655d;
        Intrinsics.checkNotNullExpressionValue(quantityView, "bindingProductDetailsBot…derProductDetailsQuantity");
        int i2 = 8;
        quantityView.setVisibility(8);
        ProgressBar progressBar = mo80577k1().f66654c;
        Intrinsics.checkNotNullExpressionValue(progressBar, "bindingProductDetailsBot…ctDetailsPurchaseProgress");
        if (offer.mo118019a0()) {
            i = 0;
        } else {
            i = 8;
        }
        progressBar.setVisibility(i);
        ImageButton imageButton = mo80577k1().f66653b;
        imageButton.setEnabled(true);
        if (offer.mo118019a0()) {
            i2 = 0;
        }
        imageButton.setVisibility(i2);
    }

    /* renamed from: L1 */
    public final void mo80563L1(Offer offer) {
        boolean z;
        if (offer.mo117995D() == OfferAvailability.AVAILABLE) {
            if (offer.mo118003L().length() > 0) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                mo80574i1().f66770s.setVisibility(0);
                mo80574i1().f66770s.setText(offer.mo118003L());
                return;
            }
        }
        mo80574i1().f66770s.setVisibility(8);
    }

    /* renamed from: M1 */
    public final void mo80564M1(Offer offer) {
        boolean z;
        TextView textView = mo80574i1().f66771t;
        String R = offer.mo118010S().mo118417R();
        if (R == null || C11622t.isBlank(R)) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            textView.setVisibility(8);
            return;
        }
        textView.setVisibility(0);
        textView.setText(offer.mo118010S().mo118417R());
    }

    /* renamed from: N1 */
    public final void mo80565N1(Offer offer) {
        QuantityView quantityView = mo80577k1().f66655d;
        quantityView.mo81308x(offer, offer.mo118023c0());
        ImageButton imageButton = quantityView.getViewBinding().f66715b;
        Intrinsics.checkNotNullExpressionValue(imageButton, "getViewBinding().buttonProductQuantityAdd");
        C11909g.m47412V0(C11909g.m47448f1(C11909g.m47391O0(ViewKt.m118997j(imageButton), C11768d1.m46783e()), new ProductDetailsFragment$updateListeners$1$1(this, quantityView, offer, (C11045c<? super ProductDetailsFragment$updateListeners$1$1>) null)), C19501x.m90847a(this));
        ImageButton imageButton2 = quantityView.getViewBinding().f66716c;
        Intrinsics.checkNotNullExpressionValue(imageButton2, "getViewBinding().buttonProductQuantityRemove");
        C11909g.m47412V0(C11909g.m47448f1(C11909g.m47391O0(ViewKt.m118997j(imageButton2), C11768d1.m46783e()), new ProductDetailsFragment$updateListeners$1$2(this, offer, quantityView, (C11045c<? super ProductDetailsFragment$updateListeners$1$2>) null)), C19501x.m90847a(this));
        ImageButton imageButton3 = mo80577k1().f66653b;
        Intrinsics.checkNotNullExpressionValue(imageButton3, "bindingProductDetailsBot…derProductDetailsPurchase");
        C11909g.m47412V0(C11909g.m47448f1(C11909g.m47391O0(ViewKt.m118997j(imageButton3), C11768d1.m46783e()), new ProductDetailsFragment$updateListeners$2(this, offer, (C11045c<? super ProductDetailsFragment$updateListeners$2>) null)), C19501x.m90847a(this));
        ImageButton imageButton4 = ((C27480c) getBinding()).f66626f.f66667c;
        imageButton4.setActivated(offer.mo118016Y());
        imageButton4.setEnabled(true);
        imageButton4.setOnClickListener(new C27802c(this, offer));
        ((C27480c) getBinding()).f66626f.f66668d.setOnClickListener(new C27803d(this));
        mo80574i1().f66755d.setOnClickListener(new C27804e(this));
        mo80574i1().f66772u.setOnClickListener(new C27805f(this));
        mo80577k1().f66660i.setOnClickListener(new C27806g(this, offer));
    }

    /* renamed from: T1 */
    public final void mo80566T1(Offer offer) {
        int i;
        TextView textView = mo80577k1().f66658g;
        if (!offer.mo118019a0() || !C27659c.m116365c(offer) || !C27659c.m116366d(offer)) {
            i = 8;
        } else {
            Intrinsics.checkNotNullExpressionValue(textView, "updatePriceStandardStrike$lambda$8");
            TextViewKt.m118962m(textView, Double.valueOf(offer.mo118009R().mo118172m()));
            TextViewKt.m118965p(textView);
            String valueOf = String.valueOf(offer.mo118009R().mo118172m());
            Context context = textView.getContext();
            Intrinsics.checkNotNullExpressionValue(context, C9175a.f24932Y);
            textView.setContentDescription(C37106a.m152137b(valueOf, context));
            i = 0;
        }
        textView.setVisibility(i);
    }

    /* renamed from: U1 */
    public final void mo80567U1(Offer offer) {
        mo80568V1(offer);
        ProgressBar progressBar = mo80577k1().f66654c;
        Intrinsics.checkNotNullExpressionValue(progressBar, "bindingProductDetailsBot…ctDetailsPurchaseProgress");
        progressBar.setVisibility(8);
        mo80577k1().f66655d.mo81308x(offer, offer.mo118023c0());
    }

    /* renamed from: V1 */
    public final void mo80568V1(Offer offer) {
        QuantityView quantityView = mo80577k1().f66655d;
        Intrinsics.checkNotNullExpressionValue(quantityView, "bindingProductDetailsBot…derProductDetailsQuantity");
        int i = 0;
        QuantityView.m117255y(quantityView, offer, false, 2, (Object) null);
        ImageButton imageButton = mo80577k1().f66653b;
        if (!offer.mo118019a0() || offer.mo118023c0()) {
            i = 4;
        }
        imageButton.setVisibility(i);
        imageButton.setEnabled(offer.mo118019a0());
    }

    /* renamed from: W1 */
    public final void mo80569W1(Offer offer) {
        LinearLayout linearLayout = mo80577k1().f66660i;
        int i = 8;
        if (offer.mo118028e0()) {
            if (offer.mo118019a0() && C27659c.m116365c(offer) && C27659c.m116366d(offer)) {
                Intrinsics.checkNotNullExpressionValue(linearLayout, "updateVariableWeight$lambda$7");
                ViewKt.m118983H(linearLayout, 8, 20, 0, 0);
            }
            i = 0;
        }
        linearLayout.setVisibility(i);
    }

    @C12579k
    public ViewStub errorMessageLayout() {
        ViewStub viewStub = ((C27480c) getBinding()).f66625e;
        Intrinsics.checkNotNullExpressionValue(viewStub, "binding.stubOfferDetailsError");
        return viewStub;
    }

    /* renamed from: f1 */
    public final void mo80570f1() {
        mo80577k1().f66653b.setEnabled(false);
        ((C27480c) getBinding()).f66626f.f66667c.setEnabled(false);
        mo80577k1().f66655d.setEnabled(false);
    }

    /* renamed from: g1 */
    public final C27808i mo80571g1() {
        return (C27808i) this.f67287g.getValue();
    }

    @C12579k
    public final C28796c getNavigator() {
        C28796c cVar = this.f67286f;
        if (cVar != null) {
            return cVar;
        }
        Intrinsics.throwUninitializedPropertyAccessException("navigator");
        return null;
    }

    /* renamed from: h1 */
    public final C27507t mo80573h1() {
        C27507t tVar = ((C27480c) getBinding()).f66622b;
        Intrinsics.checkNotNullExpressionValue(tVar, "binding.includePdpDetails");
        return tVar;
    }

    /* renamed from: i1 */
    public final C27510w mo80574i1() {
        C27510w wVar = ((C27480c) getBinding()).f66622b.f66742b;
        Intrinsics.checkNotNullExpressionValue(wVar, "binding.includePdpDetails.offerDetailsHeader");
        return wVar;
    }

    public final void initUi() {
        ((C27480c) getBinding()).f66626f.f66668d.setOnClickListener(new C27807h(this));
        Context context = getContext();
        if (context != null) {
            Resources resources = context.getResources();
            Intrinsics.checkNotNullExpressionValue(resources, "it.resources");
            Resources.Theme theme = context.getTheme();
            Intrinsics.checkNotNullExpressionValue(theme, "it.theme");
            C37353b bVar = new C37353b(resources, theme, (C37390r) null, 4, (DefaultConstructorMarker) null);
            new C20227z().mo60274b(mo80574i1().f66762k);
            this.f67290x = new C37370b(bVar);
            mo80576j1().f66776b.setAdapter(this.f67290x);
        }
        RecyclerView recyclerView = mo80573h1().f66744d;
        recyclerView.setLayoutManager(new LinearLayoutManager(recyclerView.getContext(), 1, false));
        recyclerView.setHasFixedSize(false);
        mo80573h1().f66744d.setAdapter(new C27771c(this.f67292z));
    }

    /* renamed from: j1 */
    public final C27511x mo80576j1() {
        C27511x xVar = ((C27480c) getBinding()).f66622b.f66743c;
        Intrinsics.checkNotNullExpressionValue(xVar, "binding.includePdpDetail…rDetailsSponsoredProducts");
        return xVar;
    }

    /* renamed from: k1 */
    public final C27485e0 mo80577k1() {
        C27485e0 e0Var = ((C27480c) getBinding()).f66624d;
        Intrinsics.checkNotNullExpressionValue(e0Var, "binding.productDetailsBottomSheet");
        return e0Var;
    }

    /* renamed from: l1 */
    public final C27774e mo80578l1() {
        return (C27774e) this.f67289w.getValue();
    }

    /* renamed from: m1 */
    public final ProductDetailsViewModel mo80579m1() {
        return (ProductDetailsViewModel) this.f67288v.getValue();
    }

    /* renamed from: n1 */
    public final void mo80580n1(List<C38114b> list, String str) {
        ProductCardSComponent.C37338a aVar;
        if (!list.isEmpty()) {
            mo80576j1().getRoot().setVisibility(0);
            C37370b bVar = this.f67290x;
            if (bVar != null) {
                ArrayList arrayList = new ArrayList();
                for (C38114b bVar2 : list) {
                    PlpOffer i = C27662e.m116389i(bVar2.mo118842j());
                    if (i == null) {
                        aVar = null;
                    } else {
                        Resources resources = getResources();
                        Intrinsics.checkNotNullExpressionValue(resources, "resources");
                        aVar = PlpItemDataToProductCardSMapperKt.m116272c(bVar2, resources, new ProductDetailsFragment$handleCriteoResult$1$1(bVar2, i, str, this), (C11300l) null, new ProductDetailsFragment$handleCriteoResult$1$2(this, bVar2), new ProductDetailsFragment$handleCriteoResult$1$3(this, bVar2, i), ProductDetailsFragment$handleCriteoResult$1$4.f67305f, ProductDetailsFragment$handleCriteoResult$1$5.f67306f, ProductDetailsFragment$handleCriteoResult$1$6.f67307f, false, false, false, false, (C11289a) null, 7940, (Object) null);
                    }
                    if (aVar != null) {
                        arrayList.add(aVar);
                    }
                }
                bVar.setList(arrayList);
                return;
            }
            return;
        }
        mo80576j1().getRoot().setVisibility(8);
    }

    /* renamed from: o1 */
    public final void mo80581o1(List<C38115c> list, boolean z) {
        if (!z) {
            ProgressBar progressBar = mo80577k1().f66654c;
            Intrinsics.checkNotNullExpressionValue(progressBar, "bindingProductDetailsBot…ctDetailsPurchaseProgress");
            progressBar.setVisibility(8);
        }
        if (list.isEmpty()) {
            MixingProductDetailsView mixingProductDetailsView = ((C27480c) getBinding()).f66622b.f66742b.f66760i;
            Intrinsics.checkNotNullExpressionValue(mixingProductDetailsView, "binding.includePdpDetail…sHeader.mixingProductView");
            mixingProductDetailsView.setVisibility(8);
            return;
        }
        MixingProductDetailsView mixingProductDetailsView2 = ((C27480c) getBinding()).f66622b.f66742b.f66760i;
        Intrinsics.checkNotNullExpressionValue(mixingProductDetailsView2, "binding.includePdpDetail…sHeader.mixingProductView");
        mixingProductDetailsView2.setVisibility(0);
        ((C27480c) getBinding()).f66622b.f66742b.f66760i.mo81283F(list);
        ((C27480c) getBinding()).f66622b.f66742b.f66760i.setOnMoreFlavorsClickListener(new ProductDetailsFragment$handleMixinResult$1(this));
    }

    public void onViewCreated(@C12579k View view, @C12580l Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, C40383c.f102945c);
        super.onViewCreated(view, bundle);
        C19232h requireActivity = requireActivity();
        Intrinsics.checkNotNullExpressionValue(requireActivity, "requireActivity()");
        ActivityKt.m118697g(requireActivity);
        initUi();
        mo80560I1();
        ProductDetailsViewModel m1 = mo80579m1();
        C19499w viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "viewLifecycleOwner");
        C11723c2 unused = C12038j.m48061f(C19501x.m90847a(viewLifecycleOwner), (CoroutineContext) null, (CoroutineStart) null, new ProductDetailsFragment$onViewCreated$$inlined$processState$1(this, m1, (C11045c) null, this), 3, (Object) null);
        ProductDetailsViewModel m12 = mo80579m1();
        C19499w viewLifecycleOwner2 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner2, "viewLifecycleOwner");
        C11723c2 unused2 = C12038j.m48061f(C19501x.m90847a(viewLifecycleOwner2), (CoroutineContext) null, (CoroutineStart) null, new ProductDetailsFragment$onViewCreated$$inlined$processEvent$1(this, m12, (C11045c) null, this), 3, (Object) null);
        OfferIdentifier g = mo80571g1().mo80763g();
        if (g != null) {
            mo80579m1().sendIntent(new C28135b.C28151c.C28155d(g, false, 2, (DefaultConstructorMarker) null));
        }
    }

    /* renamed from: p1 */
    public final void mo80582p1(Offer offer) {
        mo80556E1(offer);
        mo80577k1().f66655d.mo81307v(true);
        ProductDetailsViewModel m1 = mo80579m1();
        m1.mo80277B(offer);
        m1.sendIntent(new C28135b.C28151c.C28154c(offer));
        ProductDetailsModel c = C27665g.m116401c(offer.mo118010S());
        if (true ^ c.mo80307f().isEmpty()) {
            mo80590x1(c);
        }
        mo80591y1(c);
        mo80565N1(offer);
    }

    /* renamed from: q1 */
    public final void mo80583q1(Throwable th) {
        boolean z;
        Throwable th2;
        Throwable th3;
        Throwable th4 = th;
        ProgressBar progressBar = mo80577k1().f66654c;
        Intrinsics.checkNotNullExpressionValue(progressBar, "bindingProductDetailsBot…ctDetailsPurchaseProgress");
        progressBar.setVisibility(8);
        if (th4 instanceof RequireSignInThrowable) {
            getNavigator().mo83841q(this);
        } else if (th4 instanceof BasketItemMaxQuantityReachedThrowable) {
            NotificationComponent.Variant variant = NotificationComponent.Variant.WARNING;
            String string = getString(C27609f.C27627r.fec_basket_module_category_limit_excecced);
            Intrinsics.checkNotNullExpressionValue(string, "getString(R.string.fec_b…_category_limit_excecced)");
            FragmentKt.m118811B(this, variant, string, (String) null, (String) null, (C11289a) null, false, false, (Integer) null, (Integer) null, (Integer) null, (Integer) null, 2044, (Object) null);
        } else if (th4 instanceof CategoryLimitationExceededThrowable) {
            NotificationComponent.Variant variant2 = NotificationComponent.Variant.WARNING;
            CategoryLimit a = ((CategoryLimitationExceededThrowable) th4).mo114268a();
            Context requireContext = requireContext();
            Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext()");
            FragmentKt.m118811B(this, variant2, C27657a.m116359a(a, requireContext), (String) null, (String) null, (C11289a) null, false, false, (Integer) null, (Integer) null, (Integer) null, (Integer) null, 2044, (Object) null);
        } else if (th4 instanceof BasketItemQuantityExceededThrowable) {
            C28935i iVar = C28935i.f70940a;
            String message = ((BasketItemQuantityExceededThrowable) th4).getMessage();
            Intrinsics.checkNotNull(message, "null cannot be cast to non-null type kotlin.String");
            C28935i.m119706i(iVar, message, (Throwable) null, 0, 6, (Object) null);
            NotificationComponent.Variant variant3 = NotificationComponent.Variant.ERROR;
            String string2 = getString(C27609f.C27627r.fec_basket_module_product_quantity_excecced);
            Intrinsics.checkNotNullExpressionValue(string2, "getString(R.string.fec_b…roduct_quantity_excecced)");
            FragmentKt.m118811B(this, variant3, string2, (String) null, (String) null, (C11289a) null, false, false, (Integer) null, (Integer) null, (Integer) null, (Integer) null, 2044, (Object) null);
        } else if (th4 instanceof BasketThrowable) {
            NotificationComponent.Variant variant4 = NotificationComponent.Variant.ERROR;
            String string3 = getString(((BasketThrowable) th4).mo114267a().mo114265q());
            Intrinsics.checkNotNullExpressionValue(string3, "getString(exception.error.resourceId)");
            FragmentKt.m118811B(this, variant4, string3, (String) null, (String) null, (C11289a) null, false, false, (Integer) null, (Integer) null, (Integer) null, (Integer) null, 2044, (Object) null);
        } else if (th4 instanceof ShoppingListThrowable) {
            C28935i iVar2 = C28935i.f70940a;
            ShoppingListThrowable shoppingListThrowable = (ShoppingListThrowable) th4;
            String message2 = shoppingListThrowable.getMessage();
            Intrinsics.checkNotNull(message2, "null cannot be cast to non-null type kotlin.String");
            Throwable cause = shoppingListThrowable.getCause();
            if (cause == null) {
                th3 = th4;
            } else {
                th3 = cause;
            }
            C28935i.m119705e(iVar2, message2, th3, 0, 4, (Object) null);
            QuantityView quantityView = mo80577k1().f66655d;
            quantityView.setEnabled(true);
            quantityView.mo81307v(false);
            NotificationComponent.Variant variant5 = NotificationComponent.Variant.WARNING;
            String string4 = getString(C27609f.C27627r.general_error_parameters_server_not_responding_03);
            Intrinsics.checkNotNullExpressionValue(string4, "getString(R.string.gener…server_not_responding_03)");
            FragmentKt.m118811B(this, variant5, string4, (String) null, (String) null, (C11289a) null, false, false, (Integer) null, (Integer) null, (Integer) null, (Integer) null, 2044, (Object) null);
        } else {
            if (th4 instanceof BasketClosedStoreThrowable) {
                z = true;
            } else {
                z = th4 instanceof BasketExpiredFacilityStoreIdThrowable;
            }
            if (z) {
                C19232h requireActivity = requireActivity();
                Intrinsics.checkNotNullExpressionValue(requireActivity, "requireActivity()");
                String string5 = getString(C27609f.C27627r.basket_error_closed_store);
                Intrinsics.checkNotNullExpressionValue(string5, "getString(R.string.basket_error_closed_store)");
                ActivityKt.m118689B(requireActivity, true, string5);
                FragmentKt.m118835w(this, (String) null, new ProductDetailsFragment$handleProductDetailsError$2(this), 1, (Object) null);
                getNavigator().mo83826b(this);
            } else if (th4 instanceof RequireServiceSelectionThrowable) {
                FragmentKt.m118835w(this, (String) null, new ProductDetailsFragment$handleProductDetailsError$3(this), 1, (Object) null);
                getNavigator().mo83826b(this);
            } else if (th4 instanceof NetworkException) {
                C28935i iVar3 = C28935i.f70940a;
                NetworkException networkException = (NetworkException) th4;
                String message3 = networkException.getMessage();
                Intrinsics.checkNotNull(message3, "null cannot be cast to non-null type kotlin.String");
                Throwable cause2 = networkException.getCause();
                if (cause2 == null) {
                    th2 = th4;
                } else {
                    th2 = cause2;
                }
                C28935i.m119705e(iVar3, message3, th2, 0, 4, (Object) null);
                NotificationComponent.Variant variant6 = NotificationComponent.Variant.ERROR;
                String string6 = getString(C27609f.C27627r.general_error_no_network_message);
                Intrinsics.checkNotNullExpressionValue(string6, "getString(R.string.gener…error_no_network_message)");
                FragmentKt.m118811B(this, variant6, string6, (String) null, (String) null, (C11289a) null, false, false, (Integer) null, (Integer) null, (Integer) null, (Integer) null, 2044, (Object) null);
            } else if (th4 != null) {
                Drawable i = C17318d.m79726i(requireContext(), C27609f.C27617h.ic_basket_pb);
                String string7 = getString(C27609f.C27627r.general_error_parameters_server_not_responding_03);
                Intrinsics.checkNotNullExpressionValue(string7, "getString(R.string.gener…server_not_responding_03)");
                C28500r.C28501a.m118421c(this, new MessageComponent.C37154a(i, string7, (String) null, getString(C27609f.C27627r.general_try_again), (String) null, (String) null, MessageComponent.Type.ERROR, 0, (Drawable) null, C22132b.f56831b, (DefaultConstructorMarker) null), (C11289a) null, (C11289a) null, (C11289a) null, 14, (Object) null);
                C28500r.C28501a.m118423e(this, false, 1, (Object) null);
            }
        }
    }

    /* renamed from: r1 */
    public final void mo80584r1(C28135b.C28140b.C28146f fVar) {
        if (fVar instanceof C28135b.C28140b.C28146f.C28149c) {
            ((C27480c) getBinding()).f66626f.f66666b.setVisibility(0);
            ((C27480c) getBinding()).f66626f.f66667c.setVisibility(4);
        } else if (Intrinsics.areEqual((Object) fVar, (Object) C28135b.C28140b.C28146f.C28147a.f68156c)) {
            ((C27480c) getBinding()).f66626f.f66667c.setActivated(false);
            ((C27480c) getBinding()).f66626f.f66666b.setVisibility(4);
            ((C27480c) getBinding()).f66626f.f66667c.setVisibility(0);
        } else if (Intrinsics.areEqual((Object) fVar, (Object) C28135b.C28140b.C28146f.C28148b.f68158c)) {
            ((C27480c) getBinding()).f66626f.f66667c.setActivated(true);
            ((C27480c) getBinding()).f66626f.f66666b.setVisibility(4);
            ((C27480c) getBinding()).f66626f.f66667c.setVisibility(0);
        }
    }

    /* renamed from: s1 */
    public final void mo80585s1(Offer offer) {
        QuantityView quantityView = mo80577k1().f66655d;
        Intrinsics.checkNotNullExpressionValue(quantityView, "bindingProductDetailsBot…derProductDetailsQuantity");
        boolean z = false;
        QuantityView.m117255y(quantityView, offer, false, 2, (Object) null);
        ProgressBar progressBar = mo80577k1().f66654c;
        Intrinsics.checkNotNullExpressionValue(progressBar, "bindingProductDetailsBot…ctDetailsPurchaseProgress");
        int i = 8;
        progressBar.setVisibility(8);
        ImageButton imageButton = mo80577k1().f66653b;
        imageButton.setEnabled(true);
        if (offer.mo118012U() <= 0) {
            i = 0;
        }
        imageButton.setVisibility(i);
        ImageButton imageButton2 = ((C27480c) getBinding()).f66626f.f66667c;
        if (offer.mo118016Y()) {
            z = true;
        }
        imageButton2.setActivated(z);
        imageButton2.setEnabled(true);
        if (((C27480c) getBinding()).f66623c.mo81295F(offer)) {
            mo80579m1().mo80279U();
        }
        mo80565N1(offer);
    }

    public final void setNavigator(@C12579k C28796c cVar) {
        Intrinsics.checkNotNullParameter(cVar, "<set-?>");
        this.f67286f = cVar;
    }

    /* renamed from: u1 */
    public final void mo80587u1(TextView textView, TextView textView2, Offer offer) {
        PromoType A;
        OfferDiscountType k;
        if (!offer.mo118019a0()) {
            textView.setVisibility(8);
            textView2.setVisibility(8);
            return;
        }
        String a = C27659c.m116363a(offer);
        TextViewKt.m118963n(textView, a);
        Context context = textView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, C9175a.f24932Y);
        textView.setContentDescription(C37106a.m152137b(a, context));
        if (offer.mo118010S().mo118412M().contains(OfferFlag.ORGANIC)) {
            textView.setTextColor(C17318d.m79723f(textView.getContext(), C27609f.C27615f.ds_primary_dark));
            textView.setBackgroundTintList(ColorStateList.valueOf(C17318d.m79723f(textView.getContext(), C27609f.C27615f.blue_memo)));
        } else if (C27659c.m116365c(offer)) {
            Discount T = offer.mo118011T();
            if (!(T == null || (A = T.mo117953A()) == null || (k = C27659c.m116373k(A)) == null)) {
                textView.setTextColor(C17318d.m79723f(textView.getContext(), k.mo118121r()));
                textView.setBackgroundTintList(ColorStateList.valueOf(C17318d.m79723f(textView.getContext(), k.mo118120q())));
            }
        } else {
            textView.setTextColor(C17318d.m79723f(textView.getContext(), C27609f.C27615f.ds_primary_dark));
            textView.setBackgroundTintList(ColorStateList.valueOf(C17318d.m79723f(textView.getContext(), 17170445)));
        }
        textView.setVisibility(0);
        textView2.setText(offer.mo118009R().mo118170k());
        textView2.setVisibility(0);
        String k2 = offer.mo118009R().mo118170k();
        Context context2 = textView2.getContext();
        Intrinsics.checkNotNullExpressionValue(context2, C9175a.f24932Y);
        textView2.setContentDescription(C37106a.m152138c(k2, context2));
    }

    /* renamed from: v1 */
    public final void mo80588v1(C28135b.C28136a aVar) {
        if (aVar instanceof C28135b.C28136a.C28138b) {
            FragmentKt.m118823k(this, C27810j.f67405a.mo80789c(((C28135b.C28136a.C28138b) aVar).mo81770d()));
        } else if (aVar instanceof C28135b.C28136a.C28137a) {
            mo80583q1(((C28135b.C28136a.C28137a) aVar).mo81764d());
        } else if (aVar instanceof C28135b.C28136a.C28139c) {
            C28135b.C28136a.C28139c cVar = (C28135b.C28136a.C28139c) aVar;
            MixingProductsBottomSheetFragment.f67233P0.mo80503a(cVar.mo81777e(), cVar.mo81779f()).show(requireActivity().mo57175g0(), (String) null);
        }
    }

    /* renamed from: w1 */
    public final void mo80589w1(C28135b.C28140b bVar) {
        if (bVar instanceof C28135b.C28140b.C28145e) {
            mo80582p1(((C28135b.C28140b.C28145e) bVar).mo81801h());
        } else if (bVar instanceof C28135b.C28140b.C28150g) {
            mo80585s1(((C28135b.C28140b.C28150g) bVar).mo81807h());
        } else if (bVar instanceof C28135b.C28140b.C28144d) {
            C28135b.C28140b.C28144d dVar = (C28135b.C28140b.C28144d) bVar;
            mo80581o1(dVar.mo81795i(), dVar.mo81796j());
        } else if (bVar instanceof C28135b.C28140b.C28141a) {
            C28135b.C28140b.C28141a aVar = (C28135b.C28140b.C28141a) bVar;
            mo80580n1(aVar.mo81788j(), aVar.mo81787i());
        } else if (bVar instanceof C28135b.C28140b.C28146f) {
            mo80584r1((C28135b.C28140b.C28146f) bVar);
        }
    }

    /* renamed from: x1 */
    public final void mo80590x1(ProductDetailsModel productDetailsModel) {
        RecyclerView.Adapter adapter = mo80573h1().f66744d.getAdapter();
        Intrinsics.checkNotNull(adapter, "null cannot be cast to non-null type com.carrefour.fid.android.product.presentation.ui.details.adapter.ProductComponentAdapter");
        ((C27771c) adapter).mo83369D(productDetailsModel.mo80307f());
    }

    /* renamed from: y1 */
    public final void mo80591y1(ProductDetailsModel productDetailsModel) {
        ProductEcoScore g = productDetailsModel.mo80308g();
        if (g != null) {
            mo80574i1().f66772u.setView(Integer.valueOf(g.mo80317q()).intValue());
        }
    }

    /* renamed from: z1 */
    public final void mo80592z1(Offer offer) {
        mo80574i1().f66757f.mo81293b(CollectionsKt___CollectionsKt.m40497E5(offer.mo118010S().mo118412M(), 6), new C27749c(this), C27609f.C27616g.ds_sizing_xl, C27609f.C27616g.ds_spacing_xxs);
    }
}
