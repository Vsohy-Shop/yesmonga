package com.carrefour.fid.android.bff_data_shared.data.api.entities;

import kotlin.C11076d0;
import kotlin.C11395k;
import kotlin.C11587t0;
import kotlin.DeprecationLevel;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.C12248g;
import kotlinx.serialization.C12439o;
import kotlinx.serialization.internal.C12261c1;
import kotlinx.serialization.internal.C12295n1;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\b\b\u0018\u0000 \u001b2\u00020\u0001:\u0002\u001c\u001bB\u000f\u0012\u0006\u0010\u0002\u001a\u00020\t¢\u0006\u0004\b\u0015\u0010\u0016B%\b\u0017\u0012\u0006\u0010\u0017\u001a\u00020\r\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018¢\u0006\u0004\b\u0015\u0010\u001aJ!\u0010\b\u001a\u00020\u00072\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005HÇ\u0001J\t\u0010\n\u001a\u00020\tHÆ\u0003J\u0013\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\tHÆ\u0001J\t\u0010\f\u001a\u00020\tHÖ\u0001J\t\u0010\u000e\u001a\u00020\rHÖ\u0001J\u0013\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\u0002\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u0002\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u001d"}, mo22516d2 = {"Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/Metadata;", "", "self", "Lkotlinx/serialization/encoding/d;", "output", "Lkotlinx/serialization/descriptors/f;", "serialDesc", "Lkotlin/d2;", "write$Self", "", "component1", "copy", "toString", "", "hashCode", "other", "", "equals", "Ljava/lang/String;", "getSelf", "()Ljava/lang/String;", "<init>", "(Ljava/lang/String;)V", "seen1", "Lkotlinx/serialization/internal/n1;", "serializationConstructorMarker", "(ILjava/lang/String;Lkotlinx/serialization/internal/n1;)V", "Companion", "$serializer", "bff-data-shared_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
@C12439o
public final class Metadata {
    @C12579k
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    @C12579k
    private final String self;

    @C11076d0(mo22515d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¨\u0006\u0007"}, mo22516d2 = {"Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/Metadata$Companion;", "", "Lkotlinx/serialization/g;", "Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/Metadata;", "serializer", "<init>", "()V", "bff-data-shared_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @C12579k
        public final C12248g<Metadata> serializer() {
            return Metadata$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    @C11395k(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @C11587t0(expression = "", imports = {}))
    public /* synthetic */ Metadata(int i, String str, C12295n1 n1Var) {
        if (1 != (i & 1)) {
            C12261c1.m49256b(i, 1, Metadata$$serializer.INSTANCE.getDescriptor());
        }
        this.self = str;
    }

    public static /* synthetic */ Metadata copy$default(Metadata metadata, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = metadata.self;
        }
        return metadata.copy(str);
    }

    @C12579k
    public final String component1() {
        return this.self;
    }

    @C12579k
    public final Metadata copy(@C12579k String str) {
        Intrinsics.checkNotNullParameter(str, "self");
        return new Metadata(str);
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof Metadata) && Intrinsics.areEqual((Object) this.self, (Object) ((Metadata) obj).self);
    }

    @C12579k
    public final String getSelf() {
        return this.self;
    }

    public int hashCode() {
        return this.self.hashCode();
    }

    @C12579k
    public String toString() {
        String str = this.self;
        return "Metadata(self=" + str + ")";
    }

    public Metadata(@C12579k String str) {
        Intrinsics.checkNotNullParameter(str, "self");
        this.self = str;
    }
}
