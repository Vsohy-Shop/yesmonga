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

@C11076d0(mo22515d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0002\b\u0005\b\b\u0018\u0000 92\u00020\u0001:\u0002:9B[\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b3\u00104Bo\b\u0017\u0012\u0006\u00105\u001a\u00020\u000b\u0012\n\b\u0001\u0010\u0013\u001a\u0004\u0018\u00010\t\u0012\n\b\u0001\u0010\u0014\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0001\u0010\u0015\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0001\u0010\u0016\u001a\u0004\u0018\u00010\t\u0012\n\b\u0001\u0010\u0017\u001a\u0004\u0018\u00010\t\u0012\n\b\u0001\u0010\u0018\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0001\u0010\u0019\u001a\u0004\u0018\u00010\u000b\u0012\b\u00107\u001a\u0004\u0018\u000106¢\u0006\u0004\b3\u00108J!\u0010\b\u001a\u00020\u00072\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005HÇ\u0001J\u000b\u0010\n\u001a\u0004\u0018\u00010\tHÆ\u0003J\u0012\u0010\f\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0004\b\u000e\u0010\rJ\u000b\u0010\u000f\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\tHÆ\u0003J\u0012\u0010\u0011\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0004\b\u0011\u0010\rJ\u0012\u0010\u0012\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0004\b\u0012\u0010\rJd\u0010\u001a\u001a\u00020\u00002\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u000bHÆ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\t\u0010\u001c\u001a\u00020\tHÖ\u0001J\t\u0010\u001d\u001a\u00020\u000bHÖ\u0001J\u0013\u0010 \u001a\u00020\u001f2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\"\u0010\u0013\u001a\u0004\u0018\u00010\t8\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0013\u0010!\u0012\u0004\b$\u0010%\u001a\u0004\b\"\u0010#R\"\u0010\u0014\u001a\u0004\u0018\u00010\u000b8\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0014\u0010&\u0012\u0004\b(\u0010%\u001a\u0004\b'\u0010\rR\"\u0010\u0015\u001a\u0004\u0018\u00010\u000b8\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0015\u0010&\u0012\u0004\b*\u0010%\u001a\u0004\b)\u0010\rR\"\u0010\u0016\u001a\u0004\u0018\u00010\t8\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0016\u0010!\u0012\u0004\b,\u0010%\u001a\u0004\b+\u0010#R\"\u0010\u0017\u001a\u0004\u0018\u00010\t8\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0017\u0010!\u0012\u0004\b.\u0010%\u001a\u0004\b-\u0010#R\"\u0010\u0018\u001a\u0004\u0018\u00010\u000b8\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0018\u0010&\u0012\u0004\b0\u0010%\u001a\u0004\b/\u0010\rR\"\u0010\u0019\u001a\u0004\u0018\u00010\u000b8\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0019\u0010&\u0012\u0004\b2\u0010%\u001a\u0004\b1\u0010\r¨\u0006;"}, mo22516d2 = {"Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/BffDeals;", "", "self", "Lkotlinx/serialization/encoding/d;", "output", "Lkotlinx/serialization/descriptors/f;", "serialDesc", "Lkotlin/d2;", "write$Self", "", "component1", "", "component2", "()Ljava/lang/Integer;", "component3", "component4", "component5", "component6", "component7", "mandateId", "bundle", "discountAmount", "discountUnit", "financingTypeCode", "bffBundleSalePrice", "bffBundleBasePrice", "copy", "(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;)Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/BffDeals;", "toString", "hashCode", "other", "", "equals", "Ljava/lang/String;", "getMandateId", "()Ljava/lang/String;", "getMandateId$annotations", "()V", "Ljava/lang/Integer;", "getBundle", "getBundle$annotations", "getDiscountAmount", "getDiscountAmount$annotations", "getDiscountUnit", "getDiscountUnit$annotations", "getFinancingTypeCode", "getFinancingTypeCode$annotations", "getBffBundleSalePrice", "getBffBundleSalePrice$annotations", "getBffBundleBasePrice", "getBffBundleBasePrice$annotations", "<init>", "(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;)V", "seen1", "Lkotlinx/serialization/internal/n1;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Lkotlinx/serialization/internal/n1;)V", "Companion", "$serializer", "bff-data-shared_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
@C12439o
public final class BffDeals {
    @C12579k
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    @C12580l
    private final Integer bffBundleBasePrice;
    @C12580l
    private final Integer bffBundleSalePrice;
    @C12580l
    private final Integer bundle;
    @C12580l
    private final Integer discountAmount;
    @C12580l
    private final String discountUnit;
    @C12580l
    private final String financingTypeCode;
    @C12580l
    private final String mandateId;

    @C11076d0(mo22515d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¨\u0006\u0007"}, mo22516d2 = {"Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/BffDeals$Companion;", "", "Lkotlinx/serialization/g;", "Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/BffDeals;", "serializer", "<init>", "()V", "bff-data-shared_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @C12579k
        public final C12248g<BffDeals> serializer() {
            return BffDeals$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public BffDeals() {
        this((String) null, (Integer) null, (Integer) null, (String) null, (String) null, (Integer) null, (Integer) null, 127, (DefaultConstructorMarker) null);
    }

    public static /* synthetic */ BffDeals copy$default(BffDeals bffDeals, String str, Integer num, Integer num2, String str2, String str3, Integer num3, Integer num4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = bffDeals.mandateId;
        }
        if ((i & 2) != 0) {
            num = bffDeals.bundle;
        }
        Integer num5 = num;
        if ((i & 4) != 0) {
            num2 = bffDeals.discountAmount;
        }
        Integer num6 = num2;
        if ((i & 8) != 0) {
            str2 = bffDeals.discountUnit;
        }
        String str4 = str2;
        if ((i & 16) != 0) {
            str3 = bffDeals.financingTypeCode;
        }
        String str5 = str3;
        if ((i & 32) != 0) {
            num3 = bffDeals.bffBundleSalePrice;
        }
        Integer num7 = num3;
        if ((i & 64) != 0) {
            num4 = bffDeals.bffBundleBasePrice;
        }
        return bffDeals.copy(str, num5, num6, str4, str5, num7, num4);
    }

    @C12438n("bff_bundle-base-price")
    public static /* synthetic */ void getBffBundleBasePrice$annotations() {
    }

    @C12438n("bff_bundle-sale-price")
    public static /* synthetic */ void getBffBundleSalePrice$annotations() {
    }

    @C12438n("bundle")
    public static /* synthetic */ void getBundle$annotations() {
    }

    @C12438n("discount_amount")
    public static /* synthetic */ void getDiscountAmount$annotations() {
    }

    @C12438n("discount_unit")
    public static /* synthetic */ void getDiscountUnit$annotations() {
    }

    @C12438n("financing_type_code")
    public static /* synthetic */ void getFinancingTypeCode$annotations() {
    }

    @C12438n("mandate_id")
    public static /* synthetic */ void getMandateId$annotations() {
    }

    @C11384m
    public static final /* synthetic */ void write$Self(BffDeals bffDeals, C12239d dVar, C12217f fVar) {
        boolean z = false;
        if (dVar.mo24897A(fVar, 0) || bffDeals.mandateId != null) {
            dVar.mo24912i(fVar, 0, C12310s1.f30117a, bffDeals.mandateId);
        }
        if (dVar.mo24897A(fVar, 1) || bffDeals.bundle != null) {
            dVar.mo24912i(fVar, 1, C12276h0.f30067a, bffDeals.bundle);
        }
        if (dVar.mo24897A(fVar, 2) || bffDeals.discountAmount != null) {
            dVar.mo24912i(fVar, 2, C12276h0.f30067a, bffDeals.discountAmount);
        }
        if (dVar.mo24897A(fVar, 3) || bffDeals.discountUnit != null) {
            dVar.mo24912i(fVar, 3, C12310s1.f30117a, bffDeals.discountUnit);
        }
        if (dVar.mo24897A(fVar, 4) || bffDeals.financingTypeCode != null) {
            dVar.mo24912i(fVar, 4, C12310s1.f30117a, bffDeals.financingTypeCode);
        }
        if (dVar.mo24897A(fVar, 5) || bffDeals.bffBundleSalePrice != null) {
            dVar.mo24912i(fVar, 5, C12276h0.f30067a, bffDeals.bffBundleSalePrice);
        }
        if (dVar.mo24897A(fVar, 6) || bffDeals.bffBundleBasePrice != null) {
            z = true;
        }
        if (z) {
            dVar.mo24912i(fVar, 6, C12276h0.f30067a, bffDeals.bffBundleBasePrice);
        }
    }

    @C12580l
    public final String component1() {
        return this.mandateId;
    }

    @C12580l
    public final Integer component2() {
        return this.bundle;
    }

    @C12580l
    public final Integer component3() {
        return this.discountAmount;
    }

    @C12580l
    public final String component4() {
        return this.discountUnit;
    }

    @C12580l
    public final String component5() {
        return this.financingTypeCode;
    }

    @C12580l
    public final Integer component6() {
        return this.bffBundleSalePrice;
    }

    @C12580l
    public final Integer component7() {
        return this.bffBundleBasePrice;
    }

    @C12579k
    public final BffDeals copy(@C12580l String str, @C12580l Integer num, @C12580l Integer num2, @C12580l String str2, @C12580l String str3, @C12580l Integer num3, @C12580l Integer num4) {
        return new BffDeals(str, num, num2, str2, str3, num3, num4);
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BffDeals)) {
            return false;
        }
        BffDeals bffDeals = (BffDeals) obj;
        return Intrinsics.areEqual((Object) this.mandateId, (Object) bffDeals.mandateId) && Intrinsics.areEqual((Object) this.bundle, (Object) bffDeals.bundle) && Intrinsics.areEqual((Object) this.discountAmount, (Object) bffDeals.discountAmount) && Intrinsics.areEqual((Object) this.discountUnit, (Object) bffDeals.discountUnit) && Intrinsics.areEqual((Object) this.financingTypeCode, (Object) bffDeals.financingTypeCode) && Intrinsics.areEqual((Object) this.bffBundleSalePrice, (Object) bffDeals.bffBundleSalePrice) && Intrinsics.areEqual((Object) this.bffBundleBasePrice, (Object) bffDeals.bffBundleBasePrice);
    }

    @C12580l
    public final Integer getBffBundleBasePrice() {
        return this.bffBundleBasePrice;
    }

    @C12580l
    public final Integer getBffBundleSalePrice() {
        return this.bffBundleSalePrice;
    }

    @C12580l
    public final Integer getBundle() {
        return this.bundle;
    }

    @C12580l
    public final Integer getDiscountAmount() {
        return this.discountAmount;
    }

    @C12580l
    public final String getDiscountUnit() {
        return this.discountUnit;
    }

    @C12580l
    public final String getFinancingTypeCode() {
        return this.financingTypeCode;
    }

    @C12580l
    public final String getMandateId() {
        return this.mandateId;
    }

    public int hashCode() {
        String str = this.mandateId;
        int i = 0;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        Integer num = this.bundle;
        int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.discountAmount;
        int hashCode3 = (hashCode2 + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str2 = this.discountUnit;
        int hashCode4 = (hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.financingTypeCode;
        int hashCode5 = (hashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Integer num3 = this.bffBundleSalePrice;
        int hashCode6 = (hashCode5 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Integer num4 = this.bffBundleBasePrice;
        if (num4 != null) {
            i = num4.hashCode();
        }
        return hashCode6 + i;
    }

    @C12579k
    public String toString() {
        String str = this.mandateId;
        Integer num = this.bundle;
        Integer num2 = this.discountAmount;
        String str2 = this.discountUnit;
        String str3 = this.financingTypeCode;
        Integer num3 = this.bffBundleSalePrice;
        Integer num4 = this.bffBundleBasePrice;
        return "BffDeals(mandateId=" + str + ", bundle=" + num + ", discountAmount=" + num2 + ", discountUnit=" + str2 + ", financingTypeCode=" + str3 + ", bffBundleSalePrice=" + num3 + ", bffBundleBasePrice=" + num4 + ")";
    }

    @C11395k(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @C11587t0(expression = "", imports = {}))
    public /* synthetic */ BffDeals(int i, @C12438n("mandate_id") String str, @C12438n("bundle") Integer num, @C12438n("discount_amount") Integer num2, @C12438n("discount_unit") String str2, @C12438n("financing_type_code") String str3, @C12438n("bff_bundle-sale-price") Integer num3, @C12438n("bff_bundle-base-price") Integer num4, C12295n1 n1Var) {
        if ((i & 0) != 0) {
            C12261c1.m49256b(i, 0, BffDeals$$serializer.INSTANCE.getDescriptor());
        }
        if ((i & 1) == 0) {
            this.mandateId = null;
        } else {
            this.mandateId = str;
        }
        if ((i & 2) == 0) {
            this.bundle = null;
        } else {
            this.bundle = num;
        }
        if ((i & 4) == 0) {
            this.discountAmount = null;
        } else {
            this.discountAmount = num2;
        }
        if ((i & 8) == 0) {
            this.discountUnit = null;
        } else {
            this.discountUnit = str2;
        }
        if ((i & 16) == 0) {
            this.financingTypeCode = null;
        } else {
            this.financingTypeCode = str3;
        }
        if ((i & 32) == 0) {
            this.bffBundleSalePrice = null;
        } else {
            this.bffBundleSalePrice = num3;
        }
        if ((i & 64) == 0) {
            this.bffBundleBasePrice = null;
        } else {
            this.bffBundleBasePrice = num4;
        }
    }

    public BffDeals(@C12580l String str, @C12580l Integer num, @C12580l Integer num2, @C12580l String str2, @C12580l String str3, @C12580l Integer num3, @C12580l Integer num4) {
        this.mandateId = str;
        this.bundle = num;
        this.discountAmount = num2;
        this.discountUnit = str2;
        this.financingTypeCode = str3;
        this.bffBundleSalePrice = num3;
        this.bffBundleBasePrice = num4;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ BffDeals(java.lang.String r7, java.lang.Integer r8, java.lang.Integer r9, java.lang.String r10, java.lang.String r11, java.lang.Integer r12, java.lang.Integer r13, int r14, kotlin.jvm.internal.DefaultConstructorMarker r15) {
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
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.bff_data_shared.data.api.entities.BffDeals.<init>(java.lang.String, java.lang.Integer, java.lang.Integer, java.lang.String, java.lang.String, java.lang.Integer, java.lang.Integer, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
