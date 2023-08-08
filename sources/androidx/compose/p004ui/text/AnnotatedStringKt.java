package androidx.compose.p004ui.text;

import androidx.compose.p004ui.text.C16156d;
import androidx.compose.p004ui.text.intl.C16342f;
import com.carrefour.fid.android.shared.constant.C28534f;
import java.util.ArrayList;
import java.util.List;
import kotlin.C11079d2;
import kotlin.collections.C10976s;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.internal.C11322b0;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.C11479u;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11363r0({"SMAP\nAnnotatedString.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AnnotatedString.kt\nandroidx/compose/ui/text/AnnotatedStringKt\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n+ 3 TempListUtils.kt\nandroidx/compose/ui/text/TempListUtilsKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,1126:1\n33#2,6:1127\n33#2,4:1136\n38#2:1142\n151#2,3:1144\n33#2,4:1147\n154#2,2:1151\n38#2:1153\n156#2:1154\n33#2,4:1158\n38#2:1164\n151#2,3:1166\n33#2,4:1169\n154#2,2:1173\n38#2:1175\n156#2:1176\n33#2,4:1180\n38#2:1186\n151#2,3:1188\n33#2,4:1191\n154#2,2:1195\n38#2:1197\n156#2:1198\n151#2,3:1199\n33#2,4:1202\n154#2,2:1206\n38#2:1208\n156#2:1209\n33#2,4:1214\n38#2:1220\n151#2,5:1222\n38#2:1227\n156#2:1228\n35#3,3:1133\n38#3,2:1140\n40#3:1143\n35#3,3:1155\n38#3,2:1162\n40#3:1165\n35#3,3:1177\n38#3,2:1184\n40#3:1187\n35#3,3:1211\n38#3,2:1218\n40#3:1221\n1#4:1210\n*S KotlinDebug\n*F\n+ 1 AnnotatedString.kt\nandroidx/compose/ui/text/AnnotatedStringKt\n*L\n676#1:1127,6\n712#1:1136,4\n712#1:1142\n713#1:1144,3\n713#1:1147,4\n713#1:1151,2\n713#1:1153\n713#1:1154\n739#1:1158,4\n739#1:1164\n740#1:1166,3\n740#1:1169,4\n740#1:1173,2\n740#1:1175\n740#1:1176\n766#1:1180,4\n766#1:1186\n767#1:1188,3\n767#1:1191,4\n767#1:1195,2\n767#1:1197\n767#1:1198\n803#1:1199,3\n803#1:1202,4\n803#1:1206,2\n803#1:1208\n803#1:1209\n1049#1:1214,4\n1049#1:1220\n1049#1:1222,5\n1049#1:1227\n1049#1:1228\n712#1:1133,3\n712#1:1140,2\n712#1:1143\n739#1:1155,3\n739#1:1162,2\n739#1:1165\n766#1:1177,3\n766#1:1184,2\n766#1:1187\n1049#1:1211,3\n1049#1:1218,2\n1049#1:1221\n*E\n"})
/* renamed from: androidx.compose.ui.text.AnnotatedStringKt */
public final class AnnotatedStringKt {
    @C12579k

    /* renamed from: a */
    public static final C16156d f39850a = new C16156d("", (List) null, (List) null, 6, (DefaultConstructorMarker) null);

    /* renamed from: A */
    public static /* synthetic */ C16156d m72236A(C16156d dVar, C16342f fVar, int i, Object obj) {
        if ((i & 1) != 0) {
            fVar = C16342f.f40571c.mo47385a();
        }
        return m72267z(dVar, fVar);
    }

    @C16259h
    @C12579k
    /* renamed from: B */
    public static final <R> R m72237B(@C12579k C16156d.C16157a aVar, @C12579k C16405r0 r0Var, @C12579k C11300l<? super C16156d.C16157a, ? extends R> lVar) {
        Intrinsics.checkNotNullParameter(aVar, "<this>");
        Intrinsics.checkNotNullParameter(r0Var, "ttsAnnotation");
        Intrinsics.checkNotNullParameter(lVar, C28534f.f69159i0);
        int s = aVar.mo46714s(r0Var);
        try {
            return lVar.invoke(aVar);
        } finally {
            C11322b0.m43481d(1);
            aVar.mo46710o(s);
            C11322b0.m43480c(1);
        }
    }

