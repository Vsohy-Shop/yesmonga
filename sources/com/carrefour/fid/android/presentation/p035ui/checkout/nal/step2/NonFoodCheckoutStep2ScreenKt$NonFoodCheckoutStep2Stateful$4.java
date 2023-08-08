package com.carrefour.fid.android.presentation.p035ui.checkout.nal.step2;

import android.os.Bundle;
import androidx.compose.material.C3036d1;
import androidx.compose.runtime.C8578k2;
import androidx.compose.runtime.C8700z0;
import com.carrefour.fid.android.domain.models.AddressCategory;
import com.carrefour.fid.android.domain.models.account.Address;
import com.carrefour.fid.android.presentation.p035ui.checkout.nal.step2.analytics.C23614a;
import com.carrefour.fid.android.presentation.p035ui.loyalty.fragments.otp.analytics.C24603a;
import com.carrefour.fid.android.presentation.viewmodels.checkout.nal.step2.NonFoodCheckoutStep2ViewModel;
import com.carrefour.fid.android.presentation.viewmodels.checkout.nal.step2.events.C26177a;
import com.carrefour.fid.android.presentation.viewmodels.checkout.nal.step2.state.C26191b;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.C11661u0;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.intrinsics.C11063b;
import kotlin.coroutines.jvm.internal.C11067d;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.functions.C11306r;
import kotlin.jvm.internal.C11363r0;
import kotlinx.coroutines.C12074o0;
import kotlinx.coroutines.flow.C11907e;
import kotlinx.coroutines.flow.C11909g;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11067d(mo22501c = "com.carrefour.fid.android.presentation.ui.checkout.nal.step2.NonFoodCheckoutStep2ScreenKt$NonFoodCheckoutStep2Stateful$4", mo22502f = "NonFoodCheckoutStep2Screen.kt", mo22503i = {}, mo22504l = {}, mo22505m = "invokeSuspend", mo22506n = {}, mo22507s = {})
@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
/* renamed from: com.carrefour.fid.android.presentation.ui.checkout.nal.step2.NonFoodCheckoutStep2ScreenKt$NonFoodCheckoutStep2Stateful$4 */
public final class NonFoodCheckoutStep2ScreenKt$NonFoodCheckoutStep2Stateful$4 extends SuspendLambda implements C11304p<C12074o0, C11045c<? super C11079d2>, Object> {
    final /* synthetic */ C23614a $analytics;
    final /* synthetic */ C12074o0 $coroutineScope;
    final /* synthetic */ String $errorMessage;
    final /* synthetic */ C8700z0<String> $loyaltyCardSecretCodeCheck$delegate;
    final /* synthetic */ C11304p<Bundle, String, C11079d2> $onBasketValidated;
    final /* synthetic */ C11306r<Address, Address, AddressCategory, String, C11079d2> $onEditAddressPressed;
    final /* synthetic */ C11300l<String, C11079d2> $onFidCardBlocked;
    final /* synthetic */ C11304p<Bundle, String, C11079d2> $onRedirectToConfirmationOrder;
    final /* synthetic */ C11289a<C11079d2> $onRemovePromoCodeError;
    final /* synthetic */ C24603a $otpAnalytics;
    final /* synthetic */ C3036d1 $scaffoldState;
    final /* synthetic */ C11907e<C26177a> $sideEffect;
    final /* synthetic */ C8578k2<C26191b> $state;
    final /* synthetic */ NonFoodCheckoutStep2ViewModel $viewModel;
    private /* synthetic */ Object L$0;
    int label;

    @C11067d(mo22501c = "com.carrefour.fid.android.presentation.ui.checkout.nal.step2.NonFoodCheckoutStep2ScreenKt$NonFoodCheckoutStep2Stateful$4$1", mo22502f = "NonFoodCheckoutStep2Screen.kt", mo22503i = {}, mo22504l = {}, mo22505m = "invokeSuspend", mo22506n = {}, mo22507s = {})
    @C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
    @C11363r0({"SMAP\nNonFoodCheckoutStep2Screen.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NonFoodCheckoutStep2Screen.kt\ncom/carrefour/fid/android/presentation/ui/checkout/nal/step2/NonFoodCheckoutStep2ScreenKt$NonFoodCheckoutStep2Stateful$4$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,932:1\n288#2,2:933\n*S KotlinDebug\n*F\n+ 1 NonFoodCheckoutStep2Screen.kt\ncom/carrefour/fid/android/presentation/ui/checkout/nal/step2/NonFoodCheckoutStep2ScreenKt$NonFoodCheckoutStep2Stateful$4$1\n*L\n247#1:933,2\n*E\n"})
    /* renamed from: com.carrefour.fid.android.presentation.ui.checkout.nal.step2.NonFoodCheckoutStep2ScreenKt$NonFoodCheckoutStep2Stateful$4$1 */
    public static final class C236081 extends SuspendLambda implements C11304p<C26177a, C11045c<? super C11079d2>, Object> {
        /* synthetic */ Object L$0;
        int label;

