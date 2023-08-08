package com.carrefour.fid.android.presentation.viewmodels.order.online.additionalorders.checkout;

import android.os.Bundle;
import androidx.compose.runtime.internal.C8567o;
import androidx.lifecycle.C19456p0;
import com.carrefour.fid.android.data.entities.mapper.C36540w0;
import com.carrefour.fid.android.domain.interactors.checkout.ConfirmPaymentUseCase;
import com.carrefour.fid.android.domain.models.OrderConfirmationModel;
import com.carrefour.fid.android.shared.base.BaseMVIViewModel;
import com.carrefour.fid.android.shared.base.C28505u;
import com.carrefour.fid.android.shared.extension.StringKt;
import com.carrefour.fid.android.tracking.orders.online.additionalorder.C29010m;
import com.carrefour.fid.android.tracking.orders.online.additionalorder.C29011n;
import dagger.hilt.android.lifecycle.C10245a;
import java.util.List;
import javax.inject.Inject;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.C11395k;
import kotlin.DeprecationLevel;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.intrinsics.C11063b;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.C11622t;
import kotlinx.coroutines.CoroutineDispatcher;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C10245a
@C11076d0(mo22515d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u0004:\u0003\u0016\u001a!B!\b\u0007\u0012\u0006\u0010\u0018\u001a\u00020\u0015\u0012\u0006\u0010\u001c\u001a\u00020\u0019\u0012\u0006\u0010\u001e\u001a\u00020\u001d¢\u0006\u0004\b\u001f\u0010 J\t\u0010\u0006\u001a\u00020\u0005H\u0001J\t\u0010\u0007\u001a\u00020\u0005H\u0001J\t\u0010\b\u001a\u00020\u0005H\u0001J\u001b\u0010\n\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\u0003H@ø\u0001\u0000¢\u0006\u0004\b\n\u0010\u000bJ%\u0010\u0010\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\f2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH@ø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u000eH\u0002J\u0016\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\f0\u00132\u0006\u0010\r\u001a\u00020\fH\u0002R\u0014\u0010\u0018\u001a\u00020\u00158\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0014\u0010\u001c\u001a\u00020\u00198\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001b\u0002\u0004\n\u0002\b\u0019¨\u0006\""}, mo22516d2 = {"Lcom/carrefour/fid/android/presentation/viewmodels/order/online/additionalorders/checkout/CheckoutPaymentViewModel;", "Lcom/carrefour/fid/android/shared/base/BaseMVIViewModel;", "Lcom/carrefour/fid/android/presentation/viewmodels/order/online/additionalorders/checkout/CheckoutPaymentViewModel$b;", "Lcom/carrefour/fid/android/presentation/viewmodels/order/online/additionalorders/checkout/CheckoutPaymentViewModel$c;", "Lcom/carrefour/fid/android/tracking/orders/online/additionalorder/m;", "Lkotlin/d2;", "sendScreenView", "T", "y", "intent", "h0", "(Lcom/carrefour/fid/android/presentation/viewmodels/order/online/additionalorders/checkout/CheckoutPaymentViewModel$c;Lkotlin/coroutines/c;)Ljava/lang/Object;", "", "url", "Landroid/os/Bundle;", "arguments", "e0", "(Ljava/lang/String;Landroid/os/Bundle;Lkotlin/coroutines/c;)Ljava/lang/Object;", "f0", "", "g0", "Lcom/carrefour/fid/android/domain/interactors/checkout/ConfirmPaymentUseCase;", "a", "Lcom/carrefour/fid/android/domain/interactors/checkout/ConfirmPaymentUseCase;", "confirmPaymentUseCase", "Lcom/carrefour/fid/android/data/entities/mapper/w0;", "b", "Lcom/carrefour/fid/android/data/entities/mapper/w0;", "orderConfirmationModelMapper", "Lcom/carrefour/fid/android/tracking/orders/online/additionalorder/n;", "paymentTracking", "<init>", "(Lcom/carrefour/fid/android/domain/interactors/checkout/ConfirmPaymentUseCase;Lcom/carrefour/fid/android/data/entities/mapper/w0;Lcom/carrefour/fid/android/tracking/orders/online/additionalorder/n;)V", "c", "app_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
@C8567o(parameters = 0)
public final class CheckoutPaymentViewModel extends BaseMVIViewModel<C26766b, C26767c> implements C29010m {

    /* renamed from: d */
    public static final int f65303d = 8;
    @C12579k

    /* renamed from: a */
    public final ConfirmPaymentUseCase f65304a;
    @C12579k

    /* renamed from: b */
    public final C36540w0 f65305b;

    /* renamed from: c */
    public final /* synthetic */ C29011n f65306c;

    /* renamed from: com.carrefour.fid.android.presentation.viewmodels.order.online.additionalorders.checkout.CheckoutPaymentViewModel$a */
    public interface C26763a extends C28505u.C28506a {

        @C8567o(parameters = 0)
        /* renamed from: com.carrefour.fid.android.presentation.viewmodels.order.online.additionalorders.checkout.CheckoutPaymentViewModel$a$a */
        public static final class C26764a implements C26763a {

            /* renamed from: b */
            public static final int f65307b = 8;
            @C12579k

            /* renamed from: a */
            public final Throwable f65308a;

            public C26764a(@C12579k Throwable th) {
                Intrinsics.checkNotNullParameter(th, "throwable");
                this.f65308a = th;
            }

            /* renamed from: c */
            public static /* synthetic */ C26764a m113641c(C26764a aVar, Throwable th, int i, Object obj) {
                if ((i & 1) != 0) {
                    th = aVar.f65308a;
                }
                return aVar.mo77796b(th);
            }

            @C12579k
            /* renamed from: a */
            public final Throwable mo77795a() {
                return this.f65308a;
            }

            @C12579k
            /* renamed from: b */
            public final C26764a mo77796b(@C12579k Throwable th) {
                Intrinsics.checkNotNullParameter(th, "throwable");
                return new C26764a(th);
            }

            @C12579k
            /* renamed from: d */
            public final Throwable mo77797d() {
                return this.f65308a;
            }

            public boolean equals(@C12580l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C26764a) && Intrinsics.areEqual((Object) this.f65308a, (Object) ((C26764a) obj).f65308a);
            }

            public int hashCode() {
                return this.f65308a.hashCode();
            }

            @C12579k
            public String toString() {
                Throwable th = this.f65308a;
                return "Error(throwable=" + th + ")";
            }
        }

        @C8567o(parameters = 0)
        /* renamed from: com.carrefour.fid.android.presentation.viewmodels.order.online.additionalorders.checkout.CheckoutPaymentViewModel$a$b */
        public static final class C26765b implements C26763a {

            /* renamed from: b */
            public static final int f65309b = 8;
            @C12579k

            /* renamed from: a */
            public final OrderConfirmationModel f65310a;

            public C26765b(@C12579k OrderConfirmationModel orderConfirmationModel) {
                Intrinsics.checkNotNullParameter(orderConfirmationModel, "orderConfirmationModel");
                this.f65310a = orderConfirmationModel;
            }

            /* renamed from: c */
            public static /* synthetic */ C26765b m113645c(C26765b bVar, OrderConfirmationModel orderConfirmationModel, int i, Object obj) {
                if ((i & 1) != 0) {
                    orderConfirmationModel = bVar.f65310a;
                }
                return bVar.mo77802b(orderConfirmationModel);
            }

            @C12579k
            /* renamed from: a */
            public final OrderConfirmationModel mo77801a() {
                return this.f65310a;
            }

            @C12579k
            /* renamed from: b */
            public final C26765b mo77802b(@C12579k OrderConfirmationModel orderConfirmationModel) {
                Intrinsics.checkNotNullParameter(orderConfirmationModel, "orderConfirmationModel");
                return new C26765b(orderConfirmationModel);
            }

            @C12579k
            /* renamed from: d */
            public final OrderConfirmationModel mo77803d() {
                return this.f65310a;
            }

            public boolean equals(@C12580l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C26765b) && Intrinsics.areEqual((Object) this.f65310a, (Object) ((C26765b) obj).f65310a);
            }

            public int hashCode() {
                return this.f65310a.hashCode();
            }

            @C12579k
            public String toString() {
                OrderConfirmationModel orderConfirmationModel = this.f65310a;
                return "OrderConfirmation(orderConfirmationModel=" + orderConfirmationModel + ")";
            }
        }
    }

    @C8567o(parameters = 0)
    /* renamed from: com.carrefour.fid.android.presentation.viewmodels.order.online.additionalorders.checkout.CheckoutPaymentViewModel$b */
    public static final class C26766b implements C28505u.C28509d {

        /* renamed from: c */
        public static final int f65311c = 0;
        @C12580l

        /* renamed from: b */
        public final String f65312b;

        public C26766b() {
            this((String) null, 1, (DefaultConstructorMarker) null);
        }

        /* renamed from: g */
        public static /* synthetic */ C26766b m113649g(C26766b bVar, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = bVar.f65312b;
            }
            return bVar.mo77809f(str);
        }

        @C12580l
        /* renamed from: e */
        public final String mo77807e() {
            return this.f65312b;
        }

        public boolean equals(@C12580l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C26766b) && Intrinsics.areEqual((Object) this.f65312b, (Object) ((C26766b) obj).f65312b);
        }

        @C12579k
        /* renamed from: f */
        public final C26766b mo77809f(@C12580l String str) {
            return new C26766b(str);
        }

        @C12580l
        /* renamed from: h */
        public final String mo77810h() {
            return this.f65312b;
        }

        public int hashCode() {
            String str = this.f65312b;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        @C11395k(level = DeprecationLevel.WARNING, message = "We should not be able to reset the current state. You should use [MVI.Event] instead.")
        @C12579k
        public C28505u.C28509d reset() {
            return C28505u.C28509d.C28510a.m118428a(this);
        }

        @C12579k
        public String toString() {
            String str = this.f65312b;
            return "UiState(transactionData=" + str + ")";
        }

        public C26766b(@C12580l String str) {
            this.f65312b = str;
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ C26766b(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : str);
        }
    }

    /* renamed from: com.carrefour.fid.android.presentation.viewmodels.order.online.additionalorders.checkout.CheckoutPaymentViewModel$c */
    public interface C26767c extends C28505u.C28507b {

        @C8567o(parameters = 0)
        /* renamed from: com.carrefour.fid.android.presentation.viewmodels.order.online.additionalorders.checkout.CheckoutPaymentViewModel$c$a */
        public static final class C26768a implements C26767c {

            /* renamed from: c */
            public static final int f65313c = 8;
            @C12579k

            /* renamed from: a */
            public final String f65314a;
            @C12580l

            /* renamed from: b */
            public final Bundle f65315b;

            public C26768a(@C12579k String str, @C12580l Bundle bundle) {
                Intrinsics.checkNotNullParameter(str, "url");
                this.f65314a = str;
                this.f65315b = bundle;
            }

            /* renamed from: d */
            public static /* synthetic */ C26768a m113653d(C26768a aVar, String str, Bundle bundle, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = aVar.f65314a;
                }
                if ((i & 2) != 0) {
                    bundle = aVar.f65315b;
                }
                return aVar.mo77815c(str, bundle);
            }

            @C12579k
            /* renamed from: a */
            public final String mo77813a() {
                return this.f65314a;
            }

            @C12580l
            /* renamed from: b */
            public final Bundle mo77814b() {
                return this.f65315b;
            }

            @C12579k
            /* renamed from: c */
            public final C26768a mo77815c(@C12579k String str, @C12580l Bundle bundle) {
                Intrinsics.checkNotNullParameter(str, "url");
                return new C26768a(str, bundle);
            }

            @C12580l
            /* renamed from: e */
            public final Bundle mo77816e() {
                return this.f65315b;
            }

            public boolean equals(@C12580l Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C26768a)) {
                    return false;
                }
                C26768a aVar = (C26768a) obj;
                return Intrinsics.areEqual((Object) this.f65314a, (Object) aVar.f65314a) && Intrinsics.areEqual((Object) this.f65315b, (Object) aVar.f65315b);
            }

            @C12579k
            /* renamed from: f */
            public final String mo77818f() {
                return this.f65314a;
            }

            public int hashCode() {
                int hashCode = this.f65314a.hashCode() * 31;
                Bundle bundle = this.f65315b;
                return hashCode + (bundle == null ? 0 : bundle.hashCode());
            }

            @C12579k
            public String toString() {
                String str = this.f65314a;
                Bundle bundle = this.f65315b;
                return "ConfirmOrder(url=" + str + ", arguments=" + bundle + ")";
            }
        }

        @C8567o(parameters = 0)
        /* renamed from: com.carrefour.fid.android.presentation.viewmodels.order.online.additionalorders.checkout.CheckoutPaymentViewModel$c$b */
        public static final class C26769b implements C26767c {

            /* renamed from: b */
            public static final int f65316b = 8;
            @C12579k

            /* renamed from: a */
            public final Bundle f65317a;

            public C26769b(@C12579k Bundle bundle) {
                Intrinsics.checkNotNullParameter(bundle, "arguments");
                this.f65317a = bundle;
            }

            /* renamed from: c */
            public static /* synthetic */ C26769b m113659c(C26769b bVar, Bundle bundle, int i, Object obj) {
                if ((i & 1) != 0) {
                    bundle = bVar.f65317a;
                }
                return bVar.mo77822b(bundle);
            }

            @C12579k
            /* renamed from: a */
            public final Bundle mo77821a() {
                return this.f65317a;
            }

            @C12579k
            /* renamed from: b */
            public final C26769b mo77822b(@C12579k Bundle bundle) {
                Intrinsics.checkNotNullParameter(bundle, "arguments");
                return new C26769b(bundle);
            }

            @C12579k
            /* renamed from: d */
            public final Bundle mo77823d() {
                return this.f65317a;
            }

            public boolean equals(@C12580l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C26769b) && Intrinsics.areEqual((Object) this.f65317a, (Object) ((C26769b) obj).f65317a);
            }

            public int hashCode() {
                return this.f65317a.hashCode();
            }

            @C12579k
            public String toString() {
                Bundle bundle = this.f65317a;
                return "ExtractPaymentData(arguments=" + bundle + ")";
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @Inject
    public CheckoutPaymentViewModel(@C12579k ConfirmPaymentUseCase confirmPaymentUseCase, @C12579k C36540w0 w0Var, @C12579k C29011n nVar) {
        super(new C26766b((String) null, 1, (DefaultConstructorMarker) null), (CoroutineDispatcher) null, (C19456p0) null, 6, (DefaultConstructorMarker) null);
        Intrinsics.checkNotNullParameter(confirmPaymentUseCase, "confirmPaymentUseCase");
        Intrinsics.checkNotNullParameter(w0Var, "orderConfirmationModelMapper");
        Intrinsics.checkNotNullParameter(nVar, "paymentTracking");
        this.f65304a = confirmPaymentUseCase;
        this.f65305b = w0Var;
        this.f65306c = nVar;
    }

    /* renamed from: T */
    public void mo77788T() {
        this.f65306c.mo77788T();
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x003b  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x00a1  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x00b8  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* renamed from: e0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo77789e0(java.lang.String r7, android.os.Bundle r8, kotlin.coroutines.C11045c<? super kotlin.C11079d2> r9) {
        /*
            r6 = this;
            boolean r0 = r9 instanceof com.carrefour.fid.android.presentation.viewmodels.order.online.additionalorders.checkout.CheckoutPaymentViewModel$confirmOrder$1
            if (r0 == 0) goto L_0x0013
            r0 = r9
            com.carrefour.fid.android.presentation.viewmodels.order.online.additionalorders.checkout.CheckoutPaymentViewModel$confirmOrder$1 r0 = (com.carrefour.fid.android.presentation.viewmodels.order.online.additionalorders.checkout.CheckoutPaymentViewModel$confirmOrder$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.carrefour.fid.android.presentation.viewmodels.order.online.additionalorders.checkout.CheckoutPaymentViewModel$confirmOrder$1 r0 = new com.carrefour.fid.android.presentation.viewmodels.order.online.additionalorders.checkout.CheckoutPaymentViewModel$confirmOrder$1
            r0.<init>(r6, r9)
        L_0x0018:
            java.lang.Object r9 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L_0x003b
            if (r2 != r3) goto L_0x0033
            java.lang.Object r7 = r0.L$0
            com.carrefour.fid.android.presentation.viewmodels.order.online.additionalorders.checkout.CheckoutPaymentViewModel r7 = (com.carrefour.fid.android.presentation.viewmodels.order.online.additionalorders.checkout.CheckoutPaymentViewModel) r7
            kotlin.C11661u0.m45747n(r9)
            kotlin.Result r9 = (kotlin.Result) r9
            java.lang.Object r8 = r9.mo21858l()
            goto L_0x009b
        L_0x0033:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L_0x003b:
            kotlin.C11661u0.m45747n(r9)
            java.util.List r7 = r6.mo77791g0(r7)
            boolean r9 = r7.isEmpty()
            if (r9 == 0) goto L_0x0069
            com.carrefour.fid.android.presentation.viewmodels.order.online.additionalorders.checkout.CheckoutPaymentViewModel$a$a r8 = new com.carrefour.fid.android.presentation.viewmodels.order.online.additionalorders.checkout.CheckoutPaymentViewModel$a$a
            java.lang.Throwable r9 = new java.lang.Throwable
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "No token data available "
            r0.append(r1)
            r0.append(r7)
            java.lang.String r7 = r0.toString()
            r9.<init>(r7)
            r8.<init>(r9)
            r6.emitEvent(r8)
            kotlin.d2 r7 = kotlin.C11079d2.f28267a
            return r7
        L_0x0069:
            com.carrefour.fid.android.domain.interactors.checkout.ConfirmPaymentUseCase r9 = r6.f65304a
            com.carrefour.fid.android.domain.interactors.checkout.ConfirmPaymentUseCase$a r2 = new com.carrefour.fid.android.domain.interactors.checkout.ConfirmPaymentUseCase$a
            r4 = 0
            java.lang.Object r4 = r7.get(r4)
            java.lang.String r4 = (java.lang.String) r4
            java.lang.Object r7 = r7.get(r3)
            java.lang.String r7 = (java.lang.String) r7
            if (r8 == 0) goto L_0x008b
            java.lang.String r5 = "arguments_payment_confirmation"
            android.os.Bundle r8 = r8.getBundle(r5)
            if (r8 == 0) goto L_0x008b
            java.lang.String r5 = "LOYALTY_AMOUNT_DATA"
            java.lang.String r8 = r8.getString(r5)
            goto L_0x008c
        L_0x008b:
            r8 = 0
        L_0x008c:
            r2.<init>(r4, r7, r8)
            r0.L$0 = r6
            r0.label = r3
            java.lang.Object r8 = r9.m172945invokegIAlus(r2, r0)
            if (r8 != r1) goto L_0x009a
            return r1
        L_0x009a:
            r7 = r6
        L_0x009b:
            boolean r9 = kotlin.Result.m38710j(r8)
            if (r9 == 0) goto L_0x00b2
            r9 = r8
            com.carrefour.fid.android.domain.models.OrderConfirmationDomain r9 = (com.carrefour.fid.android.domain.models.OrderConfirmationDomain) r9
            com.carrefour.fid.android.presentation.viewmodels.order.online.additionalorders.checkout.CheckoutPaymentViewModel$a$b r0 = new com.carrefour.fid.android.presentation.viewmodels.order.online.additionalorders.checkout.CheckoutPaymentViewModel$a$b
            com.carrefour.fid.android.data.entities.mapper.w0 r1 = r7.f65305b
            com.carrefour.fid.android.domain.models.OrderConfirmationModel r9 = r1.mo72340a(r9)
            r0.<init>(r9)
            r7.emitEvent(r0)
        L_0x00b2:
            java.lang.Throwable r8 = kotlin.Result.m38705e(r8)
            if (r8 == 0) goto L_0x00c0
            com.carrefour.fid.android.presentation.viewmodels.order.online.additionalorders.checkout.CheckoutPaymentViewModel$a$a r9 = new com.carrefour.fid.android.presentation.viewmodels.order.online.additionalorders.checkout.CheckoutPaymentViewModel$a$a
            r9.<init>(r8)
            r7.emitEvent(r9)
        L_0x00c0:
            kotlin.d2 r7 = kotlin.C11079d2.f28267a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.presentation.viewmodels.order.online.additionalorders.checkout.CheckoutPaymentViewModel.mo77789e0(java.lang.String, android.os.Bundle, kotlin.coroutines.c):java.lang.Object");
    }

    /* renamed from: f0 */
    public final void mo77790f0(Bundle bundle) {
        C11079d2 d2Var;
        String string;
        Bundle bundle2 = bundle.getBundle("arguments_payment_confirmation");
        if (bundle2 == null || (string = bundle2.getString("MF_PAYMENT_TRANSACTION_DATA_EXTRA")) == null) {
            d2Var = null;
        } else {
            publishState(new C26766b(string));
            d2Var = C11079d2.f28267a;
        }
        if (d2Var == null) {
            emitEvent(new C26763a.C26764a(new Throwable("Missing args: arguments_payment_confirmation")));
        }
    }

    /* renamed from: g0 */
    public final List<String> mo77791g0(String str) {
        boolean z;
        boolean z2;
        String C = StringKt.m118894C(str);
        String E = StringKt.m118896E(str);
        if (C == null || C11622t.isBlank(C)) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            if (E == null || C11622t.isBlank(E)) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (!z2) {
                return CollectionsKt__CollectionsKt.m40448L(C, E);
            }
        }
        return CollectionsKt__CollectionsKt.m40441E();
    }

    @C12580l
    /* renamed from: h0 */
    public Object processIntent(@C12579k C26767c cVar, @C12579k C11045c<? super C11079d2> cVar2) {
        if (cVar instanceof C26767c.C26768a) {
            C26767c.C26768a aVar = (C26767c.C26768a) cVar;
            Object e0 = mo77789e0(aVar.mo77818f(), aVar.mo77816e(), cVar2);
            if (e0 == C11063b.m42612h()) {
                return e0;
            }
            return C11079d2.f28267a;
        }
        if (cVar instanceof C26767c.C26769b) {
            mo77790f0(((C26767c.C26769b) cVar).mo77823d());
        }
        return C11079d2.f28267a;
    }

    public void sendScreenView() {
        this.f65306c.sendScreenView();
    }

    /* renamed from: y */
    public void mo77794y() {
        this.f65306c.mo77794y();
    }
}
