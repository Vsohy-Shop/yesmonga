package com.carrefour.fid.android.presentation.viewmodels.order.offline;

import androidx.compose.runtime.internal.C8567o;
import androidx.lifecycle.C19456p0;
import com.carrefour.fid.android.account.data.repositories.AccountRepository;
import com.carrefour.fid.android.domain.interactors.loyalty.C37699c;
import com.carrefour.fid.android.domain.interactors.order.GetOrderOfflineListUseCase;
import com.carrefour.fid.android.domain.models.OrdersOfflineResultDomain;
import com.carrefour.fid.android.domain.models.OrdersPagingDomain;
import com.carrefour.fid.android.loyalty.core.datastore.LoyaltyPreferencesStorage;
import com.carrefour.fid.android.presentation.p035ui.orders.offline.mapper.C24790g;
import com.carrefour.fid.android.presentation.p035ui.orders.offline.model.C24803i;
import com.carrefour.fid.android.shared.base.BaseMVIViewModel;
import com.carrefour.fid.android.shared.base.C28505u;
import com.carrefour.fid.android.shared.data.datastore.pref.C28633g;
import com.carrefour.fid.android.shared.p045di.annotation.C28672p;
import com.carrefour.fid.android.shared.p046io.EmptyListThrowable;
import dagger.hilt.android.lifecycle.C10245a;
import java.util.Collection;
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
@C11076d0(mo22515d1 = {"\u0000~\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0003\u001c $B;\b\u0007\u0012\u0006\u0010\u001e\u001a\u00020\u001b\u0012\u0006\u0010\"\u001a\u00020\u001f\u0012\u0006\u0010&\u001a\u00020#\u0012\u0006\u0010*\u001a\u00020'\u0012\u0006\u0010.\u001a\u00020+\u0012\b\b\u0001\u0010;\u001a\u00020:¢\u0006\u0004\b<\u0010=J\u001b\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H@ø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0007J\u001b\u0010\n\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\bH@ø\u0001\u0000¢\u0006\u0004\b\n\u0010\u000bJ\u0013\u0010\f\u001a\u00020\u0005H@ø\u0001\u0000¢\u0006\u0004\b\f\u0010\rJ\u0013\u0010\u000e\u001a\u00020\u0005H@ø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\rJ\u001d\u0010\u0011\u001a\u00020\u00052\b\b\u0002\u0010\u0010\u001a\u00020\u000fH@ø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\u0012J\u0018\u0010\u0015\u001a\u00020\u00052\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0010\u001a\u00020\u000fH\u0002J\u0013\u0010\u0016\u001a\u00020\bH@ø\u0001\u0000¢\u0006\u0004\b\u0016\u0010\rJ\f\u0010\u0017\u001a\u00020\u000f*\u00020\u0013H\u0002J\u0010\u0010\u001a\u001a\u00020\u00052\u0006\u0010\u0019\u001a\u00020\u0018H\u0002R\u0014\u0010\u001e\u001a\u00020\u001b8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0014\u0010\"\u001a\u00020\u001f8\u0002X\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u0014\u0010&\u001a\u00020#8\u0002X\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u0014\u0010*\u001a\u00020'8\u0002X\u0004¢\u0006\u0006\n\u0004\b(\u0010)R\u0014\u0010.\u001a\u00020+8\u0002X\u0004¢\u0006\u0006\n\u0004\b,\u0010-R \u00102\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00180/8\u0002X\u0004¢\u0006\u0006\n\u0004\b0\u00101R\u001c\u00107\u001a\n\u0012\u0006\u0012\u0004\u0018\u000104038\u0002X\u0004¢\u0006\u0006\n\u0004\b5\u00106R\u001c\u00109\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\b038\u0002X\u0004¢\u0006\u0006\n\u0004\b8\u00106\u0002\u0004\n\u0002\b\u0019¨\u0006>"}, mo22516d2 = {"Lcom/carrefour/fid/android/presentation/viewmodels/order/offline/OrderOfflineListViewModel;", "Lcom/carrefour/fid/android/shared/base/BaseMVIViewModel;", "Lcom/carrefour/fid/android/presentation/viewmodels/order/offline/OrderOfflineListViewModel$b;", "Lcom/carrefour/fid/android/presentation/viewmodels/order/offline/OrderOfflineListViewModel$c;", "intent", "Lkotlin/d2;", "o0", "(Lcom/carrefour/fid/android/presentation/viewmodels/order/offline/OrderOfflineListViewModel$c;Lkotlin/coroutines/c;)Ljava/lang/Object;", "", "cardNumber", "r0", "(Ljava/lang/String;Lkotlin/coroutines/c;)Ljava/lang/Object;", "q0", "(Lkotlin/coroutines/c;)Ljava/lang/Object;", "n0", "", "isFirstPage", "i0", "(ZLkotlin/coroutines/c;)Ljava/lang/Object;", "Lcom/carrefour/fid/android/domain/models/OrdersOfflineResultDomain;", "result", "l0", "k0", "m0", "Lcom/carrefour/fid/android/presentation/viewmodels/order/offline/OrderOfflineListViewModel$a;", "partialState", "p0", "Lcom/carrefour/fid/android/domain/interactors/loyalty/c;", "a", "Lcom/carrefour/fid/android/domain/interactors/loyalty/c;", "getLoyaltyCardsUseCase", "Lcom/carrefour/fid/android/domain/interactors/order/GetOrderOfflineListUseCase;", "b", "Lcom/carrefour/fid/android/domain/interactors/order/GetOrderOfflineListUseCase;", "getOrderOfflineListUseCase", "Lcom/carrefour/fid/android/presentation/ui/orders/offline/mapper/g;", "c", "Lcom/carrefour/fid/android/presentation/ui/orders/offline/mapper/g;", "ordersOfflineModelDataMapper", "Lcom/carrefour/fid/android/loyalty/core/datastore/LoyaltyPreferencesStorage;", "d", "Lcom/carrefour/fid/android/loyalty/core/datastore/LoyaltyPreferencesStorage;", "loyaltyPreferencesStorage", "Lcom/carrefour/fid/android/account/data/repositories/AccountRepository;", "e", "Lcom/carrefour/fid/android/account/data/repositories/AccountRepository;", "accountRepository", "Lcom/carrefour/fid/android/shared/base/u$c;", "f", "Lcom/carrefour/fid/android/shared/base/u$c;", "reducer", "Lkotlinx/coroutines/flow/j;", "Lcom/carrefour/fid/android/domain/models/OrdersPagingDomain;", "g", "Lkotlinx/coroutines/flow/j;", "pagingDomain", "h", "selectedLoyaltyCardNumber", "Lkotlinx/coroutines/CoroutineDispatcher;", "dispatcher", "<init>", "(Lcom/carrefour/fid/android/domain/interactors/loyalty/c;Lcom/carrefour/fid/android/domain/interactors/order/GetOrderOfflineListUseCase;Lcom/carrefour/fid/android/presentation/ui/orders/offline/mapper/g;Lcom/carrefour/fid/android/loyalty/core/datastore/LoyaltyPreferencesStorage;Lcom/carrefour/fid/android/account/data/repositories/AccountRepository;Lkotlinx/coroutines/CoroutineDispatcher;)V", "app_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
@C8567o(parameters = 0)
public final class OrderOfflineListViewModel extends BaseMVIViewModel<C26673b, C26675c> {

    /* renamed from: i */
    public static final int f65097i = 8;
    @C12579k

    /* renamed from: a */
    public final C37699c f65098a;
    @C12579k

    /* renamed from: b */
    public final GetOrderOfflineListUseCase f65099b;
    @C12579k

    /* renamed from: c */
    public final C24790g f65100c;
    @C12579k

    /* renamed from: d */
    public final LoyaltyPreferencesStorage f65101d;
    @C12579k

    /* renamed from: e */
    public final AccountRepository f65102e;
    @C12579k

    /* renamed from: f */
    public final C28505u.C28508c<C26673b, C26667a> f65103f = C26680d.f65133a;
    @C12579k

    /* renamed from: g */
    public final C11940j<OrdersPagingDomain> f65104g = C11953v.m47628a(null);
    @C12579k

    /* renamed from: h */
    public final C11940j<String> f65105h = C11953v.m47628a(null);

    /* renamed from: com.carrefour.fid.android.presentation.viewmodels.order.offline.OrderOfflineListViewModel$a */
    public interface C26667a extends C28505u.C28509d {

        /* renamed from: com.carrefour.fid.android.presentation.viewmodels.order.offline.OrderOfflineListViewModel$a$a */
        public static final class C26668a {
            @C11395k(level = DeprecationLevel.WARNING, message = "We should not be able to reset the current state. You should use [MVI.Event] instead.")
            @C12579k
            /* renamed from: a */
            public static C28505u.C28509d m113331a(@C12579k C26667a aVar) {
                return C28505u.C28509d.C28510a.m118428a(aVar);
            }
        }

        @C8567o(parameters = 0)
        /* renamed from: com.carrefour.fid.android.presentation.viewmodels.order.offline.OrderOfflineListViewModel$a$b */
        public static final class C26669b implements C26667a {

            /* renamed from: c */
            public static final int f65106c = 8;
            @C12579k

            /* renamed from: b */
            public final Throwable f65107b;

            public C26669b(@C12579k Throwable th) {
                Intrinsics.checkNotNullParameter(th, "throwable");
                this.f65107b = th;
            }

            /* renamed from: g */
            public static /* synthetic */ C26669b m113332g(C26669b bVar, Throwable th, int i, Object obj) {
                if ((i & 1) != 0) {
                    th = bVar.f65107b;
                }
                return bVar.mo77509f(th);
            }

            @C12579k
            /* renamed from: e */
            public final Throwable mo77507e() {
                return this.f65107b;
            }

            public boolean equals(@C12580l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C26669b) && Intrinsics.areEqual((Object) this.f65107b, (Object) ((C26669b) obj).f65107b);
            }

            @C12579k
            /* renamed from: f */
            public final C26669b mo77509f(@C12579k Throwable th) {
                Intrinsics.checkNotNullParameter(th, "throwable");
                return new C26669b(th);
            }

            @C12579k
            /* renamed from: h */
            public final Throwable mo77510h() {
                return this.f65107b;
            }

            public int hashCode() {
                return this.f65107b.hashCode();
            }

            @C11395k(level = DeprecationLevel.WARNING, message = "We should not be able to reset the current state. You should use [MVI.Event] instead.")
            @C12579k
            public C28505u.C28509d reset() {
                return C26668a.m113331a(this);
            }

            @C12579k
            public String toString() {
                Throwable th = this.f65107b;
                return "ErrorEvent(throwable=" + th + ")";
            }
        }

        @C8567o(parameters = 0)
        /* renamed from: com.carrefour.fid.android.presentation.viewmodels.order.offline.OrderOfflineListViewModel$a$c */
        public static final class C26670c implements C26667a {
            @C12579k

            /* renamed from: b */
            public static final C26670c f65108b = new C26670c();

            /* renamed from: c */
            public static final int f65109c = 0;

            @C11395k(level = DeprecationLevel.WARNING, message = "We should not be able to reset the current state. You should use [MVI.Event] instead.")
            @C12579k
            public C28505u.C28509d reset() {
                return C26668a.m113331a(this);
            }
        }

        @C8567o(parameters = 0)
        /* renamed from: com.carrefour.fid.android.presentation.viewmodels.order.offline.OrderOfflineListViewModel$a$d */
        public static final class C26671d implements C26667a {

            /* renamed from: d */
            public static final int f65110d = 8;
            @C12579k

            /* renamed from: b */
            public final List<String> f65111b;
            @C12579k

            /* renamed from: c */
            public final String f65112c;

            public C26671d(@C12579k List<String> list, @C12579k String str) {
                Intrinsics.checkNotNullParameter(list, "items");
                Intrinsics.checkNotNullParameter(str, "selectedCardNumber");
                this.f65111b = list;
                this.f65112c = str;
            }

            /* renamed from: h */
            public static /* synthetic */ C26671d m113336h(C26671d dVar, List<String> list, String str, int i, Object obj) {
                if ((i & 1) != 0) {
                    list = dVar.f65111b;
                }
                if ((i & 2) != 0) {
                    str = dVar.f65112c;
                }
                return dVar.mo77516g(list, str);
            }

            @C12579k
            /* renamed from: e */
            public final List<String> mo77513e() {
                return this.f65111b;
            }

            public boolean equals(@C12580l Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C26671d)) {
                    return false;
                }
                C26671d dVar = (C26671d) obj;
                return Intrinsics.areEqual((Object) this.f65111b, (Object) dVar.f65111b) && Intrinsics.areEqual((Object) this.f65112c, (Object) dVar.f65112c);
            }

            @C12579k
            /* renamed from: f */
            public final String mo77515f() {
                return this.f65112c;
            }

            @C12579k
            /* renamed from: g */
            public final C26671d mo77516g(@C12579k List<String> list, @C12579k String str) {
                Intrinsics.checkNotNullParameter(list, "items");
                Intrinsics.checkNotNullParameter(str, "selectedCardNumber");
                return new C26671d(list, str);
            }

            public int hashCode() {
                return (this.f65111b.hashCode() * 31) + this.f65112c.hashCode();
            }

            @C12579k
            /* renamed from: i */
            public final List<String> mo77518i() {
                return this.f65111b;
            }

            @C12579k
            /* renamed from: j */
            public final String mo77519j() {
                return this.f65112c;
            }

            @C11395k(level = DeprecationLevel.WARNING, message = "We should not be able to reset the current state. You should use [MVI.Event] instead.")
            @C12579k
            public C28505u.C28509d reset() {
                return C26668a.m113331a(this);
            }

            @C12579k
            public String toString() {
                List<String> list = this.f65111b;
                String str = this.f65112c;
                return "LoyaltyCardsList(items=" + list + ", selectedCardNumber=" + str + ")";
            }
        }

        @C8567o(parameters = 0)
        /* renamed from: com.carrefour.fid.android.presentation.viewmodels.order.offline.OrderOfflineListViewModel$a$e */
        public static final class C26672e implements C26667a {

            /* renamed from: d */
            public static final int f65113d = 8;
            @C12580l

            /* renamed from: b */
            public final List<C24803i> f65114b;

            /* renamed from: c */
            public final boolean f65115c;

            public C26672e(@C12580l List<C24803i> list, boolean z) {
                this.f65114b = list;
                this.f65115c = z;
            }

            /* renamed from: h */
            public static /* synthetic */ C26672e m113342h(C26672e eVar, List<C24803i> list, boolean z, int i, Object obj) {
                if ((i & 1) != 0) {
                    list = eVar.f65114b;
                }
                if ((i & 2) != 0) {
                    z = eVar.f65115c;
                }
                return eVar.mo77524g(list, z);
            }

            @C12580l
            /* renamed from: e */
            public final List<C24803i> mo77521e() {
                return this.f65114b;
            }

            public boolean equals(@C12580l Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C26672e)) {
                    return false;
                }
                C26672e eVar = (C26672e) obj;
                return Intrinsics.areEqual((Object) this.f65114b, (Object) eVar.f65114b) && this.f65115c == eVar.f65115c;
            }

            /* renamed from: f */
            public final boolean mo77523f() {
                return this.f65115c;
            }

            @C12579k
            /* renamed from: g */
            public final C26672e mo77524g(@C12580l List<C24803i> list, boolean z) {
                return new C26672e(list, z);
            }

            public int hashCode() {
                List<C24803i> list = this.f65114b;
                int hashCode = (list == null ? 0 : list.hashCode()) * 31;
                boolean z = this.f65115c;
                if (z) {
                    z = true;
                }
                return hashCode + (z ? 1 : 0);
            }

            /* renamed from: i */
            public final boolean mo77526i() {
                return this.f65115c;
            }

            @C12580l
            /* renamed from: j */
            public final List<C24803i> mo77527j() {
                return this.f65114b;
            }

            @C11395k(level = DeprecationLevel.WARNING, message = "We should not be able to reset the current state. You should use [MVI.Event] instead.")
            @C12579k
            public C28505u.C28509d reset() {
                return C26668a.m113331a(this);
            }

            @C12579k
            public String toString() {
                List<C24803i> list = this.f65114b;
                boolean z = this.f65115c;
                return "OfflineOrdersList(items=" + list + ", hasNextPage=" + z + ")";
            }
        }
    }

    @C8567o(parameters = 0)
    /* renamed from: com.carrefour.fid.android.presentation.viewmodels.order.offline.OrderOfflineListViewModel$b */
    public static final class C26673b implements C28505u.C28509d {
        @C12579k

        /* renamed from: h */
        public static final C26674a f65116h = new C26674a((DefaultConstructorMarker) null);

        /* renamed from: i */
        public static final int f65117i = 8;
        @C12579k

        /* renamed from: j */
        public static final C26673b f65118j = new C26673b((Throwable) null, false, (List) null, false, (List) null, (String) null, 63, (DefaultConstructorMarker) null);
        @C12580l

        /* renamed from: b */
        public final Throwable f65119b;

        /* renamed from: c */
        public final boolean f65120c;
        @C12580l

        /* renamed from: d */
        public final List<C24803i> f65121d;

        /* renamed from: e */
        public final boolean f65122e;
        @C12580l

        /* renamed from: f */
        public final List<String> f65123f;
        @C12580l

        /* renamed from: g */
        public final String f65124g;

        /* renamed from: com.carrefour.fid.android.presentation.viewmodels.order.offline.OrderOfflineListViewModel$b$a */
        public static final class C26674a {
            public /* synthetic */ C26674a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            @C12579k
            /* renamed from: a */
            public final C26673b mo77545a() {
                return C26673b.f65118j;
            }

            public C26674a() {
            }
        }

        public C26673b() {
            this((Throwable) null, false, (List) null, false, (List) null, (String) null, 63, (DefaultConstructorMarker) null);
        }

        /* renamed from: m */
        public static /* synthetic */ C26673b m113349m(C26673b bVar, Throwable th, boolean z, List<C24803i> list, boolean z2, List<String> list2, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                th = bVar.f65119b;
            }
            if ((i & 2) != 0) {
                z = bVar.f65120c;
            }
            boolean z3 = z;
            if ((i & 4) != 0) {
                list = bVar.f65121d;
            }
            List<C24803i> list3 = list;
            if ((i & 8) != 0) {
                z2 = bVar.f65122e;
            }
            boolean z4 = z2;
            if ((i & 16) != 0) {
                list2 = bVar.f65123f;
            }
            List<String> list4 = list2;
            if ((i & 32) != 0) {
                str = bVar.f65124g;
            }
            return bVar.mo77538l(th, z3, list3, z4, list4, str);
        }

        public boolean equals(@C12580l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C26673b)) {
                return false;
            }
            C26673b bVar = (C26673b) obj;
            return Intrinsics.areEqual((Object) this.f65119b, (Object) bVar.f65119b) && this.f65120c == bVar.f65120c && Intrinsics.areEqual((Object) this.f65121d, (Object) bVar.f65121d) && this.f65122e == bVar.f65122e && Intrinsics.areEqual((Object) this.f65123f, (Object) bVar.f65123f) && Intrinsics.areEqual((Object) this.f65124g, (Object) bVar.f65124g);
        }

        @C12580l
        /* renamed from: f */
        public final Throwable mo77530f() {
            return this.f65119b;
        }

        /* renamed from: g */
        public final boolean mo77531g() {
            return this.f65120c;
        }

        @C12580l
        /* renamed from: h */
        public final List<C24803i> mo77532h() {
            return this.f65121d;
        }

        public int hashCode() {
            Throwable th = this.f65119b;
            int i = 0;
            int hashCode = (th == null ? 0 : th.hashCode()) * 31;
            boolean z = this.f65120c;
            boolean z2 = true;
            if (z) {
                z = true;
            }
            int i2 = (hashCode + (z ? 1 : 0)) * 31;
            List<C24803i> list = this.f65121d;
            int hashCode2 = (i2 + (list == null ? 0 : list.hashCode())) * 31;
            boolean z3 = this.f65122e;
            if (!z3) {
                z2 = z3;
            }
            int i3 = (hashCode2 + (z2 ? 1 : 0)) * 31;
            List<String> list2 = this.f65123f;
            int hashCode3 = (i3 + (list2 == null ? 0 : list2.hashCode())) * 31;
            String str = this.f65124g;
            if (str != null) {
                i = str.hashCode();
            }
            return hashCode3 + i;
        }

        /* renamed from: i */
        public final boolean mo77534i() {
            return this.f65122e;
        }

        public final boolean isLoading() {
            return this.f65120c;
        }

        @C12580l
        /* renamed from: j */
        public final List<String> mo77536j() {
            return this.f65123f;
        }

        @C12580l
        /* renamed from: k */
        public final String mo77537k() {
            return this.f65124g;
        }

        @C12579k
        /* renamed from: l */
        public final C26673b mo77538l(@C12580l Throwable th, boolean z, @C12580l List<C24803i> list, boolean z2, @C12580l List<String> list2, @C12580l String str) {
            return new C26673b(th, z, list, z2, list2, str);
        }

        @C12580l
        /* renamed from: n */
        public final Throwable mo77539n() {
            return this.f65119b;
        }

        /* renamed from: o */
        public final boolean mo77540o() {
            return this.f65122e;
        }

        @C12580l
        /* renamed from: p */
        public final List<String> mo77541p() {
            return this.f65123f;
        }

        @C12580l
        /* renamed from: q */
        public final List<C24803i> mo77542q() {
            return this.f65121d;
        }

        @C12580l
        /* renamed from: r */
        public final String mo77543r() {
            return this.f65124g;
        }

        @C11395k(level = DeprecationLevel.WARNING, message = "We should not be able to reset the current state. You should use [MVI.Event] instead.")
        @C12579k
        public C28505u.C28509d reset() {
            return C28505u.C28509d.C28510a.m118428a(this);
        }

        @C12579k
        public String toString() {
            Throwable th = this.f65119b;
            boolean z = this.f65120c;
            List<C24803i> list = this.f65121d;
            boolean z2 = this.f65122e;
            List<String> list2 = this.f65123f;
            String str = this.f65124g;
            return "UIState(errorEvent=" + th + ", isLoading=" + z + ", offlineOrders=" + list + ", hasNextPage=" + z2 + ", loyaltyCards=" + list2 + ", selectedCardNumber=" + str + ")";
        }

        public C26673b(@C12580l Throwable th, boolean z, @C12580l List<C24803i> list, boolean z2, @C12580l List<String> list2, @C12580l String str) {
            this.f65119b = th;
            this.f65120c = z;
            this.f65121d = list;
            this.f65122e = z2;
            this.f65123f = list2;
            this.f65124g = str;
        }

        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public /* synthetic */ C26673b(java.lang.Throwable r6, boolean r7, java.util.List r8, boolean r9, java.util.List r10, java.lang.String r11, int r12, kotlin.jvm.internal.DefaultConstructorMarker r13) {
            /*
                r5 = this;
                r13 = r12 & 1
                r0 = 0
                if (r13 == 0) goto L_0x0007
                r13 = r0
                goto L_0x0008
            L_0x0007:
                r13 = r6
            L_0x0008:
                r6 = r12 & 2
                r1 = 0
                if (r6 == 0) goto L_0x000f
                r2 = r1
                goto L_0x0010
            L_0x000f:
                r2 = r7
            L_0x0010:
                r6 = r12 & 4
                if (r6 == 0) goto L_0x0016
                r3 = r0
                goto L_0x0017
            L_0x0016:
                r3 = r8
            L_0x0017:
                r6 = r12 & 8
                if (r6 == 0) goto L_0x001c
                goto L_0x001d
            L_0x001c:
                r1 = r9
            L_0x001d:
                r6 = r12 & 16
                if (r6 == 0) goto L_0x0023
                r4 = r0
                goto L_0x0024
            L_0x0023:
                r4 = r10
            L_0x0024:
                r6 = r12 & 32
                if (r6 == 0) goto L_0x002a
                r12 = r0
                goto L_0x002b
            L_0x002a:
                r12 = r11
            L_0x002b:
                r6 = r5
                r7 = r13
                r8 = r2
                r9 = r3
                r10 = r1
                r11 = r4
                r6.<init>(r7, r8, r9, r10, r11, r12)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.presentation.viewmodels.order.offline.OrderOfflineListViewModel.C26673b.<init>(java.lang.Throwable, boolean, java.util.List, boolean, java.util.List, java.lang.String, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
        }
    }

    /* renamed from: com.carrefour.fid.android.presentation.viewmodels.order.offline.OrderOfflineListViewModel$c */
    public interface C26675c extends C28505u.C28507b {

        @C8567o(parameters = 0)
        /* renamed from: com.carrefour.fid.android.presentation.viewmodels.order.offline.OrderOfflineListViewModel$c$a */
        public static final class C26676a implements C26675c {
            @C12579k

            /* renamed from: a */
            public static final C26676a f65125a = new C26676a();

            /* renamed from: b */
            public static final int f65126b = 0;
        }

        @C8567o(parameters = 0)
        /* renamed from: com.carrefour.fid.android.presentation.viewmodels.order.offline.OrderOfflineListViewModel$c$b */
        public static final class C26677b implements C26675c {
            @C12579k

            /* renamed from: a */
            public static final C26677b f65127a = new C26677b();

            /* renamed from: b */
            public static final int f65128b = 0;
        }

        @C8567o(parameters = 0)
        /* renamed from: com.carrefour.fid.android.presentation.viewmodels.order.offline.OrderOfflineListViewModel$c$c */
        public static final class C26678c implements C26675c {
            @C12579k

            /* renamed from: a */
            public static final C26678c f65129a = new C26678c();

            /* renamed from: b */
            public static final int f65130b = 0;
        }

        @C8567o(parameters = 0)
        /* renamed from: com.carrefour.fid.android.presentation.viewmodels.order.offline.OrderOfflineListViewModel$c$d */
        public static final class C26679d implements C26675c {

            /* renamed from: b */
            public static final int f65131b = 0;
            @C12579k

            /* renamed from: a */
            public final String f65132a;

            public C26679d(@C12579k String str) {
                Intrinsics.checkNotNullParameter(str, C28633g.f70218b);
                this.f65132a = str;
            }

            /* renamed from: c */
            public static /* synthetic */ C26679d m113363c(C26679d dVar, String str, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = dVar.f65132a;
                }
                return dVar.mo77547b(str);
            }

            @C12579k
            /* renamed from: a */
            public final String mo77546a() {
                return this.f65132a;
            }

            @C12579k
            /* renamed from: b */
            public final C26679d mo77547b(@C12579k String str) {
                Intrinsics.checkNotNullParameter(str, C28633g.f70218b);
                return new C26679d(str);
            }

            @C12579k
            /* renamed from: d */
            public final String mo77548d() {
                return this.f65132a;
            }

            public boolean equals(@C12580l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C26679d) && Intrinsics.areEqual((Object) this.f65132a, (Object) ((C26679d) obj).f65132a);
            }

            public int hashCode() {
                return this.f65132a.hashCode();
            }

            @C12579k
            public String toString() {
                String str = this.f65132a;
                return "SelectLoyaltyCard(cardNumber=" + str + ")";
            }
        }
    }

    /* renamed from: com.carrefour.fid.android.presentation.viewmodels.order.offline.OrderOfflineListViewModel$d */
    public static final class C26680d implements C28505u.C28508c<C26673b, C26667a> {

        /* renamed from: a */
        public static final C26680d f65133a = new C26680d();

        @C12579k
        /* renamed from: b */
        public final C26673b mo32307a(@C12579k C26673b bVar, @C12579k C26667a aVar) {
            C26667a aVar2 = aVar;
            C26673b bVar2 = bVar;
            Intrinsics.checkNotNullParameter(bVar2, "previousState");
            Intrinsics.checkNotNullParameter(aVar2, "partialState");
            C26673b m = C26673b.m113349m(bVar2, (Throwable) null, false, (List) null, false, (List) null, (String) null, 62, (Object) null);
            if (aVar2 instanceof C26667a.C26670c) {
                return new C26673b((Throwable) null, true, (List) null, false, (List) null, (String) null, 61, (DefaultConstructorMarker) null);
            }
            if (aVar2 instanceof C26667a.C26669b) {
                return C26673b.m113349m(m, ((C26667a.C26669b) aVar2).mo77510h(), false, (List) null, false, (List) null, (String) null, 60, (Object) null);
            }
            if (aVar2 instanceof C26667a.C26672e) {
                C26667a.C26672e eVar = (C26667a.C26672e) aVar2;
                return C26673b.m113349m(m, (Throwable) null, false, eVar.mo77527j(), eVar.mo77526i(), (List) null, (String) null, 49, (Object) null);
            } else if (aVar2 instanceof C26667a.C26671d) {
                C26667a.C26671d dVar = (C26667a.C26671d) aVar2;
                return C26673b.m113349m(m, (Throwable) null, false, (List) null, false, dVar.mo77518i(), dVar.mo77519j(), 15, (Object) null);
            } else {
                throw new NoWhenBranchMatchedException();
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @Inject
    public OrderOfflineListViewModel(@C12579k C37699c cVar, @C12579k GetOrderOfflineListUseCase getOrderOfflineListUseCase, @C12579k C24790g gVar, @C12579k LoyaltyPreferencesStorage loyaltyPreferencesStorage, @C12579k AccountRepository accountRepository, @C28672p @C12579k CoroutineDispatcher coroutineDispatcher) {
        super(C26673b.f65116h.mo77545a(), coroutineDispatcher, (C19456p0) null, 4, (DefaultConstructorMarker) null);
        Intrinsics.checkNotNullParameter(cVar, "getLoyaltyCardsUseCase");
        Intrinsics.checkNotNullParameter(getOrderOfflineListUseCase, "getOrderOfflineListUseCase");
        Intrinsics.checkNotNullParameter(gVar, "ordersOfflineModelDataMapper");
        Intrinsics.checkNotNullParameter(loyaltyPreferencesStorage, "loyaltyPreferencesStorage");
        Intrinsics.checkNotNullParameter(accountRepository, "accountRepository");
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "dispatcher");
        this.f65098a = cVar;
        this.f65099b = getOrderOfflineListUseCase;
        this.f65100c = gVar;
        this.f65101d = loyaltyPreferencesStorage;
        this.f65102e = accountRepository;
    }

    /* renamed from: j0 */
    public static /* synthetic */ Object m113321j0(OrderOfflineListViewModel orderOfflineListViewModel, boolean z, C11045c cVar, int i, Object obj) {
        if ((i & 1) != 0) {
            z = true;
        }
        return orderOfflineListViewModel.mo77498i0(z, cVar);
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0041  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x008a  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0096  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* renamed from: i0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo77498i0(boolean r9, kotlin.coroutines.C11045c<? super kotlin.C11079d2> r10) {
        /*
            r8 = this;
            boolean r0 = r10 instanceof com.carrefour.fid.android.presentation.viewmodels.order.offline.OrderOfflineListViewModel$fetchOfflineOrders$1
            if (r0 == 0) goto L_0x0013
            r0 = r10
            com.carrefour.fid.android.presentation.viewmodels.order.offline.OrderOfflineListViewModel$fetchOfflineOrders$1 r0 = (com.carrefour.fid.android.presentation.viewmodels.order.offline.OrderOfflineListViewModel$fetchOfflineOrders$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.carrefour.fid.android.presentation.viewmodels.order.offline.OrderOfflineListViewModel$fetchOfflineOrders$1 r0 = new com.carrefour.fid.android.presentation.viewmodels.order.offline.OrderOfflineListViewModel$fetchOfflineOrders$1
            r0.<init>(r8, r10)
        L_0x0018:
            java.lang.Object r10 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L_0x0041
            if (r2 != r3) goto L_0x0039
            boolean r9 = r0.Z$0
            java.lang.Object r1 = r0.L$1
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r0 = r0.L$0
            com.carrefour.fid.android.presentation.viewmodels.order.offline.OrderOfflineListViewModel r0 = (com.carrefour.fid.android.presentation.viewmodels.order.offline.OrderOfflineListViewModel) r0
            kotlin.C11661u0.m45747n(r10)
            kotlin.Result r10 = (kotlin.Result) r10
            java.lang.Object r10 = r10.mo21858l()
            goto L_0x0084
        L_0x0039:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L_0x0041:
            kotlin.C11661u0.m45747n(r10)
            kotlinx.coroutines.flow.j<java.lang.String> r10 = r8.f65105h
            java.lang.Object r10 = r10.getValue()
            java.lang.String r10 = (java.lang.String) r10
            if (r10 == 0) goto L_0x009e
            com.carrefour.fid.android.domain.interactors.order.GetOrderOfflineListUseCase r2 = r8.f65099b
            com.carrefour.fid.android.domain.interactors.order.GetOrderOfflineListUseCase$a r4 = new com.carrefour.fid.android.domain.interactors.order.GetOrderOfflineListUseCase$a
            kotlinx.coroutines.flow.j<com.carrefour.fid.android.domain.models.OrdersPagingDomain> r5 = r8.f65104g
            java.lang.Object r5 = r5.getValue()
            com.carrefour.fid.android.domain.models.OrdersPagingDomain r5 = (com.carrefour.fid.android.domain.models.OrdersPagingDomain) r5
            r6 = 0
            if (r5 == 0) goto L_0x0062
            java.lang.String r5 = r5.getScrollHash()
            goto L_0x0063
        L_0x0062:
            r5 = r6
        L_0x0063:
            kotlinx.coroutines.flow.j<com.carrefour.fid.android.domain.models.OrdersPagingDomain> r7 = r8.f65104g
            java.lang.Object r7 = r7.getValue()
            com.carrefour.fid.android.domain.models.OrdersPagingDomain r7 = (com.carrefour.fid.android.domain.models.OrdersPagingDomain) r7
            if (r7 == 0) goto L_0x0071
            java.lang.String r6 = r7.getScrollPaging()
        L_0x0071:
            r4.<init>(r10, r5, r6)
            r0.L$0 = r8
            r0.L$1 = r10
            r0.Z$0 = r9
            r0.label = r3
            java.lang.Object r10 = r2.m172979invokegIAlus(r4, r0)
            if (r10 != r1) goto L_0x0083
            return r1
        L_0x0083:
            r0 = r8
        L_0x0084:
            boolean r1 = kotlin.Result.m38710j(r10)
            if (r1 == 0) goto L_0x0090
            r1 = r10
            com.carrefour.fid.android.domain.models.OrdersOfflineResultDomain r1 = (com.carrefour.fid.android.domain.models.OrdersOfflineResultDomain) r1
            r0.mo77500l0(r1, r9)
        L_0x0090:
            java.lang.Throwable r9 = kotlin.Result.m38705e(r10)
            if (r9 == 0) goto L_0x009e
            com.carrefour.fid.android.presentation.viewmodels.order.offline.OrderOfflineListViewModel$a$b r10 = new com.carrefour.fid.android.presentation.viewmodels.order.offline.OrderOfflineListViewModel$a$b
            r10.<init>(r9)
            r0.mo77504p0(r10)
        L_0x009e:
            kotlin.d2 r9 = kotlin.C11079d2.f28267a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.presentation.viewmodels.order.offline.OrderOfflineListViewModel.mo77498i0(boolean, kotlin.coroutines.c):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0040  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x005a  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x005d  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x007f  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x0084  */
    /* JADX WARNING: Removed duplicated region for block: B:35:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    /* renamed from: k0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo77499k0(kotlin.coroutines.C11045c<? super java.lang.String> r8) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof com.carrefour.fid.android.presentation.viewmodels.order.offline.OrderOfflineListViewModel$getLoyaltyCardNumber$1
            if (r0 == 0) goto L_0x0013
            r0 = r8
            com.carrefour.fid.android.presentation.viewmodels.order.offline.OrderOfflineListViewModel$getLoyaltyCardNumber$1 r0 = (com.carrefour.fid.android.presentation.viewmodels.order.offline.OrderOfflineListViewModel$getLoyaltyCardNumber$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.carrefour.fid.android.presentation.viewmodels.order.offline.OrderOfflineListViewModel$getLoyaltyCardNumber$1 r0 = new com.carrefour.fid.android.presentation.viewmodels.order.offline.OrderOfflineListViewModel$getLoyaltyCardNumber$1
            r0.<init>(r7, r8)
        L_0x0018:
            java.lang.Object r8 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r2 = r0.label
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L_0x0040
            if (r2 == r4) goto L_0x0038
            if (r2 != r3) goto L_0x0030
            java.lang.Object r0 = r0.L$0
            java.lang.String r0 = (java.lang.String) r0
            kotlin.C11661u0.m45747n(r8)
            goto L_0x006d
        L_0x0030:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L_0x0038:
            java.lang.Object r2 = r0.L$0
            com.carrefour.fid.android.presentation.viewmodels.order.offline.OrderOfflineListViewModel r2 = (com.carrefour.fid.android.presentation.viewmodels.order.offline.OrderOfflineListViewModel) r2
            kotlin.C11661u0.m45747n(r8)
            goto L_0x0051
        L_0x0040:
            kotlin.C11661u0.m45747n(r8)
            com.carrefour.fid.android.loyalty.core.datastore.LoyaltyPreferencesStorage r8 = r7.f65101d
            r0.L$0 = r7
            r0.label = r4
            java.lang.Object r8 = r8.getLoyaltyCardNumber(r0)
            if (r8 != r1) goto L_0x0050
            return r1
        L_0x0050:
            r2 = r7
        L_0x0051:
            java.lang.String r8 = (java.lang.String) r8
            int r5 = r8.length()
            if (r5 != 0) goto L_0x005a
            goto L_0x005b
        L_0x005a:
            r4 = 0
        L_0x005b:
            if (r4 == 0) goto L_0x0085
            com.carrefour.fid.android.account.data.repositories.AccountRepository r2 = r2.f65102e
            r0.L$0 = r8
            r0.label = r3
            java.lang.Object r0 = r2.mo31329n(r0)
            if (r0 != r1) goto L_0x006a
            return r1
        L_0x006a:
            r6 = r0
            r0 = r8
            r8 = r6
        L_0x006d:
            com.carrefour.fid.android.domain.models.account.AccountInfo r8 = (com.carrefour.fid.android.domain.models.account.AccountInfo) r8
            if (r8 == 0) goto L_0x0084
            java.util.List r8 = r8.mo116669w()
            if (r8 == 0) goto L_0x0084
            com.carrefour.fid.android.loyalty.core.util.LoyaltyUtils r1 = com.carrefour.fid.android.loyalty.core.util.LoyaltyUtils.INSTANCE
            com.carrefour.fid.android.domain.models.account.UserCards r8 = r1.getMostRecentAndSecuredLoyaltyCard(r8)
            if (r8 == 0) goto L_0x0084
            java.lang.String r8 = r8.mo116763k()
            goto L_0x0085
        L_0x0084:
            r8 = r0
        L_0x0085:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.presentation.viewmodels.order.offline.OrderOfflineListViewModel.mo77499k0(kotlin.coroutines.c):java.lang.Object");
    }

    /* renamed from: l0 */
    public final void mo77500l0(OrdersOfflineResultDomain ordersOfflineResultDomain, boolean z) {
        boolean z2;
        this.f65104g.setValue(ordersOfflineResultDomain.getPagingData());
        if (!z) {
            List<C24803i> q = ((C26673b) getCurrentState()).mo77542q();
            List<R> b = this.f65100c.mo83406b(ordersOfflineResultDomain.getOrders());
            if (b == null) {
                b = CollectionsKt__CollectionsKt.m40441E();
            }
            if (q != null) {
                q.addAll(b);
            }
            mo77504p0(new C26667a.C26672e(q, mo77501m0(ordersOfflineResultDomain)));
            return;
        }
        Collection orders = ordersOfflineResultDomain.getOrders();
        if (orders == null || orders.isEmpty()) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2) {
            mo77504p0(new C26667a.C26669b(new EmptyListThrowable()));
            return;
        }
        List<R> b2 = this.f65100c.mo83406b(ordersOfflineResultDomain.getOrders());
        if (b2 == null) {
            b2 = CollectionsKt__CollectionsKt.m40441E();
        }
        mo77504p0(new C26667a.C26672e(CollectionsKt___CollectionsKt.m40572T5(b2), mo77501m0(ordersOfflineResultDomain)));
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x001e  */
    /* JADX WARNING: Removed duplicated region for block: B:24:? A[RETURN, SYNTHETIC] */
    /* renamed from: m0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo77501m0(com.carrefour.fid.android.domain.models.OrdersOfflineResultDomain r4) {
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
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.presentation.viewmodels.order.offline.OrderOfflineListViewModel.mo77501m0(com.carrefour.fid.android.domain.models.OrdersOfflineResultDomain):boolean");
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x005e  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x007c  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x008c  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x00b0 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00b1  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00b8  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x0101  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0027  */
    /* renamed from: n0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo77502n0(kotlin.coroutines.C11045c<? super kotlin.C11079d2> r10) {
        /*
            r9 = this;
            boolean r0 = r10 instanceof com.carrefour.fid.android.presentation.viewmodels.order.offline.OrderOfflineListViewModel$initOfflineOrders$1
            if (r0 == 0) goto L_0x0013
            r0 = r10
            com.carrefour.fid.android.presentation.viewmodels.order.offline.OrderOfflineListViewModel$initOfflineOrders$1 r0 = (com.carrefour.fid.android.presentation.viewmodels.order.offline.OrderOfflineListViewModel$initOfflineOrders$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.carrefour.fid.android.presentation.viewmodels.order.offline.OrderOfflineListViewModel$initOfflineOrders$1 r0 = new com.carrefour.fid.android.presentation.viewmodels.order.offline.OrderOfflineListViewModel$initOfflineOrders$1
            r0.<init>(r9, r10)
        L_0x0018:
            java.lang.Object r10 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r2 = r0.label
            r3 = 4
            r4 = 3
            r5 = 2
            r6 = 1
            r7 = 0
            if (r2 == 0) goto L_0x005e
            if (r2 == r6) goto L_0x0056
            if (r2 == r5) goto L_0x004a
            if (r2 == r4) goto L_0x003c
            if (r2 != r3) goto L_0x0034
            kotlin.C11661u0.m45747n(r10)
            goto L_0x0109
        L_0x0034:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r0)
            throw r10
        L_0x003c:
            java.lang.Object r2 = r0.L$0
            com.carrefour.fid.android.presentation.viewmodels.order.offline.OrderOfflineListViewModel r2 = (com.carrefour.fid.android.presentation.viewmodels.order.offline.OrderOfflineListViewModel) r2
            kotlin.C11661u0.m45747n(r10)
            kotlin.Result r10 = (kotlin.Result) r10
            java.lang.Object r10 = r10.mo21858l()
            goto L_0x00b2
        L_0x004a:
            java.lang.Object r2 = r0.L$1
            com.carrefour.fid.android.domain.interactors.loyalty.c r2 = (com.carrefour.fid.android.domain.interactors.loyalty.C37699c) r2
            java.lang.Object r5 = r0.L$0
            com.carrefour.fid.android.presentation.viewmodels.order.offline.OrderOfflineListViewModel r5 = (com.carrefour.fid.android.presentation.viewmodels.order.offline.OrderOfflineListViewModel) r5
            kotlin.C11661u0.m45747n(r10)
            goto L_0x00a4
        L_0x0056:
            java.lang.Object r2 = r0.L$0
            com.carrefour.fid.android.presentation.viewmodels.order.offline.OrderOfflineListViewModel r2 = (com.carrefour.fid.android.presentation.viewmodels.order.offline.OrderOfflineListViewModel) r2
            kotlin.C11661u0.m45747n(r10)
            goto L_0x0074
        L_0x005e:
            kotlin.C11661u0.m45747n(r10)
            kotlinx.coroutines.flow.j<com.carrefour.fid.android.domain.models.OrdersPagingDomain> r10 = r9.f65104g
            r10.setValue(r7)
            com.carrefour.fid.android.loyalty.core.datastore.LoyaltyPreferencesStorage r10 = r9.f65101d
            r0.L$0 = r9
            r0.label = r6
            java.lang.Object r10 = r10.hasLoyaltyCard(r0)
            if (r10 != r1) goto L_0x0073
            return r1
        L_0x0073:
            r2 = r9
        L_0x0074:
            java.lang.Boolean r10 = (java.lang.Boolean) r10
            boolean r10 = r10.booleanValue()
            if (r10 != 0) goto L_0x008c
            com.carrefour.fid.android.presentation.viewmodels.order.offline.OrderOfflineListViewModel$a$b r10 = new com.carrefour.fid.android.presentation.viewmodels.order.offline.OrderOfflineListViewModel$a$b
            com.carrefour.fid.android.shared.io.EmptyListThrowable r0 = new com.carrefour.fid.android.shared.io.EmptyListThrowable
            r0.<init>()
            r10.<init>(r0)
            r2.mo77504p0(r10)
            kotlin.d2 r10 = kotlin.C11079d2.f28267a
            return r10
        L_0x008c:
            com.carrefour.fid.android.presentation.viewmodels.order.offline.OrderOfflineListViewModel$a$c r10 = com.carrefour.fid.android.presentation.viewmodels.order.offline.OrderOfflineListViewModel.C26667a.C26670c.f65108b
            r2.mo77504p0(r10)
            com.carrefour.fid.android.domain.interactors.loyalty.c r10 = r2.f65098a
            r0.L$0 = r2
            r0.L$1 = r10
            r0.label = r5
            java.lang.Object r5 = r2.mo77499k0(r0)
            if (r5 != r1) goto L_0x00a0
            return r1
        L_0x00a0:
            r8 = r2
            r2 = r10
            r10 = r5
            r5 = r8
        L_0x00a4:
            r0.L$0 = r5
            r0.L$1 = r7
            r0.label = r4
            java.lang.Object r10 = r2.m172966invokegIAlus(r10, r0)
            if (r10 != r1) goto L_0x00b1
            return r1
        L_0x00b1:
            r2 = r5
        L_0x00b2:
            java.lang.Throwable r4 = kotlin.Result.m38705e(r10)
            if (r4 != 0) goto L_0x0101
            java.util.List r10 = (java.util.List) r10
            kotlinx.coroutines.flow.j<java.lang.String> r4 = r2.f65105h
            java.lang.Object r4 = r4.getValue()
            if (r4 == 0) goto L_0x00e2
            r4 = r10
            java.lang.Iterable r4 = (java.lang.Iterable) r4
            kotlinx.coroutines.flow.j<java.lang.String> r5 = r2.f65105h
            java.lang.Object r5 = r5.getValue()
            boolean r4 = kotlin.collections.CollectionsKt___CollectionsKt.m40558R1(r4, r5)
            if (r4 == 0) goto L_0x00e2
            kotlinx.coroutines.flow.j<java.lang.String> r4 = r2.f65105h
            java.lang.Object r4 = r4.getValue()
            java.lang.String r4 = (java.lang.String) r4
            if (r4 != 0) goto L_0x00e8
            java.lang.Object r4 = kotlin.collections.CollectionsKt___CollectionsKt.m40706w2(r10)
            java.lang.String r4 = (java.lang.String) r4
            goto L_0x00e8
        L_0x00e2:
            java.lang.Object r4 = kotlin.collections.CollectionsKt___CollectionsKt.m40706w2(r10)
            java.lang.String r4 = (java.lang.String) r4
        L_0x00e8:
            com.carrefour.fid.android.presentation.viewmodels.order.offline.OrderOfflineListViewModel$a$d r5 = new com.carrefour.fid.android.presentation.viewmodels.order.offline.OrderOfflineListViewModel$a$d
            r5.<init>(r10, r4)
            r2.mo77504p0(r5)
            kotlinx.coroutines.flow.j<java.lang.String> r10 = r2.f65105h
            r10.setValue(r4)
            r0.L$0 = r7
            r0.label = r3
            r10 = 0
            java.lang.Object r10 = m113321j0(r2, r10, r0, r6, r7)
            if (r10 != r1) goto L_0x0109
            return r1
        L_0x0101:
            com.carrefour.fid.android.presentation.viewmodels.order.offline.OrderOfflineListViewModel$a$b r10 = new com.carrefour.fid.android.presentation.viewmodels.order.offline.OrderOfflineListViewModel$a$b
            r10.<init>(r4)
            r2.mo77504p0(r10)
        L_0x0109:
            kotlin.d2 r10 = kotlin.C11079d2.f28267a
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.presentation.viewmodels.order.offline.OrderOfflineListViewModel.mo77502n0(kotlin.coroutines.c):java.lang.Object");
    }

    @C12580l
    /* renamed from: o0 */
    public Object processIntent(@C12579k C26675c cVar, @C12579k C11045c<? super C11079d2> cVar2) {
        if (Intrinsics.areEqual((Object) cVar, (Object) C26675c.C26676a.f65125a)) {
            Object n0 = mo77502n0(cVar2);
            if (n0 == C11063b.m42612h()) {
                return n0;
            }
            return C11079d2.f28267a;
        } else if (Intrinsics.areEqual((Object) cVar, (Object) C26675c.C26677b.f65127a)) {
            Object i0 = mo77498i0(false, cVar2);
            if (i0 == C11063b.m42612h()) {
                return i0;
            }
            return C11079d2.f28267a;
        } else if (Intrinsics.areEqual((Object) cVar, (Object) C26675c.C26678c.f65129a)) {
            Object q0 = mo77505q0(cVar2);
            if (q0 == C11063b.m42612h()) {
                return q0;
            }
            return C11079d2.f28267a;
        } else if (!(cVar instanceof C26675c.C26679d)) {
            return C11079d2.f28267a;
        } else {
            Object r0 = mo77506r0(((C26675c.C26679d) cVar).mo77548d(), cVar2);
            if (r0 == C11063b.m42612h()) {
                return r0;
            }
            return C11079d2.f28267a;
        }
    }

    /* renamed from: p0 */
    public final void mo77504p0(C26667a aVar) {
        reduceAndPublishState(this.f65103f, aVar);
    }

    /* renamed from: q0 */
    public final Object mo77505q0(C11045c<? super C11079d2> cVar) {
        if (this.f65105h.getValue() != null) {
            this.f65104g.setValue(null);
            mo77504p0(C26667a.C26670c.f65108b);
            Object j0 = m113321j0(this, false, cVar, 1, (Object) null);
            if (j0 == C11063b.m42612h()) {
                return j0;
            }
            return C11079d2.f28267a;
        }
        Object n0 = mo77502n0(cVar);
        if (n0 == C11063b.m42612h()) {
            return n0;
        }
        return C11079d2.f28267a;
    }

    /* renamed from: r0 */
    public final Object mo77506r0(String str, C11045c<? super C11079d2> cVar) {
        if (Intrinsics.areEqual((Object) this.f65105h.getValue(), (Object) str)) {
            return C11079d2.f28267a;
        }
        this.f65104g.setValue(null);
        this.f65105h.setValue(str);
        mo77504p0(C26667a.C26670c.f65108b);
        Object j0 = m113321j0(this, false, cVar, 1, (Object) null);
        if (j0 == C11063b.m42612h()) {
            return j0;
        }
        return C11079d2.f28267a;
    }
}
