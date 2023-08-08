package com.google.android.gms.internal.mlkit_vision_barcode;

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

/* renamed from: com.google.android.gms.internal.mlkit_vision_barcode.u1 */
public final class C38792u1 implements C33006e {

    /* renamed from: f */
    public static final Charset f98189f = Charset.forName("UTF-8");

    /* renamed from: g */
    public static final C33000c f98190g;

    /* renamed from: h */
    public static final C33000c f98191h;

    /* renamed from: i */
    public static final C33005d<Map.Entry<Object, Object>> f98192i = C38780t1.f98159a;

    /* renamed from: a */
    public OutputStream f98193a;

    /* renamed from: b */
    public final Map<Class<?>, C33005d<?>> f98194b;

    /* renamed from: c */
    public final Map<Class<?>, C33007f<?>> f98195c;

    /* renamed from: d */
    public final C33005d<Object> f98196d;

    /* renamed from: e */
    public final C38840y1 f98197e = new C38840y1(this);

    static {
        C33000c.C33002b a = C33000c.m133160a("key");
        C38717o1 o1Var = new C38717o1();
        o1Var.mo122449a(1);
        f98190g = a.mo95637b(o1Var.mo122450b()).mo95636a();
        C33000c.C33002b a2 = C33000c.m133160a("value");
        C38717o1 o1Var2 = new C38717o1();
        o1Var2.mo122449a(2);
        f98191h = a2.mo95637b(o1Var2.mo122450b()).mo95636a();
    }

    public C38792u1(OutputStream outputStream, Map<Class<?>, C33005d<?>> map, Map<Class<?>, C33007f<?>> map2, C33005d<Object> dVar) {
        this.f98193a = outputStream;
        this.f98194b = map;
        this.f98195c = map2;
        this.f98196d = dVar;
    }

    /* renamed from: A */
    public static ByteBuffer m160157A(int i) {
        return ByteBuffer.allocate(i).order(ByteOrder.LITTLE_ENDIAN);
    }

    /* renamed from: u */
    public static /* synthetic */ void m160158u(Map.Entry entry, C33006e eVar) throws IOException {
        eVar.mo85169k(f98190g, entry.getKey());
        eVar.mo85169k(f98191h, entry.getValue());
    }

    /* renamed from: v */
    public static int m160159v(C33000c cVar) {
        C38768s1 s1Var = (C38768s1) cVar.mo95632c(C38768s1.class);
        if (s1Var != null) {
            return s1Var.zza();
        }
        throw new EncodingException("Field has no @Protobuf config");
    }

    /* renamed from: x */
    public static C38768s1 m160160x(C33000c cVar) {
        C38768s1 s1Var = (C38768s1) cVar.mo95632c(C38768s1.class);
        if (s1Var != null) {
            return s1Var;
        }
        throw new EncodingException("Field has no @Protobuf config");
    }

    /* renamed from: B */
    public final void mo122531B(int i) throws IOException {
        while (((long) (i & -128)) != 0) {
            this.f98193a.write((i & 127) | 128);
            i >>>= 7;
        }
        this.f98193a.write(i & 127);
    }

    /* renamed from: C */
    public final void mo122532C(long j) throws IOException {
        while ((-128 & j) != 0) {
            this.f98193a.write((((int) j) & 127) | 128);
            j >>>= 7;
        }
        this.f98193a.write(((int) j) & 127);
    }

    @C0359n0
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ C33006e mo85159a(@C0359n0 C33000c cVar, boolean z) throws IOException {
        mo122536r(cVar, z ? 1 : 0, true);
        return this;
    }

    @C0359n0
    /* renamed from: b */
    public final /* bridge */ /* synthetic */ C33006e mo85160b(@C0359n0 C33000c cVar, long j) throws IOException {
        mo122537s(cVar, j, true);
        return this;
    }

    @C0359n0
    /* renamed from: c */
    public final /* bridge */ /* synthetic */ C33006e mo85161c(@C0359n0 C33000c cVar, int i) throws IOException {
        mo122536r(cVar, i, true);
        return this;
    }

    @C0359n0
    /* renamed from: d */
    public final C33006e mo85162d(@C0359n0 C33000c cVar, float f) throws IOException {
        mo122534p(cVar, f, true);
        return this;
    }

