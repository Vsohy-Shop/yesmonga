package androidx.webkit;

import androidx.annotation.C0359n0;
import androidx.annotation.RestrictTo;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: androidx.webkit.d */
public final class C20841d {

    /* renamed from: d */
    public static final String f53901d = "http";

    /* renamed from: e */
    public static final String f53902e = "https";

    /* renamed from: f */
    public static final String f53903f = "*";

    /* renamed from: g */
    public static final String f53904g = "direct://";

    /* renamed from: h */
    public static final String f53905h = "<local>";

    /* renamed from: i */
    public static final String f53906i = "<-loopback>";

    /* renamed from: a */
    public List<C20843b> f53907a;

    /* renamed from: b */
    public List<String> f53908b;

    /* renamed from: c */
    public boolean f53909c;

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    @Retention(RetentionPolicy.SOURCE)
    /* renamed from: androidx.webkit.d$c */
    public @interface C20844c {
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public C20841d(@C0359n0 List<C20843b> list, @C0359n0 List<String> list2, boolean z) {
        this.f53907a = list;
        this.f53908b = list2;
        this.f53909c = z;
    }

    @C0359n0
    /* renamed from: a */
    public List<String> mo62582a() {
        return Collections.unmodifiableList(this.f53908b);
    }

    @C0359n0
    /* renamed from: b */
    public List<C20843b> mo62583b() {
        return Collections.unmodifiableList(this.f53907a);
    }

    /* renamed from: c */
    public boolean mo62584c() {
        return this.f53909c;
    }

    /* renamed from: androidx.webkit.d$b */
    public static final class C20843b {

        /* renamed from: a */
        public String f53913a;

        /* renamed from: b */
        public String f53914b;

        @RestrictTo({RestrictTo.Scope.LIBRARY})
        public C20843b(@C0359n0 String str, @C0359n0 String str2) {
            this.f53913a = str;
            this.f53914b = str2;
        }

        @C0359n0
        /* renamed from: a */
        public String mo62597a() {
            return this.f53913a;
        }

        @C0359n0
        /* renamed from: b */
        public String mo62598b() {
            return this.f53914b;
        }

        @RestrictTo({RestrictTo.Scope.LIBRARY})
        public C20843b(@C0359n0 String str) {
            this("*", str);
        }
    }

    /* renamed from: androidx.webkit.d$a */
    public static final class C20842a {

        /* renamed from: a */
        public List<C20843b> f53910a;

        /* renamed from: b */
        public List<String> f53911b;

        /* renamed from: c */
        public boolean f53912c;

        public C20842a() {
            this.f53912c = false;
            this.f53910a = new ArrayList();
            this.f53911b = new ArrayList();
        }

        @C0359n0
        /* renamed from: a */
        public C20842a mo62585a(@C0359n0 String str) {
            this.f53911b.add(str);
            return this;
        }

        @C0359n0
        /* renamed from: b */
        public C20842a mo62586b() {
            return mo62587c("*");
        }

        @C0359n0
        /* renamed from: c */
        public C20842a mo62587c(@C0359n0 String str) {
            this.f53910a.add(new C20843b(str, C20841d.f53904g));
            return this;
        }

        @C0359n0
        /* renamed from: d */
        public C20842a mo62588d(@C0359n0 String str) {
            this.f53910a.add(new C20843b(str));
            return this;
        }

        @C0359n0
        /* renamed from: e */
        public C20842a mo62589e(@C0359n0 String str, @C0359n0 String str2) {
            this.f53910a.add(new C20843b(str2, str));
            return this;
        }

        @C0359n0
        /* renamed from: f */
        public C20841d mo62590f() {
            return new C20841d(mo62593i(), mo62591g(), mo62595k());
        }

        @C0359n0
        /* renamed from: g */
        public final List<String> mo62591g() {
            return this.f53911b;
        }

        @C0359n0
        /* renamed from: h */
        public C20842a mo62592h() {
            return mo62585a(C20841d.f53905h);
        }

        @C0359n0
        /* renamed from: i */
        public final List<C20843b> mo62593i() {
            return this.f53910a;
        }

        @C0359n0
        /* renamed from: j */
        public C20842a mo62594j() {
            return mo62585a(C20841d.f53906i);
        }

        /* renamed from: k */
        public final boolean mo62595k() {
            return this.f53912c;
        }

        @C0359n0
        /* renamed from: l */
        public C20842a mo62596l(boolean z) {
            this.f53912c = z;
            return this;
        }

        public C20842a(@C0359n0 C20841d dVar) {
            this.f53912c = false;
            this.f53910a = dVar.mo62583b();
            this.f53911b = dVar.mo62582a();
            this.f53912c = dVar.mo62584c();
        }
    }
}
