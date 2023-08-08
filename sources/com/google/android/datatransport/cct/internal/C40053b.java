package com.google.android.datatransport.cct.internal;

import com.google.android.datatransport.cct.C40045d;
import com.google.firebase.encoders.C33000c;
import com.google.firebase.encoders.C33005d;
import com.google.firebase.encoders.C33006e;
import com.google.firebase.encoders.config.C33003a;
import com.google.firebase.encoders.config.C33004b;
import com.google.firebase.remoteconfig.C33585u;
import java.io.IOException;

/* renamed from: com.google.android.datatransport.cct.internal.b */
public final class C40053b implements C33003a {

    /* renamed from: a */
    public static final int f102178a = 2;

    /* renamed from: b */
    public static final C33003a f102179b = new C40053b();

    /* renamed from: com.google.android.datatransport.cct.internal.b$a */
    public static final class C40054a implements C33005d<C40051a> {

        /* renamed from: a */
        public static final C40054a f102180a = new C40054a();

        /* renamed from: b */
        public static final C33000c f102181b = C33000c.m133161d(C33585u.C33587b.f81741w3);

        /* renamed from: c */
        public static final C33000c f102182c = C33000c.m133161d(C40045d.f102104u);

        /* renamed from: d */
        public static final C33000c f102183d = C33000c.m133161d(C40045d.f102105v);

        /* renamed from: e */
        public static final C33000c f102184e = C33000c.m133161d("device");

        /* renamed from: f */
        public static final C33000c f102185f = C33000c.m133161d("product");

        /* renamed from: g */
        public static final C33000c f102186g = C33000c.m133161d("osBuild");

        /* renamed from: h */
        public static final C33000c f102187h = C33000c.m133161d("manufacturer");

        /* renamed from: i */
        public static final C33000c f102188i = C33000c.m133161d(C40045d.f102085A);

        /* renamed from: j */
        public static final C33000c f102189j = C33000c.m133161d("locale");

        /* renamed from: k */
        public static final C33000c f102190k = C33000c.m133161d("country");

        /* renamed from: l */
        public static final C33000c f102191l = C33000c.m133161d("mccMnc");

        /* renamed from: m */
        public static final C33000c f102192m = C33000c.m133161d("applicationBuild");

        /* renamed from: b */
        public void mo85035a(C40051a aVar, C33006e eVar) throws IOException {
            eVar.mo85169k(f102181b, aVar.mo132591m());
            eVar.mo85169k(f102182c, aVar.mo132588j());
            eVar.mo85169k(f102183d, aVar.mo132584f());
            eVar.mo85169k(f102184e, aVar.mo132582d());
            eVar.mo85169k(f102185f, aVar.mo132590l());
            eVar.mo85169k(f102186g, aVar.mo132589k());
            eVar.mo85169k(f102187h, aVar.mo132586h());
            eVar.mo85169k(f102188i, aVar.mo132583e());
            eVar.mo85169k(f102189j, aVar.mo132585g());
            eVar.mo85169k(f102190k, aVar.mo132581c());
            eVar.mo85169k(f102191l, aVar.mo132587i());
            eVar.mo85169k(f102192m, aVar.mo132580b());
        }
    }

    /* renamed from: com.google.android.datatransport.cct.internal.b$b */
    public static final class C40055b implements C33005d<C40077j> {

        /* renamed from: a */
        public static final C40055b f102193a = new C40055b();

        /* renamed from: b */
        public static final C33000c f102194b = C33000c.m133161d("logRequest");

        /* renamed from: b */
        public void mo85035a(C40077j jVar, C33006e eVar) throws IOException {
            eVar.mo85169k(f102194b, jVar.mo132614c());
        }
    }

    /* renamed from: com.google.android.datatransport.cct.internal.b$c */
    public static final class C40056c implements C33005d<ClientInfo> {

        /* renamed from: a */
        public static final C40056c f102195a = new C40056c();

        /* renamed from: b */
        public static final C33000c f102196b = C33000c.m133161d("clientType");

        /* renamed from: c */
        public static final C33000c f102197c = C33000c.m133161d("androidClientInfo");

        /* renamed from: b */
        public void mo85035a(ClientInfo clientInfo, C33006e eVar) throws IOException {
            eVar.mo85169k(f102196b, clientInfo.mo132568c());
            eVar.mo85169k(f102197c, clientInfo.mo132567b());
        }
    }

    /* renamed from: com.google.android.datatransport.cct.internal.b$d */
    public static final class C40057d implements C33005d<C40078k> {

        /* renamed from: a */
        public static final C40057d f102198a = new C40057d();

        /* renamed from: b */
        public static final C33000c f102199b = C33000c.m133161d("eventTimeMs");

