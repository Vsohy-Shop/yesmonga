package com.google.firebase.crashlytics.internal.model;

import androidx.constraintlayout.core.motion.utils.C16717v;
import com.carrefour.fid.android.ecommerce.utils.C38212b;
import com.google.android.datatransport.cct.C40045d;
import com.google.firebase.crashlytics.internal.model.CrashlyticsReport;
import com.google.firebase.crashlytics.internal.settings.C32937f;
import com.google.firebase.encoders.C33000c;
import com.google.firebase.encoders.C33005d;
import com.google.firebase.encoders.C33006e;
import com.google.firebase.encoders.config.C33003a;
import com.google.firebase.encoders.config.C33004b;
import com.google.firebase.messaging.FirebaseMessaging;
import com.google.firebase.remoteconfig.C33585u;
import com.urbanairship.iam.C9168d0;
import com.urbanairship.iam.assets.Assets;
import com.usabilla.sdk.ubform.p007db.telemetry.TelemetryTable;
import java.io.IOException;

/* renamed from: com.google.firebase.crashlytics.internal.model.a */
public final class C32806a implements C33003a {

    /* renamed from: a */
    public static final int f79562a = 2;

    /* renamed from: b */
    public static final C33003a f79563b = new C32806a();

    /* renamed from: com.google.firebase.crashlytics.internal.model.a$a */
    public static final class C32807a implements C33005d<CrashlyticsReport.C32762a.C32763a> {

        /* renamed from: a */
        public static final C32807a f79564a = new C32807a();

        /* renamed from: b */
        public static final C33000c f79565b = C33000c.m133161d("arch");

        /* renamed from: c */
        public static final C33000c f79566c = C33000c.m133161d("libraryName");

        /* renamed from: d */
        public static final C33000c f79567d = C33000c.m133161d("buildId");

        /* renamed from: b */
        public void mo85035a(CrashlyticsReport.C32762a.C32763a aVar, C33006e eVar) throws IOException {
            eVar.mo85169k(f79565b, aVar.mo95157b());
            eVar.mo85169k(f79566c, aVar.mo95159d());
            eVar.mo85169k(f79567d, aVar.mo95158c());
        }
    }

    /* renamed from: com.google.firebase.crashlytics.internal.model.a$b */
    public static final class C32808b implements C33005d<CrashlyticsReport.C32762a> {

        /* renamed from: a */
        public static final C32808b f79568a = new C32808b();

        /* renamed from: b */
        public static final C33000c f79569b = C33000c.m133161d("pid");

        /* renamed from: c */
        public static final C33000c f79570c = C33000c.m133161d("processName");

        /* renamed from: d */
        public static final C33000c f79571d = C33000c.m133161d("reasonCode");

        /* renamed from: e */
        public static final C33000c f79572e = C33000c.m133161d("importance");

        /* renamed from: f */
        public static final C33000c f79573f = C33000c.m133161d("pss");

        /* renamed from: g */
        public static final C33000c f79574g = C33000c.m133161d("rss");

        /* renamed from: h */
        public static final C33000c f79575h = C33000c.m133161d("timestamp");

        /* renamed from: i */
        public static final C33000c f79576i = C33000c.m133161d("traceFile");

        /* renamed from: j */
        public static final C33000c f79577j = C33000c.m133161d("buildIdMappingForArch");

        /* renamed from: b */
        public void mo85035a(CrashlyticsReport.C32762a aVar, C33006e eVar) throws IOException {
            eVar.mo85161c(f79569b, aVar.mo95150d());
            eVar.mo85169k(f79570c, aVar.mo95151e());
            eVar.mo85161c(f79571d, aVar.mo95153g());
            eVar.mo85161c(f79572e, aVar.mo95149c());
            eVar.mo85160b(f79573f, aVar.mo95152f());
            eVar.mo85160b(f79574g, aVar.mo95154h());
            eVar.mo85160b(f79575h, aVar.mo95155i());
            eVar.mo85169k(f79576i, aVar.mo95156j());
            eVar.mo85169k(f79577j, aVar.mo95148b());
        }
    }

