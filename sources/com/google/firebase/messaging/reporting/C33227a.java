package com.google.firebase.messaging.reporting;

import com.google.firebase.encoders.annotations.C32995a;
import com.google.firebase.encoders.proto.Protobuf;
import com.google.firebase.messaging.C33212m0;
import java.io.IOException;
import java.io.OutputStream;

/* renamed from: com.google.firebase.messaging.reporting.a */
public final class C33227a {

    /* renamed from: b */
    public static final C33227a f80825b = new C33228a().mo96191a();

    /* renamed from: a */
    public final MessagingClientEvent f80826a;

    /* renamed from: com.google.firebase.messaging.reporting.a$a */
    public static final class C33228a {

        /* renamed from: a */
        public MessagingClientEvent f80827a = null;

        /* renamed from: a */
        public C33227a mo96191a() {
            return new C33227a(this.f80827a);
        }

        /* renamed from: b */
        public C33228a mo96192b(MessagingClientEvent messagingClientEvent) {
            this.f80827a = messagingClientEvent;
            return this;
        }
    }

    public C33227a(MessagingClientEvent messagingClientEvent) {
        this.f80826a = messagingClientEvent;
    }

    /* renamed from: a */
    public static C33227a m134069a() {
        return f80825b;
    }

    /* renamed from: d */
    public static C33228a m134070d() {
        return new C33228a();
    }

    @C32995a.C32997b
    /* renamed from: b */
    public MessagingClientEvent mo96187b() {
        MessagingClientEvent messagingClientEvent = this.f80826a;
        return messagingClientEvent == null ? MessagingClientEvent.m134036f() : messagingClientEvent;
    }

    @C32995a.C32996a(name = "messagingClientEvent")
    @Protobuf(tag = 1)
    /* renamed from: c */
    public MessagingClientEvent mo96188c() {
        return this.f80826a;
    }

    /* renamed from: e */
    public byte[] mo96189e() {
        return C33212m0.m133987b(this);
    }

    /* renamed from: f */
    public void mo96190f(OutputStream outputStream) throws IOException {
        C33212m0.m133986a(this, outputStream);
    }
}
