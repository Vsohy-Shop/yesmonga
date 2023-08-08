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

@C11076d0(mo22515d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0005\b\b\u0018\u0000 #2\u00020\u0001:\u0002$#B\u001f\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u001d\u0010\u001eB3\b\u0017\u0012\u0006\u0010\u001f\u001a\u00020\u0011\u0012\n\b\u0001\u0010\f\u001a\u0004\u0018\u00010\t\u0012\n\b\u0001\u0010\r\u001a\u0004\u0018\u00010\t\u0012\b\u0010!\u001a\u0004\u0018\u00010 ¢\u0006\u0004\b\u001d\u0010\"J!\u0010\b\u001a\u00020\u00072\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005HÇ\u0001J\u000b\u0010\n\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\tHÆ\u0003J!\u0010\u000e\u001a\u00020\u00002\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\tHÆ\u0001J\t\u0010\u0010\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0012\u001a\u00020\u0011HÖ\u0001J\u0013\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\"\u0010\f\u001a\u0004\u0018\u00010\t8\u0006X\u0004¢\u0006\u0012\n\u0004\b\f\u0010\u0016\u0012\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u0017\u0010\u0018R\"\u0010\r\u001a\u0004\u0018\u00010\t8\u0006X\u0004¢\u0006\u0012\n\u0004\b\r\u0010\u0016\u0012\u0004\b\u001c\u0010\u001a\u001a\u0004\b\u001b\u0010\u0018¨\u0006%"}, mo22516d2 = {"Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/BffServiceFees;", "", "self", "Lkotlinx/serialization/encoding/d;", "output", "Lkotlinx/serialization/descriptors/f;", "serialDesc", "Lkotlin/d2;", "write$Self", "Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/BffServiceFee;", "component1", "component2", "deliveryFee", "preparationFee", "copy", "", "toString", "", "hashCode", "other", "", "equals", "Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/BffServiceFee;", "getDeliveryFee", "()Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/BffServiceFee;", "getDeliveryFee$annotations", "()V", "getPreparationFee", "getPreparationFee$annotations", "<init>", "(Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/BffServiceFee;Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/BffServiceFee;)V", "seen1", "Lkotlinx/serialization/internal/n1;", "serializationConstructorMarker", "(ILcom/carrefour/fid/android/bff_data_shared/data/api/entities/BffServiceFee;Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/BffServiceFee;Lkotlinx/serialization/internal/n1;)V", "Companion", "$serializer", "bff-data-shared_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
@C12439o
public final class BffServiceFees {
    @C12579k
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    @C12580l
    private final BffServiceFee deliveryFee;
    @C12580l
    private final BffServiceFee preparationFee;

    @C11076d0(mo22515d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¨\u0006\u0007"}, mo22516d2 = {"Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/BffServiceFees$Companion;", "", "Lkotlinx/serialization/g;", "Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/BffServiceFees;", "serializer", "<init>", "()V", "bff-data-shared_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @C12579k
        public final C12248g<BffServiceFees> serializer() {
            return BffServiceFees$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public BffServiceFees() {
        this((BffServiceFee) null, (BffServiceFee) null, 3, (DefaultConstructorMarker) null);
    }

    public static /* synthetic */ BffServiceFees copy$default(BffServiceFees bffServiceFees, BffServiceFee bffServiceFee, BffServiceFee bffServiceFee2, int i, Object obj) {
        if ((i & 1) != 0) {
            bffServiceFee = bffServiceFees.deliveryFee;
        }
        if ((i & 2) != 0) {
            bffServiceFee2 = bffServiceFees.preparationFee;
        }
        return bffServiceFees.copy(bffServiceFee, bffServiceFee2);
    }

    @C12438n("delivery_fee")
    public static /* synthetic */ void getDeliveryFee$annotations() {
    }

    @C12438n("preparation_fee")
    public static /* synthetic */ void getPreparationFee$annotations() {
    }

    @C11384m
    public static final /* synthetic */ void write$Self(BffServiceFees bffServiceFees, C12239d dVar, C12217f fVar) {
        boolean z = false;
        if (dVar.mo24897A(fVar, 0) || bffServiceFees.deliveryFee != null) {
            dVar.mo24912i(fVar, 0, BffServiceFee$$serializer.INSTANCE, bffServiceFees.deliveryFee);
        }
        if (dVar.mo24897A(fVar, 1) || bffServiceFees.preparationFee != null) {
            z = true;
        }
        if (z) {
            dVar.mo24912i(fVar, 1, BffServiceFee$$serializer.INSTANCE, bffServiceFees.preparationFee);
        }
    }

    @C12580l
    public final BffServiceFee component1() {
        return this.deliveryFee;
    }

    @C12580l
    public final BffServiceFee component2() {
        return this.preparationFee;
    }

    @C12579k
    public final BffServiceFees copy(@C12580l BffServiceFee bffServiceFee, @C12580l BffServiceFee bffServiceFee2) {
        return new BffServiceFees(bffServiceFee, bffServiceFee2);
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BffServiceFees)) {
            return false;
        }
        BffServiceFees bffServiceFees = (BffServiceFees) obj;
        return Intrinsics.areEqual((Object) this.deliveryFee, (Object) bffServiceFees.deliveryFee) && Intrinsics.areEqual((Object) this.preparationFee, (Object) bffServiceFees.preparationFee);
    }

    @C12580l
    public final BffServiceFee getDeliveryFee() {
        return this.deliveryFee;
    }

    @C12580l
    public final BffServiceFee getPreparationFee() {
        return this.preparationFee;
    }

    public int hashCode() {
        BffServiceFee bffServiceFee = this.deliveryFee;
        int i = 0;
        int hashCode = (bffServiceFee == null ? 0 : bffServiceFee.hashCode()) * 31;
        BffServiceFee bffServiceFee2 = this.preparationFee;
        if (bffServiceFee2 != null) {
            i = bffServiceFee2.hashCode();
        }
        return hashCode + i;
    }

    @C12579k
    public String toString() {
        BffServiceFee bffServiceFee = this.deliveryFee;
        BffServiceFee bffServiceFee2 = this.preparationFee;
        return "BffServiceFees(deliveryFee=" + bffServiceFee + ", preparationFee=" + bffServiceFee2 + ")";
    }

    @C11395k(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @C11587t0(expression = "", imports = {}))
    public /* synthetic */ BffServiceFees(int i, @C12438n("delivery_fee") BffServiceFee bffServiceFee, @C12438n("preparation_fee") BffServiceFee bffServiceFee2, C12295n1 n1Var) {
        if ((i & 0) != 0) {
            C12261c1.m49256b(i, 0, BffServiceFees$$serializer.INSTANCE.getDescriptor());
        }
        if ((i & 1) == 0) {
            this.deliveryFee = null;
        } else {
            this.deliveryFee = bffServiceFee;
        }
        if ((i & 2) == 0) {
            this.preparationFee = null;
        } else {
            this.preparationFee = bffServiceFee2;
        }
    }

    public BffServiceFees(@C12580l BffServiceFee bffServiceFee, @C12580l BffServiceFee bffServiceFee2) {
        this.deliveryFee = bffServiceFee;
        this.preparationFee = bffServiceFee2;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ BffServiceFees(BffServiceFee bffServiceFee, BffServiceFee bffServiceFee2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : bffServiceFee, (i & 2) != 0 ? null : bffServiceFee2);
    }
}
