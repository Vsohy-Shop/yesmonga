package com.google.android.gms.internal.mlkit_common;

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

/* renamed from: com.google.android.gms.internal.mlkit_common.y */
public final class C42564y implements C33006e {

    /* renamed from: f */
    public static final Charset f107447f = Charset.forName("UTF-8");

    /* renamed from: g */
    public static final C33000c f107448g;

    /* renamed from: h */
    public static final C33000c f107449h;

    /* renamed from: i */
    public static final C33005d<Map.Entry<Object, Object>> f107450i = C42554x.f107430a;

    /* renamed from: a */
    public OutputStream f107451a;

    /* renamed from: b */
    public final Map<Class<?>, C33005d<?>> f107452b;

    /* renamed from: c */
    public final Map<Class<?>, C33007f<?>> f107453c;

    /* renamed from: d */
    public final C33005d<Object> f107454d;

    /* renamed from: e */
    public final C42326c0 f107455e = new C42326c0(this);

    static {
        C33000c.C33002b a = C33000c.m133160a("key");
        C42501s sVar = new C42501s();
        sVar.mo137789a(1);
        f107448g = a.mo95637b(sVar.mo137790b()).mo95636a();
        C33000c.C33002b a2 = C33000c.m133160a("value");
        C42501s sVar2 = new C42501s();
        sVar2.mo137789a(2);
        f107449h = a2.mo95637b(sVar2.mo137790b()).mo95636a();
    }

    public C42564y(OutputStream outputStream, Map<Class<?>, C33005d<?>> map, Map<Class<?>, C33007f<?>> map2, C33005d<Object> dVar) {
        this.f107451a = outputStream;
        this.f107452b = map;
        this.f107453c = map2;
        this.f107454d = dVar;
    }

    /* renamed from: A */
    public static ByteBuffer m171695A(int i) {
        return ByteBuffer.allocate(i).order(ByteOrder.LITTLE_ENDIAN);
    }

    /* renamed from: u */
    public static /* synthetic */ void m171696u(Map.Entry entry, C33006e eVar) throws IOException {
        eVar.mo85169k(f107448g, entry.getKey());
        eVar.mo85169k(f107449h, entry.getValue());
    }

    /* renamed from: v */
    public static int m171697v(C33000c cVar) {
        C42544w wVar = (C42544w) cVar.mo95632c(C42544w.class);
        if (wVar != null) {
            return wVar.zza();
        }
        throw new EncodingException("Field has no @Protobuf config");
    }

    /* renamed from: x */
    public static C42544w m171698x(C33000c cVar) {
        C42544w wVar = (C42544w) cVar.mo95632c(C42544w.class);
        if (wVar != null) {
            return wVar;
        }
        throw new EncodingException("Field has no @Protobuf config");
    }

    /* renamed from: B */
    public final void mo137826B(int i) throws IOException {
        while (((long) (i & -128)) != 0) {
            this.f107451a.write((i & 127) | 128);
            i >>>= 7;
        }
        this.f107451a.write(i & 127);
    }

    /* renamed from: C */
    public final void mo137827C(long j) throws IOException {
        while ((-128 & j) != 0) {
            this.f107451a.write((((int) j) & 127) | 128);
            j >>>= 7;
        }
        this.f107451a.write(((int) j) & 127);
    }

    @C0359n0
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ C33006e mo85159a(@C0359n0 C33000c cVar, boolean z) throws IOException {
        mo137831r(cVar, z ? 1 : 0, true);
        return this;
    }

    @C0359n0
    /* renamed from: b */
    public final /* bridge */ /* synthetic */ C33006e mo85160b(@C0359n0 C33000c cVar, long j) throws IOException {
        mo137832s(cVar, j, true);
        return this;
    }

    @C0359n0
    /* renamed from: c */
    public final /* bridge */ /* synthetic */ C33006e mo85161c(@C0359n0 C33000c cVar, int i) throws IOException {
        mo137831r(cVar, i, true);
        return this;
    }

