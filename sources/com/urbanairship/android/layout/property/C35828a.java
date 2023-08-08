package com.urbanairship.android.layout.property;

import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import com.urbanairship.android.layout.model.C35806l;
import com.urbanairship.iam.C9168d0;
import com.urbanairship.iam.C9259x;
import com.urbanairship.json.C9323b;
import com.urbanairship.json.JsonException;

/* renamed from: com.urbanairship.android.layout.property.a */
public class C35828a implements C35806l {
    @C0359n0

    /* renamed from: b */
    public final ConstrainedSize f88575b;
    @C0363p0

    /* renamed from: c */
    public final C35840k f88576c;
    @C0363p0

    /* renamed from: d */
    public final C35843n f88577d;

    /* renamed from: e */
    public final boolean f88578e;

    public C35828a(@C0359n0 ConstrainedSize constrainedSize, @C0363p0 C35840k kVar, @C0363p0 C35843n nVar, boolean z) {
        this.f88575b = constrainedSize;
        this.f88576c = kVar;
        this.f88577d = nVar;
        this.f88578e = z;
    }

    @C0359n0
    /* renamed from: c */
    public static C35828a m147727c(@C0359n0 C9323b bVar) throws JsonException {
        C35840k kVar;
        C9323b A = bVar.mo18801A(C9168d0.f24889w).mo18749A();
        if (!A.isEmpty()) {
            String B = bVar.mo18801A(C9259x.f25239v).mo18750B();
            C9323b A2 = bVar.mo18801A("margin").mo18749A();
            ConstrainedSize d = ConstrainedSize.m147631d(A);
            if (A2.isEmpty()) {
                kVar = null;
            } else {
                kVar = C35840k.m147768a(A2);
            }
            return new C35828a(d, kVar, new C35843n(HorizontalPosition.CENTER, VerticalPosition.m147720b(B)), C35806l.m147617b(bVar));
        }
        throw new JsonException("Failed to parse Modal Placement! Field 'size' is required.");
    }

    /* renamed from: a */
    public boolean mo107236a() {
        return this.f88578e;
    }

    @C0363p0
    /* renamed from: d */
    public C35840k mo107328d() {
        return this.f88576c;
    }

    @C0363p0
    /* renamed from: e */
    public C35843n mo107329e() {
        return this.f88577d;
    }

    @C0359n0
    /* renamed from: f */
    public ConstrainedSize mo107330f() {
        return this.f88575b;
    }
}
