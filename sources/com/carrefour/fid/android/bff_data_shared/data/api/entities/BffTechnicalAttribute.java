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

@C11076d0(mo22515d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0002\b\u0005\b\b\u0018\u0000 92\u00020\u0001:\u0002:9B[\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b3\u00104Bo\b\u0017\u0012\u0006\u00105\u001a\u00020\f\u0012\n\b\u0001\u0010\u0013\u001a\u0004\u0018\u00010\t\u0012\n\b\u0001\u0010\u0014\u001a\u0004\u0018\u00010\t\u0012\n\b\u0001\u0010\u0015\u001a\u0004\u0018\u00010\f\u0012\n\b\u0001\u0010\u0016\u001a\u0004\u0018\u00010\t\u0012\n\b\u0001\u0010\u0017\u001a\u0004\u0018\u00010\t\u0012\n\b\u0001\u0010\u0018\u001a\u0004\u0018\u00010\t\u0012\n\b\u0001\u0010\u0019\u001a\u0004\u0018\u00010\t\u0012\b\u00107\u001a\u0004\u0018\u000106¢\u0006\u0004\b3\u00108J!\u0010\b\u001a\u00020\u00072\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005HÇ\u0001J\u000b\u0010\n\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\tHÆ\u0003J\u0012\u0010\r\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u000b\u0010\u000f\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\tHÆ\u0003Jd\u0010\u001a\u001a\u00020\u00002\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\tHÆ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\t\u0010\u001c\u001a\u00020\tHÖ\u0001J\t\u0010\u001d\u001a\u00020\fHÖ\u0001J\u0013\u0010 \u001a\u00020\u001f2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\"\u0010\u0013\u001a\u0004\u0018\u00010\t8\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0013\u0010!\u0012\u0004\b$\u0010%\u001a\u0004\b\"\u0010#R\"\u0010\u0014\u001a\u0004\u0018\u00010\t8\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0014\u0010!\u0012\u0004\b'\u0010%\u001a\u0004\b&\u0010#R\"\u0010\u0015\u001a\u0004\u0018\u00010\f8\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0015\u0010(\u0012\u0004\b*\u0010%\u001a\u0004\b)\u0010\u000eR\"\u0010\u0016\u001a\u0004\u0018\u00010\t8\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0016\u0010!\u0012\u0004\b,\u0010%\u001a\u0004\b+\u0010#R\"\u0010\u0017\u001a\u0004\u0018\u00010\t8\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0017\u0010!\u0012\u0004\b.\u0010%\u001a\u0004\b-\u0010#R\"\u0010\u0018\u001a\u0004\u0018\u00010\t8\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0018\u0010!\u0012\u0004\b0\u0010%\u001a\u0004\b/\u0010#R\"\u0010\u0019\u001a\u0004\u0018\u00010\t8\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0019\u0010!\u0012\u0004\b2\u0010%\u001a\u0004\b1\u0010#¨\u0006;"}, mo22516d2 = {"Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/BffTechnicalAttribute;", "", "self", "Lkotlinx/serialization/encoding/d;", "output", "Lkotlinx/serialization/descriptors/f;", "serialDesc", "Lkotlin/d2;", "write$Self", "", "component1", "component2", "", "component3", "()Ljava/lang/Integer;", "component4", "component5", "component6", "component7", "colorGroup", "color", "babyAgeM", "itSmartphoneModel", "universalSize", "compatibleStrollerAge", "energyLabel", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/BffTechnicalAttribute;", "toString", "hashCode", "other", "", "equals", "Ljava/lang/String;", "getColorGroup", "()Ljava/lang/String;", "getColorGroup$annotations", "()V", "getColor", "getColor$annotations", "Ljava/lang/Integer;", "getBabyAgeM", "getBabyAgeM$annotations", "getItSmartphoneModel", "getItSmartphoneModel$annotations", "getUniversalSize", "getUniversalSize$annotations", "getCompatibleStrollerAge", "getCompatibleStrollerAge$annotations", "getEnergyLabel", "getEnergyLabel$annotations", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "seen1", "Lkotlinx/serialization/internal/n1;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/n1;)V", "Companion", "$serializer", "bff-data-shared_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
@C12439o
public final class BffTechnicalAttribute {
    @C12579k
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    @C12580l
    private final Integer babyAgeM;
    @C12580l
    private final String color;
    @C12580l
    private final String colorGroup;
    @C12580l
    private final String compatibleStrollerAge;
    @C12580l
    private final String energyLabel;
    @C12580l
    private final String itSmartphoneModel;
    @C12580l
    private final String universalSize;

    @C11076d0(mo22515d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¨\u0006\u0007"}, mo22516d2 = {"Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/BffTechnicalAttribute$Companion;", "", "Lkotlinx/serialization/g;", "Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/BffTechnicalAttribute;", "serializer", "<init>", "()V", "bff-data-shared_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @C12579k
        public final C12248g<BffTechnicalAttribute> serializer() {
            return BffTechnicalAttribute$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public BffTechnicalAttribute() {
        this((String) null, (String) null, (Integer) null, (String) null, (String) null, (String) null, (String) null, 127, (DefaultConstructorMarker) null);
    }

    public static /* synthetic */ BffTechnicalAttribute copy$default(BffTechnicalAttribute bffTechnicalAttribute, String str, String str2, Integer num, String str3, String str4, String str5, String str6, int i, Object obj) {
        if ((i & 1) != 0) {
            str = bffTechnicalAttribute.colorGroup;
        }
        if ((i & 2) != 0) {
            str2 = bffTechnicalAttribute.color;
        }
        String str7 = str2;
        if ((i & 4) != 0) {
            num = bffTechnicalAttribute.babyAgeM;
        }
        Integer num2 = num;
        if ((i & 8) != 0) {
            str3 = bffTechnicalAttribute.itSmartphoneModel;
        }
        String str8 = str3;
        if ((i & 16) != 0) {
            str4 = bffTechnicalAttribute.universalSize;
        }
        String str9 = str4;
        if ((i & 32) != 0) {
            str5 = bffTechnicalAttribute.compatibleStrollerAge;
        }
        String str10 = str5;
        if ((i & 64) != 0) {
            str6 = bffTechnicalAttribute.energyLabel;
        }
        return bffTechnicalAttribute.copy(str, str7, num2, str8, str9, str10, str6);
    }

    @C12438n("baby_age_m")
    public static /* synthetic */ void getBabyAgeM$annotations() {
    }

    @C12438n("color")
    public static /* synthetic */ void getColor$annotations() {
    }

    @C12438n("color_group")
    public static /* synthetic */ void getColorGroup$annotations() {
    }

    @C12438n("compatible_stroller_age")
    public static /* synthetic */ void getCompatibleStrollerAge$annotations() {
    }

    @C12438n("energy_label")
    public static /* synthetic */ void getEnergyLabel$annotations() {
    }

    @C12438n("it_smartphone_model")
    public static /* synthetic */ void getItSmartphoneModel$annotations() {
    }

    @C12438n("universal_size")
    public static /* synthetic */ void getUniversalSize$annotations() {
    }

    @C11384m
    public static final /* synthetic */ void write$Self(BffTechnicalAttribute bffTechnicalAttribute, C12239d dVar, C12217f fVar) {
        boolean z = false;
        if (dVar.mo24897A(fVar, 0) || bffTechnicalAttribute.colorGroup != null) {
            dVar.mo24912i(fVar, 0, C12310s1.f30117a, bffTechnicalAttribute.colorGroup);
        }
        if (dVar.mo24897A(fVar, 1) || bffTechnicalAttribute.color != null) {
            dVar.mo24912i(fVar, 1, C12310s1.f30117a, bffTechnicalAttribute.color);
        }
        if (dVar.mo24897A(fVar, 2) || bffTechnicalAttribute.babyAgeM != null) {
            dVar.mo24912i(fVar, 2, C12276h0.f30067a, bffTechnicalAttribute.babyAgeM);
        }
        if (dVar.mo24897A(fVar, 3) || bffTechnicalAttribute.itSmartphoneModel != null) {
            dVar.mo24912i(fVar, 3, C12310s1.f30117a, bffTechnicalAttribute.itSmartphoneModel);
        }
        if (dVar.mo24897A(fVar, 4) || bffTechnicalAttribute.universalSize != null) {
            dVar.mo24912i(fVar, 4, C12310s1.f30117a, bffTechnicalAttribute.universalSize);
        }
        if (dVar.mo24897A(fVar, 5) || bffTechnicalAttribute.compatibleStrollerAge != null) {
            dVar.mo24912i(fVar, 5, C12310s1.f30117a, bffTechnicalAttribute.compatibleStrollerAge);
        }
        if (dVar.mo24897A(fVar, 6) || bffTechnicalAttribute.energyLabel != null) {
            z = true;
        }
        if (z) {
            dVar.mo24912i(fVar, 6, C12310s1.f30117a, bffTechnicalAttribute.energyLabel);
        }
    }

    @C12580l
    public final String component1() {
        return this.colorGroup;
    }

    @C12580l
    public final String component2() {
        return this.color;
    }

    @C12580l
    public final Integer component3() {
        return this.babyAgeM;
    }

    @C12580l
    public final String component4() {
        return this.itSmartphoneModel;
    }

    @C12580l
    public final String component5() {
        return this.universalSize;
    }

    @C12580l
    public final String component6() {
        return this.compatibleStrollerAge;
    }

    @C12580l
    public final String component7() {
        return this.energyLabel;
    }

    @C12579k
    public final BffTechnicalAttribute copy(@C12580l String str, @C12580l String str2, @C12580l Integer num, @C12580l String str3, @C12580l String str4, @C12580l String str5, @C12580l String str6) {
        return new BffTechnicalAttribute(str, str2, num, str3, str4, str5, str6);
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BffTechnicalAttribute)) {
            return false;
        }
        BffTechnicalAttribute bffTechnicalAttribute = (BffTechnicalAttribute) obj;
        return Intrinsics.areEqual((Object) this.colorGroup, (Object) bffTechnicalAttribute.colorGroup) && Intrinsics.areEqual((Object) this.color, (Object) bffTechnicalAttribute.color) && Intrinsics.areEqual((Object) this.babyAgeM, (Object) bffTechnicalAttribute.babyAgeM) && Intrinsics.areEqual((Object) this.itSmartphoneModel, (Object) bffTechnicalAttribute.itSmartphoneModel) && Intrinsics.areEqual((Object) this.universalSize, (Object) bffTechnicalAttribute.universalSize) && Intrinsics.areEqual((Object) this.compatibleStrollerAge, (Object) bffTechnicalAttribute.compatibleStrollerAge) && Intrinsics.areEqual((Object) this.energyLabel, (Object) bffTechnicalAttribute.energyLabel);
    }

    @C12580l
    public final Integer getBabyAgeM() {
        return this.babyAgeM;
    }

    @C12580l
    public final String getColor() {
        return this.color;
    }

    @C12580l
    public final String getColorGroup() {
        return this.colorGroup;
    }

    @C12580l
    public final String getCompatibleStrollerAge() {
        return this.compatibleStrollerAge;
    }

    @C12580l
    public final String getEnergyLabel() {
        return this.energyLabel;
    }

    @C12580l
    public final String getItSmartphoneModel() {
        return this.itSmartphoneModel;
    }

    @C12580l
    public final String getUniversalSize() {
        return this.universalSize;
    }

    public int hashCode() {
        String str = this.colorGroup;
        int i = 0;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.color;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num = this.babyAgeM;
        int hashCode3 = (hashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        String str3 = this.itSmartphoneModel;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.universalSize;
        int hashCode5 = (hashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.compatibleStrollerAge;
        int hashCode6 = (hashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.energyLabel;
        if (str6 != null) {
            i = str6.hashCode();
        }
        return hashCode6 + i;
    }

    @C12579k
    public String toString() {
        String str = this.colorGroup;
        String str2 = this.color;
        Integer num = this.babyAgeM;
        String str3 = this.itSmartphoneModel;
        String str4 = this.universalSize;
        String str5 = this.compatibleStrollerAge;
        String str6 = this.energyLabel;
        return "BffTechnicalAttribute(colorGroup=" + str + ", color=" + str2 + ", babyAgeM=" + num + ", itSmartphoneModel=" + str3 + ", universalSize=" + str4 + ", compatibleStrollerAge=" + str5 + ", energyLabel=" + str6 + ")";
    }

    @C11395k(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @C11587t0(expression = "", imports = {}))
    public /* synthetic */ BffTechnicalAttribute(int i, @C12438n("color_group") String str, @C12438n("color") String str2, @C12438n("baby_age_m") Integer num, @C12438n("it_smartphone_model") String str3, @C12438n("universal_size") String str4, @C12438n("compatible_stroller_age") String str5, @C12438n("energy_label") String str6, C12295n1 n1Var) {
        if ((i & 0) != 0) {
            C12261c1.m49256b(i, 0, BffTechnicalAttribute$$serializer.INSTANCE.getDescriptor());
        }
        if ((i & 1) == 0) {
            this.colorGroup = null;
        } else {
            this.colorGroup = str;
        }
        if ((i & 2) == 0) {
            this.color = null;
        } else {
            this.color = str2;
        }
        if ((i & 4) == 0) {
            this.babyAgeM = null;
        } else {
            this.babyAgeM = num;
        }
        if ((i & 8) == 0) {
            this.itSmartphoneModel = null;
        } else {
            this.itSmartphoneModel = str3;
        }
        if ((i & 16) == 0) {
            this.universalSize = null;
        } else {
            this.universalSize = str4;
        }
        if ((i & 32) == 0) {
            this.compatibleStrollerAge = null;
        } else {
            this.compatibleStrollerAge = str5;
        }
        if ((i & 64) == 0) {
            this.energyLabel = null;
        } else {
            this.energyLabel = str6;
        }
    }

    public BffTechnicalAttribute(@C12580l String str, @C12580l String str2, @C12580l Integer num, @C12580l String str3, @C12580l String str4, @C12580l String str5, @C12580l String str6) {
        this.colorGroup = str;
        this.color = str2;
        this.babyAgeM = num;
        this.itSmartphoneModel = str3;
        this.universalSize = str4;
        this.compatibleStrollerAge = str5;
        this.energyLabel = str6;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ BffTechnicalAttribute(java.lang.String r7, java.lang.String r8, java.lang.Integer r9, java.lang.String r10, java.lang.String r11, java.lang.String r12, java.lang.String r13, int r14, kotlin.jvm.internal.DefaultConstructorMarker r15) {
        /*
            r6 = this;
            r15 = r14 & 1
            r0 = 0
            if (r15 == 0) goto L_0x0007
            r15 = r0
            goto L_0x0008
        L_0x0007:
            r15 = r7
        L_0x0008:
            r7 = r14 & 2
            if (r7 == 0) goto L_0x000e
            r1 = r0
            goto L_0x000f
        L_0x000e:
            r1 = r8
        L_0x000f:
            r7 = r14 & 4
            if (r7 == 0) goto L_0x0015
            r2 = r0
            goto L_0x0016
        L_0x0015:
            r2 = r9
        L_0x0016:
            r7 = r14 & 8
            if (r7 == 0) goto L_0x001c
            r3 = r0
            goto L_0x001d
        L_0x001c:
            r3 = r10
        L_0x001d:
            r7 = r14 & 16
            if (r7 == 0) goto L_0x0023
            r4 = r0
            goto L_0x0024
        L_0x0023:
            r4 = r11
        L_0x0024:
            r7 = r14 & 32
            if (r7 == 0) goto L_0x002a
            r5 = r0
            goto L_0x002b
        L_0x002a:
            r5 = r12
        L_0x002b:
            r7 = r14 & 64
            if (r7 == 0) goto L_0x0031
            r14 = r0
            goto L_0x0032
        L_0x0031:
            r14 = r13
        L_0x0032:
            r7 = r6
            r8 = r15
            r9 = r1
            r10 = r2
            r11 = r3
            r12 = r4
            r13 = r5
            r7.<init>(r8, r9, r10, r11, r12, r13, r14)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.bff_data_shared.data.api.entities.BffTechnicalAttribute.<init>(java.lang.String, java.lang.String, java.lang.Integer, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
