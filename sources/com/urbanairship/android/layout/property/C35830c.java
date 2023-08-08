package com.urbanairship.android.layout.property;

import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.annotation.C0366r;
import com.urbanairship.analytics.location.C35563d;
import com.urbanairship.json.C9323b;
import com.urbanairship.json.JsonException;

/* renamed from: com.urbanairship.android.layout.property.c */
public class C35830c {
    @C0363p0

    /* renamed from: a */
    public final Integer f88582a;
    @C0363p0

    /* renamed from: b */
    public final Integer f88583b;
    @C0363p0

    /* renamed from: c */
    public final C35835f f88584c;

    public C35830c(@C0363p0 Integer num, @C0363p0 Integer num2, @C0363p0 C35835f fVar) {
        this.f88582a = num;
        this.f88583b = num2;
        this.f88584c = fVar;
    }

    @C0359n0
    /* renamed from: a */
    public static C35830c m147737a(@C0359n0 C9323b bVar) throws JsonException {
        C35835f fVar;
        Integer g = bVar.mo18801A(C35563d.f87837X0).mo18763g();
        Integer g2 = bVar.mo18801A("stroke_width").mo18763g();
        if (bVar.mo18801A("stroke_color").mo18749A().isEmpty()) {
            fVar = null;
        } else {
            fVar = C35835f.m147757c(bVar, "stroke_color");
        }
        return new C35830c(g, g2, fVar);
    }

    @C0363p0
    @C0366r(unit = 0)
    /* renamed from: b */
    public Integer mo107334b() {
        return this.f88582a;
    }

    @C0363p0
    /* renamed from: c */
    public C35835f mo107335c() {
        return this.f88584c;
    }

    @C0363p0
    /* renamed from: d */
    public Integer mo107336d() {
        return this.f88583b;
    }
}