    /* renamed from: com.google.firebase.crashlytics.internal.model.a$c */
    public static final class C32809c implements C33005d<CrashlyticsReport.C32768d> {

        /* renamed from: a */
        public static final C32809c f79578a = new C32809c();

        /* renamed from: b */
        public static final C33000c f79579b = C33000c.m133161d("key");

        /* renamed from: c */
        public static final C33000c f79580c = C33000c.m133161d("value");

        /* renamed from: b */
        public void mo85035a(CrashlyticsReport.C32768d dVar, C33006e eVar) throws IOException {
            eVar.mo85169k(f79579b, dVar.mo95183b());
            eVar.mo85169k(f79580c, dVar.mo95184c());
        }
    }

    /* renamed from: com.google.firebase.crashlytics.internal.model.a$d */
    public static final class C32810d implements C33005d<CrashlyticsReport> {

        /* renamed from: a */
        public static final C32810d f79581a = new C32810d();

        /* renamed from: b */
        public static final C33000c f79582b = C33000c.m133161d(C33585u.C33587b.f81741w3);

        /* renamed from: c */
        public static final C33000c f79583c = C33000c.m133161d("gmpAppId");

        /* renamed from: d */
        public static final C33000c f79584d = C33000c.m133161d("platform");

        /* renamed from: e */
        public static final C33000c f79585e = C33000c.m133161d("installationUuid");

        /* renamed from: f */
        public static final C33000c f79586f = C33000c.m133161d("buildVersion");

        /* renamed from: g */
        public static final C33000c f79587g = C33000c.m133161d("displayVersion");

        /* renamed from: h */
        public static final C33000c f79588h = C33000c.m133161d(C32937f.f80028b);

        /* renamed from: i */
        public static final C33000c f79589i = C33000c.m133161d("ndkPayload");

        /* renamed from: b */
        public void mo85035a(CrashlyticsReport crashlyticsReport, C33006e eVar) throws IOException {
            eVar.mo85169k(f79582b, crashlyticsReport.mo95140i());
            eVar.mo85169k(f79583c, crashlyticsReport.mo95136e());
            eVar.mo85161c(f79584d, crashlyticsReport.mo95139h());
            eVar.mo85169k(f79585e, crashlyticsReport.mo95137f());
            eVar.mo85169k(f79586f, crashlyticsReport.mo95134c());
            eVar.mo85169k(f79587g, crashlyticsReport.mo95135d());
            eVar.mo85169k(f79588h, crashlyticsReport.mo95141j());
            eVar.mo85169k(f79589i, crashlyticsReport.mo95138g());
        }
    }

    /* renamed from: com.google.firebase.crashlytics.internal.model.a$e */
    public static final class C32811e implements C33005d<CrashlyticsReport.C32770e> {

        /* renamed from: a */
        public static final C32811e f79590a = new C32811e();

        /* renamed from: b */
        public static final C33000c f79591b = C33000c.m133161d(Assets.f24729v);

        /* renamed from: c */
        public static final C33000c f79592c = C33000c.m133161d("orgId");

        /* renamed from: b */
        public void mo85035a(CrashlyticsReport.C32770e eVar, C33006e eVar2) throws IOException {
            eVar2.mo85169k(f79591b, eVar.mo95188b());
            eVar2.mo85169k(f79592c, eVar.mo95189c());
        }
    }

    /* renamed from: com.google.firebase.crashlytics.internal.model.a$f */
    public static final class C32812f implements C33005d<CrashlyticsReport.C32770e.C32772b> {

        /* renamed from: a */
        public static final C32812f f79593a = new C32812f();

        /* renamed from: b */
        public static final C33000c f79594b = C33000c.m133161d("filename");

        /* renamed from: c */
        public static final C33000c f79595c = C33000c.m133161d("contents");

        /* renamed from: b */
        public void mo85035a(CrashlyticsReport.C32770e.C32772b bVar, C33006e eVar) throws IOException {
            eVar.mo85169k(f79594b, bVar.mo95195c());
            eVar.mo85169k(f79595c, bVar.mo95194b());
        }
    }

