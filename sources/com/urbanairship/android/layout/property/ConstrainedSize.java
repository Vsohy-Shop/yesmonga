package com.urbanairship.android.layout.property;

import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import com.urbanairship.android.layout.util.C35920l;
import com.urbanairship.json.C9323b;
import com.urbanairship.json.JsonException;

public class ConstrainedSize extends Size {
    @C0363p0

    /* renamed from: d */
    public final C35812b f88441d;
    @C0363p0

    /* renamed from: e */
    public final C35812b f88442e;
    @C0363p0

    /* renamed from: f */
    public final C35812b f88443f;
    @C0363p0

    /* renamed from: g */
    public final C35812b f88444g;

    public enum ConstrainedDimensionType {
        PERCENT,
        ABSOLUTE
    }

    /* renamed from: com.urbanairship.android.layout.property.ConstrainedSize$a */
    public static class C35811a extends C35812b {
        public C35811a(@C0359n0 String str) {
            super(str, ConstrainedDimensionType.ABSOLUTE);
        }

        /* renamed from: a */
        public float mo107251a() {
            return Float.parseFloat(this.f88448a);
        }

        /* renamed from: b */
        public int mo107252b() {
            return Integer.parseInt(this.f88448a);
        }

        @C0359n0
        public String toString() {
            return mo107252b() + "dp";
        }
    }

    /* renamed from: com.urbanairship.android.layout.property.ConstrainedSize$b */
    public static abstract class C35812b {
        @C0359n0

        /* renamed from: a */
        public final String f88448a;
        @C0359n0

        /* renamed from: b */
        public final ConstrainedDimensionType f88449b;

        public C35812b(@C0359n0 String str, @C0359n0 ConstrainedDimensionType constrainedDimensionType) {
            this.f88448a = str;
            this.f88449b = constrainedDimensionType;
        }

        @C0363p0
        /* renamed from: f */
        public static C35812b m147638f(@C0363p0 String str) {
            if (str == null) {
                return null;
            }
            if (C35920l.m148109b(str)) {
                return new C35813c(str);
            }
            return new C35811a(str);
        }

        /* renamed from: a */
        public abstract float mo107251a();

        /* renamed from: b */
        public abstract int mo107252b();

        @C0359n0
        /* renamed from: c */
        public ConstrainedDimensionType mo107254c() {
            return this.f88449b;
        }

        /* renamed from: d */
        public boolean mo107255d() {
            return this.f88449b == ConstrainedDimensionType.ABSOLUTE;
        }

        /* renamed from: e */
        public boolean mo107256e() {
            return this.f88449b == ConstrainedDimensionType.PERCENT;
        }
    }

    /* renamed from: com.urbanairship.android.layout.property.ConstrainedSize$c */
    public static class C35813c extends C35812b {
        public C35813c(@C0359n0 String str) {
            super(str, ConstrainedDimensionType.PERCENT);
        }

        /* renamed from: a */
        public float mo107251a() {
            return C35920l.m148110c(this.f88448a);
        }

        /* renamed from: b */
        public int mo107252b() {
            return (int) mo107251a();
        }

        @C0359n0
        public String toString() {
            return ((int) (mo107251a() * 100.0f)) + "%";
        }
    }

    public ConstrainedSize(@C0359n0 String str, @C0359n0 String str2, @C0363p0 String str3, @C0363p0 String str4, @C0363p0 String str5, @C0363p0 String str6) {
        super(str, str2);
        this.f88441d = C35812b.m147638f(str3);
        this.f88442e = C35812b.m147638f(str4);
        this.f88443f = C35812b.m147638f(str5);
        this.f88444g = C35812b.m147638f(str6);
    }

    @C0359n0
    /* renamed from: d */
    public static ConstrainedSize m147631d(@C0359n0 C9323b bVar) throws JsonException {
        String a = bVar.mo18801A("width").mo18755a();
        String a2 = bVar.mo18801A("height").mo18755a();
        if (a != null && a2 != null) {
            return new ConstrainedSize(a, a2, bVar.mo18801A("min_width").mo18755a(), bVar.mo18801A("min_height").mo18755a(), bVar.mo18801A("max_width").mo18755a(), bVar.mo18801A("max_height").mo18755a());
        }
        throw new JsonException("Size requires both width and height!");
    }

    @C0363p0
    /* renamed from: e */
    public C35812b mo107246e() {
        return this.f88444g;
    }

    @C0363p0
    /* renamed from: f */
    public C35812b mo107247f() {
        return this.f88443f;
    }

    @C0363p0
    /* renamed from: g */
    public C35812b mo107248g() {
        return this.f88442e;
    }

    @C0363p0
    /* renamed from: h */
    public C35812b mo107249h() {
        return this.f88441d;
    }

    @C0359n0
    public String toString() {
        return "ConstrainedSize { width=" + mo107290c() + ", height=" + mo107289b() + ", minWidth=" + mo107249h() + ", minHeight=" + mo107248g() + ", maxWidth=" + mo107247f() + ", maxHeight=" + mo107246e() + " }";
    }
}
