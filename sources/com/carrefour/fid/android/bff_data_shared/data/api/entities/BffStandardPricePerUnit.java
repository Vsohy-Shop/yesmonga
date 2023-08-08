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
import kotlinx.serialization.internal.C12276h0;
import kotlinx.serialization.internal.C12295n1;
import kotlinx.serialization.internal.C12310s1;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0005\b\b\u0018\u0000 %2\u00020\u0001:\u0002&%B\u001f\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u001f\u0010 B3\b\u0017\u0012\u0006\u0010!\u001a\u00020\t\u0012\n\b\u0001\u0010\u000e\u001a\u0004\u0018\u00010\t\u0012\n\b\u0001\u0010\u000f\u001a\u0004\u0018\u00010\f\u0012\b\u0010#\u001a\u0004\u0018\u00010\"¢\u0006\u0004\b\u001f\u0010$J!\u0010\b\u001a\u00020\u00072\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005HÇ\u0001J\u0012\u0010\n\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u000b\u0010\r\u001a\u0004\u0018\u00010\fHÆ\u0003J(\u0010\u0010\u001a\u00020\u00002\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\fHÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\t\u0010\u0012\u001a\u00020\fHÖ\u0001J\t\u0010\u0013\u001a\u00020\tHÖ\u0001J\u0013\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\"\u0010\u000e\u001a\u0004\u0018\u00010\t8\u0006X\u0004¢\u0006\u0012\n\u0004\b\u000e\u0010\u0017\u0012\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u0018\u0010\u000bR\"\u0010\u000f\u001a\u0004\u0018\u00010\f8\u0006X\u0004¢\u0006\u0012\n\u0004\b\u000f\u0010\u001b\u0012\u0004\b\u001e\u0010\u001a\u001a\u0004\b\u001c\u0010\u001d¨\u0006'"}, mo22516d2 = {"Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/BffStandardPricePerUnit;", "", "self", "Lkotlinx/serialization/encoding/d;", "output", "Lkotlinx/serialization/descriptors/f;", "serialDesc", "Lkotlin/d2;", "write$Self", "", "component1", "()Ljava/lang/Integer;", "", "component2", "pricePerUnitValue", "unitOfMeasure", "copy", "(Ljava/lang/Integer;Ljava/lang/String;)Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/BffStandardPricePerUnit;", "toString", "hashCode", "other", "", "equals", "Ljava/lang/Integer;", "getPricePerUnitValue", "getPricePerUnitValue$annotations", "()V", "Ljava/lang/String;", "getUnitOfMeasure", "()Ljava/lang/String;", "getUnitOfMeasure$annotations", "<init>", "(Ljava/lang/Integer;Ljava/lang/String;)V", "seen1", "Lkotlinx/serialization/internal/n1;", "serializationConstructorMarker", "(ILjava/lang/Integer;Ljava/lang/String;Lkotlinx/serialization/internal/n1;)V", "Companion", "$serializer", "bff-data-shared_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
@C12439o
public final class BffStandardPricePerUnit {
    @C12579k
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    @C12580l
    private final Integer pricePerUnitValue;
    @C12580l
    private final String unitOfMeasure;

    @C11076d0(mo22515d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¨\u0006\u0007"}, mo22516d2 = {"Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/BffStandardPricePerUnit$Companion;", "", "Lkotlinx/serialization/g;", "Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/BffStandardPricePerUnit;", "serializer", "<init>", "()V", "bff-data-shared_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @C12579k
        public final C12248g<BffStandardPricePerUnit> serializer() {
            return BffStandardPricePerUnit$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public BffStandardPricePerUnit() {
        this((Integer) null, (String) null, 3, (DefaultConstructorMarker) null);
    }

    public static /* synthetic */ BffStandardPricePerUnit copy$default(BffStandardPricePerUnit bffStandardPricePerUnit, Integer num, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            num = bffStandardPricePerUnit.pricePerUnitValue;
        }
        if ((i & 2) != 0) {
            str = bffStandardPricePerUnit.unitOfMeasure;
        }
        return bffStandardPricePerUnit.copy(num, str);
    }

    @C12438n("price_per_unit_value")
    public static /* synthetic */ void getPricePerUnitValue$annotations() {
    }

    @C12438n("unit_of_measure")
    public static /* synthetic */ void getUnitOfMeasure$annotations() {
    }

    @C11384m
    public static final /* synthetic */ void write$Self(BffStandardPricePerUnit bffStandardPricePerUnit, C12239d dVar, C12217f fVar) {
        boolean z = false;
        if (dVar.mo24897A(fVar, 0) || bffStandardPricePerUnit.pricePerUnitValue != null) {
            dVar.mo24912i(fVar, 0, C12276h0.f30067a, bffStandardPricePerUnit.pricePerUnitValue);
        }
        if (dVar.mo24897A(fVar, 1) || bffStandardPricePerUnit.unitOfMeasure != null) {
            z = true;
        }
        if (z) {
            dVar.mo24912i(fVar, 1, C12310s1.f30117a, bffStandardPricePerUnit.unitOfMeasure);
        }
    }

    @C12580l
    public final Integer component1() {
        return this.pricePerUnitValue;
    }

    @C12580l
    public final String component2() {
        return this.unitOfMeasure;
    }

    @C12579k
    public final BffStandardPricePerUnit copy(@C12580l Integer num, @C12580l String str) {
        return new BffStandardPricePerUnit(num, str);
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BffStandardPricePerUnit)) {
            return false;
        }
        BffStandardPricePerUnit bffStandardPricePerUnit = (BffStandardPricePerUnit) obj;
        return Intrinsics.areEqual((Object) this.pricePerUnitValue, (Object) bffStandardPricePerUnit.pricePerUnitValue) && Intrinsics.areEqual((Object) this.unitOfMeasure, (Object) bffStandardPricePerUnit.unitOfMeasure);
    }

    @C12580l
    public final Integer getPricePerUnitValue() {
        return this.pricePerUnitValue;
    }

    @C12580l
    public final String getUnitOfMeasure() {
        return this.unitOfMeasure;
    }

    public int hashCode() {
        Integer num = this.pricePerUnitValue;
        int i = 0;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.unitOfMeasure;
        if (str != null) {
            i = str.hashCode();
        }
        return hashCode + i;
    }

    @C12579k
    public String toString() {
        Integer num = this.pricePerUnitValue;
        String str = this.unitOfMeasure;
        return "BffStandardPricePerUnit(pricePerUnitValue=" + num + ", unitOfMeasure=" + str + ")";
    }

    @C11395k(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @C11587t0(expression = "", imports = {}))
    public /* synthetic */ BffStandardPricePerUnit(int i, @C12438n("price_per_unit_value") Integer num, @C12438n("unit_of_measure") String str, C12295n1 n1Var) {
        if ((i & 0) != 0) {
            C12261c1.m49256b(i, 0, BffStandardPricePerUnit$$serializer.INSTANCE.getDescriptor());
        }
        if ((i & 1) == 0) {
            this.pricePerUnitValue = null;
        } else {
            this.pricePerUnitValue = num;
        }
        if ((i & 2) == 0) {
            this.unitOfMeasure = null;
        } else {
            this.unitOfMeasure = str;
        }
    }

    public BffStandardPricePerUnit(@C12580l Integer num, @C12580l String str) {
        this.pricePerUnitValue = num;
        this.unitOfMeasure = str;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ BffStandardPricePerUnit(Integer num, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : num, (i & 2) != 0 ? null : str);
    }
}
