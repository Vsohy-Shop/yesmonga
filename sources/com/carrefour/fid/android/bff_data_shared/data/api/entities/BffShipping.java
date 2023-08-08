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

@C11076d0(mo22515d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0005\b\b\u0018\u0000 12\u00020\u0001:\u000221BC\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b+\u0010,BW\b\u0017\u0012\u0006\u0010-\u001a\u00020\t\u0012\n\b\u0001\u0010\u0011\u001a\u0004\u0018\u00010\t\u0012\n\b\u0001\u0010\u0012\u001a\u0004\u0018\u00010\t\u0012\n\b\u0001\u0010\u0013\u001a\u0004\u0018\u00010\t\u0012\n\b\u0001\u0010\u0014\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0001\u0010\u0015\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010/\u001a\u0004\u0018\u00010.¢\u0006\u0004\b+\u00100J!\u0010\b\u001a\u00020\u00072\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005HÇ\u0001J\u0012\u0010\n\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0012\u0010\f\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b\f\u0010\u000bJ\u0012\u0010\r\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b\r\u0010\u000bJ\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u000eHÆ\u0003JL\u0010\u0016\u001a\u00020\u00002\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u000eHÆ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\t\u0010\u0018\u001a\u00020\u000eHÖ\u0001J\t\u0010\u0019\u001a\u00020\tHÖ\u0001J\u0013\u0010\u001c\u001a\u00020\u001b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\"\u0010\u0011\u001a\u0004\u0018\u00010\t8\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0011\u0010\u001d\u0012\u0004\b\u001f\u0010 \u001a\u0004\b\u001e\u0010\u000bR\"\u0010\u0012\u001a\u0004\u0018\u00010\t8\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0012\u0010\u001d\u0012\u0004\b\"\u0010 \u001a\u0004\b!\u0010\u000bR\"\u0010\u0013\u001a\u0004\u0018\u00010\t8\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0013\u0010\u001d\u0012\u0004\b$\u0010 \u001a\u0004\b#\u0010\u000bR\"\u0010\u0014\u001a\u0004\u0018\u00010\u000e8\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0014\u0010%\u0012\u0004\b(\u0010 \u001a\u0004\b&\u0010'R\"\u0010\u0015\u001a\u0004\u0018\u00010\u000e8\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0015\u0010%\u0012\u0004\b*\u0010 \u001a\u0004\b)\u0010'¨\u00063"}, mo22516d2 = {"Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/BffShipping;", "", "self", "Lkotlinx/serialization/encoding/d;", "output", "Lkotlinx/serialization/descriptors/f;", "serialDesc", "Lkotlin/d2;", "write$Self", "", "component1", "()Ljava/lang/Integer;", "component2", "component3", "", "component4", "component5", "leadTime", "fee", "additionalShippingFee", "minimumType", "zone", "copy", "(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;)Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/BffShipping;", "toString", "hashCode", "other", "", "equals", "Ljava/lang/Integer;", "getLeadTime", "getLeadTime$annotations", "()V", "getFee", "getFee$annotations", "getAdditionalShippingFee", "getAdditionalShippingFee$annotations", "Ljava/lang/String;", "getMinimumType", "()Ljava/lang/String;", "getMinimumType$annotations", "getZone", "getZone$annotations", "<init>", "(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;)V", "seen1", "Lkotlinx/serialization/internal/n1;", "serializationConstructorMarker", "(ILjava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/n1;)V", "Companion", "$serializer", "bff-data-shared_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
@C12439o
public final class BffShipping {
    @C12579k
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    @C12580l
    private final Integer additionalShippingFee;
    @C12580l
    private final Integer fee;
    @C12580l
    private final Integer leadTime;
    @C12580l
    private final String minimumType;
    @C12580l
    private final String zone;

    @C11076d0(mo22515d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¨\u0006\u0007"}, mo22516d2 = {"Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/BffShipping$Companion;", "", "Lkotlinx/serialization/g;", "Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/BffShipping;", "serializer", "<init>", "()V", "bff-data-shared_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @C12579k
        public final C12248g<BffShipping> serializer() {
            return BffShipping$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public BffShipping() {
        this((Integer) null, (Integer) null, (Integer) null, (String) null, (String) null, 31, (DefaultConstructorMarker) null);
    }

    public static /* synthetic */ BffShipping copy$default(BffShipping bffShipping, Integer num, Integer num2, Integer num3, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            num = bffShipping.leadTime;
        }
        if ((i & 2) != 0) {
            num2 = bffShipping.fee;
        }
        Integer num4 = num2;
        if ((i & 4) != 0) {
            num3 = bffShipping.additionalShippingFee;
        }
        Integer num5 = num3;
        if ((i & 8) != 0) {
            str = bffShipping.minimumType;
        }
        String str3 = str;
        if ((i & 16) != 0) {
            str2 = bffShipping.zone;
        }
        return bffShipping.copy(num, num4, num5, str3, str2);
    }

    @C12438n("additional_shipping_fee")
    public static /* synthetic */ void getAdditionalShippingFee$annotations() {
    }

    @C12438n("fee")
    public static /* synthetic */ void getFee$annotations() {
    }

    @C12438n("lead_time")
    public static /* synthetic */ void getLeadTime$annotations() {
    }

    @C12438n("minimum_type")
    public static /* synthetic */ void getMinimumType$annotations() {
    }

    @C12438n("zone")
    public static /* synthetic */ void getZone$annotations() {
    }

    @C11384m
    public static final /* synthetic */ void write$Self(BffShipping bffShipping, C12239d dVar, C12217f fVar) {
        boolean z = false;
        if (dVar.mo24897A(fVar, 0) || bffShipping.leadTime != null) {
            dVar.mo24912i(fVar, 0, C12276h0.f30067a, bffShipping.leadTime);
        }
        if (dVar.mo24897A(fVar, 1) || bffShipping.fee != null) {
            dVar.mo24912i(fVar, 1, C12276h0.f30067a, bffShipping.fee);
        }
        if (dVar.mo24897A(fVar, 2) || bffShipping.additionalShippingFee != null) {
            dVar.mo24912i(fVar, 2, C12276h0.f30067a, bffShipping.additionalShippingFee);
        }
        if (dVar.mo24897A(fVar, 3) || bffShipping.minimumType != null) {
            dVar.mo24912i(fVar, 3, C12310s1.f30117a, bffShipping.minimumType);
        }
        if (dVar.mo24897A(fVar, 4) || bffShipping.zone != null) {
            z = true;
        }
        if (z) {
            dVar.mo24912i(fVar, 4, C12310s1.f30117a, bffShipping.zone);
        }
    }

    @C12580l
    public final Integer component1() {
        return this.leadTime;
    }

    @C12580l
    public final Integer component2() {
        return this.fee;
    }

    @C12580l
    public final Integer component3() {
        return this.additionalShippingFee;
    }

    @C12580l
    public final String component4() {
        return this.minimumType;
    }

    @C12580l
    public final String component5() {
        return this.zone;
    }

    @C12579k
    public final BffShipping copy(@C12580l Integer num, @C12580l Integer num2, @C12580l Integer num3, @C12580l String str, @C12580l String str2) {
        return new BffShipping(num, num2, num3, str, str2);
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BffShipping)) {
            return false;
        }
        BffShipping bffShipping = (BffShipping) obj;
        return Intrinsics.areEqual((Object) this.leadTime, (Object) bffShipping.leadTime) && Intrinsics.areEqual((Object) this.fee, (Object) bffShipping.fee) && Intrinsics.areEqual((Object) this.additionalShippingFee, (Object) bffShipping.additionalShippingFee) && Intrinsics.areEqual((Object) this.minimumType, (Object) bffShipping.minimumType) && Intrinsics.areEqual((Object) this.zone, (Object) bffShipping.zone);
    }

    @C12580l
    public final Integer getAdditionalShippingFee() {
        return this.additionalShippingFee;
    }

    @C12580l
    public final Integer getFee() {
        return this.fee;
    }

    @C12580l
    public final Integer getLeadTime() {
        return this.leadTime;
    }

    @C12580l
    public final String getMinimumType() {
        return this.minimumType;
    }

    @C12580l
    public final String getZone() {
        return this.zone;
    }

    public int hashCode() {
        Integer num = this.leadTime;
        int i = 0;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.fee;
        int hashCode2 = (hashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.additionalShippingFee;
        int hashCode3 = (hashCode2 + (num3 == null ? 0 : num3.hashCode())) * 31;
        String str = this.minimumType;
        int hashCode4 = (hashCode3 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.zone;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return hashCode4 + i;
    }

    @C12579k
    public String toString() {
        Integer num = this.leadTime;
        Integer num2 = this.fee;
        Integer num3 = this.additionalShippingFee;
        String str = this.minimumType;
        String str2 = this.zone;
        return "BffShipping(leadTime=" + num + ", fee=" + num2 + ", additionalShippingFee=" + num3 + ", minimumType=" + str + ", zone=" + str2 + ")";
    }

    @C11395k(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @C11587t0(expression = "", imports = {}))
    public /* synthetic */ BffShipping(int i, @C12438n("lead_time") Integer num, @C12438n("fee") Integer num2, @C12438n("additional_shipping_fee") Integer num3, @C12438n("minimum_type") String str, @C12438n("zone") String str2, C12295n1 n1Var) {
        if ((i & 0) != 0) {
            C12261c1.m49256b(i, 0, BffShipping$$serializer.INSTANCE.getDescriptor());
        }
        if ((i & 1) == 0) {
            this.leadTime = null;
        } else {
            this.leadTime = num;
        }
        if ((i & 2) == 0) {
            this.fee = null;
        } else {
            this.fee = num2;
        }
        if ((i & 4) == 0) {
            this.additionalShippingFee = null;
        } else {
            this.additionalShippingFee = num3;
        }
        if ((i & 8) == 0) {
            this.minimumType = null;
        } else {
            this.minimumType = str;
        }
        if ((i & 16) == 0) {
            this.zone = null;
        } else {
            this.zone = str2;
        }
    }

    public BffShipping(@C12580l Integer num, @C12580l Integer num2, @C12580l Integer num3, @C12580l String str, @C12580l String str2) {
        this.leadTime = num;
        this.fee = num2;
        this.additionalShippingFee = num3;
        this.minimumType = str;
        this.zone = str2;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ BffShipping(java.lang.Integer r5, java.lang.Integer r6, java.lang.Integer r7, java.lang.String r8, java.lang.String r9, int r10, kotlin.jvm.internal.DefaultConstructorMarker r11) {
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
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.bff_data_shared.data.api.entities.BffShipping.<init>(java.lang.Integer, java.lang.Integer, java.lang.Integer, java.lang.String, java.lang.String, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