        /* renamed from: c */
        public static final C33000c f102200c = C33000c.m133161d("eventCode");

        /* renamed from: d */
        public static final C33000c f102201d = C33000c.m133161d("eventUptimeMs");

        /* renamed from: e */
        public static final C33000c f102202e = C33000c.m133161d("sourceExtension");

        /* renamed from: f */
        public static final C33000c f102203f = C33000c.m133161d("sourceExtensionJsonProto3");

        /* renamed from: g */
        public static final C33000c f102204g = C33000c.m133161d("timezoneOffsetSeconds");

        /* renamed from: h */
        public static final C33000c f102205h = C33000c.m133161d("networkConnectionInfo");

        /* renamed from: b */
        public void mo85035a(C40078k kVar, C33006e eVar) throws IOException {
            eVar.mo85160b(f102199b, kVar.mo132622c());
            eVar.mo85169k(f102200c, kVar.mo132621b());
            eVar.mo85160b(f102201d, kVar.mo132623d());
            eVar.mo85169k(f102202e, kVar.mo132626f());
            eVar.mo85169k(f102203f, kVar.mo132627g());
            eVar.mo85160b(f102204g, kVar.mo132628h());
            eVar.mo85169k(f102205h, kVar.mo132624e());
        }
    }

    /* renamed from: com.google.android.datatransport.cct.internal.b$e */
    public static final class C40058e implements C33005d<C40080l> {

        /* renamed from: a */
        public static final C40058e f102206a = new C40058e();

        /* renamed from: b */
        public static final C33000c f102207b = C33000c.m133161d("requestTimeMs");

        /* renamed from: c */
        public static final C33000c f102208c = C33000c.m133161d("requestUptimeMs");

        /* renamed from: d */
        public static final C33000c f102209d = C33000c.m133161d("clientInfo");

        /* renamed from: e */
        public static final C33000c f102210e = C33000c.m133161d("logSource");

        /* renamed from: f */
        public static final C33000c f102211f = C33000c.m133161d("logSourceName");

        /* renamed from: g */
        public static final C33000c f102212g = C33000c.m133161d("logEvent");

        /* renamed from: h */
        public static final C33000c f102213h = C33000c.m133161d("qosTier");

        /* renamed from: b */
        public void mo85035a(C40080l lVar, C33006e eVar) throws IOException {
            eVar.mo85160b(f102207b, lVar.mo132645g());
            eVar.mo85160b(f102208c, lVar.mo132646h());
            eVar.mo85169k(f102209d, lVar.mo132639b());
            eVar.mo85169k(f102210e, lVar.mo132641d());
            eVar.mo85169k(f102211f, lVar.mo132642e());
            eVar.mo85169k(f102212g, lVar.mo132640c());
            eVar.mo85169k(f102213h, lVar.mo132644f());
        }
    }

    /* renamed from: com.google.android.datatransport.cct.internal.b$f */
    public static final class C40059f implements C33005d<NetworkConnectionInfo> {

        /* renamed from: a */
        public static final C40059f f102214a = new C40059f();

        /* renamed from: b */
        public static final C33000c f102215b = C33000c.m133161d("networkType");

        /* renamed from: c */
        public static final C33000c f102216c = C33000c.m133161d("mobileSubtype");

        /* renamed from: b */
        public void mo85035a(NetworkConnectionInfo networkConnectionInfo, C33006e eVar) throws IOException {
            eVar.mo85169k(f102215b, networkConnectionInfo.mo132573c());
            eVar.mo85169k(f102216c, networkConnectionInfo.mo132572b());
        }
    }

    /* renamed from: a */
    public void mo85045a(C33004b<?> bVar) {
        C40055b bVar2 = C40055b.f102193a;
        bVar.mo85213b(C40077j.class, bVar2);
        bVar.mo85213b(C40063d.class, bVar2);
        C40058e eVar = C40058e.f102206a;
        bVar.mo85213b(C40080l.class, eVar);
        bVar.mo85213b(C40070g.class, eVar);
        C40056c cVar = C40056c.f102195a;
        bVar.mo85213b(ClientInfo.class, cVar);
        bVar.mo85213b(C40064e.class, cVar);
        C40054a aVar = C40054a.f102180a;
        bVar.mo85213b(C40051a.class, aVar);
        bVar.mo85213b(C40060c.class, aVar);
        C40057d dVar = C40057d.f102198a;
        bVar.mo85213b(C40078k.class, dVar);
        bVar.mo85213b(C40067f.class, dVar);
        C40059f fVar = C40059f.f102214a;
        bVar.mo85213b(NetworkConnectionInfo.class, fVar);
        bVar.mo85213b(C40074i.class, fVar);
    }
}
