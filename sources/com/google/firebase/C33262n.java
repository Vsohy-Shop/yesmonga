package com.google.firebase;

import android.content.Context;
import android.text.TextUtils;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import com.google.android.gms.common.annotation.C40473a;
import com.google.android.gms.common.internal.C40808s;
import com.google.android.gms.common.internal.C40843u;
import com.google.android.gms.common.internal.C40861z;
import com.google.android.gms.common.util.C40966b0;

/* renamed from: com.google.firebase.n */
public final class C33262n {

    /* renamed from: h */
    public static final String f80885h = "google_api_key";

    /* renamed from: i */
    public static final String f80886i = "google_app_id";

    /* renamed from: j */
    public static final String f80887j = "firebase_database_url";

    /* renamed from: k */
    public static final String f80888k = "ga_trackingId";

    /* renamed from: l */
    public static final String f80889l = "gcm_defaultSenderId";

    /* renamed from: m */
    public static final String f80890m = "google_storage_bucket";

    /* renamed from: n */
    public static final String f80891n = "project_id";

    /* renamed from: a */
    public final String f80892a;

    /* renamed from: b */
    public final String f80893b;

    /* renamed from: c */
    public final String f80894c;

    /* renamed from: d */
    public final String f80895d;

    /* renamed from: e */
    public final String f80896e;

    /* renamed from: f */
    public final String f80897f;

    /* renamed from: g */
    public final String f80898g;

    /* renamed from: com.google.firebase.n$b */
    public static final class C33264b {

        /* renamed from: a */
        public String f80899a;

        /* renamed from: b */
        public String f80900b;

        /* renamed from: c */
        public String f80901c;

        /* renamed from: d */
        public String f80902d;

        /* renamed from: e */
        public String f80903e;

        /* renamed from: f */
        public String f80904f;

        /* renamed from: g */
        public String f80905g;

        public C33264b() {
        }

        @C0359n0
        /* renamed from: a */
        public C33262n mo96255a() {
            return new C33262n(this.f80900b, this.f80899a, this.f80901c, this.f80902d, this.f80903e, this.f80904f, this.f80905g);
        }

        @C0359n0
        /* renamed from: b */
        public C33264b mo96256b(@C0359n0 String str) {
            this.f80899a = C40843u.m166199i(str, "ApiKey must be set.");
            return this;
        }

        @C0359n0
        /* renamed from: c */
        public C33264b mo96257c(@C0359n0 String str) {
            this.f80900b = C40843u.m166199i(str, "ApplicationId must be set.");
            return this;
        }

        @C0359n0
        /* renamed from: d */
        public C33264b mo96258d(@C0363p0 String str) {
            this.f80901c = str;
            return this;
        }

        @C40473a
        @C0359n0
        /* renamed from: e */
        public C33264b mo96259e(@C0363p0 String str) {
            this.f80902d = str;
            return this;
        }

        @C0359n0
        /* renamed from: f */
        public C33264b mo96260f(@C0363p0 String str) {
            this.f80903e = str;
            return this;
        }

        @C0359n0
        /* renamed from: g */
        public C33264b mo96261g(@C0363p0 String str) {
            this.f80905g = str;
            return this;
        }

        @C0359n0
        /* renamed from: h */
        public C33264b mo96262h(@C0363p0 String str) {
            this.f80904f = str;
            return this;
        }

        public C33264b(@C0359n0 C33262n nVar) {
            this.f80900b = nVar.f80893b;
            this.f80899a = nVar.f80892a;
            this.f80901c = nVar.f80894c;
            this.f80902d = nVar.f80895d;
            this.f80903e = nVar.f80896e;
            this.f80904f = nVar.f80897f;
            this.f80905g = nVar.f80898g;
        }
    }

    @C0363p0
    /* renamed from: h */
    public static C33262n m134154h(@C0359n0 Context context) {
        C40861z zVar = new C40861z(context);
        String a = zVar.mo134516a(f80886i);
        if (TextUtils.isEmpty(a)) {
            return null;
        }
        return new C33262n(a, zVar.mo134516a(f80885h), zVar.mo134516a(f80887j), zVar.mo134516a(f80888k), zVar.mo134516a(f80889l), zVar.mo134516a(f80890m), zVar.mo134516a(f80891n));
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C33262n)) {
            return false;
        }
        C33262n nVar = (C33262n) obj;
        if (!C40808s.m166010b(this.f80893b, nVar.f80893b) || !C40808s.m166010b(this.f80892a, nVar.f80892a) || !C40808s.m166010b(this.f80894c, nVar.f80894c) || !C40808s.m166010b(this.f80895d, nVar.f80895d) || !C40808s.m166010b(this.f80896e, nVar.f80896e) || !C40808s.m166010b(this.f80897f, nVar.f80897f) || !C40808s.m166010b(this.f80898g, nVar.f80898g)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return C40808s.m166011c(this.f80893b, this.f80892a, this.f80894c, this.f80895d, this.f80896e, this.f80897f, this.f80898g);
    }

    @C0359n0
    /* renamed from: i */
    public String mo96247i() {
        return this.f80892a;
    }

    @C0359n0
    /* renamed from: j */
    public String mo96248j() {
        return this.f80893b;
    }

    @C0363p0
    /* renamed from: k */
    public String mo96249k() {
        return this.f80894c;
    }

    @C0363p0
    @C40473a
    /* renamed from: l */
    public String mo96250l() {
        return this.f80895d;
    }

    @C0363p0
    /* renamed from: m */
    public String mo96251m() {
        return this.f80896e;
    }

    @C0363p0
    /* renamed from: n */
    public String mo96252n() {
        return this.f80898g;
    }

    @C0363p0
    /* renamed from: o */
    public String mo96253o() {
        return this.f80897f;
    }

    public String toString() {
        return C40808s.m166012d(this).mo134475a("applicationId", this.f80893b).mo134475a("apiKey", this.f80892a).mo134475a("databaseUrl", this.f80894c).mo134475a("gcmSenderId", this.f80896e).mo134475a("storageBucket", this.f80897f).mo134475a("projectId", this.f80898g).toString();
    }

    public C33262n(@C0359n0 String str, @C0359n0 String str2, @C0363p0 String str3, @C0363p0 String str4, @C0363p0 String str5, @C0363p0 String str6, @C0363p0 String str7) {
        C40843u.m166209s(!C40966b0.m166592b(str), "ApplicationId must be set.");
        this.f80893b = str;
        this.f80892a = str2;
        this.f80894c = str3;
        this.f80895d = str4;
        this.f80896e = str5;
        this.f80897f = str6;
        this.f80898g = str7;
    }
}
