package com.google.android.datatransport.runtime;

import com.google.android.datatransport.runtime.firebase.transport.C40177a;
import com.google.firebase.encoders.annotations.C32995a;
import com.google.firebase.encoders.proto.C33026g;
import java.io.IOException;
import java.io.OutputStream;

@C32995a
/* renamed from: com.google.android.datatransport.runtime.n */
public abstract class C40197n {

    /* renamed from: a */
    public static final C33026g f102453a = C33026g.m133294a().mo95696e(C40089a.f102281b).mo95695d();

    /* renamed from: a */
    public static void m163501a(Object obj, OutputStream outputStream) throws IOException {
        f102453a.mo95693b(obj, outputStream);
    }

    /* renamed from: b */
    public static byte[] m163502b(Object obj) {
        return f102453a.mo95694c(obj);
    }

    /* renamed from: c */
    public abstract C40177a mo132845c();
}