    @C0359n0
    /* renamed from: e */
    public final C33006e mo85163e(@C0359n0 C33000c cVar) throws IOException {
        throw new EncodingException("nested() is not implemented for protobuf encoding.");
    }

    @C0359n0
    /* renamed from: f */
    public final C33006e mo85164f(@C0359n0 C33000c cVar, double d) throws IOException {
        mo122533o(cVar, d, true);
        return this;
    }

    @C0359n0
    /* renamed from: g */
    public final C33006e mo85165g(@C0359n0 String str, boolean z) throws IOException {
        mo122536r(C33000c.m133161d(str), z ? 1 : 0, true);
        return this;
    }

    @C0359n0
    /* renamed from: h */
    public final C33006e mo85166h(@C0359n0 String str, double d) throws IOException {
        mo122533o(C33000c.m133161d(str), d, true);
        return this;
    }

    @C0359n0
    /* renamed from: i */
    public final C33006e mo85167i(@C0359n0 String str, long j) throws IOException {
        mo122537s(C33000c.m133161d(str), j, true);
        return this;
    }

    @C0359n0
    /* renamed from: j */
    public final C33006e mo85168j(@C0359n0 String str, int i) throws IOException {
        mo122536r(C33000c.m133161d(str), i, true);
        return this;
    }

    @C0359n0
    /* renamed from: k */
    public final C33006e mo85169k(@C0359n0 C33000c cVar, @C0363p0 Object obj) throws IOException {
        mo122535q(cVar, obj, true);
        return this;
    }

    @C0359n0
    /* renamed from: l */
    public final C33006e mo85170l(@C0363p0 Object obj) throws IOException {
        mo122538t(obj);
        return this;
    }

    @C0359n0
    /* renamed from: m */
    public final C33006e mo85171m(@C0359n0 String str, @C0363p0 Object obj) throws IOException {
        mo122535q(C33000c.m133161d(str), obj, true);
        return this;
    }

    @C0359n0
    /* renamed from: n */
    public final C33006e mo85172n(@C0359n0 String str) throws IOException {
        return mo85163e(C33000c.m133161d(str));
    }

    /* renamed from: o */
    public final C33006e mo122533o(@C0359n0 C33000c cVar, double d, boolean z) throws IOException {
        if (z && d == 0.0d) {
            return this;
        }
        mo122531B((m160159v(cVar) << 3) | 1);
        this.f98193a.write(m160157A(8).putDouble(d).array());
        return this;
    }

    /* renamed from: p */
    public final C33006e mo122534p(@C0359n0 C33000c cVar, float f, boolean z) throws IOException {
        if (z && f == 0.0f) {
            return this;
        }
        mo122531B((m160159v(cVar) << 3) | 5);
        this.f98193a.write(m160157A(4).putFloat(f).array());
        return this;
    }

    /* renamed from: q */
    public final C33006e mo122535q(@C0359n0 C33000c cVar, @C0363p0 Object obj, boolean z) throws IOException {
        if (obj == null) {
            return this;
        }
        if (obj instanceof CharSequence) {
            CharSequence charSequence = (CharSequence) obj;
            if (z && charSequence.length() == 0) {
                return this;
            }
            mo122531B((m160159v(cVar) << 3) | 2);
            byte[] bytes = charSequence.toString().getBytes(f98189f);
            mo122531B(bytes.length);
            this.f98193a.write(bytes);
            return this;
        } else if (obj instanceof Collection) {
            for (Object q : (Collection) obj) {
                mo122535q(cVar, q, false);
            }
            return this;
        } else if (obj instanceof Map) {
            for (Map.Entry y : ((Map) obj).entrySet()) {
                mo122540y(f98192i, cVar, y, false);
            }
            return this;
        } else if (obj instanceof Double) {
            mo122533o(cVar, ((Double) obj).doubleValue(), z);
            return this;
        } else if (obj instanceof Float) {
            mo122534p(cVar, ((Float) obj).floatValue(), z);
            return this;
        } else if (obj instanceof Number) {
            mo122537s(cVar, ((Number) obj).longValue(), z);
            return this;
        } else if (obj instanceof Boolean) {
            mo122536r(cVar, ((Boolean) obj).booleanValue() ? 1 : 0, z);
            return this;
        } else if (obj instanceof byte[]) {
            byte[] bArr = (byte[]) obj;
            if (z && bArr.length == 0) {
                return this;
            }
            mo122531B((m160159v(cVar) << 3) | 2);
            mo122531B(bArr.length);
            this.f98193a.write(bArr);
            return this;
        } else {
            C33005d dVar = this.f98194b.get(obj.getClass());
            if (dVar != null) {
                mo122540y(dVar, cVar, obj, z);
                return this;
            }
            C33007f fVar = this.f98195c.get(obj.getClass());
            if (fVar != null) {
                mo122541z(fVar, cVar, obj, z);
                return this;
            } else if (obj instanceof C38743q1) {
                mo122536r(cVar, ((C38743q1) obj).zza(), true);
                return this;
            } else if (obj instanceof Enum) {
                mo122536r(cVar, ((Enum) obj).ordinal(), true);
                return this;
            } else {
                mo122540y(this.f98196d, cVar, obj, z);
                return this;
            }
        }
    }

