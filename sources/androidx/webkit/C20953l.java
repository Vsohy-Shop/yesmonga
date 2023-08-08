package androidx.webkit;

import androidx.annotation.C0359n0;
import androidx.annotation.RestrictTo;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

/* renamed from: androidx.webkit.l */
public class C20953l {

    /* renamed from: d */
    public static final int f54039d = 0;

    /* renamed from: e */
    public static final int f54040e = 1;

    /* renamed from: f */
    public static final int f54041f = 2;

    /* renamed from: g */
    public static final int f54042g = 4;

    /* renamed from: h */
    public static final int f54043h = 8;

    /* renamed from: i */
    public static final int f54044i = 16;

    /* renamed from: j */
    public static final int f54045j = 32;

    /* renamed from: k */
    public static final int f54046k = 64;

    /* renamed from: l */
    public static final int f54047l = 0;

    /* renamed from: m */
    public static final int f54048m = 1;

    /* renamed from: a */
    public int f54049a;

    /* renamed from: b */
    public final List<String> f54050b;

    /* renamed from: c */
    public int f54051c;

    /* renamed from: androidx.webkit.l$a */
    public static class C20954a {

        /* renamed from: a */
        public int f54052a = 0;

        /* renamed from: b */
        public final List<String> f54053b = new ArrayList();

        /* renamed from: c */
        public int f54054c = 1;

        @C0359n0
        /* renamed from: a */
        public C20954a mo62720a(@C0359n0 Collection<String> collection) {
            this.f54053b.addAll(collection);
            return this;
        }

        @C0359n0
        /* renamed from: b */
        public C20954a mo62721b(@C0359n0 int... iArr) {
            for (int i : iArr) {
                this.f54052a = i | this.f54052a;
            }
            return this;
        }

        @C0359n0
        /* renamed from: c */
        public C20954a mo62722c(@C0359n0 String... strArr) {
            this.f54053b.addAll(Arrays.asList(strArr));
            return this;
        }

        @C0359n0
        /* renamed from: d */
        public C20953l mo62723d() {
            return new C20953l(this.f54052a, this.f54053b, this.f54054c);
        }

        @C0359n0
        /* renamed from: e */
        public C20954a mo62724e(int i) {
            this.f54054c = i;
            return this;
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    @Retention(RetentionPolicy.SOURCE)
    /* renamed from: androidx.webkit.l$b */
    public @interface C20955b {
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    @Retention(RetentionPolicy.SOURCE)
    /* renamed from: androidx.webkit.l$c */
    public @interface C20956c {
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public C20953l(int i, @C0359n0 List<String> list, int i2) {
        ArrayList arrayList = new ArrayList();
        this.f54050b = arrayList;
        this.f54049a = i;
        arrayList.addAll(list);
        this.f54051c = i2;
    }

    @C0359n0
    /* renamed from: a */
    public List<String> mo62717a() {
        return this.f54050b;
    }

    /* renamed from: b */
    public int mo62718b() {
        return this.f54049a;
    }

    /* renamed from: c */
    public int mo62719c() {
        return this.f54051c;
    }
}
