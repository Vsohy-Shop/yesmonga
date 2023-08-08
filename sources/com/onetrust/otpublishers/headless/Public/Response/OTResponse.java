package com.onetrust.otpublishers.headless.Public.Response;

import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import kotlinx.serialization.json.internal.C12361b;

public class OTResponse {

    /* renamed from: a */
    public final String f85223a;

    /* renamed from: b */
    public final int f85224b;

    /* renamed from: c */
    public final String f85225c;

    /* renamed from: d */
    public final String f85226d;

    public OTResponse(@C0359n0 String str, int i, @C0359n0 String str2, @C0363p0 String str3) {
        this.f85223a = str;
        this.f85224b = i;
        this.f85225c = str2;
        this.f85226d = str3;
    }

    public int getResponseCode() {
        return this.f85224b;
    }

    @C0363p0
    public String getResponseData() {
        return this.f85226d;
    }

    @C0359n0
    public String getResponseMessage() {
        return this.f85225c;
    }

    @C0359n0
    public String getResponseType() {
        return this.f85223a;
    }

    @C0359n0
    public String toString() {
        return "OTResponse{responseType='" + this.f85223a + '\'' + ", responseCode=" + this.f85224b + ", responseMessage='" + this.f85225c + '\'' + ", responseData='" + this.f85226d + '\'' + C12361b.f30259j;
    }
}
