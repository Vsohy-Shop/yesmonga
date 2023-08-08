package com.google.android.datatransport.runtime.firebase.transport;

import com.google.android.datatransport.runtime.C40197n;
import com.google.firebase.encoders.annotations.C32995a;
import com.google.firebase.encoders.proto.Protobuf;
import java.io.IOException;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: com.google.android.datatransport.runtime.firebase.transport.a */
public final class C40177a {

    /* renamed from: e */
    public static final C40177a f102421e = new C40178a().mo132804b();

    /* renamed from: a */
    public final C40185e f102422a;

    /* renamed from: b */
    public final List<C40181c> f102423b;

    /* renamed from: c */
    public final C40179b f102424c;

    /* renamed from: d */
    public final String f102425d;

    /* renamed from: com.google.android.datatransport.runtime.firebase.transport.a$a */
    public static final class C40178a {

        /* renamed from: a */
        public C40185e f102426a = null;

        /* renamed from: b */
        public List<C40181c> f102427b = new ArrayList();

        /* renamed from: c */
        public C40179b f102428c = null;

        /* renamed from: d */
        public String f102429d = "";

        /* renamed from: a */
        public C40178a mo132803a(C40181c cVar) {
            this.f102427b.add(cVar);
            return this;
        }

        /* renamed from: b */
        public C40177a mo132804b() {
            return new C40177a(this.f102426a, Collections.unmodifiableList(this.f102427b), this.f102428c, this.f102429d);
        }

        /* renamed from: c */
        public C40178a mo132805c(String str) {
            this.f102429d = str;
            return this;
        }

        /* renamed from: d */
        public C40178a mo132806d(C40179b bVar) {
            this.f102428c = bVar;
            return this;
        }

        /* renamed from: e */
        public C40178a mo132807e(List<C40181c> list) {
            this.f102427b = list;
            return this;
        }

        /* renamed from: f */
        public C40178a mo132808f(C40185e eVar) {
            this.f102426a = eVar;
            return this;
        }
    }

    public C40177a(C40185e eVar, List<C40181c> list, C40179b bVar, String str) {
        this.f102422a = eVar;
        this.f102423b = list;
        this.f102424c = bVar;
        this.f102425d = str;
    }

    /* renamed from: b */
    public static C40177a m163413b() {
        return f102421e;
    }

    /* renamed from: h */
    public static C40178a m163414h() {
        return new C40178a();
    }

    @Protobuf(tag = 4)
    /* renamed from: a */
    public String mo132795a() {
        return this.f102425d;
    }

    @C32995a.C32997b
    /* renamed from: c */
    public C40179b mo132796c() {
        C40179b bVar = this.f102424c;
        return bVar == null ? C40179b.m163429a() : bVar;
    }

    @C32995a.C32996a(name = "globalMetrics")
    @Protobuf(tag = 3)
    /* renamed from: d */
    public C40179b mo132797d() {
        return this.f102424c;
    }

    @C32995a.C32996a(name = "logSourceMetrics")
    @Protobuf(tag = 2)
    /* renamed from: e */
    public List<C40181c> mo132798e() {
        return this.f102423b;
    }

    @C32995a.C32997b
    /* renamed from: f */
    public C40185e mo132799f() {
        C40185e eVar = this.f102422a;
        return eVar == null ? C40185e.m163450a() : eVar;
    }

    @C32995a.C32996a(name = "window")
    @Protobuf(tag = 1)
    /* renamed from: g */
    public C40185e mo132800g() {
        return this.f102422a;
    }

    /* renamed from: i */
    public byte[] mo132801i() {
        return C40197n.m163502b(this);
    }

    /* renamed from: j */
    public void mo132802j(OutputStream outputStream) throws IOException {
        C40197n.m163501a(this, outputStream);
    }
}
