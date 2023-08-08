package androidx.datastore.preferences;

import androidx.datastore.preferences.protobuf.ByteString;
import androidx.datastore.preferences.protobuf.C18665a;
import androidx.datastore.preferences.protobuf.C18675a2;
import androidx.datastore.preferences.protobuf.C18753i1;
import androidx.datastore.preferences.protobuf.C18836p0;
import androidx.datastore.preferences.protobuf.C18841p2;
import androidx.datastore.preferences.protobuf.C18868t1;
import androidx.datastore.preferences.protobuf.C18889w;
import androidx.datastore.preferences.protobuf.GeneratedMessageLite;
import androidx.datastore.preferences.protobuf.InvalidProtocolBufferException;
import androidx.datastore.preferences.protobuf.MapFieldLite;
import androidx.datastore.preferences.protobuf.WireFormat;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.List;
import java.util.Map;

public final class PreferencesProto {

    public static final class Value extends GeneratedMessageLite<Value, C18588a> implements C18597f {
        public static final int BOOLEAN_FIELD_NUMBER = 1;
        /* access modifiers changed from: private */
        public static final Value DEFAULT_INSTANCE;
        public static final int DOUBLE_FIELD_NUMBER = 7;
        public static final int FLOAT_FIELD_NUMBER = 2;
        public static final int INTEGER_FIELD_NUMBER = 3;
        public static final int LONG_FIELD_NUMBER = 4;
        private static volatile C18841p2<Value> PARSER = null;
        public static final int STRING_FIELD_NUMBER = 5;
        public static final int STRING_SET_FIELD_NUMBER = 6;
        private int bitField0_;
        private int valueCase_ = 0;
        private Object value_;

        public enum ValueCase {
            BOOLEAN(1),
            FLOAT(2),
            INTEGER(3),
            LONG(4),
            STRING(5),
            STRING_SET(6),
            DOUBLE(7),
            VALUE_NOT_SET(0);
            
            private final int value;

            /* access modifiers changed from: public */
            ValueCase(int i) {
                this.value = i;
            }

            /* renamed from: b */
            public static ValueCase m84168b(int i) {
                switch (i) {
                    case 0:
                        return VALUE_NOT_SET;
                    case 1:
                        return BOOLEAN;
                    case 2:
                        return FLOAT;
                    case 3:
                        return INTEGER;
                    case 4:
                        return LONG;
                    case 5:
                        return STRING;
                    case 6:
                        return STRING_SET;
                    case 7:
                        return DOUBLE;
                    default:
                        return null;
                }
            }

            @Deprecated
            /* renamed from: g */
            public static ValueCase m84169g(int i) {
                return m84168b(i);
            }

            public int getNumber() {
                return this.value;
            }
        }

        /* renamed from: androidx.datastore.preferences.PreferencesProto$Value$a */
        public static final class C18588a extends GeneratedMessageLite.C18634b<Value, C18588a> implements C18597f {
            public /* synthetic */ C18588a(C18589a aVar) {
                this();
            }

            /* renamed from: C */
            public boolean mo53609C() {
                return ((Value) this.f47641b).mo53609C();
            }

            /* renamed from: D */
            public long mo53611D() {
                return ((Value) this.f47641b).mo53611D();
            }

            /* renamed from: E0 */
            public C18588a mo53643E0() {
                mo54025u0();
                ((Value) this.f47641b).mo53636v1();
                return this;
            }

            /* renamed from: F */
            public boolean mo53613F() {
                return ((Value) this.f47641b).mo53613F();
            }

            /* renamed from: F0 */
            public C18588a mo53644F0() {
                mo54025u0();
                ((Value) this.f47641b).mo53637w1();
                return this;
            }

            /* renamed from: G0 */
            public C18588a mo53645G0() {
                mo54025u0();
                ((Value) this.f47641b).mo53639x1();
                return this;
            }

            /* renamed from: H0 */
            public C18588a mo53646H0() {
                mo54025u0();
                ((Value) this.f47641b).mo53640y1();
                return this;
            }

            /* renamed from: I */
            public boolean mo53614I() {
                return ((Value) this.f47641b).mo53614I();
            }

            /* renamed from: I0 */
            public C18588a mo53647I0() {
                mo54025u0();
                ((Value) this.f47641b).mo53641z1();
                return this;
            }

            /* renamed from: J0 */
            public C18588a mo53648J0() {
                mo54025u0();
                ((Value) this.f47641b).mo53607A1();
                return this;
            }

            /* renamed from: L0 */
            public C18588a mo53649L0() {
                mo54025u0();
                ((Value) this.f47641b).mo53608B1();
                return this;
            }

            /* renamed from: M0 */
            public C18588a mo53650M0() {
                mo54025u0();
                ((Value) this.f47641b).mo53610C1();
                return this;
            }

            /* renamed from: O */
            public boolean mo53615O() {
                return ((Value) this.f47641b).mo53615O();
            }

            /* renamed from: O0 */
            public C18588a mo53651O0(C18594d dVar) {
                mo54025u0();
                ((Value) this.f47641b).mo53612E1(dVar);
                return this;
            }

