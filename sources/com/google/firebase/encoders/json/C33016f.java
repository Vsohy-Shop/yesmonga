package com.google.firebase.encoders.json;

import android.util.Base64;
import android.util.JsonWriter;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import com.google.firebase.encoders.C33000c;
import com.google.firebase.encoders.C33005d;
import com.google.firebase.encoders.C33006e;
import com.google.firebase.encoders.C33007f;
import com.google.firebase.encoders.C33008g;
import com.google.firebase.encoders.EncodingException;
import java.io.IOException;
import java.io.Writer;
import java.util.Collection;
import java.util.Date;
import java.util.Map;

/* renamed from: com.google.firebase.encoders.json.f */
public final class C33016f implements C33006e, C33008g {

    /* renamed from: a */
    public C33016f f80105a = null;

    /* renamed from: b */
    public boolean f80106b = true;

    /* renamed from: c */
    public final JsonWriter f80107c;

    /* renamed from: d */
    public final Map<Class<?>, C33005d<?>> f80108d;

    /* renamed from: e */
    public final Map<Class<?>, C33007f<?>> f80109e;

    /* renamed from: f */
    public final C33005d<Object> f80110f;

    /* renamed from: g */
    public final boolean f80111g;

    public C33016f(@C0359n0 Writer writer, @C0359n0 Map<Class<?>, C33005d<?>> map, @C0359n0 Map<Class<?>, C33007f<?>> map2, C33005d<Object> dVar, boolean z) {
        this.f80107c = new JsonWriter(writer);
        this.f80108d = map;
        this.f80109e = map2;
        this.f80110f = dVar;
        this.f80111g = z;
    }

    @C0359n0
    /* renamed from: A */
    public C33016f mo85253P(boolean z) throws IOException {
        mo95652H();
        this.f80107c.value(z);
        return this;
    }

    @C0359n0
    /* renamed from: B */
    public C33016f mo85259s(@C0363p0 byte[] bArr) throws IOException {
        mo95652H();
        if (bArr == null) {
            this.f80107c.nullValue();
        } else {
            this.f80107c.value(Base64.encodeToString(bArr, 2));
        }
        return this;
    }

    /* renamed from: C */
    public final boolean mo95647C(Object obj) {
        return obj == null || obj.getClass().isArray() || (obj instanceof Collection) || (obj instanceof Date) || (obj instanceof Enum) || (obj instanceof Number);
    }

    /* renamed from: D */
    public void mo95648D() throws IOException {
        mo95652H();
        this.f80107c.flush();
    }

    /* renamed from: E */
    public C33016f mo95649E(C33005d<Object> dVar, Object obj, boolean z) throws IOException {
        if (!z) {
            this.f80107c.beginObject();
        }
        dVar.mo85035a(obj, this);
        if (!z) {
            this.f80107c.endObject();
        }
        return this;
    }

    /* renamed from: F */
    public final C33016f mo95650F(@C0359n0 String str, @C0363p0 Object obj) throws IOException, EncodingException {
        mo95652H();
        this.f80107c.name(str);
        if (obj != null) {
            return mo95657t(obj, false);
        }
        this.f80107c.nullValue();
        return this;
    }

    /* renamed from: G */
    public final C33016f mo95651G(@C0359n0 String str, @C0363p0 Object obj) throws IOException, EncodingException {
        if (obj == null) {
            return this;
        }
        mo95652H();
        this.f80107c.name(str);
        return mo95657t(obj, false);
    }

    /* renamed from: H */
    public final void mo95652H() throws IOException {
        if (this.f80106b) {
            C33016f fVar = this.f80105a;
            if (fVar != null) {
                fVar.mo95652H();
                this.f80105a.f80106b = false;
                this.f80105a = null;
                this.f80107c.endObject();
                return;
            }
            return;
        }
        throw new IllegalStateException("Parent context used since this context was created. Cannot use this context anymore.");
    }

    @C0359n0
    /* renamed from: a */
    public C33006e mo85159a(@C0359n0 C33000c cVar, boolean z) throws IOException {
        return mo85165g(cVar.mo95631b(), z);
    }

    @C0359n0
    /* renamed from: b */
    public C33006e mo85160b(@C0359n0 C33000c cVar, long j) throws IOException {
        return mo85167i(cVar.mo95631b(), j);
    }

    @C0359n0
    /* renamed from: c */
    public C33006e mo85161c(@C0359n0 C33000c cVar, int i) throws IOException {
        return mo85168j(cVar.mo95631b(), i);
    }

    @C0359n0
    /* renamed from: d */
    public C33006e mo85162d(@C0359n0 C33000c cVar, float f) throws IOException {
        return mo85166h(cVar.mo95631b(), (double) f);
    }

    @C0359n0
    /* renamed from: e */
    public C33006e mo85163e(@C0359n0 C33000c cVar) throws IOException {
        return mo85172n(cVar.mo95631b());
    }

    @C0359n0
    /* renamed from: f */
    public C33006e mo85164f(@C0359n0 C33000c cVar, double d) throws IOException {
        return mo85166h(cVar.mo95631b(), d);
    }

    @C0359n0
    /* renamed from: k */
    public C33006e mo85169k(@C0359n0 C33000c cVar, @C0363p0 Object obj) throws IOException {
        return mo85171m(cVar.mo95631b(), obj);
    }

    @C0359n0
    /* renamed from: l */
    public C33006e mo85170l(@C0363p0 Object obj) throws IOException {
        return mo95657t(obj, true);
    }

