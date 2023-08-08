package androidx.compose.p004ui.text;

import androidx.compose.p004ui.geometry.C15094f;
import androidx.compose.p004ui.graphics.C15205e4;
import androidx.compose.p004ui.graphics.C15240j2;
import androidx.compose.p004ui.text.C16156d;
import androidx.compose.p004ui.text.C16356n0;
import androidx.compose.p004ui.text.font.C16209i0;
import androidx.compose.p004ui.text.intl.C16340e;
import androidx.compose.p004ui.text.intl.C16342f;
import androidx.compose.p004ui.text.style.C16410a;
import androidx.compose.p004ui.text.style.C16434j;
import androidx.compose.p004ui.text.style.C16439m;
import androidx.compose.p004ui.text.style.C16442o;
import androidx.compose.p004ui.unit.C16504t;
import androidx.compose.runtime.saveable.C8628e;
import androidx.compose.runtime.saveable.C8629f;
import androidx.compose.runtime.saveable.SaverKt;
import java.util.List;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11363r0({"SMAP\nSavers.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Savers.kt\nandroidx/compose/ui/text/SaversKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,421:1\n1#2:422\n*E\n"})
/* renamed from: androidx.compose.ui.text.SaversKt */
public final class SaversKt {
    @C12579k

    /* renamed from: a */
    public static final C8628e<C16156d, Object> f39863a = SaverKt.m31375a(SaversKt$AnnotatedStringSaver$1.f39882f, SaversKt$AnnotatedStringSaver$2.f39883f);
    @C12579k

    /* renamed from: b */
    public static final C8628e<List<C16156d.C16159b<? extends Object>>, Object> f39864b = SaverKt.m31375a(SaversKt$AnnotationRangeListSaver$1.f39884f, SaversKt$AnnotationRangeListSaver$2.f39885f);
    @C12579k

    /* renamed from: c */
    public static final C8628e<C16156d.C16159b<? extends Object>, Object> f39865c = SaverKt.m31375a(SaversKt$AnnotationRangeSaver$1.f39886f, SaversKt$AnnotationRangeSaver$2.f39887f);
    @C12579k

    /* renamed from: d */
    public static final C8628e<C16452t0, Object> f39866d = SaverKt.m31375a(SaversKt$VerbatimTtsAnnotationSaver$1.f39918f, SaversKt$VerbatimTtsAnnotationSaver$2.f39919f);
    @C12579k

    /* renamed from: e */
    public static final C8628e<C16407s0, Object> f39867e = SaverKt.m31375a(SaversKt$UrlAnnotationSaver$1.f39916f, SaversKt$UrlAnnotationSaver$2.f39917f);
    @C12579k

    /* renamed from: f */
    public static final C8628e<C16451t, Object> f39868f = SaverKt.m31375a(SaversKt$ParagraphStyleSaver$1.f39900f, SaversKt$ParagraphStyleSaver$2.f39901f);
    @C12579k

    /* renamed from: g */
    public static final C8628e<C16151c0, Object> f39869g = SaverKt.m31375a(SaversKt$SpanStyleSaver$1.f39904f, SaversKt$SpanStyleSaver$2.f39905f);
    @C12579k

    /* renamed from: h */
    public static final C8628e<C16434j, Object> f39870h = SaverKt.m31375a(SaversKt$TextDecorationSaver$1.f39906f, SaversKt$TextDecorationSaver$2.f39907f);
    @C12579k

    /* renamed from: i */
    public static final C8628e<C16439m, Object> f39871i = SaverKt.m31375a(SaversKt$TextGeometricTransformSaver$1.f39908f, SaversKt$TextGeometricTransformSaver$2.f39909f);
    @C12579k

    /* renamed from: j */
    public static final C8628e<C16442o, Object> f39872j = SaverKt.m31375a(SaversKt$TextIndentSaver$1.f39910f, SaversKt$TextIndentSaver$2.f39911f);
    @C12579k

    /* renamed from: k */
    public static final C8628e<C16209i0, Object> f39873k = SaverKt.m31375a(SaversKt$FontWeightSaver$1.f39892f, SaversKt$FontWeightSaver$2.f39893f);
    @C12579k

    /* renamed from: l */
    public static final C8628e<C16410a, Object> f39874l = SaverKt.m31375a(SaversKt$BaselineShiftSaver$1.f39888f, SaversKt$BaselineShiftSaver$2.f39889f);
    @C12579k

    /* renamed from: m */
    public static final C8628e<C16356n0, Object> f39875m = SaverKt.m31375a(SaversKt$TextRangeSaver$1.f39912f, SaversKt$TextRangeSaver$2.f39913f);
    @C12579k

    /* renamed from: n */
    public static final C8628e<C15205e4, Object> f39876n = SaverKt.m31375a(SaversKt$ShadowSaver$1.f39902f, SaversKt$ShadowSaver$2.f39903f);
    @C12579k

    /* renamed from: o */
    public static final C8628e<C15240j2, Object> f39877o = SaverKt.m31375a(SaversKt$ColorSaver$1.f39890f, SaversKt$ColorSaver$2.f39891f);
    @C12579k

    /* renamed from: p */
    public static final C8628e<C16504t, Object> f39878p = SaverKt.m31375a(SaversKt$TextUnitSaver$1.f39914f, SaversKt$TextUnitSaver$2.f39915f);
    @C12579k

    /* renamed from: q */
    public static final C8628e<C15094f, Object> f39879q = SaverKt.m31375a(SaversKt$OffsetSaver$1.f39898f, SaversKt$OffsetSaver$2.f39899f);
    @C12579k

