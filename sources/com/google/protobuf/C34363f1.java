package com.google.protobuf;

import com.google.protobuf.C34412l1;
import com.google.protobuf.WireFormat;
import java.io.IOException;
import java.util.AbstractMap;
import java.util.Map;

/* renamed from: com.google.protobuf.f1 */
public class C34363f1<K, V> {

    /* renamed from: d */
    public static final int f83262d = 1;

    /* renamed from: e */
    public static final int f83263e = 2;

    /* renamed from: a */
    public final C34365b<K, V> f83264a;

    /* renamed from: b */
    public final K f83265b;

    /* renamed from: c */
    public final V f83266c;

    /* renamed from: com.google.protobuf.f1$a */
    public static /* synthetic */ class C34364a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f83267a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|(3:5|6|8)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        static {
            /*
                com.google.protobuf.WireFormat$FieldType[] r0 = com.google.protobuf.WireFormat.FieldType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f83267a = r0
                com.google.protobuf.WireFormat$FieldType r1 = com.google.protobuf.WireFormat.FieldType.MESSAGE     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f83267a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.google.protobuf.WireFormat$FieldType r1 = com.google.protobuf.WireFormat.FieldType.ENUM     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f83267a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.google.protobuf.WireFormat$FieldType r1 = com.google.protobuf.WireFormat.FieldType.GROUP     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.C34363f1.C34364a.<clinit>():void");
        }
    }

    /* renamed from: com.google.protobuf.f1$b */
    public static class C34365b<K, V> {

        /* renamed from: a */
        public final WireFormat.FieldType f83268a;

        /* renamed from: b */
        public final K f83269b;

        /* renamed from: c */
        public final WireFormat.FieldType f83270c;

        /* renamed from: d */
        public final V f83271d;

        public C34365b(WireFormat.FieldType fieldType, K k, WireFormat.FieldType fieldType2, V v) {
            this.f83268a = fieldType;
            this.f83269b = k;
            this.f83270c = fieldType2;
            this.f83271d = v;
        }
    }

    public C34363f1(WireFormat.FieldType fieldType, K k, WireFormat.FieldType fieldType2, V v) {
        this.f83264a = new C34365b<>(fieldType, k, fieldType2, v);
        this.f83265b = k;
        this.f83266c = v;
    }

    /* renamed from: b */
    public static <K, V> int m139184b(C34365b<K, V> bVar, K k, V v) {
        return C34425o0.m139941o(bVar.f83268a, 1, k) + C34425o0.m139941o(bVar.f83270c, 2, v);
    }

    /* renamed from: f */
    public static <K, V> C34363f1<K, V> m139185f(WireFormat.FieldType fieldType, K k, WireFormat.FieldType fieldType2, V v) {
        return new C34363f1<>(fieldType, k, fieldType2, v);
    }

    /* renamed from: h */
    public static <K, V> Map.Entry<K, V> m139186h(C34448s sVar, C34365b<K, V> bVar, C34368g0 g0Var) throws IOException {
        K k = bVar.f83269b;
        V v = bVar.f83271d;
        while (true) {
            int Y = sVar.mo101525Y();
            if (Y == 0) {
                break;
            } else if (Y == WireFormat.m138723c(1, bVar.f83268a.mo100783q())) {
                k = m139187i(sVar, g0Var, bVar.f83268a, k);
            } else if (Y == WireFormat.m138723c(2, bVar.f83270c.mo100783q())) {
                v = m139187i(sVar, g0Var, bVar.f83270c, v);
            } else if (!sVar.mo101538g0(Y)) {
                break;
            }
        }
        return new AbstractMap.SimpleImmutableEntry(k, v);
    }

    /* renamed from: i */
    public static <T> T m139187i(C34448s sVar, C34368g0 g0Var, WireFormat.FieldType fieldType, T t) throws IOException {
        int i = C34364a.f83267a[fieldType.ordinal()];
        if (i == 1) {
            C34412l1.C34413a builder = ((C34412l1) t).toBuilder();
            sVar.mo101511I(builder, g0Var);
            return builder.mo100467Q();
        } else if (i == 2) {
            return Integer.valueOf(sVar.mo101553z());
        } else {
            if (i != 3) {
                return C34425o0.m139927N(sVar, fieldType, true);
            }
            throw new RuntimeException("Groups are not allowed in maps.");
        }
    }

    /* renamed from: l */
    public static <K, V> void m139188l(CodedOutputStream codedOutputStream, C34365b<K, V> bVar, K k, V v) throws IOException {
        C34425o0.m139928R(codedOutputStream, bVar.f83268a, 1, k);
        C34425o0.m139928R(codedOutputStream, bVar.f83270c, 2, v);
    }

    /* renamed from: a */
    public int mo101046a(int i, K k, V v) {
        return CodedOutputStream.m137366X0(i) + CodedOutputStream.m137346D0(m139184b(this.f83264a, k, v));
    }

    /* renamed from: c */
    public K mo101047c() {
        return this.f83265b;
    }

    /* renamed from: d */
    public C34365b<K, V> mo101048d() {
        return this.f83264a;
    }

    /* renamed from: e */
    public V mo101049e() {
        return this.f83266c;
    }

    /* renamed from: g */
    public Map.Entry<K, V> mo101050g(ByteString byteString, C34368g0 g0Var) throws IOException {
        return m139186h(byteString.mo99254v0(), this.f83264a, g0Var);
    }

    /* renamed from: j */
    public void mo101051j(MapFieldLite<K, V> mapFieldLite, C34448s sVar, C34368g0 g0Var) throws IOException {
        int t = sVar.mo101547t(sVar.mo101516N());
        C34365b<K, V> bVar = this.f83264a;
        K k = bVar.f83269b;
        V v = bVar.f83271d;
        while (true) {
            int Y = sVar.mo101525Y();
            if (Y == 0) {
                break;
            } else if (Y == WireFormat.m138723c(1, this.f83264a.f83268a.mo100783q())) {
                k = m139187i(sVar, g0Var, this.f83264a.f83268a, k);
            } else if (Y == WireFormat.m138723c(2, this.f83264a.f83270c.mo100783q())) {
                v = m139187i(sVar, g0Var, this.f83264a.f83270c, v);
            } else if (!sVar.mo101538g0(Y)) {
                break;
            }
        }
        sVar.mo101527a(0);
        sVar.mo101546s(t);
        mapFieldLite.put(k, v);
    }

    /* renamed from: k */
    public void mo101052k(CodedOutputStream codedOutputStream, int i, K k, V v) throws IOException {
        codedOutputStream.mo99331g2(i, 2);
        codedOutputStream.mo99333h2(m139184b(this.f83264a, k, v));
        m139188l(codedOutputStream, this.f83264a, k, v);
    }

    public C34363f1(C34365b<K, V> bVar, K k, V v) {
        this.f83264a = bVar;
        this.f83265b = k;
        this.f83266c = v;
    }
}
