package com.google.firebase.installations.remote;

import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import com.google.auto.value.C32455c;
import com.google.firebase.installations.remote.C33116a;

@C32455c
public abstract class InstallationResponse {

    public enum ResponseCode {
        OK,
        BAD_CONFIG
    }

    @C32455c.C32456a
    /* renamed from: com.google.firebase.installations.remote.InstallationResponse$a */
    public static abstract class C33114a {
        @C0359n0
        /* renamed from: a */
        public abstract InstallationResponse mo95874a();

        @C0359n0
        /* renamed from: b */
        public abstract C33114a mo95875b(@C0359n0 TokenResult tokenResult);

        @C0359n0
        /* renamed from: c */
        public abstract C33114a mo95876c(@C0359n0 String str);

        @C0359n0
        /* renamed from: d */
        public abstract C33114a mo95877d(@C0359n0 String str);

        @C0359n0
        /* renamed from: e */
        public abstract C33114a mo95878e(@C0359n0 ResponseCode responseCode);

        @C0359n0
        /* renamed from: f */
        public abstract C33114a mo95879f(@C0359n0 String str);
    }

    @C0359n0
    /* renamed from: a */
    public static C33114a m133549a() {
        return new C33116a.C33118b();
    }

    @C0363p0
    /* renamed from: b */
    public abstract TokenResult mo95868b();

    @C0363p0
    /* renamed from: c */
    public abstract String mo95869c();

    @C0363p0
    /* renamed from: d */
    public abstract String mo95870d();

    @C0363p0
    /* renamed from: e */
    public abstract ResponseCode mo95871e();

    @C0363p0
    /* renamed from: f */
    public abstract String mo95872f();

    @C0359n0
    /* renamed from: g */
    public abstract C33114a mo95873g();
}
