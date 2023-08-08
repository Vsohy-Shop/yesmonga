package com.urbanairship.android.layout.property;

import androidx.annotation.C0359n0;
import com.urbanairship.android.layout.util.C35920l;
import com.urbanairship.json.C9323b;
import com.urbanairship.json.JsonException;

public class Size {
    @C0359n0

    /* renamed from: c */
    public static final String f88510c = "auto";
    @C0359n0

    /* renamed from: a */
    public final C35820c f88511a;
    @C0359n0

    /* renamed from: b */
    public final C35820c f88512b;

    public enum DimensionType {
        AUTO,
        PERCENT,
        ABSOLUTE
    }

    /* renamed from: com.urbanairship.android.layout.property.Size$a */
    public static class C35818a extends C35820c {
        public C35818a(@C0359n0 String str) {
            super(str, DimensionType.ABSOLUTE);
        }

        /* renamed from: a */
        public float mo107291a() {
            return Float.parseFloat(this.f88517a);
        }

        /* renamed from: b */
        public int mo107292b() {
            return Integer.parseInt(this.f88517a);
        }

        @C0359n0
        public String toString() {
            return mo107292b() + "dp";
        }
    }

    /* renamed from: com.urbanairship.android.layout.property.Size$b */
    public static class C35819b extends C35820c {
        public C35819b() {
            super("auto", DimensionType.AUTO);
        }

        /* renamed from: a */
        public float mo107291a() {
            return -1.0f;
        }

        /* renamed from: b */
        public int mo107292b() {
            return -1;
        }

        @C0359n0
        public String toString() {
            return this.f88517a;
        }
    }

    /* renamed from: com.urbanairship.android.layout.property.Size$c */
    public static abstract class C35820c {
        @C0359n0

        /* renamed from: a */
        public final String f88517a;
        @C0359n0

        /* renamed from: b */
        public final DimensionType f88518b;

        public C35820c(@C0359n0 String str, @C0359n0 DimensionType dimensionType) {
            this.f88517a = str;
            this.f88518b = dimensionType;
        }

        @C0359n0
        /* renamed from: g */
        public static C35820c m147692g(@C0359n0 String str) {
            if (str.equals("auto")) {
                return new C35819b();
            }
            if (C35920l.m148109b(str)) {
                return new C35821d(str);
            }
            return new C35818a(str);
        }

        /* renamed from: a */
        public abstract float mo107291a();

        /* renamed from: b */
        public abstract int mo107292b();

        @C0359n0
        /* renamed from: c */
        public DimensionType mo107295c() {
            return this.f88518b;
        }

        /* renamed from: d */
        public boolean mo107296d() {
            return this.f88518b == DimensionType.ABSOLUTE;
        }

        /* renamed from: e */
        public boolean mo107297e() {
            return this.f88518b == DimensionType.AUTO;
        }

        /* renamed from: f */
        public boolean mo107298f() {
            return this.f88518b == DimensionType.PERCENT;
        }
    }

    /* renamed from: com.urbanairship.android.layout.property.Size$d */
    public static class C35821d extends C35820c {
        public C35821d(@C0359n0 String str) {
            super(str, DimensionType.PERCENT);
        }

        /* renamed from: a */
        public float mo107291a() {
            return C35920l.m148110c(this.f88517a);
        }

        /* renamed from: b */
        public int mo107292b() {
            return (int) mo107291a();
        }

        @C0359n0
        public String toString() {
            return ((int) (mo107291a() * 100.0f)) + "%";
        }
    }

    public Size(@C0359n0 String str, @C0359n0 String str2) {
        this.f88511a = C35820c.m147692g(str);
        this.f88512b = C35820c.m147692g(str2);
    }

    @C0359n0
    /* renamed from: a */
    public static Size m147685a(@C0359n0 C9323b bVar) throws JsonException {
        String a = bVar.mo18801A("width").mo18755a();
        String a2 = bVar.mo18801A("height").mo18755a();
        if (a != null && a2 != null) {
            return new Size(a, a2);
        }
        throw new JsonException("Size requires both width and height!");
    }

    @C0359n0
    /* renamed from: b */
    public C35820c mo107289b() {
        return this.f88512b;
    }

    @C0359n0
    /* renamed from: c */
    public C35820c mo107290c() {
        return this.f88511a;
    }

    @C0359n0
    public String toString() {
        return "Size { width=" + mo107290c() + ", height=" + mo107289b() + " }";
    }
}
