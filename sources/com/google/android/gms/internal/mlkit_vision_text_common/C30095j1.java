package com.google.android.gms.internal.mlkit_vision_text_common;

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

/* renamed from: com.google.android.gms.internal.mlkit_vision_text_common.j1 */
public final class C30095j1 implements C33006e {

    /* renamed from: f */
    public static final Charset f71928f = Charset.forName("UTF-8");

    /* renamed from: g */
    public static final C33000c f71929g;

    /* renamed from: h */
    public static final C33000c f71930h;

    /* renamed from: i */
    public static final C33005d<Map.Entry<Object, Object>> f71931i = C30083i1.f71913a;

    /* renamed from: a */
    public OutputStream f71932a;

    /* renamed from: b */
    public final Map<Class<?>, C33005d<?>> f71933b;

    /* renamed from: c */
    public final Map<Class<?>, C33007f<?>> f71934c;

    /* renamed from: d */
    public final C33005d<Object> f71935d;

    /* renamed from: e */
    public final C30143n1 f71936e = new C30143n1(this);

    static {
        C33000c.C33002b a = C33000c.m133160a("key");
        C30035e1 e1Var = new C30035e1();
        e1Var.mo85083a(1);
        f71929g = a.mo95637b(e1Var.mo85084b()).mo95636a();
        C33000c.C33002b a2 = C33000c.m133160a("value");
        C30035e1 e1Var2 = new C30035e1();
        e1Var2.mo85083a(2);
        f71930h = a2.mo95637b(e1Var2.mo85084b()).mo95636a();
    }

    public C30095j1(OutputStream outputStream, Map<Class<?>, C33005d<?>> map, Map<Class<?>, C33007f<?>> map2, C33005d<Object> dVar) {
        this.f71932a = outputStream;
        this.f71933b = map;
        this.f71934c = map2;
        this.f71935d = dVar;
    }

    /* renamed from: A */
    public static ByteBuffer m121713A(int i) {
        return ByteBuffer.allocate(i).order(ByteOrder.LITTLE_ENDIAN);
    }

    /* renamed from: u */
    public static /* synthetic */ void m121714u(Map.Entry entry, C33006e eVar) throws IOException {
        eVar.mo85169k(f71929g, entry.getKey());
        eVar.mo85169k(f71930h, entry.getValue());
    }

    /* renamed from: v */
    public static int m121715v(C33000c cVar) {
        C30071h1 h1Var = (C30071h1) cVar.mo95632c(C30071h1.class);
        if (h1Var != null) {
            return h1Var.zza();
        }
        throw new EncodingException("Field has no @Protobuf config");
    }

    /* renamed from: x */
    public static C30071h1 m121716x(C33000c cVar) {
        C30071h1 h1Var = (C30071h1) cVar.mo95632c(C30071h1.class);
        if (h1Var != null) {
            return h1Var;
        }
        throw new EncodingException("Field has no @Protobuf config");
    }

    /* renamed from: B */
    public final void mo85157B(int i) throws IOException {
        while (((long) (i & -128)) != 0) {
            this.f71932a.write((i & 127) | 128);
            i >>>= 7;
        }
        this.f71932a.write(i & 127);
    }

    /* renamed from: C */
    public final void mo85158C(long j) throws IOException {
        while ((-128 & j) != 0) {
            this.f71932a.write((((int) j) & 127) | 128);
            j >>>= 7;
        }
        this.f71932a.write(((int) j) & 127);
    }

    @C0359n0
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ C33006e mo85159a(@C0359n0 C33000c cVar, boolean z) throws IOException {
        mo85176r(cVar, z ? 1 : 0, true);
        return this;
    }

    @C0359n0
    /* renamed from: b */
    public final /* bridge */ /* synthetic */ C33006e mo85160b(@C0359n0 C33000c cVar, long j) throws IOException {
        mo85177s(cVar, j, true);
        return this;
    }

    @C0359n0
    /* renamed from: c */
    public final /* bridge */ /* synthetic */ C33006e mo85161c(@C0359n0 C33000c cVar, int i) throws IOException {
        mo85176r(cVar, i, true);
        return this;
    }

