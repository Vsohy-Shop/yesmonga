package com.carrefour.fid.android.bff_data_shared.data.api.entities;

import java.math.BigDecimal;
import java.util.List;
import kotlin.C11076d0;
import kotlin.C11395k;
import kotlin.C11587t0;
import kotlin.DeprecationLevel;
import kotlin.jvm.C11287e;
import kotlin.jvm.C11384m;
import kotlin.jvm.internal.C11342l0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.C12196b;
import kotlinx.serialization.C12248g;
import kotlinx.serialization.C12438n;
import kotlinx.serialization.C12439o;
import kotlinx.serialization.ContextualSerializer;
import kotlinx.serialization.descriptors.C12217f;
import kotlinx.serialization.encoding.C12239d;
import kotlinx.serialization.internal.C12261c1;
import kotlinx.serialization.internal.C12269f;
import kotlinx.serialization.internal.C12295n1;
import kotlinx.serialization.internal.C12310s1;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0005\b\b\u0018\u0000 &2\u00020\u0001:\u0002'&B%\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\t\u0012\u0010\b\u0002\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b¢\u0006\u0004\b \u0010!B9\b\u0017\u0012\u0006\u0010\"\u001a\u00020\u0012\u0012\n\b\u0001\u0010\u000e\u001a\u0004\u0018\u00010\t\u0012\u0010\b\u0001\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b\u0012\b\u0010$\u001a\u0004\u0018\u00010#¢\u0006\u0004\b \u0010%J!\u0010\b\u001a\u00020\u00072\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005HÇ\u0001J\u000b\u0010\n\u001a\u0004\u0018\u00010\tHÆ\u0003J\u0011\u0010\r\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000bHÆ\u0003J'\u0010\u0010\u001a\u00020\u00002\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\t2\u0010\b\u0002\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000bHÆ\u0001J\t\u0010\u0011\u001a\u00020\fHÖ\u0001J\t\u0010\u0013\u001a\u00020\u0012HÖ\u0001J\u0013\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\"\u0010\u000e\u001a\u0004\u0018\u00010\t8\u0006X\u0004¢\u0006\u0012\n\u0004\b\u000e\u0010\u0017\u0012\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u0018\u0010\u0019R(\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b8\u0006X\u0004¢\u0006\u0012\n\u0004\b\u000f\u0010\u001c\u0012\u0004\b\u001f\u0010\u001b\u001a\u0004\b\u001d\u0010\u001e¨\u0006("}, mo22516d2 = {"Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/BffLimit1;", "", "self", "Lkotlinx/serialization/encoding/d;", "output", "Lkotlinx/serialization/descriptors/f;", "serialDesc", "Lkotlin/d2;", "write$Self", "Ljava/math/BigDecimal;", "component1", "", "", "component2", "value", "categories", "copy", "toString", "", "hashCode", "other", "", "equals", "Ljava/math/BigDecimal;", "getValue", "()Ljava/math/BigDecimal;", "getValue$annotations", "()V", "Ljava/util/List;", "getCategories", "()Ljava/util/List;", "getCategories$annotations", "<init>", "(Ljava/math/BigDecimal;Ljava/util/List;)V", "seen1", "Lkotlinx/serialization/internal/n1;", "serializationConstructorMarker", "(ILjava/math/BigDecimal;Ljava/util/List;Lkotlinx/serialization/internal/n1;)V", "Companion", "$serializer", "bff-data-shared_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
@C12439o
public final class BffLimit1 {
    /* access modifiers changed from: private */
    @C12579k
    @C11287e
    public static final C12248g<Object>[] $childSerializers = {new ContextualSerializer(C11342l0.m43547d(BigDecimal.class), (C12248g) null, new C12248g[0]), new C12269f(C12310s1.f30117a)};
    @C12579k
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    @C12580l
    private final List<String> categories;
    @C12580l
    private final BigDecimal value;

    @C11076d0(mo22515d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¨\u0006\u0007"}, mo22516d2 = {"Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/BffLimit1$Companion;", "", "Lkotlinx/serialization/g;", "Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/BffLimit1;", "serializer", "<init>", "()V", "bff-data-shared_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @C12579k
        public final C12248g<BffLimit1> serializer() {
            return BffLimit1$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public BffLimit1() {
        this((BigDecimal) null, (List) null, 3, (DefaultConstructorMarker) null);
    }

    public static /* synthetic */ BffLimit1 copy$default(BffLimit1 bffLimit1, BigDecimal bigDecimal, List<String> list, int i, Object obj) {
        if ((i & 1) != 0) {
            bigDecimal = bffLimit1.value;
        }
        if ((i & 2) != 0) {
            list = bffLimit1.categories;
        }
        return bffLimit1.copy(bigDecimal, list);
    }

    @C12438n("categories")
    public static /* synthetic */ void getCategories$annotations() {
    }

    @C12196b
    @C12438n("value")
    public static /* synthetic */ void getValue$annotations() {
    }

    @C11384m
    public static final /* synthetic */ void write$Self(BffLimit1 bffLimit1, C12239d dVar, C12217f fVar) {
        C12248g<Object>[] gVarArr = $childSerializers;
        boolean z = false;
        if (dVar.mo24897A(fVar, 0) || bffLimit1.value != null) {
            dVar.mo24912i(fVar, 0, gVarArr[0], bffLimit1.value);
        }
        if (dVar.mo24897A(fVar, 1) || bffLimit1.categories != null) {
            z = true;
        }
        if (z) {
            dVar.mo24912i(fVar, 1, gVarArr[1], bffLimit1.categories);
        }
    }

    @C12580l
    public final BigDecimal component1() {
        return this.value;
    }

    @C12580l
    public final List<String> component2() {
        return this.categories;
    }

    @C12579k
    public final BffLimit1 copy(@C12580l BigDecimal bigDecimal, @C12580l List<String> list) {
        return new BffLimit1(bigDecimal, list);
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BffLimit1)) {
            return false;
        }
        BffLimit1 bffLimit1 = (BffLimit1) obj;
        return Intrinsics.areEqual((Object) this.value, (Object) bffLimit1.value) && Intrinsics.areEqual((Object) this.categories, (Object) bffLimit1.categories);
    }

    @C12580l
    public final List<String> getCategories() {
        return this.categories;
    }

    @C12580l
    public final BigDecimal getValue() {
        return this.value;
    }

    public int hashCode() {
        BigDecimal bigDecimal = this.value;
        int i = 0;
        int hashCode = (bigDecimal == null ? 0 : bigDecimal.hashCode()) * 31;
        List<String> list = this.categories;
        if (list != null) {
            i = list.hashCode();
        }
        return hashCode + i;
    }

    @C12579k
    public String toString() {
        BigDecimal bigDecimal = this.value;
        List<String> list = this.categories;
        return "BffLimit1(value=" + bigDecimal + ", categories=" + list + ")";
    }

    @C11395k(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @C11587t0(expression = "", imports = {}))
    public /* synthetic */ BffLimit1(int i, @C12196b @C12438n("value") BigDecimal bigDecimal, @C12438n("categories") List list, C12295n1 n1Var) {
        if ((i & 0) != 0) {
            C12261c1.m49256b(i, 0, BffLimit1$$serializer.INSTANCE.getDescriptor());
        }
        if ((i & 1) == 0) {
            this.value = null;
        } else {
            this.value = bigDecimal;
        }
        if ((i & 2) == 0) {
            this.categories = null;
        } else {
            this.categories = list;
        }
    }

    public BffLimit1(@C12580l BigDecimal bigDecimal, @C12580l List<String> list) {
        this.value = bigDecimal;
        this.categories = list;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ BffLimit1(BigDecimal bigDecimal, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : bigDecimal, (i & 2) != 0 ? null : list);
    }
}
