package com.urbanairship.remoteconfig;

import android.content.Context;
import androidx.annotation.C0344h1;
import androidx.annotation.C0359n0;
import androidx.annotation.RestrictTo;
import com.urbanairship.C36040b;
import com.urbanairship.C36045e;
import com.urbanairship.C36059m;
import com.urbanairship.C36071u;
import com.urbanairship.C36075v;
import com.urbanairship.UAirship;
import com.urbanairship.config.C9061a;
import com.urbanairship.json.C9323b;
import com.urbanairship.json.JsonException;
import com.urbanairship.json.JsonValue;
import com.urbanairship.reactive.C9550c;
import com.urbanairship.reactive.C9587f;
import com.urbanairship.reactive.C9588g;
import com.urbanairship.reactive.C9595j;
import com.urbanairship.reactive.C9596k;
import com.urbanairship.remotedata.C9619j;
import com.urbanairship.remotedata.C9625m;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArraySet;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* renamed from: com.urbanairship.remoteconfig.f */
public class C9605f extends C36040b {

    /* renamed from: o */
    public static final String f26286o = "app_config";

    /* renamed from: p */
    public static final String f26287p = "app_config:android";

    /* renamed from: q */
    public static final String f26288q = "app_config:amazon";

    /* renamed from: r */
    public static final String f26289r = "disable_features";

    /* renamed from: s */
    public static final String f26290s = "airship_config";

    /* renamed from: t */
    public static final Comparator<C9625m> f26291t = new C9606a();

    /* renamed from: f */
    public final Collection<C9604e> f26292f;

    /* renamed from: g */
    public final C9619j f26293g;

    /* renamed from: h */
    public final C9601b f26294h;

    /* renamed from: i */
    public final C9587f f26295i;

    /* renamed from: j */
    public final C36075v f26296j;

    /* renamed from: k */
    public final C9061a f26297k;

    /* renamed from: l */
    public C9596k f26298l;

    /* renamed from: m */
    public C9603d f26299m;

    /* renamed from: n */
    public final C36075v.C36077b f26300n;

    /* renamed from: com.urbanairship.remoteconfig.f$a */
    public class C9606a implements Comparator<C9625m> {
        /* renamed from: a */
        public int compare(C9625m mVar, C9625m mVar2) {
            if (mVar.mo19567e().equals(mVar2.mo19567e())) {
                return 0;
            }
            if (mVar.mo19567e().equals(C9605f.f26286o)) {
                return -1;
            }
            return 1;
        }
    }

    /* renamed from: com.urbanairship.remoteconfig.f$b */
    public class C9607b implements C36075v.C36077b {
        public C9607b() {
        }

        /* renamed from: a */
        public void mo17533a() {
            C9605f.this.mo19534J();
        }
    }

    /* renamed from: com.urbanairship.remoteconfig.f$c */
    public class C9608c extends C9595j<C9323b> {
        public C9608c() {
        }

        /* renamed from: d */
        public void mo17490c(@C0359n0 C9323b bVar) {
            try {
                C9605f.this.mo19532H(bVar);
            } catch (Exception e) {
                C36059m.m148411g(e, "Failed to process remote data", new Object[0]);
            }
        }
    }

    /* renamed from: com.urbanairship.remoteconfig.f$d */
    public class C9609d implements C9550c<Collection<C9625m>, C9323b> {
        public C9609d() {
        }

        @C0359n0
        /* renamed from: a */
        public C9323b apply(@C0359n0 Collection<C9625m> collection) {
            ArrayList<C9625m> arrayList = new ArrayList<>(collection);
            Collections.sort(arrayList, C9605f.f26291t);
            C9323b.C9325b y = C9323b.m35017y();
            for (C9625m b : arrayList) {
                y.mo18825i(b.mo19564b());
            }
            return y.mo18817a();
        }
    }

    public C9605f(@C0359n0 Context context, @C0359n0 C36071u uVar, @C0359n0 C9061a aVar, @C0359n0 C36075v vVar, @C0359n0 C9619j jVar) {
        this(context, uVar, aVar, vVar, jVar, new C9601b(), C9588g.m35926a(C36045e.m148371a()));
    }

