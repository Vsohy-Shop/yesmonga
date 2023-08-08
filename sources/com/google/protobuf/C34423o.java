package com.google.protobuf;

import java.nio.ByteBuffer;

/* renamed from: com.google.protobuf.o */
public abstract class C34423o {

    /* renamed from: a */
    public static final C34423o f83391a = new C34424a();

    /* renamed from: com.google.protobuf.o$a */
    public static class C34424a extends C34423o {
        /* renamed from: a */
        public C34347d mo101378a(int i) {
            return C34347d.m139111j(ByteBuffer.allocateDirect(i));
        }

        /* renamed from: b */
        public C34347d mo101379b(int i) {
            return C34347d.m139112k(new byte[i]);
        }
    }

    /* renamed from: c */
    public static C34423o m139917c() {
        return f83391a;
    }

    /* renamed from: a */
    public abstract C34347d mo101378a(int i);

    /* renamed from: b */
    public abstract C34347d mo101379b(int i);
}
