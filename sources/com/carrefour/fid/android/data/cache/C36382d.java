package com.carrefour.fid.android.data.cache;

import androidx.compose.runtime.internal.C8567o;
import com.carrefour.fid.android.domain.models.FacilityDomain;
import com.carrefour.fid.android.shared.base.C28484f;
import java.util.List;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

@C8567o(parameters = 0)
@C11363r0({"SMAP\nFacilitiesCache.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FacilitiesCache.kt\ncom/carrefour/fid/android/data/cache/FacilitiesCache\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,23:1\n1#2:24\n*E\n"})
/* renamed from: com.carrefour.fid.android.data.cache.d */
public final class C36382d extends C28484f<List<FacilityDomain>> {
    @C12579k

    /* renamed from: g */
    public static final C36383a f89989g = new C36383a((DefaultConstructorMarker) null);

    /* renamed from: h */
    public static final int f89990h = 0;

    /* renamed from: i */
    public static final long f89991i = 43200000;

    /* renamed from: com.carrefour.fid.android.data.cache.d$a */
    public static final class C36383a {
        public /* synthetic */ C36383a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public C36383a() {
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C36382d(List list, long j, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(list, (i & 2) != 0 ? 43200000 : j);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v0, resolved type: com.carrefour.fid.android.domain.models.FacilityDomain} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v1, resolved type: com.carrefour.fid.android.domain.models.FacilityDomain} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v1, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v0, resolved type: com.carrefour.fid.android.domain.models.FacilityDomain} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v3, resolved type: com.carrefour.fid.android.domain.models.FacilityDomain} */
    /* JADX WARNING: Multi-variable type inference failed */
    @org.jetbrains.annotations.C12580l
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.carrefour.fid.android.domain.models.FacilityDomain mo108647d(@org.jetbrains.annotations.C12579k java.lang.String r5) {
        /*
            r4 = this;
            java.lang.String r0 = "facilityId"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
            boolean r0 = r4.mo83405c()
            r1 = 0
            if (r0 == 0) goto L_0x0030
            java.lang.Object r0 = r4.mo83404b()
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.util.Iterator r0 = r0.iterator()
        L_0x0016:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L_0x002e
            java.lang.Object r2 = r0.next()
            r3 = r2
            com.carrefour.fid.android.domain.models.FacilityDomain r3 = (com.carrefour.fid.android.domain.models.FacilityDomain) r3
            java.lang.String r3 = r3.getId()
            boolean r3 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r3, (java.lang.Object) r5)
            if (r3 == 0) goto L_0x0016
            r1 = r2
        L_0x002e:
            com.carrefour.fid.android.domain.models.FacilityDomain r1 = (com.carrefour.fid.android.domain.models.FacilityDomain) r1
        L_0x0030:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.data.cache.C36382d.mo108647d(java.lang.String):com.carrefour.fid.android.domain.models.FacilityDomain");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C36382d(@C12579k List<FacilityDomain> list, long j) {
        super(list, j);
        Intrinsics.checkNotNullParameter(list, "data");
    }
}
