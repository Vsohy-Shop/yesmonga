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
import kotlinx.serialization.internal.C12310s1;
import kotlinx.serialization.internal.C12311t;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\u0005\b\b\u0018\u0000 62\u00020\u0001:\u000276BI\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\f\u0012\u0010\b\u0002\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000f\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b0\u00101B]\b\u0017\u0012\u0006\u00102\u001a\u00020\u001b\u0012\n\b\u0001\u0010\u0013\u001a\u0004\u0018\u00010\t\u0012\n\b\u0001\u0010\u0014\u001a\u0004\u0018\u00010\t\u0012\n\b\u0001\u0010\u0015\u001a\u0004\u0018\u00010\f\u0012\u0010\b\u0001\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000f\u0012\n\b\u0001\u0010\u0017\u001a\u0004\u0018\u00010\t\u0012\b\u00104\u001a\u0004\u0018\u000103¢\u0006\u0004\b0\u00105J!\u0010\b\u001a\u00020\u00072\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005HÇ\u0001J\u000b\u0010\n\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\tHÆ\u0003J\u0012\u0010\r\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0011\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000fHÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\tHÆ\u0003JR\u0010\u0018\u001a\u00020\u00002\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\f2\u0010\b\u0002\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000f2\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\tHÆ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\t\u0010\u001a\u001a\u00020\tHÖ\u0001J\t\u0010\u001c\u001a\u00020\u001bHÖ\u0001J\u0013\u0010\u001f\u001a\u00020\u001e2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\"\u0010\u0013\u001a\u0004\u0018\u00010\t8\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0013\u0010 \u0012\u0004\b#\u0010$\u001a\u0004\b!\u0010\"R\"\u0010\u0014\u001a\u0004\u0018\u00010\t8\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0014\u0010 \u0012\u0004\b&\u0010$\u001a\u0004\b%\u0010\"R\"\u0010\u0015\u001a\u0004\u0018\u00010\f8\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0015\u0010'\u0012\u0004\b)\u0010$\u001a\u0004\b(\u0010\u000eR(\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000f8\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0016\u0010*\u0012\u0004\b-\u0010$\u001a\u0004\b+\u0010,R\"\u0010\u0017\u001a\u0004\u0018\u00010\t8\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0017\u0010 \u0012\u0004\b/\u0010$\u001a\u0004\b.\u0010\"¨\u00068"}, mo22516d2 = {"Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/BffFoodNutritionalTablesIncoNutrients;", "", "self", "Lkotlinx/serialization/encoding/d;", "output", "Lkotlinx/serialization/descriptors/f;", "serialDesc", "Lkotlin/d2;", "write$Self", "", "component1", "component2", "", "component3", "()Ljava/lang/Double;", "", "Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/BffFoodNutritionalTablesNutrient;", "component4", "component5", "columnId", "columnPortionUnit", "columnPortionValue", "nutrient", "preparationStatus", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Double;Ljava/util/List;Ljava/lang/String;)Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/BffFoodNutritionalTablesIncoNutrients;", "toString", "", "hashCode", "other", "", "equals", "Ljava/lang/String;", "getColumnId", "()Ljava/lang/String;", "getColumnId$annotations", "()V", "getColumnPortionUnit", "getColumnPortionUnit$annotations", "Ljava/lang/Double;", "getColumnPortionValue", "getColumnPortionValue$annotations", "Ljava/util/List;", "getNutrient", "()Ljava/util/List;", "getNutrient$annotations", "getPreparationStatus", "getPreparationStatus$annotations", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Double;Ljava/util/List;Ljava/lang/String;)V", "seen1", "Lkotlinx/serialization/internal/n1;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/Double;Ljava/util/List;Ljava/lang/String;Lkotlinx/serialization/internal/n1;)V", "Companion", "$serializer", "bff-data-shared_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
@C12439o
public final class BffFoodNutritionalTablesIncoNutrients {
    /* access modifiers changed from: private */
    @C12579k
    @C11287e
    public static final C12248g<Object>[] $childSerializers = {null, null, null, new C12269f(BffFoodNutritionalTablesNutrient$$serializer.INSTANCE), null};
    @C12579k
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    @C12580l
    private final String columnId;
    @C12580l
    private final String columnPortionUnit;
    @C12580l
    private final Double columnPortionValue;
    @C12580l
    private final List<BffFoodNutritionalTablesNutrient> nutrient;
    @C12580l
    private final String preparationStatus;

