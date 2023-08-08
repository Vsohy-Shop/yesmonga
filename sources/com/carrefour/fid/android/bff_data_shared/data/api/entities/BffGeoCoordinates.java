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
import kotlinx.serialization.internal.C12324x;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0005\b\b\u0018\u0000 $2\u00020\u0001:\u0002%$B\u001f\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u001e\u0010\u001fB3\b\u0017\u0012\u0006\u0010 \u001a\u00020\u0013\u0012\n\b\u0001\u0010\r\u001a\u0004\u0018\u00010\t\u0012\n\b\u0001\u0010\u000e\u001a\u0004\u0018\u00010\t\u0012\b\u0010\"\u001a\u0004\u0018\u00010!¢\u0006\u0004\b\u001e\u0010#J!\u0010\b\u001a\u00020\u00072\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005HÇ\u0001J\u0012\u0010\n\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0012\u0010\f\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b\f\u0010\u000bJ(\u0010\u000f\u001a\u00020\u00002\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\tHÆ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\t\u0010\u0012\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0013HÖ\u0001J\u0013\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\"\u0010\r\u001a\u0004\u0018\u00010\t8\u0006X\u0004¢\u0006\u0012\n\u0004\b\r\u0010\u0018\u0012\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u0019\u0010\u000bR\"\u0010\u000e\u001a\u0004\u0018\u00010\t8\u0006X\u0004¢\u0006\u0012\n\u0004\b\u000e\u0010\u0018\u0012\u0004\b\u001d\u0010\u001b\u001a\u0004\b\u001c\u0010\u000b¨\u0006&"}, mo22516d2 = {"Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/BffGeoCoordinates;", "", "self", "Lkotlinx/serialization/encoding/d;", "output", "Lkotlinx/serialization/descriptors/f;", "serialDesc", "Lkotlin/d2;", "write$Self", "", "component1", "()Ljava/lang/Float;", "component2", "latitude", "longitude", "copy", "(Ljava/lang/Float;Ljava/lang/Float;)Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/BffGeoCoordinates;", "", "toString", "", "hashCode", "other", "", "equals", "Ljava/lang/Float;", "getLatitude", "getLatitude$annotations", "()V", "getLongitude", "getLongitude$annotations", "<init>", "(Ljava/lang/Float;Ljava/lang/Float;)V", "seen1", "Lkotlinx/serialization/internal/n1;", "serializationConstructorMarker", "(ILjava/lang/Float;Ljava/lang/Float;Lkotlinx/serialization/internal/n1;)V", "Companion", "$serializer", "bff-data-shared_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
@C12439o
public final class BffGeoCoordinates {
    @C12579k
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    @C12580l
    private final Float latitude;
    @C12580l
    private final Float longitude;

    @C11076d0(mo22515d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¨\u0006\u0007"}, mo22516d2 = {"Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/BffGeoCoordinates$Companion;", "", "Lkotlinx/serialization/g;", "Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/BffGeoCoordinates;", "serializer", "<init>", "()V", "bff-data-shared_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @C12579k
        public final C12248g<BffGeoCoordinates> serializer() {
            return BffGeoCoordinates$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public BffGeoCoordinates() {
        this((Float) null, (Float) null, 3, (DefaultConstructorMarker) null);
    }

    public static /* synthetic */ BffGeoCoordinates copy$default(BffGeoCoordinates bffGeoCoordinates, Float f, Float f2, int i, Object obj) {
        if ((i & 1) != 0) {
            f = bffGeoCoordinates.latitude;
        }
        if ((i & 2) != 0) {
            f2 = bffGeoCoordinates.longitude;
        }
        return bffGeoCoordinates.copy(f, f2);
    }

    @C12438n("latitude")
    public static /* synthetic */ void getLatitude$annotations() {
    }

    @C12438n("longitude")
    public static /* synthetic */ void getLongitude$annotations() {
    }

    @C11384m
    public static final /* synthetic */ void write$Self(BffGeoCoordinates bffGeoCoordinates, C12239d dVar, C12217f fVar) {
        boolean z = false;
        if (dVar.mo24897A(fVar, 0) || bffGeoCoordinates.latitude != null) {
            dVar.mo24912i(fVar, 0, C12324x.f30145a, bffGeoCoordinates.latitude);
        }
        if (dVar.mo24897A(fVar, 1) || bffGeoCoordinates.longitude != null) {
            z = true;
        }
        if (z) {
            dVar.mo24912i(fVar, 1, C12324x.f30145a, bffGeoCoordinates.longitude);
        }
    }

    @C12580l
    public final Float component1() {
        return this.latitude;
    }

    @C12580l
    public final Float component2() {
        return this.longitude;
    }

    @C12579k
    public final BffGeoCoordinates copy(@C12580l Float f, @C12580l Float f2) {
        return new BffGeoCoordinates(f, f2);
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BffGeoCoordinates)) {
            return false;
        }
        BffGeoCoordinates bffGeoCoordinates = (BffGeoCoordinates) obj;
        return Intrinsics.areEqual((Object) this.latitude, (Object) bffGeoCoordinates.latitude) && Intrinsics.areEqual((Object) this.longitude, (Object) bffGeoCoordinates.longitude);
    }

    @C12580l
    public final Float getLatitude() {
        return this.latitude;
    }

    @C12580l
    public final Float getLongitude() {
        return this.longitude;
    }

    public int hashCode() {
        Float f = this.latitude;
        int i = 0;
        int hashCode = (f == null ? 0 : f.hashCode()) * 31;
        Float f2 = this.longitude;
        if (f2 != null) {
            i = f2.hashCode();
        }
        return hashCode + i;
    }

    @C12579k
    public String toString() {
        Float f = this.latitude;
        Float f2 = this.longitude;
        return "BffGeoCoordinates(latitude=" + f + ", longitude=" + f2 + ")";
    }

    @C11395k(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @C11587t0(expression = "", imports = {}))
    public /* synthetic */ BffGeoCoordinates(int i, @C12438n("latitude") Float f, @C12438n("longitude") Float f2, C12295n1 n1Var) {
        if ((i & 0) != 0) {
            C12261c1.m49256b(i, 0, BffGeoCoordinates$$serializer.INSTANCE.getDescriptor());
        }
        if ((i & 1) == 0) {
            this.latitude = null;
        } else {
            this.latitude = f;
        }
        if ((i & 2) == 0) {
            this.longitude = null;
        } else {
            this.longitude = f2;
        }
    }

    public BffGeoCoordinates(@C12580l Float f, @C12580l Float f2) {
        this.latitude = f;
        this.longitude = f2;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ BffGeoCoordinates(Float f, Float f2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : f, (i & 2) != 0 ? null : f2);
    }
}
