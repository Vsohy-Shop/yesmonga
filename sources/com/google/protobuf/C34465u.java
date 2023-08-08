package com.google.protobuf;

import com.google.protobuf.C34363f1;
import com.google.protobuf.Writer;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

/* renamed from: com.google.protobuf.u */
public final class C34465u implements Writer {

    /* renamed from: a */
    public final CodedOutputStream f83521a;

    /* renamed from: com.google.protobuf.u$a */
    public static /* synthetic */ class C34466a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f83522a;

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
                com.google.protobuf.WireFormat$FieldType[] r0 = com.google.protobuf.WireFormat.FieldType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f83522a = r0
                com.google.protobuf.WireFormat$FieldType r1 = com.google.protobuf.WireFormat.FieldType.BOOL     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f83522a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.google.protobuf.WireFormat$FieldType r1 = com.google.protobuf.WireFormat.FieldType.FIXED32     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f83522a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.google.protobuf.WireFormat$FieldType r1 = com.google.protobuf.WireFormat.FieldType.INT32     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f83522a     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.google.protobuf.WireFormat$FieldType r1 = com.google.protobuf.WireFormat.FieldType.SFIXED32     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f83522a     // Catch:{ NoSuchFieldError -> 0x003e }
                com.google.protobuf.WireFormat$FieldType r1 = com.google.protobuf.WireFormat.FieldType.SINT32     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = f83522a     // Catch:{ NoSuchFieldError -> 0x0049 }
                com.google.protobuf.WireFormat$FieldType r1 = com.google.protobuf.WireFormat.FieldType.UINT32     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r0 = f83522a     // Catch:{ NoSuchFieldError -> 0x0054 }
                com.google.protobuf.WireFormat$FieldType r1 = com.google.protobuf.WireFormat.FieldType.FIXED64     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                int[] r0 = f83522a     // Catch:{ NoSuchFieldError -> 0x0060 }
                com.google.protobuf.WireFormat$FieldType r1 = com.google.protobuf.WireFormat.FieldType.INT64     // Catch:{ NoSuchFieldError -> 0x0060 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0060 }
                r2 = 8
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0060 }
            L_0x0060:
                int[] r0 = f83522a     // Catch:{ NoSuchFieldError -> 0x006c }
                com.google.protobuf.WireFormat$FieldType r1 = com.google.protobuf.WireFormat.FieldType.SFIXED64     // Catch:{ NoSuchFieldError -> 0x006c }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x006c }
                r2 = 9
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x006c }
            L_0x006c:
                int[] r0 = f83522a     // Catch:{ NoSuchFieldError -> 0x0078 }
                com.google.protobuf.WireFormat$FieldType r1 = com.google.protobuf.WireFormat.FieldType.SINT64     // Catch:{ NoSuchFieldError -> 0x0078 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0078 }
                r2 = 10
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0078 }
            L_0x0078:
                int[] r0 = f83522a     // Catch:{ NoSuchFieldError -> 0x0084 }
                com.google.protobuf.WireFormat$FieldType r1 = com.google.protobuf.WireFormat.FieldType.UINT64     // Catch:{ NoSuchFieldError -> 0x0084 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0084 }
                r2 = 11
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0084 }
            L_0x0084:
                int[] r0 = f83522a     // Catch:{ NoSuchFieldError -> 0x0090 }
                com.google.protobuf.WireFormat$FieldType r1 = com.google.protobuf.WireFormat.FieldType.STRING     // Catch:{ NoSuchFieldError -> 0x0090 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0090 }
                r2 = 12
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0090 }
            L_0x0090:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.C34465u.C34466a.<clinit>():void");
        }
    }

    public C34465u(CodedOutputStream codedOutputStream) {
        CodedOutputStream codedOutputStream2 = (CodedOutputStream) C34471v0.m140574e(codedOutputStream, "output");
        this.f83521a = codedOutputStream2;
        codedOutputStream2.f82805a = this;
    }

    /* renamed from: T */
    public static C34465u m140489T(CodedOutputStream codedOutputStream) {
        C34465u uVar = codedOutputStream.f82805a;
        if (uVar != null) {
            return uVar;
        }
        return new C34465u(codedOutputStream);
    }

    /* renamed from: A */
    public void mo100787A(int i) throws IOException {
        this.f83521a.mo99331g2(i, 3);
    }

    /* renamed from: B */
    public void mo100788B(int i, List<Long> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.f83521a.mo99331g2(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += CodedOutputStream.m137396p0(list.get(i4).longValue());
            }
            this.f83521a.mo99333h2(i3);
            while (i2 < list.size()) {
                this.f83521a.mo99286D1(list.get(i2).longValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f83521a.mo99342t(i, list.get(i2).longValue());
            i2++;
        }
    }

    /* renamed from: C */
    public void mo100789C(int i, List<Integer> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.f83521a.mo99331g2(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += CodedOutputStream.m137357O0(list.get(i4).intValue());
            }
            this.f83521a.mo99333h2(i3);
            while (i2 < list.size()) {
                this.f83521a.mo99320b2(list.get(i2).intValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f83521a.mo99351z(i, list.get(i2).intValue());
            i2++;
        }
    }

    /* renamed from: D */
    public void mo100790D(int i, List<Boolean> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.f83521a.mo99331g2(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += CodedOutputStream.m137372b0(list.get(i4).booleanValue());
            }
            this.f83521a.mo99333h2(i3);
            while (i2 < list.size()) {
                this.f83521a.mo99343t1(list.get(i2).booleanValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f83521a.mo99349y(i, list.get(i2).booleanValue());
            i2++;
        }
    }

    /* renamed from: E */
    public void mo100791E(int i, Object obj) throws IOException {
        this.f83521a.mo99289F1(i, (C34412l1) obj);
    }

    /* renamed from: F */
    public void mo100792F(int i, float f) throws IOException {
        this.f83521a.mo99288F(i, f);
    }

    /* renamed from: G */
    public void mo100793G(int i) throws IOException {
        this.f83521a.mo99331g2(i, 4);
    }

    /* renamed from: H */
    public void mo100794H(int i, List<Integer> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.f83521a.mo99331g2(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += CodedOutputStream.m137361S0(list.get(i4).intValue());
            }
            this.f83521a.mo99333h2(i3);
            while (i2 < list.size()) {
                this.f83521a.mo99323d2(list.get(i2).intValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f83521a.mo99296L(i, list.get(i2).intValue());
            i2++;
        }
    }

    /* renamed from: I */
    public void mo100795I(int i, int i2) throws IOException {
        this.f83521a.mo99292I(i, i2);
    }

    /* renamed from: J */
    public void mo100796J(int i, List<Long> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.f83521a.mo99331g2(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += CodedOutputStream.m137408z0(list.get(i4).longValue());
            }
            this.f83521a.mo99333h2(i3);
            while (i2 < list.size()) {
                this.f83521a.mo99295K1(list.get(i2).longValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f83521a.mo99347x(i, list.get(i2).longValue());
            i2++;
        }
    }

    /* renamed from: K */
    public void mo100797K(int i, List<Double> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.f83521a.mo99331g2(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += CodedOutputStream.m137384j0(list.get(i4).doubleValue());
            }
            this.f83521a.mo99333h2(i3);
            while (i2 < list.size()) {
                this.f83521a.mo99283A1(list.get(i2).doubleValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f83521a.mo99339q(i, list.get(i2).doubleValue());
            i2++;
        }
    }

    /* renamed from: L */
    public void mo100798L(int i, int i2) throws IOException {
        this.f83521a.mo99296L(i, i2);
    }

    /* renamed from: M */
    public void mo100799M(int i, List<ByteString> list) throws IOException {
        for (int i2 = 0; i2 < list.size(); i2++) {
            this.f83521a.mo99301P(i, list.get(i2));
        }
    }

    /* renamed from: N */
    public void mo100800N(int i, List<?> list, C34372g2 g2Var) throws IOException {
        for (int i2 = 0; i2 < list.size(); i2++) {
            mo100804R(i, list.get(i2), g2Var);
        }
    }

    /* renamed from: O */
    public void mo100801O(int i, Object obj, C34372g2 g2Var) throws IOException {
        this.f83521a.mo99290G1(i, (C34412l1) obj, g2Var);
    }

    /* renamed from: P */
    public void mo100802P(int i, ByteString byteString) throws IOException {
        this.f83521a.mo99301P(i, byteString);
    }

    /* renamed from: Q */
    public void mo100803Q(int i, List<?> list, C34372g2 g2Var) throws IOException {
        for (int i2 = 0; i2 < list.size(); i2++) {
            mo100801O(i, list.get(i2), g2Var);
        }
    }

    /* renamed from: R */
    public void mo100804R(int i, Object obj, C34372g2 g2Var) throws IOException {
        this.f83521a.mo99298M1(i, (C34412l1) obj, g2Var);
    }

    /* renamed from: S */
    public <K, V> void mo100805S(int i, C34363f1.C34365b<K, V> bVar, Map<K, V> map) throws IOException {
        if (this.f83521a.mo99332h1()) {
            mo101600Y(i, bVar, map);
            return;
        }
        for (Map.Entry next : map.entrySet()) {
            this.f83521a.mo99331g2(i, 2);
            this.f83521a.mo99333h2(C34363f1.m139184b(bVar, next.getKey(), next.getValue()));
            C34363f1.m139188l(this.f83521a, bVar, next.getKey(), next.getValue());
        }
    }

    /* renamed from: U */
    public int mo101596U() {
        return this.f83521a.mo99327f1();
    }

    /* renamed from: V */
    public final <V> void mo101597V(int i, boolean z, V v, C34363f1.C34365b<Boolean, V> bVar) throws IOException {
        this.f83521a.mo99331g2(i, 2);
        this.f83521a.mo99333h2(C34363f1.m139184b(bVar, Boolean.valueOf(z), v));
        C34363f1.m139188l(this.f83521a, bVar, Boolean.valueOf(z), v);
    }

    /* renamed from: W */
    public final <V> void mo101598W(int i, C34363f1.C34365b<Integer, V> bVar, Map<Integer, V> map) throws IOException {
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
            this.f83521a.mo99331g2(i, 2);
            this.f83521a.mo99333h2(C34363f1.m139184b(bVar, Integer.valueOf(i4), v));
            C34363f1.m139188l(this.f83521a, bVar, Integer.valueOf(i4), v);
        }
    }

    /* renamed from: X */
    public final <V> void mo101599X(int i, C34363f1.C34365b<Long, V> bVar, Map<Long, V> map) throws IOException {
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
            this.f83521a.mo99331g2(i, 2);
            this.f83521a.mo99333h2(C34363f1.m139184b(bVar, Long.valueOf(j), v));
            C34363f1.m139188l(this.f83521a, bVar, Long.valueOf(j), v);
        }
    }

    /* renamed from: Y */
    public final <K, V> void mo101600Y(int i, C34363f1.C34365b<K, V> bVar, Map<K, V> map) throws IOException {
        switch (C34466a.f83522a[bVar.f83268a.ordinal()]) {
            case 1:
                V v = map.get(Boolean.FALSE);
                if (v != null) {
                    mo101597V(i, false, v, bVar);
                }
                V v2 = map.get(Boolean.TRUE);
                if (v2 != null) {
                    mo101597V(i, true, v2, bVar);
                    return;
                }
                return;
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                mo101598W(i, bVar, map);
                return;
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
                mo101599X(i, bVar, map);
                return;
            case 12:
                mo101601Z(i, bVar, map);
                return;
            default:
                throw new IllegalArgumentException("does not support key type: " + bVar.f83268a);
        }
    }

    /* renamed from: Z */
    public final <V> void mo101601Z(int i, C34363f1.C34365b<String, V> bVar, Map<String, V> map) throws IOException {
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
            this.f83521a.mo99331g2(i, 2);
            this.f83521a.mo99333h2(C34363f1.m139184b(bVar, str2, v));
            C34363f1.m139188l(this.f83521a, bVar, str2, v);
        }
    }

    /* renamed from: a */
    public void mo100806a(int i, List<Float> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.f83521a.mo99331g2(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += CodedOutputStream.m137400r0(list.get(i4).floatValue());
            }
            this.f83521a.mo99333h2(i3);
            while (i2 < list.size()) {
                this.f83521a.mo99287E1(list.get(i2).floatValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f83521a.mo99288F(i, list.get(i2).floatValue());
            i2++;
        }
    }

    /* renamed from: a0 */
    public final void mo101602a0(int i, Object obj) throws IOException {
        if (obj instanceof String) {
            this.f83521a.mo99326f(i, (String) obj);
        } else {
            this.f83521a.mo99301P(i, (ByteString) obj);
        }
    }

    /* renamed from: b */
    public final void mo100807b(int i, Object obj) throws IOException {
        if (obj instanceof ByteString) {
            this.f83521a.mo99316Y1(i, (ByteString) obj);
        } else {
            this.f83521a.mo99302P1(i, (C34412l1) obj);
        }
    }

    /* renamed from: c */
    public void mo100808c(int i, int i2) throws IOException {
        this.f83521a.mo99321c(i, i2);
    }

    /* renamed from: d */
    public void mo100809d(int i, List<?> list) throws IOException {
        for (int i2 = 0; i2 < list.size(); i2++) {
            mo100791E(i, list.get(i2));
        }
    }

    /* renamed from: e */
    public void mo100810e(int i, List<String> list) throws IOException {
        int i2 = 0;
        if (list instanceof C34324a1) {
            C34324a1 a1Var = (C34324a1) list;
            while (i2 < list.size()) {
                mo101602a0(i, a1Var.mo100871g0(i2));
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f83521a.mo99326f(i, list.get(i2));
            i2++;
        }
    }

    /* renamed from: f */
    public void mo100811f(int i, String str) throws IOException {
        this.f83521a.mo99326f(i, str);
    }

    /* renamed from: g */
    public void mo100812g(int i, long j) throws IOException {
        this.f83521a.mo99329g(i, j);
    }

    /* renamed from: h */
    public void mo100813h(int i, List<Integer> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.f83521a.mo99331g2(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += CodedOutputStream.m137406x0(list.get(i4).intValue());
            }
            this.f83521a.mo99333h2(i3);
            while (i2 < list.size()) {
                this.f83521a.mo99294J1(list.get(i2).intValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f83521a.mo99334i(i, list.get(i2).intValue());
            i2++;
        }
    }

    /* renamed from: i */
    public void mo100814i(int i, int i2) throws IOException {
        this.f83521a.mo99334i(i, i2);
    }

    /* renamed from: j */
    public void mo100815j(int i, long j) throws IOException {
        this.f83521a.mo99336j(i, j);
    }

    /* renamed from: k */
    public void mo100816k(int i, List<Integer> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.f83521a.mo99331g2(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += CodedOutputStream.m137392n0(list.get(i4).intValue());
            }
            this.f83521a.mo99333h2(i3);
            while (i2 < list.size()) {
                this.f83521a.mo99285C1(list.get(i2).intValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f83521a.mo99321c(i, list.get(i2).intValue());
            i2++;
        }
    }

    /* renamed from: l */
    public void mo100817l(int i, List<Integer> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.f83521a.mo99331g2(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += CodedOutputStream.m137369Z0(list.get(i4).intValue());
            }
            this.f83521a.mo99333h2(i3);
            while (i2 < list.size()) {
                this.f83521a.mo99333h2(list.get(i2).intValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f83521a.mo99338p(i, list.get(i2).intValue());
            i2++;
        }
    }

    /* renamed from: m */
    public void mo100818m(int i, List<Long> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.f83521a.mo99331g2(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += CodedOutputStream.m137363U0(list.get(i4).longValue());
            }
            this.f83521a.mo99333h2(i3);
            while (i2 < list.size()) {
                this.f83521a.mo99325e2(list.get(i2).longValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f83521a.mo99337n(i, list.get(i2).longValue());
            i2++;
        }
    }

    /* renamed from: n */
    public void mo100819n(int i, long j) throws IOException {
        this.f83521a.mo99337n(i, j);
    }

    /* renamed from: o */
    public void mo100820o(int i, List<Integer> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.f83521a.mo99331g2(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += CodedOutputStream.m137388l0(list.get(i4).intValue());
            }
            this.f83521a.mo99333h2(i3);
            while (i2 < list.size()) {
                this.f83521a.mo99284B1(list.get(i2).intValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f83521a.mo99292I(i, list.get(i2).intValue());
            i2++;
        }
    }

    /* renamed from: p */
    public void mo100821p(int i, int i2) throws IOException {
        this.f83521a.mo99338p(i, i2);
    }

    /* renamed from: q */
    public void mo100822q(int i, double d) throws IOException {
        this.f83521a.mo99339q(i, d);
    }

    /* renamed from: r */
    public void mo100823r(int i, List<Long> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.f83521a.mo99331g2(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += CodedOutputStream.m137359Q0(list.get(i4).longValue());
            }
            this.f83521a.mo99333h2(i3);
            while (i2 < list.size()) {
                this.f83521a.mo99322c2(list.get(i2).longValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f83521a.mo99336j(i, list.get(i2).longValue());
            i2++;
        }
    }

    /* renamed from: s */
    public void mo100824s(int i, List<Long> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.f83521a.mo99331g2(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += CodedOutputStream.m137373b1(list.get(i4).longValue());
            }
            this.f83521a.mo99333h2(i3);
            while (i2 < list.size()) {
                this.f83521a.mo99335i2(list.get(i2).longValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f83521a.mo99329g(i, list.get(i2).longValue());
            i2++;
        }
    }

    /* renamed from: t */
    public void mo100825t(int i, long j) throws IOException {
        this.f83521a.mo99342t(i, j);
    }

    /* renamed from: u */
    public Writer.FieldOrder mo100826u() {
        return Writer.FieldOrder.ASCENDING;
    }

    /* renamed from: v */
    public void mo100827v(int i, List<?> list) throws IOException {
        for (int i2 = 0; i2 < list.size(); i2++) {
            mo100828w(i, list.get(i2));
        }
    }

    /* renamed from: w */
    public void mo100828w(int i, Object obj) throws IOException {
        this.f83521a.mo99297L1(i, (C34412l1) obj);
    }

    /* renamed from: x */
    public void mo100829x(int i, long j) throws IOException {
        this.f83521a.mo99347x(i, j);
    }

    /* renamed from: y */
    public void mo100830y(int i, boolean z) throws IOException {
        this.f83521a.mo99349y(i, z);
    }

    /* renamed from: z */
    public void mo100831z(int i, int i2) throws IOException {
        this.f83521a.mo99351z(i, i2);
    }
}
