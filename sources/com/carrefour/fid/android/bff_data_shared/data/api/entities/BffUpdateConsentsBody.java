package com.carrefour.fid.android.bff_data_shared.data.api.entities;

import java.util.List;
import kotlin.C11076d0;
import kotlin.C11395k;
import kotlin.C11587t0;
import kotlin.DeprecationLevel;
import kotlin.jvm.C11287e;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.C12248g;
import kotlinx.serialization.C12438n;
import kotlinx.serialization.C12439o;
import kotlinx.serialization.internal.C12261c1;
import kotlinx.serialization.internal.C12269f;
import kotlinx.serialization.internal.C12295n1;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\b\b\u0018\u0000  2\u00020\u0001:\u0002! B\u0015\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\n0\t¢\u0006\u0004\b\u001a\u0010\u001bB-\b\u0017\u0012\u0006\u0010\u001c\u001a\u00020\u0010\u0012\u0010\b\u0001\u0010\f\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t\u0012\b\u0010\u001e\u001a\u0004\u0018\u00010\u001d¢\u0006\u0004\b\u001a\u0010\u001fJ!\u0010\b\u001a\u00020\u00072\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005HÇ\u0001J\u000f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\tHÆ\u0003J\u0019\u0010\r\u001a\u00020\u00002\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\n0\tHÆ\u0001J\t\u0010\u000f\u001a\u00020\u000eHÖ\u0001J\t\u0010\u0011\u001a\u00020\u0010HÖ\u0001J\u0013\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003R&\u0010\f\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0006X\u0004¢\u0006\u0012\n\u0004\b\f\u0010\u0015\u0012\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0016\u0010\u0017¨\u0006\""}, mo22516d2 = {"Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/BffUpdateConsentsBody;", "", "self", "Lkotlinx/serialization/encoding/d;", "output", "Lkotlinx/serialization/descriptors/f;", "serialDesc", "Lkotlin/d2;", "write$Self", "", "Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/BffConsent;", "component1", "consents", "copy", "", "toString", "", "hashCode", "other", "", "equals", "Ljava/util/List;", "getConsents", "()Ljava/util/List;", "getConsents$annotations", "()V", "<init>", "(Ljava/util/List;)V", "seen1", "Lkotlinx/serialization/internal/n1;", "serializationConstructorMarker", "(ILjava/util/List;Lkotlinx/serialization/internal/n1;)V", "Companion", "$serializer", "bff-data-shared_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
@C12439o
public final class BffUpdateConsentsBody {
    /* access modifiers changed from: private */
    @C12579k
    @C11287e
    public static final C12248g<Object>[] $childSerializers = {new C12269f(BffConsent$$serializer.INSTANCE)};
    @C12579k
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    @C12579k
    private final List<BffConsent> consents;

    @C11076d0(mo22515d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¨\u0006\u0007"}, mo22516d2 = {"Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/BffUpdateConsentsBody$Companion;", "", "Lkotlinx/serialization/g;", "Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/BffUpdateConsentsBody;", "serializer", "<init>", "()V", "bff-data-shared_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @C12579k
        public final C12248g<BffUpdateConsentsBody> serializer() {
            return BffUpdateConsentsBody$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    @C11395k(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @C11587t0(expression = "", imports = {}))
    public /* synthetic */ BffUpdateConsentsBody(int i, @C12438n("consents") List list, C12295n1 n1Var) {
        if (1 != (i & 1)) {
            C12261c1.m49256b(i, 1, BffUpdateConsentsBody$$serializer.INSTANCE.getDescriptor());
        }
        this.consents = list;
    }

    public static /* synthetic */ BffUpdateConsentsBody copy$default(BffUpdateConsentsBody bffUpdateConsentsBody, List<BffConsent> list, int i, Object obj) {
        if ((i & 1) != 0) {
            list = bffUpdateConsentsBody.consents;
        }
        return bffUpdateConsentsBody.copy(list);
    }

    @C12438n("consents")
    public static /* synthetic */ void getConsents$annotations() {
    }

    @C12579k
    public final List<BffConsent> component1() {
        return this.consents;
    }

    @C12579k
    public final BffUpdateConsentsBody copy(@C12579k List<BffConsent> list) {
        Intrinsics.checkNotNullParameter(list, "consents");
        return new BffUpdateConsentsBody(list);
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof BffUpdateConsentsBody) && Intrinsics.areEqual((Object) this.consents, (Object) ((BffUpdateConsentsBody) obj).consents);
    }

    @C12579k
    public final List<BffConsent> getConsents() {
        return this.consents;
    }

    public int hashCode() {
        return this.consents.hashCode();
    }

    @C12579k
    public String toString() {
        List<BffConsent> list = this.consents;
        return "BffUpdateConsentsBody(consents=" + list + ")";
    }

    public BffUpdateConsentsBody(@C12579k List<BffConsent> list) {
        Intrinsics.checkNotNullParameter(list, "consents");
        this.consents = list;
    }
}
