package com.contentsquare.android.sdk;

import java.util.Date;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.contentsquare.android.sdk.e */
public class C14283e {

    /* renamed from: a */
    public final String f35252a;

    /* renamed from: b */
    public final int f35253b;

    /* renamed from: c */
    public final int f35254c;

    /* renamed from: d */
    public final String f35255d;

    /* renamed from: e */
    public final String f35256e;

    /* renamed from: f */
    public final String f35257f;

    /* renamed from: g */
    public final String f35258g;

    /* renamed from: h */
    public final String f35259h;

    /* renamed from: i */
    public final JSONObject f35260i;

    /* renamed from: j */
    public final JSONObject f35261j;

    /* renamed from: k */
    public final JSONArray f35262k;

    /* renamed from: l */
    public final long f35263l;

    /* renamed from: com.contentsquare.android.sdk.e$a */
    public static class C14284a {

        /* renamed from: a */
        public final int f35264a;

        /* renamed from: b */
        public final String f35265b;

        /* renamed from: c */
        public final String f35266c;

        /* renamed from: d */
        public final String f35267d;

        /* renamed from: e */
        public final String f35268e;

        /* renamed from: f */
        public final String f35269f;

        /* renamed from: g */
        public final JSONObject f35270g;

        /* renamed from: h */
        public final JSONObject f35271h;

        /* renamed from: i */
        public final JSONArray f35272i = new JSONArray();

        /* renamed from: j */
        public final long f35273j = new Date().getTime();

        /* renamed from: k */
        public String f35274k;

        /* renamed from: l */
        public int f35275l;

        public C14284a(C14476k7 k7Var) {
            this.f35264a = k7Var.mo35763m();
            this.f35265b = k7Var.mo35766p();
            this.f35266c = k7Var.mo35773w();
            this.f35269f = k7Var.mo35774x();
            this.f35270g = k7Var.mo35772v();
            this.f35271h = k7Var.mo35767q();
            this.f35267d = k7Var.mo35765o();
            this.f35268e = k7Var.mo35764n();
        }

        /* renamed from: a */
        public C14284a mo34994a(List<JSONObject> list) {
            for (JSONObject put : list) {
                this.f35272i.put(put);
            }
            return this;
        }

        /* renamed from: b */
        public C14283e mo34995b() {
            return new C14283e(this);
        }

        /* renamed from: c */
        public void mo34996c(int i) {
            this.f35275l = i;
        }

        /* renamed from: d */
        public void mo34997d(String str) {
            this.f35274k = str;
        }

        /* renamed from: e */
        public String mo34998e() {
            return this.f35266c;
        }

        /* renamed from: f */
        public JSONObject mo34999f() {
            return this.f35271h;
        }

        /* renamed from: g */
        public int mo35000g() {
            return this.f35264a;
        }

        /* renamed from: h */
        public String mo35001h() {
            return this.f35265b;
        }

        /* renamed from: i */
        public JSONArray mo35002i() {
            return this.f35272i;
        }

        /* renamed from: j */
        public int mo35003j() {
            return this.f35275l;
        }

        /* renamed from: k */
        public long mo35004k() {
            return this.f35273j;
        }

        /* renamed from: l */
        public String mo35005l() {
            return this.f35269f;
        }

        /* renamed from: m */
        public JSONObject mo35006m() {
            return this.f35270g;
        }

        /* renamed from: n */
        public String mo35007n() {
            return this.f35274k;
        }
    }

    public C14283e(C14284a aVar) {
        this.f35252a = aVar.mo35007n();
        this.f35253b = aVar.mo35003j();
        this.f35254c = aVar.mo35000g();
        this.f35255d = aVar.mo35001h();
        this.f35256e = aVar.mo34998e();
        this.f35259h = aVar.mo35005l();
        this.f35260i = aVar.mo35006m();
        this.f35261j = aVar.mo34999f();
        this.f35257f = aVar.f35267d;
        this.f35258g = aVar.f35268e;
        this.f35262k = aVar.mo35002i();
        this.f35263l = aVar.mo35004k();
    }

    /* renamed from: a */
    public String mo34982a() {
        return this.f35256e;
    }

    /* renamed from: b */
    public String mo34983b() {
        return this.f35258g;
    }

    /* renamed from: c */
    public String mo34984c() {
        return this.f35257f;
    }

    /* renamed from: d */
    public JSONObject mo34985d() {
        return this.f35261j;
    }

    /* renamed from: e */
    public int mo34986e() {
        return this.f35254c;
    }

    /* renamed from: f */
    public String mo34987f() {
        return this.f35255d;
    }

    /* renamed from: g */
    public JSONArray mo34988g() {
        return this.f35262k;
    }

    /* renamed from: h */
    public int mo34989h() {
        return this.f35253b;
    }

    /* renamed from: i */
    public long mo34990i() {
        return this.f35263l;
    }

    /* renamed from: j */
    public String mo34991j() {
        return this.f35259h;
    }

    /* renamed from: k */
    public JSONObject mo34992k() {
        return this.f35260i;
    }

    /* renamed from: l */
    public String mo34993l() {
        return this.f35252a;
    }
}