            /* renamed from: P0 */
            public C18588a mo53652P0(boolean z) {
                mo54025u0();
                ((Value) this.f47641b).mo53616V1(z);
                return this;
            }

            /* renamed from: Q0 */
            public C18588a mo53653Q0(double d) {
                mo54025u0();
                ((Value) this.f47641b).mo53617W1(d);
                return this;
            }

            /* renamed from: R0 */
            public C18588a mo53654R0(float f) {
                mo54025u0();
                ((Value) this.f47641b).mo53618Z1(f);
                return this;
            }

            /* renamed from: S0 */
            public C18588a mo53655S0(int i) {
                mo54025u0();
                ((Value) this.f47641b).mo53619a2(i);
                return this;
            }

            /* renamed from: T0 */
            public C18588a mo53656T0(long j) {
                mo54025u0();
                ((Value) this.f47641b).mo53622b2(j);
                return this;
            }

            /* renamed from: U0 */
            public C18588a mo53657U0(String str) {
                mo54025u0();
                ((Value) this.f47641b).mo53623d2(str);
                return this;
            }

            /* renamed from: V0 */
            public C18588a mo53658V0(ByteString byteString) {
                mo54025u0();
                ((Value) this.f47641b).mo53625e2(byteString);
                return this;
            }

            /* renamed from: W0 */
            public C18588a mo53659W0(C18594d.C18595a aVar) {
                mo54025u0();
                ((Value) this.f47641b).mo53626f2(aVar);
                return this;
            }

            /* renamed from: X0 */
            public C18588a mo53660X0(C18594d dVar) {
                mo54025u0();
                ((Value) this.f47641b).mo53627g2(dVar);
                return this;
            }

            /* renamed from: b */
            public ByteString mo53620b() {
                return ((Value) this.f47641b).mo53620b();
            }

            /* renamed from: e */
            public boolean mo53624e() {
                return ((Value) this.f47641b).mo53624e();
            }

            /* renamed from: i */
            public ValueCase mo53628i() {
                return ((Value) this.f47641b).mo53628i();
            }

            /* renamed from: k */
            public float mo53629k() {
                return ((Value) this.f47641b).mo53629k();
            }

            /* renamed from: l */
            public boolean mo53630l() {
                return ((Value) this.f47641b).mo53630l();
            }

            /* renamed from: m */
            public boolean mo53631m() {
                return ((Value) this.f47641b).mo53631m();
            }

            /* renamed from: n */
            public boolean mo53632n() {
                return ((Value) this.f47641b).mo53632n();
            }

            /* renamed from: s */
            public int mo53633s() {
                return ((Value) this.f47641b).mo53633s();
            }

            /* renamed from: t */
            public C18594d mo53634t() {
                return ((Value) this.f47641b).mo53634t();
            }

            /* renamed from: u */
            public double mo53635u() {
                return ((Value) this.f47641b).mo53635u();
            }

            /* renamed from: x */
            public String mo53638x() {
                return ((Value) this.f47641b).mo53638x();
            }

            public C18588a() {
                super(Value.DEFAULT_INSTANCE);
            }
        }

        static {
            Value value = new Value();
            DEFAULT_INSTANCE = value;
            GeneratedMessageLite.m84965a1(Value.class, value);
        }

        /* renamed from: D1 */
        public static Value m84098D1() {
            return DEFAULT_INSTANCE;
        }

        /* renamed from: F1 */
        public static C18588a m84099F1() {
            return (C18588a) DEFAULT_INSTANCE.mo53981V();
        }

        /* renamed from: G1 */
        public static C18588a m84100G1(Value value) {
            return (C18588a) DEFAULT_INSTANCE.mo53982Y(value);
        }

        /* renamed from: H1 */
        public static Value m84101H1(InputStream inputStream) throws IOException {
            return (Value) GeneratedMessageLite.m84944G0(DEFAULT_INSTANCE, inputStream);
        }

        /* renamed from: I1 */
        public static Value m84102I1(InputStream inputStream, C18836p0 p0Var) throws IOException {
            return (Value) GeneratedMessageLite.m84945H0(DEFAULT_INSTANCE, inputStream, p0Var);
        }

        /* renamed from: J1 */
        public static Value m84103J1(ByteString byteString) throws InvalidProtocolBufferException {
            return (Value) GeneratedMessageLite.m84946I0(DEFAULT_INSTANCE, byteString);
        }

        /* renamed from: K1 */
        public static Value m84104K1(ByteString byteString, C18836p0 p0Var) throws InvalidProtocolBufferException {
            return (Value) GeneratedMessageLite.m84947J0(DEFAULT_INSTANCE, byteString, p0Var);
        }

        /* renamed from: L1 */
        public static Value m84105L1(C18889w wVar) throws IOException {
            return (Value) GeneratedMessageLite.m84948L0(DEFAULT_INSTANCE, wVar);
        }

        /* renamed from: N1 */
        public static Value m84106N1(C18889w wVar, C18836p0 p0Var) throws IOException {
            return (Value) GeneratedMessageLite.m84949M0(DEFAULT_INSTANCE, wVar, p0Var);
        }

