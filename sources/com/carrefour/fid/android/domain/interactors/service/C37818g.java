package com.carrefour.fid.android.domain.interactors.service;

import com.carrefour.fid.android.domain.interactors.C37679f;
import com.carrefour.fid.android.domain.models.service.models.C38162k;
import com.carrefour.fid.android.domain.models.service.models.C38166m;
import com.carrefour.fid.android.domain.models.service.models.StoreServiceType;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

/* renamed from: com.carrefour.fid.android.domain.interactors.service.g */
public interface C37818g extends C37679f<C37819a, C38162k> {

    /* renamed from: com.carrefour.fid.android.domain.interactors.service.g$a */
    public static final class C37819a {
        @C12580l

        /* renamed from: a */
        public final C38166m f94909a;

        /* renamed from: b */
        public final boolean f94910b;
        @C12579k

        /* renamed from: c */
        public final StoreServiceType f94911c;

        public C37819a(@C12580l C38166m mVar, boolean z, @C12579k StoreServiceType storeServiceType) {
            Intrinsics.checkNotNullParameter(storeServiceType, "serviceType");
            this.f94909a = mVar;
            this.f94910b = z;
            this.f94911c = storeServiceType;
        }

        /* renamed from: e */
        public static /* synthetic */ C37819a m154999e(C37819a aVar, C38166m mVar, boolean z, StoreServiceType storeServiceType, int i, Object obj) {
            if ((i & 1) != 0) {
                mVar = aVar.f94909a;
            }
            if ((i & 2) != 0) {
                z = aVar.f94910b;
            }
            if ((i & 4) != 0) {
                storeServiceType = aVar.f94911c;
            }
            return aVar.mo115235d(mVar, z, storeServiceType);
        }

        @C12580l
        /* renamed from: a */
        public final C38166m mo115232a() {
            return this.f94909a;
        }

        /* renamed from: b */
        public final boolean mo115233b() {
            return this.f94910b;
        }

        @C12579k
        /* renamed from: c */
        public final StoreServiceType mo115234c() {
            return this.f94911c;
        }

        @C12579k
        /* renamed from: d */
        public final C37819a mo115235d(@C12580l C38166m mVar, boolean z, @C12579k StoreServiceType storeServiceType) {
            Intrinsics.checkNotNullParameter(storeServiceType, "serviceType");
            return new C37819a(mVar, z, storeServiceType);
        }

        public boolean equals(@C12580l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C37819a)) {
                return false;
            }
            C37819a aVar = (C37819a) obj;
            return Intrinsics.areEqual((Object) this.f94909a, (Object) aVar.f94909a) && this.f94910b == aVar.f94910b && Intrinsics.areEqual((Object) this.f94911c, (Object) aVar.f94911c);
        }

        @C12579k
        /* renamed from: f */
        public final StoreServiceType mo115237f() {
            return this.f94911c;
        }

        @C12580l
        /* renamed from: g */
        public final C38166m mo115238g() {
            return this.f94909a;
        }

        /* renamed from: h */
        public final boolean mo115239h() {
            return this.f94910b;
        }

        public int hashCode() {
            C38166m mVar = this.f94909a;
            int hashCode = (mVar == null ? 0 : mVar.hashCode()) * 31;
            boolean z = this.f94910b;
            if (z) {
                z = true;
            }
            return ((hashCode + (z ? 1 : 0)) * 31) + this.f94911c.hashCode();
        }

        @C12579k
        public String toString() {
            C38166m mVar = this.f94909a;
            boolean z = this.f94910b;
            StoreServiceType storeServiceType = this.f94911c;
            return "Param(storeFacility=" + mVar + ", isExpress=" + z + ", serviceType=" + storeServiceType + ")";
        }
    }
}