    /* renamed from: com.google.firebase.crashlytics.internal.model.a$g */
    public static final class C32813g implements C33005d<CrashlyticsReport.C32774f.C32775a> {

        /* renamed from: a */
        public static final C32813g f79596a = new C32813g();

        /* renamed from: b */
        public static final C33000c f79597b = C33000c.m133161d("identifier");

        /* renamed from: c */
        public static final C33000c f79598c = C33000c.m133161d("version");

        /* renamed from: d */
        public static final C33000c f79599d = C33000c.m133161d("displayVersion");

        /* renamed from: e */
        public static final C33000c f79600e = C33000c.m133161d("organization");

        /* renamed from: f */
        public static final C33000c f79601f = C33000c.m133161d("installationUuid");

        /* renamed from: g */
        public static final C33000c f79602g = C33000c.m133161d("developmentPlatform");

        /* renamed from: h */
        public static final C33000c f79603h = C33000c.m133161d("developmentPlatformVersion");

        /* renamed from: b */
        public void mo85035a(CrashlyticsReport.C32774f.C32775a aVar, C33006e eVar) throws IOException {
            eVar.mo85169k(f79597b, aVar.mo95218e());
            eVar.mo85169k(f79598c, aVar.mo95221h());
            eVar.mo85169k(f79599d, aVar.mo95217d());
            eVar.mo85169k(f79600e, aVar.mo95220g());
            eVar.mo85169k(f79601f, aVar.mo95219f());
            eVar.mo85169k(f79602g, aVar.mo95215b());
            eVar.mo85169k(f79603h, aVar.mo95216c());
        }
    }

    /* renamed from: com.google.firebase.crashlytics.internal.model.a$h */
    public static final class C32814h implements C33005d<CrashlyticsReport.C32774f.C32775a.C32777b> {

        /* renamed from: a */
        public static final C32814h f79604a = new C32814h();

        /* renamed from: b */
        public static final C33000c f79605b = C33000c.m133161d("clsId");

        /* renamed from: b */
        public void mo85035a(CrashlyticsReport.C32774f.C32775a.C32777b bVar, C33006e eVar) throws IOException {
            eVar.mo85169k(f79605b, bVar.mo95232b());
        }
    }

    /* renamed from: com.google.firebase.crashlytics.internal.model.a$i */
    public static final class C32815i implements C33005d<CrashlyticsReport.C32774f.C32780c> {

        /* renamed from: a */
        public static final C32815i f79606a = new C32815i();

        /* renamed from: b */
        public static final C33000c f79607b = C33000c.m133161d("arch");

        /* renamed from: c */
        public static final C33000c f79608c = C33000c.m133161d(C40045d.f102104u);

        /* renamed from: d */
        public static final C33000c f79609d = C33000c.m133161d("cores");

        /* renamed from: e */
        public static final C33000c f79610e = C33000c.m133161d("ram");

        /* renamed from: f */
        public static final C33000c f79611f = C33000c.m133161d("diskSpace");

        /* renamed from: g */
        public static final C33000c f79612g = C33000c.m133161d("simulator");

        /* renamed from: h */
        public static final C33000c f79613h = C33000c.m133161d("state");

        /* renamed from: i */
        public static final C33000c f79614i = C33000c.m133161d("manufacturer");

        /* renamed from: j */
        public static final C33000c f79615j = C33000c.m133161d("modelClass");

        /* renamed from: b */
        public void mo85035a(CrashlyticsReport.C32774f.C32780c cVar, C33006e eVar) throws IOException {
            eVar.mo85161c(f79607b, cVar.mo95249b());
            eVar.mo85169k(f79608c, cVar.mo95253f());
            eVar.mo85161c(f79609d, cVar.mo95250c());
            eVar.mo85160b(f79610e, cVar.mo95255h());
            eVar.mo85160b(f79611f, cVar.mo95251d());
            eVar.mo85159a(f79612g, cVar.mo95257j());
            eVar.mo85161c(f79613h, cVar.mo95256i());
            eVar.mo85169k(f79614i, cVar.mo95252e());
            eVar.mo85169k(f79615j, cVar.mo95254g());
        }
    }

