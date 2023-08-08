package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.C18920z1;
import androidx.datastore.preferences.protobuf.WireFormat;
import java.io.IOException;
import java.util.AbstractMap;
import java.util.Map;

/* renamed from: androidx.datastore.preferences.protobuf.t1 */
public class C18868t1<K, V> {

    /* renamed from: d */
    public static final int f48035d = 1;

    /* renamed from: e */
    public static final int f48036e = 2;

    /* renamed from: a */
    public final C18870b<K, V> f48037a;

    /* renamed from: b */
    public final K f48038b;

    /* renamed from: c */
    public final V f48039c;

    /* renamed from: androidx.datastore.preferences.protobuf.t1$a */
    public static /* synthetic */ class C18869a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f48040a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|(3:5|6|8)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        static {
            /*
                androidx.datastore.preferences.protobuf.WireFormat$FieldType[] r0 = androidx.datastore.preferences.protobuf.WireFormat.FieldType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f48040a = r0
                androidx.datastore.preferences.protobuf.WireFormat$FieldType r1 = androidx.datastore.preferences.protobuf.WireFormat.FieldType.MESSAGE     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f48040a     // Catch:{ NoSuchFieldError -> 0x001d }
                androidx.datastore.preferences.protobuf.WireFormat$FieldType r1 = androidx.datastore.preferences.protobuf.WireFormat.FieldType.ENUM     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f48040a     // Catch:{ NoSuchFieldError -> 0x0028 }
                androidx.datastore.preferences.protobuf.WireFormat$FieldType r1 = androidx.datastore.preferences.protobuf.WireFormat.FieldType.GROUP     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.C18868t1.C18869a.<clinit>():void");
        }
    }

    /* renamed from: androidx.datastore.preferences.protobuf.t1$b */
    public static class C18870b<K, V> {

        /* renamed from: a */
        public final WireFormat.FieldType f48041a;

        /* renamed from: b */
        public final K f48042b;

        /* renamed from: c */
        public final WireFormat.FieldType f48043c;

        /* renamed from: d */
        public final V f48044d;

        public C18870b(WireFormat.FieldType fieldType, K k, WireFormat.FieldType fieldType2, V v) {
            this.f48041a = fieldType;
            this.f48042b = k;
            this.f48043c = fieldType2;
            this.f48044d = v;
        }
    }

    public C18868t1(WireFormat.FieldType fieldType, K k, WireFormat.FieldType fieldType2, V v) {
        this.f48037a = new C18870b<>(fieldType, k, fieldType2, v);
        this.f48038b = k;
        this.f48039c = v;
    }

    /* renamed from: b */
    public static <K, V> int m87467b(C18870b<K, V> bVar, K k, V v) {
        return C18909y0.m88146o(bVar.f48041a, 1, k) + C18909y0.m88146o(bVar.f48043c, 2, v);
    }

    /* renamed from: f */
    public static <K, V> C18868t1<K, V> m87468f(WireFormat.FieldType fieldType, K k, WireFormat.FieldType fieldType2, V v) {
        return new C18868t1<>(fieldType, k, fieldType2, v);
    }

    /* renamed from: h */
    public static <K, V> Map.Entry<K, V> m87469h(C18889w wVar, C18870b<K, V> bVar, C18836p0 p0Var) throws IOException {
        K k = bVar.f48042b;
        V v = bVar.f48044d;
        while (true) {
            int Y = wVar.mo55498Y();
            if (Y == 0) {
                break;
            } else if (Y == WireFormat.m85346c(1, bVar.f48041a.mo54202q())) {
                k = m87470i(wVar, p0Var, bVar.f48041a, k);
            } else if (Y == WireFormat.m85346c(2, bVar.f48043c.mo54202q())) {
                v = m87470i(wVar, p0Var, bVar.f48043c, v);
            } else if (!wVar.mo55511g0(Y)) {
                break;
            }
        }
        return new AbstractMap.SimpleImmutableEntry(k, v);
    }

    /* renamed from: i */
    public static <T> T m87470i(C18889w wVar, C18836p0 p0Var, WireFormat.FieldType fieldType, T t) throws IOException {
        int i = C18869a.f48040a[fieldType.ordinal()];
        if (i == 1) {
            C18920z1.C18921a builder = ((C18920z1) t).toBuilder();
            wVar.mo55484I(builder, p0Var);
            return builder.mo54011Q();
        } else if (i == 2) {
            return Integer.valueOf(wVar.mo55526z());
        } else {
            if (i != 3) {
                return C18909y0.m88132N(wVar, fieldType, true);
            }
            throw new RuntimeException("Groups are not allowed in maps.");
        }
    }

    /* renamed from: l */
    public static <K, V> void m87471l(CodedOutputStream codedOutputStream, C18870b<K, V> bVar, K k, V v) throws IOException {
        C18909y0.m88133R(codedOutputStream, bVar.f48041a, 1, k);
        C18909y0.m88133R(codedOutputStream, bVar.f48043c, 2, v);
    }

    /* renamed from: a */
    public int mo55414a(int i, K k, V v) {
        return CodedOutputStream.m84492X0(i) + CodedOutputStream.m84472D0(m87467b(this.f48037a, k, v));
    }

    /* renamed from: c */
    public K mo55415c() {
        return this.f48038b;
    }

    /* renamed from: d */
    public C18870b<K, V> mo55416d() {
        return this.f48037a;
    }

    /* renamed from: e */
    public V mo55417e() {
        return this.f48039c;
    }

    /* renamed from: g */
    public Map.Entry<K, V> mo55418g(ByteString byteString, C18836p0 p0Var) throws IOException {
        return m87469h(byteString.mo53766v0(), this.f48037a, p0Var);
    }

    /* renamed from: j */
    public void mo55419j(MapFieldLite<K, V> mapFieldLite, C18889w wVar, C18836p0 p0Var) throws IOException {
        int t = wVar.mo55520t(wVar.mo55489N());
        C18870b<K, V> bVar = this.f48037a;
        K k = bVar.f48042b;
        V v = bVar.f48044d;
        while (true) {
            int Y = wVar.mo55498Y();
            if (Y == 0) {
                break;
            } else if (Y == WireFormat.m85346c(1, this.f48037a.f48041a.mo54202q())) {
                k = m87470i(wVar, p0Var, this.f48037a.f48041a, k);
            } else if (Y == WireFormat.m85346c(2, this.f48037a.f48043c.mo54202q())) {
                v = m87470i(wVar, p0Var, this.f48037a.f48043c, v);
            } else if (!wVar.mo55511g0(Y)) {
                break;
            }
        }
        wVar.mo55500a(0);
        wVar.mo55519s(t);
        mapFieldLite.put(k, v);
    }

    /* renamed from: k */
    public void mo55420k(CodedOutputStream codedOutputStream, int i, K k, V v) throws IOException {
        codedOutputStream.mo53840g2(i, 2);
        codedOutputStream.mo53842h2(m87467b(this.f48037a, k, v));
        m87471l(codedOutputStream, this.f48037a, k, v);
    }

    public C18868t1(C18870b<K, V> bVar, K k, V v) {
        this.f48037a = bVar;
        this.f48038b = k;
        this.f48039c = v;
    }
}