    /* renamed from: A */
    public void mo17591A() {
        super.mo17591A();
        C9596k kVar = this.f26298l;
        if (kVar != null) {
            kVar.mo19457a();
        }
        this.f26296j.mo107876j(this.f26300n);
    }

    /* renamed from: E */
    public void mo19529E(@C0359n0 C9604e eVar) {
        this.f26292f.add(eVar);
    }

    /* renamed from: F */
    public final void mo19530F(@C0359n0 List<C9598a> list) {
        HashSet<String> hashSet = new HashSet<>();
        HashSet<String> hashSet2 = new HashSet<>(C9602c.f26273l);
        long j = 10000;
        for (C9598a next : list) {
            hashSet.addAll(next.mo19510d());
            hashSet2.removeAll(next.mo19510d());
            j = Math.max(j, next.mo19511e());
        }
        for (String e : hashSet) {
            this.f26294h.mo19522e(e, false);
        }
        for (String e2 : hashSet2) {
            this.f26294h.mo19522e(e2, true);
        }
        this.f26293g.mo19558l0(j);
    }

    /* renamed from: G */
    public final void mo19531G() {
        for (C9604e b : this.f26292f) {
            b.mo17982b(this.f26299m);
        }
    }

    /* renamed from: H */
    public final void mo19532H(@C0359n0 C9323b bVar) {
        ArrayList arrayList = new ArrayList();
        HashMap hashMap = new HashMap();
        JsonValue jsonValue = JsonValue.f25436b;
        for (String next : bVar.mo18816w()) {
            JsonValue A = bVar.mo18801A(next);
            if (f26290s.equals(next)) {
                jsonValue = A;
            } else if (f26289r.equals(next)) {
                Iterator<JsonValue> it = A.mo18784z().iterator();
                while (it.hasNext()) {
                    try {
                        arrayList.add(C9598a.m35950b(it.next()));
                    } catch (JsonException e) {
                        C36059m.m148411g(e, "Failed to parse remote config: %s", bVar);
                    }
                }
            } else {
                hashMap.put(next, A);
            }
        }
        mo19533I(jsonValue);
        mo19530F(C9598a.m35949a(arrayList, UAirship.m146181I(), UAirship.m146199k()));
        HashSet<String> hashSet = new HashSet<>(C9602c.f26273l);
        hashSet.addAll(hashMap.keySet());
        for (String str : hashSet) {
            JsonValue jsonValue2 = (JsonValue) hashMap.get(str);
            if (jsonValue2 == null) {
                this.f26294h.mo19521d(str, (C9323b) null);
            } else {
                this.f26294h.mo19521d(str, jsonValue2.mo18749A());
            }
        }
    }

    /* renamed from: I */
    public final void mo19533I(@C0359n0 JsonValue jsonValue) {
        this.f26299m = C9603d.m35971a(jsonValue);
        mo19531G();
    }

    /* renamed from: J */
    public final void mo19534J() {
        String str;
        if (this.f26296j.mo107873g()) {
            C9596k kVar = this.f26298l;
            if (kVar == null || kVar.mo19508d()) {
                if (this.f26297k.mo17959b() == 1) {
                    str = f26288q;
                } else {
                    str = f26287p;
                }
                this.f26298l = this.f26293g.mo19554h0(f26286o, str).mo19465p(new C9609d()).mo19468v(this.f26295i).mo19466t(this.f26295i).mo19467u(new C9608c());
                return;
            }
            return;
        }
        C9596k kVar2 = this.f26298l;
        if (kVar2 != null) {
            kVar2.mo19457a();
        }
    }

    /* renamed from: r */
    public void mo17625r() {
        super.mo17625r();
        mo19534J();
        this.f26296j.mo107868a(this.f26300n);
    }

    @C0344h1
    public C9605f(@C0359n0 Context context, @C0359n0 C36071u uVar, @C0359n0 C9061a aVar, @C0359n0 C36075v vVar, @C0359n0 C9619j jVar, @C0359n0 C9601b bVar, @C0359n0 C9587f fVar) {
        super(context, uVar);
        this.f26292f = new CopyOnWriteArraySet();
        this.f26300n = new C9607b();
        this.f26297k = aVar;
        this.f26296j = vVar;
        this.f26293g = jVar;
        this.f26294h = bVar;
        this.f26295i = fVar;
    }
}
