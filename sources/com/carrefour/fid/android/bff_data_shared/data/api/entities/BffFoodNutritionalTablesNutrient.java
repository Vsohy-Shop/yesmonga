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
import kotlinx.serialization.internal.C12311t;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0006\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u0005\b\b\u0018\u0000 42\u00020\u0001:\u000254BC\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b.\u0010/BW\b\u0017\u0012\u0006\u00100\u001a\u00020\u000b\u0012\n\b\u0001\u0010\u0013\u001a\u0004\u0018\u00010\t\u0012\n\b\u0001\u0010\u0014\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0001\u0010\u0015\u001a\u0004\u0018\u00010\t\u0012\n\b\u0001\u0010\u0016\u001a\u0004\u0018\u00010\t\u0012\n\b\u0001\u0010\u0017\u001a\u0004\u0018\u00010\u0010\u0012\b\u00102\u001a\u0004\u0018\u000101¢\u0006\u0004\b.\u00103J!\u0010\b\u001a\u00020\u00072\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005HÇ\u0001J\u000b\u0010\n\u001a\u0004\u0018\u00010\tHÆ\u0003J\u0012\u0010\f\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u000b\u0010\u000e\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\tHÆ\u0003J\u0012\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0012JL\u0010\u0018\u001a\u00020\u00002\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0010HÆ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\t\u0010\u001a\u001a\u00020\tHÖ\u0001J\t\u0010\u001b\u001a\u00020\u000bHÖ\u0001J\u0013\u0010\u001e\u001a\u00020\u001d2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\"\u0010\u0013\u001a\u0004\u0018\u00010\t8\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0013\u0010\u001f\u0012\u0004\b\"\u0010#\u001a\u0004\b \u0010!R\"\u0010\u0014\u001a\u0004\u0018\u00010\u000b8\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0014\u0010$\u0012\u0004\b&\u0010#\u001a\u0004\b%\u0010\rR\"\u0010\u0015\u001a\u0004\u0018\u00010\t8\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0015\u0010\u001f\u0012\u0004\b(\u0010#\u001a\u0004\b'\u0010!R\"\u0010\u0016\u001a\u0004\u0018\u00010\t8\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0016\u0010\u001f\u0012\u0004\b*\u0010#\u001a\u0004\b)\u0010!R\"\u0010\u0017\u001a\u0004\u0018\u00010\u00108\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0017\u0010+\u0012\u0004\b-\u0010#\u001a\u0004\b,\u0010\u0012¨\u00066"}, mo22516d2 = {"Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/BffFoodNutritionalTablesNutrient;", "", "self", "Lkotlinx/serialization/encoding/d;", "output", "Lkotlinx/serialization/descriptors/f;", "serialDesc", "Lkotlin/d2;", "write$Self", "", "component1", "", "component2", "()Ljava/lang/Integer;", "component3", "component4", "", "component5", "()Ljava/lang/Double;", "label", "percentOkDailyContrbution", "precision", "unit", "value", "copy", "(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Double;)Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/BffFoodNutritionalTablesNutrient;", "toString", "hashCode", "other", "", "equals", "Ljava/lang/String;", "getLabel", "()Ljava/lang/String;", "getLabel$annotations", "()V", "Ljava/lang/Integer;", "getPercentOkDailyContrbution", "getPercentOkDailyContrbution$annotations", "getPrecision", "getPrecision$annotations", "getUnit", "getUnit$annotations", "Ljava/lang/Double;", "getValue", "getValue$annotations", "<init>", "(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Double;)V", "seen1", "Lkotlinx/serialization/internal/n1;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Double;Lkotlinx/serialization/internal/n1;)V", "Companion", "$serializer", "bff-data-shared_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
@C12439o
public final class BffFoodNutritionalTablesNutrient {
    @C12579k
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    @C12580l
    private final String label;
    @C12580l
    private final Integer percentOkDailyContrbution;
    @C12580l
    private final String precision;
    @C12580l
    private final String unit;
    @C12580l
    private final Double value;

    @C11076d0(mo22515d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¨\u0006\u0007"}, mo22516d2 = {"Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/BffFoodNutritionalTablesNutrient$Companion;", "", "Lkotlinx/serialization/g;", "Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/BffFoodNutritionalTablesNutrient;", "serializer", "<init>", "()V", "bff-data-shared_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @C12579k
        public final C12248g<BffFoodNutritionalTablesNutrient> serializer() {
            return BffFoodNutritionalTablesNutrient$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public BffFoodNutritionalTablesNutrient() {
        this((String) null, (Integer) null, (String) null, (String) null, (Double) null, 31, (DefaultConstructorMarker) null);
    }

    public static /* synthetic */ BffFoodNutritionalTablesNutrient copy$default(BffFoodNutritionalTablesNutrient bffFoodNutritionalTablesNutrient, String str, Integer num, String str2, String str3, Double d, int i, Object obj) {
        if ((i & 1) != 0) {
            str = bffFoodNutritionalTablesNutrient.label;
        }
        if ((i & 2) != 0) {
            num = bffFoodNutritionalTablesNutrient.percentOkDailyContrbution;
        }
        Integer num2 = num;
        if ((i & 4) != 0) {
            str2 = bffFoodNutritionalTablesNutrient.precision;
        }
        String str4 = str2;
        if ((i & 8) != 0) {
            str3 = bffFoodNutritionalTablesNutrient.unit;
        }
        String str5 = str3;
        if ((i & 16) != 0) {
            d = bffFoodNutritionalTablesNutrient.value;
        }
        return bffFoodNutritionalTablesNutrient.copy(str, num2, str4, str5, d);
    }

    @C12438n("label")
    public static /* synthetic */ void getLabel$annotations() {
    }

    @C12438n("percent_ok_daily_contrbution")
    public static /* synthetic */ void getPercentOkDailyContrbution$annotations() {
    }

    @C12438n("precision")
    public static /* synthetic */ void getPrecision$annotations() {
    }

    @C12438n("unit")
    public static /* synthetic */ void getUnit$annotations() {
    }

    @C12438n("value")
    public static /* synthetic */ void getValue$annotations() {
    }

    @C11384m
    public static final /* synthetic */ void write$Self(BffFoodNutritionalTablesNutrient bffFoodNutritionalTablesNutrient, C12239d dVar, C12217f fVar) {
        boolean z = false;
        if (dVar.mo24897A(fVar, 0) || bffFoodNutritionalTablesNutrient.label != null) {
            dVar.mo24912i(fVar, 0, C12310s1.f30117a, bffFoodNutritionalTablesNutrient.label);
        }
        if (dVar.mo24897A(fVar, 1) || bffFoodNutritionalTablesNutrient.percentOkDailyContrbution != null) {
            dVar.mo24912i(fVar, 1, C12276h0.f30067a, bffFoodNutritionalTablesNutrient.percentOkDailyContrbution);
        }
        if (dVar.mo24897A(fVar, 2) || bffFoodNutritionalTablesNutrient.precision != null) {
            dVar.mo24912i(fVar, 2, C12310s1.f30117a, bffFoodNutritionalTablesNutrient.precision);
        }
        if (dVar.mo24897A(fVar, 3) || bffFoodNutritionalTablesNutrient.unit != null) {
            dVar.mo24912i(fVar, 3, C12310s1.f30117a, bffFoodNutritionalTablesNutrient.unit);
        }
        if (dVar.mo24897A(fVar, 4) || bffFoodNutritionalTablesNutrient.value != null) {
            z = true;
        }
        if (z) {
            dVar.mo24912i(fVar, 4, C12311t.f30119a, bffFoodNutritionalTablesNutrient.value);
        }
    }

    @C12580l
    public final String component1() {
        return this.label;
    }

    @C12580l
    public final Integer component2() {
        return this.percentOkDailyContrbution;
    }

    @C12580l
    public final String component3() {
        return this.precision;
    }

    @C12580l
    public final String component4() {
        return this.unit;
    }

    @C12580l
    public final Double component5() {
        return this.value;
    }

    @C12579k
    public final BffFoodNutritionalTablesNutrient copy(@C12580l String str, @C12580l Integer num, @C12580l String str2, @C12580l String str3, @C12580l Double d) {
        return new BffFoodNutritionalTablesNutrient(str, num, str2, str3, d);
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BffFoodNutritionalTablesNutrient)) {
            return false;
        }
        BffFoodNutritionalTablesNutrient bffFoodNutritionalTablesNutrient = (BffFoodNutritionalTablesNutrient) obj;
        return Intrinsics.areEqual((Object) this.label, (Object) bffFoodNutritionalTablesNutrient.label) && Intrinsics.areEqual((Object) this.percentOkDailyContrbution, (Object) bffFoodNutritionalTablesNutrient.percentOkDailyContrbution) && Intrinsics.areEqual((Object) this.precision, (Object) bffFoodNutritionalTablesNutrient.precision) && Intrinsics.areEqual((Object) this.unit, (Object) bffFoodNutritionalTablesNutrient.unit) && Intrinsics.areEqual((Object) this.value, (Object) bffFoodNutritionalTablesNutrient.value);
    }

    @C12580l
    public final String getLabel() {
        return this.label;
    }

    @C12580l
    public final Integer getPercentOkDailyContrbution() {
        return this.percentOkDailyContrbution;
    }

    @C12580l
    public final String getPrecision() {
        return this.precision;
    }

    @C12580l
    public final String getUnit() {
        return this.unit;
    }

    @C12580l
    public final Double getValue() {
        return this.value;
    }

    public int hashCode() {
        String str = this.label;
        int i = 0;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        Integer num = this.percentOkDailyContrbution;
        int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        String str2 = this.precision;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.unit;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Double d = this.value;
        if (d != null) {
            i = d.hashCode();
        }
        return hashCode4 + i;
    }

    @C12579k
    public String toString() {
        String str = this.label;
        Integer num = this.percentOkDailyContrbution;
        String str2 = this.precision;
        String str3 = this.unit;
        Double d = this.value;
        return "BffFoodNutritionalTablesNutrient(label=" + str + ", percentOkDailyContrbution=" + num + ", precision=" + str2 + ", unit=" + str3 + ", value=" + d + ")";
    }

    @C11395k(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @C11587t0(expression = "", imports = {}))
    public /* synthetic */ BffFoodNutritionalTablesNutrient(int i, @C12438n("label") String str, @C12438n("percent_ok_daily_contrbution") Integer num, @C12438n("precision") String str2, @C12438n("unit") String str3, @C12438n("value") Double d, C12295n1 n1Var) {
        if ((i & 0) != 0) {
            C12261c1.m49256b(i, 0, BffFoodNutritionalTablesNutrient$$serializer.INSTANCE.getDescriptor());
        }
        if ((i & 1) == 0) {
            this.label = null;
        } else {
            this.label = str;
        }
        if ((i & 2) == 0) {
            this.percentOkDailyContrbution = null;
        } else {
            this.percentOkDailyContrbution = num;
        }
        if ((i & 4) == 0) {
            this.precision = null;
        } else {
            this.precision = str2;
        }
        if ((i & 8) == 0) {
            this.unit = null;
        } else {
            this.unit = str3;
        }
        if ((i & 16) == 0) {
            this.value = null;
        } else {
            this.value = d;
        }
    }

    public BffFoodNutritionalTablesNutrient(@C12580l String str, @C12580l Integer num, @C12580l String str2, @C12580l String str3, @C12580l Double d) {
        this.label = str;
        this.percentOkDailyContrbution = num;
        this.precision = str2;
        this.unit = str3;
        this.value = d;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ BffFoodNutritionalTablesNutrient(java.lang.String r5, java.lang.Integer r6, java.lang.String r7, java.lang.String r8, java.lang.Double r9, int r10, kotlin.jvm.internal.DefaultConstructorMarker r11) {
        /*
            r4 = this;
            r11 = r10 & 1
            r0 = 0
            if (r11 == 0) goto L_0x0007
            r11 = r0
            goto L_0x0008
        L_0x0007:
            r11 = r5
        L_0x0008:
            r5 = r10 & 2
            if (r5 == 0) goto L_0x000e
            r1 = r0
            goto L_0x000f
        L_0x000e:
            r1 = r6
        L_0x000f:
            r5 = r10 & 4
            if (r5 == 0) goto L_0x0015
            r2 = r0
            goto L_0x0016
        L_0x0015:
            r2 = r7
        L_0x0016:
            r5 = r10 & 8
            if (r5 == 0) goto L_0x001c
            r3 = r0
            goto L_0x001d
        L_0x001c:
            r3 = r8
        L_0x001d:
            r5 = r10 & 16
            if (r5 == 0) goto L_0x0023
            r10 = r0
            goto L_0x0024
        L_0x0023:
            r10 = r9
        L_0x0024:
            r5 = r4
            r6 = r11
            r7 = r1
            r8 = r2
            r9 = r3
            r5.<init>(r6, r7, r8, r9, r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.bff_data_shared.data.api.entities.BffFoodNutritionalTablesNutrient.<init>(java.lang.String, java.lang.Integer, java.lang.String, java.lang.String, java.lang.Double, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
