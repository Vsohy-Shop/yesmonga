package com.carrefour.fid.android.presentation.viewmodels.order.online.additionalorders;

import androidx.compose.runtime.internal.C8567o;
import com.carrefour.fid.android.domain.interactors.offer.C37716b;
import com.carrefour.fid.android.domain.interactors.remoteconfig.C37807b;
import com.carrefour.fid.android.domain.models.basket.BasketType;
import com.carrefour.fid.android.presentation.models.OfferProductModel;
import com.carrefour.fid.android.presentation.models.ProductModel;
import com.carrefour.fid.android.presentation.viewmodels.order.online.additionalorders.mvi.C26847b;
import com.carrefour.fid.android.shared.base.BaseMVIViewModel;
import com.carrefour.fid.android.shared.constant.C28547h2;
import com.carrefour.fid.android.tracking.orders.online.additionalorder.C28999d;
import com.carrefour.fid.android.tracking.orders.online.additionalorder.C29001e;
import com.carrefour.fid.android.tracking.product.C29021a;
import com.carrefour.fid.android.tracking.product.C29023c;
import dagger.hilt.android.lifecycle.C10245a;
import java.util.List;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.C11063b;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.C11723c2;
import kotlinx.coroutines.C12038j;
import kotlinx.coroutines.CoroutineStart;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C10245a
@C11076d0(mo22515d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u000f\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u00042\u00020\u0005B3\b\u0007\u0012\u0006\u0010,\u001a\u00020)\u0012\u0006\u00101\u001a\u000200\u0012\u0006\u00103\u001a\u000202\u0012\u0006\u0010/\u001a\u00020-\u0012\b\b\u0001\u00105\u001a\u000204¢\u0006\u0004\b6\u00107J!\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u0006H\u0001J!\u0010\u0011\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000eH\u0001J\u0019\u0010\u0012\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u000eH\u0001J\u0019\u0010\u0014\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u0013\u001a\u00020\u000eH\u0001J!\u0010\u0016\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u0015\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000eH\u0001J\u0019\u0010\u0017\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u000eH\u0001J+\u0010\u001b\u001a\u00020\n2\b\u0010\u0018\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0019\u001a\u00020\f2\u0006\u0010\u001a\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000eH\u0001J\u0013\u0010\u001c\u001a\u00020\n2\b\u0010\u0018\u001a\u0004\u0018\u00010\u0006H\u0001J\u0013\u0010\u001d\u001a\u00020\n2\b\u0010\u0018\u001a\u0004\u0018\u00010\u0006H\u0001J#\u0010 \u001a\u00020\n2\b\u0010\u0018\u001a\u0004\u0018\u00010\u00062\u000e\b\u0002\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\f0\u001eH\u0001J\u001b\u0010\"\u001a\u00020\n2\u0006\u0010!\u001a\u00020\u0003H@ø\u0001\u0000¢\u0006\u0004\b\"\u0010#J\u0010\u0010&\u001a\u00020\n2\u0006\u0010%\u001a\u00020$H\u0002J\u0016\u0010(\u001a\u00020\n2\f\u0010'\u001a\b\u0012\u0004\u0012\u00020\f0\u001eH\u0002R\u0014\u0010,\u001a\u00020)8\u0002X\u0004¢\u0006\u0006\n\u0004\b*\u0010+R\u0014\u0010/\u001a\u00020-8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010.\u0002\u0004\n\u0002\b\u0019¨\u00068"}, mo22516d2 = {"Lcom/carrefour/fid/android/presentation/viewmodels/order/online/additionalorders/AdditionalOrderDepartmentViewModel;", "Lcom/carrefour/fid/android/shared/base/BaseMVIViewModel;", "Lcom/carrefour/fid/android/presentation/viewmodels/order/online/additionalorders/mvi/b$b;", "Lcom/carrefour/fid/android/presentation/viewmodels/order/online/additionalorders/mvi/b$c;", "Lcom/carrefour/fid/android/tracking/product/c;", "Lcom/carrefour/fid/android/tracking/orders/online/additionalorder/d;", "", "screenClass", "screenName", "ecommerceZone", "Lkotlin/d2;", "H", "Lcom/carrefour/fid/android/presentation/models/OfferProductModel;", "product", "", "quantityAdded", "productPosition", "Z", "P", "initialQuantity", "N", "quantityRemoved", "t", "a0", "department", "offer", "quantityRemove", "J", "b", "q", "", "productList", "E", "intent", "h0", "(Lcom/carrefour/fid/android/presentation/viewmodels/order/online/additionalorders/mvi/b$c;Lkotlin/coroutines/c;)Ljava/lang/Object;", "", "withLoading", "i0", "listOfferProduct", "g0", "Lcom/carrefour/fid/android/domain/interactors/offer/b;", "a", "Lcom/carrefour/fid/android/domain/interactors/offer/b;", "offerListAndBasketController", "Lcom/carrefour/fid/android/domain/interactors/remoteconfig/b;", "Lcom/carrefour/fid/android/domain/interactors/remoteconfig/b;", "checkRemoteConfigUseCase", "Lcom/carrefour/fid/android/tracking/product/a;", "productListTracking", "Lcom/carrefour/fid/android/tracking/orders/online/additionalorder/e;", "tracking", "Lkotlinx/coroutines/CoroutineDispatcher;", "dispatcher", "<init>", "(Lcom/carrefour/fid/android/domain/interactors/offer/b;Lcom/carrefour/fid/android/tracking/product/a;Lcom/carrefour/fid/android/tracking/orders/online/additionalorder/e;Lcom/carrefour/fid/android/domain/interactors/remoteconfig/b;Lkotlinx/coroutines/CoroutineDispatcher;)V", "app_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
@C8567o(parameters = 0)
public final class AdditionalOrderDepartmentViewModel extends BaseMVIViewModel<C26847b.C26852b, C26847b.C26857c> implements C29023c, C28999d {

