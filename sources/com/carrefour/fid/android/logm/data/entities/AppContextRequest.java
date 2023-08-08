package com.carrefour.fid.android.logm.data.entities;

import androidx.annotation.Keep;
import com.urbanairship.analytics.C35517a;
import kotlin.C11076d0;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0018B/\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\u0016\u0010\u0017R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u0019\u0010\r\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u0019\u0010\u0012\u001a\u0004\u0018\u00010\u00118\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0019"}, mo22516d2 = {"Lcom/carrefour/fid/android/logm/data/entities/AppContextRequest;", "", "Lcom/carrefour/fid/android/logm/data/entities/AppContextBasketRequest;", "basket", "Lcom/carrefour/fid/android/logm/data/entities/AppContextBasketRequest;", "getBasket", "()Lcom/carrefour/fid/android/logm/data/entities/AppContextBasketRequest;", "Lcom/carrefour/fid/android/logm/data/entities/AppContextFacilityRequest;", "facility", "Lcom/carrefour/fid/android/logm/data/entities/AppContextFacilityRequest;", "getFacility", "()Lcom/carrefour/fid/android/logm/data/entities/AppContextFacilityRequest;", "Lcom/carrefour/fid/android/logm/data/entities/AppContextAccountRequest;", "account", "Lcom/carrefour/fid/android/logm/data/entities/AppContextAccountRequest;", "getAccount", "()Lcom/carrefour/fid/android/logm/data/entities/AppContextAccountRequest;", "Lcom/carrefour/fid/android/logm/data/entities/AppContextLoyaltyRequest;", "loyalty", "Lcom/carrefour/fid/android/logm/data/entities/AppContextLoyaltyRequest;", "getLoyalty", "()Lcom/carrefour/fid/android/logm/data/entities/AppContextLoyaltyRequest;", "<init>", "(Lcom/carrefour/fid/android/logm/data/entities/AppContextBasketRequest;Lcom/carrefour/fid/android/logm/data/entities/AppContextFacilityRequest;Lcom/carrefour/fid/android/logm/data/entities/AppContextAccountRequest;Lcom/carrefour/fid/android/logm/data/entities/AppContextLoyaltyRequest;)V", "a", "logM_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
@Keep
public final class AppContextRequest {
    @C12580l
    private final AppContextAccountRequest account;
    @C12580l
    private final AppContextBasketRequest basket;
    @C12580l
    private final AppContextFacilityRequest facility;
    @C12580l
    private final AppContextLoyaltyRequest loyalty;

    @C11363r0({"SMAP\nAppContextRequest.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AppContextRequest.kt\ncom/carrefour/fid/android/logm/data/entities/AppContextRequest$Builder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,27:1\n1#2:28\n*E\n"})
    /* renamed from: com.carrefour.fid.android.logm.data.entities.AppContextRequest$a */
    public static final class C38272a {
        @C12580l

        /* renamed from: a */
        public AppContextBasketRequest f96947a;
        @C12580l

        /* renamed from: b */
        public AppContextFacilityRequest f96948b;
        @C12580l

        /* renamed from: c */
        public AppContextAccountRequest f96949c;
        @C12580l

        /* renamed from: d */
        public AppContextLoyaltyRequest f96950d;

        public C38272a() {
            this((AppContextBasketRequest) null, (AppContextFacilityRequest) null, (AppContextAccountRequest) null, (AppContextLoyaltyRequest) null, 15, (DefaultConstructorMarker) null);
        }

        /* renamed from: i */
        public static /* synthetic */ C38272a m158553i(C38272a aVar, AppContextBasketRequest appContextBasketRequest, AppContextFacilityRequest appContextFacilityRequest, AppContextAccountRequest appContextAccountRequest, AppContextLoyaltyRequest appContextLoyaltyRequest, int i, Object obj) {
            if ((i & 1) != 0) {
                appContextBasketRequest = aVar.f96947a;
            }
            if ((i & 2) != 0) {
                appContextFacilityRequest = aVar.f96948b;
            }
            if ((i & 4) != 0) {
                appContextAccountRequest = aVar.f96949c;
            }
            if ((i & 8) != 0) {
                appContextLoyaltyRequest = aVar.f96950d;
            }
            return aVar.mo119797h(appContextBasketRequest, appContextFacilityRequest, appContextAccountRequest, appContextLoyaltyRequest);
        }

