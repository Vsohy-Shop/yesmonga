package com.carrefour.fid.android.bff_data_shared.data.api.entities;

import kotlin.C11076d0;
import kotlin.C11395k;
import kotlin.C11587t0;
import kotlin.DeprecationLevel;
import kotlin.jvm.C11384m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.C12248g;
import kotlinx.serialization.C12438n;
import kotlinx.serialization.C12439o;
import kotlinx.serialization.descriptors.C12217f;
import kotlinx.serialization.encoding.C12239d;
import kotlinx.serialization.internal.C12261c1;
import kotlinx.serialization.internal.C12295n1;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0005\b\b\u0018\u0000 &2\u00020\u0001:\u0002'&B\u001f\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b \u0010!B3\b\u0017\u0012\u0006\u0010\"\u001a\u00020\u0012\u0012\n\b\u0001\u0010\r\u001a\u0004\u0018\u00010\t\u0012\n\b\u0001\u0010\u000e\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010$\u001a\u0004\u0018\u00010#¢\u0006\u0004\b \u0010%J!\u0010\b\u001a\u00020\u00072\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005HÇ\u0001J\u000b\u0010\n\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010\f\u001a\u0004\u0018\u00010\u000bHÆ\u0003J!\u0010\u000f\u001a\u00020\u00002\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000bHÆ\u0001J\t\u0010\u0011\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0012HÖ\u0001J\u0013\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\"\u0010\r\u001a\u0004\u0018\u00010\t8\u0006X\u0004¢\u0006\u0012\n\u0004\b\r\u0010\u0017\u0012\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u0018\u0010\u0019R\"\u0010\u000e\u001a\u0004\u0018\u00010\u000b8\u0006X\u0004¢\u0006\u0012\n\u0004\b\u000e\u0010\u001c\u0012\u0004\b\u001f\u0010\u001b\u001a\u0004\b\u001d\u0010\u001e¨\u0006("}, mo22516d2 = {"Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/BffSecureTokenResponse;", "", "self", "Lkotlinx/serialization/encoding/d;", "output", "Lkotlinx/serialization/descriptors/f;", "serialDesc", "Lkotlin/d2;", "write$Self", "Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/BffSecureTokenResponseData;", "component1", "Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/BffSimpleMetadata;", "component2", "data", "metadata", "copy", "", "toString", "", "hashCode", "other", "", "equals", "Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/BffSecureTokenResponseData;", "getData", "()Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/BffSecureTokenResponseData;", "getData$annotations", "()V", "Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/BffSimpleMetadata;", "getMetadata", "()Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/BffSimpleMetadata;", "getMetadata$annotations", "<init>", "(Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/BffSecureTokenResponseData;Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/BffSimpleMetadata;)V", "seen1", "Lkotlinx/serialization/internal/n1;", "serializationConstructorMarker", "(ILcom/carrefour/fid/android/bff_data_shared/data/api/entities/BffSecureTokenResponseData;Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/BffSimpleMetadata;Lkotlinx/serialization/internal/n1;)V", "Companion", "$serializer", "bff-data-shared_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
@C12439o
public final class BffSecureTokenResponse {
    @C12579k
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    @C12580l
    private final BffSecureTokenResponseData data;
    @C12580l
    private final BffSimpleMetadata metadata;

