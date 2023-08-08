package com.carrefour.fid.android.core.p057io;

import androidx.annotation.Keep;
import androidx.compose.runtime.internal.C8567o;
import com.google.gson.annotations.C33608c;
import java.util.List;
import kotlin.C11076d0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001BS\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u000bJ\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\bHÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0003HÆ\u0003JW\u0010\u001a\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001e\u001a\u00020\u001fHÖ\u0001J\t\u0010 \u001a\u00020\u0003HÖ\u0001R\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\rR\u0018\u0010\n\u001a\u0004\u0018\u00010\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\rR\u001e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b8\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\r¨\u0006!"}, mo22516d2 = {"Lcom/carrefour/fid/android/core/io/CheckoutAppServerError;", "", "message", "", "errorCode", "timeStamp", "correlationId", "subErrors", "", "Lcom/carrefour/fid/android/core/io/CheckoutError;", "paymentMethod", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;)V", "getCorrelationId", "()Ljava/lang/String;", "getErrorCode", "getMessage", "getPaymentMethod", "getSubErrors", "()Ljava/util/List;", "getTimeStamp", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "", "toString", "app_release"}, mo22517k = 1, mo22518mv = {1, 8, 0}, mo22520xi = 48)
@Keep
@C8567o(parameters = 0)
/* renamed from: com.carrefour.fid.android.core.io.CheckoutAppServerError */
public final class CheckoutAppServerError {
    public static final int $stable = 8;
    @C33608c("correlation_id")
    @C12580l
    private final String correlationId;
    @C33608c("error_code")
    @C12580l
    private final String errorCode;
    @C33608c("message")
    @C12580l
    private final String message;
    @C33608c("payment_method")
    @C12580l
    private final String paymentMethod;
    @C33608c("sub_errors")
    @C12580l
    private final List<CheckoutError> subErrors;
    @C33608c("timestamp")
    @C12580l
    private final String timeStamp;

    public CheckoutAppServerError() {
        this((String) null, (String) null, (String) null, (String) null, (List) null, (String) null, 63, (DefaultConstructorMarker) null);
    }

    public static /* synthetic */ CheckoutAppServerError copy$default(CheckoutAppServerError checkoutAppServerError, String str, String str2, String str3, String str4, List<CheckoutError> list, String str5, int i, Object obj) {
        if ((i & 1) != 0) {
            str = checkoutAppServerError.message;
        }
        if ((i & 2) != 0) {
            str2 = checkoutAppServerError.errorCode;
        }
        String str6 = str2;
        if ((i & 4) != 0) {
            str3 = checkoutAppServerError.timeStamp;
        }
        String str7 = str3;
        if ((i & 8) != 0) {
            str4 = checkoutAppServerError.correlationId;
        }
        String str8 = str4;
        if ((i & 16) != 0) {
            list = checkoutAppServerError.subErrors;
        }
        List<CheckoutError> list2 = list;
        if ((i & 32) != 0) {
            str5 = checkoutAppServerError.paymentMethod;
        }
        return checkoutAppServerError.copy(str, str6, str7, str8, list2, str5);
    }

    @C12580l
    public final String component1() {
        return this.message;
    }

    @C12580l
    public final String component2() {
        return this.errorCode;
    }

    @C12580l
    public final String component3() {
        return this.timeStamp;
    }

    @C12580l
    public final String component4() {
        return this.correlationId;
    }

    @C12580l
    public final List<CheckoutError> component5() {
        return this.subErrors;
    }

    @C12580l
    public final String component6() {
        return this.paymentMethod;
    }

