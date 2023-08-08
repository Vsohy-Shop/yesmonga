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

@C11076d0(mo22515d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0005\b\b\u0018\u0000 \"2\u00020\u0001:\u0002#\"B\u001f\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u001c\u0010\u001dB3\b\u0017\u0012\u0006\u0010\u001e\u001a\u00020\u0010\u0012\n\b\u0001\u0010\f\u001a\u0004\u0018\u00010\t\u0012\n\b\u0001\u0010\r\u001a\u0004\u0018\u00010\t\u0012\b\u0010 \u001a\u0004\u0018\u00010\u001f¢\u0006\u0004\b\u001c\u0010!J!\u0010\b\u001a\u00020\u00072\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005HÇ\u0001J\u000b\u0010\n\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\tHÆ\u0003J!\u0010\u000e\u001a\u00020\u00002\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\tHÆ\u0001J\t\u0010\u000f\u001a\u00020\tHÖ\u0001J\t\u0010\u0011\u001a\u00020\u0010HÖ\u0001J\u0013\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\"\u0010\f\u001a\u0004\u0018\u00010\t8\u0006X\u0004¢\u0006\u0012\n\u0004\b\f\u0010\u0015\u0012\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0016\u0010\u0017R\"\u0010\r\u001a\u0004\u0018\u00010\t8\u0006X\u0004¢\u0006\u0012\n\u0004\b\r\u0010\u0015\u0012\u0004\b\u001b\u0010\u0019\u001a\u0004\b\u001a\u0010\u0017¨\u0006$"}, mo22516d2 = {"Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/BffTimeRange;", "", "self", "Lkotlinx/serialization/encoding/d;", "output", "Lkotlinx/serialization/descriptors/f;", "serialDesc", "Lkotlin/d2;", "write$Self", "", "component1", "component2", "begTime", "endTime", "copy", "toString", "", "hashCode", "other", "", "equals", "Ljava/lang/String;", "getBegTime", "()Ljava/lang/String;", "getBegTime$annotations", "()V", "getEndTime", "getEndTime$annotations", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "seen1", "Lkotlinx/serialization/internal/n1;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/n1;)V", "Companion", "$serializer", "bff-data-shared_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
@C12439o
public final class BffTimeRange {
    @C12579k
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    @C12580l
    private final String begTime;
    @C12580l
    private final String endTime;

    @C11076d0(mo22515d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¨\u0006\u0007"}, mo22516d2 = {"Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/BffTimeRange$Companion;", "", "Lkotlinx/serialization/g;", "Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/BffTimeRange;", "serializer", "<init>", "()V", "bff-data-shared_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @C12579k
        public final C12248g<BffTimeRange> serializer() {
            return BffTimeRange$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public BffTimeRange() {
        this((String) null, (String) null, 3, (DefaultConstructorMarker) null);
    }

    public static /* synthetic */ BffTimeRange copy$default(BffTimeRange bffTimeRange, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = bffTimeRange.begTime;
        }
        if ((i & 2) != 0) {
            str2 = bffTimeRange.endTime;
        }
        return bffTimeRange.copy(str, str2);
    }

    @C12438n("beg_time")
    public static /* synthetic */ void getBegTime$annotations() {
    }

    @C12438n("end_time")
    public static /* synthetic */ void getEndTime$annotations() {
    }

    @C11384m
    public static final /* synthetic */ void write$Self(BffTimeRange bffTimeRange, C12239d dVar, C12217f fVar) {
        boolean z = false;
        if (dVar.mo24897A(fVar, 0) || bffTimeRange.begTime != null) {
            dVar.mo24912i(fVar, 0, C12310s1.f30117a, bffTimeRange.begTime);
        }
        if (dVar.mo24897A(fVar, 1) || bffTimeRange.endTime != null) {
            z = true;
        }
        if (z) {
            dVar.mo24912i(fVar, 1, C12310s1.f30117a, bffTimeRange.endTime);
        }
    }

    @C12580l
    public final String component1() {
        return this.begTime;
    }

    @C12580l
    public final String component2() {
        return this.endTime;
    }

    @C12579k
    public final BffTimeRange copy(@C12580l String str, @C12580l String str2) {
        return new BffTimeRange(str, str2);
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BffTimeRange)) {
            return false;
        }
        BffTimeRange bffTimeRange = (BffTimeRange) obj;
        return Intrinsics.areEqual((Object) this.begTime, (Object) bffTimeRange.begTime) && Intrinsics.areEqual((Object) this.endTime, (Object) bffTimeRange.endTime);
    }

    @C12580l
    public final String getBegTime() {
        return this.begTime;
    }

    @C12580l
    public final String getEndTime() {
        return this.endTime;
    }

    public int hashCode() {
        String str = this.begTime;
        int i = 0;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.endTime;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return hashCode + i;
    }

    @C12579k
    public String toString() {
        String str = this.begTime;
        String str2 = this.endTime;
        return "BffTimeRange(begTime=" + str + ", endTime=" + str2 + ")";
    }

    @C11395k(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @C11587t0(expression = "", imports = {}))
    public /* synthetic */ BffTimeRange(int i, @C12438n("beg_time") String str, @C12438n("end_time") String str2, C12295n1 n1Var) {
        if ((i & 0) != 0) {
            C12261c1.m49256b(i, 0, BffTimeRange$$serializer.INSTANCE.getDescriptor());
        }
        if ((i & 1) == 0) {
            this.begTime = null;
        } else {
            this.begTime = str;
        }
        if ((i & 2) == 0) {
            this.endTime = null;
        } else {
            this.endTime = str2;
        }
    }

    public BffTimeRange(@C12580l String str, @C12580l String str2) {
        this.begTime = str;
        this.endTime = str2;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ BffTimeRange(String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2);
    }
}
