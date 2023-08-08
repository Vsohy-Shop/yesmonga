package com.urbanairship.iam.html;

import android.graphics.Color;
import androidx.annotation.C0354l;
import androidx.annotation.C0359n0;
import androidx.annotation.C0366r;
import androidx.annotation.C0379x;
import com.urbanairship.iam.C9166d;
import com.urbanairship.json.C9323b;
import com.urbanairship.json.JsonException;
import com.urbanairship.json.JsonValue;
import com.urbanairship.util.C9654i;
import com.urbanairship.util.C9658k;

/* renamed from: com.urbanairship.iam.html.c */
public class C9198c implements C9166d {
    @C0359n0

    /* renamed from: X */
    public static final String f25026X = "require_connectivity";
    @C0359n0

    /* renamed from: x */
    public static final String f25027x = "width";
    @C0359n0

    /* renamed from: y */
    public static final String f25028y = "height";
    @C0359n0

    /* renamed from: z */
    public static final String f25029z = "aspect_lock";

    /* renamed from: a */
    public final String f25030a;

    /* renamed from: b */
    public final int f25031b;

    /* renamed from: c */
    public final int f25032c;

    /* renamed from: d */
    public final float f25033d;

    /* renamed from: e */
    public final boolean f25034e;

    /* renamed from: f */
    public final int f25035f;

    /* renamed from: g */
    public final int f25036g;

    /* renamed from: v */
    public final boolean f25037v;

    /* renamed from: w */
    public final boolean f25038w;

    @C0359n0
    /* renamed from: g */
    public static C9198c m34513g(@C0359n0 JsonValue jsonValue) throws JsonException {
        C9323b A = jsonValue.mo18749A();
        C9200b r = m34514r();
        if (A.mo18805e(C9166d.f24875p0)) {
            try {
                r.mo18475n(Color.parseColor(A.mo18801A(C9166d.f24875p0).mo18750B()));
            } catch (IllegalArgumentException e) {
                throw new JsonException("Invalid dismiss button color: " + A.mo18801A(C9166d.f24875p0), e);
            }
        }
        if (A.mo18805e("url")) {
            String l = A.mo18801A("url").mo18769l();
            if (l != null) {
                r.mo18478q(l);
            } else {
                throw new JsonException("Invalid url: " + A.mo18801A("url"));
            }
        }
        if (A.mo18805e("background_color")) {
            try {
                r.mo18473l(Color.parseColor(A.mo18801A("background_color").mo18750B()));
            } catch (IllegalArgumentException e2) {
                throw new JsonException("Invalid background color: " + A.mo18801A("background_color"), e2);
            }
        }
        if (A.mo18805e("border_radius")) {
            if (A.mo18801A("border_radius").mo18782x()) {
                r.mo18474m(A.mo18801A("border_radius").mo18760e(0.0f));
            } else {
                throw new JsonException("Border radius must be a number " + A.mo18801A("border_radius"));
            }
        }
        if (A.mo18805e(C9166d.f24879t0)) {
            if (A.mo18801A(C9166d.f24879t0).mo18772o()) {
                r.mo18472k(A.mo18801A(C9166d.f24879t0).mo18757c(false));
            } else {
                throw new JsonException("Allow fullscreen display must be a boolean " + A.mo18801A(C9166d.f24879t0));
            }
        }
        if (A.mo18805e(f25026X)) {
            if (A.mo18801A(f25026X).mo18772o()) {
                r.mo18476o(A.mo18801A(f25026X).mo18757c(true));
            } else {
                throw new JsonException("Require connectivity must be a boolean " + A.mo18801A(f25026X));
            }
        }
        if (A.mo18805e("width") && !A.mo18801A("width").mo18782x()) {
            throw new JsonException("Width must be a number " + A.mo18801A("width"));
        } else if (A.mo18805e("height") && !A.mo18801A("height").mo18782x()) {
            throw new JsonException("Height must be a number " + A.mo18801A("height"));
        } else if (!A.mo18805e(f25029z) || A.mo18801A(f25029z).mo18772o()) {
            r.mo18477p(A.mo18801A("width").mo18762f(0), A.mo18801A("height").mo18762f(0), A.mo18801A(f25029z).mo18757c(false));
            try {
                return r.mo18471j();
            } catch (IllegalArgumentException e3) {
                throw new JsonException("Invalid html message JSON: " + A, e3);
            }
        } else {
            throw new JsonException("Aspect lock must be a boolean " + A.mo18801A(f25029z));
        }
    }

    @C0359n0
    /* renamed from: r */
    public static C9200b m34514r() {
        return new C9200b();
    }

    @C0359n0
    /* renamed from: s */
    public static C9200b m34515s(@C0359n0 C9198c cVar) {
        return new C9200b();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C9198c cVar = (C9198c) obj;
        if (this.f25031b == cVar.f25031b && this.f25032c == cVar.f25032c && Float.compare(cVar.f25033d, this.f25033d) == 0 && this.f25034e == cVar.f25034e && this.f25035f == cVar.f25035f && this.f25036g == cVar.f25036g && this.f25037v == cVar.f25037v && this.f25038w == cVar.f25038w) {
            return this.f25030a.equals(cVar.f25030a);
        }
        return false;
    }

    /* renamed from: h */
    public boolean mo18460h() {
        return this.f25037v;
    }

