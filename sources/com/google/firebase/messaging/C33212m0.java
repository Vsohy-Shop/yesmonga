package com.google.firebase.messaging;

import com.google.firebase.encoders.annotations.C32995a;
import com.google.firebase.encoders.proto.C33026g;
import com.google.firebase.messaging.reporting.C33227a;
import java.io.IOException;
import java.io.OutputStream;

@C32995a
/* renamed from: com.google.firebase.messaging.m0 */
public abstract class C33212m0 {

    /* renamed from: a */
    public static final C33026g f80747a = C33026g.m133294a().mo95696e(C33159a.f80475b).mo95695d();

    /* renamed from: a */
    public static void m133986a(Object obj, OutputStream outputStream) throws IOException {
        f80747a.mo95693b(obj, outputStream);
    }

    /* renamed from: b */
    public static byte[] m133987b(Object obj) {
        return f80747a.mo95694c(obj);
    }

    /* renamed from: c */
    public abstract C33227a mo96134c();
}
