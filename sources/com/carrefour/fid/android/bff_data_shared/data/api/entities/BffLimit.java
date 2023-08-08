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

@C11076d0(mo22515d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0005\b\b\u0018\u0000 -2\u00020\u0001:\u0002.-B7\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b'\u0010(BK\b\u0017\u0012\u0006\u0010)\u001a\u00020\t\u0012\n\b\u0001\u0010\u0010\u001a\u0004\u0018\u00010\t\u0012\n\b\u0001\u0010\u0011\u001a\u0004\u0018\u00010\f\u0012\n\b\u0001\u0010\u0012\u001a\u0004\u0018\u00010\f\u0012\n\b\u0001\u0010\u0013\u001a\u0004\u0018\u00010\f\u0012\b\u0010+\u001a\u0004\u0018\u00010*¢\u0006\u0004\b'\u0010,J!\u0010\b\u001a\u00020\u00072\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005HÇ\u0001J\u0012\u0010\n\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u000b\u0010\r\u001a\u0004\u0018\u00010\fHÆ\u0003J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\fHÆ\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\fHÆ\u0003J@\u0010\u0014\u001a\u00020\u00002\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\fHÆ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\t\u0010\u0016\u001a\u00020\fHÖ\u0001J\t\u0010\u0017\u001a\u00020\tHÖ\u0001J\u0013\u0010\u001a\u001a\u00020\u00192\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\"\u0010\u0010\u001a\u0004\u0018\u00010\t8\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0010\u0010\u001b\u0012\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001c\u0010\u000bR\"\u0010\u0011\u001a\u0004\u0018\u00010\f8\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0011\u0010\u001f\u0012\u0004\b\"\u0010\u001e\u001a\u0004\b \u0010!R\"\u0010\u0012\u001a\u0004\u0018\u00010\f8\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0012\u0010\u001f\u0012\u0004\b$\u0010\u001e\u001a\u0004\b#\u0010!R\"\u0010\u0013\u001a\u0004\u0018\u00010\f8\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0013\u0010\u001f\u0012\u0004\b&\u0010\u001e\u001a\u0004\b%\u0010!¨\u0006/"}, mo22516d2 = {"Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/BffLimit;", "", "self", "Lkotlinx/serialization/encoding/d;", "output", "Lkotlinx/serialization/descriptors/f;", "serialDesc", "Lkotlin/d2;", "write$Self", "", "component1", "()Ljava/lang/Integer;", "", "component2", "component3", "component4", "maxTriggered", "scope", "consumerType", "period", "copy", "(Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/BffLimit;", "toString", "hashCode", "other", "", "equals", "Ljava/lang/Integer;", "getMaxTriggered", "getMaxTriggered$annotations", "()V", "Ljava/lang/String;", "getScope", "()Ljava/lang/String;", "getScope$annotations", "getConsumerType", "getConsumerType$annotations", "getPeriod", "getPeriod$annotations", "<init>", "(Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "seen1", "Lkotlinx/serialization/internal/n1;", "serializationConstructorMarker", "(ILjava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/n1;)V", "Companion", "$serializer", "bff-data-shared_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
@C12439o
public final class BffLimit {
    @C12579k
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    @C12580l
    private final String consumerType;
    @C12580l
    private final Integer maxTriggered;
    @C12580l
    private final String period;
    @C12580l
    private final String scope;

    @C11076d0(mo22515d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¨\u0006\u0007"}, mo22516d2 = {"Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/BffLimit$Companion;", "", "Lkotlinx/serialization/g;", "Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/BffLimit;", "serializer", "<init>", "()V", "bff-data-shared_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @C12579k
        public final C12248g<BffLimit> serializer() {
            return BffLimit$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public BffLimit() {
        this((Integer) null, (String) null, (String) null, (String) null, 15, (DefaultConstructorMarker) null);
    }

    public static /* synthetic */ BffLimit copy$default(BffLimit bffLimit, Integer num, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            num = bffLimit.maxTriggered;
        }
        if ((i & 2) != 0) {
            str = bffLimit.scope;
        }
        if ((i & 4) != 0) {
            str2 = bffLimit.consumerType;
        }
        if ((i & 8) != 0) {
            str3 = bffLimit.period;
        }
        return bffLimit.copy(num, str, str2, str3);
    }

    @C12438n("consumer_type")
    public static /* synthetic */ void getConsumerType$annotations() {
    }

    @C12438n("max_triggered")
    public static /* synthetic */ void getMaxTriggered$annotations() {
    }

    @C12438n("period")
    public static /* synthetic */ void getPeriod$annotations() {
    }

    @C12438n("scope")
    public static /* synthetic */ void getScope$annotations() {
    }

    @C11384m
    public static final /* synthetic */ void write$Self(BffLimit bffLimit, C12239d dVar, C12217f fVar) {
        boolean z = false;
        if (dVar.mo24897A(fVar, 0) || bffLimit.maxTriggered != null) {
            dVar.mo24912i(fVar, 0, C12276h0.f30067a, bffLimit.maxTriggered);
        }
        if (dVar.mo24897A(fVar, 1) || bffLimit.scope != null) {
            dVar.mo24912i(fVar, 1, C12310s1.f30117a, bffLimit.scope);
        }
        if (dVar.mo24897A(fVar, 2) || bffLimit.consumerType != null) {
            dVar.mo24912i(fVar, 2, C12310s1.f30117a, bffLimit.consumerType);
        }
        if (dVar.mo24897A(fVar, 3) || bffLimit.period != null) {
            z = true;
        }
        if (z) {
            dVar.mo24912i(fVar, 3, C12310s1.f30117a, bffLimit.period);
        }
    }

    @C12580l
    public final Integer component1() {
        return this.maxTriggered;
    }

    @C12580l
    public final String component2() {
        return this.scope;
    }

    @C12580l
    public final String component3() {
        return this.consumerType;
    }

    @C12580l
    public final String component4() {
        return this.period;
    }

    @C12579k
    public final BffLimit copy(@C12580l Integer num, @C12580l String str, @C12580l String str2, @C12580l String str3) {
        return new BffLimit(num, str, str2, str3);
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BffLimit)) {
            return false;
        }
        BffLimit bffLimit = (BffLimit) obj;
        return Intrinsics.areEqual((Object) this.maxTriggered, (Object) bffLimit.maxTriggered) && Intrinsics.areEqual((Object) this.scope, (Object) bffLimit.scope) && Intrinsics.areEqual((Object) this.consumerType, (Object) bffLimit.consumerType) && Intrinsics.areEqual((Object) this.period, (Object) bffLimit.period);
    }

    @C12580l
    public final String getConsumerType() {
        return this.consumerType;
    }

    @C12580l
    public final Integer getMaxTriggered() {
        return this.maxTriggered;
    }

    @C12580l
    public final String getPeriod() {
        return this.period;
    }

    @C12580l
    public final String getScope() {
        return this.scope;
    }

    public int hashCode() {
        Integer num = this.maxTriggered;
        int i = 0;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.scope;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.consumerType;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.period;
        if (str3 != null) {
            i = str3.hashCode();
        }
        return hashCode3 + i;
    }

    @C12579k
    public String toString() {
        Integer num = this.maxTriggered;
        String str = this.scope;
        String str2 = this.consumerType;
        String str3 = this.period;
        return "BffLimit(maxTriggered=" + num + ", scope=" + str + ", consumerType=" + str2 + ", period=" + str3 + ")";
    }

    @C11395k(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @C11587t0(expression = "", imports = {}))
    public /* synthetic */ BffLimit(int i, @C12438n("max_triggered") Integer num, @C12438n("scope") String str, @C12438n("consumer_type") String str2, @C12438n("period") String str3, C12295n1 n1Var) {
        if ((i & 0) != 0) {
            C12261c1.m49256b(i, 0, BffLimit$$serializer.INSTANCE.getDescriptor());
        }
        if ((i & 1) == 0) {
            this.maxTriggered = null;
        } else {
            this.maxTriggered = num;
        }
        if ((i & 2) == 0) {
            this.scope = null;
        } else {
            this.scope = str;
        }
        if ((i & 4) == 0) {
            this.consumerType = null;
        } else {
            this.consumerType = str2;
        }
        if ((i & 8) == 0) {
            this.period = null;
        } else {
            this.period = str3;
        }
    }

    public BffLimit(@C12580l Integer num, @C12580l String str, @C12580l String str2, @C12580l String str3) {
        this.maxTriggered = num;
        this.scope = str;
        this.consumerType = str2;
        this.period = str3;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ BffLimit(Integer num, String str, String str2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : num, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? null : str3);
    }
}
