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
import kotlinx.serialization.internal.C12276h0;
import kotlinx.serialization.internal.C12295n1;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u001a\n\u0002\u0018\u0002\n\u0002\b\u0005\b\b\u0018\u0000 A2\u00020\u0001:\u0002BABg\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u0010\u0012\u0010\b\u0002\u0010\u001b\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u0012\u0012\u0010\b\u0002\u0010\u001c\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u0012¢\u0006\u0004\b;\u0010<B{\b\u0017\u0012\u0006\u0010=\u001a\u00020\t\u0012\n\b\u0001\u0010\u0016\u001a\u0004\u0018\u00010\t\u0012\n\b\u0001\u0010\u0017\u001a\u0004\u0018\u00010\t\u0012\n\b\u0001\u0010\u0018\u001a\u0004\u0018\u00010\t\u0012\n\b\u0001\u0010\u0019\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0001\u0010\u001a\u001a\u0004\u0018\u00010\u0010\u0012\u0010\b\u0001\u0010\u001b\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u0012\u0012\u0010\b\u0001\u0010\u001c\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u0012\u0012\b\u0010?\u001a\u0004\u0018\u00010>¢\u0006\u0004\b;\u0010@J!\u0010\b\u001a\u00020\u00072\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005HÇ\u0001J\u0012\u0010\n\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0012\u0010\f\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b\f\u0010\u000bJ\u0012\u0010\r\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b\r\u0010\u000bJ\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÆ\u0003J\u0011\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u0012HÆ\u0003J\u0011\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u0012HÆ\u0003Jp\u0010\u001d\u001a\u00020\u00002\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u00102\u0010\b\u0002\u0010\u001b\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u00122\u0010\b\u0002\u0010\u001c\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u0012HÆ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\t\u0010 \u001a\u00020\u001fHÖ\u0001J\t\u0010!\u001a\u00020\tHÖ\u0001J\u0013\u0010$\u001a\u00020#2\b\u0010\"\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\"\u0010\u0016\u001a\u0004\u0018\u00010\t8\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0016\u0010%\u0012\u0004\b'\u0010(\u001a\u0004\b&\u0010\u000bR\"\u0010\u0017\u001a\u0004\u0018\u00010\t8\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0017\u0010%\u0012\u0004\b*\u0010(\u001a\u0004\b)\u0010\u000bR\"\u0010\u0018\u001a\u0004\u0018\u00010\t8\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0018\u0010%\u0012\u0004\b,\u0010(\u001a\u0004\b+\u0010\u000bR\"\u0010\u0019\u001a\u0004\u0018\u00010\u000e8\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0019\u0010-\u0012\u0004\b0\u0010(\u001a\u0004\b.\u0010/R\"\u0010\u001a\u001a\u0004\u0018\u00010\u00108\u0006X\u0004¢\u0006\u0012\n\u0004\b\u001a\u00101\u0012\u0004\b4\u0010(\u001a\u0004\b2\u00103R(\u0010\u001b\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u00128\u0006X\u0004¢\u0006\u0012\n\u0004\b\u001b\u00105\u0012\u0004\b8\u0010(\u001a\u0004\b6\u00107R(\u0010\u001c\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u00128\u0006X\u0004¢\u0006\u0012\n\u0004\b\u001c\u00105\u0012\u0004\b:\u0010(\u001a\u0004\b9\u00107¨\u0006C"}, mo22516d2 = {"Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/BffPrices;", "", "self", "Lkotlinx/serialization/encoding/d;", "output", "Lkotlinx/serialization/descriptors/f;", "serialDesc", "Lkotlin/d2;", "write$Self", "", "component1", "()Ljava/lang/Integer;", "component2", "component3", "Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/BffStandardPricePerUnit;", "component4", "Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/BffDiscount;", "component5", "", "component6", "Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/BffTaxes;", "component7", "startingPrice", "salePrice", "permanentPrice", "standardPricePerUnit", "discount", "discounts", "taxes", "copy", "(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/BffStandardPricePerUnit;Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/BffDiscount;Ljava/util/List;Ljava/util/List;)Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/BffPrices;", "", "toString", "hashCode", "other", "", "equals", "Ljava/lang/Integer;", "getStartingPrice", "getStartingPrice$annotations", "()V", "getSalePrice", "getSalePrice$annotations", "getPermanentPrice", "getPermanentPrice$annotations", "Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/BffStandardPricePerUnit;", "getStandardPricePerUnit", "()Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/BffStandardPricePerUnit;", "getStandardPricePerUnit$annotations", "Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/BffDiscount;", "getDiscount", "()Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/BffDiscount;", "getDiscount$annotations", "Ljava/util/List;", "getDiscounts", "()Ljava/util/List;", "getDiscounts$annotations", "getTaxes", "getTaxes$annotations", "<init>", "(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/BffStandardPricePerUnit;Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/BffDiscount;Ljava/util/List;Ljava/util/List;)V", "seen1", "Lkotlinx/serialization/internal/n1;", "serializationConstructorMarker", "(ILjava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/BffStandardPricePerUnit;Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/BffDiscount;Ljava/util/List;Ljava/util/List;Lkotlinx/serialization/internal/n1;)V", "Companion", "$serializer", "bff-data-shared_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
@C12439o
public final class BffPrices {
    /* access modifiers changed from: private */
    @C12579k
    @C11287e
    public static final C12248g<Object>[] $childSerializers = {null, null, null, null, null, new C12269f(BffDiscount$$serializer.INSTANCE), new C12269f(BffTaxes$$serializer.INSTANCE)};
    @C12579k
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    @C12580l
    private final BffDiscount discount;
    @C12580l
    private final List<BffDiscount> discounts;
    @C12580l
    private final Integer permanentPrice;
    @C12580l
    private final Integer salePrice;
    @C12580l
    private final BffStandardPricePerUnit standardPricePerUnit;
    @C12580l
    private final Integer startingPrice;
    @C12580l
    private final List<BffTaxes> taxes;

    @C11076d0(mo22515d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¨\u0006\u0007"}, mo22516d2 = {"Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/BffPrices$Companion;", "", "Lkotlinx/serialization/g;", "Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/BffPrices;", "serializer", "<init>", "()V", "bff-data-shared_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @C12579k
        public final C12248g<BffPrices> serializer() {
            return BffPrices$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public BffPrices() {
        this((Integer) null, (Integer) null, (Integer) null, (BffStandardPricePerUnit) null, (BffDiscount) null, (List) null, (List) null, 127, (DefaultConstructorMarker) null);
    }

    public static /* synthetic */ BffPrices copy$default(BffPrices bffPrices, Integer num, Integer num2, Integer num3, BffStandardPricePerUnit bffStandardPricePerUnit, BffDiscount bffDiscount, List<BffDiscount> list, List<BffTaxes> list2, int i, Object obj) {
        if ((i & 1) != 0) {
            num = bffPrices.startingPrice;
        }
        if ((i & 2) != 0) {
            num2 = bffPrices.salePrice;
        }
        Integer num4 = num2;
        if ((i & 4) != 0) {
            num3 = bffPrices.permanentPrice;
        }
        Integer num5 = num3;
        if ((i & 8) != 0) {
            bffStandardPricePerUnit = bffPrices.standardPricePerUnit;
        }
        BffStandardPricePerUnit bffStandardPricePerUnit2 = bffStandardPricePerUnit;
        if ((i & 16) != 0) {
            bffDiscount = bffPrices.discount;
        }
        BffDiscount bffDiscount2 = bffDiscount;
        if ((i & 32) != 0) {
            list = bffPrices.discounts;
        }
        List<BffDiscount> list3 = list;
        if ((i & 64) != 0) {
            list2 = bffPrices.taxes;
        }
        return bffPrices.copy(num, num4, num5, bffStandardPricePerUnit2, bffDiscount2, list3, list2);
    }

    @C12438n("discount")
    public static /* synthetic */ void getDiscount$annotations() {
    }

    @C12438n("discounts")
    public static /* synthetic */ void getDiscounts$annotations() {
    }

    @C12438n("permanent_price")
    public static /* synthetic */ void getPermanentPrice$annotations() {
    }

    @C12438n("sale_price")
    public static /* synthetic */ void getSalePrice$annotations() {
    }

    @C12438n("standard_price_per_unit")
    public static /* synthetic */ void getStandardPricePerUnit$annotations() {
    }

    @C12438n("starting_price")
    public static /* synthetic */ void getStartingPrice$annotations() {
    }

    @C12438n("taxes")
    public static /* synthetic */ void getTaxes$annotations() {
    }

    @C11384m
    public static final /* synthetic */ void write$Self(BffPrices bffPrices, C12239d dVar, C12217f fVar) {
        C12248g<Object>[] gVarArr = $childSerializers;
        boolean z = false;
        if (dVar.mo24897A(fVar, 0) || bffPrices.startingPrice != null) {
            dVar.mo24912i(fVar, 0, C12276h0.f30067a, bffPrices.startingPrice);
        }
        if (dVar.mo24897A(fVar, 1) || bffPrices.salePrice != null) {
            dVar.mo24912i(fVar, 1, C12276h0.f30067a, bffPrices.salePrice);
        }
        if (dVar.mo24897A(fVar, 2) || bffPrices.permanentPrice != null) {
            dVar.mo24912i(fVar, 2, C12276h0.f30067a, bffPrices.permanentPrice);
        }
        if (dVar.mo24897A(fVar, 3) || bffPrices.standardPricePerUnit != null) {
            dVar.mo24912i(fVar, 3, BffStandardPricePerUnit$$serializer.INSTANCE, bffPrices.standardPricePerUnit);
        }
        if (dVar.mo24897A(fVar, 4) || bffPrices.discount != null) {
            dVar.mo24912i(fVar, 4, BffDiscount$$serializer.INSTANCE, bffPrices.discount);
        }
        if (dVar.mo24897A(fVar, 5) || bffPrices.discounts != null) {
            dVar.mo24912i(fVar, 5, gVarArr[5], bffPrices.discounts);
        }
        if (dVar.mo24897A(fVar, 6) || bffPrices.taxes != null) {
            z = true;
        }
        if (z) {
            dVar.mo24912i(fVar, 6, gVarArr[6], bffPrices.taxes);
        }
    }

    @C12580l
    public final Integer component1() {
        return this.startingPrice;
    }

    @C12580l
    public final Integer component2() {
        return this.salePrice;
    }

    @C12580l
    public final Integer component3() {
        return this.permanentPrice;
    }

    @C12580l
    public final BffStandardPricePerUnit component4() {
        return this.standardPricePerUnit;
    }

    @C12580l
    public final BffDiscount component5() {
        return this.discount;
    }

    @C12580l
    public final List<BffDiscount> component6() {
        return this.discounts;
    }

    @C12580l
    public final List<BffTaxes> component7() {
        return this.taxes;
    }

    @C12579k
    public final BffPrices copy(@C12580l Integer num, @C12580l Integer num2, @C12580l Integer num3, @C12580l BffStandardPricePerUnit bffStandardPricePerUnit, @C12580l BffDiscount bffDiscount, @C12580l List<BffDiscount> list, @C12580l List<BffTaxes> list2) {
        return new BffPrices(num, num2, num3, bffStandardPricePerUnit, bffDiscount, list, list2);
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BffPrices)) {
            return false;
        }
        BffPrices bffPrices = (BffPrices) obj;
        return Intrinsics.areEqual((Object) this.startingPrice, (Object) bffPrices.startingPrice) && Intrinsics.areEqual((Object) this.salePrice, (Object) bffPrices.salePrice) && Intrinsics.areEqual((Object) this.permanentPrice, (Object) bffPrices.permanentPrice) && Intrinsics.areEqual((Object) this.standardPricePerUnit, (Object) bffPrices.standardPricePerUnit) && Intrinsics.areEqual((Object) this.discount, (Object) bffPrices.discount) && Intrinsics.areEqual((Object) this.discounts, (Object) bffPrices.discounts) && Intrinsics.areEqual((Object) this.taxes, (Object) bffPrices.taxes);
    }

    @C12580l
    public final BffDiscount getDiscount() {
        return this.discount;
    }

    @C12580l
    public final List<BffDiscount> getDiscounts() {
        return this.discounts;
    }

    @C12580l
    public final Integer getPermanentPrice() {
        return this.permanentPrice;
    }

    @C12580l
    public final Integer getSalePrice() {
        return this.salePrice;
    }

    @C12580l
    public final BffStandardPricePerUnit getStandardPricePerUnit() {
        return this.standardPricePerUnit;
    }

    @C12580l
    public final Integer getStartingPrice() {
        return this.startingPrice;
    }

    @C12580l
    public final List<BffTaxes> getTaxes() {
        return this.taxes;
    }

    public int hashCode() {
        Integer num = this.startingPrice;
        int i = 0;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.salePrice;
        int hashCode2 = (hashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.permanentPrice;
        int hashCode3 = (hashCode2 + (num3 == null ? 0 : num3.hashCode())) * 31;
        BffStandardPricePerUnit bffStandardPricePerUnit = this.standardPricePerUnit;
        int hashCode4 = (hashCode3 + (bffStandardPricePerUnit == null ? 0 : bffStandardPricePerUnit.hashCode())) * 31;
        BffDiscount bffDiscount = this.discount;
        int hashCode5 = (hashCode4 + (bffDiscount == null ? 0 : bffDiscount.hashCode())) * 31;
        List<BffDiscount> list = this.discounts;
        int hashCode6 = (hashCode5 + (list == null ? 0 : list.hashCode())) * 31;
        List<BffTaxes> list2 = this.taxes;
        if (list2 != null) {
            i = list2.hashCode();
        }
        return hashCode6 + i;
    }

    @C12579k
    public String toString() {
        Integer num = this.startingPrice;
        Integer num2 = this.salePrice;
        Integer num3 = this.permanentPrice;
        BffStandardPricePerUnit bffStandardPricePerUnit = this.standardPricePerUnit;
        BffDiscount bffDiscount = this.discount;
        List<BffDiscount> list = this.discounts;
        List<BffTaxes> list2 = this.taxes;
        return "BffPrices(startingPrice=" + num + ", salePrice=" + num2 + ", permanentPrice=" + num3 + ", standardPricePerUnit=" + bffStandardPricePerUnit + ", discount=" + bffDiscount + ", discounts=" + list + ", taxes=" + list2 + ")";
    }

    @C11395k(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @C11587t0(expression = "", imports = {}))
    public /* synthetic */ BffPrices(int i, @C12438n("starting_price") Integer num, @C12438n("sale_price") Integer num2, @C12438n("permanent_price") Integer num3, @C12438n("standard_price_per_unit") BffStandardPricePerUnit bffStandardPricePerUnit, @C12438n("discount") BffDiscount bffDiscount, @C12438n("discounts") List list, @C12438n("taxes") List list2, C12295n1 n1Var) {
        if ((i & 0) != 0) {
            C12261c1.m49256b(i, 0, BffPrices$$serializer.INSTANCE.getDescriptor());
        }
        if ((i & 1) == 0) {
            this.startingPrice = null;
        } else {
            this.startingPrice = num;
        }
        if ((i & 2) == 0) {
            this.salePrice = null;
        } else {
            this.salePrice = num2;
        }
        if ((i & 4) == 0) {
            this.permanentPrice = null;
        } else {
            this.permanentPrice = num3;
        }
        if ((i & 8) == 0) {
            this.standardPricePerUnit = null;
        } else {
            this.standardPricePerUnit = bffStandardPricePerUnit;
        }
        if ((i & 16) == 0) {
            this.discount = null;
        } else {
            this.discount = bffDiscount;
        }
        if ((i & 32) == 0) {
            this.discounts = null;
        } else {
            this.discounts = list;
        }
        if ((i & 64) == 0) {
            this.taxes = null;
        } else {
            this.taxes = list2;
        }
    }

    public BffPrices(@C12580l Integer num, @C12580l Integer num2, @C12580l Integer num3, @C12580l BffStandardPricePerUnit bffStandardPricePerUnit, @C12580l BffDiscount bffDiscount, @C12580l List<BffDiscount> list, @C12580l List<BffTaxes> list2) {
        this.startingPrice = num;
        this.salePrice = num2;
        this.permanentPrice = num3;
        this.standardPricePerUnit = bffStandardPricePerUnit;
        this.discount = bffDiscount;
        this.discounts = list;
        this.taxes = list2;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ BffPrices(java.lang.Integer r7, java.lang.Integer r8, java.lang.Integer r9, com.carrefour.fid.android.bff_data_shared.data.api.entities.BffStandardPricePerUnit r10, com.carrefour.fid.android.bff_data_shared.data.api.entities.BffDiscount r11, java.util.List r12, java.util.List r13, int r14, kotlin.jvm.internal.DefaultConstructorMarker r15) {
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
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.bff_data_shared.data.api.entities.BffPrices.<init>(java.lang.Integer, java.lang.Integer, java.lang.Integer, com.carrefour.fid.android.bff_data_shared.data.api.entities.BffStandardPricePerUnit, com.carrefour.fid.android.bff_data_shared.data.api.entities.BffDiscount, java.util.List, java.util.List, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
