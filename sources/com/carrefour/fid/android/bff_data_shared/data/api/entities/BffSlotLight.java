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
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0005\b\b\u0018\u0000 &2\u00020\u0001:\u0002'&B+\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b \u0010!B?\b\u0017\u0012\u0006\u0010\"\u001a\u00020\u0012\u0012\n\b\u0001\u0010\r\u001a\u0004\u0018\u00010\t\u0012\n\b\u0001\u0010\u000e\u001a\u0004\u0018\u00010\t\u0012\n\b\u0001\u0010\u000f\u001a\u0004\u0018\u00010\t\u0012\b\u0010$\u001a\u0004\u0018\u00010#¢\u0006\u0004\b \u0010%J!\u0010\b\u001a\u00020\u00072\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005HÇ\u0001J\u000b\u0010\n\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010\f\u001a\u0004\u0018\u00010\tHÆ\u0003J-\u0010\u0010\u001a\u00020\u00002\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\tHÆ\u0001J\t\u0010\u0011\u001a\u00020\tHÖ\u0001J\t\u0010\u0013\u001a\u00020\u0012HÖ\u0001J\u0013\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\"\u0010\r\u001a\u0004\u0018\u00010\t8\u0006X\u0004¢\u0006\u0012\n\u0004\b\r\u0010\u0017\u0012\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u0018\u0010\u0019R\"\u0010\u000e\u001a\u0004\u0018\u00010\t8\u0006X\u0004¢\u0006\u0012\n\u0004\b\u000e\u0010\u0017\u0012\u0004\b\u001d\u0010\u001b\u001a\u0004\b\u001c\u0010\u0019R\"\u0010\u000f\u001a\u0004\u0018\u00010\t8\u0006X\u0004¢\u0006\u0012\n\u0004\b\u000f\u0010\u0017\u0012\u0004\b\u001f\u0010\u001b\u001a\u0004\b\u001e\u0010\u0019¨\u0006("}, mo22516d2 = {"Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/BffSlotLight;", "", "self", "Lkotlinx/serialization/encoding/d;", "output", "Lkotlinx/serialization/descriptors/f;", "serialDesc", "Lkotlin/d2;", "write$Self", "", "component1", "component2", "component3", "dateBegin", "dateEnd", "id", "copy", "toString", "", "hashCode", "other", "", "equals", "Ljava/lang/String;", "getDateBegin", "()Ljava/lang/String;", "getDateBegin$annotations", "()V", "getDateEnd", "getDateEnd$annotations", "getId", "getId$annotations", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "seen1", "Lkotlinx/serialization/internal/n1;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/n1;)V", "Companion", "$serializer", "bff-data-shared_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
@C12439o
public final class BffSlotLight {
    @C12579k
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    @C12580l
    private final String dateBegin;
    @C12580l
    private final String dateEnd;
    @C12580l

    /* renamed from: id */
    private final String f100680id;

    @C11076d0(mo22515d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¨\u0006\u0007"}, mo22516d2 = {"Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/BffSlotLight$Companion;", "", "Lkotlinx/serialization/g;", "Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/BffSlotLight;", "serializer", "<init>", "()V", "bff-data-shared_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @C12579k
        public final C12248g<BffSlotLight> serializer() {
            return BffSlotLight$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public BffSlotLight() {
        this((String) null, (String) null, (String) null, 7, (DefaultConstructorMarker) null);
    }

    public static /* synthetic */ BffSlotLight copy$default(BffSlotLight bffSlotLight, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = bffSlotLight.dateBegin;
        }
        if ((i & 2) != 0) {
            str2 = bffSlotLight.dateEnd;
        }
        if ((i & 4) != 0) {
            str3 = bffSlotLight.f100680id;
        }
        return bffSlotLight.copy(str, str2, str3);
    }

    @C12438n("date_begin")
    public static /* synthetic */ void getDateBegin$annotations() {
    }

    @C12438n("date_end")
    public static /* synthetic */ void getDateEnd$annotations() {
    }

    @C12438n("id")
    public static /* synthetic */ void getId$annotations() {
    }

    @C11384m
    public static final /* synthetic */ void write$Self(BffSlotLight bffSlotLight, C12239d dVar, C12217f fVar) {
        boolean z = false;
        if (dVar.mo24897A(fVar, 0) || bffSlotLight.dateBegin != null) {
            dVar.mo24912i(fVar, 0, C12310s1.f30117a, bffSlotLight.dateBegin);
        }
        if (dVar.mo24897A(fVar, 1) || bffSlotLight.dateEnd != null) {
            dVar.mo24912i(fVar, 1, C12310s1.f30117a, bffSlotLight.dateEnd);
        }
        if (dVar.mo24897A(fVar, 2) || bffSlotLight.f100680id != null) {
            z = true;
        }
        if (z) {
            dVar.mo24912i(fVar, 2, C12310s1.f30117a, bffSlotLight.f100680id);
        }
    }

    @C12580l
    public final String component1() {
        return this.dateBegin;
    }

    @C12580l
    public final String component2() {
        return this.dateEnd;
    }

    @C12580l
    public final String component3() {
        return this.f100680id;
    }

    @C12579k
    public final BffSlotLight copy(@C12580l String str, @C12580l String str2, @C12580l String str3) {
        return new BffSlotLight(str, str2, str3);
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BffSlotLight)) {
            return false;
        }
        BffSlotLight bffSlotLight = (BffSlotLight) obj;
        return Intrinsics.areEqual((Object) this.dateBegin, (Object) bffSlotLight.dateBegin) && Intrinsics.areEqual((Object) this.dateEnd, (Object) bffSlotLight.dateEnd) && Intrinsics.areEqual((Object) this.f100680id, (Object) bffSlotLight.f100680id);
    }

    @C12580l
    public final String getDateBegin() {
        return this.dateBegin;
    }

    @C12580l
    public final String getDateEnd() {
        return this.dateEnd;
    }

    @C12580l
    public final String getId() {
        return this.f100680id;
    }

    public int hashCode() {
        String str = this.dateBegin;
        int i = 0;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.dateEnd;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f100680id;
        if (str3 != null) {
            i = str3.hashCode();
        }
        return hashCode2 + i;
    }

    @C12579k
    public String toString() {
        String str = this.dateBegin;
        String str2 = this.dateEnd;
        String str3 = this.f100680id;
        return "BffSlotLight(dateBegin=" + str + ", dateEnd=" + str2 + ", id=" + str3 + ")";
    }

    @C11395k(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @C11587t0(expression = "", imports = {}))
    public /* synthetic */ BffSlotLight(int i, @C12438n("date_begin") String str, @C12438n("date_end") String str2, @C12438n("id") String str3, C12295n1 n1Var) {
        if ((i & 0) != 0) {
            C12261c1.m49256b(i, 0, BffSlotLight$$serializer.INSTANCE.getDescriptor());
        }
        if ((i & 1) == 0) {
            this.dateBegin = null;
        } else {
            this.dateBegin = str;
        }
        if ((i & 2) == 0) {
            this.dateEnd = null;
        } else {
            this.dateEnd = str2;
        }
        if ((i & 4) == 0) {
            this.f100680id = null;
        } else {
            this.f100680id = str3;
        }
    }

    public BffSlotLight(@C12580l String str, @C12580l String str2, @C12580l String str3) {
        this.dateBegin = str;
        this.dateEnd = str2;
        this.f100680id = str3;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ BffSlotLight(String str, String str2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3);
    }
}
