package com.carrefour.fid.android.presentation.p035ui.basketbuilder;

import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;
import android.view.ViewStub;
import androidx.compose.runtime.internal.C8567o;
import androidx.fragment.app.C19232h;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.C19499w;
import androidx.lifecycle.C19501x;
import androidx.navigation.C19766m;
import androidx.recyclerview.widget.RecyclerView;
import com.carrefour.fid.android.R;
import com.carrefour.fid.android.app.extensions.FragmentExtensionKt;
import com.carrefour.fid.android.databinding.C36878y0;
import com.carrefour.fid.android.design.components.widgets.productcard.C37390r;
import com.carrefour.fid.android.design.components.widgets.productcard.list.C37369a;
import com.carrefour.fid.android.design.components.widgets.productcard.list.C37370b;
import com.carrefour.fid.android.design.components.widgets.productcard.list.C37373c;
import com.carrefour.fid.android.domain.models.basket.BasketType;
import com.carrefour.fid.android.navigation.BottomNavActivity;
import com.carrefour.fid.android.presentation.components.toolbar.ToolBarDefaultView;
import com.carrefour.fid.android.presentation.models.OfferDepartmentModel;
import com.carrefour.fid.android.presentation.models.OfferModel;
import com.carrefour.fid.android.presentation.models.OfferProductModel;
import com.carrefour.fid.android.presentation.models.ProductListSettingsModel;
import com.carrefour.fid.android.presentation.models.extension.OfferProductModelKt;
import com.carrefour.fid.android.presentation.models.mapper.C38510j;
import com.carrefour.fid.android.presentation.p035ui.product.list.adapter.OfferListAdapter;
import com.carrefour.fid.android.presentation.p035ui.product.mixing.MixingProductsBottomSheetDialogFragment;
import com.carrefour.fid.android.presentation.p035ui.product.quantity.QuantityBackDropFragment;
import com.carrefour.fid.android.presentation.viewmodels.basketbuilder.BasketBuilderDepartmentViewModel;
import com.carrefour.fid.android.presentation.viewmodels.basketbuilder.C25948a;
import com.carrefour.fid.android.presentation.viewmodels.offer.state.C26636c;
import com.carrefour.fid.android.shared.base.C28500r;
import com.carrefour.fid.android.shared.extension.FragmentKt;
import com.carrefour.fid.android.shared.navigation.C28796c;
import com.carrefour.fid.android.shared.util.C28935i;
import com.facebook.shimmer.ShimmerFrameLayout;
import com.google.android.gms.analytics.ecommerce.C40383c;
import dagger.hilt.android.C10164b;
import java.util.ArrayList;
import java.util.List;
import javax.inject.Inject;
import kotlin.C10864b0;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.C11677z;
import kotlin.LazyThreadSafetyMode;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.functions.C11300l;
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
@C11076d0(mo22515d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u0000 U2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001VB\u0007¢\u0006\u0004\bS\u0010TJ\u000e\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u0002J\b\u0010\u0007\u001a\u00020\u0006H\u0002J\b\u0010\t\u001a\u00020\bH\u0002J\u0010\u0010\f\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0002J\u0010\u0010\u000f\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\rH\u0002J\u0016\u0010\u0012\u001a\u00020\b2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u0003H\u0002J\u0016\u0010\u0013\u001a\u00020\b2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u0002J\b\u0010\u0014\u001a\u00020\bH\u0002J\b\u0010\u0015\u001a\u00020\bH\u0002J\u0012\u0010\u0018\u001a\u00020\b2\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016H\u0002J\u001a\u0010\u001c\u001a\u00020\b2\b\u0010\u0019\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u001b\u001a\u00020\u001aH\u0002J\u0018\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001d0\u0003*\b\u0012\u0004\u0012\u00020\u00100\u0003H\u0002J\u0018\u0010!\u001a\u00020\b2\u0006\u0010\u0019\u001a\u00020\u00042\u0006\u0010 \u001a\u00020\u001fH\u0002J\u0018\u0010\"\u001a\u00020\b2\u0006\u0010\u0019\u001a\u00020\u00042\u0006\u0010 \u001a\u00020\u001fH\u0002J\u0010\u0010#\u001a\u00020\b2\u0006\u0010\u0019\u001a\u00020\u0004H\u0002J\u0010\u0010$\u001a\u00020\b2\u0006\u0010\u0019\u001a\u00020\u0004H\u0002J\u0018\u0010%\u001a\u00020\b2\u0006\u0010\u0019\u001a\u00020\u00042\u0006\u0010 \u001a\u00020\u001fH\u0002J\u0018\u0010&\u001a\u00020\b2\u0006\u0010\u0019\u001a\u00020\u00042\u0006\u0010 \u001a\u00020\u001fH\u0002J\b\u0010(\u001a\u00020'H\u0016J\b\u0010)\u001a\u00020'H\u0016J\b\u0010+\u001a\u00020*H\u0016J\u001a\u00100\u001a\u00020\b2\u0006\u0010-\u001a\u00020,2\b\u0010/\u001a\u0004\u0018\u00010.H\u0016J\b\u00101\u001a\u00020\bH\u0016J\b\u00102\u001a\u00020\bH\u0016R\"\u0010:\u001a\u0002038\u0006@\u0006X.¢\u0006\u0012\n\u0004\b4\u00105\u001a\u0004\b6\u00107\"\u0004\b8\u00109R\"\u0010B\u001a\u00020;8\u0006@\u0006X.¢\u0006\u0012\n\u0004\b<\u0010=\u001a\u0004\b>\u0010?\"\u0004\b@\u0010AR\u001b\u0010H\u001a\u00020C8BX\u0002¢\u0006\f\n\u0004\bD\u0010E\u001a\u0004\bF\u0010GR\u001b\u0010N\u001a\u00020I8BX\u0002¢\u0006\f\n\u0004\bJ\u0010K\u001a\u0004\bL\u0010MR\u0018\u0010R\u001a\u0004\u0018\u00010O8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\bP\u0010Q¨\u0006W"}, mo22516d2 = {"Lcom/carrefour/fid/android/presentation/ui/basketbuilder/BasketBuilderDepartmentFragment;", "Lcom/carrefour/fid/android/shared/base/o;", "Lcom/carrefour/fid/android/databinding/y0;", "", "Lcom/carrefour/fid/android/presentation/models/OfferProductModel;", "b1", "Lcom/carrefour/fid/android/presentation/models/OfferDepartmentModel;", "a1", "Lkotlin/d2;", "n1", "Lcom/carrefour/fid/android/presentation/viewmodels/offer/state/c;", "state", "l1", "Lcom/carrefour/fid/android/presentation/viewmodels/basketbuilder/BasketBuilderDepartmentViewModel$a;", "uiEvent", "i1", "Lcom/carrefour/fid/android/presentation/models/OfferModel;", "offerList", "k1", "f1", "g1", "o1", "", "exception", "h1", "offer", "", "isFeatureMixingProducts", "q1", "Lcom/carrefour/fid/android/design/components/widgets/productcard/list/a;", "p1", "", "productPosition", "o0", "D", "j1", "z", "Y", "J", "Landroid/view/ViewStub;", "errorMessageLayout", "emptyLayout", "Lcom/facebook/shimmer/ShimmerFrameLayout;", "loadingLayout", "Landroid/view/View;", "view", "Landroid/os/Bundle;", "savedInstanceState", "onViewCreated", "onResume", "onDestroyView", "Lcom/carrefour/fid/android/shared/navigation/c;", "f", "Lcom/carrefour/fid/android/shared/navigation/c;", "getNavigator", "()Lcom/carrefour/fid/android/shared/navigation/c;", "setNavigator", "(Lcom/carrefour/fid/android/shared/navigation/c;)V", "navigator", "Lcom/carrefour/fid/android/presentation/viewmodels/basketbuilder/a;", "g", "Lcom/carrefour/fid/android/presentation/viewmodels/basketbuilder/a;", "c1", "()Lcom/carrefour/fid/android/presentation/viewmodels/basketbuilder/a;", "m1", "(Lcom/carrefour/fid/android/presentation/viewmodels/basketbuilder/a;)V", "analyticsViewModel", "Lcom/carrefour/fid/android/presentation/viewmodels/basketbuilder/BasketBuilderDepartmentViewModel;", "v", "Lkotlin/z;", "e1", "()Lcom/carrefour/fid/android/presentation/viewmodels/basketbuilder/BasketBuilderDepartmentViewModel;", "viewModel", "Lcom/carrefour/fid/android/presentation/ui/basketbuilder/a;", "w", "Landroidx/navigation/m;", "d1", "()Lcom/carrefour/fid/android/presentation/ui/basketbuilder/a;", "arguments", "Lcom/carrefour/fid/android/design/components/widgets/productcard/list/b;", "x", "Lcom/carrefour/fid/android/design/components/widgets/productcard/list/b;", "adapter", "<init>", "()V", "y", "a", "app_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
@C8567o(parameters = 0)
@C11363r0({"SMAP\nBasketBuilderDepartmentFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BasketBuilderDepartmentFragment.kt\ncom/carrefour/fid/android/presentation/ui/basketbuilder/BasketBuilderDepartmentFragment\n+ 2 FragmentViewModelLazy.kt\nandroidx/fragment/app/FragmentViewModelLazyKt\n+ 3 FragmentNavArgsLazy.kt\nandroidx/navigation/fragment/FragmentNavArgsLazyKt\n+ 4 Fragment.kt\ncom/carrefour/fid/android/shared/extension/FragmentKt\n+ 5 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 6 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,391:1\n106#2,15:392\n42#3,3:407\n168#4,7:410\n183#4,6:417\n1#5:423\n1#5:459\n800#6,11:424\n800#6,11:435\n1569#6,11:446\n1864#6,2:457\n1866#6:460\n1580#6:461\n*S KotlinDebug\n*F\n+ 1 BasketBuilderDepartmentFragment.kt\ncom/carrefour/fid/android/presentation/ui/basketbuilder/BasketBuilderDepartmentFragment\n*L\n74#1:392,15\n76#1:407,3\n98#1:410,7\n99#1:417,6\n301#1:459\n177#1:424,11\n181#1:435,11\n301#1:446,11\n301#1:457,2\n301#1:460\n301#1:461\n*E\n"})
/* renamed from: com.carrefour.fid.android.presentation.ui.basketbuilder.BasketBuilderDepartmentFragment */
public final class BasketBuilderDepartmentFragment extends C23226m<C36878y0> {
    @C12579k

    /* renamed from: X */
    public static final String f58823X = "BasketBuilderDepartmentFragment";
    @C12579k

    /* renamed from: y */
    public static final C23142a f58824y = new C23142a((DefaultConstructorMarker) null);

    /* renamed from: z */
    public static final int f58825z = 8;
    @Inject

    /* renamed from: f */
    public C28796c f58826f;
    @Inject

    /* renamed from: g */
    public C25948a f58827g;
    @C12579k

    /* renamed from: v */
    public final C11677z f58828v;
    @C12579k

    /* renamed from: w */
    public final C19766m f58829w = new C19766m(C11342l0.m43547d(C23209a.class), new BasketBuilderDepartmentFragment$special$$inlined$navArgs$1(this));
    @C12580l

    /* renamed from: x */
    public C37370b f58830x;

    /* renamed from: com.carrefour.fid.android.presentation.ui.basketbuilder.BasketBuilderDepartmentFragment$a */
    public static final class C23142a {
        public /* synthetic */ C23142a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public C23142a() {
        }
    }

    public BasketBuilderDepartmentFragment() {
        super(C231411.f58831a);
        C11677z b = C10864b0.m38747b(LazyThreadSafetyMode.NONE, new C23154x5ed40bbf(new C23153x5ed40bbe(this)));
        this.f58828v = FragmentViewModelLazyKt.m89923h(this, C11342l0.m43547d(BasketBuilderDepartmentViewModel.class), new C23155x5ed40bc0(b), new C23156x5ed40bc1((C11289a) null, b), new C23157x5ed40bc2(this, b));
    }

    /* renamed from: D */
    public final void mo67912D(OfferProductModel offerProductModel, int i) {
        mo67917c1().mo75368e(mo67915a1().mo121689Q(), offerProductModel, i);
        mo67919e1().sendIntent(new BasketBuilderDepartmentViewModel.C25904b.C25910f(offerProductModel));
    }

    /* renamed from: J */
    public final void mo67913J(OfferProductModel offerProductModel, int i) {
        mo67919e1().sendIntent(new BasketBuilderDepartmentViewModel.C25904b.C25908d(offerProductModel, (Integer) null, 2, (DefaultConstructorMarker) null));
        mo67917c1().mo75366c(mo67915a1().mo121689Q(), offerProductModel, offerProductModel.mo121519p0(), i);
    }

    /* renamed from: Y */
    public final void mo67914Y(OfferProductModel offerProductModel, int i) {
        if (!offerProductModel.mo121497A1()) {
            mo67919e1().sendIntent(new BasketBuilderDepartmentViewModel.C25904b.C25906b(offerProductModel));
            mo67917c1().mo75369f(mo67915a1().mo121689Q(), offerProductModel, i);
            return;
        }
        mo67919e1().sendIntent(new BasketBuilderDepartmentViewModel.C25904b.C25909e(offerProductModel));
        mo67917c1().mo75370g(mo67915a1().mo121689Q(), offerProductModel, i);
    }

    /* renamed from: a1 */
    public final OfferDepartmentModel mo67915a1() {
        return mo67918d1().mo68030e().mo121907e();
    }

    /* renamed from: b1 */
    public final List<OfferProductModel> mo67916b1() {
        return mo67918d1().mo68030e().mo121909f();
    }

    @C12579k
    /* renamed from: c1 */
    public final C25948a mo67917c1() {
        C25948a aVar = this.f58827g;
        if (aVar != null) {
            return aVar;
        }
        Intrinsics.throwUninitializedPropertyAccessException("analyticsViewModel");
        return null;
    }

    /* renamed from: d1 */
    public final C23209a mo67918d1() {
        return (C23209a) this.f58829w.getValue();
    }

    /* renamed from: e1 */
    public final BasketBuilderDepartmentViewModel mo67919e1() {
        return (BasketBuilderDepartmentViewModel) this.f58828v.getValue();
    }

    @C12579k
    public ViewStub emptyLayout() {
        ViewStub viewStub = ((C36878y0) getBinding()).f91948d;
        Intrinsics.checkNotNullExpressionValue(viewStub, "binding.stubBasketBuilderEmpty");
        return viewStub;
    }

    @C12579k
    public ViewStub errorMessageLayout() {
        ViewStub viewStub = ((C36878y0) getBinding()).f91949e;
        Intrinsics.checkNotNullExpressionValue(viewStub, "binding.stubBasketBuilderError");
        return viewStub;
    }

    /* renamed from: f1 */
    public final void mo67920f1(List<? extends OfferProductModel> list) {
        C37370b bVar = this.f58830x;
        if (bVar != null) {
            bVar.setList(mo67932p1(list));
        }
    }

    /* renamed from: g1 */
    public final void mo67921g1() {
        hideLoading();
        hideErrorView();
        C28500r.C28501a.m118419a(this, (Integer) null, (Integer) null, (Integer) null, (Integer) null, true, false, (C11289a) null, 111, (Object) null);
        showEmpty();
    }

    @C12579k
    public final C28796c getNavigator() {
        C28796c cVar = this.f58826f;
        if (cVar != null) {
            return cVar;
        }
        Intrinsics.throwUninitializedPropertyAccessException("navigator");
        return null;
    }

    /* JADX WARNING: type inference failed for: r2v8, types: [java.lang.Throwable] */
    /* JADX WARNING: type inference failed for: r2v16, types: [java.lang.Throwable] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 2 */
    /* renamed from: h1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo67923h1(java.lang.Throwable r28) {
        /*
            r27 = this;
            r14 = r27
            r2 = r28
            boolean r0 = r2 instanceof com.carrefour.fid.android.shared.p046io.RequireSignInThrowable
            if (r0 == 0) goto L_0x001c
            r1 = 0
            r2 = 2130772018(0x7f010032, float:1.7147143E38)
            r3 = 2130772012(0x7f01002c, float:1.714713E38)
            r4 = 994(0x3e2, float:1.393E-42)
            r5 = 0
            r6 = 16
            r7 = 0
            r0 = r27
            com.carrefour.fid.android.app.extensions.FragmentExtensionKt.m58770u(r0, r1, r2, r3, r4, r5, r6, r7)
            goto L_0x020b
        L_0x001c:
            boolean r0 = r2 instanceof com.carrefour.fid.android.domain.exceptions.RequireServiceSelectionThrowable
            if (r0 == 0) goto L_0x002d
            com.carrefour.fid.android.presentation.ui.basketbuilder.BasketBuilderDepartmentFragment$handleError$1 r0 = new com.carrefour.fid.android.presentation.ui.basketbuilder.BasketBuilderDepartmentFragment$handleError$1
            r0.<init>(r14)
            com.carrefour.fid.android.app.extensions.FragmentExtensionKt.m58759j(r14, r0)
            com.carrefour.fid.android.app.extensions.FragmentExtensionKt.m58764o(r27)
            goto L_0x020b
        L_0x002d:
            boolean r0 = r2 instanceof com.carrefour.fid.android.core.p057io.BasketItemMaxQuantityReachedThrowable
            java.lang.String r1 = "null cannot be cast to non-null type kotlin.String"
            if (r0 == 0) goto L_0x0066
            com.carrefour.fid.android.shared.util.i r0 = com.carrefour.fid.android.shared.util.C28935i.f70940a
            com.carrefour.fid.android.core.io.BasketItemMaxQuantityReachedThrowable r2 = (com.carrefour.fid.android.core.p057io.BasketItemMaxQuantityReachedThrowable) r2
            java.lang.String r3 = r2.getMessage()
            kotlin.jvm.internal.Intrinsics.checkNotNull(r3, r1)
            r4 = 0
            r5 = 0
            r6 = 6
            r7 = 0
            r2 = r0
            com.carrefour.fid.android.shared.util.C28935i.m119706i(r2, r3, r4, r5, r6, r7)
            com.carrefour.fid.android.design.components.widgets.NotificationComponent$Variant r1 = com.carrefour.fid.android.design.components.widgets.NotificationComponent.Variant.WARNING
            r0 = 2131952749(0x7f13046d, float:1.954195E38)
            java.lang.String r2 = r14.getString(r0)
            java.lang.String r0 = "getString(R.string.fec_b…_category_limit_excecced)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, r0)
            r3 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            r12 = 2044(0x7fc, float:2.864E-42)
            r13 = 0
            r0 = r27
            com.carrefour.fid.android.shared.extension.FragmentKt.m118811B(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
            goto L_0x020b
        L_0x0066:
            boolean r0 = r2 instanceof com.carrefour.fid.android.core.p057io.CategoryLimitationExceededThrowable
            if (r0 == 0) goto L_0x0093
            com.carrefour.fid.android.design.components.widgets.NotificationComponent$Variant r1 = com.carrefour.fid.android.design.components.widgets.NotificationComponent.Variant.WARNING
            r0 = r2
            com.carrefour.fid.android.core.io.CategoryLimitationExceededThrowable r0 = (com.carrefour.fid.android.core.p057io.CategoryLimitationExceededThrowable) r0
            com.carrefour.fid.android.domain.models.CategoryLimitDomain r0 = r0.mo108325a()
            android.content.Context r2 = r27.requireContext()
            java.lang.String r3 = "requireContext()"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, r3)
            java.lang.String r2 = com.carrefour.fid.android.presentation.models.extension.C38464c.m159621a(r0, r2)
            r3 = 0
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            r12 = 2044(0x7fc, float:2.864E-42)
            r13 = 0
            r0 = r27
            com.carrefour.fid.android.shared.extension.FragmentKt.m118811B(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
            goto L_0x020b
        L_0x0093:
            boolean r0 = r2 instanceof com.carrefour.fid.android.core.p057io.BasketThrowable
            if (r0 == 0) goto L_0x00c0
            com.carrefour.fid.android.design.components.widgets.NotificationComponent$Variant r1 = com.carrefour.fid.android.design.components.widgets.NotificationComponent.Variant.ERROR
            r0 = r2
            com.carrefour.fid.android.core.io.BasketThrowable r0 = (com.carrefour.fid.android.core.p057io.BasketThrowable) r0
            com.carrefour.fid.android.core.type.BasketErrorType r0 = r0.mo108318a()
            int r0 = r0.mo108470q()
            java.lang.String r2 = r14.getString(r0)
            java.lang.String r0 = "getString(exception.error.resourceId)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, r0)
            r3 = 0
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            r12 = 2044(0x7fc, float:2.864E-42)
            r13 = 0
            r0 = r27
            com.carrefour.fid.android.shared.extension.FragmentKt.m118811B(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
            goto L_0x020b
        L_0x00c0:
            boolean r0 = r2 instanceof com.carrefour.fid.android.core.p057io.BasketUpdateThrowable
            r7 = 0
            r8 = 1
            r9 = 0
            if (r0 == 0) goto L_0x0105
            com.carrefour.fid.android.design.components.widgets.NotificationComponent$Variant r1 = com.carrefour.fid.android.design.components.widgets.NotificationComponent.Variant.ERROR
            java.lang.Object[] r0 = new java.lang.Object[r8]
            com.carrefour.fid.android.core.io.BasketUpdateThrowable r2 = (com.carrefour.fid.android.core.p057io.BasketUpdateThrowable) r2
            java.lang.Throwable r2 = r2.getCause()
            boolean r3 = r2 instanceof com.carrefour.fid.android.shared.p046io.ResponseThrowable
            if (r3 == 0) goto L_0x00d8
            r7 = r2
            com.carrefour.fid.android.shared.io.ResponseThrowable r7 = (com.carrefour.fid.android.shared.p046io.ResponseThrowable) r7
        L_0x00d8:
            if (r7 == 0) goto L_0x00df
            int r2 = r7.mo83810a()
            goto L_0x00e0
        L_0x00df:
            r2 = r9
        L_0x00e0:
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r0[r9] = r2
            r2 = 2131951973(0x7f130165, float:1.9540376E38)
            java.lang.String r2 = r14.getString(r2, r0)
            java.lang.String r0 = "getString(\n             …: 0\n                    )"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, r0)
            r3 = 0
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            r12 = 2044(0x7fc, float:2.864E-42)
            r13 = 0
            r0 = r27
            com.carrefour.fid.android.shared.extension.FragmentKt.m118811B(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
            goto L_0x020b
        L_0x0105:
            boolean r0 = r2 instanceof com.carrefour.fid.android.core.p057io.ShoppingListThrowable
            if (r0 == 0) goto L_0x015a
            com.carrefour.fid.android.design.components.widgets.NotificationComponent$Variant r1 = com.carrefour.fid.android.design.components.widgets.NotificationComponent.Variant.ERROR
            kotlin.jvm.internal.t0 r0 = kotlin.jvm.internal.C11368t0.f28504a
            java.util.Locale r0 = java.util.Locale.getDefault()
            r3 = 2131952767(0x7f13047f, float:1.9541986E38)
            java.lang.String r3 = r14.getString(r3)
            java.lang.String r4 = "getString(R.string.frequ…ales_default_error_title)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r3, r4)
            java.lang.Object[] r4 = new java.lang.Object[r8]
            com.carrefour.fid.android.core.io.ShoppingListThrowable r2 = (com.carrefour.fid.android.core.p057io.ShoppingListThrowable) r2
            java.lang.Throwable r2 = r2.getCause()
            boolean r5 = r2 instanceof com.carrefour.fid.android.shared.p046io.ResponseThrowable
            if (r5 == 0) goto L_0x012c
            r7 = r2
            com.carrefour.fid.android.shared.io.ResponseThrowable r7 = (com.carrefour.fid.android.shared.p046io.ResponseThrowable) r7
        L_0x012c:
            if (r7 == 0) goto L_0x0133
            int r2 = r7.mo83810a()
            goto L_0x0134
        L_0x0133:
            r2 = r9
        L_0x0134:
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r4[r9] = r2
            java.lang.Object[] r2 = java.util.Arrays.copyOf(r4, r8)
            java.lang.String r2 = java.lang.String.format(r0, r3, r2)
            java.lang.String r0 = "format(locale, format, *args)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, r0)
            r3 = 0
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            r12 = 2044(0x7fc, float:2.864E-42)
            r13 = 0
            r0 = r27
            com.carrefour.fid.android.shared.extension.FragmentKt.m118811B(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
            goto L_0x020b
        L_0x015a:
            boolean r0 = r2 instanceof com.carrefour.fid.android.shared.p046io.EmptyListThrowable
            if (r0 == 0) goto L_0x0167
            java.util.List r0 = kotlin.collections.CollectionsKt__CollectionsKt.m40441E()
            r14.mo67920f1(r0)
            goto L_0x020b
        L_0x0167:
            boolean r0 = r2 instanceof com.carrefour.fid.android.shared.p046io.NetworkException
            if (r0 == 0) goto L_0x01ad
            com.carrefour.fid.android.shared.util.i r15 = com.carrefour.fid.android.shared.util.C28935i.f70940a
            r0 = r2
            com.carrefour.fid.android.shared.io.NetworkException r0 = (com.carrefour.fid.android.shared.p046io.NetworkException) r0
            java.lang.String r3 = r0.getMessage()
            kotlin.jvm.internal.Intrinsics.checkNotNull(r3, r1)
            java.lang.Throwable r0 = r0.getCause()
            if (r0 != 0) goto L_0x0180
            r17 = r2
            goto L_0x0182
        L_0x0180:
            r17 = r0
        L_0x0182:
            r18 = 0
            r19 = 4
            r20 = 0
            r16 = r3
            com.carrefour.fid.android.shared.util.C28935i.m119705e(r15, r16, r17, r18, r19, r20)
            com.carrefour.fid.android.design.components.widgets.NotificationComponent$Variant r1 = com.carrefour.fid.android.design.components.widgets.NotificationComponent.Variant.ERROR
            r0 = 2131952789(0x7f130495, float:1.954203E38)
            java.lang.String r2 = r14.getString(r0)
            java.lang.String r0 = "getString(R.string.gener…error_no_network_message)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, r0)
            r3 = 0
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            r12 = 2044(0x7fc, float:2.864E-42)
            r13 = 0
            r0 = r27
            com.carrefour.fid.android.shared.extension.FragmentKt.m118811B(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
            goto L_0x020b
        L_0x01ad:
            if (r2 == 0) goto L_0x020b
            com.carrefour.fid.android.shared.util.i r0 = com.carrefour.fid.android.shared.util.C28935i.f70940a
            java.lang.String r1 = r28.getMessage()
            if (r1 != 0) goto L_0x01b9
            java.lang.String r1 = ""
        L_0x01b9:
            r3 = 0
            r4 = 4
            r5 = 0
            r2 = r28
            com.carrefour.fid.android.shared.util.C28935i.m119705e(r0, r1, r2, r3, r4, r5)
            r27.hideLoading()
            r27.hideEmpty()
            com.carrefour.fid.android.design.components.widgets.MessageComponent$a r1 = new com.carrefour.fid.android.design.components.widgets.MessageComponent$a
            android.content.Context r0 = r27.requireContext()
            r2 = 2131231396(0x7f0802a4, float:1.8078872E38)
            android.graphics.drawable.Drawable r16 = androidx.core.content.C17318d.m79726i(r0, r2)
            r0 = 2131951944(0x7f130148, float:1.9540317E38)
            java.lang.String r0 = r14.getString(r0)
            java.lang.String r2 = "getString(R.string.basket_builder_error_content)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r2)
            r18 = 0
            r2 = 2131952813(0x7f1304ad, float:1.954208E38)
            java.lang.String r19 = r14.getString(r2)
            r20 = 0
            r21 = 0
            com.carrefour.fid.android.design.components.widgets.MessageComponent$Type r22 = com.carrefour.fid.android.design.components.widgets.MessageComponent.Type.ERROR
            r23 = 0
            r24 = 0
            r25 = 384(0x180, float:5.38E-43)
            r26 = 0
            r15 = r1
            r17 = r0
            r15.<init>(r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26)
            r2 = 0
            r3 = 0
            r4 = 0
            r5 = 14
            r6 = 0
            r0 = r27
            com.carrefour.fid.android.shared.base.C28500r.C28501a.m118421c(r0, r1, r2, r3, r4, r5, r6)
            com.carrefour.fid.android.shared.base.C28500r.C28501a.m118423e(r14, r9, r8, r7)
        L_0x020b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.presentation.p035ui.basketbuilder.BasketBuilderDepartmentFragment.mo67923h1(java.lang.Throwable):void");
    }

    /* renamed from: i1 */
    public final void mo67924i1(BasketBuilderDepartmentViewModel.C25902a aVar) {
        if (aVar instanceof BasketBuilderDepartmentViewModel.C25902a.C25903a) {
            C28796c navigator = getNavigator();
            C19232h activity = getActivity();
            Intrinsics.checkNotNull(activity, "null cannot be cast to non-null type com.carrefour.fid.android.navigation.BottomNavActivity");
            BasketBuilderDepartmentViewModel.C25902a.C25903a aVar2 = (BasketBuilderDepartmentViewModel.C25902a.C25903a) aVar;
            navigator.mo83838n(((BottomNavActivity) activity).mo83823k(), OfferProductModelKt.m159574W(aVar2.mo75192f()), aVar2.mo75190e());
        }
    }

    /* renamed from: j1 */
    public final void mo67925j1(OfferProductModel offerProductModel) {
        FragmentExtensionKt.m58756g(this, offerProductModel, MixingProductsBottomSheetDialogFragment.ParentScreen.BASKET_BUILDER, (ProductListSettingsModel) null, 4, (Object) null);
        FragmentKt.m118835w(this, (String) null, new BasketBuilderDepartmentFragment$handleOnMixingPressed$1(this), 1, (Object) null);
        mo67933q1(offerProductModel, false);
        mo67917c1().mo75371h(mo67915a1().mo121689Q());
    }

    /* renamed from: k1 */
    public final void mo67926k1(List<? extends OfferModel> list) {
        if (list.isEmpty()) {
            mo67921g1();
            return;
        }
        hideLoading();
        hideEmpty();
        hideErrorView();
        ((C36878y0) getBinding()).f91946b.setVisibility(0);
        C37370b bVar = this.f58830x;
        if (bVar != null) {
            bVar.setList(mo67932p1(list));
        }
        C25948a c1 = mo67917c1();
        String Q = mo67915a1().mo121689Q();
        Iterable iterable = list;
        ArrayList arrayList = new ArrayList();
        for (Object next : iterable) {
            if (next instanceof OfferProductModel) {
                arrayList.add(next);
            }
        }
        c1.mo75372i(Q, arrayList);
        C25948a c12 = mo67917c1();
        String Q2 = mo67915a1().mo121689Q();
        ArrayList arrayList2 = new ArrayList();
        for (Object next2 : iterable) {
            if (next2 instanceof OfferProductModel) {
                arrayList2.add(next2);
            }
        }
        c12.mo75364a(Q2, arrayList2);
    }

    /* renamed from: l1 */
    public final void mo67927l1(C26636c cVar) {
        if (cVar.isLoading()) {
            mo67931o1();
        }
        List<OfferModel> m = cVar.mo77398m();
        if (m != null) {
            mo67926k1(m);
        }
        Throwable l = cVar.mo77397l();
        if (l != null) {
            mo67923h1(l);
        }
    }

    @C12579k
    public ShimmerFrameLayout loadingLayout() {
        ShimmerFrameLayout shimmerFrameLayout = ((C36878y0) getBinding()).f91947c;
        Intrinsics.checkNotNullExpressionValue(shimmerFrameLayout, "binding.shimmerBasketBuilderPreview");
        return shimmerFrameLayout;
    }

    /* renamed from: m1 */
    public final void mo67928m1(@C12579k C25948a aVar) {
        Intrinsics.checkNotNullParameter(aVar, "<set-?>");
        this.f58827g = aVar;
    }

    /* renamed from: n1 */
    public final void mo67929n1() {
        BottomNavActivity bottomNavActivity;
        C19232h activity = getActivity();
        if (activity instanceof BottomNavActivity) {
            bottomNavActivity = (BottomNavActivity) activity;
        } else {
            bottomNavActivity = null;
        }
        if (bottomNavActivity != null) {
            OfferDepartmentModel a1 = mo67915a1();
            String quantityString = bottomNavActivity.getResources().getQuantityString(R.plurals.basket_builder_preview_subtitle, a1.mo121688M(), new Object[]{Integer.valueOf(a1.mo121688M())});
            Intrinsics.checkNotNullExpressionValue(quantityString, "resources.getQuantityStr…t.count\n                )");
            ToolBarDefaultView M1 = bottomNavActivity.mo121107M1();
            String Q = a1.mo121689Q();
            if (Q == null) {
                Q = new String();
            }
            ToolBarDefaultView.m158942o0(M1, Q, quantityString, 0, 4, (Object) null);
            ToolBarDefaultView.m158944r0(M1, true, (C11300l) null, false, 6, (Object) null);
        }
    }

    /* renamed from: o0 */
    public final void mo67930o0(OfferProductModel offerProductModel, int i) {
        int p0 = offerProductModel.mo121519p0();
        if (p0 == 0) {
            mo67919e1().sendIntent(new BasketBuilderDepartmentViewModel.C25904b.C25905a(offerProductModel));
            mo67917c1().mo75365b(mo67915a1().mo121689Q(), offerProductModel, 1, i);
            return;
        }
        FragmentExtensionKt.m58759j(this, new BasketBuilderDepartmentFragment$handleAtcPressed$1(this, offerProductModel, p0, i));
        QuantityBackDropFragment.C25492a.m109994b(QuantityBackDropFragment.f62741v, offerProductModel, offerProductModel.mo121519p0(), (BasketType) null, 4, (Object) null).show(requireActivity().mo57175g0(), (String) null);
    }

    /* renamed from: o1 */
    public final void mo67931o1() {
        ((C36878y0) getBinding()).f91946b.setVisibility(8);
        hideEmpty();
        hideErrorView();
        showLoading();
    }

    public void onDestroyView() {
        RecyclerView recyclerView = ((C36878y0) getBinding()).f91946b;
        recyclerView.setAdapter((RecyclerView.Adapter) null);
        recyclerView.setLayoutManager((RecyclerView.C20076o) null);
        super.onDestroyView();
    }

    public void onResume() {
        super.onResume();
        mo67919e1().sendIntent(BasketBuilderDepartmentViewModel.C25904b.C25911g.f63402b);
    }

    public void onViewCreated(@C12579k View view, @C12580l Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, C40383c.f102945c);
        super.onViewCreated(view, bundle);
        mo67929n1();
        RecyclerView recyclerView = ((C36878y0) getBinding()).f91946b;
        Intrinsics.checkNotNullExpressionValue(recyclerView, "binding.listBasketBuilderPreview");
        Context requireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext()");
        this.f58830x = C37373c.m153544b(recyclerView, requireContext, (C37390r) null, 2, (Object) null);
        BasketBuilderDepartmentViewModel e1 = mo67919e1();
        C19499w viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "viewLifecycleOwner");
        C11723c2 unused = C12038j.m48061f(C19501x.m90847a(viewLifecycleOwner), (CoroutineContext) null, (CoroutineStart) null, new C23148x9f277e7f(this, e1, (C11045c) null, this), 3, (Object) null);
        BasketBuilderDepartmentViewModel e12 = mo67919e1();
        C19499w viewLifecycleOwner2 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner2, "viewLifecycleOwner");
        C11723c2 unused2 = C12038j.m48061f(C19501x.m90847a(viewLifecycleOwner2), (CoroutineContext) null, (CoroutineStart) null, new C23143xbe2fce48(this, e12, (C11045c) null, this), 3, (Object) null);
        mo67919e1().sendIntent(new BasketBuilderDepartmentViewModel.C25904b.C25907c(mo67916b1()));
    }

    /* renamed from: p1 */
    public final List<C37369a> mo67932p1(List<? extends OfferModel> list) {
        Object obj;
        ArrayList arrayList = new ArrayList();
        int i = 0;
        for (Object next : list) {
            int i2 = i + 1;
            if (i < 0) {
                CollectionsKt__CollectionsKt.m40459W();
            }
            OfferModel offerModel = (OfferModel) next;
            if (offerModel instanceof OfferProductModel) {
                Resources resources = getResources();
                Intrinsics.checkNotNullExpressionValue(resources, "resources");
                obj = C38510j.m159764b((OfferProductModel) offerModel, resources, new BasketBuilderDepartmentFragment$toListable$1$1(this, offerModel, i), new BasketBuilderDepartmentFragment$toListable$1$2(this, offerModel, i), new BasketBuilderDepartmentFragment$toListable$1$3(this, offerModel, i), new BasketBuilderDepartmentFragment$toListable$1$4(this, offerModel, i), new BasketBuilderDepartmentFragment$toListable$1$5(this, offerModel), new BasketBuilderDepartmentFragment$toListable$1$6(this, offerModel), new BasketBuilderDepartmentFragment$toListable$1$7(this, offerModel), false, false, false, false, (C11289a) null, 7680, (Object) null);
            } else if (offerModel instanceof C37369a) {
                obj = (C37369a) offerModel;
            } else {
                obj = null;
            }
            if (obj != null) {
                arrayList.add(obj);
            }
            i = i2;
        }
        return arrayList;
    }

    /* renamed from: q1 */
    public final void mo67933q1(OfferProductModel offerProductModel, boolean z) {
        OfferListAdapter offerListAdapter;
        if (offerProductModel != null) {
            offerProductModel.mo121745l2(Boolean.valueOf(z));
            RecyclerView.Adapter adapter = ((C36878y0) getBinding()).f91946b.getAdapter();
            C11079d2 d2Var = null;
            if (adapter instanceof OfferListAdapter) {
                offerListAdapter = (OfferListAdapter) adapter;
            } else {
                offerListAdapter = null;
            }
            if (offerListAdapter != null) {
                offerListAdapter.mo74171x(offerProductModel);
                d2Var = C11079d2.f28267a;
            }
            if (d2Var == null) {
                C28935i.m119705e(C28935i.f70940a, "No adapter available", (Throwable) null, 0, 6, (Object) null);
            }
        }
    }

    public final void setNavigator(@C12579k C28796c cVar) {
        Intrinsics.checkNotNullParameter(cVar, "<set-?>");
        this.f58826f = cVar;
    }

    /* renamed from: z */
    public final void mo67935z(OfferProductModel offerProductModel) {
        mo67933q1(offerProductModel, false);
        mo67917c1().mo75367d(mo67915a1().mo121689Q());
    }
}
