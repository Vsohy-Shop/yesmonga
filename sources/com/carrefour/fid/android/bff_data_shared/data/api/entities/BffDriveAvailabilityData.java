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

@C11076d0(mo22515d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\b\b\u0018\u0000 \u001f2\u00020\u0001:\u0002 \u001fB\u0013\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u0019\u0010\u001aB'\b\u0017\u0012\u0006\u0010\u001b\u001a\u00020\u000f\u0012\n\b\u0001\u0010\u000b\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u001d\u001a\u0004\u0018\u00010\u001c¢\u0006\u0004\b\u0019\u0010\u001eJ!\u0010\b\u001a\u00020\u00072\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005HÇ\u0001J\u000b\u0010\n\u001a\u0004\u0018\u00010\tHÆ\u0003J\u0015\u0010\f\u001a\u00020\u00002\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\tHÆ\u0001J\t\u0010\u000e\u001a\u00020\rHÖ\u0001J\t\u0010\u0010\u001a\u00020\u000fHÖ\u0001J\u0013\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\"\u0010\u000b\u001a\u0004\u0018\u00010\t8\u0006X\u0004¢\u0006\u0012\n\u0004\b\u000b\u0010\u0014\u0012\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0015\u0010\u0016¨\u0006!"}, mo22516d2 = {"Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/BffDriveAvailabilityData;", "", "self", "Lkotlinx/serialization/encoding/d;", "output", "Lkotlinx/serialization/descriptors/f;", "serialDesc", "Lkotlin/d2;", "write$Self", "Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/BffDriveAvailabilityDetail;", "component1", "eligibility", "copy", "", "toString", "", "hashCode", "other", "", "equals", "Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/BffDriveAvailabilityDetail;", "getEligibility", "()Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/BffDriveAvailabilityDetail;", "getEligibility$annotations", "()V", "<init>", "(Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/BffDriveAvailabilityDetail;)V", "seen1", "Lkotlinx/serialization/internal/n1;", "serializationConstructorMarker", "(ILcom/carrefour/fid/android/bff_data_shared/data/api/entities/BffDriveAvailabilityDetail;Lkotlinx/serialization/internal/n1;)V", "Companion", "$serializer", "bff-data-shared_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
@C12439o
public final class BffDriveAvailabilityData {
    @C12579k
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    @C12580l
    private final BffDriveAvailabilityDetail eligibility;

    @C11076d0(mo22515d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¨\u0006\u0007"}, mo22516d2 = {"Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/BffDriveAvailabilityData$Companion;", "", "Lkotlinx/serialization/g;", "Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/BffDriveAvailabilityData;", "serializer", "<init>", "()V", "bff-data-shared_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @C12579k
        public final C12248g<BffDriveAvailabilityData> serializer() {
            return BffDriveAvailabilityData$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public BffDriveAvailabilityData() {
        this((BffDriveAvailabilityDetail) null, 1, (DefaultConstructorMarker) null);
    }

    public static /* synthetic */ BffDriveAvailabilityData copy$default(BffDriveAvailabilityData bffDriveAvailabilityData, BffDriveAvailabilityDetail bffDriveAvailabilityDetail, int i, Object obj) {
        if ((i & 1) != 0) {
            bffDriveAvailabilityDetail = bffDriveAvailabilityData.eligibility;
        }
        return bffDriveAvailabilityData.copy(bffDriveAvailabilityDetail);
    }

    @C12438n("availability")
    public static /* synthetic */ void getEligibility$annotations() {
    }

    @C11384m
    public static final /* synthetic */ void write$Self(BffDriveAvailabilityData bffDriveAvailabilityData, C12239d dVar, C12217f fVar) {
        boolean z = true;
        if (!dVar.mo24897A(fVar, 0) && bffDriveAvailabilityData.eligibility == null) {
            z = false;
        }
        if (z) {
            dVar.mo24912i(fVar, 0, BffDriveAvailabilityDetail$$serializer.INSTANCE, bffDriveAvailabilityData.eligibility);
        }
    }

    @C12580l
    public final BffDriveAvailabilityDetail component1() {
        return this.eligibility;
    }

    @C12579k
    public final BffDriveAvailabilityData copy(@C12580l BffDriveAvailabilityDetail bffDriveAvailabilityDetail) {
        return new BffDriveAvailabilityData(bffDriveAvailabilityDetail);
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof BffDriveAvailabilityData) && Intrinsics.areEqual((Object) this.eligibility, (Object) ((BffDriveAvailabilityData) obj).eligibility);
    }

    @C12580l
    public final BffDriveAvailabilityDetail getEligibility() {
        return this.eligibility;
    }

    public int hashCode() {
        BffDriveAvailabilityDetail bffDriveAvailabilityDetail = this.eligibility;
        if (bffDriveAvailabilityDetail == null) {
            return 0;
        }
        return bffDriveAvailabilityDetail.hashCode();
    }

    @C12579k
    public String toString() {
        BffDriveAvailabilityDetail bffDriveAvailabilityDetail = this.eligibility;
        return "BffDriveAvailabilityData(eligibility=" + bffDriveAvailabilityDetail + ")";
    }

    @C11395k(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @C11587t0(expression = "", imports = {}))
    public /* synthetic */ BffDriveAvailabilityData(int i, @C12438n("availability") BffDriveAvailabilityDetail bffDriveAvailabilityDetail, C12295n1 n1Var) {
        if ((i & 0) != 0) {
            C12261c1.m49256b(i, 0, BffDriveAvailabilityData$$serializer.INSTANCE.getDescriptor());
        }
        if ((i & 1) == 0) {
            this.eligibility = null;
        } else {
            this.eligibility = bffDriveAvailabilityDetail;
        }
    }

    public BffDriveAvailabilityData(@C12580l BffDriveAvailabilityDetail bffDriveAvailabilityDetail) {
        this.eligibility = bffDriveAvailabilityDetail;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ BffDriveAvailabilityData(BffDriveAvailabilityDetail bffDriveAvailabilityDetail, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : bffDriveAvailabilityDetail);
    }
}
