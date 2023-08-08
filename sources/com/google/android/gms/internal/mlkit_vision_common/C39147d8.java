package com.google.android.gms.internal.mlkit_vision_common;

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

/* renamed from: com.google.android.gms.internal.mlkit_vision_common.d8 */
public final class C39147d8 implements C33006e {

    /* renamed from: f */
    public static final Charset f99919f = Charset.forName("UTF-8");

    /* renamed from: g */
    public static final C33000c f99920g;

    /* renamed from: h */
    public static final C33000c f99921h;

    /* renamed from: i */
    public static final C33005d<Map.Entry<Object, Object>> f99922i = C39137c8.f99901a;

    /* renamed from: a */
    public OutputStream f99923a;

    /* renamed from: b */
    public final Map<Class<?>, C33005d<?>> f99924b;

    /* renamed from: c */
    public final Map<Class<?>, C33007f<?>> f99925c;

    /* renamed from: d */
    public final C33005d<Object> f99926d;

    /* renamed from: e */
    public final C39148e f99927e = new C39148e(this);

    static {
        C33000c.C33002b a = C33000c.m133160a("key");
        C39336y7 y7Var = new C39336y7();
        y7Var.mo123366a(1);
        f99920g = a.mo95637b(y7Var.mo123367b()).mo95636a();
        C33000c.C33002b a2 = C33000c.m133160a("value");
        C39336y7 y7Var2 = new C39336y7();
        y7Var2.mo123366a(2);
        f99921h = a2.mo95637b(y7Var2.mo123367b()).mo95636a();
    }

    public C39147d8(OutputStream outputStream, Map<Class<?>, C33005d<?>> map, Map<Class<?>, C33007f<?>> map2, C33005d<Object> dVar) {
        this.f99923a = outputStream;
        this.f99924b = map;
        this.f99925c = map2;
        this.f99926d = dVar;
    }

    /* renamed from: A */
    public static ByteBuffer m161167A(int i) {
        return ByteBuffer.allocate(i).order(ByteOrder.LITTLE_ENDIAN);
    }

    /* renamed from: u */
    public static /* synthetic */ void m161168u(Map.Entry entry, C33006e eVar) throws IOException {
        eVar.mo85169k(f99920g, entry.getKey());
        eVar.mo85169k(f99921h, entry.getValue());
    }

    /* renamed from: v */
    public static int m161169v(C33000c cVar) {
        C39127b8 b8Var = (C39127b8) cVar.mo95632c(C39127b8.class);
        if (b8Var != null) {
            return b8Var.zza();
        }
        throw new EncodingException("Field has no @Protobuf config");
    }

    /* renamed from: x */
    public static C39127b8 m161170x(C33000c cVar) {
        C39127b8 b8Var = (C39127b8) cVar.mo95632c(C39127b8.class);
        if (b8Var != null) {
            return b8Var;
        }
        throw new EncodingException("Field has no @Protobuf config");
    }

    /* renamed from: B */
    public final void mo123244B(int i) throws IOException {
        while (((long) (i & -128)) != 0) {
            this.f99923a.write((i & 127) | 128);
            i >>>= 7;
        }
        this.f99923a.write(i & 127);
    }

    /* renamed from: C */
    public final void mo123245C(long j) throws IOException {
        while ((-128 & j) != 0) {
            this.f99923a.write((((int) j) & 127) | 128);
            j >>>= 7;
        }
        this.f99923a.write(((int) j) & 127);
    }

    @C0359n0
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ C33006e mo85159a(@C0359n0 C33000c cVar, boolean z) throws IOException {
        mo123249r(cVar, z ? 1 : 0, true);
        return this;
    }

    @C0359n0
    /* renamed from: b */
    public final /* bridge */ /* synthetic */ C33006e mo85160b(@C0359n0 C33000c cVar, long j) throws IOException {
        mo123250s(cVar, j, true);
        return this;
    }

    @C0359n0
    /* renamed from: c */
    public final /* bridge */ /* synthetic */ C33006e mo85161c(@C0359n0 C33000c cVar, int i) throws IOException {
        mo123249r(cVar, i, true);
        return this;
    }

