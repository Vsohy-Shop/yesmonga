package com.urbanairship.android.layout.property;

import androidx.annotation.C0359n0;
import androidx.annotation.C0366r;
import com.urbanairship.android.layout.shape.C35870a;
import com.urbanairship.json.C9322a;
import com.urbanairship.json.C9323b;
import com.urbanairship.json.JsonException;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.urbanairship.android.layout.property.o */
public abstract class C35844o {
    @C0359n0

    /* renamed from: a */
    public final ScoreType f88613a;

    /* renamed from: com.urbanairship.android.layout.property.o$a */
    public static /* synthetic */ class C35845a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f88614a;

        static {
            int[] iArr = new int[ScoreType.values().length];
            f88614a = iArr;
            try {
                iArr[ScoreType.NUMBER_RANGE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
        }
    }

    /* renamed from: com.urbanairship.android.layout.property.o$b */
    public static class C35846b {
        @C0359n0

        /* renamed from: a */
        public final List<C35870a> f88615a;
        @C0359n0

        /* renamed from: b */
        public final C35850q f88616b;

        public C35846b(@C0359n0 List<C35870a> list, @C0359n0 C35850q qVar) {
            this.f88615a = list;
            this.f88616b = qVar;
        }

        /* renamed from: a */
        public static C35846b m147791a(@C0359n0 C9323b bVar) throws JsonException {
            C9322a z = bVar.mo18801A("shapes").mo18784z();
            C9323b A = bVar.mo18801A("text_appearance").mo18749A();
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i < z.size(); i++) {
                arrayList.add(C35870a.m147950b(z.mo18791h(i).mo18749A()));
            }
            return new C35846b(arrayList, C35850q.m147805a(A));
        }

        @C0359n0
        /* renamed from: b */
        public List<C35870a> mo107361b() {
            return this.f88615a;
        }

        @C0359n0
        /* renamed from: c */
        public C35850q mo107362c() {
            return this.f88616b;
        }
    }

    /* renamed from: com.urbanairship.android.layout.property.o$c */
    public static class C35847c {
        @C0359n0

        /* renamed from: a */
        public final C35846b f88617a;
        @C0359n0

        /* renamed from: b */
        public final C35846b f88618b;

        public C35847c(@C0359n0 C35846b bVar, @C0359n0 C35846b bVar2) {
            this.f88617a = bVar;
            this.f88618b = bVar2;
        }

        @C0359n0
        /* renamed from: a */
        public static C35847c m147794a(@C0359n0 C9323b bVar) throws JsonException {
            return new C35847c(C35846b.m147791a(bVar.mo18801A("selected").mo18749A()), C35846b.m147791a(bVar.mo18801A("unselected").mo18749A()));
        }

        @C0359n0
        /* renamed from: b */
        public C35846b mo107363b() {
            return this.f88617a;
        }

        @C0359n0
        /* renamed from: c */
        public C35846b mo107364c() {
            return this.f88618b;
        }
    }

    /* renamed from: com.urbanairship.android.layout.property.o$d */
    public static class C35848d extends C35844o {

        /* renamed from: b */
        public final int f88619b;

        /* renamed from: c */
        public final int f88620c;

        /* renamed from: d */
        public final int f88621d;
        @C0359n0

        /* renamed from: e */
        public final C35847c f88622e;

        public C35848d(int i, int i2, int i3, @C0359n0 C35847c cVar) {
            super(ScoreType.NUMBER_RANGE);
            this.f88619b = i;
            this.f88620c = i2;
            this.f88621d = i3;
            this.f88622e = cVar;
        }

        @C0359n0
        /* renamed from: a */
        public static C35844o m147797a(C9323b bVar) throws JsonException {
            return new C35848d(bVar.mo18801A("start").mo18762f(0), bVar.mo18801A("end").mo18762f(10), bVar.mo18801A("spacing").mo18762f(0), C35847c.m147794a(bVar.mo18801A("bindings").mo18749A()));
        }

        @C0359n0
        /* renamed from: c */
        public C35847c mo107365c() {
            return this.f88622e;
        }

        /* renamed from: d */
        public int mo107366d() {
            return this.f88620c;
        }

        @C0366r(unit = 0)
        /* renamed from: e */
        public int mo107367e() {
            return this.f88621d;
        }

        /* renamed from: f */
        public int mo107368f() {
            return this.f88619b;
        }
    }

    public C35844o(@C0359n0 ScoreType scoreType) {
        this.f88613a = scoreType;
    }

    @C0359n0
    /* renamed from: a */
    public static C35844o m147789a(@C0359n0 C9323b bVar) throws JsonException {
        String B = bVar.mo18801A("type").mo18750B();
        if (C35845a.f88614a[ScoreType.m147684b(B).ordinal()] == 1) {
            return C35848d.m147797a(bVar);
        }
        throw new JsonException("Failed to parse ScoreStyle! Unknown type: " + B);
    }

    @C0359n0
    /* renamed from: b */
    public ScoreType mo107360b() {
        return this.f88613a;
    }
}
