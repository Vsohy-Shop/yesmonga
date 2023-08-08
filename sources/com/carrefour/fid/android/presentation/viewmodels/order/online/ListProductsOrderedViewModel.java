package com.carrefour.fid.android.presentation.viewmodels.order.online;

import androidx.compose.runtime.internal.C8567o;
import androidx.lifecycle.C19456p0;
import com.carrefour.fid.android.data.repositories.OrderOnlineRepository;
import com.carrefour.fid.android.domain.interactors.order.GetOrderOnlineDetailUseCase;
import com.carrefour.fid.android.presentation.p035ui.orders.online.mapper.C25216a;
import com.carrefour.fid.android.presentation.p035ui.orders.online.model.C25237e;
import com.carrefour.fid.android.presentation.p035ui.orders.online.model.OrdersOnlineDetailType;
import com.carrefour.fid.android.shared.base.BaseMVIViewModel;
import com.carrefour.fid.android.shared.base.C28505u;
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
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineDispatcher;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C10245a
@C11076d0(mo22515d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0003\u000f\u0013\u0017B!\b\u0007\u0012\u0006\u0010\u0011\u001a\u00020\u000e\u0012\u0006\u0010\u0015\u001a\u00020\u0012\u0012\u0006\u0010\u0019\u001a\u00020\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u001b\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H@ø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0007J#\u0010\f\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH@ø\u0001\u0000¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u0011\u001a\u00020\u000e8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0015\u001a\u00020\u00128\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0019\u001a\u00020\u00168\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018\u0002\u0004\n\u0002\b\u0019¨\u0006\u001c"}, mo22516d2 = {"Lcom/carrefour/fid/android/presentation/viewmodels/order/online/ListProductsOrderedViewModel;", "Lcom/carrefour/fid/android/shared/base/BaseMVIViewModel;", "Lcom/carrefour/fid/android/presentation/viewmodels/order/online/ListProductsOrderedViewModel$b;", "Lcom/carrefour/fid/android/presentation/viewmodels/order/online/ListProductsOrderedViewModel$c;", "intent", "Lkotlin/d2;", "f0", "(Lcom/carrefour/fid/android/presentation/viewmodels/order/online/ListProductsOrderedViewModel$c;Lkotlin/coroutines/c;)Ljava/lang/Object;", "", "orderId", "Lcom/carrefour/fid/android/presentation/ui/orders/online/model/OrdersOnlineDetailType;", "type", "e0", "(Ljava/lang/String;Lcom/carrefour/fid/android/presentation/ui/orders/online/model/OrdersOnlineDetailType;Lkotlin/coroutines/c;)Ljava/lang/Object;", "Lcom/carrefour/fid/android/data/repositories/OrderOnlineRepository;", "a", "Lcom/carrefour/fid/android/data/repositories/OrderOnlineRepository;", "repository", "Lcom/carrefour/fid/android/domain/interactors/order/GetOrderOnlineDetailUseCase;", "b", "Lcom/carrefour/fid/android/domain/interactors/order/GetOrderOnlineDetailUseCase;", "orderOnlineDetailUseCase", "Lcom/carrefour/fid/android/presentation/ui/orders/online/mapper/a;", "c", "Lcom/carrefour/fid/android/presentation/ui/orders/online/mapper/a;", "ordersOnlineDetailsModelDataMapper", "<init>", "(Lcom/carrefour/fid/android/data/repositories/OrderOnlineRepository;Lcom/carrefour/fid/android/domain/interactors/order/GetOrderOnlineDetailUseCase;Lcom/carrefour/fid/android/presentation/ui/orders/online/mapper/a;)V", "app_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
@C8567o(parameters = 0)
@C11363r0({"SMAP\nListProductsOrderedViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ListProductsOrderedViewModel.kt\ncom/carrefour/fid/android/presentation/viewmodels/order/online/ListProductsOrderedViewModel\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,68:1\n800#2,11:69\n1360#2:80\n1446#2,5:81\n800#2,11:86\n1360#2:97\n1446#2,5:98\n800#2,11:103\n1360#2:114\n1446#2,5:115\n*S KotlinDebug\n*F\n+ 1 ListProductsOrderedViewModel.kt\ncom/carrefour/fid/android/presentation/viewmodels/order/online/ListProductsOrderedViewModel\n*L\n56#1:69,11\n57#1:80\n57#1:81,5\n59#1:86,11\n60#1:97\n60#1:98,5\n62#1:103,11\n62#1:114\n62#1:115,5\n*E\n"})
public final class ListProductsOrderedViewModel extends BaseMVIViewModel<C26699b, C26701c> {

    /* renamed from: d */
    public static final int f65152d = 8;
    @C12579k

    /* renamed from: a */
    public final OrderOnlineRepository f65153a;
    @C12579k

    /* renamed from: b */
    public final GetOrderOnlineDetailUseCase f65154b;
    @C12579k

    /* renamed from: c */
    public final C25216a f65155c;

    /* renamed from: com.carrefour.fid.android.presentation.viewmodels.order.online.ListProductsOrderedViewModel$a */
    public interface C26697a extends C28505u.C28506a {

        @C8567o(parameters = 0)
        /* renamed from: com.carrefour.fid.android.presentation.viewmodels.order.online.ListProductsOrderedViewModel$a$a */
        public static final class C26698a implements C26697a {

            /* renamed from: b */
            public static final int f65156b = 8;
            @C12579k

            /* renamed from: a */
            public final Throwable f65157a;

            public C26698a(@C12579k Throwable th) {
                Intrinsics.checkNotNullParameter(th, "throwable");
                this.f65157a = th;
            }

            /* renamed from: c */
            public static /* synthetic */ C26698a m113401c(C26698a aVar, Throwable th, int i, Object obj) {
                if ((i & 1) != 0) {
                    th = aVar.f65157a;
                }
                return aVar.mo77569b(th);
            }

            @C12579k
            /* renamed from: a */
            public final Throwable mo77568a() {
                return this.f65157a;
            }

            @C12579k
            /* renamed from: b */
            public final C26698a mo77569b(@C12579k Throwable th) {
                Intrinsics.checkNotNullParameter(th, "throwable");
                return new C26698a(th);
            }

            @C12579k
            /* renamed from: d */
            public final Throwable mo77570d() {
                return this.f65157a;
            }

            public boolean equals(@C12580l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C26698a) && Intrinsics.areEqual((Object) this.f65157a, (Object) ((C26698a) obj).f65157a);
            }

            public int hashCode() {
                return this.f65157a.hashCode();
            }

            @C12579k
            public String toString() {
                Throwable th = this.f65157a;
                return "Error(throwable=" + th + ")";
            }
        }
    }

    @C8567o(parameters = 0)
    /* renamed from: com.carrefour.fid.android.presentation.viewmodels.order.online.ListProductsOrderedViewModel$b */
    public static final class C26699b implements C28505u.C28509d {
        @C12579k

        /* renamed from: c */
        public static final C26700a f65158c = new C26700a((DefaultConstructorMarker) null);

        /* renamed from: d */
        public static final int f65159d = 8;
        @C12579k

        /* renamed from: e */
        public static final C26699b f65160e = new C26699b(CollectionsKt__CollectionsKt.m40441E());
        @C12579k

        /* renamed from: b */
        public final List<C25237e> f65161b;

        /* renamed from: com.carrefour.fid.android.presentation.viewmodels.order.online.ListProductsOrderedViewModel$b$a */
        public static final class C26700a {
            public /* synthetic */ C26700a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            @C12579k
            /* renamed from: a */
            public final C26699b mo77580a() {
                return C26699b.f65160e;
            }

            public C26700a() {
            }
        }

        public C26699b(@C12579k List<? extends C25237e> list) {
            Intrinsics.checkNotNullParameter(list, "orderDetails");
            this.f65161b = list;
        }

        /* renamed from: h */
        public static /* synthetic */ C26699b m113406h(C26699b bVar, List<C25237e> list, int i, Object obj) {
            if ((i & 1) != 0) {
                list = bVar.f65161b;
            }
            return bVar.mo77576g(list);
        }

        public boolean equals(@C12580l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C26699b) && Intrinsics.areEqual((Object) this.f65161b, (Object) ((C26699b) obj).f65161b);
        }

        @C12579k
        /* renamed from: f */
        public final List<C25237e> mo77575f() {
            return this.f65161b;
        }

        @C12579k
        /* renamed from: g */
        public final C26699b mo77576g(@C12579k List<? extends C25237e> list) {
            Intrinsics.checkNotNullParameter(list, "orderDetails");
            return new C26699b(list);
        }

        public int hashCode() {
            return this.f65161b.hashCode();
        }

        @C12579k
        /* renamed from: i */
        public final List<C25237e> mo77578i() {
            return this.f65161b;
        }

        @C11395k(level = DeprecationLevel.WARNING, message = "We should not be able to reset the current state. You should use [MVI.Event] instead.")
        @C12579k
        public C28505u.C28509d reset() {
            return C28505u.C28509d.C28510a.m118428a(this);
        }

        @C12579k
        public String toString() {
            List<C25237e> list = this.f65161b;
            return "UiState(orderDetails=" + list + ")";
        }
    }

    /* renamed from: com.carrefour.fid.android.presentation.viewmodels.order.online.ListProductsOrderedViewModel$c */
    public interface C26701c extends C28505u.C28507b {

        @C8567o(parameters = 0)
        /* renamed from: com.carrefour.fid.android.presentation.viewmodels.order.online.ListProductsOrderedViewModel$c$a */
        public static final class C26702a implements C26701c {

            /* renamed from: c */
            public static final int f65162c = 0;
            @C12579k

            /* renamed from: a */
            public final String f65163a;
            @C12579k

            /* renamed from: b */
            public final OrdersOnlineDetailType f65164b;

            public C26702a(@C12579k String str, @C12579k OrdersOnlineDetailType ordersOnlineDetailType) {
                Intrinsics.checkNotNullParameter(str, "orderId");
                Intrinsics.checkNotNullParameter(ordersOnlineDetailType, "type");
                this.f65163a = str;
                this.f65164b = ordersOnlineDetailType;
            }

            /* renamed from: d */
            public static /* synthetic */ C26702a m113411d(C26702a aVar, String str, OrdersOnlineDetailType ordersOnlineDetailType, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = aVar.f65163a;
                }
                if ((i & 2) != 0) {
                    ordersOnlineDetailType = aVar.f65164b;
                }
                return aVar.mo77583c(str, ordersOnlineDetailType);
            }

            @C12579k
            /* renamed from: a */
            public final String mo77581a() {
                return this.f65163a;
            }

            @C12579k
            /* renamed from: b */
            public final OrdersOnlineDetailType mo77582b() {
                return this.f65164b;
            }

            @C12579k
            /* renamed from: c */
            public final C26702a mo77583c(@C12579k String str, @C12579k OrdersOnlineDetailType ordersOnlineDetailType) {
                Intrinsics.checkNotNullParameter(str, "orderId");
                Intrinsics.checkNotNullParameter(ordersOnlineDetailType, "type");
                return new C26702a(str, ordersOnlineDetailType);
            }

            @C12579k
            /* renamed from: e */
            public final String mo77584e() {
                return this.f65163a;
            }

            public boolean equals(@C12580l Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C26702a)) {
                    return false;
                }
                C26702a aVar = (C26702a) obj;
                return Intrinsics.areEqual((Object) this.f65163a, (Object) aVar.f65163a) && this.f65164b == aVar.f65164b;
            }

            @C12579k
            /* renamed from: f */
            public final OrdersOnlineDetailType mo77586f() {
                return this.f65164b;
            }

            public int hashCode() {
                return (this.f65163a.hashCode() * 31) + this.f65164b.hashCode();
            }

            @C12579k
            public String toString() {
                String str = this.f65163a;
                OrdersOnlineDetailType ordersOnlineDetailType = this.f65164b;
                return "FetchOrderDetail(orderId=" + str + ", type=" + ordersOnlineDetailType + ")";
            }
        }
    }

    /* renamed from: com.carrefour.fid.android.presentation.viewmodels.order.online.ListProductsOrderedViewModel$d */
    public /* synthetic */ class C26703d {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        /* JADX WARNING: Can't wrap try/catch for region: R(9:0|1|2|3|4|5|6|7|9) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0019 */
        static {
            /*
                com.carrefour.fid.android.presentation.ui.orders.online.model.OrdersOnlineDetailType[] r0 = com.carrefour.fid.android.presentation.p035ui.orders.online.model.OrdersOnlineDetailType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.carrefour.fid.android.presentation.ui.orders.online.model.OrdersOnlineDetailType r1 = com.carrefour.fid.android.presentation.p035ui.orders.online.model.OrdersOnlineDetailType.ORDER     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                com.carrefour.fid.android.presentation.ui.orders.online.model.OrdersOnlineDetailType r1 = com.carrefour.fid.android.presentation.p035ui.orders.online.model.OrdersOnlineDetailType.ADDITIONAL_ORDER     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                com.carrefour.fid.android.presentation.ui.orders.online.model.OrdersOnlineDetailType r1 = com.carrefour.fid.android.presentation.p035ui.orders.online.model.OrdersOnlineDetailType.MISSING_REPLACEMENT_PRODUCTS     // Catch:{ NoSuchFieldError -> 0x0022 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0022 }
            L_0x0022:
                $EnumSwitchMapping$0 = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.presentation.viewmodels.order.online.ListProductsOrderedViewModel.C26703d.<clinit>():void");
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @Inject
    public ListProductsOrderedViewModel(@C12579k OrderOnlineRepository orderOnlineRepository, @C12579k GetOrderOnlineDetailUseCase getOrderOnlineDetailUseCase, @C12579k C25216a aVar) {
        super(C26699b.f65158c.mo77580a(), (CoroutineDispatcher) null, (C19456p0) null, 6, (DefaultConstructorMarker) null);
        Intrinsics.checkNotNullParameter(orderOnlineRepository, "repository");
        Intrinsics.checkNotNullParameter(getOrderOnlineDetailUseCase, "orderOnlineDetailUseCase");
        Intrinsics.checkNotNullParameter(aVar, "ordersOnlineDetailsModelDataMapper");
        this.f65153a = orderOnlineRepository;
        this.f65154b = getOrderOnlineDetailUseCase;
        this.f65155c = aVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0047  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0085  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0092  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00b6  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00b9  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x0195  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0027  */
    /* renamed from: e0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo77566e0(java.lang.String r16, com.carrefour.fid.android.presentation.p035ui.orders.online.model.OrdersOnlineDetailType r17, kotlin.coroutines.C11045c<? super kotlin.C11079d2> r18) {
        /*
            r15 = this;
            r0 = r15
            r1 = r18
            boolean r2 = r1 instanceof com.carrefour.fid.android.presentation.viewmodels.order.online.ListProductsOrderedViewModel$fetchDetail$1
            if (r2 == 0) goto L_0x0016
            r2 = r1
            com.carrefour.fid.android.presentation.viewmodels.order.online.ListProductsOrderedViewModel$fetchDetail$1 r2 = (com.carrefour.fid.android.presentation.viewmodels.order.online.ListProductsOrderedViewModel$fetchDetail$1) r2
            int r3 = r2.label
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L_0x0016
            int r3 = r3 - r4
            r2.label = r3
            goto L_0x001b
        L_0x0016:
            com.carrefour.fid.android.presentation.viewmodels.order.online.ListProductsOrderedViewModel$fetchDetail$1 r2 = new com.carrefour.fid.android.presentation.viewmodels.order.online.ListProductsOrderedViewModel$fetchDetail$1
            r2.<init>(r15, r1)
        L_0x001b:
            java.lang.Object r1 = r2.result
            java.lang.Object r3 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r4 = r2.label
            r5 = 1
            r6 = 0
            if (r4 == 0) goto L_0x0047
            if (r4 != r5) goto L_0x003f
            java.lang.Object r3 = r2.L$2
            com.carrefour.fid.android.presentation.ui.orders.online.model.OrdersOnlineDetailType r3 = (com.carrefour.fid.android.presentation.p035ui.orders.online.model.OrdersOnlineDetailType) r3
            java.lang.Object r4 = r2.L$1
            java.lang.String r4 = (java.lang.String) r4
            java.lang.Object r2 = r2.L$0
            com.carrefour.fid.android.presentation.viewmodels.order.online.ListProductsOrderedViewModel r2 = (com.carrefour.fid.android.presentation.viewmodels.order.online.ListProductsOrderedViewModel) r2
            kotlin.C11661u0.m45747n(r1)
            kotlin.Result r1 = (kotlin.Result) r1
            java.lang.Object r1 = r1.mo21858l()
            goto L_0x007f
        L_0x003f:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L_0x0047:
            kotlin.C11661u0.m45747n(r1)
            com.carrefour.fid.android.data.repositories.OrderOnlineRepository r1 = r0.f65153a
            kotlinx.coroutines.flow.u r1 = r1.mo111536h()
            java.lang.Object r1 = r1.getValue()
            com.carrefour.fid.android.domain.models.r r1 = (com.carrefour.fid.android.domain.models.C38120r) r1
            if (r1 != 0) goto L_0x0089
            com.carrefour.fid.android.domain.interactors.order.GetOrderOnlineDetailUseCase r1 = r0.f65154b
            com.carrefour.fid.android.domain.interactors.order.GetOrderOnlineDetailUseCase$a r4 = new com.carrefour.fid.android.domain.interactors.order.GetOrderOnlineDetailUseCase$a
            r9 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            r13 = 30
            r14 = 0
            r7 = r4
            r8 = r16
            r7.<init>(r8, r9, r10, r11, r12, r13, r14)
            r2.L$0 = r0
            r7 = r16
            r2.L$1 = r7
            r8 = r17
            r2.L$2 = r8
            r2.label = r5
            java.lang.Object r1 = r1.m172980invokegIAlus(r4, r2)
            if (r1 != r3) goto L_0x007c
            return r3
        L_0x007c:
            r2 = r0
            r4 = r7
            r3 = r8
        L_0x007f:
            boolean r7 = kotlin.Result.m38709i(r1)
            if (r7 == 0) goto L_0x0086
            r1 = r6
        L_0x0086:
            com.carrefour.fid.android.domain.models.r r1 = (com.carrefour.fid.android.domain.models.C38120r) r1
            goto L_0x0090
        L_0x0089:
            r7 = r16
            r8 = r17
            r2 = r0
            r4 = r7
            r3 = r8
        L_0x0090:
            if (r1 == 0) goto L_0x0193
            java.lang.String r7 = r1.mo118951W()
            boolean r7 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r7, (java.lang.Object) r4)
            r8 = 0
            if (r7 != 0) goto L_0x00b2
            com.carrefour.fid.android.domain.models.r r7 = r1.mo118936H()
            if (r7 == 0) goto L_0x00a8
            java.lang.String r7 = r7.mo118951W()
            goto L_0x00a9
        L_0x00a8:
            r7 = r6
        L_0x00a9:
            boolean r7 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r7, (java.lang.Object) r4)
            if (r7 == 0) goto L_0x00b0
            goto L_0x00b2
        L_0x00b0:
            r7 = r8
            goto L_0x00b3
        L_0x00b2:
            r7 = r5
        L_0x00b3:
            if (r7 == 0) goto L_0x00b6
            goto L_0x00b7
        L_0x00b6:
            r1 = r6
        L_0x00b7:
            if (r1 == 0) goto L_0x0193
            com.carrefour.fid.android.presentation.ui.orders.online.mapper.a r7 = r2.f65155c
            r9 = 2
            java.util.List r1 = com.carrefour.fid.android.presentation.p035ui.orders.online.mapper.C25216a.m108973b(r7, r1, r8, r9, r6)
            int[] r6 = com.carrefour.fid.android.presentation.viewmodels.order.online.ListProductsOrderedViewModel.C26703d.$EnumSwitchMapping$0
            int r3 = r3.ordinal()
            r3 = r6[r3]
            if (r3 == r5) goto L_0x014d
            if (r3 == r9) goto L_0x0111
            r5 = 3
            if (r3 != r5) goto L_0x010b
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            java.util.Iterator r1 = r1.iterator()
        L_0x00da:
            boolean r5 = r1.hasNext()
            if (r5 == 0) goto L_0x00ec
            java.lang.Object r5 = r1.next()
            boolean r6 = r5 instanceof com.carrefour.fid.android.presentation.p035ui.orders.online.model.C25230a.C25232b
            if (r6 == 0) goto L_0x00da
            r3.add(r5)
            goto L_0x00da
        L_0x00ec:
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.Iterator r3 = r3.iterator()
        L_0x00f5:
            boolean r5 = r3.hasNext()
            if (r5 == 0) goto L_0x0189
            java.lang.Object r5 = r3.next()
            com.carrefour.fid.android.presentation.ui.orders.online.model.a$b r5 = (com.carrefour.fid.android.presentation.p035ui.orders.online.model.C25230a.C25232b) r5
            java.util.List r5 = r5.mo73519g()
            java.lang.Iterable r5 = (java.lang.Iterable) r5
            kotlin.collections.C10994x.m42360n0(r1, r5)
            goto L_0x00f5
        L_0x010b:
            kotlin.NoWhenBranchMatchedException r1 = new kotlin.NoWhenBranchMatchedException
            r1.<init>()
            throw r1
        L_0x0111:
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            java.util.Iterator r1 = r1.iterator()
        L_0x011c:
            boolean r5 = r1.hasNext()
            if (r5 == 0) goto L_0x012e
            java.lang.Object r5 = r1.next()
            boolean r6 = r5 instanceof com.carrefour.fid.android.presentation.p035ui.orders.online.model.C25230a.C25231a
            if (r6 == 0) goto L_0x011c
            r3.add(r5)
            goto L_0x011c
        L_0x012e:
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.Iterator r3 = r3.iterator()
        L_0x0137:
            boolean r5 = r3.hasNext()
            if (r5 == 0) goto L_0x0189
            java.lang.Object r5 = r3.next()
            com.carrefour.fid.android.presentation.ui.orders.online.model.a$a r5 = (com.carrefour.fid.android.presentation.p035ui.orders.online.model.C25230a.C25231a) r5
            java.util.List r5 = r5.mo73512m()
            java.lang.Iterable r5 = (java.lang.Iterable) r5
            kotlin.collections.C10994x.m42360n0(r1, r5)
            goto L_0x0137
        L_0x014d:
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            java.util.Iterator r1 = r1.iterator()
        L_0x0158:
            boolean r5 = r1.hasNext()
            if (r5 == 0) goto L_0x016a
            java.lang.Object r5 = r1.next()
            boolean r6 = r5 instanceof com.carrefour.fid.android.presentation.p035ui.orders.online.model.C25230a.C25233c
            if (r6 == 0) goto L_0x0158
            r3.add(r5)
            goto L_0x0158
        L_0x016a:
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.Iterator r3 = r3.iterator()
        L_0x0173:
            boolean r5 = r3.hasNext()
            if (r5 == 0) goto L_0x0189
            java.lang.Object r5 = r3.next()
            com.carrefour.fid.android.presentation.ui.orders.online.model.a$c r5 = (com.carrefour.fid.android.presentation.p035ui.orders.online.model.C25230a.C25233c) r5
            java.util.List r5 = r5.mo73534m()
            java.lang.Iterable r5 = (java.lang.Iterable) r5
            kotlin.collections.C10994x.m42360n0(r1, r5)
            goto L_0x0173
        L_0x0189:
            com.carrefour.fid.android.presentation.viewmodels.order.online.ListProductsOrderedViewModel$b r3 = new com.carrefour.fid.android.presentation.viewmodels.order.online.ListProductsOrderedViewModel$b
            r3.<init>(r1)
            r2.publishState(r3)
            kotlin.d2 r6 = kotlin.C11079d2.f28267a
        L_0x0193:
            if (r6 != 0) goto L_0x01a2
            com.carrefour.fid.android.presentation.viewmodels.order.online.ListProductsOrderedViewModel$a$a r1 = new com.carrefour.fid.android.presentation.viewmodels.order.online.ListProductsOrderedViewModel$a$a
            com.carrefour.fid.android.core.io.OrderNotFoundException r3 = new com.carrefour.fid.android.core.io.OrderNotFoundException
            r3.<init>(r4)
            r1.<init>(r3)
            r2.emitEvent(r1)
        L_0x01a2:
            kotlin.d2 r1 = kotlin.C11079d2.f28267a
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.presentation.viewmodels.order.online.ListProductsOrderedViewModel.mo77566e0(java.lang.String, com.carrefour.fid.android.presentation.ui.orders.online.model.OrdersOnlineDetailType, kotlin.coroutines.c):java.lang.Object");
    }

    @C12580l
    /* renamed from: f0 */
    public Object processIntent(@C12579k C26701c cVar, @C12579k C11045c<? super C11079d2> cVar2) {
        if (!(cVar instanceof C26701c.C26702a)) {
            return C11079d2.f28267a;
        }
        C26701c.C26702a aVar = (C26701c.C26702a) cVar;
        Object e0 = mo77566e0(aVar.mo77584e(), aVar.mo77586f(), cVar2);
        if (e0 == C11063b.m42612h()) {
            return e0;
        }
        return C11079d2.f28267a;
    }
}
