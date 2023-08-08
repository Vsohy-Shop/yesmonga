package com.carrefour.fid.android.bff_data_shared.data.api.entities;

import java.util.List;
import java.util.Map;
import kotlin.C11076d0;
import kotlin.C11395k;
import kotlin.C11587t0;
import kotlin.DeprecationLevel;
import kotlin.jvm.C11287e;
import kotlin.jvm.C11384m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.C12248g;
import kotlinx.serialization.C12438n;
import kotlinx.serialization.C12439o;
import kotlinx.serialization.descriptors.C12217f;
import kotlinx.serialization.encoding.C12239d;
import kotlinx.serialization.internal.C12261c1;
import kotlinx.serialization.internal.C12269f;
import kotlinx.serialization.internal.C12291m0;
import kotlinx.serialization.internal.C12295n1;
import kotlinx.serialization.internal.C12310s1;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0005\b\b\u0018\u0000 /2\u00020\u0001:\u00020/B=\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\t\u0012\u001c\b\u0002\u0010\u0013\u001a\u0016\u0012\u0004\u0012\u00020\f\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r\u0018\u00010\u000b\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b)\u0010*BQ\b\u0017\u0012\u0006\u0010+\u001a\u00020\u0017\u0012\n\b\u0001\u0010\u0012\u001a\u0004\u0018\u00010\t\u0012\u001c\b\u0001\u0010\u0013\u001a\u0016\u0012\u0004\u0012\u00020\f\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r\u0018\u00010\u000b\u0012\n\b\u0001\u0010\u0014\u001a\u0004\u0018\u00010\u0010\u0012\b\u0010-\u001a\u0004\u0018\u00010,¢\u0006\u0004\b)\u0010.J!\u0010\b\u001a\u00020\u00072\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005HÇ\u0001J\u000b\u0010\n\u001a\u0004\u0018\u00010\tHÆ\u0003J\u001d\u0010\u000f\u001a\u0016\u0012\u0004\u0012\u00020\f\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r\u0018\u00010\u000bHÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÆ\u0003J?\u0010\u0015\u001a\u00020\u00002\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\t2\u001c\b\u0002\u0010\u0013\u001a\u0016\u0012\u0004\u0012\u00020\f\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r\u0018\u00010\u000b2\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0010HÆ\u0001J\t\u0010\u0016\u001a\u00020\fHÖ\u0001J\t\u0010\u0018\u001a\u00020\u0017HÖ\u0001J\u0013\u0010\u001b\u001a\u00020\u001a2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\"\u0010\u0012\u001a\u0004\u0018\u00010\t8\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0012\u0010\u001c\u0012\u0004\b\u001f\u0010 \u001a\u0004\b\u001d\u0010\u001eR4\u0010\u0013\u001a\u0016\u0012\u0004\u0012\u00020\f\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r\u0018\u00010\u000b8\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0013\u0010!\u0012\u0004\b$\u0010 \u001a\u0004\b\"\u0010#R\"\u0010\u0014\u001a\u0004\u0018\u00010\u00108\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0014\u0010%\u0012\u0004\b(\u0010 \u001a\u0004\b&\u0010'¨\u00061"}, mo22516d2 = {"Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/BffEligibilityDataResponse;", "", "self", "Lkotlinx/serialization/encoding/d;", "output", "Lkotlinx/serialization/descriptors/f;", "serialDesc", "Lkotlin/d2;", "write$Self", "Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/BffEligibilityDataResponseData;", "component1", "", "", "", "Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/BffCommonServiceError;", "component2", "Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/BffSimpleMetadata;", "component3", "data", "errors", "metadata", "copy", "toString", "", "hashCode", "other", "", "equals", "Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/BffEligibilityDataResponseData;", "getData", "()Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/BffEligibilityDataResponseData;", "getData$annotations", "()V", "Ljava/util/Map;", "getErrors", "()Ljava/util/Map;", "getErrors$annotations", "Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/BffSimpleMetadata;", "getMetadata", "()Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/BffSimpleMetadata;", "getMetadata$annotations", "<init>", "(Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/BffEligibilityDataResponseData;Ljava/util/Map;Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/BffSimpleMetadata;)V", "seen1", "Lkotlinx/serialization/internal/n1;", "serializationConstructorMarker", "(ILcom/carrefour/fid/android/bff_data_shared/data/api/entities/BffEligibilityDataResponseData;Ljava/util/Map;Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/BffSimpleMetadata;Lkotlinx/serialization/internal/n1;)V", "Companion", "$serializer", "bff-data-shared_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
@C12439o
public final class BffEligibilityDataResponse {
    /* access modifiers changed from: private */
    @C12579k
    @C11287e
    public static final C12248g<Object>[] $childSerializers = {null, new C12291m0(C12310s1.f30117a, new C12269f(BffCommonServiceError$$serializer.INSTANCE)), null};
    @C12579k
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    @C12580l
    private final BffEligibilityDataResponseData data;
    @C12580l
    private final Map<String, List<BffCommonServiceError>> errors;
    @C12580l
    private final BffSimpleMetadata metadata;

    @C11076d0(mo22515d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¨\u0006\u0007"}, mo22516d2 = {"Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/BffEligibilityDataResponse$Companion;", "", "Lkotlinx/serialization/g;", "Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/BffEligibilityDataResponse;", "serializer", "<init>", "()V", "bff-data-shared_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @C12579k
        public final C12248g<BffEligibilityDataResponse> serializer() {
            return BffEligibilityDataResponse$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public BffEligibilityDataResponse() {
        this((BffEligibilityDataResponseData) null, (Map) null, (BffSimpleMetadata) null, 7, (DefaultConstructorMarker) null);
    }

    public static /* synthetic */ BffEligibilityDataResponse copy$default(BffEligibilityDataResponse bffEligibilityDataResponse, BffEligibilityDataResponseData bffEligibilityDataResponseData, Map<String, List<BffCommonServiceError>> map, BffSimpleMetadata bffSimpleMetadata, int i, Object obj) {
        if ((i & 1) != 0) {
            bffEligibilityDataResponseData = bffEligibilityDataResponse.data;
        }
        if ((i & 2) != 0) {
            map = bffEligibilityDataResponse.errors;
        }
        if ((i & 4) != 0) {
            bffSimpleMetadata = bffEligibilityDataResponse.metadata;
        }
        return bffEligibilityDataResponse.copy(bffEligibilityDataResponseData, map, bffSimpleMetadata);
    }

    @C12438n("data")
    public static /* synthetic */ void getData$annotations() {
    }

    @C12438n("errors")
    public static /* synthetic */ void getErrors$annotations() {
    }

    @C12438n("metadata")
    public static /* synthetic */ void getMetadata$annotations() {
    }

    @C11384m
    public static final /* synthetic */ void write$Self(BffEligibilityDataResponse bffEligibilityDataResponse, C12239d dVar, C12217f fVar) {
        C12248g<Object>[] gVarArr = $childSerializers;
        boolean z = false;
        if (dVar.mo24897A(fVar, 0) || bffEligibilityDataResponse.data != null) {
            dVar.mo24912i(fVar, 0, BffEligibilityDataResponseData$$serializer.INSTANCE, bffEligibilityDataResponse.data);
        }
        if (dVar.mo24897A(fVar, 1) || bffEligibilityDataResponse.errors != null) {
            dVar.mo24912i(fVar, 1, gVarArr[1], bffEligibilityDataResponse.errors);
        }
        if (dVar.mo24897A(fVar, 2) || bffEligibilityDataResponse.metadata != null) {
            z = true;
        }
        if (z) {
            dVar.mo24912i(fVar, 2, BffSimpleMetadata$$serializer.INSTANCE, bffEligibilityDataResponse.metadata);
        }
    }

    @C12580l
    public final BffEligibilityDataResponseData component1() {
        return this.data;
    }

    @C12580l
    public final Map<String, List<BffCommonServiceError>> component2() {
        return this.errors;
    }

    @C12580l
    public final BffSimpleMetadata component3() {
        return this.metadata;
    }

    @C12579k
    public final BffEligibilityDataResponse copy(@C12580l BffEligibilityDataResponseData bffEligibilityDataResponseData, @C12580l Map<String, ? extends List<BffCommonServiceError>> map, @C12580l BffSimpleMetadata bffSimpleMetadata) {
        return new BffEligibilityDataResponse(bffEligibilityDataResponseData, map, bffSimpleMetadata);
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BffEligibilityDataResponse)) {
            return false;
        }
        BffEligibilityDataResponse bffEligibilityDataResponse = (BffEligibilityDataResponse) obj;
        return Intrinsics.areEqual((Object) this.data, (Object) bffEligibilityDataResponse.data) && Intrinsics.areEqual((Object) this.errors, (Object) bffEligibilityDataResponse.errors) && Intrinsics.areEqual((Object) this.metadata, (Object) bffEligibilityDataResponse.metadata);
    }

    @C12580l
    public final BffEligibilityDataResponseData getData() {
        return this.data;
    }

    @C12580l
    public final Map<String, List<BffCommonServiceError>> getErrors() {
        return this.errors;
    }

    @C12580l
    public final BffSimpleMetadata getMetadata() {
        return this.metadata;
    }

    public int hashCode() {
        BffEligibilityDataResponseData bffEligibilityDataResponseData = this.data;
        int i = 0;
        int hashCode = (bffEligibilityDataResponseData == null ? 0 : bffEligibilityDataResponseData.hashCode()) * 31;
        Map<String, List<BffCommonServiceError>> map = this.errors;
        int hashCode2 = (hashCode + (map == null ? 0 : map.hashCode())) * 31;
        BffSimpleMetadata bffSimpleMetadata = this.metadata;
        if (bffSimpleMetadata != null) {
            i = bffSimpleMetadata.hashCode();
        }
        return hashCode2 + i;
    }

    @C12579k
    public String toString() {
        BffEligibilityDataResponseData bffEligibilityDataResponseData = this.data;
        Map<String, List<BffCommonServiceError>> map = this.errors;
        BffSimpleMetadata bffSimpleMetadata = this.metadata;
        return "BffEligibilityDataResponse(data=" + bffEligibilityDataResponseData + ", errors=" + map + ", metadata=" + bffSimpleMetadata + ")";
    }

    @C11395k(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @C11587t0(expression = "", imports = {}))
    public /* synthetic */ BffEligibilityDataResponse(int i, @C12438n("data") BffEligibilityDataResponseData bffEligibilityDataResponseData, @C12438n("errors") Map map, @C12438n("metadata") BffSimpleMetadata bffSimpleMetadata, C12295n1 n1Var) {
        if ((i & 0) != 0) {
            C12261c1.m49256b(i, 0, BffEligibilityDataResponse$$serializer.INSTANCE.getDescriptor());
        }
        if ((i & 1) == 0) {
            this.data = null;
        } else {
            this.data = bffEligibilityDataResponseData;
        }
        if ((i & 2) == 0) {
            this.errors = null;
        } else {
            this.errors = map;
        }
        if ((i & 4) == 0) {
            this.metadata = null;
        } else {
            this.metadata = bffSimpleMetadata;
        }
    }

    public BffEligibilityDataResponse(@C12580l BffEligibilityDataResponseData bffEligibilityDataResponseData, @C12580l Map<String, ? extends List<BffCommonServiceError>> map, @C12580l BffSimpleMetadata bffSimpleMetadata) {
        this.data = bffEligibilityDataResponseData;
        this.errors = map;
        this.metadata = bffSimpleMetadata;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ BffEligibilityDataResponse(BffEligibilityDataResponseData bffEligibilityDataResponseData, Map map, BffSimpleMetadata bffSimpleMetadata, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : bffEligibilityDataResponseData, (i & 2) != 0 ? null : map, (i & 4) != 0 ? null : bffSimpleMetadata);
    }
}