    @C0359n0
    /* renamed from: d */
    public final C33006e mo85162d(@C0359n0 C33000c cVar, float f) throws IOException {
        mo85174p(cVar, f, true);
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
        mo85173o(cVar, d, true);
        return this;
    }

    @C0359n0
    /* renamed from: g */
    public final C33006e mo85165g(@C0359n0 String str, boolean z) throws IOException {
        mo85176r(C33000c.m133161d(str), z ? 1 : 0, true);
        return this;
    }

    @C0359n0
    /* renamed from: h */
    public final C33006e mo85166h(@C0359n0 String str, double d) throws IOException {
        mo85173o(C33000c.m133161d(str), d, true);
        return this;
    }

    @C0359n0
    /* renamed from: i */
    public final C33006e mo85167i(@C0359n0 String str, long j) throws IOException {
        mo85177s(C33000c.m133161d(str), j, true);
        return this;
    }

    @C0359n0
    /* renamed from: j */
    public final C33006e mo85168j(@C0359n0 String str, int i) throws IOException {
        mo85176r(C33000c.m133161d(str), i, true);
        return this;
    }

    @C0359n0
    /* renamed from: k */
    public final C33006e mo85169k(@C0359n0 C33000c cVar, @C0363p0 Object obj) throws IOException {
        mo85175q(cVar, obj, true);
        return this;
    }

    @C0359n0
    /* renamed from: l */
    public final C33006e mo85170l(@C0363p0 Object obj) throws IOException {
        mo85178t(obj);
        return this;
    }

    @C0359n0
    /* renamed from: m */
    public final C33006e mo85171m(@C0359n0 String str, @C0363p0 Object obj) throws IOException {
        mo85175q(C33000c.m133161d(str), obj, true);
        return this;
    }

    @C0359n0
    /* renamed from: n */
    public final C33006e mo85172n(@C0359n0 String str) throws IOException {
        return mo85163e(C33000c.m133161d(str));
    }

    /* renamed from: o */
    public final C33006e mo85173o(@C0359n0 C33000c cVar, double d, boolean z) throws IOException {
        if (z && d == 0.0d) {
            return this;
        }
        mo85157B((m121715v(cVar) << 3) | 1);
        this.f71932a.write(m121713A(8).putDouble(d).array());
        return this;
    }

    /* renamed from: p */
    public final C33006e mo85174p(@C0359n0 C33000c cVar, float f, boolean z) throws IOException {
        if (z && f == 0.0f) {
            return this;
        }
        mo85157B((m121715v(cVar) << 3) | 5);
        this.f71932a.write(m121713A(4).putFloat(f).array());
        return this;
    }

    /* renamed from: q */
    public final C33006e mo85175q(@C0359n0 C33000c cVar, @C0363p0 Object obj, boolean z) throws IOException {
        if (obj == null) {
            return this;
        }
        if (obj instanceof CharSequence) {
            CharSequence charSequence = (CharSequence) obj;
            if (z && charSequence.length() == 0) {
                return this;
            }
            mo85157B((m121715v(cVar) << 3) | 2);
            byte[] bytes = charSequence.toString().getBytes(f71928f);
            mo85157B(bytes.length);
            this.f71932a.write(bytes);
            return this;
        } else if (obj instanceof Collection) {
            for (Object q : (Collection) obj) {
                mo85175q(cVar, q, false);
            }
            return this;
        } else if (obj instanceof Map) {
            for (Map.Entry y : ((Map) obj).entrySet()) {
                mo85180y(f71931i, cVar, y, false);
            }
            return this;
        } else if (obj instanceof Double) {
            mo85173o(cVar, ((Double) obj).doubleValue(), z);
            return this;
        } else if (obj instanceof Float) {
            mo85174p(cVar, ((Float) obj).floatValue(), z);
            return this;
        } else if (obj instanceof Number) {
            mo85177s(cVar, ((Number) obj).longValue(), z);
            return this;
        } else if (obj instanceof Boolean) {
            mo85176r(cVar, ((Boolean) obj).booleanValue() ? 1 : 0, z);
            return this;
        } else if (obj instanceof byte[]) {
            byte[] bArr = (byte[]) obj;
            if (z && bArr.length == 0) {
                return this;
            }
            mo85157B((m121715v(cVar) << 3) | 2);
            mo85157B(bArr.length);
            this.f71932a.write(bArr);
            return this;
        } else {
            C33005d dVar = this.f71933b.get(obj.getClass());
            if (dVar != null) {
                mo85180y(dVar, cVar, obj, z);
                return this;
            }
            C33007f fVar = this.f71934c.get(obj.getClass());
            if (fVar != null) {
                mo85181z(fVar, cVar, obj, z);
                return this;
            } else if (obj instanceof C30059g1) {
                mo85176r(cVar, ((C30059g1) obj).zza(), true);
                return this;
            } else if (obj instanceof Enum) {
                mo85176r(cVar, ((Enum) obj).ordinal(), true);
                return this;
            } else {
                mo85180y(this.f71935d, cVar, obj, z);
                return this;
            }
        }
    }

