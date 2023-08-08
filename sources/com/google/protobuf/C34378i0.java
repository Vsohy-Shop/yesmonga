package com.google.protobuf;

import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.WireFormat;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* renamed from: com.google.protobuf.i0 */
public final class C34378i0 extends C34374h0<GeneratedMessageLite.C34267f> {

    /* renamed from: com.google.protobuf.i0$a */
    public static /* synthetic */ class C34379a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f83283a;

        /* JADX WARNING: Can't wrap try/catch for region: R(36:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|17|18|19|20|21|22|23|24|25|26|27|28|29|30|31|32|33|34|(3:35|36|38)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(38:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|17|18|19|20|21|22|23|24|25|26|27|28|29|30|31|32|33|34|35|36|38) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x003e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0049 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0054 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0060 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x006c */
        /* JADX WARNING: Missing exception handler attribute for start block: B:21:0x0078 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:23:0x0084 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:25:0x0090 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:27:0x009c */
        /* JADX WARNING: Missing exception handler attribute for start block: B:29:0x00a8 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:31:0x00b4 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:33:0x00c0 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:35:0x00cc */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                com.google.protobuf.WireFormat$FieldType[] r0 = com.google.protobuf.WireFormat.FieldType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f83283a = r0
                com.google.protobuf.WireFormat$FieldType r1 = com.google.protobuf.WireFormat.FieldType.DOUBLE     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f83283a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.google.protobuf.WireFormat$FieldType r1 = com.google.protobuf.WireFormat.FieldType.FLOAT     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f83283a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.google.protobuf.WireFormat$FieldType r1 = com.google.protobuf.WireFormat.FieldType.INT64     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f83283a     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.google.protobuf.WireFormat$FieldType r1 = com.google.protobuf.WireFormat.FieldType.UINT64     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f83283a     // Catch:{ NoSuchFieldError -> 0x003e }
                com.google.protobuf.WireFormat$FieldType r1 = com.google.protobuf.WireFormat.FieldType.INT32     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = f83283a     // Catch:{ NoSuchFieldError -> 0x0049 }
                com.google.protobuf.WireFormat$FieldType r1 = com.google.protobuf.WireFormat.FieldType.FIXED64     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r0 = f83283a     // Catch:{ NoSuchFieldError -> 0x0054 }
                com.google.protobuf.WireFormat$FieldType r1 = com.google.protobuf.WireFormat.FieldType.FIXED32     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                int[] r0 = f83283a     // Catch:{ NoSuchFieldError -> 0x0060 }
                com.google.protobuf.WireFormat$FieldType r1 = com.google.protobuf.WireFormat.FieldType.BOOL     // Catch:{ NoSuchFieldError -> 0x0060 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0060 }
                r2 = 8
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0060 }
            L_0x0060:
                int[] r0 = f83283a     // Catch:{ NoSuchFieldError -> 0x006c }
                com.google.protobuf.WireFormat$FieldType r1 = com.google.protobuf.WireFormat.FieldType.UINT32     // Catch:{ NoSuchFieldError -> 0x006c }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x006c }
                r2 = 9
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x006c }
            L_0x006c:
                int[] r0 = f83283a     // Catch:{ NoSuchFieldError -> 0x0078 }
                com.google.protobuf.WireFormat$FieldType r1 = com.google.protobuf.WireFormat.FieldType.SFIXED32     // Catch:{ NoSuchFieldError -> 0x0078 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0078 }
                r2 = 10
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0078 }
            L_0x0078:
                int[] r0 = f83283a     // Catch:{ NoSuchFieldError -> 0x0084 }
                com.google.protobuf.WireFormat$FieldType r1 = com.google.protobuf.WireFormat.FieldType.SFIXED64     // Catch:{ NoSuchFieldError -> 0x0084 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0084 }
                r2 = 11
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0084 }
            L_0x0084:
                int[] r0 = f83283a     // Catch:{ NoSuchFieldError -> 0x0090 }
                com.google.protobuf.WireFormat$FieldType r1 = com.google.protobuf.WireFormat.FieldType.SINT32     // Catch:{ NoSuchFieldError -> 0x0090 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0090 }
                r2 = 12
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0090 }
            L_0x0090:
                int[] r0 = f83283a     // Catch:{ NoSuchFieldError -> 0x009c }
                com.google.protobuf.WireFormat$FieldType r1 = com.google.protobuf.WireFormat.FieldType.SINT64     // Catch:{ NoSuchFieldError -> 0x009c }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x009c }
                r2 = 13
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x009c }
            L_0x009c:
                int[] r0 = f83283a     // Catch:{ NoSuchFieldError -> 0x00a8 }
                com.google.protobuf.WireFormat$FieldType r1 = com.google.protobuf.WireFormat.FieldType.ENUM     // Catch:{ NoSuchFieldError -> 0x00a8 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00a8 }
                r2 = 14
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00a8 }
            L_0x00a8:
                int[] r0 = f83283a     // Catch:{ NoSuchFieldError -> 0x00b4 }
                com.google.protobuf.WireFormat$FieldType r1 = com.google.protobuf.WireFormat.FieldType.BYTES     // Catch:{ NoSuchFieldError -> 0x00b4 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00b4 }
                r2 = 15
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00b4 }
            L_0x00b4:
                int[] r0 = f83283a     // Catch:{ NoSuchFieldError -> 0x00c0 }
                com.google.protobuf.WireFormat$FieldType r1 = com.google.protobuf.WireFormat.FieldType.STRING     // Catch:{ NoSuchFieldError -> 0x00c0 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00c0 }
                r2 = 16
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00c0 }
            L_0x00c0:
                int[] r0 = f83283a     // Catch:{ NoSuchFieldError -> 0x00cc }
                com.google.protobuf.WireFormat$FieldType r1 = com.google.protobuf.WireFormat.FieldType.GROUP     // Catch:{ NoSuchFieldError -> 0x00cc }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00cc }
                r2 = 17
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00cc }
            L_0x00cc:
                int[] r0 = f83283a     // Catch:{ NoSuchFieldError -> 0x00d8 }
                com.google.protobuf.WireFormat$FieldType r1 = com.google.protobuf.WireFormat.FieldType.MESSAGE     // Catch:{ NoSuchFieldError -> 0x00d8 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00d8 }
                r2 = 18
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00d8 }
            L_0x00d8:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.C34378i0.C34379a.<clinit>():void");
        }
    }

    /* renamed from: a */
    public int mo101124a(Map.Entry<?, ?> entry) {
        return ((GeneratedMessageLite.C34267f) entry.getKey()).getNumber();
    }

    /* renamed from: b */
    public Object mo101125b(C34368g0 g0Var, C34412l1 l1Var, int i) {
        return g0Var.mo101102c(l1Var, i);
    }

    /* renamed from: c */
    public C34425o0<GeneratedMessageLite.C34267f> mo101126c(Object obj) {
        return ((GeneratedMessageLite.ExtendableMessage) obj).extensions;
    }

    /* renamed from: d */
    public C34425o0<GeneratedMessageLite.C34267f> mo101127d(Object obj) {
        return ((GeneratedMessageLite.ExtendableMessage) obj).ensureExtensionsAreMutable();
    }

    /* renamed from: e */
    public boolean mo101128e(C34412l1 l1Var) {
        return l1Var instanceof GeneratedMessageLite.ExtendableMessage;
    }

    /* renamed from: f */
    public void mo101129f(Object obj) {
        mo101126c(obj).mo101385I();
    }

    /* renamed from: g */
    public <UT, UB> UB mo101130g(C34366f2 f2Var, Object obj, C34368g0 g0Var, C34425o0<GeneratedMessageLite.C34267f> o0Var, UB ub, C34501x2<UT, UB> x2Var) throws IOException {
        Object obj2;
        Object u;
        ArrayList arrayList;
        GeneratedMessageLite.C34268g gVar = (GeneratedMessageLite.C34268g) obj;
        int d = gVar.mo100502d();
        if (!gVar.f83064d.mo100490B() || !gVar.f83064d.mo100493S()) {
            if (gVar.mo100500b() != WireFormat.FieldType.ENUM) {
                switch (C34379a.f83283a[gVar.mo100500b().ordinal()]) {
                    case 1:
                        obj2 = Double.valueOf(f2Var.readDouble());
                        break;
                    case 2:
                        obj2 = Float.valueOf(f2Var.readFloat());
                        break;
                    case 3:
                        obj2 = Long.valueOf(f2Var.mo101061I());
                        break;
                    case 4:
                        obj2 = Long.valueOf(f2Var.mo101089r());
                        break;
                    case 5:
                        obj2 = Integer.valueOf(f2Var.mo101086o());
                        break;
                    case 6:
                        obj2 = Long.valueOf(f2Var.mo101072a());
                        break;
                    case 7:
                        obj2 = Integer.valueOf(f2Var.mo101093t());
                        break;
                    case 8:
                        obj2 = Boolean.valueOf(f2Var.mo101075d());
                        break;
                    case 9:
                        obj2 = Integer.valueOf(f2Var.mo101078g());
                        break;
                    case 10:
                        obj2 = Integer.valueOf(f2Var.mo101058F());
                        break;
                    case 11:
                        obj2 = Long.valueOf(f2Var.mo101076e());
                        break;
                    case 12:
                        obj2 = Integer.valueOf(f2Var.mo101082k());
                        break;
                    case 13:
                        obj2 = Long.valueOf(f2Var.mo101097x());
                        break;
                    case 14:
                        throw new IllegalStateException("Shouldn't reach here.");
                    case 15:
                        obj2 = f2Var.mo101085n();
                        break;
                    case 16:
                        obj2 = f2Var.mo101098y();
                        break;
                    case 17:
                        obj2 = f2Var.mo101065M(gVar.mo100501c().getClass(), g0Var);
                        break;
                    case 18:
                        obj2 = f2Var.mo101067O(gVar.mo100501c().getClass(), g0Var);
                        break;
                    default:
                        obj2 = null;
                        break;
                }
            } else {
                int o = f2Var.mo101086o();
                if (gVar.f83064d.mo100498s().mo93187a(o) == null) {
                    return C34381i2.m139328Q(d, o, ub, x2Var);
                }
                obj2 = Integer.valueOf(o);
            }
            if (gVar.mo100503f()) {
                o0Var.mo101396h(gVar.f83064d, obj2);
            } else {
                int i = C34379a.f83283a[gVar.mo100500b().ordinal()];
                if ((i == 17 || i == 18) && (u = o0Var.mo101403u(gVar.f83064d)) != null) {
                    obj2 = C34471v0.m140591v(u, obj2);
                }
                o0Var.mo101388O(gVar.f83064d, obj2);
            }
        } else {
            switch (C34379a.f83283a[gVar.mo100500b().ordinal()]) {
                case 1:
                    arrayList = new ArrayList();
                    f2Var.mo101060H(arrayList);
                    break;
                case 2:
                    arrayList = new ArrayList();
                    f2Var.mo101055C(arrayList);
                    break;
                case 3:
                    arrayList = new ArrayList();
                    f2Var.mo101079h(arrayList);
                    break;
                case 4:
                    arrayList = new ArrayList();
                    f2Var.mo101077f(arrayList);
                    break;
                case 5:
                    arrayList = new ArrayList();
                    f2Var.mo101095v(arrayList);
                    break;
                case 6:
                    arrayList = new ArrayList();
                    f2Var.mo101087p(arrayList);
                    break;
                case 7:
                    arrayList = new ArrayList();
                    f2Var.mo101096w(arrayList);
                    break;
                case 8:
                    arrayList = new ArrayList();
                    f2Var.mo101083l(arrayList);
                    break;
                case 9:
                    arrayList = new ArrayList();
                    f2Var.mo101092s(arrayList);
                    break;
                case 10:
                    arrayList = new ArrayList();
                    f2Var.mo101073b(arrayList);
                    break;
                case 11:
                    arrayList = new ArrayList();
                    f2Var.mo101094u(arrayList);
                    break;
                case 12:
                    arrayList = new ArrayList();
                    f2Var.mo101088q(arrayList);
                    break;
                case 13:
                    arrayList = new ArrayList();
                    f2Var.mo101074c(arrayList);
                    break;
                case 14:
                    arrayList = new ArrayList();
                    f2Var.mo101080i(arrayList);
                    ub = C34381i2.m139308B(d, arrayList, gVar.f83064d.mo100498s(), ub, x2Var);
                    break;
                default:
                    throw new IllegalStateException("Type cannot be packed: " + gVar.f83064d.mo100491D());
            }
            o0Var.mo101388O(gVar.f83064d, arrayList);
        }
        return ub;
    }

    /* renamed from: h */
    public void mo101131h(C34366f2 f2Var, Object obj, C34368g0 g0Var, C34425o0<GeneratedMessageLite.C34267f> o0Var) throws IOException {
        GeneratedMessageLite.C34268g gVar = (GeneratedMessageLite.C34268g) obj;
        o0Var.mo101388O(gVar.f83064d, f2Var.mo101067O(gVar.mo100501c().getClass(), g0Var));
    }

    /* renamed from: i */
    public void mo101132i(ByteString byteString, Object obj, C34368g0 g0Var, C34425o0<GeneratedMessageLite.C34267f> o0Var) throws IOException {
        GeneratedMessageLite.C34268g gVar = (GeneratedMessageLite.C34268g) obj;
        C34412l1 Q = gVar.mo100501c().newBuilderForType().mo100467Q();
        C34397k U = C34397k.m139467U(ByteBuffer.wrap(byteString.mo99224M0()), true);
        C34325a2.m138828a().mo100878f(Q, U, g0Var);
        o0Var.mo101388O(gVar.f83064d, Q);
        if (U.mo101099z() != Integer.MAX_VALUE) {
            throw InvalidProtocolBufferException.m138413c();
        }
    }

    /* renamed from: j */
    public void mo101133j(Writer writer, Map.Entry<?, ?> entry) throws IOException {
        GeneratedMessageLite.C34267f fVar = (GeneratedMessageLite.C34267f) entry.getKey();
        if (fVar.mo100490B()) {
            switch (C34379a.f83283a[fVar.mo100491D().ordinal()]) {
                case 1:
                    C34381i2.m139336Y(fVar.getNumber(), (List) entry.getValue(), writer, fVar.mo100493S());
                    return;
                case 2:
                    C34381i2.m139351g0(fVar.getNumber(), (List) entry.getValue(), writer, fVar.mo100493S());
                    return;
                case 3:
                    C34381i2.m139363m0(fVar.getNumber(), (List) entry.getValue(), writer, fVar.mo100493S());
                    return;
                case 4:
                    C34381i2.m139317F0(fVar.getNumber(), (List) entry.getValue(), writer, fVar.mo100493S());
                    return;
                case 5:
                    C34381i2.m139359k0(fVar.getNumber(), (List) entry.getValue(), writer, fVar.mo100493S());
                    return;
                case 6:
                    C34381i2.m139347e0(fVar.getNumber(), (List) entry.getValue(), writer, fVar.mo100493S());
                    return;
                case 7:
                    C34381i2.m139343c0(fVar.getNumber(), (List) entry.getValue(), writer, fVar.mo100493S());
                    return;
                case 8:
                    C34381i2.m139332U(fVar.getNumber(), (List) entry.getValue(), writer, fVar.mo100493S());
                    return;
                case 9:
                    C34381i2.m139313D0(fVar.getNumber(), (List) entry.getValue(), writer, fVar.mo100493S());
                    return;
                case 10:
                    C34381i2.m139375s0(fVar.getNumber(), (List) entry.getValue(), writer, fVar.mo100493S());
                    return;
                case 11:
                    C34381i2.m139379u0(fVar.getNumber(), (List) entry.getValue(), writer, fVar.mo100493S());
                    return;
                case 12:
                    C34381i2.m139383w0(fVar.getNumber(), (List) entry.getValue(), writer, fVar.mo100493S());
                    return;
                case 13:
                    C34381i2.m139387y0(fVar.getNumber(), (List) entry.getValue(), writer, fVar.mo100493S());
                    return;
                case 14:
                    C34381i2.m139359k0(fVar.getNumber(), (List) entry.getValue(), writer, fVar.mo100493S());
                    return;
                case 15:
                    C34381i2.m139334W(fVar.getNumber(), (List) entry.getValue(), writer);
                    return;
                case 16:
                    C34381i2.m139309B0(fVar.getNumber(), (List) entry.getValue(), writer);
                    return;
                case 17:
                    List list = (List) entry.getValue();
                    if (list != null && !list.isEmpty()) {
                        C34381i2.m139355i0(fVar.getNumber(), (List) entry.getValue(), writer, C34325a2.m138828a().mo100881i(list.get(0).getClass()));
                        return;
                    }
                    return;
                case 18:
                    List list2 = (List) entry.getValue();
                    if (list2 != null && !list2.isEmpty()) {
                        C34381i2.m139371q0(fVar.getNumber(), (List) entry.getValue(), writer, C34325a2.m138828a().mo100881i(list2.get(0).getClass()));
                        return;
                    }
                    return;
                default:
                    return;
            }
        } else {
            switch (C34379a.f83283a[fVar.mo100491D().ordinal()]) {
                case 1:
                    writer.mo100822q(fVar.getNumber(), ((Double) entry.getValue()).doubleValue());
                    return;
                case 2:
                    writer.mo100792F(fVar.getNumber(), ((Float) entry.getValue()).floatValue());
                    return;
                case 3:
                    writer.mo100829x(fVar.getNumber(), ((Long) entry.getValue()).longValue());
                    return;
                case 4:
                    writer.mo100812g(fVar.getNumber(), ((Long) entry.getValue()).longValue());
                    return;
                case 5:
                    writer.mo100814i(fVar.getNumber(), ((Integer) entry.getValue()).intValue());
                    return;
                case 6:
                    writer.mo100825t(fVar.getNumber(), ((Long) entry.getValue()).longValue());
                    return;
                case 7:
                    writer.mo100808c(fVar.getNumber(), ((Integer) entry.getValue()).intValue());
                    return;
                case 8:
                    writer.mo100830y(fVar.getNumber(), ((Boolean) entry.getValue()).booleanValue());
                    return;
                case 9:
                    writer.mo100821p(fVar.getNumber(), ((Integer) entry.getValue()).intValue());
                    return;
                case 10:
                    writer.mo100831z(fVar.getNumber(), ((Integer) entry.getValue()).intValue());
                    return;
                case 11:
                    writer.mo100815j(fVar.getNumber(), ((Long) entry.getValue()).longValue());
                    return;
                case 12:
                    writer.mo100798L(fVar.getNumber(), ((Integer) entry.getValue()).intValue());
                    return;
                case 13:
                    writer.mo100819n(fVar.getNumber(), ((Long) entry.getValue()).longValue());
                    return;
                case 14:
                    writer.mo100814i(fVar.getNumber(), ((Integer) entry.getValue()).intValue());
                    return;
                case 15:
                    writer.mo100802P(fVar.getNumber(), (ByteString) entry.getValue());
                    return;
                case 16:
                    writer.mo100811f(fVar.getNumber(), (String) entry.getValue());
                    return;
                case 17:
                    writer.mo100801O(fVar.getNumber(), entry.getValue(), C34325a2.m138828a().mo100881i(entry.getValue().getClass()));
                    return;
                case 18:
                    writer.mo100804R(fVar.getNumber(), entry.getValue(), C34325a2.m138828a().mo100881i(entry.getValue().getClass()));
                    return;
                default:
                    return;
            }
        }
    }

    /* renamed from: k */
    public void mo101134k(Object obj, C34425o0<GeneratedMessageLite.C34267f> o0Var) {
        ((GeneratedMessageLite.ExtendableMessage) obj).extensions = o0Var;
    }
}
