package com.urbanairship.android.layout.property;

import androidx.annotation.C0359n0;
import com.urbanairship.json.C9323b;
import com.urbanairship.json.JsonException;
import kotlinx.coroutines.C12085q0;

/* renamed from: com.urbanairship.android.layout.property.p */
public class C35849p extends C35852s {
    @C0359n0

    /* renamed from: b */
    public final C35835f f88623b;
    @C0359n0

    /* renamed from: c */
    public final C35835f f88624c;

    public C35849p(@C0359n0 C35835f fVar, @C0359n0 C35835f fVar2) {
        super(ToggleType.SWITCH);
        this.f88623b = fVar;
        this.f88624c = fVar2;
    }

    @C0359n0
    /* renamed from: c */
    public static C35849p m147802c(@C0359n0 C9323b bVar) throws JsonException {
        C9323b A = bVar.mo18801A("toggle_colors").mo18749A();
        C35835f c = C35835f.m147757c(A, C12085q0.f29740d);
        if (c != null) {
            C35835f c2 = C35835f.m147757c(A, C12085q0.f29741e);
            if (c2 != null) {
                return new C35849p(c, c2);
            }
            throw new JsonException("Failed to parse SwitchStyle! Field 'toggle_colors.off' may not be null.");
        }
        throw new JsonException("Failed to parse SwitchStyle! Field 'toggle_colors.on' may not be null.");
    }

    @C0359n0
    /* renamed from: d */
    public C35835f mo107369d() {
        return this.f88624c;
    }

    @C0359n0
    /* renamed from: e */
    public C35835f mo107370e() {
        return this.f88623b;
    }
}
