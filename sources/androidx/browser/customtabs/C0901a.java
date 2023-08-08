package androidx.browser.customtabs;

import android.os.Bundle;
import androidx.annotation.C0354l;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;

/* renamed from: androidx.browser.customtabs.a */
public final class C0901a {
    @C0363p0
    @C0354l

    /* renamed from: a */
    public final Integer f2813a;
    @C0363p0
    @C0354l

    /* renamed from: b */
    public final Integer f2814b;
    @C0363p0
    @C0354l

    /* renamed from: c */
    public final Integer f2815c;
    @C0363p0
    @C0354l

    /* renamed from: d */
    public final Integer f2816d;

    /* renamed from: androidx.browser.customtabs.a$a */
    public static final class C0902a {
        @C0363p0
        @C0354l

        /* renamed from: a */
        public Integer f2817a;
        @C0363p0
        @C0354l

        /* renamed from: b */
        public Integer f2818b;
        @C0363p0
        @C0354l

        /* renamed from: c */
        public Integer f2819c;
        @C0363p0
        @C0354l

        /* renamed from: d */
        public Integer f2820d;

        @C0359n0
        /* renamed from: a */
        public C0901a mo3891a() {
            return new C0901a(this.f2817a, this.f2818b, this.f2819c, this.f2820d);
        }

        @C0359n0
        /* renamed from: b */
        public C0902a mo3892b(@C0354l int i) {
            this.f2819c = Integer.valueOf(i | -16777216);
            return this;
        }

        @C0359n0
        /* renamed from: c */
        public C0902a mo3893c(@C0354l int i) {
            this.f2820d = Integer.valueOf(i);
            return this;
        }

        @C0359n0
        /* renamed from: d */
        public C0902a mo3894d(@C0354l int i) {
            this.f2818b = Integer.valueOf(i);
            return this;
        }

        @C0359n0
        /* renamed from: e */
        public C0902a mo3895e(@C0354l int i) {
            this.f2817a = Integer.valueOf(i | -16777216);
            return this;
        }
    }

    public C0901a(@C0363p0 @C0354l Integer num, @C0363p0 @C0354l Integer num2, @C0363p0 @C0354l Integer num3, @C0363p0 @C0354l Integer num4) {
        this.f2813a = num;
        this.f2814b = num2;
        this.f2815c = num3;
        this.f2816d = num4;
    }

    @C0359n0
    /* renamed from: a */
    public static C0901a m4065a(@C0363p0 Bundle bundle) {
        if (bundle == null) {
            bundle = new Bundle(0);
        }
        return new C0901a((Integer) bundle.get(C0912d.f2877k), (Integer) bundle.get(C0912d.f2885s), (Integer) bundle.get(C0912d.f2864M), (Integer) bundle.get(C0912d.f2865N));
    }

    @C0359n0
    /* renamed from: b */
    public Bundle mo3889b() {
        Bundle bundle = new Bundle();
        Integer num = this.f2813a;
        if (num != null) {
            bundle.putInt(C0912d.f2877k, num.intValue());
        }
        Integer num2 = this.f2814b;
        if (num2 != null) {
            bundle.putInt(C0912d.f2885s, num2.intValue());
        }
        Integer num3 = this.f2815c;
        if (num3 != null) {
            bundle.putInt(C0912d.f2864M, num3.intValue());
        }
        Integer num4 = this.f2816d;
        if (num4 != null) {
            bundle.putInt(C0912d.f2865N, num4.intValue());
        }
        return bundle;
    }

    @C0359n0
    /* renamed from: c */
    public C0901a mo3890c(@C0359n0 C0901a aVar) {
        Integer num = this.f2813a;
        if (num == null) {
            num = aVar.f2813a;
        }
        Integer num2 = this.f2814b;
        if (num2 == null) {
            num2 = aVar.f2814b;
        }
        Integer num3 = this.f2815c;
        if (num3 == null) {
            num3 = aVar.f2815c;
        }
        Integer num4 = this.f2816d;
        if (num4 == null) {
            num4 = aVar.f2816d;
        }
        return new C0901a(num, num2, num3, num4);
    }
}