        /* renamed from: O1 */
        public static Value m84107O1(InputStream inputStream) throws IOException {
            return (Value) GeneratedMessageLite.m84950N0(DEFAULT_INSTANCE, inputStream);
        }

        /* renamed from: P1 */
        public static Value m84108P1(InputStream inputStream, C18836p0 p0Var) throws IOException {
            return (Value) GeneratedMessageLite.m84951O0(DEFAULT_INSTANCE, inputStream, p0Var);
        }

        /* renamed from: Q1 */
        public static Value m84109Q1(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (Value) GeneratedMessageLite.m84952P0(DEFAULT_INSTANCE, byteBuffer);
        }

        /* renamed from: R1 */
        public static Value m84110R1(ByteBuffer byteBuffer, C18836p0 p0Var) throws InvalidProtocolBufferException {
            return (Value) GeneratedMessageLite.m84953Q0(DEFAULT_INSTANCE, byteBuffer, p0Var);
        }

        /* renamed from: S1 */
        public static Value m84111S1(byte[] bArr) throws InvalidProtocolBufferException {
            return (Value) GeneratedMessageLite.m84955R0(DEFAULT_INSTANCE, bArr);
        }

        /* renamed from: T1 */
        public static Value m84112T1(byte[] bArr, C18836p0 p0Var) throws InvalidProtocolBufferException {
            return (Value) GeneratedMessageLite.m84956S0(DEFAULT_INSTANCE, bArr, p0Var);
        }

        /* renamed from: U1 */
        public static C18841p2<Value> m84113U1() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* renamed from: A1 */
        public final void mo53607A1() {
            if (this.valueCase_ == 5) {
                this.valueCase_ = 0;
                this.value_ = null;
            }
        }

        /* renamed from: B1 */
        public final void mo53608B1() {
            if (this.valueCase_ == 6) {
                this.valueCase_ = 0;
                this.value_ = null;
            }
        }

        /* renamed from: C */
        public boolean mo53609C() {
            return this.valueCase_ == 4;
        }

        /* renamed from: C1 */
        public final void mo53610C1() {
            this.valueCase_ = 0;
            this.value_ = null;
        }

        /* renamed from: D */
        public long mo53611D() {
            if (this.valueCase_ == 4) {
                return ((Long) this.value_).longValue();
            }
            return 0;
        }

        /* renamed from: E1 */
        public final void mo53612E1(C18594d dVar) {
            dVar.getClass();
            if (this.valueCase_ != 6 || this.value_ == C18594d.m84257n1()) {
                this.value_ = dVar;
            } else {
                this.value_ = ((C18594d.C18595a) C18594d.m84259p1((C18594d) this.value_).mo54029y0(dVar)).mo54011Q();
            }
            this.valueCase_ = 6;
        }

        /* renamed from: F */
        public boolean mo53613F() {
            if (this.valueCase_ == 1) {
                return ((Boolean) this.value_).booleanValue();
            }
            return false;
        }

        /* renamed from: I */
        public boolean mo53614I() {
            return this.valueCase_ == 7;
        }

        /* renamed from: O */
        public boolean mo53615O() {
            return this.valueCase_ == 6;
        }

        /* renamed from: V1 */
        public final void mo53616V1(boolean z) {
            this.valueCase_ = 1;
            this.value_ = Boolean.valueOf(z);
        }

        /* renamed from: W1 */
        public final void mo53617W1(double d) {
            this.valueCase_ = 7;
            this.value_ = Double.valueOf(d);
        }

        /* renamed from: Z1 */
        public final void mo53618Z1(float f) {
            this.valueCase_ = 2;
            this.value_ = Float.valueOf(f);
        }

        /* renamed from: a2 */
        public final void mo53619a2(int i) {
            this.valueCase_ = 3;
            this.value_ = Integer.valueOf(i);
        }

        /* renamed from: b */
        public ByteString mo53620b() {
            String str;
            if (this.valueCase_ == 5) {
                str = (String) this.value_;
            } else {
                str = "";
            }
            return ByteString.m84390e0(str);
        }

        /* renamed from: b0 */
        public final Object mo53621b0(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            switch (C18589a.f47453a[methodToInvoke.ordinal()]) {
                case 1:
                    return new Value();
                case 2:
                    return new C18588a((C18589a) null);
                case 3:
                    return GeneratedMessageLite.m84941D0(DEFAULT_INSTANCE, "\u0001\u0007\u0001\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001:\u0000\u00024\u0000\u00037\u0000\u00045\u0000\u0005;\u0000\u0006<\u0000\u00073\u0000", new Object[]{"value_", "valueCase_", "bitField0_", C18594d.class});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    C18841p2<Value> p2Var = PARSER;
                    if (p2Var == null) {
                        synchronized (Value.class) {
                            p2Var = PARSER;
                            if (p2Var == null) {
                                p2Var = new GeneratedMessageLite.C18635c<>(DEFAULT_INSTANCE);
                                PARSER = p2Var;
                            }
                        }
                    }
                    return p2Var;
                case 6:
                    return (byte) 1;
                case 7:
                    return null;
                default:
                    throw new UnsupportedOperationException();
            }
        }

