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

@C11076d0(mo22515d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\b\b\u0018\u0000 \u001e2\u00020\u0001:\u0002\u001f\u001eB\u0013\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u0018\u0010\u0019B'\b\u0017\u0012\u0006\u0010\u001a\u001a\u00020\u000e\u0012\n\b\u0001\u0010\u000b\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u001c\u001a\u0004\u0018\u00010\u001b¢\u0006\u0004\b\u0018\u0010\u001dJ!\u0010\b\u001a\u00020\u00072\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005HÇ\u0001J\u000b\u0010\n\u001a\u0004\u0018\u00010\tHÆ\u0003J\u0015\u0010\f\u001a\u00020\u00002\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\tHÆ\u0001J\t\u0010\r\u001a\u00020\tHÖ\u0001J\t\u0010\u000f\u001a\u00020\u000eHÖ\u0001J\u0013\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\"\u0010\u000b\u001a\u0004\u0018\u00010\t8\u0006X\u0004¢\u0006\u0012\n\u0004\b\u000b\u0010\u0013\u0012\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0014\u0010\u0015¨\u0006 "}, mo22516d2 = {"Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/BffB23JsCodeDtoAllOf;", "", "self", "Lkotlinx/serialization/encoding/d;", "output", "Lkotlinx/serialization/descriptors/f;", "serialDesc", "Lkotlin/d2;", "write$Self", "", "component1", "code", "copy", "toString", "", "hashCode", "other", "", "equals", "Ljava/lang/String;", "getCode", "()Ljava/lang/String;", "getCode$annotations", "()V", "<init>", "(Ljava/lang/String;)V", "seen1", "Lkotlinx/serialization/internal/n1;", "serializationConstructorMarker", "(ILjava/lang/String;Lkotlinx/serialization/internal/n1;)V", "Companion", "$serializer", "bff-data-shared_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
@C12439o
public final class BffB23JsCodeDtoAllOf {
    @C12579k
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    @C12580l
    private final String code;

    @C11076d0(mo22515d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¨\u0006\u0007"}, mo22516d2 = {"Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/BffB23JsCodeDtoAllOf$Companion;", "", "Lkotlinx/serialization/g;", "Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/BffB23JsCodeDtoAllOf;", "serializer", "<init>", "()V", "bff-data-shared_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @C12579k
        public final C12248g<BffB23JsCodeDtoAllOf> serializer() {
            return BffB23JsCodeDtoAllOf$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public BffB23JsCodeDtoAllOf() {
        this((String) null, 1, (DefaultConstructorMarker) null);
    }

    public static /* synthetic */ BffB23JsCodeDtoAllOf copy$default(BffB23JsCodeDtoAllOf bffB23JsCodeDtoAllOf, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = bffB23JsCodeDtoAllOf.code;
        }
        return bffB23JsCodeDtoAllOf.copy(str);
    }

    @C12438n("code")
    public static /* synthetic */ void getCode$annotations() {
    }

    @C11384m
    public static final /* synthetic */ void write$Self(BffB23JsCodeDtoAllOf bffB23JsCodeDtoAllOf, C12239d dVar, C12217f fVar) {
        boolean z = true;
        if (!dVar.mo24897A(fVar, 0) && bffB23JsCodeDtoAllOf.code == null) {
            z = false;
        }
        if (z) {
            dVar.mo24912i(fVar, 0, C12310s1.f30117a, bffB23JsCodeDtoAllOf.code);
        }
    }

    @C12580l
    public final String component1() {
        return this.code;
    }

    @C12579k
    public final BffB23JsCodeDtoAllOf copy(@C12580l String str) {
        return new BffB23JsCodeDtoAllOf(str);
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof BffB23JsCodeDtoAllOf) && Intrinsics.areEqual((Object) this.code, (Object) ((BffB23JsCodeDtoAllOf) obj).code);
    }

    @C12580l
    public final String getCode() {
        return this.code;
    }

    public int hashCode() {
        String str = this.code;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    @C12579k
    public String toString() {
        String str = this.code;
        return "BffB23JsCodeDtoAllOf(code=" + str + ")";
    }

    @C11395k(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @C11587t0(expression = "", imports = {}))
    public /* synthetic */ BffB23JsCodeDtoAllOf(int i, @C12438n("code") String str, C12295n1 n1Var) {
        if ((i & 0) != 0) {
            C12261c1.m49256b(i, 0, BffB23JsCodeDtoAllOf$$serializer.INSTANCE.getDescriptor());
        }
        if ((i & 1) == 0) {
            this.code = null;
        } else {
            this.code = str;
        }
    }

    public BffB23JsCodeDtoAllOf(@C12580l String str) {
        this.code = str;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ BffB23JsCodeDtoAllOf(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str);
    }
}
