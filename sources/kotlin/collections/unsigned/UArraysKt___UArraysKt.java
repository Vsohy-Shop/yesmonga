package kotlin.collections.unsigned;

import com.google.firebase.analytics.FirebaseAnalytics;
import com.usabilla.sdk.ubform.sdk.field.model.common.BaseOptionModel;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import kotlin.C10857a2;
import kotlin.C11078d1;
import kotlin.C11079d2;
import kotlin.C11097g2;
import kotlin.C11395k;
import kotlin.C11398l;
import kotlin.C11400l1;
import kotlin.C11403m0;
import kotlin.C11404m1;
import kotlin.C11419p1;
import kotlin.C11429q;
import kotlin.C11431q1;
import kotlin.C11531s;
import kotlin.C11587t0;
import kotlin.C11588t1;
import kotlin.C11662u1;
import kotlin.C11665v0;
import kotlin.C11679z1;
import kotlin.Pair;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.C10904b;
import kotlin.collections.C10942h0;
import kotlin.collections.C10943h1;
import kotlin.collections.C10946i0;
import kotlin.collections.C10953k0;
import kotlin.collections.C10956m;
import kotlin.collections.C10975r0;
import kotlin.collections.C10976s;
import kotlin.collections.C10978t;
import kotlin.collections.C10994x;
import kotlin.collections.C10998z;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.internal.C11110f;
import kotlin.jvm.C11314h;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.functions.C11305q;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.random.Random;
import kotlin.ranges.C11466l;
import kotlin.ranges.C11479u;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11363r0({"SMAP\n_UArrays.kt\nKotlin\n*S Kotlin\n*F\n+ 1 _UArrays.kt\nkotlin/collections/unsigned/UArraysKt___UArraysKt\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n*L\n1#1,10877:1\n3919#1:10878\n3927#1:10879\n3935#1:10880\n3943#1:10881\n3919#1:10882\n3927#1:10883\n3935#1:10884\n3943#1:10885\n3919#1:10886\n3927#1:10887\n3935#1:10888\n3943#1:10889\n3919#1:10939\n3927#1:10940\n3935#1:10941\n3943#1:10942\n3919#1:10943\n3927#1:10944\n3935#1:10945\n3943#1:10946\n3919#1:10947\n3927#1:10948\n3935#1:10949\n3943#1:10950\n3919#1:11007\n3927#1:11008\n3935#1:11009\n3943#1:11010\n3919#1:11011\n3927#1:11012\n3935#1:11013\n3943#1:11014\n3919#1:11015\n3927#1:11016\n3935#1:11017\n3943#1:11018\n3919#1:11019\n3927#1:11020\n3935#1:11021\n3943#1:11022\n3919#1:11023\n3927#1:11024\n3935#1:11025\n3943#1:11026\n3919#1:11027\n3927#1:11028\n3935#1:11029\n3943#1:11030\n3919#1:11031\n3927#1:11032\n3935#1:11033\n3943#1:11034\n3919#1:11035\n3927#1:11036\n3935#1:11037\n3943#1:11038\n3919#1:11039\n3927#1:11040\n3935#1:11041\n3943#1:11042\n3919#1:11043\n3927#1:11044\n3935#1:11045\n3943#1:11046\n3919#1:11047\n3927#1:11048\n3935#1:11049\n3943#1:11050\n3919#1:11051\n3927#1:11052\n3935#1:11053\n3943#1:11054\n3919#1:11055\n3927#1:11056\n3935#1:11057\n3943#1:11058\n3919#1:11059\n3927#1:11060\n3935#1:11061\n3943#1:11062\n3919#1:11063\n3927#1:11064\n3935#1:11065\n3943#1:11066\n3919#1:11067\n3927#1:11068\n3935#1:11069\n3943#1:11070\n3919#1:11071\n3927#1:11072\n3935#1:11073\n3943#1:11074\n3919#1:11075\n3927#1:11076\n3935#1:11077\n3943#1:11078\n3919#1:11079\n3927#1:11080\n3935#1:11081\n3943#1:11082\n3919#1:11083\n3927#1:11084\n3935#1:11085\n3943#1:11086\n3919#1:11087\n3927#1:11088\n3935#1:11089\n3943#1:11090\n3919#1:11091\n3927#1:11092\n3935#1:11093\n3943#1:11094\n3919#1:11095\n3927#1:11096\n3935#1:11097\n3943#1:11098\n3919#1:11099\n3927#1:11100\n3935#1:11101\n3943#1:11102\n3919#1:11103\n3927#1:11104\n3935#1:11105\n3943#1:11106\n3919#1:11107\n3927#1:11108\n3935#1:11109\n3943#1:11110\n3919#1:11111\n3927#1:11112\n3935#1:11113\n3943#1:11114\n3919#1:11115\n3927#1:11116\n3935#1:11117\n3943#1:11118\n3919#1:11119\n3927#1:11120\n3935#1:11121\n3943#1:11122\n3919#1:11123\n3927#1:11124\n3935#1:11125\n3943#1:11126\n3919#1:11127\n3927#1:11128\n3935#1:11129\n3943#1:11130\n3919#1:11131\n3927#1:11132\n3935#1:11133\n3943#1:11134\n3919#1:11135\n3927#1:11136\n3935#1:11137\n3943#1:11138\n3919#1:11139\n3927#1:11140\n3935#1:11141\n3943#1:11142\n3919#1:11143\n3927#1:11144\n3935#1:11145\n3943#1:11146\n3919#1:11147\n3927#1:11148\n3935#1:11149\n3943#1:11150\n3919#1:11151\n3927#1:11152\n3935#1:11153\n3943#1:11154\n3919#1:11155\n3927#1:11156\n3935#1:11157\n3943#1:11158\n1663#2,6:10890\n1675#2,6:10896\n1639#2,6:10902\n1651#2,6:10908\n1771#2,6:10914\n1783#2,6:10920\n1747#2,6:10926\n1759#2,6:10932\n1#3:10938\n361#4,7:10951\n361#4,7:10958\n361#4,7:10965\n361#4,7:10972\n361#4,7:10979\n361#4,7:10986\n361#4,7:10993\n361#4,7:11000\n*S KotlinDebug\n*F\n+ 1 _UArrays.kt\nkotlin/collections/unsigned/UArraysKt___UArraysKt\n*L\n326#1:10878\n338#1:10879\n350#1:10880\n362#1:10881\n692#1:10882\n702#1:10883\n712#1:10884\n722#1:10885\n733#1:10886\n744#1:10887\n755#1:10888\n766#1:10889\n1718#1:10939\n1735#1:10940\n1752#1:10941\n1769#1:10942\n2546#1:10943\n2563#1:10944\n2580#1:10945\n2597#1:10946\n2913#1:10947\n2929#1:10948\n2945#1:10949\n2961#1:10950\n5717#1:11007\n5737#1:11008\n5757#1:11009\n5777#1:11010\n5798#1:11011\n5820#1:11012\n5842#1:11013\n5864#1:11014\n5977#1:11015\n5996#1:11016\n6015#1:11017\n6034#1:11018\n6056#1:11019\n6085#1:11020\n6114#1:11021\n6143#1:11022\n6168#1:11023\n6193#1:11024\n6218#1:11025\n6243#1:11026\n6273#1:11027\n6296#1:11028\n6319#1:11029\n6342#1:11030\n6365#1:11031\n6388#1:11032\n6411#1:11033\n6434#1:11034\n6455#1:11035\n6478#1:11036\n6501#1:11037\n6524#1:11038\n6547#1:11039\n6568#1:11040\n6589#1:11041\n6610#1:11042\n6631#1:11043\n6652#1:11044\n6673#1:11045\n6694#1:11046\n6713#1:11047\n6734#1:11048\n6755#1:11049\n6776#1:11050\n6799#1:11051\n6822#1:11052\n6845#1:11053\n6868#1:11054\n6889#1:11055\n6910#1:11056\n6931#1:11057\n6952#1:11058\n6969#1:11059\n6984#1:11060\n6999#1:11061\n7014#1:11062\n7033#1:11063\n7052#1:11064\n7071#1:11065\n7090#1:11066\n7105#1:11067\n7120#1:11068\n7135#1:11069\n7150#1:11070\n7169#1:11071\n7188#1:11072\n7207#1:11073\n7226#1:11074\n7248#1:11075\n7277#1:11076\n7306#1:11077\n7335#1:11078\n7360#1:11079\n7385#1:11080\n7410#1:11081\n7435#1:11082\n7465#1:11083\n7488#1:11084\n7511#1:11085\n7534#1:11086\n7557#1:11087\n7580#1:11088\n7603#1:11089\n7626#1:11090\n7647#1:11091\n7670#1:11092\n7693#1:11093\n7716#1:11094\n7739#1:11095\n7760#1:11096\n7781#1:11097\n7802#1:11098\n7823#1:11099\n7844#1:11100\n7865#1:11101\n7886#1:11102\n7905#1:11103\n7926#1:11104\n7947#1:11105\n7968#1:11106\n7991#1:11107\n8014#1:11108\n8037#1:11109\n8060#1:11110\n8081#1:11111\n8102#1:11112\n8123#1:11113\n8144#1:11114\n8161#1:11115\n8176#1:11116\n8191#1:11117\n8206#1:11118\n8225#1:11119\n8244#1:11120\n8263#1:11121\n8282#1:11122\n8297#1:11123\n8312#1:11124\n8327#1:11125\n8342#1:11126\n8560#1:11127\n8585#1:11128\n8610#1:11129\n8635#1:11130\n8660#1:11131\n8685#1:11132\n8710#1:11133\n8735#1:11134\n8759#1:11135\n8783#1:11136\n8807#1:11137\n8831#1:11138\n8856#1:11139\n8881#1:11140\n8906#1:11141\n8931#1:11142\n8953#1:11143\n8978#1:11144\n9003#1:11145\n9028#1:11146\n9053#1:11147\n9079#1:11148\n9105#1:11149\n9131#1:11150\n9156#1:11151\n9181#1:11152\n9206#1:11153\n9231#1:11154\n9257#1:11155\n9282#1:11156\n9307#1:11157\n9332#1:11158\n816#1:10890,6\n826#1:10896,6\n836#1:10902,6\n846#1:10908,6\n856#1:10914,6\n866#1:10920,6\n876#1:10926,6\n886#1:10932,6\n4935#1:10951,7\n4955#1:10958,7\n4975#1:10965,7\n4995#1:10972,7\n5016#1:10979,7\n5037#1:10986,7\n5058#1:10993,7\n5079#1:11000,7\n*E\n"})
public class UArraysKt___UArraysKt extends C10985b {
    @C11531s
    @C11110f
    @C11665v0(version = "1.3")
    /* renamed from: A0 */
    public static final long m41551A0(long[] jArr) {
        Intrinsics.checkNotNullParameter(jArr, "$this$component1");
        return C11662u1.m45750Q(jArr, 0);
    }

    @C11531s
    @C11110f
    @C11665v0(version = "1.3")
    /* renamed from: A1 */
    public static final byte[] m41552A1(byte[] bArr, int i) {
        Intrinsics.checkNotNullParameter(bArr, "$this$copyOf");
        byte[] copyOf = Arrays.copyOf(bArr, i);
        Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(this, newSize)");
        return C11404m1.m43818q(copyOf);
    }

    @C11531s
    @C11110f
    @C11665v0(version = "1.3")
    /* renamed from: A2 */
    public static final List<C11588t1> m41553A2(long[] jArr, C11304p<? super Integer, ? super C11588t1, Boolean> pVar) {
        Intrinsics.checkNotNullParameter(jArr, "$this$filterIndexed");
        Intrinsics.checkNotNullParameter(pVar, "predicate");
        ArrayList arrayList = new ArrayList();
        int X = C11662u1.m45751X(jArr);
        int i = 0;
        int i2 = 0;
        while (i < X) {
            long Q = C11662u1.m45750Q(jArr, i);
            int i3 = i2 + 1;
            if (pVar.invoke(Integer.valueOf(i2), C11588t1.m44992g(Q)).booleanValue()) {
                arrayList.add(C11588t1.m44992g(Q));
            }
            i++;
            i2 = i3;
        }
        return arrayList;
    }

    @C11531s
    @C11110f
    @C11665v0(version = "1.4")
    @C11403m0
    /* renamed from: A3 */
    public static final <R, C extends Collection<? super R>> C m41554A3(byte[] bArr, C c, C11304p<? super Integer, ? super C11400l1, ? extends Iterable<? extends R>> pVar) {
        Intrinsics.checkNotNullParameter(bArr, "$this$flatMapIndexedTo");
        Intrinsics.checkNotNullParameter(c, FirebaseAnalytics.C32532b.f78977z);
        Intrinsics.checkNotNullParameter(pVar, "transform");
        int X = C11404m1.m43809X(bArr);
        int i = 0;
        int i2 = 0;
        while (i < X) {
            C10994x.m42360n0(c, (Iterable) pVar.invoke(Integer.valueOf(i2), C11400l1.m43782g(C11404m1.m43808Q(bArr, i))));
            i++;
            i2++;
        }
        return c;
    }

    @C11531s
    @C12580l
    @C11665v0(version = "1.3")
    /* renamed from: A4 */
    public static final C11419p1 m41555A4(@C12579k int[] iArr, int i) {
        Intrinsics.checkNotNullParameter(iArr, "$this$getOrNull");
        if (i < 0 || i > ArraysKt___ArraysKt.m39459Ve(iArr)) {
            return null;
        }
        return C11419p1.m43993g(C11431q1.m44044Q(iArr, i));
    }

    @C11531s
    @C11110f
    @C11665v0(version = "1.3")
    /* renamed from: A5 */
    public static final <R> List<R> m41556A5(int[] iArr, C11300l<? super C11419p1, ? extends R> lVar) {
        Intrinsics.checkNotNullParameter(iArr, "$this$map");
        Intrinsics.checkNotNullParameter(lVar, "transform");
        ArrayList arrayList = new ArrayList(C11431q1.m44045X(iArr));
        int X = C11431q1.m44045X(iArr);
        for (int i = 0; i < X; i++) {
            arrayList.add(lVar.invoke(C11419p1.m43993g(C11431q1.m44044Q(iArr, i))));
        }
        return arrayList;
    }

    @C11531s
    @C11110f
    @C11665v0(version = "1.4")
    @C11403m0
    /* renamed from: A6 */
    public static final <R> R m41557A6(short[] sArr, Comparator<? super R> comparator, C11300l<? super C11679z1, ? extends R> lVar) {
        Intrinsics.checkNotNullParameter(sArr, "$this$maxOfWithOrNull");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        Intrinsics.checkNotNullParameter(lVar, "selector");
        if (C10857a2.m38731h0(sArr)) {
            return null;
        }
        R invoke = lVar.invoke(C11679z1.m45862g(C10857a2.m38726Q(sArr, 0)));
        C10953k0 H = new C11466l(1, ArraysKt___ArraysKt.m39555Ye(sArr)).iterator();
        while (H.hasNext()) {
            R invoke2 = lVar.invoke(C11679z1.m45862g(C10857a2.m38726Q(sArr, H.mo6374c())));
            if (comparator.compare(invoke, invoke2) < 0) {
                invoke = invoke2;
            }
        }
        return invoke;
    }

    @C11531s
    @C11110f
    @C11665v0(version = "1.4")
    @C11403m0
    /* renamed from: A7 */
    public static final <R> R m41558A7(short[] sArr, Comparator<? super R> comparator, C11300l<? super C11679z1, ? extends R> lVar) {
        Intrinsics.checkNotNullParameter(sArr, "$this$minOfWith");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        Intrinsics.checkNotNullParameter(lVar, "selector");
        if (!C10857a2.m38731h0(sArr)) {
            R invoke = lVar.invoke(C11679z1.m45862g(C10857a2.m38726Q(sArr, 0)));
            C10953k0 H = new C11466l(1, ArraysKt___ArraysKt.m39555Ye(sArr)).iterator();
            while (H.hasNext()) {
                R invoke2 = lVar.invoke(C11679z1.m45862g(C10857a2.m38726Q(sArr, H.mo6374c())));
                if (comparator.compare(invoke, invoke2) > 0) {
                    invoke = invoke2;
                }
            }
            return invoke;
        }
        throw new NoSuchElementException();
    }

    @C11531s
    @C11110f
    @C11665v0(version = "1.3")
    /* renamed from: A8 */
    public static final byte m41559A8(byte[] bArr) {
        Intrinsics.checkNotNullParameter(bArr, "$this$random");
        return m41598D8(bArr, Random.f28564a);
    }

    @C11531s
    @C11110f
    @C11665v0(version = "1.4")
    /* renamed from: A9 */
    public static final void m41560A9(int[] iArr, int i, int i2) {
        Intrinsics.checkNotNullParameter(iArr, "$this$reverse");
        ArraysKt___ArraysKt.m40417zr(iArr, i, i2);
    }

    @C11531s
    @C11110f
    @C11665v0(version = "1.3")
    /* renamed from: Aa */
    public static final C11400l1 m41561Aa(byte[] bArr, C11300l<? super C11400l1, Boolean> lVar) {
        Intrinsics.checkNotNullParameter(bArr, "$this$singleOrNull");
        Intrinsics.checkNotNullParameter(lVar, "predicate");
        int X = C11404m1.m43809X(bArr);
        C11400l1 l1Var = null;
        boolean z = false;
        for (int i = 0; i < X; i++) {
            byte Q = C11404m1.m43808Q(bArr, i);
            if (lVar.invoke(C11400l1.m43782g(Q)).booleanValue()) {
                if (z) {
                    return null;
                }
                l1Var = C11400l1.m43782g(Q);
                z = true;
            }
        }
        if (!z) {
            return null;
        }
        return l1Var;
    }

    @C11531s
    @C11665v0(version = "1.3")
    @C12579k
    /* renamed from: Ab */
    public static final long[] m41562Ab(@C12579k long[] jArr) {
        Intrinsics.checkNotNullParameter(jArr, "$this$sortedArrayDescending");
        if (C11662u1.m45755h0(jArr)) {
            return jArr;
        }
        long[] copyOf = Arrays.copyOf(jArr, jArr.length);
        Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(this, size)");
        long[] q = C11662u1.m45760q(copyOf);
        m42086nb(q);
        return q;
    }

    @C11531s
    @C11110f
    @C11665v0(version = "1.3")
    /* renamed from: Ac */
    public static final List<C11419p1> m41563Ac(int[] iArr, C11300l<? super C11419p1, Boolean> lVar) {
        Intrinsics.checkNotNullParameter(iArr, "$this$takeLastWhile");
        Intrinsics.checkNotNullParameter(lVar, "predicate");
        for (int Ve = ArraysKt___ArraysKt.m39459Ve(iArr); -1 < Ve; Ve--) {
            if (!lVar.invoke(C11419p1.m43993g(C11431q1.m44044Q(iArr, Ve))).booleanValue()) {
                return m41760Q1(iArr, Ve + 1);
            }
        }
        return CollectionsKt___CollectionsKt.m40557Q5(C11431q1.m44048h(iArr));
    }

    @C11531s
    @C11110f
    @C11665v0(version = "1.3")
    /* renamed from: B0 */
    public static final short m41564B0(short[] sArr) {
        Intrinsics.checkNotNullParameter(sArr, "$this$component1");
        return C10857a2.m38726Q(sArr, 0);
    }

    @C11531s
    @C11110f
    @C11665v0(version = "1.3")
    /* renamed from: B1 */
    public static final long[] m41565B1(long[] jArr) {
        Intrinsics.checkNotNullParameter(jArr, "$this$copyOf");
        long[] copyOf = Arrays.copyOf(jArr, jArr.length);
        Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(this, size)");
        return C11662u1.m45760q(copyOf);
    }

    @C11531s
    @C11110f
    @C11665v0(version = "1.3")
    /* renamed from: B2 */
    public static final List<C11679z1> m41566B2(short[] sArr, C11304p<? super Integer, ? super C11679z1, Boolean> pVar) {
        Intrinsics.checkNotNullParameter(sArr, "$this$filterIndexed");
        Intrinsics.checkNotNullParameter(pVar, "predicate");
        ArrayList arrayList = new ArrayList();
        int X = C10857a2.m38727X(sArr);
        int i = 0;
        int i2 = 0;
        while (i < X) {
            short Q = C10857a2.m38726Q(sArr, i);
            int i3 = i2 + 1;
            if (pVar.invoke(Integer.valueOf(i2), C11679z1.m45862g(Q)).booleanValue()) {
                arrayList.add(C11679z1.m45862g(Q));
            }
            i++;
            i2 = i3;
        }
        return arrayList;
    }

    @C11531s
    @C11110f
    @C11665v0(version = "1.4")
    @C11403m0
    /* renamed from: B3 */
    public static final <R, C extends Collection<? super R>> C m41567B3(long[] jArr, C c, C11304p<? super Integer, ? super C11588t1, ? extends Iterable<? extends R>> pVar) {
        Intrinsics.checkNotNullParameter(jArr, "$this$flatMapIndexedTo");
        Intrinsics.checkNotNullParameter(c, FirebaseAnalytics.C32532b.f78977z);
        Intrinsics.checkNotNullParameter(pVar, "transform");
        int X = C11662u1.m45751X(jArr);
        int i = 0;
        int i2 = 0;
        while (i < X) {
            C10994x.m42360n0(c, (Iterable) pVar.invoke(Integer.valueOf(i2), C11588t1.m44992g(C11662u1.m45750Q(jArr, i))));
            i++;
            i2++;
        }
        return c;
    }

    @C11531s
    @C12580l
    @C11665v0(version = "1.3")
    /* renamed from: B4 */
    public static final C11588t1 m41568B4(@C12579k long[] jArr, int i) {
        Intrinsics.checkNotNullParameter(jArr, "$this$getOrNull");
        if (i < 0 || i > ArraysKt___ArraysKt.m39491We(jArr)) {
            return null;
        }
        return C11588t1.m44992g(C11662u1.m45750Q(jArr, i));
    }

    @C11531s
    @C11110f
    @C11665v0(version = "1.3")
    /* renamed from: B5 */
    public static final <R> List<R> m41569B5(short[] sArr, C11300l<? super C11679z1, ? extends R> lVar) {
        Intrinsics.checkNotNullParameter(sArr, "$this$map");
        Intrinsics.checkNotNullParameter(lVar, "transform");
        ArrayList arrayList = new ArrayList(C10857a2.m38727X(sArr));
        int X = C10857a2.m38727X(sArr);
        for (int i = 0; i < X; i++) {
            arrayList.add(lVar.invoke(C11679z1.m45862g(C10857a2.m38726Q(sArr, i))));
        }
        return arrayList;
    }

    @C11531s
    @C11110f
    @C11665v0(version = "1.4")
    @C11403m0
    /* renamed from: B6 */
    public static final <R> R m41570B6(int[] iArr, Comparator<? super R> comparator, C11300l<? super C11419p1, ? extends R> lVar) {
        Intrinsics.checkNotNullParameter(iArr, "$this$maxOfWithOrNull");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        Intrinsics.checkNotNullParameter(lVar, "selector");
        if (C11431q1.m44049h0(iArr)) {
            return null;
        }
        R invoke = lVar.invoke(C11419p1.m43993g(C11431q1.m44044Q(iArr, 0)));
        C10953k0 H = new C11466l(1, ArraysKt___ArraysKt.m39459Ve(iArr)).iterator();
        while (H.hasNext()) {
            R invoke2 = lVar.invoke(C11419p1.m43993g(C11431q1.m44044Q(iArr, H.mo6374c())));
            if (comparator.compare(invoke, invoke2) < 0) {
                invoke = invoke2;
            }
        }
        return invoke;
    }

    @C11531s
    @C11110f
    @C11665v0(version = "1.4")
    @C11403m0
    /* renamed from: B7 */
    public static final <R> R m41571B7(int[] iArr, Comparator<? super R> comparator, C11300l<? super C11419p1, ? extends R> lVar) {
        Intrinsics.checkNotNullParameter(iArr, "$this$minOfWith");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        Intrinsics.checkNotNullParameter(lVar, "selector");
        if (!C11431q1.m44049h0(iArr)) {
            R invoke = lVar.invoke(C11419p1.m43993g(C11431q1.m44044Q(iArr, 0)));
            C10953k0 H = new C11466l(1, ArraysKt___ArraysKt.m39459Ve(iArr)).iterator();
            while (H.hasNext()) {
                R invoke2 = lVar.invoke(C11419p1.m43993g(C11431q1.m44044Q(iArr, H.mo6374c())));
                if (comparator.compare(invoke, invoke2) > 0) {
                    invoke = invoke2;
                }
            }
            return invoke;
        }
        throw new NoSuchElementException();
    }

    @C11531s
    @C11665v0(version = "1.3")
    /* renamed from: B8 */
    public static final long m41572B8(@C12579k long[] jArr, @C12579k Random random) {
        Intrinsics.checkNotNullParameter(jArr, "$this$random");
        Intrinsics.checkNotNullParameter(random, BaseOptionModel.f27465E0);
        if (!C11662u1.m45755h0(jArr)) {
            return C11662u1.m45750Q(jArr, random.mo22986m(C11662u1.m45751X(jArr)));
        }
        throw new NoSuchElementException("Array is empty.");
    }

    @C11531s
    @C11110f
    @C11665v0(version = "1.3")
    /* renamed from: B9 */
    public static final void m41573B9(short[] sArr) {
        Intrinsics.checkNotNullParameter(sArr, "$this$reverse");
        ArraysKt___ArraysKt.m38928Er(sArr);
    }

    @C11531s
    @C11110f
    @C11665v0(version = "1.3")
    /* renamed from: Ba */
    public static final C11588t1 m41574Ba(long[] jArr, C11300l<? super C11588t1, Boolean> lVar) {
        Intrinsics.checkNotNullParameter(jArr, "$this$singleOrNull");
        Intrinsics.checkNotNullParameter(lVar, "predicate");
        int X = C11662u1.m45751X(jArr);
        C11588t1 t1Var = null;
        boolean z = false;
        for (int i = 0; i < X; i++) {
            long Q = C11662u1.m45750Q(jArr, i);
            if (lVar.invoke(C11588t1.m44992g(Q)).booleanValue()) {
                if (z) {
                    return null;
                }
                t1Var = C11588t1.m44992g(Q);
                z = true;
            }
        }
        if (!z) {
            return null;
        }
        return t1Var;
    }

    @C11531s
    @C11665v0(version = "1.3")
    @C12579k
    /* renamed from: Bb */
    public static final short[] m41575Bb(@C12579k short[] sArr) {
        Intrinsics.checkNotNullParameter(sArr, "$this$sortedArrayDescending");
        if (C10857a2.m38731h0(sArr)) {
            return sArr;
        }
        short[] copyOf = Arrays.copyOf(sArr, sArr.length);
        Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(this, size)");
        short[] q = C10857a2.m38736q(copyOf);
        m42114pb(q);
        return q;
    }

    @C11531s
    @C11110f
    @C11665v0(version = "1.3")
    /* renamed from: Bc */
    public static final List<C11679z1> m41576Bc(short[] sArr, C11300l<? super C11679z1, Boolean> lVar) {
        Intrinsics.checkNotNullParameter(sArr, "$this$takeLastWhile");
        Intrinsics.checkNotNullParameter(lVar, "predicate");
        for (int Ye = ArraysKt___ArraysKt.m39555Ye(sArr); -1 < Ye; Ye--) {
            if (!lVar.invoke(C11679z1.m45862g(C10857a2.m38726Q(sArr, Ye))).booleanValue()) {
                return m41747P1(sArr, Ye + 1);
            }
        }
        return CollectionsKt___CollectionsKt.m40557Q5(C10857a2.m38730h(sArr));
    }

    @C11531s
    @C11110f
    @C11665v0(version = "1.3")
    /* renamed from: C0 */
    public static final int m41577C0(int[] iArr) {
        Intrinsics.checkNotNullParameter(iArr, "$this$component2");
        return C11431q1.m44044Q(iArr, 1);
    }

    @C11531s
    @C11110f
    @C11665v0(version = "1.3")
    /* renamed from: C1 */
    public static final short[] m41578C1(short[] sArr, int i) {
        Intrinsics.checkNotNullParameter(sArr, "$this$copyOf");
        short[] copyOf = Arrays.copyOf(sArr, i);
        Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(this, newSize)");
        return C10857a2.m38736q(copyOf);
    }

    @C11531s
    @C11110f
    @C11665v0(version = "1.3")
    /* renamed from: C2 */
    public static final <C extends Collection<? super C11419p1>> C m41579C2(int[] iArr, C c, C11304p<? super Integer, ? super C11419p1, Boolean> pVar) {
        Intrinsics.checkNotNullParameter(iArr, "$this$filterIndexedTo");
        Intrinsics.checkNotNullParameter(c, FirebaseAnalytics.C32532b.f78977z);
        Intrinsics.checkNotNullParameter(pVar, "predicate");
        int X = C11431q1.m44045X(iArr);
        int i = 0;
        int i2 = 0;
        while (i < X) {
            int Q = C11431q1.m44044Q(iArr, i);
            int i3 = i2 + 1;
            if (pVar.invoke(Integer.valueOf(i2), C11419p1.m43993g(Q)).booleanValue()) {
                c.add(C11419p1.m43993g(Q));
            }
            i++;
            i2 = i3;
        }
        return c;
    }

    @C11531s
    @C11110f
    @C11665v0(version = "1.3")
    /* renamed from: C3 */
    public static final <R, C extends Collection<? super R>> C m41580C3(long[] jArr, C c, C11300l<? super C11588t1, ? extends Iterable<? extends R>> lVar) {
        Intrinsics.checkNotNullParameter(jArr, "$this$flatMapTo");
        Intrinsics.checkNotNullParameter(c, FirebaseAnalytics.C32532b.f78977z);
        Intrinsics.checkNotNullParameter(lVar, "transform");
        int X = C11662u1.m45751X(jArr);
        for (int i = 0; i < X; i++) {
            C10994x.m42360n0(c, (Iterable) lVar.invoke(C11588t1.m44992g(C11662u1.m45750Q(jArr, i))));
        }
        return c;
    }

    @C11531s
    @C11110f
    @C11665v0(version = "1.3")
    /* renamed from: C4 */
    public static final <K, V> Map<K, List<V>> m41581C4(long[] jArr, C11300l<? super C11588t1, ? extends K> lVar, C11300l<? super C11588t1, ? extends V> lVar2) {
        Intrinsics.checkNotNullParameter(jArr, "$this$groupBy");
        Intrinsics.checkNotNullParameter(lVar, "keySelector");
        Intrinsics.checkNotNullParameter(lVar2, "valueTransform");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        int X = C11662u1.m45751X(jArr);
        for (int i = 0; i < X; i++) {
            long Q = C11662u1.m45750Q(jArr, i);
            Object invoke = lVar.invoke(C11588t1.m44992g(Q));
            Object obj = linkedHashMap.get(invoke);
            if (obj == null) {
                obj = new ArrayList();
                linkedHashMap.put(invoke, obj);
            }
            ((List) obj).add(lVar2.invoke(C11588t1.m44992g(Q)));
        }
        return linkedHashMap;
    }

    @C11531s
    @C11110f
    @C11665v0(version = "1.3")
    /* renamed from: C5 */
    public static final <R> List<R> m41582C5(byte[] bArr, C11304p<? super Integer, ? super C11400l1, ? extends R> pVar) {
        Intrinsics.checkNotNullParameter(bArr, "$this$mapIndexed");
        Intrinsics.checkNotNullParameter(pVar, "transform");
        ArrayList arrayList = new ArrayList(C11404m1.m43809X(bArr));
        int X = C11404m1.m43809X(bArr);
        int i = 0;
        int i2 = 0;
        while (i < X) {
            arrayList.add(pVar.invoke(Integer.valueOf(i2), C11400l1.m43782g(C11404m1.m43808Q(bArr, i))));
            i++;
            i2++;
        }
        return arrayList;
    }

    @C11531s
    @C12580l
    @C11665v0(version = "1.4")
    /* renamed from: C6 */
    public static final C11419p1 m41583C6(@C12579k int[] iArr) {
        Intrinsics.checkNotNullParameter(iArr, "$this$maxOrNull");
        if (C11431q1.m44049h0(iArr)) {
            return null;
        }
        int Q = C11431q1.m44044Q(iArr, 0);
        C10953k0 H = new C11466l(1, ArraysKt___ArraysKt.m39459Ve(iArr)).iterator();
        while (H.hasNext()) {
            int Q2 = C11431q1.m44044Q(iArr, H.mo6374c());
            if (Integer.compare(Q ^ Integer.MIN_VALUE, Q2 ^ Integer.MIN_VALUE) < 0) {
                Q = Q2;
            }
        }
        return C11419p1.m43993g(Q);
    }

    @C11531s
    @C11110f
    @C11665v0(version = "1.4")
    @C11403m0
    /* renamed from: C7 */
    public static final <R> R m41584C7(long[] jArr, Comparator<? super R> comparator, C11300l<? super C11588t1, ? extends R> lVar) {
        Intrinsics.checkNotNullParameter(jArr, "$this$minOfWithOrNull");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        Intrinsics.checkNotNullParameter(lVar, "selector");
        if (C11662u1.m45755h0(jArr)) {
            return null;
        }
        R invoke = lVar.invoke(C11588t1.m44992g(C11662u1.m45750Q(jArr, 0)));
        C10953k0 H = new C11466l(1, ArraysKt___ArraysKt.m39491We(jArr)).iterator();
        while (H.hasNext()) {
            R invoke2 = lVar.invoke(C11588t1.m44992g(C11662u1.m45750Q(jArr, H.mo6374c())));
            if (comparator.compare(invoke, invoke2) > 0) {
                invoke = invoke2;
            }
        }
        return invoke;
    }

    @C11531s
    @C11110f
    @C11665v0(version = "1.3")
    /* renamed from: C8 */
    public static final long m41585C8(long[] jArr) {
        Intrinsics.checkNotNullParameter(jArr, "$this$random");
        return m41572B8(jArr, Random.f28564a);
    }

    @C11531s
    @C11665v0(version = "1.3")
    @C12579k
    /* renamed from: C9 */
    public static final List<C11419p1> m41586C9(@C12579k int[] iArr) {
        Intrinsics.checkNotNullParameter(iArr, "$this$reversed");
        if (C11431q1.m44049h0(iArr)) {
            return CollectionsKt__CollectionsKt.m40441E();
        }
        List<C11419p1> T5 = CollectionsKt___CollectionsKt.m40572T5(C11431q1.m44048h(iArr));
        C10998z.m42399m1(T5);
        return T5;
    }

    @C11531s
    @C12580l
    @C11665v0(version = "1.3")
    /* renamed from: Ca */
    public static final C11588t1 m41587Ca(@C12579k long[] jArr) {
        Intrinsics.checkNotNullParameter(jArr, "$this$singleOrNull");
        if (C11662u1.m45751X(jArr) == 1) {
            return C11588t1.m44992g(C11662u1.m45750Q(jArr, 0));
        }
        return null;
    }

    @C11531s
    @C11665v0(version = "1.3")
    @C12579k
    /* renamed from: Cb */
    public static final List<C11419p1> m41588Cb(@C12579k int[] iArr) {
        Intrinsics.checkNotNullParameter(iArr, "$this$sortedDescending");
        int[] copyOf = Arrays.copyOf(iArr, iArr.length);
        Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(this, size)");
        int[] q = C11431q1.m44054q(copyOf);
        m41848Wa(q);
        return m41586C9(q);
    }

    @C11531s
    @C11110f
    @C11665v0(version = "1.3")
    /* renamed from: Cc */
    public static final List<C11400l1> m41589Cc(byte[] bArr, C11300l<? super C11400l1, Boolean> lVar) {
        Intrinsics.checkNotNullParameter(bArr, "$this$takeWhile");
        Intrinsics.checkNotNullParameter(lVar, "predicate");
        ArrayList arrayList = new ArrayList();
        int X = C11404m1.m43809X(bArr);
        for (int i = 0; i < X; i++) {
            byte Q = C11404m1.m43808Q(bArr, i);
            if (!lVar.invoke(C11400l1.m43782g(Q)).booleanValue()) {
                break;
            }
            arrayList.add(C11400l1.m43782g(Q));
        }
        return arrayList;
    }

    @C11531s
    @C11110f
    @C11665v0(version = "1.3")
    /* renamed from: D0 */
    public static final byte m41590D0(byte[] bArr) {
        Intrinsics.checkNotNullParameter(bArr, "$this$component2");
        return C11404m1.m43808Q(bArr, 1);
    }

    @C11531s
    @C11110f
    @C11665v0(version = "1.3")
    /* renamed from: D1 */
    public static final int[] m41591D1(int[] iArr, int i) {
        Intrinsics.checkNotNullParameter(iArr, "$this$copyOf");
        int[] copyOf = Arrays.copyOf(iArr, i);
        Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(this, newSize)");
        return C11431q1.m44054q(copyOf);
    }

    @C11531s
    @C11110f
    @C11665v0(version = "1.3")
    /* renamed from: D2 */
    public static final <C extends Collection<? super C11679z1>> C m41592D2(short[] sArr, C c, C11304p<? super Integer, ? super C11679z1, Boolean> pVar) {
        Intrinsics.checkNotNullParameter(sArr, "$this$filterIndexedTo");
        Intrinsics.checkNotNullParameter(c, FirebaseAnalytics.C32532b.f78977z);
        Intrinsics.checkNotNullParameter(pVar, "predicate");
        int X = C10857a2.m38727X(sArr);
        int i = 0;
        int i2 = 0;
        while (i < X) {
            short Q = C10857a2.m38726Q(sArr, i);
            int i3 = i2 + 1;
            if (pVar.invoke(Integer.valueOf(i2), C11679z1.m45862g(Q)).booleanValue()) {
                c.add(C11679z1.m45862g(Q));
            }
            i++;
            i2 = i3;
        }
        return c;
    }

    @C11531s
    @C11110f
    @C11665v0(version = "1.3")
    /* renamed from: D3 */
    public static final <R, C extends Collection<? super R>> C m41593D3(short[] sArr, C c, C11300l<? super C11679z1, ? extends Iterable<? extends R>> lVar) {
        Intrinsics.checkNotNullParameter(sArr, "$this$flatMapTo");
        Intrinsics.checkNotNullParameter(c, FirebaseAnalytics.C32532b.f78977z);
        Intrinsics.checkNotNullParameter(lVar, "transform");
        int X = C10857a2.m38727X(sArr);
        for (int i = 0; i < X; i++) {
            C10994x.m42360n0(c, (Iterable) lVar.invoke(C11679z1.m45862g(C10857a2.m38726Q(sArr, i))));
        }
        return c;
    }

    @C11531s
    @C11110f
    @C11665v0(version = "1.3")
    /* renamed from: D4 */
    public static final <K, V> Map<K, List<V>> m41594D4(short[] sArr, C11300l<? super C11679z1, ? extends K> lVar, C11300l<? super C11679z1, ? extends V> lVar2) {
        Intrinsics.checkNotNullParameter(sArr, "$this$groupBy");
        Intrinsics.checkNotNullParameter(lVar, "keySelector");
        Intrinsics.checkNotNullParameter(lVar2, "valueTransform");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        int X = C10857a2.m38727X(sArr);
        for (int i = 0; i < X; i++) {
            short Q = C10857a2.m38726Q(sArr, i);
            Object invoke = lVar.invoke(C11679z1.m45862g(Q));
            Object obj = linkedHashMap.get(invoke);
            if (obj == null) {
                obj = new ArrayList();
                linkedHashMap.put(invoke, obj);
            }
            ((List) obj).add(lVar2.invoke(C11679z1.m45862g(Q)));
        }
        return linkedHashMap;
    }

    @C11531s
    @C11110f
    @C11665v0(version = "1.3")
    /* renamed from: D5 */
    public static final <R> List<R> m41595D5(int[] iArr, C11304p<? super Integer, ? super C11419p1, ? extends R> pVar) {
        Intrinsics.checkNotNullParameter(iArr, "$this$mapIndexed");
        Intrinsics.checkNotNullParameter(pVar, "transform");
        ArrayList arrayList = new ArrayList(C11431q1.m44045X(iArr));
        int X = C11431q1.m44045X(iArr);
        int i = 0;
        int i2 = 0;
        while (i < X) {
            arrayList.add(pVar.invoke(Integer.valueOf(i2), C11419p1.m43993g(C11431q1.m44044Q(iArr, i))));
            i++;
            i2++;
        }
        return arrayList;
    }

    @C11531s
    @C12580l
    @C11665v0(version = "1.4")
    /* renamed from: D6 */
    public static final C11400l1 m41596D6(@C12579k byte[] bArr) {
        Intrinsics.checkNotNullParameter(bArr, "$this$maxOrNull");
        if (C11404m1.m43813h0(bArr)) {
            return null;
        }
        byte Q = C11404m1.m43808Q(bArr, 0);
        C10953k0 H = new C11466l(1, ArraysKt___ArraysKt.m39331Re(bArr)).iterator();
        while (H.hasNext()) {
            byte Q2 = C11404m1.m43808Q(bArr, H.mo6374c());
            if (Intrinsics.compare((int) Q & 255, (int) Q2 & 255) < 0) {
                Q = Q2;
            }
        }
        return C11400l1.m43782g(Q);
    }

    @C11531s
    @C11110f
    @C11665v0(version = "1.4")
    @C11403m0
    /* renamed from: D7 */
    public static final <R> R m41597D7(byte[] bArr, Comparator<? super R> comparator, C11300l<? super C11400l1, ? extends R> lVar) {
        Intrinsics.checkNotNullParameter(bArr, "$this$minOfWithOrNull");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        Intrinsics.checkNotNullParameter(lVar, "selector");
        if (C11404m1.m43813h0(bArr)) {
            return null;
        }
        R invoke = lVar.invoke(C11400l1.m43782g(C11404m1.m43808Q(bArr, 0)));
        C10953k0 H = new C11466l(1, ArraysKt___ArraysKt.m39331Re(bArr)).iterator();
        while (H.hasNext()) {
            R invoke2 = lVar.invoke(C11400l1.m43782g(C11404m1.m43808Q(bArr, H.mo6374c())));
            if (comparator.compare(invoke, invoke2) > 0) {
                invoke = invoke2;
            }
        }
        return invoke;
    }

    @C11531s
    @C11665v0(version = "1.3")
    /* renamed from: D8 */
    public static final byte m41598D8(@C12579k byte[] bArr, @C12579k Random random) {
        Intrinsics.checkNotNullParameter(bArr, "$this$random");
        Intrinsics.checkNotNullParameter(random, BaseOptionModel.f27465E0);
        if (!C11404m1.m43813h0(bArr)) {
            return C11404m1.m43808Q(bArr, random.mo22986m(C11404m1.m43809X(bArr)));
        }
        throw new NoSuchElementException("Array is empty.");
    }

    @C11531s
    @C11665v0(version = "1.3")
    @C12579k
    /* renamed from: D9 */
    public static final List<C11400l1> m41599D9(@C12579k byte[] bArr) {
        Intrinsics.checkNotNullParameter(bArr, "$this$reversed");
        if (C11404m1.m43813h0(bArr)) {
            return CollectionsKt__CollectionsKt.m40441E();
        }
        List<C11400l1> T5 = CollectionsKt___CollectionsKt.m40572T5(C11404m1.m43812h(bArr));
        C10998z.m42399m1(T5);
        return T5;
    }

    @C11531s
    @C11110f
    @C11665v0(version = "1.3")
    /* renamed from: Da */
    public static final C11419p1 m41600Da(int[] iArr, C11300l<? super C11419p1, Boolean> lVar) {
        Intrinsics.checkNotNullParameter(iArr, "$this$singleOrNull");
        Intrinsics.checkNotNullParameter(lVar, "predicate");
        int X = C11431q1.m44045X(iArr);
        C11419p1 p1Var = null;
        boolean z = false;
        for (int i = 0; i < X; i++) {
            int Q = C11431q1.m44044Q(iArr, i);
            if (lVar.invoke(C11419p1.m43993g(Q)).booleanValue()) {
                if (z) {
                    return null;
                }
                p1Var = C11419p1.m43993g(Q);
                z = true;
            }
        }
        if (!z) {
            return null;
        }
        return p1Var;
    }

    @C11531s
    @C11665v0(version = "1.3")
    @C12579k
    /* renamed from: Db */
    public static final List<C11400l1> m41601Db(@C12579k byte[] bArr) {
        Intrinsics.checkNotNullParameter(bArr, "$this$sortedDescending");
        byte[] copyOf = Arrays.copyOf(bArr, bArr.length);
        Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(this, size)");
        byte[] q = C11404m1.m43818q(copyOf);
        m41946db(q);
        return m41599D9(q);
    }

    @C11531s
    @C11110f
    @C11665v0(version = "1.3")
    /* renamed from: Dc */
    public static final List<C11588t1> m41602Dc(long[] jArr, C11300l<? super C11588t1, Boolean> lVar) {
        Intrinsics.checkNotNullParameter(jArr, "$this$takeWhile");
        Intrinsics.checkNotNullParameter(lVar, "predicate");
        ArrayList arrayList = new ArrayList();
        int X = C11662u1.m45751X(jArr);
        for (int i = 0; i < X; i++) {
            long Q = C11662u1.m45750Q(jArr, i);
            if (!lVar.invoke(C11588t1.m44992g(Q)).booleanValue()) {
                break;
            }
            arrayList.add(C11588t1.m44992g(Q));
        }
        return arrayList;
    }

    @C11531s
    @C11110f
    @C11665v0(version = "1.3")
    /* renamed from: E0 */
    public static final long m41603E0(long[] jArr) {
        Intrinsics.checkNotNullParameter(jArr, "$this$component2");
        return C11662u1.m45750Q(jArr, 1);
    }

    @C11531s
    @C11110f
    @C11665v0(version = "1.3")
    /* renamed from: E1 */
    public static final long[] m41604E1(long[] jArr, int i) {
        Intrinsics.checkNotNullParameter(jArr, "$this$copyOf");
        long[] copyOf = Arrays.copyOf(jArr, i);
        Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(this, newSize)");
        return C11662u1.m45760q(copyOf);
    }

    @C11531s
    @C11110f
    @C11665v0(version = "1.3")
    /* renamed from: E2 */
    public static final <C extends Collection<? super C11400l1>> C m41605E2(byte[] bArr, C c, C11304p<? super Integer, ? super C11400l1, Boolean> pVar) {
        Intrinsics.checkNotNullParameter(bArr, "$this$filterIndexedTo");
        Intrinsics.checkNotNullParameter(c, FirebaseAnalytics.C32532b.f78977z);
        Intrinsics.checkNotNullParameter(pVar, "predicate");
        int X = C11404m1.m43809X(bArr);
        int i = 0;
        int i2 = 0;
        while (i < X) {
            byte Q = C11404m1.m43808Q(bArr, i);
            int i3 = i2 + 1;
            if (pVar.invoke(Integer.valueOf(i2), C11400l1.m43782g(Q)).booleanValue()) {
                c.add(C11400l1.m43782g(Q));
            }
            i++;
            i2 = i3;
        }
        return c;
    }

    @C11531s
    @C11110f
    @C11665v0(version = "1.3")
    /* renamed from: E3 */
    public static final <R, C extends Collection<? super R>> C m41606E3(int[] iArr, C c, C11300l<? super C11419p1, ? extends Iterable<? extends R>> lVar) {
        Intrinsics.checkNotNullParameter(iArr, "$this$flatMapTo");
        Intrinsics.checkNotNullParameter(c, FirebaseAnalytics.C32532b.f78977z);
        Intrinsics.checkNotNullParameter(lVar, "transform");
        int X = C11431q1.m44045X(iArr);
        for (int i = 0; i < X; i++) {
            C10994x.m42360n0(c, (Iterable) lVar.invoke(C11419p1.m43993g(C11431q1.m44044Q(iArr, i))));
        }
        return c;
    }

    @C11531s
    @C11110f
    @C11665v0(version = "1.3")
    /* renamed from: E4 */
    public static final <K> Map<K, List<C11400l1>> m41607E4(byte[] bArr, C11300l<? super C11400l1, ? extends K> lVar) {
        Intrinsics.checkNotNullParameter(bArr, "$this$groupBy");
        Intrinsics.checkNotNullParameter(lVar, "keySelector");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        int X = C11404m1.m43809X(bArr);
        for (int i = 0; i < X; i++) {
            byte Q = C11404m1.m43808Q(bArr, i);
            Object invoke = lVar.invoke(C11400l1.m43782g(Q));
            Object obj = linkedHashMap.get(invoke);
            if (obj == null) {
                obj = new ArrayList();
                linkedHashMap.put(invoke, obj);
            }
            ((List) obj).add(C11400l1.m43782g(Q));
        }
        return linkedHashMap;
    }

    @C11531s
    @C11110f
    @C11665v0(version = "1.3")
    /* renamed from: E5 */
    public static final <R> List<R> m41608E5(long[] jArr, C11304p<? super Integer, ? super C11588t1, ? extends R> pVar) {
        Intrinsics.checkNotNullParameter(jArr, "$this$mapIndexed");
        Intrinsics.checkNotNullParameter(pVar, "transform");
        ArrayList arrayList = new ArrayList(C11662u1.m45751X(jArr));
        int X = C11662u1.m45751X(jArr);
        int i = 0;
        int i2 = 0;
        while (i < X) {
            arrayList.add(pVar.invoke(Integer.valueOf(i2), C11588t1.m44992g(C11662u1.m45750Q(jArr, i))));
            i++;
            i2++;
        }
        return arrayList;
    }

    @C11531s
    @C12580l
    @C11665v0(version = "1.4")
    /* renamed from: E6 */
    public static final C11588t1 m41609E6(@C12579k long[] jArr) {
        Intrinsics.checkNotNullParameter(jArr, "$this$maxOrNull");
        if (C11662u1.m45755h0(jArr)) {
            return null;
        }
        long Q = C11662u1.m45750Q(jArr, 0);
        C10953k0 H = new C11466l(1, ArraysKt___ArraysKt.m39491We(jArr)).iterator();
        while (H.hasNext()) {
            long Q2 = C11662u1.m45750Q(jArr, H.mo6374c());
            if (Long.compare(Q ^ Long.MIN_VALUE, Q2 ^ Long.MIN_VALUE) < 0) {
                Q = Q2;
            }
        }
        return C11588t1.m44992g(Q);
    }

    @C11531s
    @C11110f
    @C11665v0(version = "1.4")
    @C11403m0
    /* renamed from: E7 */
    public static final <R> R m41610E7(short[] sArr, Comparator<? super R> comparator, C11300l<? super C11679z1, ? extends R> lVar) {
        Intrinsics.checkNotNullParameter(sArr, "$this$minOfWithOrNull");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        Intrinsics.checkNotNullParameter(lVar, "selector");
        if (C10857a2.m38731h0(sArr)) {
            return null;
        }
        R invoke = lVar.invoke(C11679z1.m45862g(C10857a2.m38726Q(sArr, 0)));
        C10953k0 H = new C11466l(1, ArraysKt___ArraysKt.m39555Ye(sArr)).iterator();
        while (H.hasNext()) {
            R invoke2 = lVar.invoke(C11679z1.m45862g(C10857a2.m38726Q(sArr, H.mo6374c())));
            if (comparator.compare(invoke, invoke2) > 0) {
                invoke = invoke2;
            }
        }
        return invoke;
    }

    @C11531s
    @C11110f
    @C11665v0(version = "1.3")
    /* renamed from: E8 */
    public static final short m41611E8(short[] sArr) {
        Intrinsics.checkNotNullParameter(sArr, "$this$random");
        return m41624F8(sArr, Random.f28564a);
    }

    @C11531s
    @C11665v0(version = "1.3")
    @C12579k
    /* renamed from: E9 */
    public static final List<C11588t1> m41612E9(@C12579k long[] jArr) {
        Intrinsics.checkNotNullParameter(jArr, "$this$reversed");
        if (C11662u1.m45755h0(jArr)) {
            return CollectionsKt__CollectionsKt.m40441E();
        }
        List<C11588t1> T5 = CollectionsKt___CollectionsKt.m40572T5(C11662u1.m45754h(jArr));
        C10998z.m42399m1(T5);
        return T5;
    }

    @C11531s
    @C12580l
    @C11665v0(version = "1.3")
    /* renamed from: Ea */
    public static final C11679z1 m41613Ea(@C12579k short[] sArr) {
        Intrinsics.checkNotNullParameter(sArr, "$this$singleOrNull");
        if (C10857a2.m38727X(sArr) == 1) {
            return C11679z1.m45862g(C10857a2.m38726Q(sArr, 0));
        }
        return null;
    }

    @C11531s
    @C11665v0(version = "1.3")
    @C12579k
    /* renamed from: Eb */
    public static final List<C11588t1> m41614Eb(@C12579k long[] jArr) {
        Intrinsics.checkNotNullParameter(jArr, "$this$sortedDescending");
        long[] copyOf = Arrays.copyOf(jArr, jArr.length);
        Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(this, size)");
        long[] q = C11662u1.m45760q(copyOf);
        m41960eb(q);
        return m41612E9(q);
    }

    @C11531s
    @C11110f
    @C11665v0(version = "1.3")
    /* renamed from: Ec */
    public static final List<C11419p1> m41615Ec(int[] iArr, C11300l<? super C11419p1, Boolean> lVar) {
        Intrinsics.checkNotNullParameter(iArr, "$this$takeWhile");
        Intrinsics.checkNotNullParameter(lVar, "predicate");
        ArrayList arrayList = new ArrayList();
        int X = C11431q1.m44045X(iArr);
        for (int i = 0; i < X; i++) {
            int Q = C11431q1.m44044Q(iArr, i);
            if (!lVar.invoke(C11419p1.m43993g(Q)).booleanValue()) {
                break;
            }
            arrayList.add(C11419p1.m43993g(Q));
        }
        return arrayList;
    }

    @C11531s
    @C11110f
    @C11665v0(version = "1.3")
    /* renamed from: F0 */
    public static final short m41616F0(short[] sArr) {
        Intrinsics.checkNotNullParameter(sArr, "$this$component2");
        return C10857a2.m38726Q(sArr, 1);
    }

    @C11531s
    @C11110f
    @C11665v0(version = "1.3")
    /* renamed from: F1 */
    public static final short[] m41617F1(short[] sArr) {
        Intrinsics.checkNotNullParameter(sArr, "$this$copyOf");
        short[] copyOf = Arrays.copyOf(sArr, sArr.length);
        Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(this, size)");
        return C10857a2.m38736q(copyOf);
    }

    @C11531s
    @C11110f
    @C11665v0(version = "1.3")
    /* renamed from: F2 */
    public static final <C extends Collection<? super C11588t1>> C m41618F2(long[] jArr, C c, C11304p<? super Integer, ? super C11588t1, Boolean> pVar) {
        Intrinsics.checkNotNullParameter(jArr, "$this$filterIndexedTo");
        Intrinsics.checkNotNullParameter(c, FirebaseAnalytics.C32532b.f78977z);
        Intrinsics.checkNotNullParameter(pVar, "predicate");
        int X = C11662u1.m45751X(jArr);
        int i = 0;
        int i2 = 0;
        while (i < X) {
            long Q = C11662u1.m45750Q(jArr, i);
            int i3 = i2 + 1;
            if (pVar.invoke(Integer.valueOf(i2), C11588t1.m44992g(Q)).booleanValue()) {
                c.add(C11588t1.m44992g(Q));
            }
            i++;
            i2 = i3;
        }
        return c;
    }

    @C11531s
    @C11110f
    @C11665v0(version = "1.3")
    /* renamed from: F3 */
    public static final <R, C extends Collection<? super R>> C m41619F3(byte[] bArr, C c, C11300l<? super C11400l1, ? extends Iterable<? extends R>> lVar) {
        Intrinsics.checkNotNullParameter(bArr, "$this$flatMapTo");
        Intrinsics.checkNotNullParameter(c, FirebaseAnalytics.C32532b.f78977z);
        Intrinsics.checkNotNullParameter(lVar, "transform");
        int X = C11404m1.m43809X(bArr);
        for (int i = 0; i < X; i++) {
            C10994x.m42360n0(c, (Iterable) lVar.invoke(C11400l1.m43782g(C11404m1.m43808Q(bArr, i))));
        }
        return c;
    }

    @C11531s
    @C11110f
    @C11665v0(version = "1.3")
    /* renamed from: F4 */
    public static final <K, V> Map<K, List<V>> m41620F4(int[] iArr, C11300l<? super C11419p1, ? extends K> lVar, C11300l<? super C11419p1, ? extends V> lVar2) {
        Intrinsics.checkNotNullParameter(iArr, "$this$groupBy");
        Intrinsics.checkNotNullParameter(lVar, "keySelector");
        Intrinsics.checkNotNullParameter(lVar2, "valueTransform");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        int X = C11431q1.m44045X(iArr);
        for (int i = 0; i < X; i++) {
            int Q = C11431q1.m44044Q(iArr, i);
            Object invoke = lVar.invoke(C11419p1.m43993g(Q));
            Object obj = linkedHashMap.get(invoke);
            if (obj == null) {
                obj = new ArrayList();
                linkedHashMap.put(invoke, obj);
            }
            ((List) obj).add(lVar2.invoke(C11419p1.m43993g(Q)));
        }
        return linkedHashMap;
    }

    @C11531s
    @C11110f
    @C11665v0(version = "1.3")
    /* renamed from: F5 */
    public static final <R> List<R> m41621F5(short[] sArr, C11304p<? super Integer, ? super C11679z1, ? extends R> pVar) {
        Intrinsics.checkNotNullParameter(sArr, "$this$mapIndexed");
        Intrinsics.checkNotNullParameter(pVar, "transform");
        ArrayList arrayList = new ArrayList(C10857a2.m38727X(sArr));
        int X = C10857a2.m38727X(sArr);
        int i = 0;
        int i2 = 0;
        while (i < X) {
            arrayList.add(pVar.invoke(Integer.valueOf(i2), C11679z1.m45862g(C10857a2.m38726Q(sArr, i))));
            i++;
            i2++;
        }
        return arrayList;
    }

    @C11531s
    @C12580l
    @C11665v0(version = "1.4")
    /* renamed from: F6 */
    public static final C11679z1 m41622F6(@C12579k short[] sArr) {
        Intrinsics.checkNotNullParameter(sArr, "$this$maxOrNull");
        if (C10857a2.m38731h0(sArr)) {
            return null;
        }
        short Q = C10857a2.m38726Q(sArr, 0);
        C10953k0 H = new C11466l(1, ArraysKt___ArraysKt.m39555Ye(sArr)).iterator();
        while (H.hasNext()) {
            short Q2 = C10857a2.m38726Q(sArr, H.mo6374c());
            if (Intrinsics.compare((int) Q & C11679z1.f28988d, (int) 65535 & Q2) < 0) {
                Q = Q2;
            }
        }
        return C11679z1.m45862g(Q);
    }

    @C11531s
    @C11110f
    @C11665v0(version = "1.4")
    @C11403m0
    /* renamed from: F7 */
    public static final <R> R m41623F7(int[] iArr, Comparator<? super R> comparator, C11300l<? super C11419p1, ? extends R> lVar) {
        Intrinsics.checkNotNullParameter(iArr, "$this$minOfWithOrNull");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        Intrinsics.checkNotNullParameter(lVar, "selector");
        if (C11431q1.m44049h0(iArr)) {
            return null;
        }
        R invoke = lVar.invoke(C11419p1.m43993g(C11431q1.m44044Q(iArr, 0)));
        C10953k0 H = new C11466l(1, ArraysKt___ArraysKt.m39459Ve(iArr)).iterator();
        while (H.hasNext()) {
            R invoke2 = lVar.invoke(C11419p1.m43993g(C11431q1.m44044Q(iArr, H.mo6374c())));
            if (comparator.compare(invoke, invoke2) > 0) {
                invoke = invoke2;
            }
        }
        return invoke;
    }

    @C11531s
    @C11665v0(version = "1.3")
    /* renamed from: F8 */
    public static final short m41624F8(@C12579k short[] sArr, @C12579k Random random) {
        Intrinsics.checkNotNullParameter(sArr, "$this$random");
        Intrinsics.checkNotNullParameter(random, BaseOptionModel.f27465E0);
        if (!C10857a2.m38731h0(sArr)) {
            return C10857a2.m38726Q(sArr, random.mo22986m(C10857a2.m38727X(sArr)));
        }
        throw new NoSuchElementException("Array is empty.");
    }

    @C11531s
    @C11665v0(version = "1.3")
    @C12579k
    /* renamed from: F9 */
    public static final List<C11679z1> m41625F9(@C12579k short[] sArr) {
        Intrinsics.checkNotNullParameter(sArr, "$this$reversed");
        if (C10857a2.m38731h0(sArr)) {
            return CollectionsKt__CollectionsKt.m40441E();
        }
        List<C11679z1> T5 = CollectionsKt___CollectionsKt.m40572T5(C10857a2.m38730h(sArr));
        C10998z.m42399m1(T5);
        return T5;
    }

    @C11531s
    @C11110f
    @C11665v0(version = "1.3")
    /* renamed from: Fa */
    public static final C11679z1 m41626Fa(short[] sArr, C11300l<? super C11679z1, Boolean> lVar) {
        Intrinsics.checkNotNullParameter(sArr, "$this$singleOrNull");
        Intrinsics.checkNotNullParameter(lVar, "predicate");
        int X = C10857a2.m38727X(sArr);
        C11679z1 z1Var = null;
        boolean z = false;
        for (int i = 0; i < X; i++) {
            short Q = C10857a2.m38726Q(sArr, i);
            if (lVar.invoke(C11679z1.m45862g(Q)).booleanValue()) {
                if (z) {
                    return null;
                }
                z1Var = C11679z1.m45862g(Q);
                z = true;
            }
        }
        if (!z) {
            return null;
        }
        return z1Var;
    }

    @C11531s
    @C11665v0(version = "1.3")
    @C12579k
    /* renamed from: Fb */
    public static final List<C11679z1> m41627Fb(@C12579k short[] sArr) {
        Intrinsics.checkNotNullParameter(sArr, "$this$sortedDescending");
        short[] copyOf = Arrays.copyOf(sArr, sArr.length);
        Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(this, size)");
        short[] q = C10857a2.m38736q(copyOf);
        m42002hb(q);
        return m41625F9(q);
    }

    @C11531s
    @C11110f
    @C11665v0(version = "1.3")
    /* renamed from: Fc */
    public static final List<C11679z1> m41628Fc(short[] sArr, C11300l<? super C11679z1, Boolean> lVar) {
        Intrinsics.checkNotNullParameter(sArr, "$this$takeWhile");
        Intrinsics.checkNotNullParameter(lVar, "predicate");
        ArrayList arrayList = new ArrayList();
        int X = C10857a2.m38727X(sArr);
        for (int i = 0; i < X; i++) {
            short Q = C10857a2.m38726Q(sArr, i);
            if (!lVar.invoke(C11679z1.m45862g(Q)).booleanValue()) {
                break;
            }
            arrayList.add(C11679z1.m45862g(Q));
        }
        return arrayList;
    }

    @C11531s
    @C11110f
    @C11665v0(version = "1.3")
    /* renamed from: G0 */
    public static final int m41629G0(int[] iArr) {
        Intrinsics.checkNotNullParameter(iArr, "$this$component3");
        return C11431q1.m44044Q(iArr, 2);
    }

    @C11531s
    @C11110f
    @C11665v0(version = "1.3")
    /* renamed from: G1 */
    public static final long[] m41630G1(long[] jArr, int i, int i2) {
        Intrinsics.checkNotNullParameter(jArr, "$this$copyOfRange");
        return C11662u1.m45760q(C10956m.m41082L1(jArr, i, i2));
    }

    @C11531s
    @C11110f
    @C11665v0(version = "1.3")
    /* renamed from: G2 */
    public static final List<C11400l1> m41631G2(byte[] bArr, C11300l<? super C11400l1, Boolean> lVar) {
        Intrinsics.checkNotNullParameter(bArr, "$this$filterNot");
        Intrinsics.checkNotNullParameter(lVar, "predicate");
        ArrayList arrayList = new ArrayList();
        int X = C11404m1.m43809X(bArr);
        for (int i = 0; i < X; i++) {
            byte Q = C11404m1.m43808Q(bArr, i);
            if (!lVar.invoke(C11400l1.m43782g(Q)).booleanValue()) {
                arrayList.add(C11400l1.m43782g(Q));
            }
        }
        return arrayList;
    }

    /* JADX WARNING: type inference failed for: r6v0, types: [java.lang.Object, kotlin.jvm.functions.p<? super R, ? super kotlin.t1, ? extends R>, kotlin.jvm.functions.p] */
    /* JADX WARNING: Unknown variable types count: 1 */
    @kotlin.C11531s
    @kotlin.internal.C11110f
    @kotlin.C11665v0(version = "1.3")
    /* renamed from: G3 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final <R> R m41632G3(long[] r4, R r5, kotlin.jvm.functions.C11304p<? super R, ? super kotlin.C11588t1, ? extends R> r6) {
        /*
            java.lang.String r0 = "$this$fold"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            java.lang.String r0 = "operation"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r0)
            int r0 = kotlin.C11662u1.m45751X(r4)
            r1 = 0
        L_0x000f:
            if (r1 >= r0) goto L_0x0020
            long r2 = kotlin.C11662u1.m45750Q(r4, r1)
            kotlin.t1 r2 = kotlin.C11588t1.m44992g(r2)
            java.lang.Object r5 = r6.invoke(r5, r2)
            int r1 = r1 + 1
            goto L_0x000f
        L_0x0020:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.collections.unsigned.UArraysKt___UArraysKt.m41632G3(long[], java.lang.Object, kotlin.jvm.functions.p):java.lang.Object");
    }

    @C11531s
    @C11110f
    @C11665v0(version = "1.3")
    /* renamed from: G4 */
    public static final <K> Map<K, List<C11588t1>> m41633G4(long[] jArr, C11300l<? super C11588t1, ? extends K> lVar) {
        Intrinsics.checkNotNullParameter(jArr, "$this$groupBy");
        Intrinsics.checkNotNullParameter(lVar, "keySelector");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        int X = C11662u1.m45751X(jArr);
        for (int i = 0; i < X; i++) {
            long Q = C11662u1.m45750Q(jArr, i);
            Object invoke = lVar.invoke(C11588t1.m44992g(Q));
            Object obj = linkedHashMap.get(invoke);
            if (obj == null) {
                obj = new ArrayList();
                linkedHashMap.put(invoke, obj);
            }
            ((List) obj).add(C11588t1.m44992g(Q));
        }
        return linkedHashMap;
    }

    @C11531s
    @C11110f
    @C11665v0(version = "1.3")
    /* renamed from: G5 */
    public static final <R, C extends Collection<? super R>> C m41634G5(int[] iArr, C c, C11304p<? super Integer, ? super C11419p1, ? extends R> pVar) {
        Intrinsics.checkNotNullParameter(iArr, "$this$mapIndexedTo");
        Intrinsics.checkNotNullParameter(c, FirebaseAnalytics.C32532b.f78977z);
        Intrinsics.checkNotNullParameter(pVar, "transform");
        int X = C11431q1.m44045X(iArr);
        int i = 0;
        int i2 = 0;
        while (i < X) {
            c.add(pVar.invoke(Integer.valueOf(i2), C11419p1.m43993g(C11431q1.m44044Q(iArr, i))));
            i++;
            i2++;
        }
        return c;
    }

    @C11531s
    @C11314h(name = "maxOrThrow-U")
    @C11665v0(version = "1.7")
    /* renamed from: G6 */
    public static final byte m41635G6(@C12579k byte[] bArr) {
        Intrinsics.checkNotNullParameter(bArr, "$this$max");
        if (!C11404m1.m43813h0(bArr)) {
            byte Q = C11404m1.m43808Q(bArr, 0);
            C10953k0 H = new C11466l(1, ArraysKt___ArraysKt.m39331Re(bArr)).iterator();
            while (H.hasNext()) {
                byte Q2 = C11404m1.m43808Q(bArr, H.mo6374c());
                if (Intrinsics.compare((int) Q & 255, (int) Q2 & 255) < 0) {
                    Q = Q2;
                }
            }
            return Q;
        }
        throw new NoSuchElementException();
    }

    @C11531s
    @C12580l
    @C11665v0(version = "1.4")
    /* renamed from: G7 */
    public static final C11419p1 m41636G7(@C12579k int[] iArr) {
        Intrinsics.checkNotNullParameter(iArr, "$this$minOrNull");
        if (C11431q1.m44049h0(iArr)) {
            return null;
        }
        int Q = C11431q1.m44044Q(iArr, 0);
        C10953k0 H = new C11466l(1, ArraysKt___ArraysKt.m39459Ve(iArr)).iterator();
        while (H.hasNext()) {
            int Q2 = C11431q1.m44044Q(iArr, H.mo6374c());
            if (Integer.compare(Q ^ Integer.MIN_VALUE, Q2 ^ Integer.MIN_VALUE) > 0) {
                Q = Q2;
            }
        }
        return C11419p1.m43993g(Q);
    }

    @C11531s
    @C11110f
    @C11665v0(version = "1.4")
    @C11097g2(markerClass = {C11429q.class})
    /* renamed from: G8 */
    public static final C11419p1 m41637G8(int[] iArr) {
        Intrinsics.checkNotNullParameter(iArr, "$this$randomOrNull");
        return m41650H8(iArr, Random.f28564a);
    }

    @C11531s
    @C11110f
    @C11665v0(version = "1.3")
    /* renamed from: G9 */
    public static final int[] m41638G9(int[] iArr) {
        Intrinsics.checkNotNullParameter(iArr, "$this$reversedArray");
        return C11431q1.m44054q(ArraysKt___ArraysKt.m39472Vr(iArr));
    }

    @C11531s
    @C11665v0(version = "1.3")
    @C12579k
    /* renamed from: Ga */
    public static final List<C11588t1> m41639Ga(@C12579k long[] jArr, @C12579k Iterable<Integer> iterable) {
        Intrinsics.checkNotNullParameter(jArr, "$this$slice");
        Intrinsics.checkNotNullParameter(iterable, "indices");
        int Y = C10978t.m41495Y(iterable, 10);
        if (Y == 0) {
            return CollectionsKt__CollectionsKt.m40441E();
        }
        ArrayList arrayList = new ArrayList(Y);
        for (Integer intValue : iterable) {
            arrayList.add(C11588t1.m44992g(C11662u1.m45750Q(jArr, intValue.intValue())));
        }
        return arrayList;
    }

    @C11531s
    @C11110f
    @C11665v0(version = "1.3")
    /* renamed from: Gb */
    public static final int m41640Gb(int[] iArr) {
        Intrinsics.checkNotNullParameter(iArr, "$this$sum");
        return C11419p1.m43971M(ArraysKt___ArraysKt.m38837Bw(iArr));
    }

    @C11531s
    @C11110f
    @C11665v0(version = "1.3")
    /* renamed from: Gc */
    public static final byte[] m41641Gc(byte[] bArr) {
        Intrinsics.checkNotNullParameter(bArr, "$this$toByteArray");
        byte[] copyOf = Arrays.copyOf(bArr, bArr.length);
        Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(this, size)");
        return copyOf;
    }

    @C11531s
    @C11110f
    @C11665v0(version = "1.3")
    /* renamed from: H0 */
    public static final byte m41642H0(byte[] bArr) {
        Intrinsics.checkNotNullParameter(bArr, "$this$component3");
        return C11404m1.m43808Q(bArr, 2);
    }

    @C11531s
    @C11110f
    @C11665v0(version = "1.3")
    /* renamed from: H1 */
    public static final byte[] m41643H1(byte[] bArr, int i, int i2) {
        Intrinsics.checkNotNullParameter(bArr, "$this$copyOfRange");
        return C11404m1.m43818q(C10956m.m41052G1(bArr, i, i2));
    }

    @C11531s
    @C11110f
    @C11665v0(version = "1.3")
    /* renamed from: H2 */
    public static final List<C11588t1> m41644H2(long[] jArr, C11300l<? super C11588t1, Boolean> lVar) {
        Intrinsics.checkNotNullParameter(jArr, "$this$filterNot");
        Intrinsics.checkNotNullParameter(lVar, "predicate");
        ArrayList arrayList = new ArrayList();
        int X = C11662u1.m45751X(jArr);
        for (int i = 0; i < X; i++) {
            long Q = C11662u1.m45750Q(jArr, i);
            if (!lVar.invoke(C11588t1.m44992g(Q)).booleanValue()) {
                arrayList.add(C11588t1.m44992g(Q));
            }
        }
        return arrayList;
    }

    /* JADX WARNING: type inference failed for: r5v0, types: [java.lang.Object, kotlin.jvm.functions.p<? super R, ? super kotlin.l1, ? extends R>, kotlin.jvm.functions.p] */
    /* JADX WARNING: Unknown variable types count: 1 */
    @kotlin.C11531s
    @kotlin.internal.C11110f
    @kotlin.C11665v0(version = "1.3")
    /* renamed from: H3 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final <R> R m41645H3(byte[] r3, R r4, kotlin.jvm.functions.C11304p<? super R, ? super kotlin.C11400l1, ? extends R> r5) {
        /*
            java.lang.String r0 = "$this$fold"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            java.lang.String r0 = "operation"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
            int r0 = kotlin.C11404m1.m43809X(r3)
            r1 = 0
        L_0x000f:
            if (r1 >= r0) goto L_0x0020
            byte r2 = kotlin.C11404m1.m43808Q(r3, r1)
            kotlin.l1 r2 = kotlin.C11400l1.m43782g(r2)
            java.lang.Object r4 = r5.invoke(r4, r2)
            int r1 = r1 + 1
            goto L_0x000f
        L_0x0020:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.collections.unsigned.UArraysKt___UArraysKt.m41645H3(byte[], java.lang.Object, kotlin.jvm.functions.p):java.lang.Object");
    }

    @C11531s
    @C11110f
    @C11665v0(version = "1.3")
    /* renamed from: H4 */
    public static final <K, V> Map<K, List<V>> m41646H4(byte[] bArr, C11300l<? super C11400l1, ? extends K> lVar, C11300l<? super C11400l1, ? extends V> lVar2) {
        Intrinsics.checkNotNullParameter(bArr, "$this$groupBy");
        Intrinsics.checkNotNullParameter(lVar, "keySelector");
        Intrinsics.checkNotNullParameter(lVar2, "valueTransform");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        int X = C11404m1.m43809X(bArr);
        for (int i = 0; i < X; i++) {
            byte Q = C11404m1.m43808Q(bArr, i);
            Object invoke = lVar.invoke(C11400l1.m43782g(Q));
            Object obj = linkedHashMap.get(invoke);
            if (obj == null) {
                obj = new ArrayList();
                linkedHashMap.put(invoke, obj);
            }
            ((List) obj).add(lVar2.invoke(C11400l1.m43782g(Q)));
        }
        return linkedHashMap;
    }

    @C11531s
    @C11110f
    @C11665v0(version = "1.3")
    /* renamed from: H5 */
    public static final <R, C extends Collection<? super R>> C m41647H5(short[] sArr, C c, C11304p<? super Integer, ? super C11679z1, ? extends R> pVar) {
        Intrinsics.checkNotNullParameter(sArr, "$this$mapIndexedTo");
        Intrinsics.checkNotNullParameter(c, FirebaseAnalytics.C32532b.f78977z);
        Intrinsics.checkNotNullParameter(pVar, "transform");
        int X = C10857a2.m38727X(sArr);
        int i = 0;
        int i2 = 0;
        while (i < X) {
            c.add(pVar.invoke(Integer.valueOf(i2), C11679z1.m45862g(C10857a2.m38726Q(sArr, i))));
            i++;
            i2++;
        }
        return c;
    }

    @C11531s
    @C11314h(name = "maxOrThrow-U")
    @C11665v0(version = "1.7")
    /* renamed from: H6 */
    public static final int m41648H6(@C12579k int[] iArr) {
        Intrinsics.checkNotNullParameter(iArr, "$this$max");
        if (!C11431q1.m44049h0(iArr)) {
            int Q = C11431q1.m44044Q(iArr, 0);
            C10953k0 H = new C11466l(1, ArraysKt___ArraysKt.m39459Ve(iArr)).iterator();
            while (H.hasNext()) {
                int Q2 = C11431q1.m44044Q(iArr, H.mo6374c());
                if (Integer.compare(Q ^ Integer.MIN_VALUE, Q2 ^ Integer.MIN_VALUE) < 0) {
                    Q = Q2;
                }
            }
            return Q;
        }
        throw new NoSuchElementException();
    }

    @C11531s
    @C12580l
    @C11665v0(version = "1.4")
    /* renamed from: H7 */
    public static final C11400l1 m41649H7(@C12579k byte[] bArr) {
        Intrinsics.checkNotNullParameter(bArr, "$this$minOrNull");
        if (C11404m1.m43813h0(bArr)) {
            return null;
        }
        byte Q = C11404m1.m43808Q(bArr, 0);
        C10953k0 H = new C11466l(1, ArraysKt___ArraysKt.m39331Re(bArr)).iterator();
        while (H.hasNext()) {
            byte Q2 = C11404m1.m43808Q(bArr, H.mo6374c());
            if (Intrinsics.compare((int) Q & 255, (int) Q2 & 255) > 0) {
                Q = Q2;
            }
        }
        return C11400l1.m43782g(Q);
    }

    @C11531s
    @C12580l
    @C11665v0(version = "1.4")
    @C11097g2(markerClass = {C11429q.class})
    /* renamed from: H8 */
    public static final C11419p1 m41650H8(@C12579k int[] iArr, @C12579k Random random) {
        Intrinsics.checkNotNullParameter(iArr, "$this$randomOrNull");
        Intrinsics.checkNotNullParameter(random, BaseOptionModel.f27465E0);
        if (C11431q1.m44049h0(iArr)) {
            return null;
        }
        return C11419p1.m43993g(C11431q1.m44044Q(iArr, random.mo22986m(C11431q1.m44045X(iArr))));
    }

    @C11531s
    @C11110f
    @C11665v0(version = "1.3")
    /* renamed from: H9 */
    public static final byte[] m41651H9(byte[] bArr) {
        Intrinsics.checkNotNullParameter(bArr, "$this$reversedArray");
        return C11404m1.m43818q(ArraysKt___ArraysKt.m39344Rr(bArr));
    }

    @C11531s
    @C11665v0(version = "1.3")
    @C12579k
    /* renamed from: Ha */
    public static final List<C11419p1> m41652Ha(@C12579k int[] iArr, @C12579k Iterable<Integer> iterable) {
        Intrinsics.checkNotNullParameter(iArr, "$this$slice");
        Intrinsics.checkNotNullParameter(iterable, "indices");
        int Y = C10978t.m41495Y(iterable, 10);
        if (Y == 0) {
            return CollectionsKt__CollectionsKt.m40441E();
        }
        ArrayList arrayList = new ArrayList(Y);
        for (Integer intValue : iterable) {
            arrayList.add(C11419p1.m43993g(C11431q1.m44044Q(iArr, intValue.intValue())));
        }
        return arrayList;
    }

    @C11531s
    @C11110f
    @C11665v0(version = "1.3")
    /* renamed from: Hb */
    public static final int m41653Hb(byte[] bArr) {
        Intrinsics.checkNotNullParameter(bArr, "$this$sum");
        int M = C11419p1.m43971M(0);
        int X = C11404m1.m43809X(bArr);
        for (int i = 0; i < X; i++) {
            M = C11419p1.m43971M(M + C11419p1.m43971M(C11404m1.m43808Q(bArr, i) & 255));
        }
        return M;
    }

    @C11531s
    @C11110f
    @C11665v0(version = "1.3")
    /* renamed from: Hc */
    public static final int[] m41654Hc(int[] iArr) {
        Intrinsics.checkNotNullParameter(iArr, "$this$toIntArray");
        int[] copyOf = Arrays.copyOf(iArr, iArr.length);
        Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(this, size)");
        return copyOf;
    }

    @C11531s
    @C11110f
    @C11665v0(version = "1.3")
    /* renamed from: I0 */
    public static final long m41655I0(long[] jArr) {
        Intrinsics.checkNotNullParameter(jArr, "$this$component3");
        return C11662u1.m45750Q(jArr, 2);
    }

    @C11531s
    @C11110f
    @C11665v0(version = "1.3")
    /* renamed from: I1 */
    public static final short[] m41656I1(short[] sArr, int i, int i2) {
        Intrinsics.checkNotNullParameter(sArr, "$this$copyOfRange");
        return C10857a2.m38736q(C10956m.m41094N1(sArr, i, i2));
    }

    @C11531s
    @C11110f
    @C11665v0(version = "1.3")
    /* renamed from: I2 */
    public static final List<C11419p1> m41657I2(int[] iArr, C11300l<? super C11419p1, Boolean> lVar) {
        Intrinsics.checkNotNullParameter(iArr, "$this$filterNot");
        Intrinsics.checkNotNullParameter(lVar, "predicate");
        ArrayList arrayList = new ArrayList();
        int X = C11431q1.m44045X(iArr);
        for (int i = 0; i < X; i++) {
            int Q = C11431q1.m44044Q(iArr, i);
            if (!lVar.invoke(C11419p1.m43993g(Q)).booleanValue()) {
                arrayList.add(C11419p1.m43993g(Q));
            }
        }
        return arrayList;
    }

    /* JADX WARNING: type inference failed for: r5v0, types: [java.lang.Object, kotlin.jvm.functions.p<? super R, ? super kotlin.p1, ? extends R>, kotlin.jvm.functions.p] */
    /* JADX WARNING: Unknown variable types count: 1 */
    @kotlin.C11531s
    @kotlin.internal.C11110f
    @kotlin.C11665v0(version = "1.3")
    /* renamed from: I3 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final <R> R m41658I3(int[] r3, R r4, kotlin.jvm.functions.C11304p<? super R, ? super kotlin.C11419p1, ? extends R> r5) {
        /*
            java.lang.String r0 = "$this$fold"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            java.lang.String r0 = "operation"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
            int r0 = kotlin.C11431q1.m44045X(r3)
            r1 = 0
        L_0x000f:
            if (r1 >= r0) goto L_0x0020
            int r2 = kotlin.C11431q1.m44044Q(r3, r1)
            kotlin.p1 r2 = kotlin.C11419p1.m43993g(r2)
            java.lang.Object r4 = r5.invoke(r4, r2)
            int r1 = r1 + 1
            goto L_0x000f
        L_0x0020:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.collections.unsigned.UArraysKt___UArraysKt.m41658I3(int[], java.lang.Object, kotlin.jvm.functions.p):java.lang.Object");
    }

    @C11531s
    @C11110f
    @C11665v0(version = "1.3")
    /* renamed from: I4 */
    public static final <K> Map<K, List<C11419p1>> m41659I4(int[] iArr, C11300l<? super C11419p1, ? extends K> lVar) {
        Intrinsics.checkNotNullParameter(iArr, "$this$groupBy");
        Intrinsics.checkNotNullParameter(lVar, "keySelector");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        int X = C11431q1.m44045X(iArr);
        for (int i = 0; i < X; i++) {
            int Q = C11431q1.m44044Q(iArr, i);
            Object invoke = lVar.invoke(C11419p1.m43993g(Q));
            Object obj = linkedHashMap.get(invoke);
            if (obj == null) {
                obj = new ArrayList();
                linkedHashMap.put(invoke, obj);
            }
            ((List) obj).add(C11419p1.m43993g(Q));
        }
        return linkedHashMap;
    }

    @C11531s
    @C11110f
    @C11665v0(version = "1.3")
    /* renamed from: I5 */
    public static final <R, C extends Collection<? super R>> C m41660I5(byte[] bArr, C c, C11304p<? super Integer, ? super C11400l1, ? extends R> pVar) {
        Intrinsics.checkNotNullParameter(bArr, "$this$mapIndexedTo");
        Intrinsics.checkNotNullParameter(c, FirebaseAnalytics.C32532b.f78977z);
        Intrinsics.checkNotNullParameter(pVar, "transform");
        int X = C11404m1.m43809X(bArr);
        int i = 0;
        int i2 = 0;
        while (i < X) {
            c.add(pVar.invoke(Integer.valueOf(i2), C11400l1.m43782g(C11404m1.m43808Q(bArr, i))));
            i++;
            i2++;
        }
        return c;
    }

    @C11531s
    @C11314h(name = "maxOrThrow-U")
    @C11665v0(version = "1.7")
    /* renamed from: I6 */
    public static final long m41661I6(@C12579k long[] jArr) {
        Intrinsics.checkNotNullParameter(jArr, "$this$max");
        if (!C11662u1.m45755h0(jArr)) {
            long Q = C11662u1.m45750Q(jArr, 0);
            C10953k0 H = new C11466l(1, ArraysKt___ArraysKt.m39491We(jArr)).iterator();
            while (H.hasNext()) {
                long Q2 = C11662u1.m45750Q(jArr, H.mo6374c());
                if (Long.compare(Q ^ Long.MIN_VALUE, Q2 ^ Long.MIN_VALUE) < 0) {
                    Q = Q2;
                }
            }
            return Q;
        }
        throw new NoSuchElementException();
    }

    @C11531s
    @C12580l
    @C11665v0(version = "1.4")
    /* renamed from: I7 */
    public static final C11588t1 m41662I7(@C12579k long[] jArr) {
        Intrinsics.checkNotNullParameter(jArr, "$this$minOrNull");
        if (C11662u1.m45755h0(jArr)) {
            return null;
        }
        long Q = C11662u1.m45750Q(jArr, 0);
        C10953k0 H = new C11466l(1, ArraysKt___ArraysKt.m39491We(jArr)).iterator();
        while (H.hasNext()) {
            long Q2 = C11662u1.m45750Q(jArr, H.mo6374c());
            if (Long.compare(Q ^ Long.MIN_VALUE, Q2 ^ Long.MIN_VALUE) > 0) {
                Q = Q2;
            }
        }
        return C11588t1.m44992g(Q);
    }

    @C11531s
    @C11110f
    @C11665v0(version = "1.4")
    @C11097g2(markerClass = {C11429q.class})
    /* renamed from: I8 */
    public static final C11400l1 m41663I8(byte[] bArr) {
        Intrinsics.checkNotNullParameter(bArr, "$this$randomOrNull");
        return m41702L8(bArr, Random.f28564a);
    }

    @C11531s
    @C11110f
    @C11665v0(version = "1.3")
    /* renamed from: I9 */
    public static final long[] m41664I9(long[] jArr) {
        Intrinsics.checkNotNullParameter(jArr, "$this$reversedArray");
        return C11662u1.m45760q(ArraysKt___ArraysKt.m39504Wr(jArr));
    }

    @C11531s
    @C11665v0(version = "1.3")
    @C12579k
    /* renamed from: Ia */
    public static final List<C11679z1> m41665Ia(@C12579k short[] sArr, @C12579k Iterable<Integer> iterable) {
        Intrinsics.checkNotNullParameter(sArr, "$this$slice");
        Intrinsics.checkNotNullParameter(iterable, "indices");
        int Y = C10978t.m41495Y(iterable, 10);
        if (Y == 0) {
            return CollectionsKt__CollectionsKt.m40441E();
        }
        ArrayList arrayList = new ArrayList(Y);
        for (Integer intValue : iterable) {
            arrayList.add(C11679z1.m45862g(C10857a2.m38726Q(sArr, intValue.intValue())));
        }
        return arrayList;
    }

    @C11531s
    @C11110f
    @C11665v0(version = "1.3")
    /* renamed from: Ib */
    public static final long m41666Ib(long[] jArr) {
        Intrinsics.checkNotNullParameter(jArr, "$this$sum");
        return C11588t1.m44970M(ArraysKt___ArraysKt.m38901Dw(jArr));
    }

    @C11531s
    @C11110f
    @C11665v0(version = "1.3")
    /* renamed from: Ic */
    public static final long[] m41667Ic(long[] jArr) {
        Intrinsics.checkNotNullParameter(jArr, "$this$toLongArray");
        long[] copyOf = Arrays.copyOf(jArr, jArr.length);
        Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(this, size)");
        return copyOf;
    }

    @C11531s
    @C11110f
    @C11665v0(version = "1.3")
    /* renamed from: J0 */
    public static final short m41668J0(short[] sArr) {
        Intrinsics.checkNotNullParameter(sArr, "$this$component3");
        return C10857a2.m38726Q(sArr, 2);
    }

    @C11531s
    @C11110f
    @C11665v0(version = "1.3")
    /* renamed from: J1 */
    public static final int[] m41669J1(int[] iArr, int i, int i2) {
        Intrinsics.checkNotNullParameter(iArr, "$this$copyOfRange");
        return C11431q1.m44054q(C10956m.m41076K1(iArr, i, i2));
    }

    @C11531s
    @C11110f
    @C11665v0(version = "1.3")
    /* renamed from: J2 */
    public static final List<C11679z1> m41670J2(short[] sArr, C11300l<? super C11679z1, Boolean> lVar) {
        Intrinsics.checkNotNullParameter(sArr, "$this$filterNot");
        Intrinsics.checkNotNullParameter(lVar, "predicate");
        ArrayList arrayList = new ArrayList();
        int X = C10857a2.m38727X(sArr);
        for (int i = 0; i < X; i++) {
            short Q = C10857a2.m38726Q(sArr, i);
            if (!lVar.invoke(C11679z1.m45862g(Q)).booleanValue()) {
                arrayList.add(C11679z1.m45862g(Q));
            }
        }
        return arrayList;
    }

    /* JADX WARNING: type inference failed for: r5v0, types: [java.lang.Object, kotlin.jvm.functions.p<? super R, ? super kotlin.z1, ? extends R>, kotlin.jvm.functions.p] */
    /* JADX WARNING: Unknown variable types count: 1 */
    @kotlin.C11531s
    @kotlin.internal.C11110f
    @kotlin.C11665v0(version = "1.3")
    /* renamed from: J3 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final <R> R m41671J3(short[] r3, R r4, kotlin.jvm.functions.C11304p<? super R, ? super kotlin.C11679z1, ? extends R> r5) {
        /*
            java.lang.String r0 = "$this$fold"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            java.lang.String r0 = "operation"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
            int r0 = kotlin.C10857a2.m38727X(r3)
            r1 = 0
        L_0x000f:
            if (r1 >= r0) goto L_0x0020
            short r2 = kotlin.C10857a2.m38726Q(r3, r1)
            kotlin.z1 r2 = kotlin.C11679z1.m45862g(r2)
            java.lang.Object r4 = r5.invoke(r4, r2)
            int r1 = r1 + 1
            goto L_0x000f
        L_0x0020:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.collections.unsigned.UArraysKt___UArraysKt.m41671J3(short[], java.lang.Object, kotlin.jvm.functions.p):java.lang.Object");
    }

    @C11531s
    @C11110f
    @C11665v0(version = "1.3")
    /* renamed from: J4 */
    public static final <K> Map<K, List<C11679z1>> m41672J4(short[] sArr, C11300l<? super C11679z1, ? extends K> lVar) {
        Intrinsics.checkNotNullParameter(sArr, "$this$groupBy");
        Intrinsics.checkNotNullParameter(lVar, "keySelector");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        int X = C10857a2.m38727X(sArr);
        for (int i = 0; i < X; i++) {
            short Q = C10857a2.m38726Q(sArr, i);
            Object invoke = lVar.invoke(C11679z1.m45862g(Q));
            Object obj = linkedHashMap.get(invoke);
            if (obj == null) {
                obj = new ArrayList();
                linkedHashMap.put(invoke, obj);
            }
            ((List) obj).add(C11679z1.m45862g(Q));
        }
        return linkedHashMap;
    }

    @C11531s
    @C11110f
    @C11665v0(version = "1.3")
    /* renamed from: J5 */
    public static final <R, C extends Collection<? super R>> C m41673J5(long[] jArr, C c, C11304p<? super Integer, ? super C11588t1, ? extends R> pVar) {
        Intrinsics.checkNotNullParameter(jArr, "$this$mapIndexedTo");
        Intrinsics.checkNotNullParameter(c, FirebaseAnalytics.C32532b.f78977z);
        Intrinsics.checkNotNullParameter(pVar, "transform");
        int X = C11662u1.m45751X(jArr);
        int i = 0;
        int i2 = 0;
        while (i < X) {
            c.add(pVar.invoke(Integer.valueOf(i2), C11588t1.m44992g(C11662u1.m45750Q(jArr, i))));
            i++;
            i2++;
        }
        return c;
    }

    @C11531s
    @C11314h(name = "maxOrThrow-U")
    @C11665v0(version = "1.7")
    /* renamed from: J6 */
    public static final short m41674J6(@C12579k short[] sArr) {
        Intrinsics.checkNotNullParameter(sArr, "$this$max");
        if (!C10857a2.m38731h0(sArr)) {
            short Q = C10857a2.m38726Q(sArr, 0);
            C10953k0 H = new C11466l(1, ArraysKt___ArraysKt.m39555Ye(sArr)).iterator();
            while (H.hasNext()) {
                short Q2 = C10857a2.m38726Q(sArr, H.mo6374c());
                if (Intrinsics.compare((int) Q & C11679z1.f28988d, (int) 65535 & Q2) < 0) {
                    Q = Q2;
                }
            }
            return Q;
        }
        throw new NoSuchElementException();
    }

    @C11531s
    @C12580l
    @C11665v0(version = "1.4")
    /* renamed from: J7 */
    public static final C11679z1 m41675J7(@C12579k short[] sArr) {
        Intrinsics.checkNotNullParameter(sArr, "$this$minOrNull");
        if (C10857a2.m38731h0(sArr)) {
            return null;
        }
        short Q = C10857a2.m38726Q(sArr, 0);
        C10953k0 H = new C11466l(1, ArraysKt___ArraysKt.m39555Ye(sArr)).iterator();
        while (H.hasNext()) {
            short Q2 = C10857a2.m38726Q(sArr, H.mo6374c());
            if (Intrinsics.compare((int) Q & C11679z1.f28988d, (int) 65535 & Q2) > 0) {
                Q = Q2;
            }
        }
        return C11679z1.m45862g(Q);
    }

    @C11531s
    @C12580l
    @C11665v0(version = "1.4")
    @C11097g2(markerClass = {C11429q.class})
    /* renamed from: J8 */
    public static final C11588t1 m41676J8(@C12579k long[] jArr, @C12579k Random random) {
        Intrinsics.checkNotNullParameter(jArr, "$this$randomOrNull");
        Intrinsics.checkNotNullParameter(random, BaseOptionModel.f27465E0);
        if (C11662u1.m45755h0(jArr)) {
            return null;
        }
        return C11588t1.m44992g(C11662u1.m45750Q(jArr, random.mo22986m(C11662u1.m45751X(jArr))));
    }

    @C11531s
    @C11110f
    @C11665v0(version = "1.3")
    /* renamed from: J9 */
    public static final short[] m41677J9(short[] sArr) {
        Intrinsics.checkNotNullParameter(sArr, "$this$reversedArray");
        return C10857a2.m38736q(ArraysKt___ArraysKt.m39568Yr(sArr));
    }

    @C11531s
    @C11665v0(version = "1.3")
    @C12579k
    /* renamed from: Ja */
    public static final List<C11400l1> m41678Ja(@C12579k byte[] bArr, @C12579k Iterable<Integer> iterable) {
        Intrinsics.checkNotNullParameter(bArr, "$this$slice");
        Intrinsics.checkNotNullParameter(iterable, "indices");
        int Y = C10978t.m41495Y(iterable, 10);
        if (Y == 0) {
            return CollectionsKt__CollectionsKt.m40441E();
        }
        ArrayList arrayList = new ArrayList(Y);
        for (Integer intValue : iterable) {
            arrayList.add(C11400l1.m43782g(C11404m1.m43808Q(bArr, intValue.intValue())));
        }
        return arrayList;
    }

    @C11531s
    @C11110f
    @C11665v0(version = "1.3")
    /* renamed from: Jb */
    public static final int m41679Jb(short[] sArr) {
        Intrinsics.checkNotNullParameter(sArr, "$this$sum");
        int M = C11419p1.m43971M(0);
        int X = C10857a2.m38727X(sArr);
        for (int i = 0; i < X; i++) {
            M = C11419p1.m43971M(M + C11419p1.m43971M(C10857a2.m38726Q(sArr, i) & C11679z1.f28988d));
        }
        return M;
    }

    @C11531s
    @C11110f
    @C11665v0(version = "1.3")
    /* renamed from: Jc */
    public static final short[] m41680Jc(short[] sArr) {
        Intrinsics.checkNotNullParameter(sArr, "$this$toShortArray");
        short[] copyOf = Arrays.copyOf(sArr, sArr.length);
        Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(this, size)");
        return copyOf;
    }

    @C11531s
    @C11110f
    @C11665v0(version = "1.3")
    /* renamed from: K0 */
    public static final int m41681K0(int[] iArr) {
        Intrinsics.checkNotNullParameter(iArr, "$this$component4");
        return C11431q1.m44044Q(iArr, 3);
    }

    @C11531s
    @C11110f
    @C11665v0(version = "1.3")
    /* renamed from: K1 */
    public static final int m41682K1(byte[] bArr, C11300l<? super C11400l1, Boolean> lVar) {
        Intrinsics.checkNotNullParameter(bArr, "$this$count");
        Intrinsics.checkNotNullParameter(lVar, "predicate");
        int X = C11404m1.m43809X(bArr);
        int i = 0;
        for (int i2 = 0; i2 < X; i2++) {
            if (lVar.invoke(C11400l1.m43782g(C11404m1.m43808Q(bArr, i2))).booleanValue()) {
                i++;
            }
        }
        return i;
    }

    @C11531s
    @C11110f
    @C11665v0(version = "1.3")
    /* renamed from: K2 */
    public static final <C extends Collection<? super C11588t1>> C m41683K2(long[] jArr, C c, C11300l<? super C11588t1, Boolean> lVar) {
        Intrinsics.checkNotNullParameter(jArr, "$this$filterNotTo");
        Intrinsics.checkNotNullParameter(c, FirebaseAnalytics.C32532b.f78977z);
        Intrinsics.checkNotNullParameter(lVar, "predicate");
        int X = C11662u1.m45751X(jArr);
        for (int i = 0; i < X; i++) {
            long Q = C11662u1.m45750Q(jArr, i);
            if (!lVar.invoke(C11588t1.m44992g(Q)).booleanValue()) {
                c.add(C11588t1.m44992g(Q));
            }
        }
        return c;
    }

    /* JADX WARNING: type inference failed for: r7v0, types: [kotlin.jvm.functions.q, java.lang.Object, kotlin.jvm.functions.q<? super java.lang.Integer, ? super R, ? super kotlin.l1, ? extends R>] */
    /* JADX WARNING: Unknown variable types count: 1 */
    @kotlin.C11531s
    @kotlin.internal.C11110f
    @kotlin.C11665v0(version = "1.3")
    /* renamed from: K3 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final <R> R m41684K3(byte[] r5, R r6, kotlin.jvm.functions.C11305q<? super java.lang.Integer, ? super R, ? super kotlin.C11400l1, ? extends R> r7) {
        /*
            java.lang.String r0 = "$this$foldIndexed"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
            java.lang.String r0 = "operation"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r0)
            int r0 = kotlin.C11404m1.m43809X(r5)
            r1 = 0
            r2 = r1
        L_0x0010:
            if (r1 >= r0) goto L_0x0028
            byte r3 = kotlin.C11404m1.m43808Q(r5, r1)
            int r4 = r2 + 1
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            kotlin.l1 r3 = kotlin.C11400l1.m43782g(r3)
            java.lang.Object r6 = r7.invoke(r2, r6, r3)
            int r1 = r1 + 1
            r2 = r4
            goto L_0x0010
        L_0x0028:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.collections.unsigned.UArraysKt___UArraysKt.m41684K3(byte[], java.lang.Object, kotlin.jvm.functions.q):java.lang.Object");
    }

    @C11531s
    @C11110f
    @C11665v0(version = "1.3")
    /* renamed from: K4 */
    public static final <K, M extends Map<? super K, List<C11419p1>>> M m41685K4(int[] iArr, M m, C11300l<? super C11419p1, ? extends K> lVar) {
        Intrinsics.checkNotNullParameter(iArr, "$this$groupByTo");
        Intrinsics.checkNotNullParameter(m, FirebaseAnalytics.C32532b.f78977z);
        Intrinsics.checkNotNullParameter(lVar, "keySelector");
        int X = C11431q1.m44045X(iArr);
        for (int i = 0; i < X; i++) {
            int Q = C11431q1.m44044Q(iArr, i);
            Object invoke = lVar.invoke(C11419p1.m43993g(Q));
            Object obj = m.get(invoke);
            if (obj == null) {
                obj = new ArrayList();
                m.put(invoke, obj);
            }
            ((List) obj).add(C11419p1.m43993g(Q));
        }
        return m;
    }

    @C11531s
    @C11110f
    @C11665v0(version = "1.3")
    /* renamed from: K5 */
    public static final <R, C extends Collection<? super R>> C m41686K5(long[] jArr, C c, C11300l<? super C11588t1, ? extends R> lVar) {
        Intrinsics.checkNotNullParameter(jArr, "$this$mapTo");
        Intrinsics.checkNotNullParameter(c, FirebaseAnalytics.C32532b.f78977z);
        Intrinsics.checkNotNullParameter(lVar, "transform");
        int X = C11662u1.m45751X(jArr);
        for (int i = 0; i < X; i++) {
            c.add(lVar.invoke(C11588t1.m44992g(C11662u1.m45750Q(jArr, i))));
        }
        return c;
    }

    @C11531s
    @C12580l
    @C11665v0(version = "1.4")
    /* renamed from: K6 */
    public static final C11400l1 m41687K6(@C12579k byte[] bArr, @C12579k Comparator<? super C11400l1> comparator) {
        Intrinsics.checkNotNullParameter(bArr, "$this$maxWithOrNull");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        if (C11404m1.m43813h0(bArr)) {
            return null;
        }
        byte Q = C11404m1.m43808Q(bArr, 0);
        C10953k0 H = new C11466l(1, ArraysKt___ArraysKt.m39331Re(bArr)).iterator();
        while (H.hasNext()) {
            byte Q2 = C11404m1.m43808Q(bArr, H.mo6374c());
            if (comparator.compare(C11400l1.m43782g(Q), C11400l1.m43782g(Q2)) < 0) {
                Q = Q2;
            }
        }
        return C11400l1.m43782g(Q);
    }

    @C11531s
    @C11314h(name = "minOrThrow-U")
    @C11665v0(version = "1.7")
    /* renamed from: K7 */
    public static final byte m41688K7(@C12579k byte[] bArr) {
        Intrinsics.checkNotNullParameter(bArr, "$this$min");
        if (!C11404m1.m43813h0(bArr)) {
            byte Q = C11404m1.m43808Q(bArr, 0);
            C10953k0 H = new C11466l(1, ArraysKt___ArraysKt.m39331Re(bArr)).iterator();
            while (H.hasNext()) {
                byte Q2 = C11404m1.m43808Q(bArr, H.mo6374c());
                if (Intrinsics.compare((int) Q & 255, (int) Q2 & 255) > 0) {
                    Q = Q2;
                }
            }
            return Q;
        }
        throw new NoSuchElementException();
    }

    @C11531s
    @C11110f
    @C11665v0(version = "1.4")
    @C11097g2(markerClass = {C11429q.class})
    /* renamed from: K8 */
    public static final C11588t1 m41689K8(long[] jArr) {
        Intrinsics.checkNotNullParameter(jArr, "$this$randomOrNull");
        return m41676J8(jArr, Random.f28564a);
    }

    /* JADX WARNING: type inference failed for: r7v0, types: [java.lang.Object, kotlin.jvm.functions.p<? super R, ? super kotlin.t1, ? extends R>, kotlin.jvm.functions.p] */
    /* JADX WARNING: Unknown variable types count: 1 */
    @kotlin.C11531s
    @kotlin.internal.C11110f
    @kotlin.C11665v0(version = "1.4")
    /* renamed from: K9 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final <R> java.util.List<R> m41690K9(long[] r5, R r6, kotlin.jvm.functions.C11304p<? super R, ? super kotlin.C11588t1, ? extends R> r7) {
        /*
            java.lang.String r0 = "$this$runningFold"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
            java.lang.String r0 = "operation"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r0)
            boolean r0 = kotlin.C11662u1.m45755h0(r5)
            if (r0 == 0) goto L_0x0015
            java.util.List r5 = kotlin.collections.C10976s.m41419k(r6)
            return r5
        L_0x0015:
            java.util.ArrayList r0 = new java.util.ArrayList
            int r1 = kotlin.C11662u1.m45751X(r5)
            int r1 = r1 + 1
            r0.<init>(r1)
            r0.add(r6)
            int r1 = kotlin.C11662u1.m45751X(r5)
            r2 = 0
        L_0x0028:
            if (r2 >= r1) goto L_0x003c
            long r3 = kotlin.C11662u1.m45750Q(r5, r2)
            kotlin.t1 r3 = kotlin.C11588t1.m44992g(r3)
            java.lang.Object r6 = r7.invoke(r6, r3)
            r0.add(r6)
            int r2 = r2 + 1
            goto L_0x0028
        L_0x003c:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.collections.unsigned.UArraysKt___UArraysKt.m41690K9(long[], java.lang.Object, kotlin.jvm.functions.p):java.util.List");
    }

    @C11531s
    @C11665v0(version = "1.3")
    @C12579k
    /* renamed from: Ka */
    public static final List<C11679z1> m41691Ka(@C12579k short[] sArr, @C12579k C11466l lVar) {
        Intrinsics.checkNotNullParameter(sArr, "$this$slice");
        Intrinsics.checkNotNullParameter(lVar, "indices");
        if (lVar.isEmpty()) {
            return CollectionsKt__CollectionsKt.m40441E();
        }
        return C10985b.m42284d(C10857a2.m38736q(C10956m.m41094N1(sArr, lVar.getStart().intValue(), lVar.mo23013q().intValue() + 1)));
    }

    @C11395k(message = "Use sumOf instead.", replaceWith = @C11587t0(expression = "this.sumOf(selector)", imports = {}))
    @C11531s
    @C11398l(warningSince = "1.5")
    @C11110f
    @C11665v0(version = "1.3")
    /* renamed from: Kb */
    public static final int m41692Kb(byte[] bArr, C11300l<? super C11400l1, C11419p1> lVar) {
        Intrinsics.checkNotNullParameter(bArr, "$this$sumBy");
        Intrinsics.checkNotNullParameter(lVar, "selector");
        int X = C11404m1.m43809X(bArr);
        int i = 0;
        for (int i2 = 0; i2 < X; i2++) {
            i = C11419p1.m43971M(i + lVar.invoke(C11400l1.m43782g(C11404m1.m43808Q(bArr, i2))).mo22930j2());
        }
        return i;
    }

    @C11531s
    @C11665v0(version = "1.3")
    @C12579k
    /* renamed from: Kc */
    public static final C11419p1[] m41693Kc(@C12579k int[] iArr) {
        Intrinsics.checkNotNullParameter(iArr, "$this$toTypedArray");
        int X = C11431q1.m44045X(iArr);
        C11419p1[] p1VarArr = new C11419p1[X];
        for (int i = 0; i < X; i++) {
            p1VarArr[i] = C11419p1.m43993g(C11431q1.m44044Q(iArr, i));
        }
        return p1VarArr;
    }

    @C11531s
    @C11110f
    @C11665v0(version = "1.3")
    /* renamed from: L0 */
    public static final byte m41694L0(byte[] bArr) {
        Intrinsics.checkNotNullParameter(bArr, "$this$component4");
        return C11404m1.m43808Q(bArr, 3);
    }

    @C11531s
    @C11110f
    @C11665v0(version = "1.3")
    /* renamed from: L1 */
    public static final int m41695L1(long[] jArr, C11300l<? super C11588t1, Boolean> lVar) {
        Intrinsics.checkNotNullParameter(jArr, "$this$count");
        Intrinsics.checkNotNullParameter(lVar, "predicate");
        int X = C11662u1.m45751X(jArr);
        int i = 0;
        for (int i2 = 0; i2 < X; i2++) {
            if (lVar.invoke(C11588t1.m44992g(C11662u1.m45750Q(jArr, i2))).booleanValue()) {
                i++;
            }
        }
        return i;
    }

    @C11531s
    @C11110f
    @C11665v0(version = "1.3")
    /* renamed from: L2 */
    public static final <C extends Collection<? super C11679z1>> C m41696L2(short[] sArr, C c, C11300l<? super C11679z1, Boolean> lVar) {
        Intrinsics.checkNotNullParameter(sArr, "$this$filterNotTo");
        Intrinsics.checkNotNullParameter(c, FirebaseAnalytics.C32532b.f78977z);
        Intrinsics.checkNotNullParameter(lVar, "predicate");
        int X = C10857a2.m38727X(sArr);
        for (int i = 0; i < X; i++) {
            short Q = C10857a2.m38726Q(sArr, i);
            if (!lVar.invoke(C11679z1.m45862g(Q)).booleanValue()) {
                c.add(C11679z1.m45862g(Q));
            }
        }
        return c;
    }

    /* JADX WARNING: type inference failed for: r7v0, types: [kotlin.jvm.functions.q, java.lang.Object, kotlin.jvm.functions.q<? super java.lang.Integer, ? super R, ? super kotlin.z1, ? extends R>] */
    /* JADX WARNING: Unknown variable types count: 1 */
    @kotlin.C11531s
    @kotlin.internal.C11110f
    @kotlin.C11665v0(version = "1.3")
    /* renamed from: L3 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final <R> R m41697L3(short[] r5, R r6, kotlin.jvm.functions.C11305q<? super java.lang.Integer, ? super R, ? super kotlin.C11679z1, ? extends R> r7) {
        /*
            java.lang.String r0 = "$this$foldIndexed"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
            java.lang.String r0 = "operation"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r0)
            int r0 = kotlin.C10857a2.m38727X(r5)
            r1 = 0
            r2 = r1
        L_0x0010:
            if (r1 >= r0) goto L_0x0028
            short r3 = kotlin.C10857a2.m38726Q(r5, r1)
            int r4 = r2 + 1
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            kotlin.z1 r3 = kotlin.C11679z1.m45862g(r3)
            java.lang.Object r6 = r7.invoke(r2, r6, r3)
            int r1 = r1 + 1
            r2 = r4
            goto L_0x0010
        L_0x0028:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.collections.unsigned.UArraysKt___UArraysKt.m41697L3(short[], java.lang.Object, kotlin.jvm.functions.q):java.lang.Object");
    }

    @C11531s
    @C11110f
    @C11665v0(version = "1.3")
    /* renamed from: L4 */
    public static final <K, M extends Map<? super K, List<C11400l1>>> M m41698L4(byte[] bArr, M m, C11300l<? super C11400l1, ? extends K> lVar) {
        Intrinsics.checkNotNullParameter(bArr, "$this$groupByTo");
        Intrinsics.checkNotNullParameter(m, FirebaseAnalytics.C32532b.f78977z);
        Intrinsics.checkNotNullParameter(lVar, "keySelector");
        int X = C11404m1.m43809X(bArr);
        for (int i = 0; i < X; i++) {
            byte Q = C11404m1.m43808Q(bArr, i);
            Object invoke = lVar.invoke(C11400l1.m43782g(Q));
            Object obj = m.get(invoke);
            if (obj == null) {
                obj = new ArrayList();
                m.put(invoke, obj);
            }
            ((List) obj).add(C11400l1.m43782g(Q));
        }
        return m;
    }

    @C11531s
    @C11110f
    @C11665v0(version = "1.3")
    /* renamed from: L5 */
    public static final <R, C extends Collection<? super R>> C m41699L5(short[] sArr, C c, C11300l<? super C11679z1, ? extends R> lVar) {
        Intrinsics.checkNotNullParameter(sArr, "$this$mapTo");
        Intrinsics.checkNotNullParameter(c, FirebaseAnalytics.C32532b.f78977z);
        Intrinsics.checkNotNullParameter(lVar, "transform");
        int X = C10857a2.m38727X(sArr);
        for (int i = 0; i < X; i++) {
            c.add(lVar.invoke(C11679z1.m45862g(C10857a2.m38726Q(sArr, i))));
        }
        return c;
    }

    @C11531s
    @C12580l
    @C11665v0(version = "1.4")
    /* renamed from: L6 */
    public static final C11419p1 m41700L6(@C12579k int[] iArr, @C12579k Comparator<? super C11419p1> comparator) {
        Intrinsics.checkNotNullParameter(iArr, "$this$maxWithOrNull");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        if (C11431q1.m44049h0(iArr)) {
            return null;
        }
        int Q = C11431q1.m44044Q(iArr, 0);
        C10953k0 H = new C11466l(1, ArraysKt___ArraysKt.m39459Ve(iArr)).iterator();
        while (H.hasNext()) {
            int Q2 = C11431q1.m44044Q(iArr, H.mo6374c());
            if (comparator.compare(C11419p1.m43993g(Q), C11419p1.m43993g(Q2)) < 0) {
                Q = Q2;
            }
        }
        return C11419p1.m43993g(Q);
    }

    @C11531s
    @C11314h(name = "minOrThrow-U")
    @C11665v0(version = "1.7")
    /* renamed from: L7 */
    public static final int m41701L7(@C12579k int[] iArr) {
        Intrinsics.checkNotNullParameter(iArr, "$this$min");
        if (!C11431q1.m44049h0(iArr)) {
            int Q = C11431q1.m44044Q(iArr, 0);
            C10953k0 H = new C11466l(1, ArraysKt___ArraysKt.m39459Ve(iArr)).iterator();
            while (H.hasNext()) {
                int Q2 = C11431q1.m44044Q(iArr, H.mo6374c());
                if (Integer.compare(Q ^ Integer.MIN_VALUE, Q2 ^ Integer.MIN_VALUE) > 0) {
                    Q = Q2;
                }
            }
            return Q;
        }
        throw new NoSuchElementException();
    }

    @C11531s
    @C12580l
    @C11665v0(version = "1.4")
    @C11097g2(markerClass = {C11429q.class})
    /* renamed from: L8 */
    public static final C11400l1 m41702L8(@C12579k byte[] bArr, @C12579k Random random) {
        Intrinsics.checkNotNullParameter(bArr, "$this$randomOrNull");
        Intrinsics.checkNotNullParameter(random, BaseOptionModel.f27465E0);
        if (C11404m1.m43813h0(bArr)) {
            return null;
        }
        return C11400l1.m43782g(C11404m1.m43808Q(bArr, random.mo22986m(C11404m1.m43809X(bArr))));
    }

    /* JADX WARNING: type inference failed for: r6v0, types: [java.lang.Object, kotlin.jvm.functions.p<? super R, ? super kotlin.l1, ? extends R>, kotlin.jvm.functions.p] */
    /* JADX WARNING: Unknown variable types count: 1 */
    @kotlin.C11531s
    @kotlin.internal.C11110f
    @kotlin.C11665v0(version = "1.4")
    /* renamed from: L9 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final <R> java.util.List<R> m41703L9(byte[] r4, R r5, kotlin.jvm.functions.C11304p<? super R, ? super kotlin.C11400l1, ? extends R> r6) {
        /*
            java.lang.String r0 = "$this$runningFold"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            java.lang.String r0 = "operation"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r0)
            boolean r0 = kotlin.C11404m1.m43813h0(r4)
            if (r0 == 0) goto L_0x0015
            java.util.List r4 = kotlin.collections.C10976s.m41419k(r5)
            return r4
        L_0x0015:
            java.util.ArrayList r0 = new java.util.ArrayList
            int r1 = kotlin.C11404m1.m43809X(r4)
            int r1 = r1 + 1
            r0.<init>(r1)
            r0.add(r5)
            int r1 = kotlin.C11404m1.m43809X(r4)
            r2 = 0
        L_0x0028:
            if (r2 >= r1) goto L_0x003c
            byte r3 = kotlin.C11404m1.m43808Q(r4, r2)
            kotlin.l1 r3 = kotlin.C11400l1.m43782g(r3)
            java.lang.Object r5 = r6.invoke(r5, r3)
            r0.add(r5)
            int r2 = r2 + 1
            goto L_0x0028
        L_0x003c:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.collections.unsigned.UArraysKt___UArraysKt.m41703L9(byte[], java.lang.Object, kotlin.jvm.functions.p):java.util.List");
    }

    @C11531s
    @C11665v0(version = "1.3")
    @C12579k
    /* renamed from: La */
    public static final List<C11588t1> m41704La(@C12579k long[] jArr, @C12579k C11466l lVar) {
        Intrinsics.checkNotNullParameter(jArr, "$this$slice");
        Intrinsics.checkNotNullParameter(lVar, "indices");
        if (lVar.isEmpty()) {
            return CollectionsKt__CollectionsKt.m40441E();
        }
        return C10985b.m42283c(C11662u1.m45760q(C10956m.m41082L1(jArr, lVar.getStart().intValue(), lVar.mo23013q().intValue() + 1)));
    }

    @C11395k(message = "Use sumOf instead.", replaceWith = @C11587t0(expression = "this.sumOf(selector)", imports = {}))
    @C11531s
    @C11398l(warningSince = "1.5")
    @C11110f
    @C11665v0(version = "1.3")
    /* renamed from: Lb */
    public static final int m41705Lb(long[] jArr, C11300l<? super C11588t1, C11419p1> lVar) {
        Intrinsics.checkNotNullParameter(jArr, "$this$sumBy");
        Intrinsics.checkNotNullParameter(lVar, "selector");
        int X = C11662u1.m45751X(jArr);
        int i = 0;
        for (int i2 = 0; i2 < X; i2++) {
            i = C11419p1.m43971M(i + lVar.invoke(C11588t1.m44992g(C11662u1.m45750Q(jArr, i2))).mo22930j2());
        }
        return i;
    }

    @C11531s
    @C11665v0(version = "1.3")
    @C12579k
    /* renamed from: Lc */
    public static final C11400l1[] m41706Lc(@C12579k byte[] bArr) {
        Intrinsics.checkNotNullParameter(bArr, "$this$toTypedArray");
        int X = C11404m1.m43809X(bArr);
        C11400l1[] l1VarArr = new C11400l1[X];
        for (int i = 0; i < X; i++) {
            l1VarArr[i] = C11400l1.m43782g(C11404m1.m43808Q(bArr, i));
        }
        return l1VarArr;
    }

    @C11531s
    @C11110f
    @C11665v0(version = "1.3")
    /* renamed from: M0 */
    public static final long m41707M0(long[] jArr) {
        Intrinsics.checkNotNullParameter(jArr, "$this$component4");
        return C11662u1.m45750Q(jArr, 3);
    }

    @C11531s
    @C11110f
    @C11665v0(version = "1.3")
    /* renamed from: M1 */
    public static final int m41708M1(int[] iArr, C11300l<? super C11419p1, Boolean> lVar) {
        Intrinsics.checkNotNullParameter(iArr, "$this$count");
        Intrinsics.checkNotNullParameter(lVar, "predicate");
        int X = C11431q1.m44045X(iArr);
        int i = 0;
        for (int i2 = 0; i2 < X; i2++) {
            if (lVar.invoke(C11419p1.m43993g(C11431q1.m44044Q(iArr, i2))).booleanValue()) {
                i++;
            }
        }
        return i;
    }

    @C11531s
    @C11110f
    @C11665v0(version = "1.3")
    /* renamed from: M2 */
    public static final <C extends Collection<? super C11419p1>> C m41709M2(int[] iArr, C c, C11300l<? super C11419p1, Boolean> lVar) {
        Intrinsics.checkNotNullParameter(iArr, "$this$filterNotTo");
        Intrinsics.checkNotNullParameter(c, FirebaseAnalytics.C32532b.f78977z);
        Intrinsics.checkNotNullParameter(lVar, "predicate");
        int X = C11431q1.m44045X(iArr);
        for (int i = 0; i < X; i++) {
            int Q = C11431q1.m44044Q(iArr, i);
            if (!lVar.invoke(C11419p1.m43993g(Q)).booleanValue()) {
                c.add(C11419p1.m43993g(Q));
            }
        }
        return c;
    }

    /* JADX WARNING: type inference failed for: r8v0, types: [kotlin.jvm.functions.q, java.lang.Object, kotlin.jvm.functions.q<? super java.lang.Integer, ? super R, ? super kotlin.t1, ? extends R>] */
    /* JADX WARNING: Unknown variable types count: 1 */
    @kotlin.C11531s
    @kotlin.internal.C11110f
    @kotlin.C11665v0(version = "1.3")
    /* renamed from: M3 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final <R> R m41710M3(long[] r6, R r7, kotlin.jvm.functions.C11305q<? super java.lang.Integer, ? super R, ? super kotlin.C11588t1, ? extends R> r8) {
        /*
            java.lang.String r0 = "$this$foldIndexed"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r0)
            java.lang.String r0 = "operation"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r0)
            int r0 = kotlin.C11662u1.m45751X(r6)
            r1 = 0
            r2 = r1
        L_0x0010:
            if (r1 >= r0) goto L_0x0028
            long r3 = kotlin.C11662u1.m45750Q(r6, r1)
            int r5 = r2 + 1
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            kotlin.t1 r3 = kotlin.C11588t1.m44992g(r3)
            java.lang.Object r7 = r8.invoke(r2, r7, r3)
            int r1 = r1 + 1
            r2 = r5
            goto L_0x0010
        L_0x0028:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.collections.unsigned.UArraysKt___UArraysKt.m41710M3(long[], java.lang.Object, kotlin.jvm.functions.q):java.lang.Object");
    }

    @C11531s
    @C11110f
    @C11665v0(version = "1.3")
    /* renamed from: M4 */
    public static final <K, V, M extends Map<? super K, List<V>>> M m41711M4(int[] iArr, M m, C11300l<? super C11419p1, ? extends K> lVar, C11300l<? super C11419p1, ? extends V> lVar2) {
        Intrinsics.checkNotNullParameter(iArr, "$this$groupByTo");
        Intrinsics.checkNotNullParameter(m, FirebaseAnalytics.C32532b.f78977z);
        Intrinsics.checkNotNullParameter(lVar, "keySelector");
        Intrinsics.checkNotNullParameter(lVar2, "valueTransform");
        int X = C11431q1.m44045X(iArr);
        for (int i = 0; i < X; i++) {
            int Q = C11431q1.m44044Q(iArr, i);
            Object invoke = lVar.invoke(C11419p1.m43993g(Q));
            Object obj = m.get(invoke);
            if (obj == null) {
                obj = new ArrayList();
                m.put(invoke, obj);
            }
            ((List) obj).add(lVar2.invoke(C11419p1.m43993g(Q)));
        }
        return m;
    }

    @C11531s
    @C11110f
    @C11665v0(version = "1.3")
    /* renamed from: M5 */
    public static final <R, C extends Collection<? super R>> C m41712M5(int[] iArr, C c, C11300l<? super C11419p1, ? extends R> lVar) {
        Intrinsics.checkNotNullParameter(iArr, "$this$mapTo");
        Intrinsics.checkNotNullParameter(c, FirebaseAnalytics.C32532b.f78977z);
        Intrinsics.checkNotNullParameter(lVar, "transform");
        int X = C11431q1.m44045X(iArr);
        for (int i = 0; i < X; i++) {
            c.add(lVar.invoke(C11419p1.m43993g(C11431q1.m44044Q(iArr, i))));
        }
        return c;
    }

    @C11531s
    @C12580l
    @C11665v0(version = "1.4")
    /* renamed from: M6 */
    public static final C11679z1 m41713M6(@C12579k short[] sArr, @C12579k Comparator<? super C11679z1> comparator) {
        Intrinsics.checkNotNullParameter(sArr, "$this$maxWithOrNull");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        if (C10857a2.m38731h0(sArr)) {
            return null;
        }
        short Q = C10857a2.m38726Q(sArr, 0);
        C10953k0 H = new C11466l(1, ArraysKt___ArraysKt.m39555Ye(sArr)).iterator();
        while (H.hasNext()) {
            short Q2 = C10857a2.m38726Q(sArr, H.mo6374c());
            if (comparator.compare(C11679z1.m45862g(Q), C11679z1.m45862g(Q2)) < 0) {
                Q = Q2;
            }
        }
        return C11679z1.m45862g(Q);
    }

    @C11531s
    @C11314h(name = "minOrThrow-U")
    @C11665v0(version = "1.7")
    /* renamed from: M7 */
    public static final long m41714M7(@C12579k long[] jArr) {
        Intrinsics.checkNotNullParameter(jArr, "$this$min");
        if (!C11662u1.m45755h0(jArr)) {
            long Q = C11662u1.m45750Q(jArr, 0);
            C10953k0 H = new C11466l(1, ArraysKt___ArraysKt.m39491We(jArr)).iterator();
            while (H.hasNext()) {
                long Q2 = C11662u1.m45750Q(jArr, H.mo6374c());
                if (Long.compare(Q ^ Long.MIN_VALUE, Q2 ^ Long.MIN_VALUE) > 0) {
                    Q = Q2;
                }
            }
            return Q;
        }
        throw new NoSuchElementException();
    }

    @C11531s
    @C11110f
    @C11665v0(version = "1.4")
    @C11097g2(markerClass = {C11429q.class})
    /* renamed from: M8 */
    public static final C11679z1 m41715M8(short[] sArr) {
        Intrinsics.checkNotNullParameter(sArr, "$this$randomOrNull");
        return m41728N8(sArr, Random.f28564a);
    }

    /* JADX WARNING: type inference failed for: r6v0, types: [java.lang.Object, kotlin.jvm.functions.p<? super R, ? super kotlin.p1, ? extends R>, kotlin.jvm.functions.p] */
    /* JADX WARNING: Unknown variable types count: 1 */
    @kotlin.C11531s
    @kotlin.internal.C11110f
    @kotlin.C11665v0(version = "1.4")
    /* renamed from: M9 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final <R> java.util.List<R> m41716M9(int[] r4, R r5, kotlin.jvm.functions.C11304p<? super R, ? super kotlin.C11419p1, ? extends R> r6) {
        /*
            java.lang.String r0 = "$this$runningFold"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            java.lang.String r0 = "operation"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r0)
            boolean r0 = kotlin.C11431q1.m44049h0(r4)
            if (r0 == 0) goto L_0x0015
            java.util.List r4 = kotlin.collections.C10976s.m41419k(r5)
            return r4
        L_0x0015:
            java.util.ArrayList r0 = new java.util.ArrayList
            int r1 = kotlin.C11431q1.m44045X(r4)
            int r1 = r1 + 1
            r0.<init>(r1)
            r0.add(r5)
            int r1 = kotlin.C11431q1.m44045X(r4)
            r2 = 0
        L_0x0028:
            if (r2 >= r1) goto L_0x003c
            int r3 = kotlin.C11431q1.m44044Q(r4, r2)
            kotlin.p1 r3 = kotlin.C11419p1.m43993g(r3)
            java.lang.Object r5 = r6.invoke(r5, r3)
            r0.add(r5)
            int r2 = r2 + 1
            goto L_0x0028
        L_0x003c:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.collections.unsigned.UArraysKt___UArraysKt.m41716M9(int[], java.lang.Object, kotlin.jvm.functions.p):java.util.List");
    }

    @C11531s
    @C11665v0(version = "1.3")
    @C12579k
    /* renamed from: Ma */
    public static final List<C11400l1> m41717Ma(@C12579k byte[] bArr, @C12579k C11466l lVar) {
        Intrinsics.checkNotNullParameter(bArr, "$this$slice");
        Intrinsics.checkNotNullParameter(lVar, "indices");
        if (lVar.isEmpty()) {
            return CollectionsKt__CollectionsKt.m40441E();
        }
        return C10985b.m42282b(C11404m1.m43818q(C10956m.m41052G1(bArr, lVar.getStart().intValue(), lVar.mo23013q().intValue() + 1)));
    }

    @C11395k(message = "Use sumOf instead.", replaceWith = @C11587t0(expression = "this.sumOf(selector)", imports = {}))
    @C11531s
    @C11398l(warningSince = "1.5")
    @C11110f
    @C11665v0(version = "1.3")
    /* renamed from: Mb */
    public static final int m41718Mb(int[] iArr, C11300l<? super C11419p1, C11419p1> lVar) {
        Intrinsics.checkNotNullParameter(iArr, "$this$sumBy");
        Intrinsics.checkNotNullParameter(lVar, "selector");
        int X = C11431q1.m44045X(iArr);
        int i = 0;
        for (int i2 = 0; i2 < X; i2++) {
            i = C11419p1.m43971M(i + lVar.invoke(C11419p1.m43993g(C11431q1.m44044Q(iArr, i2))).mo22930j2());
        }
        return i;
    }

    @C11531s
    @C11665v0(version = "1.3")
    @C12579k
    /* renamed from: Mc */
    public static final C11588t1[] m41719Mc(@C12579k long[] jArr) {
        Intrinsics.checkNotNullParameter(jArr, "$this$toTypedArray");
        int X = C11662u1.m45751X(jArr);
        C11588t1[] t1VarArr = new C11588t1[X];
        for (int i = 0; i < X; i++) {
            t1VarArr[i] = C11588t1.m44992g(C11662u1.m45750Q(jArr, i));
        }
        return t1VarArr;
    }

    @C11531s
    @C11110f
    @C11665v0(version = "1.3")
    /* renamed from: N0 */
    public static final short m41720N0(short[] sArr) {
        Intrinsics.checkNotNullParameter(sArr, "$this$component4");
        return C10857a2.m38726Q(sArr, 3);
    }

    @C11531s
    @C11110f
    @C11665v0(version = "1.3")
    /* renamed from: N1 */
    public static final int m41721N1(short[] sArr, C11300l<? super C11679z1, Boolean> lVar) {
        Intrinsics.checkNotNullParameter(sArr, "$this$count");
        Intrinsics.checkNotNullParameter(lVar, "predicate");
        int X = C10857a2.m38727X(sArr);
        int i = 0;
        for (int i2 = 0; i2 < X; i2++) {
            if (lVar.invoke(C11679z1.m45862g(C10857a2.m38726Q(sArr, i2))).booleanValue()) {
                i++;
            }
        }
        return i;
    }

    @C11531s
    @C11110f
    @C11665v0(version = "1.3")
    /* renamed from: N2 */
    public static final <C extends Collection<? super C11400l1>> C m41722N2(byte[] bArr, C c, C11300l<? super C11400l1, Boolean> lVar) {
        Intrinsics.checkNotNullParameter(bArr, "$this$filterNotTo");
        Intrinsics.checkNotNullParameter(c, FirebaseAnalytics.C32532b.f78977z);
        Intrinsics.checkNotNullParameter(lVar, "predicate");
        int X = C11404m1.m43809X(bArr);
        for (int i = 0; i < X; i++) {
            byte Q = C11404m1.m43808Q(bArr, i);
            if (!lVar.invoke(C11400l1.m43782g(Q)).booleanValue()) {
                c.add(C11400l1.m43782g(Q));
            }
        }
        return c;
    }

    /* JADX WARNING: type inference failed for: r7v0, types: [kotlin.jvm.functions.q, java.lang.Object, kotlin.jvm.functions.q<? super java.lang.Integer, ? super R, ? super kotlin.p1, ? extends R>] */
    /* JADX WARNING: Unknown variable types count: 1 */
    @kotlin.C11531s
    @kotlin.internal.C11110f
    @kotlin.C11665v0(version = "1.3")
    /* renamed from: N3 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final <R> R m41723N3(int[] r5, R r6, kotlin.jvm.functions.C11305q<? super java.lang.Integer, ? super R, ? super kotlin.C11419p1, ? extends R> r7) {
        /*
            java.lang.String r0 = "$this$foldIndexed"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
            java.lang.String r0 = "operation"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r0)
            int r0 = kotlin.C11431q1.m44045X(r5)
            r1 = 0
            r2 = r1
        L_0x0010:
            if (r1 >= r0) goto L_0x0028
            int r3 = kotlin.C11431q1.m44044Q(r5, r1)
            int r4 = r2 + 1
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            kotlin.p1 r3 = kotlin.C11419p1.m43993g(r3)
            java.lang.Object r6 = r7.invoke(r2, r6, r3)
            int r1 = r1 + 1
            r2 = r4
            goto L_0x0010
        L_0x0028:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.collections.unsigned.UArraysKt___UArraysKt.m41723N3(int[], java.lang.Object, kotlin.jvm.functions.q):java.lang.Object");
    }

    @C11531s
    @C11110f
    @C11665v0(version = "1.3")
    /* renamed from: N4 */
    public static final <K, V, M extends Map<? super K, List<V>>> M m41724N4(long[] jArr, M m, C11300l<? super C11588t1, ? extends K> lVar, C11300l<? super C11588t1, ? extends V> lVar2) {
        Intrinsics.checkNotNullParameter(jArr, "$this$groupByTo");
        Intrinsics.checkNotNullParameter(m, FirebaseAnalytics.C32532b.f78977z);
        Intrinsics.checkNotNullParameter(lVar, "keySelector");
        Intrinsics.checkNotNullParameter(lVar2, "valueTransform");
        int X = C11662u1.m45751X(jArr);
        for (int i = 0; i < X; i++) {
            long Q = C11662u1.m45750Q(jArr, i);
            Object invoke = lVar.invoke(C11588t1.m44992g(Q));
            Object obj = m.get(invoke);
            if (obj == null) {
                obj = new ArrayList();
                m.put(invoke, obj);
            }
            ((List) obj).add(lVar2.invoke(C11588t1.m44992g(Q)));
        }
        return m;
    }

    @C11531s
    @C11110f
    @C11665v0(version = "1.3")
    /* renamed from: N5 */
    public static final <R, C extends Collection<? super R>> C m41725N5(byte[] bArr, C c, C11300l<? super C11400l1, ? extends R> lVar) {
        Intrinsics.checkNotNullParameter(bArr, "$this$mapTo");
        Intrinsics.checkNotNullParameter(c, FirebaseAnalytics.C32532b.f78977z);
        Intrinsics.checkNotNullParameter(lVar, "transform");
        int X = C11404m1.m43809X(bArr);
        for (int i = 0; i < X; i++) {
            c.add(lVar.invoke(C11400l1.m43782g(C11404m1.m43808Q(bArr, i))));
        }
        return c;
    }

    @C11531s
    @C12580l
    @C11665v0(version = "1.4")
    /* renamed from: N6 */
    public static final C11588t1 m41726N6(@C12579k long[] jArr, @C12579k Comparator<? super C11588t1> comparator) {
        Intrinsics.checkNotNullParameter(jArr, "$this$maxWithOrNull");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        if (C11662u1.m45755h0(jArr)) {
            return null;
        }
        long Q = C11662u1.m45750Q(jArr, 0);
        C10953k0 H = new C11466l(1, ArraysKt___ArraysKt.m39491We(jArr)).iterator();
        while (H.hasNext()) {
            long Q2 = C11662u1.m45750Q(jArr, H.mo6374c());
            if (comparator.compare(C11588t1.m44992g(Q), C11588t1.m44992g(Q2)) < 0) {
                Q = Q2;
            }
        }
        return C11588t1.m44992g(Q);
    }

    @C11531s
    @C11314h(name = "minOrThrow-U")
    @C11665v0(version = "1.7")
    /* renamed from: N7 */
    public static final short m41727N7(@C12579k short[] sArr) {
        Intrinsics.checkNotNullParameter(sArr, "$this$min");
        if (!C10857a2.m38731h0(sArr)) {
            short Q = C10857a2.m38726Q(sArr, 0);
            C10953k0 H = new C11466l(1, ArraysKt___ArraysKt.m39555Ye(sArr)).iterator();
            while (H.hasNext()) {
                short Q2 = C10857a2.m38726Q(sArr, H.mo6374c());
                if (Intrinsics.compare((int) Q & C11679z1.f28988d, (int) 65535 & Q2) > 0) {
                    Q = Q2;
                }
            }
            return Q;
        }
        throw new NoSuchElementException();
    }

    @C11531s
    @C12580l
    @C11665v0(version = "1.4")
    @C11097g2(markerClass = {C11429q.class})
    /* renamed from: N8 */
    public static final C11679z1 m41728N8(@C12579k short[] sArr, @C12579k Random random) {
        Intrinsics.checkNotNullParameter(sArr, "$this$randomOrNull");
        Intrinsics.checkNotNullParameter(random, BaseOptionModel.f27465E0);
        if (C10857a2.m38731h0(sArr)) {
            return null;
        }
        return C11679z1.m45862g(C10857a2.m38726Q(sArr, random.mo22986m(C10857a2.m38727X(sArr))));
    }

    /* JADX WARNING: type inference failed for: r6v0, types: [java.lang.Object, kotlin.jvm.functions.p<? super R, ? super kotlin.z1, ? extends R>, kotlin.jvm.functions.p] */
    /* JADX WARNING: Unknown variable types count: 1 */
    @kotlin.C11531s
    @kotlin.internal.C11110f
    @kotlin.C11665v0(version = "1.4")
    /* renamed from: N9 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final <R> java.util.List<R> m41729N9(short[] r4, R r5, kotlin.jvm.functions.C11304p<? super R, ? super kotlin.C11679z1, ? extends R> r6) {
        /*
            java.lang.String r0 = "$this$runningFold"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            java.lang.String r0 = "operation"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r0)
            boolean r0 = kotlin.C10857a2.m38731h0(r4)
            if (r0 == 0) goto L_0x0015
            java.util.List r4 = kotlin.collections.C10976s.m41419k(r5)
            return r4
        L_0x0015:
            java.util.ArrayList r0 = new java.util.ArrayList
            int r1 = kotlin.C10857a2.m38727X(r4)
            int r1 = r1 + 1
            r0.<init>(r1)
            r0.add(r5)
            int r1 = kotlin.C10857a2.m38727X(r4)
            r2 = 0
        L_0x0028:
            if (r2 >= r1) goto L_0x003c
            short r3 = kotlin.C10857a2.m38726Q(r4, r2)
            kotlin.z1 r3 = kotlin.C11679z1.m45862g(r3)
            java.lang.Object r5 = r6.invoke(r5, r3)
            r0.add(r5)
            int r2 = r2 + 1
            goto L_0x0028
        L_0x003c:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.collections.unsigned.UArraysKt___UArraysKt.m41729N9(short[], java.lang.Object, kotlin.jvm.functions.p):java.util.List");
    }

    @C11531s
    @C11665v0(version = "1.3")
    @C12579k
    /* renamed from: Na */
    public static final List<C11419p1> m41730Na(@C12579k int[] iArr, @C12579k C11466l lVar) {
        Intrinsics.checkNotNullParameter(iArr, "$this$slice");
        Intrinsics.checkNotNullParameter(lVar, "indices");
        if (lVar.isEmpty()) {
            return CollectionsKt__CollectionsKt.m40441E();
        }
        return C10985b.m42281a(C11431q1.m44054q(C10956m.m41076K1(iArr, lVar.getStart().intValue(), lVar.mo23013q().intValue() + 1)));
    }

    @C11395k(message = "Use sumOf instead.", replaceWith = @C11587t0(expression = "this.sumOf(selector)", imports = {}))
    @C11531s
    @C11398l(warningSince = "1.5")
    @C11110f
    @C11665v0(version = "1.3")
    /* renamed from: Nb */
    public static final int m41731Nb(short[] sArr, C11300l<? super C11679z1, C11419p1> lVar) {
        Intrinsics.checkNotNullParameter(sArr, "$this$sumBy");
        Intrinsics.checkNotNullParameter(lVar, "selector");
        int X = C10857a2.m38727X(sArr);
        int i = 0;
        for (int i2 = 0; i2 < X; i2++) {
            i = C11419p1.m43971M(i + lVar.invoke(C11679z1.m45862g(C10857a2.m38726Q(sArr, i2))).mo22930j2());
        }
        return i;
    }

    @C11531s
    @C11665v0(version = "1.3")
    @C12579k
    /* renamed from: Nc */
    public static final C11679z1[] m41732Nc(@C12579k short[] sArr) {
        Intrinsics.checkNotNullParameter(sArr, "$this$toTypedArray");
        int X = C10857a2.m38727X(sArr);
        C11679z1[] z1VarArr = new C11679z1[X];
        for (int i = 0; i < X; i++) {
            z1VarArr[i] = C11679z1.m45862g(C10857a2.m38726Q(sArr, i));
        }
        return z1VarArr;
    }

    @C11531s
    @C11110f
    @C11665v0(version = "1.3")
    /* renamed from: O0 */
    public static final int m41733O0(int[] iArr) {
        Intrinsics.checkNotNullParameter(iArr, "$this$component5");
        return C11431q1.m44044Q(iArr, 4);
    }

    @C11531s
    @C11665v0(version = "1.3")
    @C12579k
    /* renamed from: O1 */
    public static final List<C11400l1> m41734O1(@C12579k byte[] bArr, int i) {
        boolean z;
        Intrinsics.checkNotNullParameter(bArr, "$this$drop");
        if (i >= 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return m42185uc(bArr, C11479u.m44447u(C11404m1.m43809X(bArr) - i, 0));
        }
        throw new IllegalArgumentException(("Requested element count " + i + " is less than zero.").toString());
    }

    @C11531s
    @C11110f
    @C11665v0(version = "1.3")
    /* renamed from: O2 */
    public static final <C extends Collection<? super C11588t1>> C m41735O2(long[] jArr, C c, C11300l<? super C11588t1, Boolean> lVar) {
        Intrinsics.checkNotNullParameter(jArr, "$this$filterTo");
        Intrinsics.checkNotNullParameter(c, FirebaseAnalytics.C32532b.f78977z);
        Intrinsics.checkNotNullParameter(lVar, "predicate");
        int X = C11662u1.m45751X(jArr);
        for (int i = 0; i < X; i++) {
            long Q = C11662u1.m45750Q(jArr, i);
            if (lVar.invoke(C11588t1.m44992g(Q)).booleanValue()) {
                c.add(C11588t1.m44992g(Q));
            }
        }
        return c;
    }

    /* JADX WARNING: type inference failed for: r6v0, types: [java.lang.Object, kotlin.jvm.functions.p<? super kotlin.t1, ? super R, ? extends R>, kotlin.jvm.functions.p] */
    /* JADX WARNING: Unknown variable types count: 1 */
    @kotlin.C11531s
    @kotlin.internal.C11110f
    @kotlin.C11665v0(version = "1.3")
    /* renamed from: O3 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final <R> R m41736O3(long[] r4, R r5, kotlin.jvm.functions.C11304p<? super kotlin.C11588t1, ? super R, ? extends R> r6) {
        /*
            java.lang.String r0 = "$this$foldRight"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            java.lang.String r0 = "operation"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r0)
            int r0 = kotlin.collections.ArraysKt___ArraysKt.m39491We(r4)
        L_0x000e:
            if (r0 < 0) goto L_0x0020
            int r1 = r0 + -1
            long r2 = kotlin.C11662u1.m45750Q(r4, r0)
            kotlin.t1 r0 = kotlin.C11588t1.m44992g(r2)
            java.lang.Object r5 = r6.invoke(r0, r5)
            r0 = r1
            goto L_0x000e
        L_0x0020:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.collections.unsigned.UArraysKt___UArraysKt.m41736O3(long[], java.lang.Object, kotlin.jvm.functions.p):java.lang.Object");
    }

    @C11531s
    @C11110f
    @C11665v0(version = "1.3")
    /* renamed from: O4 */
    public static final <K, M extends Map<? super K, List<C11588t1>>> M m41737O4(long[] jArr, M m, C11300l<? super C11588t1, ? extends K> lVar) {
        Intrinsics.checkNotNullParameter(jArr, "$this$groupByTo");
        Intrinsics.checkNotNullParameter(m, FirebaseAnalytics.C32532b.f78977z);
        Intrinsics.checkNotNullParameter(lVar, "keySelector");
        int X = C11662u1.m45751X(jArr);
        for (int i = 0; i < X; i++) {
            long Q = C11662u1.m45750Q(jArr, i);
            Object invoke = lVar.invoke(C11588t1.m44992g(Q));
            Object obj = m.get(invoke);
            if (obj == null) {
                obj = new ArrayList();
                m.put(invoke, obj);
            }
            ((List) obj).add(C11588t1.m44992g(Q));
        }
        return m;
    }

    @C11531s
    @C11110f
    @C11665v0(version = "1.4")
    /* renamed from: O5 */
    public static final <R extends Comparable<? super R>> C11400l1 m41738O5(byte[] bArr, C11300l<? super C11400l1, ? extends R> lVar) {
        Intrinsics.checkNotNullParameter(bArr, "$this$maxByOrNull");
        Intrinsics.checkNotNullParameter(lVar, "selector");
        if (C11404m1.m43813h0(bArr)) {
            return null;
        }
        byte Q = C11404m1.m43808Q(bArr, 0);
        int Re = ArraysKt___ArraysKt.m39331Re(bArr);
        if (Re == 0) {
            return C11400l1.m43782g(Q);
        }
        Comparable comparable = (Comparable) lVar.invoke(C11400l1.m43782g(Q));
        C10953k0 H = new C11466l(1, Re).iterator();
        while (H.hasNext()) {
            byte Q2 = C11404m1.m43808Q(bArr, H.mo6374c());
            Comparable comparable2 = (Comparable) lVar.invoke(C11400l1.m43782g(Q2));
            if (comparable.compareTo(comparable2) < 0) {
                Q = Q2;
                comparable = comparable2;
            }
        }
        return C11400l1.m43782g(Q);
    }

    @C11531s
    @C11314h(name = "maxWithOrThrow-U")
    @C11665v0(version = "1.7")
    /* renamed from: O6 */
    public static final byte m41739O6(@C12579k byte[] bArr, @C12579k Comparator<? super C11400l1> comparator) {
        Intrinsics.checkNotNullParameter(bArr, "$this$maxWith");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        if (!C11404m1.m43813h0(bArr)) {
            byte Q = C11404m1.m43808Q(bArr, 0);
            C10953k0 H = new C11466l(1, ArraysKt___ArraysKt.m39331Re(bArr)).iterator();
            while (H.hasNext()) {
                byte Q2 = C11404m1.m43808Q(bArr, H.mo6374c());
                if (comparator.compare(C11400l1.m43782g(Q), C11400l1.m43782g(Q2)) < 0) {
                    Q = Q2;
                }
            }
            return Q;
        }
        throw new NoSuchElementException();
    }

    @C11531s
    @C12580l
    @C11665v0(version = "1.4")
    /* renamed from: O7 */
    public static final C11400l1 m41740O7(@C12579k byte[] bArr, @C12579k Comparator<? super C11400l1> comparator) {
        Intrinsics.checkNotNullParameter(bArr, "$this$minWithOrNull");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        if (C11404m1.m43813h0(bArr)) {
            return null;
        }
        byte Q = C11404m1.m43808Q(bArr, 0);
        C10953k0 H = new C11466l(1, ArraysKt___ArraysKt.m39331Re(bArr)).iterator();
        while (H.hasNext()) {
            byte Q2 = C11404m1.m43808Q(bArr, H.mo6374c());
            if (comparator.compare(C11400l1.m43782g(Q), C11400l1.m43782g(Q2)) > 0) {
                Q = Q2;
            }
        }
        return C11400l1.m43782g(Q);
    }

    @C11531s
    @C11110f
    @C11665v0(version = "1.3")
    /* renamed from: O8 */
    public static final byte m41741O8(byte[] bArr, C11304p<? super C11400l1, ? super C11400l1, C11400l1> pVar) {
        Intrinsics.checkNotNullParameter(bArr, "$this$reduce");
        Intrinsics.checkNotNullParameter(pVar, "operation");
        if (!C11404m1.m43813h0(bArr)) {
            byte Q = C11404m1.m43808Q(bArr, 0);
            C10953k0 H = new C11466l(1, ArraysKt___ArraysKt.m39331Re(bArr)).iterator();
            while (H.hasNext()) {
                Q = pVar.invoke(C11400l1.m43782g(Q), C11400l1.m43782g(C11404m1.m43808Q(bArr, H.mo6374c()))).mo22897e2();
            }
            return Q;
        }
        throw new UnsupportedOperationException("Empty array can't be reduced.");
    }

    /* JADX WARNING: type inference failed for: r7v0, types: [kotlin.jvm.functions.q, java.lang.Object, kotlin.jvm.functions.q<? super java.lang.Integer, ? super R, ? super kotlin.l1, ? extends R>] */
    /* JADX WARNING: Unknown variable types count: 1 */
    @kotlin.C11531s
    @kotlin.internal.C11110f
    @kotlin.C11665v0(version = "1.4")
    /* renamed from: O9 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final <R> java.util.List<R> m41742O9(byte[] r5, R r6, kotlin.jvm.functions.C11305q<? super java.lang.Integer, ? super R, ? super kotlin.C11400l1, ? extends R> r7) {
        /*
            java.lang.String r0 = "$this$runningFoldIndexed"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
            java.lang.String r0 = "operation"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r0)
            boolean r0 = kotlin.C11404m1.m43813h0(r5)
            if (r0 == 0) goto L_0x0015
            java.util.List r5 = kotlin.collections.C10976s.m41419k(r6)
            return r5
        L_0x0015:
            java.util.ArrayList r0 = new java.util.ArrayList
            int r1 = kotlin.C11404m1.m43809X(r5)
            int r1 = r1 + 1
            r0.<init>(r1)
            r0.add(r6)
            int r1 = kotlin.C11404m1.m43809X(r5)
            r2 = 0
        L_0x0028:
            if (r2 >= r1) goto L_0x0040
            java.lang.Integer r3 = java.lang.Integer.valueOf(r2)
            byte r4 = kotlin.C11404m1.m43808Q(r5, r2)
            kotlin.l1 r4 = kotlin.C11400l1.m43782g(r4)
            java.lang.Object r6 = r7.invoke(r3, r6, r4)
            r0.add(r6)
            int r2 = r2 + 1
            goto L_0x0028
        L_0x0040:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.collections.unsigned.UArraysKt___UArraysKt.m41742O9(byte[], java.lang.Object, kotlin.jvm.functions.q):java.util.List");
    }

    @C11531s
    @C11665v0(version = "1.3")
    @C12579k
    /* renamed from: Oa */
    public static final int[] m41743Oa(@C12579k int[] iArr, @C12579k Collection<Integer> collection) {
        Intrinsics.checkNotNullParameter(iArr, "$this$sliceArray");
        Intrinsics.checkNotNullParameter(collection, "indices");
        return C11431q1.m44054q(ArraysKt___ArraysKt.m38963Fu(iArr, collection));
    }

    @C11395k(message = "Use sumOf instead.", replaceWith = @C11587t0(expression = "this.sumOf(selector)", imports = {}))
    @C11531s
    @C11398l(warningSince = "1.5")
    @C11110f
    @C11665v0(version = "1.3")
    /* renamed from: Ob */
    public static final double m41744Ob(byte[] bArr, C11300l<? super C11400l1, Double> lVar) {
        Intrinsics.checkNotNullParameter(bArr, "$this$sumByDouble");
        Intrinsics.checkNotNullParameter(lVar, "selector");
        int X = C11404m1.m43809X(bArr);
        double d = 0.0d;
        for (int i = 0; i < X; i++) {
            d += lVar.invoke(C11400l1.m43782g(C11404m1.m43808Q(bArr, i))).doubleValue();
        }
        return d;
    }

    @C11531s
    @C11110f
    @C11665v0(version = "1.3")
    /* renamed from: Oc */
    public static final byte[] m41745Oc(byte[] bArr) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        byte[] copyOf = Arrays.copyOf(bArr, bArr.length);
        Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(this, size)");
        return C11404m1.m43818q(copyOf);
    }

    @C11531s
    @C11110f
    @C11665v0(version = "1.3")
    /* renamed from: P0 */
    public static final byte m41746P0(byte[] bArr) {
        Intrinsics.checkNotNullParameter(bArr, "$this$component5");
        return C11404m1.m43808Q(bArr, 4);
    }

    @C11531s
    @C11665v0(version = "1.3")
    @C12579k
    /* renamed from: P1 */
    public static final List<C11679z1> m41747P1(@C12579k short[] sArr, int i) {
        boolean z;
        Intrinsics.checkNotNullParameter(sArr, "$this$drop");
        if (i >= 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return m42199vc(sArr, C11479u.m44447u(C10857a2.m38727X(sArr) - i, 0));
        }
        throw new IllegalArgumentException(("Requested element count " + i + " is less than zero.").toString());
    }

    @C11531s
    @C11110f
    @C11665v0(version = "1.3")
    /* renamed from: P2 */
    public static final <C extends Collection<? super C11679z1>> C m41748P2(short[] sArr, C c, C11300l<? super C11679z1, Boolean> lVar) {
        Intrinsics.checkNotNullParameter(sArr, "$this$filterTo");
        Intrinsics.checkNotNullParameter(c, FirebaseAnalytics.C32532b.f78977z);
        Intrinsics.checkNotNullParameter(lVar, "predicate");
        int X = C10857a2.m38727X(sArr);
        for (int i = 0; i < X; i++) {
            short Q = C10857a2.m38726Q(sArr, i);
            if (lVar.invoke(C11679z1.m45862g(Q)).booleanValue()) {
                c.add(C11679z1.m45862g(Q));
            }
        }
        return c;
    }

    /* JADX WARNING: type inference failed for: r4v0, types: [java.lang.Object, kotlin.jvm.functions.p<? super kotlin.l1, ? super R, ? extends R>, kotlin.jvm.functions.p] */
    /* JADX WARNING: Unknown variable types count: 1 */
    @kotlin.C11531s
    @kotlin.internal.C11110f
    @kotlin.C11665v0(version = "1.3")
    /* renamed from: P3 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final <R> R m41749P3(byte[] r2, R r3, kotlin.jvm.functions.C11304p<? super kotlin.C11400l1, ? super R, ? extends R> r4) {
        /*
            java.lang.String r0 = "$this$foldRight"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            java.lang.String r0 = "operation"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            int r0 = kotlin.collections.ArraysKt___ArraysKt.m39331Re(r2)
        L_0x000e:
            if (r0 < 0) goto L_0x0020
            int r1 = r0 + -1
            byte r0 = kotlin.C11404m1.m43808Q(r2, r0)
            kotlin.l1 r0 = kotlin.C11400l1.m43782g(r0)
            java.lang.Object r3 = r4.invoke(r0, r3)
            r0 = r1
            goto L_0x000e
        L_0x0020:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.collections.unsigned.UArraysKt___UArraysKt.m41749P3(byte[], java.lang.Object, kotlin.jvm.functions.p):java.lang.Object");
    }

    @C11531s
    @C11110f
    @C11665v0(version = "1.3")
    /* renamed from: P4 */
    public static final <K, M extends Map<? super K, List<C11679z1>>> M m41750P4(short[] sArr, M m, C11300l<? super C11679z1, ? extends K> lVar) {
        Intrinsics.checkNotNullParameter(sArr, "$this$groupByTo");
        Intrinsics.checkNotNullParameter(m, FirebaseAnalytics.C32532b.f78977z);
        Intrinsics.checkNotNullParameter(lVar, "keySelector");
        int X = C10857a2.m38727X(sArr);
        for (int i = 0; i < X; i++) {
            short Q = C10857a2.m38726Q(sArr, i);
            Object invoke = lVar.invoke(C11679z1.m45862g(Q));
            Object obj = m.get(invoke);
            if (obj == null) {
                obj = new ArrayList();
                m.put(invoke, obj);
            }
            ((List) obj).add(C11679z1.m45862g(Q));
        }
        return m;
    }

    @C11531s
    @C11110f
    @C11665v0(version = "1.4")
    /* renamed from: P5 */
    public static final <R extends Comparable<? super R>> C11588t1 m41751P5(long[] jArr, C11300l<? super C11588t1, ? extends R> lVar) {
        Intrinsics.checkNotNullParameter(jArr, "$this$maxByOrNull");
        Intrinsics.checkNotNullParameter(lVar, "selector");
        if (C11662u1.m45755h0(jArr)) {
            return null;
        }
        long Q = C11662u1.m45750Q(jArr, 0);
        int We = ArraysKt___ArraysKt.m39491We(jArr);
        if (We == 0) {
            return C11588t1.m44992g(Q);
        }
        Comparable comparable = (Comparable) lVar.invoke(C11588t1.m44992g(Q));
        C10953k0 H = new C11466l(1, We).iterator();
        while (H.hasNext()) {
            long Q2 = C11662u1.m45750Q(jArr, H.mo6374c());
            Comparable comparable2 = (Comparable) lVar.invoke(C11588t1.m44992g(Q2));
            if (comparable.compareTo(comparable2) < 0) {
                Q = Q2;
                comparable = comparable2;
            }
        }
        return C11588t1.m44992g(Q);
    }

    @C11531s
    @C11314h(name = "maxWithOrThrow-U")
    @C11665v0(version = "1.7")
    /* renamed from: P6 */
    public static final int m41752P6(@C12579k int[] iArr, @C12579k Comparator<? super C11419p1> comparator) {
        Intrinsics.checkNotNullParameter(iArr, "$this$maxWith");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        if (!C11431q1.m44049h0(iArr)) {
            int Q = C11431q1.m44044Q(iArr, 0);
            C10953k0 H = new C11466l(1, ArraysKt___ArraysKt.m39459Ve(iArr)).iterator();
            while (H.hasNext()) {
                int Q2 = C11431q1.m44044Q(iArr, H.mo6374c());
                if (comparator.compare(C11419p1.m43993g(Q), C11419p1.m43993g(Q2)) < 0) {
                    Q = Q2;
                }
            }
            return Q;
        }
        throw new NoSuchElementException();
    }

    @C11531s
    @C12580l
    @C11665v0(version = "1.4")
    /* renamed from: P7 */
    public static final C11419p1 m41753P7(@C12579k int[] iArr, @C12579k Comparator<? super C11419p1> comparator) {
        Intrinsics.checkNotNullParameter(iArr, "$this$minWithOrNull");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        if (C11431q1.m44049h0(iArr)) {
            return null;
        }
        int Q = C11431q1.m44044Q(iArr, 0);
        C10953k0 H = new C11466l(1, ArraysKt___ArraysKt.m39459Ve(iArr)).iterator();
        while (H.hasNext()) {
            int Q2 = C11431q1.m44044Q(iArr, H.mo6374c());
            if (comparator.compare(C11419p1.m43993g(Q), C11419p1.m43993g(Q2)) > 0) {
                Q = Q2;
            }
        }
        return C11419p1.m43993g(Q);
    }

    @C11531s
    @C11110f
    @C11665v0(version = "1.3")
    /* renamed from: P8 */
    public static final int m41754P8(int[] iArr, C11304p<? super C11419p1, ? super C11419p1, C11419p1> pVar) {
        Intrinsics.checkNotNullParameter(iArr, "$this$reduce");
        Intrinsics.checkNotNullParameter(pVar, "operation");
        if (!C11431q1.m44049h0(iArr)) {
            int Q = C11431q1.m44044Q(iArr, 0);
            C10953k0 H = new C11466l(1, ArraysKt___ArraysKt.m39459Ve(iArr)).iterator();
            while (H.hasNext()) {
                Q = pVar.invoke(C11419p1.m43993g(Q), C11419p1.m43993g(C11431q1.m44044Q(iArr, H.mo6374c()))).mo22930j2();
            }
            return Q;
        }
        throw new UnsupportedOperationException("Empty array can't be reduced.");
    }

    /* JADX WARNING: type inference failed for: r7v0, types: [kotlin.jvm.functions.q, java.lang.Object, kotlin.jvm.functions.q<? super java.lang.Integer, ? super R, ? super kotlin.z1, ? extends R>] */
    /* JADX WARNING: Unknown variable types count: 1 */
    @kotlin.C11531s
    @kotlin.internal.C11110f
    @kotlin.C11665v0(version = "1.4")
    /* renamed from: P9 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final <R> java.util.List<R> m41755P9(short[] r5, R r6, kotlin.jvm.functions.C11305q<? super java.lang.Integer, ? super R, ? super kotlin.C11679z1, ? extends R> r7) {
        /*
            java.lang.String r0 = "$this$runningFoldIndexed"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
            java.lang.String r0 = "operation"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r0)
            boolean r0 = kotlin.C10857a2.m38731h0(r5)
            if (r0 == 0) goto L_0x0015
            java.util.List r5 = kotlin.collections.C10976s.m41419k(r6)
            return r5
        L_0x0015:
            java.util.ArrayList r0 = new java.util.ArrayList
            int r1 = kotlin.C10857a2.m38727X(r5)
            int r1 = r1 + 1
            r0.<init>(r1)
            r0.add(r6)
            int r1 = kotlin.C10857a2.m38727X(r5)
            r2 = 0
        L_0x0028:
            if (r2 >= r1) goto L_0x0040
            java.lang.Integer r3 = java.lang.Integer.valueOf(r2)
            short r4 = kotlin.C10857a2.m38726Q(r5, r2)
            kotlin.z1 r4 = kotlin.C11679z1.m45862g(r4)
            java.lang.Object r6 = r7.invoke(r3, r6, r4)
            r0.add(r6)
            int r2 = r2 + 1
            goto L_0x0028
        L_0x0040:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.collections.unsigned.UArraysKt___UArraysKt.m41755P9(short[], java.lang.Object, kotlin.jvm.functions.q):java.util.List");
    }

    @C11531s
    @C11665v0(version = "1.3")
    @C12579k
    /* renamed from: Pa */
    public static final short[] m41756Pa(@C12579k short[] sArr, @C12579k C11466l lVar) {
        Intrinsics.checkNotNullParameter(sArr, "$this$sliceArray");
        Intrinsics.checkNotNullParameter(lVar, "indices");
        return C10857a2.m38736q(ArraysKt___ArraysKt.m39187Mu(sArr, lVar));
    }

    @C11395k(message = "Use sumOf instead.", replaceWith = @C11587t0(expression = "this.sumOf(selector)", imports = {}))
    @C11531s
    @C11398l(warningSince = "1.5")
    @C11110f
    @C11665v0(version = "1.3")
    /* renamed from: Pb */
    public static final double m41757Pb(long[] jArr, C11300l<? super C11588t1, Double> lVar) {
        Intrinsics.checkNotNullParameter(jArr, "$this$sumByDouble");
        Intrinsics.checkNotNullParameter(lVar, "selector");
        int X = C11662u1.m45751X(jArr);
        double d = 0.0d;
        for (int i = 0; i < X; i++) {
            d += lVar.invoke(C11588t1.m44992g(C11662u1.m45750Q(jArr, i))).doubleValue();
        }
        return d;
    }

    @C11531s
    @C11665v0(version = "1.3")
    @C12579k
    /* renamed from: Pc */
    public static final byte[] m41758Pc(@C12579k C11400l1[] l1VarArr) {
        Intrinsics.checkNotNullParameter(l1VarArr, "<this>");
        int length = l1VarArr.length;
        byte[] bArr = new byte[length];
        for (int i = 0; i < length; i++) {
            bArr[i] = l1VarArr[i].mo22897e2();
        }
        return C11404m1.m43818q(bArr);
    }

    @C11531s
    @C11110f
    @C11665v0(version = "1.3")
    /* renamed from: Q0 */
    public static final long m41759Q0(long[] jArr) {
        Intrinsics.checkNotNullParameter(jArr, "$this$component5");
        return C11662u1.m45750Q(jArr, 4);
    }

    @C11531s
    @C11665v0(version = "1.3")
    @C12579k
    /* renamed from: Q1 */
    public static final List<C11419p1> m41760Q1(@C12579k int[] iArr, int i) {
        boolean z;
        Intrinsics.checkNotNullParameter(iArr, "$this$drop");
        if (i >= 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return m42213wc(iArr, C11479u.m44447u(C11431q1.m44045X(iArr) - i, 0));
        }
        throw new IllegalArgumentException(("Requested element count " + i + " is less than zero.").toString());
    }

    @C11531s
    @C11110f
    @C11665v0(version = "1.3")
    /* renamed from: Q2 */
    public static final <C extends Collection<? super C11419p1>> C m41761Q2(int[] iArr, C c, C11300l<? super C11419p1, Boolean> lVar) {
        Intrinsics.checkNotNullParameter(iArr, "$this$filterTo");
        Intrinsics.checkNotNullParameter(c, FirebaseAnalytics.C32532b.f78977z);
        Intrinsics.checkNotNullParameter(lVar, "predicate");
        int X = C11431q1.m44045X(iArr);
        for (int i = 0; i < X; i++) {
            int Q = C11431q1.m44044Q(iArr, i);
            if (lVar.invoke(C11419p1.m43993g(Q)).booleanValue()) {
                c.add(C11419p1.m43993g(Q));
            }
        }
        return c;
    }

    /* JADX WARNING: type inference failed for: r4v0, types: [java.lang.Object, kotlin.jvm.functions.p<? super kotlin.p1, ? super R, ? extends R>, kotlin.jvm.functions.p] */
    /* JADX WARNING: Unknown variable types count: 1 */
    @kotlin.C11531s
    @kotlin.internal.C11110f
    @kotlin.C11665v0(version = "1.3")
    /* renamed from: Q3 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final <R> R m41762Q3(int[] r2, R r3, kotlin.jvm.functions.C11304p<? super kotlin.C11419p1, ? super R, ? extends R> r4) {
        /*
            java.lang.String r0 = "$this$foldRight"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            java.lang.String r0 = "operation"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            int r0 = kotlin.collections.ArraysKt___ArraysKt.m39459Ve(r2)
        L_0x000e:
            if (r0 < 0) goto L_0x0020
            int r1 = r0 + -1
            int r0 = kotlin.C11431q1.m44044Q(r2, r0)
            kotlin.p1 r0 = kotlin.C11419p1.m43993g(r0)
            java.lang.Object r3 = r4.invoke(r0, r3)
            r0 = r1
            goto L_0x000e
        L_0x0020:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.collections.unsigned.UArraysKt___UArraysKt.m41762Q3(int[], java.lang.Object, kotlin.jvm.functions.p):java.lang.Object");
    }

    @C11531s
    @C11110f
    @C11665v0(version = "1.3")
    /* renamed from: Q4 */
    public static final <K, V, M extends Map<? super K, List<V>>> M m41763Q4(short[] sArr, M m, C11300l<? super C11679z1, ? extends K> lVar, C11300l<? super C11679z1, ? extends V> lVar2) {
        Intrinsics.checkNotNullParameter(sArr, "$this$groupByTo");
        Intrinsics.checkNotNullParameter(m, FirebaseAnalytics.C32532b.f78977z);
        Intrinsics.checkNotNullParameter(lVar, "keySelector");
        Intrinsics.checkNotNullParameter(lVar2, "valueTransform");
        int X = C10857a2.m38727X(sArr);
        for (int i = 0; i < X; i++) {
            short Q = C10857a2.m38726Q(sArr, i);
            Object invoke = lVar.invoke(C11679z1.m45862g(Q));
            Object obj = m.get(invoke);
            if (obj == null) {
                obj = new ArrayList();
                m.put(invoke, obj);
            }
            ((List) obj).add(lVar2.invoke(C11679z1.m45862g(Q)));
        }
        return m;
    }

    @C11531s
    @C11110f
    @C11665v0(version = "1.4")
    /* renamed from: Q5 */
    public static final <R extends Comparable<? super R>> C11419p1 m41764Q5(int[] iArr, C11300l<? super C11419p1, ? extends R> lVar) {
        Intrinsics.checkNotNullParameter(iArr, "$this$maxByOrNull");
        Intrinsics.checkNotNullParameter(lVar, "selector");
        if (C11431q1.m44049h0(iArr)) {
            return null;
        }
        int Q = C11431q1.m44044Q(iArr, 0);
        int Ve = ArraysKt___ArraysKt.m39459Ve(iArr);
        if (Ve == 0) {
            return C11419p1.m43993g(Q);
        }
        Comparable comparable = (Comparable) lVar.invoke(C11419p1.m43993g(Q));
        C10953k0 H = new C11466l(1, Ve).iterator();
        while (H.hasNext()) {
            int Q2 = C11431q1.m44044Q(iArr, H.mo6374c());
            Comparable comparable2 = (Comparable) lVar.invoke(C11419p1.m43993g(Q2));
            if (comparable.compareTo(comparable2) < 0) {
                Q = Q2;
                comparable = comparable2;
            }
        }
        return C11419p1.m43993g(Q);
    }

    @C11531s
    @C11314h(name = "maxWithOrThrow-U")
    @C11665v0(version = "1.7")
    /* renamed from: Q6 */
    public static final long m41765Q6(@C12579k long[] jArr, @C12579k Comparator<? super C11588t1> comparator) {
        Intrinsics.checkNotNullParameter(jArr, "$this$maxWith");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        if (!C11662u1.m45755h0(jArr)) {
            long Q = C11662u1.m45750Q(jArr, 0);
            C10953k0 H = new C11466l(1, ArraysKt___ArraysKt.m39491We(jArr)).iterator();
            while (H.hasNext()) {
                long Q2 = C11662u1.m45750Q(jArr, H.mo6374c());
                if (comparator.compare(C11588t1.m44992g(Q), C11588t1.m44992g(Q2)) < 0) {
                    Q = Q2;
                }
            }
            return Q;
        }
        throw new NoSuchElementException();
    }

    @C11531s
    @C12580l
    @C11665v0(version = "1.4")
    /* renamed from: Q7 */
    public static final C11679z1 m41766Q7(@C12579k short[] sArr, @C12579k Comparator<? super C11679z1> comparator) {
        Intrinsics.checkNotNullParameter(sArr, "$this$minWithOrNull");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        if (C10857a2.m38731h0(sArr)) {
            return null;
        }
        short Q = C10857a2.m38726Q(sArr, 0);
        C10953k0 H = new C11466l(1, ArraysKt___ArraysKt.m39555Ye(sArr)).iterator();
        while (H.hasNext()) {
            short Q2 = C10857a2.m38726Q(sArr, H.mo6374c());
            if (comparator.compare(C11679z1.m45862g(Q), C11679z1.m45862g(Q2)) > 0) {
                Q = Q2;
            }
        }
        return C11679z1.m45862g(Q);
    }

    @C11531s
    @C11110f
    @C11665v0(version = "1.3")
    /* renamed from: Q8 */
    public static final long m41767Q8(long[] jArr, C11304p<? super C11588t1, ? super C11588t1, C11588t1> pVar) {
        Intrinsics.checkNotNullParameter(jArr, "$this$reduce");
        Intrinsics.checkNotNullParameter(pVar, "operation");
        if (!C11662u1.m45755h0(jArr)) {
            long Q = C11662u1.m45750Q(jArr, 0);
            C10953k0 H = new C11466l(1, ArraysKt___ArraysKt.m39491We(jArr)).iterator();
            while (H.hasNext()) {
                Q = pVar.invoke(C11588t1.m44992g(Q), C11588t1.m44992g(C11662u1.m45750Q(jArr, H.mo6374c()))).mo23301j2();
            }
            return Q;
        }
        throw new UnsupportedOperationException("Empty array can't be reduced.");
    }

    /* JADX WARNING: type inference failed for: r8v0, types: [kotlin.jvm.functions.q, java.lang.Object, kotlin.jvm.functions.q<? super java.lang.Integer, ? super R, ? super kotlin.t1, ? extends R>] */
    /* JADX WARNING: Unknown variable types count: 1 */
    @kotlin.C11531s
    @kotlin.internal.C11110f
    @kotlin.C11665v0(version = "1.4")
    /* renamed from: Q9 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final <R> java.util.List<R> m41768Q9(long[] r6, R r7, kotlin.jvm.functions.C11305q<? super java.lang.Integer, ? super R, ? super kotlin.C11588t1, ? extends R> r8) {
        /*
            java.lang.String r0 = "$this$runningFoldIndexed"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r0)
            java.lang.String r0 = "operation"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r0)
            boolean r0 = kotlin.C11662u1.m45755h0(r6)
            if (r0 == 0) goto L_0x0015
            java.util.List r6 = kotlin.collections.C10976s.m41419k(r7)
            return r6
        L_0x0015:
            java.util.ArrayList r0 = new java.util.ArrayList
            int r1 = kotlin.C11662u1.m45751X(r6)
            int r1 = r1 + 1
            r0.<init>(r1)
            r0.add(r7)
            int r1 = kotlin.C11662u1.m45751X(r6)
            r2 = 0
        L_0x0028:
            if (r2 >= r1) goto L_0x0040
            java.lang.Integer r3 = java.lang.Integer.valueOf(r2)
            long r4 = kotlin.C11662u1.m45750Q(r6, r2)
            kotlin.t1 r4 = kotlin.C11588t1.m44992g(r4)
            java.lang.Object r7 = r8.invoke(r3, r7, r4)
            r0.add(r7)
            int r2 = r2 + 1
            goto L_0x0028
        L_0x0040:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.collections.unsigned.UArraysKt___UArraysKt.m41768Q9(long[], java.lang.Object, kotlin.jvm.functions.q):java.util.List");
    }

    @C11531s
    @C11665v0(version = "1.3")
    @C12579k
    /* renamed from: Qa */
    public static final long[] m41769Qa(@C12579k long[] jArr, @C12579k C11466l lVar) {
        Intrinsics.checkNotNullParameter(jArr, "$this$sliceArray");
        Intrinsics.checkNotNullParameter(lVar, "indices");
        return C11662u1.m45760q(ArraysKt___ArraysKt.m39059Iu(jArr, lVar));
    }

    @C11395k(message = "Use sumOf instead.", replaceWith = @C11587t0(expression = "this.sumOf(selector)", imports = {}))
    @C11531s
    @C11398l(warningSince = "1.5")
    @C11110f
    @C11665v0(version = "1.3")
    /* renamed from: Qb */
    public static final double m41770Qb(int[] iArr, C11300l<? super C11419p1, Double> lVar) {
        Intrinsics.checkNotNullParameter(iArr, "$this$sumByDouble");
        Intrinsics.checkNotNullParameter(lVar, "selector");
        int X = C11431q1.m44045X(iArr);
        double d = 0.0d;
        for (int i = 0; i < X; i++) {
            d += lVar.invoke(C11419p1.m43993g(C11431q1.m44044Q(iArr, i))).doubleValue();
        }
        return d;
    }

    @C11531s
    @C11110f
    @C11665v0(version = "1.3")
    /* renamed from: Qc */
    public static final int[] m41771Qc(int[] iArr) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        int[] copyOf = Arrays.copyOf(iArr, iArr.length);
        Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(this, size)");
        return C11431q1.m44054q(copyOf);
    }

    @C11531s
    @C11110f
    @C11665v0(version = "1.3")
    /* renamed from: R0 */
    public static final short m41772R0(short[] sArr) {
        Intrinsics.checkNotNullParameter(sArr, "$this$component5");
        return C10857a2.m38726Q(sArr, 4);
    }

    @C11531s
    @C11665v0(version = "1.3")
    @C12579k
    /* renamed from: R1 */
    public static final List<C11588t1> m41773R1(@C12579k long[] jArr, int i) {
        boolean z;
        Intrinsics.checkNotNullParameter(jArr, "$this$drop");
        if (i >= 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return m42227xc(jArr, C11479u.m44447u(C11662u1.m45751X(jArr) - i, 0));
        }
        throw new IllegalArgumentException(("Requested element count " + i + " is less than zero.").toString());
    }

    @C11531s
    @C11110f
    @C11665v0(version = "1.3")
    /* renamed from: R2 */
    public static final <C extends Collection<? super C11400l1>> C m41774R2(byte[] bArr, C c, C11300l<? super C11400l1, Boolean> lVar) {
        Intrinsics.checkNotNullParameter(bArr, "$this$filterTo");
        Intrinsics.checkNotNullParameter(c, FirebaseAnalytics.C32532b.f78977z);
        Intrinsics.checkNotNullParameter(lVar, "predicate");
        int X = C11404m1.m43809X(bArr);
        for (int i = 0; i < X; i++) {
            byte Q = C11404m1.m43808Q(bArr, i);
            if (lVar.invoke(C11400l1.m43782g(Q)).booleanValue()) {
                c.add(C11400l1.m43782g(Q));
            }
        }
        return c;
    }

    /* JADX WARNING: type inference failed for: r4v0, types: [java.lang.Object, kotlin.jvm.functions.p<? super kotlin.z1, ? super R, ? extends R>, kotlin.jvm.functions.p] */
    /* JADX WARNING: Unknown variable types count: 1 */
    @kotlin.C11531s
    @kotlin.internal.C11110f
    @kotlin.C11665v0(version = "1.3")
    /* renamed from: R3 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final <R> R m41775R3(short[] r2, R r3, kotlin.jvm.functions.C11304p<? super kotlin.C11679z1, ? super R, ? extends R> r4) {
        /*
            java.lang.String r0 = "$this$foldRight"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            java.lang.String r0 = "operation"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            int r0 = kotlin.collections.ArraysKt___ArraysKt.m39555Ye(r2)
        L_0x000e:
            if (r0 < 0) goto L_0x0020
            int r1 = r0 + -1
            short r0 = kotlin.C10857a2.m38726Q(r2, r0)
            kotlin.z1 r0 = kotlin.C11679z1.m45862g(r0)
            java.lang.Object r3 = r4.invoke(r0, r3)
            r0 = r1
            goto L_0x000e
        L_0x0020:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.collections.unsigned.UArraysKt___UArraysKt.m41775R3(short[], java.lang.Object, kotlin.jvm.functions.p):java.lang.Object");
    }

    @C11531s
    @C11110f
    @C11665v0(version = "1.3")
    /* renamed from: R4 */
    public static final <K, V, M extends Map<? super K, List<V>>> M m41776R4(byte[] bArr, M m, C11300l<? super C11400l1, ? extends K> lVar, C11300l<? super C11400l1, ? extends V> lVar2) {
        Intrinsics.checkNotNullParameter(bArr, "$this$groupByTo");
        Intrinsics.checkNotNullParameter(m, FirebaseAnalytics.C32532b.f78977z);
        Intrinsics.checkNotNullParameter(lVar, "keySelector");
        Intrinsics.checkNotNullParameter(lVar2, "valueTransform");
        int X = C11404m1.m43809X(bArr);
        for (int i = 0; i < X; i++) {
            byte Q = C11404m1.m43808Q(bArr, i);
            Object invoke = lVar.invoke(C11400l1.m43782g(Q));
            Object obj = m.get(invoke);
            if (obj == null) {
                obj = new ArrayList();
                m.put(invoke, obj);
            }
            ((List) obj).add(lVar2.invoke(C11400l1.m43782g(Q)));
        }
        return m;
    }

    @C11531s
    @C11110f
    @C11665v0(version = "1.4")
    /* renamed from: R5 */
    public static final <R extends Comparable<? super R>> C11679z1 m41777R5(short[] sArr, C11300l<? super C11679z1, ? extends R> lVar) {
        Intrinsics.checkNotNullParameter(sArr, "$this$maxByOrNull");
        Intrinsics.checkNotNullParameter(lVar, "selector");
        if (C10857a2.m38731h0(sArr)) {
            return null;
        }
        short Q = C10857a2.m38726Q(sArr, 0);
        int Ye = ArraysKt___ArraysKt.m39555Ye(sArr);
        if (Ye == 0) {
            return C11679z1.m45862g(Q);
        }
        Comparable comparable = (Comparable) lVar.invoke(C11679z1.m45862g(Q));
        C10953k0 H = new C11466l(1, Ye).iterator();
        while (H.hasNext()) {
            short Q2 = C10857a2.m38726Q(sArr, H.mo6374c());
            Comparable comparable2 = (Comparable) lVar.invoke(C11679z1.m45862g(Q2));
            if (comparable.compareTo(comparable2) < 0) {
                Q = Q2;
                comparable = comparable2;
            }
        }
        return C11679z1.m45862g(Q);
    }

    @C11531s
    @C11314h(name = "maxWithOrThrow-U")
    @C11665v0(version = "1.7")
    /* renamed from: R6 */
    public static final short m41778R6(@C12579k short[] sArr, @C12579k Comparator<? super C11679z1> comparator) {
        Intrinsics.checkNotNullParameter(sArr, "$this$maxWith");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        if (!C10857a2.m38731h0(sArr)) {
            short Q = C10857a2.m38726Q(sArr, 0);
            C10953k0 H = new C11466l(1, ArraysKt___ArraysKt.m39555Ye(sArr)).iterator();
            while (H.hasNext()) {
                short Q2 = C10857a2.m38726Q(sArr, H.mo6374c());
                if (comparator.compare(C11679z1.m45862g(Q), C11679z1.m45862g(Q2)) < 0) {
                    Q = Q2;
                }
            }
            return Q;
        }
        throw new NoSuchElementException();
    }

    @C11531s
    @C12580l
    @C11665v0(version = "1.4")
    /* renamed from: R7 */
    public static final C11588t1 m41779R7(@C12579k long[] jArr, @C12579k Comparator<? super C11588t1> comparator) {
        Intrinsics.checkNotNullParameter(jArr, "$this$minWithOrNull");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        if (C11662u1.m45755h0(jArr)) {
            return null;
        }
        long Q = C11662u1.m45750Q(jArr, 0);
        C10953k0 H = new C11466l(1, ArraysKt___ArraysKt.m39491We(jArr)).iterator();
        while (H.hasNext()) {
            long Q2 = C11662u1.m45750Q(jArr, H.mo6374c());
            if (comparator.compare(C11588t1.m44992g(Q), C11588t1.m44992g(Q2)) > 0) {
                Q = Q2;
            }
        }
        return C11588t1.m44992g(Q);
    }

    @C11531s
    @C11110f
    @C11665v0(version = "1.3")
    /* renamed from: R8 */
    public static final short m41780R8(short[] sArr, C11304p<? super C11679z1, ? super C11679z1, C11679z1> pVar) {
        Intrinsics.checkNotNullParameter(sArr, "$this$reduce");
        Intrinsics.checkNotNullParameter(pVar, "operation");
        if (!C10857a2.m38731h0(sArr)) {
            short Q = C10857a2.m38726Q(sArr, 0);
            C10953k0 H = new C11466l(1, ArraysKt___ArraysKt.m39555Ye(sArr)).iterator();
            while (H.hasNext()) {
                Q = pVar.invoke(C11679z1.m45862g(Q), C11679z1.m45862g(C10857a2.m38726Q(sArr, H.mo6374c()))).mo23548e2();
            }
            return Q;
        }
        throw new UnsupportedOperationException("Empty array can't be reduced.");
    }

    /* JADX WARNING: type inference failed for: r7v0, types: [kotlin.jvm.functions.q, java.lang.Object, kotlin.jvm.functions.q<? super java.lang.Integer, ? super R, ? super kotlin.p1, ? extends R>] */
    /* JADX WARNING: Unknown variable types count: 1 */
    @kotlin.C11531s
    @kotlin.internal.C11110f
    @kotlin.C11665v0(version = "1.4")
    /* renamed from: R9 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final <R> java.util.List<R> m41781R9(int[] r5, R r6, kotlin.jvm.functions.C11305q<? super java.lang.Integer, ? super R, ? super kotlin.C11419p1, ? extends R> r7) {
        /*
            java.lang.String r0 = "$this$runningFoldIndexed"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
            java.lang.String r0 = "operation"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r0)
            boolean r0 = kotlin.C11431q1.m44049h0(r5)
            if (r0 == 0) goto L_0x0015
            java.util.List r5 = kotlin.collections.C10976s.m41419k(r6)
            return r5
        L_0x0015:
            java.util.ArrayList r0 = new java.util.ArrayList
            int r1 = kotlin.C11431q1.m44045X(r5)
            int r1 = r1 + 1
            r0.<init>(r1)
            r0.add(r6)
            int r1 = kotlin.C11431q1.m44045X(r5)
            r2 = 0
        L_0x0028:
            if (r2 >= r1) goto L_0x0040
            java.lang.Integer r3 = java.lang.Integer.valueOf(r2)
            int r4 = kotlin.C11431q1.m44044Q(r5, r2)
            kotlin.p1 r4 = kotlin.C11419p1.m43993g(r4)
            java.lang.Object r6 = r7.invoke(r3, r6, r4)
            r0.add(r6)
            int r2 = r2 + 1
            goto L_0x0028
        L_0x0040:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.collections.unsigned.UArraysKt___UArraysKt.m41781R9(int[], java.lang.Object, kotlin.jvm.functions.q):java.util.List");
    }

    @C11531s
    @C11665v0(version = "1.3")
    @C12579k
    /* renamed from: Ra */
    public static final byte[] m41782Ra(@C12579k byte[] bArr, @C12579k C11466l lVar) {
        Intrinsics.checkNotNullParameter(bArr, "$this$sliceArray");
        Intrinsics.checkNotNullParameter(lVar, "indices");
        return C11404m1.m43818q(ArraysKt___ArraysKt.m40388yu(bArr, lVar));
    }

    @C11395k(message = "Use sumOf instead.", replaceWith = @C11587t0(expression = "this.sumOf(selector)", imports = {}))
    @C11531s
    @C11398l(warningSince = "1.5")
    @C11110f
    @C11665v0(version = "1.3")
    /* renamed from: Rb */
    public static final double m41783Rb(short[] sArr, C11300l<? super C11679z1, Double> lVar) {
        Intrinsics.checkNotNullParameter(sArr, "$this$sumByDouble");
        Intrinsics.checkNotNullParameter(lVar, "selector");
        int X = C10857a2.m38727X(sArr);
        double d = 0.0d;
        for (int i = 0; i < X; i++) {
            d += lVar.invoke(C11679z1.m45862g(C10857a2.m38726Q(sArr, i))).doubleValue();
        }
        return d;
    }

    @C11531s
    @C11665v0(version = "1.3")
    @C12579k
    /* renamed from: Rc */
    public static final int[] m41784Rc(@C12579k C11419p1[] p1VarArr) {
        Intrinsics.checkNotNullParameter(p1VarArr, "<this>");
        int length = p1VarArr.length;
        int[] iArr = new int[length];
        for (int i = 0; i < length; i++) {
            iArr[i] = p1VarArr[i].mo22930j2();
        }
        return C11431q1.m44054q(iArr);
    }

    @C11531s
    @C11665v0(version = "1.4")
    /* renamed from: S0 */
    public static final boolean m41785S0(@C12580l short[] sArr, @C12580l short[] sArr2) {
        if (sArr == null) {
            sArr = null;
        }
        if (sArr2 == null) {
            sArr2 = null;
        }
        return Arrays.equals(sArr, sArr2);
    }

    @C11531s
    @C11665v0(version = "1.3")
    @C12579k
    /* renamed from: S1 */
    public static final List<C11400l1> m41786S1(@C12579k byte[] bArr, int i) {
        boolean z;
        Intrinsics.checkNotNullParameter(bArr, "$this$dropLast");
        if (i >= 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return m42129qc(bArr, C11479u.m44447u(C11404m1.m43809X(bArr) - i, 0));
        }
        throw new IllegalArgumentException(("Requested element count " + i + " is less than zero.").toString());
    }

    @C11531s
    @C11110f
    @C11665v0(version = "1.3")
    /* renamed from: S2 */
    public static final C11400l1 m41787S2(byte[] bArr, C11300l<? super C11400l1, Boolean> lVar) {
        Intrinsics.checkNotNullParameter(bArr, "$this$find");
        Intrinsics.checkNotNullParameter(lVar, "predicate");
        int X = C11404m1.m43809X(bArr);
        for (int i = 0; i < X; i++) {
            byte Q = C11404m1.m43808Q(bArr, i);
            if (lVar.invoke(C11400l1.m43782g(Q)).booleanValue()) {
                return C11400l1.m43782g(Q);
            }
        }
        return null;
    }

    /* JADX WARNING: type inference failed for: r5v0, types: [kotlin.jvm.functions.q, java.lang.Object, kotlin.jvm.functions.q<? super java.lang.Integer, ? super kotlin.l1, ? super R, ? extends R>] */
    /* JADX WARNING: Unknown variable types count: 1 */
    @kotlin.C11531s
    @kotlin.internal.C11110f
    @kotlin.C11665v0(version = "1.3")
    /* renamed from: S3 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final <R> R m41788S3(byte[] r3, R r4, kotlin.jvm.functions.C11305q<? super java.lang.Integer, ? super kotlin.C11400l1, ? super R, ? extends R> r5) {
        /*
            java.lang.String r0 = "$this$foldRightIndexed"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            java.lang.String r0 = "operation"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
            int r0 = kotlin.collections.ArraysKt___ArraysKt.m39331Re(r3)
        L_0x000e:
            if (r0 < 0) goto L_0x0023
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            byte r2 = kotlin.C11404m1.m43808Q(r3, r0)
            kotlin.l1 r2 = kotlin.C11400l1.m43782g(r2)
            java.lang.Object r4 = r5.invoke(r1, r2, r4)
            int r0 = r0 + -1
            goto L_0x000e
        L_0x0023:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.collections.unsigned.UArraysKt___UArraysKt.m41788S3(byte[], java.lang.Object, kotlin.jvm.functions.q):java.lang.Object");
    }

    @C11531s
    @C11110f
    @C11665v0(version = "1.3")
    /* renamed from: S4 */
    public static final int m41789S4(long[] jArr, long j) {
        Intrinsics.checkNotNullParameter(jArr, "$this$indexOf");
        return ArraysKt___ArraysKt.m39875ig(jArr, j);
    }

    @C11531s
    @C11110f
    @C11314h(name = "maxByOrThrow-U")
    @C11665v0(version = "1.7")
    /* renamed from: S5 */
    public static final <R extends Comparable<? super R>> byte m41790S5(byte[] bArr, C11300l<? super C11400l1, ? extends R> lVar) {
        Intrinsics.checkNotNullParameter(bArr, "$this$maxBy");
        Intrinsics.checkNotNullParameter(lVar, "selector");
        if (!C11404m1.m43813h0(bArr)) {
            byte Q = C11404m1.m43808Q(bArr, 0);
            int Re = ArraysKt___ArraysKt.m39331Re(bArr);
            if (Re == 0) {
                return Q;
            }
            Comparable comparable = (Comparable) lVar.invoke(C11400l1.m43782g(Q));
            C10953k0 H = new C11466l(1, Re).iterator();
            while (H.hasNext()) {
                byte Q2 = C11404m1.m43808Q(bArr, H.mo6374c());
                Comparable comparable2 = (Comparable) lVar.invoke(C11400l1.m43782g(Q2));
                if (comparable.compareTo(comparable2) < 0) {
                    Q = Q2;
                    comparable = comparable2;
                }
            }
            return Q;
        }
        throw new NoSuchElementException();
    }

    @C11531s
    @C11110f
    @C11665v0(version = "1.4")
    /* renamed from: S6 */
    public static final <R extends Comparable<? super R>> C11400l1 m41791S6(byte[] bArr, C11300l<? super C11400l1, ? extends R> lVar) {
        Intrinsics.checkNotNullParameter(bArr, "$this$minByOrNull");
        Intrinsics.checkNotNullParameter(lVar, "selector");
        if (C11404m1.m43813h0(bArr)) {
            return null;
        }
        byte Q = C11404m1.m43808Q(bArr, 0);
        int Re = ArraysKt___ArraysKt.m39331Re(bArr);
        if (Re == 0) {
            return C11400l1.m43782g(Q);
        }
        Comparable comparable = (Comparable) lVar.invoke(C11400l1.m43782g(Q));
        C10953k0 H = new C11466l(1, Re).iterator();
        while (H.hasNext()) {
            byte Q2 = C11404m1.m43808Q(bArr, H.mo6374c());
            Comparable comparable2 = (Comparable) lVar.invoke(C11400l1.m43782g(Q2));
            if (comparable.compareTo(comparable2) > 0) {
                Q = Q2;
                comparable = comparable2;
            }
        }
        return C11400l1.m43782g(Q);
    }

    @C11531s
    @C11314h(name = "minWithOrThrow-U")
    @C11665v0(version = "1.7")
    /* renamed from: S7 */
    public static final byte m41792S7(@C12579k byte[] bArr, @C12579k Comparator<? super C11400l1> comparator) {
        Intrinsics.checkNotNullParameter(bArr, "$this$minWith");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        if (!C11404m1.m43813h0(bArr)) {
            byte Q = C11404m1.m43808Q(bArr, 0);
            C10953k0 H = new C11466l(1, ArraysKt___ArraysKt.m39331Re(bArr)).iterator();
            while (H.hasNext()) {
                byte Q2 = C11404m1.m43808Q(bArr, H.mo6374c());
                if (comparator.compare(C11400l1.m43782g(Q), C11400l1.m43782g(Q2)) > 0) {
                    Q = Q2;
                }
            }
            return Q;
        }
        throw new NoSuchElementException();
    }

    @C11531s
    @C11110f
    @C11665v0(version = "1.3")
    /* renamed from: S8 */
    public static final int m41793S8(int[] iArr, C11305q<? super Integer, ? super C11419p1, ? super C11419p1, C11419p1> qVar) {
        Intrinsics.checkNotNullParameter(iArr, "$this$reduceIndexed");
        Intrinsics.checkNotNullParameter(qVar, "operation");
        if (!C11431q1.m44049h0(iArr)) {
            int Q = C11431q1.m44044Q(iArr, 0);
            C10953k0 H = new C11466l(1, ArraysKt___ArraysKt.m39459Ve(iArr)).iterator();
            while (H.hasNext()) {
                int c = H.mo6374c();
                Q = qVar.invoke(Integer.valueOf(c), C11419p1.m43993g(Q), C11419p1.m43993g(C11431q1.m44044Q(iArr, c))).mo22930j2();
            }
            return Q;
        }
        throw new UnsupportedOperationException("Empty array can't be reduced.");
    }

    @C11531s
    @C11110f
    @C11665v0(version = "1.4")
    /* renamed from: S9 */
    public static final List<C11400l1> m41794S9(byte[] bArr, C11304p<? super C11400l1, ? super C11400l1, C11400l1> pVar) {
        Intrinsics.checkNotNullParameter(bArr, "$this$runningReduce");
        Intrinsics.checkNotNullParameter(pVar, "operation");
        if (C11404m1.m43813h0(bArr)) {
            return CollectionsKt__CollectionsKt.m40441E();
        }
        byte Q = C11404m1.m43808Q(bArr, 0);
        ArrayList arrayList = new ArrayList(C11404m1.m43809X(bArr));
        arrayList.add(C11400l1.m43782g(Q));
        int X = C11404m1.m43809X(bArr);
        for (int i = 1; i < X; i++) {
            Q = pVar.invoke(C11400l1.m43782g(Q), C11400l1.m43782g(C11404m1.m43808Q(bArr, i))).mo22897e2();
            arrayList.add(C11400l1.m43782g(Q));
        }
        return arrayList;
    }

    @C11531s
    @C11665v0(version = "1.3")
    @C12579k
    /* renamed from: Sa */
    public static final long[] m41795Sa(@C12579k long[] jArr, @C12579k Collection<Integer> collection) {
        Intrinsics.checkNotNullParameter(jArr, "$this$sliceArray");
        Intrinsics.checkNotNullParameter(collection, "indices");
        return C11662u1.m45760q(ArraysKt___ArraysKt.m39027Hu(jArr, collection));
    }

    @C11531s
    @C11110f
    @C11314h(name = "sumOfDouble")
    @C11665v0(version = "1.4")
    @C11403m0
    /* renamed from: Sb */
    public static final double m41796Sb(byte[] bArr, C11300l<? super C11400l1, Double> lVar) {
        Intrinsics.checkNotNullParameter(bArr, "$this$sumOf");
        Intrinsics.checkNotNullParameter(lVar, "selector");
        int X = C11404m1.m43809X(bArr);
        double d = 0.0d;
        for (int i = 0; i < X; i++) {
            d += lVar.invoke(C11400l1.m43782g(C11404m1.m43808Q(bArr, i))).doubleValue();
        }
        return d;
    }

    @C11531s
    @C11110f
    @C11665v0(version = "1.3")
    /* renamed from: Sc */
    public static final long[] m41797Sc(long[] jArr) {
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        long[] copyOf = Arrays.copyOf(jArr, jArr.length);
        Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(this, size)");
        return C11662u1.m45760q(copyOf);
    }

    @C11531s
    @C11665v0(version = "1.4")
    /* renamed from: T0 */
    public static final boolean m41798T0(@C12580l int[] iArr, @C12580l int[] iArr2) {
        if (iArr == null) {
            iArr = null;
        }
        if (iArr2 == null) {
            iArr2 = null;
        }
        return Arrays.equals(iArr, iArr2);
    }

    @C11531s
    @C11665v0(version = "1.3")
    @C12579k
    /* renamed from: T1 */
    public static final List<C11679z1> m41799T1(@C12579k short[] sArr, int i) {
        boolean z;
        Intrinsics.checkNotNullParameter(sArr, "$this$dropLast");
        if (i >= 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return m42143rc(sArr, C11479u.m44447u(C10857a2.m38727X(sArr) - i, 0));
        }
        throw new IllegalArgumentException(("Requested element count " + i + " is less than zero.").toString());
    }

    @C11531s
    @C11110f
    @C11665v0(version = "1.3")
    /* renamed from: T2 */
    public static final C11588t1 m41800T2(long[] jArr, C11300l<? super C11588t1, Boolean> lVar) {
        Intrinsics.checkNotNullParameter(jArr, "$this$find");
        Intrinsics.checkNotNullParameter(lVar, "predicate");
        int X = C11662u1.m45751X(jArr);
        for (int i = 0; i < X; i++) {
            long Q = C11662u1.m45750Q(jArr, i);
            if (lVar.invoke(C11588t1.m44992g(Q)).booleanValue()) {
                return C11588t1.m44992g(Q);
            }
        }
        return null;
    }

    /* JADX WARNING: type inference failed for: r5v0, types: [kotlin.jvm.functions.q, java.lang.Object, kotlin.jvm.functions.q<? super java.lang.Integer, ? super kotlin.z1, ? super R, ? extends R>] */
    /* JADX WARNING: Unknown variable types count: 1 */
    @kotlin.C11531s
    @kotlin.internal.C11110f
    @kotlin.C11665v0(version = "1.3")
    /* renamed from: T3 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final <R> R m41801T3(short[] r3, R r4, kotlin.jvm.functions.C11305q<? super java.lang.Integer, ? super kotlin.C11679z1, ? super R, ? extends R> r5) {
        /*
            java.lang.String r0 = "$this$foldRightIndexed"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            java.lang.String r0 = "operation"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
            int r0 = kotlin.collections.ArraysKt___ArraysKt.m39555Ye(r3)
        L_0x000e:
            if (r0 < 0) goto L_0x0023
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            short r2 = kotlin.C10857a2.m38726Q(r3, r0)
            kotlin.z1 r2 = kotlin.C11679z1.m45862g(r2)
            java.lang.Object r4 = r5.invoke(r1, r2, r4)
            int r0 = r0 + -1
            goto L_0x000e
        L_0x0023:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.collections.unsigned.UArraysKt___UArraysKt.m41801T3(short[], java.lang.Object, kotlin.jvm.functions.q):java.lang.Object");
    }

    @C11531s
    @C11110f
    @C11665v0(version = "1.3")
    /* renamed from: T4 */
    public static final int m41802T4(short[] sArr, short s) {
        Intrinsics.checkNotNullParameter(sArr, "$this$indexOf");
        return ArraysKt___ArraysKt.m39936kg(sArr, s);
    }

    @C11531s
    @C11110f
    @C11314h(name = "maxByOrThrow-U")
    @C11665v0(version = "1.7")
    /* renamed from: T5 */
    public static final <R extends Comparable<? super R>> int m41803T5(int[] iArr, C11300l<? super C11419p1, ? extends R> lVar) {
        Intrinsics.checkNotNullParameter(iArr, "$this$maxBy");
        Intrinsics.checkNotNullParameter(lVar, "selector");
        if (!C11431q1.m44049h0(iArr)) {
            int Q = C11431q1.m44044Q(iArr, 0);
            int Ve = ArraysKt___ArraysKt.m39459Ve(iArr);
            if (Ve == 0) {
                return Q;
            }
            Comparable comparable = (Comparable) lVar.invoke(C11419p1.m43993g(Q));
            C10953k0 H = new C11466l(1, Ve).iterator();
            while (H.hasNext()) {
                int Q2 = C11431q1.m44044Q(iArr, H.mo6374c());
                Comparable comparable2 = (Comparable) lVar.invoke(C11419p1.m43993g(Q2));
                if (comparable.compareTo(comparable2) < 0) {
                    Q = Q2;
                    comparable = comparable2;
                }
            }
            return Q;
        }
        throw new NoSuchElementException();
    }

    @C11531s
    @C11110f
    @C11665v0(version = "1.4")
    /* renamed from: T6 */
    public static final <R extends Comparable<? super R>> C11588t1 m41804T6(long[] jArr, C11300l<? super C11588t1, ? extends R> lVar) {
        Intrinsics.checkNotNullParameter(jArr, "$this$minByOrNull");
        Intrinsics.checkNotNullParameter(lVar, "selector");
        if (C11662u1.m45755h0(jArr)) {
            return null;
        }
        long Q = C11662u1.m45750Q(jArr, 0);
        int We = ArraysKt___ArraysKt.m39491We(jArr);
        if (We == 0) {
            return C11588t1.m44992g(Q);
        }
        Comparable comparable = (Comparable) lVar.invoke(C11588t1.m44992g(Q));
        C10953k0 H = new C11466l(1, We).iterator();
        while (H.hasNext()) {
            long Q2 = C11662u1.m45750Q(jArr, H.mo6374c());
            Comparable comparable2 = (Comparable) lVar.invoke(C11588t1.m44992g(Q2));
            if (comparable.compareTo(comparable2) > 0) {
                Q = Q2;
                comparable = comparable2;
            }
        }
        return C11588t1.m44992g(Q);
    }

    @C11531s
    @C11314h(name = "minWithOrThrow-U")
    @C11665v0(version = "1.7")
    /* renamed from: T7 */
    public static final int m41805T7(@C12579k int[] iArr, @C12579k Comparator<? super C11419p1> comparator) {
        Intrinsics.checkNotNullParameter(iArr, "$this$minWith");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        if (!C11431q1.m44049h0(iArr)) {
            int Q = C11431q1.m44044Q(iArr, 0);
            C10953k0 H = new C11466l(1, ArraysKt___ArraysKt.m39459Ve(iArr)).iterator();
            while (H.hasNext()) {
                int Q2 = C11431q1.m44044Q(iArr, H.mo6374c());
                if (comparator.compare(C11419p1.m43993g(Q), C11419p1.m43993g(Q2)) > 0) {
                    Q = Q2;
                }
            }
            return Q;
        }
        throw new NoSuchElementException();
    }

    @C11531s
    @C11110f
    @C11665v0(version = "1.3")
    /* renamed from: T8 */
    public static final byte m41806T8(byte[] bArr, C11305q<? super Integer, ? super C11400l1, ? super C11400l1, C11400l1> qVar) {
        Intrinsics.checkNotNullParameter(bArr, "$this$reduceIndexed");
        Intrinsics.checkNotNullParameter(qVar, "operation");
        if (!C11404m1.m43813h0(bArr)) {
            byte Q = C11404m1.m43808Q(bArr, 0);
            C10953k0 H = new C11466l(1, ArraysKt___ArraysKt.m39331Re(bArr)).iterator();
            while (H.hasNext()) {
                int c = H.mo6374c();
                Q = qVar.invoke(Integer.valueOf(c), C11400l1.m43782g(Q), C11400l1.m43782g(C11404m1.m43808Q(bArr, c))).mo22897e2();
            }
            return Q;
        }
        throw new UnsupportedOperationException("Empty array can't be reduced.");
    }

    @C11531s
    @C11110f
    @C11665v0(version = "1.4")
    /* renamed from: T9 */
    public static final List<C11419p1> m41807T9(int[] iArr, C11304p<? super C11419p1, ? super C11419p1, C11419p1> pVar) {
        Intrinsics.checkNotNullParameter(iArr, "$this$runningReduce");
        Intrinsics.checkNotNullParameter(pVar, "operation");
        if (C11431q1.m44049h0(iArr)) {
            return CollectionsKt__CollectionsKt.m40441E();
        }
        int Q = C11431q1.m44044Q(iArr, 0);
        ArrayList arrayList = new ArrayList(C11431q1.m44045X(iArr));
        arrayList.add(C11419p1.m43993g(Q));
        int X = C11431q1.m44045X(iArr);
        for (int i = 1; i < X; i++) {
            Q = pVar.invoke(C11419p1.m43993g(Q), C11419p1.m43993g(C11431q1.m44044Q(iArr, i))).mo22930j2();
            arrayList.add(C11419p1.m43993g(Q));
        }
        return arrayList;
    }

    @C11531s
    @C11665v0(version = "1.3")
    @C12579k
    /* renamed from: Ta */
    public static final short[] m41808Ta(@C12579k short[] sArr, @C12579k Collection<Integer> collection) {
        Intrinsics.checkNotNullParameter(sArr, "$this$sliceArray");
        Intrinsics.checkNotNullParameter(collection, "indices");
        return C10857a2.m38736q(ArraysKt___ArraysKt.m39155Lu(sArr, collection));
    }

    @C11531s
    @C11110f
    @C11314h(name = "sumOfDouble")
    @C11665v0(version = "1.4")
    @C11403m0
    /* renamed from: Tb */
    public static final double m41809Tb(int[] iArr, C11300l<? super C11419p1, Double> lVar) {
        Intrinsics.checkNotNullParameter(iArr, "$this$sumOf");
        Intrinsics.checkNotNullParameter(lVar, "selector");
        int X = C11431q1.m44045X(iArr);
        double d = 0.0d;
        for (int i = 0; i < X; i++) {
            d += lVar.invoke(C11419p1.m43993g(C11431q1.m44044Q(iArr, i))).doubleValue();
        }
        return d;
    }

    @C11531s
    @C11665v0(version = "1.3")
    @C12579k
    /* renamed from: Tc */
    public static final long[] m41810Tc(@C12579k C11588t1[] t1VarArr) {
        Intrinsics.checkNotNullParameter(t1VarArr, "<this>");
        int length = t1VarArr.length;
        long[] jArr = new long[length];
        for (int i = 0; i < length; i++) {
            jArr[i] = t1VarArr[i].mo23301j2();
        }
        return C11662u1.m45760q(jArr);
    }

    @C11395k(message = "Use Kotlin compiler 1.4 to avoid deprecation warning.")
    @C11531s
    @C11398l(hiddenSince = "1.4")
    @C11665v0(version = "1.3")
    /* renamed from: U0 */
    public static final /* synthetic */ boolean m41811U0(int[] iArr, int[] iArr2) {
        Intrinsics.checkNotNullParameter(iArr, "$this$contentEquals");
        Intrinsics.checkNotNullParameter(iArr2, "other");
        return m41798T0(iArr, iArr2);
    }

    @C11531s
    @C11665v0(version = "1.3")
    @C12579k
    /* renamed from: U1 */
    public static final List<C11419p1> m41812U1(@C12579k int[] iArr, int i) {
        boolean z;
        Intrinsics.checkNotNullParameter(iArr, "$this$dropLast");
        if (i >= 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return m42157sc(iArr, C11479u.m44447u(C11431q1.m44045X(iArr) - i, 0));
        }
        throw new IllegalArgumentException(("Requested element count " + i + " is less than zero.").toString());
    }

    @C11531s
    @C11110f
    @C11665v0(version = "1.3")
    /* renamed from: U2 */
    public static final C11419p1 m41813U2(int[] iArr, C11300l<? super C11419p1, Boolean> lVar) {
        Intrinsics.checkNotNullParameter(iArr, "$this$find");
        Intrinsics.checkNotNullParameter(lVar, "predicate");
        int X = C11431q1.m44045X(iArr);
        for (int i = 0; i < X; i++) {
            int Q = C11431q1.m44044Q(iArr, i);
            if (lVar.invoke(C11419p1.m43993g(Q)).booleanValue()) {
                return C11419p1.m43993g(Q);
            }
        }
        return null;
    }

    /* JADX WARNING: type inference failed for: r6v0, types: [kotlin.jvm.functions.q, java.lang.Object, kotlin.jvm.functions.q<? super java.lang.Integer, ? super kotlin.t1, ? super R, ? extends R>] */
    /* JADX WARNING: Unknown variable types count: 1 */
    @kotlin.C11531s
    @kotlin.internal.C11110f
    @kotlin.C11665v0(version = "1.3")
    /* renamed from: U3 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final <R> R m41814U3(long[] r4, R r5, kotlin.jvm.functions.C11305q<? super java.lang.Integer, ? super kotlin.C11588t1, ? super R, ? extends R> r6) {
        /*
            java.lang.String r0 = "$this$foldRightIndexed"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            java.lang.String r0 = "operation"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r0)
            int r0 = kotlin.collections.ArraysKt___ArraysKt.m39491We(r4)
        L_0x000e:
            if (r0 < 0) goto L_0x0023
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            long r2 = kotlin.C11662u1.m45750Q(r4, r0)
            kotlin.t1 r2 = kotlin.C11588t1.m44992g(r2)
            java.lang.Object r5 = r6.invoke(r1, r2, r5)
            int r0 = r0 + -1
            goto L_0x000e
        L_0x0023:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.collections.unsigned.UArraysKt___UArraysKt.m41814U3(long[], java.lang.Object, kotlin.jvm.functions.q):java.lang.Object");
    }

    @C11531s
    @C11110f
    @C11665v0(version = "1.3")
    /* renamed from: U4 */
    public static final int m41815U4(byte[] bArr, byte b) {
        Intrinsics.checkNotNullParameter(bArr, "$this$indexOf");
        return ArraysKt___ArraysKt.m39716dg(bArr, b);
    }

    @C11531s
    @C11110f
    @C11314h(name = "maxByOrThrow-U")
    @C11665v0(version = "1.7")
    /* renamed from: U5 */
    public static final <R extends Comparable<? super R>> long m41816U5(long[] jArr, C11300l<? super C11588t1, ? extends R> lVar) {
        Intrinsics.checkNotNullParameter(jArr, "$this$maxBy");
        Intrinsics.checkNotNullParameter(lVar, "selector");
        if (!C11662u1.m45755h0(jArr)) {
            long Q = C11662u1.m45750Q(jArr, 0);
            int We = ArraysKt___ArraysKt.m39491We(jArr);
            if (We == 0) {
                return Q;
            }
            Comparable comparable = (Comparable) lVar.invoke(C11588t1.m44992g(Q));
            C10953k0 H = new C11466l(1, We).iterator();
            while (H.hasNext()) {
                long Q2 = C11662u1.m45750Q(jArr, H.mo6374c());
                Comparable comparable2 = (Comparable) lVar.invoke(C11588t1.m44992g(Q2));
                if (comparable.compareTo(comparable2) < 0) {
                    Q = Q2;
                    comparable = comparable2;
                }
            }
            return Q;
        }
        throw new NoSuchElementException();
    }

    @C11531s
    @C11110f
    @C11665v0(version = "1.4")
    /* renamed from: U6 */
    public static final <R extends Comparable<? super R>> C11419p1 m41817U6(int[] iArr, C11300l<? super C11419p1, ? extends R> lVar) {
        Intrinsics.checkNotNullParameter(iArr, "$this$minByOrNull");
        Intrinsics.checkNotNullParameter(lVar, "selector");
        if (C11431q1.m44049h0(iArr)) {
            return null;
        }
        int Q = C11431q1.m44044Q(iArr, 0);
        int Ve = ArraysKt___ArraysKt.m39459Ve(iArr);
        if (Ve == 0) {
            return C11419p1.m43993g(Q);
        }
        Comparable comparable = (Comparable) lVar.invoke(C11419p1.m43993g(Q));
        C10953k0 H = new C11466l(1, Ve).iterator();
        while (H.hasNext()) {
            int Q2 = C11431q1.m44044Q(iArr, H.mo6374c());
            Comparable comparable2 = (Comparable) lVar.invoke(C11419p1.m43993g(Q2));
            if (comparable.compareTo(comparable2) > 0) {
                Q = Q2;
                comparable = comparable2;
            }
        }
        return C11419p1.m43993g(Q);
    }

    @C11531s
    @C11314h(name = "minWithOrThrow-U")
    @C11665v0(version = "1.7")
    /* renamed from: U7 */
    public static final long m41818U7(@C12579k long[] jArr, @C12579k Comparator<? super C11588t1> comparator) {
        Intrinsics.checkNotNullParameter(jArr, "$this$minWith");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        if (!C11662u1.m45755h0(jArr)) {
            long Q = C11662u1.m45750Q(jArr, 0);
            C10953k0 H = new C11466l(1, ArraysKt___ArraysKt.m39491We(jArr)).iterator();
            while (H.hasNext()) {
                long Q2 = C11662u1.m45750Q(jArr, H.mo6374c());
                if (comparator.compare(C11588t1.m44992g(Q), C11588t1.m44992g(Q2)) > 0) {
                    Q = Q2;
                }
            }
            return Q;
        }
        throw new NoSuchElementException();
    }

    @C11531s
    @C11110f
    @C11665v0(version = "1.3")
    /* renamed from: U8 */
    public static final short m41819U8(short[] sArr, C11305q<? super Integer, ? super C11679z1, ? super C11679z1, C11679z1> qVar) {
        Intrinsics.checkNotNullParameter(sArr, "$this$reduceIndexed");
        Intrinsics.checkNotNullParameter(qVar, "operation");
        if (!C10857a2.m38731h0(sArr)) {
            short Q = C10857a2.m38726Q(sArr, 0);
            C10953k0 H = new C11466l(1, ArraysKt___ArraysKt.m39555Ye(sArr)).iterator();
            while (H.hasNext()) {
                int c = H.mo6374c();
                Q = qVar.invoke(Integer.valueOf(c), C11679z1.m45862g(Q), C11679z1.m45862g(C10857a2.m38726Q(sArr, c))).mo23548e2();
            }
            return Q;
        }
        throw new UnsupportedOperationException("Empty array can't be reduced.");
    }

    @C11531s
    @C11110f
    @C11665v0(version = "1.4")
    /* renamed from: U9 */
    public static final List<C11588t1> m41820U9(long[] jArr, C11304p<? super C11588t1, ? super C11588t1, C11588t1> pVar) {
        Intrinsics.checkNotNullParameter(jArr, "$this$runningReduce");
        Intrinsics.checkNotNullParameter(pVar, "operation");
        if (C11662u1.m45755h0(jArr)) {
            return CollectionsKt__CollectionsKt.m40441E();
        }
        long Q = C11662u1.m45750Q(jArr, 0);
        ArrayList arrayList = new ArrayList(C11662u1.m45751X(jArr));
        arrayList.add(C11588t1.m44992g(Q));
        int X = C11662u1.m45751X(jArr);
        for (int i = 1; i < X; i++) {
            Q = pVar.invoke(C11588t1.m44992g(Q), C11588t1.m44992g(C11662u1.m45750Q(jArr, i))).mo23301j2();
            arrayList.add(C11588t1.m44992g(Q));
        }
        return arrayList;
    }

    @C11531s
    @C11665v0(version = "1.3")
    @C12579k
    /* renamed from: Ua */
    public static final int[] m41821Ua(@C12579k int[] iArr, @C12579k C11466l lVar) {
        Intrinsics.checkNotNullParameter(iArr, "$this$sliceArray");
        Intrinsics.checkNotNullParameter(lVar, "indices");
        return C11431q1.m44054q(ArraysKt___ArraysKt.m38995Gu(iArr, lVar));
    }

    @C11531s
    @C11110f
    @C11314h(name = "sumOfDouble")
    @C11665v0(version = "1.4")
    @C11403m0
    /* renamed from: Ub */
    public static final double m41822Ub(long[] jArr, C11300l<? super C11588t1, Double> lVar) {
        Intrinsics.checkNotNullParameter(jArr, "$this$sumOf");
        Intrinsics.checkNotNullParameter(lVar, "selector");
        int X = C11662u1.m45751X(jArr);
        double d = 0.0d;
        for (int i = 0; i < X; i++) {
            d += lVar.invoke(C11588t1.m44992g(C11662u1.m45750Q(jArr, i))).doubleValue();
        }
        return d;
    }

    @C11531s
    @C11665v0(version = "1.3")
    @C12579k
    /* renamed from: Uc */
    public static final short[] m41823Uc(@C12579k C11679z1[] z1VarArr) {
        Intrinsics.checkNotNullParameter(z1VarArr, "<this>");
        int length = z1VarArr.length;
        short[] sArr = new short[length];
        for (int i = 0; i < length; i++) {
            sArr[i] = z1VarArr[i].mo23548e2();
        }
        return C10857a2.m38736q(sArr);
    }

    @C11531s
    @C11665v0(version = "1.4")
    /* renamed from: V0 */
    public static final boolean m41824V0(@C12580l byte[] bArr, @C12580l byte[] bArr2) {
        if (bArr == null) {
            bArr = null;
        }
        if (bArr2 == null) {
            bArr2 = null;
        }
        return Arrays.equals(bArr, bArr2);
    }

    @C11531s
    @C11665v0(version = "1.3")
    @C12579k
    /* renamed from: V1 */
    public static final List<C11588t1> m41825V1(@C12579k long[] jArr, int i) {
        boolean z;
        Intrinsics.checkNotNullParameter(jArr, "$this$dropLast");
        if (i >= 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return m42171tc(jArr, C11479u.m44447u(C11662u1.m45751X(jArr) - i, 0));
        }
        throw new IllegalArgumentException(("Requested element count " + i + " is less than zero.").toString());
    }

    @C11531s
    @C11110f
    @C11665v0(version = "1.3")
    /* renamed from: V2 */
    public static final C11679z1 m41826V2(short[] sArr, C11300l<? super C11679z1, Boolean> lVar) {
        Intrinsics.checkNotNullParameter(sArr, "$this$find");
        Intrinsics.checkNotNullParameter(lVar, "predicate");
        int X = C10857a2.m38727X(sArr);
        for (int i = 0; i < X; i++) {
            short Q = C10857a2.m38726Q(sArr, i);
            if (lVar.invoke(C11679z1.m45862g(Q)).booleanValue()) {
                return C11679z1.m45862g(Q);
            }
        }
        return null;
    }

    /* JADX WARNING: type inference failed for: r5v0, types: [kotlin.jvm.functions.q, java.lang.Object, kotlin.jvm.functions.q<? super java.lang.Integer, ? super kotlin.p1, ? super R, ? extends R>] */
    /* JADX WARNING: Unknown variable types count: 1 */
    @kotlin.C11531s
    @kotlin.internal.C11110f
    @kotlin.C11665v0(version = "1.3")
    /* renamed from: V3 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final <R> R m41827V3(int[] r3, R r4, kotlin.jvm.functions.C11305q<? super java.lang.Integer, ? super kotlin.C11419p1, ? super R, ? extends R> r5) {
        /*
            java.lang.String r0 = "$this$foldRightIndexed"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            java.lang.String r0 = "operation"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
            int r0 = kotlin.collections.ArraysKt___ArraysKt.m39459Ve(r3)
        L_0x000e:
            if (r0 < 0) goto L_0x0023
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            int r2 = kotlin.C11431q1.m44044Q(r3, r0)
            kotlin.p1 r2 = kotlin.C11419p1.m43993g(r2)
            java.lang.Object r4 = r5.invoke(r1, r2, r4)
            int r0 = r0 + -1
            goto L_0x000e
        L_0x0023:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.collections.unsigned.UArraysKt___UArraysKt.m41827V3(int[], java.lang.Object, kotlin.jvm.functions.q):java.lang.Object");
    }

    @C11531s
    @C11110f
    @C11665v0(version = "1.3")
    /* renamed from: V4 */
    public static final int m41828V4(int[] iArr, int i) {
        Intrinsics.checkNotNullParameter(iArr, "$this$indexOf");
        return ArraysKt___ArraysKt.m39844hg(iArr, i);
    }

    @C11531s
    @C11110f
    @C11314h(name = "maxByOrThrow-U")
    @C11665v0(version = "1.7")
    /* renamed from: V5 */
    public static final <R extends Comparable<? super R>> short m41829V5(short[] sArr, C11300l<? super C11679z1, ? extends R> lVar) {
        Intrinsics.checkNotNullParameter(sArr, "$this$maxBy");
        Intrinsics.checkNotNullParameter(lVar, "selector");
        if (!C10857a2.m38731h0(sArr)) {
            short Q = C10857a2.m38726Q(sArr, 0);
            int Ye = ArraysKt___ArraysKt.m39555Ye(sArr);
            if (Ye == 0) {
                return Q;
            }
            Comparable comparable = (Comparable) lVar.invoke(C11679z1.m45862g(Q));
            C10953k0 H = new C11466l(1, Ye).iterator();
            while (H.hasNext()) {
                short Q2 = C10857a2.m38726Q(sArr, H.mo6374c());
                Comparable comparable2 = (Comparable) lVar.invoke(C11679z1.m45862g(Q2));
                if (comparable.compareTo(comparable2) < 0) {
                    Q = Q2;
                    comparable = comparable2;
                }
            }
            return Q;
        }
        throw new NoSuchElementException();
    }

    @C11531s
    @C11110f
    @C11665v0(version = "1.4")
    /* renamed from: V6 */
    public static final <R extends Comparable<? super R>> C11679z1 m41830V6(short[] sArr, C11300l<? super C11679z1, ? extends R> lVar) {
        Intrinsics.checkNotNullParameter(sArr, "$this$minByOrNull");
        Intrinsics.checkNotNullParameter(lVar, "selector");
        if (C10857a2.m38731h0(sArr)) {
            return null;
        }
        short Q = C10857a2.m38726Q(sArr, 0);
        int Ye = ArraysKt___ArraysKt.m39555Ye(sArr);
        if (Ye == 0) {
            return C11679z1.m45862g(Q);
        }
        Comparable comparable = (Comparable) lVar.invoke(C11679z1.m45862g(Q));
        C10953k0 H = new C11466l(1, Ye).iterator();
        while (H.hasNext()) {
            short Q2 = C10857a2.m38726Q(sArr, H.mo6374c());
            Comparable comparable2 = (Comparable) lVar.invoke(C11679z1.m45862g(Q2));
            if (comparable.compareTo(comparable2) > 0) {
                Q = Q2;
                comparable = comparable2;
            }
        }
        return C11679z1.m45862g(Q);
    }

    @C11531s
    @C11314h(name = "minWithOrThrow-U")
    @C11665v0(version = "1.7")
    /* renamed from: V7 */
    public static final short m41831V7(@C12579k short[] sArr, @C12579k Comparator<? super C11679z1> comparator) {
        Intrinsics.checkNotNullParameter(sArr, "$this$minWith");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        if (!C10857a2.m38731h0(sArr)) {
            short Q = C10857a2.m38726Q(sArr, 0);
            C10953k0 H = new C11466l(1, ArraysKt___ArraysKt.m39555Ye(sArr)).iterator();
            while (H.hasNext()) {
                short Q2 = C10857a2.m38726Q(sArr, H.mo6374c());
                if (comparator.compare(C11679z1.m45862g(Q), C11679z1.m45862g(Q2)) > 0) {
                    Q = Q2;
                }
            }
            return Q;
        }
        throw new NoSuchElementException();
    }

    @C11531s
    @C11110f
    @C11665v0(version = "1.3")
    /* renamed from: V8 */
    public static final long m41832V8(long[] jArr, C11305q<? super Integer, ? super C11588t1, ? super C11588t1, C11588t1> qVar) {
        Intrinsics.checkNotNullParameter(jArr, "$this$reduceIndexed");
        Intrinsics.checkNotNullParameter(qVar, "operation");
        if (!C11662u1.m45755h0(jArr)) {
            long Q = C11662u1.m45750Q(jArr, 0);
            C10953k0 H = new C11466l(1, ArraysKt___ArraysKt.m39491We(jArr)).iterator();
            while (H.hasNext()) {
                int c = H.mo6374c();
                Q = qVar.invoke(Integer.valueOf(c), C11588t1.m44992g(Q), C11588t1.m44992g(C11662u1.m45750Q(jArr, c))).mo23301j2();
            }
            return Q;
        }
        throw new UnsupportedOperationException("Empty array can't be reduced.");
    }

    @C11531s
    @C11110f
    @C11665v0(version = "1.4")
    /* renamed from: V9 */
    public static final List<C11679z1> m41833V9(short[] sArr, C11304p<? super C11679z1, ? super C11679z1, C11679z1> pVar) {
        Intrinsics.checkNotNullParameter(sArr, "$this$runningReduce");
        Intrinsics.checkNotNullParameter(pVar, "operation");
        if (C10857a2.m38731h0(sArr)) {
            return CollectionsKt__CollectionsKt.m40441E();
        }
        short Q = C10857a2.m38726Q(sArr, 0);
        ArrayList arrayList = new ArrayList(C10857a2.m38727X(sArr));
        arrayList.add(C11679z1.m45862g(Q));
        int X = C10857a2.m38727X(sArr);
        for (int i = 1; i < X; i++) {
            Q = pVar.invoke(C11679z1.m45862g(Q), C11679z1.m45862g(C10857a2.m38726Q(sArr, i))).mo23548e2();
            arrayList.add(C11679z1.m45862g(Q));
        }
        return arrayList;
    }

    @C11531s
    @C11665v0(version = "1.3")
    @C12579k
    /* renamed from: Va */
    public static final byte[] m41834Va(@C12579k byte[] bArr, @C12579k Collection<Integer> collection) {
        Intrinsics.checkNotNullParameter(bArr, "$this$sliceArray");
        Intrinsics.checkNotNullParameter(collection, "indices");
        return C11404m1.m43818q(ArraysKt___ArraysKt.m40356xu(bArr, collection));
    }

    @C11531s
    @C11110f
    @C11314h(name = "sumOfDouble")
    @C11665v0(version = "1.4")
    @C11403m0
    /* renamed from: Vb */
    public static final double m41835Vb(short[] sArr, C11300l<? super C11679z1, Double> lVar) {
        Intrinsics.checkNotNullParameter(sArr, "$this$sumOf");
        Intrinsics.checkNotNullParameter(lVar, "selector");
        int X = C10857a2.m38727X(sArr);
        double d = 0.0d;
        for (int i = 0; i < X; i++) {
            d += lVar.invoke(C11679z1.m45862g(C10857a2.m38726Q(sArr, i))).doubleValue();
        }
        return d;
    }

    @C11531s
    @C11110f
    @C11665v0(version = "1.3")
    /* renamed from: Vc */
    public static final short[] m41836Vc(short[] sArr) {
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        short[] copyOf = Arrays.copyOf(sArr, sArr.length);
        Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(this, size)");
        return C10857a2.m38736q(copyOf);
    }

    @C11531s
    @C11110f
    @C11665v0(version = "1.3")
    /* renamed from: W */
    public static final boolean m41837W(byte[] bArr, C11300l<? super C11400l1, Boolean> lVar) {
        Intrinsics.checkNotNullParameter(bArr, "$this$all");
        Intrinsics.checkNotNullParameter(lVar, "predicate");
        int X = C11404m1.m43809X(bArr);
        for (int i = 0; i < X; i++) {
            if (!lVar.invoke(C11400l1.m43782g(C11404m1.m43808Q(bArr, i))).booleanValue()) {
                return false;
            }
        }
        return true;
    }

    @C11395k(message = "Use Kotlin compiler 1.4 to avoid deprecation warning.")
    @C11531s
    @C11398l(hiddenSince = "1.4")
    @C11665v0(version = "1.3")
    /* renamed from: W0 */
    public static final /* synthetic */ boolean m41838W0(byte[] bArr, byte[] bArr2) {
        Intrinsics.checkNotNullParameter(bArr, "$this$contentEquals");
        Intrinsics.checkNotNullParameter(bArr2, "other");
        return m41824V0(bArr, bArr2);
    }

    @C11531s
    @C11110f
    @C11665v0(version = "1.3")
    /* renamed from: W1 */
    public static final List<C11400l1> m41839W1(byte[] bArr, C11300l<? super C11400l1, Boolean> lVar) {
        Intrinsics.checkNotNullParameter(bArr, "$this$dropLastWhile");
        Intrinsics.checkNotNullParameter(lVar, "predicate");
        for (int Re = ArraysKt___ArraysKt.m39331Re(bArr); -1 < Re; Re--) {
            if (!lVar.invoke(C11400l1.m43782g(C11404m1.m43808Q(bArr, Re))).booleanValue()) {
                return m42129qc(bArr, Re + 1);
            }
        }
        return CollectionsKt__CollectionsKt.m40441E();
    }

    @C11531s
    @C11110f
    @C11665v0(version = "1.3")
    /* renamed from: W2 */
    public static final C11400l1 m41840W2(byte[] bArr, C11300l<? super C11400l1, Boolean> lVar) {
        Intrinsics.checkNotNullParameter(bArr, "$this$findLast");
        Intrinsics.checkNotNullParameter(lVar, "predicate");
        int X = C11404m1.m43809X(bArr) - 1;
        if (X >= 0) {
            while (true) {
                int i = X - 1;
                byte Q = C11404m1.m43808Q(bArr, X);
                if (lVar.invoke(C11400l1.m43782g(Q)).booleanValue()) {
                    return C11400l1.m43782g(Q);
                }
                if (i < 0) {
                    break;
                }
                X = i;
            }
        }
        return null;
    }

    @C11531s
    @C11110f
    @C11665v0(version = "1.3")
    /* renamed from: W3 */
    public static final void m41841W3(byte[] bArr, C11300l<? super C11400l1, C11079d2> lVar) {
        Intrinsics.checkNotNullParameter(bArr, "$this$forEach");
        Intrinsics.checkNotNullParameter(lVar, "action");
        int X = C11404m1.m43809X(bArr);
        for (int i = 0; i < X; i++) {
            lVar.invoke(C11400l1.m43782g(C11404m1.m43808Q(bArr, i)));
        }
    }

    @C11531s
    @C11110f
    @C11665v0(version = "1.3")
    /* renamed from: W4 */
    public static final int m41842W4(byte[] bArr, C11300l<? super C11400l1, Boolean> lVar) {
        Intrinsics.checkNotNullParameter(bArr, "$this$indexOfFirst");
        Intrinsics.checkNotNullParameter(lVar, "predicate");
        int length = bArr.length;
        for (int i = 0; i < length; i++) {
            if (lVar.invoke(C11400l1.m43782g(C11400l1.m43761M(bArr[i]))).booleanValue()) {
                return i;
            }
        }
        return -1;
    }

    @C11531s
    @C11110f
    @C11665v0(version = "1.4")
    @C11403m0
    /* renamed from: W5 */
    public static final double m41843W5(byte[] bArr, C11300l<? super C11400l1, Double> lVar) {
        Intrinsics.checkNotNullParameter(bArr, "$this$maxOf");
        Intrinsics.checkNotNullParameter(lVar, "selector");
        if (!C11404m1.m43813h0(bArr)) {
            double doubleValue = lVar.invoke(C11400l1.m43782g(C11404m1.m43808Q(bArr, 0))).doubleValue();
            C10953k0 H = new C11466l(1, ArraysKt___ArraysKt.m39331Re(bArr)).iterator();
            while (H.hasNext()) {
                doubleValue = Math.max(doubleValue, lVar.invoke(C11400l1.m43782g(C11404m1.m43808Q(bArr, H.mo6374c()))).doubleValue());
            }
            return doubleValue;
        }
        throw new NoSuchElementException();
    }

    @C11531s
    @C11110f
    @C11314h(name = "minByOrThrow-U")
    @C11665v0(version = "1.7")
    /* renamed from: W6 */
    public static final <R extends Comparable<? super R>> byte m41844W6(byte[] bArr, C11300l<? super C11400l1, ? extends R> lVar) {
        Intrinsics.checkNotNullParameter(bArr, "$this$minBy");
        Intrinsics.checkNotNullParameter(lVar, "selector");
        if (!C11404m1.m43813h0(bArr)) {
            byte Q = C11404m1.m43808Q(bArr, 0);
            int Re = ArraysKt___ArraysKt.m39331Re(bArr);
            if (Re == 0) {
                return Q;
            }
            Comparable comparable = (Comparable) lVar.invoke(C11400l1.m43782g(Q));
            C10953k0 H = new C11466l(1, Re).iterator();
            while (H.hasNext()) {
                byte Q2 = C11404m1.m43808Q(bArr, H.mo6374c());
                Comparable comparable2 = (Comparable) lVar.invoke(C11400l1.m43782g(Q2));
                if (comparable.compareTo(comparable2) > 0) {
                    Q = Q2;
                    comparable = comparable2;
                }
            }
            return Q;
        }
        throw new NoSuchElementException();
    }

    @C11531s
    @C11110f
    @C11665v0(version = "1.3")
    /* renamed from: W7 */
    public static final boolean m41845W7(int[] iArr) {
        Intrinsics.checkNotNullParameter(iArr, "$this$none");
        return C11431q1.m44049h0(iArr);
    }

    @C11531s
    @C11110f
    @C11665v0(version = "1.4")
    /* renamed from: W8 */
    public static final C11419p1 m41846W8(int[] iArr, C11305q<? super Integer, ? super C11419p1, ? super C11419p1, C11419p1> qVar) {
        Intrinsics.checkNotNullParameter(iArr, "$this$reduceIndexedOrNull");
        Intrinsics.checkNotNullParameter(qVar, "operation");
        if (C11431q1.m44049h0(iArr)) {
            return null;
        }
        int Q = C11431q1.m44044Q(iArr, 0);
        C10953k0 H = new C11466l(1, ArraysKt___ArraysKt.m39459Ve(iArr)).iterator();
        while (H.hasNext()) {
            int c = H.mo6374c();
            Q = qVar.invoke(Integer.valueOf(c), C11419p1.m43993g(Q), C11419p1.m43993g(C11431q1.m44044Q(iArr, c))).mo22930j2();
        }
        return C11419p1.m43993g(Q);
    }

    @C11531s
    @C11110f
    @C11665v0(version = "1.4")
    /* renamed from: W9 */
    public static final List<C11419p1> m41847W9(int[] iArr, C11305q<? super Integer, ? super C11419p1, ? super C11419p1, C11419p1> qVar) {
        Intrinsics.checkNotNullParameter(iArr, "$this$runningReduceIndexed");
        Intrinsics.checkNotNullParameter(qVar, "operation");
        if (C11431q1.m44049h0(iArr)) {
            return CollectionsKt__CollectionsKt.m40441E();
        }
        int Q = C11431q1.m44044Q(iArr, 0);
        ArrayList arrayList = new ArrayList(C11431q1.m44045X(iArr));
        arrayList.add(C11419p1.m43993g(Q));
        int X = C11431q1.m44045X(iArr);
        for (int i = 1; i < X; i++) {
            Q = qVar.invoke(Integer.valueOf(i), C11419p1.m43993g(Q), C11419p1.m43993g(C11431q1.m44044Q(iArr, i))).mo22930j2();
            arrayList.add(C11419p1.m43993g(Q));
        }
        return arrayList;
    }

    @C11531s
    @C11665v0(version = "1.3")
    /* renamed from: Wa */
    public static final void m41848Wa(@C12579k int[] iArr) {
        Intrinsics.checkNotNullParameter(iArr, "$this$sort");
        if (C11431q1.m44045X(iArr) > 1) {
            C10943h1.m40961l(iArr, 0, C11431q1.m44045X(iArr));
        }
    }

    @C11531s
    @C11110f
    @C11314h(name = "sumOfInt")
    @C11665v0(version = "1.4")
    @C11403m0
    /* renamed from: Wb */
    public static final int m41849Wb(byte[] bArr, C11300l<? super C11400l1, Integer> lVar) {
        Intrinsics.checkNotNullParameter(bArr, "$this$sumOf");
        Intrinsics.checkNotNullParameter(lVar, "selector");
        int X = C11404m1.m43809X(bArr);
        int i = 0;
        for (int i2 = 0; i2 < X; i2++) {
            i += lVar.invoke(C11400l1.m43782g(C11404m1.m43808Q(bArr, i2))).intValue();
        }
        return i;
    }

    @C11531s
    @C11665v0(version = "1.3")
    @C12579k
    /* renamed from: Wc */
    public static final Iterable<C10942h0<C11419p1>> m41850Wc(@C12579k int[] iArr) {
        Intrinsics.checkNotNullParameter(iArr, "$this$withIndex");
        return new C10946i0(new UArraysKt___UArraysKt$withIndex$1(iArr));
    }

    @C11531s
    @C11110f
    @C11665v0(version = "1.3")
    /* renamed from: X */
    public static final boolean m41851X(long[] jArr, C11300l<? super C11588t1, Boolean> lVar) {
        Intrinsics.checkNotNullParameter(jArr, "$this$all");
        Intrinsics.checkNotNullParameter(lVar, "predicate");
        int X = C11662u1.m45751X(jArr);
        for (int i = 0; i < X; i++) {
            if (!lVar.invoke(C11588t1.m44992g(C11662u1.m45750Q(jArr, i))).booleanValue()) {
                return false;
            }
        }
        return true;
    }

    @C11531s
    @C11665v0(version = "1.4")
    /* renamed from: X0 */
    public static final boolean m41852X0(@C12580l long[] jArr, @C12580l long[] jArr2) {
        if (jArr == null) {
            jArr = null;
        }
        if (jArr2 == null) {
            jArr2 = null;
        }
        return Arrays.equals(jArr, jArr2);
    }

    @C11531s
    @C11110f
    @C11665v0(version = "1.3")
    /* renamed from: X1 */
    public static final List<C11588t1> m41853X1(long[] jArr, C11300l<? super C11588t1, Boolean> lVar) {
        Intrinsics.checkNotNullParameter(jArr, "$this$dropLastWhile");
        Intrinsics.checkNotNullParameter(lVar, "predicate");
        for (int We = ArraysKt___ArraysKt.m39491We(jArr); -1 < We; We--) {
            if (!lVar.invoke(C11588t1.m44992g(C11662u1.m45750Q(jArr, We))).booleanValue()) {
                return m42171tc(jArr, We + 1);
            }
        }
        return CollectionsKt__CollectionsKt.m40441E();
    }

    @C11531s
    @C11110f
    @C11665v0(version = "1.3")
    /* renamed from: X2 */
    public static final C11588t1 m41854X2(long[] jArr, C11300l<? super C11588t1, Boolean> lVar) {
        Intrinsics.checkNotNullParameter(jArr, "$this$findLast");
        Intrinsics.checkNotNullParameter(lVar, "predicate");
        int X = C11662u1.m45751X(jArr) - 1;
        if (X >= 0) {
            while (true) {
                int i = X - 1;
                long Q = C11662u1.m45750Q(jArr, X);
                if (lVar.invoke(C11588t1.m44992g(Q)).booleanValue()) {
                    return C11588t1.m44992g(Q);
                }
                if (i < 0) {
                    break;
                }
                X = i;
            }
        }
        return null;
    }

    @C11531s
    @C11110f
    @C11665v0(version = "1.3")
    /* renamed from: X3 */
    public static final void m41855X3(long[] jArr, C11300l<? super C11588t1, C11079d2> lVar) {
        Intrinsics.checkNotNullParameter(jArr, "$this$forEach");
        Intrinsics.checkNotNullParameter(lVar, "action");
        int X = C11662u1.m45751X(jArr);
        for (int i = 0; i < X; i++) {
            lVar.invoke(C11588t1.m44992g(C11662u1.m45750Q(jArr, i)));
        }
    }

    @C11531s
    @C11110f
    @C11665v0(version = "1.3")
    /* renamed from: X4 */
    public static final int m41856X4(long[] jArr, C11300l<? super C11588t1, Boolean> lVar) {
        Intrinsics.checkNotNullParameter(jArr, "$this$indexOfFirst");
        Intrinsics.checkNotNullParameter(lVar, "predicate");
        int length = jArr.length;
        for (int i = 0; i < length; i++) {
            if (lVar.invoke(C11588t1.m44992g(C11588t1.m44970M(jArr[i]))).booleanValue()) {
                return i;
            }
        }
        return -1;
    }

    @C11531s
    @C11110f
    @C11665v0(version = "1.4")
    @C11403m0
    /* renamed from: X5 */
    public static final float m41857X5(byte[] bArr, C11300l<? super C11400l1, Float> lVar) {
        Intrinsics.checkNotNullParameter(bArr, "$this$maxOf");
        Intrinsics.checkNotNullParameter(lVar, "selector");
        if (!C11404m1.m43813h0(bArr)) {
            float floatValue = lVar.invoke(C11400l1.m43782g(C11404m1.m43808Q(bArr, 0))).floatValue();
            C10953k0 H = new C11466l(1, ArraysKt___ArraysKt.m39331Re(bArr)).iterator();
            while (H.hasNext()) {
                floatValue = Math.max(floatValue, lVar.invoke(C11400l1.m43782g(C11404m1.m43808Q(bArr, H.mo6374c()))).floatValue());
            }
            return floatValue;
        }
        throw new NoSuchElementException();
    }

    @C11531s
    @C11110f
    @C11314h(name = "minByOrThrow-U")
    @C11665v0(version = "1.7")
    /* renamed from: X6 */
    public static final <R extends Comparable<? super R>> int m41858X6(int[] iArr, C11300l<? super C11419p1, ? extends R> lVar) {
        Intrinsics.checkNotNullParameter(iArr, "$this$minBy");
        Intrinsics.checkNotNullParameter(lVar, "selector");
        if (!C11431q1.m44049h0(iArr)) {
            int Q = C11431q1.m44044Q(iArr, 0);
            int Ve = ArraysKt___ArraysKt.m39459Ve(iArr);
            if (Ve == 0) {
                return Q;
            }
            Comparable comparable = (Comparable) lVar.invoke(C11419p1.m43993g(Q));
            C10953k0 H = new C11466l(1, Ve).iterator();
            while (H.hasNext()) {
                int Q2 = C11431q1.m44044Q(iArr, H.mo6374c());
                Comparable comparable2 = (Comparable) lVar.invoke(C11419p1.m43993g(Q2));
                if (comparable.compareTo(comparable2) > 0) {
                    Q = Q2;
                    comparable = comparable2;
                }
            }
            return Q;
        }
        throw new NoSuchElementException();
    }

    @C11531s
    @C11110f
    @C11665v0(version = "1.3")
    /* renamed from: X7 */
    public static final boolean m41859X7(byte[] bArr) {
        Intrinsics.checkNotNullParameter(bArr, "$this$none");
        return C11404m1.m43813h0(bArr);
    }

    @C11531s
    @C11110f
    @C11665v0(version = "1.4")
    /* renamed from: X8 */
    public static final C11400l1 m41860X8(byte[] bArr, C11305q<? super Integer, ? super C11400l1, ? super C11400l1, C11400l1> qVar) {
        Intrinsics.checkNotNullParameter(bArr, "$this$reduceIndexedOrNull");
        Intrinsics.checkNotNullParameter(qVar, "operation");
        if (C11404m1.m43813h0(bArr)) {
            return null;
        }
        byte Q = C11404m1.m43808Q(bArr, 0);
        C10953k0 H = new C11466l(1, ArraysKt___ArraysKt.m39331Re(bArr)).iterator();
        while (H.hasNext()) {
            int c = H.mo6374c();
            Q = qVar.invoke(Integer.valueOf(c), C11400l1.m43782g(Q), C11400l1.m43782g(C11404m1.m43808Q(bArr, c))).mo22897e2();
        }
        return C11400l1.m43782g(Q);
    }

    @C11531s
    @C11110f
    @C11665v0(version = "1.4")
    /* renamed from: X9 */
    public static final List<C11400l1> m41861X9(byte[] bArr, C11305q<? super Integer, ? super C11400l1, ? super C11400l1, C11400l1> qVar) {
        Intrinsics.checkNotNullParameter(bArr, "$this$runningReduceIndexed");
        Intrinsics.checkNotNullParameter(qVar, "operation");
        if (C11404m1.m43813h0(bArr)) {
            return CollectionsKt__CollectionsKt.m40441E();
        }
        byte Q = C11404m1.m43808Q(bArr, 0);
        ArrayList arrayList = new ArrayList(C11404m1.m43809X(bArr));
        arrayList.add(C11400l1.m43782g(Q));
        int X = C11404m1.m43809X(bArr);
        for (int i = 1; i < X; i++) {
            Q = qVar.invoke(Integer.valueOf(i), C11400l1.m43782g(Q), C11400l1.m43782g(C11404m1.m43808Q(bArr, i))).mo22897e2();
            arrayList.add(C11400l1.m43782g(Q));
        }
        return arrayList;
    }

    @C11531s
    @C11665v0(version = "1.4")
    /* renamed from: Xa */
    public static final void m41862Xa(@C12579k long[] jArr, int i, int i2) {
        Intrinsics.checkNotNullParameter(jArr, "$this$sort");
        C10904b.f28138a.mo22058d(i, i2, C11662u1.m45751X(jArr));
        C10943h1.m40958i(jArr, i, i2);
    }

    @C11531s
    @C11110f
    @C11314h(name = "sumOfInt")
    @C11665v0(version = "1.4")
    @C11403m0
    /* renamed from: Xb */
    public static final int m41863Xb(int[] iArr, C11300l<? super C11419p1, Integer> lVar) {
        Intrinsics.checkNotNullParameter(iArr, "$this$sumOf");
        Intrinsics.checkNotNullParameter(lVar, "selector");
        int X = C11431q1.m44045X(iArr);
        int i = 0;
        for (int i2 = 0; i2 < X; i2++) {
            i += lVar.invoke(C11419p1.m43993g(C11431q1.m44044Q(iArr, i2))).intValue();
        }
        return i;
    }

    @C11531s
    @C11665v0(version = "1.3")
    @C12579k
    /* renamed from: Xc */
    public static final Iterable<C10942h0<C11400l1>> m41864Xc(@C12579k byte[] bArr) {
        Intrinsics.checkNotNullParameter(bArr, "$this$withIndex");
        return new C10946i0(new UArraysKt___UArraysKt$withIndex$3(bArr));
    }

    @C11531s
    @C11110f
    @C11665v0(version = "1.3")
    /* renamed from: Y */
    public static final boolean m41865Y(int[] iArr, C11300l<? super C11419p1, Boolean> lVar) {
        Intrinsics.checkNotNullParameter(iArr, "$this$all");
        Intrinsics.checkNotNullParameter(lVar, "predicate");
        int X = C11431q1.m44045X(iArr);
        for (int i = 0; i < X; i++) {
            if (!lVar.invoke(C11419p1.m43993g(C11431q1.m44044Q(iArr, i))).booleanValue()) {
                return false;
            }
        }
        return true;
    }

    @C11395k(message = "Use Kotlin compiler 1.4 to avoid deprecation warning.")
    @C11531s
    @C11398l(hiddenSince = "1.4")
    @C11665v0(version = "1.3")
    /* renamed from: Y0 */
    public static final /* synthetic */ boolean m41866Y0(short[] sArr, short[] sArr2) {
        Intrinsics.checkNotNullParameter(sArr, "$this$contentEquals");
        Intrinsics.checkNotNullParameter(sArr2, "other");
        return m41785S0(sArr, sArr2);
    }

    @C11531s
    @C11110f
    @C11665v0(version = "1.3")
    /* renamed from: Y1 */
    public static final List<C11419p1> m41867Y1(int[] iArr, C11300l<? super C11419p1, Boolean> lVar) {
        Intrinsics.checkNotNullParameter(iArr, "$this$dropLastWhile");
        Intrinsics.checkNotNullParameter(lVar, "predicate");
        for (int Ve = ArraysKt___ArraysKt.m39459Ve(iArr); -1 < Ve; Ve--) {
            if (!lVar.invoke(C11419p1.m43993g(C11431q1.m44044Q(iArr, Ve))).booleanValue()) {
                return m42157sc(iArr, Ve + 1);
            }
        }
        return CollectionsKt__CollectionsKt.m40441E();
    }

    @C11531s
    @C11110f
    @C11665v0(version = "1.3")
    /* renamed from: Y2 */
    public static final C11419p1 m41868Y2(int[] iArr, C11300l<? super C11419p1, Boolean> lVar) {
        Intrinsics.checkNotNullParameter(iArr, "$this$findLast");
        Intrinsics.checkNotNullParameter(lVar, "predicate");
        int X = C11431q1.m44045X(iArr) - 1;
        if (X >= 0) {
            while (true) {
                int i = X - 1;
                int Q = C11431q1.m44044Q(iArr, X);
                if (lVar.invoke(C11419p1.m43993g(Q)).booleanValue()) {
                    return C11419p1.m43993g(Q);
                }
                if (i < 0) {
                    break;
                }
                X = i;
            }
        }
        return null;
    }

    @C11531s
    @C11110f
    @C11665v0(version = "1.3")
    /* renamed from: Y3 */
    public static final void m41869Y3(int[] iArr, C11300l<? super C11419p1, C11079d2> lVar) {
        Intrinsics.checkNotNullParameter(iArr, "$this$forEach");
        Intrinsics.checkNotNullParameter(lVar, "action");
        int X = C11431q1.m44045X(iArr);
        for (int i = 0; i < X; i++) {
            lVar.invoke(C11419p1.m43993g(C11431q1.m44044Q(iArr, i)));
        }
    }

    @C11531s
    @C11110f
    @C11665v0(version = "1.3")
    /* renamed from: Y4 */
    public static final int m41870Y4(int[] iArr, C11300l<? super C11419p1, Boolean> lVar) {
        Intrinsics.checkNotNullParameter(iArr, "$this$indexOfFirst");
        Intrinsics.checkNotNullParameter(lVar, "predicate");
        int length = iArr.length;
        for (int i = 0; i < length; i++) {
            if (lVar.invoke(C11419p1.m43993g(C11419p1.m43971M(iArr[i]))).booleanValue()) {
                return i;
            }
        }
        return -1;
    }

    @C11531s
    @C11110f
    @C11665v0(version = "1.4")
    @C11403m0
    /* renamed from: Y5 */
    public static final <R extends Comparable<? super R>> R m41871Y5(byte[] bArr, C11300l<? super C11400l1, ? extends R> lVar) {
        Intrinsics.checkNotNullParameter(bArr, "$this$maxOf");
        Intrinsics.checkNotNullParameter(lVar, "selector");
        if (!C11404m1.m43813h0(bArr)) {
            R r = (Comparable) lVar.invoke(C11400l1.m43782g(C11404m1.m43808Q(bArr, 0)));
            C10953k0 H = new C11466l(1, ArraysKt___ArraysKt.m39331Re(bArr)).iterator();
            while (H.hasNext()) {
                R r2 = (Comparable) lVar.invoke(C11400l1.m43782g(C11404m1.m43808Q(bArr, H.mo6374c())));
                if (r.compareTo(r2) < 0) {
                    r = r2;
                }
            }
            return r;
        }
        throw new NoSuchElementException();
    }

    @C11531s
    @C11110f
    @C11314h(name = "minByOrThrow-U")
    @C11665v0(version = "1.7")
    /* renamed from: Y6 */
    public static final <R extends Comparable<? super R>> long m41872Y6(long[] jArr, C11300l<? super C11588t1, ? extends R> lVar) {
        Intrinsics.checkNotNullParameter(jArr, "$this$minBy");
        Intrinsics.checkNotNullParameter(lVar, "selector");
        if (!C11662u1.m45755h0(jArr)) {
            long Q = C11662u1.m45750Q(jArr, 0);
            int We = ArraysKt___ArraysKt.m39491We(jArr);
            if (We == 0) {
                return Q;
            }
            Comparable comparable = (Comparable) lVar.invoke(C11588t1.m44992g(Q));
            C10953k0 H = new C11466l(1, We).iterator();
            while (H.hasNext()) {
                long Q2 = C11662u1.m45750Q(jArr, H.mo6374c());
                Comparable comparable2 = (Comparable) lVar.invoke(C11588t1.m44992g(Q2));
                if (comparable.compareTo(comparable2) > 0) {
                    Q = Q2;
                    comparable = comparable2;
                }
            }
            return Q;
        }
        throw new NoSuchElementException();
    }

    @C11531s
    @C11110f
    @C11665v0(version = "1.3")
    /* renamed from: Y7 */
    public static final boolean m41873Y7(byte[] bArr, C11300l<? super C11400l1, Boolean> lVar) {
        Intrinsics.checkNotNullParameter(bArr, "$this$none");
        Intrinsics.checkNotNullParameter(lVar, "predicate");
        int X = C11404m1.m43809X(bArr);
        for (int i = 0; i < X; i++) {
            if (lVar.invoke(C11400l1.m43782g(C11404m1.m43808Q(bArr, i))).booleanValue()) {
                return false;
            }
        }
        return true;
    }

    @C11531s
    @C11110f
    @C11665v0(version = "1.4")
    /* renamed from: Y8 */
    public static final C11679z1 m41874Y8(short[] sArr, C11305q<? super Integer, ? super C11679z1, ? super C11679z1, C11679z1> qVar) {
        Intrinsics.checkNotNullParameter(sArr, "$this$reduceIndexedOrNull");
        Intrinsics.checkNotNullParameter(qVar, "operation");
        if (C10857a2.m38731h0(sArr)) {
            return null;
        }
        short Q = C10857a2.m38726Q(sArr, 0);
        C10953k0 H = new C11466l(1, ArraysKt___ArraysKt.m39555Ye(sArr)).iterator();
        while (H.hasNext()) {
            int c = H.mo6374c();
            Q = qVar.invoke(Integer.valueOf(c), C11679z1.m45862g(Q), C11679z1.m45862g(C10857a2.m38726Q(sArr, c))).mo23548e2();
        }
        return C11679z1.m45862g(Q);
    }

    @C11531s
    @C11110f
    @C11665v0(version = "1.4")
    /* renamed from: Y9 */
    public static final List<C11679z1> m41875Y9(short[] sArr, C11305q<? super Integer, ? super C11679z1, ? super C11679z1, C11679z1> qVar) {
        Intrinsics.checkNotNullParameter(sArr, "$this$runningReduceIndexed");
        Intrinsics.checkNotNullParameter(qVar, "operation");
        if (C10857a2.m38731h0(sArr)) {
            return CollectionsKt__CollectionsKt.m40441E();
        }
        short Q = C10857a2.m38726Q(sArr, 0);
        ArrayList arrayList = new ArrayList(C10857a2.m38727X(sArr));
        arrayList.add(C11679z1.m45862g(Q));
        int X = C10857a2.m38727X(sArr);
        for (int i = 1; i < X; i++) {
            Q = qVar.invoke(Integer.valueOf(i), C11679z1.m45862g(Q), C11679z1.m45862g(C10857a2.m38726Q(sArr, i))).mo23548e2();
            arrayList.add(C11679z1.m45862g(Q));
        }
        return arrayList;
    }

    /* renamed from: Ya */
    public static /* synthetic */ void m41876Ya(long[] jArr, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = 0;
        }
        if ((i3 & 2) != 0) {
            i2 = C11662u1.m45751X(jArr);
        }
        m41862Xa(jArr, i, i2);
    }

    @C11531s
    @C11110f
    @C11314h(name = "sumOfInt")
    @C11665v0(version = "1.4")
    @C11403m0
    /* renamed from: Yb */
    public static final int m41877Yb(long[] jArr, C11300l<? super C11588t1, Integer> lVar) {
        Intrinsics.checkNotNullParameter(jArr, "$this$sumOf");
        Intrinsics.checkNotNullParameter(lVar, "selector");
        int X = C11662u1.m45751X(jArr);
        int i = 0;
        for (int i2 = 0; i2 < X; i2++) {
            i += lVar.invoke(C11588t1.m44992g(C11662u1.m45750Q(jArr, i2))).intValue();
        }
        return i;
    }

    @C11531s
    @C11665v0(version = "1.3")
    @C12579k
    /* renamed from: Yc */
    public static final Iterable<C10942h0<C11588t1>> m41878Yc(@C12579k long[] jArr) {
        Intrinsics.checkNotNullParameter(jArr, "$this$withIndex");
        return new C10946i0(new UArraysKt___UArraysKt$withIndex$2(jArr));
    }

    @C11531s
    @C11110f
    @C11665v0(version = "1.3")
    /* renamed from: Z */
    public static final boolean m41879Z(short[] sArr, C11300l<? super C11679z1, Boolean> lVar) {
        Intrinsics.checkNotNullParameter(sArr, "$this$all");
        Intrinsics.checkNotNullParameter(lVar, "predicate");
        int X = C10857a2.m38727X(sArr);
        for (int i = 0; i < X; i++) {
            if (!lVar.invoke(C11679z1.m45862g(C10857a2.m38726Q(sArr, i))).booleanValue()) {
                return false;
            }
        }
        return true;
    }

    @C11395k(message = "Use Kotlin compiler 1.4 to avoid deprecation warning.")
    @C11531s
    @C11398l(hiddenSince = "1.4")
    @C11665v0(version = "1.3")
    /* renamed from: Z0 */
    public static final /* synthetic */ boolean m41880Z0(long[] jArr, long[] jArr2) {
        Intrinsics.checkNotNullParameter(jArr, "$this$contentEquals");
        Intrinsics.checkNotNullParameter(jArr2, "other");
        return m41852X0(jArr, jArr2);
    }

    @C11531s
    @C11110f
    @C11665v0(version = "1.3")
    /* renamed from: Z1 */
    public static final List<C11679z1> m41881Z1(short[] sArr, C11300l<? super C11679z1, Boolean> lVar) {
        Intrinsics.checkNotNullParameter(sArr, "$this$dropLastWhile");
        Intrinsics.checkNotNullParameter(lVar, "predicate");
        for (int Ye = ArraysKt___ArraysKt.m39555Ye(sArr); -1 < Ye; Ye--) {
            if (!lVar.invoke(C11679z1.m45862g(C10857a2.m38726Q(sArr, Ye))).booleanValue()) {
                return m42143rc(sArr, Ye + 1);
            }
        }
        return CollectionsKt__CollectionsKt.m40441E();
    }

    @C11531s
    @C11110f
    @C11665v0(version = "1.3")
    /* renamed from: Z2 */
    public static final C11679z1 m41882Z2(short[] sArr, C11300l<? super C11679z1, Boolean> lVar) {
        Intrinsics.checkNotNullParameter(sArr, "$this$findLast");
        Intrinsics.checkNotNullParameter(lVar, "predicate");
        int X = C10857a2.m38727X(sArr) - 1;
        if (X >= 0) {
            while (true) {
                int i = X - 1;
                short Q = C10857a2.m38726Q(sArr, X);
                if (lVar.invoke(C11679z1.m45862g(Q)).booleanValue()) {
                    return C11679z1.m45862g(Q);
                }
                if (i < 0) {
                    break;
                }
                X = i;
            }
        }
        return null;
    }

    @C11531s
    @C11110f
    @C11665v0(version = "1.3")
    /* renamed from: Z3 */
    public static final void m41883Z3(short[] sArr, C11300l<? super C11679z1, C11079d2> lVar) {
        Intrinsics.checkNotNullParameter(sArr, "$this$forEach");
        Intrinsics.checkNotNullParameter(lVar, "action");
        int X = C10857a2.m38727X(sArr);
        for (int i = 0; i < X; i++) {
            lVar.invoke(C11679z1.m45862g(C10857a2.m38726Q(sArr, i)));
        }
    }

    @C11531s
    @C11110f
    @C11665v0(version = "1.3")
    /* renamed from: Z4 */
    public static final int m41884Z4(short[] sArr, C11300l<? super C11679z1, Boolean> lVar) {
        Intrinsics.checkNotNullParameter(sArr, "$this$indexOfFirst");
        Intrinsics.checkNotNullParameter(lVar, "predicate");
        int length = sArr.length;
        for (int i = 0; i < length; i++) {
            if (lVar.invoke(C11679z1.m45862g(C11679z1.m45841M(sArr[i]))).booleanValue()) {
                return i;
            }
        }
        return -1;
    }

    @C11531s
    @C11110f
    @C11665v0(version = "1.4")
    @C11403m0
    /* renamed from: Z5 */
    public static final double m41885Z5(long[] jArr, C11300l<? super C11588t1, Double> lVar) {
        Intrinsics.checkNotNullParameter(jArr, "$this$maxOf");
        Intrinsics.checkNotNullParameter(lVar, "selector");
        if (!C11662u1.m45755h0(jArr)) {
            double doubleValue = lVar.invoke(C11588t1.m44992g(C11662u1.m45750Q(jArr, 0))).doubleValue();
            C10953k0 H = new C11466l(1, ArraysKt___ArraysKt.m39491We(jArr)).iterator();
            while (H.hasNext()) {
                doubleValue = Math.max(doubleValue, lVar.invoke(C11588t1.m44992g(C11662u1.m45750Q(jArr, H.mo6374c()))).doubleValue());
            }
            return doubleValue;
        }
        throw new NoSuchElementException();
    }

    @C11531s
    @C11110f
    @C11314h(name = "minByOrThrow-U")
    @C11665v0(version = "1.7")
    /* renamed from: Z6 */
    public static final <R extends Comparable<? super R>> short m41886Z6(short[] sArr, C11300l<? super C11679z1, ? extends R> lVar) {
        Intrinsics.checkNotNullParameter(sArr, "$this$minBy");
        Intrinsics.checkNotNullParameter(lVar, "selector");
        if (!C10857a2.m38731h0(sArr)) {
            short Q = C10857a2.m38726Q(sArr, 0);
            int Ye = ArraysKt___ArraysKt.m39555Ye(sArr);
            if (Ye == 0) {
                return Q;
            }
            Comparable comparable = (Comparable) lVar.invoke(C11679z1.m45862g(Q));
            C10953k0 H = new C11466l(1, Ye).iterator();
            while (H.hasNext()) {
                short Q2 = C10857a2.m38726Q(sArr, H.mo6374c());
                Comparable comparable2 = (Comparable) lVar.invoke(C11679z1.m45862g(Q2));
                if (comparable.compareTo(comparable2) > 0) {
                    Q = Q2;
                    comparable = comparable2;
                }
            }
            return Q;
        }
        throw new NoSuchElementException();
    }

    @C11531s
    @C11110f
    @C11665v0(version = "1.3")
    /* renamed from: Z7 */
    public static final boolean m41887Z7(long[] jArr, C11300l<? super C11588t1, Boolean> lVar) {
        Intrinsics.checkNotNullParameter(jArr, "$this$none");
        Intrinsics.checkNotNullParameter(lVar, "predicate");
        int X = C11662u1.m45751X(jArr);
        for (int i = 0; i < X; i++) {
            if (lVar.invoke(C11588t1.m44992g(C11662u1.m45750Q(jArr, i))).booleanValue()) {
                return false;
            }
        }
        return true;
    }

    @C11531s
    @C11110f
    @C11665v0(version = "1.4")
    /* renamed from: Z8 */
    public static final C11588t1 m41888Z8(long[] jArr, C11305q<? super Integer, ? super C11588t1, ? super C11588t1, C11588t1> qVar) {
        Intrinsics.checkNotNullParameter(jArr, "$this$reduceIndexedOrNull");
        Intrinsics.checkNotNullParameter(qVar, "operation");
        if (C11662u1.m45755h0(jArr)) {
            return null;
        }
        long Q = C11662u1.m45750Q(jArr, 0);
        C10953k0 H = new C11466l(1, ArraysKt___ArraysKt.m39491We(jArr)).iterator();
        while (H.hasNext()) {
            int c = H.mo6374c();
            Q = qVar.invoke(Integer.valueOf(c), C11588t1.m44992g(Q), C11588t1.m44992g(C11662u1.m45750Q(jArr, c))).mo23301j2();
        }
        return C11588t1.m44992g(Q);
    }

    @C11531s
    @C11110f
    @C11665v0(version = "1.4")
    /* renamed from: Z9 */
    public static final List<C11588t1> m41889Z9(long[] jArr, C11305q<? super Integer, ? super C11588t1, ? super C11588t1, C11588t1> qVar) {
        Intrinsics.checkNotNullParameter(jArr, "$this$runningReduceIndexed");
        Intrinsics.checkNotNullParameter(qVar, "operation");
        if (C11662u1.m45755h0(jArr)) {
            return CollectionsKt__CollectionsKt.m40441E();
        }
        long Q = C11662u1.m45750Q(jArr, 0);
        ArrayList arrayList = new ArrayList(C11662u1.m45751X(jArr));
        arrayList.add(C11588t1.m44992g(Q));
        int X = C11662u1.m45751X(jArr);
        for (int i = 1; i < X; i++) {
            Q = qVar.invoke(Integer.valueOf(i), C11588t1.m44992g(Q), C11588t1.m44992g(C11662u1.m45750Q(jArr, i))).mo23301j2();
            arrayList.add(C11588t1.m44992g(Q));
        }
        return arrayList;
    }

    @C11531s
    @C11665v0(version = "1.4")
    /* renamed from: Za */
    public static final void m41890Za(@C12579k byte[] bArr, int i, int i2) {
        Intrinsics.checkNotNullParameter(bArr, "$this$sort");
        C10904b.f28138a.mo22058d(i, i2, C11404m1.m43809X(bArr));
        C10943h1.m40959j(bArr, i, i2);
    }

    @C11531s
    @C11110f
    @C11314h(name = "sumOfInt")
    @C11665v0(version = "1.4")
    @C11403m0
    /* renamed from: Zb */
    public static final int m41891Zb(short[] sArr, C11300l<? super C11679z1, Integer> lVar) {
        Intrinsics.checkNotNullParameter(sArr, "$this$sumOf");
        Intrinsics.checkNotNullParameter(lVar, "selector");
        int X = C10857a2.m38727X(sArr);
        int i = 0;
        for (int i2 = 0; i2 < X; i2++) {
            i += lVar.invoke(C11679z1.m45862g(C10857a2.m38726Q(sArr, i2))).intValue();
        }
        return i;
    }

    @C11531s
    @C11665v0(version = "1.3")
    @C12579k
    /* renamed from: Zc */
    public static final Iterable<C10942h0<C11679z1>> m41892Zc(@C12579k short[] sArr) {
        Intrinsics.checkNotNullParameter(sArr, "$this$withIndex");
        return new C10946i0(new UArraysKt___UArraysKt$withIndex$4(sArr));
    }

    @C11531s
    @C11110f
    @C11665v0(version = "1.3")
    /* renamed from: a0 */
    public static final boolean m41893a0(int[] iArr) {
        Intrinsics.checkNotNullParameter(iArr, "$this$any");
        return ArraysKt___ArraysKt.m39161M5(iArr);
    }

    @C11531s
    @C11110f
    @C11665v0(version = "1.3")
    /* renamed from: a2 */
    public static final List<C11400l1> m41895a2(byte[] bArr, C11300l<? super C11400l1, Boolean> lVar) {
        Intrinsics.checkNotNullParameter(bArr, "$this$dropWhile");
        Intrinsics.checkNotNullParameter(lVar, "predicate");
        ArrayList arrayList = new ArrayList();
        int X = C11404m1.m43809X(bArr);
        boolean z = false;
        for (int i = 0; i < X; i++) {
            byte Q = C11404m1.m43808Q(bArr, i);
            if (z) {
                arrayList.add(C11400l1.m43782g(Q));
            } else if (!lVar.invoke(C11400l1.m43782g(Q)).booleanValue()) {
                arrayList.add(C11400l1.m43782g(Q));
                z = true;
            }
        }
        return arrayList;
    }

    @C11531s
    @C11110f
    @C11665v0(version = "1.3")
    /* renamed from: a3 */
    public static final int m41896a3(int[] iArr) {
        Intrinsics.checkNotNullParameter(iArr, "$this$first");
        return C11419p1.m43971M(ArraysKt___ArraysKt.m40056oc(iArr));
    }

    @C11531s
    @C11110f
    @C11665v0(version = "1.3")
    /* renamed from: a4 */
    public static final void m41897a4(byte[] bArr, C11304p<? super Integer, ? super C11400l1, C11079d2> pVar) {
        Intrinsics.checkNotNullParameter(bArr, "$this$forEachIndexed");
        Intrinsics.checkNotNullParameter(pVar, "action");
        int X = C11404m1.m43809X(bArr);
        int i = 0;
        int i2 = 0;
        while (i < X) {
            pVar.invoke(Integer.valueOf(i2), C11400l1.m43782g(C11404m1.m43808Q(bArr, i)));
            i++;
            i2++;
        }
    }

    @C11531s
    @C11110f
    @C11665v0(version = "1.3")
    /* renamed from: a5 */
    public static final int m41898a5(byte[] bArr, C11300l<? super C11400l1, Boolean> lVar) {
        Intrinsics.checkNotNullParameter(bArr, "$this$indexOfLast");
        Intrinsics.checkNotNullParameter(lVar, "predicate");
        int length = bArr.length - 1;
        if (length < 0) {
            return -1;
        }
        while (true) {
            int i = length - 1;
            if (lVar.invoke(C11400l1.m43782g(C11400l1.m43761M(bArr[length]))).booleanValue()) {
                return length;
            }
            if (i < 0) {
                return -1;
            }
            length = i;
        }
    }

    @C11531s
    @C11110f
    @C11665v0(version = "1.4")
    @C11403m0
    /* renamed from: a6 */
    public static final float m41899a6(long[] jArr, C11300l<? super C11588t1, Float> lVar) {
        Intrinsics.checkNotNullParameter(jArr, "$this$maxOf");
        Intrinsics.checkNotNullParameter(lVar, "selector");
        if (!C11662u1.m45755h0(jArr)) {
            float floatValue = lVar.invoke(C11588t1.m44992g(C11662u1.m45750Q(jArr, 0))).floatValue();
            C10953k0 H = new C11466l(1, ArraysKt___ArraysKt.m39491We(jArr)).iterator();
            while (H.hasNext()) {
                floatValue = Math.max(floatValue, lVar.invoke(C11588t1.m44992g(C11662u1.m45750Q(jArr, H.mo6374c()))).floatValue());
            }
            return floatValue;
        }
        throw new NoSuchElementException();
    }

    @C11531s
    @C11110f
    @C11665v0(version = "1.4")
    @C11403m0
    /* renamed from: a7 */
    public static final double m41900a7(byte[] bArr, C11300l<? super C11400l1, Double> lVar) {
        Intrinsics.checkNotNullParameter(bArr, "$this$minOf");
        Intrinsics.checkNotNullParameter(lVar, "selector");
        if (!C11404m1.m43813h0(bArr)) {
            double doubleValue = lVar.invoke(C11400l1.m43782g(C11404m1.m43808Q(bArr, 0))).doubleValue();
            C10953k0 H = new C11466l(1, ArraysKt___ArraysKt.m39331Re(bArr)).iterator();
            while (H.hasNext()) {
                doubleValue = Math.min(doubleValue, lVar.invoke(C11400l1.m43782g(C11404m1.m43808Q(bArr, H.mo6374c()))).doubleValue());
            }
            return doubleValue;
        }
        throw new NoSuchElementException();
    }

    @C11531s
    @C11110f
    @C11665v0(version = "1.3")
    /* renamed from: a8 */
    public static final boolean m41901a8(long[] jArr) {
        Intrinsics.checkNotNullParameter(jArr, "$this$none");
        return C11662u1.m45755h0(jArr);
    }

    @C11531s
    @C11110f
    @C11665v0(version = "1.4")
    @C11097g2(markerClass = {C11429q.class})
    /* renamed from: a9 */
    public static final C11400l1 m41902a9(byte[] bArr, C11304p<? super C11400l1, ? super C11400l1, C11400l1> pVar) {
        Intrinsics.checkNotNullParameter(bArr, "$this$reduceOrNull");
        Intrinsics.checkNotNullParameter(pVar, "operation");
        if (C11404m1.m43813h0(bArr)) {
            return null;
        }
        byte Q = C11404m1.m43808Q(bArr, 0);
        C10953k0 H = new C11466l(1, ArraysKt___ArraysKt.m39331Re(bArr)).iterator();
        while (H.hasNext()) {
            Q = pVar.invoke(C11400l1.m43782g(Q), C11400l1.m43782g(C11404m1.m43808Q(bArr, H.mo6374c()))).mo22897e2();
        }
        return C11400l1.m43782g(Q);
    }

    /* JADX WARNING: type inference failed for: r7v0, types: [java.lang.Object, kotlin.jvm.functions.p<? super R, ? super kotlin.t1, ? extends R>, kotlin.jvm.functions.p] */
    /* JADX WARNING: Unknown variable types count: 1 */
    @kotlin.C11531s
    @kotlin.internal.C11110f
    @kotlin.C11665v0(version = "1.4")
    @kotlin.C11097g2(markerClass = {kotlin.C11429q.class})
    /* renamed from: aa */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final <R> java.util.List<R> m41903aa(long[] r5, R r6, kotlin.jvm.functions.C11304p<? super R, ? super kotlin.C11588t1, ? extends R> r7) {
        /*
            java.lang.String r0 = "$this$scan"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
            java.lang.String r0 = "operation"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r0)
            boolean r0 = kotlin.C11662u1.m45755h0(r5)
            if (r0 == 0) goto L_0x0015
            java.util.List r5 = kotlin.collections.C10976s.m41419k(r6)
            goto L_0x003d
        L_0x0015:
            java.util.ArrayList r0 = new java.util.ArrayList
            int r1 = kotlin.C11662u1.m45751X(r5)
            int r1 = r1 + 1
            r0.<init>(r1)
            r0.add(r6)
            int r1 = kotlin.C11662u1.m45751X(r5)
            r2 = 0
        L_0x0028:
            if (r2 >= r1) goto L_0x003c
            long r3 = kotlin.C11662u1.m45750Q(r5, r2)
            kotlin.t1 r3 = kotlin.C11588t1.m44992g(r3)
            java.lang.Object r6 = r7.invoke(r6, r3)
            r0.add(r6)
            int r2 = r2 + 1
            goto L_0x0028
        L_0x003c:
            r5 = r0
        L_0x003d:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.collections.unsigned.UArraysKt___UArraysKt.m41903aa(long[], java.lang.Object, kotlin.jvm.functions.p):java.util.List");
    }

    /* renamed from: ab */
    public static /* synthetic */ void m41904ab(byte[] bArr, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = 0;
        }
        if ((i3 & 2) != 0) {
            i2 = C11404m1.m43809X(bArr);
        }
        m41890Za(bArr, i, i2);
    }

    @C11531s
    @C11110f
    @C11314h(name = "sumOfLong")
    @C11665v0(version = "1.4")
    @C11403m0
    /* renamed from: ac */
    public static final long m41905ac(byte[] bArr, C11300l<? super C11400l1, Long> lVar) {
        Intrinsics.checkNotNullParameter(bArr, "$this$sumOf");
        Intrinsics.checkNotNullParameter(lVar, "selector");
        int X = C11404m1.m43809X(bArr);
        long j = 0;
        for (int i = 0; i < X; i++) {
            j += lVar.invoke(C11400l1.m43782g(C11404m1.m43808Q(bArr, i))).longValue();
        }
        return j;
    }

    @C11531s
    @C11110f
    @C11665v0(version = "1.3")
    /* renamed from: ad */
    public static final <R, V> List<V> m41906ad(int[] iArr, Iterable<? extends R> iterable, C11304p<? super C11419p1, ? super R, ? extends V> pVar) {
        Intrinsics.checkNotNullParameter(iArr, "$this$zip");
        Intrinsics.checkNotNullParameter(iterable, "other");
        Intrinsics.checkNotNullParameter(pVar, "transform");
        int X = C11431q1.m44045X(iArr);
        ArrayList arrayList = new ArrayList(Math.min(C10978t.m41495Y(iterable, 10), X));
        int i = 0;
        for (Object next : iterable) {
            if (i >= X) {
                break;
            }
            arrayList.add(pVar.invoke(C11419p1.m43993g(C11431q1.m44044Q(iArr, i)), next));
            i++;
        }
        return arrayList;
    }

    @C11531s
    @C11110f
    @C11665v0(version = "1.3")
    /* renamed from: b0 */
    public static final boolean m41907b0(byte[] bArr) {
        Intrinsics.checkNotNullParameter(bArr, "$this$any");
        return ArraysKt___ArraysKt.m38905E5(bArr);
    }

    @C11531s
    @C11665v0(version = "1.4")
    /* renamed from: b1 */
    public static final int m41908b1(@C12580l byte[] bArr) {
        if (bArr == null) {
            bArr = null;
        }
        return Arrays.hashCode(bArr);
    }

    @C11531s
    @C11110f
    @C11665v0(version = "1.3")
    /* renamed from: b2 */
    public static final List<C11588t1> m41909b2(long[] jArr, C11300l<? super C11588t1, Boolean> lVar) {
        Intrinsics.checkNotNullParameter(jArr, "$this$dropWhile");
        Intrinsics.checkNotNullParameter(lVar, "predicate");
        ArrayList arrayList = new ArrayList();
        int X = C11662u1.m45751X(jArr);
        boolean z = false;
        for (int i = 0; i < X; i++) {
            long Q = C11662u1.m45750Q(jArr, i);
            if (z) {
                arrayList.add(C11588t1.m44992g(Q));
            } else if (!lVar.invoke(C11588t1.m44992g(Q)).booleanValue()) {
                arrayList.add(C11588t1.m44992g(Q));
                z = true;
            }
        }
        return arrayList;
    }

    @C11531s
    @C11110f
    @C11665v0(version = "1.3")
    /* renamed from: b3 */
    public static final byte m41910b3(byte[] bArr) {
        Intrinsics.checkNotNullParameter(bArr, "$this$first");
        return C11400l1.m43761M(ArraysKt___ArraysKt.m39808gc(bArr));
    }

    @C11531s
    @C11110f
    @C11665v0(version = "1.3")
    /* renamed from: b4 */
    public static final void m41911b4(int[] iArr, C11304p<? super Integer, ? super C11419p1, C11079d2> pVar) {
        Intrinsics.checkNotNullParameter(iArr, "$this$forEachIndexed");
        Intrinsics.checkNotNullParameter(pVar, "action");
        int X = C11431q1.m44045X(iArr);
        int i = 0;
        int i2 = 0;
        while (i < X) {
            pVar.invoke(Integer.valueOf(i2), C11419p1.m43993g(C11431q1.m44044Q(iArr, i)));
            i++;
            i2++;
        }
    }

    @C11531s
    @C11110f
    @C11665v0(version = "1.3")
    /* renamed from: b5 */
    public static final int m41912b5(long[] jArr, C11300l<? super C11588t1, Boolean> lVar) {
        Intrinsics.checkNotNullParameter(jArr, "$this$indexOfLast");
        Intrinsics.checkNotNullParameter(lVar, "predicate");
        int length = jArr.length - 1;
        if (length < 0) {
            return -1;
        }
        while (true) {
            int i = length - 1;
            if (lVar.invoke(C11588t1.m44992g(C11588t1.m44970M(jArr[length]))).booleanValue()) {
                return length;
            }
            if (i < 0) {
                return -1;
            }
            length = i;
        }
    }

    @C11531s
    @C11110f
    @C11665v0(version = "1.4")
    @C11403m0
    /* renamed from: b6 */
    public static final <R extends Comparable<? super R>> R m41913b6(long[] jArr, C11300l<? super C11588t1, ? extends R> lVar) {
        Intrinsics.checkNotNullParameter(jArr, "$this$maxOf");
        Intrinsics.checkNotNullParameter(lVar, "selector");
        if (!C11662u1.m45755h0(jArr)) {
            R r = (Comparable) lVar.invoke(C11588t1.m44992g(C11662u1.m45750Q(jArr, 0)));
            C10953k0 H = new C11466l(1, ArraysKt___ArraysKt.m39491We(jArr)).iterator();
            while (H.hasNext()) {
                R r2 = (Comparable) lVar.invoke(C11588t1.m44992g(C11662u1.m45750Q(jArr, H.mo6374c())));
                if (r.compareTo(r2) < 0) {
                    r = r2;
                }
            }
            return r;
        }
        throw new NoSuchElementException();
    }

    @C11531s
    @C11110f
    @C11665v0(version = "1.4")
    @C11403m0
    /* renamed from: b7 */
    public static final float m41914b7(byte[] bArr, C11300l<? super C11400l1, Float> lVar) {
        Intrinsics.checkNotNullParameter(bArr, "$this$minOf");
        Intrinsics.checkNotNullParameter(lVar, "selector");
        if (!C11404m1.m43813h0(bArr)) {
            float floatValue = lVar.invoke(C11400l1.m43782g(C11404m1.m43808Q(bArr, 0))).floatValue();
            C10953k0 H = new C11466l(1, ArraysKt___ArraysKt.m39331Re(bArr)).iterator();
            while (H.hasNext()) {
                floatValue = Math.min(floatValue, lVar.invoke(C11400l1.m43782g(C11404m1.m43808Q(bArr, H.mo6374c()))).floatValue());
            }
            return floatValue;
        }
        throw new NoSuchElementException();
    }

    @C11531s
    @C11110f
    @C11665v0(version = "1.3")
    /* renamed from: b8 */
    public static final boolean m41915b8(int[] iArr, C11300l<? super C11419p1, Boolean> lVar) {
        Intrinsics.checkNotNullParameter(iArr, "$this$none");
        Intrinsics.checkNotNullParameter(lVar, "predicate");
        int X = C11431q1.m44045X(iArr);
        for (int i = 0; i < X; i++) {
            if (lVar.invoke(C11419p1.m43993g(C11431q1.m44044Q(iArr, i))).booleanValue()) {
                return false;
            }
        }
        return true;
    }

    @C11531s
    @C11110f
    @C11665v0(version = "1.4")
    @C11097g2(markerClass = {C11429q.class})
    /* renamed from: b9 */
    public static final C11419p1 m41916b9(int[] iArr, C11304p<? super C11419p1, ? super C11419p1, C11419p1> pVar) {
        Intrinsics.checkNotNullParameter(iArr, "$this$reduceOrNull");
        Intrinsics.checkNotNullParameter(pVar, "operation");
        if (C11431q1.m44049h0(iArr)) {
            return null;
        }
        int Q = C11431q1.m44044Q(iArr, 0);
        C10953k0 H = new C11466l(1, ArraysKt___ArraysKt.m39459Ve(iArr)).iterator();
        while (H.hasNext()) {
            Q = pVar.invoke(C11419p1.m43993g(Q), C11419p1.m43993g(C11431q1.m44044Q(iArr, H.mo6374c()))).mo22930j2();
        }
        return C11419p1.m43993g(Q);
    }

    /* JADX WARNING: type inference failed for: r6v0, types: [java.lang.Object, kotlin.jvm.functions.p<? super R, ? super kotlin.l1, ? extends R>, kotlin.jvm.functions.p] */
    /* JADX WARNING: Unknown variable types count: 1 */
    @kotlin.C11531s
    @kotlin.internal.C11110f
    @kotlin.C11665v0(version = "1.4")
    @kotlin.C11097g2(markerClass = {kotlin.C11429q.class})
    /* renamed from: ba */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final <R> java.util.List<R> m41917ba(byte[] r4, R r5, kotlin.jvm.functions.C11304p<? super R, ? super kotlin.C11400l1, ? extends R> r6) {
        /*
            java.lang.String r0 = "$this$scan"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            java.lang.String r0 = "operation"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r0)
            boolean r0 = kotlin.C11404m1.m43813h0(r4)
            if (r0 == 0) goto L_0x0015
            java.util.List r4 = kotlin.collections.C10976s.m41419k(r5)
            goto L_0x003d
        L_0x0015:
            java.util.ArrayList r0 = new java.util.ArrayList
            int r1 = kotlin.C11404m1.m43809X(r4)
            int r1 = r1 + 1
            r0.<init>(r1)
            r0.add(r5)
            int r1 = kotlin.C11404m1.m43809X(r4)
            r2 = 0
        L_0x0028:
            if (r2 >= r1) goto L_0x003c
            byte r3 = kotlin.C11404m1.m43808Q(r4, r2)
            kotlin.l1 r3 = kotlin.C11400l1.m43782g(r3)
            java.lang.Object r5 = r6.invoke(r5, r3)
            r0.add(r5)
            int r2 = r2 + 1
            goto L_0x0028
        L_0x003c:
            r4 = r0
        L_0x003d:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.collections.unsigned.UArraysKt___UArraysKt.m41917ba(byte[], java.lang.Object, kotlin.jvm.functions.p):java.util.List");
    }

    @C11531s
    @C11665v0(version = "1.4")
    /* renamed from: bb */
    public static final void m41918bb(@C12579k short[] sArr, int i, int i2) {
        Intrinsics.checkNotNullParameter(sArr, "$this$sort");
        C10904b.f28138a.mo22058d(i, i2, C10857a2.m38727X(sArr));
        C10943h1.m40960k(sArr, i, i2);
    }

    @C11531s
    @C11110f
    @C11314h(name = "sumOfLong")
    @C11665v0(version = "1.4")
    @C11403m0
    /* renamed from: bc */
    public static final long m41919bc(int[] iArr, C11300l<? super C11419p1, Long> lVar) {
        Intrinsics.checkNotNullParameter(iArr, "$this$sumOf");
        Intrinsics.checkNotNullParameter(lVar, "selector");
        int X = C11431q1.m44045X(iArr);
        long j = 0;
        for (int i = 0; i < X; i++) {
            j += lVar.invoke(C11419p1.m43993g(C11431q1.m44044Q(iArr, i))).longValue();
        }
        return j;
    }

    @C11531s
    @C11110f
    @C11665v0(version = "1.3")
    /* renamed from: bd */
    public static final <R, V> List<V> m41920bd(long[] jArr, R[] rArr, C11304p<? super C11588t1, ? super R, ? extends V> pVar) {
        Intrinsics.checkNotNullParameter(jArr, "$this$zip");
        Intrinsics.checkNotNullParameter(rArr, "other");
        Intrinsics.checkNotNullParameter(pVar, "transform");
        int min = Math.min(C11662u1.m45751X(jArr), rArr.length);
        ArrayList arrayList = new ArrayList(min);
        for (int i = 0; i < min; i++) {
            arrayList.add(pVar.invoke(C11588t1.m44992g(C11662u1.m45750Q(jArr, i)), rArr[i]));
        }
        return arrayList;
    }

    @C11531s
    @C11110f
    @C11665v0(version = "1.3")
    /* renamed from: c0 */
    public static final boolean m41921c0(byte[] bArr, C11300l<? super C11400l1, Boolean> lVar) {
        Intrinsics.checkNotNullParameter(bArr, "$this$any");
        Intrinsics.checkNotNullParameter(lVar, "predicate");
        int X = C11404m1.m43809X(bArr);
        for (int i = 0; i < X; i++) {
            if (lVar.invoke(C11400l1.m43782g(C11404m1.m43808Q(bArr, i))).booleanValue()) {
                return true;
            }
        }
        return false;
    }

    @C11531s
    @C11110f
    @C11665v0(version = "1.3")
    /* renamed from: c2 */
    public static final List<C11419p1> m41923c2(int[] iArr, C11300l<? super C11419p1, Boolean> lVar) {
        Intrinsics.checkNotNullParameter(iArr, "$this$dropWhile");
        Intrinsics.checkNotNullParameter(lVar, "predicate");
        ArrayList arrayList = new ArrayList();
        int X = C11431q1.m44045X(iArr);
        boolean z = false;
        for (int i = 0; i < X; i++) {
            int Q = C11431q1.m44044Q(iArr, i);
            if (z) {
                arrayList.add(C11419p1.m43993g(Q));
            } else if (!lVar.invoke(C11419p1.m43993g(Q)).booleanValue()) {
                arrayList.add(C11419p1.m43993g(Q));
                z = true;
            }
        }
        return arrayList;
    }

    @C11531s
    @C11110f
    @C11665v0(version = "1.3")
    /* renamed from: c3 */
    public static final byte m41924c3(byte[] bArr, C11300l<? super C11400l1, Boolean> lVar) {
        Intrinsics.checkNotNullParameter(bArr, "$this$first");
        Intrinsics.checkNotNullParameter(lVar, "predicate");
        int X = C11404m1.m43809X(bArr);
        for (int i = 0; i < X; i++) {
            byte Q = C11404m1.m43808Q(bArr, i);
            if (lVar.invoke(C11400l1.m43782g(Q)).booleanValue()) {
                return Q;
            }
        }
        throw new NoSuchElementException("Array contains no element matching the predicate.");
    }

    @C11531s
    @C11110f
    @C11665v0(version = "1.3")
    /* renamed from: c4 */
    public static final void m41925c4(long[] jArr, C11304p<? super Integer, ? super C11588t1, C11079d2> pVar) {
        Intrinsics.checkNotNullParameter(jArr, "$this$forEachIndexed");
        Intrinsics.checkNotNullParameter(pVar, "action");
        int X = C11662u1.m45751X(jArr);
        int i = 0;
        int i2 = 0;
        while (i < X) {
            pVar.invoke(Integer.valueOf(i2), C11588t1.m44992g(C11662u1.m45750Q(jArr, i)));
            i++;
            i2++;
        }
    }

    @C11531s
    @C11110f
    @C11665v0(version = "1.3")
    /* renamed from: c5 */
    public static final int m41926c5(int[] iArr, C11300l<? super C11419p1, Boolean> lVar) {
        Intrinsics.checkNotNullParameter(iArr, "$this$indexOfLast");
        Intrinsics.checkNotNullParameter(lVar, "predicate");
        int length = iArr.length - 1;
        if (length < 0) {
            return -1;
        }
        while (true) {
            int i = length - 1;
            if (lVar.invoke(C11419p1.m43993g(C11419p1.m43971M(iArr[length]))).booleanValue()) {
                return length;
            }
            if (i < 0) {
                return -1;
            }
            length = i;
        }
    }

    @C11531s
    @C11110f
    @C11665v0(version = "1.4")
    @C11403m0
    /* renamed from: c6 */
    public static final double m41927c6(int[] iArr, C11300l<? super C11419p1, Double> lVar) {
        Intrinsics.checkNotNullParameter(iArr, "$this$maxOf");
        Intrinsics.checkNotNullParameter(lVar, "selector");
        if (!C11431q1.m44049h0(iArr)) {
            double doubleValue = lVar.invoke(C11419p1.m43993g(C11431q1.m44044Q(iArr, 0))).doubleValue();
            C10953k0 H = new C11466l(1, ArraysKt___ArraysKt.m39459Ve(iArr)).iterator();
            while (H.hasNext()) {
                doubleValue = Math.max(doubleValue, lVar.invoke(C11419p1.m43993g(C11431q1.m44044Q(iArr, H.mo6374c()))).doubleValue());
            }
            return doubleValue;
        }
        throw new NoSuchElementException();
    }

    @C11531s
    @C11110f
    @C11665v0(version = "1.4")
    @C11403m0
    /* renamed from: c7 */
    public static final <R extends Comparable<? super R>> R m41928c7(byte[] bArr, C11300l<? super C11400l1, ? extends R> lVar) {
        Intrinsics.checkNotNullParameter(bArr, "$this$minOf");
        Intrinsics.checkNotNullParameter(lVar, "selector");
        if (!C11404m1.m43813h0(bArr)) {
            R r = (Comparable) lVar.invoke(C11400l1.m43782g(C11404m1.m43808Q(bArr, 0)));
            C10953k0 H = new C11466l(1, ArraysKt___ArraysKt.m39331Re(bArr)).iterator();
            while (H.hasNext()) {
                R r2 = (Comparable) lVar.invoke(C11400l1.m43782g(C11404m1.m43808Q(bArr, H.mo6374c())));
                if (r.compareTo(r2) > 0) {
                    r = r2;
                }
            }
            return r;
        }
        throw new NoSuchElementException();
    }

    @C11531s
    @C11110f
    @C11665v0(version = "1.3")
    /* renamed from: c8 */
    public static final boolean m41929c8(short[] sArr) {
        Intrinsics.checkNotNullParameter(sArr, "$this$none");
        return C10857a2.m38731h0(sArr);
    }

    @C11531s
    @C11110f
    @C11665v0(version = "1.4")
    @C11097g2(markerClass = {C11429q.class})
    /* renamed from: c9 */
    public static final C11588t1 m41930c9(long[] jArr, C11304p<? super C11588t1, ? super C11588t1, C11588t1> pVar) {
        Intrinsics.checkNotNullParameter(jArr, "$this$reduceOrNull");
        Intrinsics.checkNotNullParameter(pVar, "operation");
        if (C11662u1.m45755h0(jArr)) {
            return null;
        }
        long Q = C11662u1.m45750Q(jArr, 0);
        C10953k0 H = new C11466l(1, ArraysKt___ArraysKt.m39491We(jArr)).iterator();
        while (H.hasNext()) {
            Q = pVar.invoke(C11588t1.m44992g(Q), C11588t1.m44992g(C11662u1.m45750Q(jArr, H.mo6374c()))).mo23301j2();
        }
        return C11588t1.m44992g(Q);
    }

    /* JADX WARNING: type inference failed for: r6v0, types: [java.lang.Object, kotlin.jvm.functions.p<? super R, ? super kotlin.p1, ? extends R>, kotlin.jvm.functions.p] */
    /* JADX WARNING: Unknown variable types count: 1 */
    @kotlin.C11531s
    @kotlin.internal.C11110f
    @kotlin.C11665v0(version = "1.4")
    @kotlin.C11097g2(markerClass = {kotlin.C11429q.class})
    /* renamed from: ca */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final <R> java.util.List<R> m41931ca(int[] r4, R r5, kotlin.jvm.functions.C11304p<? super R, ? super kotlin.C11419p1, ? extends R> r6) {
        /*
            java.lang.String r0 = "$this$scan"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            java.lang.String r0 = "operation"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r0)
            boolean r0 = kotlin.C11431q1.m44049h0(r4)
            if (r0 == 0) goto L_0x0015
            java.util.List r4 = kotlin.collections.C10976s.m41419k(r5)
            goto L_0x003d
        L_0x0015:
            java.util.ArrayList r0 = new java.util.ArrayList
            int r1 = kotlin.C11431q1.m44045X(r4)
            int r1 = r1 + 1
            r0.<init>(r1)
            r0.add(r5)
            int r1 = kotlin.C11431q1.m44045X(r4)
            r2 = 0
        L_0x0028:
            if (r2 >= r1) goto L_0x003c
            int r3 = kotlin.C11431q1.m44044Q(r4, r2)
            kotlin.p1 r3 = kotlin.C11419p1.m43993g(r3)
            java.lang.Object r5 = r6.invoke(r5, r3)
            r0.add(r5)
            int r2 = r2 + 1
            goto L_0x0028
        L_0x003c:
            r4 = r0
        L_0x003d:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.collections.unsigned.UArraysKt___UArraysKt.m41931ca(int[], java.lang.Object, kotlin.jvm.functions.p):java.util.List");
    }

    /* renamed from: cb */
    public static /* synthetic */ void m41932cb(short[] sArr, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = 0;
        }
        if ((i3 & 2) != 0) {
            i2 = C10857a2.m38727X(sArr);
        }
        m41918bb(sArr, i, i2);
    }

    @C11531s
    @C11110f
    @C11314h(name = "sumOfLong")
    @C11665v0(version = "1.4")
    @C11403m0
    /* renamed from: cc */
    public static final long m41933cc(long[] jArr, C11300l<? super C11588t1, Long> lVar) {
        Intrinsics.checkNotNullParameter(jArr, "$this$sumOf");
        Intrinsics.checkNotNullParameter(lVar, "selector");
        int X = C11662u1.m45751X(jArr);
        long j = 0;
        for (int i = 0; i < X; i++) {
            j += lVar.invoke(C11588t1.m44992g(C11662u1.m45750Q(jArr, i))).longValue();
        }
        return j;
    }

    @C11531s
    @C11665v0(version = "1.3")
    @C12579k
    /* renamed from: cd */
    public static final <R> List<Pair<C11419p1, R>> m41934cd(@C12579k int[] iArr, @C12579k R[] rArr) {
        Intrinsics.checkNotNullParameter(iArr, "$this$zip");
        Intrinsics.checkNotNullParameter(rArr, "other");
        int min = Math.min(C11431q1.m44045X(iArr), rArr.length);
        ArrayList arrayList = new ArrayList(min);
        for (int i = 0; i < min; i++) {
            int Q = C11431q1.m44044Q(iArr, i);
            arrayList.add(C11078d1.m42659a(C11419p1.m43993g(Q), rArr[i]));
        }
        return arrayList;
    }

    @C11531s
    @C11110f
    @C11665v0(version = "1.3")
    /* renamed from: d0 */
    public static final boolean m41935d0(long[] jArr, C11300l<? super C11588t1, Boolean> lVar) {
        Intrinsics.checkNotNullParameter(jArr, "$this$any");
        Intrinsics.checkNotNullParameter(lVar, "predicate");
        int X = C11662u1.m45751X(jArr);
        for (int i = 0; i < X; i++) {
            if (lVar.invoke(C11588t1.m44992g(C11662u1.m45750Q(jArr, i))).booleanValue()) {
                return true;
            }
        }
        return false;
    }

    @C11531s
    @C11110f
    @C11665v0(version = "1.3")
    /* renamed from: d2 */
    public static final List<C11679z1> m41937d2(short[] sArr, C11300l<? super C11679z1, Boolean> lVar) {
        Intrinsics.checkNotNullParameter(sArr, "$this$dropWhile");
        Intrinsics.checkNotNullParameter(lVar, "predicate");
        ArrayList arrayList = new ArrayList();
        int X = C10857a2.m38727X(sArr);
        boolean z = false;
        for (int i = 0; i < X; i++) {
            short Q = C10857a2.m38726Q(sArr, i);
            if (z) {
                arrayList.add(C11679z1.m45862g(Q));
            } else if (!lVar.invoke(C11679z1.m45862g(Q)).booleanValue()) {
                arrayList.add(C11679z1.m45862g(Q));
                z = true;
            }
        }
        return arrayList;
    }

    @C11531s
    @C11110f
    @C11665v0(version = "1.3")
    /* renamed from: d3 */
    public static final long m41938d3(long[] jArr, C11300l<? super C11588t1, Boolean> lVar) {
        Intrinsics.checkNotNullParameter(jArr, "$this$first");
        Intrinsics.checkNotNullParameter(lVar, "predicate");
        int X = C11662u1.m45751X(jArr);
        for (int i = 0; i < X; i++) {
            long Q = C11662u1.m45750Q(jArr, i);
            if (lVar.invoke(C11588t1.m44992g(Q)).booleanValue()) {
                return Q;
            }
        }
        throw new NoSuchElementException("Array contains no element matching the predicate.");
    }

    @C11531s
    @C11110f
    @C11665v0(version = "1.3")
    /* renamed from: d4 */
    public static final void m41939d4(short[] sArr, C11304p<? super Integer, ? super C11679z1, C11079d2> pVar) {
        Intrinsics.checkNotNullParameter(sArr, "$this$forEachIndexed");
        Intrinsics.checkNotNullParameter(pVar, "action");
        int X = C10857a2.m38727X(sArr);
        int i = 0;
        int i2 = 0;
        while (i < X) {
            pVar.invoke(Integer.valueOf(i2), C11679z1.m45862g(C10857a2.m38726Q(sArr, i)));
            i++;
            i2++;
        }
    }

    @C11531s
    @C11110f
    @C11665v0(version = "1.3")
    /* renamed from: d5 */
    public static final int m41940d5(short[] sArr, C11300l<? super C11679z1, Boolean> lVar) {
        Intrinsics.checkNotNullParameter(sArr, "$this$indexOfLast");
        Intrinsics.checkNotNullParameter(lVar, "predicate");
        int length = sArr.length - 1;
        if (length < 0) {
            return -1;
        }
        while (true) {
            int i = length - 1;
            if (lVar.invoke(C11679z1.m45862g(C11679z1.m45841M(sArr[length]))).booleanValue()) {
                return length;
            }
            if (i < 0) {
                return -1;
            }
            length = i;
        }
    }

    @C11531s
    @C11110f
    @C11665v0(version = "1.4")
    @C11403m0
    /* renamed from: d6 */
    public static final float m41941d6(int[] iArr, C11300l<? super C11419p1, Float> lVar) {
        Intrinsics.checkNotNullParameter(iArr, "$this$maxOf");
        Intrinsics.checkNotNullParameter(lVar, "selector");
        if (!C11431q1.m44049h0(iArr)) {
            float floatValue = lVar.invoke(C11419p1.m43993g(C11431q1.m44044Q(iArr, 0))).floatValue();
            C10953k0 H = new C11466l(1, ArraysKt___ArraysKt.m39459Ve(iArr)).iterator();
            while (H.hasNext()) {
                floatValue = Math.max(floatValue, lVar.invoke(C11419p1.m43993g(C11431q1.m44044Q(iArr, H.mo6374c()))).floatValue());
            }
            return floatValue;
        }
        throw new NoSuchElementException();
    }

    @C11531s
    @C11110f
    @C11665v0(version = "1.4")
    @C11403m0
    /* renamed from: d7 */
    public static final double m41942d7(long[] jArr, C11300l<? super C11588t1, Double> lVar) {
        Intrinsics.checkNotNullParameter(jArr, "$this$minOf");
        Intrinsics.checkNotNullParameter(lVar, "selector");
        if (!C11662u1.m45755h0(jArr)) {
            double doubleValue = lVar.invoke(C11588t1.m44992g(C11662u1.m45750Q(jArr, 0))).doubleValue();
            C10953k0 H = new C11466l(1, ArraysKt___ArraysKt.m39491We(jArr)).iterator();
            while (H.hasNext()) {
                doubleValue = Math.min(doubleValue, lVar.invoke(C11588t1.m44992g(C11662u1.m45750Q(jArr, H.mo6374c()))).doubleValue());
            }
            return doubleValue;
        }
        throw new NoSuchElementException();
    }

    @C11531s
    @C11110f
    @C11665v0(version = "1.3")
    /* renamed from: d8 */
    public static final boolean m41943d8(short[] sArr, C11300l<? super C11679z1, Boolean> lVar) {
        Intrinsics.checkNotNullParameter(sArr, "$this$none");
        Intrinsics.checkNotNullParameter(lVar, "predicate");
        int X = C10857a2.m38727X(sArr);
        for (int i = 0; i < X; i++) {
            if (lVar.invoke(C11679z1.m45862g(C10857a2.m38726Q(sArr, i))).booleanValue()) {
                return false;
            }
        }
        return true;
    }

    @C11531s
    @C11110f
    @C11665v0(version = "1.4")
    @C11097g2(markerClass = {C11429q.class})
    /* renamed from: d9 */
    public static final C11679z1 m41944d9(short[] sArr, C11304p<? super C11679z1, ? super C11679z1, C11679z1> pVar) {
        Intrinsics.checkNotNullParameter(sArr, "$this$reduceOrNull");
        Intrinsics.checkNotNullParameter(pVar, "operation");
        if (C10857a2.m38731h0(sArr)) {
            return null;
        }
        short Q = C10857a2.m38726Q(sArr, 0);
        C10953k0 H = new C11466l(1, ArraysKt___ArraysKt.m39555Ye(sArr)).iterator();
        while (H.hasNext()) {
            Q = pVar.invoke(C11679z1.m45862g(Q), C11679z1.m45862g(C10857a2.m38726Q(sArr, H.mo6374c()))).mo23548e2();
        }
        return C11679z1.m45862g(Q);
    }

    /* JADX WARNING: type inference failed for: r6v0, types: [java.lang.Object, kotlin.jvm.functions.p<? super R, ? super kotlin.z1, ? extends R>, kotlin.jvm.functions.p] */
    /* JADX WARNING: Unknown variable types count: 1 */
    @kotlin.C11531s
    @kotlin.internal.C11110f
    @kotlin.C11665v0(version = "1.4")
    @kotlin.C11097g2(markerClass = {kotlin.C11429q.class})
    /* renamed from: da */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final <R> java.util.List<R> m41945da(short[] r4, R r5, kotlin.jvm.functions.C11304p<? super R, ? super kotlin.C11679z1, ? extends R> r6) {
        /*
            java.lang.String r0 = "$this$scan"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            java.lang.String r0 = "operation"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r0)
            boolean r0 = kotlin.C10857a2.m38731h0(r4)
            if (r0 == 0) goto L_0x0015
            java.util.List r4 = kotlin.collections.C10976s.m41419k(r5)
            goto L_0x003d
        L_0x0015:
            java.util.ArrayList r0 = new java.util.ArrayList
            int r1 = kotlin.C10857a2.m38727X(r4)
            int r1 = r1 + 1
            r0.<init>(r1)
            r0.add(r5)
            int r1 = kotlin.C10857a2.m38727X(r4)
            r2 = 0
        L_0x0028:
            if (r2 >= r1) goto L_0x003c
            short r3 = kotlin.C10857a2.m38726Q(r4, r2)
            kotlin.z1 r3 = kotlin.C11679z1.m45862g(r3)
            java.lang.Object r5 = r6.invoke(r5, r3)
            r0.add(r5)
            int r2 = r2 + 1
            goto L_0x0028
        L_0x003c:
            r4 = r0
        L_0x003d:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.collections.unsigned.UArraysKt___UArraysKt.m41945da(short[], java.lang.Object, kotlin.jvm.functions.p):java.util.List");
    }

    @C11531s
    @C11665v0(version = "1.3")
    /* renamed from: db */
    public static final void m41946db(@C12579k byte[] bArr) {
        Intrinsics.checkNotNullParameter(bArr, "$this$sort");
        if (C11404m1.m43809X(bArr) > 1) {
            C10943h1.m40959j(bArr, 0, C11404m1.m43809X(bArr));
        }
    }

    @C11531s
    @C11110f
    @C11314h(name = "sumOfLong")
    @C11665v0(version = "1.4")
    @C11403m0
    /* renamed from: dc */
    public static final long m41947dc(short[] sArr, C11300l<? super C11679z1, Long> lVar) {
        Intrinsics.checkNotNullParameter(sArr, "$this$sumOf");
        Intrinsics.checkNotNullParameter(lVar, "selector");
        int X = C10857a2.m38727X(sArr);
        long j = 0;
        for (int i = 0; i < X; i++) {
            j += lVar.invoke(C11679z1.m45862g(C10857a2.m38726Q(sArr, i))).longValue();
        }
        return j;
    }

    @C11531s
    @C11665v0(version = "1.3")
    @C12579k
    /* renamed from: dd */
    public static final <R> List<Pair<C11588t1, R>> m41948dd(@C12579k long[] jArr, @C12579k Iterable<? extends R> iterable) {
        Intrinsics.checkNotNullParameter(jArr, "$this$zip");
        Intrinsics.checkNotNullParameter(iterable, "other");
        int X = C11662u1.m45751X(jArr);
        ArrayList arrayList = new ArrayList(Math.min(C10978t.m41495Y(iterable, 10), X));
        int i = 0;
        for (Object next : iterable) {
            if (i >= X) {
                break;
            }
            arrayList.add(C11078d1.m42659a(C11588t1.m44992g(C11662u1.m45750Q(jArr, i)), next));
            i++;
        }
        return arrayList;
    }

    @C11531s
    @C11110f
    @C11665v0(version = "1.3")
    /* renamed from: e0 */
    public static final boolean m41949e0(long[] jArr) {
        Intrinsics.checkNotNullParameter(jArr, "$this$any");
        return ArraysKt___ArraysKt.m39225O5(jArr);
    }

    @C11531s
    @C11665v0(version = "1.4")
    /* renamed from: e1 */
    public static final int m41950e1(@C12580l int[] iArr) {
        if (iArr == null) {
            iArr = null;
        }
        return Arrays.hashCode(iArr);
    }

    @C11531s
    @C11110f
    @C11665v0(version = "1.3")
    /* renamed from: e2 */
    public static final short m41951e2(short[] sArr, int i, C11300l<? super Integer, C11679z1> lVar) {
        Intrinsics.checkNotNullParameter(sArr, "$this$elementAtOrElse");
        Intrinsics.checkNotNullParameter(lVar, "defaultValue");
        if (i < 0 || i > ArraysKt___ArraysKt.m39555Ye(sArr)) {
            return lVar.invoke(Integer.valueOf(i)).mo23548e2();
        }
        return C10857a2.m38726Q(sArr, i);
    }

    @C11531s
    @C11110f
    @C11665v0(version = "1.3")
    /* renamed from: e3 */
    public static final long m41952e3(long[] jArr) {
        Intrinsics.checkNotNullParameter(jArr, "$this$first");
        return C11588t1.m44970M(ArraysKt___ArraysKt.m40118qc(jArr));
    }

    @C12579k
    /* renamed from: e4 */
    public static final C11466l m41953e4(@C12579k int[] iArr) {
        Intrinsics.checkNotNullParameter(iArr, "$this$indices");
        return ArraysKt___ArraysKt.m39171Me(iArr);
    }

    @C11531s
    @C11110f
    @C11665v0(version = "1.3")
    /* renamed from: e5 */
    public static final int m41954e5(int[] iArr) {
        Intrinsics.checkNotNullParameter(iArr, "$this$last");
        return C11419p1.m43971M(ArraysKt___ArraysKt.m39526Xh(iArr));
    }

    @C11531s
    @C11110f
    @C11665v0(version = "1.4")
    @C11403m0
    /* renamed from: e6 */
    public static final <R extends Comparable<? super R>> R m41955e6(int[] iArr, C11300l<? super C11419p1, ? extends R> lVar) {
        Intrinsics.checkNotNullParameter(iArr, "$this$maxOf");
        Intrinsics.checkNotNullParameter(lVar, "selector");
        if (!C11431q1.m44049h0(iArr)) {
            R r = (Comparable) lVar.invoke(C11419p1.m43993g(C11431q1.m44044Q(iArr, 0)));
            C10953k0 H = new C11466l(1, ArraysKt___ArraysKt.m39459Ve(iArr)).iterator();
            while (H.hasNext()) {
                R r2 = (Comparable) lVar.invoke(C11419p1.m43993g(C11431q1.m44044Q(iArr, H.mo6374c())));
                if (r.compareTo(r2) < 0) {
                    r = r2;
                }
            }
            return r;
        }
        throw new NoSuchElementException();
    }

    @C11531s
    @C11110f
    @C11665v0(version = "1.4")
    @C11403m0
    /* renamed from: e7 */
    public static final float m41956e7(long[] jArr, C11300l<? super C11588t1, Float> lVar) {
        Intrinsics.checkNotNullParameter(jArr, "$this$minOf");
        Intrinsics.checkNotNullParameter(lVar, "selector");
        if (!C11662u1.m45755h0(jArr)) {
            float floatValue = lVar.invoke(C11588t1.m44992g(C11662u1.m45750Q(jArr, 0))).floatValue();
            C10953k0 H = new C11466l(1, ArraysKt___ArraysKt.m39491We(jArr)).iterator();
            while (H.hasNext()) {
                floatValue = Math.min(floatValue, lVar.invoke(C11588t1.m44992g(C11662u1.m45750Q(jArr, H.mo6374c()))).floatValue());
            }
            return floatValue;
        }
        throw new NoSuchElementException();
    }

    @C11531s
    @C11110f
    @C11665v0(version = "1.4")
    /* renamed from: e8 */
    public static final byte[] m41957e8(byte[] bArr, C11300l<? super C11400l1, C11079d2> lVar) {
        Intrinsics.checkNotNullParameter(bArr, "$this$onEach");
        Intrinsics.checkNotNullParameter(lVar, "action");
        int X = C11404m1.m43809X(bArr);
        for (int i = 0; i < X; i++) {
            lVar.invoke(C11400l1.m43782g(C11404m1.m43808Q(bArr, i)));
        }
        return bArr;
    }

    @C11531s
    @C11110f
    @C11665v0(version = "1.3")
    /* renamed from: e9 */
    public static final byte m41958e9(byte[] bArr, C11304p<? super C11400l1, ? super C11400l1, C11400l1> pVar) {
        Intrinsics.checkNotNullParameter(bArr, "$this$reduceRight");
        Intrinsics.checkNotNullParameter(pVar, "operation");
        int Re = ArraysKt___ArraysKt.m39331Re(bArr);
        if (Re >= 0) {
            byte Q = C11404m1.m43808Q(bArr, Re);
            for (int i = Re - 1; i >= 0; i--) {
                Q = pVar.invoke(C11400l1.m43782g(C11404m1.m43808Q(bArr, i)), C11400l1.m43782g(Q)).mo22897e2();
            }
            return Q;
        }
        throw new UnsupportedOperationException("Empty array can't be reduced.");
    }

    /* JADX WARNING: type inference failed for: r7v0, types: [kotlin.jvm.functions.q, java.lang.Object, kotlin.jvm.functions.q<? super java.lang.Integer, ? super R, ? super kotlin.l1, ? extends R>] */
    /* JADX WARNING: Unknown variable types count: 1 */
    @kotlin.C11531s
    @kotlin.internal.C11110f
    @kotlin.C11665v0(version = "1.4")
    @kotlin.C11097g2(markerClass = {kotlin.C11429q.class})
    /* renamed from: ea */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final <R> java.util.List<R> m41959ea(byte[] r5, R r6, kotlin.jvm.functions.C11305q<? super java.lang.Integer, ? super R, ? super kotlin.C11400l1, ? extends R> r7) {
        /*
            java.lang.String r0 = "$this$scanIndexed"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
            java.lang.String r0 = "operation"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r0)
            boolean r0 = kotlin.C11404m1.m43813h0(r5)
            if (r0 == 0) goto L_0x0015
            java.util.List r5 = kotlin.collections.C10976s.m41419k(r6)
            goto L_0x0041
        L_0x0015:
            java.util.ArrayList r0 = new java.util.ArrayList
            int r1 = kotlin.C11404m1.m43809X(r5)
            int r1 = r1 + 1
            r0.<init>(r1)
            r0.add(r6)
            int r1 = kotlin.C11404m1.m43809X(r5)
            r2 = 0
        L_0x0028:
            if (r2 >= r1) goto L_0x0040
            java.lang.Integer r3 = java.lang.Integer.valueOf(r2)
            byte r4 = kotlin.C11404m1.m43808Q(r5, r2)
            kotlin.l1 r4 = kotlin.C11400l1.m43782g(r4)
            java.lang.Object r6 = r7.invoke(r3, r6, r4)
            r0.add(r6)
            int r2 = r2 + 1
            goto L_0x0028
        L_0x0040:
            r5 = r0
        L_0x0041:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.collections.unsigned.UArraysKt___UArraysKt.m41959ea(byte[], java.lang.Object, kotlin.jvm.functions.q):java.util.List");
    }

    @C11531s
    @C11665v0(version = "1.3")
    /* renamed from: eb */
    public static final void m41960eb(@C12579k long[] jArr) {
        Intrinsics.checkNotNullParameter(jArr, "$this$sort");
        if (C11662u1.m45751X(jArr) > 1) {
            C10943h1.m40958i(jArr, 0, C11662u1.m45751X(jArr));
        }
    }

    @C11097g2(markerClass = {C11531s.class})
    @C11314h(name = "sumOfUByte")
    @C11665v0(version = "1.5")
    /* renamed from: ec */
    public static final int m41961ec(@C12579k C11400l1[] l1VarArr) {
        Intrinsics.checkNotNullParameter(l1VarArr, "<this>");
        int i = 0;
        for (C11400l1 e2 : l1VarArr) {
            i = C11419p1.m43971M(i + C11419p1.m43971M(e2.mo22897e2() & 255));
        }
        return i;
    }

    @C11531s
    @C11665v0(version = "1.3")
    @C12579k
    /* renamed from: ed */
    public static final <R> List<Pair<C11419p1, R>> m41962ed(@C12579k int[] iArr, @C12579k Iterable<? extends R> iterable) {
        Intrinsics.checkNotNullParameter(iArr, "$this$zip");
        Intrinsics.checkNotNullParameter(iterable, "other");
        int X = C11431q1.m44045X(iArr);
        ArrayList arrayList = new ArrayList(Math.min(C10978t.m41495Y(iterable, 10), X));
        int i = 0;
        for (Object next : iterable) {
            if (i >= X) {
                break;
            }
            arrayList.add(C11078d1.m42659a(C11419p1.m43993g(C11431q1.m44044Q(iArr, i)), next));
            i++;
        }
        return arrayList;
    }

    @C11531s
    @C11110f
    @C11665v0(version = "1.3")
    /* renamed from: f0 */
    public static final boolean m41963f0(int[] iArr, C11300l<? super C11419p1, Boolean> lVar) {
        Intrinsics.checkNotNullParameter(iArr, "$this$any");
        Intrinsics.checkNotNullParameter(lVar, "predicate");
        int X = C11431q1.m44045X(iArr);
        for (int i = 0; i < X; i++) {
            if (lVar.invoke(C11419p1.m43993g(C11431q1.m44044Q(iArr, i))).booleanValue()) {
                return true;
            }
        }
        return false;
    }

    @C11531s
    @C11665v0(version = "1.4")
    /* renamed from: f1 */
    public static final int m41964f1(@C12580l short[] sArr) {
        if (sArr == null) {
            sArr = null;
        }
        return Arrays.hashCode(sArr);
    }

    @C11531s
    @C11110f
    @C11665v0(version = "1.3")
    /* renamed from: f2 */
    public static final int m41965f2(int[] iArr, int i, C11300l<? super Integer, C11419p1> lVar) {
        Intrinsics.checkNotNullParameter(iArr, "$this$elementAtOrElse");
        Intrinsics.checkNotNullParameter(lVar, "defaultValue");
        if (i < 0 || i > ArraysKt___ArraysKt.m39459Ve(iArr)) {
            return lVar.invoke(Integer.valueOf(i)).mo22930j2();
        }
        return C11431q1.m44044Q(iArr, i);
    }

    @C11531s
    @C11110f
    @C11665v0(version = "1.3")
    /* renamed from: f3 */
    public static final int m41966f3(int[] iArr, C11300l<? super C11419p1, Boolean> lVar) {
        Intrinsics.checkNotNullParameter(iArr, "$this$first");
        Intrinsics.checkNotNullParameter(lVar, "predicate");
        int X = C11431q1.m44045X(iArr);
        for (int i = 0; i < X; i++) {
            int Q = C11431q1.m44044Q(iArr, i);
            if (lVar.invoke(C11419p1.m43993g(Q)).booleanValue()) {
                return Q;
            }
        }
        throw new NoSuchElementException("Array contains no element matching the predicate.");
    }

    @C11531s
    @C11665v0(version = "1.3")
    /* renamed from: f4 */
    public static /* synthetic */ void m41967f4(int[] iArr) {
    }

    @C11531s
    @C11110f
    @C11665v0(version = "1.3")
    /* renamed from: f5 */
    public static final byte m41968f5(byte[] bArr) {
        Intrinsics.checkNotNullParameter(bArr, "$this$last");
        return C11400l1.m43761M(ArraysKt___ArraysKt.m39270Ph(bArr));
    }

    @C11531s
    @C11110f
    @C11665v0(version = "1.4")
    @C11403m0
    /* renamed from: f6 */
    public static final double m41969f6(short[] sArr, C11300l<? super C11679z1, Double> lVar) {
        Intrinsics.checkNotNullParameter(sArr, "$this$maxOf");
        Intrinsics.checkNotNullParameter(lVar, "selector");
        if (!C10857a2.m38731h0(sArr)) {
            double doubleValue = lVar.invoke(C11679z1.m45862g(C10857a2.m38726Q(sArr, 0))).doubleValue();
            C10953k0 H = new C11466l(1, ArraysKt___ArraysKt.m39555Ye(sArr)).iterator();
            while (H.hasNext()) {
                doubleValue = Math.max(doubleValue, lVar.invoke(C11679z1.m45862g(C10857a2.m38726Q(sArr, H.mo6374c()))).doubleValue());
            }
            return doubleValue;
        }
        throw new NoSuchElementException();
    }

    @C11531s
    @C11110f
    @C11665v0(version = "1.4")
    @C11403m0
    /* renamed from: f7 */
    public static final <R extends Comparable<? super R>> R m41970f7(long[] jArr, C11300l<? super C11588t1, ? extends R> lVar) {
        Intrinsics.checkNotNullParameter(jArr, "$this$minOf");
        Intrinsics.checkNotNullParameter(lVar, "selector");
        if (!C11662u1.m45755h0(jArr)) {
            R r = (Comparable) lVar.invoke(C11588t1.m44992g(C11662u1.m45750Q(jArr, 0)));
            C10953k0 H = new C11466l(1, ArraysKt___ArraysKt.m39491We(jArr)).iterator();
            while (H.hasNext()) {
                R r2 = (Comparable) lVar.invoke(C11588t1.m44992g(C11662u1.m45750Q(jArr, H.mo6374c())));
                if (r.compareTo(r2) > 0) {
                    r = r2;
                }
            }
            return r;
        }
        throw new NoSuchElementException();
    }

    @C11531s
    @C11110f
    @C11665v0(version = "1.4")
    /* renamed from: f8 */
    public static final long[] m41971f8(long[] jArr, C11300l<? super C11588t1, C11079d2> lVar) {
        Intrinsics.checkNotNullParameter(jArr, "$this$onEach");
        Intrinsics.checkNotNullParameter(lVar, "action");
        int X = C11662u1.m45751X(jArr);
        for (int i = 0; i < X; i++) {
            lVar.invoke(C11588t1.m44992g(C11662u1.m45750Q(jArr, i)));
        }
        return jArr;
    }

    @C11531s
    @C11110f
    @C11665v0(version = "1.3")
    /* renamed from: f9 */
    public static final int m41972f9(int[] iArr, C11304p<? super C11419p1, ? super C11419p1, C11419p1> pVar) {
        Intrinsics.checkNotNullParameter(iArr, "$this$reduceRight");
        Intrinsics.checkNotNullParameter(pVar, "operation");
        int Ve = ArraysKt___ArraysKt.m39459Ve(iArr);
        if (Ve >= 0) {
            int Q = C11431q1.m44044Q(iArr, Ve);
            for (int i = Ve - 1; i >= 0; i--) {
                Q = pVar.invoke(C11419p1.m43993g(C11431q1.m44044Q(iArr, i)), C11419p1.m43993g(Q)).mo22930j2();
            }
            return Q;
        }
        throw new UnsupportedOperationException("Empty array can't be reduced.");
    }

    /* JADX WARNING: type inference failed for: r7v0, types: [kotlin.jvm.functions.q, java.lang.Object, kotlin.jvm.functions.q<? super java.lang.Integer, ? super R, ? super kotlin.z1, ? extends R>] */
    /* JADX WARNING: Unknown variable types count: 1 */
    @kotlin.C11531s
    @kotlin.internal.C11110f
    @kotlin.C11665v0(version = "1.4")
    @kotlin.C11097g2(markerClass = {kotlin.C11429q.class})
    /* renamed from: fa */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final <R> java.util.List<R> m41973fa(short[] r5, R r6, kotlin.jvm.functions.C11305q<? super java.lang.Integer, ? super R, ? super kotlin.C11679z1, ? extends R> r7) {
        /*
            java.lang.String r0 = "$this$scanIndexed"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
            java.lang.String r0 = "operation"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r0)
            boolean r0 = kotlin.C10857a2.m38731h0(r5)
            if (r0 == 0) goto L_0x0015
            java.util.List r5 = kotlin.collections.C10976s.m41419k(r6)
            goto L_0x0041
        L_0x0015:
            java.util.ArrayList r0 = new java.util.ArrayList
            int r1 = kotlin.C10857a2.m38727X(r5)
            int r1 = r1 + 1
            r0.<init>(r1)
            r0.add(r6)
            int r1 = kotlin.C10857a2.m38727X(r5)
            r2 = 0
        L_0x0028:
            if (r2 >= r1) goto L_0x0040
            java.lang.Integer r3 = java.lang.Integer.valueOf(r2)
            short r4 = kotlin.C10857a2.m38726Q(r5, r2)
            kotlin.z1 r4 = kotlin.C11679z1.m45862g(r4)
            java.lang.Object r6 = r7.invoke(r3, r6, r4)
            r0.add(r6)
            int r2 = r2 + 1
            goto L_0x0028
        L_0x0040:
            r5 = r0
        L_0x0041:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.collections.unsigned.UArraysKt___UArraysKt.m41973fa(short[], java.lang.Object, kotlin.jvm.functions.q):java.util.List");
    }

    @C11531s
    @C11665v0(version = "1.4")
    /* renamed from: fb */
    public static final void m41974fb(@C12579k int[] iArr, int i, int i2) {
        Intrinsics.checkNotNullParameter(iArr, "$this$sort");
        C10904b.f28138a.mo22058d(i, i2, C11431q1.m44045X(iArr));
        C10943h1.m40961l(iArr, i, i2);
    }

    @C11531s
    @C11110f
    @C11665v0(version = "1.5")
    @C11403m0
    @C11314h(name = "sumOfUInt")
    @C11097g2(markerClass = {C11531s.class})
    /* renamed from: fc */
    public static final int m41975fc(byte[] bArr, C11300l<? super C11400l1, C11419p1> lVar) {
        Intrinsics.checkNotNullParameter(bArr, "$this$sumOf");
        Intrinsics.checkNotNullParameter(lVar, "selector");
        int M = C11419p1.m43971M(0);
        int X = C11404m1.m43809X(bArr);
        for (int i = 0; i < X; i++) {
            M = C11419p1.m43971M(M + lVar.invoke(C11400l1.m43782g(C11404m1.m43808Q(bArr, i))).mo22930j2());
        }
        return M;
    }

    @C11531s
    @C11110f
    @C11665v0(version = "1.3")
    /* renamed from: fd */
    public static final <V> List<V> m41976fd(byte[] bArr, byte[] bArr2, C11304p<? super C11400l1, ? super C11400l1, ? extends V> pVar) {
        Intrinsics.checkNotNullParameter(bArr, "$this$zip");
        Intrinsics.checkNotNullParameter(bArr2, "other");
        Intrinsics.checkNotNullParameter(pVar, "transform");
        int min = Math.min(C11404m1.m43809X(bArr), C11404m1.m43809X(bArr2));
        ArrayList arrayList = new ArrayList(min);
        for (int i = 0; i < min; i++) {
            arrayList.add(pVar.invoke(C11400l1.m43782g(C11404m1.m43808Q(bArr, i)), C11400l1.m43782g(C11404m1.m43808Q(bArr2, i))));
        }
        return arrayList;
    }

    @C11531s
    @C11110f
    @C11665v0(version = "1.3")
    /* renamed from: g0 */
    public static final boolean m41977g0(short[] sArr) {
        Intrinsics.checkNotNullParameter(sArr, "$this$any");
        return ArraysKt___ArraysKt.m39353S5(sArr);
    }

    @C11531s
    @C11110f
    @C11665v0(version = "1.3")
    /* renamed from: g2 */
    public static final long m41979g2(long[] jArr, int i, C11300l<? super Integer, C11588t1> lVar) {
        Intrinsics.checkNotNullParameter(jArr, "$this$elementAtOrElse");
        Intrinsics.checkNotNullParameter(lVar, "defaultValue");
        if (i < 0 || i > ArraysKt___ArraysKt.m39491We(jArr)) {
            return lVar.invoke(Integer.valueOf(i)).mo23301j2();
        }
        return C11662u1.m45750Q(jArr, i);
    }

    @C11531s
    @C11110f
    @C11665v0(version = "1.3")
    /* renamed from: g3 */
    public static final short m41980g3(short[] sArr) {
        Intrinsics.checkNotNullParameter(sArr, "$this$first");
        return C11679z1.m45841M(ArraysKt___ArraysKt.m40242uc(sArr));
    }

    @C12579k
    /* renamed from: g4 */
    public static final C11466l m41981g4(@C12579k byte[] bArr) {
        Intrinsics.checkNotNullParameter(bArr, "$this$indices");
        return ArraysKt___ArraysKt.m39043Ie(bArr);
    }

    @C11531s
    @C11110f
    @C11665v0(version = "1.3")
    /* renamed from: g5 */
    public static final byte m41982g5(byte[] bArr, C11300l<? super C11400l1, Boolean> lVar) {
        Intrinsics.checkNotNullParameter(bArr, "$this$last");
        Intrinsics.checkNotNullParameter(lVar, "predicate");
        int X = C11404m1.m43809X(bArr) - 1;
        if (X >= 0) {
            while (true) {
                int i = X - 1;
                byte Q = C11404m1.m43808Q(bArr, X);
                if (!lVar.invoke(C11400l1.m43782g(Q)).booleanValue()) {
                    if (i < 0) {
                        break;
                    }
                    X = i;
                } else {
                    return Q;
                }
            }
        }
        throw new NoSuchElementException("Array contains no element matching the predicate.");
    }

    @C11531s
    @C11110f
    @C11665v0(version = "1.4")
    @C11403m0
    /* renamed from: g6 */
    public static final float m41983g6(short[] sArr, C11300l<? super C11679z1, Float> lVar) {
        Intrinsics.checkNotNullParameter(sArr, "$this$maxOf");
        Intrinsics.checkNotNullParameter(lVar, "selector");
        if (!C10857a2.m38731h0(sArr)) {
            float floatValue = lVar.invoke(C11679z1.m45862g(C10857a2.m38726Q(sArr, 0))).floatValue();
            C10953k0 H = new C11466l(1, ArraysKt___ArraysKt.m39555Ye(sArr)).iterator();
            while (H.hasNext()) {
                floatValue = Math.max(floatValue, lVar.invoke(C11679z1.m45862g(C10857a2.m38726Q(sArr, H.mo6374c()))).floatValue());
            }
            return floatValue;
        }
        throw new NoSuchElementException();
    }

    @C11531s
    @C11110f
    @C11665v0(version = "1.4")
    @C11403m0
    /* renamed from: g7 */
    public static final double m41984g7(int[] iArr, C11300l<? super C11419p1, Double> lVar) {
        Intrinsics.checkNotNullParameter(iArr, "$this$minOf");
        Intrinsics.checkNotNullParameter(lVar, "selector");
        if (!C11431q1.m44049h0(iArr)) {
            double doubleValue = lVar.invoke(C11419p1.m43993g(C11431q1.m44044Q(iArr, 0))).doubleValue();
            C10953k0 H = new C11466l(1, ArraysKt___ArraysKt.m39459Ve(iArr)).iterator();
            while (H.hasNext()) {
                doubleValue = Math.min(doubleValue, lVar.invoke(C11419p1.m43993g(C11431q1.m44044Q(iArr, H.mo6374c()))).doubleValue());
            }
            return doubleValue;
        }
        throw new NoSuchElementException();
    }

    @C11531s
    @C11110f
    @C11665v0(version = "1.4")
    /* renamed from: g8 */
    public static final int[] m41985g8(int[] iArr, C11300l<? super C11419p1, C11079d2> lVar) {
        Intrinsics.checkNotNullParameter(iArr, "$this$onEach");
        Intrinsics.checkNotNullParameter(lVar, "action");
        int X = C11431q1.m44045X(iArr);
        for (int i = 0; i < X; i++) {
            lVar.invoke(C11419p1.m43993g(C11431q1.m44044Q(iArr, i)));
        }
        return iArr;
    }

    @C11531s
    @C11110f
    @C11665v0(version = "1.3")
    /* renamed from: g9 */
    public static final long m41986g9(long[] jArr, C11304p<? super C11588t1, ? super C11588t1, C11588t1> pVar) {
        Intrinsics.checkNotNullParameter(jArr, "$this$reduceRight");
        Intrinsics.checkNotNullParameter(pVar, "operation");
        int We = ArraysKt___ArraysKt.m39491We(jArr);
        if (We >= 0) {
            long Q = C11662u1.m45750Q(jArr, We);
            for (int i = We - 1; i >= 0; i--) {
                Q = pVar.invoke(C11588t1.m44992g(C11662u1.m45750Q(jArr, i)), C11588t1.m44992g(Q)).mo23301j2();
            }
            return Q;
        }
        throw new UnsupportedOperationException("Empty array can't be reduced.");
    }

    /* JADX WARNING: type inference failed for: r8v0, types: [kotlin.jvm.functions.q, java.lang.Object, kotlin.jvm.functions.q<? super java.lang.Integer, ? super R, ? super kotlin.t1, ? extends R>] */
    /* JADX WARNING: Unknown variable types count: 1 */
    @kotlin.C11531s
    @kotlin.internal.C11110f
    @kotlin.C11665v0(version = "1.4")
    @kotlin.C11097g2(markerClass = {kotlin.C11429q.class})
    /* renamed from: ga */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final <R> java.util.List<R> m41987ga(long[] r6, R r7, kotlin.jvm.functions.C11305q<? super java.lang.Integer, ? super R, ? super kotlin.C11588t1, ? extends R> r8) {
        /*
            java.lang.String r0 = "$this$scanIndexed"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r0)
            java.lang.String r0 = "operation"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r0)
            boolean r0 = kotlin.C11662u1.m45755h0(r6)
            if (r0 == 0) goto L_0x0015
            java.util.List r6 = kotlin.collections.C10976s.m41419k(r7)
            goto L_0x0041
        L_0x0015:
            java.util.ArrayList r0 = new java.util.ArrayList
            int r1 = kotlin.C11662u1.m45751X(r6)
            int r1 = r1 + 1
            r0.<init>(r1)
            r0.add(r7)
            int r1 = kotlin.C11662u1.m45751X(r6)
            r2 = 0
        L_0x0028:
            if (r2 >= r1) goto L_0x0040
            java.lang.Integer r3 = java.lang.Integer.valueOf(r2)
            long r4 = kotlin.C11662u1.m45750Q(r6, r2)
            kotlin.t1 r4 = kotlin.C11588t1.m44992g(r4)
            java.lang.Object r7 = r8.invoke(r3, r7, r4)
            r0.add(r7)
            int r2 = r2 + 1
            goto L_0x0028
        L_0x0040:
            r6 = r0
        L_0x0041:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.collections.unsigned.UArraysKt___UArraysKt.m41987ga(long[], java.lang.Object, kotlin.jvm.functions.q):java.util.List");
    }

    /* renamed from: gb */
    public static /* synthetic */ void m41988gb(int[] iArr, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = 0;
        }
        if ((i3 & 2) != 0) {
            i2 = C11431q1.m44045X(iArr);
        }
        m41974fb(iArr, i, i2);
    }

    @C11531s
    @C11110f
    @C11665v0(version = "1.5")
    @C11403m0
    @C11314h(name = "sumOfUInt")
    @C11097g2(markerClass = {C11531s.class})
    /* renamed from: gc */
    public static final int m41989gc(int[] iArr, C11300l<? super C11419p1, C11419p1> lVar) {
        Intrinsics.checkNotNullParameter(iArr, "$this$sumOf");
        Intrinsics.checkNotNullParameter(lVar, "selector");
        int M = C11419p1.m43971M(0);
        int X = C11431q1.m44045X(iArr);
        for (int i = 0; i < X; i++) {
            M = C11419p1.m43971M(M + lVar.invoke(C11419p1.m43993g(C11431q1.m44044Q(iArr, i))).mo22930j2());
        }
        return M;
    }

    @C11531s
    @C11665v0(version = "1.3")
    @C12579k
    /* renamed from: gd */
    public static final <R> List<Pair<C11679z1, R>> m41990gd(@C12579k short[] sArr, @C12579k Iterable<? extends R> iterable) {
        Intrinsics.checkNotNullParameter(sArr, "$this$zip");
        Intrinsics.checkNotNullParameter(iterable, "other");
        int X = C10857a2.m38727X(sArr);
        ArrayList arrayList = new ArrayList(Math.min(C10978t.m41495Y(iterable, 10), X));
        int i = 0;
        for (Object next : iterable) {
            if (i >= X) {
                break;
            }
            arrayList.add(C11078d1.m42659a(C11679z1.m45862g(C10857a2.m38726Q(sArr, i)), next));
            i++;
        }
        return arrayList;
    }

    @C11531s
    @C11110f
    @C11665v0(version = "1.3")
    /* renamed from: h0 */
    public static final boolean m41991h0(short[] sArr, C11300l<? super C11679z1, Boolean> lVar) {
        Intrinsics.checkNotNullParameter(sArr, "$this$any");
        Intrinsics.checkNotNullParameter(lVar, "predicate");
        int X = C10857a2.m38727X(sArr);
        for (int i = 0; i < X; i++) {
            if (lVar.invoke(C11679z1.m45862g(C10857a2.m38726Q(sArr, i))).booleanValue()) {
                return true;
            }
        }
        return false;
    }

    @C11531s
    @C11665v0(version = "1.4")
    /* renamed from: h1 */
    public static final int m41992h1(@C12580l long[] jArr) {
        if (jArr == null) {
            jArr = null;
        }
        return Arrays.hashCode(jArr);
    }

    @C11531s
    @C11110f
    @C11665v0(version = "1.3")
    /* renamed from: h2 */
    public static final byte m41993h2(byte[] bArr, int i, C11300l<? super Integer, C11400l1> lVar) {
        Intrinsics.checkNotNullParameter(bArr, "$this$elementAtOrElse");
        Intrinsics.checkNotNullParameter(lVar, "defaultValue");
        if (i < 0 || i > ArraysKt___ArraysKt.m39331Re(bArr)) {
            return lVar.invoke(Integer.valueOf(i)).mo22897e2();
        }
        return C11404m1.m43808Q(bArr, i);
    }

    @C11531s
    @C11110f
    @C11665v0(version = "1.3")
    /* renamed from: h3 */
    public static final short m41994h3(short[] sArr, C11300l<? super C11679z1, Boolean> lVar) {
        Intrinsics.checkNotNullParameter(sArr, "$this$first");
        Intrinsics.checkNotNullParameter(lVar, "predicate");
        int X = C10857a2.m38727X(sArr);
        for (int i = 0; i < X; i++) {
            short Q = C10857a2.m38726Q(sArr, i);
            if (lVar.invoke(C11679z1.m45862g(Q)).booleanValue()) {
                return Q;
            }
        }
        throw new NoSuchElementException("Array contains no element matching the predicate.");
    }

    @C11531s
    @C11665v0(version = "1.3")
    /* renamed from: h4 */
    public static /* synthetic */ void m41995h4(byte[] bArr) {
    }

    @C11531s
    @C11110f
    @C11665v0(version = "1.3")
    /* renamed from: h5 */
    public static final long m41996h5(long[] jArr, C11300l<? super C11588t1, Boolean> lVar) {
        Intrinsics.checkNotNullParameter(jArr, "$this$last");
        Intrinsics.checkNotNullParameter(lVar, "predicate");
        int X = C11662u1.m45751X(jArr) - 1;
        if (X >= 0) {
            while (true) {
                int i = X - 1;
                long Q = C11662u1.m45750Q(jArr, X);
                if (!lVar.invoke(C11588t1.m44992g(Q)).booleanValue()) {
                    if (i < 0) {
                        break;
                    }
                    X = i;
                } else {
                    return Q;
                }
            }
        }
        throw new NoSuchElementException("Array contains no element matching the predicate.");
    }

    @C11531s
    @C11110f
    @C11665v0(version = "1.4")
    @C11403m0
    /* renamed from: h6 */
    public static final <R extends Comparable<? super R>> R m41997h6(short[] sArr, C11300l<? super C11679z1, ? extends R> lVar) {
        Intrinsics.checkNotNullParameter(sArr, "$this$maxOf");
        Intrinsics.checkNotNullParameter(lVar, "selector");
        if (!C10857a2.m38731h0(sArr)) {
            R r = (Comparable) lVar.invoke(C11679z1.m45862g(C10857a2.m38726Q(sArr, 0)));
            C10953k0 H = new C11466l(1, ArraysKt___ArraysKt.m39555Ye(sArr)).iterator();
            while (H.hasNext()) {
                R r2 = (Comparable) lVar.invoke(C11679z1.m45862g(C10857a2.m38726Q(sArr, H.mo6374c())));
                if (r.compareTo(r2) < 0) {
                    r = r2;
                }
            }
            return r;
        }
        throw new NoSuchElementException();
    }

    @C11531s
    @C11110f
    @C11665v0(version = "1.4")
    @C11403m0
    /* renamed from: h7 */
    public static final float m41998h7(int[] iArr, C11300l<? super C11419p1, Float> lVar) {
        Intrinsics.checkNotNullParameter(iArr, "$this$minOf");
        Intrinsics.checkNotNullParameter(lVar, "selector");
        if (!C11431q1.m44049h0(iArr)) {
            float floatValue = lVar.invoke(C11419p1.m43993g(C11431q1.m44044Q(iArr, 0))).floatValue();
            C10953k0 H = new C11466l(1, ArraysKt___ArraysKt.m39459Ve(iArr)).iterator();
            while (H.hasNext()) {
                floatValue = Math.min(floatValue, lVar.invoke(C11419p1.m43993g(C11431q1.m44044Q(iArr, H.mo6374c()))).floatValue());
            }
            return floatValue;
        }
        throw new NoSuchElementException();
    }

    @C11531s
    @C11110f
    @C11665v0(version = "1.4")
    /* renamed from: h8 */
    public static final short[] m41999h8(short[] sArr, C11300l<? super C11679z1, C11079d2> lVar) {
        Intrinsics.checkNotNullParameter(sArr, "$this$onEach");
        Intrinsics.checkNotNullParameter(lVar, "action");
        int X = C10857a2.m38727X(sArr);
        for (int i = 0; i < X; i++) {
            lVar.invoke(C11679z1.m45862g(C10857a2.m38726Q(sArr, i)));
        }
        return sArr;
    }

    @C11531s
    @C11110f
    @C11665v0(version = "1.3")
    /* renamed from: h9 */
    public static final short m42000h9(short[] sArr, C11304p<? super C11679z1, ? super C11679z1, C11679z1> pVar) {
        Intrinsics.checkNotNullParameter(sArr, "$this$reduceRight");
        Intrinsics.checkNotNullParameter(pVar, "operation");
        int Ye = ArraysKt___ArraysKt.m39555Ye(sArr);
        if (Ye >= 0) {
            short Q = C10857a2.m38726Q(sArr, Ye);
            for (int i = Ye - 1; i >= 0; i--) {
                Q = pVar.invoke(C11679z1.m45862g(C10857a2.m38726Q(sArr, i)), C11679z1.m45862g(Q)).mo23548e2();
            }
            return Q;
        }
        throw new UnsupportedOperationException("Empty array can't be reduced.");
    }

    /* JADX WARNING: type inference failed for: r7v0, types: [kotlin.jvm.functions.q, java.lang.Object, kotlin.jvm.functions.q<? super java.lang.Integer, ? super R, ? super kotlin.p1, ? extends R>] */
    /* JADX WARNING: Unknown variable types count: 1 */
    @kotlin.C11531s
    @kotlin.internal.C11110f
    @kotlin.C11665v0(version = "1.4")
    @kotlin.C11097g2(markerClass = {kotlin.C11429q.class})
    /* renamed from: ha */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final <R> java.util.List<R> m42001ha(int[] r5, R r6, kotlin.jvm.functions.C11305q<? super java.lang.Integer, ? super R, ? super kotlin.C11419p1, ? extends R> r7) {
        /*
            java.lang.String r0 = "$this$scanIndexed"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
            java.lang.String r0 = "operation"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r0)
            boolean r0 = kotlin.C11431q1.m44049h0(r5)
            if (r0 == 0) goto L_0x0015
            java.util.List r5 = kotlin.collections.C10976s.m41419k(r6)
            goto L_0x0041
        L_0x0015:
            java.util.ArrayList r0 = new java.util.ArrayList
            int r1 = kotlin.C11431q1.m44045X(r5)
            int r1 = r1 + 1
            r0.<init>(r1)
            r0.add(r6)
            int r1 = kotlin.C11431q1.m44045X(r5)
            r2 = 0
        L_0x0028:
            if (r2 >= r1) goto L_0x0040
            java.lang.Integer r3 = java.lang.Integer.valueOf(r2)
            int r4 = kotlin.C11431q1.m44044Q(r5, r2)
            kotlin.p1 r4 = kotlin.C11419p1.m43993g(r4)
            java.lang.Object r6 = r7.invoke(r3, r6, r4)
            r0.add(r6)
            int r2 = r2 + 1
            goto L_0x0028
        L_0x0040:
            r5 = r0
        L_0x0041:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.collections.unsigned.UArraysKt___UArraysKt.m42001ha(int[], java.lang.Object, kotlin.jvm.functions.q):java.util.List");
    }

    @C11531s
    @C11665v0(version = "1.3")
    /* renamed from: hb */
    public static final void m42002hb(@C12579k short[] sArr) {
        Intrinsics.checkNotNullParameter(sArr, "$this$sort");
        if (C10857a2.m38727X(sArr) > 1) {
            C10943h1.m40960k(sArr, 0, C10857a2.m38727X(sArr));
        }
    }

    @C11531s
    @C11110f
    @C11665v0(version = "1.5")
    @C11403m0
    @C11314h(name = "sumOfUInt")
    @C11097g2(markerClass = {C11531s.class})
    /* renamed from: hc */
    public static final int m42003hc(long[] jArr, C11300l<? super C11588t1, C11419p1> lVar) {
        Intrinsics.checkNotNullParameter(jArr, "$this$sumOf");
        Intrinsics.checkNotNullParameter(lVar, "selector");
        int M = C11419p1.m43971M(0);
        int X = C11662u1.m45751X(jArr);
        for (int i = 0; i < X; i++) {
            M = C11419p1.m43971M(M + lVar.invoke(C11588t1.m44992g(C11662u1.m45750Q(jArr, i))).mo22930j2());
        }
        return M;
    }

    @C11531s
    @C11665v0(version = "1.3")
    @C12579k
    /* renamed from: hd */
    public static final <R> List<Pair<C11400l1, R>> m42004hd(@C12579k byte[] bArr, @C12579k Iterable<? extends R> iterable) {
        Intrinsics.checkNotNullParameter(bArr, "$this$zip");
        Intrinsics.checkNotNullParameter(iterable, "other");
        int X = C11404m1.m43809X(bArr);
        ArrayList arrayList = new ArrayList(Math.min(C10978t.m41495Y(iterable, 10), X));
        int i = 0;
        for (Object next : iterable) {
            if (i >= X) {
                break;
            }
            arrayList.add(C11078d1.m42659a(C11400l1.m43782g(C11404m1.m43808Q(bArr, i)), next));
            i++;
        }
        return arrayList;
    }

    @C11531s
    @C11110f
    @C11665v0(version = "1.3")
    /* renamed from: i0 */
    public static final byte[] m42005i0(byte[] bArr) {
        Intrinsics.checkNotNullParameter(bArr, "$this$asByteArray");
        return bArr;
    }

    @C11531s
    @C11110f
    @C11665v0(version = "1.3")
    /* renamed from: i2 */
    public static final C11400l1 m42007i2(byte[] bArr, int i) {
        Intrinsics.checkNotNullParameter(bArr, "$this$elementAtOrNull");
        return m42233y4(bArr, i);
    }

    @C11531s
    @C12580l
    @C11665v0(version = "1.3")
    /* renamed from: i3 */
    public static final C11419p1 m42008i3(@C12579k int[] iArr) {
        Intrinsics.checkNotNullParameter(iArr, "$this$firstOrNull");
        if (C11431q1.m44049h0(iArr)) {
            return null;
        }
        return C11419p1.m43993g(C11431q1.m44044Q(iArr, 0));
    }

    @C12579k
    /* renamed from: i4 */
    public static final C11466l m42009i4(@C12579k long[] jArr) {
        Intrinsics.checkNotNullParameter(jArr, "$this$indices");
        return ArraysKt___ArraysKt.m39203Ne(jArr);
    }

    @C11531s
    @C11110f
    @C11665v0(version = "1.3")
    /* renamed from: i5 */
    public static final long m42010i5(long[] jArr) {
        Intrinsics.checkNotNullParameter(jArr, "$this$last");
        return C11588t1.m44970M(ArraysKt___ArraysKt.m39590Zh(jArr));
    }

    @C11531s
    @C11110f
    @C11665v0(version = "1.4")
    @C11403m0
    /* renamed from: i6 */
    public static final <R extends Comparable<? super R>> R m42011i6(byte[] bArr, C11300l<? super C11400l1, ? extends R> lVar) {
        Intrinsics.checkNotNullParameter(bArr, "$this$maxOfOrNull");
        Intrinsics.checkNotNullParameter(lVar, "selector");
        if (C11404m1.m43813h0(bArr)) {
            return null;
        }
        R r = (Comparable) lVar.invoke(C11400l1.m43782g(C11404m1.m43808Q(bArr, 0)));
        C10953k0 H = new C11466l(1, ArraysKt___ArraysKt.m39331Re(bArr)).iterator();
        while (H.hasNext()) {
            R r2 = (Comparable) lVar.invoke(C11400l1.m43782g(C11404m1.m43808Q(bArr, H.mo6374c())));
            if (r.compareTo(r2) < 0) {
                r = r2;
            }
        }
        return r;
    }

    @C11531s
    @C11110f
    @C11665v0(version = "1.4")
    @C11403m0
    /* renamed from: i7 */
    public static final <R extends Comparable<? super R>> R m42012i7(int[] iArr, C11300l<? super C11419p1, ? extends R> lVar) {
        Intrinsics.checkNotNullParameter(iArr, "$this$minOf");
        Intrinsics.checkNotNullParameter(lVar, "selector");
        if (!C11431q1.m44049h0(iArr)) {
            R r = (Comparable) lVar.invoke(C11419p1.m43993g(C11431q1.m44044Q(iArr, 0)));
            C10953k0 H = new C11466l(1, ArraysKt___ArraysKt.m39459Ve(iArr)).iterator();
            while (H.hasNext()) {
                R r2 = (Comparable) lVar.invoke(C11419p1.m43993g(C11431q1.m44044Q(iArr, H.mo6374c())));
                if (r.compareTo(r2) > 0) {
                    r = r2;
                }
            }
            return r;
        }
        throw new NoSuchElementException();
    }

    @C11531s
    @C11110f
    @C11665v0(version = "1.4")
    /* renamed from: i8 */
    public static final byte[] m42013i8(byte[] bArr, C11304p<? super Integer, ? super C11400l1, C11079d2> pVar) {
        Intrinsics.checkNotNullParameter(bArr, "$this$onEachIndexed");
        Intrinsics.checkNotNullParameter(pVar, "action");
        int X = C11404m1.m43809X(bArr);
        int i = 0;
        int i2 = 0;
        while (i < X) {
            pVar.invoke(Integer.valueOf(i2), C11400l1.m43782g(C11404m1.m43808Q(bArr, i)));
            i++;
            i2++;
        }
        return bArr;
    }

    @C11531s
    @C11110f
    @C11665v0(version = "1.3")
    /* renamed from: i9 */
    public static final int m42014i9(int[] iArr, C11305q<? super Integer, ? super C11419p1, ? super C11419p1, C11419p1> qVar) {
        Intrinsics.checkNotNullParameter(iArr, "$this$reduceRightIndexed");
        Intrinsics.checkNotNullParameter(qVar, "operation");
        int Ve = ArraysKt___ArraysKt.m39459Ve(iArr);
        if (Ve >= 0) {
            int Q = C11431q1.m44044Q(iArr, Ve);
            for (int i = Ve - 1; i >= 0; i--) {
                Q = qVar.invoke(Integer.valueOf(i), C11419p1.m43993g(C11431q1.m44044Q(iArr, i)), C11419p1.m43993g(Q)).mo22930j2();
            }
            return Q;
        }
        throw new UnsupportedOperationException("Empty array can't be reduced.");
    }

    @C11531s
    @C11665v0(version = "1.4")
    /* renamed from: ia */
    public static final void m42015ia(@C12579k int[] iArr) {
        Intrinsics.checkNotNullParameter(iArr, "$this$shuffle");
        m42029ja(iArr, Random.f28564a);
    }

    @C11531s
    @C11665v0(version = "1.3")
    /* renamed from: ib */
    public static final void m42016ib(@C12579k int[] iArr) {
        Intrinsics.checkNotNullParameter(iArr, "$this$sortDescending");
        if (C11431q1.m44045X(iArr) > 1) {
            m41848Wa(iArr);
            ArraysKt___ArraysKt.m40385yr(iArr);
        }
    }

    @C11097g2(markerClass = {C11531s.class})
    @C11314h(name = "sumOfUInt")
    @C11665v0(version = "1.5")
    /* renamed from: ic */
    public static final int m42017ic(@C12579k C11419p1[] p1VarArr) {
        Intrinsics.checkNotNullParameter(p1VarArr, "<this>");
        int i = 0;
        for (C11419p1 j2 : p1VarArr) {
            i = C11419p1.m43971M(i + j2.mo22930j2());
        }
        return i;
    }

    @C11531s
    @C11110f
    @C11665v0(version = "1.3")
    /* renamed from: id */
    public static final <V> List<V> m42018id(int[] iArr, int[] iArr2, C11304p<? super C11419p1, ? super C11419p1, ? extends V> pVar) {
        Intrinsics.checkNotNullParameter(iArr, "$this$zip");
        Intrinsics.checkNotNullParameter(iArr2, "other");
        Intrinsics.checkNotNullParameter(pVar, "transform");
        int min = Math.min(C11431q1.m44045X(iArr), C11431q1.m44045X(iArr2));
        ArrayList arrayList = new ArrayList(min);
        for (int i = 0; i < min; i++) {
            arrayList.add(pVar.invoke(C11419p1.m43993g(C11431q1.m44044Q(iArr, i)), C11419p1.m43993g(C11431q1.m44044Q(iArr2, i))));
        }
        return arrayList;
    }

    @C11531s
    @C11110f
    @C11665v0(version = "1.3")
    /* renamed from: j0 */
    public static final int[] m42019j0(int[] iArr) {
        Intrinsics.checkNotNullParameter(iArr, "$this$asIntArray");
        return iArr;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:1:0x0002, code lost:
        r9 = kotlin.collections.CollectionsKt___CollectionsKt.m40639h3(kotlin.C11404m1.m43812h(r9), ", ", "[", "]", 0, (java.lang.CharSequence) null, (kotlin.jvm.functions.C11300l) null, 56, (java.lang.Object) null);
     */
    @kotlin.C11531s
    @kotlin.C11665v0(version = "1.4")
    @org.jetbrains.annotations.C12579k
    /* renamed from: j1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.String m42020j1(@org.jetbrains.annotations.C12580l byte[] r9) {
        /*
            if (r9 == 0) goto L_0x0018
            kotlin.m1 r0 = kotlin.C11404m1.m43812h(r9)
            java.lang.String r1 = ", "
            java.lang.String r2 = "["
            java.lang.String r3 = "]"
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 56
            r8 = 0
            java.lang.String r9 = kotlin.collections.CollectionsKt___CollectionsKt.m40639h3(r0, r1, r2, r3, r4, r5, r6, r7, r8)
            if (r9 != 0) goto L_0x001a
        L_0x0018:
            java.lang.String r9 = "null"
        L_0x001a:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.collections.unsigned.UArraysKt___UArraysKt.m42020j1(byte[]):java.lang.String");
    }

    @C11531s
    @C11110f
    @C11665v0(version = "1.3")
    /* renamed from: j2 */
    public static final C11679z1 m42021j2(short[] sArr, int i) {
        Intrinsics.checkNotNullParameter(sArr, "$this$elementAtOrNull");
        return m42246z4(sArr, i);
    }

    @C11531s
    @C12580l
    @C11665v0(version = "1.3")
    /* renamed from: j3 */
    public static final C11400l1 m42022j3(@C12579k byte[] bArr) {
        Intrinsics.checkNotNullParameter(bArr, "$this$firstOrNull");
        if (C11404m1.m43813h0(bArr)) {
            return null;
        }
        return C11400l1.m43782g(C11404m1.m43808Q(bArr, 0));
    }

    @C11531s
    @C11665v0(version = "1.3")
    /* renamed from: j4 */
    public static /* synthetic */ void m42023j4(long[] jArr) {
    }

    @C11531s
    @C11110f
    @C11665v0(version = "1.3")
    /* renamed from: j5 */
    public static final int m42024j5(int[] iArr, C11300l<? super C11419p1, Boolean> lVar) {
        Intrinsics.checkNotNullParameter(iArr, "$this$last");
        Intrinsics.checkNotNullParameter(lVar, "predicate");
        int X = C11431q1.m44045X(iArr) - 1;
        if (X >= 0) {
            while (true) {
                int i = X - 1;
                int Q = C11431q1.m44044Q(iArr, X);
                if (!lVar.invoke(C11419p1.m43993g(Q)).booleanValue()) {
                    if (i < 0) {
                        break;
                    }
                    X = i;
                } else {
                    return Q;
                }
            }
        }
        throw new NoSuchElementException("Array contains no element matching the predicate.");
    }

    @C11531s
    @C11110f
    @C11665v0(version = "1.4")
    @C11403m0
    /* renamed from: j6 */
    public static final Double m42025j6(byte[] bArr, C11300l<? super C11400l1, Double> lVar) {
        Intrinsics.checkNotNullParameter(bArr, "$this$maxOfOrNull");
        Intrinsics.checkNotNullParameter(lVar, "selector");
        if (C11404m1.m43813h0(bArr)) {
            return null;
        }
        double doubleValue = lVar.invoke(C11400l1.m43782g(C11404m1.m43808Q(bArr, 0))).doubleValue();
        C10953k0 H = new C11466l(1, ArraysKt___ArraysKt.m39331Re(bArr)).iterator();
        while (H.hasNext()) {
            doubleValue = Math.max(doubleValue, lVar.invoke(C11400l1.m43782g(C11404m1.m43808Q(bArr, H.mo6374c()))).doubleValue());
        }
        return Double.valueOf(doubleValue);
    }

    @C11531s
    @C11110f
    @C11665v0(version = "1.4")
    @C11403m0
    /* renamed from: j7 */
    public static final double m42026j7(short[] sArr, C11300l<? super C11679z1, Double> lVar) {
        Intrinsics.checkNotNullParameter(sArr, "$this$minOf");
        Intrinsics.checkNotNullParameter(lVar, "selector");
        if (!C10857a2.m38731h0(sArr)) {
            double doubleValue = lVar.invoke(C11679z1.m45862g(C10857a2.m38726Q(sArr, 0))).doubleValue();
            C10953k0 H = new C11466l(1, ArraysKt___ArraysKt.m39555Ye(sArr)).iterator();
            while (H.hasNext()) {
                doubleValue = Math.min(doubleValue, lVar.invoke(C11679z1.m45862g(C10857a2.m38726Q(sArr, H.mo6374c()))).doubleValue());
            }
            return doubleValue;
        }
        throw new NoSuchElementException();
    }

    @C11531s
    @C11110f
    @C11665v0(version = "1.4")
    /* renamed from: j8 */
    public static final int[] m42027j8(int[] iArr, C11304p<? super Integer, ? super C11419p1, C11079d2> pVar) {
        Intrinsics.checkNotNullParameter(iArr, "$this$onEachIndexed");
        Intrinsics.checkNotNullParameter(pVar, "action");
        int X = C11431q1.m44045X(iArr);
        int i = 0;
        int i2 = 0;
        while (i < X) {
            pVar.invoke(Integer.valueOf(i2), C11419p1.m43993g(C11431q1.m44044Q(iArr, i)));
            i++;
            i2++;
        }
        return iArr;
    }

    @C11531s
    @C11110f
    @C11665v0(version = "1.3")
    /* renamed from: j9 */
    public static final byte m42028j9(byte[] bArr, C11305q<? super Integer, ? super C11400l1, ? super C11400l1, C11400l1> qVar) {
        Intrinsics.checkNotNullParameter(bArr, "$this$reduceRightIndexed");
        Intrinsics.checkNotNullParameter(qVar, "operation");
        int Re = ArraysKt___ArraysKt.m39331Re(bArr);
        if (Re >= 0) {
            byte Q = C11404m1.m43808Q(bArr, Re);
            for (int i = Re - 1; i >= 0; i--) {
                Q = qVar.invoke(Integer.valueOf(i), C11400l1.m43782g(C11404m1.m43808Q(bArr, i)), C11400l1.m43782g(Q)).mo22897e2();
            }
            return Q;
        }
        throw new UnsupportedOperationException("Empty array can't be reduced.");
    }

    @C11531s
    @C11665v0(version = "1.4")
    /* renamed from: ja */
    public static final void m42029ja(@C12579k int[] iArr, @C12579k Random random) {
        Intrinsics.checkNotNullParameter(iArr, "$this$shuffle");
        Intrinsics.checkNotNullParameter(random, BaseOptionModel.f27465E0);
        for (int Ve = ArraysKt___ArraysKt.m39459Ve(iArr); Ve > 0; Ve--) {
            int m = random.mo22986m(Ve + 1);
            int Q = C11431q1.m44044Q(iArr, Ve);
            C11431q1.m44052j0(iArr, Ve, C11431q1.m44044Q(iArr, m));
            C11431q1.m44052j0(iArr, m, Q);
        }
    }

    @C11531s
    @C11665v0(version = "1.4")
    /* renamed from: jb */
    public static final void m42030jb(@C12579k long[] jArr, int i, int i2) {
        Intrinsics.checkNotNullParameter(jArr, "$this$sortDescending");
        m41862Xa(jArr, i, i2);
        ArraysKt___ArraysKt.m38832Br(jArr, i, i2);
    }

    @C11531s
    @C11110f
    @C11665v0(version = "1.5")
    @C11403m0
    @C11314h(name = "sumOfUInt")
    @C11097g2(markerClass = {C11531s.class})
    /* renamed from: jc */
    public static final int m42031jc(short[] sArr, C11300l<? super C11679z1, C11419p1> lVar) {
        Intrinsics.checkNotNullParameter(sArr, "$this$sumOf");
        Intrinsics.checkNotNullParameter(lVar, "selector");
        int M = C11419p1.m43971M(0);
        int X = C10857a2.m38727X(sArr);
        for (int i = 0; i < X; i++) {
            M = C11419p1.m43971M(M + lVar.invoke(C11679z1.m45862g(C10857a2.m38726Q(sArr, i))).mo22930j2());
        }
        return M;
    }

    @C11531s
    @C11110f
    @C11665v0(version = "1.3")
    /* renamed from: jd */
    public static final <R, V> List<V> m42032jd(byte[] bArr, R[] rArr, C11304p<? super C11400l1, ? super R, ? extends V> pVar) {
        Intrinsics.checkNotNullParameter(bArr, "$this$zip");
        Intrinsics.checkNotNullParameter(rArr, "other");
        Intrinsics.checkNotNullParameter(pVar, "transform");
        int min = Math.min(C11404m1.m43809X(bArr), rArr.length);
        ArrayList arrayList = new ArrayList(min);
        for (int i = 0; i < min; i++) {
            arrayList.add(pVar.invoke(C11400l1.m43782g(C11404m1.m43808Q(bArr, i)), rArr[i]));
        }
        return arrayList;
    }

    @C11531s
    @C11110f
    @C11665v0(version = "1.3")
    /* renamed from: k0 */
    public static final long[] m42033k0(long[] jArr) {
        Intrinsics.checkNotNullParameter(jArr, "$this$asLongArray");
        return jArr;
    }

    @C11531s
    @C11110f
    @C11665v0(version = "1.3")
    /* renamed from: k2 */
    public static final C11419p1 m42035k2(int[] iArr, int i) {
        Intrinsics.checkNotNullParameter(iArr, "$this$elementAtOrNull");
        return m41555A4(iArr, i);
    }

    @C11531s
    @C11110f
    @C11665v0(version = "1.3")
    /* renamed from: k3 */
    public static final C11400l1 m42036k3(byte[] bArr, C11300l<? super C11400l1, Boolean> lVar) {
        Intrinsics.checkNotNullParameter(bArr, "$this$firstOrNull");
        Intrinsics.checkNotNullParameter(lVar, "predicate");
        int X = C11404m1.m43809X(bArr);
        for (int i = 0; i < X; i++) {
            byte Q = C11404m1.m43808Q(bArr, i);
            if (lVar.invoke(C11400l1.m43782g(Q)).booleanValue()) {
                return C11400l1.m43782g(Q);
            }
        }
        return null;
    }

    @C12579k
    /* renamed from: k4 */
    public static final C11466l m42037k4(@C12579k short[] sArr) {
        Intrinsics.checkNotNullParameter(sArr, "$this$indices");
        return ArraysKt___ArraysKt.m39267Pe(sArr);
    }

    @C11531s
    @C11110f
    @C11665v0(version = "1.3")
    /* renamed from: k5 */
    public static final short m42038k5(short[] sArr) {
        Intrinsics.checkNotNullParameter(sArr, "$this$last");
        return C11679z1.m45841M(ArraysKt___ArraysKt.m39718di(sArr));
    }

    @C11531s
    @C11110f
    @C11665v0(version = "1.4")
    @C11403m0
    /* renamed from: k6 */
    public static final Float m42039k6(byte[] bArr, C11300l<? super C11400l1, Float> lVar) {
        Intrinsics.checkNotNullParameter(bArr, "$this$maxOfOrNull");
        Intrinsics.checkNotNullParameter(lVar, "selector");
        if (C11404m1.m43813h0(bArr)) {
            return null;
        }
        float floatValue = lVar.invoke(C11400l1.m43782g(C11404m1.m43808Q(bArr, 0))).floatValue();
        C10953k0 H = new C11466l(1, ArraysKt___ArraysKt.m39331Re(bArr)).iterator();
        while (H.hasNext()) {
            floatValue = Math.max(floatValue, lVar.invoke(C11400l1.m43782g(C11404m1.m43808Q(bArr, H.mo6374c()))).floatValue());
        }
        return Float.valueOf(floatValue);
    }

    @C11531s
    @C11110f
    @C11665v0(version = "1.4")
    @C11403m0
    /* renamed from: k7 */
    public static final float m42040k7(short[] sArr, C11300l<? super C11679z1, Float> lVar) {
        Intrinsics.checkNotNullParameter(sArr, "$this$minOf");
        Intrinsics.checkNotNullParameter(lVar, "selector");
        if (!C10857a2.m38731h0(sArr)) {
            float floatValue = lVar.invoke(C11679z1.m45862g(C10857a2.m38726Q(sArr, 0))).floatValue();
            C10953k0 H = new C11466l(1, ArraysKt___ArraysKt.m39555Ye(sArr)).iterator();
            while (H.hasNext()) {
                floatValue = Math.min(floatValue, lVar.invoke(C11679z1.m45862g(C10857a2.m38726Q(sArr, H.mo6374c()))).floatValue());
            }
            return floatValue;
        }
        throw new NoSuchElementException();
    }

    @C11531s
    @C11110f
    @C11665v0(version = "1.4")
    /* renamed from: k8 */
    public static final long[] m42041k8(long[] jArr, C11304p<? super Integer, ? super C11588t1, C11079d2> pVar) {
        Intrinsics.checkNotNullParameter(jArr, "$this$onEachIndexed");
        Intrinsics.checkNotNullParameter(pVar, "action");
        int X = C11662u1.m45751X(jArr);
        int i = 0;
        int i2 = 0;
        while (i < X) {
            pVar.invoke(Integer.valueOf(i2), C11588t1.m44992g(C11662u1.m45750Q(jArr, i)));
            i++;
            i2++;
        }
        return jArr;
    }

    @C11531s
    @C11110f
    @C11665v0(version = "1.3")
    /* renamed from: k9 */
    public static final short m42042k9(short[] sArr, C11305q<? super Integer, ? super C11679z1, ? super C11679z1, C11679z1> qVar) {
        Intrinsics.checkNotNullParameter(sArr, "$this$reduceRightIndexed");
        Intrinsics.checkNotNullParameter(qVar, "operation");
        int Ye = ArraysKt___ArraysKt.m39555Ye(sArr);
        if (Ye >= 0) {
            short Q = C10857a2.m38726Q(sArr, Ye);
            for (int i = Ye - 1; i >= 0; i--) {
                Q = qVar.invoke(Integer.valueOf(i), C11679z1.m45862g(C10857a2.m38726Q(sArr, i)), C11679z1.m45862g(Q)).mo23548e2();
            }
            return Q;
        }
        throw new UnsupportedOperationException("Empty array can't be reduced.");
    }

    @C11531s
    @C11665v0(version = "1.4")
    /* renamed from: ka */
    public static final void m42043ka(@C12579k byte[] bArr) {
        Intrinsics.checkNotNullParameter(bArr, "$this$shuffle");
        m42085na(bArr, Random.f28564a);
    }

    @C11531s
    @C11665v0(version = "1.4")
    /* renamed from: kb */
    public static final void m42044kb(@C12579k byte[] bArr, int i, int i2) {
        Intrinsics.checkNotNullParameter(bArr, "$this$sortDescending");
        m41890Za(bArr, i, i2);
        ArraysKt___ArraysKt.m40164rr(bArr, i, i2);
    }

    @C11531s
    @C11110f
    @C11665v0(version = "1.5")
    @C11403m0
    @C11314h(name = "sumOfULong")
    @C11097g2(markerClass = {C11531s.class})
    /* renamed from: kc */
    public static final long m42045kc(byte[] bArr, C11300l<? super C11400l1, C11588t1> lVar) {
        Intrinsics.checkNotNullParameter(bArr, "$this$sumOf");
        Intrinsics.checkNotNullParameter(lVar, "selector");
        long M = C11588t1.m44970M(0);
        int X = C11404m1.m43809X(bArr);
        for (int i = 0; i < X; i++) {
            M = C11588t1.m44970M(M + lVar.invoke(C11400l1.m43782g(C11404m1.m43808Q(bArr, i))).mo23301j2());
        }
        return M;
    }

    @C11531s
    @C11110f
    @C11665v0(version = "1.3")
    /* renamed from: kd */
    public static final <V> List<V> m42046kd(long[] jArr, long[] jArr2, C11304p<? super C11588t1, ? super C11588t1, ? extends V> pVar) {
        Intrinsics.checkNotNullParameter(jArr, "$this$zip");
        Intrinsics.checkNotNullParameter(jArr2, "other");
        Intrinsics.checkNotNullParameter(pVar, "transform");
        int min = Math.min(C11662u1.m45751X(jArr), C11662u1.m45751X(jArr2));
        ArrayList arrayList = new ArrayList(min);
        for (int i = 0; i < min; i++) {
            arrayList.add(pVar.invoke(C11588t1.m44992g(C11662u1.m45750Q(jArr, i)), C11588t1.m44992g(C11662u1.m45750Q(jArr2, i))));
        }
        return arrayList;
    }

    @C11531s
    @C11110f
    @C11665v0(version = "1.3")
    /* renamed from: l0 */
    public static final short[] m42047l0(short[] sArr) {
        Intrinsics.checkNotNullParameter(sArr, "$this$asShortArray");
        return sArr;
    }

    @C11531s
    @C11110f
    @C11665v0(version = "1.3")
    /* renamed from: l2 */
    public static final C11588t1 m42049l2(long[] jArr, int i) {
        Intrinsics.checkNotNullParameter(jArr, "$this$elementAtOrNull");
        return m41568B4(jArr, i);
    }

    @C11531s
    @C11110f
    @C11665v0(version = "1.3")
    /* renamed from: l3 */
    public static final C11588t1 m42050l3(long[] jArr, C11300l<? super C11588t1, Boolean> lVar) {
        Intrinsics.checkNotNullParameter(jArr, "$this$firstOrNull");
        Intrinsics.checkNotNullParameter(lVar, "predicate");
        int X = C11662u1.m45751X(jArr);
        for (int i = 0; i < X; i++) {
            long Q = C11662u1.m45750Q(jArr, i);
            if (lVar.invoke(C11588t1.m44992g(Q)).booleanValue()) {
                return C11588t1.m44992g(Q);
            }
        }
        return null;
    }

    @C11531s
    @C11665v0(version = "1.3")
    /* renamed from: l4 */
    public static /* synthetic */ void m42051l4(short[] sArr) {
    }

    @C11531s
    @C11110f
    @C11665v0(version = "1.3")
    /* renamed from: l5 */
    public static final short m42052l5(short[] sArr, C11300l<? super C11679z1, Boolean> lVar) {
        Intrinsics.checkNotNullParameter(sArr, "$this$last");
        Intrinsics.checkNotNullParameter(lVar, "predicate");
        int X = C10857a2.m38727X(sArr) - 1;
        if (X >= 0) {
            while (true) {
                int i = X - 1;
                short Q = C10857a2.m38726Q(sArr, X);
                if (!lVar.invoke(C11679z1.m45862g(Q)).booleanValue()) {
                    if (i < 0) {
                        break;
                    }
                    X = i;
                } else {
                    return Q;
                }
            }
        }
        throw new NoSuchElementException("Array contains no element matching the predicate.");
    }

    @C11531s
    @C11110f
    @C11665v0(version = "1.4")
    @C11403m0
    /* renamed from: l6 */
    public static final <R extends Comparable<? super R>> R m42053l6(long[] jArr, C11300l<? super C11588t1, ? extends R> lVar) {
        Intrinsics.checkNotNullParameter(jArr, "$this$maxOfOrNull");
        Intrinsics.checkNotNullParameter(lVar, "selector");
        if (C11662u1.m45755h0(jArr)) {
            return null;
        }
        R r = (Comparable) lVar.invoke(C11588t1.m44992g(C11662u1.m45750Q(jArr, 0)));
        C10953k0 H = new C11466l(1, ArraysKt___ArraysKt.m39491We(jArr)).iterator();
        while (H.hasNext()) {
            R r2 = (Comparable) lVar.invoke(C11588t1.m44992g(C11662u1.m45750Q(jArr, H.mo6374c())));
            if (r.compareTo(r2) < 0) {
                r = r2;
            }
        }
        return r;
    }

    @C11531s
    @C11110f
    @C11665v0(version = "1.4")
    @C11403m0
    /* renamed from: l7 */
    public static final <R extends Comparable<? super R>> R m42054l7(short[] sArr, C11300l<? super C11679z1, ? extends R> lVar) {
        Intrinsics.checkNotNullParameter(sArr, "$this$minOf");
        Intrinsics.checkNotNullParameter(lVar, "selector");
        if (!C10857a2.m38731h0(sArr)) {
            R r = (Comparable) lVar.invoke(C11679z1.m45862g(C10857a2.m38726Q(sArr, 0)));
            C10953k0 H = new C11466l(1, ArraysKt___ArraysKt.m39555Ye(sArr)).iterator();
            while (H.hasNext()) {
                R r2 = (Comparable) lVar.invoke(C11679z1.m45862g(C10857a2.m38726Q(sArr, H.mo6374c())));
                if (r.compareTo(r2) > 0) {
                    r = r2;
                }
            }
            return r;
        }
        throw new NoSuchElementException();
    }

    @C11531s
    @C11110f
    @C11665v0(version = "1.4")
    /* renamed from: l8 */
    public static final short[] m42055l8(short[] sArr, C11304p<? super Integer, ? super C11679z1, C11079d2> pVar) {
        Intrinsics.checkNotNullParameter(sArr, "$this$onEachIndexed");
        Intrinsics.checkNotNullParameter(pVar, "action");
        int X = C10857a2.m38727X(sArr);
        int i = 0;
        int i2 = 0;
        while (i < X) {
            pVar.invoke(Integer.valueOf(i2), C11679z1.m45862g(C10857a2.m38726Q(sArr, i)));
            i++;
            i2++;
        }
        return sArr;
    }

    @C11531s
    @C11110f
    @C11665v0(version = "1.3")
    /* renamed from: l9 */
    public static final long m42056l9(long[] jArr, C11305q<? super Integer, ? super C11588t1, ? super C11588t1, C11588t1> qVar) {
        Intrinsics.checkNotNullParameter(jArr, "$this$reduceRightIndexed");
        Intrinsics.checkNotNullParameter(qVar, "operation");
        int We = ArraysKt___ArraysKt.m39491We(jArr);
        if (We >= 0) {
            long Q = C11662u1.m45750Q(jArr, We);
            for (int i = We - 1; i >= 0; i--) {
                Q = qVar.invoke(Integer.valueOf(i), C11588t1.m44992g(C11662u1.m45750Q(jArr, i)), C11588t1.m44992g(Q)).mo23301j2();
            }
            return Q;
        }
        throw new UnsupportedOperationException("Empty array can't be reduced.");
    }

    @C11531s
    @C11665v0(version = "1.4")
    /* renamed from: la */
    public static final void m42057la(@C12579k long[] jArr, @C12579k Random random) {
        Intrinsics.checkNotNullParameter(jArr, "$this$shuffle");
        Intrinsics.checkNotNullParameter(random, BaseOptionModel.f27465E0);
        for (int We = ArraysKt___ArraysKt.m39491We(jArr); We > 0; We--) {
            int m = random.mo22986m(We + 1);
            long Q = C11662u1.m45750Q(jArr, We);
            C11662u1.m45758j0(jArr, We, C11662u1.m45750Q(jArr, m));
            C11662u1.m45758j0(jArr, m, Q);
        }
    }

    @C11531s
    @C11665v0(version = "1.4")
    /* renamed from: lb */
    public static final void m42058lb(@C12579k short[] sArr, int i, int i2) {
        Intrinsics.checkNotNullParameter(sArr, "$this$sortDescending");
        m41918bb(sArr, i, i2);
        ArraysKt___ArraysKt.m38960Fr(sArr, i, i2);
    }

    @C11531s
    @C11110f
    @C11665v0(version = "1.5")
    @C11403m0
    @C11314h(name = "sumOfULong")
    @C11097g2(markerClass = {C11531s.class})
    /* renamed from: lc */
    public static final long m42059lc(int[] iArr, C11300l<? super C11419p1, C11588t1> lVar) {
        Intrinsics.checkNotNullParameter(iArr, "$this$sumOf");
        Intrinsics.checkNotNullParameter(lVar, "selector");
        long M = C11588t1.m44970M(0);
        int X = C11431q1.m44045X(iArr);
        for (int i = 0; i < X; i++) {
            M = C11588t1.m44970M(M + lVar.invoke(C11419p1.m43993g(C11431q1.m44044Q(iArr, i))).mo23301j2());
        }
        return M;
    }

    @C11531s
    @C11110f
    @C11665v0(version = "1.3")
    /* renamed from: ld */
    public static final <R, V> List<V> m42060ld(long[] jArr, Iterable<? extends R> iterable, C11304p<? super C11588t1, ? super R, ? extends V> pVar) {
        Intrinsics.checkNotNullParameter(jArr, "$this$zip");
        Intrinsics.checkNotNullParameter(iterable, "other");
        Intrinsics.checkNotNullParameter(pVar, "transform");
        int X = C11662u1.m45751X(jArr);
        ArrayList arrayList = new ArrayList(Math.min(C10978t.m41495Y(iterable, 10), X));
        int i = 0;
        for (Object next : iterable) {
            if (i >= X) {
                break;
            }
            arrayList.add(pVar.invoke(C11588t1.m44992g(C11662u1.m45750Q(jArr, i)), next));
            i++;
        }
        return arrayList;
    }

    @C11531s
    @C11110f
    @C11665v0(version = "1.3")
    /* renamed from: m0 */
    public static final byte[] m42061m0(byte[] bArr) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        return C11404m1.m43818q(bArr);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:1:0x0002, code lost:
        r9 = kotlin.collections.CollectionsKt___CollectionsKt.m40639h3(kotlin.C11431q1.m44048h(r9), ", ", "[", "]", 0, (java.lang.CharSequence) null, (kotlin.jvm.functions.C11300l) null, 56, (java.lang.Object) null);
     */
    @kotlin.C11531s
    @kotlin.C11665v0(version = "1.4")
    @org.jetbrains.annotations.C12579k
    /* renamed from: m1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.String m42062m1(@org.jetbrains.annotations.C12580l int[] r9) {
        /*
            if (r9 == 0) goto L_0x0018
            kotlin.q1 r0 = kotlin.C11431q1.m44048h(r9)
            java.lang.String r1 = ", "
            java.lang.String r2 = "["
            java.lang.String r3 = "]"
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 56
            r8 = 0
            java.lang.String r9 = kotlin.collections.CollectionsKt___CollectionsKt.m40639h3(r0, r1, r2, r3, r4, r5, r6, r7, r8)
            if (r9 != 0) goto L_0x001a
        L_0x0018:
            java.lang.String r9 = "null"
        L_0x001a:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.collections.unsigned.UArraysKt___UArraysKt.m42062m1(int[]):java.lang.String");
    }

    @C11531s
    @C11665v0(version = "1.3")
    /* renamed from: m2 */
    public static final void m42063m2(@C12579k int[] iArr, int i, int i2, int i3) {
        Intrinsics.checkNotNullParameter(iArr, "$this$fill");
        C10956m.m41238l2(iArr, i, i2, i3);
    }

    @C11531s
    @C12580l
    @C11665v0(version = "1.3")
    /* renamed from: m3 */
    public static final C11588t1 m42064m3(@C12579k long[] jArr) {
        Intrinsics.checkNotNullParameter(jArr, "$this$firstOrNull");
        if (C11662u1.m45755h0(jArr)) {
            return null;
        }
        return C11588t1.m44992g(C11662u1.m45750Q(jArr, 0));
    }

    /* renamed from: m4 */
    public static final int m42065m4(@C12579k int[] iArr) {
        Intrinsics.checkNotNullParameter(iArr, "$this$lastIndex");
        return ArraysKt___ArraysKt.m39459Ve(iArr);
    }

    @C11531s
    @C11110f
    @C11665v0(version = "1.3")
    /* renamed from: m5 */
    public static final int m42066m5(long[] jArr, long j) {
        Intrinsics.checkNotNullParameter(jArr, "$this$lastIndexOf");
        return ArraysKt___ArraysKt.m40000mi(jArr, j);
    }

    @C11531s
    @C11110f
    @C11665v0(version = "1.4")
    @C11403m0
    /* renamed from: m6 */
    public static final Double m42067m6(long[] jArr, C11300l<? super C11588t1, Double> lVar) {
        Intrinsics.checkNotNullParameter(jArr, "$this$maxOfOrNull");
        Intrinsics.checkNotNullParameter(lVar, "selector");
        if (C11662u1.m45755h0(jArr)) {
            return null;
        }
        double doubleValue = lVar.invoke(C11588t1.m44992g(C11662u1.m45750Q(jArr, 0))).doubleValue();
        C10953k0 H = new C11466l(1, ArraysKt___ArraysKt.m39491We(jArr)).iterator();
        while (H.hasNext()) {
            doubleValue = Math.max(doubleValue, lVar.invoke(C11588t1.m44992g(C11662u1.m45750Q(jArr, H.mo6374c()))).doubleValue());
        }
        return Double.valueOf(doubleValue);
    }

    @C11531s
    @C11110f
    @C11665v0(version = "1.4")
    @C11403m0
    /* renamed from: m7 */
    public static final <R extends Comparable<? super R>> R m42068m7(byte[] bArr, C11300l<? super C11400l1, ? extends R> lVar) {
        Intrinsics.checkNotNullParameter(bArr, "$this$minOfOrNull");
        Intrinsics.checkNotNullParameter(lVar, "selector");
        if (C11404m1.m43813h0(bArr)) {
            return null;
        }
        R r = (Comparable) lVar.invoke(C11400l1.m43782g(C11404m1.m43808Q(bArr, 0)));
        C10953k0 H = new C11466l(1, ArraysKt___ArraysKt.m39331Re(bArr)).iterator();
        while (H.hasNext()) {
            R r2 = (Comparable) lVar.invoke(C11400l1.m43782g(C11404m1.m43808Q(bArr, H.mo6374c())));
            if (r.compareTo(r2) > 0) {
                r = r2;
            }
        }
        return r;
    }

    @C11531s
    @C11110f
    @C11665v0(version = "1.3")
    /* renamed from: m8 */
    public static final long[] m42069m8(long[] jArr, long j) {
        Intrinsics.checkNotNullParameter(jArr, "$this$plus");
        return C11662u1.m45760q(C10956m.m41138U3(jArr, j));
    }

    @C11531s
    @C11110f
    @C11665v0(version = "1.4")
    /* renamed from: m9 */
    public static final C11419p1 m42070m9(int[] iArr, C11305q<? super Integer, ? super C11419p1, ? super C11419p1, C11419p1> qVar) {
        Intrinsics.checkNotNullParameter(iArr, "$this$reduceRightIndexedOrNull");
        Intrinsics.checkNotNullParameter(qVar, "operation");
        int Ve = ArraysKt___ArraysKt.m39459Ve(iArr);
        if (Ve < 0) {
            return null;
        }
        int Q = C11431q1.m44044Q(iArr, Ve);
        for (int i = Ve - 1; i >= 0; i--) {
            Q = qVar.invoke(Integer.valueOf(i), C11419p1.m43993g(C11431q1.m44044Q(iArr, i)), C11419p1.m43993g(Q)).mo22930j2();
        }
        return C11419p1.m43993g(Q);
    }

    @C11531s
    @C11665v0(version = "1.4")
    /* renamed from: ma */
    public static final void m42071ma(@C12579k long[] jArr) {
        Intrinsics.checkNotNullParameter(jArr, "$this$shuffle");
        m42057la(jArr, Random.f28564a);
    }

    @C11531s
    @C11665v0(version = "1.3")
    /* renamed from: mb */
    public static final void m42072mb(@C12579k byte[] bArr) {
        Intrinsics.checkNotNullParameter(bArr, "$this$sortDescending");
        if (C11404m1.m43809X(bArr) > 1) {
            m41946db(bArr);
            ArraysKt___ArraysKt.m40133qr(bArr);
        }
    }

    @C11531s
    @C11110f
    @C11665v0(version = "1.5")
    @C11403m0
    @C11314h(name = "sumOfULong")
    @C11097g2(markerClass = {C11531s.class})
    /* renamed from: mc */
    public static final long m42073mc(long[] jArr, C11300l<? super C11588t1, C11588t1> lVar) {
        Intrinsics.checkNotNullParameter(jArr, "$this$sumOf");
        Intrinsics.checkNotNullParameter(lVar, "selector");
        long M = C11588t1.m44970M(0);
        int X = C11662u1.m45751X(jArr);
        for (int i = 0; i < X; i++) {
            M = C11588t1.m44970M(M + lVar.invoke(C11588t1.m44992g(C11662u1.m45750Q(jArr, i))).mo23301j2());
        }
        return M;
    }

    @C11531s
    @C11110f
    @C11665v0(version = "1.3")
    /* renamed from: md */
    public static final <R, V> List<V> m42074md(byte[] bArr, Iterable<? extends R> iterable, C11304p<? super C11400l1, ? super R, ? extends V> pVar) {
        Intrinsics.checkNotNullParameter(bArr, "$this$zip");
        Intrinsics.checkNotNullParameter(iterable, "other");
        Intrinsics.checkNotNullParameter(pVar, "transform");
        int X = C11404m1.m43809X(bArr);
        ArrayList arrayList = new ArrayList(Math.min(C10978t.m41495Y(iterable, 10), X));
        int i = 0;
        for (Object next : iterable) {
            if (i >= X) {
                break;
            }
            arrayList.add(pVar.invoke(C11400l1.m43782g(C11404m1.m43808Q(bArr, i)), next));
            i++;
        }
        return arrayList;
    }

    @C11531s
    @C11110f
    @C11665v0(version = "1.3")
    /* renamed from: n0 */
    public static final int[] m42075n0(int[] iArr) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        return C11431q1.m44054q(iArr);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:1:0x0002, code lost:
        r9 = kotlin.collections.CollectionsKt___CollectionsKt.m40639h3(kotlin.C10857a2.m38730h(r9), ", ", "[", "]", 0, (java.lang.CharSequence) null, (kotlin.jvm.functions.C11300l) null, 56, (java.lang.Object) null);
     */
    @kotlin.C11531s
    @kotlin.C11665v0(version = "1.4")
    @org.jetbrains.annotations.C12579k
    /* renamed from: n1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.String m42076n1(@org.jetbrains.annotations.C12580l short[] r9) {
        /*
            if (r9 == 0) goto L_0x0018
            kotlin.a2 r0 = kotlin.C10857a2.m38730h(r9)
            java.lang.String r1 = ", "
            java.lang.String r2 = "["
            java.lang.String r3 = "]"
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 56
            r8 = 0
            java.lang.String r9 = kotlin.collections.CollectionsKt___CollectionsKt.m40639h3(r0, r1, r2, r3, r4, r5, r6, r7, r8)
            if (r9 != 0) goto L_0x001a
        L_0x0018:
            java.lang.String r9 = "null"
        L_0x001a:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.collections.unsigned.UArraysKt___UArraysKt.m42076n1(short[]):java.lang.String");
    }

    /* renamed from: n2 */
    public static /* synthetic */ void m42077n2(int[] iArr, int i, int i2, int i3, int i4, Object obj) {
        if ((i4 & 2) != 0) {
            i2 = 0;
        }
        if ((i4 & 4) != 0) {
            i3 = C11431q1.m44045X(iArr);
        }
        m42063m2(iArr, i, i2, i3);
    }

    @C11531s
    @C11110f
    @C11665v0(version = "1.3")
    /* renamed from: n3 */
    public static final C11419p1 m42078n3(int[] iArr, C11300l<? super C11419p1, Boolean> lVar) {
        Intrinsics.checkNotNullParameter(iArr, "$this$firstOrNull");
        Intrinsics.checkNotNullParameter(lVar, "predicate");
        int X = C11431q1.m44045X(iArr);
        for (int i = 0; i < X; i++) {
            int Q = C11431q1.m44044Q(iArr, i);
            if (lVar.invoke(C11419p1.m43993g(Q)).booleanValue()) {
                return C11419p1.m43993g(Q);
            }
        }
        return null;
    }

    @C11531s
    @C11665v0(version = "1.3")
    /* renamed from: n4 */
    public static /* synthetic */ void m42079n4(int[] iArr) {
    }

    @C11531s
    @C11110f
    @C11665v0(version = "1.3")
    /* renamed from: n5 */
    public static final int m42080n5(short[] sArr, short s) {
        Intrinsics.checkNotNullParameter(sArr, "$this$lastIndexOf");
        return ArraysKt___ArraysKt.m40062oi(sArr, s);
    }

    @C11531s
    @C11110f
    @C11665v0(version = "1.4")
    @C11403m0
    /* renamed from: n6 */
    public static final Float m42081n6(long[] jArr, C11300l<? super C11588t1, Float> lVar) {
        Intrinsics.checkNotNullParameter(jArr, "$this$maxOfOrNull");
        Intrinsics.checkNotNullParameter(lVar, "selector");
        if (C11662u1.m45755h0(jArr)) {
            return null;
        }
        float floatValue = lVar.invoke(C11588t1.m44992g(C11662u1.m45750Q(jArr, 0))).floatValue();
        C10953k0 H = new C11466l(1, ArraysKt___ArraysKt.m39491We(jArr)).iterator();
        while (H.hasNext()) {
            floatValue = Math.max(floatValue, lVar.invoke(C11588t1.m44992g(C11662u1.m45750Q(jArr, H.mo6374c()))).floatValue());
        }
        return Float.valueOf(floatValue);
    }

    @C11531s
    @C11110f
    @C11665v0(version = "1.4")
    @C11403m0
    /* renamed from: n7 */
    public static final Double m42082n7(byte[] bArr, C11300l<? super C11400l1, Double> lVar) {
        Intrinsics.checkNotNullParameter(bArr, "$this$minOfOrNull");
        Intrinsics.checkNotNullParameter(lVar, "selector");
        if (C11404m1.m43813h0(bArr)) {
            return null;
        }
        double doubleValue = lVar.invoke(C11400l1.m43782g(C11404m1.m43808Q(bArr, 0))).doubleValue();
        C10953k0 H = new C11466l(1, ArraysKt___ArraysKt.m39331Re(bArr)).iterator();
        while (H.hasNext()) {
            doubleValue = Math.min(doubleValue, lVar.invoke(C11400l1.m43782g(C11404m1.m43808Q(bArr, H.mo6374c()))).doubleValue());
        }
        return Double.valueOf(doubleValue);
    }

    @C11531s
    @C11665v0(version = "1.3")
    @C12579k
    /* renamed from: n8 */
    public static final int[] m42083n8(@C12579k int[] iArr, @C12579k Collection<C11419p1> collection) {
        Intrinsics.checkNotNullParameter(iArr, "$this$plus");
        Intrinsics.checkNotNullParameter(collection, "elements");
        int X = C11431q1.m44045X(iArr);
        int[] copyOf = Arrays.copyOf(iArr, C11431q1.m44045X(iArr) + collection.size());
        Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(this, newSize)");
        for (C11419p1 j2 : collection) {
            copyOf[X] = j2.mo22930j2();
            X++;
        }
        return C11431q1.m44054q(copyOf);
    }

    @C11531s
    @C11110f
    @C11665v0(version = "1.4")
    /* renamed from: n9 */
    public static final C11400l1 m42084n9(byte[] bArr, C11305q<? super Integer, ? super C11400l1, ? super C11400l1, C11400l1> qVar) {
        Intrinsics.checkNotNullParameter(bArr, "$this$reduceRightIndexedOrNull");
        Intrinsics.checkNotNullParameter(qVar, "operation");
        int Re = ArraysKt___ArraysKt.m39331Re(bArr);
        if (Re < 0) {
            return null;
        }
        byte Q = C11404m1.m43808Q(bArr, Re);
        for (int i = Re - 1; i >= 0; i--) {
            Q = qVar.invoke(Integer.valueOf(i), C11400l1.m43782g(C11404m1.m43808Q(bArr, i)), C11400l1.m43782g(Q)).mo22897e2();
        }
        return C11400l1.m43782g(Q);
    }

    @C11531s
    @C11665v0(version = "1.4")
    /* renamed from: na */
    public static final void m42085na(@C12579k byte[] bArr, @C12579k Random random) {
        Intrinsics.checkNotNullParameter(bArr, "$this$shuffle");
        Intrinsics.checkNotNullParameter(random, BaseOptionModel.f27465E0);
        for (int Re = ArraysKt___ArraysKt.m39331Re(bArr); Re > 0; Re--) {
            int m = random.mo22986m(Re + 1);
            byte Q = C11404m1.m43808Q(bArr, Re);
            C11404m1.m43816j0(bArr, Re, C11404m1.m43808Q(bArr, m));
            C11404m1.m43816j0(bArr, m, Q);
        }
    }

    @C11531s
    @C11665v0(version = "1.3")
    /* renamed from: nb */
    public static final void m42086nb(@C12579k long[] jArr) {
        Intrinsics.checkNotNullParameter(jArr, "$this$sortDescending");
        if (C11662u1.m45751X(jArr) > 1) {
            m41960eb(jArr);
            ArraysKt___ArraysKt.m38800Ar(jArr);
        }
    }

    @C11097g2(markerClass = {C11531s.class})
    @C11314h(name = "sumOfULong")
    @C11665v0(version = "1.5")
    /* renamed from: nc */
    public static final long m42087nc(@C12579k C11588t1[] t1VarArr) {
        Intrinsics.checkNotNullParameter(t1VarArr, "<this>");
        long j = 0;
        for (C11588t1 j2 : t1VarArr) {
            j = C11588t1.m44970M(j + j2.mo23301j2());
        }
        return j;
    }

    @C11531s
    @C11110f
    @C11665v0(version = "1.3")
    /* renamed from: nd */
    public static final <R, V> List<V> m42088nd(int[] iArr, R[] rArr, C11304p<? super C11419p1, ? super R, ? extends V> pVar) {
        Intrinsics.checkNotNullParameter(iArr, "$this$zip");
        Intrinsics.checkNotNullParameter(rArr, "other");
        Intrinsics.checkNotNullParameter(pVar, "transform");
        int min = Math.min(C11431q1.m44045X(iArr), rArr.length);
        ArrayList arrayList = new ArrayList(min);
        for (int i = 0; i < min; i++) {
            arrayList.add(pVar.invoke(C11419p1.m43993g(C11431q1.m44044Q(iArr, i)), rArr[i]));
        }
        return arrayList;
    }

    @C11531s
    @C11110f
    @C11665v0(version = "1.3")
    /* renamed from: o0 */
    public static final long[] m42089o0(long[] jArr) {
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        return C11662u1.m45760q(jArr);
    }

    @C11531s
    @C11665v0(version = "1.3")
    /* renamed from: o2 */
    public static final void m42091o2(@C12579k short[] sArr, short s, int i, int i2) {
        Intrinsics.checkNotNullParameter(sArr, "$this$fill");
        C10956m.m41258o2(sArr, s, i, i2);
    }

    @C11531s
    @C12580l
    @C11665v0(version = "1.3")
    /* renamed from: o3 */
    public static final C11679z1 m42092o3(@C12579k short[] sArr) {
        Intrinsics.checkNotNullParameter(sArr, "$this$firstOrNull");
        if (C10857a2.m38731h0(sArr)) {
            return null;
        }
        return C11679z1.m45862g(C10857a2.m38726Q(sArr, 0));
    }

    /* renamed from: o4 */
    public static final int m42093o4(@C12579k byte[] bArr) {
        Intrinsics.checkNotNullParameter(bArr, "$this$lastIndex");
        return ArraysKt___ArraysKt.m39331Re(bArr);
    }

    @C11531s
    @C11110f
    @C11665v0(version = "1.3")
    /* renamed from: o5 */
    public static final int m42094o5(byte[] bArr, byte b) {
        Intrinsics.checkNotNullParameter(bArr, "$this$lastIndexOf");
        return ArraysKt___ArraysKt.m39846hi(bArr, b);
    }

    @C11531s
    @C11110f
    @C11665v0(version = "1.4")
    @C11403m0
    /* renamed from: o6 */
    public static final <R extends Comparable<? super R>> R m42095o6(int[] iArr, C11300l<? super C11419p1, ? extends R> lVar) {
        Intrinsics.checkNotNullParameter(iArr, "$this$maxOfOrNull");
        Intrinsics.checkNotNullParameter(lVar, "selector");
        if (C11431q1.m44049h0(iArr)) {
            return null;
        }
        R r = (Comparable) lVar.invoke(C11419p1.m43993g(C11431q1.m44044Q(iArr, 0)));
        C10953k0 H = new C11466l(1, ArraysKt___ArraysKt.m39459Ve(iArr)).iterator();
        while (H.hasNext()) {
            R r2 = (Comparable) lVar.invoke(C11419p1.m43993g(C11431q1.m44044Q(iArr, H.mo6374c())));
            if (r.compareTo(r2) < 0) {
                r = r2;
            }
        }
        return r;
    }

    @C11531s
    @C11110f
    @C11665v0(version = "1.4")
    @C11403m0
    /* renamed from: o7 */
    public static final Float m42096o7(byte[] bArr, C11300l<? super C11400l1, Float> lVar) {
        Intrinsics.checkNotNullParameter(bArr, "$this$minOfOrNull");
        Intrinsics.checkNotNullParameter(lVar, "selector");
        if (C11404m1.m43813h0(bArr)) {
            return null;
        }
        float floatValue = lVar.invoke(C11400l1.m43782g(C11404m1.m43808Q(bArr, 0))).floatValue();
        C10953k0 H = new C11466l(1, ArraysKt___ArraysKt.m39331Re(bArr)).iterator();
        while (H.hasNext()) {
            floatValue = Math.min(floatValue, lVar.invoke(C11400l1.m43782g(C11404m1.m43808Q(bArr, H.mo6374c()))).floatValue());
        }
        return Float.valueOf(floatValue);
    }

    @C11531s
    @C11110f
    @C11665v0(version = "1.3")
    /* renamed from: o8 */
    public static final short[] m42097o8(short[] sArr, short s) {
        Intrinsics.checkNotNullParameter(sArr, "$this$plus");
        return C10857a2.m38736q(C10956m.m41180b4(sArr, s));
    }

    @C11531s
    @C11110f
    @C11665v0(version = "1.4")
    /* renamed from: o9 */
    public static final C11679z1 m42098o9(short[] sArr, C11305q<? super Integer, ? super C11679z1, ? super C11679z1, C11679z1> qVar) {
        Intrinsics.checkNotNullParameter(sArr, "$this$reduceRightIndexedOrNull");
        Intrinsics.checkNotNullParameter(qVar, "operation");
        int Ye = ArraysKt___ArraysKt.m39555Ye(sArr);
        if (Ye < 0) {
            return null;
        }
        short Q = C10857a2.m38726Q(sArr, Ye);
        for (int i = Ye - 1; i >= 0; i--) {
            Q = qVar.invoke(Integer.valueOf(i), C11679z1.m45862g(C10857a2.m38726Q(sArr, i)), C11679z1.m45862g(Q)).mo23548e2();
        }
        return C11679z1.m45862g(Q);
    }

    @C11531s
    @C11665v0(version = "1.4")
    /* renamed from: oa */
    public static final void m42099oa(@C12579k short[] sArr) {
        Intrinsics.checkNotNullParameter(sArr, "$this$shuffle");
        m42113pa(sArr, Random.f28564a);
    }

    @C11531s
    @C11665v0(version = "1.4")
    /* renamed from: ob */
    public static final void m42100ob(@C12579k int[] iArr, int i, int i2) {
        Intrinsics.checkNotNullParameter(iArr, "$this$sortDescending");
        m41974fb(iArr, i, i2);
        ArraysKt___ArraysKt.m40417zr(iArr, i, i2);
    }

    @C11531s
    @C11110f
    @C11665v0(version = "1.5")
    @C11403m0
    @C11314h(name = "sumOfULong")
    @C11097g2(markerClass = {C11531s.class})
    /* renamed from: oc */
    public static final long m42101oc(short[] sArr, C11300l<? super C11679z1, C11588t1> lVar) {
        Intrinsics.checkNotNullParameter(sArr, "$this$sumOf");
        Intrinsics.checkNotNullParameter(lVar, "selector");
        long M = C11588t1.m44970M(0);
        int X = C10857a2.m38727X(sArr);
        for (int i = 0; i < X; i++) {
            M = C11588t1.m44970M(M + lVar.invoke(C11679z1.m45862g(C10857a2.m38726Q(sArr, i))).mo23301j2());
        }
        return M;
    }

    @C11531s
    @C11665v0(version = "1.3")
    @C12579k
    /* renamed from: od */
    public static final List<Pair<C11419p1, C11419p1>> m42102od(@C12579k int[] iArr, @C12579k int[] iArr2) {
        Intrinsics.checkNotNullParameter(iArr, "$this$zip");
        Intrinsics.checkNotNullParameter(iArr2, "other");
        int min = Math.min(C11431q1.m44045X(iArr), C11431q1.m44045X(iArr2));
        ArrayList arrayList = new ArrayList(min);
        for (int i = 0; i < min; i++) {
            arrayList.add(C11078d1.m42659a(C11419p1.m43993g(C11431q1.m44044Q(iArr, i)), C11419p1.m43993g(C11431q1.m44044Q(iArr2, i))));
        }
        return arrayList;
    }

    @C11531s
    @C11110f
    @C11665v0(version = "1.3")
    /* renamed from: p0 */
    public static final short[] m42103p0(short[] sArr) {
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        return C10857a2.m38736q(sArr);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:1:0x0002, code lost:
        r9 = kotlin.collections.CollectionsKt___CollectionsKt.m40639h3(kotlin.C11662u1.m45754h(r9), ", ", "[", "]", 0, (java.lang.CharSequence) null, (kotlin.jvm.functions.C11300l) null, 56, (java.lang.Object) null);
     */
    @kotlin.C11531s
    @kotlin.C11665v0(version = "1.4")
    @org.jetbrains.annotations.C12579k
    /* renamed from: p1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.String m42104p1(@org.jetbrains.annotations.C12580l long[] r9) {
        /*
            if (r9 == 0) goto L_0x0018
            kotlin.u1 r0 = kotlin.C11662u1.m45754h(r9)
            java.lang.String r1 = ", "
            java.lang.String r2 = "["
            java.lang.String r3 = "]"
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 56
            r8 = 0
            java.lang.String r9 = kotlin.collections.CollectionsKt___CollectionsKt.m40639h3(r0, r1, r2, r3, r4, r5, r6, r7, r8)
            if (r9 != 0) goto L_0x001a
        L_0x0018:
            java.lang.String r9 = "null"
        L_0x001a:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.collections.unsigned.UArraysKt___UArraysKt.m42104p1(long[]):java.lang.String");
    }

    /* renamed from: p2 */
    public static /* synthetic */ void m42105p2(short[] sArr, short s, int i, int i2, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i = 0;
        }
        if ((i3 & 4) != 0) {
            i2 = C10857a2.m38727X(sArr);
        }
        m42091o2(sArr, s, i, i2);
    }

    @C11531s
    @C11110f
    @C11665v0(version = "1.3")
    /* renamed from: p3 */
    public static final C11679z1 m42106p3(short[] sArr, C11300l<? super C11679z1, Boolean> lVar) {
        Intrinsics.checkNotNullParameter(sArr, "$this$firstOrNull");
        Intrinsics.checkNotNullParameter(lVar, "predicate");
        int X = C10857a2.m38727X(sArr);
        for (int i = 0; i < X; i++) {
            short Q = C10857a2.m38726Q(sArr, i);
            if (lVar.invoke(C11679z1.m45862g(Q)).booleanValue()) {
                return C11679z1.m45862g(Q);
            }
        }
        return null;
    }

    @C11531s
    @C11665v0(version = "1.3")
    /* renamed from: p4 */
    public static /* synthetic */ void m42107p4(byte[] bArr) {
    }

    @C11531s
    @C11110f
    @C11665v0(version = "1.3")
    /* renamed from: p5 */
    public static final int m42108p5(int[] iArr, int i) {
        Intrinsics.checkNotNullParameter(iArr, "$this$lastIndexOf");
        return ArraysKt___ArraysKt.m39969li(iArr, i);
    }

    @C11531s
    @C11110f
    @C11665v0(version = "1.4")
    @C11403m0
    /* renamed from: p6 */
    public static final Double m42109p6(int[] iArr, C11300l<? super C11419p1, Double> lVar) {
        Intrinsics.checkNotNullParameter(iArr, "$this$maxOfOrNull");
        Intrinsics.checkNotNullParameter(lVar, "selector");
        if (C11431q1.m44049h0(iArr)) {
            return null;
        }
        double doubleValue = lVar.invoke(C11419p1.m43993g(C11431q1.m44044Q(iArr, 0))).doubleValue();
        C10953k0 H = new C11466l(1, ArraysKt___ArraysKt.m39459Ve(iArr)).iterator();
        while (H.hasNext()) {
            doubleValue = Math.max(doubleValue, lVar.invoke(C11419p1.m43993g(C11431q1.m44044Q(iArr, H.mo6374c()))).doubleValue());
        }
        return Double.valueOf(doubleValue);
    }

    @C11531s
    @C11110f
    @C11665v0(version = "1.4")
    @C11403m0
    /* renamed from: p7 */
    public static final <R extends Comparable<? super R>> R m42110p7(long[] jArr, C11300l<? super C11588t1, ? extends R> lVar) {
        Intrinsics.checkNotNullParameter(jArr, "$this$minOfOrNull");
        Intrinsics.checkNotNullParameter(lVar, "selector");
        if (C11662u1.m45755h0(jArr)) {
            return null;
        }
        R r = (Comparable) lVar.invoke(C11588t1.m44992g(C11662u1.m45750Q(jArr, 0)));
        C10953k0 H = new C11466l(1, ArraysKt___ArraysKt.m39491We(jArr)).iterator();
        while (H.hasNext()) {
            R r2 = (Comparable) lVar.invoke(C11588t1.m44992g(C11662u1.m45750Q(jArr, H.mo6374c())));
            if (r.compareTo(r2) > 0) {
                r = r2;
            }
        }
        return r;
    }

    @C11531s
    @C11110f
    @C11665v0(version = "1.3")
    /* renamed from: p8 */
    public static final int[] m42111p8(int[] iArr, int[] iArr2) {
        Intrinsics.checkNotNullParameter(iArr, "$this$plus");
        Intrinsics.checkNotNullParameter(iArr2, "elements");
        return C11431q1.m44054q(C10956m.m41132T3(iArr, iArr2));
    }

    @C11531s
    @C11110f
    @C11665v0(version = "1.4")
    /* renamed from: p9 */
    public static final C11588t1 m42112p9(long[] jArr, C11305q<? super Integer, ? super C11588t1, ? super C11588t1, C11588t1> qVar) {
        Intrinsics.checkNotNullParameter(jArr, "$this$reduceRightIndexedOrNull");
        Intrinsics.checkNotNullParameter(qVar, "operation");
        int We = ArraysKt___ArraysKt.m39491We(jArr);
        if (We < 0) {
            return null;
        }
        long Q = C11662u1.m45750Q(jArr, We);
        for (int i = We - 1; i >= 0; i--) {
            Q = qVar.invoke(Integer.valueOf(i), C11588t1.m44992g(C11662u1.m45750Q(jArr, i)), C11588t1.m44992g(Q)).mo23301j2();
        }
        return C11588t1.m44992g(Q);
    }

    @C11531s
    @C11665v0(version = "1.4")
    /* renamed from: pa */
    public static final void m42113pa(@C12579k short[] sArr, @C12579k Random random) {
        Intrinsics.checkNotNullParameter(sArr, "$this$shuffle");
        Intrinsics.checkNotNullParameter(random, BaseOptionModel.f27465E0);
        for (int Ye = ArraysKt___ArraysKt.m39555Ye(sArr); Ye > 0; Ye--) {
            int m = random.mo22986m(Ye + 1);
            short Q = C10857a2.m38726Q(sArr, Ye);
            C10857a2.m38734j0(sArr, Ye, C10857a2.m38726Q(sArr, m));
            C10857a2.m38734j0(sArr, m, Q);
        }
    }

    @C11531s
    @C11665v0(version = "1.3")
    /* renamed from: pb */
    public static final void m42114pb(@C12579k short[] sArr) {
        Intrinsics.checkNotNullParameter(sArr, "$this$sortDescending");
        if (C10857a2.m38727X(sArr) > 1) {
            m42002hb(sArr);
            ArraysKt___ArraysKt.m38928Er(sArr);
        }
    }

    @C11097g2(markerClass = {C11531s.class})
    @C11314h(name = "sumOfUShort")
    @C11665v0(version = "1.5")
    /* renamed from: pc */
    public static final int m42115pc(@C12579k C11679z1[] z1VarArr) {
        Intrinsics.checkNotNullParameter(z1VarArr, "<this>");
        int i = 0;
        for (C11679z1 e2 : z1VarArr) {
            i = C11419p1.m43971M(i + C11419p1.m43971M(e2.mo23548e2() & C11679z1.f28988d));
        }
        return i;
    }

    @C11531s
    @C11110f
    @C11665v0(version = "1.3")
    /* renamed from: pd */
    public static final <R, V> List<V> m42116pd(short[] sArr, R[] rArr, C11304p<? super C11679z1, ? super R, ? extends V> pVar) {
        Intrinsics.checkNotNullParameter(sArr, "$this$zip");
        Intrinsics.checkNotNullParameter(rArr, "other");
        Intrinsics.checkNotNullParameter(pVar, "transform");
        int min = Math.min(C10857a2.m38727X(sArr), rArr.length);
        ArrayList arrayList = new ArrayList(min);
        for (int i = 0; i < min; i++) {
            arrayList.add(pVar.invoke(C11679z1.m45862g(C10857a2.m38726Q(sArr, i)), rArr[i]));
        }
        return arrayList;
    }

    @C11531s
    @C11110f
    @C11665v0(version = "1.4")
    /* renamed from: q0 */
    public static final <V> Map<C11400l1, V> m42117q0(byte[] bArr, C11300l<? super C11400l1, ? extends V> lVar) {
        Intrinsics.checkNotNullParameter(bArr, "$this$associateWith");
        Intrinsics.checkNotNullParameter(lVar, "valueSelector");
        LinkedHashMap linkedHashMap = new LinkedHashMap(C11479u.m44447u(C10975r0.m41400j(C11404m1.m43809X(bArr)), 16));
        int X = C11404m1.m43809X(bArr);
        for (int i = 0; i < X; i++) {
            byte Q = C11404m1.m43808Q(bArr, i);
            linkedHashMap.put(C11400l1.m43782g(Q), lVar.invoke(C11400l1.m43782g(Q)));
        }
        return linkedHashMap;
    }

    @C11531s
    @C11110f
    @C11665v0(version = "1.3")
    /* renamed from: q1 */
    public static final long[] m42118q1(long[] jArr, long[] jArr2, int i, int i2, int i3) {
        Intrinsics.checkNotNullParameter(jArr, "$this$copyInto");
        Intrinsics.checkNotNullParameter(jArr2, FirebaseAnalytics.C32532b.f78977z);
        C10956m.m41177b1(jArr, jArr2, i, i2, i3);
        return jArr2;
    }

    @C11531s
    @C11665v0(version = "1.3")
    /* renamed from: q2 */
    public static final void m42119q2(@C12579k long[] jArr, long j, int i, int i2) {
        Intrinsics.checkNotNullParameter(jArr, "$this$fill");
        C10956m.m41244m2(jArr, j, i, i2);
    }

    @C11531s
    @C11110f
    @C11665v0(version = "1.3")
    /* renamed from: q3 */
    public static final <R> List<R> m42120q3(byte[] bArr, C11300l<? super C11400l1, ? extends Iterable<? extends R>> lVar) {
        Intrinsics.checkNotNullParameter(bArr, "$this$flatMap");
        Intrinsics.checkNotNullParameter(lVar, "transform");
        ArrayList arrayList = new ArrayList();
        int X = C11404m1.m43809X(bArr);
        for (int i = 0; i < X; i++) {
            C10994x.m42360n0(arrayList, (Iterable) lVar.invoke(C11400l1.m43782g(C11404m1.m43808Q(bArr, i))));
        }
        return arrayList;
    }

    /* renamed from: q4 */
    public static final int m42121q4(@C12579k long[] jArr) {
        Intrinsics.checkNotNullParameter(jArr, "$this$lastIndex");
        return ArraysKt___ArraysKt.m39491We(jArr);
    }

    @C11531s
    @C12580l
    @C11665v0(version = "1.3")
    /* renamed from: q5 */
    public static final C11419p1 m42122q5(@C12579k int[] iArr) {
        Intrinsics.checkNotNullParameter(iArr, "$this$lastOrNull");
        if (C11431q1.m44049h0(iArr)) {
            return null;
        }
        return C11419p1.m43993g(C11431q1.m44044Q(iArr, C11431q1.m44045X(iArr) - 1));
    }

    @C11531s
    @C11110f
    @C11665v0(version = "1.4")
    @C11403m0
    /* renamed from: q6 */
    public static final Float m42123q6(int[] iArr, C11300l<? super C11419p1, Float> lVar) {
        Intrinsics.checkNotNullParameter(iArr, "$this$maxOfOrNull");
        Intrinsics.checkNotNullParameter(lVar, "selector");
        if (C11431q1.m44049h0(iArr)) {
            return null;
        }
        float floatValue = lVar.invoke(C11419p1.m43993g(C11431q1.m44044Q(iArr, 0))).floatValue();
        C10953k0 H = new C11466l(1, ArraysKt___ArraysKt.m39459Ve(iArr)).iterator();
        while (H.hasNext()) {
            floatValue = Math.max(floatValue, lVar.invoke(C11419p1.m43993g(C11431q1.m44044Q(iArr, H.mo6374c()))).floatValue());
        }
        return Float.valueOf(floatValue);
    }

    @C11531s
    @C11110f
    @C11665v0(version = "1.4")
    @C11403m0
    /* renamed from: q7 */
    public static final Double m42124q7(long[] jArr, C11300l<? super C11588t1, Double> lVar) {
        Intrinsics.checkNotNullParameter(jArr, "$this$minOfOrNull");
        Intrinsics.checkNotNullParameter(lVar, "selector");
        if (C11662u1.m45755h0(jArr)) {
            return null;
        }
        double doubleValue = lVar.invoke(C11588t1.m44992g(C11662u1.m45750Q(jArr, 0))).doubleValue();
        C10953k0 H = new C11466l(1, ArraysKt___ArraysKt.m39491We(jArr)).iterator();
        while (H.hasNext()) {
            doubleValue = Math.min(doubleValue, lVar.invoke(C11588t1.m44992g(C11662u1.m45750Q(jArr, H.mo6374c()))).doubleValue());
        }
        return Double.valueOf(doubleValue);
    }

    @C11531s
    @C11110f
    @C11665v0(version = "1.3")
    /* renamed from: q8 */
    public static final byte[] m42125q8(byte[] bArr, byte b) {
        Intrinsics.checkNotNullParameter(bArr, "$this$plus");
        return C11404m1.m43818q(C10956m.m41048F3(bArr, b));
    }

    @C11531s
    @C11110f
    @C11665v0(version = "1.4")
    @C11097g2(markerClass = {C11429q.class})
    /* renamed from: q9 */
    public static final C11400l1 m42126q9(byte[] bArr, C11304p<? super C11400l1, ? super C11400l1, C11400l1> pVar) {
        Intrinsics.checkNotNullParameter(bArr, "$this$reduceRightOrNull");
        Intrinsics.checkNotNullParameter(pVar, "operation");
        int Re = ArraysKt___ArraysKt.m39331Re(bArr);
        if (Re < 0) {
            return null;
        }
        byte Q = C11404m1.m43808Q(bArr, Re);
        for (int i = Re - 1; i >= 0; i--) {
            Q = pVar.invoke(C11400l1.m43782g(C11404m1.m43808Q(bArr, i)), C11400l1.m43782g(Q)).mo22897e2();
        }
        return C11400l1.m43782g(Q);
    }

    @C11531s
    @C11110f
    @C11665v0(version = "1.3")
    /* renamed from: qa */
    public static final int m42127qa(int[] iArr) {
        Intrinsics.checkNotNullParameter(iArr, "$this$single");
        return C11419p1.m43971M(ArraysKt___ArraysKt.m38898Dt(iArr));
    }

    @C11531s
    @C11665v0(version = "1.3")
    @C12579k
    /* renamed from: qb */
    public static final List<C11419p1> m42128qb(@C12579k int[] iArr) {
        Intrinsics.checkNotNullParameter(iArr, "$this$sorted");
        int[] copyOf = Arrays.copyOf(iArr, iArr.length);
        Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(this, size)");
        int[] q = C11431q1.m44054q(copyOf);
        m41848Wa(q);
        return C10985b.m42281a(q);
    }

    @C11531s
    @C11665v0(version = "1.3")
    @C12579k
    /* renamed from: qc */
    public static final List<C11400l1> m42129qc(@C12579k byte[] bArr, int i) {
        boolean z;
        Intrinsics.checkNotNullParameter(bArr, "$this$take");
        if (i >= 0) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            throw new IllegalArgumentException(("Requested element count " + i + " is less than zero.").toString());
        } else if (i == 0) {
            return CollectionsKt__CollectionsKt.m40441E();
        } else {
            if (i >= C11404m1.m43809X(bArr)) {
                return CollectionsKt___CollectionsKt.m40557Q5(C11404m1.m43812h(bArr));
            }
            if (i == 1) {
                return C10976s.m41419k(C11400l1.m43782g(C11404m1.m43808Q(bArr, 0)));
            }
            ArrayList arrayList = new ArrayList(i);
            int X = C11404m1.m43809X(bArr);
            int i2 = 0;
            for (int i3 = 0; i3 < X; i3++) {
                arrayList.add(C11400l1.m43782g(C11404m1.m43808Q(bArr, i3)));
                i2++;
                if (i2 == i) {
                    break;
                }
            }
            return arrayList;
        }
    }

    @C11531s
    @C11665v0(version = "1.3")
    @C12579k
    /* renamed from: qd */
    public static final <R> List<Pair<C11588t1, R>> m42130qd(@C12579k long[] jArr, @C12579k R[] rArr) {
        Intrinsics.checkNotNullParameter(jArr, "$this$zip");
        Intrinsics.checkNotNullParameter(rArr, "other");
        int min = Math.min(C11662u1.m45751X(jArr), rArr.length);
        ArrayList arrayList = new ArrayList(min);
        for (int i = 0; i < min; i++) {
            long Q = C11662u1.m45750Q(jArr, i);
            arrayList.add(C11078d1.m42659a(C11588t1.m44992g(Q), rArr[i]));
        }
        return arrayList;
    }

    @C11531s
    @C11110f
    @C11665v0(version = "1.4")
    /* renamed from: r0 */
    public static final <V> Map<C11588t1, V> m42131r0(long[] jArr, C11300l<? super C11588t1, ? extends V> lVar) {
        Intrinsics.checkNotNullParameter(jArr, "$this$associateWith");
        Intrinsics.checkNotNullParameter(lVar, "valueSelector");
        LinkedHashMap linkedHashMap = new LinkedHashMap(C11479u.m44447u(C10975r0.m41400j(C11662u1.m45751X(jArr)), 16));
        int X = C11662u1.m45751X(jArr);
        for (int i = 0; i < X; i++) {
            long Q = C11662u1.m45750Q(jArr, i);
            linkedHashMap.put(C11588t1.m44992g(Q), lVar.invoke(C11588t1.m44992g(Q)));
        }
        return linkedHashMap;
    }

    /* renamed from: r1 */
    public static /* synthetic */ long[] m42132r1(long[] jArr, long[] jArr2, int i, int i2, int i3, int i4, Object obj) {
        if ((i4 & 2) != 0) {
            i = 0;
        }
        if ((i4 & 4) != 0) {
            i2 = 0;
        }
        if ((i4 & 8) != 0) {
            i3 = C11662u1.m45751X(jArr);
        }
        Intrinsics.checkNotNullParameter(jArr, "$this$copyInto");
        Intrinsics.checkNotNullParameter(jArr2, FirebaseAnalytics.C32532b.f78977z);
        C10956m.m41177b1(jArr, jArr2, i, i2, i3);
        return jArr2;
    }

    /* renamed from: r2 */
    public static /* synthetic */ void m42133r2(long[] jArr, long j, int i, int i2, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i = 0;
        }
        if ((i3 & 4) != 0) {
            i2 = C11662u1.m45751X(jArr);
        }
        m42119q2(jArr, j, i, i2);
    }

    @C11531s
    @C11110f
    @C11665v0(version = "1.3")
    /* renamed from: r3 */
    public static final <R> List<R> m42134r3(long[] jArr, C11300l<? super C11588t1, ? extends Iterable<? extends R>> lVar) {
        Intrinsics.checkNotNullParameter(jArr, "$this$flatMap");
        Intrinsics.checkNotNullParameter(lVar, "transform");
        ArrayList arrayList = new ArrayList();
        int X = C11662u1.m45751X(jArr);
        for (int i = 0; i < X; i++) {
            C10994x.m42360n0(arrayList, (Iterable) lVar.invoke(C11588t1.m44992g(C11662u1.m45750Q(jArr, i))));
        }
        return arrayList;
    }

    @C11531s
    @C11665v0(version = "1.3")
    /* renamed from: r4 */
    public static /* synthetic */ void m42135r4(long[] jArr) {
    }

    @C11531s
    @C12580l
    @C11665v0(version = "1.3")
    /* renamed from: r5 */
    public static final C11400l1 m42136r5(@C12579k byte[] bArr) {
        Intrinsics.checkNotNullParameter(bArr, "$this$lastOrNull");
        if (C11404m1.m43813h0(bArr)) {
            return null;
        }
        return C11400l1.m43782g(C11404m1.m43808Q(bArr, C11404m1.m43809X(bArr) - 1));
    }

    @C11531s
    @C11110f
    @C11665v0(version = "1.4")
    @C11403m0
    /* renamed from: r6 */
    public static final <R extends Comparable<? super R>> R m42137r6(short[] sArr, C11300l<? super C11679z1, ? extends R> lVar) {
        Intrinsics.checkNotNullParameter(sArr, "$this$maxOfOrNull");
        Intrinsics.checkNotNullParameter(lVar, "selector");
        if (C10857a2.m38731h0(sArr)) {
            return null;
        }
        R r = (Comparable) lVar.invoke(C11679z1.m45862g(C10857a2.m38726Q(sArr, 0)));
        C10953k0 H = new C11466l(1, ArraysKt___ArraysKt.m39555Ye(sArr)).iterator();
        while (H.hasNext()) {
            R r2 = (Comparable) lVar.invoke(C11679z1.m45862g(C10857a2.m38726Q(sArr, H.mo6374c())));
            if (r.compareTo(r2) < 0) {
                r = r2;
            }
        }
        return r;
    }

    @C11531s
    @C11110f
    @C11665v0(version = "1.4")
    @C11403m0
    /* renamed from: r7 */
    public static final Float m42138r7(long[] jArr, C11300l<? super C11588t1, Float> lVar) {
        Intrinsics.checkNotNullParameter(jArr, "$this$minOfOrNull");
        Intrinsics.checkNotNullParameter(lVar, "selector");
        if (C11662u1.m45755h0(jArr)) {
            return null;
        }
        float floatValue = lVar.invoke(C11588t1.m44992g(C11662u1.m45750Q(jArr, 0))).floatValue();
        C10953k0 H = new C11466l(1, ArraysKt___ArraysKt.m39491We(jArr)).iterator();
        while (H.hasNext()) {
            floatValue = Math.min(floatValue, lVar.invoke(C11588t1.m44992g(C11662u1.m45750Q(jArr, H.mo6374c()))).floatValue());
        }
        return Float.valueOf(floatValue);
    }

    @C11531s
    @C11110f
    @C11665v0(version = "1.3")
    /* renamed from: r8 */
    public static final byte[] m42139r8(byte[] bArr, byte[] bArr2) {
        Intrinsics.checkNotNullParameter(bArr, "$this$plus");
        Intrinsics.checkNotNullParameter(bArr2, "elements");
        return C11404m1.m43818q(C10956m.m41060H3(bArr, bArr2));
    }

    @C11531s
    @C11110f
    @C11665v0(version = "1.4")
    @C11097g2(markerClass = {C11429q.class})
    /* renamed from: r9 */
    public static final C11419p1 m42140r9(int[] iArr, C11304p<? super C11419p1, ? super C11419p1, C11419p1> pVar) {
        Intrinsics.checkNotNullParameter(iArr, "$this$reduceRightOrNull");
        Intrinsics.checkNotNullParameter(pVar, "operation");
        int Ve = ArraysKt___ArraysKt.m39459Ve(iArr);
        if (Ve < 0) {
            return null;
        }
        int Q = C11431q1.m44044Q(iArr, Ve);
        for (int i = Ve - 1; i >= 0; i--) {
            Q = pVar.invoke(C11419p1.m43993g(C11431q1.m44044Q(iArr, i)), C11419p1.m43993g(Q)).mo22930j2();
        }
        return C11419p1.m43993g(Q);
    }

    @C11531s
    @C11110f
    @C11665v0(version = "1.3")
    /* renamed from: ra */
    public static final byte m42141ra(byte[] bArr) {
        Intrinsics.checkNotNullParameter(bArr, "$this$single");
        return C11400l1.m43761M(ArraysKt___ArraysKt.m40291vt(bArr));
    }

    @C11531s
    @C11665v0(version = "1.3")
    @C12579k
    /* renamed from: rb */
    public static final List<C11400l1> m42142rb(@C12579k byte[] bArr) {
        Intrinsics.checkNotNullParameter(bArr, "$this$sorted");
        byte[] copyOf = Arrays.copyOf(bArr, bArr.length);
        Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(this, size)");
        byte[] q = C11404m1.m43818q(copyOf);
        m41946db(q);
        return C10985b.m42282b(q);
    }

    @C11531s
    @C11665v0(version = "1.3")
    @C12579k
    /* renamed from: rc */
    public static final List<C11679z1> m42143rc(@C12579k short[] sArr, int i) {
        boolean z;
        Intrinsics.checkNotNullParameter(sArr, "$this$take");
        if (i >= 0) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            throw new IllegalArgumentException(("Requested element count " + i + " is less than zero.").toString());
        } else if (i == 0) {
            return CollectionsKt__CollectionsKt.m40441E();
        } else {
            if (i >= C10857a2.m38727X(sArr)) {
                return CollectionsKt___CollectionsKt.m40557Q5(C10857a2.m38730h(sArr));
            }
            if (i == 1) {
                return C10976s.m41419k(C11679z1.m45862g(C10857a2.m38726Q(sArr, 0)));
            }
            ArrayList arrayList = new ArrayList(i);
            int X = C10857a2.m38727X(sArr);
            int i2 = 0;
            for (int i3 = 0; i3 < X; i3++) {
                arrayList.add(C11679z1.m45862g(C10857a2.m38726Q(sArr, i3)));
                i2++;
                if (i2 == i) {
                    break;
                }
            }
            return arrayList;
        }
    }

    @C11531s
    @C11110f
    @C11665v0(version = "1.3")
    /* renamed from: rd */
    public static final <V> List<V> m42144rd(short[] sArr, short[] sArr2, C11304p<? super C11679z1, ? super C11679z1, ? extends V> pVar) {
        Intrinsics.checkNotNullParameter(sArr, "$this$zip");
        Intrinsics.checkNotNullParameter(sArr2, "other");
        Intrinsics.checkNotNullParameter(pVar, "transform");
        int min = Math.min(C10857a2.m38727X(sArr), C10857a2.m38727X(sArr2));
        ArrayList arrayList = new ArrayList(min);
        for (int i = 0; i < min; i++) {
            arrayList.add(pVar.invoke(C11679z1.m45862g(C10857a2.m38726Q(sArr, i)), C11679z1.m45862g(C10857a2.m38726Q(sArr2, i))));
        }
        return arrayList;
    }

    @C11531s
    @C11110f
    @C11665v0(version = "1.4")
    /* renamed from: s0 */
    public static final <V> Map<C11419p1, V> m42145s0(int[] iArr, C11300l<? super C11419p1, ? extends V> lVar) {
        Intrinsics.checkNotNullParameter(iArr, "$this$associateWith");
        Intrinsics.checkNotNullParameter(lVar, "valueSelector");
        LinkedHashMap linkedHashMap = new LinkedHashMap(C11479u.m44447u(C10975r0.m41400j(C11431q1.m44045X(iArr)), 16));
        int X = C11431q1.m44045X(iArr);
        for (int i = 0; i < X; i++) {
            int Q = C11431q1.m44044Q(iArr, i);
            linkedHashMap.put(C11419p1.m43993g(Q), lVar.invoke(C11419p1.m43993g(Q)));
        }
        return linkedHashMap;
    }

    @C11531s
    @C11110f
    @C11665v0(version = "1.3")
    /* renamed from: s1 */
    public static final short[] m42146s1(short[] sArr, short[] sArr2, int i, int i2, int i3) {
        Intrinsics.checkNotNullParameter(sArr, "$this$copyInto");
        Intrinsics.checkNotNullParameter(sArr2, FirebaseAnalytics.C32532b.f78977z);
        C10956m.m41189d1(sArr, sArr2, i, i2, i3);
        return sArr2;
    }

    @C11531s
    @C11665v0(version = "1.3")
    /* renamed from: s2 */
    public static final void m42147s2(@C12579k byte[] bArr, byte b, int i, int i2) {
        Intrinsics.checkNotNullParameter(bArr, "$this$fill");
        C10956m.m41214h2(bArr, b, i, i2);
    }

    @C11531s
    @C11110f
    @C11665v0(version = "1.3")
    /* renamed from: s3 */
    public static final <R> List<R> m42148s3(int[] iArr, C11300l<? super C11419p1, ? extends Iterable<? extends R>> lVar) {
        Intrinsics.checkNotNullParameter(iArr, "$this$flatMap");
        Intrinsics.checkNotNullParameter(lVar, "transform");
        ArrayList arrayList = new ArrayList();
        int X = C11431q1.m44045X(iArr);
        for (int i = 0; i < X; i++) {
            C10994x.m42360n0(arrayList, (Iterable) lVar.invoke(C11419p1.m43993g(C11431q1.m44044Q(iArr, i))));
        }
        return arrayList;
    }

    /* renamed from: s4 */
    public static final int m42149s4(@C12579k short[] sArr) {
        Intrinsics.checkNotNullParameter(sArr, "$this$lastIndex");
        return ArraysKt___ArraysKt.m39555Ye(sArr);
    }

    @C11531s
    @C11110f
    @C11665v0(version = "1.3")
    /* renamed from: s5 */
    public static final C11400l1 m42150s5(byte[] bArr, C11300l<? super C11400l1, Boolean> lVar) {
        Intrinsics.checkNotNullParameter(bArr, "$this$lastOrNull");
        Intrinsics.checkNotNullParameter(lVar, "predicate");
        int X = C11404m1.m43809X(bArr) - 1;
        if (X < 0) {
            return null;
        }
        while (true) {
            int i = X - 1;
            byte Q = C11404m1.m43808Q(bArr, X);
            if (lVar.invoke(C11400l1.m43782g(Q)).booleanValue()) {
                return C11400l1.m43782g(Q);
            }
            if (i < 0) {
                return null;
            }
            X = i;
        }
    }

    @C11531s
    @C11110f
    @C11665v0(version = "1.4")
    @C11403m0
    /* renamed from: s6 */
    public static final Double m42151s6(short[] sArr, C11300l<? super C11679z1, Double> lVar) {
        Intrinsics.checkNotNullParameter(sArr, "$this$maxOfOrNull");
        Intrinsics.checkNotNullParameter(lVar, "selector");
        if (C10857a2.m38731h0(sArr)) {
            return null;
        }
        double doubleValue = lVar.invoke(C11679z1.m45862g(C10857a2.m38726Q(sArr, 0))).doubleValue();
        C10953k0 H = new C11466l(1, ArraysKt___ArraysKt.m39555Ye(sArr)).iterator();
        while (H.hasNext()) {
            doubleValue = Math.max(doubleValue, lVar.invoke(C11679z1.m45862g(C10857a2.m38726Q(sArr, H.mo6374c()))).doubleValue());
        }
        return Double.valueOf(doubleValue);
    }

    @C11531s
    @C11110f
    @C11665v0(version = "1.4")
    @C11403m0
    /* renamed from: s7 */
    public static final <R extends Comparable<? super R>> R m42152s7(int[] iArr, C11300l<? super C11419p1, ? extends R> lVar) {
        Intrinsics.checkNotNullParameter(iArr, "$this$minOfOrNull");
        Intrinsics.checkNotNullParameter(lVar, "selector");
        if (C11431q1.m44049h0(iArr)) {
            return null;
        }
        R r = (Comparable) lVar.invoke(C11419p1.m43993g(C11431q1.m44044Q(iArr, 0)));
        C10953k0 H = new C11466l(1, ArraysKt___ArraysKt.m39459Ve(iArr)).iterator();
        while (H.hasNext()) {
            R r2 = (Comparable) lVar.invoke(C11419p1.m43993g(C11431q1.m44044Q(iArr, H.mo6374c())));
            if (r.compareTo(r2) > 0) {
                r = r2;
            }
        }
        return r;
    }

    @C11531s
    @C11665v0(version = "1.3")
    @C12579k
    /* renamed from: s8 */
    public static final long[] m42153s8(@C12579k long[] jArr, @C12579k Collection<C11588t1> collection) {
        Intrinsics.checkNotNullParameter(jArr, "$this$plus");
        Intrinsics.checkNotNullParameter(collection, "elements");
        int X = C11662u1.m45751X(jArr);
        long[] copyOf = Arrays.copyOf(jArr, C11662u1.m45751X(jArr) + collection.size());
        Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(this, newSize)");
        for (C11588t1 j2 : collection) {
            copyOf[X] = j2.mo23301j2();
            X++;
        }
        return C11662u1.m45760q(copyOf);
    }

    @C11531s
    @C11110f
    @C11665v0(version = "1.4")
    @C11097g2(markerClass = {C11429q.class})
    /* renamed from: s9 */
    public static final C11588t1 m42154s9(long[] jArr, C11304p<? super C11588t1, ? super C11588t1, C11588t1> pVar) {
        Intrinsics.checkNotNullParameter(jArr, "$this$reduceRightOrNull");
        Intrinsics.checkNotNullParameter(pVar, "operation");
        int We = ArraysKt___ArraysKt.m39491We(jArr);
        if (We < 0) {
            return null;
        }
        long Q = C11662u1.m45750Q(jArr, We);
        for (int i = We - 1; i >= 0; i--) {
            Q = pVar.invoke(C11588t1.m44992g(C11662u1.m45750Q(jArr, i)), C11588t1.m44992g(Q)).mo23301j2();
        }
        return C11588t1.m44992g(Q);
    }

    @C11531s
    @C11110f
    @C11665v0(version = "1.3")
    /* renamed from: sa */
    public static final byte m42155sa(byte[] bArr, C11300l<? super C11400l1, Boolean> lVar) {
        Intrinsics.checkNotNullParameter(bArr, "$this$single");
        Intrinsics.checkNotNullParameter(lVar, "predicate");
        int X = C11404m1.m43809X(bArr);
        C11400l1 l1Var = null;
        boolean z = false;
        for (int i = 0; i < X; i++) {
            byte Q = C11404m1.m43808Q(bArr, i);
            if (lVar.invoke(C11400l1.m43782g(Q)).booleanValue()) {
                if (!z) {
                    l1Var = C11400l1.m43782g(Q);
                    z = true;
                } else {
                    throw new IllegalArgumentException("Array contains more than one matching element.");
                }
            }
        }
        if (z) {
            return l1Var.mo22897e2();
        }
        throw new NoSuchElementException("Array contains no element matching the predicate.");
    }

    @C11531s
    @C11665v0(version = "1.3")
    @C12579k
    /* renamed from: sb */
    public static final List<C11588t1> m42156sb(@C12579k long[] jArr) {
        Intrinsics.checkNotNullParameter(jArr, "$this$sorted");
        long[] copyOf = Arrays.copyOf(jArr, jArr.length);
        Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(this, size)");
        long[] q = C11662u1.m45760q(copyOf);
        m41960eb(q);
        return C10985b.m42283c(q);
    }

    @C11531s
    @C11665v0(version = "1.3")
    @C12579k
    /* renamed from: sc */
    public static final List<C11419p1> m42157sc(@C12579k int[] iArr, int i) {
        boolean z;
        Intrinsics.checkNotNullParameter(iArr, "$this$take");
        if (i >= 0) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            throw new IllegalArgumentException(("Requested element count " + i + " is less than zero.").toString());
        } else if (i == 0) {
            return CollectionsKt__CollectionsKt.m40441E();
        } else {
            if (i >= C11431q1.m44045X(iArr)) {
                return CollectionsKt___CollectionsKt.m40557Q5(C11431q1.m44048h(iArr));
            }
            if (i == 1) {
                return C10976s.m41419k(C11419p1.m43993g(C11431q1.m44044Q(iArr, 0)));
            }
            ArrayList arrayList = new ArrayList(i);
            int X = C11431q1.m44045X(iArr);
            int i2 = 0;
            for (int i3 = 0; i3 < X; i3++) {
                arrayList.add(C11419p1.m43993g(C11431q1.m44044Q(iArr, i3)));
                i2++;
                if (i2 == i) {
                    break;
                }
            }
            return arrayList;
        }
    }

    @C11531s
    @C11110f
    @C11665v0(version = "1.3")
    /* renamed from: sd */
    public static final <R, V> List<V> m42158sd(short[] sArr, Iterable<? extends R> iterable, C11304p<? super C11679z1, ? super R, ? extends V> pVar) {
        Intrinsics.checkNotNullParameter(sArr, "$this$zip");
        Intrinsics.checkNotNullParameter(iterable, "other");
        Intrinsics.checkNotNullParameter(pVar, "transform");
        int X = C10857a2.m38727X(sArr);
        ArrayList arrayList = new ArrayList(Math.min(C10978t.m41495Y(iterable, 10), X));
        int i = 0;
        for (Object next : iterable) {
            if (i >= X) {
                break;
            }
            arrayList.add(pVar.invoke(C11679z1.m45862g(C10857a2.m38726Q(sArr, i)), next));
            i++;
        }
        return arrayList;
    }

    @C11531s
    @C11110f
    @C11665v0(version = "1.4")
    /* renamed from: t0 */
    public static final <V> Map<C11679z1, V> m42159t0(short[] sArr, C11300l<? super C11679z1, ? extends V> lVar) {
        Intrinsics.checkNotNullParameter(sArr, "$this$associateWith");
        Intrinsics.checkNotNullParameter(lVar, "valueSelector");
        LinkedHashMap linkedHashMap = new LinkedHashMap(C11479u.m44447u(C10975r0.m41400j(C10857a2.m38727X(sArr)), 16));
        int X = C10857a2.m38727X(sArr);
        for (int i = 0; i < X; i++) {
            short Q = C10857a2.m38726Q(sArr, i);
            linkedHashMap.put(C11679z1.m45862g(Q), lVar.invoke(C11679z1.m45862g(Q)));
        }
        return linkedHashMap;
    }

    /* renamed from: t1 */
    public static /* synthetic */ short[] m42160t1(short[] sArr, short[] sArr2, int i, int i2, int i3, int i4, Object obj) {
        if ((i4 & 2) != 0) {
            i = 0;
        }
        if ((i4 & 4) != 0) {
            i2 = 0;
        }
        if ((i4 & 8) != 0) {
            i3 = C10857a2.m38727X(sArr);
        }
        Intrinsics.checkNotNullParameter(sArr, "$this$copyInto");
        Intrinsics.checkNotNullParameter(sArr2, FirebaseAnalytics.C32532b.f78977z);
        C10956m.m41189d1(sArr, sArr2, i, i2, i3);
        return sArr2;
    }

    /* renamed from: t2 */
    public static /* synthetic */ void m42161t2(byte[] bArr, byte b, int i, int i2, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i = 0;
        }
        if ((i3 & 4) != 0) {
            i2 = C11404m1.m43809X(bArr);
        }
        m42147s2(bArr, b, i, i2);
    }

    @C11531s
    @C11110f
    @C11665v0(version = "1.3")
    /* renamed from: t3 */
    public static final <R> List<R> m42162t3(short[] sArr, C11300l<? super C11679z1, ? extends Iterable<? extends R>> lVar) {
        Intrinsics.checkNotNullParameter(sArr, "$this$flatMap");
        Intrinsics.checkNotNullParameter(lVar, "transform");
        ArrayList arrayList = new ArrayList();
        int X = C10857a2.m38727X(sArr);
        for (int i = 0; i < X; i++) {
            C10994x.m42360n0(arrayList, (Iterable) lVar.invoke(C11679z1.m45862g(C10857a2.m38726Q(sArr, i))));
        }
        return arrayList;
    }

    @C11531s
    @C11665v0(version = "1.3")
    /* renamed from: t4 */
    public static /* synthetic */ void m42163t4(short[] sArr) {
    }

    @C11531s
    @C11110f
    @C11665v0(version = "1.3")
    /* renamed from: t5 */
    public static final C11588t1 m42164t5(long[] jArr, C11300l<? super C11588t1, Boolean> lVar) {
        Intrinsics.checkNotNullParameter(jArr, "$this$lastOrNull");
        Intrinsics.checkNotNullParameter(lVar, "predicate");
        int X = C11662u1.m45751X(jArr) - 1;
        if (X < 0) {
            return null;
        }
        while (true) {
            int i = X - 1;
            long Q = C11662u1.m45750Q(jArr, X);
            if (lVar.invoke(C11588t1.m44992g(Q)).booleanValue()) {
                return C11588t1.m44992g(Q);
            }
            if (i < 0) {
                return null;
            }
            X = i;
        }
    }

    @C11531s
    @C11110f
    @C11665v0(version = "1.4")
    @C11403m0
    /* renamed from: t6 */
    public static final Float m42165t6(short[] sArr, C11300l<? super C11679z1, Float> lVar) {
        Intrinsics.checkNotNullParameter(sArr, "$this$maxOfOrNull");
        Intrinsics.checkNotNullParameter(lVar, "selector");
        if (C10857a2.m38731h0(sArr)) {
            return null;
        }
        float floatValue = lVar.invoke(C11679z1.m45862g(C10857a2.m38726Q(sArr, 0))).floatValue();
        C10953k0 H = new C11466l(1, ArraysKt___ArraysKt.m39555Ye(sArr)).iterator();
        while (H.hasNext()) {
            floatValue = Math.max(floatValue, lVar.invoke(C11679z1.m45862g(C10857a2.m38726Q(sArr, H.mo6374c()))).floatValue());
        }
        return Float.valueOf(floatValue);
    }

    @C11531s
    @C11110f
    @C11665v0(version = "1.4")
    @C11403m0
    /* renamed from: t7 */
    public static final Double m42166t7(int[] iArr, C11300l<? super C11419p1, Double> lVar) {
        Intrinsics.checkNotNullParameter(iArr, "$this$minOfOrNull");
        Intrinsics.checkNotNullParameter(lVar, "selector");
        if (C11431q1.m44049h0(iArr)) {
            return null;
        }
        double doubleValue = lVar.invoke(C11419p1.m43993g(C11431q1.m44044Q(iArr, 0))).doubleValue();
        C10953k0 H = new C11466l(1, ArraysKt___ArraysKt.m39459Ve(iArr)).iterator();
        while (H.hasNext()) {
            doubleValue = Math.min(doubleValue, lVar.invoke(C11419p1.m43993g(C11431q1.m44044Q(iArr, H.mo6374c()))).doubleValue());
        }
        return Double.valueOf(doubleValue);
    }

    @C11531s
    @C11110f
    @C11665v0(version = "1.3")
    /* renamed from: t8 */
    public static final short[] m42167t8(short[] sArr, short[] sArr2) {
        Intrinsics.checkNotNullParameter(sArr, "$this$plus");
        Intrinsics.checkNotNullParameter(sArr2, "elements");
        return C10857a2.m38736q(C10956m.m41186c4(sArr, sArr2));
    }

    @C11531s
    @C11110f
    @C11665v0(version = "1.4")
    @C11097g2(markerClass = {C11429q.class})
    /* renamed from: t9 */
    public static final C11679z1 m42168t9(short[] sArr, C11304p<? super C11679z1, ? super C11679z1, C11679z1> pVar) {
        Intrinsics.checkNotNullParameter(sArr, "$this$reduceRightOrNull");
        Intrinsics.checkNotNullParameter(pVar, "operation");
        int Ye = ArraysKt___ArraysKt.m39555Ye(sArr);
        if (Ye < 0) {
            return null;
        }
        short Q = C10857a2.m38726Q(sArr, Ye);
        for (int i = Ye - 1; i >= 0; i--) {
            Q = pVar.invoke(C11679z1.m45862g(C10857a2.m38726Q(sArr, i)), C11679z1.m45862g(Q)).mo23548e2();
        }
        return C11679z1.m45862g(Q);
    }

    @C11531s
    @C11110f
    @C11665v0(version = "1.3")
    /* renamed from: ta */
    public static final long m42169ta(long[] jArr, C11300l<? super C11588t1, Boolean> lVar) {
        Intrinsics.checkNotNullParameter(jArr, "$this$single");
        Intrinsics.checkNotNullParameter(lVar, "predicate");
        int X = C11662u1.m45751X(jArr);
        C11588t1 t1Var = null;
        boolean z = false;
        for (int i = 0; i < X; i++) {
            long Q = C11662u1.m45750Q(jArr, i);
            if (lVar.invoke(C11588t1.m44992g(Q)).booleanValue()) {
                if (!z) {
                    t1Var = C11588t1.m44992g(Q);
                    z = true;
                } else {
                    throw new IllegalArgumentException("Array contains more than one matching element.");
                }
            }
        }
        if (z) {
            return t1Var.mo23301j2();
        }
        throw new NoSuchElementException("Array contains no element matching the predicate.");
    }

    @C11531s
    @C11665v0(version = "1.3")
    @C12579k
    /* renamed from: tb */
    public static final List<C11679z1> m42170tb(@C12579k short[] sArr) {
        Intrinsics.checkNotNullParameter(sArr, "$this$sorted");
        short[] copyOf = Arrays.copyOf(sArr, sArr.length);
        Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(this, size)");
        short[] q = C10857a2.m38736q(copyOf);
        m42002hb(q);
        return C10985b.m42284d(q);
    }

    @C11531s
    @C11665v0(version = "1.3")
    @C12579k
    /* renamed from: tc */
    public static final List<C11588t1> m42171tc(@C12579k long[] jArr, int i) {
        boolean z;
        Intrinsics.checkNotNullParameter(jArr, "$this$take");
        if (i >= 0) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            throw new IllegalArgumentException(("Requested element count " + i + " is less than zero.").toString());
        } else if (i == 0) {
            return CollectionsKt__CollectionsKt.m40441E();
        } else {
            if (i >= C11662u1.m45751X(jArr)) {
                return CollectionsKt___CollectionsKt.m40557Q5(C11662u1.m45754h(jArr));
            }
            if (i == 1) {
                return C10976s.m41419k(C11588t1.m44992g(C11662u1.m45750Q(jArr, 0)));
            }
            ArrayList arrayList = new ArrayList(i);
            int X = C11662u1.m45751X(jArr);
            int i2 = 0;
            for (int i3 = 0; i3 < X; i3++) {
                arrayList.add(C11588t1.m44992g(C11662u1.m45750Q(jArr, i3)));
                i2++;
                if (i2 == i) {
                    break;
                }
            }
            return arrayList;
        }
    }

    @C11531s
    @C11665v0(version = "1.3")
    @C12579k
    /* renamed from: td */
    public static final List<Pair<C11400l1, C11400l1>> m42172td(@C12579k byte[] bArr, @C12579k byte[] bArr2) {
        Intrinsics.checkNotNullParameter(bArr, "$this$zip");
        Intrinsics.checkNotNullParameter(bArr2, "other");
        int min = Math.min(C11404m1.m43809X(bArr), C11404m1.m43809X(bArr2));
        ArrayList arrayList = new ArrayList(min);
        for (int i = 0; i < min; i++) {
            arrayList.add(C11078d1.m42659a(C11400l1.m43782g(C11404m1.m43808Q(bArr, i)), C11400l1.m43782g(C11404m1.m43808Q(bArr2, i))));
        }
        return arrayList;
    }

    @C11531s
    @C11110f
    @C11665v0(version = "1.4")
    /* renamed from: u0 */
    public static final <V, M extends Map<? super C11419p1, ? super V>> M m42173u0(int[] iArr, M m, C11300l<? super C11419p1, ? extends V> lVar) {
        Intrinsics.checkNotNullParameter(iArr, "$this$associateWithTo");
        Intrinsics.checkNotNullParameter(m, FirebaseAnalytics.C32532b.f78977z);
        Intrinsics.checkNotNullParameter(lVar, "valueSelector");
        int X = C11431q1.m44045X(iArr);
        for (int i = 0; i < X; i++) {
            int Q = C11431q1.m44044Q(iArr, i);
            m.put(C11419p1.m43993g(Q), lVar.invoke(C11419p1.m43993g(Q)));
        }
        return m;
    }

    @C11531s
    @C11110f
    @C11665v0(version = "1.3")
    /* renamed from: u1 */
    public static final byte[] m42174u1(byte[] bArr, byte[] bArr2, int i, int i2, int i3) {
        Intrinsics.checkNotNullParameter(bArr, "$this$copyInto");
        Intrinsics.checkNotNullParameter(bArr2, FirebaseAnalytics.C32532b.f78977z);
        C10956m.m41147W0(bArr, bArr2, i, i2, i3);
        return bArr2;
    }

    @C11531s
    @C11110f
    @C11665v0(version = "1.3")
    /* renamed from: u2 */
    public static final List<C11400l1> m42175u2(byte[] bArr, C11300l<? super C11400l1, Boolean> lVar) {
        Intrinsics.checkNotNullParameter(bArr, "$this$filter");
        Intrinsics.checkNotNullParameter(lVar, "predicate");
        ArrayList arrayList = new ArrayList();
        int X = C11404m1.m43809X(bArr);
        for (int i = 0; i < X; i++) {
            byte Q = C11404m1.m43808Q(bArr, i);
            if (lVar.invoke(C11400l1.m43782g(Q)).booleanValue()) {
                arrayList.add(C11400l1.m43782g(Q));
            }
        }
        return arrayList;
    }

    @C11531s
    @C11110f
    @C11665v0(version = "1.4")
    @C11403m0
    /* renamed from: u3 */
    public static final <R> List<R> m42176u3(byte[] bArr, C11304p<? super Integer, ? super C11400l1, ? extends Iterable<? extends R>> pVar) {
        Intrinsics.checkNotNullParameter(bArr, "$this$flatMapIndexed");
        Intrinsics.checkNotNullParameter(pVar, "transform");
        ArrayList arrayList = new ArrayList();
        int X = C11404m1.m43809X(bArr);
        int i = 0;
        int i2 = 0;
        while (i < X) {
            C10994x.m42360n0(arrayList, (Iterable) pVar.invoke(Integer.valueOf(i2), C11400l1.m43782g(C11404m1.m43808Q(bArr, i))));
            i++;
            i2++;
        }
        return arrayList;
    }

    @C11531s
    @C11110f
    @C11665v0(version = "1.3")
    /* renamed from: u4 */
    public static final short m42177u4(short[] sArr, int i, C11300l<? super Integer, C11679z1> lVar) {
        Intrinsics.checkNotNullParameter(sArr, "$this$getOrElse");
        Intrinsics.checkNotNullParameter(lVar, "defaultValue");
        if (i < 0 || i > ArraysKt___ArraysKt.m39555Ye(sArr)) {
            return lVar.invoke(Integer.valueOf(i)).mo23548e2();
        }
        return C10857a2.m38726Q(sArr, i);
    }

    @C11531s
    @C12580l
    @C11665v0(version = "1.3")
    /* renamed from: u5 */
    public static final C11588t1 m42178u5(@C12579k long[] jArr) {
        Intrinsics.checkNotNullParameter(jArr, "$this$lastOrNull");
        if (C11662u1.m45755h0(jArr)) {
            return null;
        }
        return C11588t1.m44992g(C11662u1.m45750Q(jArr, C11662u1.m45751X(jArr) - 1));
    }

    @C11531s
    @C11110f
    @C11665v0(version = "1.4")
    @C11403m0
    /* renamed from: u6 */
    public static final <R> R m42179u6(long[] jArr, Comparator<? super R> comparator, C11300l<? super C11588t1, ? extends R> lVar) {
        Intrinsics.checkNotNullParameter(jArr, "$this$maxOfWith");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        Intrinsics.checkNotNullParameter(lVar, "selector");
        if (!C11662u1.m45755h0(jArr)) {
            R invoke = lVar.invoke(C11588t1.m44992g(C11662u1.m45750Q(jArr, 0)));
            C10953k0 H = new C11466l(1, ArraysKt___ArraysKt.m39491We(jArr)).iterator();
            while (H.hasNext()) {
                R invoke2 = lVar.invoke(C11588t1.m44992g(C11662u1.m45750Q(jArr, H.mo6374c())));
                if (comparator.compare(invoke, invoke2) < 0) {
                    invoke = invoke2;
                }
            }
            return invoke;
        }
        throw new NoSuchElementException();
    }

    @C11531s
    @C11110f
    @C11665v0(version = "1.4")
    @C11403m0
    /* renamed from: u7 */
    public static final Float m42180u7(int[] iArr, C11300l<? super C11419p1, Float> lVar) {
        Intrinsics.checkNotNullParameter(iArr, "$this$minOfOrNull");
        Intrinsics.checkNotNullParameter(lVar, "selector");
        if (C11431q1.m44049h0(iArr)) {
            return null;
        }
        float floatValue = lVar.invoke(C11419p1.m43993g(C11431q1.m44044Q(iArr, 0))).floatValue();
        C10953k0 H = new C11466l(1, ArraysKt___ArraysKt.m39459Ve(iArr)).iterator();
        while (H.hasNext()) {
            floatValue = Math.min(floatValue, lVar.invoke(C11419p1.m43993g(C11431q1.m44044Q(iArr, H.mo6374c()))).floatValue());
        }
        return Float.valueOf(floatValue);
    }

    @C11531s
    @C11665v0(version = "1.3")
    @C12579k
    /* renamed from: u8 */
    public static final short[] m42181u8(@C12579k short[] sArr, @C12579k Collection<C11679z1> collection) {
        Intrinsics.checkNotNullParameter(sArr, "$this$plus");
        Intrinsics.checkNotNullParameter(collection, "elements");
        int X = C10857a2.m38727X(sArr);
        short[] copyOf = Arrays.copyOf(sArr, C10857a2.m38727X(sArr) + collection.size());
        Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(this, newSize)");
        for (C11679z1 e2 : collection) {
            copyOf[X] = e2.mo23548e2();
            X++;
        }
        return C10857a2.m38736q(copyOf);
    }

    @C11531s
    @C11110f
    @C11665v0(version = "1.3")
    /* renamed from: u9 */
    public static final void m42182u9(int[] iArr) {
        Intrinsics.checkNotNullParameter(iArr, "$this$reverse");
        ArraysKt___ArraysKt.m40385yr(iArr);
    }

    @C11531s
    @C11110f
    @C11665v0(version = "1.3")
    /* renamed from: ua */
    public static final long m42183ua(long[] jArr) {
        Intrinsics.checkNotNullParameter(jArr, "$this$single");
        return C11588t1.m44970M(ArraysKt___ArraysKt.m38962Ft(jArr));
    }

    @C11531s
    @C11665v0(version = "1.3")
    @C12579k
    /* renamed from: ub */
    public static final int[] m42184ub(@C12579k int[] iArr) {
        Intrinsics.checkNotNullParameter(iArr, "$this$sortedArray");
        if (C11431q1.m44049h0(iArr)) {
            return iArr;
        }
        int[] copyOf = Arrays.copyOf(iArr, iArr.length);
        Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(this, size)");
        int[] q = C11431q1.m44054q(copyOf);
        m41848Wa(q);
        return q;
    }

    @C11531s
    @C11665v0(version = "1.3")
    @C12579k
    /* renamed from: uc */
    public static final List<C11400l1> m42185uc(@C12579k byte[] bArr, int i) {
        boolean z;
        Intrinsics.checkNotNullParameter(bArr, "$this$takeLast");
        if (i >= 0) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            throw new IllegalArgumentException(("Requested element count " + i + " is less than zero.").toString());
        } else if (i == 0) {
            return CollectionsKt__CollectionsKt.m40441E();
        } else {
            int X = C11404m1.m43809X(bArr);
            if (i >= X) {
                return CollectionsKt___CollectionsKt.m40557Q5(C11404m1.m43812h(bArr));
            }
            if (i == 1) {
                return C10976s.m41419k(C11400l1.m43782g(C11404m1.m43808Q(bArr, X - 1)));
            }
            ArrayList arrayList = new ArrayList(i);
            for (int i2 = X - i; i2 < X; i2++) {
                arrayList.add(C11400l1.m43782g(C11404m1.m43808Q(bArr, i2)));
            }
            return arrayList;
        }
    }

    @C11531s
    @C11665v0(version = "1.3")
    @C12579k
    /* renamed from: ud */
    public static final List<Pair<C11679z1, C11679z1>> m42186ud(@C12579k short[] sArr, @C12579k short[] sArr2) {
        Intrinsics.checkNotNullParameter(sArr, "$this$zip");
        Intrinsics.checkNotNullParameter(sArr2, "other");
        int min = Math.min(C10857a2.m38727X(sArr), C10857a2.m38727X(sArr2));
        ArrayList arrayList = new ArrayList(min);
        for (int i = 0; i < min; i++) {
            arrayList.add(C11078d1.m42659a(C11679z1.m45862g(C10857a2.m38726Q(sArr, i)), C11679z1.m45862g(C10857a2.m38726Q(sArr2, i))));
        }
        return arrayList;
    }

    @C11531s
    @C11110f
    @C11665v0(version = "1.4")
    /* renamed from: v0 */
    public static final <V, M extends Map<? super C11400l1, ? super V>> M m42187v0(byte[] bArr, M m, C11300l<? super C11400l1, ? extends V> lVar) {
        Intrinsics.checkNotNullParameter(bArr, "$this$associateWithTo");
        Intrinsics.checkNotNullParameter(m, FirebaseAnalytics.C32532b.f78977z);
        Intrinsics.checkNotNullParameter(lVar, "valueSelector");
        int X = C11404m1.m43809X(bArr);
        for (int i = 0; i < X; i++) {
            byte Q = C11404m1.m43808Q(bArr, i);
            m.put(C11400l1.m43782g(Q), lVar.invoke(C11400l1.m43782g(Q)));
        }
        return m;
    }

    /* renamed from: v1 */
    public static /* synthetic */ byte[] m42188v1(byte[] bArr, byte[] bArr2, int i, int i2, int i3, int i4, Object obj) {
        if ((i4 & 2) != 0) {
            i = 0;
        }
        if ((i4 & 4) != 0) {
            i2 = 0;
        }
        if ((i4 & 8) != 0) {
            i3 = C11404m1.m43809X(bArr);
        }
        Intrinsics.checkNotNullParameter(bArr, "$this$copyInto");
        Intrinsics.checkNotNullParameter(bArr2, FirebaseAnalytics.C32532b.f78977z);
        C10956m.m41147W0(bArr, bArr2, i, i2, i3);
        return bArr2;
    }

    @C11531s
    @C11110f
    @C11665v0(version = "1.3")
    /* renamed from: v2 */
    public static final List<C11588t1> m42189v2(long[] jArr, C11300l<? super C11588t1, Boolean> lVar) {
        Intrinsics.checkNotNullParameter(jArr, "$this$filter");
        Intrinsics.checkNotNullParameter(lVar, "predicate");
        ArrayList arrayList = new ArrayList();
        int X = C11662u1.m45751X(jArr);
        for (int i = 0; i < X; i++) {
            long Q = C11662u1.m45750Q(jArr, i);
            if (lVar.invoke(C11588t1.m44992g(Q)).booleanValue()) {
                arrayList.add(C11588t1.m44992g(Q));
            }
        }
        return arrayList;
    }

    @C11531s
    @C11110f
    @C11665v0(version = "1.4")
    @C11403m0
    /* renamed from: v3 */
    public static final <R> List<R> m42190v3(int[] iArr, C11304p<? super Integer, ? super C11419p1, ? extends Iterable<? extends R>> pVar) {
        Intrinsics.checkNotNullParameter(iArr, "$this$flatMapIndexed");
        Intrinsics.checkNotNullParameter(pVar, "transform");
        ArrayList arrayList = new ArrayList();
        int X = C11431q1.m44045X(iArr);
        int i = 0;
        int i2 = 0;
        while (i < X) {
            C10994x.m42360n0(arrayList, (Iterable) pVar.invoke(Integer.valueOf(i2), C11419p1.m43993g(C11431q1.m44044Q(iArr, i))));
            i++;
            i2++;
        }
        return arrayList;
    }

    @C11531s
    @C11110f
    @C11665v0(version = "1.3")
    /* renamed from: v4 */
    public static final int m42191v4(int[] iArr, int i, C11300l<? super Integer, C11419p1> lVar) {
        Intrinsics.checkNotNullParameter(iArr, "$this$getOrElse");
        Intrinsics.checkNotNullParameter(lVar, "defaultValue");
        if (i < 0 || i > ArraysKt___ArraysKt.m39459Ve(iArr)) {
            return lVar.invoke(Integer.valueOf(i)).mo22930j2();
        }
        return C11431q1.m44044Q(iArr, i);
    }

    @C11531s
    @C11110f
    @C11665v0(version = "1.3")
    /* renamed from: v5 */
    public static final C11419p1 m42192v5(int[] iArr, C11300l<? super C11419p1, Boolean> lVar) {
        Intrinsics.checkNotNullParameter(iArr, "$this$lastOrNull");
        Intrinsics.checkNotNullParameter(lVar, "predicate");
        int X = C11431q1.m44045X(iArr) - 1;
        if (X < 0) {
            return null;
        }
        while (true) {
            int i = X - 1;
            int Q = C11431q1.m44044Q(iArr, X);
            if (lVar.invoke(C11419p1.m43993g(Q)).booleanValue()) {
                return C11419p1.m43993g(Q);
            }
            if (i < 0) {
                return null;
            }
            X = i;
        }
    }

    @C11531s
    @C11110f
    @C11665v0(version = "1.4")
    @C11403m0
    /* renamed from: v6 */
    public static final <R> R m42193v6(byte[] bArr, Comparator<? super R> comparator, C11300l<? super C11400l1, ? extends R> lVar) {
        Intrinsics.checkNotNullParameter(bArr, "$this$maxOfWith");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        Intrinsics.checkNotNullParameter(lVar, "selector");
        if (!C11404m1.m43813h0(bArr)) {
            R invoke = lVar.invoke(C11400l1.m43782g(C11404m1.m43808Q(bArr, 0)));
            C10953k0 H = new C11466l(1, ArraysKt___ArraysKt.m39331Re(bArr)).iterator();
            while (H.hasNext()) {
                R invoke2 = lVar.invoke(C11400l1.m43782g(C11404m1.m43808Q(bArr, H.mo6374c())));
                if (comparator.compare(invoke, invoke2) < 0) {
                    invoke = invoke2;
                }
            }
            return invoke;
        }
        throw new NoSuchElementException();
    }

    @C11531s
    @C11110f
    @C11665v0(version = "1.4")
    @C11403m0
    /* renamed from: v7 */
    public static final <R extends Comparable<? super R>> R m42194v7(short[] sArr, C11300l<? super C11679z1, ? extends R> lVar) {
        Intrinsics.checkNotNullParameter(sArr, "$this$minOfOrNull");
        Intrinsics.checkNotNullParameter(lVar, "selector");
        if (C10857a2.m38731h0(sArr)) {
            return null;
        }
        R r = (Comparable) lVar.invoke(C11679z1.m45862g(C10857a2.m38726Q(sArr, 0)));
        C10953k0 H = new C11466l(1, ArraysKt___ArraysKt.m39555Ye(sArr)).iterator();
        while (H.hasNext()) {
            R r2 = (Comparable) lVar.invoke(C11679z1.m45862g(C10857a2.m38726Q(sArr, H.mo6374c())));
            if (r.compareTo(r2) > 0) {
                r = r2;
            }
        }
        return r;
    }

    @C11531s
    @C11110f
    @C11665v0(version = "1.3")
    /* renamed from: v8 */
    public static final int[] m42195v8(int[] iArr, int i) {
        Intrinsics.checkNotNullParameter(iArr, "$this$plus");
        return C11431q1.m44054q(C10956m.m41120R3(iArr, i));
    }

    @C11531s
    @C11110f
    @C11665v0(version = "1.4")
    /* renamed from: v9 */
    public static final void m42196v9(long[] jArr, int i, int i2) {
        Intrinsics.checkNotNullParameter(jArr, "$this$reverse");
        ArraysKt___ArraysKt.m38832Br(jArr, i, i2);
    }

    @C11531s
    @C11110f
    @C11665v0(version = "1.3")
    /* renamed from: va */
    public static final int m42197va(int[] iArr, C11300l<? super C11419p1, Boolean> lVar) {
        Intrinsics.checkNotNullParameter(iArr, "$this$single");
        Intrinsics.checkNotNullParameter(lVar, "predicate");
        int X = C11431q1.m44045X(iArr);
        C11419p1 p1Var = null;
        boolean z = false;
        for (int i = 0; i < X; i++) {
            int Q = C11431q1.m44044Q(iArr, i);
            if (lVar.invoke(C11419p1.m43993g(Q)).booleanValue()) {
                if (!z) {
                    p1Var = C11419p1.m43993g(Q);
                    z = true;
                } else {
                    throw new IllegalArgumentException("Array contains more than one matching element.");
                }
            }
        }
        if (z) {
            return p1Var.mo22930j2();
        }
        throw new NoSuchElementException("Array contains no element matching the predicate.");
    }

    @C11531s
    @C11665v0(version = "1.3")
    @C12579k
    /* renamed from: vb */
    public static final byte[] m42198vb(@C12579k byte[] bArr) {
        Intrinsics.checkNotNullParameter(bArr, "$this$sortedArray");
        if (C11404m1.m43813h0(bArr)) {
            return bArr;
        }
        byte[] copyOf = Arrays.copyOf(bArr, bArr.length);
        Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(this, size)");
        byte[] q = C11404m1.m43818q(copyOf);
        m41946db(q);
        return q;
    }

    @C11531s
    @C11665v0(version = "1.3")
    @C12579k
    /* renamed from: vc */
    public static final List<C11679z1> m42199vc(@C12579k short[] sArr, int i) {
        boolean z;
        Intrinsics.checkNotNullParameter(sArr, "$this$takeLast");
        if (i >= 0) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            throw new IllegalArgumentException(("Requested element count " + i + " is less than zero.").toString());
        } else if (i == 0) {
            return CollectionsKt__CollectionsKt.m40441E();
        } else {
            int X = C10857a2.m38727X(sArr);
            if (i >= X) {
                return CollectionsKt___CollectionsKt.m40557Q5(C10857a2.m38730h(sArr));
            }
            if (i == 1) {
                return C10976s.m41419k(C11679z1.m45862g(C10857a2.m38726Q(sArr, X - 1)));
            }
            ArrayList arrayList = new ArrayList(i);
            for (int i2 = X - i; i2 < X; i2++) {
                arrayList.add(C11679z1.m45862g(C10857a2.m38726Q(sArr, i2)));
            }
            return arrayList;
        }
    }

    @C11531s
    @C11665v0(version = "1.3")
    @C12579k
    /* renamed from: vd */
    public static final <R> List<Pair<C11400l1, R>> m42200vd(@C12579k byte[] bArr, @C12579k R[] rArr) {
        Intrinsics.checkNotNullParameter(bArr, "$this$zip");
        Intrinsics.checkNotNullParameter(rArr, "other");
        int min = Math.min(C11404m1.m43809X(bArr), rArr.length);
        ArrayList arrayList = new ArrayList(min);
        for (int i = 0; i < min; i++) {
            byte Q = C11404m1.m43808Q(bArr, i);
            arrayList.add(C11078d1.m42659a(C11400l1.m43782g(Q), rArr[i]));
        }
        return arrayList;
    }

    @C11531s
    @C11110f
    @C11665v0(version = "1.4")
    /* renamed from: w0 */
    public static final <V, M extends Map<? super C11588t1, ? super V>> M m42201w0(long[] jArr, M m, C11300l<? super C11588t1, ? extends V> lVar) {
        Intrinsics.checkNotNullParameter(jArr, "$this$associateWithTo");
        Intrinsics.checkNotNullParameter(m, FirebaseAnalytics.C32532b.f78977z);
        Intrinsics.checkNotNullParameter(lVar, "valueSelector");
        int X = C11662u1.m45751X(jArr);
        for (int i = 0; i < X; i++) {
            long Q = C11662u1.m45750Q(jArr, i);
            m.put(C11588t1.m44992g(Q), lVar.invoke(C11588t1.m44992g(Q)));
        }
        return m;
    }

    @C11531s
    @C11110f
    @C11665v0(version = "1.3")
    /* renamed from: w1 */
    public static final int[] m42202w1(int[] iArr, int[] iArr2, int i, int i2, int i3) {
        Intrinsics.checkNotNullParameter(iArr, "$this$copyInto");
        Intrinsics.checkNotNullParameter(iArr2, FirebaseAnalytics.C32532b.f78977z);
        C10956m.m41171a1(iArr, iArr2, i, i2, i3);
        return iArr2;
    }

    @C11531s
    @C11110f
    @C11665v0(version = "1.3")
    /* renamed from: w2 */
    public static final List<C11419p1> m42203w2(int[] iArr, C11300l<? super C11419p1, Boolean> lVar) {
        Intrinsics.checkNotNullParameter(iArr, "$this$filter");
        Intrinsics.checkNotNullParameter(lVar, "predicate");
        ArrayList arrayList = new ArrayList();
        int X = C11431q1.m44045X(iArr);
        for (int i = 0; i < X; i++) {
            int Q = C11431q1.m44044Q(iArr, i);
            if (lVar.invoke(C11419p1.m43993g(Q)).booleanValue()) {
                arrayList.add(C11419p1.m43993g(Q));
            }
        }
        return arrayList;
    }

    @C11531s
    @C11110f
    @C11665v0(version = "1.4")
    @C11403m0
    /* renamed from: w3 */
    public static final <R> List<R> m42204w3(long[] jArr, C11304p<? super Integer, ? super C11588t1, ? extends Iterable<? extends R>> pVar) {
        Intrinsics.checkNotNullParameter(jArr, "$this$flatMapIndexed");
        Intrinsics.checkNotNullParameter(pVar, "transform");
        ArrayList arrayList = new ArrayList();
        int X = C11662u1.m45751X(jArr);
        int i = 0;
        int i2 = 0;
        while (i < X) {
            C10994x.m42360n0(arrayList, (Iterable) pVar.invoke(Integer.valueOf(i2), C11588t1.m44992g(C11662u1.m45750Q(jArr, i))));
            i++;
            i2++;
        }
        return arrayList;
    }

    @C11531s
    @C11110f
    @C11665v0(version = "1.3")
    /* renamed from: w4 */
    public static final long m42205w4(long[] jArr, int i, C11300l<? super Integer, C11588t1> lVar) {
        Intrinsics.checkNotNullParameter(jArr, "$this$getOrElse");
        Intrinsics.checkNotNullParameter(lVar, "defaultValue");
        if (i < 0 || i > ArraysKt___ArraysKt.m39491We(jArr)) {
            return lVar.invoke(Integer.valueOf(i)).mo23301j2();
        }
        return C11662u1.m45750Q(jArr, i);
    }

    @C11531s
    @C12580l
    @C11665v0(version = "1.3")
    /* renamed from: w5 */
    public static final C11679z1 m42206w5(@C12579k short[] sArr) {
        Intrinsics.checkNotNullParameter(sArr, "$this$lastOrNull");
        if (C10857a2.m38731h0(sArr)) {
            return null;
        }
        return C11679z1.m45862g(C10857a2.m38726Q(sArr, C10857a2.m38727X(sArr) - 1));
    }

    @C11531s
    @C11110f
    @C11665v0(version = "1.4")
    @C11403m0
    /* renamed from: w6 */
    public static final <R> R m42207w6(short[] sArr, Comparator<? super R> comparator, C11300l<? super C11679z1, ? extends R> lVar) {
        Intrinsics.checkNotNullParameter(sArr, "$this$maxOfWith");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        Intrinsics.checkNotNullParameter(lVar, "selector");
        if (!C10857a2.m38731h0(sArr)) {
            R invoke = lVar.invoke(C11679z1.m45862g(C10857a2.m38726Q(sArr, 0)));
            C10953k0 H = new C11466l(1, ArraysKt___ArraysKt.m39555Ye(sArr)).iterator();
            while (H.hasNext()) {
                R invoke2 = lVar.invoke(C11679z1.m45862g(C10857a2.m38726Q(sArr, H.mo6374c())));
                if (comparator.compare(invoke, invoke2) < 0) {
                    invoke = invoke2;
                }
            }
            return invoke;
        }
        throw new NoSuchElementException();
    }

    @C11531s
    @C11110f
    @C11665v0(version = "1.4")
    @C11403m0
    /* renamed from: w7 */
    public static final Double m42208w7(short[] sArr, C11300l<? super C11679z1, Double> lVar) {
        Intrinsics.checkNotNullParameter(sArr, "$this$minOfOrNull");
        Intrinsics.checkNotNullParameter(lVar, "selector");
        if (C10857a2.m38731h0(sArr)) {
            return null;
        }
        double doubleValue = lVar.invoke(C11679z1.m45862g(C10857a2.m38726Q(sArr, 0))).doubleValue();
        C10953k0 H = new C11466l(1, ArraysKt___ArraysKt.m39555Ye(sArr)).iterator();
        while (H.hasNext()) {
            doubleValue = Math.min(doubleValue, lVar.invoke(C11679z1.m45862g(C10857a2.m38726Q(sArr, H.mo6374c()))).doubleValue());
        }
        return Double.valueOf(doubleValue);
    }

    @C11531s
    @C11110f
    @C11665v0(version = "1.3")
    /* renamed from: w8 */
    public static final long[] m42209w8(long[] jArr, long[] jArr2) {
        Intrinsics.checkNotNullParameter(jArr, "$this$plus");
        Intrinsics.checkNotNullParameter(jArr2, "elements");
        return C11662u1.m45760q(C10956m.m41150W3(jArr, jArr2));
    }

    @C11531s
    @C11110f
    @C11665v0(version = "1.4")
    /* renamed from: w9 */
    public static final void m42210w9(byte[] bArr, int i, int i2) {
        Intrinsics.checkNotNullParameter(bArr, "$this$reverse");
        ArraysKt___ArraysKt.m40164rr(bArr, i, i2);
    }

    @C11531s
    @C11110f
    @C11665v0(version = "1.3")
    /* renamed from: wa */
    public static final short m42211wa(short[] sArr) {
        Intrinsics.checkNotNullParameter(sArr, "$this$single");
        return C11679z1.m45841M(ArraysKt___ArraysKt.m39090Jt(sArr));
    }

    @C11531s
    @C11665v0(version = "1.3")
    @C12579k
    /* renamed from: wb */
    public static final long[] m42212wb(@C12579k long[] jArr) {
        Intrinsics.checkNotNullParameter(jArr, "$this$sortedArray");
        if (C11662u1.m45755h0(jArr)) {
            return jArr;
        }
        long[] copyOf = Arrays.copyOf(jArr, jArr.length);
        Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(this, size)");
        long[] q = C11662u1.m45760q(copyOf);
        m41960eb(q);
        return q;
    }

    @C11531s
    @C11665v0(version = "1.3")
    @C12579k
    /* renamed from: wc */
    public static final List<C11419p1> m42213wc(@C12579k int[] iArr, int i) {
        boolean z;
        Intrinsics.checkNotNullParameter(iArr, "$this$takeLast");
        if (i >= 0) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            throw new IllegalArgumentException(("Requested element count " + i + " is less than zero.").toString());
        } else if (i == 0) {
            return CollectionsKt__CollectionsKt.m40441E();
        } else {
            int X = C11431q1.m44045X(iArr);
            if (i >= X) {
                return CollectionsKt___CollectionsKt.m40557Q5(C11431q1.m44048h(iArr));
            }
            if (i == 1) {
                return C10976s.m41419k(C11419p1.m43993g(C11431q1.m44044Q(iArr, X - 1)));
            }
            ArrayList arrayList = new ArrayList(i);
            for (int i2 = X - i; i2 < X; i2++) {
                arrayList.add(C11419p1.m43993g(C11431q1.m44044Q(iArr, i2)));
            }
            return arrayList;
        }
    }

    @C11531s
    @C11665v0(version = "1.3")
    @C12579k
    /* renamed from: wd */
    public static final <R> List<Pair<C11679z1, R>> m42214wd(@C12579k short[] sArr, @C12579k R[] rArr) {
        Intrinsics.checkNotNullParameter(sArr, "$this$zip");
        Intrinsics.checkNotNullParameter(rArr, "other");
        int min = Math.min(C10857a2.m38727X(sArr), rArr.length);
        ArrayList arrayList = new ArrayList(min);
        for (int i = 0; i < min; i++) {
            short Q = C10857a2.m38726Q(sArr, i);
            arrayList.add(C11078d1.m42659a(C11679z1.m45862g(Q), rArr[i]));
        }
        return arrayList;
    }

    @C11531s
    @C11110f
    @C11665v0(version = "1.4")
    /* renamed from: x0 */
    public static final <V, M extends Map<? super C11679z1, ? super V>> M m42215x0(short[] sArr, M m, C11300l<? super C11679z1, ? extends V> lVar) {
        Intrinsics.checkNotNullParameter(sArr, "$this$associateWithTo");
        Intrinsics.checkNotNullParameter(m, FirebaseAnalytics.C32532b.f78977z);
        Intrinsics.checkNotNullParameter(lVar, "valueSelector");
        int X = C10857a2.m38727X(sArr);
        for (int i = 0; i < X; i++) {
            short Q = C10857a2.m38726Q(sArr, i);
            m.put(C11679z1.m45862g(Q), lVar.invoke(C11679z1.m45862g(Q)));
        }
        return m;
    }

    /* renamed from: x1 */
    public static /* synthetic */ int[] m42216x1(int[] iArr, int[] iArr2, int i, int i2, int i3, int i4, Object obj) {
        if ((i4 & 2) != 0) {
            i = 0;
        }
        if ((i4 & 4) != 0) {
            i2 = 0;
        }
        if ((i4 & 8) != 0) {
            i3 = C11431q1.m44045X(iArr);
        }
        Intrinsics.checkNotNullParameter(iArr, "$this$copyInto");
        Intrinsics.checkNotNullParameter(iArr2, FirebaseAnalytics.C32532b.f78977z);
        C10956m.m41171a1(iArr, iArr2, i, i2, i3);
        return iArr2;
    }

    @C11531s
    @C11110f
    @C11665v0(version = "1.3")
    /* renamed from: x2 */
    public static final List<C11679z1> m42217x2(short[] sArr, C11300l<? super C11679z1, Boolean> lVar) {
        Intrinsics.checkNotNullParameter(sArr, "$this$filter");
        Intrinsics.checkNotNullParameter(lVar, "predicate");
        ArrayList arrayList = new ArrayList();
        int X = C10857a2.m38727X(sArr);
        for (int i = 0; i < X; i++) {
            short Q = C10857a2.m38726Q(sArr, i);
            if (lVar.invoke(C11679z1.m45862g(Q)).booleanValue()) {
                arrayList.add(C11679z1.m45862g(Q));
            }
        }
        return arrayList;
    }

    @C11531s
    @C11110f
    @C11665v0(version = "1.4")
    @C11403m0
    /* renamed from: x3 */
    public static final <R> List<R> m42218x3(short[] sArr, C11304p<? super Integer, ? super C11679z1, ? extends Iterable<? extends R>> pVar) {
        Intrinsics.checkNotNullParameter(sArr, "$this$flatMapIndexed");
        Intrinsics.checkNotNullParameter(pVar, "transform");
        ArrayList arrayList = new ArrayList();
        int X = C10857a2.m38727X(sArr);
        int i = 0;
        int i2 = 0;
        while (i < X) {
            C10994x.m42360n0(arrayList, (Iterable) pVar.invoke(Integer.valueOf(i2), C11679z1.m45862g(C10857a2.m38726Q(sArr, i))));
            i++;
            i2++;
        }
        return arrayList;
    }

    @C11531s
    @C11110f
    @C11665v0(version = "1.3")
    /* renamed from: x4 */
    public static final byte m42219x4(byte[] bArr, int i, C11300l<? super Integer, C11400l1> lVar) {
        Intrinsics.checkNotNullParameter(bArr, "$this$getOrElse");
        Intrinsics.checkNotNullParameter(lVar, "defaultValue");
        if (i < 0 || i > ArraysKt___ArraysKt.m39331Re(bArr)) {
            return lVar.invoke(Integer.valueOf(i)).mo22897e2();
        }
        return C11404m1.m43808Q(bArr, i);
    }

    @C11531s
    @C11110f
    @C11665v0(version = "1.3")
    /* renamed from: x5 */
    public static final C11679z1 m42220x5(short[] sArr, C11300l<? super C11679z1, Boolean> lVar) {
        Intrinsics.checkNotNullParameter(sArr, "$this$lastOrNull");
        Intrinsics.checkNotNullParameter(lVar, "predicate");
        int X = C10857a2.m38727X(sArr) - 1;
        if (X < 0) {
            return null;
        }
        while (true) {
            int i = X - 1;
            short Q = C10857a2.m38726Q(sArr, X);
            if (lVar.invoke(C11679z1.m45862g(Q)).booleanValue()) {
                return C11679z1.m45862g(Q);
            }
            if (i < 0) {
                return null;
            }
            X = i;
        }
    }

    @C11531s
    @C11110f
    @C11665v0(version = "1.4")
    @C11403m0
    /* renamed from: x6 */
    public static final <R> R m42221x6(int[] iArr, Comparator<? super R> comparator, C11300l<? super C11419p1, ? extends R> lVar) {
        Intrinsics.checkNotNullParameter(iArr, "$this$maxOfWith");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        Intrinsics.checkNotNullParameter(lVar, "selector");
        if (!C11431q1.m44049h0(iArr)) {
            R invoke = lVar.invoke(C11419p1.m43993g(C11431q1.m44044Q(iArr, 0)));
            C10953k0 H = new C11466l(1, ArraysKt___ArraysKt.m39459Ve(iArr)).iterator();
            while (H.hasNext()) {
                R invoke2 = lVar.invoke(C11419p1.m43993g(C11431q1.m44044Q(iArr, H.mo6374c())));
                if (comparator.compare(invoke, invoke2) < 0) {
                    invoke = invoke2;
                }
            }
            return invoke;
        }
        throw new NoSuchElementException();
    }

    @C11531s
    @C11110f
    @C11665v0(version = "1.4")
    @C11403m0
    /* renamed from: x7 */
    public static final Float m42222x7(short[] sArr, C11300l<? super C11679z1, Float> lVar) {
        Intrinsics.checkNotNullParameter(sArr, "$this$minOfOrNull");
        Intrinsics.checkNotNullParameter(lVar, "selector");
        if (C10857a2.m38731h0(sArr)) {
            return null;
        }
        float floatValue = lVar.invoke(C11679z1.m45862g(C10857a2.m38726Q(sArr, 0))).floatValue();
        C10953k0 H = new C11466l(1, ArraysKt___ArraysKt.m39555Ye(sArr)).iterator();
        while (H.hasNext()) {
            floatValue = Math.min(floatValue, lVar.invoke(C11679z1.m45862g(C10857a2.m38726Q(sArr, H.mo6374c()))).floatValue());
        }
        return Float.valueOf(floatValue);
    }

    @C11531s
    @C11665v0(version = "1.3")
    @C12579k
    /* renamed from: x8 */
    public static final byte[] m42223x8(@C12579k byte[] bArr, @C12579k Collection<C11400l1> collection) {
        Intrinsics.checkNotNullParameter(bArr, "$this$plus");
        Intrinsics.checkNotNullParameter(collection, "elements");
        int X = C11404m1.m43809X(bArr);
        byte[] copyOf = Arrays.copyOf(bArr, C11404m1.m43809X(bArr) + collection.size());
        Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(this, newSize)");
        for (C11400l1 e2 : collection) {
            copyOf[X] = e2.mo22897e2();
            X++;
        }
        return C11404m1.m43818q(copyOf);
    }

    @C11531s
    @C11110f
    @C11665v0(version = "1.4")
    /* renamed from: x9 */
    public static final void m42224x9(short[] sArr, int i, int i2) {
        Intrinsics.checkNotNullParameter(sArr, "$this$reverse");
        ArraysKt___ArraysKt.m38960Fr(sArr, i, i2);
    }

    @C11531s
    @C11110f
    @C11665v0(version = "1.3")
    /* renamed from: xa */
    public static final short m42225xa(short[] sArr, C11300l<? super C11679z1, Boolean> lVar) {
        Intrinsics.checkNotNullParameter(sArr, "$this$single");
        Intrinsics.checkNotNullParameter(lVar, "predicate");
        int X = C10857a2.m38727X(sArr);
        C11679z1 z1Var = null;
        boolean z = false;
        for (int i = 0; i < X; i++) {
            short Q = C10857a2.m38726Q(sArr, i);
            if (lVar.invoke(C11679z1.m45862g(Q)).booleanValue()) {
                if (!z) {
                    z1Var = C11679z1.m45862g(Q);
                    z = true;
                } else {
                    throw new IllegalArgumentException("Array contains more than one matching element.");
                }
            }
        }
        if (z) {
            return z1Var.mo23548e2();
        }
        throw new NoSuchElementException("Array contains no element matching the predicate.");
    }

    @C11531s
    @C11665v0(version = "1.3")
    @C12579k
    /* renamed from: xb */
    public static final short[] m42226xb(@C12579k short[] sArr) {
        Intrinsics.checkNotNullParameter(sArr, "$this$sortedArray");
        if (C10857a2.m38731h0(sArr)) {
            return sArr;
        }
        short[] copyOf = Arrays.copyOf(sArr, sArr.length);
        Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(this, size)");
        short[] q = C10857a2.m38736q(copyOf);
        m42002hb(q);
        return q;
    }

    @C11531s
    @C11665v0(version = "1.3")
    @C12579k
    /* renamed from: xc */
    public static final List<C11588t1> m42227xc(@C12579k long[] jArr, int i) {
        boolean z;
        Intrinsics.checkNotNullParameter(jArr, "$this$takeLast");
        if (i >= 0) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            throw new IllegalArgumentException(("Requested element count " + i + " is less than zero.").toString());
        } else if (i == 0) {
            return CollectionsKt__CollectionsKt.m40441E();
        } else {
            int X = C11662u1.m45751X(jArr);
            if (i >= X) {
                return CollectionsKt___CollectionsKt.m40557Q5(C11662u1.m45754h(jArr));
            }
            if (i == 1) {
                return C10976s.m41419k(C11588t1.m44992g(C11662u1.m45750Q(jArr, X - 1)));
            }
            ArrayList arrayList = new ArrayList(i);
            for (int i2 = X - i; i2 < X; i2++) {
                arrayList.add(C11588t1.m44992g(C11662u1.m45750Q(jArr, i2)));
            }
            return arrayList;
        }
    }

    @C11531s
    @C11665v0(version = "1.3")
    @C12579k
    /* renamed from: xd */
    public static final List<Pair<C11588t1, C11588t1>> m42228xd(@C12579k long[] jArr, @C12579k long[] jArr2) {
        Intrinsics.checkNotNullParameter(jArr, "$this$zip");
        Intrinsics.checkNotNullParameter(jArr2, "other");
        int min = Math.min(C11662u1.m45751X(jArr), C11662u1.m45751X(jArr2));
        ArrayList arrayList = new ArrayList(min);
        for (int i = 0; i < min; i++) {
            arrayList.add(C11078d1.m42659a(C11588t1.m44992g(C11662u1.m45750Q(jArr, i)), C11588t1.m44992g(C11662u1.m45750Q(jArr2, i))));
        }
        return arrayList;
    }

    @C11531s
    @C11110f
    @C11665v0(version = "1.3")
    /* renamed from: y0 */
    public static final int m42229y0(int[] iArr) {
        Intrinsics.checkNotNullParameter(iArr, "$this$component1");
        return C11431q1.m44044Q(iArr, 0);
    }

    @C11531s
    @C11110f
    @C11665v0(version = "1.3")
    /* renamed from: y1 */
    public static final int[] m42230y1(int[] iArr) {
        Intrinsics.checkNotNullParameter(iArr, "$this$copyOf");
        int[] copyOf = Arrays.copyOf(iArr, iArr.length);
        Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(this, size)");
        return C11431q1.m44054q(copyOf);
    }

    @C11531s
    @C11110f
    @C11665v0(version = "1.3")
    /* renamed from: y2 */
    public static final List<C11400l1> m42231y2(byte[] bArr, C11304p<? super Integer, ? super C11400l1, Boolean> pVar) {
        Intrinsics.checkNotNullParameter(bArr, "$this$filterIndexed");
        Intrinsics.checkNotNullParameter(pVar, "predicate");
        ArrayList arrayList = new ArrayList();
        int X = C11404m1.m43809X(bArr);
        int i = 0;
        int i2 = 0;
        while (i < X) {
            byte Q = C11404m1.m43808Q(bArr, i);
            int i3 = i2 + 1;
            if (pVar.invoke(Integer.valueOf(i2), C11400l1.m43782g(Q)).booleanValue()) {
                arrayList.add(C11400l1.m43782g(Q));
            }
            i++;
            i2 = i3;
        }
        return arrayList;
    }

    @C11531s
    @C11110f
    @C11665v0(version = "1.4")
    @C11403m0
    /* renamed from: y3 */
    public static final <R, C extends Collection<? super R>> C m42232y3(int[] iArr, C c, C11304p<? super Integer, ? super C11419p1, ? extends Iterable<? extends R>> pVar) {
        Intrinsics.checkNotNullParameter(iArr, "$this$flatMapIndexedTo");
        Intrinsics.checkNotNullParameter(c, FirebaseAnalytics.C32532b.f78977z);
        Intrinsics.checkNotNullParameter(pVar, "transform");
        int X = C11431q1.m44045X(iArr);
        int i = 0;
        int i2 = 0;
        while (i < X) {
            C10994x.m42360n0(c, (Iterable) pVar.invoke(Integer.valueOf(i2), C11419p1.m43993g(C11431q1.m44044Q(iArr, i))));
            i++;
            i2++;
        }
        return c;
    }

    @C11531s
    @C12580l
    @C11665v0(version = "1.3")
    /* renamed from: y4 */
    public static final C11400l1 m42233y4(@C12579k byte[] bArr, int i) {
        Intrinsics.checkNotNullParameter(bArr, "$this$getOrNull");
        if (i < 0 || i > ArraysKt___ArraysKt.m39331Re(bArr)) {
            return null;
        }
        return C11400l1.m43782g(C11404m1.m43808Q(bArr, i));
    }

    @C11531s
    @C11110f
    @C11665v0(version = "1.3")
    /* renamed from: y5 */
    public static final <R> List<R> m42234y5(byte[] bArr, C11300l<? super C11400l1, ? extends R> lVar) {
        Intrinsics.checkNotNullParameter(bArr, "$this$map");
        Intrinsics.checkNotNullParameter(lVar, "transform");
        ArrayList arrayList = new ArrayList(C11404m1.m43809X(bArr));
        int X = C11404m1.m43809X(bArr);
        for (int i = 0; i < X; i++) {
            arrayList.add(lVar.invoke(C11400l1.m43782g(C11404m1.m43808Q(bArr, i))));
        }
        return arrayList;
    }

    @C11531s
    @C11110f
    @C11665v0(version = "1.4")
    @C11403m0
    /* renamed from: y6 */
    public static final <R> R m42235y6(long[] jArr, Comparator<? super R> comparator, C11300l<? super C11588t1, ? extends R> lVar) {
        Intrinsics.checkNotNullParameter(jArr, "$this$maxOfWithOrNull");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        Intrinsics.checkNotNullParameter(lVar, "selector");
        if (C11662u1.m45755h0(jArr)) {
            return null;
        }
        R invoke = lVar.invoke(C11588t1.m44992g(C11662u1.m45750Q(jArr, 0)));
        C10953k0 H = new C11466l(1, ArraysKt___ArraysKt.m39491We(jArr)).iterator();
        while (H.hasNext()) {
            R invoke2 = lVar.invoke(C11588t1.m44992g(C11662u1.m45750Q(jArr, H.mo6374c())));
            if (comparator.compare(invoke, invoke2) < 0) {
                invoke = invoke2;
            }
        }
        return invoke;
    }

    @C11531s
    @C11110f
    @C11665v0(version = "1.4")
    @C11403m0
    /* renamed from: y7 */
    public static final <R> R m42236y7(long[] jArr, Comparator<? super R> comparator, C11300l<? super C11588t1, ? extends R> lVar) {
        Intrinsics.checkNotNullParameter(jArr, "$this$minOfWith");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        Intrinsics.checkNotNullParameter(lVar, "selector");
        if (!C11662u1.m45755h0(jArr)) {
            R invoke = lVar.invoke(C11588t1.m44992g(C11662u1.m45750Q(jArr, 0)));
            C10953k0 H = new C11466l(1, ArraysKt___ArraysKt.m39491We(jArr)).iterator();
            while (H.hasNext()) {
                R invoke2 = lVar.invoke(C11588t1.m44992g(C11662u1.m45750Q(jArr, H.mo6374c())));
                if (comparator.compare(invoke, invoke2) > 0) {
                    invoke = invoke2;
                }
            }
            return invoke;
        }
        throw new NoSuchElementException();
    }

    @C11531s
    @C11110f
    @C11665v0(version = "1.3")
    /* renamed from: y8 */
    public static final int m42237y8(int[] iArr) {
        Intrinsics.checkNotNullParameter(iArr, "$this$random");
        return m42250z8(iArr, Random.f28564a);
    }

    @C11531s
    @C11110f
    @C11665v0(version = "1.3")
    /* renamed from: y9 */
    public static final void m42238y9(byte[] bArr) {
        Intrinsics.checkNotNullParameter(bArr, "$this$reverse");
        ArraysKt___ArraysKt.m40133qr(bArr);
    }

    @C11531s
    @C12580l
    @C11665v0(version = "1.3")
    /* renamed from: ya */
    public static final C11419p1 m42239ya(@C12579k int[] iArr) {
        Intrinsics.checkNotNullParameter(iArr, "$this$singleOrNull");
        if (C11431q1.m44045X(iArr) == 1) {
            return C11419p1.m43993g(C11431q1.m44044Q(iArr, 0));
        }
        return null;
    }

    @C11531s
    @C11665v0(version = "1.3")
    @C12579k
    /* renamed from: yb */
    public static final int[] m42240yb(@C12579k int[] iArr) {
        Intrinsics.checkNotNullParameter(iArr, "$this$sortedArrayDescending");
        if (C11431q1.m44049h0(iArr)) {
            return iArr;
        }
        int[] copyOf = Arrays.copyOf(iArr, iArr.length);
        Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(this, size)");
        int[] q = C11431q1.m44054q(copyOf);
        m42016ib(q);
        return q;
    }

    @C11531s
    @C11110f
    @C11665v0(version = "1.3")
    /* renamed from: yc */
    public static final List<C11400l1> m42241yc(byte[] bArr, C11300l<? super C11400l1, Boolean> lVar) {
        Intrinsics.checkNotNullParameter(bArr, "$this$takeLastWhile");
        Intrinsics.checkNotNullParameter(lVar, "predicate");
        for (int Re = ArraysKt___ArraysKt.m39331Re(bArr); -1 < Re; Re--) {
            if (!lVar.invoke(C11400l1.m43782g(C11404m1.m43808Q(bArr, Re))).booleanValue()) {
                return m41734O1(bArr, Re + 1);
            }
        }
        return CollectionsKt___CollectionsKt.m40557Q5(C11404m1.m43812h(bArr));
    }

    @C11531s
    @C11110f
    @C11665v0(version = "1.3")
    /* renamed from: z0 */
    public static final byte m42242z0(byte[] bArr) {
        Intrinsics.checkNotNullParameter(bArr, "$this$component1");
        return C11404m1.m43808Q(bArr, 0);
    }

    @C11531s
    @C11110f
    @C11665v0(version = "1.3")
    /* renamed from: z1 */
    public static final byte[] m42243z1(byte[] bArr) {
        Intrinsics.checkNotNullParameter(bArr, "$this$copyOf");
        byte[] copyOf = Arrays.copyOf(bArr, bArr.length);
        Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(this, size)");
        return C11404m1.m43818q(copyOf);
    }

    @C11531s
    @C11110f
    @C11665v0(version = "1.3")
    /* renamed from: z2 */
    public static final List<C11419p1> m42244z2(int[] iArr, C11304p<? super Integer, ? super C11419p1, Boolean> pVar) {
        Intrinsics.checkNotNullParameter(iArr, "$this$filterIndexed");
        Intrinsics.checkNotNullParameter(pVar, "predicate");
        ArrayList arrayList = new ArrayList();
        int X = C11431q1.m44045X(iArr);
        int i = 0;
        int i2 = 0;
        while (i < X) {
            int Q = C11431q1.m44044Q(iArr, i);
            int i3 = i2 + 1;
            if (pVar.invoke(Integer.valueOf(i2), C11419p1.m43993g(Q)).booleanValue()) {
                arrayList.add(C11419p1.m43993g(Q));
            }
            i++;
            i2 = i3;
        }
        return arrayList;
    }

    @C11531s
    @C11110f
    @C11665v0(version = "1.4")
    @C11403m0
    /* renamed from: z3 */
    public static final <R, C extends Collection<? super R>> C m42245z3(short[] sArr, C c, C11304p<? super Integer, ? super C11679z1, ? extends Iterable<? extends R>> pVar) {
        Intrinsics.checkNotNullParameter(sArr, "$this$flatMapIndexedTo");
        Intrinsics.checkNotNullParameter(c, FirebaseAnalytics.C32532b.f78977z);
        Intrinsics.checkNotNullParameter(pVar, "transform");
        int X = C10857a2.m38727X(sArr);
        int i = 0;
        int i2 = 0;
        while (i < X) {
            C10994x.m42360n0(c, (Iterable) pVar.invoke(Integer.valueOf(i2), C11679z1.m45862g(C10857a2.m38726Q(sArr, i))));
            i++;
            i2++;
        }
        return c;
    }

    @C11531s
    @C12580l
    @C11665v0(version = "1.3")
    /* renamed from: z4 */
    public static final C11679z1 m42246z4(@C12579k short[] sArr, int i) {
        Intrinsics.checkNotNullParameter(sArr, "$this$getOrNull");
        if (i < 0 || i > ArraysKt___ArraysKt.m39555Ye(sArr)) {
            return null;
        }
        return C11679z1.m45862g(C10857a2.m38726Q(sArr, i));
    }

    @C11531s
    @C11110f
    @C11665v0(version = "1.3")
    /* renamed from: z5 */
    public static final <R> List<R> m42247z5(long[] jArr, C11300l<? super C11588t1, ? extends R> lVar) {
        Intrinsics.checkNotNullParameter(jArr, "$this$map");
        Intrinsics.checkNotNullParameter(lVar, "transform");
        ArrayList arrayList = new ArrayList(C11662u1.m45751X(jArr));
        int X = C11662u1.m45751X(jArr);
        for (int i = 0; i < X; i++) {
            arrayList.add(lVar.invoke(C11588t1.m44992g(C11662u1.m45750Q(jArr, i))));
        }
        return arrayList;
    }

    @C11531s
    @C11110f
    @C11665v0(version = "1.4")
    @C11403m0
    /* renamed from: z6 */
    public static final <R> R m42248z6(byte[] bArr, Comparator<? super R> comparator, C11300l<? super C11400l1, ? extends R> lVar) {
        Intrinsics.checkNotNullParameter(bArr, "$this$maxOfWithOrNull");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        Intrinsics.checkNotNullParameter(lVar, "selector");
        if (C11404m1.m43813h0(bArr)) {
            return null;
        }
        R invoke = lVar.invoke(C11400l1.m43782g(C11404m1.m43808Q(bArr, 0)));
        C10953k0 H = new C11466l(1, ArraysKt___ArraysKt.m39331Re(bArr)).iterator();
        while (H.hasNext()) {
            R invoke2 = lVar.invoke(C11400l1.m43782g(C11404m1.m43808Q(bArr, H.mo6374c())));
            if (comparator.compare(invoke, invoke2) < 0) {
                invoke = invoke2;
            }
        }
        return invoke;
    }

    @C11531s
    @C11110f
    @C11665v0(version = "1.4")
    @C11403m0
    /* renamed from: z7 */
    public static final <R> R m42249z7(byte[] bArr, Comparator<? super R> comparator, C11300l<? super C11400l1, ? extends R> lVar) {
        Intrinsics.checkNotNullParameter(bArr, "$this$minOfWith");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        Intrinsics.checkNotNullParameter(lVar, "selector");
        if (!C11404m1.m43813h0(bArr)) {
            R invoke = lVar.invoke(C11400l1.m43782g(C11404m1.m43808Q(bArr, 0)));
            C10953k0 H = new C11466l(1, ArraysKt___ArraysKt.m39331Re(bArr)).iterator();
            while (H.hasNext()) {
                R invoke2 = lVar.invoke(C11400l1.m43782g(C11404m1.m43808Q(bArr, H.mo6374c())));
                if (comparator.compare(invoke, invoke2) > 0) {
                    invoke = invoke2;
                }
            }
            return invoke;
        }
        throw new NoSuchElementException();
    }

    @C11531s
    @C11665v0(version = "1.3")
    /* renamed from: z8 */
    public static final int m42250z8(@C12579k int[] iArr, @C12579k Random random) {
        Intrinsics.checkNotNullParameter(iArr, "$this$random");
        Intrinsics.checkNotNullParameter(random, BaseOptionModel.f27465E0);
        if (!C11431q1.m44049h0(iArr)) {
            return C11431q1.m44044Q(iArr, random.mo22986m(C11431q1.m44045X(iArr)));
        }
        throw new NoSuchElementException("Array is empty.");
    }

    @C11531s
    @C11110f
    @C11665v0(version = "1.3")
    /* renamed from: z9 */
    public static final void m42251z9(long[] jArr) {
        Intrinsics.checkNotNullParameter(jArr, "$this$reverse");
        ArraysKt___ArraysKt.m38800Ar(jArr);
    }

    @C11531s
    @C12580l
    @C11665v0(version = "1.3")
    /* renamed from: za */
    public static final C11400l1 m42252za(@C12579k byte[] bArr) {
        Intrinsics.checkNotNullParameter(bArr, "$this$singleOrNull");
        if (C11404m1.m43809X(bArr) == 1) {
            return C11400l1.m43782g(C11404m1.m43808Q(bArr, 0));
        }
        return null;
    }

    @C11531s
    @C11665v0(version = "1.3")
    @C12579k
    /* renamed from: zb */
    public static final byte[] m42253zb(@C12579k byte[] bArr) {
        Intrinsics.checkNotNullParameter(bArr, "$this$sortedArrayDescending");
        if (C11404m1.m43813h0(bArr)) {
            return bArr;
        }
        byte[] copyOf = Arrays.copyOf(bArr, bArr.length);
        Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(this, size)");
        byte[] q = C11404m1.m43818q(copyOf);
        m42072mb(q);
        return q;
    }

    @C11531s
    @C11110f
    @C11665v0(version = "1.3")
    /* renamed from: zc */
    public static final List<C11588t1> m42254zc(long[] jArr, C11300l<? super C11588t1, Boolean> lVar) {
        Intrinsics.checkNotNullParameter(jArr, "$this$takeLastWhile");
        Intrinsics.checkNotNullParameter(lVar, "predicate");
        for (int We = ArraysKt___ArraysKt.m39491We(jArr); -1 < We; We--) {
            if (!lVar.invoke(C11588t1.m44992g(C11662u1.m45750Q(jArr, We))).booleanValue()) {
                return m41773R1(jArr, We + 1);
            }
        }
        return CollectionsKt___CollectionsKt.m40557Q5(C11662u1.m45754h(jArr));
    }
}
