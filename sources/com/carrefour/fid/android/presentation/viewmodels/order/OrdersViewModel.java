package com.carrefour.fid.android.presentation.viewmodels.order;

import androidx.compose.runtime.internal.C8567o;
import androidx.lifecycle.C19456p0;
import com.carrefour.fid.android.data.managers.ClearAppManager;
import com.carrefour.fid.android.shared.base.BaseMVIViewModel;
import com.carrefour.fid.android.shared.base.C28505u;
import dagger.hilt.android.lifecycle.C10245a;
import javax.inject.Inject;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.C11395k;
import kotlin.DeprecationLevel;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.intrinsics.C11063b;
import kotlin.coroutines.jvm.internal.C11064a;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineDispatcher;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C10245a
@C11076d0(mo22515d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0002\t\u000eB\u0011\b\u0007\u0012\u0006\u0010\u000b\u001a\u00020\b¢\u0006\u0004\b\f\u0010\rJ\u001b\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H@ø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0007R\u0014\u0010\u000b\u001a\u00020\b8\u0002X\u0004¢\u0006\u0006\n\u0004\b\t\u0010\n\u0002\u0004\n\u0002\b\u0019¨\u0006\u000f"}, mo22516d2 = {"Lcom/carrefour/fid/android/presentation/viewmodels/order/OrdersViewModel;", "Lcom/carrefour/fid/android/shared/base/BaseMVIViewModel;", "Lcom/carrefour/fid/android/presentation/viewmodels/order/OrdersViewModel$a;", "Lcom/carrefour/fid/android/presentation/viewmodels/order/OrdersViewModel$b;", "intent", "Lkotlin/d2;", "d0", "(Lcom/carrefour/fid/android/presentation/viewmodels/order/OrdersViewModel$b;Lkotlin/coroutines/c;)Ljava/lang/Object;", "Lcom/carrefour/fid/android/data/managers/ClearAppManager;", "a", "Lcom/carrefour/fid/android/data/managers/ClearAppManager;", "clearAppManager", "<init>", "(Lcom/carrefour/fid/android/data/managers/ClearAppManager;)V", "b", "app_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
@C8567o(parameters = 0)
public final class OrdersViewModel extends BaseMVIViewModel<C26639a, C26640b> {

    /* renamed from: b */
    public static final int f65051b = 8;
    @C12579k

    /* renamed from: a */
    public final ClearAppManager f65052a;

    @C8567o(parameters = 0)
    /* renamed from: com.carrefour.fid.android.presentation.viewmodels.order.OrdersViewModel$a */
    public static final class C26639a implements C28505u.C28509d {

        /* renamed from: c */
        public static final int f65053c = 0;
        @C12580l

        /* renamed from: b */
        public final Integer f65054b;

        public C26639a() {
            this((Integer) null, 1, (DefaultConstructorMarker) null);
        }

        /* renamed from: g */
        public static /* synthetic */ C26639a m113238g(C26639a aVar, Integer num, int i, Object obj) {
            if ((i & 1) != 0) {
                num = aVar.f65054b;
            }
            return aVar.mo77407f(num);
        }

        @C12580l
        /* renamed from: e */
        public final Integer mo77405e() {
            return this.f65054b;
        }

        public boolean equals(@C12580l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C26639a) && Intrinsics.areEqual((Object) this.f65054b, (Object) ((C26639a) obj).f65054b);
        }

        @C12579k
        /* renamed from: f */
        public final C26639a mo77407f(@C12580l Integer num) {
            return new C26639a(num);
        }

        @C12580l
        /* renamed from: h */
        public final Integer mo77408h() {
            return this.f65054b;
        }

        public int hashCode() {
            Integer num = this.f65054b;
            if (num == null) {
                return 0;
            }
            return num.hashCode();
        }

        @C11395k(level = DeprecationLevel.WARNING, message = "We should not be able to reset the current state. You should use [MVI.Event] instead.")
        @C12579k
        public C28505u.C28509d reset() {
            return C28505u.C28509d.C28510a.m118428a(this);
        }

        @C12579k
        public String toString() {
            Integer num = this.f65054b;
            return "UiState(selectedTab=" + num + ")";
        }

        public C26639a(@C12580l Integer num) {
            this.f65054b = num;
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ C26639a(Integer num, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : num);
        }
    }

    @C8567o(parameters = 0)
    /* renamed from: com.carrefour.fid.android.presentation.viewmodels.order.OrdersViewModel$b */
    public static abstract class C26640b implements C28505u.C28507b {

        /* renamed from: a */
        public static final int f65055a = 0;

        @C8567o(parameters = 0)
        /* renamed from: com.carrefour.fid.android.presentation.viewmodels.order.OrdersViewModel$b$a */
        public static final class C26641a extends C26640b {

            /* renamed from: c */
            public static final int f65056c = 0;

            /* renamed from: b */
            public final int f65057b;

            public C26641a(int i) {
                super((DefaultConstructorMarker) null);
                this.f65057b = i;
            }

            /* renamed from: c */
            public static /* synthetic */ C26641a m113242c(C26641a aVar, int i, int i2, Object obj) {
                if ((i2 & 1) != 0) {
                    i = aVar.f65057b;
                }
                return aVar.mo77412b(i);
            }

            /* renamed from: a */
            public final int mo77411a() {
                return this.f65057b;
            }

            @C12579k
            /* renamed from: b */
            public final C26641a mo77412b(int i) {
                return new C26641a(i);
            }

            /* renamed from: d */
            public final int mo77413d() {
                return this.f65057b;
            }

            public boolean equals(@C12580l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C26641a) && this.f65057b == ((C26641a) obj).f65057b;
            }

            public int hashCode() {
                return Integer.hashCode(this.f65057b);
            }

            @C12579k
            public String toString() {
                int i = this.f65057b;
                return "ChangeSelectedTab(selectedTab=" + i + ")";
            }
        }

        @C8567o(parameters = 0)
        /* renamed from: com.carrefour.fid.android.presentation.viewmodels.order.OrdersViewModel$b$b */
        public static final class C26642b extends C26640b {
            @C12579k

            /* renamed from: b */
            public static final C26642b f65058b = new C26642b();

            /* renamed from: c */
            public static final int f65059c = 0;

            public C26642b() {
                super((DefaultConstructorMarker) null);
            }
        }

        public /* synthetic */ C26640b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public C26640b() {
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @Inject
    public OrdersViewModel(@C12579k ClearAppManager clearAppManager) {
        super(new C26639a((Integer) null, 1, (DefaultConstructorMarker) null), (CoroutineDispatcher) null, (C19456p0) null, 6, (DefaultConstructorMarker) null);
        Intrinsics.checkNotNullParameter(clearAppManager, "clearAppManager");
        this.f65052a = clearAppManager;
    }

    @C12580l
    /* renamed from: d0 */
    public Object processIntent(@C12579k C26640b bVar, @C12579k C11045c<? super C11079d2> cVar) {
        if (bVar instanceof C26640b.C26641a) {
            Integer h = ((C26639a) getCurrentState()).mo77408h();
            C26640b.C26641a aVar = (C26640b.C26641a) bVar;
            int d = aVar.mo77413d();
            if (h == null || h.intValue() != d) {
                publishState(new C26639a(C11064a.m42620f(aVar.mo77413d())));
            }
        } else if (Intrinsics.areEqual((Object) bVar, (Object) C26640b.C26642b.f65058b)) {
            Object a = this.f65052a.mo111416a(cVar);
            if (a == C11063b.m42612h()) {
                return a;
            }
            return C11079d2.f28267a;
        }
        return C11079d2.f28267a;
    }
}
