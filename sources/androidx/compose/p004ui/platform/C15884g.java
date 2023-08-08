package androidx.compose.p004ui.platform;

import android.text.Annotation;
import android.text.SpannableString;
import android.text.Spanned;
import androidx.compose.p004ui.text.C16151c0;
import androidx.compose.p004ui.text.C16156d;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11363r0({"SMAP\nAndroidClipboardManager.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidClipboardManager.android.kt\nandroidx/compose/ui/platform/AndroidClipboardManager_androidKt\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,550:1\n33#2,6:551\n*S KotlinDebug\n*F\n+ 1 AndroidClipboardManager.android.kt\nandroidx/compose/ui/platform/AndroidClipboardManager_androidKt\n*L\n110#1:551,6\n*E\n"})
/* renamed from: androidx.compose.ui.platform.g */
public final class C15884g {

    /* renamed from: A */
    public static final int f39532A = 8;

    /* renamed from: B */
    public static final int f39533B = 5;

    /* renamed from: C */
    public static final int f39534C = 4;

    /* renamed from: D */
    public static final int f39535D = 1;

    /* renamed from: E */
    public static final int f39536E = 1;

    /* renamed from: F */
    public static final int f39537F = 4;

    /* renamed from: G */
    public static final int f39538G = 8;

    /* renamed from: H */
    public static final int f39539H = 4;

    /* renamed from: I */
    public static final int f39540I = 20;
    @C12579k

    /* renamed from: a */
    public static final String f39541a = "plain text";

    /* renamed from: b */
    public static final byte f39542b = 0;

    /* renamed from: c */
    public static final byte f39543c = 1;

    /* renamed from: d */
    public static final byte f39544d = 2;

    /* renamed from: e */
    public static final byte f39545e = 0;

    /* renamed from: f */
    public static final byte f39546f = 1;

    /* renamed from: g */
    public static final byte f39547g = 0;

    /* renamed from: h */
    public static final byte f39548h = 1;

    /* renamed from: i */
    public static final byte f39549i = 2;

    /* renamed from: j */
    public static final byte f39550j = 3;

    /* renamed from: k */
    public static final byte f39551k = 1;

    /* renamed from: l */
    public static final byte f39552l = 2;

    /* renamed from: m */
    public static final byte f39553m = 3;

    /* renamed from: n */
    public static final byte f39554n = 4;

    /* renamed from: o */
    public static final byte f39555o = 5;

    /* renamed from: p */
    public static final byte f39556p = 6;

    /* renamed from: q */
    public static final byte f39557q = 7;

    /* renamed from: r */
    public static final byte f39558r = 8;

    /* renamed from: s */
    public static final byte f39559s = 9;

    /* renamed from: t */
    public static final byte f39560t = 10;

    /* renamed from: u */
    public static final byte f39561u = 11;

    /* renamed from: v */
    public static final byte f39562v = 12;

    /* renamed from: w */
    public static final int f39563w = 1;

    /* renamed from: x */
    public static final int f39564x = 4;

    /* renamed from: y */
    public static final int f39565y = 4;

    /* renamed from: z */
    public static final int f39566z = 8;

    @C12580l
    /* renamed from: a */
    public static final C16156d m71349a(@C12580l CharSequence charSequence) {
        if (charSequence == null) {
            return null;
        }
        if (!(charSequence instanceof Spanned)) {
            return new C16156d(charSequence.toString(), (List) null, (List) null, 6, (DefaultConstructorMarker) null);
        }
        Spanned spanned = (Spanned) charSequence;
        int i = 0;
        Annotation[] annotationArr = (Annotation[]) spanned.getSpans(0, charSequence.length(), Annotation.class);
        ArrayList arrayList = new ArrayList();
        Intrinsics.checkNotNullExpressionValue(annotationArr, "annotations");
        int Xe = ArraysKt___ArraysKt.m39523Xe(annotationArr);
        if (Xe >= 0) {
            while (true) {
                Annotation annotation = annotationArr[i];
                if (Intrinsics.areEqual((Object) annotation.getKey(), (Object) "androidx.compose.text.SpanStyle")) {
                    int spanStart = spanned.getSpanStart(annotation);
                    int spanEnd = spanned.getSpanEnd(annotation);
                    String value = annotation.getValue();
                    Intrinsics.checkNotNullExpressionValue(value, "span.value");
                    arrayList.add(new C16156d.C16159b(new C15924m0(value).mo45835k(), spanStart, spanEnd));
                }
                if (i == Xe) {
                    break;
                }
                i++;
            }
        }
        return new C16156d(charSequence.toString(), arrayList, (List) null, 4, (DefaultConstructorMarker) null);
    }

    @C12579k
    /* renamed from: b */
    public static final CharSequence m71350b(@C12579k C16156d dVar) {
        Intrinsics.checkNotNullParameter(dVar, "<this>");
        if (dVar.mo46678f().isEmpty()) {
            return dVar.mo46683j();
        }
        SpannableString spannableString = new SpannableString(dVar.mo46683j());
        C15957r0 r0Var = new C15957r0();
        List<C16156d.C16159b<C16151c0>> f = dVar.mo46678f();
        int size = f.size();
        for (int i = 0; i < size; i++) {
            C16156d.C16159b bVar = f.get(i);
            int b = bVar.mo46732b();
            int c = bVar.mo46733c();
            r0Var.mo45947q();
            r0Var.mo45935e((C16151c0) bVar.mo46731a());
            spannableString.setSpan(new Annotation("androidx.compose.text.SpanStyle", r0Var.mo45946p()), b, c, 33);
        }
        return spannableString;
    }
}