    /* renamed from: com.google.firebase.crashlytics.internal.model.a$j */
    public static final class C32816j implements C33005d<CrashlyticsReport.C32774f> {

        /* renamed from: a */
        public static final C32816j f79616a = new C32816j();

        /* renamed from: b */
        public static final C33000c f79617b = C33000c.m133161d("generator");

        /* renamed from: c */
        public static final C33000c f79618c = C33000c.m133161d("identifier");

        /* renamed from: d */
        public static final C33000c f79619d = C33000c.m133161d("startedAt");

        /* renamed from: e */
        public static final C33000c f79620e = C33000c.m133161d("endedAt");

        /* renamed from: f */
        public static final C33000c f79621f = C33000c.m133161d("crashed");

        /* renamed from: g */
        public static final C33000c f79622g = C33000c.m133161d(FirebaseMessaging.f80405r);

        /* renamed from: h */
        public static final C33000c f79623h = C33000c.m133161d(C38212b.f96784D);

        /* renamed from: i */
        public static final C33000c f79624i = C33000c.m133161d("os");

        /* renamed from: j */
        public static final C33000c f79625j = C33000c.m133161d("device");

        /* renamed from: k */
        public static final C33000c f79626k = C33000c.m133161d("events");

        /* renamed from: l */
        public static final C33000c f79627l = C33000c.m133161d("generatorType");

        /* renamed from: b */
        public void mo85035a(CrashlyticsReport.C32774f fVar, C33006e eVar) throws IOException {
            eVar.mo85169k(f79617b, fVar.mo95203f());
            eVar.mo85169k(f79618c, fVar.mo95206i());
            eVar.mo85160b(f79619d, fVar.mo95208k());
            eVar.mo85169k(f79620e, fVar.mo95201d());
            eVar.mo85159a(f79621f, fVar.mo95210m());
            eVar.mo85169k(f79622g, fVar.mo95199b());
            eVar.mo85169k(f79623h, fVar.mo95209l());
            eVar.mo85169k(f79624i, fVar.mo95207j());
            eVar.mo85169k(f79625j, fVar.mo95200c());
            eVar.mo85169k(f79626k, fVar.mo95202e());
            eVar.mo85161c(f79627l, fVar.mo95204g());
        }
    }

    /* renamed from: com.google.firebase.crashlytics.internal.model.a$k */
    public static final class C32817k implements C33005d<CrashlyticsReport.C32774f.C32782d.C32783a> {

        /* renamed from: a */
        public static final C32817k f79628a = new C32817k();

        /* renamed from: b */
        public static final C33000c f79629b = C33000c.m133161d("execution");

        /* renamed from: c */
        public static final C33000c f79630c = C33000c.m133161d("customAttributes");

        /* renamed from: d */
        public static final C33000c f79631d = C33000c.m133161d("internalKeys");

        /* renamed from: e */
        public static final C33000c f79632e = C33000c.m133161d("background");

        /* renamed from: f */
        public static final C33000c f79633f = C33000c.m133161d("uiOrientation");

        /* renamed from: b */
        public void mo85035a(CrashlyticsReport.C32774f.C32782d.C32783a aVar, C33006e eVar) throws IOException {
            eVar.mo85169k(f79629b, aVar.mo95276d());
            eVar.mo85169k(f79630c, aVar.mo95275c());
            eVar.mo85169k(f79631d, aVar.mo95277e());
            eVar.mo85169k(f79632e, aVar.mo95274b());
            eVar.mo85161c(f79633f, aVar.mo95278f());
        }
    }

    /* renamed from: com.google.firebase.crashlytics.internal.model.a$l */
    public static final class C32818l implements C33005d<CrashlyticsReport.C32774f.C32782d.C32783a.C32785b.C32786a> {

        /* renamed from: a */
        public static final C32818l f79634a = new C32818l();

        /* renamed from: b */
        public static final C33000c f79635b = C33000c.m133161d("baseAddress");

        /* renamed from: c */
        public static final C33000c f79636c = C33000c.m133161d(C9168d0.f24889w);

        /* renamed from: d */
        public static final C33000c f79637d = C33000c.m133161d("name");

