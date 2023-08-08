package com.carrefour.fid.android.bff_data_shared.data.api.entities;

import kotlin.C11076d0;
import kotlin.C11395k;
import kotlin.C11587t0;
import kotlin.DeprecationLevel;
import kotlin.jvm.C11384m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.C12248g;
import kotlinx.serialization.C12439o;
import kotlinx.serialization.descriptors.C12217f;
import kotlinx.serialization.encoding.C12239d;
import kotlinx.serialization.internal.C12261c1;
import kotlinx.serialization.internal.C12295n1;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0005\b\b\u0018\u0000 #2\u00020\u0001:\u0002$#B\u0017\u0012\u0006\u0010\r\u001a\u00020\t\u0012\u0006\u0010\u000e\u001a\u00020\u000b¢\u0006\u0004\b\u001d\u0010\u001eB/\b\u0017\u0012\u0006\u0010\u001f\u001a\u00020\u0012\u0012\b\u0010\r\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010!\u001a\u0004\u0018\u00010 ¢\u0006\u0004\b\u001d\u0010\"J!\u0010\b\u001a\u00020\u00072\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005HÇ\u0001J\t\u0010\n\u001a\u00020\tHÆ\u0003J\t\u0010\f\u001a\u00020\u000bHÆ\u0003J\u001d\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\r\u001a\u00020\t2\b\b\u0002\u0010\u000e\u001a\u00020\u000bHÆ\u0001J\t\u0010\u0011\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0012HÖ\u0001J\u0013\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\r\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\r\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0017\u0010\u000e\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c¨\u0006%"}, mo22516d2 = {"Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/BffErrorResponse;", "", "self", "Lkotlinx/serialization/encoding/d;", "output", "Lkotlinx/serialization/descriptors/f;", "serialDesc", "Lkotlin/d2;", "write$Self", "Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/Metadata;", "component1", "Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/Errors;", "component2", "metadata", "errors", "copy", "", "toString", "", "hashCode", "other", "", "equals", "Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/Metadata;", "getMetadata", "()Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/Metadata;", "Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/Errors;", "getErrors", "()Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/Errors;", "<init>", "(Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/Metadata;Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/Errors;)V", "seen1", "Lkotlinx/serialization/internal/n1;", "serializationConstructorMarker", "(ILcom/carrefour/fid/android/bff_data_shared/data/api/entities/Metadata;Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/Errors;Lkotlinx/serialization/internal/n1;)V", "Companion", "$serializer", "bff-data-shared_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
@C12439o
public final class BffErrorResponse {
    @C12579k
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    @C12579k
    private final Errors errors;
    @C12579k
    private final Metadata metadata;

    @C11076d0(mo22515d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¨\u0006\u0007"}, mo22516d2 = {"Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/BffErrorResponse$Companion;", "", "Lkotlinx/serialization/g;", "Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/BffErrorResponse;", "serializer", "<init>", "()V", "bff-data-shared_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @C12579k
        public final C12248g<BffErrorResponse> serializer() {
            return BffErrorResponse$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    @C11395k(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @C11587t0(expression = "", imports = {}))
    public /* synthetic */ BffErrorResponse(int i, Metadata metadata2, Errors errors2, C12295n1 n1Var) {
        if (3 != (i & 3)) {
            C12261c1.m49256b(i, 3, BffErrorResponse$$serializer.INSTANCE.getDescriptor());
        }
        this.metadata = metadata2;
        this.errors = errors2;
    }

    public static /* synthetic */ BffErrorResponse copy$default(BffErrorResponse bffErrorResponse, Metadata metadata2, Errors errors2, int i, Object obj) {
        if ((i & 1) != 0) {
            metadata2 = bffErrorResponse.metadata;
        }
        if ((i & 2) != 0) {
            errors2 = bffErrorResponse.errors;
        }
        return bffErrorResponse.copy(metadata2, errors2);
    }

    @C11384m
    public static final /* synthetic */ void write$Self(BffErrorResponse bffErrorResponse, C12239d dVar, C12217f fVar) {
        dVar.mo24899D(fVar, 0, Metadata$$serializer.INSTANCE, bffErrorResponse.metadata);
        dVar.mo24899D(fVar, 1, Errors$$serializer.INSTANCE, bffErrorResponse.errors);
    }

    @C12579k
    public final Metadata component1() {
        return this.metadata;
    }

    @C12579k
    public final Errors component2() {
        return this.errors;
    }

    @C12579k
    public final BffErrorResponse copy(@C12579k Metadata metadata2, @C12579k Errors errors2) {
        Intrinsics.checkNotNullParameter(metadata2, "metadata");
        Intrinsics.checkNotNullParameter(errors2, "errors");
        return new BffErrorResponse(metadata2, errors2);
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BffErrorResponse)) {
            return false;
        }
        BffErrorResponse bffErrorResponse = (BffErrorResponse) obj;
        return Intrinsics.areEqual((Object) this.metadata, (Object) bffErrorResponse.metadata) && Intrinsics.areEqual((Object) this.errors, (Object) bffErrorResponse.errors);
    }

    @C12579k
    public final Errors getErrors() {
        return this.errors;
    }

    @C12579k
    public final Metadata getMetadata() {
        return this.metadata;
    }

    public int hashCode() {
        return (this.metadata.hashCode() * 31) + this.errors.hashCode();
    }

    @C12579k
    public String toString() {
        Metadata metadata2 = this.metadata;
        Errors errors2 = this.errors;
        return "BffErrorResponse(metadata=" + metadata2 + ", errors=" + errors2 + ")";
    }

    public BffErrorResponse(@C12579k Metadata metadata2, @C12579k Errors errors2) {
        Intrinsics.checkNotNullParameter(metadata2, "metadata");
        Intrinsics.checkNotNullParameter(errors2, "errors");
        this.metadata = metadata2;
        this.errors = errors2;
    }
}
