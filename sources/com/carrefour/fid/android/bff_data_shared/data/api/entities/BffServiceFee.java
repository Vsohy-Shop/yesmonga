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
import kotlinx.serialization.internal.C12310s1;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0005\b\b\u0018\u0000 %2\u00020\u0001:\u0002&%B\u001f\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u001f\u0010 B3\b\u0017\u0012\u0006\u0010!\u001a\u00020\u0011\u0012\n\b\u0001\u0010\r\u001a\u0004\u0018\u00010\t\u0012\n\b\u0001\u0010\u000e\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010#\u001a\u0004\u0018\u00010\"¢\u0006\u0004\b\u001f\u0010$J!\u0010\b\u001a\u00020\u00072\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005HÇ\u0001J\u000b\u0010\n\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010\f\u001a\u0004\u0018\u00010\u000bHÆ\u0003J!\u0010\u000f\u001a\u00020\u00002\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000bHÆ\u0001J\t\u0010\u0010\u001a\u00020\tHÖ\u0001J\t\u0010\u0012\u001a\u00020\u0011HÖ\u0001J\u0013\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\"\u0010\r\u001a\u0004\u0018\u00010\t8\u0006X\u0004¢\u0006\u0012\n\u0004\b\r\u0010\u0016\u0012\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u0017\u0010\u0018R\"\u0010\u000e\u001a\u0004\u0018\u00010\u000b8\u0006X\u0004¢\u0006\u0012\n\u0004\b\u000e\u0010\u001b\u0012\u0004\b\u001e\u0010\u001a\u001a\u0004\b\u001c\u0010\u001d¨\u0006'"}, mo22516d2 = {"Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/BffServiceFee;", "", "self", "Lkotlinx/serialization/encoding/d;", "output", "Lkotlinx/serialization/descriptors/f;", "serialDesc", "Lkotlin/d2;", "write$Self", "", "component1", "Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/BffMoney;", "component2", "feeEan", "feeAmount", "copy", "toString", "", "hashCode", "other", "", "equals", "Ljava/lang/String;", "getFeeEan", "()Ljava/lang/String;", "getFeeEan$annotations", "()V", "Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/BffMoney;", "getFeeAmount", "()Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/BffMoney;", "getFeeAmount$annotations", "<init>", "(Ljava/lang/String;Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/BffMoney;)V", "seen1", "Lkotlinx/serialization/internal/n1;", "serializationConstructorMarker", "(ILjava/lang/String;Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/BffMoney;Lkotlinx/serialization/internal/n1;)V", "Companion", "$serializer", "bff-data-shared_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
@C12439o
public final class BffServiceFee {
    @C12579k
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    @C12580l
    private final BffMoney feeAmount;
    @C12580l
    private final String feeEan;

    @C11076d0(mo22515d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¨\u0006\u0007"}, mo22516d2 = {"Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/BffServiceFee$Companion;", "", "Lkotlinx/serialization/g;", "Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/BffServiceFee;", "serializer", "<init>", "()V", "bff-data-shared_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @C12579k
        public final C12248g<BffServiceFee> serializer() {
            return BffServiceFee$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public BffServiceFee() {
        this((String) null, (BffMoney) null, 3, (DefaultConstructorMarker) null);
    }

    public static /* synthetic */ BffServiceFee copy$default(BffServiceFee bffServiceFee, String str, BffMoney bffMoney, int i, Object obj) {
        if ((i & 1) != 0) {
            str = bffServiceFee.feeEan;
        }
        if ((i & 2) != 0) {
            bffMoney = bffServiceFee.feeAmount;
        }
        return bffServiceFee.copy(str, bffMoney);
    }

    @C12438n("fee_amount")
    public static /* synthetic */ void getFeeAmount$annotations() {
    }

    @C12438n("fee_ean")
    public static /* synthetic */ void getFeeEan$annotations() {
    }

    @C11384m
    public static final /* synthetic */ void write$Self(BffServiceFee bffServiceFee, C12239d dVar, C12217f fVar) {
        boolean z = false;
        if (dVar.mo24897A(fVar, 0) || bffServiceFee.feeEan != null) {
            dVar.mo24912i(fVar, 0, C12310s1.f30117a, bffServiceFee.feeEan);
        }
        if (dVar.mo24897A(fVar, 1) || bffServiceFee.feeAmount != null) {
            z = true;
        }
        if (z) {
            dVar.mo24912i(fVar, 1, BffMoney$$serializer.INSTANCE, bffServiceFee.feeAmount);
        }
    }

    @C12580l
    public final String component1() {
        return this.feeEan;
    }

    @C12580l
    public final BffMoney component2() {
        return this.feeAmount;
    }

    @C12579k
    public final BffServiceFee copy(@C12580l String str, @C12580l BffMoney bffMoney) {
        return new BffServiceFee(str, bffMoney);
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BffServiceFee)) {
            return false;
        }
        BffServiceFee bffServiceFee = (BffServiceFee) obj;
        return Intrinsics.areEqual((Object) this.feeEan, (Object) bffServiceFee.feeEan) && Intrinsics.areEqual((Object) this.feeAmount, (Object) bffServiceFee.feeAmount);
    }

    @C12580l
    public final BffMoney getFeeAmount() {
        return this.feeAmount;
    }

    @C12580l
    public final String getFeeEan() {
        return this.feeEan;
    }

    public int hashCode() {
        String str = this.feeEan;
        int i = 0;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        BffMoney bffMoney = this.feeAmount;
        if (bffMoney != null) {
            i = bffMoney.hashCode();
        }
        return hashCode + i;
    }

    @C12579k
    public String toString() {
        String str = this.feeEan;
        BffMoney bffMoney = this.feeAmount;
        return "BffServiceFee(feeEan=" + str + ", feeAmount=" + bffMoney + ")";
    }

    @C11395k(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @C11587t0(expression = "", imports = {}))
    public /* synthetic */ BffServiceFee(int i, @C12438n("fee_ean") String str, @C12438n("fee_amount") BffMoney bffMoney, C12295n1 n1Var) {
        if ((i & 0) != 0) {
            C12261c1.m49256b(i, 0, BffServiceFee$$serializer.INSTANCE.getDescriptor());
        }
        if ((i & 1) == 0) {
            this.feeEan = null;
        } else {
            this.feeEan = str;
        }
        if ((i & 2) == 0) {
            this.feeAmount = null;
        } else {
            this.feeAmount = bffMoney;
        }
    }

    public BffServiceFee(@C12580l String str, @C12580l BffMoney bffMoney) {
        this.feeEan = str;
        this.feeAmount = bffMoney;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ BffServiceFee(String str, BffMoney bffMoney, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : bffMoney);
    }
}