        /* renamed from: e */
        public static final C33000c f79638e = C33000c.m133161d("uuid");

        /* renamed from: b */
        public void mo85035a(CrashlyticsReport.C32774f.C32782d.C32783a.C32785b.C32786a aVar, C33006e eVar) throws IOException {
            eVar.mo85160b(f79635b, aVar.mo95291b());
            eVar.mo85160b(f79636c, aVar.mo95293d());
            eVar.mo85169k(f79637d, aVar.mo95292c());
            eVar.mo85169k(f79638e, aVar.mo95295f());
        }
    }

    /* renamed from: com.google.firebase.crashlytics.internal.model.a$m */
    public static final class C32819m implements C33005d<CrashlyticsReport.C32774f.C32782d.C32783a.C32785b> {

        /* renamed from: a */
        public static final C32819m f79639a = new C32819m();

        /* renamed from: b */
        public static final C33000c f79640b = C33000c.m133161d("threads");

        /* renamed from: c */
        public static final C33000c f79641c = C33000c.m133161d("exception");

        /* renamed from: d */
        public static final C33000c f79642d = C33000c.m133161d("appExitInfo");

        /* renamed from: e */
        public static final C33000c f79643e = C33000c.m133161d("signal");

        /* renamed from: f */
        public static final C33000c f79644f = C33000c.m133161d("binaries");

        /* renamed from: b */
        public void mo85035a(CrashlyticsReport.C32774f.C32782d.C32783a.C32785b bVar, C33006e eVar) throws IOException {
            eVar.mo85169k(f79640b, bVar.mo95290f());
            eVar.mo85169k(f79641c, bVar.mo95288d());
            eVar.mo85169k(f79642d, bVar.mo95286b());
            eVar.mo85169k(f79643e, bVar.mo95289e());
            eVar.mo85169k(f79644f, bVar.mo95287c());
        }
    }

    /* renamed from: com.google.firebase.crashlytics.internal.model.a$n */
    public static final class C32820n implements C33005d<CrashlyticsReport.C32774f.C32782d.C32783a.C32785b.C32789c> {

        /* renamed from: a */
        public static final C32820n f79645a = new C32820n();

        /* renamed from: b */
        public static final C33000c f79646b = C33000c.m133161d("type");

        /* renamed from: c */
        public static final C33000c f79647c = C33000c.m133161d("reason");

        /* renamed from: d */
        public static final C33000c f79648d = C33000c.m133161d("frames");

        /* renamed from: e */
        public static final C33000c f79649e = C33000c.m133161d("causedBy");

        /* renamed from: f */
        public static final C33000c f79650f = C33000c.m133161d("overflowCount");

        /* renamed from: b */
        public void mo85035a(CrashlyticsReport.C32774f.C32782d.C32783a.C32785b.C32789c cVar, C33006e eVar) throws IOException {
            eVar.mo85169k(f79646b, cVar.mo95312f());
            eVar.mo85169k(f79647c, cVar.mo95311e());
            eVar.mo85169k(f79648d, cVar.mo95309c());
            eVar.mo85169k(f79649e, cVar.mo95308b());
            eVar.mo85161c(f79650f, cVar.mo95310d());
        }
    }

    /* renamed from: com.google.firebase.crashlytics.internal.model.a$o */
    public static final class C32821o implements C33005d<CrashlyticsReport.C32774f.C32782d.C32783a.C32785b.C32791d> {

        /* renamed from: a */
        public static final C32821o f79651a = new C32821o();

        /* renamed from: b */
        public static final C33000c f79652b = C33000c.m133161d("name");

        /* renamed from: c */
        public static final C33000c f79653c = C33000c.m133161d("code");

        /* renamed from: d */
        public static final C33000c f79654d = C33000c.m133161d("address");

        /* renamed from: b */
        public void mo85035a(CrashlyticsReport.C32774f.C32782d.C32783a.C32785b.C32791d dVar, C33006e eVar) throws IOException {
            eVar.mo85169k(f79652b, dVar.mo95321d());
            eVar.mo85169k(f79653c, dVar.mo95320c());
            eVar.mo85160b(f79654d, dVar.mo95319b());
        }
    }

