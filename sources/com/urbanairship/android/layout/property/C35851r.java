package com.urbanairship.android.layout.property;

import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import com.urbanairship.json.C9323b;
import com.urbanairship.json.JsonException;

/* renamed from: com.urbanairship.android.layout.property.r */
public class C35851r extends C35850q {
    @C0363p0

    /* renamed from: f */
    public final C35835f f88630f;

    public C35851r(@C0359n0 C35850q qVar, @C0363p0 C35835f fVar) {
        super(qVar);
        this.f88630f = fVar;
    }

    @C0359n0
    /* renamed from: g */
    public static C35851r m147811g(@C0359n0 C9323b bVar) throws JsonException {
        return new C35851r(C35850q.m147805a(bVar), C35835f.m147757c(bVar, "place_holder_color"));
    }

    @C0363p0
    /* renamed from: h */
    public C35835f mo107376h() {
        return this.f88630f;
    }
}