        /* renamed from: b2 */
        public final void mo53622b2(long j) {
            this.valueCase_ = 4;
            this.value_ = Long.valueOf(j);
        }

        /* renamed from: d2 */
        public final void mo53623d2(String str) {
            str.getClass();
            this.valueCase_ = 5;
            this.value_ = str;
        }

        /* renamed from: e */
        public boolean mo53624e() {
            return this.valueCase_ == 1;
        }

        /* renamed from: e2 */
        public final void mo53625e2(ByteString byteString) {
            byteString.getClass();
            this.valueCase_ = 5;
            this.value_ = byteString.mo53741S0();
        }

        /* renamed from: f2 */
        public final void mo53626f2(C18594d.C18595a aVar) {
            this.value_ = aVar.mo54018g();
            this.valueCase_ = 6;
        }

        /* renamed from: g2 */
        public final void mo53627g2(C18594d dVar) {
            dVar.getClass();
            this.value_ = dVar;
            this.valueCase_ = 6;
        }

        /* renamed from: i */
        public ValueCase mo53628i() {
            return ValueCase.m84168b(this.valueCase_);
        }

        /* renamed from: k */
        public float mo53629k() {
            if (this.valueCase_ == 2) {
                return ((Float) this.value_).floatValue();
            }
            return 0.0f;
        }

        /* renamed from: l */
        public boolean mo53630l() {
            return this.valueCase_ == 5;
        }

        /* renamed from: m */
        public boolean mo53631m() {
            return this.valueCase_ == 3;
        }

        /* renamed from: n */
        public boolean mo53632n() {
            return this.valueCase_ == 2;
        }

        /* renamed from: s */
        public int mo53633s() {
            if (this.valueCase_ == 3) {
                return ((Integer) this.value_).intValue();
            }
            return 0;
        }

        /* renamed from: t */
        public C18594d mo53634t() {
            if (this.valueCase_ == 6) {
                return (C18594d) this.value_;
            }
            return C18594d.m84257n1();
        }

        /* renamed from: u */
        public double mo53635u() {
            if (this.valueCase_ == 7) {
                return ((Double) this.value_).doubleValue();
            }
            return 0.0d;
        }

        /* renamed from: v1 */
        public final void mo53636v1() {
            if (this.valueCase_ == 1) {
                this.valueCase_ = 0;
                this.value_ = null;
            }
        }

        /* renamed from: w1 */
        public final void mo53637w1() {
            if (this.valueCase_ == 7) {
                this.valueCase_ = 0;
                this.value_ = null;
            }
        }

        /* renamed from: x */
        public String mo53638x() {
            if (this.valueCase_ == 5) {
                return (String) this.value_;
            }
            return "";
        }

        /* renamed from: x1 */
        public final void mo53639x1() {
            if (this.valueCase_ == 2) {
                this.valueCase_ = 0;
                this.value_ = null;
            }
        }

        /* renamed from: y1 */
        public final void mo53640y1() {
            if (this.valueCase_ == 3) {
                this.valueCase_ = 0;
                this.value_ = null;
            }
        }

        /* renamed from: z1 */
        public final void mo53641z1() {
            if (this.valueCase_ == 4) {
                this.valueCase_ = 0;
                this.value_ = null;
            }
        }
    }

    /* renamed from: androidx.datastore.preferences.PreferencesProto$a */
    public static /* synthetic */ class C18589a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f47453a;

        /* JADX WARNING: Can't wrap try/catch for region: R(14:0|1|2|3|4|5|6|7|8|9|10|11|12|(3:13|14|16)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(16:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|16) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x003e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0049 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                androidx.datastore.preferences.protobuf.GeneratedMessageLite$MethodToInvoke[] r0 = androidx.datastore.preferences.protobuf.GeneratedMessageLite.MethodToInvoke.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f47453a = r0
                androidx.datastore.preferences.protobuf.GeneratedMessageLite$MethodToInvoke r1 = androidx.datastore.preferences.protobuf.GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f47453a     // Catch:{ NoSuchFieldError -> 0x001d }
                androidx.datastore.preferences.protobuf.GeneratedMessageLite$MethodToInvoke r1 = androidx.datastore.preferences.protobuf.GeneratedMessageLite.MethodToInvoke.NEW_BUILDER     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f47453a     // Catch:{ NoSuchFieldError -> 0x0028 }
                androidx.datastore.preferences.protobuf.GeneratedMessageLite$MethodToInvoke r1 = androidx.datastore.preferences.protobuf.GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f47453a     // Catch:{ NoSuchFieldError -> 0x0033 }
                androidx.datastore.preferences.protobuf.GeneratedMessageLite$MethodToInvoke r1 = androidx.datastore.preferences.protobuf.GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f47453a     // Catch:{ NoSuchFieldError -> 0x003e }
                androidx.datastore.preferences.protobuf.GeneratedMessageLite$MethodToInvoke r1 = androidx.datastore.preferences.protobuf.GeneratedMessageLite.MethodToInvoke.GET_PARSER     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = f47453a     // Catch:{ NoSuchFieldError -> 0x0049 }
                androidx.datastore.preferences.protobuf.GeneratedMessageLite$MethodToInvoke r1 = androidx.datastore.preferences.protobuf.GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r0 = f47453a     // Catch:{ NoSuchFieldError -> 0x0054 }
                androidx.datastore.preferences.protobuf.GeneratedMessageLite$MethodToInvoke r1 = androidx.datastore.preferences.protobuf.GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.PreferencesProto.C18589a.<clinit>():void");
        }
    }

    /* renamed from: androidx.datastore.preferences.PreferencesProto$b */
    public static final class C18590b extends GeneratedMessageLite<C18590b, C18591a> implements C18593c {
        /* access modifiers changed from: private */
        public static final C18590b DEFAULT_INSTANCE;
        private static volatile C18841p2<C18590b> PARSER = null;
        public static final int PREFERENCES_FIELD_NUMBER = 1;
        private MapFieldLite<String, Value> preferences_ = MapFieldLite.m85107i();