    @C0359n0
    /* renamed from: n */
    public C33006e mo85172n(@C0359n0 String str) throws IOException {
        mo95652H();
        this.f80105a = new C33016f(this);
        this.f80107c.name(str);
        this.f80107c.beginObject();
        return this.f80105a;
    }

    @C0359n0
    /* renamed from: o */
    public C33016f mo85254Q(double d) throws IOException {
        mo95652H();
        this.f80107c.value(d);
        return this;
    }

    @C0359n0
    /* renamed from: p */
    public C33016f mo85255R(float f) throws IOException {
        mo95652H();
        this.f80107c.value((double) f);
        return this;
    }

    @C0359n0
    /* renamed from: q */
    public C33016f add(int i) throws IOException {
        mo95652H();
        this.f80107c.value((long) i);
        return this;
    }

    @C0359n0
    /* renamed from: r */
    public C33016f mo85251N(long j) throws IOException {
        mo95652H();
        this.f80107c.value(j);
        return this;
    }

    @C0359n0
    /* renamed from: t */
    public C33016f mo95657t(@C0363p0 Object obj, boolean z) throws IOException {
        Class<?> cls;
        int i = 0;
        if (z && mo95647C(obj)) {
            Object[] objArr = new Object[1];
            if (obj == null) {
                cls = null;
            } else {
                cls = obj.getClass();
            }
            objArr[0] = cls;
            throw new EncodingException(String.format("%s cannot be encoded inline", objArr));
        } else if (obj == null) {
            this.f80107c.nullValue();
            return this;
        } else if (obj instanceof Number) {
            this.f80107c.value((Number) obj);
            return this;
        } else if (obj.getClass().isArray()) {
            if (obj instanceof byte[]) {
                return mo85259s((byte[]) obj);
            }
            this.f80107c.beginArray();
            if (obj instanceof int[]) {
                int[] iArr = (int[]) obj;
                int length = iArr.length;
                while (i < length) {
                    this.f80107c.value((long) iArr[i]);
                    i++;
                }
            } else if (obj instanceof long[]) {
                long[] jArr = (long[]) obj;
                int length2 = jArr.length;
                while (i < length2) {
                    mo85251N(jArr[i]);
                    i++;
                }
            } else if (obj instanceof double[]) {
                double[] dArr = (double[]) obj;
                int length3 = dArr.length;
                while (i < length3) {
                    this.f80107c.value(dArr[i]);
                    i++;
                }
            } else if (obj instanceof boolean[]) {
                boolean[] zArr = (boolean[]) obj;
                int length4 = zArr.length;
                while (i < length4) {
                    this.f80107c.value(zArr[i]);
                    i++;
                }
            } else if (obj instanceof Number[]) {
                for (Number t : (Number[]) obj) {
                    mo95657t(t, false);
                }
            } else {
                for (Object t2 : (Object[]) obj) {
                    mo95657t(t2, false);
                }
            }
            this.f80107c.endArray();
            return this;
        } else if (obj instanceof Collection) {
            this.f80107c.beginArray();
            for (Object t3 : (Collection) obj) {
                mo95657t(t3, false);
            }
            this.f80107c.endArray();
            return this;
        } else if (obj instanceof Map) {
            this.f80107c.beginObject();
            for (Map.Entry entry : ((Map) obj).entrySet()) {
                Object key = entry.getKey();
                try {
                    mo85171m((String) key, entry.getValue());
                } catch (ClassCastException e) {
                    throw new EncodingException(String.format("Only String keys are currently supported in maps, got %s of type %s instead.", new Object[]{key, key.getClass()}), e);
                }
            }
            this.f80107c.endObject();
            return this;
        } else {
            C33005d dVar = this.f80108d.get(obj.getClass());
            if (dVar != null) {
                return mo95649E(dVar, obj, z);
            }
            C33007f fVar = this.f80109e.get(obj.getClass());
            if (fVar != null) {
                fVar.mo85035a(obj, this);
                return this;
            } else if (!(obj instanceof Enum)) {
                return mo95649E(this.f80110f, obj, z);
            } else {
                mo85252O(((Enum) obj).name());
                return this;
            }
        }
    }

    @C0359n0
    /* renamed from: u */
    public C33016f mo85252O(@C0363p0 String str) throws IOException {
        mo95652H();
        this.f80107c.value(str);
        return this;
    }

    @C0359n0
    /* renamed from: v */
    public C33016f mo85166h(@C0359n0 String str, double d) throws IOException {
        mo95652H();
        this.f80107c.name(str);
        return mo85254Q(d);
    }

    @C0359n0
    /* renamed from: w */
    public C33016f mo85168j(@C0359n0 String str, int i) throws IOException {
        mo95652H();
        this.f80107c.name(str);
        return add(i);
    }

    @C0359n0
    /* renamed from: x */
    public C33016f mo85167i(@C0359n0 String str, long j) throws IOException {
        mo95652H();
        this.f80107c.name(str);
        return mo85251N(j);
    }

    @C0359n0
    /* renamed from: y */
    public C33016f mo85171m(@C0359n0 String str, @C0363p0 Object obj) throws IOException {
        if (this.f80111g) {
            return mo95651G(str, obj);
        }
        return mo95650F(str, obj);
    }

    @C0359n0
    /* renamed from: z */
    public C33016f mo85165g(@C0359n0 String str, boolean z) throws IOException {
        mo95652H();
        this.f80107c.name(str);
        return mo85253P(z);
    }

    public C33016f(C33016f fVar) {
        this.f80107c = fVar.f80107c;
        this.f80108d = fVar.f80108d;
        this.f80109e = fVar.f80109e;
        this.f80110f = fVar.f80110f;
        this.f80111g = fVar.f80111g;
    }
}
