package com.google.firebase.encoders.proto;

import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import com.google.firebase.encoders.C33000c;
import com.google.firebase.encoders.C33005d;
import com.google.firebase.encoders.C33006e;
import com.google.firebase.encoders.C33007f;
import com.google.firebase.encoders.EncodingException;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.util.Collection;
import java.util.Map;

/* renamed from: com.google.firebase.encoders.proto.e */
public final class C33023e implements C33006e {

    /* renamed from: f */
    public static final Charset f80121f = Charset.forName("UTF-8");

    /* renamed from: g */
    public static final C33000c f80122g = C33000c.m133160a("key").mo95637b(C33018a.m133253b().mo95668d(1).mo95666a()).mo95636a();

    /* renamed from: h */
    public static final C33000c f80123h = C33000c.m133160a("value").mo95637b(C33018a.m133253b().mo95668d(2).mo95666a()).mo95636a();

    /* renamed from: i */
    public static final C33005d<Map.Entry<Object, Object>> f80124i = new C33022d();

    /* renamed from: a */
    public OutputStream f80125a;

    /* renamed from: b */
    public final Map<Class<?>, C33005d<?>> f80126b;

    /* renamed from: c */
    public final Map<Class<?>, C33007f<?>> f80127c;

    /* renamed from: d */
    public final C33005d<Object> f80128d;

    /* renamed from: e */
    public final C33028h f80129e = new C33028h(this);