        /* renamed from: androidx.datastore.preferences.PreferencesProto$b$a */
        public static final class C18591a extends GeneratedMessageLite.C18634b<C18590b, C18591a> implements C18593c {
            public /* synthetic */ C18591a(C18589a aVar) {
                this();
            }

            /* renamed from: E0 */
            public C18591a mo53670E0() {
                mo54025u0();
                ((C18590b) this.f47641b).mo53666f1().clear();
                return this;
            }

            /* renamed from: F0 */
            public C18591a mo53671F0(Map<String, Value> map) {
                mo54025u0();
                ((C18590b) this.f47641b).mo53666f1().putAll(map);
                return this;
            }

            /* renamed from: G */
            public Value mo53661G(String str, Value value) {
                str.getClass();
                Map<String, Value> P = ((C18590b) this.f47641b).mo53664P();
                if (P.containsKey(str)) {
                    return P.get(str);
                }
                return value;
            }

            /* renamed from: G0 */
            public C18591a mo53672G0(String str, Value value) {
                str.getClass();
                value.getClass();
                mo54025u0();
                ((C18590b) this.f47641b).mo53666f1().put(str, value);
                return this;
            }

            @Deprecated
            /* renamed from: H */
            public Map<String, Value> mo53662H() {
                return mo53664P();
            }

            /* renamed from: H0 */
            public C18591a mo53673H0(String str) {
                str.getClass();
                mo54025u0();
                ((C18590b) this.f47641b).mo53666f1().remove(str);
                return this;
            }

            /* renamed from: N */
            public Value mo53663N(String str) {
                str.getClass();
                Map<String, Value> P = ((C18590b) this.f47641b).mo53664P();
                if (P.containsKey(str)) {
                    return P.get(str);
                }
                throw new IllegalArgumentException();
            }

            /* renamed from: P */
            public Map<String, Value> mo53664P() {
                return Collections.unmodifiableMap(((C18590b) this.f47641b).mo53664P());
            }

            /* renamed from: c */
            public int mo53665c() {
                return ((C18590b) this.f47641b).mo53664P().size();
            }

            /* renamed from: h */
            public boolean mo53668h(String str) {
                str.getClass();
                return ((C18590b) this.f47641b).mo53664P().containsKey(str);
            }

            public C18591a() {
                super(C18590b.DEFAULT_INSTANCE);
            }
        }

        /* renamed from: androidx.datastore.preferences.PreferencesProto$b$b */
        public static final class C18592b {

            /* renamed from: a */
            public static final C18868t1<String, Value> f47454a = C18868t1.m87468f(WireFormat.FieldType.STRING, "", WireFormat.FieldType.MESSAGE, Value.m84098D1());
        }

        static {
            C18590b bVar = new C18590b();
            DEFAULT_INSTANCE = bVar;
            GeneratedMessageLite.m84965a1(C18590b.class, bVar);
        }

        /* renamed from: e1 */
        public static C18590b m84206e1() {
            return DEFAULT_INSTANCE;
        }

        /* renamed from: i1 */
        public static C18591a m84207i1() {
            return (C18591a) DEFAULT_INSTANCE.mo53981V();
        }

        /* renamed from: j1 */
        public static C18591a m84208j1(C18590b bVar) {
            return (C18591a) DEFAULT_INSTANCE.mo53982Y(bVar);
        }

        /* renamed from: k1 */
        public static C18590b m84209k1(InputStream inputStream) throws IOException {
            return (C18590b) GeneratedMessageLite.m84944G0(DEFAULT_INSTANCE, inputStream);
        }

        /* renamed from: l1 */
        public static C18590b m84210l1(InputStream inputStream, C18836p0 p0Var) throws IOException {
            return (C18590b) GeneratedMessageLite.m84945H0(DEFAULT_INSTANCE, inputStream, p0Var);
        }

        /* renamed from: m1 */
        public static C18590b m84211m1(ByteString byteString) throws InvalidProtocolBufferException {
            return (C18590b) GeneratedMessageLite.m84946I0(DEFAULT_INSTANCE, byteString);
        }

