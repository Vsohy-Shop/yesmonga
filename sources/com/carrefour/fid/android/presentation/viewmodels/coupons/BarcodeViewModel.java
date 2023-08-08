package com.carrefour.fid.android.presentation.viewmodels.coupons;

import androidx.compose.runtime.internal.C8567o;
import androidx.lifecycle.C19456p0;
import androidx.lifecycle.C19500w0;
import com.carrefour.fid.android.analytics.data.analytics.C13783a;
import com.carrefour.fid.android.domain.interactors.coupons.FetchCouponsUseCase;
import com.carrefour.fid.android.loyalty.core.datastore.LoyaltyPreferencesStorage;
import com.carrefour.fid.android.presentation.models.CouponModel;
import com.carrefour.fid.android.shared.base.BaseMVIViewModel;
import com.carrefour.fid.android.shared.base.C28505u;
import dagger.hilt.android.lifecycle.C10245a;
import java.util.List;
import java.util.Map;
import javax.inject.Inject;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.C11395k;
import kotlin.DeprecationLevel;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.C11063b;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.C11723c2;
import kotlinx.coroutines.C12038j;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineStart;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C10245a
@C11076d0(mo22515d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0003\u0011\u0015\u0019B!\b\u0007\u0012\u0006\u0010\u0013\u001a\u00020\u0010\u0012\u0006\u0010\u0017\u001a\u00020\u0014\u0012\u0006\u0010\u001b\u001a\u00020\u0018¢\u0006\u0004\b \u0010!J\u001b\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H@ø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0007J\u0013\u0010\b\u001a\u00020\u0005H@ø\u0001\u0000¢\u0006\u0004\b\b\u0010\tJ\b\u0010\n\u001a\u00020\u0005H\u0002J\u0013\u0010\u000b\u001a\u00020\u0005H@ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\tJ\u001b\u0010\u000e\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\fH@ø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0013\u001a\u00020\u00108\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0017\u001a\u00020\u00148\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\u001b\u001a\u00020\u00188\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR \u0010\u001f\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\f0\u001c8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001e\u0002\u0004\n\u0002\b\u0019¨\u0006\""}, mo22516d2 = {"Lcom/carrefour/fid/android/presentation/viewmodels/coupons/BarcodeViewModel;", "Lcom/carrefour/fid/android/shared/base/BaseMVIViewModel;", "Lcom/carrefour/fid/android/presentation/viewmodels/coupons/BarcodeViewModel$b;", "Lcom/carrefour/fid/android/presentation/viewmodels/coupons/BarcodeViewModel$c;", "intent", "Lkotlin/d2;", "i0", "(Lcom/carrefour/fid/android/presentation/viewmodels/coupons/BarcodeViewModel$c;Lkotlin/coroutines/c;)Ljava/lang/Object;", "h0", "(Lkotlin/coroutines/c;)Ljava/lang/Object;", "sendScreenView", "g0", "Lcom/carrefour/fid/android/presentation/viewmodels/coupons/BarcodeViewModel$a;", "partialState", "j0", "(Lcom/carrefour/fid/android/presentation/viewmodels/coupons/BarcodeViewModel$a;Lkotlin/coroutines/c;)Ljava/lang/Object;", "Lcom/carrefour/fid/android/domain/interactors/coupons/FetchCouponsUseCase;", "a", "Lcom/carrefour/fid/android/domain/interactors/coupons/FetchCouponsUseCase;", "fetchCouponsUseCase", "Lcom/carrefour/fid/android/loyalty/core/datastore/LoyaltyPreferencesStorage;", "b", "Lcom/carrefour/fid/android/loyalty/core/datastore/LoyaltyPreferencesStorage;", "loyaltyPreferencesStorage", "Lcom/carrefour/fid/android/analytics/data/analytics/a;", "c", "Lcom/carrefour/fid/android/analytics/data/analytics/a;", "mAnalyticManager", "Lcom/carrefour/fid/android/shared/base/u$c;", "d", "Lcom/carrefour/fid/android/shared/base/u$c;", "reducer", "<init>", "(Lcom/carrefour/fid/android/domain/interactors/coupons/FetchCouponsUseCase;Lcom/carrefour/fid/android/loyalty/core/datastore/LoyaltyPreferencesStorage;Lcom/carrefour/fid/android/analytics/data/analytics/a;)V", "app_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
@C8567o(parameters = 0)
@C11363r0({"SMAP\nBarcodeViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BarcodeViewModel.kt\ncom/carrefour/fid/android/presentation/viewmodels/coupons/BarcodeViewModel\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,117:1\n1549#2:118\n1620#2,3:119\n*S KotlinDebug\n*F\n+ 1 BarcodeViewModel.kt\ncom/carrefour/fid/android/presentation/viewmodels/coupons/BarcodeViewModel\n*L\n108#1:118\n108#1:119,3\n*E\n"})
public final class BarcodeViewModel extends BaseMVIViewModel<C26210b, C26212c> {

    /* renamed from: e */
    public static final int f64110e = 8;
    @C12579k

    /* renamed from: a */
    public final FetchCouponsUseCase f64111a;
    @C12579k

    /* renamed from: b */
    public final LoyaltyPreferencesStorage f64112b;
    @C12579k

    /* renamed from: c */
    public final C13783a f64113c;
    @C12579k

    /* renamed from: d */
    public final C28505u.C28508c<C26210b, C26205a> f64114d = C26214d.f64133a;

    @C8567o(parameters = 0)
    /* renamed from: com.carrefour.fid.android.presentation.viewmodels.coupons.BarcodeViewModel$a */
    public static abstract class C26205a implements C28505u.C28509d {

        /* renamed from: b */
        public static final int f64115b = 0;

        @C8567o(parameters = 0)
        /* renamed from: com.carrefour.fid.android.presentation.viewmodels.coupons.BarcodeViewModel$a$a */
        public static final class C26206a extends C26205a {

            /* renamed from: d */
            public static final int f64116d = 8;
            @C12579k

            /* renamed from: c */
            public final List<CouponModel> f64117c;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C26206a(@C12579k List<CouponModel> list) {
                super((DefaultConstructorMarker) null);
                Intrinsics.checkNotNullParameter(list, "list");
                this.f64117c = list;
            }

            /* renamed from: g */
            public static /* synthetic */ C26206a m112040g(C26206a aVar, List<CouponModel> list, int i, Object obj) {
                if ((i & 1) != 0) {
                    list = aVar.f64117c;
                }
                return aVar.mo76222f(list);
            }

            @C12579k
            /* renamed from: e */
            public final List<CouponModel> mo76220e() {
                return this.f64117c;
            }

            public boolean equals(@C12580l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C26206a) && Intrinsics.areEqual((Object) this.f64117c, (Object) ((C26206a) obj).f64117c);
            }

            @C12579k
            /* renamed from: f */
            public final C26206a mo76222f(@C12579k List<CouponModel> list) {
                Intrinsics.checkNotNullParameter(list, "list");
                return new C26206a(list);
            }

            @C12579k
            /* renamed from: h */
            public final List<CouponModel> mo76223h() {
                return this.f64117c;
            }

            public int hashCode() {
                return this.f64117c.hashCode();
            }

            @C12579k
            public String toString() {
                List<CouponModel> list = this.f64117c;
                return "BurnedList(list=" + list + ")";
            }
        }

        @C8567o(parameters = 0)
        /* renamed from: com.carrefour.fid.android.presentation.viewmodels.coupons.BarcodeViewModel$a$b */
        public static final class C26207b extends C26205a {

            /* renamed from: d */
            public static final int f64118d = 8;
            @C12579k

            /* renamed from: c */
            public final Throwable f64119c;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C26207b(@C12579k Throwable th) {
                super((DefaultConstructorMarker) null);
                Intrinsics.checkNotNullParameter(th, "throwable");
                this.f64119c = th;
            }

            /* renamed from: g */
            public static /* synthetic */ C26207b m112044g(C26207b bVar, Throwable th, int i, Object obj) {
                if ((i & 1) != 0) {
                    th = bVar.f64119c;
                }
                return bVar.mo76228f(th);
            }

            @C12579k
            /* renamed from: e */
            public final Throwable mo76226e() {
                return this.f64119c;
            }

            public boolean equals(@C12580l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C26207b) && Intrinsics.areEqual((Object) this.f64119c, (Object) ((C26207b) obj).f64119c);
            }

            @C12579k
            /* renamed from: f */
            public final C26207b mo76228f(@C12579k Throwable th) {
                Intrinsics.checkNotNullParameter(th, "throwable");
                return new C26207b(th);
            }

            @C12579k
            /* renamed from: h */
            public final Throwable mo76229h() {
                return this.f64119c;
            }

            public int hashCode() {
                return this.f64119c.hashCode();
            }

            @C12579k
            public String toString() {
                Throwable th = this.f64119c;
                return "ErrorEvent(throwable=" + th + ")";
            }
        }

        @C8567o(parameters = 0)
        /* renamed from: com.carrefour.fid.android.presentation.viewmodels.coupons.BarcodeViewModel$a$c */
        public static final class C26208c extends C26205a {

            /* renamed from: d */
            public static final int f64120d = 0;

            /* renamed from: c */
            public final boolean f64121c;

            public C26208c(boolean z) {
                super((DefaultConstructorMarker) null);
                this.f64121c = z;
            }

            /* renamed from: g */
            public static /* synthetic */ C26208c m112048g(C26208c cVar, boolean z, int i, Object obj) {
                if ((i & 1) != 0) {
                    z = cVar.f64121c;
                }
                return cVar.mo76234f(z);
            }

            /* renamed from: e */
            public final boolean mo76232e() {
                return this.f64121c;
            }

            public boolean equals(@C12580l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C26208c) && this.f64121c == ((C26208c) obj).f64121c;
            }

            @C12579k
            /* renamed from: f */
            public final C26208c mo76234f(boolean z) {
                return new C26208c(z);
            }

            /* renamed from: h */
            public final boolean mo76235h() {
                return this.f64121c;
            }

            public int hashCode() {
                boolean z = this.f64121c;
                if (z) {
                    return 1;
                }
                return z ? 1 : 0;
            }

            @C12579k
            public String toString() {
                boolean z = this.f64121c;
                return "Loading(showing=" + z + ")";
            }
        }

        @C8567o(parameters = 0)
        /* renamed from: com.carrefour.fid.android.presentation.viewmodels.coupons.BarcodeViewModel$a$d */
        public static final class C26209d extends C26205a {

            /* renamed from: d */
            public static final int f64122d = 8;
            @C12579k

            /* renamed from: c */
            public final Throwable f64123c;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C26209d(@C12579k Throwable th) {
                super((DefaultConstructorMarker) null);
                Intrinsics.checkNotNullParameter(th, "throwable");
                this.f64123c = th;
            }

            /* renamed from: g */
            public static /* synthetic */ C26209d m112052g(C26209d dVar, Throwable th, int i, Object obj) {
                if ((i & 1) != 0) {
                    th = dVar.f64123c;
                }
                return dVar.mo76240f(th);
            }

            @C12579k
            /* renamed from: e */
            public final Throwable mo76238e() {
                return this.f64123c;
            }

            public boolean equals(@C12580l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C26209d) && Intrinsics.areEqual((Object) this.f64123c, (Object) ((C26209d) obj).f64123c);
            }

            @C12579k
            /* renamed from: f */
            public final C26209d mo76240f(@C12579k Throwable th) {
                Intrinsics.checkNotNullParameter(th, "throwable");
                return new C26209d(th);
            }

            @C12579k
            /* renamed from: h */
            public final Throwable mo76241h() {
                return this.f64123c;
            }

            public int hashCode() {
                return this.f64123c.hashCode();
            }

            @C12579k
            public String toString() {
                Throwable th = this.f64123c;
                return "LoadingError(throwable=" + th + ")";
            }
        }

        public /* synthetic */ C26205a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @C11395k(level = DeprecationLevel.WARNING, message = "We should not be able to reset the current state. You should use [MVI.Event] instead.")
        @C12579k
        public C28505u.C28509d reset() {
            return C28505u.C28509d.C28510a.m118428a(this);
        }

        public C26205a() {
        }
    }

    @C8567o(parameters = 0)
    /* renamed from: com.carrefour.fid.android.presentation.viewmodels.coupons.BarcodeViewModel$b */
    public static final class C26210b implements C28505u.C28509d {
        @C12579k

        /* renamed from: e */
        public static final C26211a f64124e = new C26211a((DefaultConstructorMarker) null);

        /* renamed from: f */
        public static final int f64125f = 8;
        @C12579k

        /* renamed from: g */
        public static final C26210b f64126g = new C26210b(false, (List<CouponModel>) null, (Throwable) null);

        /* renamed from: b */
        public final boolean f64127b;
        @C12580l

        /* renamed from: c */
        public final List<CouponModel> f64128c;
        @C12580l

        /* renamed from: d */
        public final Throwable f64129d;

        /* renamed from: com.carrefour.fid.android.presentation.viewmodels.coupons.BarcodeViewModel$b$a */
        public static final class C26211a {
            public /* synthetic */ C26211a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            @C12579k
            /* renamed from: a */
            public final C26210b mo76255a() {
                return C26210b.f64126g;
            }

            public C26211a() {
            }
        }

        public C26210b(boolean z, @C12580l List<CouponModel> list, @C12580l Throwable th) {
            this.f64127b = z;
            this.f64128c = list;
            this.f64129d = th;
        }

        /* renamed from: j */
        public static /* synthetic */ C26210b m112057j(C26210b bVar, boolean z, List<CouponModel> list, Throwable th, int i, Object obj) {
            if ((i & 1) != 0) {
                z = bVar.f64127b;
            }
            if ((i & 2) != 0) {
                list = bVar.f64128c;
            }
            if ((i & 4) != 0) {
                th = bVar.f64129d;
            }
            return bVar.mo76249i(z, list, th);
        }

        public boolean equals(@C12580l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C26210b)) {
                return false;
            }
            C26210b bVar = (C26210b) obj;
            return this.f64127b == bVar.f64127b && Intrinsics.areEqual((Object) this.f64128c, (Object) bVar.f64128c) && Intrinsics.areEqual((Object) this.f64129d, (Object) bVar.f64129d);
        }

        /* renamed from: f */
        public final boolean mo76245f() {
            return this.f64127b;
        }

        @C12580l
        /* renamed from: g */
        public final List<CouponModel> mo76246g() {
            return this.f64128c;
        }

        @C12580l
        /* renamed from: h */
        public final Throwable mo76247h() {
            return this.f64129d;
        }

        public int hashCode() {
            boolean z = this.f64127b;
            if (z) {
                z = true;
            }
            int i = (z ? 1 : 0) * true;
            List<CouponModel> list = this.f64128c;
            int i2 = 0;
            int hashCode = (i + (list == null ? 0 : list.hashCode())) * 31;
            Throwable th = this.f64129d;
            if (th != null) {
                i2 = th.hashCode();
            }
            return hashCode + i2;
        }

        @C12579k
        /* renamed from: i */
        public final C26210b mo76249i(boolean z, @C12580l List<CouponModel> list, @C12580l Throwable th) {
            return new C26210b(z, list, th);
        }

        public final boolean isLoading() {
            return this.f64127b;
        }

        @C12580l
        /* renamed from: k */
        public final List<CouponModel> mo76251k() {
            return this.f64128c;
        }

        @C12580l
        /* renamed from: l */
        public final Throwable mo76252l() {
            return this.f64129d;
        }

        @C12579k
        /* renamed from: m */
        public C26210b reset() {
            return m112057j(this, false, (List) null, (Throwable) null, 3, (Object) null);
        }

        @C12579k
        public String toString() {
            boolean z = this.f64127b;
            List<CouponModel> list = this.f64128c;
            Throwable th = this.f64129d;
            return "UIState(isLoading=" + z + ", burnedList=" + list + ", errorEvent=" + th + ")";
        }
    }

    @C8567o(parameters = 0)
    /* renamed from: com.carrefour.fid.android.presentation.viewmodels.coupons.BarcodeViewModel$c */
    public static abstract class C26212c implements C28505u.C28507b {

        /* renamed from: a */
        public static final int f64130a = 0;

        @C8567o(parameters = 0)
        /* renamed from: com.carrefour.fid.android.presentation.viewmodels.coupons.BarcodeViewModel$c$a */
        public static final class C26213a extends C26212c {
            @C12579k

            /* renamed from: b */
            public static final C26213a f64131b = new C26213a();

            /* renamed from: c */
            public static final int f64132c = 0;

            public C26213a() {
                super((DefaultConstructorMarker) null);
            }
        }

        public /* synthetic */ C26212c(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public C26212c() {
        }
    }

    /* renamed from: com.carrefour.fid.android.presentation.viewmodels.coupons.BarcodeViewModel$d */
    public static final class C26214d implements C28505u.C28508c<C26210b, C26205a> {

        /* renamed from: a */
        public static final C26214d f64133a = new C26214d();

        @C12579k
        /* renamed from: b */
        public final C26210b mo32307a(@C12579k C26210b bVar, @C12579k C26205a aVar) {
            Intrinsics.checkNotNullParameter(bVar, "previousState");
            Intrinsics.checkNotNullParameter(aVar, "partial");
            C26210b m = bVar.reset();
            if (aVar instanceof C26205a.C26208c) {
                return C26210b.m112057j(m, ((C26205a.C26208c) aVar).mo76235h(), (List) null, (Throwable) null, 6, (Object) null);
            }
            if (aVar instanceof C26205a.C26209d) {
                return C26210b.m112057j(m, false, (List) null, ((C26205a.C26209d) aVar).mo76241h(), 2, (Object) null);
            }
            if (aVar instanceof C26205a.C26207b) {
                return C26210b.m112057j(m, false, (List) null, ((C26205a.C26207b) aVar).mo76229h(), 2, (Object) null);
            }
            if (aVar instanceof C26205a.C26206a) {
                return C26210b.m112057j(m, false, ((C26205a.C26206a) aVar).mo76223h(), (Throwable) null, 4, (Object) null);
            }
            throw new NoWhenBranchMatchedException();
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @Inject
    public BarcodeViewModel(@C12579k FetchCouponsUseCase fetchCouponsUseCase, @C12579k LoyaltyPreferencesStorage loyaltyPreferencesStorage, @C12579k C13783a aVar) {
        super(C26210b.f64124e.mo76255a(), (CoroutineDispatcher) null, (C19456p0) null, 6, (DefaultConstructorMarker) null);
        Intrinsics.checkNotNullParameter(fetchCouponsUseCase, "fetchCouponsUseCase");
        Intrinsics.checkNotNullParameter(loyaltyPreferencesStorage, "loyaltyPreferencesStorage");
        Intrinsics.checkNotNullParameter(aVar, "mAnalyticManager");
        this.f64111a = fetchCouponsUseCase;
        this.f64112b = loyaltyPreferencesStorage;
        this.f64113c = aVar;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0074, code lost:
        if (((java.lang.Boolean) r8).booleanValue() != false) goto L_0x0079;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0078, code lost:
        return kotlin.C11079d2.f28267a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0079, code lost:
        r8 = new com.carrefour.fid.android.presentation.viewmodels.coupons.BarcodeViewModel.C26205a.C26208c(true);
        r0.L$0 = r2;
        r0.label = 2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0087, code lost:
        if (r2.mo76218j0(r8, r0) != r1) goto L_0x008a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0089, code lost:
        return r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x008a, code lost:
        r8 = r2.f64111a;
        r3 = r2.f64112b;
        r0.L$0 = r2;
        r0.L$1 = r8;
        r0.label = 3;
        r3 = r3.getLoyaltyCardNumber(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0099, code lost:
        if (r3 != r1) goto L_0x009c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x009b, code lost:
        return r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x009c, code lost:
        r6 = r2;
        r2 = r8;
        r8 = r3;
        r3 = r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x00a0, code lost:
        r5 = new com.carrefour.fid.android.domain.interactors.coupons.FetchCouponsUseCase.C37633a((java.lang.String) r8);
        r0.L$0 = r3;
        r0.L$1 = null;
        r0.label = 4;
        r8 = r2.m172950invokegIAlus(r5, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x00b2, code lost:
        if (r8 != r1) goto L_0x00b5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x00b4, code lost:
        return r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00b5, code lost:
        r2 = r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00b6, code lost:
        r3 = kotlin.Result.m38705e(r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00ba, code lost:
        if (r3 != null) goto L_0x00fe;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00bc, code lost:
        r8 = ((com.carrefour.fid.android.domain.models.C37974c) r8).mo117039f();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00c2, code lost:
        if (r8 == null) goto L_0x00e9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00c4, code lost:
        r8 = r8;
        r3 = new java.util.ArrayList(kotlin.collections.C10978t.m41495Y(r8, 10));
        r8 = r8.iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00d9, code lost:
        if (r8.hasNext() == false) goto L_0x00ed;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00db, code lost:
        r3.add(com.carrefour.fid.android.presentation.models.extension.C38465d.m159623b((com.carrefour.fid.android.domain.models.C38015d) r8.next()));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00e9, code lost:
        r3 = kotlin.collections.CollectionsKt__CollectionsKt.m40441E();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00ed, code lost:
        r8 = new com.carrefour.fid.android.presentation.viewmodels.coupons.BarcodeViewModel.C26205a.C26206a(r3);
        r0.L$0 = null;
        r0.label = 5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x00fb, code lost:
        if (r2.mo76218j0(r8, r0) != r1) goto L_0x010f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00fd, code lost:
        return r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x00fe, code lost:
        r8 = new com.carrefour.fid.android.presentation.viewmodels.coupons.BarcodeViewModel.C26205a.C26209d(r3);
        r0.L$0 = null;
        r0.label = 6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x010c, code lost:
        if (r2.mo76218j0(r8, r0) != r1) goto L_0x010f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x010e, code lost:
        return r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x0111, code lost:
        return kotlin.C11079d2.f28267a;
     */
    /* JADX WARNING: Removed duplicated region for block: B:10:0x002d  */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0032  */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0041  */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x004d  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0055  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x005d  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0025  */
    /* renamed from: g0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo76215g0(kotlin.coroutines.C11045c<? super kotlin.C11079d2> r8) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof com.carrefour.fid.android.presentation.viewmodels.coupons.BarcodeViewModel$fetchBurnedList$1
            if (r0 == 0) goto L_0x0013
            r0 = r8
            com.carrefour.fid.android.presentation.viewmodels.coupons.BarcodeViewModel$fetchBurnedList$1 r0 = (com.carrefour.fid.android.presentation.viewmodels.coupons.BarcodeViewModel$fetchBurnedList$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.carrefour.fid.android.presentation.viewmodels.coupons.BarcodeViewModel$fetchBurnedList$1 r0 = new com.carrefour.fid.android.presentation.viewmodels.coupons.BarcodeViewModel$fetchBurnedList$1
            r0.<init>(r7, r8)
        L_0x0018:
            java.lang.Object r8 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r2 = r0.label
            r3 = 1
            r4 = 0
            switch(r2) {
                case 0: goto L_0x005d;
                case 1: goto L_0x0055;
                case 2: goto L_0x004d;
                case 3: goto L_0x0041;
                case 4: goto L_0x0032;
                case 5: goto L_0x002d;
                case 6: goto L_0x002d;
                default: goto L_0x0025;
            }
        L_0x0025:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L_0x002d:
            kotlin.C11661u0.m45747n(r8)
            goto L_0x010f
        L_0x0032:
            java.lang.Object r2 = r0.L$0
            com.carrefour.fid.android.presentation.viewmodels.coupons.BarcodeViewModel r2 = (com.carrefour.fid.android.presentation.viewmodels.coupons.BarcodeViewModel) r2
            kotlin.C11661u0.m45747n(r8)
            kotlin.Result r8 = (kotlin.Result) r8
            java.lang.Object r8 = r8.mo21858l()
            goto L_0x00b6
        L_0x0041:
            java.lang.Object r2 = r0.L$1
            com.carrefour.fid.android.domain.interactors.coupons.FetchCouponsUseCase r2 = (com.carrefour.fid.android.domain.interactors.coupons.FetchCouponsUseCase) r2
            java.lang.Object r3 = r0.L$0
            com.carrefour.fid.android.presentation.viewmodels.coupons.BarcodeViewModel r3 = (com.carrefour.fid.android.presentation.viewmodels.coupons.BarcodeViewModel) r3
            kotlin.C11661u0.m45747n(r8)
            goto L_0x00a0
        L_0x004d:
            java.lang.Object r2 = r0.L$0
            com.carrefour.fid.android.presentation.viewmodels.coupons.BarcodeViewModel r2 = (com.carrefour.fid.android.presentation.viewmodels.coupons.BarcodeViewModel) r2
            kotlin.C11661u0.m45747n(r8)
            goto L_0x008a
        L_0x0055:
            java.lang.Object r2 = r0.L$0
            com.carrefour.fid.android.presentation.viewmodels.coupons.BarcodeViewModel r2 = (com.carrefour.fid.android.presentation.viewmodels.coupons.BarcodeViewModel) r2
            kotlin.C11661u0.m45747n(r8)
            goto L_0x006e
        L_0x005d:
            kotlin.C11661u0.m45747n(r8)
            com.carrefour.fid.android.loyalty.core.datastore.LoyaltyPreferencesStorage r8 = r7.f64112b
            r0.L$0 = r7
            r0.label = r3
            java.lang.Object r8 = r8.hasLoyaltyCard(r0)
            if (r8 != r1) goto L_0x006d
            return r1
        L_0x006d:
            r2 = r7
        L_0x006e:
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            boolean r8 = r8.booleanValue()
            if (r8 != 0) goto L_0x0079
            kotlin.d2 r8 = kotlin.C11079d2.f28267a
            return r8
        L_0x0079:
            com.carrefour.fid.android.presentation.viewmodels.coupons.BarcodeViewModel$a$c r8 = new com.carrefour.fid.android.presentation.viewmodels.coupons.BarcodeViewModel$a$c
            r8.<init>(r3)
            r0.L$0 = r2
            r3 = 2
            r0.label = r3
            java.lang.Object r8 = r2.mo76218j0(r8, r0)
            if (r8 != r1) goto L_0x008a
            return r1
        L_0x008a:
            com.carrefour.fid.android.domain.interactors.coupons.FetchCouponsUseCase r8 = r2.f64111a
            com.carrefour.fid.android.loyalty.core.datastore.LoyaltyPreferencesStorage r3 = r2.f64112b
            r0.L$0 = r2
            r0.L$1 = r8
            r5 = 3
            r0.label = r5
            java.lang.Object r3 = r3.getLoyaltyCardNumber(r0)
            if (r3 != r1) goto L_0x009c
            return r1
        L_0x009c:
            r6 = r2
            r2 = r8
            r8 = r3
            r3 = r6
        L_0x00a0:
            java.lang.String r8 = (java.lang.String) r8
            com.carrefour.fid.android.domain.interactors.coupons.FetchCouponsUseCase$a r5 = new com.carrefour.fid.android.domain.interactors.coupons.FetchCouponsUseCase$a
            r5.<init>(r8)
            r0.L$0 = r3
            r0.L$1 = r4
            r8 = 4
            r0.label = r8
            java.lang.Object r8 = r2.m172950invokegIAlus(r5, r0)
            if (r8 != r1) goto L_0x00b5
            return r1
        L_0x00b5:
            r2 = r3
        L_0x00b6:
            java.lang.Throwable r3 = kotlin.Result.m38705e(r8)
            if (r3 != 0) goto L_0x00fe
            com.carrefour.fid.android.domain.models.c r8 = (com.carrefour.fid.android.domain.models.C37974c) r8
            java.util.List r8 = r8.mo117039f()
            if (r8 == 0) goto L_0x00e9
            java.lang.Iterable r8 = (java.lang.Iterable) r8
            java.util.ArrayList r3 = new java.util.ArrayList
            r5 = 10
            int r5 = kotlin.collections.C10978t.m41495Y(r8, r5)
            r3.<init>(r5)
            java.util.Iterator r8 = r8.iterator()
        L_0x00d5:
            boolean r5 = r8.hasNext()
            if (r5 == 0) goto L_0x00ed
            java.lang.Object r5 = r8.next()
            com.carrefour.fid.android.domain.models.d r5 = (com.carrefour.fid.android.domain.models.C38015d) r5
            com.carrefour.fid.android.presentation.models.CouponModel r5 = com.carrefour.fid.android.presentation.models.extension.C38465d.m159623b(r5)
            r3.add(r5)
            goto L_0x00d5
        L_0x00e9:
            java.util.List r3 = kotlin.collections.CollectionsKt__CollectionsKt.m40441E()
        L_0x00ed:
            com.carrefour.fid.android.presentation.viewmodels.coupons.BarcodeViewModel$a$a r8 = new com.carrefour.fid.android.presentation.viewmodels.coupons.BarcodeViewModel$a$a
            r8.<init>(r3)
            r0.L$0 = r4
            r3 = 5
            r0.label = r3
            java.lang.Object r8 = r2.mo76218j0(r8, r0)
            if (r8 != r1) goto L_0x010f
            return r1
        L_0x00fe:
            com.carrefour.fid.android.presentation.viewmodels.coupons.BarcodeViewModel$a$d r8 = new com.carrefour.fid.android.presentation.viewmodels.coupons.BarcodeViewModel$a$d
            r8.<init>(r3)
            r0.L$0 = r4
            r3 = 6
            r0.label = r3
            java.lang.Object r8 = r2.mo76218j0(r8, r0)
            if (r8 != r1) goto L_0x010f
            return r1
        L_0x010f:
            kotlin.d2 r8 = kotlin.C11079d2.f28267a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.presentation.viewmodels.coupons.BarcodeViewModel.mo76215g0(kotlin.coroutines.c):java.lang.Object");
    }

    /* renamed from: h0 */
    public final Object mo76216h0(C11045c<? super C11079d2> cVar) {
        sendScreenView();
        Object g0 = mo76215g0(cVar);
        if (g0 == C11063b.m42612h()) {
            return g0;
        }
        return C11079d2.f28267a;
    }

    @C12580l
    /* renamed from: i0 */
    public Object processIntent(@C12579k C26212c cVar, @C12579k C11045c<? super C11079d2> cVar2) {
        C11723c2 unused = C12038j.m48061f(C19500w0.m90846a(this), (CoroutineContext) null, (CoroutineStart) null, new BarcodeViewModel$processIntent$2(cVar, this, (C11045c<? super BarcodeViewModel$processIntent$2>) null), 3, (Object) null);
        return C11079d2.f28267a;
    }

    /* renamed from: j0 */
    public final Object mo76218j0(C26205a aVar, C11045c<? super C11079d2> cVar) {
        reduceAndPublishState(this.f64114d, aVar);
        return C11079d2.f28267a;
    }

    public final void sendScreenView() {
        C13783a.m58667i(this.f64113c, "coupons", "liste-coupons-code-barre", (Map) null, false, false, false, 60, (Object) null);
    }
}
