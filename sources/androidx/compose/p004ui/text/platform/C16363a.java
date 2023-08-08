package androidx.compose.p004ui.text.platform;

import android.graphics.Typeface;
import android.os.Build;
import android.text.SpannableString;
import android.text.style.ScaleXSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import android.text.style.TypefaceSpan;
import android.text.style.UnderlineSpan;
import androidx.annotation.RestrictTo;
import androidx.compose.p004ui.graphics.C15205e4;
import androidx.compose.p004ui.text.C16151c0;
import androidx.compose.p004ui.text.C16156d;
import androidx.compose.p004ui.text.C16261i;
import androidx.compose.p004ui.text.C16405r0;
import androidx.compose.p004ui.text.C16407s0;
import androidx.compose.p004ui.text.font.C16190e0;
import androidx.compose.p004ui.text.font.C16194f0;
import androidx.compose.p004ui.text.font.C16200h;
import androidx.compose.p004ui.text.font.C16209i0;
import androidx.compose.p004ui.text.font.C16216k0;
import androidx.compose.p004ui.text.font.C16226o;
import androidx.compose.p004ui.text.font.C16238t;
import androidx.compose.p004ui.text.font.C16242u;
import androidx.compose.p004ui.text.intl.C16342f;
import androidx.compose.p004ui.text.platform.extensions.C16374e;
import androidx.compose.p004ui.text.platform.extensions.C16375f;
import androidx.compose.p004ui.text.platform.extensions.SpannableExtensions_androidKt;
import androidx.compose.p004ui.text.style.C16410a;
import androidx.compose.p004ui.text.style.C16434j;
import androidx.compose.p004ui.text.style.C16439m;
import androidx.compose.p004ui.unit.C16479d;
import java.util.List;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

@C11363r0({"SMAP\nAndroidAccessibilitySpannableString.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidAccessibilitySpannableString.android.kt\nandroidx/compose/ui/text/platform/AndroidAccessibilitySpannableString_androidKt\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,198:1\n33#2,6:199\n33#2,6:205\n33#2,6:211\n*S KotlinDebug\n*F\n+ 1 AndroidAccessibilitySpannableString.android.kt\nandroidx/compose/ui/text/platform/AndroidAccessibilitySpannableString_androidKt\n*L\n75#1:199,6\n82#1:205,6\n91#1:211,6\n*E\n"})
/* renamed from: androidx.compose.ui.text.platform.a */
public final class C16363a {
    /* renamed from: a */
    public static final void m73864a(SpannableString spannableString, C16151c0 c0Var, int i, int i2, C16479d dVar, C16242u.C16244b bVar) {
        int i3;
        int i4;
        SpannableExtensions_androidKt.m73892j(spannableString, c0Var.mo46611o(), i, i2);
        SpannableExtensions_androidKt.m73896n(spannableString, c0Var.mo46615t(), dVar, i, i2);
        if (!(c0Var.mo46619w() == null && c0Var.mo46617u() == null)) {
            C16209i0 w = c0Var.mo46619w();
            if (w == null) {
                w = C16209i0.f40292b.mo46952m();
            }
            C16190e0 u = c0Var.mo46617u();
            if (u != null) {
                i4 = u.mo46880j();
            } else {
                i4 = C16190e0.f40252b.mo46883b();
            }
            spannableString.setSpan(new StyleSpan(C16200h.m72990c(w, i4)), i, i2, 33);
        }
        if (c0Var.mo46613r() != null) {
            if (c0Var.mo46613r() instanceof C16216k0) {
                spannableString.setSpan(new TypefaceSpan(((C16216k0) c0Var.mo46613r()).mo46975H()), i, i2, 33);
            } else if (Build.VERSION.SDK_INT >= 28) {
                C16242u r = c0Var.mo46613r();
                C16194f0 v = c0Var.mo46618v();
                if (v != null) {
                    i3 = v.mo46893m();
                } else {
                    i3 = C16194f0.f40257b.mo46895a();
                }
                Object value = C16242u.C16244b.m73173c(bVar, r, (C16209i0) null, 0, i3, 6, (Object) null).getValue();
                Intrinsics.checkNotNull(value, "null cannot be cast to non-null type android.graphics.Typeface");
                spannableString.setSpan(C16390s.f40643a.mo47559a((Typeface) value), i, i2, 33);
            }
        }
        if (c0Var.mo46592B() != null) {
            C16434j B = c0Var.mo46592B();
            C16434j.C16435a aVar = C16434j.f40726b;
            if (B.mo47674d(aVar.mo47683f())) {
                spannableString.setSpan(new UnderlineSpan(), i, i2, 33);
            }
            if (c0Var.mo46592B().mo47674d(aVar.mo47681b())) {
                spannableString.setSpan(new StrikethroughSpan(), i, i2, 33);
            }
        }
        if (c0Var.mo46594D() != null) {
            spannableString.setSpan(new ScaleXSpan(c0Var.mo46594D().mo47694d()), i, i2, 33);
        }
        SpannableExtensions_androidKt.m73900r(spannableString, c0Var.mo46621y(), i, i2);
        SpannableExtensions_androidKt.m73889g(spannableString, c0Var.mo46608k(), i, i2);
    }

