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
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\b\b\u0018\u0000  2\u00020\u0001:\u0002! B\u0019\u0012\u0010\b\u0002\u0010\f\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t¢\u0006\u0004\b\u001a\u0010\u001bB-\b\u0017\u0012\u0006\u0010\u001c\u001a\u00020\u0010\u0012\u0010\b\u0001\u0010\f\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t\u0012\b\u0010\u001e\u001a\u0004\u0018\u00010\u001d¢\u0006\u0004\b\u001a\u0010\u001fJ!\u0010\b\u001a\u00020\u00072\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005HÇ\u0001J\u0011\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\tHÆ\u0003J\u001b\u0010\r\u001a\u00020\u00002\u0010\b\u0002\u0010\f\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\tHÆ\u0001J\t\u0010\u000f\u001a\u00020\u000eHÖ\u0001J\t\u0010\u0011\u001a\u00020\u0010HÖ\u0001J\u0013\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003R(\u0010\f\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t8\u0006X\u0004¢\u0006\u0012\n\u0004\b\f\u0010\u0015\u0012\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0016\u0010\u0017¨\u0006\""}, mo22516d2 = {"Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/BffFoodNutritionalTablesIncoVariante;", "", "self", "Lkotlinx/serialization/encoding/d;", "output", "Lkotlinx/serialization/descriptors/f;", "serialDesc", "Lkotlin/d2;", "write$Self", "", "Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/BffFoodNutritionalTablesIncoNutrients;", "component1", "incoNutrients", "copy", "", "toString", "", "hashCode", "other", "", "equals", "Ljava/util/List;", "getIncoNutrients", "()Ljava/util/List;", "getIncoNutrients$annotations", "()V", "<init>", "(Ljava/util/List;)V", "seen1", "Lkotlinx/serialization/internal/n1;", "serializationConstructorMarker", "(ILjava/util/List;Lkotlinx/serialization/internal/n1;)V", "Companion", "$serializer", "bff-data-shared_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
@C12439o
public final class BffFoodNutritionalTablesIncoVariante {
    /* access modifiers changed from: private */
    @C12579k
    @C11287e
    public static final C12248g<Object>[] $childSerializers = {new C12269f(BffFoodNutritionalTablesIncoNutrients$$serializer.INSTANCE)};
    @C12579k
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    @C12580l
    private final List<BffFoodNutritionalTablesIncoNutrients> incoNutrients;

    @C11076d0(mo22515d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¨\u0006\u0007"}, mo22516d2 = {"Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/BffFoodNutritionalTablesIncoVariante$Companion;", "", "Lkotlinx/serialization/g;", "Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/BffFoodNutritionalTablesIncoVariante;", "serializer", "<init>", "()V", "bff-data-shared_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @C12579k
        public final C12248g<BffFoodNutritionalTablesIncoVariante> serializer() {
            return BffFoodNutritionalTablesIncoVariante$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public BffFoodNutritionalTablesIncoVariante() {
        this((List) null, 1, (DefaultConstructorMarker) null);
    }

    public static /* synthetic */ BffFoodNutritionalTablesIncoVariante copy$default(BffFoodNutritionalTablesIncoVariante bffFoodNutritionalTablesIncoVariante, List<BffFoodNutritionalTablesIncoNutrients> list, int i, Object obj) {
        if ((i & 1) != 0) {
            list = bffFoodNutritionalTablesIncoVariante.incoNutrients;
        }
        return bffFoodNutritionalTablesIncoVariante.copy(list);
    }

    @C12438n("inco_nutrients")
    public static /* synthetic */ void getIncoNutrients$annotations() {
    }

    @C11384m
    public static final /* synthetic */ void write$Self(BffFoodNutritionalTablesIncoVariante bffFoodNutritionalTablesIncoVariante, C12239d dVar, C12217f fVar) {
        C12248g<Object>[] gVarArr = $childSerializers;
        boolean z = true;
        if (!dVar.mo24897A(fVar, 0) && bffFoodNutritionalTablesIncoVariante.incoNutrients == null) {
            z = false;
        }
        if (z) {
            dVar.mo24912i(fVar, 0, gVarArr[0], bffFoodNutritionalTablesIncoVariante.incoNutrients);
        }
    }

    @C12580l
    public final List<BffFoodNutritionalTablesIncoNutrients> component1() {
        return this.incoNutrients;
    }

    @C12579k
    public final BffFoodNutritionalTablesIncoVariante copy(@C12580l List<BffFoodNutritionalTablesIncoNutrients> list) {
        return new BffFoodNutritionalTablesIncoVariante(list);
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof BffFoodNutritionalTablesIncoVariante) && Intrinsics.areEqual((Object) this.incoNutrients, (Object) ((BffFoodNutritionalTablesIncoVariante) obj).incoNutrients);
    }

    @C12580l
    public final List<BffFoodNutritionalTablesIncoNutrients> getIncoNutrients() {
        return this.incoNutrients;
    }

    public int hashCode() {
        List<BffFoodNutritionalTablesIncoNutrients> list = this.incoNutrients;
        if (list == null) {
            return 0;
        }
        return list.hashCode();
    }

    @C12579k
    public String toString() {
        List<BffFoodNutritionalTablesIncoNutrients> list = this.incoNutrients;
        return "BffFoodNutritionalTablesIncoVariante(incoNutrients=" + list + ")";
    }

    @C11395k(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @C11587t0(expression = "", imports = {}))
    public /* synthetic */ BffFoodNutritionalTablesIncoVariante(int i, @C12438n("inco_nutrients") List list, C12295n1 n1Var) {
        if ((i & 0) != 0) {
            C12261c1.m49256b(i, 0, BffFoodNutritionalTablesIncoVariante$$serializer.INSTANCE.getDescriptor());
        }
        if ((i & 1) == 0) {
            this.incoNutrients = null;
        } else {
            this.incoNutrients = list;
        }
    }

    public BffFoodNutritionalTablesIncoVariante(@C12580l List<BffFoodNutritionalTablesIncoNutrients> list) {
        this.incoNutrients = list;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ BffFoodNutritionalTablesIncoVariante(List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : list);
    }
}
