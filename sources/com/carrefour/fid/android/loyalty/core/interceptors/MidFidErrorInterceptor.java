package com.carrefour.fid.android.loyalty.core.interceptors;

import com.carrefour.fid.android.loyalty.core.constants.LoyaltyConstantsKt;
import javax.inject.Singleton;
import kotlin.C11076d0;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.text.StringsKt__StringsKt;
import okhttp3.C12451Response;
import okhttp3.Interceptor;
import org.jetbrains.annotations.C12579k;

@Singleton
@C11076d0(mo22515d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 \f2\u00020\u0001:\u0001\fB\u0007\b\u0007¢\u0006\u0002\u0010\u0002J\u001a\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0002J\u0010\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u000bH\u0016¨\u0006\r"}, mo22516d2 = {"Lcom/carrefour/fid/android/loyalty/core/interceptors/MidFidErrorInterceptor;", "Lokhttp3/Interceptor;", "()V", "handlerNewErrorCode", "", "errorBody", "", "response", "Lokhttp3/Response;", "intercept", "chain", "Lokhttp3/Interceptor$Chain;", "Companion", "loyalty_release"}, mo22517k = 1, mo22518mv = {1, 8, 0}, mo22520xi = 48)
@C11363r0({"SMAP\nMidFidErrorInterceptor.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MidFidErrorInterceptor.kt\ncom/carrefour/fid/android/loyalty/core/interceptors/MidFidErrorInterceptor\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,90:1\n1#2:91\n*E\n"})
public final class MidFidErrorInterceptor implements Interceptor {
    private static final int CODE_SUCCESS_200 = 200;
    private static final int CODE_SUCCESS_201 = 201;
    private static final int CODE_SUCCESS_204 = 204;
    @C12579k
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    @C12579k
    private static final String GET_OTP_CODE_PATH = "/retail/v1/mof/otp_management/loyalty_cards/my/otp";
    @C12579k
    private static final String HEADER_KEY_LOYALTY_CARD_ID = "loyalty_card_id";
    @C12579k
    private static final String HEADER_KEY_VALIDATION_OTP = "Validation-Code";
    @C12579k
    private static final String LOYALTY_CARDS_PATH = "/retail/v1/mof/account_card_management/loyalty_cards/my/set_clubs";
    @C12579k
    private static final String LOYALTY_CARDS_PATH_SUCCESS = "Success";
    @C12579k
    private static final String LOYALTY_MEMBERS_PATH = "/retail/v1/mof/customer_data_management/loyalty_members";
    @C12579k
    private static final String UPDATE_SECRET_CODE_PATH = "/retail/v1/mof/account_card_management/loyalty_cards/my/accounts";
    @C12579k
    private static final String VALIDATION_OTP_CODE_PATH = "/retail/v1/mof/otp_management/loyalty_cards/otp/my";

    @C11076d0(mo22515d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\b\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bXT¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\bXT¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\bXT¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\bXT¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\bXT¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\bXT¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\bXT¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\bXT¢\u0006\u0002\n\u0000¨\u0006\u0010"}, mo22516d2 = {"Lcom/carrefour/fid/android/loyalty/core/interceptors/MidFidErrorInterceptor$Companion;", "", "()V", "CODE_SUCCESS_200", "", "CODE_SUCCESS_201", "CODE_SUCCESS_204", "GET_OTP_CODE_PATH", "", "HEADER_KEY_LOYALTY_CARD_ID", "HEADER_KEY_VALIDATION_OTP", "LOYALTY_CARDS_PATH", "LOYALTY_CARDS_PATH_SUCCESS", "LOYALTY_MEMBERS_PATH", "UPDATE_SECRET_CODE_PATH", "VALIDATION_OTP_CODE_PATH", "loyalty_release"}, mo22517k = 1, mo22518mv = {1, 8, 0}, mo22520xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    private final int handlerNewErrorCode(String str, C12451Response response) {
        if (str == null) {
            return response.code();
        }
        if (StringsKt__StringsKt.contains$default((CharSequence) str, (CharSequence) LoyaltyConstantsKt.LOYALTY_INVALID_CARD_OR_SECRET_MESSAGE, false, 2, (Object) null)) {
            return 124;
        }
        if (StringsKt__StringsKt.contains$default((CharSequence) str, (CharSequence) LoyaltyConstantsKt.LOYALTY_BLOCKED_CARD_MESSAGE, false, 2, (Object) null)) {
            return 123;
        }
        if (StringsKt__StringsKt.contains$default((CharSequence) str, (CharSequence) LoyaltyConstantsKt.MIDFID_AUTHENTIFICAT_WRONG_OTP_ERROR_CODE, false, 2, (Object) null) || StringsKt__StringsKt.contains$default((CharSequence) str, (CharSequence) LoyaltyConstantsKt.MIDFID_AUTHENTIFICAT_NO_OTP_ERROR_CODE, false, 2, (Object) null) || StringsKt__StringsKt.contains$default((CharSequence) str, (CharSequence) LoyaltyConstantsKt.MIDFID_AUTHENTIFICAT_NUMBER_ATTEMPT_EXCEEDED_ERROR_CODE, false, 2, (Object) null)) {
            return 602;
        }
        if (StringsKt__StringsKt.contains$default((CharSequence) str, (CharSequence) LoyaltyConstantsKt.MIDFID_ERROR_NEGATIF_SOLD, false, 2, (Object) null)) {
            return 3;
        }
        if (StringsKt__StringsKt.contains$default((CharSequence) str, (CharSequence) LoyaltyConstantsKt.MIDFID_SECRET_CODE_NOT_SECURED_ERROR_CODE, false, 2, (Object) null) || StringsKt__StringsKt.contains$default((CharSequence) str, (CharSequence) LoyaltyConstantsKt.MIDFID_SECRET_CODE_NOT_SECURED_SECOND_ERROR_CODE, false, 2, (Object) null) || StringsKt__StringsKt.contains$default((CharSequence) str, (CharSequence) LoyaltyConstantsKt.MIDFID_ERROR_CODE_TWELVE, false, 2, (Object) null)) {
            return 603;
        }
        if (StringsKt__StringsKt.contains$default((CharSequence) str, (CharSequence) LoyaltyConstantsKt.MIDFID_ERROR_STAC_SERVICES, false, 2, (Object) null) || StringsKt__StringsKt.contains$default((CharSequence) str, (CharSequence) "B0003", false, 2, (Object) null) || StringsKt__StringsKt.contains$default((CharSequence) str, (CharSequence) LoyaltyConstantsKt.MIDFID_ERROR_INVALID_CARD, false, 2, (Object) null) || StringsKt__StringsKt.contains$default((CharSequence) str, (CharSequence) LoyaltyConstantsKt.MIDFID_ERROR_CODE_FOUR, false, 2, (Object) null)) {
            return 127;
        }
        return response.code();
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v0, resolved type: okhttp3.MediaType} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v1, resolved type: okhttp3.MediaType} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v7, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v8, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v3, resolved type: okhttp3.MediaType} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v9, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v10, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v12, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v14, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v19, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v22, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v7, resolved type: okhttp3.MediaType} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v8, resolved type: okhttp3.MediaType} */
    /* JADX WARNING: type inference failed for: r2v4, types: [java.lang.String] */
    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x004e, code lost:
        if (r1.equals(LOYALTY_MEMBERS_PATH) == false) goto L_0x0093;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0057, code lost:
        if (r1.equals(VALIDATION_OTP_CODE_PATH) == false) goto L_0x0093;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x005a, code lost:
        r1 = r7.code();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x005e, code lost:
        if (r1 == 201) goto L_0x0072;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0060, code lost:
        if (r1 == 204) goto L_0x0063;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0063, code lost:
        r1 = java.lang.String.valueOf(r7.headers().get(HEADER_KEY_VALIDATION_OTP));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0072, code lost:
        r1 = java.lang.String.valueOf(r7.headers().get(HEADER_KEY_LOYALTY_CARD_ID));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0087, code lost:
        if (r1.equals(GET_OTP_CODE_PATH) == false) goto L_0x0093;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x008e, code lost:
        if (r7.code() != 201) goto L_0x0093;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0090, code lost:
        r1 = LOYALTY_CARDS_PATH_SUCCESS;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x003c, code lost:
        if (r1.equals(UPDATE_SECRET_CODE_PATH) != false) goto L_0x005a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0045, code lost:
        if (r1.equals(LOYALTY_CARDS_PATH) == false) goto L_0x0093;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    @org.jetbrains.annotations.C12579k
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public okhttp3.C12451Response intercept(@org.jetbrains.annotations.C12579k okhttp3.Interceptor.Chain r7) {
        /*
            r6 = this;
            java.lang.String r0 = "chain"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r0)
            okhttp3.Request r0 = r7.request()
            okhttp3.Response r7 = r7.proceed(r0)
            okhttp3.ResponseBody r0 = r7.body()
            boolean r1 = r7.isSuccessful()
            r2 = 0
            if (r1 == 0) goto L_0x00f5
            okhttp3.Request r1 = r7.request()
            okhttp3.HttpUrl r1 = r1.url()
            java.net.URL r1 = r1.url()
            java.lang.String r1 = r1.getPath()
            r3 = 204(0xcc, float:2.86E-43)
            if (r1 == 0) goto L_0x0093
            int r4 = r1.hashCode()
            r5 = 201(0xc9, float:2.82E-43)
            switch(r4) {
                case -363739101: goto L_0x0081;
                case -309223701: goto L_0x0051;
                case 729442634: goto L_0x0048;
                case 1058127187: goto L_0x003f;
                case 1469633683: goto L_0x0036;
                default: goto L_0x0035;
            }
        L_0x0035:
            goto L_0x0093
        L_0x0036:
            java.lang.String r4 = "/retail/v1/mof/account_card_management/loyalty_cards/my/accounts"
            boolean r1 = r1.equals(r4)
            if (r1 == 0) goto L_0x0093
            goto L_0x005a
        L_0x003f:
            java.lang.String r4 = "/retail/v1/mof/account_card_management/loyalty_cards/my/set_clubs"
            boolean r1 = r1.equals(r4)
            if (r1 != 0) goto L_0x008a
            goto L_0x0093
        L_0x0048:
            java.lang.String r4 = "/retail/v1/mof/customer_data_management/loyalty_members"
            boolean r1 = r1.equals(r4)
            if (r1 != 0) goto L_0x005a
            goto L_0x0093
        L_0x0051:
            java.lang.String r4 = "/retail/v1/mof/otp_management/loyalty_cards/otp/my"
            boolean r1 = r1.equals(r4)
            if (r1 != 0) goto L_0x005a
            goto L_0x0093
        L_0x005a:
            int r1 = r7.code()
            if (r1 == r5) goto L_0x0072
            if (r1 == r3) goto L_0x0063
            goto L_0x0093
        L_0x0063:
            okhttp3.Headers r1 = r7.headers()
            java.lang.String r4 = "Validation-Code"
            java.lang.String r1 = r1.get(r4)
            java.lang.String r1 = java.lang.String.valueOf(r1)
            goto L_0x0094
        L_0x0072:
            okhttp3.Headers r1 = r7.headers()
            java.lang.String r4 = "loyalty_card_id"
            java.lang.String r1 = r1.get(r4)
            java.lang.String r1 = java.lang.String.valueOf(r1)
            goto L_0x0094
        L_0x0081:
            java.lang.String r4 = "/retail/v1/mof/otp_management/loyalty_cards/my/otp"
            boolean r1 = r1.equals(r4)
            if (r1 != 0) goto L_0x008a
            goto L_0x0093
        L_0x008a:
            int r1 = r7.code()
            if (r1 != r5) goto L_0x0093
            java.lang.String r1 = "Success"
            goto L_0x0094
        L_0x0093:
            r1 = r2
        L_0x0094:
            int r4 = r7.code()
            if (r4 != r3) goto L_0x00c9
            okhttp3.Response$Builder r7 = r7.newBuilder()
            r0 = 200(0xc8, float:2.8E-43)
            okhttp3.Response$Builder r7 = r7.code(r0)
            okhttp3.ResponseBody$Companion r0 = okhttp3.ResponseBody.Companion
            okhttp3.MediaType$Companion r2 = okhttp3.MediaType.Companion
            java.lang.String r3 = "application/json"
            okhttp3.MediaType r2 = r2.get(r3)
            com.google.gson.e r3 = new com.google.gson.e
            r3.<init>()
            java.lang.String r1 = r3.mo97491z(r1)
            java.lang.String r3 = "Gson().toJson(newBody)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r3)
            okhttp3.ResponseBody r0 = r0.create((okhttp3.MediaType) r2, (java.lang.String) r1)
            okhttp3.Response$Builder r7 = r7.body(r0)
            okhttp3.Response r7 = r7.build()
            goto L_0x00f4
        L_0x00c9:
            okhttp3.Response$Builder r7 = r7.newBuilder()
            okhttp3.ResponseBody$Companion r3 = okhttp3.ResponseBody.Companion
            if (r0 == 0) goto L_0x00d6
            okhttp3.MediaType r4 = r0.contentType()
            goto L_0x00d7
        L_0x00d6:
            r4 = r2
        L_0x00d7:
            if (r1 != 0) goto L_0x00e8
            if (r0 == 0) goto L_0x00df
            java.lang.String r2 = r0.string()
        L_0x00df:
            if (r2 != 0) goto L_0x00e7
            java.lang.String r1 = new java.lang.String
            r1.<init>()
            goto L_0x00e8
        L_0x00e7:
            r1 = r2
        L_0x00e8:
            okhttp3.ResponseBody r0 = r3.create((okhttp3.MediaType) r4, (java.lang.String) r1)
            okhttp3.Response$Builder r7 = r7.body(r0)
            okhttp3.Response r7 = r7.build()
        L_0x00f4:
            return r7
        L_0x00f5:
            r3 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            okhttp3.ResponseBody r1 = r7.peekBody(r3)
            java.lang.String r1 = r1.string()
            okhttp3.Response$Builder r3 = r7.newBuilder()
            int r7 = r6.handlerNewErrorCode(r1, r7)
            okhttp3.Response$Builder r7 = r3.code(r7)
            okhttp3.ResponseBody$Companion r3 = okhttp3.ResponseBody.Companion
            if (r0 == 0) goto L_0x0116
            okhttp3.MediaType r2 = r0.contentType()
        L_0x0116:
            okhttp3.ResponseBody r0 = r3.create((okhttp3.MediaType) r2, (java.lang.String) r1)
            okhttp3.Response$Builder r7 = r7.body(r0)
            okhttp3.Response r7 = r7.build()
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.loyalty.core.interceptors.MidFidErrorInterceptor.intercept(okhttp3.Interceptor$Chain):okhttp3.Response");
    }
}
