package androidx.camera.core;

import android.util.Rational;
import androidx.annotation.C0359n0;
import androidx.annotation.RestrictTo;
import androidx.core.util.C18001r;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@C1631k0
/* renamed from: androidx.camera.core.e4 */
public final class C1394e4 {

    /* renamed from: e */
    public static final int f4039e = 0;

    /* renamed from: f */
    public static final int f4040f = 1;

    /* renamed from: g */
    public static final int f4041g = 2;

    /* renamed from: h */
    public static final int f4042h = 3;

    /* renamed from: a */
    public int f4043a;
    @C0359n0

    /* renamed from: b */
    public Rational f4044b;

    /* renamed from: c */
    public int f4045c;

    /* renamed from: d */
    public int f4046d;

    @C1631k0
    /* renamed from: androidx.camera.core.e4$a */
    public static final class C1395a {

        /* renamed from: e */
        public static final int f4047e = 0;

        /* renamed from: f */
        public static final int f4048f = 1;

        /* renamed from: a */
        public int f4049a = 1;

        /* renamed from: b */
        public final Rational f4050b;

        /* renamed from: c */
        public final int f4051c;

        /* renamed from: d */
        public int f4052d = 0;

        public C1395a(@C0359n0 Rational rational, int i) {
            this.f4050b = rational;
            this.f4051c = i;
        }

        @C0359n0
        /* renamed from: a */
        public C1394e4 mo5094a() {
            C18001r.m81776m(this.f4050b, "The crop aspect ratio must be set.");
            return new C1394e4(this.f4049a, this.f4050b, this.f4051c, this.f4052d);
        }

        @C0359n0
        /* renamed from: b */
        public C1395a mo5095b(int i) {
            this.f4052d = i;
            return this;
        }

        @C0359n0
        /* renamed from: c */
        public C1395a mo5096c(int i) {
            this.f4049a = i;
            return this;
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    @Retention(RetentionPolicy.SOURCE)
    /* renamed from: androidx.camera.core.e4$b */
    public @interface C1396b {
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    @Retention(RetentionPolicy.SOURCE)
    /* renamed from: androidx.camera.core.e4$c */
    public @interface C1397c {
    }

    public C1394e4(int i, @C0359n0 Rational rational, int i2, int i3) {
        this.f4043a = i;
        this.f4044b = rational;
        this.f4045c = i2;
        this.f4046d = i3;
    }

    @C0359n0
    /* renamed from: a */
    public Rational mo5090a() {
        return this.f4044b;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* renamed from: b */
    public int mo5091b() {
        return this.f4046d;
    }

    /* renamed from: c */
    public int mo5092c() {
        return this.f4045c;
    }

    /* renamed from: d */
    public int mo5093d() {
        return this.f4043a;
    }
}
