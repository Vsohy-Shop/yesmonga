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

@C11076d0(mo22515d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b%\n\u0002\u0018\u0002\n\u0002\b\u0005\b\b\u0018\u0000 :2\u00020\u0001:\u0002;:BA\u0012\u0006\u0010\u0014\u001a\u00020\t\u0012\u0006\u0010\u0015\u001a\u00020\t\u0012\u0006\u0010\u0016\u001a\u00020\f\u0012\u0006\u0010\u0017\u001a\u00020\u000e\u0012\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b4\u00105Be\b\u0017\u0012\u0006\u00106\u001a\u00020\f\u0012\n\b\u0001\u0010\u0014\u001a\u0004\u0018\u00010\t\u0012\n\b\u0001\u0010\u0015\u001a\u0004\u0018\u00010\t\u0012\b\b\u0001\u0010\u0016\u001a\u00020\f\u0012\b\b\u0001\u0010\u0017\u001a\u00020\u000e\u0012\u0010\b\u0001\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0010\u0012\n\b\u0001\u0010\u0019\u001a\u0004\u0018\u00010\t\u0012\b\u00108\u001a\u0004\u0018\u000107¢\u0006\u0004\b4\u00109J!\u0010\b\u001a\u00020\u00072\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005HÇ\u0001J\t\u0010\n\u001a\u00020\tHÆ\u0003J\t\u0010\u000b\u001a\u00020\tHÆ\u0003J\t\u0010\r\u001a\u00020\fHÆ\u0003J\t\u0010\u000f\u001a\u00020\u000eHÆ\u0003J\u000f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\tHÆ\u0003JM\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0014\u001a\u00020\t2\b\b\u0002\u0010\u0015\u001a\u00020\t2\b\b\u0002\u0010\u0016\u001a\u00020\f2\b\b\u0002\u0010\u0017\u001a\u00020\u000e2\u000e\b\u0002\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00110\u00102\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\tHÆ\u0001J\t\u0010\u001b\u001a\u00020\tHÖ\u0001J\t\u0010\u001c\u001a\u00020\fHÖ\u0001J\u0013\u0010\u001e\u001a\u00020\u000e2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003R \u0010\u0014\u001a\u00020\t8\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0014\u0010\u001f\u0012\u0004\b\"\u0010#\u001a\u0004\b \u0010!R \u0010\u0015\u001a\u00020\t8\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0015\u0010\u001f\u0012\u0004\b%\u0010#\u001a\u0004\b$\u0010!R \u0010\u0016\u001a\u00020\f8\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0016\u0010&\u0012\u0004\b)\u0010#\u001a\u0004\b'\u0010(R \u0010\u0017\u001a\u00020\u000e8\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0017\u0010*\u0012\u0004\b-\u0010#\u001a\u0004\b+\u0010,R&\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00110\u00108\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0018\u0010.\u0012\u0004\b1\u0010#\u001a\u0004\b/\u00100R\"\u0010\u0019\u001a\u0004\u0018\u00010\t8\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0019\u0010\u001f\u0012\u0004\b3\u0010#\u001a\u0004\b2\u0010!¨\u0006<"}, mo22516d2 = {"Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/BffFacet;", "", "self", "Lkotlinx/serialization/encoding/d;", "output", "Lkotlinx/serialization/descriptors/f;", "serialDesc", "Lkotlin/d2;", "write$Self", "", "component1", "component2", "", "component3", "", "component4", "", "Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/BffTopTerm;", "component5", "component6", "field", "type", "totalTerms", "selected", "topTerms", "name", "copy", "toString", "hashCode", "other", "equals", "Ljava/lang/String;", "getField", "()Ljava/lang/String;", "getField$annotations", "()V", "getType", "getType$annotations", "I", "getTotalTerms", "()I", "getTotalTerms$annotations", "Z", "getSelected", "()Z", "getSelected$annotations", "Ljava/util/List;", "getTopTerms", "()Ljava/util/List;", "getTopTerms$annotations", "getName", "getName$annotations", "<init>", "(Ljava/lang/String;Ljava/lang/String;IZLjava/util/List;Ljava/lang/String;)V", "seen1", "Lkotlinx/serialization/internal/n1;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;IZLjava/util/List;Ljava/lang/String;Lkotlinx/serialization/internal/n1;)V", "Companion", "$serializer", "bff-data-shared_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
@C12439o
public final class BffFacet {
    /* access modifiers changed from: private */
    @C12579k
    @C11287e
    public static final C12248g<Object>[] $childSerializers = {null, null, null, null, new C12269f(BffTopTerm$$serializer.INSTANCE), null};
    @C12579k
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    @C12579k
    private final String field;
    @C12580l
    private final String name;
    private final boolean selected;
    @C12579k
    private final List<BffTopTerm> topTerms;
    private final int totalTerms;
    @C12579k
    private final String type;

    @C11076d0(mo22515d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¨\u0006\u0007"}, mo22516d2 = {"Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/BffFacet$Companion;", "", "Lkotlinx/serialization/g;", "Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/BffFacet;", "serializer", "<init>", "()V", "bff-data-shared_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @C12579k
        public final C12248g<BffFacet> serializer() {
            return BffFacet$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    @C11395k(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @C11587t0(expression = "", imports = {}))
    public /* synthetic */ BffFacet(int i, @C12438n("field") String str, @C12438n("type") String str2, @C12438n("totalTerms") int i2, @C12438n("selected") boolean z, @C12438n("topTerms") List list, @C12438n("name") String str3, C12295n1 n1Var) {
        if (31 != (i & 31)) {
            C12261c1.m49256b(i, 31, BffFacet$$serializer.INSTANCE.getDescriptor());
        }
        this.field = str;
        this.type = str2;
        this.totalTerms = i2;
        this.selected = z;
        this.topTerms = list;
        if ((i & 32) == 0) {
            this.name = null;
        } else {
            this.name = str3;
        }
    }

    public static /* synthetic */ BffFacet copy$default(BffFacet bffFacet, String str, String str2, int i, boolean z, List<BffTopTerm> list, String str3, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = bffFacet.field;
        }
        if ((i2 & 2) != 0) {
            str2 = bffFacet.type;
        }
        String str4 = str2;
        if ((i2 & 4) != 0) {
            i = bffFacet.totalTerms;
        }
        int i3 = i;
        if ((i2 & 8) != 0) {
            z = bffFacet.selected;
        }
        boolean z2 = z;
        if ((i2 & 16) != 0) {
            list = bffFacet.topTerms;
        }
        List<BffTopTerm> list2 = list;
        if ((i2 & 32) != 0) {
            str3 = bffFacet.name;
        }
        return bffFacet.copy(str, str4, i3, z2, list2, str3);
    }

    @C12438n("field")
    public static /* synthetic */ void getField$annotations() {
    }

    @C12438n("name")
    public static /* synthetic */ void getName$annotations() {
    }

    @C12438n("selected")
    public static /* synthetic */ void getSelected$annotations() {
    }

    @C12438n("topTerms")
    public static /* synthetic */ void getTopTerms$annotations() {
    }

    @C12438n("totalTerms")
    public static /* synthetic */ void getTotalTerms$annotations() {
    }

    @C12438n("type")
    public static /* synthetic */ void getType$annotations() {
    }

    @C11384m
    public static final /* synthetic */ void write$Self(BffFacet bffFacet, C12239d dVar, C12217f fVar) {
        C12248g<Object>[] gVarArr = $childSerializers;
        boolean z = false;
        dVar.mo24929z(fVar, 0, bffFacet.field);
        dVar.mo24929z(fVar, 1, bffFacet.type);
        dVar.mo24927x(fVar, 2, bffFacet.totalTerms);
        dVar.mo24928y(fVar, 3, bffFacet.selected);
        dVar.mo24899D(fVar, 4, gVarArr[4], bffFacet.topTerms);
        if (dVar.mo24897A(fVar, 5) || bffFacet.name != null) {
            z = true;
        }
        if (z) {
            dVar.mo24912i(fVar, 5, C12310s1.f30117a, bffFacet.name);
        }
    }

    @C12579k
    public final String component1() {
        return this.field;
    }

    @C12579k
    public final String component2() {
        return this.type;
    }

    public final int component3() {
        return this.totalTerms;
    }

    public final boolean component4() {
        return this.selected;
    }

    @C12579k
    public final List<BffTopTerm> component5() {
        return this.topTerms;
    }

    @C12580l
    public final String component6() {
        return this.name;
    }

    @C12579k
    public final BffFacet copy(@C12579k String str, @C12579k String str2, int i, boolean z, @C12579k List<BffTopTerm> list, @C12580l String str3) {
        Intrinsics.checkNotNullParameter(str, "field");
        Intrinsics.checkNotNullParameter(str2, "type");
        Intrinsics.checkNotNullParameter(list, "topTerms");
        return new BffFacet(str, str2, i, z, list, str3);
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BffFacet)) {
            return false;
        }
        BffFacet bffFacet = (BffFacet) obj;
        return Intrinsics.areEqual((Object) this.field, (Object) bffFacet.field) && Intrinsics.areEqual((Object) this.type, (Object) bffFacet.type) && this.totalTerms == bffFacet.totalTerms && this.selected == bffFacet.selected && Intrinsics.areEqual((Object) this.topTerms, (Object) bffFacet.topTerms) && Intrinsics.areEqual((Object) this.name, (Object) bffFacet.name);
    }

    @C12579k
    public final String getField() {
        return this.field;
    }

    @C12580l
    public final String getName() {
        return this.name;
    }

    public final boolean getSelected() {
        return this.selected;
    }

    @C12579k
    public final List<BffTopTerm> getTopTerms() {
        return this.topTerms;
    }

    public final int getTotalTerms() {
        return this.totalTerms;
    }

    @C12579k
    public final String getType() {
        return this.type;
    }

    public int hashCode() {
        int hashCode = ((((this.field.hashCode() * 31) + this.type.hashCode()) * 31) + Integer.hashCode(this.totalTerms)) * 31;
        boolean z = this.selected;
        if (z) {
            z = true;
        }
        int hashCode2 = (((hashCode + (z ? 1 : 0)) * 31) + this.topTerms.hashCode()) * 31;
        String str = this.name;
        return hashCode2 + (str == null ? 0 : str.hashCode());
    }

    @C12579k
    public String toString() {
        String str = this.field;
        String str2 = this.type;
        int i = this.totalTerms;
        boolean z = this.selected;
        List<BffTopTerm> list = this.topTerms;
        String str3 = this.name;
        return "BffFacet(field=" + str + ", type=" + str2 + ", totalTerms=" + i + ", selected=" + z + ", topTerms=" + list + ", name=" + str3 + ")";
    }

    public BffFacet(@C12579k String str, @C12579k String str2, int i, boolean z, @C12579k List<BffTopTerm> list, @C12580l String str3) {
        Intrinsics.checkNotNullParameter(str, "field");
        Intrinsics.checkNotNullParameter(str2, "type");
        Intrinsics.checkNotNullParameter(list, "topTerms");
        this.field = str;
        this.type = str2;
        this.totalTerms = i;
        this.selected = z;
        this.topTerms = list;
        this.name = str3;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ BffFacet(String str, String str2, int i, boolean z, List list, String str3, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, i, z, list, (i2 & 32) != 0 ? null : str3);
    }
}