    /* renamed from: r */
    public final C38792u1 mo122536r(@C0359n0 C33000c cVar, int i, boolean z) throws IOException {
        if (z && i == 0) {
            return this;
        }
        C38768s1 x = m160160x(cVar);
        zzda zzda = zzda.DEFAULT;
        int ordinal = x.zzb().ordinal();
        if (ordinal == 0) {
            mo122531B(x.zza() << 3);
            mo122531B(i);
        } else if (ordinal == 1) {
            mo122531B(x.zza() << 3);
            mo122531B((i + i) ^ (i >> 31));
        } else if (ordinal == 2) {
            mo122531B((x.zza() << 3) | 5);
            this.f98193a.write(m160157A(4).putInt(i).array());
        }
        return this;
    }

    /* renamed from: s */
    public final C38792u1 mo122537s(@C0359n0 C33000c cVar, long j, boolean z) throws IOException {
        if (z && j == 0) {
            return this;
        }
        C38768s1 x = m160160x(cVar);
        zzda zzda = zzda.DEFAULT;
        int ordinal = x.zzb().ordinal();
        if (ordinal == 0) {
            mo122531B(x.zza() << 3);
            mo122532C(j);
        } else if (ordinal == 1) {
            mo122531B(x.zza() << 3);
            mo122532C((j >> 63) ^ (j + j));
        } else if (ordinal == 2) {
            mo122531B((x.zza() << 3) | 1);
            this.f98193a.write(m160157A(8).putLong(j).array());
        }
        return this;
    }

    /* renamed from: t */
    public final C38792u1 mo122538t(@C0363p0 Object obj) throws IOException {
        if (obj == null) {
            return this;
        }
        C33005d dVar = this.f98194b.get(obj.getClass());
        if (dVar != null) {
            dVar.mo85035a(obj, this);
            return this;
        }
        String valueOf = String.valueOf(obj.getClass());
        StringBuilder sb = new StringBuilder(valueOf.length() + 15);
        sb.append("No encoder for ");
        sb.append(valueOf);
        throw new EncodingException(sb.toString());
    }

    /* renamed from: w */
    public final <T> long mo122539w(C33005d<T> dVar, T t) throws IOException {
        OutputStream outputStream;
        C38730p1 p1Var = new C38730p1();
        try {
            outputStream = this.f98193a;
            this.f98193a = p1Var;
            dVar.mo85035a(t, this);
            this.f98193a = outputStream;
            long a = p1Var.mo122460a();
            p1Var.close();
            return a;
        } catch (Throwable th) {
            try {
                p1Var.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    /* renamed from: y */
    public final <T> C38792u1 mo122540y(C33005d<T> dVar, C33000c cVar, T t, boolean z) throws IOException {
        long w = mo122539w(dVar, t);
        if (z && w == 0) {
            return this;
        }
        mo122531B((m160159v(cVar) << 3) | 2);
        mo122532C(w);
        dVar.mo85035a(t, this);
        return this;
    }

    /* renamed from: z */
    public final <T> C38792u1 mo122541z(C33007f<T> fVar, C33000c cVar, T t, boolean z) throws IOException {
        this.f98197e.mo122575a(cVar, z);
        fVar.mo85035a(t, this.f98197e);
        return this;
    }
}
