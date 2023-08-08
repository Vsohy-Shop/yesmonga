package com.carrefour.fid.android.presentation.p035ui.product.mixing;

import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import androidx.compose.runtime.internal.C8567o;
import androidx.core.content.C17318d;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.C19499w;
import androidx.lifecycle.C19501x;
import androidx.recyclerview.widget.RecyclerView;
import com.carrefour.fid.android.R;
import com.carrefour.fid.android.app.extensions.FragmentExtensionKt;
import com.carrefour.fid.android.databinding.C36825s6;
import com.carrefour.fid.android.design.components.widgets.NotificationComponent;
import com.carrefour.fid.android.design.components.widgets.productcard.C37390r;
import com.carrefour.fid.android.design.components.widgets.productcard.list.C37370b;
import com.carrefour.fid.android.design.components.widgets.productcard.list.C37373c;
import com.carrefour.fid.android.domain.models.OfferDiscountDomain;
import com.carrefour.fid.android.domain.models.basket.BasketType;
import com.carrefour.fid.android.presentation.models.OfferModel;
import com.carrefour.fid.android.presentation.models.OfferProductModel;
import com.carrefour.fid.android.presentation.models.ProductListSettingsModel;
import com.carrefour.fid.android.presentation.models.extension.OfferProductModelKt;
import com.carrefour.fid.android.presentation.models.mapper.C38510j;
import com.carrefour.fid.android.presentation.p035ui.product.quantity.QuantityBackDropFragment;
import com.carrefour.fid.android.presentation.viewmodels.offer.state.C26636c;
import com.carrefour.fid.android.presentation.viewmodels.product.mixing.C27224a;
import com.carrefour.fid.android.presentation.viewmodels.product.mixing.MixingProductsBottomSheetViewModel;
import com.google.android.gms.analytics.ecommerce.C40383c;
import dagger.hilt.android.C10164b;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.inject.Inject;
import kotlin.C10864b0;
import kotlin.C11076d0;
import kotlin.C11677z;
import kotlin.LazyThreadSafetyMode;
import kotlin.collections.C10978t;
import kotlin.collections.CollectionsKt__CollectionsKt;
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
@C11076d0(mo22515d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u0000 I2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0003JKLB\u0007¢\u0006\u0004\bG\u0010HJ\u001a\u0010\b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00032\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0016J\u0010\u0010\u000b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0002J\u0018\u0010\u000f\u001a\u00020\u00072\u000e\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\fH\u0002J\u0018\u0010\u0014\u001a\u00020\u00072\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0002J\u0018\u0010\u0015\u001a\u00020\u00072\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0002J\u0010\u0010\u0016\u001a\u00020\u00072\u0006\u0010\u0011\u001a\u00020\u0010H\u0002J\u0016\u0010\u0018\u001a\u00020\u00072\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00100\fH\u0002J\u0016\u0010\u001a\u001a\u00020\u00072\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00190\fH\u0002J\b\u0010\u001b\u001a\u00020\u0007H\u0002J\b\u0010\u001c\u001a\u00020\u0007H\u0002J\b\u0010\u001d\u001a\u00020\u0007H\u0002J\u0012\u0010 \u001a\u00020\u00072\b\u0010\u001f\u001a\u0004\u0018\u00010\u001eH\u0002R\"\u0010(\u001a\u00020!8\u0006@\u0006X.¢\u0006\u0012\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%\"\u0004\b&\u0010'R\u001b\u0010.\u001a\u00020)8BX\u0002¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-R\u0018\u00102\u001a\u0004\u0018\u00010/8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b0\u00101R\u0014\u00106\u001a\u0002038BX\u0004¢\u0006\u0006\u001a\u0004\b4\u00105R\u0014\u0010:\u001a\u0002078BX\u0004¢\u0006\u0006\u001a\u0004\b8\u00109R\u0014\u0010>\u001a\u00020;8BX\u0004¢\u0006\u0006\u001a\u0004\b<\u0010=R\u0014\u0010B\u001a\u00020?8BX\u0004¢\u0006\u0006\u001a\u0004\b@\u0010AR\u0014\u0010F\u001a\u00020C8BX\u0004¢\u0006\u0006\u001a\u0004\bD\u0010E¨\u0006M"}, mo22516d2 = {"Lcom/carrefour/fid/android/presentation/ui/product/mixing/MixingProductsBottomSheetDialogFragment;", "Lcom/carrefour/fid/android/design/components/widgets/a;", "Lcom/carrefour/fid/android/databinding/s6;", "Landroid/view/View;", "view", "Landroid/os/Bundle;", "savedInstanceState", "Lkotlin/d2;", "onViewCreated", "Lcom/carrefour/fid/android/presentation/viewmodels/offer/state/c;", "state", "m1", "", "", "gtinsList", "d1", "Lcom/carrefour/fid/android/presentation/models/OfferProductModel;", "offer", "", "productPosition", "o0", "J", "k1", "offerList", "h1", "Lcom/carrefour/fid/android/presentation/models/OfferModel;", "l1", "i1", "q1", "o1", "", "exception", "j1", "Lcom/carrefour/fid/android/presentation/viewmodels/product/mixing/a;", "f", "Lcom/carrefour/fid/android/presentation/viewmodels/product/mixing/a;", "Z0", "()Lcom/carrefour/fid/android/presentation/viewmodels/product/mixing/a;", "n1", "(Lcom/carrefour/fid/android/presentation/viewmodels/product/mixing/a;)V", "analyticsViewModel", "Lcom/carrefour/fid/android/presentation/viewmodels/product/mixing/MixingProductsBottomSheetViewModel;", "g", "Lkotlin/z;", "g1", "()Lcom/carrefour/fid/android/presentation/viewmodels/product/mixing/MixingProductsBottomSheetViewModel;", "viewModel", "Lcom/carrefour/fid/android/design/components/widgets/productcard/list/b;", "v", "Lcom/carrefour/fid/android/design/components/widgets/productcard/list/b;", "adapter", "Landroid/widget/TextView;", "e1", "()Landroid/widget/TextView;", "titleTextView", "Lcom/carrefour/fid/android/design/components/widgets/NotificationComponent;", "c1", "()Lcom/carrefour/fid/android/design/components/widgets/NotificationComponent;", "notificationComponent", "Landroidx/recyclerview/widget/RecyclerView;", "b1", "()Landroidx/recyclerview/widget/RecyclerView;", "listProducts", "Lcom/carrefour/fid/android/presentation/ui/product/mixing/MixingProductsBottomSheetDialogFragment$ParentScreen;", "a1", "()Lcom/carrefour/fid/android/presentation/ui/product/mixing/MixingProductsBottomSheetDialogFragment$ParentScreen;", "from", "Lcom/carrefour/fid/android/presentation/ui/product/mixing/MixingProductsBottomSheetDialogFragment$TypeOfProducts;", "f1", "()Lcom/carrefour/fid/android/presentation/ui/product/mixing/MixingProductsBottomSheetDialogFragment$TypeOfProducts;", "type", "<init>", "()V", "w", "a", "ParentScreen", "TypeOfProducts", "app_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
@C8567o(parameters = 0)
@C11363r0({"SMAP\nMixingProductsBottomSheetDialogFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MixingProductsBottomSheetDialogFragment.kt\ncom/carrefour/fid/android/presentation/ui/product/mixing/MixingProductsBottomSheetDialogFragment\n+ 2 FragmentViewModelLazy.kt\nandroidx/fragment/app/FragmentViewModelLazyKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 Fragment.kt\ncom/carrefour/fid/android/shared/extension/FragmentKt\n+ 5 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,389:1\n106#2,15:390\n1#3:405\n168#4,7:406\n1559#5:413\n1590#5,4:414\n800#5,11:418\n1559#5:429\n1590#5,4:430\n800#5,11:434\n*S KotlinDebug\n*F\n+ 1 MixingProductsBottomSheetDialogFragment.kt\ncom/carrefour/fid/android/presentation/ui/product/mixing/MixingProductsBottomSheetDialogFragment\n*L\n85#1:390,15\n117#1:406,7\n220#1:413\n220#1:414,4\n242#1:418,11\n243#1:429\n243#1:430,4\n263#1:434,11\n*E\n"})
/* renamed from: com.carrefour.fid.android.presentation.ui.product.mixing.MixingProductsBottomSheetDialogFragment */
public final class MixingProductsBottomSheetDialogFragment extends C25486a<C36825s6> {
    @C12579k

    /* renamed from: X */
    public static final String f62704X = "departmentBasketBuilder";
    @C12579k

    /* renamed from: Y */
    public static final String f62705Y = "parentScreen";
    @C12579k

    /* renamed from: Z */
    public static final String f62706Z = "typeOfProduct";
    @C12579k

    /* renamed from: w */
    public static final C25475a f62707w = new C25475a((DefaultConstructorMarker) null);

    /* renamed from: x */
    public static final int f62708x = 8;
    @C12579k

    /* renamed from: y */
    public static final String f62709y = "offerProduct";
    @C12579k

    /* renamed from: z */
    public static final String f62710z = "productListSettings";
    @Inject

    /* renamed from: f */
    public C27224a f62711f;
    @C12579k

    /* renamed from: g */
    public final C11677z f62712g;
    @C12580l

    /* renamed from: v */
    public C37370b f62713v;

    @C11076d0(mo22515d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, mo22516d2 = {"Lcom/carrefour/fid/android/presentation/ui/product/mixing/MixingProductsBottomSheetDialogFragment$ParentScreen;", "", "<init>", "(Ljava/lang/String;I)V", "a", "b", "c", "d", "app_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
    /* renamed from: com.carrefour.fid.android.presentation.ui.product.mixing.MixingProductsBottomSheetDialogFragment$ParentScreen */
    public enum ParentScreen {
        PRODUCTS,
        BASKET_BUILDER,
        DETAIL,
        FREQUENT
    }

    @C11076d0(mo22515d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\b\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, mo22516d2 = {"Lcom/carrefour/fid/android/presentation/ui/product/mixing/MixingProductsBottomSheetDialogFragment$TypeOfProducts;", "", "<init>", "(Ljava/lang/String;I)V", "a", "b", "c", "d", "e", "app_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
    /* renamed from: com.carrefour.fid.android.presentation.ui.product.mixing.MixingProductsBottomSheetDialogFragment$TypeOfProducts */
    public enum TypeOfProducts {
        FREQUENT,
        CLASSIC,
        SPONSORED,
        RECOMMENDED,
        COUPON
    }

    /* renamed from: com.carrefour.fid.android.presentation.ui.product.mixing.MixingProductsBottomSheetDialogFragment$a */
    public static final class C25475a {
        public /* synthetic */ C25475a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @C12579k
        /* renamed from: a */
        public final MixingProductsBottomSheetDialogFragment mo74263a(@C12579k ParentScreen parentScreen, @C12580l OfferProductModel offerProductModel, @C12580l ProductListSettingsModel productListSettingsModel, @C12580l String str, @C12579k TypeOfProducts typeOfProducts) {
            Intrinsics.checkNotNullParameter(parentScreen, "from");
            Intrinsics.checkNotNullParameter(typeOfProducts, "typeOfProducts");
            MixingProductsBottomSheetDialogFragment mixingProductsBottomSheetDialogFragment = new MixingProductsBottomSheetDialogFragment();
            Bundle bundle = new Bundle();
            bundle.putParcelable("offerProduct", offerProductModel);
            bundle.putParcelable(MixingProductsBottomSheetDialogFragment.f62710z, productListSettingsModel);
            bundle.putString(MixingProductsBottomSheetDialogFragment.f62704X, str);
            bundle.putSerializable(MixingProductsBottomSheetDialogFragment.f62705Y, parentScreen);
            bundle.putSerializable(MixingProductsBottomSheetDialogFragment.f62706Z, typeOfProducts);
            mixingProductsBottomSheetDialogFragment.setArguments(bundle);
            return mixingProductsBottomSheetDialogFragment;
        }

        public C25475a() {
        }
    }

    public MixingProductsBottomSheetDialogFragment() {
        super(C254731.f62714a, C254742.f62715a, false);
        C11677z b = C10864b0.m38747b(LazyThreadSafetyMode.NONE, new C25482x60fa764a(new C25481x60fa7649(this)));
        this.f62712g = FragmentViewModelLazyKt.m89923h(this, C11342l0.m43547d(MixingProductsBottomSheetViewModel.class), new C25483x60fa764b(b), new C25484x60fa764c((C11289a) null, b), new C25485x60fa764d(this, b));
    }

    /* renamed from: p1 */
    public static final void m109946p1(MixingProductsBottomSheetDialogFragment mixingProductsBottomSheetDialogFragment, View view) {
        OfferProductModel offerProductModel;
        OfferDiscountDomain w;
        Intrinsics.checkNotNullParameter(mixingProductsBottomSheetDialogFragment, "this$0");
        Bundle arguments = mixingProductsBottomSheetDialogFragment.getArguments();
        List<String> list = null;
        if (arguments != null) {
            offerProductModel = (OfferProductModel) arguments.getParcelable("offerProduct");
        } else {
            offerProductModel = null;
        }
        if (!(offerProductModel == null || (w = offerProductModel.mo121523w()) == null)) {
            list = w.mo115953t();
        }
        mixingProductsBottomSheetDialogFragment.mo74247d1(list);
    }

    /* renamed from: J */
    public final void mo74242J(OfferProductModel offerProductModel, int i) {
        ProductListSettingsModel productListSettingsModel;
        Bundle arguments = getArguments();
        String str = null;
        if (arguments != null) {
            productListSettingsModel = (ProductListSettingsModel) arguments.getParcelable(f62710z);
        } else {
            productListSettingsModel = null;
        }
        Bundle arguments2 = getArguments();
        if (arguments2 != null) {
            str = arguments2.getString(f62704X);
        }
        mo74243Z0().mo79211f(productListSettingsModel, str, offerProductModel, mo74244a1(), mo74249f1(), offerProductModel.mo121519p0(), i);
        mo74250g1().sendIntent(new MixingProductsBottomSheetViewModel.C27217a.C27221d(offerProductModel, 0));
    }

    @C12579k
    /* renamed from: Z0 */
    public final C27224a mo74243Z0() {
        C27224a aVar = this.f62711f;
        if (aVar != null) {
            return aVar;
        }
        Intrinsics.throwUninitializedPropertyAccessException("analyticsViewModel");
        return null;
    }

    /* renamed from: a1 */
    public final ParentScreen mo74244a1() {
        Bundle arguments = getArguments();
        if (arguments != null) {
            Serializable serializable = arguments.getSerializable(f62705Y);
            Intrinsics.checkNotNull(serializable, "null cannot be cast to non-null type com.carrefour.fid.android.presentation.ui.product.mixing.MixingProductsBottomSheetDialogFragment.ParentScreen");
            ParentScreen parentScreen = (ParentScreen) serializable;
            if (parentScreen != null) {
                return parentScreen;
            }
        }
        return ParentScreen.PRODUCTS;
    }

    /* renamed from: b1 */
    public final RecyclerView mo74245b1() {
        RecyclerView recyclerView = ((C36825s6) getBinding()).f91637b;
        Intrinsics.checkNotNullExpressionValue(recyclerView, "binding.mixingProductsListRecyclerview");
        return recyclerView;
    }

    /* renamed from: c1 */
    public final NotificationComponent mo74246c1() {
        NotificationComponent notificationComponent = ((C36825s6) getBinding()).f91638c;
        Intrinsics.checkNotNullExpressionValue(notificationComponent, "binding.mixingProductsNotification");
        return notificationComponent;
    }

    /* renamed from: d1 */
    public final void mo74247d1(List<String> list) {
        mo74250g1().sendIntent(new MixingProductsBottomSheetViewModel.C27217a.C27220c(list));
    }

    /* renamed from: e1 */
    public final TextView mo74248e1() {
        TextView textView = ((C36825s6) getBinding()).f91640e;
        Intrinsics.checkNotNullExpressionValue(textView, "binding.mixingProductsTitleTextview");
        return textView;
    }

    /* renamed from: f1 */
    public final TypeOfProducts mo74249f1() {
        Bundle arguments = getArguments();
        if (arguments != null) {
            Serializable serializable = arguments.getSerializable(f62706Z);
            Intrinsics.checkNotNull(serializable, "null cannot be cast to non-null type com.carrefour.fid.android.presentation.ui.product.mixing.MixingProductsBottomSheetDialogFragment.TypeOfProducts");
            TypeOfProducts typeOfProducts = (TypeOfProducts) serializable;
            if (typeOfProducts != null) {
                return typeOfProducts;
            }
        }
        return TypeOfProducts.CLASSIC;
    }

    /* renamed from: g1 */
    public final MixingProductsBottomSheetViewModel mo74250g1() {
        return (MixingProductsBottomSheetViewModel) this.f62712g.getValue();
    }

    /* renamed from: h1 */
    public final void mo74251h1(List<? extends OfferProductModel> list) {
        C37370b bVar = this.f62713v;
        if (bVar != null) {
            Iterable iterable = list;
            ArrayList arrayList = new ArrayList(C10978t.m41495Y(iterable, 10));
            int i = 0;
            for (Object next : iterable) {
                int i2 = i + 1;
                if (i < 0) {
                    CollectionsKt__CollectionsKt.m40459W();
                }
                OfferProductModel offerProductModel = (OfferProductModel) next;
                Resources resources = getResources();
                Intrinsics.checkNotNullExpressionValue(resources, "resources");
                arrayList.add(C38510j.m159764b(offerProductModel, resources, new MixingProductsBottomSheetDialogFragment$handleBasketUpdate$1$1(this, offerProductModel, i), new MixingProductsBottomSheetDialogFragment$handleBasketUpdate$1$2(this, offerProductModel, i), new MixingProductsBottomSheetDialogFragment$handleBasketUpdate$1$3(this, offerProductModel), MixingProductsBottomSheetDialogFragment$handleBasketUpdate$1$4.f62731f, (C11289a) null, (C11289a) null, (C11289a) null, false, false, false, false, (C11289a) null, 7872, (Object) null));
                i = i2;
            }
            bVar.setList(arrayList);
        }
    }

    /* renamed from: i1 */
    public final void mo74252i1() {
        mo74245b1().setVisibility(8);
        mo74246c1().setVisibility(0);
        String string = requireContext().getString(R.string.product_mixing_empty);
        Intrinsics.checkNotNullExpressionValue(string, "requireContext().getStri…ing.product_mixing_empty)");
        NotificationComponent.C37156a aVar = new NotificationComponent.C37156a(string, (String) null, (String) null, false);
        NotificationComponent c1 = mo74246c1();
        c1.mo112945y(NotificationComponent.Variant.ERROR);
        c1.mo112943w(aVar);
    }

    /* JADX WARNING: type inference failed for: r10v4, types: [java.lang.Throwable] */
    /* JADX WARNING: type inference failed for: r10v12, types: [java.lang.Throwable] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 2 */
    /* renamed from: j1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo74253j1(java.lang.Throwable r10) {
        /*
            r9 = this;
            boolean r0 = r10 instanceof com.carrefour.fid.android.shared.p046io.RequireSignInThrowable
            if (r0 == 0) goto L_0x0017
            r2 = 0
            r3 = 2130772018(0x7f010032, float:1.7147143E38)
            r4 = 2130772012(0x7f01002c, float:1.714713E38)
            r5 = 994(0x3e2, float:1.393E-42)
            r6 = 0
            r7 = 16
            r8 = 0
            r1 = r9
            com.carrefour.fid.android.app.extensions.FragmentExtensionKt.m58770u(r1, r2, r3, r4, r5, r6, r7, r8)
            goto L_0x0160
        L_0x0017:
            boolean r0 = r10 instanceof com.carrefour.fid.android.domain.exceptions.RequireServiceSelectionThrowable
            if (r0 == 0) goto L_0x0028
            com.carrefour.fid.android.presentation.ui.product.mixing.MixingProductsBottomSheetDialogFragment$handleError$1 r10 = new com.carrefour.fid.android.presentation.ui.product.mixing.MixingProductsBottomSheetDialogFragment$handleError$1
            r10.<init>(r9)
            com.carrefour.fid.android.app.extensions.FragmentExtensionKt.m58759j(r9, r10)
            com.carrefour.fid.android.app.extensions.FragmentExtensionKt.m58764o(r9)
            goto L_0x0160
        L_0x0028:
            boolean r0 = r10 instanceof com.carrefour.fid.android.core.p057io.BasketItemMaxQuantityReachedThrowable
            java.lang.String r1 = "null cannot be cast to non-null type kotlin.String"
            if (r0 == 0) goto L_0x0053
            com.carrefour.fid.android.shared.util.i r2 = com.carrefour.fid.android.shared.util.C28935i.f70940a
            com.carrefour.fid.android.core.io.BasketItemMaxQuantityReachedThrowable r10 = (com.carrefour.fid.android.core.p057io.BasketItemMaxQuantityReachedThrowable) r10
            java.lang.String r3 = r10.getMessage()
            kotlin.jvm.internal.Intrinsics.checkNotNull(r3, r1)
            r4 = 0
            r5 = 0
            r6 = 6
            r7 = 0
            com.carrefour.fid.android.shared.util.C28935i.m119706i(r2, r3, r4, r5, r6, r7)
            com.carrefour.fid.android.design.components.widgets.NotificationComponent$Variant r10 = com.carrefour.fid.android.design.components.widgets.NotificationComponent.Variant.WARNING
            r0 = 2131952749(0x7f13046d, float:1.954195E38)
            java.lang.String r0 = r9.getString(r0)
            java.lang.String r1 = "getString(R.string.fec_b…_category_limit_excecced)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
            com.carrefour.fid.android.shared.extension.C28765l.m119073a(r9, r10, r0)
            goto L_0x0160
        L_0x0053:
            boolean r0 = r10 instanceof com.carrefour.fid.android.core.p057io.CategoryLimitationExceededThrowable
            if (r0 == 0) goto L_0x0071
            com.carrefour.fid.android.design.components.widgets.NotificationComponent$Variant r0 = com.carrefour.fid.android.design.components.widgets.NotificationComponent.Variant.WARNING
            com.carrefour.fid.android.core.io.CategoryLimitationExceededThrowable r10 = (com.carrefour.fid.android.core.p057io.CategoryLimitationExceededThrowable) r10
            com.carrefour.fid.android.domain.models.CategoryLimitDomain r10 = r10.mo108325a()
            android.content.Context r1 = r9.requireContext()
            java.lang.String r2 = "requireContext()"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r2)
            java.lang.String r10 = com.carrefour.fid.android.presentation.models.extension.C38464c.m159621a(r10, r1)
            com.carrefour.fid.android.shared.extension.C28765l.m119073a(r9, r0, r10)
            goto L_0x0160
        L_0x0071:
            boolean r0 = r10 instanceof com.carrefour.fid.android.core.p057io.BasketThrowable
            if (r0 == 0) goto L_0x008f
            com.carrefour.fid.android.design.components.widgets.NotificationComponent$Variant r0 = com.carrefour.fid.android.design.components.widgets.NotificationComponent.Variant.ERROR
            com.carrefour.fid.android.core.io.BasketThrowable r10 = (com.carrefour.fid.android.core.p057io.BasketThrowable) r10
            com.carrefour.fid.android.core.type.BasketErrorType r10 = r10.mo108318a()
            int r10 = r10.mo108470q()
            java.lang.String r10 = r9.getString(r10)
            java.lang.String r1 = "getString(exception.error.resourceId)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r10, r1)
            com.carrefour.fid.android.shared.extension.C28765l.m119073a(r9, r0, r10)
            goto L_0x0160
        L_0x008f:
            boolean r0 = r10 instanceof com.carrefour.fid.android.core.p057io.BasketUpdateThrowable
            r2 = 0
            r3 = 1
            r4 = 0
            if (r0 == 0) goto L_0x00c6
            com.carrefour.fid.android.design.components.widgets.NotificationComponent$Variant r0 = com.carrefour.fid.android.design.components.widgets.NotificationComponent.Variant.ERROR
            java.lang.Object[] r1 = new java.lang.Object[r3]
            com.carrefour.fid.android.core.io.BasketUpdateThrowable r10 = (com.carrefour.fid.android.core.p057io.BasketUpdateThrowable) r10
            java.lang.Throwable r10 = r10.getCause()
            boolean r3 = r10 instanceof com.carrefour.fid.android.shared.p046io.ResponseThrowable
            if (r3 == 0) goto L_0x00a7
            r2 = r10
            com.carrefour.fid.android.shared.io.ResponseThrowable r2 = (com.carrefour.fid.android.shared.p046io.ResponseThrowable) r2
        L_0x00a7:
            if (r2 == 0) goto L_0x00ae
            int r10 = r2.mo83810a()
            goto L_0x00af
        L_0x00ae:
            r10 = r4
        L_0x00af:
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)
            r1[r4] = r10
            r10 = 2131951973(0x7f130165, float:1.9540376E38)
            java.lang.String r10 = r9.getString(r10, r1)
            java.lang.String r1 = "getString(\n             …: 0\n                    )"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r10, r1)
            com.carrefour.fid.android.shared.extension.C28765l.m119073a(r9, r0, r10)
            goto L_0x0160
        L_0x00c6:
            boolean r0 = r10 instanceof com.carrefour.fid.android.core.p057io.ShoppingListThrowable
            if (r0 == 0) goto L_0x010c
            com.carrefour.fid.android.design.components.widgets.NotificationComponent$Variant r0 = com.carrefour.fid.android.design.components.widgets.NotificationComponent.Variant.ERROR
            kotlin.jvm.internal.t0 r1 = kotlin.jvm.internal.C11368t0.f28504a
            java.util.Locale r1 = java.util.Locale.getDefault()
            r5 = 2131952767(0x7f13047f, float:1.9541986E38)
            java.lang.String r5 = r9.getString(r5)
            java.lang.String r6 = "getString(R.string.frequ…ales_default_error_title)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r5, r6)
            java.lang.Object[] r6 = new java.lang.Object[r3]
            com.carrefour.fid.android.core.io.ShoppingListThrowable r10 = (com.carrefour.fid.android.core.p057io.ShoppingListThrowable) r10
            java.lang.Throwable r10 = r10.getCause()
            boolean r7 = r10 instanceof com.carrefour.fid.android.shared.p046io.ResponseThrowable
            if (r7 == 0) goto L_0x00ed
            r2 = r10
            com.carrefour.fid.android.shared.io.ResponseThrowable r2 = (com.carrefour.fid.android.shared.p046io.ResponseThrowable) r2
        L_0x00ed:
            if (r2 == 0) goto L_0x00f4
            int r10 = r2.mo83810a()
            goto L_0x00f5
        L_0x00f4:
            r10 = r4
        L_0x00f5:
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)
            r6[r4] = r10
            java.lang.Object[] r10 = java.util.Arrays.copyOf(r6, r3)
            java.lang.String r10 = java.lang.String.format(r1, r5, r10)
            java.lang.String r1 = "format(locale, format, *args)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r10, r1)
            com.carrefour.fid.android.shared.extension.C28765l.m119073a(r9, r0, r10)
            goto L_0x0160
        L_0x010c:
            boolean r0 = r10 instanceof com.carrefour.fid.android.shared.p046io.EmptyListThrowable
            if (r0 == 0) goto L_0x0118
            java.util.List r10 = kotlin.collections.CollectionsKt__CollectionsKt.m40441E()
            r9.mo74251h1(r10)
            goto L_0x0160
        L_0x0118:
            boolean r0 = r10 instanceof com.carrefour.fid.android.shared.p046io.NetworkException
            if (r0 == 0) goto L_0x0149
            com.carrefour.fid.android.shared.util.i r2 = com.carrefour.fid.android.shared.util.C28935i.f70940a
            r0 = r10
            com.carrefour.fid.android.shared.io.NetworkException r0 = (com.carrefour.fid.android.shared.p046io.NetworkException) r0
            java.lang.String r3 = r0.getMessage()
            kotlin.jvm.internal.Intrinsics.checkNotNull(r3, r1)
            java.lang.Throwable r0 = r0.getCause()
            if (r0 != 0) goto L_0x0130
            r4 = r10
            goto L_0x0131
        L_0x0130:
            r4 = r0
        L_0x0131:
            r5 = 0
            r6 = 4
            r7 = 0
            com.carrefour.fid.android.shared.util.C28935i.m119705e(r2, r3, r4, r5, r6, r7)
            com.carrefour.fid.android.design.components.widgets.NotificationComponent$Variant r10 = com.carrefour.fid.android.design.components.widgets.NotificationComponent.Variant.ERROR
            r0 = 2131952789(0x7f130495, float:1.954203E38)
            java.lang.String r0 = r9.getString(r0)
            java.lang.String r1 = "getString(R.string.gener…error_no_network_message)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
            com.carrefour.fid.android.shared.extension.C28765l.m119073a(r9, r10, r0)
            goto L_0x0160
        L_0x0149:
            if (r10 == 0) goto L_0x0160
            com.carrefour.fid.android.shared.util.i r2 = com.carrefour.fid.android.shared.util.C28935i.f70940a
            java.lang.String r0 = r10.getMessage()
            if (r0 != 0) goto L_0x0155
            java.lang.String r0 = ""
        L_0x0155:
            r3 = r0
            r5 = 0
            r6 = 4
            r7 = 0
            r4 = r10
            com.carrefour.fid.android.shared.util.C28935i.m119705e(r2, r3, r4, r5, r6, r7)
            r9.mo74259o1()
        L_0x0160:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.presentation.p035ui.product.mixing.MixingProductsBottomSheetDialogFragment.mo74253j1(java.lang.Throwable):void");
    }

    /* renamed from: k1 */
    public final void mo74254k1(OfferProductModel offerProductModel) {
        if (!offerProductModel.mo121497A1()) {
            mo74250g1().sendIntent(new MixingProductsBottomSheetViewModel.C27217a.C27219b(offerProductModel));
        } else {
            mo74250g1().sendIntent(new MixingProductsBottomSheetViewModel.C27217a.C27222e(offerProductModel));
        }
    }

    /* renamed from: l1 */
    public final void mo74255l1(List<? extends OfferModel> list) {
        OfferProductModel offerProductModel;
        ProductListSettingsModel productListSettingsModel;
        if (list.isEmpty()) {
            mo74252i1();
            return;
        }
        int i = 0;
        mo74245b1().setVisibility(0);
        mo74246c1().setVisibility(8);
        C37370b bVar = this.f62713v;
        if (bVar != null) {
            ArrayList arrayList = new ArrayList();
            for (Object next : list) {
                if (next instanceof OfferProductModel) {
                    arrayList.add(next);
                }
            }
            ArrayList arrayList2 = new ArrayList(C10978t.m41495Y(arrayList, 10));
            for (Object next2 : arrayList) {
                int i2 = i + 1;
                if (i < 0) {
                    CollectionsKt__CollectionsKt.m40459W();
                }
                OfferProductModel offerProductModel2 = (OfferProductModel) next2;
                Resources resources = getResources();
                Intrinsics.checkNotNullExpressionValue(resources, "resources");
                arrayList2.add(C38510j.m159764b(offerProductModel2, resources, new MixingProductsBottomSheetDialogFragment$handleProductList$1$1(this, offerProductModel2, i), new MixingProductsBottomSheetDialogFragment$handleProductList$1$2(this, offerProductModel2, i), new MixingProductsBottomSheetDialogFragment$handleProductList$1$3(this, offerProductModel2), MixingProductsBottomSheetDialogFragment$handleProductList$1$4.f62732f, (C11289a) null, (C11289a) null, (C11289a) null, false, false, false, false, (C11289a) null, 7872, (Object) null));
                i = i2;
            }
            bVar.setList(arrayList2);
        }
        Bundle arguments = getArguments();
        String str = null;
        if (arguments != null) {
            offerProductModel = (OfferProductModel) arguments.getParcelable("offerProduct");
        } else {
            offerProductModel = null;
        }
        Bundle arguments2 = getArguments();
        if (arguments2 != null) {
            productListSettingsModel = (ProductListSettingsModel) arguments2.getParcelable(f62710z);
        } else {
            productListSettingsModel = null;
        }
        Bundle arguments3 = getArguments();
        if (arguments3 != null) {
            str = arguments3.getString(f62704X);
        }
        String str2 = str;
        C27224a Z0 = mo74243Z0();
        ArrayList arrayList3 = new ArrayList();
        for (Object next3 : list) {
            if (next3 instanceof OfferProductModel) {
                arrayList3.add(next3);
            }
        }
        Z0.mo79209d(productListSettingsModel, str2, offerProductModel, arrayList3, mo74244a1());
    }

    /* renamed from: m1 */
    public final void mo74256m1(C26636c cVar) {
        if (cVar.isLoading()) {
            mo74260q1();
        }
        List<OfferModel> m = cVar.mo77398m();
        if (m != null) {
            mo74255l1(m);
        }
        Throwable l = cVar.mo77397l();
        if (l != null) {
            mo74253j1(l);
        }
    }

    /* renamed from: n1 */
    public final void mo74257n1(@C12579k C27224a aVar) {
        Intrinsics.checkNotNullParameter(aVar, "<set-?>");
        this.f62711f = aVar;
    }

    /* renamed from: o0 */
    public final void mo74258o0(OfferProductModel offerProductModel, int i) {
        ProductListSettingsModel productListSettingsModel;
        String str;
        Bundle arguments = getArguments();
        if (arguments != null) {
            productListSettingsModel = (ProductListSettingsModel) arguments.getParcelable(f62710z);
        } else {
            productListSettingsModel = null;
        }
        Bundle arguments2 = getArguments();
        if (arguments2 != null) {
            str = arguments2.getString(f62704X);
        } else {
            str = null;
        }
        int p0 = offerProductModel.mo121519p0();
        if (p0 == 0) {
            mo74250g1().sendIntent(new MixingProductsBottomSheetViewModel.C27217a.C27218a(offerProductModel));
            mo74243Z0().mo79210e(productListSettingsModel, str, offerProductModel, mo74244a1(), mo74249f1(), 1, i);
            return;
        }
        FragmentExtensionKt.m58759j(this, new MixingProductsBottomSheetDialogFragment$handleAtcPressed$1(this, offerProductModel, p0, productListSettingsModel, str, i));
        QuantityBackDropFragment.f62741v.mo74287a(offerProductModel, offerProductModel.mo121519p0(), BasketType.BASKET_V4_ADDITIONAL_ORDER).show(requireActivity().mo57175g0(), (String) null);
    }

    /* renamed from: o1 */
    public final void mo74259o1() {
        mo74245b1().setVisibility(8);
        mo74246c1().setVisibility(0);
        String string = requireContext().getString(R.string.product_mixing_error);
        Intrinsics.checkNotNullExpressionValue(string, "requireContext().getStri…ing.product_mixing_error)");
        NotificationComponent.C37156a aVar = new NotificationComponent.C37156a(string, (String) null, requireContext().getString(R.string.product_mixing_error_retry_action), false);
        NotificationComponent c1 = mo74246c1();
        c1.mo112945y(NotificationComponent.Variant.ERROR);
        c1.mo112943w(aVar);
        c1.setOnActionClickListener(new C25487b(this));
    }

    public void onViewCreated(@C12579k View view, @C12580l Bundle bundle) {
        OfferProductModel offerProductModel;
        List<String> list;
        OfferDiscountDomain w;
        Intrinsics.checkNotNullParameter(view, C40383c.f102945c);
        super.onViewCreated(view, bundle);
        Bundle arguments = getArguments();
        if (arguments != null) {
            offerProductModel = (OfferProductModel) arguments.getParcelable("offerProduct");
        } else {
            offerProductModel = null;
        }
        if (offerProductModel != null) {
            OfferProductModelKt.m159564M(offerProductModel, mo74248e1());
        }
        mo74248e1().setTextColor(C17318d.m79723f(requireContext(), R.color.ds_grey_5));
        RecyclerView recyclerView = ((C36825s6) getBinding()).f91637b;
        Intrinsics.checkNotNullExpressionValue(recyclerView, "binding.mixingProductsListRecyclerview");
        Context requireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext()");
        this.f62713v = C37373c.m153544b(recyclerView, requireContext, (C37390r) null, 2, (Object) null);
        if (offerProductModel == null || (w = offerProductModel.mo121523w()) == null) {
            list = null;
        } else {
            list = w.mo115953t();
        }
        mo74247d1(list);
        MixingProductsBottomSheetViewModel g1 = mo74250g1();
        C19499w viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "viewLifecycleOwner");
        C11723c2 unused = C12038j.m48061f(C19501x.m90847a(viewLifecycleOwner), (CoroutineContext) null, (CoroutineStart) null, new C25476xa14de90a(this, g1, (C11045c) null, this), 3, (Object) null);
    }

    /* renamed from: q1 */
    public final void mo74260q1() {
        mo74245b1().setVisibility(8);
        mo74246c1().setVisibility(8);
    }
}
