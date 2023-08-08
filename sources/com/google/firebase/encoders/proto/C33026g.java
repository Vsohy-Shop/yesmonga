package com.google.firebase.encoders.proto;

import androidx.annotation.C0359n0;
import com.google.firebase.encoders.C33005d;
import com.google.firebase.encoders.C33006e;
import com.google.firebase.encoders.C33007f;
import com.google.firebase.encoders.EncodingException;
import com.google.firebase.encoders.config.C33003a;
import com.google.firebase.encoders.config.C33004b;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.google.firebase.encoders.proto.g */
public class C33026g {

    /* renamed from: a */
    public final Map<Class<?>, C33005d<?>> f80131a;

    /* renamed from: b */
    public final Map<Class<?>, C33007f<?>> f80132b;

    /* renamed from: c */
    public final C33005d<Object> f80133c;

    /* renamed from: com.google.firebase.encoders.proto.g$a */
    public static final class C33027a implements C33004b<C33027a> {

        /* renamed from: d */
        public static final C33005d<Object> f80134d = new C33025f();

        /* renamed from: a */
        public final Map<Class<?>, C33005d<?>> f80135a = new HashMap();

        /* renamed from: b */
        public final Map<Class<?>, C33007f<?>> f80136b = new HashMap();

        /* renamed from: c */
        public C33005d<Object> f80137c = f80134d;

        /* renamed from: f */
        public static /* synthetic */ void m133298f(Object obj, C33006e eVar) throws IOException {
            throw new EncodingException("Couldn't find encoder for type " + obj.getClass().getCanonicalName());
        }

        /* renamed from: d */
        public C33026g mo95695d() {
            return new C33026g(new HashMap(this.f80135a), new HashMap(this.f80136b), this.f80137c);
        }

        @C0359n0
        /* renamed from: e */
        public C33027a mo95696e(@C0359n0 C33003a aVar) {
            aVar.mo85045a(this);
            return this;
        }

        @C0359n0
        /* renamed from: g */
        public <U> C33027a mo85213b(@C0359n0 Class<U> cls, @C0359n0 C33005d<? super U> dVar) {
            this.f80135a.put(cls, dVar);
            this.f80136b.remove(cls);
            return this;
        }

        @C0359n0
        /* renamed from: h */
        public <U> C33027a mo85212a(@C0359n0 Class<U> cls, @C0359n0 C33007f<? super U> fVar) {
            this.f80136b.put(cls, fVar);
            this.f80135a.remove(cls);
            return this;
        }

        @C0359n0
        /* renamed from: i */
        public C33027a mo95699i(@C0359n0 C33005d<Object> dVar) {
            this.f80137c = dVar;
            return this;
        }
    }

    public C33026g(Map<Class<?>, C33005d<?>> map, Map<Class<?>, C33007f<?>> map2, C33005d<Object> dVar) {
        this.f80131a = map;
        this.f80132b = map2;
        this.f80133c = dVar;
    }

    /* renamed from: a */
    public static C33027a m133294a() {
        return new C33027a();
    }

    /* renamed from: b */
    public void mo95693b(@C0359n0 Object obj, @C0359n0 OutputStream outputStream) throws IOException {
        new C33023e(outputStream, this.f80131a, this.f80132b, this.f80133c).mo95680C(obj);
    }

    @C0359n0
    /* renamed from: c */
    public byte[] mo95694c(@C0359n0 Object obj) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            mo95693b(obj, byteArrayOutputStream);
        } catch (IOException unused) {
        }
        return byteArrayOutputStream.toByteArray();
    }
}
