package com.urbanairship.android.layout;

import android.content.Context;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import com.urbanairship.android.layout.property.C35828a;
import com.urbanairship.android.layout.property.C35829b;
import com.urbanairship.android.layout.property.Orientation;
import com.urbanairship.android.layout.property.PresentationType;
import com.urbanairship.android.layout.property.WindowSize;
import com.urbanairship.android.layout.util.C35921m;
import com.urbanairship.json.C9322a;
import com.urbanairship.json.C9323b;
import com.urbanairship.json.JsonException;
import java.util.List;

/* renamed from: com.urbanairship.android.layout.a */
public class C35572a extends C35573b {

    /* renamed from: e */
    public static final int f87951e = 7000;
    @C0359n0

    /* renamed from: b */
    public final C35828a f87952b;

    /* renamed from: c */
    public final int f87953c;
    @C0363p0

    /* renamed from: d */
    public final List<C35829b> f87954d;

    public C35572a(@C0359n0 C35828a aVar, int i, @C0363p0 List<C35829b> list) {
        super(PresentationType.BANNER);
        this.f87952b = aVar;
        this.f87953c = i;
        this.f87954d = list;
    }

    @C0359n0
    /* renamed from: c */
    public static C35572a m146830c(@C0359n0 C9323b bVar) throws JsonException {
        List<C35829b> list;
        C9323b A = bVar.mo18801A("default_placement").mo18749A();
        if (!A.isEmpty()) {
            int f = bVar.mo18801A("duration_milliseconds").mo18762f(f87951e);
            C9322a z = bVar.mo18801A("placement_selectors").mo18784z();
            C35828a c = C35828a.m147727c(A);
            if (z.isEmpty()) {
                list = null;
            } else {
                list = C35829b.m147733b(z);
            }
            return new C35572a(c, f, list);
        }
        throw new JsonException("Failed to parse BannerPresentation! Field 'default_placement' is required.");
    }

    @C0359n0
    /* renamed from: d */
    public C35828a mo106576d() {
        return this.f87952b;
    }

    /* renamed from: e */
    public int mo106577e() {
        return this.f87953c;
    }

    @C0363p0
    /* renamed from: f */
    public List<C35829b> mo106578f() {
        return this.f87954d;
    }

    @C0359n0
    /* renamed from: g */
    public C35828a mo106579g(@C0359n0 Context context) {
        List<C35829b> list = this.f87954d;
        if (list == null || list.isEmpty()) {
            return this.f87952b;
        }
        Orientation d = C35921m.m148114d(context);
        WindowSize e = C35921m.m148115e(context);
        for (C35829b next : this.f87954d) {
            if ((next.mo107333e() == null || next.mo107333e() == e) && (next.mo107331c() == null || next.mo107331c() == d)) {
                return next.mo107332d();
            }
        }
        return this.f87952b;
    }
}