    /* renamed from: com.google.firebase.crashlytics.internal.model.a$p */
    public static final class C32822p implements C33005d<CrashlyticsReport.C32774f.C32782d.C32783a.C32785b.C32793e> {

        /* renamed from: a */
        public static final C32822p f79655a = new C32822p();

        /* renamed from: b */
        public static final C33000c f79656b = C33000c.m133161d("name");

        /* renamed from: c */
        public static final C33000c f79657c = C33000c.m133161d("importance");

        /* renamed from: d */
        public static final C33000c f79658d = C33000c.m133161d("frames");

        /* renamed from: b */
        public void mo85035a(CrashlyticsReport.C32774f.C32782d.C32783a.C32785b.C32793e eVar, C33006e eVar2) throws IOException {
            eVar2.mo85169k(f79656b, eVar.mo95328d());
            eVar2.mo85161c(f79657c, eVar.mo95327c());
            eVar2.mo85169k(f79658d, eVar.mo95326b());
        }
    }

    /* renamed from: com.google.firebase.crashlytics.internal.model.a$q */
    public static final class C32823q implements C33005d<CrashlyticsReport.C32774f.C32782d.C32783a.C32785b.C32793e.C32795b> {

        /* renamed from: a */
        public static final C32823q f79659a = new C32823q();

        /* renamed from: b */
        public static final C33000c f79660b = C33000c.m133161d("pc");

        /* renamed from: c */
        public static final C33000c f79661c = C33000c.m133161d("symbol");

        /* renamed from: d */
        public static final C33000c f79662d = C33000c.m133161d("file");

        /* renamed from: e */
        public static final C33000c f79663e = C33000c.m133161d(C16717v.C16720c.f42211R);

        /* renamed from: f */
        public static final C33000c f79664f = C33000c.m133161d("importance");

        /* renamed from: b */
        public void mo85035a(CrashlyticsReport.C32774f.C32782d.C32783a.C32785b.C32793e.C32795b bVar, C33006e eVar) throws IOException {
            eVar.mo85160b(f79660b, bVar.mo95336e());
            eVar.mo85169k(f79661c, bVar.mo95337f());
            eVar.mo85169k(f79662d, bVar.mo95333b());
            eVar.mo85160b(f79663e, bVar.mo95335d());
            eVar.mo85161c(f79664f, bVar.mo95334c());
        }
    }

    /* renamed from: com.google.firebase.crashlytics.internal.model.a$r */
    public static final class C32824r implements C33005d<CrashlyticsReport.C32774f.C32782d.C32798c> {

        /* renamed from: a */
        public static final C32824r f79665a = new C32824r();

        /* renamed from: b */
        public static final C33000c f79666b = C33000c.m133161d("batteryLevel");

        /* renamed from: c */
        public static final C33000c f79667c = C33000c.m133161d("batteryVelocity");

        /* renamed from: d */
        public static final C33000c f79668d = C33000c.m133161d("proximityOn");

        /* renamed from: e */
        public static final C33000c f79669e = C33000c.m133161d("orientation");

        /* renamed from: f */
        public static final C33000c f79670f = C33000c.m133161d("ramUsed");

        /* renamed from: g */
        public static final C33000c f79671g = C33000c.m133161d("diskUsed");

        /* renamed from: b */
        public void mo85035a(CrashlyticsReport.C32774f.C32782d.C32798c cVar, C33006e eVar) throws IOException {
            eVar.mo85169k(f79666b, cVar.mo95350b());
            eVar.mo85161c(f79667c, cVar.mo95351c());
            eVar.mo85159a(f79668d, cVar.mo95355g());
            eVar.mo85161c(f79669e, cVar.mo95353e());
            eVar.mo85160b(f79670f, cVar.mo95354f());
            eVar.mo85160b(f79671g, cVar.mo95352d());
        }
    }

    /* renamed from: com.google.firebase.crashlytics.internal.model.a$s */
    public static final class C32825s implements C33005d<CrashlyticsReport.C32774f.C32782d> {

