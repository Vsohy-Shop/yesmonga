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

@C11076d0(mo22515d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0019\n\u0002\u0018\u0002\n\u0002\b\u0005\b\b\u0018\u0000 ;2\u00020\u0001:\u0002<;BC\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b5\u00106BW\b\u0017\u0012\u0006\u00107\u001a\u00020\u001b\u0012\n\b\u0001\u0010\u0013\u001a\u0004\u0018\u00010\t\u0012\n\b\u0001\u0010\u0014\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0001\u0010\u0015\u001a\u0004\u0018\u00010\r\u0012\n\b\u0001\u0010\u0016\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0001\u0010\u0017\u001a\u0004\u0018\u00010\u0011\u0012\b\u00109\u001a\u0004\u0018\u000108¢\u0006\u0004\b5\u0010:J!\u0010\b\u001a\u00020\u00072\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005HÇ\u0001J\u000b\u0010\n\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010\f\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\rHÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0011HÆ\u0003JE\u0010\u0018\u001a\u00020\u00002\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0011HÆ\u0001J\t\u0010\u001a\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001c\u001a\u00020\u001bHÖ\u0001J\u0013\u0010\u001f\u001a\u00020\u001e2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\"\u0010\u0013\u001a\u0004\u0018\u00010\t8\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0013\u0010 \u0012\u0004\b#\u0010$\u001a\u0004\b!\u0010\"R\"\u0010\u0014\u001a\u0004\u0018\u00010\u000b8\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0014\u0010%\u0012\u0004\b(\u0010$\u001a\u0004\b&\u0010'R\"\u0010\u0015\u001a\u0004\u0018\u00010\r8\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0015\u0010)\u0012\u0004\b,\u0010$\u001a\u0004\b*\u0010+R\"\u0010\u0016\u001a\u0004\u0018\u00010\u000f8\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0016\u0010-\u0012\u0004\b0\u0010$\u001a\u0004\b.\u0010/R\"\u0010\u0017\u001a\u0004\u0018\u00010\u00118\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0017\u00101\u0012\u0004\b4\u0010$\u001a\u0004\b2\u00103¨\u0006="}, mo22516d2 = {"Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/BffWeightsAndMeasures;", "", "self", "Lkotlinx/serialization/encoding/d;", "output", "Lkotlinx/serialization/descriptors/f;", "serialDesc", "Lkotlin/d2;", "write$Self", "Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/BffNetWeight;", "component1", "Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/BffGrossWeight;", "component2", "Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/BffHeight;", "component3", "Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/BffLength;", "component4", "Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/BffWidth;", "component5", "netWeight", "grossWeight", "height", "length", "width", "copy", "", "toString", "", "hashCode", "other", "", "equals", "Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/BffNetWeight;", "getNetWeight", "()Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/BffNetWeight;", "getNetWeight$annotations", "()V", "Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/BffGrossWeight;", "getGrossWeight", "()Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/BffGrossWeight;", "getGrossWeight$annotations", "Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/BffHeight;", "getHeight", "()Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/BffHeight;", "getHeight$annotations", "Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/BffLength;", "getLength", "()Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/BffLength;", "getLength$annotations", "Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/BffWidth;", "getWidth", "()Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/BffWidth;", "getWidth$annotations", "<init>", "(Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/BffNetWeight;Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/BffGrossWeight;Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/BffHeight;Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/BffLength;Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/BffWidth;)V", "seen1", "Lkotlinx/serialization/internal/n1;", "serializationConstructorMarker", "(ILcom/carrefour/fid/android/bff_data_shared/data/api/entities/BffNetWeight;Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/BffGrossWeight;Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/BffHeight;Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/BffLength;Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/BffWidth;Lkotlinx/serialization/internal/n1;)V", "Companion", "$serializer", "bff-data-shared_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
@C12439o
public final class BffWeightsAndMeasures {
    @C12579k
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    @C12580l
    private final BffGrossWeight grossWeight;
    @C12580l
    private final BffHeight height;
    @C12580l
    private final BffLength length;
    @C12580l
    private final BffNetWeight netWeight;
    @C12580l
    private final BffWidth width;

    @C11076d0(mo22515d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¨\u0006\u0007"}, mo22516d2 = {"Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/BffWeightsAndMeasures$Companion;", "", "Lkotlinx/serialization/g;", "Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/BffWeightsAndMeasures;", "serializer", "<init>", "()V", "bff-data-shared_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @C12579k
        public final C12248g<BffWeightsAndMeasures> serializer() {
            return BffWeightsAndMeasures$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public BffWeightsAndMeasures() {
        this((BffNetWeight) null, (BffGrossWeight) null, (BffHeight) null, (BffLength) null, (BffWidth) null, 31, (DefaultConstructorMarker) null);
    }

    public static /* synthetic */ BffWeightsAndMeasures copy$default(BffWeightsAndMeasures bffWeightsAndMeasures, BffNetWeight bffNetWeight, BffGrossWeight bffGrossWeight, BffHeight bffHeight, BffLength bffLength, BffWidth bffWidth, int i, Object obj) {
        if ((i & 1) != 0) {
            bffNetWeight = bffWeightsAndMeasures.netWeight;
        }
        if ((i & 2) != 0) {
            bffGrossWeight = bffWeightsAndMeasures.grossWeight;
        }
        BffGrossWeight bffGrossWeight2 = bffGrossWeight;
        if ((i & 4) != 0) {
            bffHeight = bffWeightsAndMeasures.height;
        }
        BffHeight bffHeight2 = bffHeight;
        if ((i & 8) != 0) {
            bffLength = bffWeightsAndMeasures.length;
        }
        BffLength bffLength2 = bffLength;
        if ((i & 16) != 0) {
            bffWidth = bffWeightsAndMeasures.width;
        }
        return bffWeightsAndMeasures.copy(bffNetWeight, bffGrossWeight2, bffHeight2, bffLength2, bffWidth);
    }

    @C12438n("gross_weight")
    public static /* synthetic */ void getGrossWeight$annotations() {
    }

    @C12438n("height")
    public static /* synthetic */ void getHeight$annotations() {
    }

    @C12438n("length")
    public static /* synthetic */ void getLength$annotations() {
    }

    @C12438n("net_weight")
    public static /* synthetic */ void getNetWeight$annotations() {
    }

    @C12438n("width")
    public static /* synthetic */ void getWidth$annotations() {
    }

    @C11384m
    public static final /* synthetic */ void write$Self(BffWeightsAndMeasures bffWeightsAndMeasures, C12239d dVar, C12217f fVar) {
        boolean z = false;
        if (dVar.mo24897A(fVar, 0) || bffWeightsAndMeasures.netWeight != null) {
            dVar.mo24912i(fVar, 0, BffNetWeight$$serializer.INSTANCE, bffWeightsAndMeasures.netWeight);
        }
        if (dVar.mo24897A(fVar, 1) || bffWeightsAndMeasures.grossWeight != null) {
            dVar.mo24912i(fVar, 1, BffGrossWeight$$serializer.INSTANCE, bffWeightsAndMeasures.grossWeight);
        }
        if (dVar.mo24897A(fVar, 2) || bffWeightsAndMeasures.height != null) {
            dVar.mo24912i(fVar, 2, BffHeight$$serializer.INSTANCE, bffWeightsAndMeasures.height);
        }
        if (dVar.mo24897A(fVar, 3) || bffWeightsAndMeasures.length != null) {
            dVar.mo24912i(fVar, 3, BffLength$$serializer.INSTANCE, bffWeightsAndMeasures.length);
        }
        if (dVar.mo24897A(fVar, 4) || bffWeightsAndMeasures.width != null) {
            z = true;
        }
        if (z) {
            dVar.mo24912i(fVar, 4, BffWidth$$serializer.INSTANCE, bffWeightsAndMeasures.width);
        }
    }

    @C12580l
    public final BffNetWeight component1() {
        return this.netWeight;
    }

    @C12580l
    public final BffGrossWeight component2() {
        return this.grossWeight;
    }

    @C12580l
    public final BffHeight component3() {
        return this.height;
    }

    @C12580l
    public final BffLength component4() {
        return this.length;
    }

    @C12580l
    public final BffWidth component5() {
        return this.width;
    }

    @C12579k
    public final BffWeightsAndMeasures copy(@C12580l BffNetWeight bffNetWeight, @C12580l BffGrossWeight bffGrossWeight, @C12580l BffHeight bffHeight, @C12580l BffLength bffLength, @C12580l BffWidth bffWidth) {
        return new BffWeightsAndMeasures(bffNetWeight, bffGrossWeight, bffHeight, bffLength, bffWidth);
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BffWeightsAndMeasures)) {
            return false;
        }
        BffWeightsAndMeasures bffWeightsAndMeasures = (BffWeightsAndMeasures) obj;
        return Intrinsics.areEqual((Object) this.netWeight, (Object) bffWeightsAndMeasures.netWeight) && Intrinsics.areEqual((Object) this.grossWeight, (Object) bffWeightsAndMeasures.grossWeight) && Intrinsics.areEqual((Object) this.height, (Object) bffWeightsAndMeasures.height) && Intrinsics.areEqual((Object) this.length, (Object) bffWeightsAndMeasures.length) && Intrinsics.areEqual((Object) this.width, (Object) bffWeightsAndMeasures.width);
    }

    @C12580l
    public final BffGrossWeight getGrossWeight() {
        return this.grossWeight;
    }

    @C12580l
    public final BffHeight getHeight() {
        return this.height;
    }

    @C12580l
    public final BffLength getLength() {
        return this.length;
    }

    @C12580l
    public final BffNetWeight getNetWeight() {
        return this.netWeight;
    }

    @C12580l
    public final BffWidth getWidth() {
        return this.width;
    }

    public int hashCode() {
        BffNetWeight bffNetWeight = this.netWeight;
        int i = 0;
        int hashCode = (bffNetWeight == null ? 0 : bffNetWeight.hashCode()) * 31;
        BffGrossWeight bffGrossWeight = this.grossWeight;
        int hashCode2 = (hashCode + (bffGrossWeight == null ? 0 : bffGrossWeight.hashCode())) * 31;
        BffHeight bffHeight = this.height;
        int hashCode3 = (hashCode2 + (bffHeight == null ? 0 : bffHeight.hashCode())) * 31;
        BffLength bffLength = this.length;
        int hashCode4 = (hashCode3 + (bffLength == null ? 0 : bffLength.hashCode())) * 31;
        BffWidth bffWidth = this.width;
        if (bffWidth != null) {
            i = bffWidth.hashCode();
        }
        return hashCode4 + i;
    }

    @C12579k
    public String toString() {
        BffNetWeight bffNetWeight = this.netWeight;
        BffGrossWeight bffGrossWeight = this.grossWeight;
        BffHeight bffHeight = this.height;
        BffLength bffLength = this.length;
        BffWidth bffWidth = this.width;
        return "BffWeightsAndMeasures(netWeight=" + bffNetWeight + ", grossWeight=" + bffGrossWeight + ", height=" + bffHeight + ", length=" + bffLength + ", width=" + bffWidth + ")";
    }

    @C11395k(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @C11587t0(expression = "", imports = {}))
    public /* synthetic */ BffWeightsAndMeasures(int i, @C12438n("net_weight") BffNetWeight bffNetWeight, @C12438n("gross_weight") BffGrossWeight bffGrossWeight, @C12438n("height") BffHeight bffHeight, @C12438n("length") BffLength bffLength, @C12438n("width") BffWidth bffWidth, C12295n1 n1Var) {
        if ((i & 0) != 0) {
            C12261c1.m49256b(i, 0, BffWeightsAndMeasures$$serializer.INSTANCE.getDescriptor());
        }
        if ((i & 1) == 0) {
            this.netWeight = null;
        } else {
            this.netWeight = bffNetWeight;
        }
        if ((i & 2) == 0) {
            this.grossWeight = null;
        } else {
            this.grossWeight = bffGrossWeight;
        }
        if ((i & 4) == 0) {
            this.height = null;
        } else {
            this.height = bffHeight;
        }
        if ((i & 8) == 0) {
            this.length = null;
        } else {
            this.length = bffLength;
        }
        if ((i & 16) == 0) {
            this.width = null;
        } else {
            this.width = bffWidth;
        }
    }

    public BffWeightsAndMeasures(@C12580l BffNetWeight bffNetWeight, @C12580l BffGrossWeight bffGrossWeight, @C12580l BffHeight bffHeight, @C12580l BffLength bffLength, @C12580l BffWidth bffWidth) {
        this.netWeight = bffNetWeight;
        this.grossWeight = bffGrossWeight;
        this.height = bffHeight;
        this.length = bffLength;
        this.width = bffWidth;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ BffWeightsAndMeasures(com.carrefour.fid.android.bff_data_shared.data.api.entities.BffNetWeight r5, com.carrefour.fid.android.bff_data_shared.data.api.entities.BffGrossWeight r6, com.carrefour.fid.android.bff_data_shared.data.api.entities.BffHeight r7, com.carrefour.fid.android.bff_data_shared.data.api.entities.BffLength r8, com.carrefour.fid.android.bff_data_shared.data.api.entities.BffWidth r9, int r10, kotlin.jvm.internal.DefaultConstructorMarker r11) {
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
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.bff_data_shared.data.api.entities.BffWeightsAndMeasures.<init>(com.carrefour.fid.android.bff_data_shared.data.api.entities.BffNetWeight, com.carrefour.fid.android.bff_data_shared.data.api.entities.BffGrossWeight, com.carrefour.fid.android.bff_data_shared.data.api.entities.BffHeight, com.carrefour.fid.android.bff_data_shared.data.api.entities.BffLength, com.carrefour.fid.android.bff_data_shared.data.api.entities.BffWidth, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