    @C0359n0
    /* renamed from: d */
    public final C33006e mo85162d(@C0359n0 C33000c cVar, float f) throws IOException {
        mo137829p(cVar, f, true);
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
        mo137828o(cVar, d, true);
        return this;
    }

    @C0359n0
    /* renamed from: g */
    public final C33006e mo85165g(@C0359n0 String str, boolean z) throws IOException {
        mo137831r(C33000c.m133161d(str), z ? 1 : 0, true);
        return this;
    }

    @C0359n0
    /* renamed from: h */
    public final C33006e mo85166h(@C0359n0 String str, double d) throws IOException {
        mo137828o(C33000c.m133161d(str), d, true);
        return this;
    }

    @C0359n0
    /* renamed from: i */
    public final C33006e mo85167i(@C0359n0 String str, long j) throws IOException {
        mo137832s(C33000c.m133161d(str), j, true);
        return this;
    }

    @C0359n0
    /* renamed from: j */
    public final C33006e mo85168j(@C0359n0 String str, int i) throws IOException {
        mo137831r(C33000c.m133161d(str), i, true);
        return this;
    }

    @C0359n0
    /* renamed from: k */
    public final C33006e mo85169k(@C0359n0 C33000c cVar, @C0363p0 Object obj) throws IOException {
        mo137830q(cVar, obj, true);
        return this;
    }

    @C0359n0
    /* renamed from: l */
    public final C33006e mo85170l(@C0363p0 Object obj) throws IOException {
        mo137833t(obj);
        return this;
    }

    @C0359n0
    /* renamed from: m */
    public final C33006e mo85171m(@C0359n0 String str, @C0363p0 Object obj) throws IOException {
        mo137830q(C33000c.m133161d(str), obj, true);
        return this;
    }

    @C0359n0
    /* renamed from: n */
    public final C33006e mo85172n(@C0359n0 String str) throws IOException {
        return mo85163e(C33000c.m133161d(str));
    }

    /* renamed from: o */
    public final C33006e mo137828o(@C0359n0 C33000c cVar, double d, boolean z) throws IOException {
        if (z && d == 0.0d) {
            return this;
        }
        mo137826B((m171697v(cVar) << 3) | 1);
        this.f107451a.write(m171695A(8).putDouble(d).array());
        return this;
    }

    /* renamed from: p */
    public final C33006e mo137829p(@C0359n0 C33000c cVar, float f, boolean z) throws IOException {
        if (z && f == 0.0f) {
            return this;
        }
        mo137826B((m171697v(cVar) << 3) | 5);
        this.f107451a.write(m171695A(4).putFloat(f).array());
        return this;
    }

    /* renamed from: q */
    public final C33006e mo137830q(@C0359n0 C33000c cVar, @C0363p0 Object obj, boolean z) throws IOException {
        if (obj == null) {
            return this;
        }
        if (obj instanceof CharSequence) {
            CharSequence charSequence = (CharSequence) obj;
            if (z && charSequence.length() == 0) {
                return this;
            }
            mo137826B((m171697v(cVar) << 3) | 2);
            byte[] bytes = charSequence.toString().getBytes(f107447f);
            mo137826B(bytes.length);
            this.f107451a.write(bytes);
            return this;
        } else if (obj instanceof Collection) {
            for (Object q : (Collection) obj) {
                mo137830q(cVar, q, false);
            }
            return this;
        } else if (obj instanceof Map) {
            for (Map.Entry y : ((Map) obj).entrySet()) {
                mo137835y(f107450i, cVar, y, false);
            }
            return this;
        } else if (obj instanceof Double) {
            mo137828o(cVar, ((Double) obj).doubleValue(), z);
            return this;
        } else if (obj instanceof Float) {
            mo137829p(cVar, ((Float) obj).floatValue(), z);
            return this;
        } else if (obj instanceof Number) {
            mo137832s(cVar, ((Number) obj).longValue(), z);
            return this;
        } else if (obj instanceof Boolean) {
            mo137831r(cVar, ((Boolean) obj).booleanValue() ? 1 : 0, z);
            return this;
        } else if (obj instanceof byte[]) {
            byte[] bArr = (byte[]) obj;
            if (z && bArr.length == 0) {
                return this;
            }
            mo137826B((m171697v(cVar) << 3) | 2);
            mo137826B(bArr.length);
            this.f107451a.write(bArr);
            return this;
        } else {
            C33005d dVar = this.f107452b.get(obj.getClass());
            if (dVar != null) {
                mo137835y(dVar, cVar, obj, z);
                return this;
            }
            C33007f fVar = this.f107453c.get(obj.getClass());
            if (fVar != null) {
                mo137836z(fVar, cVar, obj, z);
                return this;
            } else if (obj instanceof C42523u) {
                mo137831r(cVar, ((C42523u) obj).zza(), true);
                return this;
            } else if (obj instanceof Enum) {
                mo137831r(cVar, ((Enum) obj).ordinal(), true);
                return this;
            } else {
                mo137835y(this.f107454d, cVar, obj, z);
                return this;
            }
        }
    }