    @C16259h
    @C12579k
    /* renamed from: C */
    public static final <R> R m72238C(@C12579k C16156d.C16157a aVar, @C12579k C16407s0 s0Var, @C12579k C11300l<? super C16156d.C16157a, ? extends R> lVar) {
        Intrinsics.checkNotNullParameter(aVar, "<this>");
        Intrinsics.checkNotNullParameter(s0Var, "urlAnnotation");
        Intrinsics.checkNotNullParameter(lVar, C28534f.f69159i0);
        int t = aVar.mo46715t(s0Var);
        try {
            return lVar.invoke(aVar);
        } finally {
            C11322b0.m43481d(1);
            aVar.mo46710o(t);
            C11322b0.m43480c(1);
        }
    }

    @C16259h
    @C12579k
    /* renamed from: D */
    public static final <R> R m72239D(@C12579k C16156d.C16157a aVar, @C12579k String str, @C12579k String str2, @C12579k C11300l<? super C16156d.C16157a, ? extends R> lVar) {
        Intrinsics.checkNotNullParameter(aVar, "<this>");
        Intrinsics.checkNotNullParameter(str, "tag");
        Intrinsics.checkNotNullParameter(str2, "annotation");
        Intrinsics.checkNotNullParameter(lVar, C28534f.f69159i0);
        int p = aVar.mo46711p(str, str2);
        try {
            return lVar.invoke(aVar);
        } finally {
            C11322b0.m43481d(1);
            aVar.mo46710o(p);
            C11322b0.m43480c(1);
        }
    }

    @C12579k
    /* renamed from: E */
    public static final <R> R m72240E(@C12579k C16156d.C16157a aVar, @C12579k C16451t tVar, @C12579k C11300l<? super C16156d.C16157a, ? extends R> lVar) {
        Intrinsics.checkNotNullParameter(aVar, "<this>");
        Intrinsics.checkNotNullParameter(tVar, "style");
        Intrinsics.checkNotNullParameter(lVar, C28534f.f69159i0);
        int q = aVar.mo46712q(tVar);
        try {
            return lVar.invoke(aVar);
        } finally {
            C11322b0.m43481d(1);
            aVar.mo46710o(q);
            C11322b0.m43480c(1);
        }
    }

    @C12579k
    /* renamed from: F */
    public static final <R> R m72241F(@C12579k C16156d.C16157a aVar, @C12579k C16151c0 c0Var, @C12579k C11300l<? super C16156d.C16157a, ? extends R> lVar) {
        Intrinsics.checkNotNullParameter(aVar, "<this>");
        Intrinsics.checkNotNullParameter(c0Var, "style");
        Intrinsics.checkNotNullParameter(lVar, C28534f.f69159i0);
        int r = aVar.mo46713r(c0Var);
        try {
            return lVar.invoke(aVar);
        } finally {
            C11322b0.m43481d(1);
            aVar.mo46710o(r);
            C11322b0.m43480c(1);
        }
    }

    @C12579k
    /* renamed from: a */
    public static final C16156d m72242a(@C12579k String str, @C12579k C16451t tVar) {
        Intrinsics.checkNotNullParameter(str, "text");
        Intrinsics.checkNotNullParameter(tVar, "paragraphStyle");
        return new C16156d(str, CollectionsKt__CollectionsKt.m40441E(), C10976s.m41419k(new C16156d.C16159b(tVar, 0, str.length())));
    }

    @C12579k
    /* renamed from: b */
    public static final C16156d m72243b(@C12579k String str, @C12579k C16151c0 c0Var, @C12580l C16451t tVar) {
        List list;
        Intrinsics.checkNotNullParameter(str, "text");
        Intrinsics.checkNotNullParameter(c0Var, "spanStyle");
        List k = C10976s.m41419k(new C16156d.C16159b(c0Var, 0, str.length()));
        if (tVar == null) {
            list = CollectionsKt__CollectionsKt.m40441E();
        } else {
            list = C10976s.m41419k(new C16156d.C16159b(tVar, 0, str.length()));
        }
        return new C16156d(str, k, list);
    }