        /* renamed from: n1 */
        public static C18590b m84212n1(ByteString byteString, C18836p0 p0Var) throws InvalidProtocolBufferException {
            return (C18590b) GeneratedMessageLite.m84947J0(DEFAULT_INSTANCE, byteString, p0Var);
        }

        /* renamed from: o1 */
        public static C18590b m84213o1(C18889w wVar) throws IOException {
            return (C18590b) GeneratedMessageLite.m84948L0(DEFAULT_INSTANCE, wVar);
        }

        /* renamed from: p1 */
        public static C18590b m84214p1(C18889w wVar, C18836p0 p0Var) throws IOException {
            return (C18590b) GeneratedMessageLite.m84949M0(DEFAULT_INSTANCE, wVar, p0Var);
        }

        /* renamed from: q1 */
        public static C18590b m84215q1(InputStream inputStream) throws IOException {
            return (C18590b) GeneratedMessageLite.m84950N0(DEFAULT_INSTANCE, inputStream);
        }

        /* renamed from: r1 */
        public static C18590b m84216r1(InputStream inputStream, C18836p0 p0Var) throws IOException {
            return (C18590b) GeneratedMessageLite.m84951O0(DEFAULT_INSTANCE, inputStream, p0Var);
        }

        /* renamed from: s1 */
        public static C18590b m84217s1(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (C18590b) GeneratedMessageLite.m84952P0(DEFAULT_INSTANCE, byteBuffer);
        }

        /* renamed from: t1 */
        public static C18590b m84218t1(ByteBuffer byteBuffer, C18836p0 p0Var) throws InvalidProtocolBufferException {
            return (C18590b) GeneratedMessageLite.m84953Q0(DEFAULT_INSTANCE, byteBuffer, p0Var);
        }

        /* renamed from: u1 */
        public static C18590b m84219u1(byte[] bArr) throws InvalidProtocolBufferException {
            return (C18590b) GeneratedMessageLite.m84955R0(DEFAULT_INSTANCE, bArr);
        }

        /* renamed from: v1 */
        public static C18590b m84220v1(byte[] bArr, C18836p0 p0Var) throws InvalidProtocolBufferException {
            return (C18590b) GeneratedMessageLite.m84956S0(DEFAULT_INSTANCE, bArr, p0Var);
        }

        /* renamed from: w1 */
        public static C18841p2<C18590b> m84221w1() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* renamed from: G */
        public Value mo53661G(String str, Value value) {
            str.getClass();
            MapFieldLite<String, Value> h1 = mo53669h1();
            if (h1.containsKey(str)) {
                return h1.get(str);
            }
            return value;
        }

        @Deprecated
        /* renamed from: H */
        public Map<String, Value> mo53662H() {
            return mo53664P();
        }

        /* renamed from: N */
        public Value mo53663N(String str) {
            str.getClass();
            MapFieldLite<String, Value> h1 = mo53669h1();
            if (h1.containsKey(str)) {
                return h1.get(str);
            }
            throw new IllegalArgumentException();
        }

        /* renamed from: P */
        public Map<String, Value> mo53664P() {
            return Collections.unmodifiableMap(mo53669h1());
        }

        /* renamed from: b0 */
        public final Object mo53621b0(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            switch (C18589a.f47453a[methodToInvoke.ordinal()]) {
                case 1:
                    return new C18590b();
                case 2:
                    return new C18591a((C18589a) null);
                case 3:
                    return GeneratedMessageLite.m84941D0(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u00012", new Object[]{"preferences_", C18592b.f47454a});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    C18841p2<C18590b> p2Var = PARSER;
                    if (p2Var == null) {
                        synchronized (C18590b.class) {
                            p2Var = PARSER;
                            if (p2Var == null) {
                                p2Var = new GeneratedMessageLite.C18635c<>(DEFAULT_INSTANCE);
                                PARSER = p2Var;
                            }
                        }
                    }
                    return p2Var;
                case 6:
                    return (byte) 1;
                case 7:
                    return null;
                default:
                    throw new UnsupportedOperationException();
            }
        }

        /* renamed from: c */
        public int mo53665c() {
            return mo53669h1().size();
        }

        /* renamed from: f1 */
        public final Map<String, Value> mo53666f1() {
            return mo53667g1();
        }

        /* renamed from: g1 */
        public final MapFieldLite<String, Value> mo53667g1() {
            if (!this.preferences_.mo54094n()) {
                this.preferences_ = this.preferences_.mo54100t();
            }
            return this.preferences_;
        }

        /* renamed from: h */
        public boolean mo53668h(String str) {
            str.getClass();
            return mo53669h1().containsKey(str);
        }

        /* renamed from: h1 */
        public final MapFieldLite<String, Value> mo53669h1() {
            return this.preferences_;
        }
    }

    /* renamed from: androidx.datastore.preferences.PreferencesProto$c */
    public interface C18593c extends C18675a2 {
        /* renamed from: G */
        Value mo53661G(String str, Value value);

        @Deprecated
        /* renamed from: H */
        Map<String, Value> mo53662H();

