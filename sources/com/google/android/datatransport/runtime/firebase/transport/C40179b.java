package com.google.android.datatransport.runtime.firebase.transport;

import com.google.firebase.encoders.annotations.C32995a;
import com.google.firebase.encoders.proto.Protobuf;

/* renamed from: com.google.android.datatransport.runtime.firebase.transport.b */
public final class C40179b {

    /* renamed from: b */
    public static final C40179b f102430b = new C40180a().mo132811a();

    /* renamed from: a */
    public final C40183d f102431a;

    /* renamed from: com.google.android.datatransport.runtime.firebase.transport.b$a */
    public static final class C40180a {

        /* renamed from: a */
        public C40183d f102432a = null;

        /* renamed from: a */
        public C40179b mo132811a() {
            return new C40179b(this.f102432a);
        }

        /* renamed from: b */
        public C40180a mo132812b(C40183d dVar) {
            this.f102432a = dVar;
            return this;
        }
    }

    public C40179b(C40183d dVar) {
        this.f102431a = dVar;
    }

    /* renamed from: a */
    public static C40179b m163429a() {
        return f102430b;
    }

    /* renamed from: d */
    public static C40180a m163430d() {
        return new C40180a();
    }

    @C32995a.C32997b
    /* renamed from: b */
    public C40183d mo132809b() {
        C40183d dVar = this.f102431a;
        return dVar == null ? C40183d.m163443b() : dVar;
    }

    @C32995a.C32996a(name = "storageMetrics")
    @Protobuf(tag = 1)
    /* renamed from: c */
    public C40183d mo132810c() {
        return this.f102431a;
    }
}
