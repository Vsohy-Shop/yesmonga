package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.GeneratedMessageLite;
import androidx.datastore.preferences.protobuf.WireFormat;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* renamed from: androidx.datastore.preferences.protobuf.r0 */
public final class C18850r0 extends C18844q0<GeneratedMessageLite.C18640g> {

    /* renamed from: androidx.datastore.preferences.protobuf.r0$a */
    public static /* synthetic */ class C18851a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f47987a;

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
                androidx.datastore.preferences.protobuf.WireFormat$FieldType[] r0 = androidx.datastore.preferences.protobuf.WireFormat.FieldType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f47987a = r0
                androidx.datastore.preferences.protobuf.WireFormat$FieldType r1 = androidx.datastore.preferences.protobuf.WireFormat.FieldType.DOUBLE     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f47987a     // Catch:{ NoSuchFieldError -> 0x001d }
                androidx.datastore.preferences.protobuf.WireFormat$FieldType r1 = androidx.datastore.preferences.protobuf.WireFormat.FieldType.FLOAT     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f47987a     // Catch:{ NoSuchFieldError -> 0x0028 }
                androidx.datastore.preferences.protobuf.WireFormat$FieldType r1 = androidx.datastore.preferences.protobuf.WireFormat.FieldType.INT64     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f47987a     // Catch:{ NoSuchFieldError -> 0x0033 }
                androidx.datastore.preferences.protobuf.WireFormat$FieldType r1 = androidx.datastore.preferences.protobuf.WireFormat.FieldType.UINT64     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f47987a     // Catch:{ NoSuchFieldError -> 0x003e }
                androidx.datastore.preferences.protobuf.WireFormat$FieldType r1 = androidx.datastore.preferences.protobuf.WireFormat.FieldType.INT32     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = f47987a     // Catch:{ NoSuchFieldError -> 0x0049 }
                androidx.datastore.preferences.protobuf.WireFormat$FieldType r1 = androidx.datastore.preferences.protobuf.WireFormat.FieldType.FIXED64     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r0 = f47987a     // Catch:{ NoSuchFieldError -> 0x0054 }
                androidx.datastore.preferences.protobuf.WireFormat$FieldType r1 = androidx.datastore.preferences.protobuf.WireFormat.FieldType.FIXED32     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                int[] r0 = f47987a     // Catch:{ NoSuchFieldError -> 0x0060 }
                androidx.datastore.preferences.protobuf.WireFormat$FieldType r1 = androidx.datastore.preferences.protobuf.WireFormat.FieldType.BOOL     // Catch:{ NoSuchFieldError -> 0x0060 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0060 }
                r2 = 8
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0060 }
            L_0x0060:
                int[] r0 = f47987a     // Catch:{ NoSuchFieldError -> 0x006c }
                androidx.datastore.preferences.protobuf.WireFormat$FieldType r1 = androidx.datastore.preferences.protobuf.WireFormat.FieldType.UINT32     // Catch:{ NoSuchFieldError -> 0x006c }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x006c }
                r2 = 9
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x006c }
            L_0x006c:
                int[] r0 = f47987a     // Catch:{ NoSuchFieldError -> 0x0078 }
                androidx.datastore.preferences.protobuf.WireFormat$FieldType r1 = androidx.datastore.preferences.protobuf.WireFormat.FieldType.SFIXED32     // Catch:{ NoSuchFieldError -> 0x0078 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0078 }
                r2 = 10
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0078 }
            L_0x0078:
                int[] r0 = f47987a     // Catch:{ NoSuchFieldError -> 0x0084 }
                androidx.datastore.preferences.protobuf.WireFormat$FieldType r1 = androidx.datastore.preferences.protobuf.WireFormat.FieldType.SFIXED64     // Catch:{ NoSuchFieldError -> 0x0084 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0084 }
                r2 = 11
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0084 }
            L_0x0084:
                int[] r0 = f47987a     // Catch:{ NoSuchFieldError -> 0x0090 }
                androidx.datastore.preferences.protobuf.WireFormat$FieldType r1 = androidx.datastore.preferences.protobuf.WireFormat.FieldType.SINT32     // Catch:{ NoSuchFieldError -> 0x0090 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0090 }
                r2 = 12
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0090 }
            L_0x0090:
                int[] r0 = f47987a     // Catch:{ NoSuchFieldError -> 0x009c }
                androidx.datastore.preferences.protobuf.WireFormat$FieldType r1 = androidx.datastore.preferences.protobuf.WireFormat.FieldType.SINT64     // Catch:{ NoSuchFieldError -> 0x009c }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x009c }
                r2 = 13
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x009c }
            L_0x009c:
                int[] r0 = f47987a     // Catch:{ NoSuchFieldError -> 0x00a8 }
                androidx.datastore.preferences.protobuf.WireFormat$FieldType r1 = androidx.datastore.preferences.protobuf.WireFormat.FieldType.ENUM     // Catch:{ NoSuchFieldError -> 0x00a8 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00a8 }
                r2 = 14
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00a8 }
            L_0x00a8:
                int[] r0 = f47987a     // Catch:{ NoSuchFieldError -> 0x00b4 }
                androidx.datastore.preferences.protobuf.WireFormat$FieldType r1 = androidx.datastore.preferences.protobuf.WireFormat.FieldType.BYTES     // Catch:{ NoSuchFieldError -> 0x00b4 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00b4 }
                r2 = 15
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00b4 }
            L_0x00b4:
                int[] r0 = f47987a     // Catch:{ NoSuchFieldError -> 0x00c0 }
                androidx.datastore.preferences.protobuf.WireFormat$FieldType r1 = androidx.datastore.preferences.protobuf.WireFormat.FieldType.STRING     // Catch:{ NoSuchFieldError -> 0x00c0 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00c0 }
                r2 = 16
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00c0 }
            L_0x00c0:
                int[] r0 = f47987a     // Catch:{ NoSuchFieldError -> 0x00cc }
                androidx.datastore.preferences.protobuf.WireFormat$FieldType r1 = androidx.datastore.preferences.protobuf.WireFormat.FieldType.GROUP     // Catch:{ NoSuchFieldError -> 0x00cc }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00cc }
                r2 = 17
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00cc }
            L_0x00cc:
                int[] r0 = f47987a     // Catch:{ NoSuchFieldError -> 0x00d8 }
                androidx.datastore.preferences.protobuf.WireFormat$FieldType r1 = androidx.datastore.preferences.protobuf.WireFormat.FieldType.MESSAGE     // Catch:{ NoSuchFieldError -> 0x00d8 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00d8 }
                r2 = 18
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00d8 }
            L_0x00d8:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.C18850r0.C18851a.<clinit>():void");
        }
    }

    /* renamed from: a */
    public int mo55342a(Map.Entry<?, ?> entry) {
        return ((GeneratedMessageLite.C18640g) entry.getKey()).getNumber();
    }

    /* renamed from: b */
    public Object mo55343b(C18836p0 p0Var, C18920z1 z1Var, int i) {
        return p0Var.mo55303c(z1Var, i);
    }

    /* renamed from: c */
    public C18909y0<GeneratedMessageLite.C18640g> mo55344c(Object obj) {
        return ((GeneratedMessageLite.C18637e) obj).extensions;
    }

    /* renamed from: d */
    public C18909y0<GeneratedMessageLite.C18640g> mo55345d(Object obj) {
        return ((GeneratedMessageLite.C18637e) obj).mo54049d1();
    }

    /* renamed from: e */
    public boolean mo55346e(C18920z1 z1Var) {
        return z1Var instanceof GeneratedMessageLite.C18637e;
    }

    /* renamed from: f */
    public void mo55347f(Object obj) {
        mo55344c(obj).mo55612I();
    }

    /* renamed from: g */
    public <UT, UB> UB mo55348g(C18899w2 w2Var, Object obj, C18836p0 p0Var, C18909y0<GeneratedMessageLite.C18640g> y0Var, UB ub, C18888v3<UT, UB> v3Var) throws IOException {
        Object obj2;
        Object u;
        ArrayList arrayList;
        GeneratedMessageLite.C18641h hVar = (GeneratedMessageLite.C18641h) obj;
        int d = hVar.mo54075d();
        if (!hVar.f47656d.mo54063B() || !hVar.f47656d.mo54066S()) {
            if (hVar.mo54073b() != WireFormat.FieldType.ENUM) {
                switch (C18851a.f47987a[hVar.mo54073b().ordinal()]) {
                    case 1:
                        obj2 = Double.valueOf(w2Var.readDouble());
                        break;
                    case 2:
                        obj2 = Float.valueOf(w2Var.readFloat());
                        break;
                    case 3:
                        obj2 = Long.valueOf(w2Var.mo54954I());
                        break;
                    case 4:
                        obj2 = Long.valueOf(w2Var.mo55004r());
                        break;
                    case 5:
                        obj2 = Integer.valueOf(w2Var.mo54998o());
                        break;
                    case 6:
                        obj2 = Long.valueOf(w2Var.mo54970a());
                        break;
                    case 7:
                        obj2 = Integer.valueOf(w2Var.mo55009t());
                        break;
                    case 8:
                        obj2 = Boolean.valueOf(w2Var.mo54976d());
                        break;
                    case 9:
                        obj2 = Integer.valueOf(w2Var.mo54982g());
                        break;
                    case 10:
                        obj2 = Integer.valueOf(w2Var.mo54951F());
                        break;
                    case 11:
                        obj2 = Long.valueOf(w2Var.mo54978e());
                        break;
                    case 12:
                        obj2 = Integer.valueOf(w2Var.mo54990k());
                        break;
                    case 13:
                        obj2 = Long.valueOf(w2Var.mo55013x());
                        break;
                    case 14:
                        throw new IllegalStateException("Shouldn't reach here.");
                    case 15:
                        obj2 = w2Var.mo54996n();
                        break;
                    case 16:
                        obj2 = w2Var.mo55014y();
                        break;
                    case 17:
                        obj2 = w2Var.mo54961P(hVar.mo54074c().getClass(), p0Var);
                        break;
                    case 18:
                        obj2 = w2Var.mo54959N(hVar.mo54074c().getClass(), p0Var);
                        break;
                    default:
                        obj2 = null;
                        break;
                }
            } else {
                int o = w2Var.mo54998o();
                if (hVar.f47656d.mo54071s().mo53931a(o) == null) {
                    return C18922z2.m88292Q(d, o, ub, v3Var);
                }
                obj2 = Integer.valueOf(o);
            }
            if (hVar.mo54076f()) {
                y0Var.mo55623h(hVar.f47656d, obj2);
            } else {
                int i = C18851a.f47987a[hVar.mo54073b().ordinal()];
                if ((i == 17 || i == 18) && (u = y0Var.mo55630u(hVar.f47656d)) != null) {
                    obj2 = C18753i1.m86358v(u, obj2);
                }
                y0Var.mo55615O(hVar.f47656d, obj2);
            }
        } else {
            switch (C18851a.f47987a[hVar.mo54073b().ordinal()]) {
                case 1:
                    arrayList = new ArrayList();
                    w2Var.mo54953H(arrayList);
                    break;
                case 2:
                    arrayList = new ArrayList();
                    w2Var.mo54949C(arrayList);
                    break;
                case 3:
                    arrayList = new ArrayList();
                    w2Var.mo54984h(arrayList);
                    break;
                case 4:
                    arrayList = new ArrayList();
                    w2Var.mo54980f(arrayList);
                    break;
                case 5:
                    arrayList = new ArrayList();
                    w2Var.mo55011v(arrayList);
                    break;
                case 6:
                    arrayList = new ArrayList();
                    w2Var.mo55000p(arrayList);
                    break;
                case 7:
                    arrayList = new ArrayList();
                    w2Var.mo55012w(arrayList);
                    break;
                case 8:
                    arrayList = new ArrayList();
                    w2Var.mo54992l(arrayList);
                    break;
                case 9:
                    arrayList = new ArrayList();
                    w2Var.mo55008s(arrayList);
                    break;
                case 10:
                    arrayList = new ArrayList();
                    w2Var.mo54972b(arrayList);
                    break;
                case 11:
                    arrayList = new ArrayList();
                    w2Var.mo55010u(arrayList);
                    break;
                case 12:
                    arrayList = new ArrayList();
                    w2Var.mo55002q(arrayList);
                    break;
                case 13:
                    arrayList = new ArrayList();
                    w2Var.mo54974c(arrayList);
                    break;
                case 14:
                    arrayList = new ArrayList();
                    w2Var.mo54986i(arrayList);
                    ub = C18922z2.m88272B(d, arrayList, hVar.f47656d.mo54071s(), ub, v3Var);
                    break;
                default:
                    throw new IllegalStateException("Type cannot be packed: " + hVar.f47656d.mo54064D());
            }
            y0Var.mo55615O(hVar.f47656d, arrayList);
        }
        return ub;
    }

    /* renamed from: h */
    public void mo55349h(C18899w2 w2Var, Object obj, C18836p0 p0Var, C18909y0<GeneratedMessageLite.C18640g> y0Var) throws IOException {
        GeneratedMessageLite.C18641h hVar = (GeneratedMessageLite.C18641h) obj;
        y0Var.mo55615O(hVar.f47656d, w2Var.mo54959N(hVar.mo54074c().getClass(), p0Var));
    }

    /* renamed from: i */
    public void mo55350i(ByteString byteString, Object obj, C18836p0 p0Var, C18909y0<GeneratedMessageLite.C18640g> y0Var) throws IOException {
        GeneratedMessageLite.C18641h hVar = (GeneratedMessageLite.C18641h) obj;
        C18920z1 Q = hVar.mo54074c().newBuilderForType().mo54011Q();
        C18802m U = C18802m.m86576U(ByteBuffer.wrap(byteString.mo53737M0()), true);
        C18853r2.m87361a().mo55370f(Q, U, p0Var);
        y0Var.mo55615O(hVar.f47656d, Q);
        if (U.mo55015z() != Integer.MAX_VALUE) {
            throw InvalidProtocolBufferException.m85085b();
        }
    }

    /* renamed from: j */
    public void mo55351j(Writer writer, Map.Entry<?, ?> entry) throws IOException {
        GeneratedMessageLite.C18640g gVar = (GeneratedMessageLite.C18640g) entry.getKey();
        if (gVar.mo54063B()) {
            switch (C18851a.f47987a[gVar.mo54064D().ordinal()]) {
                case 1:
                    C18922z2.m88300Y(gVar.getNumber(), (List) entry.getValue(), writer, gVar.mo54066S());
                    return;
                case 2:
                    C18922z2.m88315g0(gVar.getNumber(), (List) entry.getValue(), writer, gVar.mo54066S());
                    return;
                case 3:
                    C18922z2.m88327m0(gVar.getNumber(), (List) entry.getValue(), writer, gVar.mo54066S());
                    return;
                case 4:
                    C18922z2.m88281F0(gVar.getNumber(), (List) entry.getValue(), writer, gVar.mo54066S());
                    return;
                case 5:
                    C18922z2.m88323k0(gVar.getNumber(), (List) entry.getValue(), writer, gVar.mo54066S());
                    return;
                case 6:
                    C18922z2.m88311e0(gVar.getNumber(), (List) entry.getValue(), writer, gVar.mo54066S());
                    return;
                case 7:
                    C18922z2.m88307c0(gVar.getNumber(), (List) entry.getValue(), writer, gVar.mo54066S());
                    return;
                case 8:
                    C18922z2.m88296U(gVar.getNumber(), (List) entry.getValue(), writer, gVar.mo54066S());
                    return;
                case 9:
                    C18922z2.m88277D0(gVar.getNumber(), (List) entry.getValue(), writer, gVar.mo54066S());
                    return;
                case 10:
                    C18922z2.m88339s0(gVar.getNumber(), (List) entry.getValue(), writer, gVar.mo54066S());
                    return;
                case 11:
                    C18922z2.m88343u0(gVar.getNumber(), (List) entry.getValue(), writer, gVar.mo54066S());
                    return;
                case 12:
                    C18922z2.m88347w0(gVar.getNumber(), (List) entry.getValue(), writer, gVar.mo54066S());
                    return;
                case 13:
                    C18922z2.m88351y0(gVar.getNumber(), (List) entry.getValue(), writer, gVar.mo54066S());
                    return;
                case 14:
                    C18922z2.m88323k0(gVar.getNumber(), (List) entry.getValue(), writer, gVar.mo54066S());
                    return;
                case 15:
                    C18922z2.m88298W(gVar.getNumber(), (List) entry.getValue(), writer);
                    return;
                case 16:
                    C18922z2.m88273B0(gVar.getNumber(), (List) entry.getValue(), writer);
                    return;
                case 17:
                    List list = (List) entry.getValue();
                    if (list != null && !list.isEmpty()) {
                        C18922z2.m88319i0(gVar.getNumber(), (List) entry.getValue(), writer, C18853r2.m87361a().mo55373i(list.get(0).getClass()));
                        return;
                    }
                    return;
                case 18:
                    List list2 = (List) entry.getValue();
                    if (list2 != null && !list2.isEmpty()) {
                        C18922z2.m88335q0(gVar.getNumber(), (List) entry.getValue(), writer, C18853r2.m87361a().mo55373i(list2.get(0).getClass()));
                        return;
                    }
                    return;
                default:
                    return;
            }
        } else {
            switch (C18851a.f47987a[gVar.mo54064D().ordinal()]) {
                case 1:
                    writer.mo54241q(gVar.getNumber(), ((Double) entry.getValue()).doubleValue());
                    return;
                case 2:
                    writer.mo54211F(gVar.getNumber(), ((Float) entry.getValue()).floatValue());
                    return;
                case 3:
                    writer.mo54248x(gVar.getNumber(), ((Long) entry.getValue()).longValue());
                    return;
                case 4:
                    writer.mo54231g(gVar.getNumber(), ((Long) entry.getValue()).longValue());
                    return;
                case 5:
                    writer.mo54233i(gVar.getNumber(), ((Integer) entry.getValue()).intValue());
                    return;
                case 6:
                    writer.mo54244t(gVar.getNumber(), ((Long) entry.getValue()).longValue());
                    return;
                case 7:
                    writer.mo54227c(gVar.getNumber(), ((Integer) entry.getValue()).intValue());
                    return;
                case 8:
                    writer.mo54249y(gVar.getNumber(), ((Boolean) entry.getValue()).booleanValue());
                    return;
                case 9:
                    writer.mo54240p(gVar.getNumber(), ((Integer) entry.getValue()).intValue());
                    return;
                case 10:
                    writer.mo54250z(gVar.getNumber(), ((Integer) entry.getValue()).intValue());
                    return;
                case 11:
                    writer.mo54234j(gVar.getNumber(), ((Long) entry.getValue()).longValue());
                    return;
                case 12:
                    writer.mo54217L(gVar.getNumber(), ((Integer) entry.getValue()).intValue());
                    return;
                case 13:
                    writer.mo54238n(gVar.getNumber(), ((Long) entry.getValue()).longValue());
                    return;
                case 14:
                    writer.mo54233i(gVar.getNumber(), ((Integer) entry.getValue()).intValue());
                    return;
                case 15:
                    writer.mo54220O(gVar.getNumber(), (ByteString) entry.getValue());
                    return;
                case 16:
                    writer.mo54230f(gVar.getNumber(), (String) entry.getValue());
                    return;
                case 17:
                    writer.mo54223R(gVar.getNumber(), entry.getValue(), C18853r2.m87361a().mo55373i(entry.getValue().getClass()));
                    return;
                case 18:
                    writer.mo54221P(gVar.getNumber(), entry.getValue(), C18853r2.m87361a().mo55373i(entry.getValue().getClass()));
                    return;
                default:
                    return;
            }
        }
    }

    /* renamed from: k */
    public void mo55352k(Object obj, C18909y0<GeneratedMessageLite.C18640g> y0Var) {
        ((GeneratedMessageLite.C18637e) obj).extensions = y0Var;
    }
}
