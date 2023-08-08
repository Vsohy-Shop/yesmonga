package androidx.work;

import android.annotation.SuppressLint;
import androidx.annotation.C0344h1;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.annotation.RestrictTo;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/* renamed from: androidx.work.d */
public final class C21091d {

    /* renamed from: b */
    public static final String f54439b = C21377l.m98584i("Data");

    /* renamed from: c */
    public static final C21091d f54440c = new C21092a().mo63172a();
    @SuppressLint({"MinMaxConstant"})

    /* renamed from: d */
    public static final int f54441d = 10240;

    /* renamed from: a */
    public Map<String, Object> f54442a;

    /* renamed from: androidx.work.d$a */
    public static final class C21092a {

        /* renamed from: a */
        public Map<String, Object> f54443a = new HashMap();

        @C0359n0
        /* renamed from: a */
        public C21091d mo63172a() {
            C21091d dVar = new C21091d((Map<String, ?>) this.f54443a);
            C21091d.m97574F(dVar);
            return dVar;
        }

        @C0359n0
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        /* renamed from: b */
        public C21092a mo63173b(@C0359n0 String str, @C0363p0 Object obj) {
            if (obj == null) {
                this.f54443a.put(str, (Object) null);
            } else {
                Class<?> cls = obj.getClass();
                if (cls == Boolean.class || cls == Byte.class || cls == Integer.class || cls == Long.class || cls == Float.class || cls == Double.class || cls == String.class || cls == Boolean[].class || cls == Byte[].class || cls == Integer[].class || cls == Long[].class || cls == Float[].class || cls == Double[].class || cls == String[].class) {
                    this.f54443a.put(str, obj);
                } else if (cls == boolean[].class) {
                    this.f54443a.put(str, C21091d.m97575a((boolean[]) obj));
                } else if (cls == byte[].class) {
                    this.f54443a.put(str, C21091d.m97576b((byte[]) obj));
                } else if (cls == int[].class) {
                    this.f54443a.put(str, C21091d.m97579e((int[]) obj));
                } else if (cls == long[].class) {
                    this.f54443a.put(str, C21091d.m97580f((long[]) obj));
                } else if (cls == float[].class) {
                    this.f54443a.put(str, C21091d.m97578d((float[]) obj));
                } else if (cls == double[].class) {
                    this.f54443a.put(str, C21091d.m97577c((double[]) obj));
                } else {
                    throw new IllegalArgumentException("Key " + str + "has invalid type " + cls);
                }
            }
            return this;
        }

        @C0359n0
        /* renamed from: c */
        public C21092a mo63174c(@C0359n0 C21091d dVar) {
            mo63175d(dVar.f54442a);
            return this;
        }

        @C0359n0
        /* renamed from: d */
        public C21092a mo63175d(@C0359n0 Map<String, Object> map) {
            for (Map.Entry next : map.entrySet()) {
                mo63173b((String) next.getKey(), next.getValue());
            }
            return this;
        }

        @C0359n0
        /* renamed from: e */
        public C21092a mo63176e(@C0359n0 String str, boolean z) {
            this.f54443a.put(str, Boolean.valueOf(z));
            return this;
        }

        @C0359n0
        /* renamed from: f */
        public C21092a mo63177f(@C0359n0 String str, @C0359n0 boolean[] zArr) {
            this.f54443a.put(str, C21091d.m97575a(zArr));
            return this;
        }

        @C0359n0
        /* renamed from: g */
        public C21092a mo63178g(@C0359n0 String str, byte b) {
            this.f54443a.put(str, Byte.valueOf(b));
            return this;
        }

        @C0359n0
        /* renamed from: h */
        public C21092a mo63179h(@C0359n0 String str, @C0359n0 byte[] bArr) {
            this.f54443a.put(str, C21091d.m97576b(bArr));
            return this;
        }

        @C0359n0
        /* renamed from: i */
        public C21092a mo63180i(@C0359n0 String str, double d) {
            this.f54443a.put(str, Double.valueOf(d));
            return this;
        }

        @C0359n0
        /* renamed from: j */
        public C21092a mo63181j(@C0359n0 String str, @C0359n0 double[] dArr) {
            this.f54443a.put(str, C21091d.m97577c(dArr));
            return this;
        }

        @C0359n0
        /* renamed from: k */
        public C21092a mo63182k(@C0359n0 String str, float f) {
            this.f54443a.put(str, Float.valueOf(f));
            return this;
        }

        @C0359n0
        /* renamed from: l */
        public C21092a mo63183l(@C0359n0 String str, @C0359n0 float[] fArr) {
            this.f54443a.put(str, C21091d.m97578d(fArr));
            return this;
        }

