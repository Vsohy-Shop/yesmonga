package com.carrefour.fid.android.bff_data_shared.data.api.entities;

import kotlin.C11076d0;
import kotlin.C11395k;
import kotlin.C11587t0;
import kotlin.DeprecationLevel;
import kotlin.jvm.C11384m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.C12248g;
import kotlinx.serialization.C12439o;
import kotlinx.serialization.descriptors.C12217f;
import kotlinx.serialization.encoding.C12239d;
import kotlinx.serialization.internal.C12261c1;
import kotlinx.serialization.internal.C12295n1;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0005\b\b\u0018\u0000 %2\u00020\u0001:\u0002&%B'\u0012\u0006\u0010\u000e\u001a\u00020\t\u0012\u0006\u0010\u000f\u001a\u00020\t\u0012\u0006\u0010\u0010\u001a\u00020\t\u0012\u0006\u0010\u0011\u001a\u00020\t¢\u0006\u0004\b\u001f\u0010 BC\b\u0017\u0012\u0006\u0010!\u001a\u00020\u0014\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\t\u0012\b\u0010#\u001a\u0004\u0018\u00010\"¢\u0006\u0004\b\u001f\u0010$J!\u0010\b\u001a\u00020\u00072\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005HÇ\u0001J\t\u0010\n\u001a\u00020\tHÆ\u0003J\t\u0010\u000b\u001a\u00020\tHÆ\u0003J\t\u0010\f\u001a\u00020\tHÆ\u0003J\t\u0010\r\u001a\u00020\tHÆ\u0003J1\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u000e\u001a\u00020\t2\b\b\u0002\u0010\u000f\u001a\u00020\t2\b\b\u0002\u0010\u0010\u001a\u00020\t2\b\b\u0002\u0010\u0011\u001a\u00020\tHÆ\u0001J\t\u0010\u0013\u001a\u00020\tHÖ\u0001J\t\u0010\u0015\u001a\u00020\u0014HÖ\u0001J\u0013\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\u000e\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0017\u0010\u000f\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0019\u001a\u0004\b\u001c\u0010\u001bR\u0017\u0010\u0010\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0019\u001a\u0004\b\u001d\u0010\u001bR\u0017\u0010\u0011\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0019\u001a\u0004\b\u001e\u0010\u001b¨\u0006'"}, mo22516d2 = {"Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/CustomerError;", "", "self", "Lkotlinx/serialization/encoding/d;", "output", "Lkotlinx/serialization/descriptors/f;", "serialDesc", "Lkotlin/d2;", "write$Self", "", "component1", "component2", "component3", "component4", "code", "sub_code", "reason", "service", "copy", "toString", "", "hashCode", "other", "", "equals", "Ljava/lang/String;", "getCode", "()Ljava/lang/String;", "getSub_code", "getReason", "getService", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "seen1", "Lkotlinx/serialization/internal/n1;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/n1;)V", "Companion", "$serializer", "bff-data-shared_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
@C12439o
public final class CustomerError {
    @C12579k
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    @C12579k
    private final String code;
    @C12579k
    private final String reason;
    @C12579k
    private final String service;
    @C12579k
    private final String sub_code;

    @C11076d0(mo22515d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¨\u0006\u0007"}, mo22516d2 = {"Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/CustomerError$Companion;", "", "Lkotlinx/serialization/g;", "Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/CustomerError;", "serializer", "<init>", "()V", "bff-data-shared_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @C12579k
        public final C12248g<CustomerError> serializer() {
            return CustomerError$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    @C11395k(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @C11587t0(expression = "", imports = {}))
    public /* synthetic */ CustomerError(int i, String str, String str2, String str3, String str4, C12295n1 n1Var) {
        if (15 != (i & 15)) {
            C12261c1.m49256b(i, 15, CustomerError$$serializer.INSTANCE.getDescriptor());
        }
        this.code = str;
        this.sub_code = str2;
        this.reason = str3;
        this.service = str4;
    }

    public static /* synthetic */ CustomerError copy$default(CustomerError customerError, String str, String str2, String str3, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = customerError.code;
        }
        if ((i & 2) != 0) {
            str2 = customerError.sub_code;
        }
        if ((i & 4) != 0) {
            str3 = customerError.reason;
        }
        if ((i & 8) != 0) {
            str4 = customerError.service;
        }
        return customerError.copy(str, str2, str3, str4);
    }

    @C11384m
    public static final /* synthetic */ void write$Self(CustomerError customerError, C12239d dVar, C12217f fVar) {
        dVar.mo24929z(fVar, 0, customerError.code);
        dVar.mo24929z(fVar, 1, customerError.sub_code);
        dVar.mo24929z(fVar, 2, customerError.reason);
        dVar.mo24929z(fVar, 3, customerError.service);
    }

    @C12579k
    public final String component1() {
        return this.code;
    }

    @C12579k
    public final String component2() {
        return this.sub_code;
    }

    @C12579k
    public final String component3() {
        return this.reason;
    }

    @C12579k
    public final String component4() {
        return this.service;
    }

    @C12579k
    public final CustomerError copy(@C12579k String str, @C12579k String str2, @C12579k String str3, @C12579k String str4) {
        Intrinsics.checkNotNullParameter(str, "code");
        Intrinsics.checkNotNullParameter(str2, "sub_code");
        Intrinsics.checkNotNullParameter(str3, "reason");
        Intrinsics.checkNotNullParameter(str4, "service");
        return new CustomerError(str, str2, str3, str4);
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CustomerError)) {
            return false;
        }
        CustomerError customerError = (CustomerError) obj;
        return Intrinsics.areEqual((Object) this.code, (Object) customerError.code) && Intrinsics.areEqual((Object) this.sub_code, (Object) customerError.sub_code) && Intrinsics.areEqual((Object) this.reason, (Object) customerError.reason) && Intrinsics.areEqual((Object) this.service, (Object) customerError.service);
    }

    @C12579k
    public final String getCode() {
        return this.code;
    }

    @C12579k
    public final String getReason() {
        return this.reason;
    }

    @C12579k
    public final String getService() {
        return this.service;
    }

    @C12579k
    public final String getSub_code() {
        return this.sub_code;
    }

    public int hashCode() {
        return (((((this.code.hashCode() * 31) + this.sub_code.hashCode()) * 31) + this.reason.hashCode()) * 31) + this.service.hashCode();
    }

    @C12579k
    public String toString() {
        String str = this.code;
        String str2 = this.sub_code;
        String str3 = this.reason;
        String str4 = this.service;
        return "CustomerError(code=" + str + ", sub_code=" + str2 + ", reason=" + str3 + ", service=" + str4 + ")";
    }

    public CustomerError(@C12579k String str, @C12579k String str2, @C12579k String str3, @C12579k String str4) {
        Intrinsics.checkNotNullParameter(str, "code");
        Intrinsics.checkNotNullParameter(str2, "sub_code");
        Intrinsics.checkNotNullParameter(str3, "reason");
        Intrinsics.checkNotNullParameter(str4, "service");
        this.code = str;
        this.sub_code = str2;
        this.reason = str3;
        this.service = str4;
    }
}