    /* renamed from: r */
    public final C30095j1 mo85176r(@C0359n0 C33000c cVar, int i, boolean z) throws IOException {
        if (z && i == 0) {
            return this;
        }
        C30071h1 x = m121716x(cVar);
        zzcq zzcq = zzcq.DEFAULT;
        int ordinal = x.zzb().ordinal();
        if (ordinal == 0) {
            mo85157B(x.zza() << 3);
            mo85157B(i);
        } else if (ordinal == 1) {
            mo85157B(x.zza() << 3);
            mo85157B((i + i) ^ (i >> 31));
        } else if (ordinal == 2) {
            mo85157B((x.zza() << 3) | 5);
            this.f71932a.write(m121713A(4).putInt(i).array());
        }
        return this;
    }

    /* renamed from: s */
    public final C30095j1 mo85177s(@C0359n0 C33000c cVar, long j, boolean z) throws IOException {
        if (z && j == 0) {
            return this;
        }
        C30071h1 x = m121716x(cVar);
        zzcq zzcq = zzcq.DEFAULT;
        int ordinal = x.zzb().ordinal();
        if (ordinal == 0) {
            mo85157B(x.zza() << 3);
            mo85158C(j);
        } else if (ordinal == 1) {
            mo85157B(x.zza() << 3);
            mo85158C((j >> 63) ^ (j + j));
        } else if (ordinal == 2) {
            mo85157B((x.zza() << 3) | 1);
            this.f71932a.write(m121713A(8).putLong(j).array());
        }
        return this;
    }

    /* renamed from: t */
    public final C30095j1 mo85178t(@C0363p0 Object obj) throws IOException {
        if (obj == null) {
            return this;
        }
        C33005d dVar = this.f71933b.get(obj.getClass());
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
    public final <T> long mo85179w(C33005d<T> dVar, T t) throws IOException {
        OutputStream outputStream;
        C30047f1 f1Var = new C30047f1();
        try {
            outputStream = this.f71932a;
            this.f71932a = f1Var;
            dVar.mo85035a(t, this);
            this.f71932a = outputStream;
            long a = f1Var.mo85096a();
            f1Var.close();
            return a;
        } catch (Throwable th) {
            try {
                f1Var.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    /* renamed from: y */
    public final <T> C30095j1 mo85180y(C33005d<T> dVar, C33000c cVar, T t, boolean z) throws IOException {
        long w = mo85179w(dVar, t);
        if (z && w == 0) {
            return this;
        }
        mo85157B((m121715v(cVar) << 3) | 2);
        mo85158C(w);
        dVar.mo85035a(t, this);
        return this;
    }

    /* renamed from: z */
    public final <T> C30095j1 mo85181z(C33007f<T> fVar, C33000c cVar, T t, boolean z) throws IOException {
        this.f71936e.mo85256a(cVar, z);
        fVar.mo85035a(t, this.f71936e);
        return this;
    }
}