        @C0359n0
        /* renamed from: m */
        public C21092a mo63184m(@C0359n0 String str, int i) {
            this.f54443a.put(str, Integer.valueOf(i));
            return this;
        }

        @C0359n0
        /* renamed from: n */
        public C21092a mo63185n(@C0359n0 String str, @C0359n0 int[] iArr) {
            this.f54443a.put(str, C21091d.m97579e(iArr));
            return this;
        }

        @C0359n0
        /* renamed from: o */
        public C21092a mo63186o(@C0359n0 String str, long j) {
            this.f54443a.put(str, Long.valueOf(j));
            return this;
        }

        @C0359n0
        /* renamed from: p */
        public C21092a mo63187p(@C0359n0 String str, @C0359n0 long[] jArr) {
            this.f54443a.put(str, C21091d.m97580f(jArr));
            return this;
        }

        @C0359n0
        /* renamed from: q */
        public C21092a mo63188q(@C0359n0 String str, @C0363p0 String str2) {
            this.f54443a.put(str, str2);
            return this;
        }

        @C0359n0
        /* renamed from: r */
        public C21092a mo63189r(@C0359n0 String str, @C0359n0 String[] strArr) {
            this.f54443a.put(str, strArr);
            return this;
        }
    }

    public C21091d() {
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(5:23|(2:34|35)|36|37|38) */
    /* JADX WARNING: Can't wrap try/catch for region: R(6:24|25|(0)|29|30|31) */
    /* JADX WARNING: Code restructure failed: missing block: B:28:?, code lost:
        r1.close();
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:10:0x003c */
    /* JADX WARNING: Missing exception handler attribute for start block: B:24:0x005b */
    /* JADX WARNING: Missing exception handler attribute for start block: B:29:0x0064 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:36:0x006d */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0047  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x004c  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0061 A[SYNTHETIC, Splitter:B:27:0x0061] */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x006a A[SYNTHETIC, Splitter:B:34:0x006a] */
    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
    @androidx.room.C20315g2
    @androidx.annotation.C0359n0
    /* renamed from: F */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static byte[] m97574F(@androidx.annotation.C0359n0 androidx.work.C21091d r4) {
        /*
            java.io.ByteArrayOutputStream r0 = new java.io.ByteArrayOutputStream
            r0.<init>()
            r1 = 0
            java.io.ObjectOutputStream r2 = new java.io.ObjectOutputStream     // Catch:{ IOException -> 0x005b }
            r2.<init>(r0)     // Catch:{ IOException -> 0x005b }
            int r1 = r4.mo63154D()     // Catch:{ IOException -> 0x0057, all -> 0x0054 }
            r2.writeInt(r1)     // Catch:{ IOException -> 0x0057, all -> 0x0054 }
            java.util.Map<java.lang.String, java.lang.Object> r4 = r4.f54442a     // Catch:{ IOException -> 0x0057, all -> 0x0054 }
            java.util.Set r4 = r4.entrySet()     // Catch:{ IOException -> 0x0057, all -> 0x0054 }
            java.util.Iterator r4 = r4.iterator()     // Catch:{ IOException -> 0x0057, all -> 0x0054 }
        L_0x001c:
            boolean r1 = r4.hasNext()     // Catch:{ IOException -> 0x0057, all -> 0x0054 }
            if (r1 == 0) goto L_0x0039
            java.lang.Object r1 = r4.next()     // Catch:{ IOException -> 0x0057, all -> 0x0054 }
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1     // Catch:{ IOException -> 0x0057, all -> 0x0054 }
            java.lang.Object r3 = r1.getKey()     // Catch:{ IOException -> 0x0057, all -> 0x0054 }
            java.lang.String r3 = (java.lang.String) r3     // Catch:{ IOException -> 0x0057, all -> 0x0054 }
            r2.writeUTF(r3)     // Catch:{ IOException -> 0x0057, all -> 0x0054 }
            java.lang.Object r1 = r1.getValue()     // Catch:{ IOException -> 0x0057, all -> 0x0054 }
            r2.writeObject(r1)     // Catch:{ IOException -> 0x0057, all -> 0x0054 }
            goto L_0x001c
        L_0x0039:
            r2.close()     // Catch:{ IOException -> 0x003c }
        L_0x003c:
            r0.close()     // Catch:{ IOException -> 0x003f }
        L_0x003f:
            int r4 = r0.size()
            r1 = 10240(0x2800, float:1.4349E-41)
            if (r4 > r1) goto L_0x004c
            byte[] r4 = r0.toByteArray()
            return r4
        L_0x004c:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r0 = "Data cannot occupy more than 10240 bytes when serialized"
            r4.<init>(r0)
            throw r4
        L_0x0054:
            r4 = move-exception
            r1 = r2
            goto L_0x0068
        L_0x0057:
            r1 = r2
            goto L_0x005b
        L_0x0059:
            r4 = move-exception
            goto L_0x0068
        L_0x005b:
            byte[] r4 = r0.toByteArray()     // Catch:{ all -> 0x0059 }
            if (r1 == 0) goto L_0x0064
            r1.close()     // Catch:{ IOException -> 0x0064 }
        L_0x0064:
            r0.close()     // Catch:{ IOException -> 0x0067 }
        L_0x0067:
            return r4
        L_0x0068:
            if (r1 == 0) goto L_0x006d
            r1.close()     // Catch:{ IOException -> 0x006d }
        L_0x006d:
            r0.close()     // Catch:{ IOException -> 0x0070 }
        L_0x0070:
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.work.C21091d.m97574F(androidx.work.d):byte[]");
    }

    @C0359n0
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* renamed from: a */
    public static Boolean[] m97575a(@C0359n0 boolean[] zArr) {
        Boolean[] boolArr = new Boolean[zArr.length];
        for (int i = 0; i < zArr.length; i++) {
            boolArr[i] = Boolean.valueOf(zArr[i]);
        }
        return boolArr;
    }

    @C0359n0
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* renamed from: b */
    public static Byte[] m97576b(@C0359n0 byte[] bArr) {
        Byte[] bArr2 = new Byte[bArr.length];
        for (int i = 0; i < bArr.length; i++) {
            bArr2[i] = Byte.valueOf(bArr[i]);
        }
        return bArr2;
    }

    @C0359n0
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* renamed from: c */
    public static Double[] m97577c(@C0359n0 double[] dArr) {
        Double[] dArr2 = new Double[dArr.length];
        for (int i = 0; i < dArr.length; i++) {
            dArr2[i] = Double.valueOf(dArr[i]);
        }
        return dArr2;
    }

    @C0359n0
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* renamed from: d */
    public static Float[] m97578d(@C0359n0 float[] fArr) {
        Float[] fArr2 = new Float[fArr.length];
        for (int i = 0; i < fArr.length; i++) {
            fArr2[i] = Float.valueOf(fArr[i]);
        }
        return fArr2;
    }

    @C0359n0
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* renamed from: e */
    public static Integer[] m97579e(@C0359n0 int[] iArr) {
        Integer[] numArr = new Integer[iArr.length];
        for (int i = 0; i < iArr.length; i++) {
            numArr[i] = Integer.valueOf(iArr[i]);
        }
        return numArr;
    }

    @C0359n0
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* renamed from: f */
    public static Long[] m97580f(@C0359n0 long[] jArr) {
        Long[] lArr = new Long[jArr.length];
        for (int i = 0; i < jArr.length; i++) {
            lArr[i] = Long.valueOf(jArr[i]);
        }
        return lArr;
    }

    @C0359n0
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* renamed from: g */
    public static byte[] m97581g(@C0359n0 Byte[] bArr) {
        byte[] bArr2 = new byte[bArr.length];
        for (int i = 0; i < bArr.length; i++) {
            bArr2[i] = bArr[i].byteValue();
        }
        return bArr2;
    }

    @C0359n0
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* renamed from: h */
    public static double[] m97582h(@C0359n0 Double[] dArr) {
        double[] dArr2 = new double[dArr.length];
        for (int i = 0; i < dArr.length; i++) {
            dArr2[i] = dArr[i].doubleValue();
        }
        return dArr2;
    }

    @C0359n0
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* renamed from: i */
    public static float[] m97583i(@C0359n0 Float[] fArr) {
        float[] fArr2 = new float[fArr.length];
        for (int i = 0; i < fArr.length; i++) {
            fArr2[i] = fArr[i].floatValue();
        }
        return fArr2;
    }

    @C0359n0
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* renamed from: j */
    public static int[] m97584j(@C0359n0 Integer[] numArr) {
        int[] iArr = new int[numArr.length];
        for (int i = 0; i < numArr.length; i++) {
            iArr[i] = numArr[i].intValue();
        }
        return iArr;
    }

    @C0359n0
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* renamed from: k */
    public static long[] m97585k(@C0359n0 Long[] lArr) {
        long[] jArr = new long[lArr.length];
        for (int i = 0; i < lArr.length; i++) {
            jArr[i] = lArr[i].longValue();
        }
        return jArr;
    }

    @C0359n0
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* renamed from: l */
    public static boolean[] m97586l(@C0359n0 Boolean[] boolArr) {
        boolean[] zArr = new boolean[boolArr.length];
        for (int i = 0; i < boolArr.length; i++) {
            zArr[i] = boolArr[i].booleanValue();
        }
        return zArr;
    }

    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:12:0x002c */
    /* JADX WARNING: Missing exception handler attribute for start block: B:22:0x003c */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0039 A[SYNTHETIC, Splitter:B:20:0x0039] */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0042 A[SYNTHETIC, Splitter:B:28:0x0042] */
    @androidx.room.C20315g2
    @androidx.annotation.C0359n0
    /* renamed from: m */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static androidx.work.C21091d m97587m(@androidx.annotation.C0359n0 byte[] r5) {
        /*
            int r0 = r5.length
            r1 = 10240(0x2800, float:1.4349E-41)
            if (r0 > r1) goto L_0x004c
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            java.io.ByteArrayInputStream r1 = new java.io.ByteArrayInputStream
            r1.<init>(r5)
            r5 = 0
            java.io.ObjectInputStream r2 = new java.io.ObjectInputStream     // Catch:{ IOException | ClassNotFoundException -> 0x0040, all -> 0x0034 }
            r2.<init>(r1)     // Catch:{ IOException | ClassNotFoundException -> 0x0040, all -> 0x0034 }
            int r5 = r2.readInt()     // Catch:{ IOException | ClassNotFoundException -> 0x0032, all -> 0x0030 }
        L_0x0019:
            if (r5 <= 0) goto L_0x0029
            java.lang.String r3 = r2.readUTF()     // Catch:{ IOException | ClassNotFoundException -> 0x0032, all -> 0x0030 }
            java.lang.Object r4 = r2.readObject()     // Catch:{ IOException | ClassNotFoundException -> 0x0032, all -> 0x0030 }
            r0.put(r3, r4)     // Catch:{ IOException | ClassNotFoundException -> 0x0032, all -> 0x0030 }
            int r5 = r5 + -1
            goto L_0x0019
        L_0x0029:
            r2.close()     // Catch:{ IOException -> 0x002c }
        L_0x002c:
            r1.close()     // Catch:{ IOException -> 0x0046 }
            goto L_0x0046
        L_0x0030:
            r5 = move-exception
            goto L_0x0037
        L_0x0032:
            r5 = r2
            goto L_0x0040
        L_0x0034:
            r0 = move-exception
            r2 = r5
            r5 = r0
        L_0x0037:
            if (r2 == 0) goto L_0x003c
            r2.close()     // Catch:{ IOException -> 0x003c }
        L_0x003c:
            r1.close()     // Catch:{ IOException -> 0x003f }
        L_0x003f:
            throw r5
        L_0x0040:
            if (r5 == 0) goto L_0x002c
            r5.close()     // Catch:{ IOException -> 0x002c }
            goto L_0x002c
        L_0x0046:
            androidx.work.d r5 = new androidx.work.d
            r5.<init>((java.util.Map<java.lang.String, ?>) r0)
            return r5
        L_0x004c:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "Data cannot occupy more than 10240 bytes when serialized"
            r5.<init>(r0)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.work.C21091d.m97587m(byte[]):androidx.work.d");
    }

    @C0363p0
    /* renamed from: A */
    public String mo63151A(@C0359n0 String str) {
        Object obj = this.f54442a.get(str);
        if (obj instanceof String) {
            return (String) obj;
        }
        return null;
    }

    @C0363p0
    /* renamed from: B */
    public String[] mo63152B(@C0359n0 String str) {
        Object obj = this.f54442a.get(str);
        if (obj instanceof String[]) {
            return (String[]) obj;
        }
        return null;
    }

    /* renamed from: C */
    public <T> boolean mo63153C(@C0359n0 String str, @C0359n0 Class<T> cls) {
        Object obj = this.f54442a.get(str);
        if (obj == null || !cls.isAssignableFrom(obj.getClass())) {
            return false;
        }
        return true;
    }

    @C0344h1
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* renamed from: D */
    public int mo63154D() {
        return this.f54442a.size();
    }

    @C0359n0
    /* renamed from: E */
    public byte[] mo63155E() {
        return m97574F(this);
    }

    public boolean equals(Object obj) {
        boolean z;
        if (this == obj) {
            return true;
        }
        if (obj == null || C21091d.class != obj.getClass()) {
            return false;
        }
        C21091d dVar = (C21091d) obj;
        Set<String> keySet = this.f54442a.keySet();
        if (!keySet.equals(dVar.f54442a.keySet())) {
            return false;
        }
        for (String next : keySet) {
            Object obj2 = this.f54442a.get(next);
            Object obj3 = dVar.f54442a.get(next);
            if (obj2 == null || obj3 == null) {
                if (obj2 == obj3) {
                    z = true;
                    continue;
                } else {
                    z = false;
                    continue;
                }
            } else if (!(obj2 instanceof Object[]) || !(obj3 instanceof Object[])) {
                z = obj2.equals(obj3);
                continue;
            } else {
                z = Arrays.deepEquals((Object[]) obj2, (Object[]) obj3);
                continue;
            }
            if (!z) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return this.f54442a.hashCode() * 31;
    }

    /* renamed from: n */
    public boolean mo63158n(@C0359n0 String str, boolean z) {
        Object obj = this.f54442a.get(str);
        if (obj instanceof Boolean) {
            return ((Boolean) obj).booleanValue();
        }
        return z;
    }

    @C0363p0
    /* renamed from: o */
    public boolean[] mo63159o(@C0359n0 String str) {
        Object obj = this.f54442a.get(str);
        if (obj instanceof Boolean[]) {
            return m97586l((Boolean[]) obj);
        }
        return null;
    }

    /* renamed from: p */
    public byte mo63160p(@C0359n0 String str, byte b) {
        Object obj = this.f54442a.get(str);
        if (obj instanceof Byte) {
            return ((Byte) obj).byteValue();
        }
        return b;
    }

    @C0363p0
    /* renamed from: q */
    public byte[] mo63161q(@C0359n0 String str) {
        Object obj = this.f54442a.get(str);
        if (obj instanceof Byte[]) {
            return m97581g((Byte[]) obj);
        }
        return null;
    }

    /* renamed from: r */
    public double mo63162r(@C0359n0 String str, double d) {
        Object obj = this.f54442a.get(str);
        if (obj instanceof Double) {
            return ((Double) obj).doubleValue();
        }
        return d;
    }

    @C0363p0
    /* renamed from: s */
    public double[] mo63163s(@C0359n0 String str) {
        Object obj = this.f54442a.get(str);
        if (obj instanceof Double[]) {
            return m97582h((Double[]) obj);
        }
        return null;
    }

    /* renamed from: t */
    public float mo63164t(@C0359n0 String str, float f) {
        Object obj = this.f54442a.get(str);
        if (obj instanceof Float) {
            return ((Float) obj).floatValue();
        }
        return f;
    }

    @C0359n0
    public String toString() {
        StringBuilder sb = new StringBuilder("Data {");
        if (!this.f54442a.isEmpty()) {
            for (String next : this.f54442a.keySet()) {
                sb.append(next);
                sb.append(" : ");
                Object obj = this.f54442a.get(next);
                if (obj instanceof Object[]) {
                    sb.append(Arrays.toString((Object[]) obj));
                } else {
                    sb.append(obj);
                }
                sb.append(", ");
            }
        }
        sb.append("}");
        return sb.toString();
    }

    @C0363p0
    /* renamed from: u */
    public float[] mo63166u(@C0359n0 String str) {
        Object obj = this.f54442a.get(str);
        if (obj instanceof Float[]) {
            return m97583i((Float[]) obj);
        }
        return null;
    }

    /* renamed from: v */
    public int mo63167v(@C0359n0 String str, int i) {
        Object obj = this.f54442a.get(str);
        if (obj instanceof Integer) {
            return ((Integer) obj).intValue();
        }
        return i;
    }

    @C0363p0
    /* renamed from: w */
    public int[] mo63168w(@C0359n0 String str) {
        Object obj = this.f54442a.get(str);
        if (obj instanceof Integer[]) {
            return m97584j((Integer[]) obj);
        }
        return null;
    }

    @C0359n0
    /* renamed from: x */
    public Map<String, Object> mo63169x() {
        return Collections.unmodifiableMap(this.f54442a);
    }

    /* renamed from: y */
    public long mo63170y(@C0359n0 String str, long j) {
        Object obj = this.f54442a.get(str);
        if (obj instanceof Long) {
            return ((Long) obj).longValue();
        }
        return j;
    }

    @C0363p0
    /* renamed from: z */
    public long[] mo63171z(@C0359n0 String str) {
        Object obj = this.f54442a.get(str);
        if (obj instanceof Long[]) {
            return m97585k((Long[]) obj);
        }
        return null;
    }

    public C21091d(@C0359n0 C21091d dVar) {
        this.f54442a = new HashMap(dVar.f54442a);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public C21091d(@C0359n0 Map<String, ?> map) {
        this.f54442a = new HashMap(map);
    }
}
