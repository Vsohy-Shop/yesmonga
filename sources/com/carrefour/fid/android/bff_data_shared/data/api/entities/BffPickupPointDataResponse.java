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

@C11076d0(mo22515d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0005\b\b\u0018\u0000 /2\u00020\u0001:\u00020/BC\u0012\u0010\b\u0002\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\f\u0012\u001c\b\u0002\u0010\u0014\u001a\u0016\u0012\u0004\u0012\u00020\u000f\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\t\u0018\u00010\u000e¢\u0006\u0004\b)\u0010*BW\b\u0017\u0012\u0006\u0010+\u001a\u00020\u0017\u0012\u0010\b\u0001\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t\u0012\n\b\u0001\u0010\u0013\u001a\u0004\u0018\u00010\f\u0012\u001c\b\u0001\u0010\u0014\u001a\u0016\u0012\u0004\u0012\u00020\u000f\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\t\u0018\u00010\u000e\u0012\b\u0010-\u001a\u0004\u0018\u00010,¢\u0006\u0004\b)\u0010.J!\u0010\b\u001a\u00020\u00072\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005HÇ\u0001J\u0011\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\tHÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\fHÆ\u0003J\u001d\u0010\u0011\u001a\u0016\u0012\u0004\u0012\u00020\u000f\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\t\u0018\u00010\u000eHÆ\u0003JE\u0010\u0015\u001a\u00020\u00002\u0010\b\u0002\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t2\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\f2\u001c\b\u0002\u0010\u0014\u001a\u0016\u0012\u0004\u0012\u00020\u000f\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\t\u0018\u00010\u000eHÆ\u0001J\t\u0010\u0016\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0018\u001a\u00020\u0017HÖ\u0001J\u0013\u0010\u001b\u001a\u00020\u001a2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003R(\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t8\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0012\u0010\u001c\u0012\u0004\b\u001f\u0010 \u001a\u0004\b\u001d\u0010\u001eR\"\u0010\u0013\u001a\u0004\u0018\u00010\f8\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0013\u0010!\u0012\u0004\b$\u0010 \u001a\u0004\b\"\u0010#R4\u0010\u0014\u001a\u0016\u0012\u0004\u0012\u00020\u000f\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\t\u0018\u00010\u000e8\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0014\u0010%\u0012\u0004\b(\u0010 \u001a\u0004\b&\u0010'¨\u00061"}, mo22516d2 = {"Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/BffPickupPointDataResponse;", "", "self", "Lkotlinx/serialization/encoding/d;", "output", "Lkotlinx/serialization/descriptors/f;", "serialDesc", "Lkotlin/d2;", "write$Self", "", "Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/BffPickupPointResponse;", "component1", "Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/BffPartialMetadata;", "component2", "", "", "Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/BffCommonServiceError;", "component3", "data", "metadata", "errors", "copy", "toString", "", "hashCode", "other", "", "equals", "Ljava/util/List;", "getData", "()Ljava/util/List;", "getData$annotations", "()V", "Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/BffPartialMetadata;", "getMetadata", "()Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/BffPartialMetadata;", "getMetadata$annotations", "Ljava/util/Map;", "getErrors", "()Ljava/util/Map;", "getErrors$annotations", "<init>", "(Ljava/util/List;Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/BffPartialMetadata;Ljava/util/Map;)V", "seen1", "Lkotlinx/serialization/internal/n1;", "serializationConstructorMarker", "(ILjava/util/List;Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/BffPartialMetadata;Ljava/util/Map;Lkotlinx/serialization/internal/n1;)V", "Companion", "$serializer", "bff-data-shared_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
@C12439o
public final class BffPickupPointDataResponse {
    /* access modifiers changed from: private */
    @C12579k
    @C11287e
    public static final C12248g<Object>[] $childSerializers = {new C12269f(BffPickupPointResponse$$serializer.INSTANCE), null, new C12291m0(C12310s1.f30117a, new C12269f(BffCommonServiceError$$serializer.INSTANCE))};
    @C12579k
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    @C12580l
    private final List<BffPickupPointResponse> data;
    @C12580l
    private final Map<String, List<BffCommonServiceError>> errors;
    @C12580l
    private final BffPartialMetadata metadata;

    @C11076d0(mo22515d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¨\u0006\u0007"}, mo22516d2 = {"Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/BffPickupPointDataResponse$Companion;", "", "Lkotlinx/serialization/g;", "Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/BffPickupPointDataResponse;", "serializer", "<init>", "()V", "bff-data-shared_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @C12579k
        public final C12248g<BffPickupPointDataResponse> serializer() {
            return BffPickupPointDataResponse$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public BffPickupPointDataResponse() {
        this((List) null, (BffPartialMetadata) null, (Map) null, 7, (DefaultConstructorMarker) null);
    }

    public static /* synthetic */ BffPickupPointDataResponse copy$default(BffPickupPointDataResponse bffPickupPointDataResponse, List<BffPickupPointResponse> list, BffPartialMetadata bffPartialMetadata, Map<String, List<BffCommonServiceError>> map, int i, Object obj) {
        if ((i & 1) != 0) {
            list = bffPickupPointDataResponse.data;
        }
        if ((i & 2) != 0) {
            bffPartialMetadata = bffPickupPointDataResponse.metadata;
        }
        if ((i & 4) != 0) {
            map = bffPickupPointDataResponse.errors;
        }
        return bffPickupPointDataResponse.copy(list, bffPartialMetadata, map);
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
    public static final /* synthetic */ void write$Self(BffPickupPointDataResponse bffPickupPointDataResponse, C12239d dVar, C12217f fVar) {
        C12248g<Object>[] gVarArr = $childSerializers;
        boolean z = false;
        if (dVar.mo24897A(fVar, 0) || bffPickupPointDataResponse.data != null) {
            dVar.mo24912i(fVar, 0, gVarArr[0], bffPickupPointDataResponse.data);
        }
        if (dVar.mo24897A(fVar, 1) || bffPickupPointDataResponse.metadata != null) {
            dVar.mo24912i(fVar, 1, BffPartialMetadata$$serializer.INSTANCE, bffPickupPointDataResponse.metadata);
        }
        if (dVar.mo24897A(fVar, 2) || bffPickupPointDataResponse.errors != null) {
            z = true;
        }
        if (z) {
            dVar.mo24912i(fVar, 2, gVarArr[2], bffPickupPointDataResponse.errors);
        }
    }

    @C12580l
    public final List<BffPickupPointResponse> component1() {
        return this.data;
    }

    @C12580l
    public final BffPartialMetadata component2() {
        return this.metadata;
    }

    @C12580l
    public final Map<String, List<BffCommonServiceError>> component3() {
        return this.errors;
    }

    @C12579k
    public final BffPickupPointDataResponse copy(@C12580l List<BffPickupPointResponse> list, @C12580l BffPartialMetadata bffPartialMetadata, @C12580l Map<String, ? extends List<BffCommonServiceError>> map) {
        return new BffPickupPointDataResponse(list, bffPartialMetadata, map);
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BffPickupPointDataResponse)) {
            return false;
        }
        BffPickupPointDataResponse bffPickupPointDataResponse = (BffPickupPointDataResponse) obj;
        return Intrinsics.areEqual((Object) this.data, (Object) bffPickupPointDataResponse.data) && Intrinsics.areEqual((Object) this.metadata, (Object) bffPickupPointDataResponse.metadata) && Intrinsics.areEqual((Object) this.errors, (Object) bffPickupPointDataResponse.errors);
    }

    @C12580l
    public final List<BffPickupPointResponse> getData() {
        return this.data;
    }

    @C12580l
    public final Map<String, List<BffCommonServiceError>> getErrors() {
        return this.errors;
    }

    @C12580l
    public final BffPartialMetadata getMetadata() {
        return this.metadata;
    }

    public int hashCode() {
        List<BffPickupPointResponse> list = this.data;
        int i = 0;
        int hashCode = (list == null ? 0 : list.hashCode()) * 31;
        BffPartialMetadata bffPartialMetadata = this.metadata;
        int hashCode2 = (hashCode + (bffPartialMetadata == null ? 0 : bffPartialMetadata.hashCode())) * 31;
        Map<String, List<BffCommonServiceError>> map = this.errors;
        if (map != null) {
            i = map.hashCode();
        }
        return hashCode2 + i;
    }

    @C12579k
    public String toString() {
        List<BffPickupPointResponse> list = this.data;
        BffPartialMetadata bffPartialMetadata = this.metadata;
        Map<String, List<BffCommonServiceError>> map = this.errors;
        return "BffPickupPointDataResponse(data=" + list + ", metadata=" + bffPartialMetadata + ", errors=" + map + ")";
    }

    @C11395k(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @C11587t0(expression = "", imports = {}))
    public /* synthetic */ BffPickupPointDataResponse(int i, @C12438n("data") List list, @C12438n("metadata") BffPartialMetadata bffPartialMetadata, @C12438n("errors") Map map, C12295n1 n1Var) {
        if ((i & 0) != 0) {
            C12261c1.m49256b(i, 0, BffPickupPointDataResponse$$serializer.INSTANCE.getDescriptor());
        }
        if ((i & 1) == 0) {
            this.data = null;
        } else {
            this.data = list;
        }
        if ((i & 2) == 0) {
            this.metadata = null;
        } else {
            this.metadata = bffPartialMetadata;
        }
        if ((i & 4) == 0) {
            this.errors = null;
        } else {
            this.errors = map;
        }
    }

    public BffPickupPointDataResponse(@C12580l List<BffPickupPointResponse> list, @C12580l BffPartialMetadata bffPartialMetadata, @C12580l Map<String, ? extends List<BffCommonServiceError>> map) {
        this.data = list;
        this.metadata = bffPartialMetadata;
        this.errors = map;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ BffPickupPointDataResponse(List list, BffPartialMetadata bffPartialMetadata, Map map, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : list, (i & 2) != 0 ? null : bffPartialMetadata, (i & 4) != 0 ? null : map);
    }
}
