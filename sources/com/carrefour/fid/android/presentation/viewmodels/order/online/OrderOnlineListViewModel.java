package com.carrefour.fid.android.presentation.viewmodels.order.online;

import androidx.compose.runtime.internal.C8567o;
import androidx.lifecycle.C19456p0;
import com.carrefour.fid.android.core.constants.OrderStatus;
import com.carrefour.fid.android.domain.interactors.order.GetOrderOnlineListUseCase;
import com.carrefour.fid.android.domain.models.OrdersOnlineDomain;
import com.carrefour.fid.android.domain.models.OrdersOnlineResultDomain;
import com.carrefour.fid.android.domain.models.OrdersPagingDomain;
import com.carrefour.fid.android.presentation.p035ui.orders.online.mapper.C25222e;
import com.carrefour.fid.android.presentation.p035ui.orders.online.model.OrdersOnlineItemModel;
import com.carrefour.fid.android.shared.base.BaseMVIViewModel;
import com.carrefour.fid.android.shared.base.C28505u;
import com.carrefour.fid.android.shared.domain.models.order.OrderType;
import com.carrefour.fid.android.shared.p045di.annotation.C28672p;
import dagger.hilt.android.lifecycle.C10245a;
import java.util.ArrayList;
import java.util.List;
import javax.inject.Inject;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.C11395k;
import kotlin.DeprecationLevel;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.intrinsics.C11063b;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.flow.C11940j;
import kotlinx.coroutines.flow.C11953v;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C10245a
@C11076d0(mo22515d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0004\u0019\u001d!&B#\b\u0007\u0012\u0006\u0010\u001b\u001a\u00020\u0018\u0012\u0006\u0010\u001f\u001a\u00020\u001c\u0012\b\b\u0001\u0010*\u001a\u00020)¢\u0006\u0004\b+\u0010,J\u001b\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H@ø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\n\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\bH\u0002J\u0013\u0010\u000b\u001a\u00020\u0005H@ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\fJ\u001d\u0010\u000f\u001a\u00020\u00052\b\b\u0002\u0010\u000e\u001a\u00020\rH@ø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\u0010J\u0018\u0010\u0013\u001a\u00020\u00052\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000e\u001a\u00020\rH\u0002J\f\u0010\u0014\u001a\u00020\r*\u00020\u0011H\u0002J\u0010\u0010\u0017\u001a\u00020\u00052\u0006\u0010\u0016\u001a\u00020\u0015H\u0002R\u0014\u0010\u001b\u001a\u00020\u00188\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001f\u001a\u00020\u001c8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR \u0010#\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00150 8\u0002X\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u001c\u0010(\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010%0$8\u0002X\u0004¢\u0006\u0006\n\u0004\b&\u0010'\u0002\u0004\n\u0002\b\u0019¨\u0006-"}, mo22516d2 = {"Lcom/carrefour/fid/android/presentation/viewmodels/order/online/OrderOnlineListViewModel;", "Lcom/carrefour/fid/android/shared/base/BaseMVIViewModel;", "Lcom/carrefour/fid/android/presentation/viewmodels/order/online/OrderOnlineListViewModel$b;", "Lcom/carrefour/fid/android/presentation/viewmodels/order/online/OrderOnlineListViewModel$d;", "intent", "Lkotlin/d2;", "k0", "(Lcom/carrefour/fid/android/presentation/viewmodels/order/online/OrderOnlineListViewModel$d;Lkotlin/coroutines/c;)Ljava/lang/Object;", "", "orderId", "m0", "f0", "(Lkotlin/coroutines/c;)Ljava/lang/Object;", "", "isFirstPage", "i0", "(ZLkotlin/coroutines/c;)Ljava/lang/Object;", "Lcom/carrefour/fid/android/domain/models/OrdersOnlineResultDomain;", "result", "g0", "h0", "Lcom/carrefour/fid/android/presentation/viewmodels/order/online/OrderOnlineListViewModel$a;", "partialState", "l0", "Lcom/carrefour/fid/android/domain/interactors/order/GetOrderOnlineListUseCase;", "a", "Lcom/carrefour/fid/android/domain/interactors/order/GetOrderOnlineListUseCase;", "getOrderOnlineListUseCase", "Lcom/carrefour/fid/android/presentation/ui/orders/online/mapper/e;", "b", "Lcom/carrefour/fid/android/presentation/ui/orders/online/mapper/e;", "ordersOnlineModelDataMapper", "Lcom/carrefour/fid/android/shared/base/u$c;", "c", "Lcom/carrefour/fid/android/shared/base/u$c;", "reducer", "Lkotlinx/coroutines/flow/j;", "Lcom/carrefour/fid/android/domain/models/OrdersPagingDomain;", "d", "Lkotlinx/coroutines/flow/j;", "pagingDomain", "Lkotlinx/coroutines/CoroutineDispatcher;", "dispatcher", "<init>", "(Lcom/carrefour/fid/android/domain/interactors/order/GetOrderOnlineListUseCase;Lcom/carrefour/fid/android/presentation/ui/orders/online/mapper/e;Lkotlinx/coroutines/CoroutineDispatcher;)V", "app_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
@C8567o(parameters = 0)
public final class OrderOnlineListViewModel extends BaseMVIViewModel<C26709b, C26714d> {

    /* renamed from: e */
    public static final int f65171e = 8;
    @C12579k

    /* renamed from: a */
    public final GetOrderOnlineListUseCase f65172a;
    @C12579k

    /* renamed from: b */
    public final C25222e f65173b;
    @C12579k

    /* renamed from: c */
    public final C28505u.C28508c<C26709b, C26704a> f65174c = C26718e.f65200a;
    @C12579k

    /* renamed from: d */
    public final C11940j<OrdersPagingDomain> f65175d = C11953v.m47628a(null);

    /* renamed from: com.carrefour.fid.android.presentation.viewmodels.order.online.OrderOnlineListViewModel$a */
    public interface C26704a extends C28505u.C28509d {

        /* renamed from: com.carrefour.fid.android.presentation.viewmodels.order.online.OrderOnlineListViewModel$a$a */
        public static final class C26705a {
            @C11395k(level = DeprecationLevel.WARNING, message = "We should not be able to reset the current state. You should use [MVI.Event] instead.")
            @C12579k
            /* renamed from: a */
            public static C28505u.C28509d m113434a(@C12579k C26704a aVar) {
                return C28505u.C28509d.C28510a.m118428a(aVar);
            }
        }

        @C8567o(parameters = 0)
        /* renamed from: com.carrefour.fid.android.presentation.viewmodels.order.online.OrderOnlineListViewModel$a$b */
        public static final class C26706b implements C26704a {
            @C12579k

            /* renamed from: b */
            public static final C26706b f65176b = new C26706b();

            /* renamed from: c */
            public static final int f65177c = 0;

            @C11395k(level = DeprecationLevel.WARNING, message = "We should not be able to reset the current state. You should use [MVI.Event] instead.")
            @C12579k
            public C28505u.C28509d reset() {
                return C26705a.m113434a(this);
            }
        }

        @C8567o(parameters = 0)
        /* renamed from: com.carrefour.fid.android.presentation.viewmodels.order.online.OrderOnlineListViewModel$a$c */
        public static final class C26707c implements C26704a {
            @C12579k

            /* renamed from: b */
            public static final C26707c f65178b = new C26707c();

            /* renamed from: c */
            public static final int f65179c = 0;

            @C11395k(level = DeprecationLevel.WARNING, message = "We should not be able to reset the current state. You should use [MVI.Event] instead.")
            @C12579k
            public C28505u.C28509d reset() {
                return C26705a.m113434a(this);
            }
        }

        @C8567o(parameters = 0)
        /* renamed from: com.carrefour.fid.android.presentation.viewmodels.order.online.OrderOnlineListViewModel$a$d */
        public static final class C26708d implements C26704a {

            /* renamed from: d */
            public static final int f65180d = 8;
            @C12580l

            /* renamed from: b */
            public final List<OrdersOnlineItemModel> f65181b;

            /* renamed from: c */
            public final boolean f65182c;

            public C26708d(@C12580l List<OrdersOnlineItemModel> list, boolean z) {
                this.f65181b = list;
                this.f65182c = z;
            }

            /* renamed from: h */
            public static /* synthetic */ C26708d m113435h(C26708d dVar, List<OrdersOnlineItemModel> list, boolean z, int i, Object obj) {
                if ((i & 1) != 0) {
                    list = dVar.f65181b;
                }
                if ((i & 2) != 0) {
                    z = dVar.f65182c;
                }
                return dVar.mo77604g(list, z);
            }

            @C12580l
            /* renamed from: e */
            public final List<OrdersOnlineItemModel> mo77601e() {
                return this.f65181b;
            }

            public boolean equals(@C12580l Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C26708d)) {
                    return false;
                }
                C26708d dVar = (C26708d) obj;
                return Intrinsics.areEqual((Object) this.f65181b, (Object) dVar.f65181b) && this.f65182c == dVar.f65182c;
            }

            /* renamed from: f */
            public final boolean mo77603f() {
                return this.f65182c;
            }

            @C12579k
            /* renamed from: g */
            public final C26708d mo77604g(@C12580l List<OrdersOnlineItemModel> list, boolean z) {
                return new C26708d(list, z);
            }

            public int hashCode() {
                List<OrdersOnlineItemModel> list = this.f65181b;
                int hashCode = (list == null ? 0 : list.hashCode()) * 31;
                boolean z = this.f65182c;
                if (z) {
                    z = true;
                }
                return hashCode + (z ? 1 : 0);
            }

            /* renamed from: i */
            public final boolean mo77606i() {
                return this.f65182c;
            }

            @C12580l
            /* renamed from: j */
            public final List<OrdersOnlineItemModel> mo77607j() {
                return this.f65181b;
            }

            @C11395k(level = DeprecationLevel.WARNING, message = "We should not be able to reset the current state. You should use [MVI.Event] instead.")
            @C12579k
            public C28505u.C28509d reset() {
                return C26705a.m113434a(this);
            }

            @C12579k
            public String toString() {
                List<OrdersOnlineItemModel> list = this.f65181b;
                boolean z = this.f65182c;
                return "OnlineOrdersList(items=" + list + ", hasNextPage=" + z + ")";
            }
        }
    }

    @C8567o(parameters = 0)
    /* renamed from: com.carrefour.fid.android.presentation.viewmodels.order.online.OrderOnlineListViewModel$b */
    public static final class C26709b implements C28505u.C28509d {
        @C12579k

        /* renamed from: e */
        public static final C26710a f65183e = new C26710a((DefaultConstructorMarker) null);

        /* renamed from: f */
        public static final int f65184f = 8;
        @C12579k

        /* renamed from: g */
        public static final C26709b f65185g = new C26709b(false, (List) null, false, 7, (DefaultConstructorMarker) null);

        /* renamed from: b */
        public final boolean f65186b;
        @C12580l

        /* renamed from: c */
        public final List<OrdersOnlineItemModel> f65187c;

        /* renamed from: d */
        public final boolean f65188d;

        /* renamed from: com.carrefour.fid.android.presentation.viewmodels.order.online.OrderOnlineListViewModel$b$a */
        public static final class C26710a {
            public /* synthetic */ C26710a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            @C12579k
            /* renamed from: a */
            public final C26709b mo77619a() {
                return C26709b.f65185g;
            }

            public C26710a() {
            }
        }

        public C26709b() {
            this(false, (List) null, false, 7, (DefaultConstructorMarker) null);
        }

        /* renamed from: j */
        public static /* synthetic */ C26709b m113442j(C26709b bVar, boolean z, List<OrdersOnlineItemModel> list, boolean z2, int i, Object obj) {
            if ((i & 1) != 0) {
                z = bVar.f65186b;
            }
            if ((i & 2) != 0) {
                list = bVar.f65187c;
            }
            if ((i & 4) != 0) {
                z2 = bVar.f65188d;
            }
            return bVar.mo77614i(z, list, z2);
        }

        public boolean equals(@C12580l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C26709b)) {
                return false;
            }
            C26709b bVar = (C26709b) obj;
            return this.f65186b == bVar.f65186b && Intrinsics.areEqual((Object) this.f65187c, (Object) bVar.f65187c) && this.f65188d == bVar.f65188d;
        }

        /* renamed from: f */
        public final boolean mo77610f() {
            return this.f65186b;
        }

        @C12580l
        /* renamed from: g */
        public final List<OrdersOnlineItemModel> mo77611g() {
            return this.f65187c;
        }

        /* renamed from: h */
        public final boolean mo77612h() {
            return this.f65188d;
        }

        public int hashCode() {
            boolean z = this.f65186b;
            boolean z2 = true;
            if (z) {
                z = true;
            }
            int i = (z ? 1 : 0) * true;
            List<OrdersOnlineItemModel> list = this.f65187c;
            int hashCode = (i + (list == null ? 0 : list.hashCode())) * 31;
            boolean z3 = this.f65188d;
            if (!z3) {
                z2 = z3;
            }
            return hashCode + (z2 ? 1 : 0);
        }

        @C12579k
        /* renamed from: i */
        public final C26709b mo77614i(boolean z, @C12580l List<OrdersOnlineItemModel> list, boolean z2) {
            return new C26709b(z, list, z2);
        }

        public final boolean isLoading() {
            return this.f65186b;
        }

        /* renamed from: k */
        public final boolean mo77616k() {
            return this.f65188d;
        }

        @C12580l
        /* renamed from: l */
        public final List<OrdersOnlineItemModel> mo77617l() {
            return this.f65187c;
        }

        @C11395k(level = DeprecationLevel.WARNING, message = "We should not be able to reset the current state. You should use [MVI.Event] instead.")
        @C12579k
        public C28505u.C28509d reset() {
            return C28505u.C28509d.C28510a.m118428a(this);
        }

        @C12579k
        public String toString() {
            boolean z = this.f65186b;
            List<OrdersOnlineItemModel> list = this.f65187c;
            boolean z2 = this.f65188d;
            return "UIState(isLoading=" + z + ", onlineOrders=" + list + ", hasNextPage=" + z2 + ")";
        }

        public C26709b(boolean z, @C12580l List<OrdersOnlineItemModel> list, boolean z2) {
            this.f65186b = z;
            this.f65187c = list;
            this.f65188d = z2;
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ C26709b(boolean z, List list, boolean z2, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? false : z, (i & 2) != 0 ? null : list, (i & 4) != 0 ? false : z2);
        }
    }

    /* renamed from: com.carrefour.fid.android.presentation.viewmodels.order.online.OrderOnlineListViewModel$c */
    public interface C26711c extends C28505u.C28506a {

        @C8567o(parameters = 0)
        /* renamed from: com.carrefour.fid.android.presentation.viewmodels.order.online.OrderOnlineListViewModel$c$a */
        public static final class C26712a implements C26711c {

            /* renamed from: b */
            public static final int f65189b = 8;
            @C12580l

            /* renamed from: a */
            public final Throwable f65190a;

            public C26712a() {
                this((Throwable) null, 1, (DefaultConstructorMarker) null);
            }

            /* renamed from: c */
            public static /* synthetic */ C26712a m113450c(C26712a aVar, Throwable th, int i, Object obj) {
                if ((i & 1) != 0) {
                    th = aVar.f65190a;
                }
                return aVar.mo77621b(th);
            }

            @C12580l
            /* renamed from: a */
            public final Throwable mo77620a() {
                return this.f65190a;
            }

            @C12579k
            /* renamed from: b */
            public final C26712a mo77621b(@C12580l Throwable th) {
                return new C26712a(th);
            }

            @C12580l
            /* renamed from: d */
            public final Throwable mo77622d() {
                return this.f65190a;
            }

            public boolean equals(@C12580l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C26712a) && Intrinsics.areEqual((Object) this.f65190a, (Object) ((C26712a) obj).f65190a);
            }

            public int hashCode() {
                Throwable th = this.f65190a;
                if (th == null) {
                    return 0;
                }
                return th.hashCode();
            }

            @C12579k
            public String toString() {
                Throwable th = this.f65190a;
                return "Error(throwable=" + th + ")";
            }

            public C26712a(@C12580l Throwable th) {
                this.f65190a = th;
            }

            /* JADX INFO: this call moved to the top of the method (can break code semantics) */
            public /* synthetic */ C26712a(Throwable th, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this((i & 1) != 0 ? null : th);
            }
        }

        @C8567o(parameters = 0)
        /* renamed from: com.carrefour.fid.android.presentation.viewmodels.order.online.OrderOnlineListViewModel$c$b */
        public static final class C26713b implements C26711c {

            /* renamed from: c */
            public static final int f65191c = 0;
            @C12579k

            /* renamed from: a */
            public final String f65192a;

            /* renamed from: b */
            public final boolean f65193b;

            public C26713b(@C12579k String str, boolean z) {
                Intrinsics.checkNotNullParameter(str, "orderId");
                this.f65192a = str;
                this.f65193b = z;
            }

            /* renamed from: d */
            public static /* synthetic */ C26713b m113454d(C26713b bVar, String str, boolean z, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = bVar.f65192a;
                }
                if ((i & 2) != 0) {
                    z = bVar.f65193b;
                }
                return bVar.mo77628c(str, z);
            }

            @C12579k
            /* renamed from: a */
            public final String mo77626a() {
                return this.f65192a;
            }

            /* renamed from: b */
            public final boolean mo77627b() {
                return this.f65193b;
            }

            @C12579k
            /* renamed from: c */
            public final C26713b mo77628c(@C12579k String str, boolean z) {
                Intrinsics.checkNotNullParameter(str, "orderId");
                return new C26713b(str, z);
            }

            @C12579k
            /* renamed from: e */
            public final String mo77629e() {
                return this.f65192a;
            }

            public boolean equals(@C12580l Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C26713b)) {
                    return false;
                }
                C26713b bVar = (C26713b) obj;
                return Intrinsics.areEqual((Object) this.f65192a, (Object) bVar.f65192a) && this.f65193b == bVar.f65193b;
            }

            /* renamed from: f */
            public final boolean mo77631f() {
                return this.f65193b;
            }

            public int hashCode() {
                int hashCode = this.f65192a.hashCode() * 31;
                boolean z = this.f65193b;
                if (z) {
                    z = true;
                }
                return hashCode + (z ? 1 : 0);
            }

            @C12579k
            public String toString() {
                String str = this.f65192a;
                boolean z = this.f65193b;
                return "StartAdditionalOrder(orderId=" + str + ", showAdditionalOrderBackdrop=" + z + ")";
            }
        }
    }

    /* renamed from: com.carrefour.fid.android.presentation.viewmodels.order.online.OrderOnlineListViewModel$d */
    public interface C26714d extends C28505u.C28507b {

        @C8567o(parameters = 0)
        /* renamed from: com.carrefour.fid.android.presentation.viewmodels.order.online.OrderOnlineListViewModel$d$a */
        public static final class C26715a implements C26714d {
            @C12579k

            /* renamed from: a */
            public static final C26715a f65194a = new C26715a();

            /* renamed from: b */
            public static final int f65195b = 0;
        }

        @C8567o(parameters = 0)
        /* renamed from: com.carrefour.fid.android.presentation.viewmodels.order.online.OrderOnlineListViewModel$d$b */
        public static final class C26716b implements C26714d {
            @C12579k

            /* renamed from: a */
            public static final C26716b f65196a = new C26716b();

            /* renamed from: b */
            public static final int f65197b = 0;
        }

        @C8567o(parameters = 0)
        /* renamed from: com.carrefour.fid.android.presentation.viewmodels.order.online.OrderOnlineListViewModel$d$c */
        public static final class C26717c implements C26714d {

            /* renamed from: b */
            public static final int f65198b = 0;
            @C12579k

            /* renamed from: a */
            public final String f65199a;

            public C26717c(@C12579k String str) {
                Intrinsics.checkNotNullParameter(str, "orderId");
                this.f65199a = str;
            }

            /* renamed from: c */
            public static /* synthetic */ C26717c m113460c(C26717c cVar, String str, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = cVar.f65199a;
                }
                return cVar.mo77635b(str);
            }

            @C12579k
            /* renamed from: a */
            public final String mo77634a() {
                return this.f65199a;
            }

            @C12579k
            /* renamed from: b */
            public final C26717c mo77635b(@C12579k String str) {
                Intrinsics.checkNotNullParameter(str, "orderId");
                return new C26717c(str);
            }

            @C12579k
            /* renamed from: d */
            public final String mo77636d() {
                return this.f65199a;
            }

            public boolean equals(@C12580l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C26717c) && Intrinsics.areEqual((Object) this.f65199a, (Object) ((C26717c) obj).f65199a);
            }

            public int hashCode() {
                return this.f65199a.hashCode();
            }

            @C12579k
            public String toString() {
                String str = this.f65199a;
                return "StartAdditionalOrder(orderId=" + str + ")";
            }
        }
    }

    /* renamed from: com.carrefour.fid.android.presentation.viewmodels.order.online.OrderOnlineListViewModel$e */
    public static final class C26718e implements C28505u.C28508c<C26709b, C26704a> {

        /* renamed from: a */
        public static final C26718e f65200a = new C26718e();

        @C12579k
        /* renamed from: b */
        public final C26709b mo32307a(@C12579k C26709b bVar, @C12579k C26704a aVar) {
            Intrinsics.checkNotNullParameter(bVar, "state");
            Intrinsics.checkNotNullParameter(aVar, "partialState");
            if (aVar instanceof C26704a.C26707c) {
                return new C26709b(true, (List) null, false, 6, (DefaultConstructorMarker) null);
            }
            if (aVar instanceof C26704a.C26706b) {
                return new C26709b(false, new ArrayList(), false, 4, (DefaultConstructorMarker) null);
            }
            if (aVar instanceof C26704a.C26708d) {
                C26704a.C26708d dVar = (C26704a.C26708d) aVar;
                return bVar.mo77614i(false, dVar.mo77607j(), dVar.mo77606i());
            }
            throw new NoWhenBranchMatchedException();
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @Inject
    public OrderOnlineListViewModel(@C12579k GetOrderOnlineListUseCase getOrderOnlineListUseCase, @C12579k C25222e eVar, @C28672p @C12579k CoroutineDispatcher coroutineDispatcher) {
        super(C26709b.f65183e.mo77619a(), coroutineDispatcher, (C19456p0) null, 4, (DefaultConstructorMarker) null);
        Intrinsics.checkNotNullParameter(getOrderOnlineListUseCase, "getOrderOnlineListUseCase");
        Intrinsics.checkNotNullParameter(eVar, "ordersOnlineModelDataMapper");
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "dispatcher");
        this.f65172a = getOrderOnlineListUseCase;
        this.f65173b = eVar;
    }

    /* renamed from: j0 */
    public static /* synthetic */ Object m113426j0(OrderOnlineListViewModel orderOnlineListViewModel, boolean z, C11045c cVar, int i, Object obj) {
        if ((i & 1) != 0) {
            z = true;
        }
        return orderOnlineListViewModel.mo77597i0(z, cVar);
    }

    /* renamed from: f0 */
    public final Object mo77594f0(C11045c<? super C11079d2> cVar) {
        this.f65175d.setValue(null);
        mo77599l0(C26704a.C26707c.f65178b);
        Object j0 = m113426j0(this, false, cVar, 1, (Object) null);
        if (j0 == C11063b.m42612h()) {
            return j0;
        }
        return C11079d2.f28267a;
    }

    /* renamed from: g0 */
    public final void mo77595g0(OrdersOnlineResultDomain ordersOnlineResultDomain, boolean z) {
        this.f65175d.setValue(ordersOnlineResultDomain.getPagingData());
        if (!z) {
            List<OrdersOnlineItemModel> l = ((C26709b) getCurrentState()).mo77617l();
            List<R> b = this.f65173b.mo83406b(ordersOnlineResultDomain.getOrders());
            if (b == null) {
                b = CollectionsKt__CollectionsKt.m40441E();
            }
            if (l != null) {
                l.addAll(b);
            }
            mo77599l0(new C26704a.C26708d(l, mo77596h0(ordersOnlineResultDomain)));
        } else if (ordersOnlineResultDomain.getOrders().isEmpty()) {
            mo77599l0(C26704a.C26706b.f65176b);
        } else {
            List T5 = CollectionsKt___CollectionsKt.m40572T5(ordersOnlineResultDomain.getOrders());
            OrdersOnlineDomain ordersOnlineDomain = r2;
            OrdersOnlineDomain ordersOnlineDomain2 = new OrdersOnlineDomain(false, false, false, (Long) null, 1, (String) null, (OrderStatus) null, (OrderType) null, 0, 0, (Double) null, (Double) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, false, 4194287, (DefaultConstructorMarker) null);
            T5.add(1, ordersOnlineDomain);
            List b2 = this.f65173b.mo83406b(T5);
            if (b2 == null) {
                b2 = CollectionsKt__CollectionsKt.m40441E();
            }
            mo77599l0(new C26704a.C26708d(CollectionsKt___CollectionsKt.m40572T5(b2), mo77596h0(ordersOnlineResultDomain)));
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x001e  */
    /* JADX WARNING: Removed duplicated region for block: B:24:? A[RETURN, SYNTHETIC] */
    /* renamed from: h0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo77596h0(com.carrefour.fid.android.domain.models.OrdersOnlineResultDomain r4) {
        /*
            r3 = this;
            com.carrefour.fid.android.domain.models.OrdersPagingDomain r0 = r4.getPagingData()
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L_0x001b
            java.lang.String r0 = r0.getScrollHash()
            if (r0 == 0) goto L_0x001b
            int r0 = r0.length()
            if (r0 <= 0) goto L_0x0016
            r0 = r1
            goto L_0x0017
        L_0x0016:
            r0 = r2
        L_0x0017:
            if (r0 != r1) goto L_0x001b
            r0 = r1
            goto L_0x001c
        L_0x001b:
            r0 = r2
        L_0x001c:
            if (r0 == 0) goto L_0x0039
            com.carrefour.fid.android.domain.models.OrdersPagingDomain r4 = r4.getPagingData()
            java.lang.String r4 = r4.getScrollPaging()
            if (r4 == 0) goto L_0x0035
            int r4 = r4.length()
            if (r4 <= 0) goto L_0x0030
            r4 = r1
            goto L_0x0031
        L_0x0030:
            r4 = r2
        L_0x0031:
            if (r4 != r1) goto L_0x0035
            r4 = r1
            goto L_0x0036
        L_0x0035:
            r4 = r2
        L_0x0036:
            if (r4 == 0) goto L_0x0039
            goto L_0x003a
        L_0x0039:
            r1 = r2
        L_0x003a:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.presentation.viewmodels.order.online.OrderOnlineListViewModel.mo77596h0(com.carrefour.fid.android.domain.models.OrdersOnlineResultDomain):boolean");
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x003d  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x007a  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0086  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* renamed from: i0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo77597i0(boolean r8, kotlin.coroutines.C11045c<? super kotlin.C11079d2> r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof com.carrefour.fid.android.presentation.viewmodels.order.online.OrderOnlineListViewModel$loadOnlineOrders$1
            if (r0 == 0) goto L_0x0013
            r0 = r9
            com.carrefour.fid.android.presentation.viewmodels.order.online.OrderOnlineListViewModel$loadOnlineOrders$1 r0 = (com.carrefour.fid.android.presentation.viewmodels.order.online.OrderOnlineListViewModel$loadOnlineOrders$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.carrefour.fid.android.presentation.viewmodels.order.online.OrderOnlineListViewModel$loadOnlineOrders$1 r0 = new com.carrefour.fid.android.presentation.viewmodels.order.online.OrderOnlineListViewModel$loadOnlineOrders$1
            r0.<init>(r7, r9)
        L_0x0018:
            java.lang.Object r9 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L_0x003d
            if (r2 != r3) goto L_0x0035
            boolean r8 = r0.Z$0
            java.lang.Object r0 = r0.L$0
            com.carrefour.fid.android.presentation.viewmodels.order.online.OrderOnlineListViewModel r0 = (com.carrefour.fid.android.presentation.viewmodels.order.online.OrderOnlineListViewModel) r0
            kotlin.C11661u0.m45747n(r9)
            kotlin.Result r9 = (kotlin.Result) r9
            java.lang.Object r9 = r9.mo21858l()
            goto L_0x0074
        L_0x0035:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L_0x003d:
            kotlin.C11661u0.m45747n(r9)
            com.carrefour.fid.android.domain.interactors.order.GetOrderOnlineListUseCase r9 = r7.f65172a
            com.carrefour.fid.android.domain.interactors.order.GetOrderOnlineListUseCase$a r2 = new com.carrefour.fid.android.domain.interactors.order.GetOrderOnlineListUseCase$a
            kotlinx.coroutines.flow.j<com.carrefour.fid.android.domain.models.OrdersPagingDomain> r4 = r7.f65175d
            java.lang.Object r4 = r4.getValue()
            com.carrefour.fid.android.domain.models.OrdersPagingDomain r4 = (com.carrefour.fid.android.domain.models.OrdersPagingDomain) r4
            r5 = 0
            if (r4 == 0) goto L_0x0054
            java.lang.String r4 = r4.getScrollHash()
            goto L_0x0055
        L_0x0054:
            r4 = r5
        L_0x0055:
            kotlinx.coroutines.flow.j<com.carrefour.fid.android.domain.models.OrdersPagingDomain> r6 = r7.f65175d
            java.lang.Object r6 = r6.getValue()
            com.carrefour.fid.android.domain.models.OrdersPagingDomain r6 = (com.carrefour.fid.android.domain.models.OrdersPagingDomain) r6
            if (r6 == 0) goto L_0x0063
            java.lang.String r5 = r6.getScrollPaging()
        L_0x0063:
            r2.<init>(r4, r5)
            r0.L$0 = r7
            r0.Z$0 = r8
            r0.label = r3
            java.lang.Object r9 = r9.m172981invokegIAlus(r2, r0)
            if (r9 != r1) goto L_0x0073
            return r1
        L_0x0073:
            r0 = r7
        L_0x0074:
            boolean r1 = kotlin.Result.m38710j(r9)
            if (r1 == 0) goto L_0x0080
            r1 = r9
            com.carrefour.fid.android.domain.models.OrdersOnlineResultDomain r1 = (com.carrefour.fid.android.domain.models.OrdersOnlineResultDomain) r1
            r0.mo77595g0(r1, r8)
        L_0x0080:
            java.lang.Throwable r8 = kotlin.Result.m38705e(r9)
            if (r8 == 0) goto L_0x008e
            com.carrefour.fid.android.presentation.viewmodels.order.online.OrderOnlineListViewModel$c$a r9 = new com.carrefour.fid.android.presentation.viewmodels.order.online.OrderOnlineListViewModel$c$a
            r9.<init>(r8)
            r0.emitEvent(r9)
        L_0x008e:
            kotlin.d2 r8 = kotlin.C11079d2.f28267a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.presentation.viewmodels.order.online.OrderOnlineListViewModel.mo77597i0(boolean, kotlin.coroutines.c):java.lang.Object");
    }

    @C12580l
    /* renamed from: k0 */
    public Object processIntent(@C12579k C26714d dVar, @C12579k C11045c<? super C11079d2> cVar) {
        if (Intrinsics.areEqual((Object) dVar, (Object) C26714d.C26716b.f65196a)) {
            Object f0 = mo77594f0(cVar);
            if (f0 == C11063b.m42612h()) {
                return f0;
            }
            return C11079d2.f28267a;
        } else if (Intrinsics.areEqual((Object) dVar, (Object) C26714d.C26715a.f65194a)) {
            Object i0 = mo77597i0(false, cVar);
            if (i0 == C11063b.m42612h()) {
                return i0;
            }
            return C11079d2.f28267a;
        } else {
            if (dVar instanceof C26714d.C26717c) {
                mo77600m0(((C26714d.C26717c) dVar).mo77636d());
            }
            return C11079d2.f28267a;
        }
    }

    /* renamed from: l0 */
    public final void mo77599l0(C26704a aVar) {
        reduceAndPublishState(this.f65174c, aVar);
    }

    /* renamed from: m0 */
    public final void mo77600m0(String str) {
        emitEvent(new C26711c.C26713b(str, true));
    }
}
