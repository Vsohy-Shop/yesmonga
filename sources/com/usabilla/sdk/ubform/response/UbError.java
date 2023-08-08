package com.usabilla.sdk.ubform.response;

import com.usabilla.sdk.ubform.net.http.C9872i;
import com.usabilla.sdk.ubform.net.http.C9873j;
import kotlin.C11076d0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22515d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b0\u0018\u00002\u00020\u0001:\u0007\t\n\u000b\f\r\u000e\u000fB\u0011\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\u0001\u0007\u0010\u0011\u0012\u0013\u0014\u0015\u0016¨\u0006\u0017"}, mo22516d2 = {"Lcom/usabilla/sdk/ubform/response/UbError;", "", "", "error", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "<init>", "(Ljava/lang/String;)V", "UbDbError", "UbEmptyBodyError", "UbGenericError", "UbHttpError", "UbInvalidCampaignError", "UbParseError", "UbServerError", "Lcom/usabilla/sdk/ubform/response/UbError$UbGenericError;", "Lcom/usabilla/sdk/ubform/response/UbError$UbInvalidCampaignError;", "Lcom/usabilla/sdk/ubform/response/UbError$UbParseError;", "Lcom/usabilla/sdk/ubform/response/UbError$UbDbError;", "Lcom/usabilla/sdk/ubform/response/UbError$UbEmptyBodyError;", "Lcom/usabilla/sdk/ubform/response/UbError$UbServerError;", "Lcom/usabilla/sdk/ubform/response/UbError$UbHttpError;", "ubform_sdkRelease"}, mo22517k = 1, mo22518mv = {1, 5, 1})
public abstract class UbError extends Throwable {
    @C12579k
    private final String error;

