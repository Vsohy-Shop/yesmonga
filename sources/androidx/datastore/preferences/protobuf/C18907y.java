package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.C18868t1;
import androidx.datastore.preferences.protobuf.Writer;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

/* renamed from: androidx.datastore.preferences.protobuf.y */
public final class C18907y implements Writer {

    /* renamed from: a */
    public final CodedOutputStream f48125a;

    /* renamed from: androidx.datastore.preferences.protobuf.y$a */
    public static /* synthetic */ class C18908a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f48126a;

        /* JADX WARNING: Can't wrap try/catch for region: R(26:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|17|18|19|20|21|22|23|24|26) */
        /* JADX WARNING: Code restructure failed: missing block: B:27:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x003e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0049 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0054 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0060 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x006c */
        /* JADX WARNING: Missing exception handler attribute for start block: B:21:0x0078 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:23:0x0084 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                androidx.datastore.preferences.protobuf.WireFormat$FieldType[] r0 = androidx.datastore.preferences.protobuf.WireFormat.FieldType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f48126a = r0
                androidx.datastore.preferences.protobuf.WireFormat$FieldType r1 = androidx.datastore.preferences.protobuf.WireFormat.FieldType.BOOL     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f48126a     // Catch:{ NoSuchFieldError -> 0x001d }
                androidx.datastore.preferences.protobuf.WireFormat$FieldType r1 = androidx.datastore.preferences.protobuf.WireFormat.FieldType.FIXED32     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f48126a     // Catch:{ NoSuchFieldError -> 0x0028 }
                androidx.datastore.preferences.protobuf.WireFormat$FieldType r1 = androidx.datastore.preferences.protobuf.WireFormat.FieldType.INT32     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f48126a     // Catch:{ NoSuchFieldError -> 0x0033 }
                androidx.datastore.preferences.protobuf.WireFormat$FieldType r1 = androidx.datastore.preferences.protobuf.WireFormat.FieldType.SFIXED32     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f48126a     // Catch:{ NoSuchFieldError -> 0x003e }
                androidx.datastore.preferences.protobuf.WireFormat$FieldType r1 = androidx.datastore.preferences.protobuf.WireFormat.FieldType.SINT32     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = f48126a     // Catch:{ NoSuchFieldError -> 0x0049 }
                androidx.datastore.preferences.protobuf.WireFormat$FieldType r1 = androidx.datastore.preferences.protobuf.WireFormat.FieldType.UINT32     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r0 = f48126a     // Catch:{ NoSuchFieldError -> 0x0054 }
                androidx.datastore.preferences.protobuf.WireFormat$FieldType r1 = androidx.datastore.preferences.protobuf.WireFormat.FieldType.FIXED64     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                int[] r0 = f48126a     // Catch:{ NoSuchFieldError -> 0x0060 }
                androidx.datastore.preferences.protobuf.WireFormat$FieldType r1 = androidx.datastore.preferences.protobuf.WireFormat.FieldType.INT64     // Catch:{ NoSuchFieldError -> 0x0060 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0060 }
                r2 = 8
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0060 }
            L_0x0060:
                int[] r0 = f48126a     // Catch:{ NoSuchFieldError -> 0x006c }
                androidx.datastore.preferences.protobuf.WireFormat$FieldType r1 = androidx.datastore.preferences.protobuf.WireFormat.FieldType.SFIXED64     // Catch:{ NoSuchFieldError -> 0x006c }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x006c }
                r2 = 9
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x006c }
            L_0x006c:
                int[] r0 = f48126a     // Catch:{ NoSuchFieldError -> 0x0078 }
                androidx.datastore.preferences.protobuf.WireFormat$FieldType r1 = androidx.datastore.preferences.protobuf.WireFormat.FieldType.SINT64     // Catch:{ NoSuchFieldError -> 0x0078 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0078 }
                r2 = 10
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0078 }
            L_0x0078:
                int[] r0 = f48126a     // Catch:{ NoSuchFieldError -> 0x0084 }
                androidx.datastore.preferences.protobuf.WireFormat$FieldType r1 = androidx.datastore.preferences.protobuf.WireFormat.FieldType.UINT64     // Catch:{ NoSuchFieldError -> 0x0084 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0084 }
                r2 = 11
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0084 }
            L_0x0084:
                int[] r0 = f48126a     // Catch:{ NoSuchFieldError -> 0x0090 }
                androidx.datastore.preferences.protobuf.WireFormat$FieldType r1 = androidx.datastore.preferences.protobuf.WireFormat.FieldType.STRING     // Catch:{ NoSuchFieldError -> 0x0090 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0090 }
                r2 = 12
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0090 }
            L_0x0090:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.C18907y.C18908a.<clinit>():void");
        }
    }

    public C18907y(CodedOutputStream codedOutputStream) {
        CodedOutputStream codedOutputStream2 = (CodedOutputStream) C18753i1.m86341e(codedOutputStream, "output");
        this.f48125a = codedOutputStream2;
        codedOutputStream2.f47489a = this;
    }

    /* renamed from: T */
    public static C18907y m88074T(CodedOutputStream codedOutputStream) {
        C18907y yVar = codedOutputStream.f47489a;
        if (yVar != null) {
            return yVar;
        }
        return new C18907y(codedOutputStream);
    }

