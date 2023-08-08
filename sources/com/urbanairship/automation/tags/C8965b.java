package com.urbanairship.automation.tags;

import androidx.annotation.C0344h1;
import androidx.annotation.C0359n0;
import androidx.annotation.RestrictTo;
import com.urbanairship.C36071u;
import com.urbanairship.channel.C9004a0;
import com.urbanairship.channel.C9008d;
import com.urbanairship.channel.C9025i;
import com.urbanairship.contacts.C9074e;
import com.urbanairship.util.C9656j;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;

@RestrictTo({RestrictTo.Scope.LIBRARY})
/* renamed from: com.urbanairship.automation.tags.b */
public class C8965b {

    /* renamed from: g */
    public static final String f24065g = "device";

    /* renamed from: h */
    public static final String f24066h = "com.urbanairship.iam.tags.FETCH_ENABLED";

    /* renamed from: i */
    public static final long f24067i = 600000;

    /* renamed from: a */
    public final C36071u f24068a;

    /* renamed from: b */
    public final C8958a f24069b;

    /* renamed from: c */
    public final C9008d f24070c;

    /* renamed from: d */
    public final C9656j f24071d;

    /* renamed from: e */
    public final C9074e f24072e;

    /* renamed from: f */
    public C8966a f24073f;

    /* renamed from: com.urbanairship.automation.tags.b$a */
    public interface C8966a {
        @C0359n0
        /* renamed from: a */
        Map<String, Set<String>> mo17703a() throws Exception;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C8965b(@androidx.annotation.C0359n0 com.urbanairship.config.C9061a r7, @androidx.annotation.C0359n0 com.urbanairship.channel.C9008d r8, @androidx.annotation.C0359n0 com.urbanairship.contacts.C9074e r9, @androidx.annotation.C0359n0 com.urbanairship.C36071u r10) {
        /*
            r6 = this;
            com.urbanairship.automation.tags.a r3 = new com.urbanairship.automation.tags.a
            com.urbanairship.util.j r5 = com.urbanairship.util.C9656j.f26468a
            r3.<init>(r8, r9, r5)
            r0 = r6
            r1 = r8
            r2 = r9
            r4 = r10
            r0.<init>(r1, r2, r3, r4, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.urbanairship.automation.tags.C8965b.<init>(com.urbanairship.config.a, com.urbanairship.channel.d, com.urbanairship.contacts.e, com.urbanairship.u):void");
    }

    @C0359n0
    /* renamed from: a */
    public List<C9025i> mo17698a() {
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(this.f24069b.mo17690f(this.f24071d.mo19623a() - 600000));
        arrayList.addAll(this.f24072e.mo18039f0());
        arrayList.addAll(this.f24070c.mo17797d0());
        return C9025i.m33597a(arrayList);
    }

    @C0359n0
    /* renamed from: b */
    public final List<C9004a0> mo17699b(long j) {
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(this.f24069b.mo17691g(j));
        arrayList.addAll(this.f24072e.mo18041h0());
        arrayList.addAll(this.f24070c.mo17799f0());
        if (this.f24070c.mo17792Y()) {
            arrayList.add(C9004a0.m33502h("device", this.f24070c.mo17801h0()));
        }
        return C9004a0.m33497b(arrayList);
    }

    @C0359n0
    /* renamed from: c */
    public List<C9004a0> mo17700c() {
        return mo17699b(this.f24071d.mo19623a() - 600000);
    }

    /* renamed from: d */
    public boolean mo17701d() {
        return this.f24068a.mo107843f(f24066h, true);
    }

    /* renamed from: e */
    public void mo17702e(boolean z) {
        this.f24068a.mo107857v(f24066h, z);
    }

    @C0344h1
    public C8965b(@C0359n0 C9008d dVar, @C0359n0 C9074e eVar, @C0359n0 C8958a aVar, @C0359n0 C36071u uVar, @C0359n0 C9656j jVar) {
        this.f24070c = dVar;
        this.f24072e = eVar;
        this.f24069b = aVar;
        this.f24068a = uVar;
        this.f24071d = jVar;
        aVar.mo17692h();
    }
}