    @C11076d0(mo22515d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004¨\u0006\u0005"}, mo22516d2 = {"Lcom/usabilla/sdk/ubform/response/UbError$UbDbError;", "Lcom/usabilla/sdk/ubform/response/UbError;", "message", "", "(Ljava/lang/String;)V", "ubform_sdkRelease"}, mo22517k = 1, mo22518mv = {1, 5, 1}, mo22520xi = 48)
    public static final class UbDbError extends UbError {
        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public UbDbError(@C12579k String str) {
            super(str, (DefaultConstructorMarker) null);
            Intrinsics.checkNotNullParameter(str, "message");
        }
    }

    @C11076d0(mo22515d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u000b"}, mo22516d2 = {"Lcom/usabilla/sdk/ubform/response/UbError$UbEmptyBodyError;", "Lcom/usabilla/sdk/ubform/response/UbError;", "Lcom/usabilla/sdk/ubform/net/http/j;", "response", "Lcom/usabilla/sdk/ubform/net/http/j;", "b", "()Lcom/usabilla/sdk/ubform/net/http/j;", "", "error", "<init>", "(Ljava/lang/String;Lcom/usabilla/sdk/ubform/net/http/j;)V", "ubform_sdkRelease"}, mo22517k = 1, mo22518mv = {1, 5, 1})
    public static final class UbEmptyBodyError extends UbError {
        @C12579k
        private final C9873j response;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public UbEmptyBodyError(@C12579k String str, @C12579k C9873j jVar) {
            super(str, (DefaultConstructorMarker) null);
            Intrinsics.checkNotNullParameter(str, "error");
            Intrinsics.checkNotNullParameter(jVar, "response");
            this.response = jVar;
        }

        @C12579k
        /* renamed from: b */
        public final C9873j mo20343b() {
            return this.response;
        }
    }

    @C11076d0(mo22515d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004¨\u0006\u0005"}, mo22516d2 = {"Lcom/usabilla/sdk/ubform/response/UbError$UbGenericError;", "Lcom/usabilla/sdk/ubform/response/UbError;", "error", "", "(Ljava/lang/String;)V", "ubform_sdkRelease"}, mo22517k = 1, mo22518mv = {1, 5, 1}, mo22520xi = 48)
    public static final class UbGenericError extends UbError {
        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public UbGenericError(@C12579k String str) {
            super(str, (DefaultConstructorMarker) null);
            Intrinsics.checkNotNullParameter(str, "error");
        }
    }

    @C11076d0(mo22515d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\t"}, mo22516d2 = {"Lcom/usabilla/sdk/ubform/response/UbError$UbHttpError;", "Lcom/usabilla/sdk/ubform/response/UbError;", "Lcom/usabilla/sdk/ubform/net/http/j;", "response", "Lcom/usabilla/sdk/ubform/net/http/j;", "b", "()Lcom/usabilla/sdk/ubform/net/http/j;", "<init>", "(Lcom/usabilla/sdk/ubform/net/http/j;)V", "ubform_sdkRelease"}, mo22517k = 1, mo22518mv = {1, 5, 1})
    public static final class UbHttpError extends UbError {
        @C12579k
        private final C9873j response;

        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public UbHttpError(@org.jetbrains.annotations.C12579k com.usabilla.sdk.ubform.net.http.C9873j r3) {
            /*
                r2 = this;
                java.lang.String r0 = "response"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
                java.lang.String r0 = r3.getError()
                if (r0 != 0) goto L_0x002c
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "Server error "
                r0.append(r1)
                java.lang.String r1 = r3.getError()
                r0.append(r1)
                java.lang.String r1 = ", code: "
                r0.append(r1)
                java.lang.Integer r1 = r3.mo20307a()
                r0.append(r1)
                java.lang.String r0 = r0.toString()
            L_0x002c:
                r1 = 0
                r2.<init>(r0, r1)
                r2.response = r3
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.usabilla.sdk.ubform.response.UbError.UbHttpError.<init>(com.usabilla.sdk.ubform.net.http.j):void");
        }

        @C12579k
        /* renamed from: b */
        public final C9873j mo20344b() {
            return this.response;
        }
    }

    @C11076d0(mo22515d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004¨\u0006\u0005"}, mo22516d2 = {"Lcom/usabilla/sdk/ubform/response/UbError$UbInvalidCampaignError;", "Lcom/usabilla/sdk/ubform/response/UbError;", "error", "", "(Ljava/lang/String;)V", "ubform_sdkRelease"}, mo22517k = 1, mo22518mv = {1, 5, 1}, mo22520xi = 48)
    public static final class UbInvalidCampaignError extends UbError {
        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public UbInvalidCampaignError(@C12579k String str) {
            super(str, (DefaultConstructorMarker) null);
            Intrinsics.checkNotNullParameter(str, "error");
        }
    }

    @C11076d0(mo22515d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004¨\u0006\u0005"}, mo22516d2 = {"Lcom/usabilla/sdk/ubform/response/UbError$UbParseError;", "Lcom/usabilla/sdk/ubform/response/UbError;", "error", "", "(Ljava/lang/String;)V", "ubform_sdkRelease"}, mo22517k = 1, mo22518mv = {1, 5, 1}, mo22520xi = 48)
    public static final class UbParseError extends UbError {
        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public UbParseError(@C12579k String str) {
            super(str, (DefaultConstructorMarker) null);
            Intrinsics.checkNotNullParameter(str, "error");
        }
    }

    @C11076d0(mo22515d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, mo22516d2 = {"Lcom/usabilla/sdk/ubform/response/UbError$UbServerError;", "Lcom/usabilla/sdk/ubform/response/UbError;", "Lcom/usabilla/sdk/ubform/net/http/i;", "request", "Lcom/usabilla/sdk/ubform/net/http/j;", "response", "<init>", "(Lcom/usabilla/sdk/ubform/net/http/i;Lcom/usabilla/sdk/ubform/net/http/j;)V", "ubform_sdkRelease"}, mo22517k = 1, mo22518mv = {1, 5, 1})
    public static final class UbServerError extends UbError {
        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public UbServerError(@C12579k C9872i iVar, @C12579k C9873j jVar) {
            super(jVar.getError() + ", request: " + iVar.getUrl() + ", code: " + jVar.mo20307a(), (DefaultConstructorMarker) null);
            Intrinsics.checkNotNullParameter(iVar, "request");
            Intrinsics.checkNotNullParameter(jVar, "response");
        }
    }

    public /* synthetic */ UbError(String str, DefaultConstructorMarker defaultConstructorMarker) {
        this(str);
    }

    @C12579k
    /* renamed from: a */
    public final String mo20342a() {
        return this.error;
    }

    public UbError(String str) {
        super(str);
        this.error = str;
    }
}