    @C16261i
    @C12579k
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* renamed from: b */
    public static final SpannableString m73865b(@C12579k C16156d dVar, @C12579k C16479d dVar2, @C12579k C16238t.C16240b bVar) {
        Intrinsics.checkNotNullParameter(dVar, "<this>");
        Intrinsics.checkNotNullParameter(dVar2, "density");
        Intrinsics.checkNotNullParameter(bVar, "resourceLoader");
        return m73866c(dVar, dVar2, C16226o.m73118a(bVar));
    }

    @C16261i
    @C12579k
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* renamed from: c */
    public static final SpannableString m73866c(@C12579k C16156d dVar, @C12579k C16479d dVar2, @C12579k C16242u.C16244b bVar) {
        C16156d dVar3 = dVar;
        Intrinsics.checkNotNullParameter(dVar3, "<this>");
        Intrinsics.checkNotNullParameter(dVar2, "density");
        Intrinsics.checkNotNullParameter(bVar, "fontFamilyResolver");
        SpannableString spannableString = new SpannableString(dVar.mo46683j());
        List<C16156d.C16159b<C16151c0>> g = dVar.mo46679g();
        if (g != null) {
            int size = g.size();
            for (int i = 0; i < size; i++) {
                C16156d.C16159b bVar2 = g.get(i);
                m73864a(spannableString, C16151c0.m72646f((C16151c0) bVar2.mo46731a(), 0, 0, (C16209i0) null, (C16190e0) null, (C16194f0) null, (C16242u) null, (String) null, 0, (C16410a) null, (C16439m) null, (C16342f) null, 0, (C16434j) null, (C15205e4) null, 16351, (Object) null), bVar2.mo46732b(), bVar2.mo46733c(), dVar2, bVar);
            }
        }
        List<C16156d.C16159b<C16405r0>> k = dVar3.mo46684k(0, dVar.length());
        int size2 = k.size();
        for (int i2 = 0; i2 < size2; i2++) {
            C16156d.C16159b bVar3 = k.get(i2);
            spannableString.setSpan(C16374e.m73923a((C16405r0) bVar3.mo46731a()), bVar3.mo46732b(), bVar3.mo46733c(), 33);
        }
        List<C16156d.C16159b<C16407s0>> l = dVar3.mo46685l(0, dVar.length());
        int size3 = l.size();
        for (int i3 = 0; i3 < size3; i3++) {
            C16156d.C16159b bVar4 = l.get(i3);
            spannableString.setSpan(C16375f.m73925a((C16407s0) bVar4.mo46731a()), bVar4.mo46732b(), bVar4.mo46733c(), 33);
        }
        return spannableString;
    }
}
