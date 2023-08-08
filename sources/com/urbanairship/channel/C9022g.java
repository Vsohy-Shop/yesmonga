package com.urbanairship.channel;

import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.annotation.C0386z0;
import androidx.annotation.RestrictTo;
import com.urbanairship.C36059m;
import com.urbanairship.json.JsonValue;
import com.urbanairship.util.C9656j;
import com.urbanairship.util.C9668o;
import com.urbanairship.util.C9669o0;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/* renamed from: com.urbanairship.channel.g */
public abstract class C9022g {

    /* renamed from: c */
    public static final long f24256c = 1024;

    /* renamed from: a */
    public final List<C9023a> f24257a = new ArrayList();

    /* renamed from: b */
    public final C9656j f24258b;

    /* renamed from: com.urbanairship.channel.g$a */
    public class C9023a {

        /* renamed from: a */
        public String f24259a;

        /* renamed from: b */
        public Object f24260b;

        public C9023a(@C0359n0 String str, @C0363p0 Object obj) {
            this.f24259a = str;
            this.f24260b = obj;
        }

        @C0359n0
        /* renamed from: a */
        public C9025i mo17837a(long j) {
            Object obj = this.f24260b;
            if (obj != null) {
                return C9025i.m33602f(this.f24259a, JsonValue.m34975U(obj), j);
            }
            return C9025i.m33601e(this.f24259a, j);
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public C9022g(@C0359n0 C9656j jVar) {
        this.f24258b = jVar;
    }

    /* renamed from: a */
    public void mo17828a() {
        if (this.f24257a.size() != 0) {
            long a = this.f24258b.mo19623a();
            ArrayList arrayList = new ArrayList();
            for (C9023a a2 : this.f24257a) {
                try {
                    arrayList.add(a2.mo17837a(a));
                } catch (IllegalArgumentException e) {
                    C36059m.m148411g(e, "Invalid attribute mutation.", new Object[0]);
                }
            }
            mo17823c(C9025i.m33597a(arrayList));
        }
    }

    /* renamed from: b */
    public final boolean mo17829b(@C0359n0 String str) {
        if (C9669o0.m36224e(str)) {
            C36059m.m148409e("Attribute fields cannot be empty.", new Object[0]);
            return true;
        } else if (((long) str.length()) <= 1024) {
            return false;
        } else {
            C36059m.m148409e("Attribute field inputs cannot be greater than %s characters in length", 1024L);
            return true;
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* renamed from: c */
    public abstract void mo17823c(@C0359n0 List<C9025i> list);

    @C0359n0
    /* renamed from: d */
    public C9022g mo17830d(@C0359n0 @C0386z0(max = 1024, min = 1) String str) {
        if (mo17829b(str)) {
            return this;
        }
        this.f24257a.add(new C9023a(str, (Object) null));
        return this;
    }

    @C0359n0
    /* renamed from: e */
    public C9022g mo17831e(@C0359n0 @C0386z0(max = 1024, min = 1) String str, double d) throws NumberFormatException {
        if (mo17829b(str)) {
            return this;
        }
        if (Double.isNaN(d) || Double.isInfinite(d)) {
            throw new NumberFormatException("Infinity or NaN: " + d);
        }
        this.f24257a.add(new C9023a(str, Double.valueOf(d)));
        return this;
    }

    @C0359n0
    /* renamed from: f */
    public C9022g mo17832f(@C0359n0 @C0386z0(max = 1024, min = 1) String str, float f) throws NumberFormatException {
        if (mo17829b(str)) {
            return this;
        }
        if (Float.isNaN(f) || Float.isInfinite(f)) {
            throw new NumberFormatException("Infinity or NaN: " + f);
        }
        this.f24257a.add(new C9023a(str, Float.valueOf(f)));
        return this;
    }

    @C0359n0
    /* renamed from: g */
    public C9022g mo17833g(@C0359n0 @C0386z0(max = 1024, min = 1) String str, int i) {
        if (mo17829b(str)) {
            return this;
        }
        this.f24257a.add(new C9023a(str, Integer.valueOf(i)));
        return this;
    }

    @C0359n0
    /* renamed from: h */
    public C9022g mo17834h(@C0359n0 @C0386z0(max = 1024, min = 1) String str, long j) {
        if (mo17829b(str)) {
            return this;
        }
        this.f24257a.add(new C9023a(str, Long.valueOf(j)));
        return this;
    }

    @C0359n0
    /* renamed from: i */
    public C9022g mo17835i(@C0359n0 @C0386z0(max = 1024, min = 1) String str, @C0359n0 @C0386z0(max = 1024, min = 1) String str2) {
        if (!mo17829b(str) && !mo17829b(str2)) {
            this.f24257a.add(new C9023a(str, str2));
        }
        return this;
    }

    @C0359n0
    /* renamed from: j */
    public C9022g mo17836j(@C0359n0 @C0386z0(max = 1024, min = 1) String str, @C0359n0 Date date) {
        if (mo17829b(str)) {
            return this;
        }
        this.f24257a.add(new C9023a(str, C9668o.m36217a(date.getTime())));
        return this;
    }
}