    /* renamed from: c */
    public static /* synthetic */ C16156d m72244c(String str, C16151c0 c0Var, C16451t tVar, int i, Object obj) {
        if ((i & 4) != 0) {
            tVar = null;
        }
        return m72243b(str, c0Var, tVar);
    }

    @C12579k
    /* renamed from: i */
    public static final C16156d m72250i(@C12579k C11300l<? super C16156d.C16157a, C11079d2> lVar) {
        Intrinsics.checkNotNullParameter(lVar, "builder");
        C16156d.C16157a aVar = new C16156d.C16157a(0, 1, (DefaultConstructorMarker) null);
        lVar.invoke(aVar);
        return aVar.mo46716u();
    }

    @C12579k
    /* renamed from: j */
    public static final C16156d m72251j(@C12579k C16156d dVar, @C12579k C16342f fVar) {
        Intrinsics.checkNotNullParameter(dVar, "<this>");
        Intrinsics.checkNotNullParameter(fVar, "localeList");
        return JvmAnnotatedString_jvmKt.m72274b(dVar, new AnnotatedStringKt$capitalize$1(fVar));
    }

    /* renamed from: k */
    public static /* synthetic */ C16156d m72252k(C16156d dVar, C16342f fVar, int i, Object obj) {
        if ((i & 1) != 0) {
            fVar = C16342f.f40571c.mo47385a();
        }
        return m72251j(dVar, fVar);
    }

    /* renamed from: l */
    public static final boolean m72253l(int i, int i2, int i3, int i4) {
        if (i > i3 || i4 > i2) {
            return false;
        }
        if (i2 == i4) {
            if ((i3 == i4) != (i == i2)) {
                return false;
            }
        }
        return true;
    }

    @C12579k
    /* renamed from: m */
    public static final C16156d m72254m(@C12579k C16156d dVar, @C12579k C16342f fVar) {
        Intrinsics.checkNotNullParameter(dVar, "<this>");
        Intrinsics.checkNotNullParameter(fVar, "localeList");
        return JvmAnnotatedString_jvmKt.m72274b(dVar, new AnnotatedStringKt$decapitalize$1(fVar));
    }

    /* renamed from: n */
    public static /* synthetic */ C16156d m72255n(C16156d dVar, C16342f fVar, int i, Object obj) {
        if ((i & 1) != 0) {
            fVar = C16342f.f40571c.mo47385a();
        }
        return m72254m(dVar, fVar);
    }

    @C12579k
    /* renamed from: o */
    public static final C16156d m72256o() {
        return f39850a;
    }

