package com.google.firebase.messaging;

import com.google.firebase.encoders.C33000c;
import com.google.firebase.encoders.C33005d;
import com.google.firebase.encoders.C33006e;
import com.google.firebase.encoders.config.C33003a;
import com.google.firebase.encoders.config.C33004b;
import com.google.firebase.encoders.proto.C33018a;
import com.google.firebase.messaging.reporting.C33227a;
import com.google.firebase.messaging.reporting.MessagingClientEvent;
import com.google.firebase.remoteconfig.C33585u;
import java.io.IOException;

/* renamed from: com.google.firebase.messaging.a */
public final class C33159a implements C33003a {

    /* renamed from: a */
    public static final int f80474a = 2;

    /* renamed from: b */
    public static final C33003a f80475b = new C33159a();

    /* renamed from: com.google.firebase.messaging.a$a */
    public static final class C33160a implements C33005d<MessagingClientEvent> {

        /* renamed from: a */
        public static final C33160a f80476a = new C33160a();

        /* renamed from: b */
        public static final C33000c f80477b = C33000c.m133160a("projectNumber").mo95637b(C33018a.m133253b().mo95668d(1).mo95666a()).mo95636a();

        /* renamed from: c */
        public static final C33000c f80478c = C33000c.m133160a("messageId").mo95637b(C33018a.m133253b().mo95668d(2).mo95666a()).mo95636a();

        /* renamed from: d */
        public static final C33000c f80479d = C33000c.m133160a("instanceId").mo95637b(C33018a.m133253b().mo95668d(3).mo95666a()).mo95636a();

        /* renamed from: e */
        public static final C33000c f80480e = C33000c.m133160a("messageType").mo95637b(C33018a.m133253b().mo95668d(4).mo95666a()).mo95636a();

        /* renamed from: f */
        public static final C33000c f80481f = C33000c.m133160a("sdkPlatform").mo95637b(C33018a.m133253b().mo95668d(5).mo95666a()).mo95636a();

        /* renamed from: g */
        public static final C33000c f80482g = C33000c.m133160a(C33585u.C33587b.f81740v3).mo95637b(C33018a.m133253b().mo95668d(6).mo95666a()).mo95636a();

        /* renamed from: h */
        public static final C33000c f80483h = C33000c.m133160a("collapseKey").mo95637b(C33018a.m133253b().mo95668d(7).mo95666a()).mo95636a();

        /* renamed from: i */
        public static final C33000c f80484i = C33000c.m133160a("priority").mo95637b(C33018a.m133253b().mo95668d(8).mo95666a()).mo95636a();

        /* renamed from: j */
        public static final C33000c f80485j = C33000c.m133160a("ttl").mo95637b(C33018a.m133253b().mo95668d(9).mo95666a()).mo95636a();

        /* renamed from: k */
        public static final C33000c f80486k = C33000c.m133160a("topic").mo95637b(C33018a.m133253b().mo95668d(10).mo95666a()).mo95636a();

        /* renamed from: l */
        public static final C33000c f80487l = C33000c.m133160a("bulkId").mo95637b(C33018a.m133253b().mo95668d(11).mo95666a()).mo95636a();

        /* renamed from: m */
        public static final C33000c f80488m = C33000c.m133160a("event").mo95637b(C33018a.m133253b().mo95668d(12).mo95666a()).mo95636a();

        /* renamed from: n */
        public static final C33000c f80489n = C33000c.m133160a("analyticsLabel").mo95637b(C33018a.m133253b().mo95668d(13).mo95666a()).mo95636a();

        /* renamed from: o */
        public static final C33000c f80490o = C33000c.m133160a("campaignId").mo95637b(C33018a.m133253b().mo95668d(14).mo95666a()).mo95636a();

        /* renamed from: p */
        public static final C33000c f80491p = C33000c.m133160a("composerLabel").mo95637b(C33018a.m133253b().mo95668d(15).mo95666a()).mo95636a();

        /* renamed from: b */
        public void mo85035a(MessagingClientEvent messagingClientEvent, C33006e eVar) throws IOException {
            eVar.mo85160b(f80477b, messagingClientEvent.mo96167m());
            eVar.mo85169k(f80478c, messagingClientEvent.mo96163i());
            eVar.mo85169k(f80479d, messagingClientEvent.mo96162h());
            eVar.mo85169k(f80480e, messagingClientEvent.mo96164j());
            eVar.mo85169k(f80481f, messagingClientEvent.mo96168n());
            eVar.mo85169k(f80482g, messagingClientEvent.mo96165k());
            eVar.mo85169k(f80483h, messagingClientEvent.mo96159d());
            eVar.mo85161c(f80484i, messagingClientEvent.mo96166l());
            eVar.mo85161c(f80485j, messagingClientEvent.mo96170p());
            eVar.mo85169k(f80486k, messagingClientEvent.mo96169o());
            eVar.mo85160b(f80487l, messagingClientEvent.mo96157b());
            eVar.mo85169k(f80488m, messagingClientEvent.mo96161g());
            eVar.mo85169k(f80489n, messagingClientEvent.mo96156a());
            eVar.mo85160b(f80490o, messagingClientEvent.mo96158c());
            eVar.mo85169k(f80491p, messagingClientEvent.mo96160e());
        }
    }

    /* renamed from: com.google.firebase.messaging.a$b */
    public static final class C33161b implements C33005d<C33227a> {

        /* renamed from: a */
        public static final C33161b f80492a = new C33161b();

        /* renamed from: b */
        public static final C33000c f80493b = C33000c.m133160a("messagingClientEvent").mo95637b(C33018a.m133253b().mo95668d(1).mo95666a()).mo95636a();

        /* renamed from: b */
        public void mo85035a(C33227a aVar, C33006e eVar) throws IOException {
            eVar.mo85169k(f80493b, aVar.mo96188c());
        }
    }

    /* renamed from: com.google.firebase.messaging.a$c */
    public static final class C33162c implements C33005d<C33212m0> {

        /* renamed from: a */
        public static final C33162c f80494a = new C33162c();

        /* renamed from: b */
        public static final C33000c f80495b = C33000c.m133161d("messagingClientEventExtension");

        /* renamed from: b */
        public void mo85035a(C33212m0 m0Var, C33006e eVar) throws IOException {
            eVar.mo85169k(f80495b, m0Var.mo96134c());
        }
    }

    /* renamed from: a */
    public void mo85045a(C33004b<?> bVar) {
        bVar.mo85213b(C33212m0.class, C33162c.f80494a);
        bVar.mo85213b(C33227a.class, C33161b.f80492a);
        bVar.mo85213b(MessagingClientEvent.class, C33160a.f80476a);
    }
}