        @C12579k
        /* renamed from: a */
        public final C38272a mo119789a(@C12579k AppContextAccountRequest appContextAccountRequest) {
            Intrinsics.checkNotNullParameter(appContextAccountRequest, C35517a.f87583g);
            this.f96949c = appContextAccountRequest;
            return this;
        }

        @C12579k
        /* renamed from: b */
        public final C38272a mo119790b(@C12579k AppContextBasketRequest appContextBasketRequest) {
            Intrinsics.checkNotNullParameter(appContextBasketRequest, "basket");
            this.f96947a = appContextBasketRequest;
            return this;
        }

        @C12579k
        /* renamed from: c */
        public final AppContextRequest mo119791c() {
            return new AppContextRequest(this.f96947a, this.f96948b, this.f96949c, this.f96950d);
        }

        @C12580l
        /* renamed from: d */
        public final AppContextBasketRequest mo119792d() {
            return this.f96947a;
        }

        @C12580l
        /* renamed from: e */
        public final AppContextFacilityRequest mo119793e() {
            return this.f96948b;
        }

        public boolean equals(@C12580l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C38272a)) {
                return false;
            }
            C38272a aVar = (C38272a) obj;
            return Intrinsics.areEqual((Object) this.f96947a, (Object) aVar.f96947a) && Intrinsics.areEqual((Object) this.f96948b, (Object) aVar.f96948b) && Intrinsics.areEqual((Object) this.f96949c, (Object) aVar.f96949c) && Intrinsics.areEqual((Object) this.f96950d, (Object) aVar.f96950d);
        }

        @C12580l
        /* renamed from: f */
        public final AppContextAccountRequest mo119795f() {
            return this.f96949c;
        }

        @C12580l
        /* renamed from: g */
        public final AppContextLoyaltyRequest mo119796g() {
            return this.f96950d;
        }

        @C12579k
        /* renamed from: h */
        public final C38272a mo119797h(@C12580l AppContextBasketRequest appContextBasketRequest, @C12580l AppContextFacilityRequest appContextFacilityRequest, @C12580l AppContextAccountRequest appContextAccountRequest, @C12580l AppContextLoyaltyRequest appContextLoyaltyRequest) {
            return new C38272a(appContextBasketRequest, appContextFacilityRequest, appContextAccountRequest, appContextLoyaltyRequest);
        }

        public int hashCode() {
            AppContextBasketRequest appContextBasketRequest = this.f96947a;
            int i = 0;
            int hashCode = (appContextBasketRequest == null ? 0 : appContextBasketRequest.hashCode()) * 31;
            AppContextFacilityRequest appContextFacilityRequest = this.f96948b;
            int hashCode2 = (hashCode + (appContextFacilityRequest == null ? 0 : appContextFacilityRequest.hashCode())) * 31;
            AppContextAccountRequest appContextAccountRequest = this.f96949c;
            int hashCode3 = (hashCode2 + (appContextAccountRequest == null ? 0 : appContextAccountRequest.hashCode())) * 31;
            AppContextLoyaltyRequest appContextLoyaltyRequest = this.f96950d;
            if (appContextLoyaltyRequest != null) {
                i = appContextLoyaltyRequest.hashCode();
            }
            return hashCode3 + i;
        }

        @C12579k
        /* renamed from: j */
        public final C38272a mo119799j(@C12579k AppContextFacilityRequest appContextFacilityRequest) {
            Intrinsics.checkNotNullParameter(appContextFacilityRequest, "facility");
            this.f96948b = appContextFacilityRequest;
            return this;
        }

        @C12580l
        /* renamed from: k */
        public final AppContextAccountRequest mo119800k() {
            return this.f96949c;
        }

        @C12580l
        /* renamed from: l */
        public final AppContextBasketRequest mo119801l() {
            return this.f96947a;
        }

        @C12580l
        /* renamed from: m */
        public final AppContextFacilityRequest mo119802m() {
            return this.f96948b;
        }

        @C12580l
        /* renamed from: n */
        public final AppContextLoyaltyRequest mo119803n() {
            return this.f96950d;
        }

        @C12579k
        /* renamed from: o */
        public final C38272a mo119804o(@C12579k AppContextLoyaltyRequest appContextLoyaltyRequest) {
            Intrinsics.checkNotNullParameter(appContextLoyaltyRequest, "loyalty");
            this.f96950d = appContextLoyaltyRequest;
            return this;
        }

        /* renamed from: p */
        public final void mo119805p(@C12580l AppContextAccountRequest appContextAccountRequest) {
            this.f96949c = appContextAccountRequest;
        }

        /* renamed from: q */
        public final void mo119806q(@C12580l AppContextBasketRequest appContextBasketRequest) {
            this.f96947a = appContextBasketRequest;
        }

        /* renamed from: r */
        public final void mo119807r(@C12580l AppContextFacilityRequest appContextFacilityRequest) {
            this.f96948b = appContextFacilityRequest;
        }

        /* renamed from: s */
        public final void mo119808s(@C12580l AppContextLoyaltyRequest appContextLoyaltyRequest) {
            this.f96950d = appContextLoyaltyRequest;
        }

        @C12579k
        public String toString() {
            AppContextBasketRequest appContextBasketRequest = this.f96947a;
            AppContextFacilityRequest appContextFacilityRequest = this.f96948b;
            AppContextAccountRequest appContextAccountRequest = this.f96949c;
            AppContextLoyaltyRequest appContextLoyaltyRequest = this.f96950d;
            return "Builder(basket=" + appContextBasketRequest + ", facility=" + appContextFacilityRequest + ", account=" + appContextAccountRequest + ", loyalty=" + appContextLoyaltyRequest + ")";
        }

        public C38272a(@C12580l AppContextBasketRequest appContextBasketRequest, @C12580l AppContextFacilityRequest appContextFacilityRequest, @C12580l AppContextAccountRequest appContextAccountRequest, @C12580l AppContextLoyaltyRequest appContextLoyaltyRequest) {
            this.f96947a = appContextBasketRequest;
            this.f96948b = appContextFacilityRequest;
            this.f96949c = appContextAccountRequest;
            this.f96950d = appContextLoyaltyRequest;
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ C38272a(AppContextBasketRequest appContextBasketRequest, AppContextFacilityRequest appContextFacilityRequest, AppContextAccountRequest appContextAccountRequest, AppContextLoyaltyRequest appContextLoyaltyRequest, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : appContextBasketRequest, (i & 2) != 0 ? null : appContextFacilityRequest, (i & 4) != 0 ? null : appContextAccountRequest, (i & 8) != 0 ? null : appContextLoyaltyRequest);
        }
    }

    public AppContextRequest(@C12580l AppContextBasketRequest appContextBasketRequest, @C12580l AppContextFacilityRequest appContextFacilityRequest, @C12580l AppContextAccountRequest appContextAccountRequest, @C12580l AppContextLoyaltyRequest appContextLoyaltyRequest) {
        this.basket = appContextBasketRequest;
        this.facility = appContextFacilityRequest;
        this.account = appContextAccountRequest;
        this.loyalty = appContextLoyaltyRequest;
    }

    @C12580l
    public final AppContextAccountRequest getAccount() {
        return this.account;
    }

    @C12580l
    public final AppContextBasketRequest getBasket() {
        return this.basket;
    }

    @C12580l
    public final AppContextFacilityRequest getFacility() {
        return this.facility;
    }

    @C12580l
    public final AppContextLoyaltyRequest getLoyalty() {
        return this.loyalty;
    }
}