    /* renamed from: r */
    public static final C8628e<C16342f, Object> f39880r = SaverKt.m31375a(SaversKt$LocaleListSaver$1.f39894f, SaversKt$LocaleListSaver$2.f39895f);
    @C12579k

    /* renamed from: s */
    public static final C8628e<C16340e, Object> f39881s = SaverKt.m31375a(SaversKt$LocaleSaver$1.f39896f, SaversKt$LocaleSaver$2.f39897f);

    @C12579k
    /* renamed from: e */
    public static final C8628e<C16156d, Object> m72290e() {
        return f39863a;
    }

    /* renamed from: f */
    public static /* synthetic */ void m72291f() {
    }

    @C12579k
    /* renamed from: g */
    public static final C8628e<C16451t, Object> m72292g() {
        return f39868f;
    }

    @C12579k
    /* renamed from: h */
    public static final C8628e<C15094f, Object> m72293h(@C12579k C15094f.C15095a aVar) {
        Intrinsics.checkNotNullParameter(aVar, "<this>");
        return f39879q;
    }

    @C12579k
    /* renamed from: i */
    public static final C8628e<C15240j2, Object> m72294i(@C12579k C15240j2.C15241a aVar) {
        Intrinsics.checkNotNullParameter(aVar, "<this>");
        return f39877o;
    }

    @C12579k
    /* renamed from: j */
    public static final C8628e<C15205e4, Object> m72295j(@C12579k C15205e4.C15206a aVar) {
        Intrinsics.checkNotNullParameter(aVar, "<this>");
        return f39876n;
    }

    @C12579k
    /* renamed from: k */
    public static final C8628e<C16356n0, Object> m72296k(@C12579k C16356n0.C16357a aVar) {
        Intrinsics.checkNotNullParameter(aVar, "<this>");
        return f39875m;
    }

    @C12579k
    /* renamed from: l */
    public static final C8628e<C16209i0, Object> m72297l(@C12579k C16209i0.C16210a aVar) {
        Intrinsics.checkNotNullParameter(aVar, "<this>");
        return f39873k;
    }

    @C12579k
    /* renamed from: m */
    public static final C8628e<C16340e, Object> m72298m(@C12579k C16340e.C16341a aVar) {
        Intrinsics.checkNotNullParameter(aVar, "<this>");
        return f39881s;
    }

    @C12579k
    /* renamed from: n */
    public static final C8628e<C16342f, Object> m72299n(@C12579k C16342f.C16343a aVar) {
        Intrinsics.checkNotNullParameter(aVar, "<this>");
        return f39880r;
    }

    @C12579k
    /* renamed from: o */
    public static final C8628e<C16410a, Object> m72300o(@C12579k C16410a.C16411a aVar) {
        Intrinsics.checkNotNullParameter(aVar, "<this>");
        return f39874l;
    }

    @C12579k
    /* renamed from: p */
    public static final C8628e<C16434j, Object> m72301p(@C12579k C16434j.C16435a aVar) {
        Intrinsics.checkNotNullParameter(aVar, "<this>");
        return f39870h;
    }

    @C12579k
    /* renamed from: q */
    public static final C8628e<C16439m, Object> m72302q(@C12579k C16439m.C16440a aVar) {
        Intrinsics.checkNotNullParameter(aVar, "<this>");
        return f39871i;
    }

    @C12579k
    /* renamed from: r */
    public static final C8628e<C16442o, Object> m72303r(@C12579k C16442o.C16443a aVar) {
        Intrinsics.checkNotNullParameter(aVar, "<this>");
        return f39872j;
    }

    @C12579k
    /* renamed from: s */
    public static final C8628e<C16504t, Object> m72304s(@C12579k C16504t.C16505a aVar) {
        Intrinsics.checkNotNullParameter(aVar, "<this>");
        return f39878p;
    }

    @C12579k
    /* renamed from: t */
    public static final C8628e<C16151c0, Object> m72305t() {
        return f39869g;
    }

    /* renamed from: u */
    public static /* synthetic */ void m72306u() {
    }

    /* renamed from: v */
    public static /* synthetic */ void m72307v() {
    }

    /* renamed from: w */
    public static final /* synthetic */ <Result> Result m72308w(Object obj) {
        if (obj == null) {
            return null;
        }
        Intrinsics.reifiedOperationMarker(1, "Result");
        return obj;
    }

    /* renamed from: x */
    public static final /* synthetic */ <T extends C8628e<Original, Saveable>, Original, Saveable, Result> Result m72309x(Saveable saveable, T t) {
        Intrinsics.checkNotNullParameter(t, "saver");
        if (Intrinsics.areEqual((Object) saveable, (Object) Boolean.FALSE) || saveable == null) {
            return null;
        }
        Result b = t.mo16407b(saveable);
        Intrinsics.reifiedOperationMarker(1, "Result");
        return b;
    }

    @C12580l
    /* renamed from: y */
    public static final <T> T m72310y(@C12580l T t) {
        return t;
    }

    @C12579k
    /* renamed from: z */
    public static final <T extends C8628e<Original, Saveable>, Original, Saveable> Object m72311z(@C12580l Original original, @C12579k T t, @C12579k C8629f fVar) {
        Object a;
        Intrinsics.checkNotNullParameter(t, "saver");
        Intrinsics.checkNotNullParameter(fVar, "scope");
        if (original == null || (a = t.mo16406a(fVar, original)) == null) {
            return Boolean.FALSE;
        }
        return a;
    }
}
