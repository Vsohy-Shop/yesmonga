package com.google.android.datatransport.runtime;

import com.google.android.datatransport.runtime.firebase.transport.C40177a;
import com.google.android.datatransport.runtime.firebase.transport.C40179b;
import com.google.android.datatransport.runtime.firebase.transport.C40181c;
import com.google.android.datatransport.runtime.firebase.transport.C40183d;
import com.google.android.datatransport.runtime.firebase.transport.C40185e;
import com.google.android.datatransport.runtime.firebase.transport.LogEventDropped;
import com.google.firebase.encoders.C33000c;
import com.google.firebase.encoders.C33005d;
import com.google.firebase.encoders.C33006e;
import com.google.firebase.encoders.config.C33003a;
import com.google.firebase.encoders.config.C33004b;
import com.google.firebase.encoders.proto.C33018a;
import java.io.IOException;

/* renamed from: com.google.android.datatransport.runtime.a */
public final class C40089a implements C33003a {

    /* renamed from: a */
    public static final int f102280a = 2;

    /* renamed from: b */
    public static final C33003a f102281b = new C40089a();

    /* renamed from: com.google.android.datatransport.runtime.a$a */
    public static final class C40090a implements C33005d<C40177a> {

        /* renamed from: a */
        public static final C40090a f102282a = new C40090a();

        /* renamed from: b */
        public static final C33000c f102283b = C33000c.m133160a("window").mo95637b(C33018a.m133253b().mo95668d(1).mo95666a()).mo95636a();

        /* renamed from: c */
        public static final C33000c f102284c = C33000c.m133160a("logSourceMetrics").mo95637b(C33018a.m133253b().mo95668d(2).mo95666a()).mo95636a();

        /* renamed from: d */
        public static final C33000c f102285d = C33000c.m133160a("globalMetrics").mo95637b(C33018a.m133253b().mo95668d(3).mo95666a()).mo95636a();

        /* renamed from: e */
        public static final C33000c f102286e = C33000c.m133160a("appNamespace").mo95637b(C33018a.m133253b().mo95668d(4).mo95666a()).mo95636a();

        /* renamed from: b */
        public void mo85035a(C40177a aVar, C33006e eVar) throws IOException {
            eVar.mo85169k(f102283b, aVar.mo132800g());
            eVar.mo85169k(f102284c, aVar.mo132798e());
            eVar.mo85169k(f102285d, aVar.mo132797d());
            eVar.mo85169k(f102286e, aVar.mo132795a());
        }
    }

    /* renamed from: com.google.android.datatransport.runtime.a$b */
    public static final class C40091b implements C33005d<C40179b> {

        /* renamed from: a */
        public static final C40091b f102287a = new C40091b();

        /* renamed from: b */
        public static final C33000c f102288b = C33000c.m133160a("storageMetrics").mo95637b(C33018a.m133253b().mo95668d(1).mo95666a()).mo95636a();

        /* renamed from: b */
        public void mo85035a(C40179b bVar, C33006e eVar) throws IOException {
            eVar.mo85169k(f102288b, bVar.mo132810c());
        }
    }

    /* renamed from: com.google.android.datatransport.runtime.a$c */
    public static final class C40092c implements C33005d<LogEventDropped> {

        /* renamed from: a */
        public static final C40092c f102289a = new C40092c();

        /* renamed from: b */
        public static final C33000c f102290b = C33000c.m133160a("eventsDroppedCount").mo95637b(C33018a.m133253b().mo95668d(1).mo95666a()).mo95636a();

        /* renamed from: c */
        public static final C33000c f102291c = C33000c.m133160a("reason").mo95637b(C33018a.m133253b().mo95668d(3).mo95666a()).mo95636a();

        /* renamed from: b */
        public void mo85035a(LogEventDropped logEventDropped, C33006e eVar) throws IOException {
            eVar.mo85160b(f102290b, logEventDropped.mo132790b());
            eVar.mo85169k(f102291c, logEventDropped.mo132791c());
        }
    }

    /* renamed from: com.google.android.datatransport.runtime.a$d */
    public static final class C40093d implements C33005d<C40181c> {

        /* renamed from: a */
        public static final C40093d f102292a = new C40093d();

        /* renamed from: b */
        public static final C33000c f102293b = C33000c.m133160a("logSource").mo95637b(C33018a.m133253b().mo95668d(1).mo95666a()).mo95636a();

        /* renamed from: c */
        public static final C33000c f102294c = C33000c.m133160a("logEventDropped").mo95637b(C33018a.m133253b().mo95668d(2).mo95666a()).mo95636a();

        /* renamed from: b */
        public void mo85035a(C40181c cVar, C33006e eVar) throws IOException {
            eVar.mo85169k(f102293b, cVar.mo132814c());
            eVar.mo85169k(f102294c, cVar.mo132813b());
        }
    }

    /* renamed from: com.google.android.datatransport.runtime.a$e */
    public static final class C40094e implements C33005d<C40197n> {

        /* renamed from: a */
        public static final C40094e f102295a = new C40094e();

        /* renamed from: b */
        public static final C33000c f102296b = C33000c.m133161d("clientMetrics");

        /* renamed from: b */
        public void mo85035a(C40197n nVar, C33006e eVar) throws IOException {
            eVar.mo85169k(f102296b, nVar.mo132845c());
        }
    }

    /* renamed from: com.google.android.datatransport.runtime.a$f */
    public static final class C40095f implements C33005d<C40183d> {

        /* renamed from: a */
        public static final C40095f f102297a = new C40095f();

        /* renamed from: b */
        public static final C33000c f102298b = C33000c.m133160a("currentCacheSizeBytes").mo95637b(C33018a.m133253b().mo95668d(1).mo95666a()).mo95636a();

        /* renamed from: c */
        public static final C33000c f102299c = C33000c.m133160a("maxCacheSizeBytes").mo95637b(C33018a.m133253b().mo95668d(2).mo95666a()).mo95636a();

        /* renamed from: b */
        public void mo85035a(C40183d dVar, C33006e eVar) throws IOException {
            eVar.mo85160b(f102298b, dVar.mo132819a());
            eVar.mo85160b(f102299c, dVar.mo132820c());
        }
    }

    /* renamed from: com.google.android.datatransport.runtime.a$g */
    public static final class C40096g implements C33005d<C40185e> {

        /* renamed from: a */
        public static final C40096g f102300a = new C40096g();

        /* renamed from: b */
        public static final C33000c f102301b = C33000c.m133160a("startMs").mo95637b(C33018a.m133253b().mo95668d(1).mo95666a()).mo95636a();

        /* renamed from: c */
        public static final C33000c f102302c = C33000c.m133160a("endMs").mo95637b(C33018a.m133253b().mo95668d(2).mo95666a()).mo95636a();

        /* renamed from: b */
        public void mo85035a(C40185e eVar, C33006e eVar2) throws IOException {
            eVar2.mo85160b(f102301b, eVar.mo132825c());
            eVar2.mo85160b(f102302c, eVar.mo132824b());
        }
    }

    /* renamed from: a */
    public void mo85045a(C33004b<?> bVar) {
        bVar.mo85213b(C40197n.class, C40094e.f102295a);
        bVar.mo85213b(C40177a.class, C40090a.f102282a);
        bVar.mo85213b(C40185e.class, C40096g.f102300a);
        bVar.mo85213b(C40181c.class, C40093d.f102292a);
        bVar.mo85213b(LogEventDropped.class, C40092c.f102289a);
        bVar.mo85213b(C40179b.class, C40091b.f102287a);
        bVar.mo85213b(C40183d.class, C40095f.f102297a);
    }
}