        /* renamed from: a */
        public static final C32825s f79672a = new C32825s();

        /* renamed from: b */
        public static final C33000c f79673b = C33000c.m133161d("timestamp");

        /* renamed from: c */
        public static final C33000c f79674c = C33000c.m133161d("type");

        /* renamed from: d */
        public static final C33000c f79675d = C33000c.m133161d(FirebaseMessaging.f80405r);

        /* renamed from: e */
        public static final C33000c f79676e = C33000c.m133161d("device");

        /* renamed from: f */
        public static final C33000c f79677f = C33000c.m133161d(TelemetryTable.f26835g);

        /* renamed from: b */
        public void mo85035a(CrashlyticsReport.C32774f.C32782d dVar, C33006e eVar) throws IOException {
            eVar.mo85160b(f79673b, dVar.mo95271e());
            eVar.mo85169k(f79674c, dVar.mo95272f());
            eVar.mo85169k(f79675d, dVar.mo95268b());
            eVar.mo85169k(f79676e, dVar.mo95269c());
            eVar.mo85169k(f79677f, dVar.mo95270d());
        }
    }

    /* renamed from: com.google.firebase.crashlytics.internal.model.a$t */
    public static final class C32826t implements C33005d<CrashlyticsReport.C32774f.C32782d.C32800d> {

        /* renamed from: a */
        public static final C32826t f79678a = new C32826t();

        /* renamed from: b */
        public static final C33000c f79679b = C33000c.m133161d("content");

        /* renamed from: b */
        public void mo85035a(CrashlyticsReport.C32774f.C32782d.C32800d dVar, C33006e eVar) throws IOException {
            eVar.mo85169k(f79679b, dVar.mo95363b());
        }
    }

    /* renamed from: com.google.firebase.crashlytics.internal.model.a$u */
    public static final class C32827u implements C33005d<CrashlyticsReport.C32774f.C32802e> {

        /* renamed from: a */
        public static final C32827u f79680a = new C32827u();

        /* renamed from: b */
        public static final C33000c f79681b = C33000c.m133161d("platform");

        /* renamed from: c */
        public static final C33000c f79682c = C33000c.m133161d("version");

        /* renamed from: d */
        public static final C33000c f79683d = C33000c.m133161d("buildVersion");

        /* renamed from: e */
        public static final C33000c f79684e = C33000c.m133161d("jailbroken");

        /* renamed from: b */
        public void mo85035a(CrashlyticsReport.C32774f.C32802e eVar, C33006e eVar2) throws IOException {
            eVar2.mo85161c(f79681b, eVar.mo95367c());
            eVar2.mo85169k(f79682c, eVar.mo95368d());
            eVar2.mo85169k(f79683d, eVar.mo95366b());
            eVar2.mo85159a(f79684e, eVar.mo95369e());
        }
    }

    /* renamed from: com.google.firebase.crashlytics.internal.model.a$v */
    public static final class C32828v implements C33005d<CrashlyticsReport.C32774f.C32804f> {

        /* renamed from: a */
        public static final C32828v f79685a = new C32828v();

        /* renamed from: b */
        public static final C33000c f79686b = C33000c.m133161d("identifier");

        /* renamed from: b */
        public void mo85035a(CrashlyticsReport.C32774f.C32804f fVar, C33006e eVar) throws IOException {
            eVar.mo85169k(f79686b, fVar.mo95375b());
        }
    }

