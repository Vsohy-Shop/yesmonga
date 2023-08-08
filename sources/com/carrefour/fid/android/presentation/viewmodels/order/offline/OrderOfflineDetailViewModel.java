package com.carrefour.fid.android.presentation.viewmodels.order.offline;

import androidx.compose.runtime.internal.C8567o;
import androidx.lifecycle.C19456p0;
import com.carrefour.fid.android.domain.interactors.order.DownloadOrderBillAndBankReceiptOfflineUseCase;
import com.carrefour.fid.android.domain.interactors.order.GetOrderOfflineDetailUseCase;
import com.carrefour.fid.android.domain.interactors.remoteconfig.C37807b;
import com.carrefour.fid.android.presentation.p035ui.orders.offline.mapper.C24782a;
import com.carrefour.fid.android.presentation.p035ui.orders.offline.model.C24798d;
import com.carrefour.fid.android.presentation.p035ui.orders.offline.model.OrderDetailParam;
import com.carrefour.fid.android.shared.base.BaseMVIViewModel;
import com.carrefour.fid.android.shared.base.C28505u;
import dagger.hilt.android.lifecycle.C10245a;
import java.util.List;
import javax.inject.Inject;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.C11395k;
import kotlin.DeprecationLevel;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.intrinsics.C11063b;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineDispatcher;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C10245a
@C11076d0(mo22515d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0004\u0015\u0019\u001d!B)\b\u0007\u0012\u0006\u0010\u0017\u001a\u00020\u0014\u0012\u0006\u0010\u001b\u001a\u00020\u0018\u0012\u0006\u0010\u001f\u001a\u00020\u001c\u0012\u0006\u0010#\u001a\u00020 ¢\u0006\u0004\b(\u0010)J\u001b\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H@ø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0007J\u001b\u0010\n\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\bH@ø\u0001\u0000¢\u0006\u0004\b\n\u0010\u000bJ\u0013\u0010\f\u001a\u00020\u0005H@ø\u0001\u0000¢\u0006\u0004\b\f\u0010\rJ\u001b\u0010\u000f\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\bH@ø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\u000bJ\u001b\u0010\u0010\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\bH@ø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u000bJ\u0010\u0010\u0013\u001a\u00020\u00052\u0006\u0010\u0012\u001a\u00020\u0011H\u0002R\u0014\u0010\u0017\u001a\u00020\u00148\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\u001b\u001a\u00020\u00188\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001f\u001a\u00020\u001c8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0014\u0010#\u001a\u00020 8\u0002X\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R \u0010'\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00110$8\u0002X\u0004¢\u0006\u0006\n\u0004\b%\u0010&\u0002\u0004\n\u0002\b\u0019¨\u0006*"}, mo22516d2 = {"Lcom/carrefour/fid/android/presentation/viewmodels/order/offline/OrderOfflineDetailViewModel;", "Lcom/carrefour/fid/android/shared/base/BaseMVIViewModel;", "Lcom/carrefour/fid/android/presentation/viewmodels/order/offline/OrderOfflineDetailViewModel$b;", "Lcom/carrefour/fid/android/presentation/viewmodels/order/offline/OrderOfflineDetailViewModel$d;", "intent", "Lkotlin/d2;", "l0", "(Lcom/carrefour/fid/android/presentation/viewmodels/order/offline/OrderOfflineDetailViewModel$d;Lkotlin/coroutines/c;)Ljava/lang/Object;", "Lcom/carrefour/fid/android/presentation/ui/orders/offline/model/OrderDetailParam;", "orderDetailsParam", "k0", "(Lcom/carrefour/fid/android/presentation/ui/orders/offline/model/OrderDetailParam;Lkotlin/coroutines/c;)Ljava/lang/Object;", "h0", "(Lkotlin/coroutines/c;)Ljava/lang/Object;", "param", "j0", "i0", "Lcom/carrefour/fid/android/presentation/viewmodels/order/offline/OrderOfflineDetailViewModel$a;", "partialState", "m0", "Lcom/carrefour/fid/android/domain/interactors/order/GetOrderOfflineDetailUseCase;", "a", "Lcom/carrefour/fid/android/domain/interactors/order/GetOrderOfflineDetailUseCase;", "orderOfflineDetailUseCase", "Lcom/carrefour/fid/android/domain/interactors/remoteconfig/b;", "b", "Lcom/carrefour/fid/android/domain/interactors/remoteconfig/b;", "checkRemoteConfigUseCase", "Lcom/carrefour/fid/android/domain/interactors/order/DownloadOrderBillAndBankReceiptOfflineUseCase;", "c", "Lcom/carrefour/fid/android/domain/interactors/order/DownloadOrderBillAndBankReceiptOfflineUseCase;", "downloadOrderBillAndBankReceiptOfflineUseCase", "Lcom/carrefour/fid/android/presentation/ui/orders/offline/mapper/a;", "d", "Lcom/carrefour/fid/android/presentation/ui/orders/offline/mapper/a;", "ordersOfflineDetailsModelDataMapper", "Lcom/carrefour/fid/android/shared/base/u$c;", "e", "Lcom/carrefour/fid/android/shared/base/u$c;", "reducer", "<init>", "(Lcom/carrefour/fid/android/domain/interactors/order/GetOrderOfflineDetailUseCase;Lcom/carrefour/fid/android/domain/interactors/remoteconfig/b;Lcom/carrefour/fid/android/domain/interactors/order/DownloadOrderBillAndBankReceiptOfflineUseCase;Lcom/carrefour/fid/android/presentation/ui/orders/offline/mapper/a;)V", "app_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
@C8567o(parameters = 0)
@C11363r0({"SMAP\nOrderOfflineDetailViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OrderOfflineDetailViewModel.kt\ncom/carrefour/fid/android/presentation/viewmodels/order/offline/OrderOfflineDetailViewModel\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,156:1\n800#2,11:157\n*S KotlinDebug\n*F\n+ 1 OrderOfflineDetailViewModel.kt\ncom/carrefour/fid/android/presentation/viewmodels/order/offline/OrderOfflineDetailViewModel\n*L\n104#1:157,11\n*E\n"})
public final class OrderOfflineDetailViewModel extends BaseMVIViewModel<C26653b, C26661d> {

    /* renamed from: f */
    public static final int f65062f = 8;
    @C12579k

    /* renamed from: a */
    public final GetOrderOfflineDetailUseCase f65063a;
    @C12579k

    /* renamed from: b */
    public final C37807b f65064b;
    @C12579k

