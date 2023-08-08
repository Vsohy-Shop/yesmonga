package com.urbanairship.android.layout.property;

import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import com.urbanairship.iam.C9166d;
import com.urbanairship.json.C9322a;
import com.urbanairship.json.C9323b;
import com.urbanairship.json.JsonException;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.urbanairship.android.layout.property.m */
public class C35842m {
    @C0359n0

    /* renamed from: a */
    public final C35841l f88608a;
    @C0363p0

    /* renamed from: b */
    public final WindowSize f88609b;
    @C0363p0

    /* renamed from: c */
    public final Orientation f88610c;

    public C35842m(@C0359n0 C35841l lVar, @C0363p0 WindowSize windowSize, @C0363p0 Orientation orientation) {
        this.f88608a = lVar;
        this.f88609b = windowSize;
        this.f88610c = orientation;
    }

    @C0359n0
    /* renamed from: a */
    public static C35842m m147780a(@C0359n0 C9323b bVar) throws JsonException {
        WindowSize windowSize;
        C9323b A = bVar.mo18801A(C9166d.f24869j0).mo18749A();
        String B = bVar.mo18801A("window_size").mo18750B();
        String B2 = bVar.mo18801A("orientation").mo18750B();
        C35841l c = C35841l.m147773c(A);
        Orientation orientation = null;
        if (B.isEmpty()) {
            windowSize = null;
        } else {
            windowSize = WindowSize.m147726b(B);
        }
        if (!B2.isEmpty()) {
            orientation = Orientation.m147681b(B2);
        }
        return new C35842m(c, windowSize, orientation);
    }

    @C0359n0
    /* renamed from: b */
    public static List<C35842m> m147781b(@C0359n0 C9322a aVar) throws JsonException {
        ArrayList arrayList = new ArrayList(aVar.size());
        for (int i = 0; i < aVar.size(); i++) {
            arrayList.add(m147780a(aVar.mo18791h(i).mo18749A()));
        }
        return arrayList;
    }

    @C0363p0
    /* renamed from: c */
    public Orientation mo107354c() {
        return this.f88610c;
    }

    @C0359n0
    /* renamed from: d */
    public C35841l mo107355d() {
        return this.f88608a;
    }

    @C0363p0
    /* renamed from: e */
    public WindowSize mo107356e() {
        return this.f88609b;
    }
}
