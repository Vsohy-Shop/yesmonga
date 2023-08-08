package androidx.compose.p004ui.text.platform.extensions;

import android.text.Spannable;
import androidx.compose.p004ui.text.C16156d;
import androidx.compose.p004ui.text.C16454v;
import androidx.compose.p004ui.text.C16455w;
import androidx.compose.p004ui.text.android.style.C16125j;
import androidx.compose.p004ui.unit.C16479d;
import androidx.compose.p004ui.unit.C16504t;
import androidx.compose.p004ui.unit.C16507v;
import androidx.emoji2.text.C19091k;
import java.util.List;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

@C11363r0({"SMAP\nPlaceholderExtensions.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PlaceholderExtensions.android.kt\nandroidx/compose/ui/text/platform/extensions/PlaceholderExtensions_androidKt\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n+ 3 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,93:1\n33#2,6:94\n13579#3,2:100\n*S KotlinDebug\n*F\n+ 1 PlaceholderExtensions.android.kt\nandroidx/compose/ui/text/platform/extensions/PlaceholderExtensions_androidKt\n*L\n35#1:94,6\n48#1:100,2\n*E\n"})
/* renamed from: androidx.compose.ui.text.platform.extensions.c */
public final class C16372c {
    /* renamed from: a */
    public static final int m73911a(long j) {
        long m = C16504t.m74686m(j);
        C16507v.C16508a aVar = C16507v.f40911b;
        if (C16507v.m74732g(m, aVar.mo47909b())) {
            return 0;
        }
        if (C16507v.m74732g(m, aVar.mo47908a())) {
            return 1;
        }
        return 2;
    }

    /* renamed from: b */
    public static /* synthetic */ void m73912b(long j) {
    }

    /* renamed from: c */
    public static final int m73913c(int i) {
        C16455w.C16456a aVar = C16455w.f40785b;
        if (C16455w.m74317k(i, aVar.mo47766a())) {
            return 0;
        }
        if (C16455w.m74317k(i, aVar.mo47772g())) {
            return 1;
        }
        if (C16455w.m74317k(i, aVar.mo47767b())) {
            return 2;
        }
        if (C16455w.m74317k(i, aVar.mo47768c())) {
            return 3;
        }
        if (C16455w.m74317k(i, aVar.mo47771f())) {
            return 4;
        }
        if (C16455w.m74317k(i, aVar.mo47769d())) {
            return 5;
        }
        if (C16455w.m74317k(i, aVar.mo47770e())) {
            return 6;
        }
        throw new IllegalStateException("Invalid PlaceholderVerticalAlign".toString());
    }

    /* renamed from: d */
    public static /* synthetic */ void m73914d(int i) {
    }

    /* renamed from: e */
    public static final void m73915e(Spannable spannable, C16454v vVar, int i, int i2, C16479d dVar) {
        Object[] spans = spannable.getSpans(i, i2, C19091k.class);
        Intrinsics.checkNotNullExpressionValue(spans, "getSpans(start, end, EmojiSpan::class.java)");
        for (Object obj : spans) {
            spannable.removeSpan((C19091k) obj);
        }
        SpannableExtensions_androidKt.m73902t(spannable, new C16125j(C16504t.m74687n(vVar.mo47758e()), m73911a(vVar.mo47758e()), C16504t.m74687n(vVar.mo47756c()), m73911a(vVar.mo47756c()), dVar.mo7419R4() * dVar.getDensity(), m73913c(vVar.mo47757d())), i, i2);
    }

    /* renamed from: f */
    public static final void m73916f(@C12579k Spannable spannable, @C12579k List<C16156d.C16159b<C16454v>> list, @C12579k C16479d dVar) {
        Intrinsics.checkNotNullParameter(spannable, "<this>");
        Intrinsics.checkNotNullParameter(list, "placeholders");
        Intrinsics.checkNotNullParameter(dVar, "density");
        int size = list.size();
        for (int i = 0; i < size; i++) {
            C16156d.C16159b bVar = list.get(i);
            m73915e(spannable, (C16454v) bVar.mo46731a(), bVar.mo46732b(), bVar.mo46733c(), dVar);
        }
    }
}
