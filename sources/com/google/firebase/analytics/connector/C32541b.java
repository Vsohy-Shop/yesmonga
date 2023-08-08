package com.google.firebase.analytics.connector;

import android.content.Context;
import android.os.Bundle;
import androidx.annotation.C0348i1;
import androidx.annotation.C0359n0;
import androidx.annotation.C0380x0;
import androidx.annotation.C0386z0;
import com.google.android.gms.common.annotation.C40473a;
import com.google.android.gms.common.internal.C40843u;
import com.google.android.gms.common.util.C40974d0;
import com.google.android.gms.internal.measurement.C41979h3;
import com.google.android.gms.measurement.api.C30638a;
import com.google.android.gms.measurement.internal.C30680c6;
import com.google.android.gms.measurement.internal.C30891t7;
import com.google.firebase.C32566c;
import com.google.firebase.C33033f;
import com.google.firebase.analytics.connector.C32537a;
import com.google.firebase.analytics.connector.internal.C32546a;
import com.google.firebase.analytics.connector.internal.C32548c;
import com.google.firebase.analytics.connector.internal.C32550e;
import com.google.firebase.analytics.connector.internal.C32552g;
import com.google.firebase.events.C33029a;
import com.google.firebase.events.C33032d;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: com.google.firebase.analytics.connector.b */
public class C32541b implements C32537a {

    /* renamed from: c */
    public static volatile C32537a f78997c;
    @C40974d0

    /* renamed from: a */
    public final C30638a f78998a;
    @C40974d0

    /* renamed from: b */
    public final Map f78999b = new ConcurrentHashMap();

    /* renamed from: com.google.firebase.analytics.connector.b$a */
    public class C32542a implements C32537a.C32538a {

        /* renamed from: a */
        public final /* synthetic */ String f79000a;

        public C32542a(String str) {
            this.f79000a = str;
        }

        /* renamed from: a */
        public final void mo94653a() {
            if (C32541b.this.mo94657m(this.f79000a)) {
                C32537a.C32539b zza = ((C32546a) C32541b.this.f78999b.get(this.f79000a)).zza();
                if (zza != null) {
                    zza.mo94656a(0, (Bundle) null);
                }
                C32541b.this.f78999b.remove(this.f79000a);
            }
        }

        @C40473a
        /* renamed from: b */
        public void mo94654b() {
            if (C32541b.this.mo94657m(this.f79000a) && this.f79000a.equals("fiam")) {
                ((C32546a) C32541b.this.f78999b.get(this.f79000a)).mo94661d();
            }
        }

        @C40473a
        /* renamed from: c */
        public void mo94655c(Set<String> set) {
            if (C32541b.this.mo94657m(this.f79000a) && this.f79000a.equals("fiam") && set != null && !set.isEmpty()) {
                ((C32546a) C32541b.this.f78999b.get(this.f79000a)).mo94660a(set);
            }
        }
    }

    public C32541b(C30638a aVar) {
        C40843u.m166202l(aVar);
        this.f78998a = aVar;
    }

    @C40473a
    @C0359n0
    /* renamed from: h */
    public static C32537a m131534h() {
        return m131535i(C33033f.m133333p());
    }

    @C40473a
    @C0359n0
    /* renamed from: i */
    public static C32537a m131535i(@C0359n0 C33033f fVar) {
        return (C32537a) fVar.mo95720l(C32537a.class);
    }

    @C0380x0(allOf = {"android.permission.INTERNET", "android.permission.ACCESS_NETWORK_STATE", "android.permission.WAKE_LOCK"})
    @C40473a
    @C0359n0
    /* renamed from: j */
    public static C32537a m131536j(@C0359n0 C33033f fVar, @C0359n0 Context context, @C0359n0 C33032d dVar) {
        C40843u.m166202l(fVar);
        C40843u.m166202l(context);
        C40843u.m166202l(dVar);
        C40843u.m166202l(context.getApplicationContext());
        if (f78997c == null) {
            synchronized (C32541b.class) {
                if (f78997c == null) {
                    Bundle bundle = new Bundle(1);
                    if (fVar.mo95706B()) {
                        dVar.mo94756b(C32566c.class, C32544d.f79002a, C32545e.f79003a);
                        bundle.putBoolean("dataCollectionDefaultEnabled", fVar.mo95705A());
                    }
                    f78997c = new C32541b(C41979h3.m170032D(context, (String) null, (String) null, (String) null, bundle).mo136893A());
                }
            }
        }
        return f78997c;
    }

