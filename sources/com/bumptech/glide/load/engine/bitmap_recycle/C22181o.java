package com.bumptech.glide.load.engine.bitmap_recycle;

import android.graphics.Bitmap;
import androidx.annotation.C0344h1;
import androidx.annotation.C0363p0;
import androidx.annotation.C0376v0;
import com.bumptech.glide.util.C22635o;
import java.util.NavigableMap;

@C0376v0(19)
/* renamed from: com.bumptech.glide.load.engine.bitmap_recycle.o */
public final class C22181o implements C22175l {

    /* renamed from: d */
    public static final int f56997d = 8;

    /* renamed from: a */
    public final C22183b f56998a = new C22183b();

    /* renamed from: b */
    public final C22165h<C22182a, Bitmap> f56999b = new C22165h<>();

    /* renamed from: c */
    public final NavigableMap<Integer, Integer> f57000c = new PrettyPrintTreeMap();

    @C0344h1
    /* renamed from: com.bumptech.glide.load.engine.bitmap_recycle.o$a */
    public static final class C22182a implements C22176m {

        /* renamed from: a */
        public final C22183b f57001a;

        /* renamed from: b */
        public int f57002b;

        public C22182a(C22183b bVar) {
            this.f57001a = bVar;
        }

        /* renamed from: a */
        public void mo65943a() {
            this.f57001a.mo65952c(this);
        }

        /* renamed from: b */
        public void mo66014b(int i) {
            this.f57002b = i;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof C22182a) || this.f57002b != ((C22182a) obj).f57002b) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            return this.f57002b;
        }

        public String toString() {
            return C22181o.m101045h(this.f57002b);
        }
    }

    @C0344h1
    /* renamed from: com.bumptech.glide.load.engine.bitmap_recycle.o$b */
    public static class C22183b extends C22161d<C22182a> {
        /* renamed from: d */
        public C22182a mo65948a() {
            return new C22182a(this);
        }

        /* renamed from: e */
        public C22182a mo66019e(int i) {
            C22182a aVar = (C22182a) super.mo65951b();
            aVar.mo66014b(i);
            return aVar;
        }
    }

    /* renamed from: h */
    public static String m101045h(int i) {
        return "[" + i + "]";
    }

    /* renamed from: i */
    public static String m101046i(Bitmap bitmap) {
        return m101045h(C22635o.m102633h(bitmap));
    }

    /* renamed from: a */
    public String mo65936a(Bitmap bitmap) {
        return m101046i(bitmap);
    }

    @C0363p0
    /* renamed from: b */
    public Bitmap mo65937b() {
        Bitmap f = this.f56999b.mo65966f();
        if (f != null) {
            mo66012g(Integer.valueOf(C22635o.m102633h(f)));
        }
        return f;
    }

    /* renamed from: c */
    public String mo65938c(int i, int i2, Bitmap.Config config) {
        return m101045h(C22635o.m102632g(i, i2, config));
    }

    /* renamed from: d */
    public void mo65939d(Bitmap bitmap) {
        C22182a e = this.f56998a.mo66019e(C22635o.m102633h(bitmap));
        this.f56999b.mo65965d(e, bitmap);
        Integer num = this.f57000c.get(Integer.valueOf(e.f57002b));
        NavigableMap<Integer, Integer> navigableMap = this.f57000c;
        Integer valueOf = Integer.valueOf(e.f57002b);
        int i = 1;
        if (num != null) {
            i = 1 + num.intValue();
        }
        navigableMap.put(valueOf, Integer.valueOf(i));
    }

    /* renamed from: e */
    public int mo65940e(Bitmap bitmap) {
        return C22635o.m102633h(bitmap);
    }

    @C0363p0
    /* renamed from: f */
    public Bitmap mo65941f(int i, int i2, Bitmap.Config config) {
        int g = C22635o.m102632g(i, i2, config);
        C22182a e = this.f56998a.mo66019e(g);
        Integer ceilingKey = this.f57000c.ceilingKey(Integer.valueOf(g));
        if (!(ceilingKey == null || ceilingKey.intValue() == g || ceilingKey.intValue() > g * 8)) {
            this.f56998a.mo65952c(e);
            e = this.f56998a.mo66019e(ceilingKey.intValue());
        }
        Bitmap a = this.f56999b.mo65962a(e);
        if (a != null) {
            a.reconfigure(i, i2, config);
            mo66012g(ceilingKey);
        }
        return a;
    }

    /* renamed from: g */
    public final void mo66012g(Integer num) {
        Integer num2 = this.f57000c.get(num);
        if (num2.intValue() == 1) {
            this.f57000c.remove(num);
        } else {
            this.f57000c.put(num, Integer.valueOf(num2.intValue() - 1));
        }
    }

    public String toString() {
        return "SizeStrategy:\n  " + this.f56999b + "\n  SortedSizes" + this.f57000c;
    }
}