    @C12579k
    public final CheckoutAppServerError copy(@C12580l String str, @C12580l String str2, @C12580l String str3, @C12580l String str4, @C12580l List<CheckoutError> list, @C12580l String str5) {
        return new CheckoutAppServerError(str, str2, str3, str4, list, str5);
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CheckoutAppServerError)) {
            return false;
        }
        CheckoutAppServerError checkoutAppServerError = (CheckoutAppServerError) obj;
        return Intrinsics.areEqual((Object) this.message, (Object) checkoutAppServerError.message) && Intrinsics.areEqual((Object) this.errorCode, (Object) checkoutAppServerError.errorCode) && Intrinsics.areEqual((Object) this.timeStamp, (Object) checkoutAppServerError.timeStamp) && Intrinsics.areEqual((Object) this.correlationId, (Object) checkoutAppServerError.correlationId) && Intrinsics.areEqual((Object) this.subErrors, (Object) checkoutAppServerError.subErrors) && Intrinsics.areEqual((Object) this.paymentMethod, (Object) checkoutAppServerError.paymentMethod);
    }

    @C12580l
    public final String getCorrelationId() {
        return this.correlationId;
    }

    @C12580l
    public final String getErrorCode() {
        return this.errorCode;
    }

    @C12580l
    public final String getMessage() {
        return this.message;
    }

    @C12580l
    public final String getPaymentMethod() {
        return this.paymentMethod;
    }

    @C12580l
    public final List<CheckoutError> getSubErrors() {
        return this.subErrors;
    }

    @C12580l
    public final String getTimeStamp() {
        return this.timeStamp;
    }

    public int hashCode() {
        String str = this.message;
        int i = 0;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.errorCode;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.timeStamp;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.correlationId;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        List<CheckoutError> list = this.subErrors;
        int hashCode5 = (hashCode4 + (list == null ? 0 : list.hashCode())) * 31;
        String str5 = this.paymentMethod;
        if (str5 != null) {
            i = str5.hashCode();
        }
        return hashCode5 + i;
    }

    @C12579k
    public String toString() {
        String str = this.message;
        String str2 = this.errorCode;
        String str3 = this.timeStamp;
        String str4 = this.correlationId;
        List<CheckoutError> list = this.subErrors;
        String str5 = this.paymentMethod;
        return "CheckoutAppServerError(message=" + str + ", errorCode=" + str2 + ", timeStamp=" + str3 + ", correlationId=" + str4 + ", subErrors=" + list + ", paymentMethod=" + str5 + ")";
    }

    public CheckoutAppServerError(@C12580l String str, @C12580l String str2, @C12580l String str3, @C12580l String str4, @C12580l List<CheckoutError> list, @C12580l String str5) {
        this.message = str;
        this.errorCode = str2;
        this.timeStamp = str3;
        this.correlationId = str4;
        this.subErrors = list;
        this.paymentMethod = str5;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ CheckoutAppServerError(java.lang.String r5, java.lang.String r6, java.lang.String r7, java.lang.String r8, java.util.List r9, java.lang.String r10, int r11, kotlin.jvm.internal.DefaultConstructorMarker r12) {
        /*
            r4 = this;
            r12 = r11 & 1
            if (r12 == 0) goto L_0x0009
            java.lang.String r5 = new java.lang.String
            r5.<init>()
        L_0x0009:
            r12 = r11 & 2
            if (r12 == 0) goto L_0x0012
            java.lang.String r6 = new java.lang.String
            r6.<init>()
        L_0x0012:
            r12 = r6
            r6 = r11 & 4
            if (r6 == 0) goto L_0x001c
            java.lang.String r7 = new java.lang.String
            r7.<init>()
        L_0x001c:
            r0 = r7
            r6 = r11 & 8
            if (r6 == 0) goto L_0x0026
            java.lang.String r8 = new java.lang.String
            r8.<init>()
        L_0x0026:
            r1 = r8
            r6 = r11 & 16
            if (r6 == 0) goto L_0x002f
            java.util.List r9 = kotlin.collections.CollectionsKt__CollectionsKt.m40441E()
        L_0x002f:
            r2 = r9
            r6 = r11 & 32
            if (r6 == 0) goto L_0x0039
            java.lang.String r10 = new java.lang.String
            r10.<init>()
        L_0x0039:
            r3 = r10
            r6 = r4
            r7 = r5
            r8 = r12
            r9 = r0
            r10 = r1
            r11 = r2
            r12 = r3
            r6.<init>(r7, r8, r9, r10, r11, r12)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.core.p057io.CheckoutAppServerError.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.util.List, java.lang.String, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