    /* renamed from: A */
    public void mo54206A(int i) throws IOException {
        this.f48125a.mo53840g2(i, 3);
    }

    /* renamed from: B */
    public void mo54207B(int i, List<Long> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.f48125a.mo53840g2(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += CodedOutputStream.m84522p0(list.get(i4).longValue());
            }
            this.f48125a.mo53842h2(i3);
            while (i2 < list.size()) {
                this.f48125a.mo53795D1(list.get(i2).longValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f48125a.mo53851t(i, list.get(i2).longValue());
            i2++;
        }
    }

    /* renamed from: C */
    public void mo54208C(int i, List<Integer> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.f48125a.mo53840g2(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += CodedOutputStream.m84483O0(list.get(i4).intValue());
            }
            this.f48125a.mo53842h2(i3);
            while (i2 < list.size()) {
                this.f48125a.mo53829b2(list.get(i2).intValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f48125a.mo53860z(i, list.get(i2).intValue());
            i2++;
        }
    }

    /* renamed from: D */
    public void mo54209D(int i, List<Boolean> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.f48125a.mo53840g2(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += CodedOutputStream.m84498b0(list.get(i4).booleanValue());
            }
            this.f48125a.mo53842h2(i3);
            while (i2 < list.size()) {
                this.f48125a.mo53852t1(list.get(i2).booleanValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f48125a.mo53858y(i, list.get(i2).booleanValue());
            i2++;
        }
    }

    /* renamed from: E */
    public void mo54210E(int i, Object obj) throws IOException {
        this.f48125a.mo53798F1(i, (C18920z1) obj);
    }

    /* renamed from: F */
    public void mo54211F(int i, float f) throws IOException {
        this.f48125a.mo53797F(i, f);
    }

    /* renamed from: G */
    public void mo54212G(int i) throws IOException {
        this.f48125a.mo53840g2(i, 4);
    }

    /* renamed from: H */
    public void mo54213H(int i, List<Integer> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.f48125a.mo53840g2(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += CodedOutputStream.m84487S0(list.get(i4).intValue());
            }
            this.f48125a.mo53842h2(i3);
            while (i2 < list.size()) {
                this.f48125a.mo53832d2(list.get(i2).intValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f48125a.mo53805L(i, list.get(i2).intValue());
            i2++;
        }
    }

    /* renamed from: I */
    public void mo54214I(int i, int i2) throws IOException {
        this.f48125a.mo53801I(i, i2);
    }

    /* renamed from: J */
    public void mo54215J(int i, List<Long> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.f48125a.mo53840g2(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += CodedOutputStream.m84534z0(list.get(i4).longValue());
            }
            this.f48125a.mo53842h2(i3);
            while (i2 < list.size()) {
                this.f48125a.mo53804K1(list.get(i2).longValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f48125a.mo53856x(i, list.get(i2).longValue());
            i2++;
        }
    }

    /* renamed from: K */
    public void mo54216K(int i, List<Double> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.f48125a.mo53840g2(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += CodedOutputStream.m84510j0(list.get(i4).doubleValue());
            }
            this.f48125a.mo53842h2(i3);
            while (i2 < list.size()) {
                this.f48125a.mo53792A1(list.get(i2).doubleValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f48125a.mo53848q(i, list.get(i2).doubleValue());
            i2++;
        }
    }

    /* renamed from: L */
    public void mo54217L(int i, int i2) throws IOException {
        this.f48125a.mo53805L(i, i2);
    }

    /* renamed from: M */
    public void mo54218M(int i, List<ByteString> list) throws IOException {
        for (int i2 = 0; i2 < list.size(); i2++) {
            this.f48125a.mo53809O(i, list.get(i2));
        }
    }

    /* renamed from: N */
    public void mo54219N(int i, List<?> list, C18905x2 x2Var) throws IOException {
        for (int i2 = 0; i2 < list.size(); i2++) {
            mo54223R(i, list.get(i2), x2Var);
        }
    }

    /* renamed from: O */
    public void mo54220O(int i, ByteString byteString) throws IOException {
        this.f48125a.mo53809O(i, byteString);
    }

    /* renamed from: P */
    public void mo54221P(int i, Object obj, C18905x2 x2Var) throws IOException {
        this.f48125a.mo53807M1(i, (C18920z1) obj, x2Var);
    }

    /* renamed from: Q */
    public <K, V> void mo54222Q(int i, C18868t1.C18870b<K, V> bVar, Map<K, V> map) throws IOException {
        if (this.f48125a.mo53841h1()) {
            mo55604Y(i, bVar, map);
            return;
        }
        for (Map.Entry next : map.entrySet()) {
            this.f48125a.mo53840g2(i, 2);
            this.f48125a.mo53842h2(C18868t1.m87467b(bVar, next.getKey(), next.getValue()));
            C18868t1.m87471l(this.f48125a, bVar, next.getKey(), next.getValue());
        }
    }

    /* renamed from: R */
    public void mo54223R(int i, Object obj, C18905x2 x2Var) throws IOException {
        this.f48125a.mo53799G1(i, (C18920z1) obj, x2Var);
    }

    /* renamed from: S */
    public void mo54224S(int i, List<?> list, C18905x2 x2Var) throws IOException {
        for (int i2 = 0; i2 < list.size(); i2++) {
            mo54221P(i, list.get(i2), x2Var);
        }
    }

    /* renamed from: U */
    public int mo55600U() {
        return this.f48125a.mo53836f1();
    }

    /* renamed from: V */
    public final <V> void mo55601V(int i, boolean z, V v, C18868t1.C18870b<Boolean, V> bVar) throws IOException {
        this.f48125a.mo53840g2(i, 2);
        this.f48125a.mo53842h2(C18868t1.m87467b(bVar, Boolean.valueOf(z), v));
        C18868t1.m87471l(this.f48125a, bVar, Boolean.valueOf(z), v);
    }

    /* renamed from: W */
    public final <V> void mo55602W(int i, C18868t1.C18870b<Integer, V> bVar, Map<Integer, V> map) throws IOException {
        int size = map.size();
        int[] iArr = new int[size];
        int i2 = 0;
        for (Integer intValue : map.keySet()) {
            iArr[i2] = intValue.intValue();
            i2++;
        }
        Arrays.sort(iArr);
        for (int i3 = 0; i3 < size; i3++) {
            int i4 = iArr[i3];
            V v = map.get(Integer.valueOf(i4));
            this.f48125a.mo53840g2(i, 2);
            this.f48125a.mo53842h2(C18868t1.m87467b(bVar, Integer.valueOf(i4), v));
            C18868t1.m87471l(this.f48125a, bVar, Integer.valueOf(i4), v);
        }
    }

    /* renamed from: X */
    public final <V> void mo55603X(int i, C18868t1.C18870b<Long, V> bVar, Map<Long, V> map) throws IOException {
        int size = map.size();
        long[] jArr = new long[size];
        int i2 = 0;
        for (Long longValue : map.keySet()) {
            jArr[i2] = longValue.longValue();
            i2++;
        }
        Arrays.sort(jArr);
        for (int i3 = 0; i3 < size; i3++) {
            long j = jArr[i3];
            V v = map.get(Long.valueOf(j));
            this.f48125a.mo53840g2(i, 2);
            this.f48125a.mo53842h2(C18868t1.m87467b(bVar, Long.valueOf(j), v));
            C18868t1.m87471l(this.f48125a, bVar, Long.valueOf(j), v);
        }
    }

    /* renamed from: Y */
    public final <K, V> void mo55604Y(int i, C18868t1.C18870b<K, V> bVar, Map<K, V> map) throws IOException {
        switch (C18908a.f48126a[bVar.f48041a.ordinal()]) {
            case 1:
                V v = map.get(Boolean.FALSE);
                if (v != null) {
                    mo55601V(i, false, v, bVar);
                }
                V v2 = map.get(Boolean.TRUE);
                if (v2 != null) {
                    mo55601V(i, true, v2, bVar);
                    return;
                }
                return;
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                mo55602W(i, bVar, map);
                return;
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
                mo55603X(i, bVar, map);
                return;
            case 12:
                mo55605Z(i, bVar, map);
                return;
            default:
                throw new IllegalArgumentException("does not support key type: " + bVar.f48041a);
        }
    }

    /* renamed from: Z */
    public final <V> void mo55605Z(int i, C18868t1.C18870b<String, V> bVar, Map<String, V> map) throws IOException {
        int size = map.size();
        String[] strArr = new String[size];
        int i2 = 0;
        for (String str : map.keySet()) {
            strArr[i2] = str;
            i2++;
        }
        Arrays.sort(strArr);
        for (int i3 = 0; i3 < size; i3++) {
            String str2 = strArr[i3];
            V v = map.get(str2);
            this.f48125a.mo53840g2(i, 2);
            this.f48125a.mo53842h2(C18868t1.m87467b(bVar, str2, v));
            C18868t1.m87471l(this.f48125a, bVar, str2, v);
        }
    }

    /* renamed from: a */
    public void mo54225a(int i, List<Float> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.f48125a.mo53840g2(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += CodedOutputStream.m84526r0(list.get(i4).floatValue());
            }
            this.f48125a.mo53842h2(i3);
            while (i2 < list.size()) {
                this.f48125a.mo53796E1(list.get(i2).floatValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f48125a.mo53797F(i, list.get(i2).floatValue());
            i2++;
        }
    }

    /* renamed from: a0 */
    public final void mo55606a0(int i, Object obj) throws IOException {
        if (obj instanceof String) {
            this.f48125a.mo53835f(i, (String) obj);
        } else {
            this.f48125a.mo53809O(i, (ByteString) obj);
        }
    }

    /* renamed from: b */
    public final void mo54226b(int i, Object obj) throws IOException {
        if (obj instanceof ByteString) {
            this.f48125a.mo53825Y1(i, (ByteString) obj);
        } else {
            this.f48125a.mo53811P1(i, (C18920z1) obj);
        }
    }

    /* renamed from: c */
    public void mo54227c(int i, int i2) throws IOException {
        this.f48125a.mo53830c(i, i2);
    }

    /* renamed from: d */
    public void mo54228d(int i, List<?> list) throws IOException {
        for (int i2 = 0; i2 < list.size(); i2++) {
            mo54210E(i, list.get(i2));
        }
    }

    /* renamed from: e */
    public void mo54229e(int i, List<String> list) throws IOException {
        int i2 = 0;
        if (list instanceof C18818n1) {
            C18818n1 n1Var = (C18818n1) list;
            while (i2 < list.size()) {
                mo55606a0(i, n1Var.mo55034g0(i2));
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f48125a.mo53835f(i, list.get(i2));
            i2++;
        }
    }

    /* renamed from: f */
    public void mo54230f(int i, String str) throws IOException {
        this.f48125a.mo53835f(i, str);
    }

    /* renamed from: g */
    public void mo54231g(int i, long j) throws IOException {
        this.f48125a.mo53838g(i, j);
    }

    /* renamed from: h */
    public void mo54232h(int i, List<Integer> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.f48125a.mo53840g2(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += CodedOutputStream.m84532x0(list.get(i4).intValue());
            }
            this.f48125a.mo53842h2(i3);
            while (i2 < list.size()) {
                this.f48125a.mo53803J1(list.get(i2).intValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f48125a.mo53843i(i, list.get(i2).intValue());
            i2++;
        }
    }

    /* renamed from: i */
    public void mo54233i(int i, int i2) throws IOException {
        this.f48125a.mo53843i(i, i2);
    }

    /* renamed from: j */
    public void mo54234j(int i, long j) throws IOException {
        this.f48125a.mo53845j(i, j);
    }

    /* renamed from: k */
    public void mo54235k(int i, List<Integer> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.f48125a.mo53840g2(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += CodedOutputStream.m84518n0(list.get(i4).intValue());
            }
            this.f48125a.mo53842h2(i3);
            while (i2 < list.size()) {
                this.f48125a.mo53794C1(list.get(i2).intValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f48125a.mo53830c(i, list.get(i2).intValue());
            i2++;
        }
    }

    /* renamed from: l */
    public void mo54236l(int i, List<Integer> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.f48125a.mo53840g2(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += CodedOutputStream.m84495Z0(list.get(i4).intValue());
            }
            this.f48125a.mo53842h2(i3);
            while (i2 < list.size()) {
                this.f48125a.mo53842h2(list.get(i2).intValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f48125a.mo53847p(i, list.get(i2).intValue());
            i2++;
        }
    }

    /* renamed from: m */
    public void mo54237m(int i, List<Long> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.f48125a.mo53840g2(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += CodedOutputStream.m84489U0(list.get(i4).longValue());
            }
            this.f48125a.mo53842h2(i3);
            while (i2 < list.size()) {
                this.f48125a.mo53834e2(list.get(i2).longValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f48125a.mo53846n(i, list.get(i2).longValue());
            i2++;
        }
    }

    /* renamed from: n */
    public void mo54238n(int i, long j) throws IOException {
        this.f48125a.mo53846n(i, j);
    }

    /* renamed from: o */
    public void mo54239o(int i, List<Integer> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.f48125a.mo53840g2(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += CodedOutputStream.m84514l0(list.get(i4).intValue());
            }
            this.f48125a.mo53842h2(i3);
            while (i2 < list.size()) {
                this.f48125a.mo53793B1(list.get(i2).intValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f48125a.mo53801I(i, list.get(i2).intValue());
            i2++;
        }
    }

    /* renamed from: p */
    public void mo54240p(int i, int i2) throws IOException {
        this.f48125a.mo53847p(i, i2);
    }

    /* renamed from: q */
    public void mo54241q(int i, double d) throws IOException {
        this.f48125a.mo53848q(i, d);
    }

    /* renamed from: r */
    public void mo54242r(int i, List<Long> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.f48125a.mo53840g2(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += CodedOutputStream.m84485Q0(list.get(i4).longValue());
            }
            this.f48125a.mo53842h2(i3);
            while (i2 < list.size()) {
                this.f48125a.mo53831c2(list.get(i2).longValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f48125a.mo53845j(i, list.get(i2).longValue());
            i2++;
        }
    }

    /* renamed from: s */
    public void mo54243s(int i, List<Long> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.f48125a.mo53840g2(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += CodedOutputStream.m84499b1(list.get(i4).longValue());
            }
            this.f48125a.mo53842h2(i3);
            while (i2 < list.size()) {
                this.f48125a.mo53844i2(list.get(i2).longValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f48125a.mo53838g(i, list.get(i2).longValue());
            i2++;
        }
    }

    /* renamed from: t */
    public void mo54244t(int i, long j) throws IOException {
        this.f48125a.mo53851t(i, j);
    }

    /* renamed from: u */
    public Writer.FieldOrder mo54245u() {
        return Writer.FieldOrder.ASCENDING;
    }

    /* renamed from: v */
    public void mo54246v(int i, List<?> list) throws IOException {
        for (int i2 = 0; i2 < list.size(); i2++) {
            mo54247w(i, list.get(i2));
        }
    }

    /* renamed from: w */
    public void mo54247w(int i, Object obj) throws IOException {
        this.f48125a.mo53806L1(i, (C18920z1) obj);
    }

    /* renamed from: x */
    public void mo54248x(int i, long j) throws IOException {
        this.f48125a.mo53856x(i, j);
    }

    /* renamed from: y */
    public void mo54249y(int i, boolean z) throws IOException {
        this.f48125a.mo53858y(i, z);
    }

    /* renamed from: z */
    public void mo54250z(int i, int i2) throws IOException {
        this.f48125a.mo53860z(i, i2);
    }
}
