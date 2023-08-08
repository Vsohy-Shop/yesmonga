package com.urbanairship.android.layout.property;

import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import com.urbanairship.iam.C9166d;
import com.urbanairship.json.C9322a;
import com.urbanairship.json.C9323b;
import com.urbanairship.json.JsonException;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.urbanairship.android.layout.property.b */
public class C35829b {
    @C0359n0

    /* renamed from: a */
    public final C35828a f88579a;
    @C0363p0

    /* renamed from: b */
    public final WindowSize f88580b;
    @C0363p0

    /* renamed from: c */
    public final Orientation f88581c;

    public C35829b(@C0359n0 C35828a aVar, @C0363p0 WindowSize windowSize, @C0363p0 Orientation orientation) {
        this.f88579a = aVar;
        this.f88580b = windowSize;
        this.f88581c = orientation;
    }

    @C0359n0
    /* renamed from: a */
    public static C35829b m147732a(@C0359n0 C9323b bVar) throws JsonException {
        WindowSize windowSize;
        C9323b A = bVar.mo18801A(C9166d.f24869j0).mo18749A();
        String B = bVar.mo18801A("window_size").mo18750B();
        String B2 = bVar.mo18801A("orientation").mo18750B();
        C35828a c = C35828a.m147727c(A);
        Orientation orientation = null;
        if (B.isEmpty()) {
            windowSize = null;
        } else {
            windowSize = WindowSize.m147726b(B);
        }
        if (!B2.isEmpty()) {
            orientation = Orientation.m147681b(B2);
        }
        return new C35829b(c, windowSize, orientation);
    }

    @C0359n0
    /* renamed from: b */
    public static List<C35829b> m147733b(@C0359n0 C9322a aVar) throws JsonException {
        ArrayList arrayList = new ArrayList(aVar.size());
        for (int i = 0; i < aVar.size(); i++) {
            arrayList.add(m147732a(aVar.mo18791h(i).mo18749A()));
        }
        return arrayList;
    }

    @C0363p0
    /* renamed from: c */
    public Orientation mo107331c() {
        return this.f88581c;
    }

    @C0359n0
    /* renamed from: d */
    public C35828a mo107332d() {
        return this.f88579a;
    }

    @C0363p0
    /* renamed from: e */
    public WindowSize mo107333e() {
        return this.f88580b;
    }
}