    @C11076d0(mo22515d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¨\u0006\u0007"}, mo22516d2 = {"Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/BffSecureTokenResponse$Companion;", "", "Lkotlinx/serialization/g;", "Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/BffSecureTokenResponse;", "serializer", "<init>", "()V", "bff-data-shared_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @C12579k
        public final C12248g<BffSecureTokenResponse> serializer() {
            return BffSecureTokenResponse$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public BffSecureTokenResponse() {
        this((BffSecureTokenResponseData) null, (BffSimpleMetadata) null, 3, (DefaultConstructorMarker) null);
    }

    public static /* synthetic */ BffSecureTokenResponse copy$default(BffSecureTokenResponse bffSecureTokenResponse, BffSecureTokenResponseData bffSecureTokenResponseData, BffSimpleMetadata bffSimpleMetadata, int i, Object obj) {
        if ((i & 1) != 0) {
            bffSecureTokenResponseData = bffSecureTokenResponse.data;
        }
        if ((i & 2) != 0) {
            bffSimpleMetadata = bffSecureTokenResponse.metadata;
        }
        return bffSecureTokenResponse.copy(bffSecureTokenResponseData, bffSimpleMetadata);
    }

    @C12438n("data")
    public static /* synthetic */ void getData$annotations() {
    }

    @C12438n("metadata")
    public static /* synthetic */ void getMetadata$annotations() {
    }

    @C11384m
    public static final /* synthetic */ void write$Self(BffSecureTokenResponse bffSecureTokenResponse, C12239d dVar, C12217f fVar) {
        boolean z = false;
        if (dVar.mo24897A(fVar, 0) || bffSecureTokenResponse.data != null) {
            dVar.mo24912i(fVar, 0, BffSecureTokenResponseData$$serializer.INSTANCE, bffSecureTokenResponse.data);
        }
        if (dVar.mo24897A(fVar, 1) || bffSecureTokenResponse.metadata != null) {
            z = true;
        }
        if (z) {
            dVar.mo24912i(fVar, 1, BffSimpleMetadata$$serializer.INSTANCE, bffSecureTokenResponse.metadata);
        }
    }

    @C12580l
    public final BffSecureTokenResponseData component1() {
        return this.data;
    }

    @C12580l
    public final BffSimpleMetadata component2() {
        return this.metadata;
    }

    @C12579k
    public final BffSecureTokenResponse copy(@C12580l BffSecureTokenResponseData bffSecureTokenResponseData, @C12580l BffSimpleMetadata bffSimpleMetadata) {
        return new BffSecureTokenResponse(bffSecureTokenResponseData, bffSimpleMetadata);
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BffSecureTokenResponse)) {
            return false;
        }
        BffSecureTokenResponse bffSecureTokenResponse = (BffSecureTokenResponse) obj;
        return Intrinsics.areEqual((Object) this.data, (Object) bffSecureTokenResponse.data) && Intrinsics.areEqual((Object) this.metadata, (Object) bffSecureTokenResponse.metadata);
    }

    @C12580l
    public final BffSecureTokenResponseData getData() {
        return this.data;
    }

    @C12580l
    public final BffSimpleMetadata getMetadata() {
        return this.metadata;
    }

    public int hashCode() {
        BffSecureTokenResponseData bffSecureTokenResponseData = this.data;
        int i = 0;
        int hashCode = (bffSecureTokenResponseData == null ? 0 : bffSecureTokenResponseData.hashCode()) * 31;
        BffSimpleMetadata bffSimpleMetadata = this.metadata;
        if (bffSimpleMetadata != null) {
            i = bffSimpleMetadata.hashCode();
        }
        return hashCode + i;
    }

    @C12579k
    public String toString() {
        BffSecureTokenResponseData bffSecureTokenResponseData = this.data;
        BffSimpleMetadata bffSimpleMetadata = this.metadata;
        return "BffSecureTokenResponse(data=" + bffSecureTokenResponseData + ", metadata=" + bffSimpleMetadata + ")";
    }

    @C11395k(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @C11587t0(expression = "", imports = {}))
    public /* synthetic */ BffSecureTokenResponse(int i, @C12438n("data") BffSecureTokenResponseData bffSecureTokenResponseData, @C12438n("metadata") BffSimpleMetadata bffSimpleMetadata, C12295n1 n1Var) {
        if ((i & 0) != 0) {
            C12261c1.m49256b(i, 0, BffSecureTokenResponse$$serializer.INSTANCE.getDescriptor());
        }
        if ((i & 1) == 0) {
            this.data = null;
        } else {
            this.data = bffSecureTokenResponseData;
        }
        if ((i & 2) == 0) {
            this.metadata = null;
        } else {
            this.metadata = bffSimpleMetadata;
        }
    }

    public BffSecureTokenResponse(@C12580l BffSecureTokenResponseData bffSecureTokenResponseData, @C12580l BffSimpleMetadata bffSimpleMetadata) {
        this.data = bffSecureTokenResponseData;
        this.metadata = bffSimpleMetadata;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ BffSecureTokenResponse(BffSecureTokenResponseData bffSecureTokenResponseData, BffSimpleMetadata bffSimpleMetadata, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : bffSecureTokenResponseData, (i & 2) != 0 ? null : bffSimpleMetadata);
    }
}