    @C0359n0
    /* renamed from: d */
    public final C33006e mo85162d(@C0359n0 C33000c cVar, float f) throws IOException {
        mo123247p(cVar, f, true);
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
        mo123246o(cVar, d, true);
        return this;
    }

    @C0359n0
    /* renamed from: g */
    public final C33006e mo85165g(@C0359n0 String str, boolean z) throws IOException {
        mo123249r(C33000c.m133161d(str), z ? 1 : 0, true);
        return this;
    }

    @C0359n0
    /* renamed from: h */
    public final C33006e mo85166h(@C0359n0 String str, double d) throws IOException {
        mo123246o(C33000c.m133161d(str), d, true);
        return this;
    }

    @C0359n0
    /* renamed from: i */
    public final C33006e mo85167i(@C0359n0 String str, long j) throws IOException {
        mo123250s(C33000c.m133161d(str), j, true);
        return this;
    }

    @C0359n0
    /* renamed from: j */
    public final C33006e mo85168j(@C0359n0 String str, int i) throws IOException {
        mo123249r(C33000c.m133161d(str), i, true);
        return this;
    }

    @C0359n0
    /* renamed from: k */
    public final C33006e mo85169k(@C0359n0 C33000c cVar, @C0363p0 Object obj) throws IOException {
        mo123248q(cVar, obj, true);
        return this;
    }

    @C0359n0
    /* renamed from: l */
    public final C33006e mo85170l(@C0363p0 Object obj) throws IOException {
        mo123251t(obj);
        return this;
    }

    @C0359n0
    /* renamed from: m */
    public final C33006e mo85171m(@C0359n0 String str, @C0363p0 Object obj) throws IOException {
        mo123248q(C33000c.m133161d(str), obj, true);
        return this;
    }

    @C0359n0
    /* renamed from: n */
    public final C33006e mo85172n(@C0359n0 String str) throws IOException {
        return mo85163e(C33000c.m133161d(str));
    }

    /* renamed from: o */
    public final C33006e mo123246o(@C0359n0 C33000c cVar, double d, boolean z) throws IOException {
        if (z && d == 0.0d) {
            return this;
        }
        mo123244B((m161169v(cVar) << 3) | 1);
        this.f99923a.write(m161167A(8).putDouble(d).array());
        return this;
    }

    /* renamed from: p */
    public final C33006e mo123247p(@C0359n0 C33000c cVar, float f, boolean z) throws IOException {
        if (z && f == 0.0f) {
            return this;
        }
        mo123244B((m161169v(cVar) << 3) | 5);
        this.f99923a.write(m161167A(4).putFloat(f).array());
        return this;
    }

    /* renamed from: q */
    public final C33006e mo123248q(@C0359n0 C33000c cVar, @C0363p0 Object obj, boolean z) throws IOException {
        if (obj == null) {
            return this;
        }
        if (obj instanceof CharSequence) {
            CharSequence charSequence = (CharSequence) obj;
            if (z && charSequence.length() == 0) {
                return this;
            }
            mo123244B((m161169v(cVar) << 3) | 2);
            byte[] bytes = charSequence.toString().getBytes(f99919f);
            mo123244B(bytes.length);
            this.f99923a.write(bytes);
            return this;
        } else if (obj instanceof Collection) {
            for (Object q : (Collection) obj) {
                mo123248q(cVar, q, false);
            }
            return this;
        } else if (obj instanceof Map) {
            for (Map.Entry y : ((Map) obj).entrySet()) {
                mo123253y(f99922i, cVar, y, false);
            }
            return this;
        } else if (obj instanceof Double) {
            mo123246o(cVar, ((Double) obj).doubleValue(), z);
            return this;
        } else if (obj instanceof Float) {
            mo123247p(cVar, ((Float) obj).floatValue(), z);
            return this;
        } else if (obj instanceof Number) {
            mo123250s(cVar, ((Number) obj).longValue(), z);
            return this;
        } else if (obj instanceof Boolean) {
            mo123249r(cVar, ((Boolean) obj).booleanValue() ? 1 : 0, z);
            return this;
        } else if (obj instanceof byte[]) {
            byte[] bArr = (byte[]) obj;
            if (z && bArr.length == 0) {
                return this;
            }
            mo123244B((m161169v(cVar) << 3) | 2);
            mo123244B(bArr.length);
            this.f99923a.write(bArr);
            return this;
        } else {
            C33005d dVar = this.f99924b.get(obj.getClass());
            if (dVar != null) {
                mo123253y(dVar, cVar, obj, z);
                return this;
            }
            C33007f fVar = this.f99925c.get(obj.getClass());
            if (fVar != null) {
                mo123254z(fVar, cVar, obj, z);
                return this;
            } else if (obj instanceof C39117a8) {
                mo123249r(cVar, ((C39117a8) obj).zza(), true);
                return this;
            } else if (obj instanceof Enum) {
                mo123249r(cVar, ((Enum) obj).ordinal(), true);
                return this;
            } else {
                mo123253y(this.f99926d, cVar, obj, z);
                return this;
            }
        }
    }

