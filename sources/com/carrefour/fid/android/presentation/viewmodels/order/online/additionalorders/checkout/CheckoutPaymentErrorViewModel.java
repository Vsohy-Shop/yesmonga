package com.carrefour.fid.android.presentation.viewmodels.order.online.additionalorders.checkout;

import androidx.compose.runtime.internal.C8567o;
import androidx.lifecycle.C19456p0;
import androidx.lifecycle.C19500w0;
import com.carrefour.fid.android.account.data.repositories.AccountRepository;
import com.carrefour.fid.android.domain.interactors.service.C37823k;
import com.carrefour.fid.android.domain.models.account.AccountInfo;
import com.carrefour.fid.android.shared.base.BaseMVIViewModel;
import com.carrefour.fid.android.shared.base.C28505u;
import com.carrefour.fid.android.tracking.orders.online.additionalorder.C29007j;
import com.carrefour.fid.android.tracking.orders.online.additionalorder.C29008k;
import dagger.hilt.android.lifecycle.C10245a;
import javax.inject.Inject;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.C11395k;
import kotlin.C11661u0;
import kotlin.DeprecationLevel;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.C11063b;
import kotlin.coroutines.jvm.internal.C11067d;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.C11723c2;
import kotlinx.coroutines.C12038j;
import kotlinx.coroutines.C12074o0;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineStart;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C10245a
@C11076d0(mo22515d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u0004:\u0003\u000b\u0014\u0015B!\b\u0007\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\r\u001a\u00020\n\u0012\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\t\u0010\u0006\u001a\u00020\u0005H\u0001J\u001b\u0010\b\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0003H@ø\u0001\u0000¢\u0006\u0004\b\b\u0010\tR\u0014\u0010\r\u001a\u00020\n8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f\u0002\u0004\n\u0002\b\u0019¨\u0006\u0016"}, mo22516d2 = {"Lcom/carrefour/fid/android/presentation/viewmodels/order/online/additionalorders/checkout/CheckoutPaymentErrorViewModel;", "Lcom/carrefour/fid/android/shared/base/BaseMVIViewModel;", "Lcom/carrefour/fid/android/presentation/viewmodels/order/online/additionalorders/checkout/CheckoutPaymentErrorViewModel$b;", "Lcom/carrefour/fid/android/presentation/viewmodels/order/online/additionalorders/checkout/CheckoutPaymentErrorViewModel$c;", "Lcom/carrefour/fid/android/tracking/orders/online/additionalorder/j;", "Lkotlin/d2;", "sendScreenView", "intent", "e0", "(Lcom/carrefour/fid/android/presentation/viewmodels/order/online/additionalorders/checkout/CheckoutPaymentErrorViewModel$c;Lkotlin/coroutines/c;)Ljava/lang/Object;", "Lcom/carrefour/fid/android/domain/interactors/service/k;", "a", "Lcom/carrefour/fid/android/domain/interactors/service/k;", "getServiceSelectionUseCase", "Lcom/carrefour/fid/android/account/data/repositories/AccountRepository;", "accountRepository", "Lcom/carrefour/fid/android/tracking/orders/online/additionalorder/k;", "checkoutErrorTracking", "<init>", "(Lcom/carrefour/fid/android/account/data/repositories/AccountRepository;Lcom/carrefour/fid/android/domain/interactors/service/k;Lcom/carrefour/fid/android/tracking/orders/online/additionalorder/k;)V", "b", "c", "app_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
@C8567o(parameters = 0)
public final class CheckoutPaymentErrorViewModel extends BaseMVIViewModel<C26760b, C26761c> implements C29007j {

    /* renamed from: c */
    public static final int f65293c = 8;
    @C12579k

    /* renamed from: a */
    public final C37823k f65294a;

    /* renamed from: b */
    public final /* synthetic */ C29008k f65295b;

    @C11067d(mo22501c = "com.carrefour.fid.android.presentation.viewmodels.order.online.additionalorders.checkout.CheckoutPaymentErrorViewModel$1", mo22502f = "CheckoutPaymentErrorViewModel.kt", mo22503i = {}, mo22504l = {40}, mo22505m = "invokeSuspend", mo22506n = {}, mo22507s = {})
    @C11076d0(mo22515d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H@"}, mo22516d2 = {"Lkotlinx/coroutines/o0;", "Lkotlin/d2;", "<anonymous>"}, mo22517k = 3, mo22518mv = {1, 8, 0})
    /* renamed from: com.carrefour.fid.android.presentation.viewmodels.order.online.additionalorders.checkout.CheckoutPaymentErrorViewModel$1 */
    public static final class C267571 extends SuspendLambda implements C11304p<C12074o0, C11045c<? super C11079d2>, Object> {
        Object L$0;
        int label;
        final /* synthetic */ CheckoutPaymentErrorViewModel this$0;

        {
            this.this$0 = r1;
        }

        @C12579k
        public final C11045c<C11079d2> create(@C12580l Object obj, @C12579k C11045c<?> cVar) {
            return new C267571(this.this$0, accountRepository2, cVar);
        }

        @C12580l
        public final Object invokeSuspend(@C12579k Object obj) {
            CheckoutPaymentErrorViewModel checkoutPaymentErrorViewModel;
            String str;
            Object h = C11063b.m42612h();
            int i = this.label;
            if (i == 0) {
                C11661u0.m45747n(obj);
                CheckoutPaymentErrorViewModel checkoutPaymentErrorViewModel2 = this.this$0;
                AccountRepository accountRepository = accountRepository2;
                this.L$0 = checkoutPaymentErrorViewModel2;
                this.label = 1;
                Object n = accountRepository.mo31329n(this);
                if (n == h) {
                    return h;
                }
                checkoutPaymentErrorViewModel = checkoutPaymentErrorViewModel2;
                obj = n;
            } else if (i == 1) {
                checkoutPaymentErrorViewModel = (CheckoutPaymentErrorViewModel) this.L$0;
                C11661u0.m45747n(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AccountInfo accountInfo = (AccountInfo) obj;
            if (accountInfo != null) {
                str = accountInfo.mo116664s();
            } else {
                str = null;
            }
            checkoutPaymentErrorViewModel.publishState(new C26760b(str, (Boolean) null, 2, (DefaultConstructorMarker) null));
            return C11079d2.f28267a;
        }

        @C12580l
        public final Object invoke(@C12579k C12074o0 o0Var, @C12580l C11045c<? super C11079d2> cVar) {
            return ((C267571) create(o0Var, cVar)).invokeSuspend(C11079d2.f28267a);
        }
    }

    /* renamed from: com.carrefour.fid.android.presentation.viewmodels.order.online.additionalorders.checkout.CheckoutPaymentErrorViewModel$a */
    public interface C26758a extends C28505u.C28506a {

        @C8567o(parameters = 0)
        /* renamed from: com.carrefour.fid.android.presentation.viewmodels.order.online.additionalorders.checkout.CheckoutPaymentErrorViewModel$a$a */
        public static final class C26759a implements C26758a {

            /* renamed from: b */
            public static final int f65296b = 0;

            /* renamed from: a */
            public final boolean f65297a;

            public C26759a(boolean z) {
                this.f65297a = z;
            }

            /* renamed from: c */
            public static /* synthetic */ C26759a m113624c(C26759a aVar, boolean z, int i, Object obj) {
                if ((i & 1) != 0) {
                    z = aVar.f65297a;
                }
                return aVar.mo77775b(z);
            }

            /* renamed from: a */
            public final boolean mo77774a() {
                return this.f65297a;
            }

            @C12579k
            /* renamed from: b */
            public final C26759a mo77775b(boolean z) {
                return new C26759a(z);
            }

            /* renamed from: d */
            public final boolean mo77776d() {
                return this.f65297a;
            }

            public boolean equals(@C12580l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C26759a) && this.f65297a == ((C26759a) obj).f65297a;
            }

            public int hashCode() {
                boolean z = this.f65297a;
                if (z) {
                    return 1;
                }
                return z ? 1 : 0;
            }

            @C12579k
            public String toString() {
                boolean z = this.f65297a;
                return "OpenCustomerService(isDeliveryStore=" + z + ")";
            }
        }
    }

    @C8567o(parameters = 0)
    /* renamed from: com.carrefour.fid.android.presentation.viewmodels.order.online.additionalorders.checkout.CheckoutPaymentErrorViewModel$b */
    public static final class C26760b implements C28505u.C28509d {

        /* renamed from: d */
        public static final int f65298d = 0;
        @C12580l

        /* renamed from: b */
        public final String f65299b;
        @C12580l

        /* renamed from: c */
        public final Boolean f65300c;

        public C26760b() {
            this((String) null, (Boolean) null, 3, (DefaultConstructorMarker) null);
        }

        /* renamed from: h */
        public static /* synthetic */ C26760b m113628h(C26760b bVar, String str, Boolean bool, int i, Object obj) {
            if ((i & 1) != 0) {
                str = bVar.f65299b;
            }
            if ((i & 2) != 0) {
                bool = bVar.f65300c;
            }
            return bVar.mo77783g(str, bool);
        }

        @C12580l
        /* renamed from: e */
        public final String mo77780e() {
            return this.f65299b;
        }

        public boolean equals(@C12580l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C26760b)) {
                return false;
            }
            C26760b bVar = (C26760b) obj;
            return Intrinsics.areEqual((Object) this.f65299b, (Object) bVar.f65299b) && Intrinsics.areEqual((Object) this.f65300c, (Object) bVar.f65300c);
        }

        @C12580l
        /* renamed from: f */
        public final Boolean mo77782f() {
            return this.f65300c;
        }

        @C12579k
        /* renamed from: g */
        public final C26760b mo77783g(@C12580l String str, @C12580l Boolean bool) {
            return new C26760b(str, bool);
        }

        public int hashCode() {
            String str = this.f65299b;
            int i = 0;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            Boolean bool = this.f65300c;
            if (bool != null) {
                i = bool.hashCode();
            }
            return hashCode + i;
        }

        @C12580l
        /* renamed from: i */
        public final String mo77785i() {
            return this.f65299b;
        }

        @C12580l
        /* renamed from: j */
        public final Boolean mo77786j() {
            return this.f65300c;
        }

        @C11395k(level = DeprecationLevel.WARNING, message = "We should not be able to reset the current state. You should use [MVI.Event] instead.")
        @C12579k
        public C28505u.C28509d reset() {
            return C28505u.C28509d.C28510a.m118428a(this);
        }

        @C12579k
        public String toString() {
            String str = this.f65299b;
            Boolean bool = this.f65300c;
            return "UiState(firstName=" + str + ", isDeliveryStore=" + bool + ")";
        }

        public C26760b(@C12580l String str, @C12580l Boolean bool) {
            this.f65299b = str;
            this.f65300c = bool;
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ C26760b(String str, Boolean bool, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : bool);
        }
    }

    /* renamed from: com.carrefour.fid.android.presentation.viewmodels.order.online.additionalorders.checkout.CheckoutPaymentErrorViewModel$c */
    public interface C26761c extends C28505u.C28507b {

        @C8567o(parameters = 0)
        /* renamed from: com.carrefour.fid.android.presentation.viewmodels.order.online.additionalorders.checkout.CheckoutPaymentErrorViewModel$c$a */
        public static final class C26762a implements C26761c {
            @C12579k

            /* renamed from: a */
            public static final C26762a f65301a = new C26762a();

            /* renamed from: b */
            public static final int f65302b = 0;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @Inject
    public CheckoutPaymentErrorViewModel(@C12579k AccountRepository accountRepository, @C12579k C37823k kVar, @C12579k C29008k kVar2) {
        super(new C26760b((String) null, (Boolean) null, 3, (DefaultConstructorMarker) null), (CoroutineDispatcher) null, (C19456p0) null, 6, (DefaultConstructorMarker) null);
        final AccountRepository accountRepository2 = accountRepository;
        C37823k kVar3 = kVar;
        C29008k kVar4 = kVar2;
        Intrinsics.checkNotNullParameter(accountRepository2, "accountRepository");
        Intrinsics.checkNotNullParameter(kVar3, "getServiceSelectionUseCase");
        Intrinsics.checkNotNullParameter(kVar4, "checkoutErrorTracking");
        this.f65294a = kVar3;
        this.f65295b = kVar4;
        C11723c2 unused = C12038j.m48061f(C19500w0.m90846a(this), (CoroutineContext) null, (CoroutineStart) null, new C267571(this, (C11045c<? super C267571>) null), 3, (Object) null);
        sendScreenView();
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x003b  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x005b  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0060  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    @org.jetbrains.annotations.C12580l
    /* renamed from: e0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object processIntent(@org.jetbrains.annotations.C12579k com.carrefour.fid.android.presentation.viewmodels.order.online.additionalorders.checkout.CheckoutPaymentErrorViewModel.C26761c r5, @org.jetbrains.annotations.C12579k kotlin.coroutines.C11045c<? super kotlin.C11079d2> r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof com.carrefour.fid.android.presentation.viewmodels.order.online.additionalorders.checkout.CheckoutPaymentErrorViewModel$processIntent$1
            if (r0 == 0) goto L_0x0013
            r0 = r6
            com.carrefour.fid.android.presentation.viewmodels.order.online.additionalorders.checkout.CheckoutPaymentErrorViewModel$processIntent$1 r0 = (com.carrefour.fid.android.presentation.viewmodels.order.online.additionalorders.checkout.CheckoutPaymentErrorViewModel$processIntent$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.carrefour.fid.android.presentation.viewmodels.order.online.additionalorders.checkout.CheckoutPaymentErrorViewModel$processIntent$1 r0 = new com.carrefour.fid.android.presentation.viewmodels.order.online.additionalorders.checkout.CheckoutPaymentErrorViewModel$processIntent$1
            r0.<init>(r4, r6)
        L_0x0018:
            java.lang.Object r6 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L_0x003b
            if (r2 != r3) goto L_0x0033
            java.lang.Object r5 = r0.L$0
            com.carrefour.fid.android.presentation.viewmodels.order.online.additionalorders.checkout.CheckoutPaymentErrorViewModel r5 = (com.carrefour.fid.android.presentation.viewmodels.order.online.additionalorders.checkout.CheckoutPaymentErrorViewModel) r5
            kotlin.C11661u0.m45747n(r6)
            kotlin.Result r6 = (kotlin.Result) r6
            java.lang.Object r6 = r6.mo21858l()
            goto L_0x0054
        L_0x0033:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L_0x003b:
            kotlin.C11661u0.m45747n(r6)
            com.carrefour.fid.android.presentation.viewmodels.order.online.additionalorders.checkout.CheckoutPaymentErrorViewModel$c$a r6 = com.carrefour.fid.android.presentation.viewmodels.order.online.additionalorders.checkout.CheckoutPaymentErrorViewModel.C26761c.C26762a.f65301a
            boolean r5 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r5, (java.lang.Object) r6)
            if (r5 == 0) goto L_0x0078
            com.carrefour.fid.android.domain.interactors.service.k r5 = r4.f65294a
            r0.L$0 = r4
            r0.label = r3
            java.lang.Object r6 = r5.m172965invokeIoAF18A(r0)
            if (r6 != r1) goto L_0x0053
            return r1
        L_0x0053:
            r5 = r4
        L_0x0054:
            boolean r0 = kotlin.Result.m38709i(r6)
            r1 = 0
            if (r0 == 0) goto L_0x005c
            r6 = r1
        L_0x005c:
            com.carrefour.fid.android.domain.models.service.models.k r6 = (com.carrefour.fid.android.domain.models.service.models.C38162k) r6
            if (r6 == 0) goto L_0x0064
            com.carrefour.fid.android.domain.models.service.models.StoreService r1 = r6.mo119354f()
        L_0x0064:
            if (r1 == 0) goto L_0x006f
            com.carrefour.fid.android.shared.util.ServiceUtil r6 = com.carrefour.fid.android.shared.util.ServiceUtil.f70805a
            boolean r6 = r6.mo84132n(r1)
            if (r6 == 0) goto L_0x006f
            goto L_0x0070
        L_0x006f:
            r3 = 0
        L_0x0070:
            com.carrefour.fid.android.presentation.viewmodels.order.online.additionalorders.checkout.CheckoutPaymentErrorViewModel$a$a r6 = new com.carrefour.fid.android.presentation.viewmodels.order.online.additionalorders.checkout.CheckoutPaymentErrorViewModel$a$a
            r6.<init>(r3)
            r5.emitEvent(r6)
        L_0x0078:
            kotlin.d2 r5 = kotlin.C11079d2.f28267a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.presentation.viewmodels.order.online.additionalorders.checkout.CheckoutPaymentErrorViewModel.processIntent(com.carrefour.fid.android.presentation.viewmodels.order.online.additionalorders.checkout.CheckoutPaymentErrorViewModel$c, kotlin.coroutines.c):java.lang.Object");
    }

    public void sendScreenView() {
        this.f65295b.sendScreenView();
    }
}