    /* renamed from: r */
    public final C42564y mo137831r(@C0359n0 C33000c cVar, int i, boolean z) throws IOException {
        if (z && i == 0) {
            return this;
        }
        C42544w x = m171698x(cVar);
        zzaz zzaz = zzaz.DEFAULT;
        int ordinal = x.zzb().ordinal();
        if (ordinal == 0) {
            mo137826B(x.zza() << 3);
            mo137826B(i);
        } else if (ordinal == 1) {
            mo137826B(x.zza() << 3);
            mo137826B((i + i) ^ (i >> 31));
        } else if (ordinal == 2) {
            mo137826B((x.zza() << 3) | 5);
            this.f107451a.write(m171695A(4).putInt(i).array());
        }
        return this;
    }

    /* renamed from: s */
    public final C42564y mo137832s(@C0359n0 C33000c cVar, long j, boolean z) throws IOException {
        if (z && j == 0) {
            return this;
        }
        C42544w x = m171698x(cVar);
        zzaz zzaz = zzaz.DEFAULT;
        int ordinal = x.zzb().ordinal();
        if (ordinal == 0) {
            mo137826B(x.zza() << 3);
            mo137827C(j);
        } else if (ordinal == 1) {
            mo137826B(x.zza() << 3);
            mo137827C((j >> 63) ^ (j + j));
        } else if (ordinal == 2) {
            mo137826B((x.zza() << 3) | 1);
            this.f107451a.write(m171695A(8).putLong(j).array());
        }
        return this;
    }

    /* renamed from: t */
    public final C42564y mo137833t(@C0363p0 Object obj) throws IOException {
        if (obj == null) {
            return this;
        }
        C33005d dVar = this.f107452b.get(obj.getClass());
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
    public final <T> long mo137834w(C33005d<T> dVar, T t) throws IOException {
        OutputStream outputStream;
        C42512t tVar = new C42512t();
        try {
            outputStream = this.f107451a;
            this.f107451a = tVar;
            dVar.mo85035a(t, this);
            this.f107451a = outputStream;
            long a = tVar.mo137798a();
            tVar.close();
            return a;
        } catch (Throwable th) {
            try {
                tVar.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    /* renamed from: y */
    public final <T> C42564y mo137835y(C33005d<T> dVar, C33000c cVar, T t, boolean z) throws IOException {
        long w = mo137834w(dVar, t);
        if (z && w == 0) {
            return this;
        }
        mo137826B((m171697v(cVar) << 3) | 2);
        mo137827C(w);
        dVar.mo85035a(t, this);
        return this;
    }

    /* renamed from: z */
    public final <T> C42564y mo137836z(C33007f<T> fVar, C33000c cVar, T t, boolean z) throws IOException {
        this.f107455e.mo137632a(cVar, z);
        fVar.mo85035a(t, this.f107455e);
        return this;
    }
}
