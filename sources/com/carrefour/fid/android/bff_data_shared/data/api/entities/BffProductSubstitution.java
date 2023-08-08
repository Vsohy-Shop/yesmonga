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
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0005\b\b\u0018\u0000 &2\u00020\u0001:\u0002'&B%\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\t\u0012\u0010\b\u0002\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b¢\u0006\u0004\b \u0010!B9\b\u0017\u0012\u0006\u0010\"\u001a\u00020\u0012\u0012\n\b\u0001\u0010\u000e\u001a\u0004\u0018\u00010\t\u0012\u0010\b\u0001\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b\u0012\b\u0010$\u001a\u0004\u0018\u00010#¢\u0006\u0004\b \u0010%J!\u0010\b\u001a\u00020\u00072\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005HÇ\u0001J\u000b\u0010\n\u001a\u0004\u0018\u00010\tHÆ\u0003J\u0011\u0010\r\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000bHÆ\u0003J'\u0010\u0010\u001a\u00020\u00002\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\t2\u0010\b\u0002\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000bHÆ\u0001J\t\u0010\u0011\u001a\u00020\tHÖ\u0001J\t\u0010\u0013\u001a\u00020\u0012HÖ\u0001J\u0013\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\"\u0010\u000e\u001a\u0004\u0018\u00010\t8\u0006X\u0004¢\u0006\u0012\n\u0004\b\u000e\u0010\u0017\u0012\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u0018\u0010\u0019R(\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b8\u0006X\u0004¢\u0006\u0012\n\u0004\b\u000f\u0010\u001c\u0012\u0004\b\u001f\u0010\u001b\u001a\u0004\b\u001d\u0010\u001e¨\u0006("}, mo22516d2 = {"Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/BffProductSubstitution;", "", "self", "Lkotlinx/serialization/encoding/d;", "output", "Lkotlinx/serialization/descriptors/f;", "serialDesc", "Lkotlin/d2;", "write$Self", "", "component1", "", "Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/BffSubstitutedProducts;", "component2", "gtin", "substitutions", "copy", "toString", "", "hashCode", "other", "", "equals", "Ljava/lang/String;", "getGtin", "()Ljava/lang/String;", "getGtin$annotations", "()V", "Ljava/util/List;", "getSubstitutions", "()Ljava/util/List;", "getSubstitutions$annotations", "<init>", "(Ljava/lang/String;Ljava/util/List;)V", "seen1", "Lkotlinx/serialization/internal/n1;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/util/List;Lkotlinx/serialization/internal/n1;)V", "Companion", "$serializer", "bff-data-shared_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
@C12439o
public final class BffProductSubstitution {
    /* access modifiers changed from: private */
    @C12579k
    @C11287e
    public static final C12248g<Object>[] $childSerializers = {null, new C12269f(BffSubstitutedProducts$$serializer.INSTANCE)};
    @C12579k
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    @C12580l
    private final String gtin;
    @C12580l
    private final List<BffSubstitutedProducts> substitutions;

    @C11076d0(mo22515d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¨\u0006\u0007"}, mo22516d2 = {"Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/BffProductSubstitution$Companion;", "", "Lkotlinx/serialization/g;", "Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/BffProductSubstitution;", "serializer", "<init>", "()V", "bff-data-shared_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @C12579k
        public final C12248g<BffProductSubstitution> serializer() {
            return BffProductSubstitution$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public BffProductSubstitution() {
        this((String) null, (List) null, 3, (DefaultConstructorMarker) null);
    }

    public static /* synthetic */ BffProductSubstitution copy$default(BffProductSubstitution bffProductSubstitution, String str, List<BffSubstitutedProducts> list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = bffProductSubstitution.gtin;
        }
        if ((i & 2) != 0) {
            list = bffProductSubstitution.substitutions;
        }
        return bffProductSubstitution.copy(str, list);
    }

    @C12438n("gtin")
    public static /* synthetic */ void getGtin$annotations() {
    }

    @C12438n("substitutions")
    public static /* synthetic */ void getSubstitutions$annotations() {
    }

    @C11384m
    public static final /* synthetic */ void write$Self(BffProductSubstitution bffProductSubstitution, C12239d dVar, C12217f fVar) {
        C12248g<Object>[] gVarArr = $childSerializers;
        boolean z = false;
        if (dVar.mo24897A(fVar, 0) || bffProductSubstitution.gtin != null) {
            dVar.mo24912i(fVar, 0, C12310s1.f30117a, bffProductSubstitution.gtin);
        }
        if (dVar.mo24897A(fVar, 1) || bffProductSubstitution.substitutions != null) {
            z = true;
        }
        if (z) {
            dVar.mo24912i(fVar, 1, gVarArr[1], bffProductSubstitution.substitutions);
        }
    }

    @C12580l
    public final String component1() {
        return this.gtin;
    }

    @C12580l
    public final List<BffSubstitutedProducts> component2() {
        return this.substitutions;
    }

    @C12579k
    public final BffProductSubstitution copy(@C12580l String str, @C12580l List<BffSubstitutedProducts> list) {
        return new BffProductSubstitution(str, list);
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BffProductSubstitution)) {
            return false;
        }
        BffProductSubstitution bffProductSubstitution = (BffProductSubstitution) obj;
        return Intrinsics.areEqual((Object) this.gtin, (Object) bffProductSubstitution.gtin) && Intrinsics.areEqual((Object) this.substitutions, (Object) bffProductSubstitution.substitutions);
    }

    @C12580l
    public final String getGtin() {
        return this.gtin;
    }

    @C12580l
    public final List<BffSubstitutedProducts> getSubstitutions() {
        return this.substitutions;
    }

    public int hashCode() {
        String str = this.gtin;
        int i = 0;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        List<BffSubstitutedProducts> list = this.substitutions;
        if (list != null) {
            i = list.hashCode();
        }
        return hashCode + i;
    }

    @C12579k
    public String toString() {
        String str = this.gtin;
        List<BffSubstitutedProducts> list = this.substitutions;
        return "BffProductSubstitution(gtin=" + str + ", substitutions=" + list + ")";
    }

    @C11395k(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @C11587t0(expression = "", imports = {}))
    public /* synthetic */ BffProductSubstitution(int i, @C12438n("gtin") String str, @C12438n("substitutions") List list, C12295n1 n1Var) {
        if ((i & 0) != 0) {
            C12261c1.m49256b(i, 0, BffProductSubstitution$$serializer.INSTANCE.getDescriptor());
        }
        if ((i & 1) == 0) {
            this.gtin = null;
        } else {
            this.gtin = str;
        }
        if ((i & 2) == 0) {
            this.substitutions = null;
        } else {
            this.substitutions = list;
        }
    }

    public BffProductSubstitution(@C12580l String str, @C12580l List<BffSubstitutedProducts> list) {
        this.gtin = str;
        this.substitutions = list;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ BffProductSubstitution(String str, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : list);
    }
}