        @C12579k
        public final C11045c<C11079d2> create(@C12580l Object obj, @C12579k C11045c<?> cVar) {
            C23614a aVar = aVar;
            C11304p<Bundle, String, C11079d2> pVar = pVar;
            NonFoodCheckoutStep2ViewModel nonFoodCheckoutStep2ViewModel = nonFoodCheckoutStep2ViewModel;
            C11304p<Bundle, String, C11079d2> pVar2 = pVar2;
            C11306r<Address, Address, AddressCategory, String, C11079d2> rVar = rVar;
            C12074o0 o0Var = o0Var;
            C11289a<C11079d2> aVar2 = aVar2;
            C24603a aVar3 = aVar3;
            C11300l<String, C11079d2> lVar = lVar;
            C8578k2<C26191b> k2Var = k2Var;
            C3036d1 d1Var = d1Var;
            String str = str2;
            C8700z0<String> z0Var = z0Var2;
            C236081 r0 = r1;
            C236081 r1 = new C236081(aVar, pVar, nonFoodCheckoutStep2ViewModel, pVar2, rVar, o0Var, aVar2, aVar3, lVar, k2Var, d1Var, str, z0Var, cVar);
            r0.L$0 = obj;
            return r0;
        }

        @C12580l
        /* renamed from: g */
        public final Object invoke(@C12579k C26177a aVar, @C12580l C11045c<? super C11079d2> cVar) {
            return ((C236081) create(aVar, cVar)).invokeSuspend(C11079d2.f28267a);
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v0, resolved type: com.carrefour.fid.android.presentation.viewmodels.checkout.nal.step2.state.b$b} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v8, resolved type: com.carrefour.fid.android.presentation.viewmodels.checkout.nal.step2.state.b$b} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v3, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v1, resolved type: com.carrefour.fid.android.presentation.viewmodels.checkout.nal.step2.state.b$b} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v11, resolved type: com.carrefour.fid.android.presentation.viewmodels.checkout.nal.step2.state.b$b} */
        /* JADX WARNING: Multi-variable type inference failed */
        @org.jetbrains.annotations.C12580l
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.C12579k java.lang.Object r9) {
            /*
                r8 = this;
                kotlin.coroutines.intrinsics.C11063b.m42612h()
                int r0 = r8.label
                if (r0 != 0) goto L_0x0100
                kotlin.C11661u0.m45747n(r9)
                java.lang.Object r9 = r8.L$0
                com.carrefour.fid.android.presentation.viewmodels.checkout.nal.step2.events.a r9 = (com.carrefour.fid.android.presentation.viewmodels.checkout.nal.step2.events.C26177a) r9
                boolean r0 = r9 instanceof com.carrefour.fid.android.presentation.viewmodels.checkout.nal.step2.events.C26177a.C26183f
                r1 = 0
                if (r0 == 0) goto L_0x008c
                com.carrefour.fid.android.presentation.ui.checkout.nal.step2.analytics.a r0 = r4
                androidx.compose.runtime.k2<com.carrefour.fid.android.presentation.viewmodels.checkout.nal.step2.state.b> r2 = r13
                java.lang.Object r2 = r2.getValue()
                com.carrefour.fid.android.presentation.viewmodels.checkout.nal.step2.state.b r2 = (com.carrefour.fid.android.presentation.viewmodels.checkout.nal.step2.state.C26191b) r2
                com.carrefour.fid.android.shared.type.e r2 = r2.mo76128n()
                java.lang.Object r2 = com.carrefour.fid.android.shared.type.C28897f.m119478b(r2)
                java.util.List r2 = (java.util.List) r2
                if (r2 == 0) goto L_0x0050
                java.lang.Iterable r2 = (java.lang.Iterable) r2
                java.util.Iterator r2 = r2.iterator()
            L_0x002f:
                boolean r3 = r2.hasNext()
                if (r3 == 0) goto L_0x0043
                java.lang.Object r3 = r2.next()
                r4 = r3
                com.carrefour.fid.android.presentation.viewmodels.checkout.nal.step2.state.b$b r4 = (com.carrefour.fid.android.presentation.viewmodels.checkout.nal.step2.state.C26191b.C26193b) r4
                boolean r4 = r4.mo76156f()
                if (r4 == 0) goto L_0x002f
                r1 = r3
            L_0x0043:
                com.carrefour.fid.android.presentation.viewmodels.checkout.nal.step2.state.b$b r1 = (com.carrefour.fid.android.presentation.viewmodels.checkout.nal.step2.state.C26191b.C26193b) r1
                if (r1 == 0) goto L_0x0050
                com.carrefour.fid.android.domain.models.delivery.b r1 = r1.mo76154e()
                if (r1 == 0) goto L_0x0050
                r0.mo69143e(r1)
            L_0x0050:
                com.carrefour.fid.android.presentation.viewmodels.checkout.nal.step2.events.a$f r9 = (com.carrefour.fid.android.presentation.viewmodels.checkout.nal.step2.events.C26177a.C26183f) r9
                com.carrefour.fid.android.presentation.models.PaymentConfirmationModel r0 = r9.mo76102d()
                boolean r1 = r0 instanceof com.carrefour.fid.android.presentation.models.PaymentConfirmationModel.FullFidPayment
                if (r1 == 0) goto L_0x0071
                kotlin.jvm.functions.p<android.os.Bundle, java.lang.String, kotlin.d2> r0 = r5
                com.carrefour.fid.android.presentation.models.PaymentConfirmationModel r9 = r9.mo76102d()
                com.carrefour.fid.android.presentation.models.PaymentConfirmationModel$FullFidPayment r9 = (com.carrefour.fid.android.presentation.models.PaymentConfirmationModel.FullFidPayment) r9
                android.os.Bundle r9 = r9.mo121787d()
                com.carrefour.fid.android.presentation.viewmodels.checkout.nal.step2.NonFoodCheckoutStep2ViewModel r1 = r6
                java.lang.String r1 = r1.mo75984O0()
                r0.invoke(r9, r1)
                goto L_0x00fd
            L_0x0071:
                boolean r0 = r0 instanceof com.carrefour.fid.android.presentation.models.PaymentConfirmationModel.SdpPayment
                if (r0 == 0) goto L_0x00fd
                kotlin.jvm.functions.p<android.os.Bundle, java.lang.String, kotlin.d2> r0 = r7
                com.carrefour.fid.android.presentation.models.PaymentConfirmationModel r9 = r9.mo76102d()
                com.carrefour.fid.android.presentation.models.PaymentConfirmationModel$SdpPayment r9 = (com.carrefour.fid.android.presentation.models.PaymentConfirmationModel.SdpPayment) r9
                android.os.Bundle r9 = r9.mo121799d()
                com.carrefour.fid.android.presentation.viewmodels.checkout.nal.step2.NonFoodCheckoutStep2ViewModel r1 = r6
                java.lang.String r1 = r1.mo75984O0()
                r0.invoke(r9, r1)
                goto L_0x00fd
            L_0x008c:
                boolean r0 = r9 instanceof com.carrefour.fid.android.presentation.viewmodels.checkout.nal.step2.events.C26177a.C26180c
                if (r0 == 0) goto L_0x00a8
                kotlin.jvm.functions.r<com.carrefour.fid.android.domain.models.account.Address, com.carrefour.fid.android.domain.models.account.Address, com.carrefour.fid.android.domain.models.AddressCategory, java.lang.String, kotlin.d2> r0 = r8
                com.carrefour.fid.android.presentation.viewmodels.checkout.nal.step2.events.a$c r9 = (com.carrefour.fid.android.presentation.viewmodels.checkout.nal.step2.events.C26177a.C26180c) r9
                com.carrefour.fid.android.domain.models.account.Address r1 = r9.mo76088g()
                com.carrefour.fid.android.domain.models.account.Address r2 = r9.mo76091i()
                com.carrefour.fid.android.domain.models.AddressCategory r3 = r9.mo76089h()
                java.lang.String r9 = r9.mo76092j()
                r0.invoke(r1, r2, r3, r9)
                goto L_0x00fd
            L_0x00a8:
                boolean r0 = r9 instanceof com.carrefour.fid.android.presentation.viewmodels.checkout.nal.step2.events.C26177a.C26182e
                if (r0 == 0) goto L_0x00bf
                kotlinx.coroutines.o0 r2 = r9
                r3 = 0
                r4 = 0
                com.carrefour.fid.android.presentation.ui.checkout.nal.step2.NonFoodCheckoutStep2ScreenKt$NonFoodCheckoutStep2Stateful$4$1$2 r5 = new com.carrefour.fid.android.presentation.ui.checkout.nal.step2.NonFoodCheckoutStep2ScreenKt$NonFoodCheckoutStep2Stateful$4$1$2
                androidx.compose.material.d1 r9 = r14
                java.lang.String r0 = r15
                r5.<init>(r9, r0, r1)
                r6 = 3
                r7 = 0
                kotlinx.coroutines.C11723c2 unused = kotlinx.coroutines.C12038j.m48061f(r2, r3, r4, r5, r6, r7)
                goto L_0x00fd
            L_0x00bf:
                boolean r0 = r9 instanceof com.carrefour.fid.android.presentation.viewmodels.checkout.nal.step2.events.C26177a.C26184g
                if (r0 == 0) goto L_0x00c9
                kotlin.jvm.functions.a<kotlin.d2> r9 = r10
                r9.invoke()
                goto L_0x00fd
            L_0x00c9:
                boolean r0 = r9 instanceof com.carrefour.fid.android.presentation.viewmodels.checkout.nal.step2.events.C26177a.C26181d
                if (r0 == 0) goto L_0x00df
                com.carrefour.fid.android.presentation.ui.loyalty.fragments.otp.analytics.a r0 = r11
                r1 = 1
                r0.mo71919c(r1)
                androidx.compose.runtime.z0<java.lang.String> r0 = r16
                com.carrefour.fid.android.presentation.viewmodels.checkout.nal.step2.events.a$d r9 = (com.carrefour.fid.android.presentation.viewmodels.checkout.nal.step2.events.C26177a.C26181d) r9
                java.lang.String r9 = r9.mo76096d()
                com.carrefour.fid.android.presentation.p035ui.checkout.nal.step2.NonFoodCheckoutStep2ScreenKt.m104883l(r0, r9)
                goto L_0x00fd
            L_0x00df:
                boolean r0 = r9 instanceof com.carrefour.fid.android.presentation.viewmodels.checkout.nal.step2.events.C26177a.C26179b
                if (r0 == 0) goto L_0x00e9
                androidx.compose.runtime.z0<java.lang.String> r9 = r16
                com.carrefour.fid.android.presentation.p035ui.checkout.nal.step2.NonFoodCheckoutStep2ScreenKt.m104883l(r9, r1)
                goto L_0x00fd
            L_0x00e9:
                boolean r0 = r9 instanceof com.carrefour.fid.android.presentation.viewmodels.checkout.nal.step2.events.C26177a.C26178a
                if (r0 == 0) goto L_0x00fd
                com.carrefour.fid.android.presentation.viewmodels.checkout.nal.step2.NonFoodCheckoutStep2ViewModel r0 = r6
                r0.mo75991V0()
                kotlin.jvm.functions.l<java.lang.String, kotlin.d2> r0 = r12
                com.carrefour.fid.android.presentation.viewmodels.checkout.nal.step2.events.a$a r9 = (com.carrefour.fid.android.presentation.viewmodels.checkout.nal.step2.events.C26177a.C26178a) r9
                java.lang.String r9 = r9.mo76078d()
                r0.invoke(r9)
            L_0x00fd:
                kotlin.d2 r9 = kotlin.C11079d2.f28267a
                return r9
            L_0x0100:
                java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r9.<init>(r0)
                throw r9
            */
            throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.presentation.p035ui.checkout.nal.step2.NonFoodCheckoutStep2ScreenKt$NonFoodCheckoutStep2Stateful$4.C236081.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public NonFoodCheckoutStep2ScreenKt$NonFoodCheckoutStep2Stateful$4(C11907e<? extends C26177a> eVar, C23614a aVar, C11304p<? super Bundle, ? super String, C11079d2> pVar, NonFoodCheckoutStep2ViewModel nonFoodCheckoutStep2ViewModel, C11304p<? super Bundle, ? super String, C11079d2> pVar2, C11306r<? super Address, ? super Address, ? super AddressCategory, ? super String, C11079d2> rVar, C12074o0 o0Var, C11289a<C11079d2> aVar2, C24603a aVar3, C11300l<? super String, C11079d2> lVar, C8578k2<C26191b> k2Var, C3036d1 d1Var, String str, C8700z0<String> z0Var, C11045c<? super NonFoodCheckoutStep2ScreenKt$NonFoodCheckoutStep2Stateful$4> cVar) {
        super(2, cVar);
        this.$sideEffect = eVar;
        this.$analytics = aVar;
        this.$onRedirectToConfirmationOrder = pVar;
        this.$viewModel = nonFoodCheckoutStep2ViewModel;
        this.$onBasketValidated = pVar2;
        this.$onEditAddressPressed = rVar;
        this.$coroutineScope = o0Var;
        this.$onRemovePromoCodeError = aVar2;
        this.$otpAnalytics = aVar3;
        this.$onFidCardBlocked = lVar;
        this.$state = k2Var;
        this.$scaffoldState = d1Var;
        this.$errorMessage = str;
        this.$loyaltyCardSecretCodeCheck$delegate = z0Var;
    }

    @C12579k
    public final C11045c<C11079d2> create(@C12580l Object obj, @C12579k C11045c<?> cVar) {
        C11907e<C26177a> eVar = this.$sideEffect;
        C23614a aVar = this.$analytics;
        C11304p<Bundle, String, C11079d2> pVar = this.$onRedirectToConfirmationOrder;
        NonFoodCheckoutStep2ViewModel nonFoodCheckoutStep2ViewModel = this.$viewModel;
        C11304p<Bundle, String, C11079d2> pVar2 = this.$onBasketValidated;
        C11306r<Address, Address, AddressCategory, String, C11079d2> rVar = this.$onEditAddressPressed;
        C12074o0 o0Var = this.$coroutineScope;
        C11289a<C11079d2> aVar2 = this.$onRemovePromoCodeError;
        C24603a aVar3 = this.$otpAnalytics;
        C11300l<String, C11079d2> lVar = this.$onFidCardBlocked;
        C8578k2<C26191b> k2Var = this.$state;
        C3036d1 d1Var = this.$scaffoldState;
        String str = this.$errorMessage;
        NonFoodCheckoutStep2ScreenKt$NonFoodCheckoutStep2Stateful$4 nonFoodCheckoutStep2ScreenKt$NonFoodCheckoutStep2Stateful$4 = nonFoodCheckoutStep2ScreenKt$NonFoodCheckoutStep2Stateful$42;
        NonFoodCheckoutStep2ScreenKt$NonFoodCheckoutStep2Stateful$4 nonFoodCheckoutStep2ScreenKt$NonFoodCheckoutStep2Stateful$42 = new NonFoodCheckoutStep2ScreenKt$NonFoodCheckoutStep2Stateful$4(eVar, aVar, pVar, nonFoodCheckoutStep2ViewModel, pVar2, rVar, o0Var, aVar2, aVar3, lVar, k2Var, d1Var, str, this.$loyaltyCardSecretCodeCheck$delegate, cVar);
        nonFoodCheckoutStep2ScreenKt$NonFoodCheckoutStep2Stateful$4.L$0 = obj;
        return nonFoodCheckoutStep2ScreenKt$NonFoodCheckoutStep2Stateful$4;
    }

    @C12580l
    public final Object invokeSuspend(@C12579k Object obj) {
        C11063b.m42612h();
        if (this.label == 0) {
            C11661u0.m45747n(obj);
            C11907e<C26177a> eVar = this.$sideEffect;
            final C23614a aVar = this.$analytics;
            final C11304p<Bundle, String, C11079d2> pVar = this.$onRedirectToConfirmationOrder;
            final NonFoodCheckoutStep2ViewModel nonFoodCheckoutStep2ViewModel = this.$viewModel;
            final C11304p<Bundle, String, C11079d2> pVar2 = this.$onBasketValidated;
            final C11306r<Address, Address, AddressCategory, String, C11079d2> rVar = this.$onEditAddressPressed;
            final C12074o0 o0Var = this.$coroutineScope;
            final C11289a<C11079d2> aVar2 = this.$onRemovePromoCodeError;
            final C24603a aVar3 = this.$otpAnalytics;
            final C11300l<String, C11079d2> lVar = this.$onFidCardBlocked;
            final C8578k2<C26191b> k2Var = this.$state;
            final C3036d1 d1Var = this.$scaffoldState;
            String str = this.$errorMessage;
            C12074o0 o0Var2 = (C12074o0) this.L$0;
            C8700z0<String> z0Var = this.$loyaltyCardSecretCodeCheck$delegate;
            C236081 r0 = r3;
            final String str2 = str;
            final C8700z0<String> z0Var2 = z0Var;
            C236081 r3 = new C236081((C11045c<? super C236081>) null);
            C11909g.m47412V0(C11909g.m47448f1(eVar, r0), o0Var2);
            return C11079d2.f28267a;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }

    @C12580l
    public final Object invoke(@C12579k C12074o0 o0Var, @C12580l C11045c<? super C11079d2> cVar) {
        return ((NonFoodCheckoutStep2ScreenKt$NonFoodCheckoutStep2Stateful$4) create(o0Var, cVar)).invokeSuspend(C11079d2.f28267a);
    }
}
