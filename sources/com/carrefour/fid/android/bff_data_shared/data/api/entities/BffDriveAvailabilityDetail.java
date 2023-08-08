package com.carrefour.fid.android.bff_data_shared.data.api.entities;

import com.carrefour.fid.android.shared.constant.C28547h2;
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
import kotlinx.serialization.internal.C12295n1;
import kotlinx.serialization.internal.EnumSerializer;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0005\b\b\u0018\u0000 %2\u00020\u0001:\u0002&%B\u0017\u0012\u0006\u0010\r\u001a\u00020\t\u0012\u0006\u0010\u000e\u001a\u00020\u000b¢\u0006\u0004\b\u001f\u0010 B3\b\u0017\u0012\u0006\u0010!\u001a\u00020\u0011\u0012\n\b\u0001\u0010\r\u001a\u0004\u0018\u00010\t\u0012\n\b\u0001\u0010\u000e\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010#\u001a\u0004\u0018\u00010\"¢\u0006\u0004\b\u001f\u0010$J!\u0010\b\u001a\u00020\u00072\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005HÇ\u0001J\t\u0010\n\u001a\u00020\tHÆ\u0003J\t\u0010\f\u001a\u00020\u000bHÆ\u0003J\u001d\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\r\u001a\u00020\t2\b\b\u0002\u0010\u000e\u001a\u00020\u000bHÆ\u0001J\t\u0010\u0010\u001a\u00020\u000bHÖ\u0001J\t\u0010\u0012\u001a\u00020\u0011HÖ\u0001J\u0013\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003R \u0010\r\u001a\u00020\t8\u0006X\u0004¢\u0006\u0012\n\u0004\b\r\u0010\u0016\u0012\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u0017\u0010\u0018R \u0010\u000e\u001a\u00020\u000b8\u0006X\u0004¢\u0006\u0012\n\u0004\b\u000e\u0010\u001b\u0012\u0004\b\u001e\u0010\u001a\u001a\u0004\b\u001c\u0010\u001d¨\u0006'"}, mo22516d2 = {"Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/BffDriveAvailabilityDetail;", "", "self", "Lkotlinx/serialization/encoding/d;", "output", "Lkotlinx/serialization/descriptors/f;", "serialDesc", "Lkotlin/d2;", "write$Self", "Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/BffDrivePromiseType;", "component1", "", "component2", "promise", "facilityServiceId", "copy", "toString", "", "hashCode", "other", "", "equals", "Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/BffDrivePromiseType;", "getPromise", "()Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/BffDrivePromiseType;", "getPromise$annotations", "()V", "Ljava/lang/String;", "getFacilityServiceId", "()Ljava/lang/String;", "getFacilityServiceId$annotations", "<init>", "(Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/BffDrivePromiseType;Ljava/lang/String;)V", "seen1", "Lkotlinx/serialization/internal/n1;", "serializationConstructorMarker", "(ILcom/carrefour/fid/android/bff_data_shared/data/api/entities/BffDrivePromiseType;Ljava/lang/String;Lkotlinx/serialization/internal/n1;)V", "Companion", "$serializer", "bff-data-shared_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
@C12439o
public final class BffDriveAvailabilityDetail {
    /* access modifiers changed from: private */
    @C12579k
    @C11287e
    public static final C12248g<Object>[] $childSerializers = {new EnumSerializer("com.carrefour.fid.android.bff_data_shared.data.api.entities.BffDrivePromiseType", BffDrivePromiseType.values()), null};
    @C12579k
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    @C12579k
    private final String facilityServiceId;
    @C12579k
    private final BffDrivePromiseType promise;

    @C11076d0(mo22515d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¨\u0006\u0007"}, mo22516d2 = {"Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/BffDriveAvailabilityDetail$Companion;", "", "Lkotlinx/serialization/g;", "Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/BffDriveAvailabilityDetail;", "serializer", "<init>", "()V", "bff-data-shared_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @C12579k
        public final C12248g<BffDriveAvailabilityDetail> serializer() {
            return BffDriveAvailabilityDetail$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    @C11395k(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @C11587t0(expression = "", imports = {}))
    public /* synthetic */ BffDriveAvailabilityDetail(int i, @C12438n("promise") BffDrivePromiseType bffDrivePromiseType, @C12438n("facility_service_id") String str, C12295n1 n1Var) {
        if (3 != (i & 3)) {
            C12261c1.m49256b(i, 3, BffDriveAvailabilityDetail$$serializer.INSTANCE.getDescriptor());
        }
        this.promise = bffDrivePromiseType;
        this.facilityServiceId = str;
    }

    public static /* synthetic */ BffDriveAvailabilityDetail copy$default(BffDriveAvailabilityDetail bffDriveAvailabilityDetail, BffDrivePromiseType bffDrivePromiseType, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            bffDrivePromiseType = bffDriveAvailabilityDetail.promise;
        }
        if ((i & 2) != 0) {
            str = bffDriveAvailabilityDetail.facilityServiceId;
        }
        return bffDriveAvailabilityDetail.copy(bffDrivePromiseType, str);
    }

    @C12438n("facility_service_id")
    public static /* synthetic */ void getFacilityServiceId$annotations() {
    }

    @C12438n("promise")
    public static /* synthetic */ void getPromise$annotations() {
    }

    @C11384m
    public static final /* synthetic */ void write$Self(BffDriveAvailabilityDetail bffDriveAvailabilityDetail, C12239d dVar, C12217f fVar) {
        dVar.mo24899D(fVar, 0, $childSerializers[0], bffDriveAvailabilityDetail.promise);
        dVar.mo24929z(fVar, 1, bffDriveAvailabilityDetail.facilityServiceId);
    }

    @C12579k
    public final BffDrivePromiseType component1() {
        return this.promise;
    }

    @C12579k
    public final String component2() {
        return this.facilityServiceId;
    }

    @C12579k
    public final BffDriveAvailabilityDetail copy(@C12579k BffDrivePromiseType bffDrivePromiseType, @C12579k String str) {
        Intrinsics.checkNotNullParameter(bffDrivePromiseType, "promise");
        Intrinsics.checkNotNullParameter(str, C28547h2.f69320h);
        return new BffDriveAvailabilityDetail(bffDrivePromiseType, str);
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BffDriveAvailabilityDetail)) {
            return false;
        }
        BffDriveAvailabilityDetail bffDriveAvailabilityDetail = (BffDriveAvailabilityDetail) obj;
        return this.promise == bffDriveAvailabilityDetail.promise && Intrinsics.areEqual((Object) this.facilityServiceId, (Object) bffDriveAvailabilityDetail.facilityServiceId);
    }

    @C12579k
    public final String getFacilityServiceId() {
        return this.facilityServiceId;
    }

    @C12579k
    public final BffDrivePromiseType getPromise() {
        return this.promise;
    }

    public int hashCode() {
        return (this.promise.hashCode() * 31) + this.facilityServiceId.hashCode();
    }

    @C12579k
    public String toString() {
        BffDrivePromiseType bffDrivePromiseType = this.promise;
        String str = this.facilityServiceId;
        return "BffDriveAvailabilityDetail(promise=" + bffDrivePromiseType + ", facilityServiceId=" + str + ")";
    }

    public BffDriveAvailabilityDetail(@C12579k BffDrivePromiseType bffDrivePromiseType, @C12579k String str) {
        Intrinsics.checkNotNullParameter(bffDrivePromiseType, "promise");
        Intrinsics.checkNotNullParameter(str, C28547h2.f69320h);
        this.promise = bffDrivePromiseType;
        this.facilityServiceId = str;
    }
}
