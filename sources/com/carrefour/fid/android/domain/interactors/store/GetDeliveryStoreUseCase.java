package com.carrefour.fid.android.domain.interactors.store;

import androidx.autofill.C0861a;
import androidx.compose.runtime.internal.C8567o;
import com.carrefour.fid.android.domain.interactors.C37679f;
import com.carrefour.fid.android.domain.interactors.address.C37542a;
import com.carrefour.fid.android.domain.interactors.service.C37812b;
import com.carrefour.fid.android.domain.models.service.models.C38166m;
import javax.inject.Inject;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C8567o(parameters = 0)
public final class GetDeliveryStoreUseCase implements C37679f<C37869a, C38166m> {

    /* renamed from: c */
    public static final int f94976c = 8;
    @C12579k

    /* renamed from: a */
    public final C37542a f94977a;
    @C12579k

    /* renamed from: b */
    public final C37812b f94978b;

    @C8567o(parameters = 0)
    /* renamed from: com.carrefour.fid.android.domain.interactors.store.GetDeliveryStoreUseCase$a */
    public static final class C37869a {

        /* renamed from: c */
        public static final int f94979c = 0;
        @C12579k

        /* renamed from: a */
        public final String f94980a;
        @C12580l

        /* renamed from: b */
        public final String f94981b;

        public C37869a(@C12579k String str, @C12580l String str2) {
            Intrinsics.checkNotNullParameter(str, C0861a.f2707g);
            this.f94980a = str;
            this.f94981b = str2;
        }

        /* renamed from: d */
        public static /* synthetic */ C37869a m155109d(C37869a aVar, String str, String str2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = aVar.f94980a;
            }
            if ((i & 2) != 0) {
                str2 = aVar.f94981b;
            }
            return aVar.mo115343c(str, str2);
        }

        @C12579k
        /* renamed from: a */
        public final String mo115341a() {
            return this.f94980a;
        }

        @C12580l
        /* renamed from: b */
        public final String mo115342b() {
            return this.f94981b;
        }

        @C12579k
        /* renamed from: c */
        public final C37869a mo115343c(@C12579k String str, @C12580l String str2) {
            Intrinsics.checkNotNullParameter(str, C0861a.f2707g);
            return new C37869a(str, str2);
        }

        @C12580l
        /* renamed from: e */
        public final String mo115344e() {
            return this.f94981b;
        }