    /* renamed from: e */
    public static final int f65208e = 8;
    @C12579k

    /* renamed from: a */
    public final C37716b f65209a;
    @C12579k

    /* renamed from: b */
    public final C37807b f65210b;

    /* renamed from: c */
    public final /* synthetic */ C29021a f65211c;

    /* renamed from: d */
    public final /* synthetic */ C29001e f65212d;

    /* JADX WARNING: Illegal instructions before constructor call */
    @javax.inject.Inject
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public AdditionalOrderDepartmentViewModel(@org.jetbrains.annotations.C12579k com.carrefour.fid.android.domain.interactors.offer.C37716b r20, @org.jetbrains.annotations.C12579k com.carrefour.fid.android.tracking.product.C29021a r21, @org.jetbrains.annotations.C12579k com.carrefour.fid.android.tracking.orders.online.additionalorder.C29001e r22, @org.jetbrains.annotations.C12579k com.carrefour.fid.android.domain.interactors.remoteconfig.C37807b r23, @com.carrefour.fid.android.shared.p045di.annotation.C28672p @org.jetbrains.annotations.C12579k kotlinx.coroutines.CoroutineDispatcher r24) {
        /*
            r19 = this;
            r6 = r19
            r7 = r20
            r8 = r21
            r9 = r22
            r10 = r23
            java.lang.String r0 = "offerListAndBasketController"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r0)
            java.lang.String r0 = "productListTracking"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r0)
            java.lang.String r0 = "tracking"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r9, r0)
            java.lang.String r0 = "checkRemoteConfigUseCase"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r10, r0)
            java.lang.String r0 = "dispatcher"
            r2 = r24
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            com.carrefour.fid.android.presentation.viewmodels.order.online.additionalorders.mvi.b$b$b r1 = com.carrefour.fid.android.presentation.viewmodels.order.online.additionalorders.mvi.C26847b.C26852b.C26854b.f65457b
            r3 = 0
            r4 = 4
            r5 = 0
            r0 = r19
            r0.<init>(r1, r2, r3, r4, r5)
            r6.f65209a = r7
            r6.f65210b = r10
            r6.f65211c = r8
            r6.f65212d = r9
            kotlinx.coroutines.o0 r7 = r19.getMviScope()
            r8 = 0
            r9 = 0
            com.carrefour.fid.android.presentation.viewmodels.order.online.additionalorders.AdditionalOrderDepartmentViewModel$1 r10 = new com.carrefour.fid.android.presentation.viewmodels.order.online.additionalorders.AdditionalOrderDepartmentViewModel$1
            r0 = 0
            r10.<init>(r6, r0)
            r11 = 3
            r12 = 0
            kotlinx.coroutines.C11723c2 unused = kotlinx.coroutines.C12038j.m48061f(r7, r8, r9, r10, r11, r12)
            kotlinx.coroutines.o0 r13 = r19.getMviScope()
            r14 = 0
            r15 = 0
            com.carrefour.fid.android.presentation.viewmodels.order.online.additionalorders.AdditionalOrderDepartmentViewModel$2 r1 = new com.carrefour.fid.android.presentation.viewmodels.order.online.additionalorders.AdditionalOrderDepartmentViewModel$2
            r1.<init>(r6, r0)
            r17 = 3
            r18 = 0
            r16 = r1
            kotlinx.coroutines.C11723c2 unused = kotlinx.coroutines.C12038j.m48061f(r13, r14, r15, r16, r17, r18)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.presentation.viewmodels.order.online.additionalorders.AdditionalOrderDepartmentViewModel.<init>(com.carrefour.fid.android.domain.interactors.offer.b, com.carrefour.fid.android.tracking.product.a, com.carrefour.fid.android.tracking.orders.online.additionalorder.e, com.carrefour.fid.android.domain.interactors.remoteconfig.b, kotlinx.coroutines.CoroutineDispatcher):void");
    }

    /* renamed from: E */
    public void mo77645E(@C12580l String str, @C12579k List<? extends OfferProductModel> list) {
        Intrinsics.checkNotNullParameter(list, "productList");
        this.f65212d.mo77645E(str, list);
    }

    /* renamed from: H */
    public void mo77646H(@C12579k String str, @C12579k String str2, @C12579k String str3) {
        Intrinsics.checkNotNullParameter(str, "screenClass");
        Intrinsics.checkNotNullParameter(str2, "screenName");
        Intrinsics.checkNotNullParameter(str3, "ecommerceZone");
        this.f65211c.mo77646H(str, str2, str3);
    }

    /* renamed from: J */
    public void mo77647J(@C12580l String str, @C12579k OfferProductModel offerProductModel, int i, int i2) {
        Intrinsics.checkNotNullParameter(offerProductModel, C28547h2.f69318f);
        this.f65212d.mo77647J(str, offerProductModel, i, i2);
    }

    /* renamed from: N */
    public void mo77648N(@C12579k OfferProductModel offerProductModel, int i) {
        Intrinsics.checkNotNullParameter(offerProductModel, "product");
        this.f65211c.mo77648N(offerProductModel, i);
    }

    /* renamed from: P */
    public void mo77649P(@C12579k OfferProductModel offerProductModel, int i) {
        Intrinsics.checkNotNullParameter(offerProductModel, "product");
        this.f65211c.mo77649P(offerProductModel, i);
    }

    /* renamed from: Z */
    public void mo77650Z(@C12579k OfferProductModel offerProductModel, int i, int i2) {
        Intrinsics.checkNotNullParameter(offerProductModel, "product");
        this.f65211c.mo77650Z(offerProductModel, i, i2);
    }

    /* renamed from: a0 */
    public void mo77651a0(@C12579k OfferProductModel offerProductModel, int i) {
        Intrinsics.checkNotNullParameter(offerProductModel, "product");
        this.f65211c.mo77651a0(offerProductModel, i);
    }

    /* renamed from: b */
    public void mo77652b(@C12580l String str) {
        this.f65212d.mo77652b(str);
    }

    /* renamed from: g0 */
    public final void mo77653g0(List<? extends OfferProductModel> list) {
        C11723c2 unused = C12038j.m48061f(getMviScope(), (CoroutineContext) null, (CoroutineStart) null, new AdditionalOrderDepartmentViewModel$loadListOfferProduct$1(this, list, (C11045c<? super AdditionalOrderDepartmentViewModel$loadListOfferProduct$1>) null), 3, (Object) null);
    }

    @C12580l
    /* renamed from: h0 */
    public Object processIntent(@C12579k C26847b.C26857c cVar, @C12579k C11045c<? super C11079d2> cVar2) {
        boolean z;
        if (cVar instanceof C26847b.C26857c.C26860c) {
            mo77653g0(((C26847b.C26857c.C26860c) cVar).mo77973d());
        } else if (cVar instanceof C26847b.C26857c.C26864g) {
            mo77655i0(((C26847b.C26857c.C26864g) cVar).mo77999d());
        } else if (cVar instanceof C26847b.C26857c.C26858a) {
            Object a = C37716b.C37717a.m154589a(this.f65209a, ((C26847b.C26857c.C26858a) cVar).mo77961d(), true, (Integer) null, true, cVar2, 4, (Object) null);
            if (a == C11063b.m42612h()) {
                return a;
            }
            return C11079d2.f28267a;
        } else if (cVar instanceof C26847b.C26857c.C26861d) {
            C26847b.C26857c.C26861d dVar = (C26847b.C26857c.C26861d) cVar;
            Object d = this.f65209a.mo114796d(dVar.mo77980e(), dVar.mo77982f(), cVar2);
            if (d == C11063b.m42612h()) {
                return d;
            }
            return C11079d2.f28267a;
        } else if (cVar instanceof C26847b.C26857c.C26859b) {
            Object e = this.f65209a.mo114797e(((C26847b.C26857c.C26859b) cVar).mo77967d(), cVar2);
            if (e == C11063b.m42612h()) {
                return e;
            }
            return C11079d2.f28267a;
        } else if (cVar instanceof C26847b.C26857c.C26862e) {
            Object k = this.f65209a.mo114802k(((C26847b.C26857c.C26862e) cVar).mo77987d(), cVar2);
            if (k == C11063b.m42612h()) {
                return k;
            }
            return C11079d2.f28267a;
        } else if (cVar instanceof C26847b.C26857c.C26865h) {
            C26847b.C26857c.C26865h hVar = (C26847b.C26857c.C26865h) cVar;
            emitEvent(new C26847b.C26848a.C26851c(hVar.mo78008f(), hVar.mo78006e(), BasketType.BASKET_V4_ADDITIONAL_ORDER));
        } else if (cVar instanceof C26847b.C26857c.C26863f) {
            C26847b.C26857c.C26863f fVar = (C26847b.C26857c.C26863f) cVar;
            ProductModel o0 = fVar.mo77993d().mo121517o0();
            if (o0 != null) {
                z = o0.mo121867A();
            } else {
                z = false;
            }
            emitEvent(new C26847b.C26848a.C26850b(fVar.mo77993d(), z));
        }
        return C11079d2.f28267a;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0020, code lost:
        if (r3 != false) goto L_0x0022;
     */
    /* renamed from: i0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo77655i0(boolean r5) {
        /*
            r4 = this;
            com.carrefour.fid.android.shared.base.u$d r0 = r4.getCurrentState()
            boolean r0 = r0 instanceof com.carrefour.fid.android.presentation.viewmodels.order.online.additionalorders.mvi.C26847b.C26852b.C26855c
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L_0x0022
            com.carrefour.fid.android.shared.base.u$d r0 = r4.getCurrentState()
            boolean r3 = r0 instanceof com.carrefour.fid.android.presentation.viewmodels.order.online.additionalorders.mvi.C26847b.C26852b.C26855c
            if (r3 == 0) goto L_0x0015
            com.carrefour.fid.android.presentation.viewmodels.order.online.additionalorders.mvi.b$b$c r0 = (com.carrefour.fid.android.presentation.viewmodels.order.online.additionalorders.mvi.C26847b.C26852b.C26855c) r0
            goto L_0x0016
        L_0x0015:
            r0 = r2
        L_0x0016:
            r3 = 0
            if (r0 == 0) goto L_0x0020
            boolean r0 = r0.isLoading()
            if (r0 != 0) goto L_0x0020
            r3 = r1
        L_0x0020:
            if (r3 == 0) goto L_0x002c
        L_0x0022:
            if (r5 == 0) goto L_0x002c
            com.carrefour.fid.android.presentation.viewmodels.order.online.additionalorders.mvi.b$b$c r5 = new com.carrefour.fid.android.presentation.viewmodels.order.online.additionalorders.mvi.b$b$c
            r5.<init>(r1)
            r4.publishState(r5)
        L_0x002c:
            com.carrefour.fid.android.domain.interactors.offer.b r5 = r4.f65209a
            r0 = 3
            com.carrefour.fid.android.domain.interactors.offer.C37716b.C37717a.m154592d(r5, r2, r2, r0, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.presentation.viewmodels.order.online.additionalorders.AdditionalOrderDepartmentViewModel.mo77655i0(boolean):void");
    }

    /* renamed from: q */
    public void mo77656q(@C12580l String str) {
        this.f65212d.mo77656q(str);
    }

    /* renamed from: t */
    public void mo77657t(@C12579k OfferProductModel offerProductModel, int i, int i2) {
        Intrinsics.checkNotNullParameter(offerProductModel, "product");
        this.f65211c.mo77657t(offerProductModel, i, i2);
    }
}
