package com.urbanairship.android.layout.property;

import android.content.Context;
import android.graphics.Color;
import androidx.annotation.C0354l;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import com.urbanairship.android.layout.util.C35921m;
import com.urbanairship.json.C9323b;
import com.urbanairship.json.JsonException;
import java.util.List;

/* renamed from: com.urbanairship.android.layout.property.f */
public class C35835f {
    @C0354l

    /* renamed from: c */
    public static final int f88590c = 0;
    @C0354l

    /* renamed from: d */
    public static final int f88591d = -1;

    /* renamed from: a */
    public final int f88592a;
    @C0359n0

    /* renamed from: b */
    public final List<C35836g> f88593b;

    public C35835f(int i, @C0359n0 List<C35836g> list) {
        this.f88592a = i;
        this.f88593b = list;
    }

    /* renamed from: a */
    public static float m147755a(@C0354l int i) {
        return (float) Color.alpha(i);
    }

    @C0359n0
    /* renamed from: b */
    public static C35835f m147756b(@C0359n0 C9323b bVar) throws JsonException {
        Integer a = C35839j.m147767a(bVar.mo18801A("default").mo18749A());
        if (a != null) {
            return new C35835f(a.intValue(), C35836g.m147760b(bVar.mo18801A("selectors").mo18784z()));
        }
        throw new JsonException("Failed to parse color. 'default' may not be null! json = " + bVar);
    }

    @C0363p0
    /* renamed from: c */
    public static C35835f m147757c(@C0363p0 C9323b bVar, @C0359n0 String str) throws JsonException {
        if (bVar == null || bVar.isEmpty()) {
            return null;
        }
        C9323b A = bVar.mo18801A(str).mo18749A();
        if (A.isEmpty()) {
            return null;
        }
        return m147756b(A);
    }

    @C0354l
    /* renamed from: d */
    public int mo107342d(@C0359n0 Context context) {
        boolean f = C35921m.m148116f(context);
        for (C35836g next : this.f88593b) {
            if (next.mo107344d() == f) {
                return next.mo107343c();
            }
        }
        return this.f88592a;
    }
}
