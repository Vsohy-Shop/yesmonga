package com.urbanairship.wallet;

import android.text.TextUtils;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.annotation.C0386z0;
import com.urbanairship.json.C9323b;
import com.urbanairship.json.C9333e;
import com.urbanairship.json.JsonValue;

/* renamed from: com.urbanairship.wallet.c */
public class C9698c implements C9333e {

    /* renamed from: d */
    public static final String f26556d = "value";

    /* renamed from: e */
    public static final String f26557e = "label";

    /* renamed from: a */
    public final String f26558a;

    /* renamed from: b */
    public final String f26559b;

    /* renamed from: c */
    public final Object f26560c;

    /* renamed from: com.urbanairship.wallet.c$a */
    public static class C9699a {

        /* renamed from: a */
        public String f26561a;

        /* renamed from: b */
        public String f26562b;

        /* renamed from: c */
        public Object f26563c;

        @C0359n0
        /* renamed from: d */
        public C9698c mo19678d() {
            if (!TextUtils.isEmpty(this.f26561a) && (this.f26563c != null || !TextUtils.isEmpty(this.f26562b))) {
                return new C9698c(this);
            }
            throw new IllegalStateException("The field must have a name and either a value or label.");
        }

        @C0359n0
        /* renamed from: e */
        public C9699a mo19679e(@C0363p0 String str) {
            this.f26562b = str;
            return this;
        }

        @C0359n0
        /* renamed from: f */
        public C9699a mo19680f(@C0359n0 @C0386z0(min = 1) String str) {
            this.f26561a = str;
            return this;
        }

        @C0359n0
        /* renamed from: g */
        public C9699a mo19681g(int i) {
            this.f26563c = Integer.valueOf(i);
            return this;
        }

        @C0359n0
        /* renamed from: h */
        public C9699a mo19682h(@C0363p0 String str) {
            this.f26563c = str;
            return this;
        }
    }

    public C9698c(@C0359n0 C9699a aVar) {
        this.f26558a = aVar.f26561a;
        this.f26559b = aVar.f26562b;
        this.f26560c = aVar.f26563c;
    }

    @C0359n0
    /* renamed from: b */
    public static C9699a m36285b() {
        return new C9699a();
    }

    @C0359n0
    /* renamed from: a */
    public String mo19676a() {
        return this.f26558a;
    }

    @C0359n0
    /* renamed from: q */
    public JsonValue mo17264q() {
        return C9323b.m35017y().mo18826j("label", this.f26559b).mo18826j("value", this.f26560c).mo18817a().mo17264q();
    }

    @C0359n0
    public String toString() {
        return mo17264q().toString();
    }
}
