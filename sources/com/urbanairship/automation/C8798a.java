package com.urbanairship.automation;

import android.os.Bundle;
import android.os.Looper;
import androidx.annotation.C0359n0;
import androidx.annotation.RestrictTo;
import com.urbanairship.actions.C35489b;
import com.urbanairship.actions.C35490c;
import com.urbanairship.actions.C35495f;
import com.urbanairship.actions.C35504j;
import com.urbanairship.automation.C8823d;
import com.urbanairship.automation.actions.C8801a;
import java.util.HashMap;
import java.util.Map;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* renamed from: com.urbanairship.automation.a */
public class C8798a implements C8818b0<C8801a> {

    /* renamed from: a */
    public final C35504j f23541a;

    /* renamed from: b */
    public final Map<String, C8801a> f23542b;

    /* renamed from: com.urbanairship.automation.a$a */
    public static class C8799a implements C35490c {

        /* renamed from: a */
        public final C8823d.C8824a f23543a;

        /* renamed from: b */
        public int f23544b;

        public C8799a(C8823d.C8824a aVar, int i) {
            this.f23543a = aVar;
            this.f23544b = i;
        }

        /* renamed from: a */
        public void mo17300a(@C0359n0 C35489b bVar, @C0359n0 C35495f fVar) {
            int i = this.f23544b - 1;
            this.f23544b = i;
            if (i == 0) {
                this.f23543a.mo17385a();
            }
        }
    }

    public C8798a(C35504j jVar) {
        this.f23542b = new HashMap();
        this.f23541a = jVar;
    }

    /* renamed from: a */
    public void mo17292a(@C0359n0 C8996y<? extends C8800a0> yVar) {
    }

    /* renamed from: b */
    public int mo17293b(@C0359n0 C8996y<? extends C8800a0> yVar) {
        return this.f23542b.containsKey(yVar.mo17733B()) ? 1 : -1;
    }

    /* renamed from: d */
    public void mo17295d(@C0359n0 C8996y<? extends C8800a0> yVar, @C0359n0 C8823d.C8824a aVar) {
        C8801a aVar2 = this.f23542b.get(yVar.mo17733B());
        if (aVar2 == null) {
            aVar.mo17385a();
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putString(C35489b.f87518g, yVar.mo17733B());
        C8799a aVar3 = new C8799a(aVar, aVar2.mo17304a().size());
        for (Map.Entry next : aVar2.mo17304a().mo18809i()) {
            this.f23541a.mo106388a((String) next.getKey()).mo106383p(next.getValue()).mo106381n(6).mo106380m(bundle).mo106376i(Looper.getMainLooper(), aVar3);
        }
    }

    /* renamed from: e */
    public void mo17296e(@C0359n0 C8996y<? extends C8800a0> yVar) {
        this.f23542b.remove(yVar.mo17733B());
    }

    /* renamed from: f */
    public void mo17297f(@C0359n0 C8996y<? extends C8800a0> yVar) {
    }

    /* renamed from: g */
    public void mo17298g(@C0359n0 C8996y<? extends C8800a0> yVar) {
    }

    /* renamed from: h */
    public void mo17294c(@C0359n0 C8996y<? extends C8800a0> yVar, @C0359n0 C8801a aVar, @C0359n0 C8823d.C8826c cVar) {
        this.f23542b.put(yVar.mo17733B(), aVar);
        cVar.mo17386a(0);
    }

    public C8798a() {
        this(new C35504j());
    }
}
