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

@C11076d0(mo22515d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0005\b\b\u0018\u0000 %2\u00020\u0001:\u0002&%B\u001f\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u001f\u0010 B3\b\u0017\u0012\u0006\u0010!\u001a\u00020\u0011\u0012\n\b\u0001\u0010\r\u001a\u0004\u0018\u00010\t\u0012\n\b\u0001\u0010\u000e\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010#\u001a\u0004\u0018\u00010\"¢\u0006\u0004\b\u001f\u0010$J!\u0010\b\u001a\u00020\u00072\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005HÇ\u0001J\u000b\u0010\n\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010\f\u001a\u0004\u0018\u00010\u000bHÆ\u0003J!\u0010\u000f\u001a\u00020\u00002\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000bHÆ\u0001J\t\u0010\u0010\u001a\u00020\u000bHÖ\u0001J\t\u0010\u0012\u001a\u00020\u0011HÖ\u0001J\u0013\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\"\u0010\r\u001a\u0004\u0018\u00010\t8\u0006X\u0004¢\u0006\u0012\n\u0004\b\r\u0010\u0016\u0012\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u0017\u0010\u0018R\"\u0010\u000e\u001a\u0004\u0018\u00010\u000b8\u0006X\u0004¢\u0006\u0012\n\u0004\b\u000e\u0010\u001b\u0012\u0004\b\u001e\u0010\u001a\u001a\u0004\b\u001c\u0010\u001d¨\u0006'"}, mo22516d2 = {"Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/BffConsentOptIn;", "", "self", "Lkotlinx/serialization/encoding/d;", "output", "Lkotlinx/serialization/descriptors/f;", "serialDesc", "Lkotlin/d2;", "write$Self", "Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/BffConsentOptInName;", "component1", "", "component2", "name", "choice", "copy", "toString", "", "hashCode", "other", "", "equals", "Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/BffConsentOptInName;", "getName", "()Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/BffConsentOptInName;", "getName$annotations", "()V", "Ljava/lang/String;", "getChoice", "()Ljava/lang/String;", "getChoice$annotations", "<init>", "(Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/BffConsentOptInName;Ljava/lang/String;)V", "seen1", "Lkotlinx/serialization/internal/n1;", "serializationConstructorMarker", "(ILcom/carrefour/fid/android/bff_data_shared/data/api/entities/BffConsentOptInName;Ljava/lang/String;Lkotlinx/serialization/internal/n1;)V", "Companion", "$serializer", "bff-data-shared_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
@C12439o
public final class BffConsentOptIn {
    @C12579k
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    @C12580l
    private final String choice;
    @C12580l
    private final BffConsentOptInName name;

    @C11076d0(mo22515d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¨\u0006\u0007"}, mo22516d2 = {"Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/BffConsentOptIn$Companion;", "", "Lkotlinx/serialization/g;", "Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/BffConsentOptIn;", "serializer", "<init>", "()V", "bff-data-shared_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @C12579k
        public final C12248g<BffConsentOptIn> serializer() {
            return BffConsentOptIn$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public BffConsentOptIn() {
        this((BffConsentOptInName) null, (String) null, 3, (DefaultConstructorMarker) null);
    }

    public static /* synthetic */ BffConsentOptIn copy$default(BffConsentOptIn bffConsentOptIn, BffConsentOptInName bffConsentOptInName, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            bffConsentOptInName = bffConsentOptIn.name;
        }
        if ((i & 2) != 0) {
            str = bffConsentOptIn.choice;
        }
        return bffConsentOptIn.copy(bffConsentOptInName, str);
    }

    @C12438n("choice")
    public static /* synthetic */ void getChoice$annotations() {
    }

    @C12438n("name")
    public static /* synthetic */ void getName$annotations() {
    }

    @C11384m
    public static final /* synthetic */ void write$Self(BffConsentOptIn bffConsentOptIn, C12239d dVar, C12217f fVar) {
        boolean z = false;
        if (dVar.mo24897A(fVar, 0) || bffConsentOptIn.name != null) {
            dVar.mo24912i(fVar, 0, BffConsentOptInName$$serializer.INSTANCE, bffConsentOptIn.name);
        }
        if (dVar.mo24897A(fVar, 1) || bffConsentOptIn.choice != null) {
            z = true;
        }
        if (z) {
            dVar.mo24912i(fVar, 1, C12310s1.f30117a, bffConsentOptIn.choice);
        }
    }

    @C12580l
    public final BffConsentOptInName component1() {
        return this.name;
    }

    @C12580l
    public final String component2() {
        return this.choice;
    }

    @C12579k
    public final BffConsentOptIn copy(@C12580l BffConsentOptInName bffConsentOptInName, @C12580l String str) {
        return new BffConsentOptIn(bffConsentOptInName, str);
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BffConsentOptIn)) {
            return false;
        }
        BffConsentOptIn bffConsentOptIn = (BffConsentOptIn) obj;
        return this.name == bffConsentOptIn.name && Intrinsics.areEqual((Object) this.choice, (Object) bffConsentOptIn.choice);
    }

    @C12580l
    public final String getChoice() {
        return this.choice;
    }

    @C12580l
    public final BffConsentOptInName getName() {
        return this.name;
    }

    public int hashCode() {
        BffConsentOptInName bffConsentOptInName = this.name;
        int i = 0;
        int hashCode = (bffConsentOptInName == null ? 0 : bffConsentOptInName.hashCode()) * 31;
        String str = this.choice;
        if (str != null) {
            i = str.hashCode();
        }
        return hashCode + i;
    }

    @C12579k
    public String toString() {
        BffConsentOptInName bffConsentOptInName = this.name;
        String str = this.choice;
        return "BffConsentOptIn(name=" + bffConsentOptInName + ", choice=" + str + ")";
    }

    @C11395k(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @C11587t0(expression = "", imports = {}))
    public /* synthetic */ BffConsentOptIn(int i, @C12438n("name") BffConsentOptInName bffConsentOptInName, @C12438n("choice") String str, C12295n1 n1Var) {
        if ((i & 0) != 0) {
            C12261c1.m49256b(i, 0, BffConsentOptIn$$serializer.INSTANCE.getDescriptor());
        }
        if ((i & 1) == 0) {
            this.name = null;
        } else {
            this.name = bffConsentOptInName;
        }
        if ((i & 2) == 0) {
            this.choice = null;
        } else {
            this.choice = str;
        }
    }

    public BffConsentOptIn(@C12580l BffConsentOptInName bffConsentOptInName, @C12580l String str) {
        this.name = bffConsentOptInName;
        this.choice = str;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ BffConsentOptIn(BffConsentOptInName bffConsentOptInName, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : bffConsentOptInName, (i & 2) != 0 ? null : str);
    }
}
