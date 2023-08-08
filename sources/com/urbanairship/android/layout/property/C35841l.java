package com.urbanairship.android.layout.property;

import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import com.urbanairship.android.layout.model.C35806l;
import com.urbanairship.iam.C9168d0;
import com.urbanairship.iam.C9259x;
import com.urbanairship.json.C9323b;
import com.urbanairship.json.JsonException;

/* renamed from: com.urbanairship.android.layout.property.l */
public class C35841l implements C35806l {
    @C0359n0

    /* renamed from: b */
    public final ConstrainedSize f88602b;
    @C0363p0

    /* renamed from: c */
    public final C35840k f88603c;
    @C0363p0

    /* renamed from: d */
    public final C35843n f88604d;
    @C0363p0

    /* renamed from: e */
    public final C35835f f88605e;

    /* renamed from: f */
    public final boolean f88606f;
    @C0363p0

    /* renamed from: g */
    public final Orientation f88607g;

    public C35841l(@C0359n0 ConstrainedSize constrainedSize, @C0363p0 C35840k kVar, @C0363p0 C35843n nVar, @C0363p0 C35835f fVar, boolean z, @C0363p0 Orientation orientation) {
        this.f88602b = constrainedSize;
        this.f88603c = kVar;
        this.f88604d = nVar;
        this.f88605e = fVar;
        this.f88606f = z;
        this.f88607g = orientation;
    }

    @C0359n0
    /* renamed from: c */
    public static C35841l m147773c(@C0359n0 C9323b bVar) throws JsonException {
        C35840k kVar;
        C35843n nVar;
        Orientation orientation;
        C9323b A = bVar.mo18801A(C9168d0.f24889w).mo18749A();
        if (!A.isEmpty()) {
            C9323b A2 = bVar.mo18801A(C9259x.f25239v).mo18749A();
            C9323b A3 = bVar.mo18801A("margin").mo18749A();
            ConstrainedSize d = ConstrainedSize.m147631d(A);
            if (A3.isEmpty()) {
                kVar = null;
            } else {
                kVar = C35840k.m147768a(A3);
            }
            if (A2.isEmpty()) {
                nVar = null;
            } else {
                nVar = C35843n.m147785a(A2);
            }
            C35835f c = C35835f.m147757c(bVar, "shade_color");
            boolean b = C35806l.m147617b(bVar);
            String B = bVar.mo18801A("device").mo18749A().mo18801A("lock_orientation").mo18750B();
            if (B.isEmpty()) {
                orientation = null;
            } else {
                orientation = Orientation.m147681b(B);
            }
            return new C35841l(d, kVar, nVar, c, b, orientation);
        }
        throw new JsonException("Failed to parse Modal Placement! Field 'size' is required.");
    }

    /* renamed from: a */
    public boolean mo107236a() {
        return this.f88606f;
    }

    @C0363p0
    /* renamed from: d */
    public C35840k mo107349d() {
        return this.f88603c;
    }

    @C0363p0
    /* renamed from: e */
    public Orientation mo107350e() {
        return this.f88607g;
    }

    @C0363p0
    /* renamed from: f */
    public C35843n mo107351f() {
        return this.f88604d;
    }

    @C0363p0
    /* renamed from: g */
    public C35835f mo107352g() {
        return this.f88605e;
    }

    @C0359n0
    /* renamed from: h */
    public ConstrainedSize mo107353h() {
        return this.f88602b;
    }
}