    /* renamed from: c */
    public final DownloadOrderBillAndBankReceiptOfflineUseCase f65065c;
    @C12579k

    /* renamed from: d */
    public final C24782a f65066d;
    @C12579k

    /* renamed from: e */
    public final C28505u.C28508c<C26653b, C26649a> f65067e = C26666e.f65096a;

    /* renamed from: com.carrefour.fid.android.presentation.viewmodels.order.offline.OrderOfflineDetailViewModel$a */
    public interface C26649a extends C28505u.C28509d {

        /* renamed from: com.carrefour.fid.android.presentation.viewmodels.order.offline.OrderOfflineDetailViewModel$a$a */
        public static final class C26650a {
            @C11395k(level = DeprecationLevel.WARNING, message = "We should not be able to reset the current state. You should use [MVI.Event] instead.")
            @C12579k
            /* renamed from: a */
            public static C28505u.C28509d m113265a(@C12579k C26649a aVar) {
                return C28505u.C28509d.C28510a.m118428a(aVar);
            }
        }

        @C8567o(parameters = 0)
        /* renamed from: com.carrefour.fid.android.presentation.viewmodels.order.offline.OrderOfflineDetailViewModel$a$b */
        public static final class C26651b implements C26649a {

            /* renamed from: c */
            public static final int f65068c = 0;

            /* renamed from: b */
            public final boolean f65069b;

            public C26651b(boolean z) {
                this.f65069b = z;
            }

            /* renamed from: g */
            public static /* synthetic */ C26651b m113266g(C26651b bVar, boolean z, int i, Object obj) {
                if ((i & 1) != 0) {
                    z = bVar.f65069b;
                }
                return bVar.mo77428f(z);
            }

            /* renamed from: e */
            public final boolean mo77426e() {
                return this.f65069b;
            }

            public boolean equals(@C12580l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C26651b) && this.f65069b == ((C26651b) obj).f65069b;
            }

            @C12579k
            /* renamed from: f */
            public final C26651b mo77428f(boolean z) {
                return new C26651b(z);
            }

            public int hashCode() {
                boolean z = this.f65069b;
                if (z) {
                    return 1;
                }
                return z ? 1 : 0;
            }

            public final boolean isLoading() {
                return this.f65069b;
            }

            @C11395k(level = DeprecationLevel.WARNING, message = "We should not be able to reset the current state. You should use [MVI.Event] instead.")
            @C12579k
            public C28505u.C28509d reset() {
                return C26650a.m113265a(this);
            }

            @C12579k
            public String toString() {
                boolean z = this.f65069b;
                return "Loading(isLoading=" + z + ")";
            }
        }

        @C8567o(parameters = 0)
        /* renamed from: com.carrefour.fid.android.presentation.viewmodels.order.offline.OrderOfflineDetailViewModel$a$c */
        public static final class C26652c implements C26649a {

            /* renamed from: c */
            public static final int f65070c = 8;
            @C12580l

            /* renamed from: b */
            public final List<C24798d> f65071b;

            public C26652c(@C12580l List<? extends C24798d> list) {
                this.f65071b = list;
            }

            /* renamed from: g */
            public static /* synthetic */ C26652c m113269g(C26652c cVar, List<C24798d> list, int i, Object obj) {
                if ((i & 1) != 0) {
                    list = cVar.f65071b;
                }
                return cVar.mo77434f(list);
            }

            @C12580l
            /* renamed from: e */
            public final List<C24798d> mo77432e() {
                return this.f65071b;
            }

            public boolean equals(@C12580l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C26652c) && Intrinsics.areEqual((Object) this.f65071b, (Object) ((C26652c) obj).f65071b);
            }

            @C12579k
            /* renamed from: f */
            public final C26652c mo77434f(@C12580l List<? extends C24798d> list) {
                return new C26652c(list);
            }

            @C12580l
            /* renamed from: h */
            public final List<C24798d> mo77435h() {
                return this.f65071b;
            }

            public int hashCode() {
                List<C24798d> list = this.f65071b;
                if (list == null) {
                    return 0;
                }
                return list.hashCode();
            }

            @C11395k(level = DeprecationLevel.WARNING, message = "We should not be able to reset the current state. You should use [MVI.Event] instead.")
            @C12579k
            public C28505u.C28509d reset() {
                return C26650a.m113265a(this);
            }

