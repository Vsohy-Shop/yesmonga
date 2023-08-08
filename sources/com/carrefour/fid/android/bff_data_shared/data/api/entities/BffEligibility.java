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
import kotlinx.serialization.internal.C12278i;
import kotlinx.serialization.internal.C12295n1;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0005\b\b\u0018\u0000 &2\u00020\u0001:\u0002'&B\u001f\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b \u0010!B3\b\u0017\u0012\u0006\u0010\"\u001a\u00020\u0014\u0012\n\b\u0001\u0010\u000e\u001a\u0004\u0018\u00010\t\u0012\n\b\u0001\u0010\u000f\u001a\u0004\u0018\u00010\f\u0012\b\u0010$\u001a\u0004\u0018\u00010#¢\u0006\u0004\b \u0010%J!\u0010\b\u001a\u00020\u00072\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005HÇ\u0001J\u0012\u0010\n\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u000b\u0010\r\u001a\u0004\u0018\u00010\fHÆ\u0003J(\u0010\u0010\u001a\u00020\u00002\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\fHÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\t\u0010\u0013\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0014HÖ\u0001J\u0013\u0010\u0017\u001a\u00020\t2\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\"\u0010\u000e\u001a\u0004\u0018\u00010\t8\u0006X\u0004¢\u0006\u0012\n\u0004\b\u000e\u0010\u0018\u0012\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u0019\u0010\u000bR\"\u0010\u000f\u001a\u0004\u0018\u00010\f8\u0006X\u0004¢\u0006\u0012\n\u0004\b\u000f\u0010\u001c\u0012\u0004\b\u001f\u0010\u001b\u001a\u0004\b\u001d\u0010\u001e¨\u0006("}, mo22516d2 = {"Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/BffEligibility;", "", "self", "Lkotlinx/serialization/encoding/d;", "output", "Lkotlinx/serialization/descriptors/f;", "serialDesc", "Lkotlin/d2;", "write$Self", "", "component1", "()Ljava/lang/Boolean;", "Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/BffFallback;", "component2", "eligibility", "fallback", "copy", "(Ljava/lang/Boolean;Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/BffFallback;)Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/BffEligibility;", "", "toString", "", "hashCode", "other", "equals", "Ljava/lang/Boolean;", "getEligibility", "getEligibility$annotations", "()V", "Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/BffFallback;", "getFallback", "()Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/BffFallback;", "getFallback$annotations", "<init>", "(Ljava/lang/Boolean;Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/BffFallback;)V", "seen1", "Lkotlinx/serialization/internal/n1;", "serializationConstructorMarker", "(ILjava/lang/Boolean;Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/BffFallback;Lkotlinx/serialization/internal/n1;)V", "Companion", "$serializer", "bff-data-shared_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
@C12439o
public final class BffEligibility {
    @C12579k
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    @C12580l
    private final Boolean eligibility;
    @C12580l
    private final BffFallback fallback;

    @C11076d0(mo22515d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¨\u0006\u0007"}, mo22516d2 = {"Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/BffEligibility$Companion;", "", "Lkotlinx/serialization/g;", "Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/BffEligibility;", "serializer", "<init>", "()V", "bff-data-shared_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @C12579k
        public final C12248g<BffEligibility> serializer() {
            return BffEligibility$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public BffEligibility() {
        this((Boolean) null, (BffFallback) null, 3, (DefaultConstructorMarker) null);
    }

    public static /* synthetic */ BffEligibility copy$default(BffEligibility bffEligibility, Boolean bool, BffFallback bffFallback, int i, Object obj) {
        if ((i & 1) != 0) {
            bool = bffEligibility.eligibility;
        }
        if ((i & 2) != 0) {
            bffFallback = bffEligibility.fallback;
        }
        return bffEligibility.copy(bool, bffFallback);
    }

    @C12438n("eligibility")
    public static /* synthetic */ void getEligibility$annotations() {
    }

    @C12438n("fallback")
    public static /* synthetic */ void getFallback$annotations() {
    }

    @C11384m
    public static final /* synthetic */ void write$Self(BffEligibility bffEligibility, C12239d dVar, C12217f fVar) {
        boolean z = false;
        if (dVar.mo24897A(fVar, 0) || bffEligibility.eligibility != null) {
            dVar.mo24912i(fVar, 0, C12278i.f30070a, bffEligibility.eligibility);
        }
        if (dVar.mo24897A(fVar, 1) || bffEligibility.fallback != null) {
            z = true;
        }
        if (z) {
            dVar.mo24912i(fVar, 1, BffFallback$$serializer.INSTANCE, bffEligibility.fallback);
        }
    }

    @C12580l
    public final Boolean component1() {
        return this.eligibility;
    }

    @C12580l
    public final BffFallback component2() {
        return this.fallback;
    }

    @C12579k
    public final BffEligibility copy(@C12580l Boolean bool, @C12580l BffFallback bffFallback) {
        return new BffEligibility(bool, bffFallback);
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BffEligibility)) {
            return false;
        }
        BffEligibility bffEligibility = (BffEligibility) obj;
        return Intrinsics.areEqual((Object) this.eligibility, (Object) bffEligibility.eligibility) && Intrinsics.areEqual((Object) this.fallback, (Object) bffEligibility.fallback);
    }

    @C12580l
    public final Boolean getEligibility() {
        return this.eligibility;
    }

    @C12580l
    public final BffFallback getFallback() {
        return this.fallback;
    }

    public int hashCode() {
        Boolean bool = this.eligibility;
        int i = 0;
        int hashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        BffFallback bffFallback = this.fallback;
        if (bffFallback != null) {
            i = bffFallback.hashCode();
        }
        return hashCode + i;
    }

    @C12579k
    public String toString() {
        Boolean bool = this.eligibility;
        BffFallback bffFallback = this.fallback;
        return "BffEligibility(eligibility=" + bool + ", fallback=" + bffFallback + ")";
    }

    @C11395k(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @C11587t0(expression = "", imports = {}))
    public /* synthetic */ BffEligibility(int i, @C12438n("eligibility") Boolean bool, @C12438n("fallback") BffFallback bffFallback, C12295n1 n1Var) {
        if ((i & 0) != 0) {
            C12261c1.m49256b(i, 0, BffEligibility$$serializer.INSTANCE.getDescriptor());
        }
        if ((i & 1) == 0) {
            this.eligibility = null;
        } else {
            this.eligibility = bool;
        }
        if ((i & 2) == 0) {
            this.fallback = null;
        } else {
            this.fallback = bffFallback;
        }
    }

    public BffEligibility(@C12580l Boolean bool, @C12580l BffFallback bffFallback) {
        this.eligibility = bool;
        this.fallback = bffFallback;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ BffEligibility(Boolean bool, BffFallback bffFallback, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : bool, (i & 2) != 0 ? null : bffFallback);
    }
}
