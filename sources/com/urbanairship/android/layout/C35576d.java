package com.urbanairship.android.layout;

import android.content.Context;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import com.urbanairship.android.layout.property.C35841l;
import com.urbanairship.android.layout.property.C35842m;
import com.urbanairship.android.layout.property.Orientation;
import com.urbanairship.android.layout.property.PresentationType;
import com.urbanairship.android.layout.property.WindowSize;
import com.urbanairship.android.layout.util.C35921m;
import com.urbanairship.json.C9322a;
import com.urbanairship.json.C9323b;
import com.urbanairship.json.JsonException;
import java.util.List;

/* renamed from: com.urbanairship.android.layout.d */
public class C35576d extends C35573b {
    @C0359n0

    /* renamed from: b */
    public final C35841l f87962b;
    @C0363p0

    /* renamed from: c */
    public final List<C35842m> f87963c;

    /* renamed from: d */
    public final boolean f87964d;

    /* renamed from: e */
    public final boolean f87965e;

    public C35576d(@C0359n0 C35841l lVar, @C0363p0 List<C35842m> list, boolean z, boolean z2) {
        super(PresentationType.MODAL);
        this.f87962b = lVar;
        this.f87963c = list;
        this.f87964d = z;
        this.f87965e = z2;
    }

    @C0359n0
    /* renamed from: c */
    public static C35576d m146837c(@C0359n0 C9323b bVar) throws JsonException {
        List<C35842m> list;
        C9323b A = bVar.mo18801A("default_placement").mo18749A();
        if (!A.isEmpty()) {
            C9322a z = bVar.mo18801A("placement_selectors").mo18784z();
            C35841l c = C35841l.m147773c(A);
            if (z.isEmpty()) {
                list = null;
            } else {
                list = C35842m.m147781b(z);
            }
            return new C35576d(c, list, bVar.mo18801A("dismiss_on_touch_outside").mo18757c(false), bVar.mo18801A("android").mo18749A().mo18801A("disable_back_button").mo18757c(false));
        }
        throw new JsonException("Failed to parse ModalPresentation! Field 'default_placement' is required.");
    }

    @C0359n0
    /* renamed from: d */
    public C35841l mo106581d() {
        return this.f87962b;
    }

    @C0363p0
    /* renamed from: e */
    public List<C35842m> mo106582e() {
        return this.f87963c;
    }

    @C0359n0
    /* renamed from: f */
    public C35841l mo106583f(@C0359n0 Context context) {
        List<C35842m> list = this.f87963c;
        if (list == null || list.isEmpty()) {
            return this.f87962b;
        }
        Orientation d = C35921m.m148114d(context);
        WindowSize e = C35921m.m148115e(context);
        for (C35842m next : this.f87963c) {
            if ((next.mo107356e() == null || next.mo107356e() == e) && (next.mo107354c() == null || next.mo107354c() == d)) {
                return next.mo107355d();
            }
        }
        return this.f87962b;
    }

    /* renamed from: g */
    public boolean mo106584g() {
        return this.f87965e;
    }

    /* renamed from: h */
    public boolean mo106585h() {
        return this.f87964d;
    }
}