    /* renamed from: k */
    public static /* synthetic */ void m131537k(C33029a aVar) {
        boolean z = ((C32566c) aVar.mo95702a()).f79032a;
        synchronized (C32541b.class) {
            ((C32541b) C40843u.m166202l(f78997c)).f78998a.mo86768B(z);
        }
    }

    @C40473a
    /* renamed from: a */
    public void mo94645a(@C0359n0 C32537a.C32540c cVar) {
        String str;
        int i = C32548c.f79011g;
        if (cVar != null && (str = cVar.f78982a) != null && !str.isEmpty()) {
            Object obj = cVar.f78984c;
            if ((obj == null || C30891t7.m124171a(obj) != null) && C32548c.m131557d(str) && C32548c.m131558e(str, cVar.f78983b)) {
                String str2 = cVar.f78992k;
                if (str2 == null || (C32548c.m131555b(str2, cVar.f78993l) && C32548c.m131554a(str, cVar.f78992k, cVar.f78993l))) {
                    String str3 = cVar.f78989h;
                    if (str3 == null || (C32548c.m131555b(str3, cVar.f78990i) && C32548c.m131554a(str, cVar.f78989h, cVar.f78990i))) {
                        String str4 = cVar.f78987f;
                        if (str4 == null || (C32548c.m131555b(str4, cVar.f78988g) && C32548c.m131554a(str, cVar.f78987f, cVar.f78988g))) {
                            C30638a aVar = this.f78998a;
                            Bundle bundle = new Bundle();
                            String str5 = cVar.f78982a;
                            if (str5 != null) {
                                bundle.putString("origin", str5);
                            }
                            String str6 = cVar.f78983b;
                            if (str6 != null) {
                                bundle.putString("name", str6);
                            }
                            Object obj2 = cVar.f78984c;
                            if (obj2 != null) {
                                C30680c6.m123534b(bundle, obj2);
                            }
                            String str7 = cVar.f78985d;
                            if (str7 != null) {
                                bundle.putString(C30638a.C30639a.f73195d, str7);
                            }
                            bundle.putLong(C30638a.C30639a.f73196e, cVar.f78986e);
                            String str8 = cVar.f78987f;
                            if (str8 != null) {
                                bundle.putString(C30638a.C30639a.f73197f, str8);
                            }
                            Bundle bundle2 = cVar.f78988g;
                            if (bundle2 != null) {
                                bundle.putBundle(C30638a.C30639a.f73198g, bundle2);
                            }
                            String str9 = cVar.f78989h;
                            if (str9 != null) {
                                bundle.putString(C30638a.C30639a.f73199h, str9);
                            }
                            Bundle bundle3 = cVar.f78990i;
                            if (bundle3 != null) {
                                bundle.putBundle(C30638a.C30639a.f73200i, bundle3);
                            }
                            bundle.putLong(C30638a.C30639a.f73201j, cVar.f78991j);
                            String str10 = cVar.f78992k;
                            if (str10 != null) {
                                bundle.putString(C30638a.C30639a.f73202k, str10);
                            }
                            Bundle bundle4 = cVar.f78993l;
                            if (bundle4 != null) {
                                bundle.putBundle(C30638a.C30639a.f73203l, bundle4);
                            }
                            bundle.putLong(C30638a.C30639a.f73204m, cVar.f78994m);
                            bundle.putBoolean(C30638a.C30639a.f73205n, cVar.f78995n);
                            bundle.putLong(C30638a.C30639a.f73206o, cVar.f78996o);
                            aVar.mo86786t(bundle);
                        }
                    }
                }
            }
        }
    }

    @C40473a
    /* renamed from: b */
    public void mo94646b(@C0359n0 String str, @C0359n0 String str2, @C0359n0 Bundle bundle) {
        if (bundle == null) {
            bundle = new Bundle();
        }
        if (C32548c.m131557d(str) && C32548c.m131555b(str2, bundle) && C32548c.m131554a(str, str2, bundle)) {
            if ("clx".equals(str) && "_ae".equals(str2)) {
                bundle.putLong("_r", 1);
            }
            this.f78998a.mo86781o(str, str2, bundle);
        }
    }

    @C40473a
    /* renamed from: c */
    public void mo94647c(@C0359n0 String str, @C0359n0 String str2, @C0359n0 Object obj) {
        if (C32548c.m131557d(str) && C32548c.m131558e(str, str2)) {
            this.f78998a.mo86792z(str, str2, obj);
        }
    }