        /* renamed from: N */
        Value mo53663N(String str);

        /* renamed from: P */
        Map<String, Value> mo53664P();

        /* renamed from: c */
        int mo53665c();

        /* renamed from: h */
        boolean mo53668h(String str);
    }

    /* renamed from: androidx.datastore.preferences.PreferencesProto$d */
    public static final class C18594d extends GeneratedMessageLite<C18594d, C18595a> implements C18596e {
        /* access modifiers changed from: private */
        public static final C18594d DEFAULT_INSTANCE;
        private static volatile C18841p2<C18594d> PARSER = null;
        public static final int STRINGS_FIELD_NUMBER = 1;
        private C18753i1.C18770k<String> strings_ = GeneratedMessageLite.m84971i0();

        /* renamed from: androidx.datastore.preferences.PreferencesProto$d$a */
        public static final class C18595a extends GeneratedMessageLite.C18634b<C18594d, C18595a> implements C18596e {
            public /* synthetic */ C18595a(C18589a aVar) {
                this();
            }

            /* renamed from: A */
            public ByteString mo53674A(int i) {
                return ((C18594d) this.f47641b).mo53674A(i);
            }

            /* renamed from: B */
            public int mo53675B() {
                return ((C18594d) this.f47641b).mo53675B();
            }

            /* renamed from: E0 */
            public C18595a mo53684E0(Iterable<String> iterable) {
                mo54025u0();
                ((C18594d) this.f47641b).mo53679i1(iterable);
                return this;
            }

            /* renamed from: F0 */
            public C18595a mo53685F0(String str) {
                mo54025u0();
                ((C18594d) this.f47641b).mo53680j1(str);
                return this;
            }

            /* renamed from: G0 */
            public C18595a mo53686G0(ByteString byteString) {
                mo54025u0();
                ((C18594d) this.f47641b).mo53681k1(byteString);
                return this;
            }

            /* renamed from: H0 */
            public C18595a mo53687H0() {
                mo54025u0();
                ((C18594d) this.f47641b).mo53682l1();
                return this;
            }

            /* renamed from: I0 */
            public C18595a mo53688I0(int i, String str) {
                mo54025u0();
                ((C18594d) this.f47641b).mo53676D1(i, str);
                return this;
            }

            /* renamed from: K */
            public String mo53677K(int i) {
                return ((C18594d) this.f47641b).mo53677K(i);
            }

            /* renamed from: L */
            public List<String> mo53678L() {
                return Collections.unmodifiableList(((C18594d) this.f47641b).mo53678L());
            }

            public C18595a() {
                super(C18594d.DEFAULT_INSTANCE);
            }
        }

        static {
            C18594d dVar = new C18594d();
            DEFAULT_INSTANCE = dVar;
            GeneratedMessageLite.m84965a1(C18594d.class, dVar);
        }

        /* renamed from: A1 */
        public static C18594d m84248A1(byte[] bArr) throws InvalidProtocolBufferException {
            return (C18594d) GeneratedMessageLite.m84955R0(DEFAULT_INSTANCE, bArr);
        }

        /* renamed from: B1 */
        public static C18594d m84249B1(byte[] bArr, C18836p0 p0Var) throws InvalidProtocolBufferException {
            return (C18594d) GeneratedMessageLite.m84956S0(DEFAULT_INSTANCE, bArr, p0Var);
        }

        /* renamed from: C1 */
        public static C18841p2<C18594d> m84250C1() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* renamed from: n1 */
        public static C18594d m84257n1() {
            return DEFAULT_INSTANCE;
        }

        /* renamed from: o1 */
        public static C18595a m84258o1() {
            return (C18595a) DEFAULT_INSTANCE.mo53981V();
        }

        /* renamed from: p1 */
        public static C18595a m84259p1(C18594d dVar) {
            return (C18595a) DEFAULT_INSTANCE.mo53982Y(dVar);
        }

        /* renamed from: q1 */
        public static C18594d m84260q1(InputStream inputStream) throws IOException {
            return (C18594d) GeneratedMessageLite.m84944G0(DEFAULT_INSTANCE, inputStream);
        }

        /* renamed from: r1 */
        public static C18594d m84261r1(InputStream inputStream, C18836p0 p0Var) throws IOException {
            return (C18594d) GeneratedMessageLite.m84945H0(DEFAULT_INSTANCE, inputStream, p0Var);
        }

        /* renamed from: s1 */
        public static C18594d m84262s1(ByteString byteString) throws InvalidProtocolBufferException {
            return (C18594d) GeneratedMessageLite.m84946I0(DEFAULT_INSTANCE, byteString);
        }

        /* renamed from: t1 */
        public static C18594d m84263t1(ByteString byteString, C18836p0 p0Var) throws InvalidProtocolBufferException {
            return (C18594d) GeneratedMessageLite.m84947J0(DEFAULT_INSTANCE, byteString, p0Var);
        }

        /* renamed from: u1 */
        public static C18594d m84264u1(C18889w wVar) throws IOException {
            return (C18594d) GeneratedMessageLite.m84948L0(DEFAULT_INSTANCE, wVar);
        }

