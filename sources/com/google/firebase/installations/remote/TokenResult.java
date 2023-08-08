package com.google.firebase.installations.remote;

import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import com.google.auto.value.C32455c;
import com.google.firebase.installations.remote.C33119b;

@C32455c
public abstract class TokenResult {

    public enum ResponseCode {
        OK,
        BAD_CONFIG,
        AUTH_ERROR
    }

    @C32455c.C32456a
    /* renamed from: com.google.firebase.installations.remote.TokenResult$a */
    public static abstract class C33115a {
        @C0359n0
        /* renamed from: a */
        public abstract TokenResult mo95884a();

        @C0359n0
        /* renamed from: b */
        public abstract C33115a mo95885b(@C0359n0 ResponseCode responseCode);

        @C0359n0
        /* renamed from: c */
        public abstract C33115a mo95886c(@C0359n0 String str);

        @C0359n0
        /* renamed from: d */
        public abstract C33115a mo95887d(long j);
    }

    @C0359n0
    /* renamed from: a */
    public static C33115a m133562a() {
        return new C33119b.C33121b().mo95887d(0);
    }

    @C0363p0
    /* renamed from: b */
    public abstract ResponseCode mo95880b();

    @C0363p0
    /* renamed from: c */
    public abstract String mo95881c();

    @C0359n0
    /* renamed from: d */
    public abstract long mo95882d();

    @C0359n0
    /* renamed from: e */
    public abstract C33115a mo95883e();
}