    /* renamed from: r */
    public final C39147d8 mo123249r(@C0359n0 C33000c cVar, int i, boolean z) throws IOException {
        if (z && i == 0) {
            return this;
        }
        C39127b8 x = m161170x(cVar);
        zzw zzw = zzw.DEFAULT;
        int ordinal = x.zzb().ordinal();
        if (ordinal == 0) {
            mo123244B(x.zza() << 3);
            mo123244B(i);
        } else if (ordinal == 1) {
            mo123244B(x.zza() << 3);
            mo123244B((i + i) ^ (i >> 31));
        } else if (ordinal == 2) {
            mo123244B((x.zza() << 3) | 5);
            this.f99923a.write(m161167A(4).putInt(i).array());
        }
        return this;
    }

    /* renamed from: s */
    public final C39147d8 mo123250s(@C0359n0 C33000c cVar, long j, boolean z) throws IOException {
        if (z && j == 0) {
            return this;
        }
        C39127b8 x = m161170x(cVar);
        zzw zzw = zzw.DEFAULT;
        int ordinal = x.zzb().ordinal();
        if (ordinal == 0) {
            mo123244B(x.zza() << 3);
            mo123245C(j);
        } else if (ordinal == 1) {
            mo123244B(x.zza() << 3);
            mo123245C((j >> 63) ^ (j + j));
        } else if (ordinal == 2) {
            mo123244B((x.zza() << 3) | 1);
            this.f99923a.write(m161167A(8).putLong(j).array());
        }
        return this;
    }

    /* renamed from: t */
    public final C39147d8 mo123251t(@C0363p0 Object obj) throws IOException {
        if (obj == null) {
            return this;
        }
        C33005d dVar = this.f99924b.get(obj.getClass());
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
    public final <T> long mo123252w(C33005d<T> dVar, T t) throws IOException {
        OutputStream outputStream;
        C39345z7 z7Var = new C39345z7();
        try {
            outputStream = this.f99923a;
            this.f99923a = z7Var;
            dVar.mo85035a(t, this);
            this.f99923a = outputStream;
            long a = z7Var.mo123369a();
            z7Var.close();
            return a;
        } catch (Throwable th) {
            try {
                z7Var.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    /* renamed from: y */
    public final <T> C39147d8 mo123253y(C33005d<T> dVar, C33000c cVar, T t, boolean z) throws IOException {
        long w = mo123252w(dVar, t);
        if (z && w == 0) {
            return this;
        }
        mo123244B((m161169v(cVar) << 3) | 2);
        mo123245C(w);
        dVar.mo85035a(t, this);
        return this;
    }

    /* renamed from: z */
    public final <T> C39147d8 mo123254z(C33007f<T> fVar, C33000c cVar, T t, boolean z) throws IOException {
        this.f99927e.mo123255a(cVar, z);
        fVar.mo85035a(t, this.f99927e);
        return this;
    }
}
