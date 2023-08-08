package com.carrefour.fid.android.bff_data_shared.data.api.entities;

import java.util.List;
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
import kotlinx.serialization.internal.C12295n1;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0005\b\b\u0018\u0000 '2\u00020\u0001:\u0002('B%\u0012\u0010\b\u0002\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b!\u0010\"B9\b\u0017\u0012\u0006\u0010#\u001a\u00020\u0013\u0012\u0010\b\u0001\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t\u0012\n\b\u0001\u0010\u000f\u001a\u0004\u0018\u00010\f\u0012\b\u0010%\u001a\u0004\u0018\u00010$¢\u0006\u0004\b!\u0010&J!\u0010\b\u001a\u00020\u00072\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005HÇ\u0001J\u0011\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\tHÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\fHÆ\u0003J'\u0010\u0010\u001a\u00020\u00002\u0010\b\u0002\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\fHÆ\u0001J\t\u0010\u0012\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0013HÖ\u0001J\u0013\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003R(\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t8\u0006X\u0004¢\u0006\u0012\n\u0004\b\u000e\u0010\u0018\u0012\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u0019\u0010\u001aR\"\u0010\u000f\u001a\u0004\u0018\u00010\f8\u0006X\u0004¢\u0006\u0012\n\u0004\b\u000f\u0010\u001d\u0012\u0004\b \u0010\u001c\u001a\u0004\b\u001e\u0010\u001f¨\u0006)"}, mo22516d2 = {"Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/BffPlpResponse;", "", "self", "Lkotlinx/serialization/encoding/d;", "output", "Lkotlinx/serialization/descriptors/f;", "serialDesc", "Lkotlin/d2;", "write$Self", "", "Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/BffPlpProduct;", "component1", "Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/BffFullMetadata;", "component2", "data", "metadata", "copy", "", "toString", "", "hashCode", "other", "", "equals", "Ljava/util/List;", "getData", "()Ljava/util/List;", "getData$annotations", "()V", "Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/BffFullMetadata;", "getMetadata", "()Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/BffFullMetadata;", "getMetadata$annotations", "<init>", "(Ljava/util/List;Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/BffFullMetadata;)V", "seen1", "Lkotlinx/serialization/internal/n1;", "serializationConstructorMarker", "(ILjava/util/List;Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/BffFullMetadata;Lkotlinx/serialization/internal/n1;)V", "Companion", "$serializer", "bff-data-shared_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
@C12439o
public final class BffPlpResponse {
    /* access modifiers changed from: private */
    @C12579k
    @C11287e
    public static final C12248g<Object>[] $childSerializers = {new C12269f(BffPlpProduct$$serializer.INSTANCE), null};
    @C12579k
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    @C12580l
    private final List<BffPlpProduct> data;
    @C12580l
    private final BffFullMetadata metadata;

    @C11076d0(mo22515d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¨\u0006\u0007"}, mo22516d2 = {"Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/BffPlpResponse$Companion;", "", "Lkotlinx/serialization/g;", "Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/BffPlpResponse;", "serializer", "<init>", "()V", "bff-data-shared_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @C12579k
        public final C12248g<BffPlpResponse> serializer() {
            return BffPlpResponse$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public BffPlpResponse() {
        this((List) null, (BffFullMetadata) null, 3, (DefaultConstructorMarker) null);
    }

    public static /* synthetic */ BffPlpResponse copy$default(BffPlpResponse bffPlpResponse, List<BffPlpProduct> list, BffFullMetadata bffFullMetadata, int i, Object obj) {
        if ((i & 1) != 0) {
            list = bffPlpResponse.data;
        }
        if ((i & 2) != 0) {
            bffFullMetadata = bffPlpResponse.metadata;
        }
        return bffPlpResponse.copy(list, bffFullMetadata);
    }

    @C12438n("data")
    public static /* synthetic */ void getData$annotations() {
    }

    @C12438n("metadata")
    public static /* synthetic */ void getMetadata$annotations() {
    }

    @C11384m
    public static final /* synthetic */ void write$Self(BffPlpResponse bffPlpResponse, C12239d dVar, C12217f fVar) {
        C12248g<Object>[] gVarArr = $childSerializers;
        boolean z = false;
        if (dVar.mo24897A(fVar, 0) || bffPlpResponse.data != null) {
            dVar.mo24912i(fVar, 0, gVarArr[0], bffPlpResponse.data);
        }
        if (dVar.mo24897A(fVar, 1) || bffPlpResponse.metadata != null) {
            z = true;
        }
        if (z) {
            dVar.mo24912i(fVar, 1, BffFullMetadata$$serializer.INSTANCE, bffPlpResponse.metadata);
        }
    }

    @C12580l
    public final List<BffPlpProduct> component1() {
        return this.data;
    }

    @C12580l
    public final BffFullMetadata component2() {
        return this.metadata;
    }

    @C12579k
    public final BffPlpResponse copy(@C12580l List<BffPlpProduct> list, @C12580l BffFullMetadata bffFullMetadata) {
        return new BffPlpResponse(list, bffFullMetadata);
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BffPlpResponse)) {
            return false;
        }
        BffPlpResponse bffPlpResponse = (BffPlpResponse) obj;
        return Intrinsics.areEqual((Object) this.data, (Object) bffPlpResponse.data) && Intrinsics.areEqual((Object) this.metadata, (Object) bffPlpResponse.metadata);
    }

    @C12580l
    public final List<BffPlpProduct> getData() {
        return this.data;
    }

    @C12580l
    public final BffFullMetadata getMetadata() {
        return this.metadata;
    }

    public int hashCode() {
        List<BffPlpProduct> list = this.data;
        int i = 0;
        int hashCode = (list == null ? 0 : list.hashCode()) * 31;
        BffFullMetadata bffFullMetadata = this.metadata;
        if (bffFullMetadata != null) {
            i = bffFullMetadata.hashCode();
        }
        return hashCode + i;
    }

    @C12579k
    public String toString() {
        List<BffPlpProduct> list = this.data;
        BffFullMetadata bffFullMetadata = this.metadata;
        return "BffPlpResponse(data=" + list + ", metadata=" + bffFullMetadata + ")";
    }

    @C11395k(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @C11587t0(expression = "", imports = {}))
    public /* synthetic */ BffPlpResponse(int i, @C12438n("data") List list, @C12438n("metadata") BffFullMetadata bffFullMetadata, C12295n1 n1Var) {
        if ((i & 0) != 0) {
            C12261c1.m49256b(i, 0, BffPlpResponse$$serializer.INSTANCE.getDescriptor());
        }
        if ((i & 1) == 0) {
            this.data = null;
        } else {
            this.data = list;
        }
        if ((i & 2) == 0) {
            this.metadata = null;
        } else {
            this.metadata = bffFullMetadata;
        }
    }

    public BffPlpResponse(@C12580l List<BffPlpProduct> list, @C12580l BffFullMetadata bffFullMetadata) {
        this.data = list;
        this.metadata = bffFullMetadata;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ BffPlpResponse(List list, BffFullMetadata bffFullMetadata, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : list, (i & 2) != 0 ? null : bffFullMetadata);
    }
}