    /* renamed from: a */
    public void mo85045a(C33004b<?> bVar) {
        C32810d dVar = C32810d.f79581a;
        bVar.mo85213b(CrashlyticsReport.class, dVar);
        bVar.mo85213b(C32830b.class, dVar);
        C32816j jVar = C32816j.f79616a;
        bVar.mo85213b(CrashlyticsReport.C32774f.class, jVar);
        bVar.mo85213b(C32853h.class, jVar);
        C32813g gVar = C32813g.f79596a;
        bVar.mo85213b(CrashlyticsReport.C32774f.C32775a.class, gVar);
        bVar.mo85213b(C32856i.class, gVar);
        C32814h hVar = C32814h.f79604a;
        bVar.mo85213b(CrashlyticsReport.C32774f.C32775a.C32777b.class, hVar);
        bVar.mo85213b(C32859j.class, hVar);
        C32828v vVar = C32828v.f79685a;
        bVar.mo85213b(CrashlyticsReport.C32774f.C32804f.class, vVar);
        bVar.mo85213b(C32907w.class, vVar);
        C32827u uVar = C32827u.f79680a;
        bVar.mo85213b(CrashlyticsReport.C32774f.C32802e.class, uVar);
        bVar.mo85213b(C32904v.class, uVar);
        C32815i iVar = C32815i.f79606a;
        bVar.mo85213b(CrashlyticsReport.C32774f.C32780c.class, iVar);
        bVar.mo85213b(C32862k.class, iVar);
        C32825s sVar = C32825s.f79672a;
        bVar.mo85213b(CrashlyticsReport.C32774f.C32782d.class, sVar);
        bVar.mo85213b(C32865l.class, sVar);
        C32817k kVar = C32817k.f79628a;
        bVar.mo85213b(CrashlyticsReport.C32774f.C32782d.C32783a.class, kVar);
        bVar.mo85213b(C32868m.class, kVar);
        C32819m mVar = C32819m.f79639a;
        bVar.mo85213b(CrashlyticsReport.C32774f.C32782d.C32783a.C32785b.class, mVar);
        bVar.mo85213b(C32871n.class, mVar);
        C32822p pVar = C32822p.f79655a;
        bVar.mo85213b(CrashlyticsReport.C32774f.C32782d.C32783a.C32785b.C32793e.class, pVar);
        bVar.mo85213b(C32883r.class, pVar);
        C32823q qVar = C32823q.f79659a;
        bVar.mo85213b(CrashlyticsReport.C32774f.C32782d.C32783a.C32785b.C32793e.C32795b.class, qVar);
        bVar.mo85213b(C32886s.class, qVar);
        C32820n nVar = C32820n.f79645a;
        bVar.mo85213b(CrashlyticsReport.C32774f.C32782d.C32783a.C32785b.C32789c.class, nVar);
        bVar.mo85213b(C32877p.class, nVar);
        C32808b bVar2 = C32808b.f79568a;
        bVar.mo85213b(CrashlyticsReport.C32762a.class, bVar2);
        bVar.mo85213b(C32834c.class, bVar2);
        C32807a aVar = C32807a.f79564a;
        bVar.mo85213b(CrashlyticsReport.C32762a.C32763a.class, aVar);
        bVar.mo85213b(C32841d.class, aVar);
        C32821o oVar = C32821o.f79651a;
        bVar.mo85213b(CrashlyticsReport.C32774f.C32782d.C32783a.C32785b.C32791d.class, oVar);
        bVar.mo85213b(C32880q.class, oVar);
        C32818l lVar = C32818l.f79634a;
        bVar.mo85213b(CrashlyticsReport.C32774f.C32782d.C32783a.C32785b.C32786a.class, lVar);
        bVar.mo85213b(C32874o.class, lVar);
        C32809c cVar = C32809c.f79578a;
        bVar.mo85213b(CrashlyticsReport.C32768d.class, cVar);
        bVar.mo85213b(C32844e.class, cVar);
        C32824r rVar = C32824r.f79665a;
        bVar.mo85213b(CrashlyticsReport.C32774f.C32782d.C32798c.class, rVar);
        bVar.mo85213b(C32898t.class, rVar);
        C32826t tVar = C32826t.f79678a;
        bVar.mo85213b(CrashlyticsReport.C32774f.C32782d.C32800d.class, tVar);
        bVar.mo85213b(C32901u.class, tVar);
        C32811e eVar = C32811e.f79590a;
        bVar.mo85213b(CrashlyticsReport.C32770e.class, eVar);
        bVar.mo85213b(C32847f.class, eVar);
        C32812f fVar = C32812f.f79593a;
        bVar.mo85213b(CrashlyticsReport.C32770e.C32772b.class, fVar);
        bVar.mo85213b(C32850g.class, fVar);
    }
}
