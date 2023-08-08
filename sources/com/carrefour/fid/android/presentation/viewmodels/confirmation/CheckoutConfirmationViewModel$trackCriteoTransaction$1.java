package com.carrefour.fid.android.presentation.viewmodels.confirmation;

import com.carrefour.fid.android.domain.models.OrderConfirmationModel;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.jvm.internal.C11067d;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.internal.C11363r0;
import kotlinx.coroutines.C12074o0;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11067d(mo22501c = "com.carrefour.fid.android.presentation.viewmodels.confirmation.CheckoutConfirmationViewModel$trackCriteoTransaction$1", mo22502f = "CheckoutConfirmationViewModel.kt", mo22503i = {}, mo22504l = {161, 162, 175}, mo22505m = "invokeSuspend", mo22506n = {}, mo22507s = {})
@C11076d0(mo22515d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H@"}, mo22516d2 = {"Lkotlinx/coroutines/o0;", "Lkotlin/d2;", "<anonymous>"}, mo22517k = 3, mo22518mv = {1, 8, 0})
@C11363r0({"SMAP\nCheckoutConfirmationViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CheckoutConfirmationViewModel.kt\ncom/carrefour/fid/android/presentation/viewmodels/confirmation/CheckoutConfirmationViewModel$trackCriteoTransaction$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,224:1\n1603#2,9:225\n1855#2:234\n1856#2:236\n1612#2:237\n1855#2:238\n1856#2:240\n1#3:235\n1#3:239\n*S KotlinDebug\n*F\n+ 1 CheckoutConfirmationViewModel.kt\ncom/carrefour/fid/android/presentation/viewmodels/confirmation/CheckoutConfirmationViewModel$trackCriteoTransaction$1\n*L\n164#1:225,9\n164#1:234\n164#1:236\n164#1:237\n168#1:238\n168#1:240\n164#1:235\n*E\n"})
public final class CheckoutConfirmationViewModel$trackCriteoTransaction$1 extends SuspendLambda implements C11304p<C12074o0, C11045c<? super C11079d2>, Object> {
    final /* synthetic */ OrderConfirmationModel $orderConfirmationModel;
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ CheckoutConfirmationViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CheckoutConfirmationViewModel$trackCriteoTransaction$1(CheckoutConfirmationViewModel checkoutConfirmationViewModel, OrderConfirmationModel orderConfirmationModel, C11045c<? super CheckoutConfirmationViewModel$trackCriteoTransaction$1> cVar) {
        super(2, cVar);
        this.this$0 = checkoutConfirmationViewModel;
        this.$orderConfirmationModel = orderConfirmationModel;
    }

    @C12579k
    public final C11045c<C11079d2> create(@C12580l Object obj, @C12579k C11045c<?> cVar) {
        return new CheckoutConfirmationViewModel$trackCriteoTransaction$1(this.this$0, this.$orderConfirmationModel, cVar);
    }

    /* JADX WARNING: Removed duplicated region for block: B:32:0x00a5  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x012f  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x0135  */
    @org.jetbrains.annotations.C12580l
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.C12579k java.lang.Object r15) {
        /*
            r14 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r1 = r14.label
            r2 = 3
            r3 = 2
            r4 = 1
            r5 = 0
            if (r1 == 0) goto L_0x0036
            if (r1 == r4) goto L_0x0032
            if (r1 == r3) goto L_0x0027
            if (r1 != r2) goto L_0x001f
            java.lang.Object r0 = r14.L$2
            com.carrefour.fid.android.presentation.viewmodels.confirmation.CheckoutConfirmationViewModel r0 = (com.carrefour.fid.android.presentation.viewmodels.confirmation.CheckoutConfirmationViewModel) r0
            java.lang.Object r1 = r14.L$1
            com.carrefour.fid.android.domain.models.OrderConfirmationModel r1 = (com.carrefour.fid.android.domain.models.OrderConfirmationModel) r1
            kotlin.C11661u0.m45747n(r15)
            goto L_0x0129
        L_0x001f:
            java.lang.IllegalStateException r15 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r15.<init>(r0)
            throw r15
        L_0x0027:
            kotlin.C11661u0.m45747n(r15)
            kotlin.Result r15 = (kotlin.Result) r15
            java.lang.Object r15 = r15.mo21858l()
            goto L_0x009b
        L_0x0032:
            kotlin.C11661u0.m45747n(r15)
            goto L_0x0048
        L_0x0036:
            kotlin.C11661u0.m45747n(r15)
            com.carrefour.fid.android.presentation.viewmodels.confirmation.CheckoutConfirmationViewModel r15 = r14.this$0
            com.carrefour.fid.android.loyalty.core.datastore.LoyaltyPreferencesStorage r15 = r15.f64074l
            r14.label = r4
            java.lang.Object r15 = r15.hasLoyaltyCard(r14)
            if (r15 != r0) goto L_0x0048
            return r0
        L_0x0048:
            java.lang.Boolean r15 = (java.lang.Boolean) r15
            boolean r8 = r15.booleanValue()
            com.carrefour.fid.android.presentation.viewmodels.confirmation.CheckoutConfirmationViewModel r15 = r14.this$0
            com.carrefour.fid.android.domain.interactors.product.list.GetOfferProductListUseCase r15 = r15.f64071i
            com.carrefour.fid.android.domain.models.OrderConfirmationModel r1 = r14.$orderConfirmationModel
            if (r1 == 0) goto L_0x007f
            java.util.List r1 = r1.mo116151c()
            if (r1 == 0) goto L_0x007f
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            java.util.Iterator r1 = r1.iterator()
        L_0x0069:
            boolean r7 = r1.hasNext()
            if (r7 == 0) goto L_0x0080
            java.lang.Object r7 = r1.next()
            com.carrefour.fid.android.domain.models.OrderOfferModel r7 = (com.carrefour.fid.android.domain.models.OrderOfferModel) r7
            java.lang.String r7 = r7.mo116200a()
            if (r7 == 0) goto L_0x0069
            r6.add(r7)
            goto L_0x0069
        L_0x007f:
            r6 = r5
        L_0x0080:
            if (r6 != 0) goto L_0x0088
            java.util.List r1 = kotlin.collections.CollectionsKt__CollectionsKt.m40441E()
            r7 = r1
            goto L_0x0089
        L_0x0088:
            r7 = r6
        L_0x0089:
            r9 = 0
            r10 = 4
            r11 = 0
            com.carrefour.fid.android.domain.interactors.product.list.GetOfferProductListUseCase$a r1 = new com.carrefour.fid.android.domain.interactors.product.list.GetOfferProductListUseCase$a
            r6 = r1
            r6.<init>(r7, r8, r9, r10, r11)
            r14.label = r3
            java.lang.Object r15 = r15.m172988invokegIAlus(r1, r14)
            if (r15 != r0) goto L_0x009b
            return r0
        L_0x009b:
            com.carrefour.fid.android.domain.models.OrderConfirmationModel r1 = r14.$orderConfirmationModel
            com.carrefour.fid.android.presentation.viewmodels.confirmation.CheckoutConfirmationViewModel r6 = r14.this$0
            boolean r7 = kotlin.Result.m38710j(r15)
            if (r7 == 0) goto L_0x013a
            r7 = r15
            java.util.List r7 = (java.util.List) r7
            if (r1 == 0) goto L_0x0103
            java.util.List r8 = r1.mo116151c()
            if (r8 == 0) goto L_0x0103
            java.lang.Iterable r8 = (java.lang.Iterable) r8
            java.util.Iterator r8 = r8.iterator()
        L_0x00b6:
            boolean r9 = r8.hasNext()
            if (r9 == 0) goto L_0x0103
            java.lang.Object r9 = r8.next()
            com.carrefour.fid.android.domain.models.OrderOfferModel r9 = (com.carrefour.fid.android.domain.models.OrderOfferModel) r9
            java.util.List r10 = com.carrefour.fid.android.domain.extension.C37507h.m153957i(r7)
            java.lang.Iterable r10 = (java.lang.Iterable) r10
            java.util.Iterator r10 = r10.iterator()
        L_0x00cc:
            boolean r11 = r10.hasNext()
            if (r11 == 0) goto L_0x00f0
            java.lang.Object r11 = r10.next()
            r12 = r11
            com.carrefour.fid.android.presentation.models.OfferProductModel r12 = (com.carrefour.fid.android.presentation.models.OfferProductModel) r12
            java.lang.String r13 = r9.mo116200a()
            com.carrefour.fid.android.presentation.models.ProductModel r12 = r12.mo121517o0()
            if (r12 == 0) goto L_0x00e8
            java.lang.String r12 = r12.mo121889s()
            goto L_0x00e9
        L_0x00e8:
            r12 = r5
        L_0x00e9:
            boolean r12 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r13, (java.lang.Object) r12)
            if (r12 == 0) goto L_0x00cc
            goto L_0x00f1
        L_0x00f0:
            r11 = r5
        L_0x00f1:
            com.carrefour.fid.android.presentation.models.OfferProductModel r11 = (com.carrefour.fid.android.presentation.models.OfferProductModel) r11
            if (r11 == 0) goto L_0x00fe
            double r10 = com.carrefour.fid.android.presentation.models.extension.OfferProductModelKt.m159584f(r11)
            java.lang.Double r10 = kotlin.coroutines.jvm.internal.C11064a.m42618d(r10)
            goto L_0x00ff
        L_0x00fe:
            r10 = r5
        L_0x00ff:
            r9.mo116203d(r10)
            goto L_0x00b6
        L_0x0103:
            r8 = r7
            java.util.Collection r8 = (java.util.Collection) r8
            boolean r8 = r8.isEmpty()
            r4 = r4 ^ r8
            if (r4 == 0) goto L_0x0119
            com.carrefour.fid.android.presentation.viewmodels.confirmation.a r4 = r6.mo76195y0()
            java.lang.String r7 = r6.mo76194x0(r7)
            r8 = 0
            com.carrefour.fid.android.presentation.viewmodels.confirmation.C26196a.m112008i(r4, r7, r8, r3, r5)
        L_0x0119:
            r14.L$0 = r15
            r14.L$1 = r1
            r14.L$2 = r6
            r14.label = r2
            java.lang.Object r15 = r6.mo76187I0(r1, r14)
            if (r15 != r0) goto L_0x0128
            return r0
        L_0x0128:
            r0 = r6
        L_0x0129:
            com.carrefour.fid.android.ecommerce.checkout.manager.a r15 = r0.f64070h
            if (r1 == 0) goto L_0x0133
            java.lang.String r5 = r1.mo116155f()
        L_0x0133:
            if (r5 != 0) goto L_0x0137
            java.lang.String r5 = ""
        L_0x0137:
            r15.mo119633a(r5)
        L_0x013a:
            kotlin.d2 r15 = kotlin.C11079d2.f28267a
            return r15
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.presentation.viewmodels.confirmation.CheckoutConfirmationViewModel$trackCriteoTransaction$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @C12580l
    public final Object invoke(@C12579k C12074o0 o0Var, @C12580l C11045c<? super C11079d2> cVar) {
        return ((CheckoutConfirmationViewModel$trackCriteoTransaction$1) create(o0Var, cVar)).invokeSuspend(C11079d2.f28267a);
    }
}
