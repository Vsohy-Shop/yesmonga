package com.urbanairship.android.layout.property;

import androidx.annotation.C0359n0;
import androidx.annotation.C0366r;
import com.urbanairship.iam.C9168d0;
import com.urbanairship.json.C9322a;
import com.urbanairship.json.C9323b;
import com.urbanairship.json.JsonException;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.urbanairship.android.layout.property.q */
public class C35850q {
    @C0359n0

    /* renamed from: a */
    public final C35835f f88625a;
    @C0366r(unit = 0)

    /* renamed from: b */
    public final int f88626b;
    @C0359n0

    /* renamed from: c */
    public final TextAlignment f88627c;
    @C0359n0

    /* renamed from: d */
    public final List<TextStyle> f88628d;
    @C0359n0

    /* renamed from: e */
    public final List<String> f88629e;

    public C35850q(@C0359n0 C35850q qVar) {
        this.f88625a = qVar.f88625a;
        this.f88626b = qVar.f88626b;
        this.f88627c = qVar.f88627c;
        this.f88628d = qVar.f88628d;
        this.f88629e = qVar.f88629e;
    }

    @C0359n0
    /* renamed from: a */
    public static C35850q m147805a(@C0359n0 C9323b bVar) throws JsonException {
        TextAlignment textAlignment;
        int f = bVar.mo18801A("font_size").mo18762f(14);
        C35835f c = C35835f.m147757c(bVar, "color");
        if (c != null) {
            String B = bVar.mo18801A(C9168d0.f24891y).mo18750B();
            C9322a z = bVar.mo18801A("styles").mo18784z();
            C9322a z2 = bVar.mo18801A("font_families").mo18784z();
            if (B.isEmpty()) {
                textAlignment = TextAlignment.CENTER;
            } else {
                textAlignment = TextAlignment.m147716b(B);
            }
            TextAlignment textAlignment2 = textAlignment;
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i < z.size(); i++) {
                arrayList.add(TextStyle.m147718b(z.mo18791h(i).mo18750B()));
            }
            ArrayList arrayList2 = new ArrayList();
            for (int i2 = 0; i2 < z2.size(); i2++) {
                arrayList2.add(z2.mo18791h(i2).mo18750B());
            }
            return new C35850q(c, f, textAlignment2, arrayList, arrayList2);
        }
        throw new JsonException("Failed to parse text appearance. 'color' may not be null!");
    }

    @C0359n0
    /* renamed from: b */
    public TextAlignment mo107371b() {
        return this.f88627c;
    }

    @C0359n0
    /* renamed from: c */
    public C35835f mo107372c() {
        return this.f88625a;
    }

    @C0359n0
    /* renamed from: d */
    public List<String> mo107373d() {
        return this.f88629e;
    }

    @C0366r(unit = 0)
    /* renamed from: e */
    public int mo107374e() {
        return this.f88626b;
    }

    @C0359n0
    /* renamed from: f */
    public List<TextStyle> mo107375f() {
        return this.f88628d;
    }

    public C35850q(@C0359n0 C35835f fVar, int i, @C0359n0 TextAlignment textAlignment, @C0359n0 List<TextStyle> list, @C0359n0 List<String> list2) {
        this.f88625a = fVar;
        this.f88626b = i;
        this.f88627c = textAlignment;
        this.f88628d = list;
        this.f88629e = list2;
    }
}