    /* renamed from: com.google.firebase.encoders.proto.e$a */
    public static /* synthetic */ class C33024a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f80130a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|(3:5|6|8)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        static {
            /*
                com.google.firebase.encoders.proto.Protobuf$IntEncoding[] r0 = com.google.firebase.encoders.proto.Protobuf.IntEncoding.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f80130a = r0
                com.google.firebase.encoders.proto.Protobuf$IntEncoding r1 = com.google.firebase.encoders.proto.Protobuf.IntEncoding.DEFAULT     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f80130a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.google.firebase.encoders.proto.Protobuf$IntEncoding r1 = com.google.firebase.encoders.proto.Protobuf.IntEncoding.SIGNED     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f80130a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.google.firebase.encoders.proto.Protobuf$IntEncoding r1 = com.google.firebase.encoders.proto.Protobuf.IntEncoding.FIXED     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.encoders.proto.C33023e.C33024a.<clinit>():void");
        }
    }

    public C33023e(OutputStream outputStream, Map<Class<?>, C33005d<?>> map, Map<Class<?>, C33007f<?>> map2, C33005d<Object> dVar) {
        this.f80125a = outputStream;
        this.f80126b = map;
        this.f80127c = map2;
        this.f80128d = dVar;
    }

    /* renamed from: D */
    public static Protobuf m133259D(C33000c cVar) {
        Protobuf protobuf = (Protobuf) cVar.mo95632c(Protobuf.class);
        if (protobuf != null) {
            return protobuf;
        }
        throw new EncodingException("Field has no @Protobuf config");
    }

    /* renamed from: E */
    public static int m133260E(C33000c cVar) {
        Protobuf protobuf = (Protobuf) cVar.mo95632c(Protobuf.class);
        if (protobuf != null) {
            return protobuf.tag();
        }
        throw new EncodingException("Field has no @Protobuf config");
    }

    /* renamed from: F */
    public static /* synthetic */ void m133261F(Map.Entry entry, C33006e eVar) throws IOException {
        eVar.mo85169k(f80122g, entry.getKey());
        eVar.mo85169k(f80123h, entry.getValue());
    }

    /* renamed from: y */
    public static ByteBuffer m133263y(int i) {
        return ByteBuffer.allocate(i).order(ByteOrder.LITTLE_ENDIAN);
    }

    /* renamed from: A */
    public final <T> C33023e mo95678A(C33005d<T> dVar, C33000c cVar, T t, boolean z) throws IOException {
        long z2 = mo95692z(dVar, t);
        if (z && z2 == 0) {
            return this;
        }
        mo95681G((m133260E(cVar) << 3) | 2);
        mo95682H(z2);
        dVar.mo85035a(t, this);
        return this;
    }

    /* renamed from: B */
    public final <T> C33023e mo95679B(C33007f<T> fVar, C33000c cVar, T t, boolean z) throws IOException {
        this.f80129e.mo95701b(cVar, z);
        fVar.mo85035a(t, this.f80129e);
        return this;
    }

    /* renamed from: C */
    public C33023e mo95680C(@C0363p0 Object obj) throws IOException {
        if (obj == null) {
            return this;
        }
        C33005d dVar = this.f80126b.get(obj.getClass());
        if (dVar != null) {
            dVar.mo85035a(obj, this);
            return this;
        }
        throw new EncodingException("No encoder for " + obj.getClass());
    }

    /* renamed from: G */
    public final void mo95681G(int i) throws IOException {
        while (((long) (i & -128)) != 0) {
            this.f80125a.write((i & 127) | 128);
            i >>>= 7;
        }
        this.f80125a.write(i & 127);
    }

    /* renamed from: H */
    public final void mo95682H(long j) throws IOException {
        while ((-128 & j) != 0) {
            this.f80125a.write((((int) j) & 127) | 128);
            j >>>= 7;
        }
        this.f80125a.write(((int) j) & 127);
    }

    @C0359n0
    /* renamed from: d */
    public C33006e mo85162d(@C0359n0 C33000c cVar, float f) throws IOException {
        return mo95684q(cVar, f, true);
    }

    @C0359n0
    /* renamed from: e */
    public C33006e mo85163e(@C0359n0 C33000c cVar) throws IOException {
        throw new EncodingException("nested() is not implemented for protobuf encoding.");
    }

    @C0359n0
    /* renamed from: f */
    public C33006e mo85164f(@C0359n0 C33000c cVar, double d) throws IOException {
        return mo95683p(cVar, d, true);
    }

    @C0359n0
    /* renamed from: g */
    public C33006e mo85165g(@C0359n0 String str, boolean z) throws IOException {
        return mo85159a(C33000c.m133161d(str), z);
    }

    @C0359n0
    /* renamed from: h */
    public C33006e mo85166h(@C0359n0 String str, double d) throws IOException {
        return mo85164f(C33000c.m133161d(str), d);
    }

    @C0359n0
    /* renamed from: i */
    public C33006e mo85167i(@C0359n0 String str, long j) throws IOException {
        return mo85160b(C33000c.m133161d(str), j);
    }

    @C0359n0
    /* renamed from: j */
    public C33006e mo85168j(@C0359n0 String str, int i) throws IOException {
        return mo85161c(C33000c.m133161d(str), i);
    }

    @C0359n0
    /* renamed from: k */
    public C33006e mo85169k(@C0359n0 C33000c cVar, @C0363p0 Object obj) throws IOException {
        return mo95685r(cVar, obj, true);
    }

    @C0359n0
    /* renamed from: l */
    public C33006e mo85170l(@C0363p0 Object obj) throws IOException {
        return mo95680C(obj);
    }

    @C0359n0
    /* renamed from: m */
    public C33006e mo85171m(@C0359n0 String str, @C0363p0 Object obj) throws IOException {
        return mo85169k(C33000c.m133161d(str), obj);
    }

    @C0359n0
    /* renamed from: n */
    public C33006e mo85172n(@C0359n0 String str) throws IOException {
        return mo85163e(C33000c.m133161d(str));
    }

    /* renamed from: p */
    public C33006e mo95683p(@C0359n0 C33000c cVar, double d, boolean z) throws IOException {
        if (z && d == 0.0d) {
            return this;
        }
        mo95681G((m133260E(cVar) << 3) | 1);
        this.f80125a.write(m133263y(8).putDouble(d).array());
        return this;
    }

    /* renamed from: q */
    public C33006e mo95684q(@C0359n0 C33000c cVar, float f, boolean z) throws IOException {
        if (z && f == 0.0f) {
            return this;
        }
        mo95681G((m133260E(cVar) << 3) | 5);
        this.f80125a.write(m133263y(4).putFloat(f).array());
        return this;
    }

    /* renamed from: r */
    public C33006e mo95685r(@C0359n0 C33000c cVar, @C0363p0 Object obj, boolean z) throws IOException {
        if (obj == null) {
            return this;
        }
        if (obj instanceof CharSequence) {
            CharSequence charSequence = (CharSequence) obj;
            if (z && charSequence.length() == 0) {
                return this;
            }
            mo95681G((m133260E(cVar) << 3) | 2);
            byte[] bytes = charSequence.toString().getBytes(f80121f);
            mo95681G(bytes.length);
            this.f80125a.write(bytes);
            return this;
        } else if (obj instanceof Collection) {
            for (Object r : (Collection) obj) {
                mo95685r(cVar, r, false);
            }
            return this;
        } else if (obj instanceof Map) {
            for (Map.Entry A : ((Map) obj).entrySet()) {
                mo95678A(f80124i, cVar, A, false);
            }
            return this;
        } else if (obj instanceof Double) {
            return mo95683p(cVar, ((Double) obj).doubleValue(), z);
        } else {
            if (obj instanceof Float) {
                return mo95684q(cVar, ((Float) obj).floatValue(), z);
            }
            if (obj instanceof Number) {
                return mo95689v(cVar, ((Number) obj).longValue(), z);
            }
            if (obj instanceof Boolean) {
                return mo95691x(cVar, ((Boolean) obj).booleanValue(), z);
            }
            if (obj instanceof byte[]) {
                byte[] bArr = (byte[]) obj;
                if (z && bArr.length == 0) {
                    return this;
                }
                mo95681G((m133260E(cVar) << 3) | 2);
                mo95681G(bArr.length);
                this.f80125a.write(bArr);
                return this;
            }
            C33005d dVar = this.f80126b.get(obj.getClass());
            if (dVar != null) {
                return mo95678A(dVar, cVar, obj, z);
            }
            C33007f fVar = this.f80127c.get(obj.getClass());
            if (fVar != null) {
                return mo95679B(fVar, cVar, obj, z);
            }
            if (obj instanceof C33021c) {
                return mo85161c(cVar, ((C33021c) obj).getNumber());
            }
            if (obj instanceof Enum) {
                return mo85161c(cVar, ((Enum) obj).ordinal());
            }
            return mo95678A(this.f80128d, cVar, obj, z);
        }
    }

    @C0359n0
    /* renamed from: s */
    public C33023e mo85161c(@C0359n0 C33000c cVar, int i) throws IOException {
        return mo95687t(cVar, i, true);
    }

    /* renamed from: t */
    public C33023e mo95687t(@C0359n0 C33000c cVar, int i, boolean z) throws IOException {
        if (z && i == 0) {
            return this;
        }
        Protobuf D = m133259D(cVar);
        int i2 = C33024a.f80130a[D.intEncoding().ordinal()];
        if (i2 == 1) {
            mo95681G(D.tag() << 3);
            mo95681G(i);
        } else if (i2 == 2) {
            mo95681G(D.tag() << 3);
            mo95681G((i << 1) ^ (i >> 31));
        } else if (i2 == 3) {
            mo95681G((D.tag() << 3) | 5);
            this.f80125a.write(m133263y(4).putInt(i).array());
        }
        return this;
    }

    @C0359n0
    /* renamed from: u */
    public C33023e mo85160b(@C0359n0 C33000c cVar, long j) throws IOException {
        return mo95689v(cVar, j, true);
    }

    /* renamed from: v */
    public C33023e mo95689v(@C0359n0 C33000c cVar, long j, boolean z) throws IOException {
        if (z && j == 0) {
            return this;
        }
        Protobuf D = m133259D(cVar);
        int i = C33024a.f80130a[D.intEncoding().ordinal()];
        if (i == 1) {
            mo95681G(D.tag() << 3);
            mo95682H(j);
        } else if (i == 2) {
            mo95681G(D.tag() << 3);
            mo95682H((j >> 63) ^ (j << 1));
        } else if (i == 3) {
            mo95681G((D.tag() << 3) | 1);
            this.f80125a.write(m133263y(8).putLong(j).array());
        }
        return this;
    }

    @C0359n0
    /* renamed from: w */
    public C33023e mo85159a(@C0359n0 C33000c cVar, boolean z) throws IOException {
        return mo95691x(cVar, z, true);
    }

    /* renamed from: x */
    public C33023e mo95691x(@C0359n0 C33000c cVar, boolean z, boolean z2) throws IOException {
        return mo95687t(cVar, z ? 1 : 0, z2);
    }

    /* renamed from: z */
    public final <T> long mo95692z(C33005d<T> dVar, T t) throws IOException {
        OutputStream outputStream;
        C33020b bVar = new C33020b();
        try {
            outputStream = this.f80125a;
            this.f80125a = bVar;
            dVar.mo85035a(t, this);
            this.f80125a = outputStream;
            long a = bVar.mo95673a();
            bVar.close();
            return a;
        } catch (Throwable th) {
            try {
                bVar.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }
}
