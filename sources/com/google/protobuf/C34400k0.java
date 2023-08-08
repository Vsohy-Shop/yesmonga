package com.google.protobuf;

import com.google.protobuf.C34471v0;
import java.lang.reflect.Field;

/* renamed from: com.google.protobuf.k0 */
public final class C34400k0 implements Comparable<C34400k0> {

    /* renamed from: X */
    public final C34471v0.C34476e f83329X;

    /* renamed from: a */
    public final Field f83330a;

    /* renamed from: b */
    public final FieldType f83331b;

    /* renamed from: c */
    public final Class<?> f83332c;

    /* renamed from: d */
    public final int f83333d;

    /* renamed from: e */
    public final Field f83334e;

    /* renamed from: f */
    public final int f83335f;

    /* renamed from: g */
    public final boolean f83336g;

    /* renamed from: v */
    public final boolean f83337v;

    /* renamed from: w */
    public final C34493w1 f83338w;

    /* renamed from: x */
    public final Field f83339x;

    /* renamed from: y */
    public final Class<?> f83340y;

    /* renamed from: z */
    public final Object f83341z;

    /* renamed from: com.google.protobuf.k0$a */
    public static /* synthetic */ class C34401a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f83342a;

        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|(3:7|8|10)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        static {
            /*
                com.google.protobuf.FieldType[] r0 = com.google.protobuf.FieldType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f83342a = r0
                com.google.protobuf.FieldType r1 = com.google.protobuf.FieldType.MESSAGE     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f83342a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.google.protobuf.FieldType r1 = com.google.protobuf.FieldType.GROUP     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f83342a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.google.protobuf.FieldType r1 = com.google.protobuf.FieldType.MESSAGE_LIST     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f83342a     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.google.protobuf.FieldType r1 = com.google.protobuf.FieldType.GROUP_LIST     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.C34400k0.C34401a.<clinit>():void");
        }
    }

    /* renamed from: com.google.protobuf.k0$b */
    public static final class C34402b {

        /* renamed from: a */
        public Field f83343a;

        /* renamed from: b */
        public FieldType f83344b;

        /* renamed from: c */
        public int f83345c;

        /* renamed from: d */
        public Field f83346d;

        /* renamed from: e */
        public int f83347e;

        /* renamed from: f */
        public boolean f83348f;

        /* renamed from: g */
        public boolean f83349g;

        /* renamed from: h */
        public C34493w1 f83350h;

        /* renamed from: i */
        public Class<?> f83351i;

        /* renamed from: j */
        public Object f83352j;

        /* renamed from: k */
        public C34471v0.C34476e f83353k;

        /* renamed from: l */
        public Field f83354l;

        public /* synthetic */ C34402b(C34401a aVar) {
            this();
        }

        /* renamed from: a */
        public C34400k0 mo101229a() {
            C34493w1 w1Var = this.f83350h;
            if (w1Var != null) {
                return C34400k0.m139548y(this.f83345c, this.f83344b, w1Var, this.f83351i, this.f83349g, this.f83353k);
            }
            Object obj = this.f83352j;
            if (obj != null) {
                return C34400k0.m139547w(this.f83343a, this.f83345c, obj, this.f83353k);
            }
            Field field = this.f83346d;
            if (field == null) {
                C34471v0.C34476e eVar = this.f83353k;
                if (eVar != null) {
                    Field field2 = this.f83354l;
                    if (field2 == null) {
                        return C34400k0.m139546r(this.f83343a, this.f83345c, this.f83344b, eVar);
                    }
                    return C34400k0.m139540M(this.f83343a, this.f83345c, this.f83344b, eVar, field2);
                }
                Field field3 = this.f83354l;
                if (field3 == null) {
                    return C34400k0.m139545q(this.f83343a, this.f83345c, this.f83344b, this.f83349g);
                }
                return C34400k0.m139549z(this.f83343a, this.f83345c, this.f83344b, field3);
            } else if (this.f83348f) {
                return C34400k0.m139542W(this.f83343a, this.f83345c, this.f83344b, field, this.f83347e, this.f83349g, this.f83353k);
            } else {
                return C34400k0.m139541Q(this.f83343a, this.f83345c, this.f83344b, field, this.f83347e, this.f83349g, this.f83353k);
            }
        }

        /* renamed from: b */
        public C34402b mo101230b(Field field) {
            this.f83354l = field;
            return this;
        }

        /* renamed from: c */
        public C34402b mo101231c(boolean z) {
            this.f83349g = z;
            return this;
        }

        /* renamed from: d */
        public C34402b mo101232d(C34471v0.C34476e eVar) {
            this.f83353k = eVar;
            return this;
        }

        /* renamed from: e */
        public C34402b mo101233e(Field field) {
            if (this.f83350h == null) {
                this.f83343a = field;
                return this;
            }
            throw new IllegalStateException("Cannot set field when building a oneof.");
        }

        /* renamed from: f */
        public C34402b mo101234f(int i) {
            this.f83345c = i;
            return this;
        }

        /* renamed from: g */
        public C34402b mo101235g(Object obj) {
            this.f83352j = obj;
            return this;
        }

        /* renamed from: h */
        public C34402b mo101236h(C34493w1 w1Var, Class<?> cls) {
            if (this.f83343a == null && this.f83346d == null) {
                this.f83350h = w1Var;
                this.f83351i = cls;
                return this;
            }
            throw new IllegalStateException("Cannot set oneof when field or presenceField have been provided");
        }

        /* renamed from: i */
        public C34402b mo101237i(Field field, int i) {
            this.f83346d = (Field) C34471v0.m140574e(field, "presenceField");
            this.f83347e = i;
            return this;
        }

        /* renamed from: j */
        public C34402b mo101238j(boolean z) {
            this.f83348f = z;
            return this;
        }

        /* renamed from: k */
        public C34402b mo101239k(FieldType fieldType) {
            this.f83344b = fieldType;
            return this;
        }

        public C34402b() {
        }
    }

    public C34400k0(Field field, int i, FieldType fieldType, Class<?> cls, Field field2, int i2, boolean z, boolean z2, C34493w1 w1Var, Class<?> cls2, Object obj, C34471v0.C34476e eVar, Field field3) {
        this.f83330a = field;
        this.f83331b = fieldType;
        this.f83332c = cls;
        this.f83333d = i;
        this.f83334e = field2;
        this.f83335f = i2;
        this.f83336g = z;
        this.f83337v = z2;
        this.f83338w = w1Var;
        this.f83340y = cls2;
        this.f83341z = obj;
        this.f83329X = eVar;
        this.f83339x = field3;
    }

    /* renamed from: C0 */
    public static boolean m139538C0(int i) {
        return i != 0 && (i & (i + -1)) == 0;
    }

    /* renamed from: H0 */
    public static C34402b m139539H0() {
        return new C34402b((C34401a) null);
    }

    /* renamed from: M */
    public static C34400k0 m139540M(Field field, int i, FieldType fieldType, C34471v0.C34476e eVar, Field field2) {
        m139544b(i);
        C34471v0.m140574e(field, "field");
        return new C34400k0(field, i, fieldType, (Class<?>) null, (Field) null, 0, false, false, (C34493w1) null, (Class<?>) null, (Object) null, eVar, field2);
    }

    /* renamed from: Q */
    public static C34400k0 m139541Q(Field field, int i, FieldType fieldType, Field field2, int i2, boolean z, C34471v0.C34476e eVar) {
        Field field3 = field2;
        m139544b(i);
        Field field4 = field;
        C34471v0.m140574e(field, "field");
        C34471v0.m140574e(fieldType, "fieldType");
        C34471v0.m140574e(field3, "presenceField");
        if (field3 == null || m139538C0(i2)) {
            int i3 = i2;
            return new C34400k0(field, i, fieldType, (Class<?>) null, field2, i2, false, z, (C34493w1) null, (Class<?>) null, (Object) null, eVar, (Field) null);
        }
        throw new IllegalArgumentException("presenceMask must have exactly one bit set: " + i2);
    }

    /* renamed from: W */
    public static C34400k0 m139542W(Field field, int i, FieldType fieldType, Field field2, int i2, boolean z, C34471v0.C34476e eVar) {
        Field field3 = field2;
        m139544b(i);
        Field field4 = field;
        C34471v0.m140574e(field, "field");
        C34471v0.m140574e(fieldType, "fieldType");
        C34471v0.m140574e(field3, "presenceField");
        if (field3 == null || m139538C0(i2)) {
            int i3 = i2;
            return new C34400k0(field, i, fieldType, (Class<?>) null, field2, i2, true, z, (C34493w1) null, (Class<?>) null, (Object) null, eVar, (Field) null);
        }
        throw new IllegalArgumentException("presenceMask must have exactly one bit set: " + i2);
    }

    /* renamed from: X */
    public static C34400k0 m139543X(Field field, int i, FieldType fieldType, Class<?> cls) {
        m139544b(i);
        C34471v0.m140574e(field, "field");
        FieldType fieldType2 = fieldType;
        C34471v0.m140574e(fieldType2, "fieldType");
        Class<?> cls2 = cls;
        C34471v0.m140574e(cls2, "messageClass");
        return new C34400k0(field, i, fieldType2, cls2, (Field) null, 0, false, false, (C34493w1) null, (Class<?>) null, (Object) null, (C34471v0.C34476e) null, (Field) null);
    }

    /* renamed from: b */
    public static void m139544b(int i) {
        if (i <= 0) {
            throw new IllegalArgumentException("fieldNumber must be positive: " + i);
        }
    }

    /* renamed from: q */
    public static C34400k0 m139545q(Field field, int i, FieldType fieldType, boolean z) {
        FieldType fieldType2 = fieldType;
        m139544b(i);
        Field field2 = field;
        C34471v0.m140574e(field, "field");
        C34471v0.m140574e(fieldType2, "fieldType");
        if (fieldType2 != FieldType.MESSAGE_LIST && fieldType2 != FieldType.GROUP_LIST) {
            return new C34400k0(field, i, fieldType, (Class<?>) null, (Field) null, 0, false, z, (C34493w1) null, (Class<?>) null, (Object) null, (C34471v0.C34476e) null, (Field) null);
        }
        throw new IllegalStateException("Shouldn't be called for repeated message fields.");
    }

    /* renamed from: r */
    public static C34400k0 m139546r(Field field, int i, FieldType fieldType, C34471v0.C34476e eVar) {
        m139544b(i);
        C34471v0.m140574e(field, "field");
        return new C34400k0(field, i, fieldType, (Class<?>) null, (Field) null, 0, false, false, (C34493w1) null, (Class<?>) null, (Object) null, eVar, (Field) null);
    }

    /* renamed from: w */
    public static C34400k0 m139547w(Field field, int i, Object obj, C34471v0.C34476e eVar) {
        Object obj2 = obj;
        C34471v0.m140574e(obj2, "mapDefaultEntry");
        m139544b(i);
        C34471v0.m140574e(field, "field");
        return new C34400k0(field, i, FieldType.MAP, (Class<?>) null, (Field) null, 0, false, true, (C34493w1) null, (Class<?>) null, obj2, eVar, (Field) null);
    }

    /* renamed from: y */
    public static C34400k0 m139548y(int i, FieldType fieldType, C34493w1 w1Var, Class<?> cls, boolean z, C34471v0.C34476e eVar) {
        FieldType fieldType2 = fieldType;
        m139544b(i);
        C34471v0.m140574e(fieldType2, "fieldType");
        C34471v0.m140574e(w1Var, "oneof");
        C34471v0.m140574e(cls, "oneofStoredType");
        if (fieldType.mo100402Q()) {
            return new C34400k0((Field) null, i, fieldType, (Class<?>) null, (Field) null, 0, false, z, w1Var, cls, (Object) null, eVar, (Field) null);
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Oneof is only supported for scalar fields. Field ");
        int i2 = i;
        sb.append(i);
        sb.append(" is of type ");
        sb.append(fieldType2);
        throw new IllegalArgumentException(sb.toString());
    }

    /* renamed from: z */
    public static C34400k0 m139549z(Field field, int i, FieldType fieldType, Field field2) {
        FieldType fieldType2 = fieldType;
        m139544b(i);
        Field field3 = field;
        C34471v0.m140574e(field, "field");
        C34471v0.m140574e(fieldType2, "fieldType");
        if (fieldType2 != FieldType.MESSAGE_LIST && fieldType2 != FieldType.GROUP_LIST) {
            return new C34400k0(field, i, fieldType, (Class<?>) null, (Field) null, 0, false, false, (C34493w1) null, (Class<?>) null, (Object) null, (C34471v0.C34476e) null, field2);
        }
        throw new IllegalStateException("Shouldn't be called for repeated message fields.");
    }

    /* renamed from: A0 */
    public boolean mo101213A0() {
        return this.f83337v;
    }

    /* renamed from: F0 */
    public boolean mo101214F0() {
        return this.f83336g;
    }

    /* renamed from: Z */
    public Field mo101215Z() {
        return this.f83339x;
    }

    /* renamed from: e0 */
    public C34471v0.C34476e mo101217e0() {
        return this.f83329X;
    }

    /* renamed from: f0 */
    public Field mo101218f0() {
        return this.f83330a;
    }

    /* renamed from: g */
    public int compareTo(C34400k0 k0Var) {
        return this.f83333d - k0Var.f83333d;
    }

    /* renamed from: h0 */
    public int mo101220h0() {
        return this.f83333d;
    }

    /* renamed from: i0 */
    public Class<?> mo101221i0() {
        return this.f83332c;
    }

    /* renamed from: j0 */
    public Object mo101222j0() {
        return this.f83341z;
    }

    /* renamed from: m0 */
    public Class<?> mo101223m0() {
        int i = C34401a.f83342a[this.f83331b.ordinal()];
        if (i == 1 || i == 2) {
            Field field = this.f83330a;
            if (field != null) {
                return field.getType();
            }
            return this.f83340y;
        } else if (i == 3 || i == 4) {
            return this.f83332c;
        } else {
            return null;
        }
    }

    /* renamed from: n0 */
    public C34493w1 mo101224n0() {
        return this.f83338w;
    }

    /* renamed from: o0 */
    public Class<?> mo101225o0() {
        return this.f83340y;
    }

    /* renamed from: p0 */
    public Field mo101226p0() {
        return this.f83334e;
    }

    /* renamed from: t0 */
    public int mo101227t0() {
        return this.f83335f;
    }

    /* renamed from: u0 */
    public FieldType mo101228u0() {
        return this.f83331b;
    }
}