        /* renamed from: v1 */
        public static C18594d m84265v1(C18889w wVar, C18836p0 p0Var) throws IOException {
            return (C18594d) GeneratedMessageLite.m84949M0(DEFAULT_INSTANCE, wVar, p0Var);
        }

        /* renamed from: w1 */
        public static C18594d m84266w1(InputStream inputStream) throws IOException {
            return (C18594d) GeneratedMessageLite.m84950N0(DEFAULT_INSTANCE, inputStream);
        }

        /* renamed from: x1 */
        public static C18594d m84267x1(InputStream inputStream, C18836p0 p0Var) throws IOException {
            return (C18594d) GeneratedMessageLite.m84951O0(DEFAULT_INSTANCE, inputStream, p0Var);
        }

        /* renamed from: y1 */
        public static C18594d m84268y1(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (C18594d) GeneratedMessageLite.m84952P0(DEFAULT_INSTANCE, byteBuffer);
        }

        /* renamed from: z1 */
        public static C18594d m84269z1(ByteBuffer byteBuffer, C18836p0 p0Var) throws InvalidProtocolBufferException {
            return (C18594d) GeneratedMessageLite.m84953Q0(DEFAULT_INSTANCE, byteBuffer, p0Var);
        }

        /* renamed from: A */
        public ByteString mo53674A(int i) {
            return ByteString.m84390e0(this.strings_.get(i));
        }

        /* renamed from: B */
        public int mo53675B() {
            return this.strings_.size();
        }

        /* renamed from: D1 */
        public final void mo53676D1(int i, String str) {
            str.getClass();
            mo53683m1();
            this.strings_.set(i, str);
        }

        /* renamed from: K */
        public String mo53677K(int i) {
            return this.strings_.get(i);
        }

        /* renamed from: L */
        public List<String> mo53678L() {
            return this.strings_;
        }

        /* renamed from: b0 */
        public final Object mo53621b0(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            switch (C18589a.f47453a[methodToInvoke.ordinal()]) {
                case 1:
                    return new C18594d();
                case 2:
                    return new C18595a((C18589a) null);
                case 3:
                    return GeneratedMessageLite.m84941D0(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001a", new Object[]{"strings_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    C18841p2<C18594d> p2Var = PARSER;
                    if (p2Var == null) {
                        synchronized (C18594d.class) {
                            p2Var = PARSER;
                            if (p2Var == null) {
                                p2Var = new GeneratedMessageLite.C18635c<>(DEFAULT_INSTANCE);
                                PARSER = p2Var;
                            }
                        }
                    }
                    return p2Var;
                case 6:
                    return (byte) 1;
                case 7:
                    return null;
                default:
                    throw new UnsupportedOperationException();
            }
        }

        /* renamed from: i1 */
        public final void mo53679i1(Iterable<String> iterable) {
            mo53683m1();
            C18665a.m85406d(iterable, this.strings_);
        }

        /* renamed from: j1 */
        public final void mo53680j1(String str) {
            str.getClass();
            mo53683m1();
            this.strings_.add(str);
        }

        /* renamed from: k1 */
        public final void mo53681k1(ByteString byteString) {
            byteString.getClass();
            mo53683m1();
            this.strings_.add(byteString.mo53741S0());
        }

        /* renamed from: l1 */
        public final void mo53682l1() {
            this.strings_ = GeneratedMessageLite.m84971i0();
        }

        /* renamed from: m1 */
        public final void mo53683m1() {
            if (!this.strings_.mo54405T()) {
                this.strings_ = GeneratedMessageLite.m84981z0(this.strings_);
            }
        }
    }

    /* renamed from: androidx.datastore.preferences.PreferencesProto$e */
    public interface C18596e extends C18675a2 {
        /* renamed from: A */
        ByteString mo53674A(int i);

        /* renamed from: B */
        int mo53675B();

        /* renamed from: K */
        String mo53677K(int i);

        /* renamed from: L */
        List<String> mo53678L();
    }

    /* renamed from: androidx.datastore.preferences.PreferencesProto$f */
    public interface C18597f extends C18675a2 {
        /* renamed from: C */
        boolean mo53609C();

        /* renamed from: D */
        long mo53611D();

        /* renamed from: F */
        boolean mo53613F();

        /* renamed from: I */
        boolean mo53614I();

        /* renamed from: O */
        boolean mo53615O();

        /* renamed from: b */
        ByteString mo53620b();

        /* renamed from: e */
        boolean mo53624e();

        /* renamed from: i */
        Value.ValueCase mo53628i();

        /* renamed from: k */
        float mo53629k();

        /* renamed from: l */
        boolean mo53630l();

        /* renamed from: m */
        boolean mo53631m();

        /* renamed from: n */
        boolean mo53632n();

        /* renamed from: s */
        int mo53633s();

        /* renamed from: t */
        C18594d mo53634t();

        /* renamed from: u */
        double mo53635u();

        /* renamed from: x */
        String mo53638x();
    }

    /* renamed from: a */
    public static void m84097a(C18836p0 p0Var) {
    }
}