    @C40473a
    public void clearConditionalUserProperty(@C0359n0 @C0386z0(max = 24, min = 1) String str, @C0359n0 String str2, @C0359n0 Bundle bundle) {
        if (str2 == null || C32548c.m131555b(str2, bundle)) {
            this.f78998a.mo86770b(str, str2, bundle);
        }
    }

    @C0348i1
    @C40473a
    @C0359n0
    /* renamed from: d */
    public Map<String, Object> mo94649d(boolean z) {
        return this.f78998a.mo86780n((String) null, (String) null, z);
    }

    @C0348i1
    @C40473a
    /* renamed from: e */
    public int mo94650e(@C0359n0 @C0386z0(min = 1) String str) {
        return this.f78998a.mo86779m(str);
    }

    @C0348i1
    @C40473a
    @C0359n0
    /* renamed from: f */
    public List<C32537a.C32540c> mo94651f(@C0359n0 String str, @C0359n0 @C0386z0(max = 23, min = 1) String str2) {
        ArrayList arrayList = new ArrayList();
        for (Bundle next : this.f78998a.mo86775g(str, str2)) {
            int i = C32548c.f79011g;
            C40843u.m166202l(next);
            C32537a.C32540c cVar = new C32537a.C32540c();
            Class<String> cls = String.class;
            cVar.f78982a = (String) C40843u.m166202l((String) C30680c6.m123533a(next, "origin", cls, (Object) null));
            cVar.f78983b = (String) C40843u.m166202l((String) C30680c6.m123533a(next, "name", cls, (Object) null));
            cVar.f78984c = C30680c6.m123533a(next, "value", Object.class, (Object) null);
            cVar.f78985d = (String) C30680c6.m123533a(next, C30638a.C30639a.f73195d, cls, (Object) null);
            Class<Long> cls2 = Long.class;
            cVar.f78986e = ((Long) C30680c6.m123533a(next, C30638a.C30639a.f73196e, cls2, 0L)).longValue();
            cVar.f78987f = (String) C30680c6.m123533a(next, C30638a.C30639a.f73197f, cls, (Object) null);
            Class<Bundle> cls3 = Bundle.class;
            cVar.f78988g = (Bundle) C30680c6.m123533a(next, C30638a.C30639a.f73198g, cls3, (Object) null);
            cVar.f78989h = (String) C30680c6.m123533a(next, C30638a.C30639a.f73199h, cls, (Object) null);
            cVar.f78990i = (Bundle) C30680c6.m123533a(next, C30638a.C30639a.f73200i, cls3, (Object) null);
            cVar.f78991j = ((Long) C30680c6.m123533a(next, C30638a.C30639a.f73201j, cls2, 0L)).longValue();
            cVar.f78992k = (String) C30680c6.m123533a(next, C30638a.C30639a.f73202k, cls, (Object) null);
            cVar.f78993l = (Bundle) C30680c6.m123533a(next, C30638a.C30639a.f73203l, cls3, (Object) null);
            cVar.f78995n = ((Boolean) C30680c6.m123533a(next, C30638a.C30639a.f73205n, Boolean.class, Boolean.FALSE)).booleanValue();
            cVar.f78994m = ((Long) C30680c6.m123533a(next, C30638a.C30639a.f73204m, cls2, 0L)).longValue();
            cVar.f78996o = ((Long) C30680c6.m123533a(next, C30638a.C30639a.f73206o, cls2, 0L)).longValue();
            arrayList.add(cVar);
        }
        return arrayList;
    }

    @C0348i1
    @C40473a
    @C0359n0
    /* renamed from: g */
    public C32537a.C32538a mo94652g(@C0359n0 String str, @C0359n0 C32537a.C32539b bVar) {
        Object obj;
        C40843u.m166202l(bVar);
        if (!C32548c.m131557d(str) || mo94657m(str)) {
            return null;
        }
        C30638a aVar = this.f78998a;
        if ("fiam".equals(str)) {
            obj = new C32550e(aVar, bVar);
        } else if ("clx".equals(str)) {
            obj = new C32552g(aVar, bVar);
        } else {
            obj = null;
        }
        if (obj == null) {
            return null;
        }
        this.f78999b.put(str, obj);
        return new C32542a(str);
    }

    /* renamed from: m */
    public final boolean mo94657m(@C0359n0 String str) {
        return !str.isEmpty() && this.f78999b.containsKey(str) && this.f78999b.get(str) != null;
    }
}