    public int hashCode() {
        int i;
        int hashCode = ((((this.f25030a.hashCode() * 31) + this.f25031b) * 31) + this.f25032c) * 31;
        float f = this.f25033d;
        if (f != 0.0f) {
            i = Float.floatToIntBits(f);
        } else {
            i = 0;
        }
        return ((((((((((hashCode + i) * 31) + (this.f25034e ? 1 : 0)) * 31) + this.f25035f) * 31) + this.f25036g) * 31) + (this.f25037v ? 1 : 0)) * 31) + (this.f25038w ? 1 : 0);
    }

    @C0354l
    /* renamed from: i */
    public int mo18462i() {
        return this.f25032c;
    }

    /* renamed from: j */
    public float mo18463j() {
        return this.f25033d;
    }

    @C0354l
    /* renamed from: k */
    public int mo18464k() {
        return this.f25031b;
    }

    @C0366r
    /* renamed from: l */
    public long mo18465l() {
        return (long) this.f25036g;
    }

    /* renamed from: m */
    public boolean mo18466m() {
        return this.f25038w;
    }

    @C0359n0
    /* renamed from: n */
    public String mo18467n() {
        return this.f25030a;
    }

    @C0366r
    /* renamed from: o */
    public long mo18468o() {
        return (long) this.f25035f;
    }

    /* renamed from: p */
    public boolean mo18469p() {
        return this.f25034e;
    }

    @C0359n0
    /* renamed from: q */
    public JsonValue mo17264q() {
        return C9323b.m35017y().mo18823g(C9166d.f24875p0, C9658k.m36180a(this.f25031b)).mo18823g("url", this.f25030a).mo18823g("background_color", C9658k.m36180a(this.f25032c)).mo18819c("border_radius", (double) this.f25033d).mo18824h(C9166d.f24879t0, this.f25034e).mo18820d("width", this.f25035f).mo18820d("height", this.f25036g).mo18824h(f25029z, this.f25037v).mo18824h(f25026X, this.f25038w).mo18817a().mo17264q();
    }

    @C0359n0
    public String toString() {
        return mo17264q().toString();
    }

    /* renamed from: com.urbanairship.iam.html.c$b */
    public static class C9200b {

        /* renamed from: a */
        public String f25039a;

        /* renamed from: b */
        public int f25040b;

        /* renamed from: c */
        public int f25041c;

        /* renamed from: d */
        public float f25042d;

        /* renamed from: e */
        public boolean f25043e;

        /* renamed from: f */
        public int f25044f;

        /* renamed from: g */
        public int f25045g;

        /* renamed from: h */
        public boolean f25046h;

        /* renamed from: i */
        public boolean f25047i;

        @C0359n0
        /* renamed from: j */
        public C9198c mo18471j() {
            boolean z;
            boolean z2 = true;
            if (this.f25042d >= 0.0f) {
                z = true;
            } else {
                z = false;
            }
            C9654i.m36165a(z, "Border radius must be >= 0");
            if (this.f25039a == null) {
                z2 = false;
            }
            C9654i.m36165a(z2, "Missing URL");
            return new C9198c(this);
        }

        @C0359n0
        /* renamed from: k */
        public C9200b mo18472k(boolean z) {
            this.f25043e = z;
            return this;
        }

        @C0359n0
        /* renamed from: l */
        public C9200b mo18473l(@C0354l int i) {
            this.f25041c = i;
            return this;
        }

        @C0359n0
        /* renamed from: m */
        public C9200b mo18474m(@C0379x(from = 0.0d) float f) {
            this.f25042d = f;
            return this;
        }

        @C0359n0
        /* renamed from: n */
        public C9200b mo18475n(@C0354l int i) {
            this.f25040b = i;
            return this;
        }

        @C0359n0
        /* renamed from: o */
        public C9200b mo18476o(boolean z) {
            this.f25047i = z;
            return this;
        }

        @C0359n0
        /* renamed from: p */
        public C9200b mo18477p(@C0366r int i, @C0366r int i2, boolean z) {
            this.f25044f = i;
            this.f25045g = i2;
            this.f25046h = z;
            return this;
        }

        @C0359n0
        /* renamed from: q */
        public C9200b mo18478q(@C0359n0 String str) {
            this.f25039a = str;
            return this;
        }

        public C9200b() {
            this.f25040b = -16777216;
            this.f25041c = -1;
            this.f25047i = true;
        }

        public C9200b(@C0359n0 C9198c cVar) {
            this.f25040b = -16777216;
            this.f25041c = -1;
            this.f25047i = true;
            this.f25039a = cVar.f25030a;
            this.f25040b = cVar.f25031b;
            this.f25041c = cVar.f25032c;
            this.f25044f = cVar.f25035f;
            this.f25045g = cVar.f25036g;
            this.f25046h = cVar.f25037v;
        }
    }

    public C9198c(@C0359n0 C9200b bVar) {
        this.f25030a = bVar.f25039a;
        this.f25031b = bVar.f25040b;
        this.f25032c = bVar.f25041c;
        this.f25033d = bVar.f25042d;
        this.f25034e = bVar.f25043e;
        this.f25035f = bVar.f25044f;
        this.f25036g = bVar.f25045g;
        this.f25037v = bVar.f25046h;
        this.f25038w = bVar.f25047i;
    }
}
