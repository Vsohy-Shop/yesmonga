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

@C11076d0(mo22515d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0005\b\b\u0018\u0000 (2\u00020\u0001:\u0002)(B1\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\t\u0012\u001c\b\u0002\u0010\u0011\u001a\u0016\u0012\u0004\u0012\u00020\f\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r\u0018\u00010\u000b¢\u0006\u0004\b\"\u0010#BE\b\u0017\u0012\u0006\u0010$\u001a\u00020\u0014\u0012\n\b\u0001\u0010\u0010\u001a\u0004\u0018\u00010\t\u0012\u001c\b\u0001\u0010\u0011\u001a\u0016\u0012\u0004\u0012\u00020\f\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r\u0018\u00010\u000b\u0012\b\u0010&\u001a\u0004\u0018\u00010%¢\u0006\u0004\b\"\u0010'J!\u0010\b\u001a\u00020\u00072\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005HÇ\u0001J\u000b\u0010\n\u001a\u0004\u0018\u00010\tHÆ\u0003J\u001d\u0010\u000f\u001a\u0016\u0012\u0004\u0012\u00020\f\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r\u0018\u00010\u000bHÆ\u0003J3\u0010\u0012\u001a\u00020\u00002\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\t2\u001c\b\u0002\u0010\u0011\u001a\u0016\u0012\u0004\u0012\u00020\f\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r\u0018\u00010\u000bHÆ\u0001J\t\u0010\u0013\u001a\u00020\fHÖ\u0001J\t\u0010\u0015\u001a\u00020\u0014HÖ\u0001J\u0013\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\"\u0010\u0010\u001a\u0004\u0018\u00010\t8\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0010\u0010\u0019\u0012\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001a\u0010\u001bR4\u0010\u0011\u001a\u0016\u0012\u0004\u0012\u00020\f\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r\u0018\u00010\u000b8\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0011\u0010\u001e\u0012\u0004\b!\u0010\u001d\u001a\u0004\b\u001f\u0010 ¨\u0006*"}, mo22516d2 = {"Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/BffCommonErrors;", "", "self", "Lkotlinx/serialization/encoding/d;", "output", "Lkotlinx/serialization/descriptors/f;", "serialDesc", "Lkotlin/d2;", "write$Self", "Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/BffCommonMetadata;", "component1", "", "", "", "Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/BffCommonServiceError;", "component2", "metadata", "errors", "copy", "toString", "", "hashCode", "other", "", "equals", "Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/BffCommonMetadata;", "getMetadata", "()Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/BffCommonMetadata;", "getMetadata$annotations", "()V", "Ljava/util/Map;", "getErrors", "()Ljava/util/Map;", "getErrors$annotations", "<init>", "(Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/BffCommonMetadata;Ljava/util/Map;)V", "seen1", "Lkotlinx/serialization/internal/n1;", "serializationConstructorMarker", "(ILcom/carrefour/fid/android/bff_data_shared/data/api/entities/BffCommonMetadata;Ljava/util/Map;Lkotlinx/serialization/internal/n1;)V", "Companion", "$serializer", "bff-data-shared_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
@C12439o
public final class BffCommonErrors {
    /* access modifiers changed from: private */
    @C12579k
    @C11287e
    public static final C12248g<Object>[] $childSerializers = {null, new C12291m0(C12310s1.f30117a, new C12269f(BffCommonServiceError$$serializer.INSTANCE))};
    @C12579k
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    @C12580l
    private final Map<String, List<BffCommonServiceError>> errors;
    @C12580l
    private final BffCommonMetadata metadata;

    @C11076d0(mo22515d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¨\u0006\u0007"}, mo22516d2 = {"Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/BffCommonErrors$Companion;", "", "Lkotlinx/serialization/g;", "Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/BffCommonErrors;", "serializer", "<init>", "()V", "bff-data-shared_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @C12579k
        public final C12248g<BffCommonErrors> serializer() {
            return BffCommonErrors$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public BffCommonErrors() {
        this((BffCommonMetadata) null, (Map) null, 3, (DefaultConstructorMarker) null);
    }

    public static /* synthetic */ BffCommonErrors copy$default(BffCommonErrors bffCommonErrors, BffCommonMetadata bffCommonMetadata, Map<String, List<BffCommonServiceError>> map, int i, Object obj) {
        if ((i & 1) != 0) {
            bffCommonMetadata = bffCommonErrors.metadata;
        }
        if ((i & 2) != 0) {
            map = bffCommonErrors.errors;
        }
        return bffCommonErrors.copy(bffCommonMetadata, map);
    }

    @C12438n("errors")
    public static /* synthetic */ void getErrors$annotations() {
    }

    @C12438n("metadata")
    public static /* synthetic */ void getMetadata$annotations() {
    }

    @C11384m
    public static final /* synthetic */ void write$Self(BffCommonErrors bffCommonErrors, C12239d dVar, C12217f fVar) {
        C12248g<Object>[] gVarArr = $childSerializers;
        boolean z = false;
        if (dVar.mo24897A(fVar, 0) || bffCommonErrors.metadata != null) {
            dVar.mo24912i(fVar, 0, BffCommonMetadata$$serializer.INSTANCE, bffCommonErrors.metadata);
        }
        if (dVar.mo24897A(fVar, 1) || bffCommonErrors.errors != null) {
            z = true;
        }
        if (z) {
            dVar.mo24912i(fVar, 1, gVarArr[1], bffCommonErrors.errors);
        }
    }

    @C12580l
    public final BffCommonMetadata component1() {
        return this.metadata;
    }

    @C12580l
    public final Map<String, List<BffCommonServiceError>> component2() {
        return this.errors;
    }

    @C12579k
    public final BffCommonErrors copy(@C12580l BffCommonMetadata bffCommonMetadata, @C12580l Map<String, ? extends List<BffCommonServiceError>> map) {
        return new BffCommonErrors(bffCommonMetadata, map);
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BffCommonErrors)) {
            return false;
        }
        BffCommonErrors bffCommonErrors = (BffCommonErrors) obj;
        return Intrinsics.areEqual((Object) this.metadata, (Object) bffCommonErrors.metadata) && Intrinsics.areEqual((Object) this.errors, (Object) bffCommonErrors.errors);
    }

    @C12580l
    public final Map<String, List<BffCommonServiceError>> getErrors() {
        return this.errors;
    }

    @C12580l
    public final BffCommonMetadata getMetadata() {
        return this.metadata;
    }

    public int hashCode() {
        BffCommonMetadata bffCommonMetadata = this.metadata;
        int i = 0;
        int hashCode = (bffCommonMetadata == null ? 0 : bffCommonMetadata.hashCode()) * 31;
        Map<String, List<BffCommonServiceError>> map = this.errors;
        if (map != null) {
            i = map.hashCode();
        }
        return hashCode + i;
    }

    @C12579k
    public String toString() {
        BffCommonMetadata bffCommonMetadata = this.metadata;
        Map<String, List<BffCommonServiceError>> map = this.errors;
        return "BffCommonErrors(metadata=" + bffCommonMetadata + ", errors=" + map + ")";
    }

    @C11395k(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @C11587t0(expression = "", imports = {}))
    public /* synthetic */ BffCommonErrors(int i, @C12438n("metadata") BffCommonMetadata bffCommonMetadata, @C12438n("errors") Map map, C12295n1 n1Var) {
        if ((i & 0) != 0) {
            C12261c1.m49256b(i, 0, BffCommonErrors$$serializer.INSTANCE.getDescriptor());
        }
        if ((i & 1) == 0) {
            this.metadata = null;
        } else {
            this.metadata = bffCommonMetadata;
        }
        if ((i & 2) == 0) {
            this.errors = null;
        } else {
            this.errors = map;
        }
    }

    public BffCommonErrors(@C12580l BffCommonMetadata bffCommonMetadata, @C12580l Map<String, ? extends List<BffCommonServiceError>> map) {
        this.metadata = bffCommonMetadata;
        this.errors = map;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ BffCommonErrors(BffCommonMetadata bffCommonMetadata, Map map, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : bffCommonMetadata, (i & 2) != 0 ? null : map);
    }
}
