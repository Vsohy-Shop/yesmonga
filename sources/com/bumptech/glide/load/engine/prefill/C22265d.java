package com.bumptech.glide.load.engine.prefill;

import android.graphics.Bitmap;
import androidx.annotation.C0344h1;
import androidx.annotation.C0363p0;
import com.bumptech.glide.util.C22633m;
import kotlinx.serialization.json.internal.C12361b;

/* renamed from: com.bumptech.glide.load.engine.prefill.d */
public final class C22265d {
    @C0344h1

    /* renamed from: e */
    public static final Bitmap.Config f57229e = Bitmap.Config.RGB_565;

    /* renamed from: a */
    public final int f57230a;

    /* renamed from: b */
    public final int f57231b;

    /* renamed from: c */
    public final Bitmap.Config f57232c;

    /* renamed from: d */
    public final int f57233d;

    /* renamed from: com.bumptech.glide.load.engine.prefill.d$a */
    public static class C22266a {

        /* renamed from: a */
        public final int f57234a;

        /* renamed from: b */
        public final int f57235b;

        /* renamed from: c */
        public Bitmap.Config f57236c;

        /* renamed from: d */
        public int f57237d;

        public C22266a(int i) {
            this(i, i);
        }

        /* renamed from: a */
        public C22265d mo66209a() {
            return new C22265d(this.f57234a, this.f57235b, this.f57236c, this.f57237d);
        }

        /* renamed from: b */
        public Bitmap.Config mo66210b() {
            return this.f57236c;
        }

        /* renamed from: c */
        public C22266a mo66211c(@C0363p0 Bitmap.Config config) {
            this.f57236c = config;
            return this;
        }

        /* renamed from: d */
        public C22266a mo66212d(int i) {
            if (i > 0) {
                this.f57237d = i;
                return this;
            }
            throw new IllegalArgumentException("Weight must be > 0");
        }

        public C22266a(int i, int i2) {
            this.f57237d = 1;
            if (i <= 0) {
                throw new IllegalArgumentException("Width must be > 0");
            } else if (i2 > 0) {
                this.f57234a = i;
                this.f57235b = i2;
            } else {
                throw new IllegalArgumentException("Height must be > 0");
            }
        }
    }

    public C22265d(int i, int i2, Bitmap.Config config, int i3) {
        this.f57232c = (Bitmap.Config) C22633m.m102625e(config, "Config must not be null");
        this.f57230a = i;
        this.f57231b = i2;
        this.f57233d = i3;
    }

    /* renamed from: a */
    public Bitmap.Config mo66202a() {
        return this.f57232c;
    }

    /* renamed from: b */
    public int mo66203b() {
        return this.f57231b;
    }

    /* renamed from: c */
    public int mo66204c() {
        return this.f57233d;
    }

    /* renamed from: d */
    public int mo66205d() {
        return this.f57230a;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C22265d)) {
            return false;
        }
        C22265d dVar = (C22265d) obj;
        if (this.f57231b == dVar.f57231b && this.f57230a == dVar.f57230a && this.f57233d == dVar.f57233d && this.f57232c == dVar.f57232c) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (((((this.f57230a * 31) + this.f57231b) * 31) + this.f57232c.hashCode()) * 31) + this.f57233d;
    }

    public String toString() {
        return "PreFillSize{width=" + this.f57230a + ", height=" + this.f57231b + ", config=" + this.f57232c + ", weight=" + this.f57233d + C12361b.f30259j;
    }
}