    /* renamed from: p */
    public static final <T> List<C16156d.C16159b<T>> m72257p(List<? extends C16156d.C16159b<? extends T>> list, int i, int i2) {
        boolean z;
        if (i <= i2) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            throw new IllegalArgumentException(("start (" + i + ") should be less than or equal to end (" + i2 + ')').toString());
        } else if (list == null) {
            return null;
        } else {
            ArrayList arrayList = new ArrayList(list.size());
            int size = list.size();
            for (int i3 = 0; i3 < size; i3++) {
                Object obj = list.get(i3);
                C16156d.C16159b bVar = (C16156d.C16159b) obj;
                if (m72261t(i, i2, bVar.mo46740i(), bVar.mo46737g())) {
                    arrayList.add(obj);
                }
            }
            ArrayList arrayList2 = new ArrayList(arrayList.size());
            int size2 = arrayList.size();
            for (int i4 = 0; i4 < size2; i4++) {
                C16156d.C16159b bVar2 = (C16156d.C16159b) arrayList.get(i4);
                arrayList2.add(new C16156d.C16159b(bVar2.mo46738h(), Math.max(i, bVar2.mo46740i()) - i, Math.min(i2, bVar2.mo46737g()) - i, bVar2.mo46741j()));
            }
            if (arrayList2.isEmpty()) {
                return null;
            }
            return arrayList2;
        }
    }

    /* renamed from: q */
    public static final List<C16156d.C16159b<? extends Object>> m72258q(C16156d dVar, int i, int i2) {
        List<C16156d.C16159b<? extends Object>> b;
        if (i == i2 || (b = dVar.mo46672b()) == null) {
            return null;
        }
        if (i == 0 && i2 >= dVar.mo46683j().length()) {
            return b;
        }
        ArrayList arrayList = new ArrayList(b.size());
        int size = b.size();
        for (int i3 = 0; i3 < size; i3++) {
            C16156d.C16159b<? extends Object> bVar = b.get(i3);
            C16156d.C16159b bVar2 = bVar;
            if (m72261t(i, i2, bVar2.mo46740i(), bVar2.mo46737g())) {
                arrayList.add(bVar);
            }
        }
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        int size2 = arrayList.size();
        for (int i4 = 0; i4 < size2; i4++) {
            C16156d.C16159b bVar3 = (C16156d.C16159b) arrayList.get(i4);
            arrayList2.add(new C16156d.C16159b(bVar3.mo46738h(), C11479u.m44334I(bVar3.mo46740i(), i, i2) - i, C11479u.m44334I(bVar3.mo46737g(), i, i2) - i, bVar3.mo46741j()));
        }
        return arrayList2;
    }

    /* renamed from: r */
    public static final List<C16156d.C16159b<C16451t>> m72259r(C16156d dVar, int i, int i2) {
        List<C16156d.C16159b<C16451t>> e;
        if (i == i2 || (e = dVar.mo46676e()) == null) {
            return null;
        }
        if (i == 0 && i2 >= dVar.mo46683j().length()) {
            return e;
        }
        ArrayList arrayList = new ArrayList(e.size());
        int size = e.size();
        for (int i3 = 0; i3 < size; i3++) {
            C16156d.C16159b<C16451t> bVar = e.get(i3);
            C16156d.C16159b bVar2 = bVar;
            if (m72261t(i, i2, bVar2.mo46740i(), bVar2.mo46737g())) {
                arrayList.add(bVar);
            }
        }
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        int size2 = arrayList.size();
        for (int i4 = 0; i4 < size2; i4++) {
            C16156d.C16159b bVar3 = (C16156d.C16159b) arrayList.get(i4);
            arrayList2.add(new C16156d.C16159b(bVar3.mo46738h(), C11479u.m44334I(bVar3.mo46740i(), i, i2) - i, C11479u.m44334I(bVar3.mo46737g(), i, i2) - i));
        }
        return arrayList2;
    }

    /* renamed from: s */
    public static final List<C16156d.C16159b<C16151c0>> m72260s(C16156d dVar, int i, int i2) {
        List<C16156d.C16159b<C16151c0>> g;
        if (i == i2 || (g = dVar.mo46679g()) == null) {
            return null;
        }
        if (i == 0 && i2 >= dVar.mo46683j().length()) {
            return g;
        }
        ArrayList arrayList = new ArrayList(g.size());
        int size = g.size();
        for (int i3 = 0; i3 < size; i3++) {
            C16156d.C16159b<C16151c0> bVar = g.get(i3);
            C16156d.C16159b bVar2 = bVar;
            if (m72261t(i, i2, bVar2.mo46740i(), bVar2.mo46737g())) {
                arrayList.add(bVar);
            }
        }
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        int size2 = arrayList.size();
        for (int i4 = 0; i4 < size2; i4++) {
            C16156d.C16159b bVar3 = (C16156d.C16159b) arrayList.get(i4);
            arrayList2.add(new C16156d.C16159b(bVar3.mo46738h(), C11479u.m44334I(bVar3.mo46740i(), i, i2) - i, C11479u.m44334I(bVar3.mo46737g(), i, i2) - i));
        }
        return arrayList2;
    }

    /* renamed from: t */
    public static final boolean m72261t(int i, int i2, int i3, int i4) {
        if (Math.max(i, i3) < Math.min(i2, i4) || m72253l(i, i2, i3, i4) || m72253l(i3, i4, i, i2)) {
            return true;
        }
        return false;
    }

    @C12579k
    /* renamed from: u */
    public static final <T> List<T> m72262u(@C12579k C16156d dVar, @C12579k C16451t tVar, @C12579k C11304p<? super C16156d, ? super C16156d.C16159b<C16451t>, ? extends T> pVar) {
        Intrinsics.checkNotNullParameter(dVar, "<this>");
        Intrinsics.checkNotNullParameter(tVar, "defaultParagraphStyle");
        Intrinsics.checkNotNullParameter(pVar, C28534f.f69159i0);
        List<C16156d.C16159b<C16451t>> v = m72263v(dVar, tVar);
        ArrayList arrayList = new ArrayList(v.size());
        int size = v.size();
        for (int i = 0; i < size; i++) {
            C16156d.C16159b bVar = v.get(i);
            arrayList.add(pVar.invoke(m72264w(dVar, bVar.mo46740i(), bVar.mo46737g()), bVar));
        }
        return arrayList;
    }

    @C12579k
    /* renamed from: v */
    public static final List<C16156d.C16159b<C16451t>> m72263v(@C12579k C16156d dVar, @C12579k C16451t tVar) {
        Intrinsics.checkNotNullParameter(dVar, "<this>");
        Intrinsics.checkNotNullParameter(tVar, "defaultParagraphStyle");
        int length = dVar.mo46683j().length();
        List<C16156d.C16159b<C16451t>> e = dVar.mo46676e();
        if (e == null) {
            e = CollectionsKt__CollectionsKt.m40441E();
        }
        ArrayList arrayList = new ArrayList();
        int size = e.size();
        int i = 0;
        int i2 = 0;
        while (i < size) {
            C16156d.C16159b bVar = e.get(i);
            C16451t tVar2 = (C16451t) bVar.mo46731a();
            int b = bVar.mo46732b();
            int c = bVar.mo46733c();
            if (b != i2) {
                arrayList.add(new C16156d.C16159b(tVar, i2, b));
            }
            arrayList.add(new C16156d.C16159b(tVar.mo47748v(tVar2), b, c));
            i++;
            i2 = c;
        }
        if (i2 != length) {
            arrayList.add(new C16156d.C16159b(tVar, i2, length));
        }
        if (arrayList.isEmpty()) {
            arrayList.add(new C16156d.C16159b(tVar, 0, 0));
        }
        return arrayList;
    }

    /* renamed from: w */
    public static final C16156d m72264w(C16156d dVar, int i, int i2) {
        String str;
        if (i != i2) {
            str = dVar.mo46683j().substring(i, i2);
            Intrinsics.checkNotNullExpressionValue(str, "this as java.lang.String…ing(startIndex, endIndex)");
        } else {
            str = "";
        }
        return new C16156d(str, m72260s(dVar, i, i2), (List) null, (List) null, 12, (DefaultConstructorMarker) null);
    }

    @C12579k
    /* renamed from: x */
    public static final C16156d m72265x(@C12579k C16156d dVar, @C12579k C16342f fVar) {
        Intrinsics.checkNotNullParameter(dVar, "<this>");
        Intrinsics.checkNotNullParameter(fVar, "localeList");
        return JvmAnnotatedString_jvmKt.m72274b(dVar, new AnnotatedStringKt$toLowerCase$1(fVar));
    }

    /* renamed from: y */
    public static /* synthetic */ C16156d m72266y(C16156d dVar, C16342f fVar, int i, Object obj) {
        if ((i & 1) != 0) {
            fVar = C16342f.f40571c.mo47385a();
        }
        return m72265x(dVar, fVar);
    }

    @C12579k
    /* renamed from: z */
    public static final C16156d m72267z(@C12579k C16156d dVar, @C12579k C16342f fVar) {
        Intrinsics.checkNotNullParameter(dVar, "<this>");
        Intrinsics.checkNotNullParameter(fVar, "localeList");
        return JvmAnnotatedString_jvmKt.m72274b(dVar, new AnnotatedStringKt$toUpperCase$1(fVar));
    }
}
