package com.bumptech.glide.load.engine.bitmap_recycle;

import android.graphics.Bitmap;
import androidx.annotation.C0344h1;
import com.bumptech.glide.util.C22635o;

/* renamed from: com.bumptech.glide.load.engine.bitmap_recycle.c */
public class C22158c implements C22175l {

    /* renamed from: a */
    public final C22160b f56943a = new C22160b();

    /* renamed from: b */
    public final C22165h<C22159a, Bitmap> f56944b = new C22165h<>();

    @C0344h1
    /* renamed from: com.bumptech.glide.load.engine.bitmap_recycle.c$a */
    public static class C22159a implements C22176m {

        /* renamed from: a */
        public final C22160b f56945a;

        /* renamed from: b */
        public int f56946b;

        /* renamed from: c */
        public int f56947c;

        /* renamed from: d */
        public Bitmap.Config f56948d;

        public C22159a(C22160b bVar) {
            this.f56945a = bVar;
        }

        /* renamed from: a */
        public void mo65943a() {
            this.f56945a.mo65952c(this);
        }

        /* renamed from: b */
        public void mo65944b(int i, int i2, Bitmap.Config config) {
            this.f56946b = i;
            this.f56947c = i2;
            this.f56948d = config;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof C22159a)) {
                return false;
            }
            C22159a aVar = (C22159a) obj;
            if (this.f56946b == aVar.f56946b && this.f56947c == aVar.f56947c && this.f56948d == aVar.f56948d) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            int i;
            int i2 = ((this.f56946b * 31) + this.f56947c) * 31;
            Bitmap.Config config = this.f56948d;
            if (config != null) {
                i = config.hashCode();
            } else {
                i = 0;
            }
            return i2 + i;
        }

        public String toString() {
            return C22158c.m100921g(this.f56946b, this.f56947c, this.f56948d);
        }
    }

    @C0344h1
    /* renamed from: com.bumptech.glide.load.engine.bitmap_recycle.c$b */
    public static class C22160b extends C22161d<C22159a> {
        /* renamed from: d */
        public C22159a mo65948a() {
            return new C22159a(this);
        }

        /* renamed from: e */
        public C22159a mo65950e(int i, int i2, Bitmap.Config config) {
            C22159a aVar = (C22159a) mo65951b();
            aVar.mo65944b(i, i2, config);
            return aVar;
        }
    }

    /* renamed from: g */
    public static String m100921g(int i, int i2, Bitmap.Config config) {
        return "[" + i + "x" + i2 + "], " + config;
    }

    /* renamed from: h */
    public static String m100922h(Bitmap bitmap) {
        return m100921g(bitmap.getWidth(), bitmap.getHeight(), bitmap.getConfig());
    }

    /* renamed from: a */
    public String mo65936a(Bitmap bitmap) {
        return m100922h(bitmap);
    }

    /* renamed from: b */
    public Bitmap mo65937b() {
        return this.f56944b.mo65966f();
    }

    /* renamed from: c */
    public String mo65938c(int i, int i2, Bitmap.Config config) {
        return m100921g(i, i2, config);
    }

    /* renamed from: d */
    public void mo65939d(Bitmap bitmap) {
        this.f56944b.mo65965d(this.f56943a.mo65950e(bitmap.getWidth(), bitmap.getHeight(), bitmap.getConfig()), bitmap);
    }

    /* renamed from: e */
    public int mo65940e(Bitmap bitmap) {
        return C22635o.m102633h(bitmap);
    }

    /* renamed from: f */
    public Bitmap mo65941f(int i, int i2, Bitmap.Config config) {
        return this.f56944b.mo65962a(this.f56943a.mo65950e(i, i2, config));
    }

    public String toString() {
        return "AttributeStrategy:\n  " + this.f56944b;
    }
}