        public boolean equals(@C12580l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C37869a)) {
                return false;
            }
            C37869a aVar = (C37869a) obj;
            return Intrinsics.areEqual((Object) this.f94980a, (Object) aVar.f94980a) && Intrinsics.areEqual((Object) this.f94981b, (Object) aVar.f94981b);
        }

        @C12579k
        /* renamed from: f */
        public final String mo115346f() {
            return this.f94980a;
        }

        public int hashCode() {
            int hashCode = this.f94980a.hashCode() * 31;
            String str = this.f94981b;
            return hashCode + (str == null ? 0 : str.hashCode());
        }

        @C12579k
        public String toString() {
            String str = this.f94980a;
            String str2 = this.f94981b;
            return "Param(postalCode=" + str + ", city=" + str2 + ")";
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ C37869a(String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, (i & 2) != 0 ? null : str2);
        }
    }

    @Inject
    public GetDeliveryStoreUseCase(@C12579k C37542a aVar, @C12579k C37812b bVar) {
        Intrinsics.checkNotNullParameter(aVar, "getAddressGeolocationUseCase");
        Intrinsics.checkNotNullParameter(bVar, "fetchDeliveryStoreUseCase");
        this.f94977a = aVar;
        this.f94978b = bVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x004f  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0073 A[SYNTHETIC, Splitter:B:22:0x0073] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0028  */
    @org.jetbrains.annotations.C12580l
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object m173012invokegIAlus(@org.jetbrains.annotations.C12579k com.carrefour.fid.android.domain.interactors.store.GetDeliveryStoreUseCase.C37869a r21, @org.jetbrains.annotations.C12579k kotlin.coroutines.C11045c<? super kotlin.Result<com.carrefour.fid.android.domain.models.service.models.C38166m>> r22) {
        /*
            r20 = this;
            r1 = r20
            r0 = r22
            boolean r2 = r0 instanceof com.carrefour.fid.android.domain.interactors.store.GetDeliveryStoreUseCase$invoke$1
            if (r2 == 0) goto L_0x0017
            r2 = r0
            com.carrefour.fid.android.domain.interactors.store.GetDeliveryStoreUseCase$invoke$1 r2 = (com.carrefour.fid.android.domain.interactors.store.GetDeliveryStoreUseCase$invoke$1) r2
            int r3 = r2.label
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L_0x0017
            int r3 = r3 - r4
            r2.label = r3
            goto L_0x001c
        L_0x0017:
            com.carrefour.fid.android.domain.interactors.store.GetDeliveryStoreUseCase$invoke$1 r2 = new com.carrefour.fid.android.domain.interactors.store.GetDeliveryStoreUseCase$invoke$1
            r2.<init>(r1, r0)
        L_0x001c:
            java.lang.Object r0 = r2.result
            java.lang.Object r3 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r4 = r2.label
            r5 = 2
            r6 = 1
            if (r4 == 0) goto L_0x004f
            if (r4 == r6) goto L_0x0041
            if (r4 != r5) goto L_0x0039
            kotlin.C11661u0.m45747n(r0)     // Catch:{ all -> 0x0036 }
            kotlin.Result r0 = (kotlin.Result) r0     // Catch:{ all -> 0x0036 }
            java.lang.Object r0 = r0.mo21858l()     // Catch:{ all -> 0x0036 }
            goto L_0x00a3
        L_0x0036:
            r0 = move-exception
            goto L_0x00ad
        L_0x0039:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r2)
            throw r0
        L_0x0041:
            java.lang.Object r4 = r2.L$0
            com.carrefour.fid.android.domain.interactors.store.GetDeliveryStoreUseCase r4 = (com.carrefour.fid.android.domain.interactors.store.GetDeliveryStoreUseCase) r4
            kotlin.C11661u0.m45747n(r0)
            kotlin.Result r0 = (kotlin.Result) r0
            java.lang.Object r0 = r0.mo21858l()
            goto L_0x006d
        L_0x004f:
            kotlin.C11661u0.m45747n(r0)
            com.carrefour.fid.android.domain.interactors.address.a r0 = r1.f94977a
            com.carrefour.fid.android.domain.interactors.address.a$a r4 = new com.carrefour.fid.android.domain.interactors.address.a$a
            java.lang.String r7 = r21.mo115346f()
            java.lang.String r8 = r21.mo115344e()
            r4.<init>(r7, r8)
            r2.L$0 = r1
            r2.label = r6
            java.lang.Object r0 = r0.m172966invokegIAlus(r4, r2)
            if (r0 != r3) goto L_0x006c
            return r3
        L_0x006c:
            r4 = r1
        L_0x006d:
            boolean r6 = kotlin.Result.m38710j(r0)
            if (r6 == 0) goto L_0x00b3
            kotlin.Result$a r6 = kotlin.Result.f28060a     // Catch:{ all -> 0x0036 }
            com.carrefour.fid.android.domain.models.LatLon r0 = (com.carrefour.fid.android.domain.models.LatLon) r0     // Catch:{ all -> 0x0036 }
            com.carrefour.fid.android.domain.interactors.service.b r4 = r4.f94978b     // Catch:{ all -> 0x0036 }
            com.carrefour.fid.android.domain.interactors.service.b$a r15 = new com.carrefour.fid.android.domain.interactors.service.b$a     // Catch:{ all -> 0x0036 }
            double r7 = r0.getLatitude()     // Catch:{ all -> 0x0036 }
            double r9 = r0.getLongitude()     // Catch:{ all -> 0x0036 }
            r11 = 0
            r12 = 0
            r13 = 0
            r14 = 0
            r0 = 0
            r16 = 0
            r17 = 252(0xfc, float:3.53E-43)
            r18 = 0
            r6 = r15
            r19 = r15
            r15 = r0
            r6.<init>(r7, r9, r11, r12, r13, r14, r15, r16, r17, r18)     // Catch:{ all -> 0x0036 }
            r0 = 0
            r2.L$0 = r0     // Catch:{ all -> 0x0036 }
            r2.label = r5     // Catch:{ all -> 0x0036 }
            r0 = r19
            java.lang.Object r0 = r4.m172966invokegIAlus(r0, r2)     // Catch:{ all -> 0x0036 }
            if (r0 != r3) goto L_0x00a3
            return r3
        L_0x00a3:
            kotlin.C11661u0.m45747n(r0)     // Catch:{ all -> 0x0036 }
            com.carrefour.fid.android.domain.models.service.models.m r0 = (com.carrefour.fid.android.domain.models.service.models.C38166m) r0     // Catch:{ all -> 0x0036 }
            java.lang.Object r0 = kotlin.Result.m38702b(r0)     // Catch:{ all -> 0x0036 }
            goto L_0x00b7
        L_0x00ad:
            kotlin.Result$a r2 = kotlin.Result.f28060a
            java.lang.Object r0 = kotlin.C11661u0.m45734a(r0)
        L_0x00b3:
            java.lang.Object r0 = kotlin.Result.m38702b(r0)
        L_0x00b7:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.domain.interactors.store.GetDeliveryStoreUseCase.m173012invokegIAlus(com.carrefour.fid.android.domain.interactors.store.GetDeliveryStoreUseCase$a, kotlin.coroutines.c):java.lang.Object");
    }
}
