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

@C11076d0(mo22515d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\b\b\u0018\u0000 \u001f2\u00020\u0001:\u0002 \u001fB\u0013\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u0019\u0010\u001aB'\b\u0017\u0012\u0006\u0010\u001b\u001a\u00020\u000f\u0012\n\b\u0001\u0010\u000b\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u001d\u001a\u0004\u0018\u00010\u001c¢\u0006\u0004\b\u0019\u0010\u001eJ!\u0010\b\u001a\u00020\u00072\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005HÇ\u0001J\u000b\u0010\n\u001a\u0004\u0018\u00010\tHÆ\u0003J\u0015\u0010\f\u001a\u00020\u00002\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\tHÆ\u0001J\t\u0010\u000e\u001a\u00020\rHÖ\u0001J\t\u0010\u0010\u001a\u00020\u000fHÖ\u0001J\u0013\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\"\u0010\u000b\u001a\u0004\u0018\u00010\t8\u0006X\u0004¢\u0006\u0012\n\u0004\b\u000b\u0010\u0014\u0012\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0015\u0010\u0016¨\u0006!"}, mo22516d2 = {"Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/BffPickupPointResponse;", "", "self", "Lkotlinx/serialization/encoding/d;", "output", "Lkotlinx/serialization/descriptors/f;", "serialDesc", "Lkotlin/d2;", "write$Self", "Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/BffPickupPoint;", "component1", "pickupPoint", "copy", "", "toString", "", "hashCode", "other", "", "equals", "Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/BffPickupPoint;", "getPickupPoint", "()Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/BffPickupPoint;", "getPickupPoint$annotations", "()V", "<init>", "(Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/BffPickupPoint;)V", "seen1", "Lkotlinx/serialization/internal/n1;", "serializationConstructorMarker", "(ILcom/carrefour/fid/android/bff_data_shared/data/api/entities/BffPickupPoint;Lkotlinx/serialization/internal/n1;)V", "Companion", "$serializer", "bff-data-shared_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
@C12439o
public final class BffPickupPointResponse {
    @C12579k
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    @C12580l
    private final BffPickupPoint pickupPoint;

    @C11076d0(mo22515d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¨\u0006\u0007"}, mo22516d2 = {"Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/BffPickupPointResponse$Companion;", "", "Lkotlinx/serialization/g;", "Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/BffPickupPointResponse;", "serializer", "<init>", "()V", "bff-data-shared_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @C12579k
        public final C12248g<BffPickupPointResponse> serializer() {
            return BffPickupPointResponse$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public BffPickupPointResponse() {
        this((BffPickupPoint) null, 1, (DefaultConstructorMarker) null);
    }

    public static /* synthetic */ BffPickupPointResponse copy$default(BffPickupPointResponse bffPickupPointResponse, BffPickupPoint bffPickupPoint, int i, Object obj) {
        if ((i & 1) != 0) {
            bffPickupPoint = bffPickupPointResponse.pickupPoint;
        }
        return bffPickupPointResponse.copy(bffPickupPoint);
    }

    @C12438n("pickup_point")
    public static /* synthetic */ void getPickupPoint$annotations() {
    }

    @C11384m
    public static final /* synthetic */ void write$Self(BffPickupPointResponse bffPickupPointResponse, C12239d dVar, C12217f fVar) {
        boolean z = true;
        if (!dVar.mo24897A(fVar, 0) && bffPickupPointResponse.pickupPoint == null) {
            z = false;
        }
        if (z) {
            dVar.mo24912i(fVar, 0, BffPickupPoint$$serializer.INSTANCE, bffPickupPointResponse.pickupPoint);
        }
    }

    @C12580l
    public final BffPickupPoint component1() {
        return this.pickupPoint;
    }

    @C12579k
    public final BffPickupPointResponse copy(@C12580l BffPickupPoint bffPickupPoint) {
        return new BffPickupPointResponse(bffPickupPoint);
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof BffPickupPointResponse) && Intrinsics.areEqual((Object) this.pickupPoint, (Object) ((BffPickupPointResponse) obj).pickupPoint);
    }

    @C12580l
    public final BffPickupPoint getPickupPoint() {
        return this.pickupPoint;
    }

    public int hashCode() {
        BffPickupPoint bffPickupPoint = this.pickupPoint;
        if (bffPickupPoint == null) {
            return 0;
        }
        return bffPickupPoint.hashCode();
    }

    @C12579k
    public String toString() {
        BffPickupPoint bffPickupPoint = this.pickupPoint;
        return "BffPickupPointResponse(pickupPoint=" + bffPickupPoint + ")";
    }

    @C11395k(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @C11587t0(expression = "", imports = {}))
    public /* synthetic */ BffPickupPointResponse(int i, @C12438n("pickup_point") BffPickupPoint bffPickupPoint, C12295n1 n1Var) {
        if ((i & 0) != 0) {
            C12261c1.m49256b(i, 0, BffPickupPointResponse$$serializer.INSTANCE.getDescriptor());
        }
        if ((i & 1) == 0) {
            this.pickupPoint = null;
        } else {
            this.pickupPoint = bffPickupPoint;
        }
    }

    public BffPickupPointResponse(@C12580l BffPickupPoint bffPickupPoint) {
        this.pickupPoint = bffPickupPoint;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ BffPickupPointResponse(BffPickupPoint bffPickupPoint, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : bffPickupPoint);
    }
}
