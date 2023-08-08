package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.C18753i1;
import androidx.datastore.preferences.protobuf.C18784k1;
import androidx.datastore.preferences.protobuf.C18909y0.C18912c;
import androidx.datastore.preferences.protobuf.C18920z1;
import androidx.datastore.preferences.protobuf.WireFormat;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: androidx.datastore.preferences.protobuf.y0 */
public final class C18909y0<T extends C18912c<T>> {

    /* renamed from: d */
    public static final int f48127d = 16;

    /* renamed from: e */
    public static final C18909y0 f48128e = new C18909y0(true);

    /* renamed from: a */
    public final C18676a3<T, Object> f48129a;

    /* renamed from: b */
    public boolean f48130b;

    /* renamed from: c */
    public boolean f48131c;

    /* renamed from: androidx.datastore.preferences.protobuf.y0$a */
    public static /* synthetic */ class C18910a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f48132a;

        /* renamed from: b */
        public static final /* synthetic */ int[] f48133b;

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
                androidx.datastore.preferences.protobuf.WireFormat$FieldType[] r0 = androidx.datastore.preferences.protobuf.WireFormat.FieldType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f48133b = r0
                r1 = 1
                androidx.datastore.preferences.protobuf.WireFormat$FieldType r2 = androidx.datastore.preferences.protobuf.WireFormat.FieldType.DOUBLE     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r0[r2] = r1     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                r0 = 2
                int[] r2 = f48133b     // Catch:{ NoSuchFieldError -> 0x001d }
                androidx.datastore.preferences.protobuf.WireFormat$FieldType r3 = androidx.datastore.preferences.protobuf.WireFormat.FieldType.FLOAT     // Catch:{ NoSuchFieldError -> 0x001d }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2[r3] = r0     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                r2 = 3
                int[] r3 = f48133b     // Catch:{ NoSuchFieldError -> 0x0028 }
                androidx.datastore.preferences.protobuf.WireFormat$FieldType r4 = androidx.datastore.preferences.protobuf.WireFormat.FieldType.INT64     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r3[r4] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                r3 = 4
                int[] r4 = f48133b     // Catch:{ NoSuchFieldError -> 0x0033 }
                androidx.datastore.preferences.protobuf.WireFormat$FieldType r5 = androidx.datastore.preferences.protobuf.WireFormat.FieldType.UINT64     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r4[r5] = r3     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                r4 = 5
                int[] r5 = f48133b     // Catch:{ NoSuchFieldError -> 0x003e }
                androidx.datastore.preferences.protobuf.WireFormat$FieldType r6 = androidx.datastore.preferences.protobuf.WireFormat.FieldType.INT32     // Catch:{ NoSuchFieldError -> 0x003e }
                int r6 = r6.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r5[r6] = r4     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                r5 = 6
                int[] r6 = f48133b     // Catch:{ NoSuchFieldError -> 0x0049 }
                androidx.datastore.preferences.protobuf.WireFormat$FieldType r7 = androidx.datastore.preferences.protobuf.WireFormat.FieldType.FIXED64     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r7 = r7.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r6[r7] = r5     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                r6 = 7
                int[] r7 = f48133b     // Catch:{ NoSuchFieldError -> 0x0054 }
                androidx.datastore.preferences.protobuf.WireFormat$FieldType r8 = androidx.datastore.preferences.protobuf.WireFormat.FieldType.FIXED32     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r8 = r8.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r7[r8] = r6     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                r7 = 8
                int[] r8 = f48133b     // Catch:{ NoSuchFieldError -> 0x0060 }
                androidx.datastore.preferences.protobuf.WireFormat$FieldType r9 = androidx.datastore.preferences.protobuf.WireFormat.FieldType.BOOL     // Catch:{ NoSuchFieldError -> 0x0060 }
                int r9 = r9.ordinal()     // Catch:{ NoSuchFieldError -> 0x0060 }
                r8[r9] = r7     // Catch:{ NoSuchFieldError -> 0x0060 }
            L_0x0060:
                r8 = 9
                int[] r9 = f48133b     // Catch:{ NoSuchFieldError -> 0x006c }
                androidx.datastore.preferences.protobuf.WireFormat$FieldType r10 = androidx.datastore.preferences.protobuf.WireFormat.FieldType.GROUP     // Catch:{ NoSuchFieldError -> 0x006c }
                int r10 = r10.ordinal()     // Catch:{ NoSuchFieldError -> 0x006c }
                r9[r10] = r8     // Catch:{ NoSuchFieldError -> 0x006c }
            L_0x006c:
                int[] r9 = f48133b     // Catch:{ NoSuchFieldError -> 0x0078 }
                androidx.datastore.preferences.protobuf.WireFormat$FieldType r10 = androidx.datastore.preferences.protobuf.WireFormat.FieldType.MESSAGE     // Catch:{ NoSuchFieldError -> 0x0078 }
                int r10 = r10.ordinal()     // Catch:{ NoSuchFieldError -> 0x0078 }
                r11 = 10
                r9[r10] = r11     // Catch:{ NoSuchFieldError -> 0x0078 }
            L_0x0078:
                int[] r9 = f48133b     // Catch:{ NoSuchFieldError -> 0x0084 }
                androidx.datastore.preferences.protobuf.WireFormat$FieldType r10 = androidx.datastore.preferences.protobuf.WireFormat.FieldType.STRING     // Catch:{ NoSuchFieldError -> 0x0084 }
                int r10 = r10.ordinal()     // Catch:{ NoSuchFieldError -> 0x0084 }
                r11 = 11
                r9[r10] = r11     // Catch:{ NoSuchFieldError -> 0x0084 }
            L_0x0084:
                int[] r9 = f48133b     // Catch:{ NoSuchFieldError -> 0x0090 }
                androidx.datastore.preferences.protobuf.WireFormat$FieldType r10 = androidx.datastore.preferences.protobuf.WireFormat.FieldType.BYTES     // Catch:{ NoSuchFieldError -> 0x0090 }
                int r10 = r10.ordinal()     // Catch:{ NoSuchFieldError -> 0x0090 }
                r11 = 12
                r9[r10] = r11     // Catch:{ NoSuchFieldError -> 0x0090 }
            L_0x0090:
                int[] r9 = f48133b     // Catch:{ NoSuchFieldError -> 0x009c }
                androidx.datastore.preferences.protobuf.WireFormat$FieldType r10 = androidx.datastore.preferences.protobuf.WireFormat.FieldType.UINT32     // Catch:{ NoSuchFieldError -> 0x009c }
                int r10 = r10.ordinal()     // Catch:{ NoSuchFieldError -> 0x009c }
                r11 = 13
                r9[r10] = r11     // Catch:{ NoSuchFieldError -> 0x009c }
            L_0x009c:
                int[] r9 = f48133b     // Catch:{ NoSuchFieldError -> 0x00a8 }
                androidx.datastore.preferences.protobuf.WireFormat$FieldType r10 = androidx.datastore.preferences.protobuf.WireFormat.FieldType.SFIXED32     // Catch:{ NoSuchFieldError -> 0x00a8 }
                int r10 = r10.ordinal()     // Catch:{ NoSuchFieldError -> 0x00a8 }
                r11 = 14
                r9[r10] = r11     // Catch:{ NoSuchFieldError -> 0x00a8 }
            L_0x00a8:
                int[] r9 = f48133b     // Catch:{ NoSuchFieldError -> 0x00b4 }
                androidx.datastore.preferences.protobuf.WireFormat$FieldType r10 = androidx.datastore.preferences.protobuf.WireFormat.FieldType.SFIXED64     // Catch:{ NoSuchFieldError -> 0x00b4 }
                int r10 = r10.ordinal()     // Catch:{ NoSuchFieldError -> 0x00b4 }
                r11 = 15
                r9[r10] = r11     // Catch:{ NoSuchFieldError -> 0x00b4 }
            L_0x00b4:
                int[] r9 = f48133b     // Catch:{ NoSuchFieldError -> 0x00c0 }
                androidx.datastore.preferences.protobuf.WireFormat$FieldType r10 = androidx.datastore.preferences.protobuf.WireFormat.FieldType.SINT32     // Catch:{ NoSuchFieldError -> 0x00c0 }
                int r10 = r10.ordinal()     // Catch:{ NoSuchFieldError -> 0x00c0 }
                r11 = 16
                r9[r10] = r11     // Catch:{ NoSuchFieldError -> 0x00c0 }
            L_0x00c0:
                int[] r9 = f48133b     // Catch:{ NoSuchFieldError -> 0x00cc }
                androidx.datastore.preferences.protobuf.WireFormat$FieldType r10 = androidx.datastore.preferences.protobuf.WireFormat.FieldType.SINT64     // Catch:{ NoSuchFieldError -> 0x00cc }
                int r10 = r10.ordinal()     // Catch:{ NoSuchFieldError -> 0x00cc }
                r11 = 17
                r9[r10] = r11     // Catch:{ NoSuchFieldError -> 0x00cc }
            L_0x00cc:
                int[] r9 = f48133b     // Catch:{ NoSuchFieldError -> 0x00d8 }
                androidx.datastore.preferences.protobuf.WireFormat$FieldType r10 = androidx.datastore.preferences.protobuf.WireFormat.FieldType.ENUM     // Catch:{ NoSuchFieldError -> 0x00d8 }
                int r10 = r10.ordinal()     // Catch:{ NoSuchFieldError -> 0x00d8 }
                r11 = 18
                r9[r10] = r11     // Catch:{ NoSuchFieldError -> 0x00d8 }
            L_0x00d8:
                androidx.datastore.preferences.protobuf.WireFormat$JavaType[] r9 = androidx.datastore.preferences.protobuf.WireFormat.JavaType.values()
                int r9 = r9.length
                int[] r9 = new int[r9]
                f48132a = r9
                androidx.datastore.preferences.protobuf.WireFormat$JavaType r10 = androidx.datastore.preferences.protobuf.WireFormat.JavaType.INT     // Catch:{ NoSuchFieldError -> 0x00e9 }
                int r10 = r10.ordinal()     // Catch:{ NoSuchFieldError -> 0x00e9 }
                r9[r10] = r1     // Catch:{ NoSuchFieldError -> 0x00e9 }
            L_0x00e9:
                int[] r1 = f48132a     // Catch:{ NoSuchFieldError -> 0x00f3 }
                androidx.datastore.preferences.protobuf.WireFormat$JavaType r9 = androidx.datastore.preferences.protobuf.WireFormat.JavaType.LONG     // Catch:{ NoSuchFieldError -> 0x00f3 }
                int r9 = r9.ordinal()     // Catch:{ NoSuchFieldError -> 0x00f3 }
                r1[r9] = r0     // Catch:{ NoSuchFieldError -> 0x00f3 }
            L_0x00f3:
                int[] r0 = f48132a     // Catch:{ NoSuchFieldError -> 0x00fd }
                androidx.datastore.preferences.protobuf.WireFormat$JavaType r1 = androidx.datastore.preferences.protobuf.WireFormat.JavaType.FLOAT     // Catch:{ NoSuchFieldError -> 0x00fd }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00fd }
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00fd }
            L_0x00fd:
                int[] r0 = f48132a     // Catch:{ NoSuchFieldError -> 0x0107 }
                androidx.datastore.preferences.protobuf.WireFormat$JavaType r1 = androidx.datastore.preferences.protobuf.WireFormat.JavaType.DOUBLE     // Catch:{ NoSuchFieldError -> 0x0107 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0107 }
                r0[r1] = r3     // Catch:{ NoSuchFieldError -> 0x0107 }
            L_0x0107:
                int[] r0 = f48132a     // Catch:{ NoSuchFieldError -> 0x0111 }
                androidx.datastore.preferences.protobuf.WireFormat$JavaType r1 = androidx.datastore.preferences.protobuf.WireFormat.JavaType.BOOLEAN     // Catch:{ NoSuchFieldError -> 0x0111 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0111 }
                r0[r1] = r4     // Catch:{ NoSuchFieldError -> 0x0111 }
            L_0x0111:
                int[] r0 = f48132a     // Catch:{ NoSuchFieldError -> 0x011b }
                androidx.datastore.preferences.protobuf.WireFormat$JavaType r1 = androidx.datastore.preferences.protobuf.WireFormat.JavaType.STRING     // Catch:{ NoSuchFieldError -> 0x011b }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x011b }
                r0[r1] = r5     // Catch:{ NoSuchFieldError -> 0x011b }
            L_0x011b:
                int[] r0 = f48132a     // Catch:{ NoSuchFieldError -> 0x0125 }
                androidx.datastore.preferences.protobuf.WireFormat$JavaType r1 = androidx.datastore.preferences.protobuf.WireFormat.JavaType.BYTE_STRING     // Catch:{ NoSuchFieldError -> 0x0125 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0125 }
                r0[r1] = r6     // Catch:{ NoSuchFieldError -> 0x0125 }
            L_0x0125:
                int[] r0 = f48132a     // Catch:{ NoSuchFieldError -> 0x012f }
                androidx.datastore.preferences.protobuf.WireFormat$JavaType r1 = androidx.datastore.preferences.protobuf.WireFormat.JavaType.ENUM     // Catch:{ NoSuchFieldError -> 0x012f }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x012f }
                r0[r1] = r7     // Catch:{ NoSuchFieldError -> 0x012f }
            L_0x012f:
                int[] r0 = f48132a     // Catch:{ NoSuchFieldError -> 0x0139 }
                androidx.datastore.preferences.protobuf.WireFormat$JavaType r1 = androidx.datastore.preferences.protobuf.WireFormat.JavaType.MESSAGE     // Catch:{ NoSuchFieldError -> 0x0139 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0139 }
                r0[r1] = r8     // Catch:{ NoSuchFieldError -> 0x0139 }
            L_0x0139:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.C18909y0.C18910a.<clinit>():void");
        }
    }

    /* renamed from: androidx.datastore.preferences.protobuf.y0$b */
    public static final class C18911b<T extends C18912c<T>> {

        /* renamed from: a */
        public C18676a3<T, Object> f48134a;

        /* renamed from: b */
        public boolean f48135b;

        /* renamed from: c */
        public boolean f48136c;

        /* renamed from: d */
        public boolean f48137d;

        public /* synthetic */ C18911b(C18910a aVar) {
            this();
        }

        /* renamed from: e */
        public static <T extends C18912c<T>> C18911b<T> m88176e(C18909y0<T> y0Var) {
            C18911b<T> bVar = new C18911b<>(C18909y0.m88143l(y0Var.f48129a, true));
            bVar.f48135b = y0Var.f48131c;
            return bVar;
        }

        /* renamed from: p */
        public static Object m88177p(Object obj) {
            return obj instanceof C18920z1.C18921a ? ((C18920z1.C18921a) obj).mo54018g() : obj;
        }

        /* renamed from: q */
        public static <T extends C18912c<T>> Object m88178q(T t, Object obj) {
            if (obj == null || t.mo54065R() != WireFormat.JavaType.MESSAGE) {
                return obj;
            }
            if (!t.mo54063B()) {
                return m88177p(obj);
            }
            if (obj instanceof List) {
                List list = (List) obj;
                for (int i = 0; i < list.size(); i++) {
                    Object obj2 = list.get(i);
                    Object p = m88177p(obj2);
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
        public static <T extends C18912c<T>> void m88179r(C18676a3<T, Object> a3Var) {
            for (int i = 0; i < a3Var.mo54303m(); i++) {
                m88180s(a3Var.mo54302l(i));
            }
            for (Map.Entry<T, Object> s : a3Var.mo54305o()) {
                m88180s(s);
            }
        }

        /* renamed from: s */
        public static <T extends C18912c<T>> void m88180s(Map.Entry<T, Object> entry) {
            entry.setValue(m88178q((C18912c) entry.getKey(), entry.getValue()));
        }

        /* renamed from: v */
        public static void m88181v(WireFormat.FieldType fieldType, Object obj) {
            if (C18909y0.m88129G(fieldType, obj)) {
                return;
            }
            if (fieldType.mo54201g() != WireFormat.JavaType.MESSAGE || !(obj instanceof C18920z1.C18921a)) {
                throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
            }
        }

        /* renamed from: a */
        public void mo55636a(T t, Object obj) {
            boolean z;
            List list;
            mo55639d();
            if (t.mo54063B()) {
                if (this.f48137d || (obj instanceof C18920z1.C18921a)) {
                    z = true;
                } else {
                    z = false;
                }
                this.f48137d = z;
                m88181v(t.mo54064D(), obj);
                Object g = mo55641g(t);
                if (g == null) {
                    list = new ArrayList();
                    this.f48134a.put(t, list);
                } else {
                    list = (List) g;
                }
                list.add(obj);
                return;
            }
            throw new IllegalArgumentException("addRepeatedField() can only be called on repeated fields.");
        }

        /* renamed from: b */
        public C18909y0<T> mo55637b() {
            if (this.f48134a.isEmpty()) {
                return C18909y0.m88149s();
            }
            this.f48136c = false;
            C18676a3<T, Object> a3Var = this.f48134a;
            if (this.f48137d) {
                a3Var = C18909y0.m88143l(a3Var, false);
                m88179r(a3Var);
            }
            C18909y0<T> y0Var = new C18909y0<>(a3Var, (C18910a) null);
            boolean unused = y0Var.f48131c = this.f48135b;
            return y0Var;
        }

        /* renamed from: c */
        public void mo55638c(T t) {
            mo55639d();
            this.f48134a.remove(t);
            if (this.f48134a.isEmpty()) {
                this.f48135b = false;
            }
        }

        /* renamed from: d */
        public final void mo55639d() {
            if (!this.f48136c) {
                this.f48134a = C18909y0.m88143l(this.f48134a, true);
                this.f48136c = true;
            }
        }

        /* renamed from: f */
        public Map<T, Object> mo55640f() {
            if (this.f48135b) {
                C18676a3 a = C18909y0.m88143l(this.f48134a, false);
                if (this.f48134a.mo54309r()) {
                    a.mo54311s();
                } else {
                    m88179r(a);
                }
                return a;
            } else if (this.f48134a.mo54309r()) {
                return this.f48134a;
            } else {
                return Collections.unmodifiableMap(this.f48134a);
            }
        }

        /* renamed from: g */
        public Object mo55641g(T t) {
            return m88178q(t, mo55642h(t));
        }

        /* renamed from: h */
        public Object mo55642h(T t) {
            Object obj = this.f48134a.get(t);
            if (obj instanceof C18784k1) {
                return ((C18784k1) obj).mo54912p();
            }
            return obj;
        }

        /* renamed from: i */
        public Object mo55643i(T t, int i) {
            if (this.f48137d) {
                mo55639d();
            }
            return m88177p(mo55644j(t, i));
        }

        /* renamed from: j */
        public Object mo55644j(T t, int i) {
            if (t.mo54063B()) {
                Object h = mo55642h(t);
                if (h != null) {
                    return ((List) h).get(i);
                }
                throw new IndexOutOfBoundsException();
            }
            throw new IllegalArgumentException("getRepeatedField() can only be called on repeated fields.");
        }

        /* renamed from: k */
        public int mo55645k(T t) {
            if (t.mo54063B()) {
                Object g = mo55641g(t);
                if (g == null) {
                    return 0;
                }
                return ((List) g).size();
            }
            throw new IllegalArgumentException("getRepeatedField() can only be called on repeated fields.");
        }

        /* renamed from: l */
        public boolean mo55646l(T t) {
            if (t.mo54063B()) {
                throw new IllegalArgumentException("hasField() can only be called on non-repeated fields.");
            } else if (this.f48134a.get(t) != null) {
                return true;
            } else {
                return false;
            }
        }

        /* renamed from: m */
        public boolean mo55647m() {
            for (int i = 0; i < this.f48134a.mo54303m(); i++) {
                if (!C18909y0.m88128F(this.f48134a.mo54302l(i))) {
                    return false;
                }
            }
            for (Map.Entry<T, Object> f : this.f48134a.mo54305o()) {
                if (!C18909y0.m88128F(f)) {
                    return false;
                }
            }
            return true;
        }

        /* renamed from: n */
        public void mo55648n(C18909y0<T> y0Var) {
            mo55639d();
            for (int i = 0; i < y0Var.f48129a.mo54303m(); i++) {
                mo55649o(y0Var.f48129a.mo54302l(i));
            }
            for (Map.Entry o : y0Var.f48129a.mo54305o()) {
                mo55649o(o);
            }
        }

        /* renamed from: o */
        public final void mo55649o(Map.Entry<T, Object> entry) {
            C18912c cVar = (C18912c) entry.getKey();
            Object value = entry.getValue();
            if (value instanceof C18784k1) {
                value = ((C18784k1) value).mo54912p();
            }
            if (cVar.mo54063B()) {
                Object g = mo55641g(cVar);
                if (g == null) {
                    g = new ArrayList();
                }
                for (Object g2 : (List) value) {
                    ((List) g).add(C18909y0.m88145n(g2));
                }
                this.f48134a.put(cVar, g);
            } else if (cVar.mo54065R() == WireFormat.JavaType.MESSAGE) {
                Object g3 = mo55641g(cVar);
                if (g3 == null) {
                    this.f48134a.put(cVar, C18909y0.m88145n(value));
                } else if (g3 instanceof C18920z1.C18921a) {
                    cVar.mo54069g1((C18920z1.C18921a) g3, (C18920z1) value);
                } else {
                    this.f48134a.put(cVar, cVar.mo54069g1(((C18920z1) g3).toBuilder(), (C18920z1) value).mo54018g());
                }
            } else {
                this.f48134a.put(cVar, C18909y0.m88145n(value));
            }
        }

        /* renamed from: t */
        public void mo55650t(T t, Object obj) {
            boolean z;
            mo55639d();
            boolean z2 = false;
            if (!t.mo54063B()) {
                m88181v(t.mo54064D(), obj);
            } else if (obj instanceof List) {
                ArrayList arrayList = new ArrayList();
                arrayList.addAll((List) obj);
                for (Object next : arrayList) {
                    m88181v(t.mo54064D(), next);
                    if (this.f48137d || (next instanceof C18920z1.C18921a)) {
                        z = true;
                    } else {
                        z = false;
                    }
                    this.f48137d = z;
                }
                obj = arrayList;
            } else {
                throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
            }
            if (obj instanceof C18784k1) {
                this.f48135b = true;
            }
            if (this.f48137d || (obj instanceof C18920z1.C18921a)) {
                z2 = true;
            }
            this.f48137d = z2;
            this.f48134a.put(t, obj);
        }

        /* renamed from: u */
        public void mo55651u(T t, int i, Object obj) {
            boolean z;
            mo55639d();
            if (t.mo54063B()) {
                if (this.f48137d || (obj instanceof C18920z1.C18921a)) {
                    z = true;
                } else {
                    z = false;
                }
                this.f48137d = z;
                Object g = mo55641g(t);
                if (g != null) {
                    m88181v(t.mo54064D(), obj);
                    ((List) g).set(i, obj);
                    return;
                }
                throw new IndexOutOfBoundsException();
            }
            throw new IllegalArgumentException("getRepeatedField() can only be called on repeated fields.");
        }

        public C18911b() {
            this(C18676a3.m85499t(16));
        }

        public C18911b(C18676a3<T, Object> a3Var) {
            this.f48134a = a3Var;
            this.f48136c = true;
        }
    }

    /* renamed from: androidx.datastore.preferences.protobuf.y0$c */
    public interface C18912c<T extends C18912c<T>> extends Comparable<T> {
        /* renamed from: B */
        boolean mo54063B();

        /* renamed from: D */
        WireFormat.FieldType mo54064D();

        /* renamed from: R */
        WireFormat.JavaType mo54065R();

        /* renamed from: S */
        boolean mo54066S();

        /* renamed from: g1 */
        C18920z1.C18921a mo54069g1(C18920z1.C18921a aVar, C18920z1 z1Var);

        int getNumber();

        /* renamed from: s */
        C18753i1.C18757d<?> mo54071s();
    }

    public /* synthetic */ C18909y0(C18676a3 a3Var, C18910a aVar) {
        this(a3Var);
    }

    /* renamed from: A */
    public static int m88127A(WireFormat.FieldType fieldType, boolean z) {
        if (z) {
            return 2;
        }
        return fieldType.mo54202q();
    }

    /* renamed from: F */
    public static <T extends C18912c<T>> boolean m88128F(Map.Entry<T, Object> entry) {
        C18912c cVar = (C18912c) entry.getKey();
        if (cVar.mo54065R() == WireFormat.JavaType.MESSAGE) {
            if (cVar.mo54063B()) {
                for (C18920z1 isInitialized : (List) entry.getValue()) {
                    if (!isInitialized.isInitialized()) {
                        return false;
                    }
                }
            } else {
                Object value = entry.getValue();
                if (value instanceof C18920z1) {
                    if (!((C18920z1) value).isInitialized()) {
                        return false;
                    }
                } else if (value instanceof C18784k1) {
                    return true;
                } else {
                    throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
                }
            }
        }
        return true;
    }

    /* renamed from: G */
    public static boolean m88129G(WireFormat.FieldType fieldType, Object obj) {
        C18753i1.m86340d(obj);
        switch (C18910a.f48132a[fieldType.mo54201g().ordinal()]) {
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
                if ((obj instanceof Integer) || (obj instanceof C18753i1.C18756c)) {
                    return true;
                }
                return false;
            case 9:
                if ((obj instanceof C18920z1) || (obj instanceof C18784k1)) {
                    return true;
                }
                return false;
            default:
                return false;
        }
    }

    /* renamed from: L */
    public static <T extends C18912c<T>> C18911b<T> m88130L() {
        return new C18911b<>((C18910a) null);
    }

    /* renamed from: M */
    public static <T extends C18912c<T>> C18909y0<T> m88131M() {
        return new C18909y0<>();
    }

    /* renamed from: N */
    public static Object m88132N(C18889w wVar, WireFormat.FieldType fieldType, boolean z) throws IOException {
        if (z) {
            return WireFormat.m85347d(wVar, fieldType, WireFormat.Utf8Validation.STRICT);
        }
        return WireFormat.m85347d(wVar, fieldType, WireFormat.Utf8Validation.LOOSE);
    }

    /* renamed from: R */
    public static void m88133R(CodedOutputStream codedOutputStream, WireFormat.FieldType fieldType, int i, Object obj) throws IOException {
        if (fieldType == WireFormat.FieldType.GROUP) {
            codedOutputStream.mo53798F1(i, (C18920z1) obj);
            return;
        }
        codedOutputStream.mo53840g2(i, m88127A(fieldType, false));
        m88134S(codedOutputStream, fieldType, obj);
    }

    /* renamed from: S */
    public static void m88134S(CodedOutputStream codedOutputStream, WireFormat.FieldType fieldType, Object obj) throws IOException {
        switch (C18910a.f48133b[fieldType.ordinal()]) {
            case 1:
                codedOutputStream.mo53792A1(((Double) obj).doubleValue());
                return;
            case 2:
                codedOutputStream.mo53796E1(((Float) obj).floatValue());
                return;
            case 3:
                codedOutputStream.mo53804K1(((Long) obj).longValue());
                return;
            case 4:
                codedOutputStream.mo53844i2(((Long) obj).longValue());
                return;
            case 5:
                codedOutputStream.mo53803J1(((Integer) obj).intValue());
                return;
            case 6:
                codedOutputStream.mo53795D1(((Long) obj).longValue());
                return;
            case 7:
                codedOutputStream.mo53794C1(((Integer) obj).intValue());
                return;
            case 8:
                codedOutputStream.mo53852t1(((Boolean) obj).booleanValue());
                return;
            case 9:
                codedOutputStream.mo53800H1((C18920z1) obj);
                return;
            case 10:
                codedOutputStream.mo53808N1((C18920z1) obj);
                return;
            case 11:
                if (obj instanceof ByteString) {
                    codedOutputStream.mo53861z1((ByteString) obj);
                    return;
                } else {
                    codedOutputStream.mo53837f2((String) obj);
                    return;
                }
            case 12:
                if (obj instanceof ByteString) {
                    codedOutputStream.mo53861z1((ByteString) obj);
                    return;
                } else {
                    codedOutputStream.mo53855w1((byte[]) obj);
                    return;
                }
            case 13:
                codedOutputStream.mo53842h2(((Integer) obj).intValue());
                return;
            case 14:
                codedOutputStream.mo53829b2(((Integer) obj).intValue());
                return;
            case 15:
                codedOutputStream.mo53831c2(((Long) obj).longValue());
                return;
            case 16:
                codedOutputStream.mo53832d2(((Integer) obj).intValue());
                return;
            case 17:
                codedOutputStream.mo53834e2(((Long) obj).longValue());
                return;
            case 18:
                if (obj instanceof C18753i1.C18756c) {
                    codedOutputStream.mo53793B1(((C18753i1.C18756c) obj).getNumber());
                    return;
                } else {
                    codedOutputStream.mo53793B1(((Integer) obj).intValue());
                    return;
                }
            default:
                return;
        }
    }

    /* renamed from: T */
    public static void m88135T(C18912c<?> cVar, Object obj, CodedOutputStream codedOutputStream) throws IOException {
        WireFormat.FieldType D = cVar.mo54064D();
        int number = cVar.getNumber();
        if (cVar.mo54063B()) {
            List<Object> list = (List) obj;
            if (cVar.mo54066S()) {
                codedOutputStream.mo53840g2(number, 2);
                int i = 0;
                for (Object p : list) {
                    i += m88147p(D, p);
                }
                codedOutputStream.mo53827Z1(i);
                for (Object S : list) {
                    m88134S(codedOutputStream, D, S);
                }
                return;
            }
            for (Object R : list) {
                m88133R(codedOutputStream, D, number, R);
            }
        } else if (obj instanceof C18784k1) {
            m88133R(codedOutputStream, D, number, ((C18784k1) obj).mo54912p());
        } else {
            m88133R(codedOutputStream, D, number, obj);
        }
    }

    /* renamed from: l */
    public static <T extends C18912c<T>> C18676a3<T, Object> m88143l(C18676a3<T, Object> a3Var, boolean z) {
        C18676a3<T, Object> t = C18676a3.m85499t(16);
        for (int i = 0; i < a3Var.mo54303m(); i++) {
            m88144m(t, a3Var.mo54302l(i), z);
        }
        for (Map.Entry<T, Object> m : a3Var.mo54305o()) {
            m88144m(t, m, z);
        }
        return t;
    }

    /* renamed from: m */
    public static <T extends C18912c<T>> void m88144m(Map<T, Object> map, Map.Entry<T, Object> entry, boolean z) {
        C18912c cVar = (C18912c) entry.getKey();
        Object value = entry.getValue();
        if (value instanceof C18784k1) {
            map.put(cVar, ((C18784k1) value).mo54912p());
        } else if (!z || !(value instanceof List)) {
            map.put(cVar, value);
        } else {
            map.put(cVar, new ArrayList((List) value));
        }
    }

    /* renamed from: n */
    public static Object m88145n(Object obj) {
        if (!(obj instanceof byte[])) {
            return obj;
        }
        byte[] bArr = (byte[]) obj;
        byte[] bArr2 = new byte[bArr.length];
        System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
        return bArr2;
    }

    /* renamed from: o */
    public static int m88146o(WireFormat.FieldType fieldType, int i, Object obj) {
        int X0 = CodedOutputStream.m84492X0(i);
        if (fieldType == WireFormat.FieldType.GROUP) {
            X0 *= 2;
        }
        return X0 + m88147p(fieldType, obj);
    }

    /* renamed from: p */
    public static int m88147p(WireFormat.FieldType fieldType, Object obj) {
        switch (C18910a.f48133b[fieldType.ordinal()]) {
            case 1:
                return CodedOutputStream.m84510j0(((Double) obj).doubleValue());
            case 2:
                return CodedOutputStream.m84526r0(((Float) obj).floatValue());
            case 3:
                return CodedOutputStream.m84534z0(((Long) obj).longValue());
            case 4:
                return CodedOutputStream.m84499b1(((Long) obj).longValue());
            case 5:
                return CodedOutputStream.m84532x0(((Integer) obj).intValue());
            case 6:
                return CodedOutputStream.m84522p0(((Long) obj).longValue());
            case 7:
                return CodedOutputStream.m84518n0(((Integer) obj).intValue());
            case 8:
                return CodedOutputStream.m84498b0(((Boolean) obj).booleanValue());
            case 9:
                return CodedOutputStream.m84529u0((C18920z1) obj);
            case 10:
                if (obj instanceof C18784k1) {
                    return CodedOutputStream.m84471C0((C18784k1) obj);
                }
                return CodedOutputStream.m84476H0((C18920z1) obj);
            case 11:
                if (obj instanceof ByteString) {
                    return CodedOutputStream.m84507h0((ByteString) obj);
                }
                return CodedOutputStream.m84491W0((String) obj);
            case 12:
                if (obj instanceof ByteString) {
                    return CodedOutputStream.m84507h0((ByteString) obj);
                }
                return CodedOutputStream.m84502d0((byte[]) obj);
            case 13:
                return CodedOutputStream.m84495Z0(((Integer) obj).intValue());
            case 14:
                return CodedOutputStream.m84483O0(((Integer) obj).intValue());
            case 15:
                return CodedOutputStream.m84485Q0(((Long) obj).longValue());
            case 16:
                return CodedOutputStream.m84487S0(((Integer) obj).intValue());
            case 17:
                return CodedOutputStream.m84489U0(((Long) obj).longValue());
            case 18:
                if (obj instanceof C18753i1.C18756c) {
                    return CodedOutputStream.m84514l0(((C18753i1.C18756c) obj).getNumber());
                }
                return CodedOutputStream.m84514l0(((Integer) obj).intValue());
            default:
                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
        }
    }

    /* renamed from: q */
    public static int m88148q(C18912c<?> cVar, Object obj) {
        WireFormat.FieldType D = cVar.mo54064D();
        int number = cVar.getNumber();
        if (!cVar.mo54063B()) {
            return m88146o(D, number, obj);
        }
        int i = 0;
        if (cVar.mo54066S()) {
            for (Object p : (List) obj) {
                i += m88147p(D, p);
            }
            return CodedOutputStream.m84492X0(number) + i + CodedOutputStream.m84480L0(i);
        }
        for (Object o : (List) obj) {
            i += m88146o(D, number, o);
        }
        return i;
    }

    /* renamed from: s */
    public static <T extends C18912c<T>> C18909y0<T> m88149s() {
        return f48128e;
    }

    /* renamed from: B */
    public boolean mo55607B(T t) {
        if (t.mo54063B()) {
            throw new IllegalArgumentException("hasField() can only be called on non-repeated fields.");
        } else if (this.f48129a.get(t) != null) {
            return true;
        } else {
            return false;
        }
    }

    /* renamed from: C */
    public boolean mo55608C() {
        return this.f48129a.isEmpty();
    }

    /* renamed from: D */
    public boolean mo55609D() {
        return this.f48130b;
    }

    /* renamed from: E */
    public boolean mo55610E() {
        for (int i = 0; i < this.f48129a.mo54303m(); i++) {
            if (!m88128F(this.f48129a.mo54302l(i))) {
                return false;
            }
        }
        for (Map.Entry<T, Object> F : this.f48129a.mo54305o()) {
            if (!m88128F(F)) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: H */
    public Iterator<Map.Entry<T, Object>> mo55611H() {
        if (this.f48131c) {
            return new C18784k1.C18787c(this.f48129a.entrySet().iterator());
        }
        return this.f48129a.entrySet().iterator();
    }

    /* renamed from: I */
    public void mo55612I() {
        if (!this.f48130b) {
            this.f48129a.mo54311s();
            this.f48130b = true;
        }
    }

    /* renamed from: J */
    public void mo55613J(C18909y0<T> y0Var) {
        for (int i = 0; i < y0Var.f48129a.mo54303m(); i++) {
            mo55614K(y0Var.f48129a.mo54302l(i));
        }
        for (Map.Entry<T, Object> K : y0Var.f48129a.mo54305o()) {
            mo55614K(K);
        }
    }

    /* renamed from: K */
    public final void mo55614K(Map.Entry<T, Object> entry) {
        C18912c cVar = (C18912c) entry.getKey();
        Object value = entry.getValue();
        if (value instanceof C18784k1) {
            value = ((C18784k1) value).mo54912p();
        }
        if (cVar.mo54063B()) {
            Object u = mo55630u(cVar);
            if (u == null) {
                u = new ArrayList();
            }
            for (Object n : (List) value) {
                ((List) u).add(m88145n(n));
            }
            this.f48129a.put(cVar, u);
        } else if (cVar.mo54065R() == WireFormat.JavaType.MESSAGE) {
            Object u2 = mo55630u(cVar);
            if (u2 == null) {
                this.f48129a.put(cVar, m88145n(value));
                return;
            }
            this.f48129a.put(cVar, cVar.mo54069g1(((C18920z1) u2).toBuilder(), (C18920z1) value).mo54018g());
        } else {
            this.f48129a.put(cVar, m88145n(value));
        }
    }

    /* renamed from: O */
    public void mo55615O(T t, Object obj) {
        if (!t.mo54063B()) {
            mo55617Q(t.mo54064D(), obj);
        } else if (obj instanceof List) {
            ArrayList<Object> arrayList = new ArrayList<>();
            arrayList.addAll((List) obj);
            for (Object Q : arrayList) {
                mo55617Q(t.mo54064D(), Q);
            }
            obj = arrayList;
        } else {
            throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
        }
        if (obj instanceof C18784k1) {
            this.f48131c = true;
        }
        this.f48129a.put(t, obj);
    }

    /* renamed from: P */
    public void mo55616P(T t, int i, Object obj) {
        if (t.mo54063B()) {
            Object u = mo55630u(t);
            if (u != null) {
                mo55617Q(t.mo54064D(), obj);
                ((List) u).set(i, obj);
                return;
            }
            throw new IndexOutOfBoundsException();
        }
        throw new IllegalArgumentException("getRepeatedField() can only be called on repeated fields.");
    }

    /* renamed from: Q */
    public final void mo55617Q(WireFormat.FieldType fieldType, Object obj) {
        if (!m88129G(fieldType, obj)) {
            throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
        }
    }

    /* renamed from: U */
    public void mo55618U(CodedOutputStream codedOutputStream) throws IOException {
        for (int i = 0; i < this.f48129a.mo54303m(); i++) {
            mo55619V(this.f48129a.mo54302l(i), codedOutputStream);
        }
        for (Map.Entry<T, Object> V : this.f48129a.mo54305o()) {
            mo55619V(V, codedOutputStream);
        }
    }

    /* renamed from: V */
    public final void mo55619V(Map.Entry<T, Object> entry, CodedOutputStream codedOutputStream) throws IOException {
        C18912c cVar = (C18912c) entry.getKey();
        if (cVar.mo54065R() != WireFormat.JavaType.MESSAGE || cVar.mo54063B() || cVar.mo54066S()) {
            m88135T(cVar, entry.getValue(), codedOutputStream);
            return;
        }
        Object value = entry.getValue();
        if (value instanceof C18784k1) {
            value = ((C18784k1) value).mo54912p();
        }
        codedOutputStream.mo53811P1(((C18912c) entry.getKey()).getNumber(), (C18920z1) value);
    }

    /* renamed from: W */
    public void mo55620W(CodedOutputStream codedOutputStream) throws IOException {
        for (int i = 0; i < this.f48129a.mo54303m(); i++) {
            Map.Entry<T, Object> l = this.f48129a.mo54302l(i);
            m88135T((C18912c) l.getKey(), l.getValue(), codedOutputStream);
        }
        for (Map.Entry next : this.f48129a.mo54305o()) {
            m88135T((C18912c) next.getKey(), next.getValue(), codedOutputStream);
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C18909y0)) {
            return false;
        }
        return this.f48129a.equals(((C18909y0) obj).f48129a);
    }

    /* renamed from: h */
    public void mo55623h(T t, Object obj) {
        List list;
        if (t.mo54063B()) {
            mo55617Q(t.mo54064D(), obj);
            Object u = mo55630u(t);
            if (u == null) {
                list = new ArrayList();
                this.f48129a.put(t, list);
            } else {
                list = (List) u;
            }
            list.add(obj);
            return;
        }
        throw new IllegalArgumentException("addRepeatedField() can only be called on repeated fields.");
    }

    public int hashCode() {
        return this.f48129a.hashCode();
    }

    /* renamed from: i */
    public void mo55625i() {
        this.f48129a.clear();
        this.f48131c = false;
    }

    /* renamed from: j */
    public void mo55626j(T t) {
        this.f48129a.remove(t);
        if (this.f48129a.isEmpty()) {
            this.f48131c = false;
        }
    }

    /* renamed from: k */
    public C18909y0<T> clone() {
        C18909y0<T> M = m88131M();
        for (int i = 0; i < this.f48129a.mo54303m(); i++) {
            Map.Entry<T, Object> l = this.f48129a.mo54302l(i);
            M.mo55615O((C18912c) l.getKey(), l.getValue());
        }
        for (Map.Entry next : this.f48129a.mo54305o()) {
            M.mo55615O((C18912c) next.getKey(), next.getValue());
        }
        M.f48131c = this.f48131c;
        return M;
    }

    /* renamed from: r */
    public Iterator<Map.Entry<T, Object>> mo55628r() {
        if (this.f48131c) {
            return new C18784k1.C18787c(this.f48129a.mo54300i().iterator());
        }
        return this.f48129a.mo54300i().iterator();
    }

    /* renamed from: t */
    public Map<T, Object> mo55629t() {
        if (this.f48131c) {
            C18676a3<T, Object> l = m88143l(this.f48129a, false);
            if (this.f48129a.mo54309r()) {
                l.mo54311s();
            }
            return l;
        } else if (this.f48129a.mo54309r()) {
            return this.f48129a;
        } else {
            return Collections.unmodifiableMap(this.f48129a);
        }
    }

    /* renamed from: u */
    public Object mo55630u(T t) {
        Object obj = this.f48129a.get(t);
        if (obj instanceof C18784k1) {
            return ((C18784k1) obj).mo54912p();
        }
        return obj;
    }

    /* renamed from: v */
    public int mo55631v() {
        int i = 0;
        for (int i2 = 0; i2 < this.f48129a.mo54303m(); i2++) {
            i += mo55632w(this.f48129a.mo54302l(i2));
        }
        for (Map.Entry<T, Object> w : this.f48129a.mo54305o()) {
            i += mo55632w(w);
        }
        return i;
    }

    /* renamed from: w */
    public final int mo55632w(Map.Entry<T, Object> entry) {
        C18912c cVar = (C18912c) entry.getKey();
        Object value = entry.getValue();
        if (cVar.mo54065R() != WireFormat.JavaType.MESSAGE || cVar.mo54063B() || cVar.mo54066S()) {
            return m88148q(cVar, value);
        }
        if (value instanceof C18784k1) {
            return CodedOutputStream.m84469A0(((C18912c) entry.getKey()).getNumber(), (C18784k1) value);
        }
        return CodedOutputStream.m84473E0(((C18912c) entry.getKey()).getNumber(), (C18920z1) value);
    }

    /* renamed from: x */
    public Object mo55633x(T t, int i) {
        if (t.mo54063B()) {
            Object u = mo55630u(t);
            if (u != null) {
                return ((List) u).get(i);
            }
            throw new IndexOutOfBoundsException();
        }
        throw new IllegalArgumentException("getRepeatedField() can only be called on repeated fields.");
    }

    /* renamed from: y */
    public int mo55634y(T t) {
        if (t.mo54063B()) {
            Object u = mo55630u(t);
            if (u == null) {
                return 0;
            }
            return ((List) u).size();
        }
        throw new IllegalArgumentException("getRepeatedField() can only be called on repeated fields.");
    }

    /* renamed from: z */
    public int mo55635z() {
        int i = 0;
        for (int i2 = 0; i2 < this.f48129a.mo54303m(); i2++) {
            Map.Entry<T, Object> l = this.f48129a.mo54302l(i2);
            i += m88148q((C18912c) l.getKey(), l.getValue());
        }
        for (Map.Entry next : this.f48129a.mo54305o()) {
            i += m88148q((C18912c) next.getKey(), next.getValue());
        }
        return i;
    }

    public C18909y0() {
        this.f48129a = C18676a3.m85499t(16);
    }

    public C18909y0(boolean z) {
        this(C18676a3.m85499t(0));
        mo55612I();
    }

    public C18909y0(C18676a3<T, Object> a3Var) {
        this.f48129a = a3Var;
        mo55612I();
    }
}