            @C12579k
            public String toString() {
                List<C24798d> list = this.f65071b;
                return "OfflineOrderDetails(items=" + list + ")";
            }
        }
    }

    @C8567o(parameters = 0)
    /* renamed from: com.carrefour.fid.android.presentation.viewmodels.order.offline.OrderOfflineDetailViewModel$b */
    public static final class C26653b implements C28505u.C28509d {
        @C12579k

        /* renamed from: d */
        public static final C26654a f65072d = new C26654a((DefaultConstructorMarker) null);

        /* renamed from: e */
        public static final int f65073e = 8;
        @C12579k

        /* renamed from: f */
        public static final C26653b f65074f = new C26653b(false, (List) null, 3, (DefaultConstructorMarker) null);

        /* renamed from: b */
        public final boolean f65075b;
        @C12580l

        /* renamed from: c */
        public final List<C24798d> f65076c;

        /* renamed from: com.carrefour.fid.android.presentation.viewmodels.order.offline.OrderOfflineDetailViewModel$b$a */
        public static final class C26654a {
            public /* synthetic */ C26654a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            @C12579k
            /* renamed from: a */
            public final C26653b mo77446a() {
                return C26653b.f65074f;
            }

            public C26654a() {
            }
        }

        public C26653b() {
            this(false, (List) null, 3, (DefaultConstructorMarker) null);
        }

        /* renamed from: i */
        public static /* synthetic */ C26653b m113274i(C26653b bVar, boolean z, List<C24798d> list, int i, Object obj) {
            if ((i & 1) != 0) {
                z = bVar.f65075b;
            }
            if ((i & 2) != 0) {
                list = bVar.f65076c;
            }
            return bVar.mo77441h(z, list);
        }

        public boolean equals(@C12580l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C26653b)) {
                return false;
            }
            C26653b bVar = (C26653b) obj;
            return this.f65075b == bVar.f65075b && Intrinsics.areEqual((Object) this.f65076c, (Object) bVar.f65076c);
        }

        /* renamed from: f */
        public final boolean mo77439f() {
            return this.f65075b;
        }

        @C12580l
        /* renamed from: g */
        public final List<C24798d> mo77440g() {
            return this.f65076c;
        }

        @C12579k
        /* renamed from: h */
        public final C26653b mo77441h(boolean z, @C12580l List<? extends C24798d> list) {
            return new C26653b(z, list);
        }

        public int hashCode() {
            boolean z = this.f65075b;
            if (z) {
                z = true;
            }
            int i = (z ? 1 : 0) * true;
            List<C24798d> list = this.f65076c;
            return i + (list == null ? 0 : list.hashCode());
        }

        public final boolean isLoading() {
            return this.f65075b;
        }

        @C12580l
        /* renamed from: j */
        public final List<C24798d> mo77444j() {
            return this.f65076c;
        }

        @C11395k(level = DeprecationLevel.WARNING, message = "We should not be able to reset the current state. You should use [MVI.Event] instead.")
        @C12579k
        public C28505u.C28509d reset() {
            return C28505u.C28509d.C28510a.m118428a(this);
        }

        @C12579k
        public String toString() {
            boolean z = this.f65075b;
            List<C24798d> list = this.f65076c;
            return "UIState(isLoading=" + z + ", offlineOrderDetails=" + list + ")";
        }

        public C26653b(boolean z, @C12580l List<? extends C24798d> list) {
            this.f65075b = z;
            this.f65076c = list;
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ C26653b(boolean z, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? false : z, (i & 2) != 0 ? null : list);
        }
    }

    /* renamed from: com.carrefour.fid.android.presentation.viewmodels.order.offline.OrderOfflineDetailViewModel$c */
    public interface C26655c extends C28505u.C28506a {

        @C8567o(parameters = 0)
        /* renamed from: com.carrefour.fid.android.presentation.viewmodels.order.offline.OrderOfflineDetailViewModel$c$a */
        public static final class C26656a implements C26655c {

            /* renamed from: b */
            public static final int f65077b = 8;
            @C12579k

            /* renamed from: a */
            public final Throwable f65078a;

            public C26656a(@C12579k Throwable th) {
                Intrinsics.checkNotNullParameter(th, "throwable");
                this.f65078a = th;
            }

            /* renamed from: c */
            public static /* synthetic */ C26656a m113280c(C26656a aVar, Throwable th, int i, Object obj) {
                if ((i & 1) != 0) {
                    th = aVar.f65078a;
                }
                return aVar.mo77448b(th);
            }

            @C12579k
            /* renamed from: a */
            public final Throwable mo77447a() {
                return this.f65078a;
            }

            @C12579k
            /* renamed from: b */
            public final C26656a mo77448b(@C12579k Throwable th) {
                Intrinsics.checkNotNullParameter(th, "throwable");
                return new C26656a(th);
            }

            @C12579k
            /* renamed from: d */
            public final Throwable mo77449d() {
                return this.f65078a;
            }

            public boolean equals(@C12580l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C26656a) && Intrinsics.areEqual((Object) this.f65078a, (Object) ((C26656a) obj).f65078a);
            }

            public int hashCode() {
                return this.f65078a.hashCode();
            }

            @C12579k
            public String toString() {
                Throwable th = this.f65078a;
                return "DownloadBillOrBankReceiptErrorEvent(throwable=" + th + ")";
            }
        }

        @C8567o(parameters = 0)
        /* renamed from: com.carrefour.fid.android.presentation.viewmodels.order.offline.OrderOfflineDetailViewModel$c$b */
        public static final class C26657b implements C26655c {

            /* renamed from: b */
            public static final int f65079b = 8;
            @C12579k

            /* renamed from: a */
            public final Throwable f65080a;

            public C26657b(@C12579k Throwable th) {
                Intrinsics.checkNotNullParameter(th, "throwable");
                this.f65080a = th;
            }

            /* renamed from: c */
            public static /* synthetic */ C26657b m113284c(C26657b bVar, Throwable th, int i, Object obj) {
                if ((i & 1) != 0) {
                    th = bVar.f65080a;
                }
                return bVar.mo77454b(th);
            }

            @C12579k
            /* renamed from: a */
            public final Throwable mo77453a() {
                return this.f65080a;
            }

            @C12579k
            /* renamed from: b */
            public final C26657b mo77454b(@C12579k Throwable th) {
                Intrinsics.checkNotNullParameter(th, "throwable");
                return new C26657b(th);
            }

            @C12579k
            /* renamed from: d */
            public final Throwable mo77455d() {
                return this.f65080a;
            }

            public boolean equals(@C12580l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C26657b) && Intrinsics.areEqual((Object) this.f65080a, (Object) ((C26657b) obj).f65080a);
            }

            public int hashCode() {
                return this.f65080a.hashCode();
            }

            @C12579k
            public String toString() {
                Throwable th = this.f65080a;
                return "ErrorEvent(throwable=" + th + ")";
            }
        }

        @C8567o(parameters = 0)
        /* renamed from: com.carrefour.fid.android.presentation.viewmodels.order.offline.OrderOfflineDetailViewModel$c$c */
        public static final class C26658c implements C26655c {

            /* renamed from: c */
            public static final int f65081c = 0;

            /* renamed from: a */
            public final boolean f65082a;
            @C12580l

            /* renamed from: b */
            public final String f65083b;

            public C26658c(boolean z, @C12580l String str) {
                this.f65082a = z;
                this.f65083b = str;
            }

            /* renamed from: d */
            public static /* synthetic */ C26658c m113288d(C26658c cVar, boolean z, String str, int i, Object obj) {
                if ((i & 1) != 0) {
                    z = cVar.f65082a;
                }
                if ((i & 2) != 0) {
                    str = cVar.f65083b;
                }
                return cVar.mo77461c(z, str);
            }

            /* renamed from: a */
            public final boolean mo77459a() {
                return this.f65082a;
            }

            @C12580l
            /* renamed from: b */
            public final String mo77460b() {
                return this.f65083b;
            }

            @C12579k
            /* renamed from: c */
            public final C26658c mo77461c(boolean z, @C12580l String str) {
                return new C26658c(z, str);
            }

            @C12580l
            /* renamed from: e */
            public final String mo77462e() {
                return this.f65083b;
            }

            public boolean equals(@C12580l Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C26658c)) {
                    return false;
                }
                C26658c cVar = (C26658c) obj;
                return this.f65082a == cVar.f65082a && Intrinsics.areEqual((Object) this.f65083b, (Object) cVar.f65083b);
            }

            /* renamed from: f */
            public final boolean mo77464f() {
                return this.f65082a;
            }

            public int hashCode() {
                boolean z = this.f65082a;
                if (z) {
                    z = true;
                }
                int i = (z ? 1 : 0) * true;
                String str = this.f65083b;
                return i + (str == null ? 0 : str.hashCode());
            }

            @C12579k
            public String toString() {
                boolean z = this.f65082a;
                String str = this.f65083b;
                return "OfflineBillAvailability(isOfflineBillAvailable=" + z + ", downloadUrl=" + str + ")";
            }
        }

        @C8567o(parameters = 0)
        /* renamed from: com.carrefour.fid.android.presentation.viewmodels.order.offline.OrderOfflineDetailViewModel$c$d */
        public static final class C26659d implements C26655c {

            /* renamed from: b */
            public static final int f65084b = 0;
            @C12579k

            /* renamed from: a */
            public final String f65085a;

            public C26659d(@C12579k String str) {
                Intrinsics.checkNotNullParameter(str, "filePath");
                this.f65085a = str;
            }

            /* renamed from: c */
            public static /* synthetic */ C26659d m113294c(C26659d dVar, String str, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = dVar.f65085a;
                }
                return dVar.mo77468b(str);
            }

            @C12579k
            /* renamed from: a */
            public final String mo77467a() {
                return this.f65085a;
            }

            @C12579k
            /* renamed from: b */
            public final C26659d mo77468b(@C12579k String str) {
                Intrinsics.checkNotNullParameter(str, "filePath");
                return new C26659d(str);
            }

            @C12579k
            /* renamed from: d */
            public final String mo77469d() {
                return this.f65085a;
            }

            public boolean equals(@C12580l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C26659d) && Intrinsics.areEqual((Object) this.f65085a, (Object) ((C26659d) obj).f65085a);
            }

            public int hashCode() {
                return this.f65085a.hashCode();
            }

            @C12579k
            public String toString() {
                String str = this.f65085a;
                return "OfflineOrderBankReceipt(filePath=" + str + ")";
            }
        }

        @C8567o(parameters = 0)
        /* renamed from: com.carrefour.fid.android.presentation.viewmodels.order.offline.OrderOfflineDetailViewModel$c$e */
        public static final class C26660e implements C26655c {

            /* renamed from: b */
            public static final int f65086b = 0;
            @C12579k

            /* renamed from: a */
            public final String f65087a;

            public C26660e(@C12579k String str) {
                Intrinsics.checkNotNullParameter(str, "filePath");
                this.f65087a = str;
            }

            /* renamed from: c */
            public static /* synthetic */ C26660e m113298c(C26660e eVar, String str, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = eVar.f65087a;
                }
                return eVar.mo77474b(str);
            }

            @C12579k
            /* renamed from: a */
            public final String mo77473a() {
                return this.f65087a;
            }

            @C12579k
            /* renamed from: b */
            public final C26660e mo77474b(@C12579k String str) {
                Intrinsics.checkNotNullParameter(str, "filePath");
                return new C26660e(str);
            }

            @C12579k
            /* renamed from: d */
            public final String mo77475d() {
                return this.f65087a;
            }

            public boolean equals(@C12580l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C26660e) && Intrinsics.areEqual((Object) this.f65087a, (Object) ((C26660e) obj).f65087a);
            }

            public int hashCode() {
                return this.f65087a.hashCode();
            }

            @C12579k
            public String toString() {
                String str = this.f65087a;
                return "OfflineOrderBillReceipt(filePath=" + str + ")";
            }
        }
    }

    /* renamed from: com.carrefour.fid.android.presentation.viewmodels.order.offline.OrderOfflineDetailViewModel$d */
    public interface C26661d extends C28505u.C28507b {

        @C8567o(parameters = 0)
        /* renamed from: com.carrefour.fid.android.presentation.viewmodels.order.offline.OrderOfflineDetailViewModel$d$a */
        public static final class C26662a implements C26661d {
            @C12579k

            /* renamed from: a */
            public static final C26662a f65088a = new C26662a();

            /* renamed from: b */
            public static final int f65089b = 0;
        }

        @C8567o(parameters = 0)
        /* renamed from: com.carrefour.fid.android.presentation.viewmodels.order.offline.OrderOfflineDetailViewModel$d$b */
        public static final class C26663b implements C26661d {

            /* renamed from: b */
            public static final int f65090b = 0;
            @C12579k

            /* renamed from: a */
            public final OrderDetailParam f65091a;

            public C26663b(@C12579k OrderDetailParam orderDetailParam) {
                Intrinsics.checkNotNullParameter(orderDetailParam, "param");
                this.f65091a = orderDetailParam;
            }

            /* renamed from: c */
            public static /* synthetic */ C26663b m113302c(C26663b bVar, OrderDetailParam orderDetailParam, int i, Object obj) {
                if ((i & 1) != 0) {
                    orderDetailParam = bVar.f65091a;
                }
                return bVar.mo77480b(orderDetailParam);
            }

            @C12579k
            /* renamed from: a */
            public final OrderDetailParam mo77479a() {
                return this.f65091a;
            }

            @C12579k
            /* renamed from: b */
            public final C26663b mo77480b(@C12579k OrderDetailParam orderDetailParam) {
                Intrinsics.checkNotNullParameter(orderDetailParam, "param");
                return new C26663b(orderDetailParam);
            }

            @C12579k
            /* renamed from: d */
            public final OrderDetailParam mo77481d() {
                return this.f65091a;
            }

            public boolean equals(@C12580l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C26663b) && Intrinsics.areEqual((Object) this.f65091a, (Object) ((C26663b) obj).f65091a);
            }

            public int hashCode() {
                return this.f65091a.hashCode();
            }

            @C12579k
            public String toString() {
                OrderDetailParam orderDetailParam = this.f65091a;
                return "DownloadOfflineBankReceipt(param=" + orderDetailParam + ")";
            }
        }

        @C8567o(parameters = 0)
        /* renamed from: com.carrefour.fid.android.presentation.viewmodels.order.offline.OrderOfflineDetailViewModel$d$c */
        public static final class C26664c implements C26661d {

            /* renamed from: b */
            public static final int f65092b = 0;
            @C12579k

            /* renamed from: a */
            public final OrderDetailParam f65093a;

            public C26664c(@C12579k OrderDetailParam orderDetailParam) {
                Intrinsics.checkNotNullParameter(orderDetailParam, "param");
                this.f65093a = orderDetailParam;
            }

            /* renamed from: c */
            public static /* synthetic */ C26664c m113306c(C26664c cVar, OrderDetailParam orderDetailParam, int i, Object obj) {
                if ((i & 1) != 0) {
                    orderDetailParam = cVar.f65093a;
                }
                return cVar.mo77486b(orderDetailParam);
            }

            @C12579k
            /* renamed from: a */
            public final OrderDetailParam mo77485a() {
                return this.f65093a;
            }

            @C12579k
            /* renamed from: b */
            public final C26664c mo77486b(@C12579k OrderDetailParam orderDetailParam) {
                Intrinsics.checkNotNullParameter(orderDetailParam, "param");
                return new C26664c(orderDetailParam);
            }

            @C12579k
            /* renamed from: d */
            public final OrderDetailParam mo77487d() {
                return this.f65093a;
            }

            public boolean equals(@C12580l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C26664c) && Intrinsics.areEqual((Object) this.f65093a, (Object) ((C26664c) obj).f65093a);
            }

            public int hashCode() {
                return this.f65093a.hashCode();
            }

            @C12579k
            public String toString() {
                OrderDetailParam orderDetailParam = this.f65093a;
                return "DownloadOfflineOrderBill(param=" + orderDetailParam + ")";
            }
        }

        @C8567o(parameters = 0)
        /* renamed from: com.carrefour.fid.android.presentation.viewmodels.order.offline.OrderOfflineDetailViewModel$d$d */
        public static final class C26665d implements C26661d {

            /* renamed from: b */
            public static final int f65094b = 0;
            @C12579k

            /* renamed from: a */
            public final OrderDetailParam f65095a;

            public C26665d(@C12579k OrderDetailParam orderDetailParam) {
                Intrinsics.checkNotNullParameter(orderDetailParam, "param");
                this.f65095a = orderDetailParam;
            }

            /* renamed from: c */
            public static /* synthetic */ C26665d m113310c(C26665d dVar, OrderDetailParam orderDetailParam, int i, Object obj) {
                if ((i & 1) != 0) {
                    orderDetailParam = dVar.f65095a;
                }
                return dVar.mo77492b(orderDetailParam);
            }

            @C12579k
            /* renamed from: a */
            public final OrderDetailParam mo77491a() {
                return this.f65095a;
            }

            @C12579k
            /* renamed from: b */
            public final C26665d mo77492b(@C12579k OrderDetailParam orderDetailParam) {
                Intrinsics.checkNotNullParameter(orderDetailParam, "param");
                return new C26665d(orderDetailParam);
            }

            @C12579k
            /* renamed from: d */
            public final OrderDetailParam mo77493d() {
                return this.f65095a;
            }

            public boolean equals(@C12580l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C26665d) && Intrinsics.areEqual((Object) this.f65095a, (Object) ((C26665d) obj).f65095a);
            }

            public int hashCode() {
                return this.f65095a.hashCode();
            }

            @C12579k
            public String toString() {
                OrderDetailParam orderDetailParam = this.f65095a;
                return "LoadOfflineOrders(param=" + orderDetailParam + ")";
            }
        }
    }

    /* renamed from: com.carrefour.fid.android.presentation.viewmodels.order.offline.OrderOfflineDetailViewModel$e */
    public static final class C26666e implements C28505u.C28508c<C26653b, C26649a> {

        /* renamed from: a */
        public static final C26666e f65096a = new C26666e();

        @C12579k
        /* renamed from: b */
        public final C26653b mo32307a(@C12579k C26653b bVar, @C12579k C26649a aVar) {
            Intrinsics.checkNotNullParameter(bVar, "<anonymous parameter 0>");
            Intrinsics.checkNotNullParameter(aVar, "partialState");
            if (aVar instanceof C26649a.C26651b) {
                return new C26653b(((C26649a.C26651b) aVar).isLoading(), (List) null, 2, (DefaultConstructorMarker) null);
            }
            if (aVar instanceof C26649a.C26652c) {
                return new C26653b(false, ((C26649a.C26652c) aVar).mo77435h());
            }
            throw new NoWhenBranchMatchedException();
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @Inject
    public OrderOfflineDetailViewModel(@C12579k GetOrderOfflineDetailUseCase getOrderOfflineDetailUseCase, @C12579k C37807b bVar, @C12579k DownloadOrderBillAndBankReceiptOfflineUseCase downloadOrderBillAndBankReceiptOfflineUseCase, @C12579k C24782a aVar) {
        super(C26653b.f65072d.mo77446a(), (CoroutineDispatcher) null, (C19456p0) null, 6, (DefaultConstructorMarker) null);
        Intrinsics.checkNotNullParameter(getOrderOfflineDetailUseCase, "orderOfflineDetailUseCase");
        Intrinsics.checkNotNullParameter(bVar, "checkRemoteConfigUseCase");
        Intrinsics.checkNotNullParameter(downloadOrderBillAndBankReceiptOfflineUseCase, "downloadOrderBillAndBankReceiptOfflineUseCase");
        Intrinsics.checkNotNullParameter(aVar, "ordersOfflineDetailsModelDataMapper");
        this.f65063a = getOrderOfflineDetailUseCase;
        this.f65064b = bVar;
        this.f65065c = downloadOrderBillAndBankReceiptOfflineUseCase;
        this.f65066d = aVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x003f  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x008e A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x008f  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x009d  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* renamed from: h0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo77420h0(kotlin.coroutines.C11045c<? super kotlin.C11079d2> r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof com.carrefour.fid.android.presentation.viewmodels.order.offline.OrderOfflineDetailViewModel$checkOfflineBillAvailability$1
            if (r0 == 0) goto L_0x0013
            r0 = r7
            com.carrefour.fid.android.presentation.viewmodels.order.offline.OrderOfflineDetailViewModel$checkOfflineBillAvailability$1 r0 = (com.carrefour.fid.android.presentation.viewmodels.order.offline.OrderOfflineDetailViewModel$checkOfflineBillAvailability$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.carrefour.fid.android.presentation.viewmodels.order.offline.OrderOfflineDetailViewModel$checkOfflineBillAvailability$1 r0 = new com.carrefour.fid.android.presentation.viewmodels.order.offline.OrderOfflineDetailViewModel$checkOfflineBillAvailability$1
            r0.<init>(r6, r7)
        L_0x0018:
            java.lang.Object r7 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L_0x003f
            if (r2 != r3) goto L_0x0037
            java.lang.Object r1 = r0.L$1
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r0 = r0.L$0
            com.carrefour.fid.android.presentation.viewmodels.order.offline.OrderOfflineDetailViewModel r0 = (com.carrefour.fid.android.presentation.viewmodels.order.offline.OrderOfflineDetailViewModel) r0
            kotlin.C11661u0.m45747n(r7)
            kotlin.Result r7 = (kotlin.Result) r7
            java.lang.Object r7 = r7.mo21858l()
            goto L_0x0092
        L_0x0037:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L_0x003f:
            kotlin.C11661u0.m45747n(r7)
            com.carrefour.fid.android.shared.base.u$d r7 = r6.getCurrentState()
            com.carrefour.fid.android.presentation.viewmodels.order.offline.OrderOfflineDetailViewModel$b r7 = (com.carrefour.fid.android.presentation.viewmodels.order.offline.OrderOfflineDetailViewModel.C26653b) r7
            java.util.List r7 = r7.mo77444j()
            if (r7 == 0) goto L_0x0078
            java.lang.Iterable r7 = (java.lang.Iterable) r7
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.util.Iterator r7 = r7.iterator()
        L_0x0059:
            boolean r4 = r7.hasNext()
            if (r4 == 0) goto L_0x006b
            java.lang.Object r4 = r7.next()
            boolean r5 = r4 instanceof com.carrefour.fid.android.presentation.p035ui.orders.offline.model.C24797c
            if (r5 == 0) goto L_0x0059
            r2.add(r4)
            goto L_0x0059
        L_0x006b:
            java.lang.Object r7 = kotlin.collections.CollectionsKt___CollectionsKt.m40479B2(r2)
            com.carrefour.fid.android.presentation.ui.orders.offline.model.c r7 = (com.carrefour.fid.android.presentation.p035ui.orders.offline.model.C24797c) r7
            if (r7 == 0) goto L_0x0078
            java.lang.String r7 = r7.mo72412i()
            goto L_0x0079
        L_0x0078:
            r7 = 0
        L_0x0079:
            com.carrefour.fid.android.domain.interactors.remoteconfig.b r2 = r6.f65064b
            com.carrefour.fid.android.domain.interactors.remoteconfig.b$a r4 = new com.carrefour.fid.android.domain.interactors.remoteconfig.b$a
            com.carrefour.fid.android.domain.models.remoteconfig.RemoteConfigTag r5 = com.carrefour.fid.android.domain.models.remoteconfig.RemoteConfigTag.OrderOfflineBill
            r4.<init>(r5)
            r0.L$0 = r6
            r0.L$1 = r7
            r0.label = r3
            java.lang.Object r0 = r2.m172966invokegIAlus(r4, r0)
            if (r0 != r1) goto L_0x008f
            return r1
        L_0x008f:
            r1 = r7
            r7 = r0
            r0 = r6
        L_0x0092:
            r2 = 0
            java.lang.Boolean r2 = kotlin.coroutines.jvm.internal.C11064a.m42615a(r2)
            boolean r3 = kotlin.Result.m38709i(r7)
            if (r3 == 0) goto L_0x009e
            r7 = r2
        L_0x009e:
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            boolean r7 = r7.booleanValue()
            com.carrefour.fid.android.presentation.viewmodels.order.offline.OrderOfflineDetailViewModel$c$c r2 = new com.carrefour.fid.android.presentation.viewmodels.order.offline.OrderOfflineDetailViewModel$c$c
            r2.<init>(r7, r1)
            r0.emitEvent(r2)
            kotlin.d2 r7 = kotlin.C11079d2.f28267a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.presentation.viewmodels.order.offline.OrderOfflineDetailViewModel.mo77420h0(kotlin.coroutines.c):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x003b  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x007a  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x008b  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* renamed from: i0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo77421i0(com.carrefour.fid.android.presentation.p035ui.orders.offline.model.OrderDetailParam r8, kotlin.coroutines.C11045c<? super kotlin.C11079d2> r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof com.carrefour.fid.android.presentation.viewmodels.order.offline.OrderOfflineDetailViewModel$downloadOfflineBankReceipt$1
            if (r0 == 0) goto L_0x0013
            r0 = r9
            com.carrefour.fid.android.presentation.viewmodels.order.offline.OrderOfflineDetailViewModel$downloadOfflineBankReceipt$1 r0 = (com.carrefour.fid.android.presentation.viewmodels.order.offline.OrderOfflineDetailViewModel$downloadOfflineBankReceipt$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.carrefour.fid.android.presentation.viewmodels.order.offline.OrderOfflineDetailViewModel$downloadOfflineBankReceipt$1 r0 = new com.carrefour.fid.android.presentation.viewmodels.order.offline.OrderOfflineDetailViewModel$downloadOfflineBankReceipt$1
            r0.<init>(r7, r9)
        L_0x0018:
            java.lang.Object r9 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L_0x003b
            if (r2 != r3) goto L_0x0033
            java.lang.Object r8 = r0.L$0
            com.carrefour.fid.android.presentation.viewmodels.order.offline.OrderOfflineDetailViewModel r8 = (com.carrefour.fid.android.presentation.viewmodels.order.offline.OrderOfflineDetailViewModel) r8
            kotlin.C11661u0.m45747n(r9)
            kotlin.Result r9 = (kotlin.Result) r9
            java.lang.Object r9 = r9.mo21858l()
            goto L_0x006b
        L_0x0033:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L_0x003b:
            kotlin.C11661u0.m45747n(r9)
            com.carrefour.fid.android.presentation.viewmodels.order.offline.OrderOfflineDetailViewModel$a$b r9 = new com.carrefour.fid.android.presentation.viewmodels.order.offline.OrderOfflineDetailViewModel$a$b
            r9.<init>(r3)
            r7.mo77425m0(r9)
            com.carrefour.fid.android.domain.interactors.order.DownloadOrderBillAndBankReceiptOfflineUseCase r9 = r7.f65065c
            com.carrefour.fid.android.domain.interactors.order.DownloadOrderBillAndBankReceiptOfflineUseCase$a r2 = new com.carrefour.fid.android.domain.interactors.order.DownloadOrderBillAndBankReceiptOfflineUseCase$a
            java.lang.String r4 = r8.mo72370j()
            java.lang.String r5 = r8.mo72371k()
            java.lang.String r8 = r8.mo72369i()
            java.lang.String r8 = com.carrefour.fid.android.shared.extension.StringKt.m118940t(r8)
            com.carrefour.fid.android.presentation.ui.orders.offline.model.DownloadReceipt$BankReceipt r6 = com.carrefour.fid.android.presentation.p035ui.orders.offline.model.DownloadReceipt.BankReceipt.f61485b
            r2.<init>(r4, r5, r8, r6)
            r0.L$0 = r7
            r0.label = r3
            java.lang.Object r9 = r9.m172977invokegIAlus(r2, r0)
            if (r9 != r1) goto L_0x006a
            return r1
        L_0x006a:
            r8 = r7
        L_0x006b:
            com.carrefour.fid.android.presentation.viewmodels.order.offline.OrderOfflineDetailViewModel$a$b r0 = new com.carrefour.fid.android.presentation.viewmodels.order.offline.OrderOfflineDetailViewModel$a$b
            r1 = 0
            r0.<init>(r1)
            r8.mo77425m0(r0)
            boolean r0 = kotlin.Result.m38710j(r9)
            if (r0 == 0) goto L_0x0085
            r0 = r9
            java.lang.String r0 = (java.lang.String) r0
            com.carrefour.fid.android.presentation.viewmodels.order.offline.OrderOfflineDetailViewModel$c$d r1 = new com.carrefour.fid.android.presentation.viewmodels.order.offline.OrderOfflineDetailViewModel$c$d
            r1.<init>(r0)
            r8.emitEvent(r1)
        L_0x0085:
            java.lang.Throwable r9 = kotlin.Result.m38705e(r9)
            if (r9 == 0) goto L_0x0093
            com.carrefour.fid.android.presentation.viewmodels.order.offline.OrderOfflineDetailViewModel$c$a r0 = new com.carrefour.fid.android.presentation.viewmodels.order.offline.OrderOfflineDetailViewModel$c$a
            r0.<init>(r9)
            r8.emitEvent(r0)
        L_0x0093:
            kotlin.d2 r8 = kotlin.C11079d2.f28267a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.presentation.viewmodels.order.offline.OrderOfflineDetailViewModel.mo77421i0(com.carrefour.fid.android.presentation.ui.orders.offline.model.OrderDetailParam, kotlin.coroutines.c):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x003b  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x007a  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x008b  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* renamed from: j0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo77422j0(com.carrefour.fid.android.presentation.p035ui.orders.offline.model.OrderDetailParam r8, kotlin.coroutines.C11045c<? super kotlin.C11079d2> r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof com.carrefour.fid.android.presentation.viewmodels.order.offline.OrderOfflineDetailViewModel$downloadOfflineOrderBill$1
            if (r0 == 0) goto L_0x0013
            r0 = r9
            com.carrefour.fid.android.presentation.viewmodels.order.offline.OrderOfflineDetailViewModel$downloadOfflineOrderBill$1 r0 = (com.carrefour.fid.android.presentation.viewmodels.order.offline.OrderOfflineDetailViewModel$downloadOfflineOrderBill$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.carrefour.fid.android.presentation.viewmodels.order.offline.OrderOfflineDetailViewModel$downloadOfflineOrderBill$1 r0 = new com.carrefour.fid.android.presentation.viewmodels.order.offline.OrderOfflineDetailViewModel$downloadOfflineOrderBill$1
            r0.<init>(r7, r9)
        L_0x0018:
            java.lang.Object r9 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L_0x003b
            if (r2 != r3) goto L_0x0033
            java.lang.Object r8 = r0.L$0
            com.carrefour.fid.android.presentation.viewmodels.order.offline.OrderOfflineDetailViewModel r8 = (com.carrefour.fid.android.presentation.viewmodels.order.offline.OrderOfflineDetailViewModel) r8
            kotlin.C11661u0.m45747n(r9)
            kotlin.Result r9 = (kotlin.Result) r9
            java.lang.Object r9 = r9.mo21858l()
            goto L_0x006b
        L_0x0033:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L_0x003b:
            kotlin.C11661u0.m45747n(r9)
            com.carrefour.fid.android.presentation.viewmodels.order.offline.OrderOfflineDetailViewModel$a$b r9 = new com.carrefour.fid.android.presentation.viewmodels.order.offline.OrderOfflineDetailViewModel$a$b
            r9.<init>(r3)
            r7.mo77425m0(r9)
            com.carrefour.fid.android.domain.interactors.order.DownloadOrderBillAndBankReceiptOfflineUseCase r9 = r7.f65065c
            com.carrefour.fid.android.domain.interactors.order.DownloadOrderBillAndBankReceiptOfflineUseCase$a r2 = new com.carrefour.fid.android.domain.interactors.order.DownloadOrderBillAndBankReceiptOfflineUseCase$a
            java.lang.String r4 = r8.mo72370j()
            java.lang.String r5 = r8.mo72371k()
            java.lang.String r8 = r8.mo72369i()
            java.lang.String r8 = com.carrefour.fid.android.shared.extension.StringKt.m118940t(r8)
            com.carrefour.fid.android.presentation.ui.orders.offline.model.DownloadReceipt$BillReceipt r6 = com.carrefour.fid.android.presentation.p035ui.orders.offline.model.DownloadReceipt.BillReceipt.f61487b
            r2.<init>(r4, r5, r8, r6)
            r0.L$0 = r7
            r0.label = r3
            java.lang.Object r9 = r9.m172977invokegIAlus(r2, r0)
            if (r9 != r1) goto L_0x006a
            return r1
        L_0x006a:
            r8 = r7
        L_0x006b:
            com.carrefour.fid.android.presentation.viewmodels.order.offline.OrderOfflineDetailViewModel$a$b r0 = new com.carrefour.fid.android.presentation.viewmodels.order.offline.OrderOfflineDetailViewModel$a$b
            r1 = 0
            r0.<init>(r1)
            r8.mo77425m0(r0)
            boolean r0 = kotlin.Result.m38710j(r9)
            if (r0 == 0) goto L_0x0085
            r0 = r9
            java.lang.String r0 = (java.lang.String) r0
            com.carrefour.fid.android.presentation.viewmodels.order.offline.OrderOfflineDetailViewModel$c$e r1 = new com.carrefour.fid.android.presentation.viewmodels.order.offline.OrderOfflineDetailViewModel$c$e
            r1.<init>(r0)
            r8.emitEvent(r1)
        L_0x0085:
            java.lang.Throwable r9 = kotlin.Result.m38705e(r9)
            if (r9 == 0) goto L_0x0093
            com.carrefour.fid.android.presentation.viewmodels.order.offline.OrderOfflineDetailViewModel$c$a r0 = new com.carrefour.fid.android.presentation.viewmodels.order.offline.OrderOfflineDetailViewModel$c$a
            r0.<init>(r9)
            r8.emitEvent(r0)
        L_0x0093:
            kotlin.d2 r8 = kotlin.C11079d2.f28267a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.presentation.viewmodels.order.offline.OrderOfflineDetailViewModel.mo77422j0(com.carrefour.fid.android.presentation.ui.orders.offline.model.OrderDetailParam, kotlin.coroutines.c):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x003b  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0078  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x008f  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* renamed from: k0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo77423k0(com.carrefour.fid.android.presentation.p035ui.orders.offline.model.OrderDetailParam r11, kotlin.coroutines.C11045c<? super kotlin.C11079d2> r12) {
        /*
            r10 = this;
            boolean r0 = r12 instanceof com.carrefour.fid.android.presentation.viewmodels.order.offline.OrderOfflineDetailViewModel$getOrderDetails$1
            if (r0 == 0) goto L_0x0013
            r0 = r12
            com.carrefour.fid.android.presentation.viewmodels.order.offline.OrderOfflineDetailViewModel$getOrderDetails$1 r0 = (com.carrefour.fid.android.presentation.viewmodels.order.offline.OrderOfflineDetailViewModel$getOrderDetails$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.carrefour.fid.android.presentation.viewmodels.order.offline.OrderOfflineDetailViewModel$getOrderDetails$1 r0 = new com.carrefour.fid.android.presentation.viewmodels.order.offline.OrderOfflineDetailViewModel$getOrderDetails$1
            r0.<init>(r10, r12)
        L_0x0018:
            java.lang.Object r12 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L_0x003b
            if (r2 != r3) goto L_0x0033
            java.lang.Object r11 = r0.L$0
            com.carrefour.fid.android.presentation.viewmodels.order.offline.OrderOfflineDetailViewModel r11 = (com.carrefour.fid.android.presentation.viewmodels.order.offline.OrderOfflineDetailViewModel) r11
            kotlin.C11661u0.m45747n(r12)
            kotlin.Result r12 = (kotlin.Result) r12
            java.lang.Object r12 = r12.mo21858l()
            goto L_0x0072
        L_0x0033:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L_0x003b:
            kotlin.C11661u0.m45747n(r12)
            com.carrefour.fid.android.presentation.viewmodels.order.offline.OrderOfflineDetailViewModel$a$b r12 = new com.carrefour.fid.android.presentation.viewmodels.order.offline.OrderOfflineDetailViewModel$a$b
            r12.<init>(r3)
            r10.mo77425m0(r12)
            com.carrefour.fid.android.domain.interactors.order.GetOrderOfflineDetailUseCase r12 = r10.f65063a
            com.carrefour.fid.android.domain.interactors.order.GetOrderOfflineDetailUseCase$a r2 = new com.carrefour.fid.android.domain.interactors.order.GetOrderOfflineDetailUseCase$a
            java.lang.String r5 = r11.mo72370j()
            java.lang.String r6 = r11.mo72371k()
            java.lang.String r4 = r11.mo72369i()
            java.lang.String r7 = com.carrefour.fid.android.shared.extension.StringKt.m118940t(r4)
            java.lang.String r8 = r11.mo72372l()
            java.lang.String r9 = r11.mo72367h()
            r4 = r2
            r4.<init>(r5, r6, r7, r8, r9)
            r0.L$0 = r10
            r0.label = r3
            java.lang.Object r12 = r12.m172978invokegIAlus(r2, r0)
            if (r12 != r1) goto L_0x0071
            return r1
        L_0x0071:
            r11 = r10
        L_0x0072:
            boolean r0 = kotlin.Result.m38710j(r12)
            if (r0 == 0) goto L_0x0089
            r0 = r12
            com.carrefour.fid.android.domain.models.OrdersOfflineDetailsDomain r0 = (com.carrefour.fid.android.domain.models.OrdersOfflineDetailsDomain) r0
            com.carrefour.fid.android.presentation.viewmodels.order.offline.OrderOfflineDetailViewModel$a$c r1 = new com.carrefour.fid.android.presentation.viewmodels.order.offline.OrderOfflineDetailViewModel$a$c
            com.carrefour.fid.android.presentation.ui.orders.offline.mapper.a r2 = r11.f65066d
            java.util.List r0 = r2.mo72338a(r0)
            r1.<init>(r0)
            r11.mo77425m0(r1)
        L_0x0089:
            java.lang.Throwable r12 = kotlin.Result.m38705e(r12)
            if (r12 == 0) goto L_0x00a0
            com.carrefour.fid.android.presentation.viewmodels.order.offline.OrderOfflineDetailViewModel$a$b r0 = new com.carrefour.fid.android.presentation.viewmodels.order.offline.OrderOfflineDetailViewModel$a$b
            r1 = 0
            r0.<init>(r1)
            r11.mo77425m0(r0)
            com.carrefour.fid.android.presentation.viewmodels.order.offline.OrderOfflineDetailViewModel$c$b r0 = new com.carrefour.fid.android.presentation.viewmodels.order.offline.OrderOfflineDetailViewModel$c$b
            r0.<init>(r12)
            r11.emitEvent(r0)
        L_0x00a0:
            kotlin.d2 r11 = kotlin.C11079d2.f28267a
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.presentation.viewmodels.order.offline.OrderOfflineDetailViewModel.mo77423k0(com.carrefour.fid.android.presentation.ui.orders.offline.model.OrderDetailParam, kotlin.coroutines.c):java.lang.Object");
    }

    @C12580l
    /* renamed from: l0 */
    public Object processIntent(@C12579k C26661d dVar, @C12579k C11045c<? super C11079d2> cVar) {
        if (dVar instanceof C26661d.C26665d) {
            Object k0 = mo77423k0(((C26661d.C26665d) dVar).mo77493d(), cVar);
            if (k0 == C11063b.m42612h()) {
                return k0;
            }
            return C11079d2.f28267a;
        } else if (dVar instanceof C26661d.C26662a) {
            Object h0 = mo77420h0(cVar);
            if (h0 == C11063b.m42612h()) {
                return h0;
            }
            return C11079d2.f28267a;
        } else if (dVar instanceof C26661d.C26664c) {
            Object j0 = mo77422j0(((C26661d.C26664c) dVar).mo77487d(), cVar);
            if (j0 == C11063b.m42612h()) {
                return j0;
            }
            return C11079d2.f28267a;
        } else if (!(dVar instanceof C26661d.C26663b)) {
            return C11079d2.f28267a;
        } else {
            Object i0 = mo77421i0(((C26661d.C26663b) dVar).mo77481d(), cVar);
            if (i0 == C11063b.m42612h()) {
                return i0;
            }
            return C11079d2.f28267a;
        }
    }

    /* renamed from: m0 */
    public final void mo77425m0(C26649a aVar) {
        reduceAndPublishState(this.f65067e, aVar);
    }
}
