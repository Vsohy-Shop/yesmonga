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
import kotlinx.serialization.internal.C12311t;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0005\b\b\u0018\u0000 &2\u00020\u0001:\u0002'&B\u001f\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b \u0010!B3\b\u0017\u0012\u0006\u0010\"\u001a\u00020\u0013\u0012\n\b\u0001\u0010\u000e\u001a\u0004\u0018\u00010\t\u0012\n\b\u0001\u0010\u000f\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010$\u001a\u0004\u0018\u00010#¢\u0006\u0004\b \u0010%J!\u0010\b\u001a\u00020\u00072\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005HÇ\u0001J\u000b\u0010\n\u001a\u0004\u0018\u00010\tHÆ\u0003J\u0012\u0010\f\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0004\b\f\u0010\rJ(\u0010\u0010\u001a\u00020\u00002\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000bHÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\t\u0010\u0012\u001a\u00020\tHÖ\u0001J\t\u0010\u0014\u001a\u00020\u0013HÖ\u0001J\u0013\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\"\u0010\u000e\u001a\u0004\u0018\u00010\t8\u0006X\u0004¢\u0006\u0012\n\u0004\b\u000e\u0010\u0018\u0012\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u0019\u0010\u001aR\"\u0010\u000f\u001a\u0004\u0018\u00010\u000b8\u0006X\u0004¢\u0006\u0012\n\u0004\b\u000f\u0010\u001d\u0012\u0004\b\u001f\u0010\u001c\u001a\u0004\b\u001e\u0010\r¨\u0006("}, mo22516d2 = {"Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/BffTaxes;", "", "self", "Lkotlinx/serialization/encoding/d;", "output", "Lkotlinx/serialization/descriptors/f;", "serialDesc", "Lkotlin/d2;", "write$Self", "", "component1", "", "component2", "()Ljava/lang/Double;", "name", "amount", "copy", "(Ljava/lang/String;Ljava/lang/Double;)Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/BffTaxes;", "toString", "", "hashCode", "other", "", "equals", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "getName$annotations", "()V", "Ljava/lang/Double;", "getAmount", "getAmount$annotations", "<init>", "(Ljava/lang/String;Ljava/lang/Double;)V", "seen1", "Lkotlinx/serialization/internal/n1;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/Double;Lkotlinx/serialization/internal/n1;)V", "Companion", "$serializer", "bff-data-shared_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
@C12439o
public final class BffTaxes {
    @C12579k
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    @C12580l
    private final Double amount;
    @C12580l
    private final String name;

    @C11076d0(mo22515d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¨\u0006\u0007"}, mo22516d2 = {"Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/BffTaxes$Companion;", "", "Lkotlinx/serialization/g;", "Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/BffTaxes;", "serializer", "<init>", "()V", "bff-data-shared_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @C12579k
        public final C12248g<BffTaxes> serializer() {
            return BffTaxes$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public BffTaxes() {
        this((String) null, (Double) null, 3, (DefaultConstructorMarker) null);
    }

    public static /* synthetic */ BffTaxes copy$default(BffTaxes bffTaxes, String str, Double d, int i, Object obj) {
        if ((i & 1) != 0) {
            str = bffTaxes.name;
        }
        if ((i & 2) != 0) {
            d = bffTaxes.amount;
        }
        return bffTaxes.copy(str, d);
    }

    @C12438n("amount")
    public static /* synthetic */ void getAmount$annotations() {
    }

    @C12438n("name")
    public static /* synthetic */ void getName$annotations() {
    }

    @C11384m
    public static final /* synthetic */ void write$Self(BffTaxes bffTaxes, C12239d dVar, C12217f fVar) {
        boolean z = false;
        if (dVar.mo24897A(fVar, 0) || bffTaxes.name != null) {
            dVar.mo24912i(fVar, 0, C12310s1.f30117a, bffTaxes.name);
        }
        if (dVar.mo24897A(fVar, 1) || bffTaxes.amount != null) {
            z = true;
        }
        if (z) {
            dVar.mo24912i(fVar, 1, C12311t.f30119a, bffTaxes.amount);
        }
    }

    @C12580l
    public final String component1() {
        return this.name;
    }

    @C12580l
    public final Double component2() {
        return this.amount;
    }

    @C12579k
    public final BffTaxes copy(@C12580l String str, @C12580l Double d) {
        return new BffTaxes(str, d);
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BffTaxes)) {
            return false;
        }
        BffTaxes bffTaxes = (BffTaxes) obj;
        return Intrinsics.areEqual((Object) this.name, (Object) bffTaxes.name) && Intrinsics.areEqual((Object) this.amount, (Object) bffTaxes.amount);
    }

    @C12580l
    public final Double getAmount() {
        return this.amount;
    }

    @C12580l
    public final String getName() {
        return this.name;
    }

    public int hashCode() {
        String str = this.name;
        int i = 0;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        Double d = this.amount;
        if (d != null) {
            i = d.hashCode();
        }
        return hashCode + i;
    }

    @C12579k
    public String toString() {
        String str = this.name;
        Double d = this.amount;
        return "BffTaxes(name=" + str + ", amount=" + d + ")";
    }

    @C11395k(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @C11587t0(expression = "", imports = {}))
    public /* synthetic */ BffTaxes(int i, @C12438n("name") String str, @C12438n("amount") Double d, C12295n1 n1Var) {
        if ((i & 0) != 0) {
            C12261c1.m49256b(i, 0, BffTaxes$$serializer.INSTANCE.getDescriptor());
        }
        if ((i & 1) == 0) {
            this.name = null;
        } else {
            this.name = str;
        }
        if ((i & 2) == 0) {
            this.amount = null;
        } else {
            this.amount = d;
        }
    }

    public BffTaxes(@C12580l String str, @C12580l Double d) {
        this.name = str;
        this.amount = d;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ BffTaxes(String str, Double d, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : d);
    }
}
