package com.google.protobuf;

import com.google.protobuf.C34412l1;
import com.google.protobuf.C34425o0.C34428c;
import com.google.protobuf.C34471v0;
import com.google.protobuf.C34496x0;
import com.google.protobuf.WireFormat;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: com.google.protobuf.o0 */
public final class C34425o0<T extends C34428c<T>> {

    /* renamed from: d */
    public static final int f83392d = 16;

    /* renamed from: e */
    public static final C34425o0 f83393e = new C34425o0(true);

    /* renamed from: a */
    public final C34387j2<T, Object> f83394a;

    /* renamed from: b */
    public boolean f83395b;

    /* renamed from: c */
    public boolean f83396c;

    /* renamed from: com.google.protobuf.o0$a */
    public static /* synthetic */ class C34426a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f83397a;

        /* renamed from: b */
        public static final /* synthetic */ int[] f83398b;

        /* JADX WARNING: Can't wrap try/catch for region: R(55:0|(2:1|2)|3|(2:5|6)|7|(2:9|10)|11|(2:13|14)|15|(2:17|18)|19|21|22|23|(2:25|26)|27|(2:29|30)|31|33|34|35|36|37|38|39|40|41|42|43|44|45|46|47|48|49|50|(2:51|52)|53|55|56|57|58|59|60|61|62|63|64|65|66|67|68|69|70|(3:71|72|74)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(56:0|(2:1|2)|3|(2:5|6)|7|(2:9|10)|11|(2:13|14)|15|17|18|19|21|22|23|(2:25|26)|27|(2:29|30)|31|33|34|35|36|37|38|39|40|41|42|43|44|45|46|47|48|49|50|(2:51|52)|53|55|56|57|58|59|60|61|62|63|64|65|66|67|68|69|70|(3:71|72|74)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(58:0|(2:1|2)|3|(2:5|6)|7|(2:9|10)|11|(2:13|14)|15|17|18|19|21|22|23|(2:25|26)|27|(2:29|30)|31|33|34|35|36|37|38|39|40|41|42|43|44|45|46|47|48|49|50|(2:51|52)|53|55|56|57|58|59|60|61|62|63|64|65|66|67|68|69|70|71|72|74) */
        /* JADX WARNING: Can't wrap try/catch for region: R(59:0|(2:1|2)|3|(2:5|6)|7|(2:9|10)|11|13|14|15|17|18|19|21|22|23|(2:25|26)|27|(2:29|30)|31|33|34|35|36|37|38|39|40|41|42|43|44|45|46|47|48|49|50|(2:51|52)|53|55|56|57|58|59|60|61|62|63|64|65|66|67|68|69|70|71|72|74) */
        /* JADX WARNING: Can't wrap try/catch for region: R(60:0|(2:1|2)|3|(2:5|6)|7|9|10|11|13|14|15|17|18|19|21|22|23|(2:25|26)|27|(2:29|30)|31|33|34|35|36|37|38|39|40|41|42|43|44|45|46|47|48|49|50|(2:51|52)|53|55|56|57|58|59|60|61|62|63|64|65|66|67|68|69|70|71|72|74) */
        /* JADX WARNING: Can't wrap try/catch for region: R(62:0|(2:1|2)|3|5|6|7|9|10|11|13|14|15|17|18|19|21|22|23|(2:25|26)|27|29|30|31|33|34|35|36|37|38|39|40|41|42|43|44|45|46|47|48|49|50|(2:51|52)|53|55|56|57|58|59|60|61|62|63|64|65|66|67|68|69|70|71|72|74) */
        /* JADX WARNING: Can't wrap try/catch for region: R(65:0|1|2|3|5|6|7|9|10|11|13|14|15|17|18|19|21|22|23|25|26|27|29|30|31|33|34|35|36|37|38|39|40|41|42|43|44|45|46|47|48|49|50|51|52|53|55|56|57|58|59|60|61|62|63|64|65|66|67|68|69|70|71|72|74) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:35:0x006c */
        /* JADX WARNING: Missing exception handler attribute for start block: B:37:0x0078 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:39:0x0084 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:41:0x0090 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:43:0x009c */
        /* JADX WARNING: Missing exception handler attribute for start block: B:45:0x00a8 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:47:0x00b4 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:49:0x00c0 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:51:0x00cc */
        /* JADX WARNING: Missing exception handler attribute for start block: B:57:0x00e9 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:59:0x00f3 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:61:0x00fd */
        /* JADX WARNING: Missing exception handler attribute for start block: B:63:0x0107 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:65:0x0111 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:67:0x011b */
        /* JADX WARNING: Missing exception handler attribute for start block: B:69:0x0125 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:71:0x012f */
        static {
            /*
                com.google.protobuf.WireFormat$FieldType[] r0 = com.google.protobuf.WireFormat.FieldType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f83398b = r0
                r1 = 1
                com.google.protobuf.WireFormat$FieldType r2 = com.google.protobuf.WireFormat.FieldType.DOUBLE     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r0[r2] = r1     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                r0 = 2
                int[] r2 = f83398b     // Catch:{ NoSuchFieldError -> 0x001d }
                com.google.protobuf.WireFormat$FieldType r3 = com.google.protobuf.WireFormat.FieldType.FLOAT     // Catch:{ NoSuchFieldError -> 0x001d }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2[r3] = r0     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                r2 = 3
                int[] r3 = f83398b     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.google.protobuf.WireFormat$FieldType r4 = com.google.protobuf.WireFormat.FieldType.INT64     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r3[r4] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                r3 = 4
                int[] r4 = f83398b     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.google.protobuf.WireFormat$FieldType r5 = com.google.protobuf.WireFormat.FieldType.UINT64     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r4[r5] = r3     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                r4 = 5
                int[] r5 = f83398b     // Catch:{ NoSuchFieldError -> 0x003e }
                com.google.protobuf.WireFormat$FieldType r6 = com.google.protobuf.WireFormat.FieldType.INT32     // Catch:{ NoSuchFieldError -> 0x003e }
                int r6 = r6.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r5[r6] = r4     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                r5 = 6
                int[] r6 = f83398b     // Catch:{ NoSuchFieldError -> 0x0049 }
                com.google.protobuf.WireFormat$FieldType r7 = com.google.protobuf.WireFormat.FieldType.FIXED64     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r7 = r7.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r6[r7] = r5     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                r6 = 7
                int[] r7 = f83398b     // Catch:{ NoSuchFieldError -> 0x0054 }
                com.google.protobuf.WireFormat$FieldType r8 = com.google.protobuf.WireFormat.FieldType.FIXED32     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r8 = r8.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r7[r8] = r6     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                r7 = 8
                int[] r8 = f83398b     // Catch:{ NoSuchFieldError -> 0x0060 }
                com.google.protobuf.WireFormat$FieldType r9 = com.google.protobuf.WireFormat.FieldType.BOOL     // Catch:{ NoSuchFieldError -> 0x0060 }
                int r9 = r9.ordinal()     // Catch:{ NoSuchFieldError -> 0x0060 }
                r8[r9] = r7     // Catch:{ NoSuchFieldError -> 0x0060 }
            L_0x0060:
                r8 = 9
                int[] r9 = f83398b     // Catch:{ NoSuchFieldError -> 0x006c }
                com.google.protobuf.WireFormat$FieldType r10 = com.google.protobuf.WireFormat.FieldType.GROUP     // Catch:{ NoSuchFieldError -> 0x006c }
                int r10 = r10.ordinal()     // Catch:{ NoSuchFieldError -> 0x006c }
                r9[r10] = r8     // Catch:{ NoSuchFieldError -> 0x006c }
            L_0x006c:
                int[] r9 = f83398b     // Catch:{ NoSuchFieldError -> 0x0078 }
                com.google.protobuf.WireFormat$FieldType r10 = com.google.protobuf.WireFormat.FieldType.MESSAGE     // Catch:{ NoSuchFieldError -> 0x0078 }
                int r10 = r10.ordinal()     // Catch:{ NoSuchFieldError -> 0x0078 }
                r11 = 10
                r9[r10] = r11     // Catch:{ NoSuchFieldError -> 0x0078 }
            L_0x0078:
                int[] r9 = f83398b     // Catch:{ NoSuchFieldError -> 0x0084 }
                com.google.protobuf.WireFormat$FieldType r10 = com.google.protobuf.WireFormat.FieldType.STRING     // Catch:{ NoSuchFieldError -> 0x0084 }
                int r10 = r10.ordinal()     // Catch:{ NoSuchFieldError -> 0x0084 }
                r11 = 11
                r9[r10] = r11     // Catch:{ NoSuchFieldError -> 0x0084 }
            L_0x0084:
                int[] r9 = f83398b     // Catch:{ NoSuchFieldError -> 0x0090 }
                com.google.protobuf.WireFormat$FieldType r10 = com.google.protobuf.WireFormat.FieldType.BYTES     // Catch:{ NoSuchFieldError -> 0x0090 }
                int r10 = r10.ordinal()     // Catch:{ NoSuchFieldError -> 0x0090 }
                r11 = 12
                r9[r10] = r11     // Catch:{ NoSuchFieldError -> 0x0090 }
            L_0x0090:
                int[] r9 = f83398b     // Catch:{ NoSuchFieldError -> 0x009c }
                com.google.protobuf.WireFormat$FieldType r10 = com.google.protobuf.WireFormat.FieldType.UINT32     // Catch:{ NoSuchFieldError -> 0x009c }
                int r10 = r10.ordinal()     // Catch:{ NoSuchFieldError -> 0x009c }
                r11 = 13
                r9[r10] = r11     // Catch:{ NoSuchFieldError -> 0x009c }
            L_0x009c:
                int[] r9 = f83398b     // Catch:{ NoSuchFieldError -> 0x00a8 }
                com.google.protobuf.WireFormat$FieldType r10 = com.google.protobuf.WireFormat.FieldType.SFIXED32     // Catch:{ NoSuchFieldError -> 0x00a8 }
                int r10 = r10.ordinal()     // Catch:{ NoSuchFieldError -> 0x00a8 }
                r11 = 14
                r9[r10] = r11     // Catch:{ NoSuchFieldError -> 0x00a8 }
            L_0x00a8:
                int[] r9 = f83398b     // Catch:{ NoSuchFieldError -> 0x00b4 }
                com.google.protobuf.WireFormat$FieldType r10 = com.google.protobuf.WireFormat.FieldType.SFIXED64     // Catch:{ NoSuchFieldError -> 0x00b4 }
                int r10 = r10.ordinal()     // Catch:{ NoSuchFieldError -> 0x00b4 }
                r11 = 15
                r9[r10] = r11     // Catch:{ NoSuchFieldError -> 0x00b4 }
            L_0x00b4:
                int[] r9 = f83398b     // Catch:{ NoSuchFieldError -> 0x00c0 }
                com.google.protobuf.WireFormat$FieldType r10 = com.google.protobuf.WireFormat.FieldType.SINT32     // Catch:{ NoSuchFieldError -> 0x00c0 }
                int r10 = r10.ordinal()     // Catch:{ NoSuchFieldError -> 0x00c0 }
                r11 = 16
                r9[r10] = r11     // Catch:{ NoSuchFieldError -> 0x00c0 }
            L_0x00c0:
                int[] r9 = f83398b     // Catch:{ NoSuchFieldError -> 0x00cc }
                com.google.protobuf.WireFormat$FieldType r10 = com.google.protobuf.WireFormat.FieldType.SINT64     // Catch:{ NoSuchFieldError -> 0x00cc }
                int r10 = r10.ordinal()     // Catch:{ NoSuchFieldError -> 0x00cc }
                r11 = 17
                r9[r10] = r11     // Catch:{ NoSuchFieldError -> 0x00cc }
            L_0x00cc:
                int[] r9 = f83398b     // Catch:{ NoSuchFieldError -> 0x00d8 }
                com.google.protobuf.WireFormat$FieldType r10 = com.google.protobuf.WireFormat.FieldType.ENUM     // Catch:{ NoSuchFieldError -> 0x00d8 }
                int r10 = r10.ordinal()     // Catch:{ NoSuchFieldError -> 0x00d8 }
                r11 = 18
                r9[r10] = r11     // Catch:{ NoSuchFieldError -> 0x00d8 }
            L_0x00d8:
                com.google.protobuf.WireFormat$JavaType[] r9 = com.google.protobuf.WireFormat.JavaType.values()
                int r9 = r9.length
                int[] r9 = new int[r9]
                f83397a = r9
                com.google.protobuf.WireFormat$JavaType r10 = com.google.protobuf.WireFormat.JavaType.INT     // Catch:{ NoSuchFieldError -> 0x00e9 }
                int r10 = r10.ordinal()     // Catch:{ NoSuchFieldError -> 0x00e9 }
                r9[r10] = r1     // Catch:{ NoSuchFieldError -> 0x00e9 }
            L_0x00e9:
                int[] r1 = f83397a     // Catch:{ NoSuchFieldError -> 0x00f3 }
                com.google.protobuf.WireFormat$JavaType r9 = com.google.protobuf.WireFormat.JavaType.LONG     // Catch:{ NoSuchFieldError -> 0x00f3 }
                int r9 = r9.ordinal()     // Catch:{ NoSuchFieldError -> 0x00f3 }
                r1[r9] = r0     // Catch:{ NoSuchFieldError -> 0x00f3 }
            L_0x00f3:
                int[] r0 = f83397a     // Catch:{ NoSuchFieldError -> 0x00fd }
                com.google.protobuf.WireFormat$JavaType r1 = com.google.protobuf.WireFormat.JavaType.FLOAT     // Catch:{ NoSuchFieldError -> 0x00fd }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00fd }
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00fd }
            L_0x00fd:
                int[] r0 = f83397a     // Catch:{ NoSuchFieldError -> 0x0107 }
                com.google.protobuf.WireFormat$JavaType r1 = com.google.protobuf.WireFormat.JavaType.DOUBLE     // Catch:{ NoSuchFieldError -> 0x0107 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0107 }
                r0[r1] = r3     // Catch:{ NoSuchFieldError -> 0x0107 }
            L_0x0107:
                int[] r0 = f83397a     // Catch:{ NoSuchFieldError -> 0x0111 }
                com.google.protobuf.WireFormat$JavaType r1 = com.google.protobuf.WireFormat.JavaType.BOOLEAN     // Catch:{ NoSuchFieldError -> 0x0111 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0111 }
                r0[r1] = r4     // Catch:{ NoSuchFieldError -> 0x0111 }
            L_0x0111:
                int[] r0 = f83397a     // Catch:{ NoSuchFieldError -> 0x011b }
                com.google.protobuf.WireFormat$JavaType r1 = com.google.protobuf.WireFormat.JavaType.STRING     // Catch:{ NoSuchFieldError -> 0x011b }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x011b }
                r0[r1] = r5     // Catch:{ NoSuchFieldError -> 0x011b }
            L_0x011b:
                int[] r0 = f83397a     // Catch:{ NoSuchFieldError -> 0x0125 }
                com.google.protobuf.WireFormat$JavaType r1 = com.google.protobuf.WireFormat.JavaType.BYTE_STRING     // Catch:{ NoSuchFieldError -> 0x0125 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0125 }
                r0[r1] = r6     // Catch:{ NoSuchFieldError -> 0x0125 }
            L_0x0125:
                int[] r0 = f83397a     // Catch:{ NoSuchFieldError -> 0x012f }
                com.google.protobuf.WireFormat$JavaType r1 = com.google.protobuf.WireFormat.JavaType.ENUM     // Catch:{ NoSuchFieldError -> 0x012f }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x012f }
                r0[r1] = r7     // Catch:{ NoSuchFieldError -> 0x012f }
            L_0x012f:
                int[] r0 = f83397a     // Catch:{ NoSuchFieldError -> 0x0139 }
                com.google.protobuf.WireFormat$JavaType r1 = com.google.protobuf.WireFormat.JavaType.MESSAGE     // Catch:{ NoSuchFieldError -> 0x0139 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0139 }
                r0[r1] = r8     // Catch:{ NoSuchFieldError -> 0x0139 }
            L_0x0139:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.C34425o0.C34426a.<clinit>():void");
        }
    }

    /* renamed from: com.google.protobuf.o0$b */
    public static final class C34427b<T extends C34428c<T>> {

        /* renamed from: a */
        public C34387j2<T, Object> f83399a;

        /* renamed from: b */
        public boolean f83400b;

        /* renamed from: c */
        public boolean f83401c;

        /* renamed from: d */
        public boolean f83402d;

        public /* synthetic */ C34427b(C34426a aVar) {
            this();
        }

        /* renamed from: e */
        public static <T extends C34428c<T>> C34427b<T> m139971e(C34425o0<T> o0Var) {
            C34427b<T> bVar = new C34427b<>(C34425o0.m139938l(o0Var.f83394a, true));
            bVar.f83400b = o0Var.f83396c;
            return bVar;
        }

        /* renamed from: p */
        public static Object m139972p(Object obj) {
            return obj instanceof C34412l1.C34413a ? ((C34412l1.C34413a) obj).mo100473g() : obj;
        }

        /* renamed from: q */
        public static <T extends C34428c<T>> Object m139973q(T t, Object obj) {
            if (obj == null || t.mo100492R() != WireFormat.JavaType.MESSAGE) {
                return obj;
            }
            if (!t.mo100490B()) {
                return m139972p(obj);
            }
            if (obj instanceof List) {
                List list = (List) obj;
                for (int i = 0; i < list.size(); i++) {
                    Object obj2 = list.get(i);
                    Object p = m139972p(obj2);
                    if (p != obj2) {
                        if (list == obj) {
                            list = new ArrayList(list);
                        }
                        list.set(i, p);
                    }
                }
                return list;
            }
            throw new IllegalStateException("Repeated field should contains a List but actually contains type: " + obj.getClass());
        }

        /* renamed from: r */
        public static <T extends C34428c<T>> void m139974r(C34387j2<T, Object> j2Var) {
            for (int i = 0; i < j2Var.mo101146m(); i++) {
                m139975s(j2Var.mo101145l(i));
            }
            for (Map.Entry<T, Object> s : j2Var.mo101148o()) {
                m139975s(s);
            }
        }

        /* renamed from: s */
        public static <T extends C34428c<T>> void m139975s(Map.Entry<T, Object> entry) {
            entry.setValue(m139973q((C34428c) entry.getKey(), entry.getValue()));
        }

        /* renamed from: a */
        public void mo101409a(T t, Object obj) {
            boolean z;
            List list;
            mo101412d();
            if (t.mo100490B()) {
                if (this.f83402d || (obj instanceof C34412l1.C34413a)) {
                    z = true;
                } else {
                    z = false;
                }
                this.f83402d = z;
                mo101425v(t, obj);
                Object g = mo101414g(t);
                if (g == null) {
                    list = new ArrayList();
                    this.f83399a.put(t, list);
                } else {
                    list = (List) g;
                }
                list.add(obj);
                return;
            }
            throw new IllegalArgumentException("addRepeatedField() can only be called on repeated fields.");
        }

        /* renamed from: b */
        public C34425o0<T> mo101410b() {
            if (this.f83399a.isEmpty()) {
                return C34425o0.m139944s();
            }
            this.f83401c = false;
            C34387j2<T, Object> j2Var = this.f83399a;
            if (this.f83402d) {
                j2Var = C34425o0.m139938l(j2Var, false);
                m139974r(j2Var);
            }
            C34425o0<T> o0Var = new C34425o0<>(j2Var, (C34426a) null);
            boolean unused = o0Var.f83396c = this.f83400b;
            return o0Var;
        }

        /* renamed from: c */
        public void mo101411c(T t) {
            mo101412d();
            this.f83399a.remove(t);
            if (this.f83399a.isEmpty()) {
                this.f83400b = false;
            }
        }

        /* renamed from: d */
        public final void mo101412d() {
            if (!this.f83401c) {
                this.f83399a = C34425o0.m139938l(this.f83399a, true);
                this.f83401c = true;
            }
        }

        /* renamed from: f */
        public Map<T, Object> mo101413f() {
            if (this.f83400b) {
                C34387j2 a = C34425o0.m139938l(this.f83399a, false);
                if (this.f83399a.mo101152r()) {
                    a.mo101154s();
                } else {
                    m139974r(a);
                }
                return a;
            } else if (this.f83399a.mo101152r()) {
                return this.f83399a;
            } else {
                return Collections.unmodifiableMap(this.f83399a);
            }
        }

        /* renamed from: g */
        public Object mo101414g(T t) {
            return m139973q(t, mo101415h(t));
        }

        /* renamed from: h */
        public Object mo101415h(T t) {
            Object obj = this.f83399a.get(t);
            if (obj instanceof C34496x0) {
                return ((C34496x0) obj).mo101665p();
            }
            return obj;
        }

        /* renamed from: i */
        public Object mo101416i(T t, int i) {
            if (this.f83402d) {
                mo101412d();
            }
            return m139972p(mo101417j(t, i));
        }

        /* renamed from: j */
        public Object mo101417j(T t, int i) {
            if (t.mo100490B()) {
                Object h = mo101415h(t);
                if (h != null) {
                    return ((List) h).get(i);
                }
                throw new IndexOutOfBoundsException();
            }
            throw new IllegalArgumentException("getRepeatedField() can only be called on repeated fields.");
        }

        /* renamed from: k */
        public int mo101418k(T t) {
            if (t.mo100490B()) {
                Object g = mo101414g(t);
                if (g == null) {
                    return 0;
                }
                return ((List) g).size();
            }
            throw new IllegalArgumentException("getRepeatedField() can only be called on repeated fields.");
        }

        /* renamed from: l */
        public boolean mo101419l(T t) {
            if (t.mo100490B()) {
                throw new IllegalArgumentException("hasField() can only be called on non-repeated fields.");
            } else if (this.f83399a.get(t) != null) {
                return true;
            } else {
                return false;
            }
        }

        /* renamed from: m */
        public boolean mo101420m() {
            for (int i = 0; i < this.f83399a.mo101146m(); i++) {
                if (!C34425o0.m139923F(this.f83399a.mo101145l(i))) {
                    return false;
                }
            }
            for (Map.Entry<T, Object> f : this.f83399a.mo101148o()) {
                if (!C34425o0.m139923F(f)) {
                    return false;
                }
            }
            return true;
        }

        /* renamed from: n */
        public void mo101421n(C34425o0<T> o0Var) {
            mo101412d();
            for (int i = 0; i < o0Var.f83394a.mo101146m(); i++) {
                mo101422o(o0Var.f83394a.mo101145l(i));
            }
            for (Map.Entry o : o0Var.f83394a.mo101148o()) {
                mo101422o(o);
            }
        }

        /* renamed from: o */
        public final void mo101422o(Map.Entry<T, Object> entry) {
            C34428c cVar = (C34428c) entry.getKey();
            Object value = entry.getValue();
            if (value instanceof C34496x0) {
                value = ((C34496x0) value).mo101665p();
            }
            if (cVar.mo100490B()) {
                Object g = mo101414g(cVar);
                if (g == null) {
                    g = new ArrayList();
                }
                for (Object g2 : (List) value) {
                    ((List) g).add(C34425o0.m139940n(g2));
                }
                this.f83399a.put(cVar, g);
            } else if (cVar.mo100492R() == WireFormat.JavaType.MESSAGE) {
                Object g3 = mo101414g(cVar);
                if (g3 == null) {
                    this.f83399a.put(cVar, C34425o0.m139940n(value));
                } else if (g3 instanceof C34412l1.C34413a) {
                    cVar.mo100496d0((C34412l1.C34413a) g3, (C34412l1) value);
                } else {
                    this.f83399a.put(cVar, cVar.mo100496d0(((C34412l1) g3).toBuilder(), (C34412l1) value).mo100473g());
                }
            } else {
                this.f83399a.put(cVar, C34425o0.m139940n(value));
            }
        }

        /* renamed from: t */
        public void mo101423t(T t, Object obj) {
            boolean z;
            mo101412d();
            boolean z2 = false;
            if (!t.mo100490B()) {
                mo101425v(t, obj);
            } else if (obj instanceof List) {
                ArrayList arrayList = new ArrayList();
                arrayList.addAll((List) obj);
                for (Object next : arrayList) {
                    mo101425v(t, next);
                    if (this.f83402d || (next instanceof C34412l1.C34413a)) {
                        z = true;
                    } else {
                        z = false;
                    }
                    this.f83402d = z;
                }
                obj = arrayList;
            } else {
                throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
            }
            if (obj instanceof C34496x0) {
                this.f83400b = true;
            }
            if (this.f83402d || (obj instanceof C34412l1.C34413a)) {
                z2 = true;
            }
            this.f83402d = z2;
            this.f83399a.put(t, obj);
        }

        /* renamed from: u */
        public void mo101424u(T t, int i, Object obj) {
            boolean z;
            mo101412d();
            if (t.mo100490B()) {
                if (this.f83402d || (obj instanceof C34412l1.C34413a)) {
                    z = true;
                } else {
                    z = false;
                }
                this.f83402d = z;
                Object g = mo101414g(t);
                if (g != null) {
                    mo101425v(t, obj);
                    ((List) g).set(i, obj);
                    return;
                }
                throw new IndexOutOfBoundsException();
            }
            throw new IllegalArgumentException("getRepeatedField() can only be called on repeated fields.");
        }

        /* renamed from: v */
        public final void mo101425v(T t, Object obj) {
            if (C34425o0.m139924G(t.mo100491D(), obj)) {
                return;
            }
            if (t.mo100491D().mo100782g() != WireFormat.JavaType.MESSAGE || !(obj instanceof C34412l1.C34413a)) {
                throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", new Object[]{Integer.valueOf(t.getNumber()), t.mo100491D().mo100782g(), obj.getClass().getName()}));
            }
        }

        public C34427b() {
            this(C34387j2.m139440t(16));
        }

        public C34427b(C34387j2<T, Object> j2Var) {
            this.f83399a = j2Var;
            this.f83401c = true;
        }
    }

    /* renamed from: com.google.protobuf.o0$c */
    public interface C34428c<T extends C34428c<T>> extends Comparable<T> {
        /* renamed from: B */
        boolean mo100490B();

        /* renamed from: D */
        WireFormat.FieldType mo100491D();

        /* renamed from: R */
        WireFormat.JavaType mo100492R();

        /* renamed from: S */
        boolean mo100493S();

        /* renamed from: d0 */
        C34412l1.C34413a mo100496d0(C34412l1.C34413a aVar, C34412l1 l1Var);

        int getNumber();

        /* renamed from: s */
        C34471v0.C34475d<?> mo100498s();
    }

    public /* synthetic */ C34425o0(C34387j2 j2Var, C34426a aVar) {
        this(j2Var);
    }

    /* renamed from: A */
    public static int m139922A(WireFormat.FieldType fieldType, boolean z) {
        if (z) {
            return 2;
        }
        return fieldType.mo100783q();
    }

    /* renamed from: F */
    public static <T extends C34428c<T>> boolean m139923F(Map.Entry<T, Object> entry) {
        C34428c cVar = (C34428c) entry.getKey();
        if (cVar.mo100492R() == WireFormat.JavaType.MESSAGE) {
            if (cVar.mo100490B()) {
                for (C34412l1 isInitialized : (List) entry.getValue()) {
                    if (!isInitialized.isInitialized()) {
                        return false;
                    }
                }
            } else {
                Object value = entry.getValue();
                if (value instanceof C34412l1) {
                    if (!((C34412l1) value).isInitialized()) {
                        return false;
                    }
                } else if (value instanceof C34496x0) {
                    return true;
                } else {
                    throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
                }
            }
        }
        return true;
    }

    /* renamed from: G */
    public static boolean m139924G(WireFormat.FieldType fieldType, Object obj) {
        C34471v0.m140573d(obj);
        switch (C34426a.f83397a[fieldType.mo100782g().ordinal()]) {
            case 1:
                return obj instanceof Integer;
            case 2:
                return obj instanceof Long;
            case 3:
                return obj instanceof Float;
            case 4:
                return obj instanceof Double;
            case 5:
                return obj instanceof Boolean;
            case 6:
                return obj instanceof String;
            case 7:
                if ((obj instanceof ByteString) || (obj instanceof byte[])) {
                    return true;
                }
                return false;
            case 8:
                if ((obj instanceof Integer) || (obj instanceof C34471v0.C34474c)) {
                    return true;
                }
                return false;
            case 9:
                if ((obj instanceof C34412l1) || (obj instanceof C34496x0)) {
                    return true;
                }
                return false;
            default:
                return false;
        }
    }

    /* renamed from: L */
    public static <T extends C34428c<T>> C34427b<T> m139925L() {
        return new C34427b<>((C34426a) null);
    }

    /* renamed from: M */
    public static <T extends C34428c<T>> C34425o0<T> m139926M() {
        return new C34425o0<>();
    }

    /* renamed from: N */
    public static Object m139927N(C34448s sVar, WireFormat.FieldType fieldType, boolean z) throws IOException {
        if (z) {
            return WireFormat.m138724d(sVar, fieldType, WireFormat.Utf8Validation.STRICT);
        }
        return WireFormat.m138724d(sVar, fieldType, WireFormat.Utf8Validation.LOOSE);
    }

    /* renamed from: R */
    public static void m139928R(CodedOutputStream codedOutputStream, WireFormat.FieldType fieldType, int i, Object obj) throws IOException {
        if (fieldType == WireFormat.FieldType.GROUP) {
            codedOutputStream.mo99289F1(i, (C34412l1) obj);
            return;
        }
        codedOutputStream.mo99331g2(i, m139922A(fieldType, false));
        m139929S(codedOutputStream, fieldType, obj);
    }

    /* renamed from: S */
    public static void m139929S(CodedOutputStream codedOutputStream, WireFormat.FieldType fieldType, Object obj) throws IOException {
        switch (C34426a.f83398b[fieldType.ordinal()]) {
            case 1:
                codedOutputStream.mo99283A1(((Double) obj).doubleValue());
                return;
            case 2:
                codedOutputStream.mo99287E1(((Float) obj).floatValue());
                return;
            case 3:
                codedOutputStream.mo99295K1(((Long) obj).longValue());
                return;
            case 4:
                codedOutputStream.mo99335i2(((Long) obj).longValue());
                return;
            case 5:
                codedOutputStream.mo99294J1(((Integer) obj).intValue());
                return;
            case 6:
                codedOutputStream.mo99286D1(((Long) obj).longValue());
                return;
            case 7:
                codedOutputStream.mo99285C1(((Integer) obj).intValue());
                return;
            case 8:
                codedOutputStream.mo99343t1(((Boolean) obj).booleanValue());
                return;
            case 9:
                codedOutputStream.mo99291H1((C34412l1) obj);
                return;
            case 10:
                codedOutputStream.mo99299N1((C34412l1) obj);
                return;
            case 11:
                if (obj instanceof ByteString) {
                    codedOutputStream.mo99352z1((ByteString) obj);
                    return;
                } else {
                    codedOutputStream.mo99328f2((String) obj);
                    return;
                }
            case 12:
                if (obj instanceof ByteString) {
                    codedOutputStream.mo99352z1((ByteString) obj);
                    return;
                } else {
                    codedOutputStream.mo99346w1((byte[]) obj);
                    return;
                }
            case 13:
                codedOutputStream.mo99333h2(((Integer) obj).intValue());
                return;
            case 14:
                codedOutputStream.mo99320b2(((Integer) obj).intValue());
                return;
            case 15:
                codedOutputStream.mo99322c2(((Long) obj).longValue());
                return;
            case 16:
                codedOutputStream.mo99323d2(((Integer) obj).intValue());
                return;
            case 17:
                codedOutputStream.mo99325e2(((Long) obj).longValue());
                return;
            case 18:
                if (obj instanceof C34471v0.C34474c) {
                    codedOutputStream.mo99284B1(((C34471v0.C34474c) obj).getNumber());
                    return;
                } else {
                    codedOutputStream.mo99284B1(((Integer) obj).intValue());
                    return;
                }
            default:
                return;
        }
    }

    /* renamed from: T */
    public static void m139930T(C34428c<?> cVar, Object obj, CodedOutputStream codedOutputStream) throws IOException {
        WireFormat.FieldType D = cVar.mo100491D();
        int number = cVar.getNumber();
        if (cVar.mo100490B()) {
            List<Object> list = (List) obj;
            if (cVar.mo100493S()) {
                codedOutputStream.mo99331g2(number, 2);
                int i = 0;
                for (Object p : list) {
                    i += m139942p(D, p);
                }
                codedOutputStream.mo99318Z1(i);
                for (Object S : list) {
                    m139929S(codedOutputStream, D, S);
                }
                return;
            }
            for (Object R : list) {
                m139928R(codedOutputStream, D, number, R);
            }
        } else if (obj instanceof C34496x0) {
            m139928R(codedOutputStream, D, number, ((C34496x0) obj).mo101665p());
        } else {
            m139928R(codedOutputStream, D, number, obj);
        }
    }

    /* renamed from: l */
    public static <T extends C34428c<T>> C34387j2<T, Object> m139938l(C34387j2<T, Object> j2Var, boolean z) {
        C34387j2<T, Object> t = C34387j2.m139440t(16);
        for (int i = 0; i < j2Var.mo101146m(); i++) {
            m139939m(t, j2Var.mo101145l(i), z);
        }
        for (Map.Entry<T, Object> m : j2Var.mo101148o()) {
            m139939m(t, m, z);
        }
        return t;
    }

    /* renamed from: m */
    public static <T extends C34428c<T>> void m139939m(Map<T, Object> map, Map.Entry<T, Object> entry, boolean z) {
        C34428c cVar = (C34428c) entry.getKey();
        Object value = entry.getValue();
        if (value instanceof C34496x0) {
            map.put(cVar, ((C34496x0) value).mo101665p());
        } else if (!z || !(value instanceof List)) {
            map.put(cVar, value);
        } else {
            map.put(cVar, new ArrayList((List) value));
        }
    }

    /* renamed from: n */
    public static Object m139940n(Object obj) {
        if (!(obj instanceof byte[])) {
            return obj;
        }
        byte[] bArr = (byte[]) obj;
        byte[] bArr2 = new byte[bArr.length];
        System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
        return bArr2;
    }

    /* renamed from: o */
    public static int m139941o(WireFormat.FieldType fieldType, int i, Object obj) {
        int X0 = CodedOutputStream.m137366X0(i);
        if (fieldType == WireFormat.FieldType.GROUP) {
            X0 *= 2;
        }
        return X0 + m139942p(fieldType, obj);
    }

    /* renamed from: p */
    public static int m139942p(WireFormat.FieldType fieldType, Object obj) {
        switch (C34426a.f83398b[fieldType.ordinal()]) {
            case 1:
                return CodedOutputStream.m137384j0(((Double) obj).doubleValue());
            case 2:
                return CodedOutputStream.m137400r0(((Float) obj).floatValue());
            case 3:
                return CodedOutputStream.m137408z0(((Long) obj).longValue());
            case 4:
                return CodedOutputStream.m137373b1(((Long) obj).longValue());
            case 5:
                return CodedOutputStream.m137406x0(((Integer) obj).intValue());
            case 6:
                return CodedOutputStream.m137396p0(((Long) obj).longValue());
            case 7:
                return CodedOutputStream.m137392n0(((Integer) obj).intValue());
            case 8:
                return CodedOutputStream.m137372b0(((Boolean) obj).booleanValue());
            case 9:
                return CodedOutputStream.m137403u0((C34412l1) obj);
            case 10:
                if (obj instanceof C34496x0) {
                    return CodedOutputStream.m137345C0((C34496x0) obj);
                }
                return CodedOutputStream.m137350H0((C34412l1) obj);
            case 11:
                if (obj instanceof ByteString) {
                    return CodedOutputStream.m137381h0((ByteString) obj);
                }
                return CodedOutputStream.m137365W0((String) obj);
            case 12:
                if (obj instanceof ByteString) {
                    return CodedOutputStream.m137381h0((ByteString) obj);
                }
                return CodedOutputStream.m137376d0((byte[]) obj);
            case 13:
                return CodedOutputStream.m137369Z0(((Integer) obj).intValue());
            case 14:
                return CodedOutputStream.m137357O0(((Integer) obj).intValue());
            case 15:
                return CodedOutputStream.m137359Q0(((Long) obj).longValue());
            case 16:
                return CodedOutputStream.m137361S0(((Integer) obj).intValue());
            case 17:
                return CodedOutputStream.m137363U0(((Long) obj).longValue());
            case 18:
                if (obj instanceof C34471v0.C34474c) {
                    return CodedOutputStream.m137388l0(((C34471v0.C34474c) obj).getNumber());
                }
                return CodedOutputStream.m137388l0(((Integer) obj).intValue());
            default:
                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
        }
    }

    /* renamed from: q */
    public static int m139943q(C34428c<?> cVar, Object obj) {
        WireFormat.FieldType D = cVar.mo100491D();
        int number = cVar.getNumber();
        if (!cVar.mo100490B()) {
            return m139941o(D, number, obj);
        }
        int i = 0;
        if (cVar.mo100493S()) {
            for (Object p : (List) obj) {
                i += m139942p(D, p);
            }
            return CodedOutputStream.m137366X0(number) + i + CodedOutputStream.m137354L0(i);
        }
        for (Object o : (List) obj) {
            i += m139941o(D, number, o);
        }
        return i;
    }

    /* renamed from: s */
    public static <T extends C34428c<T>> C34425o0<T> m139944s() {
        return f83393e;
    }

    /* renamed from: B */
    public boolean mo101380B(T t) {
        if (t.mo100490B()) {
            throw new IllegalArgumentException("hasField() can only be called on non-repeated fields.");
        } else if (this.f83394a.get(t) != null) {
            return true;
        } else {
            return false;
        }
    }

    /* renamed from: C */
    public boolean mo101381C() {
        return this.f83394a.isEmpty();
    }

    /* renamed from: D */
    public boolean mo101382D() {
        return this.f83395b;
    }

    /* renamed from: E */
    public boolean mo101383E() {
        for (int i = 0; i < this.f83394a.mo101146m(); i++) {
            if (!m139923F(this.f83394a.mo101145l(i))) {
                return false;
            }
        }
        for (Map.Entry<T, Object> F : this.f83394a.mo101148o()) {
            if (!m139923F(F)) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: H */
    public Iterator<Map.Entry<T, Object>> mo101384H() {
        if (this.f83396c) {
            return new C34496x0.C34499c(this.f83394a.entrySet().iterator());
        }
        return this.f83394a.entrySet().iterator();
    }

    /* renamed from: I */
    public void mo101385I() {
        if (!this.f83395b) {
            this.f83394a.mo101154s();
            this.f83395b = true;
        }
    }

    /* renamed from: J */
    public void mo101386J(C34425o0<T> o0Var) {
        for (int i = 0; i < o0Var.f83394a.mo101146m(); i++) {
            mo101387K(o0Var.f83394a.mo101145l(i));
        }
        for (Map.Entry<T, Object> K : o0Var.f83394a.mo101148o()) {
            mo101387K(K);
        }
    }

    /* renamed from: K */
    public final void mo101387K(Map.Entry<T, Object> entry) {
        C34428c cVar = (C34428c) entry.getKey();
        Object value = entry.getValue();
        if (value instanceof C34496x0) {
            value = ((C34496x0) value).mo101665p();
        }
        if (cVar.mo100490B()) {
            Object u = mo101403u(cVar);
            if (u == null) {
                u = new ArrayList();
            }
            for (Object n : (List) value) {
                ((List) u).add(m139940n(n));
            }
            this.f83394a.put(cVar, u);
        } else if (cVar.mo100492R() == WireFormat.JavaType.MESSAGE) {
            Object u2 = mo101403u(cVar);
            if (u2 == null) {
                this.f83394a.put(cVar, m139940n(value));
                return;
            }
            this.f83394a.put(cVar, cVar.mo100496d0(((C34412l1) u2).toBuilder(), (C34412l1) value).mo100473g());
        } else {
            this.f83394a.put(cVar, m139940n(value));
        }
    }

    /* renamed from: O */
    public void mo101388O(T t, Object obj) {
        if (!t.mo100490B()) {
            mo101390Q(t, obj);
        } else if (obj instanceof List) {
            ArrayList<Object> arrayList = new ArrayList<>();
            arrayList.addAll((List) obj);
            for (Object Q : arrayList) {
                mo101390Q(t, Q);
            }
            obj = arrayList;
        } else {
            throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
        }
        if (obj instanceof C34496x0) {
            this.f83396c = true;
        }
        this.f83394a.put(t, obj);
    }

    /* renamed from: P */
    public void mo101389P(T t, int i, Object obj) {
        if (t.mo100490B()) {
            Object u = mo101403u(t);
            if (u != null) {
                mo101390Q(t, obj);
                ((List) u).set(i, obj);
                return;
            }
            throw new IndexOutOfBoundsException();
        }
        throw new IllegalArgumentException("getRepeatedField() can only be called on repeated fields.");
    }

    /* renamed from: Q */
    public final void mo101390Q(T t, Object obj) {
        if (!m139924G(t.mo100491D(), obj)) {
            throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", new Object[]{Integer.valueOf(t.getNumber()), t.mo100491D().mo100782g(), obj.getClass().getName()}));
        }
    }

    /* renamed from: U */
    public void mo101391U(CodedOutputStream codedOutputStream) throws IOException {
        for (int i = 0; i < this.f83394a.mo101146m(); i++) {
            mo101392V(this.f83394a.mo101145l(i), codedOutputStream);
        }
        for (Map.Entry<T, Object> V : this.f83394a.mo101148o()) {
            mo101392V(V, codedOutputStream);
        }
    }

    /* renamed from: V */
    public final void mo101392V(Map.Entry<T, Object> entry, CodedOutputStream codedOutputStream) throws IOException {
        C34428c cVar = (C34428c) entry.getKey();
        if (cVar.mo100492R() != WireFormat.JavaType.MESSAGE || cVar.mo100490B() || cVar.mo100493S()) {
            m139930T(cVar, entry.getValue(), codedOutputStream);
            return;
        }
        Object value = entry.getValue();
        if (value instanceof C34496x0) {
            value = ((C34496x0) value).mo101665p();
        }
        codedOutputStream.mo99302P1(((C34428c) entry.getKey()).getNumber(), (C34412l1) value);
    }

    /* renamed from: W */
    public void mo101393W(CodedOutputStream codedOutputStream) throws IOException {
        for (int i = 0; i < this.f83394a.mo101146m(); i++) {
            Map.Entry<T, Object> l = this.f83394a.mo101145l(i);
            m139930T((C34428c) l.getKey(), l.getValue(), codedOutputStream);
        }
        for (Map.Entry next : this.f83394a.mo101148o()) {
            m139930T((C34428c) next.getKey(), next.getValue(), codedOutputStream);
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C34425o0)) {
            return false;
        }
        return this.f83394a.equals(((C34425o0) obj).f83394a);
    }

    /* renamed from: h */
    public void mo101396h(T t, Object obj) {
        List list;
        if (t.mo100490B()) {
            mo101390Q(t, obj);
            Object u = mo101403u(t);
            if (u == null) {
                list = new ArrayList();
                this.f83394a.put(t, list);
            } else {
                list = (List) u;
            }
            list.add(obj);
            return;
        }
        throw new IllegalArgumentException("addRepeatedField() can only be called on repeated fields.");
    }

    public int hashCode() {
        return this.f83394a.hashCode();
    }

    /* renamed from: i */
    public void mo101398i() {
        this.f83394a.clear();
        this.f83396c = false;
    }

    /* renamed from: j */
    public void mo101399j(T t) {
        this.f83394a.remove(t);
        if (this.f83394a.isEmpty()) {
            this.f83396c = false;
        }
    }

    /* renamed from: k */
    public C34425o0<T> clone() {
        C34425o0<T> M = m139926M();
        for (int i = 0; i < this.f83394a.mo101146m(); i++) {
            Map.Entry<T, Object> l = this.f83394a.mo101145l(i);
            M.mo101388O((C34428c) l.getKey(), l.getValue());
        }
        for (Map.Entry next : this.f83394a.mo101148o()) {
            M.mo101388O((C34428c) next.getKey(), next.getValue());
        }
        M.f83396c = this.f83396c;
        return M;
    }

    /* renamed from: r */
    public Iterator<Map.Entry<T, Object>> mo101401r() {
        if (this.f83396c) {
            return new C34496x0.C34499c(this.f83394a.mo101143i().iterator());
        }
        return this.f83394a.mo101143i().iterator();
    }

    /* renamed from: t */
    public Map<T, Object> mo101402t() {
        if (this.f83396c) {
            C34387j2<T, Object> l = m139938l(this.f83394a, false);
            if (this.f83394a.mo101152r()) {
                l.mo101154s();
            }
            return l;
        } else if (this.f83394a.mo101152r()) {
            return this.f83394a;
        } else {
            return Collections.unmodifiableMap(this.f83394a);
        }
    }

    /* renamed from: u */
    public Object mo101403u(T t) {
        Object obj = this.f83394a.get(t);
        if (obj instanceof C34496x0) {
            return ((C34496x0) obj).mo101665p();
        }
        return obj;
    }

    /* renamed from: v */
    public int mo101404v() {
        int i = 0;
        for (int i2 = 0; i2 < this.f83394a.mo101146m(); i2++) {
            i += mo101405w(this.f83394a.mo101145l(i2));
        }
        for (Map.Entry<T, Object> w : this.f83394a.mo101148o()) {
            i += mo101405w(w);
        }
        return i;
    }

    /* renamed from: w */
    public final int mo101405w(Map.Entry<T, Object> entry) {
        C34428c cVar = (C34428c) entry.getKey();
        Object value = entry.getValue();
        if (cVar.mo100492R() != WireFormat.JavaType.MESSAGE || cVar.mo100490B() || cVar.mo100493S()) {
            return m139943q(cVar, value);
        }
        if (value instanceof C34496x0) {
            return CodedOutputStream.m137343A0(((C34428c) entry.getKey()).getNumber(), (C34496x0) value);
        }
        return CodedOutputStream.m137347E0(((C34428c) entry.getKey()).getNumber(), (C34412l1) value);
    }

    /* renamed from: x */
    public Object mo101406x(T t, int i) {
        if (t.mo100490B()) {
            Object u = mo101403u(t);
            if (u != null) {
                return ((List) u).get(i);
            }
            throw new IndexOutOfBoundsException();
        }
        throw new IllegalArgumentException("getRepeatedField() can only be called on repeated fields.");
    }

    /* renamed from: y */
    public int mo101407y(T t) {
        if (t.mo100490B()) {
            Object u = mo101403u(t);
            if (u == null) {
                return 0;
            }
            return ((List) u).size();
        }
        throw new IllegalArgumentException("getRepeatedField() can only be called on repeated fields.");
    }

    /* renamed from: z */
    public int mo101408z() {
        int i = 0;
        for (int i2 = 0; i2 < this.f83394a.mo101146m(); i2++) {
            Map.Entry<T, Object> l = this.f83394a.mo101145l(i2);
            i += m139943q((C34428c) l.getKey(), l.getValue());
        }
        for (Map.Entry next : this.f83394a.mo101148o()) {
            i += m139943q((C34428c) next.getKey(), next.getValue());
        }
        return i;
    }

    public C34425o0() {
        this.f83394a = C34387j2.m139440t(16);
    }

    public C34425o0(boolean z) {
        this(C34387j2.m139440t(0));
        mo101385I();
    }

    public C34425o0(C34387j2<T, Object> j2Var) {
        this.f83394a = j2Var;
        mo101385I();
    }
}