    @C11076d0(mo22515d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¨\u0006\u0007"}, mo22516d2 = {"Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/BffFoodNutritionalTablesIncoNutrients$Companion;", "", "Lkotlinx/serialization/g;", "Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/BffFoodNutritionalTablesIncoNutrients;", "serializer", "<init>", "()V", "bff-data-shared_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @C12579k
        public final C12248g<BffFoodNutritionalTablesIncoNutrients> serializer() {
            return BffFoodNutritionalTablesIncoNutrients$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public BffFoodNutritionalTablesIncoNutrients() {
        this((String) null, (String) null, (Double) null, (List) null, (String) null, 31, (DefaultConstructorMarker) null);
    }

    public static /* synthetic */ BffFoodNutritionalTablesIncoNutrients copy$default(BffFoodNutritionalTablesIncoNutrients bffFoodNutritionalTablesIncoNutrients, String str, String str2, Double d, List<BffFoodNutritionalTablesNutrient> list, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = bffFoodNutritionalTablesIncoNutrients.columnId;
        }
        if ((i & 2) != 0) {
            str2 = bffFoodNutritionalTablesIncoNutrients.columnPortionUnit;
        }
        String str4 = str2;
        if ((i & 4) != 0) {
            d = bffFoodNutritionalTablesIncoNutrients.columnPortionValue;
        }
        Double d2 = d;
        if ((i & 8) != 0) {
            list = bffFoodNutritionalTablesIncoNutrients.nutrient;
        }
        List<BffFoodNutritionalTablesNutrient> list2 = list;
        if ((i & 16) != 0) {
            str3 = bffFoodNutritionalTablesIncoNutrients.preparationStatus;
        }
        return bffFoodNutritionalTablesIncoNutrients.copy(str, str4, d2, list2, str3);
    }

    @C12438n("column_id")
    public static /* synthetic */ void getColumnId$annotations() {
    }

    @C12438n("column_portion_unit")
    public static /* synthetic */ void getColumnPortionUnit$annotations() {
    }

    @C12438n("column_portion_value")
    public static /* synthetic */ void getColumnPortionValue$annotations() {
    }

    @C12438n("nutrient")
    public static /* synthetic */ void getNutrient$annotations() {
    }

    @C12438n("preparation_status")
    public static /* synthetic */ void getPreparationStatus$annotations() {
    }

    @C11384m
    public static final /* synthetic */ void write$Self(BffFoodNutritionalTablesIncoNutrients bffFoodNutritionalTablesIncoNutrients, C12239d dVar, C12217f fVar) {
        C12248g<Object>[] gVarArr = $childSerializers;
        boolean z = false;
        if (dVar.mo24897A(fVar, 0) || bffFoodNutritionalTablesIncoNutrients.columnId != null) {
            dVar.mo24912i(fVar, 0, C12310s1.f30117a, bffFoodNutritionalTablesIncoNutrients.columnId);
        }
        if (dVar.mo24897A(fVar, 1) || bffFoodNutritionalTablesIncoNutrients.columnPortionUnit != null) {
            dVar.mo24912i(fVar, 1, C12310s1.f30117a, bffFoodNutritionalTablesIncoNutrients.columnPortionUnit);
        }
        if (dVar.mo24897A(fVar, 2) || bffFoodNutritionalTablesIncoNutrients.columnPortionValue != null) {
            dVar.mo24912i(fVar, 2, C12311t.f30119a, bffFoodNutritionalTablesIncoNutrients.columnPortionValue);
        }
        if (dVar.mo24897A(fVar, 3) || bffFoodNutritionalTablesIncoNutrients.nutrient != null) {
            dVar.mo24912i(fVar, 3, gVarArr[3], bffFoodNutritionalTablesIncoNutrients.nutrient);
        }
        if (dVar.mo24897A(fVar, 4) || bffFoodNutritionalTablesIncoNutrients.preparationStatus != null) {
            z = true;
        }
        if (z) {
            dVar.mo24912i(fVar, 4, C12310s1.f30117a, bffFoodNutritionalTablesIncoNutrients.preparationStatus);
        }
    }

    @C12580l
    public final String component1() {
        return this.columnId;
    }

    @C12580l
    public final String component2() {
        return this.columnPortionUnit;
    }

    @C12580l
    public final Double component3() {
        return this.columnPortionValue;
    }

    @C12580l
    public final List<BffFoodNutritionalTablesNutrient> component4() {
        return this.nutrient;
    }

    @C12580l
    public final String component5() {
        return this.preparationStatus;
    }

    @C12579k
    public final BffFoodNutritionalTablesIncoNutrients copy(@C12580l String str, @C12580l String str2, @C12580l Double d, @C12580l List<BffFoodNutritionalTablesNutrient> list, @C12580l String str3) {
        return new BffFoodNutritionalTablesIncoNutrients(str, str2, d, list, str3);
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BffFoodNutritionalTablesIncoNutrients)) {
            return false;
        }
        BffFoodNutritionalTablesIncoNutrients bffFoodNutritionalTablesIncoNutrients = (BffFoodNutritionalTablesIncoNutrients) obj;
        return Intrinsics.areEqual((Object) this.columnId, (Object) bffFoodNutritionalTablesIncoNutrients.columnId) && Intrinsics.areEqual((Object) this.columnPortionUnit, (Object) bffFoodNutritionalTablesIncoNutrients.columnPortionUnit) && Intrinsics.areEqual((Object) this.columnPortionValue, (Object) bffFoodNutritionalTablesIncoNutrients.columnPortionValue) && Intrinsics.areEqual((Object) this.nutrient, (Object) bffFoodNutritionalTablesIncoNutrients.nutrient) && Intrinsics.areEqual((Object) this.preparationStatus, (Object) bffFoodNutritionalTablesIncoNutrients.preparationStatus);
    }

    @C12580l
    public final String getColumnId() {
        return this.columnId;
    }

    @C12580l
    public final String getColumnPortionUnit() {
        return this.columnPortionUnit;
    }

    @C12580l
    public final Double getColumnPortionValue() {
        return this.columnPortionValue;
    }

    @C12580l
    public final List<BffFoodNutritionalTablesNutrient> getNutrient() {
        return this.nutrient;
    }

    @C12580l
    public final String getPreparationStatus() {
        return this.preparationStatus;
    }

    public int hashCode() {
        String str = this.columnId;
        int i = 0;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.columnPortionUnit;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Double d = this.columnPortionValue;
        int hashCode3 = (hashCode2 + (d == null ? 0 : d.hashCode())) * 31;
        List<BffFoodNutritionalTablesNutrient> list = this.nutrient;
        int hashCode4 = (hashCode3 + (list == null ? 0 : list.hashCode())) * 31;
        String str3 = this.preparationStatus;
        if (str3 != null) {
            i = str3.hashCode();
        }
        return hashCode4 + i;
    }

    @C12579k
    public String toString() {
        String str = this.columnId;
        String str2 = this.columnPortionUnit;
        Double d = this.columnPortionValue;
        List<BffFoodNutritionalTablesNutrient> list = this.nutrient;
        String str3 = this.preparationStatus;
        return "BffFoodNutritionalTablesIncoNutrients(columnId=" + str + ", columnPortionUnit=" + str2 + ", columnPortionValue=" + d + ", nutrient=" + list + ", preparationStatus=" + str3 + ")";
    }

    @C11395k(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @C11587t0(expression = "", imports = {}))
    public /* synthetic */ BffFoodNutritionalTablesIncoNutrients(int i, @C12438n("column_id") String str, @C12438n("column_portion_unit") String str2, @C12438n("column_portion_value") Double d, @C12438n("nutrient") List list, @C12438n("preparation_status") String str3, C12295n1 n1Var) {
        if ((i & 0) != 0) {
            C12261c1.m49256b(i, 0, BffFoodNutritionalTablesIncoNutrients$$serializer.INSTANCE.getDescriptor());
        }
        if ((i & 1) == 0) {
            this.columnId = null;
        } else {
            this.columnId = str;
        }
        if ((i & 2) == 0) {
            this.columnPortionUnit = null;
        } else {
            this.columnPortionUnit = str2;
        }
        if ((i & 4) == 0) {
            this.columnPortionValue = null;
        } else {
            this.columnPortionValue = d;
        }
        if ((i & 8) == 0) {
            this.nutrient = null;
        } else {
            this.nutrient = list;
        }
        if ((i & 16) == 0) {
            this.preparationStatus = null;
        } else {
            this.preparationStatus = str3;
        }
    }

    public BffFoodNutritionalTablesIncoNutrients(@C12580l String str, @C12580l String str2, @C12580l Double d, @C12580l List<BffFoodNutritionalTablesNutrient> list, @C12580l String str3) {
        this.columnId = str;
        this.columnPortionUnit = str2;
        this.columnPortionValue = d;
        this.nutrient = list;
        this.preparationStatus = str3;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ BffFoodNutritionalTablesIncoNutrients(java.lang.String r5, java.lang.String r6, java.lang.Double r7, java.util.List r8, java.lang.String r9, int r10, kotlin.jvm.internal.DefaultConstructorMarker r11) {
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
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.bff_data_shared.data.api.entities.BffFoodNutritionalTablesIncoNutrients.<init>(java.lang.String, java.lang.String, java.lang.Double, java.util.List, java.lang.String, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
