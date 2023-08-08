package androidx.compose.p004ui.text.platform;

import android.graphics.Typeface;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.TextPaint;
import android.text.style.CharacterStyle;
import androidx.compose.p004ui.text.C16051a0;
import androidx.compose.p004ui.text.C16151c0;
import androidx.compose.p004ui.text.C16156d;
import androidx.compose.p004ui.text.C16361p0;
import androidx.compose.p004ui.text.C16454v;
import androidx.compose.p004ui.text.C16457x;
import androidx.compose.p004ui.text.font.C16190e0;
import androidx.compose.p004ui.text.font.C16194f0;
import androidx.compose.p004ui.text.font.C16209i0;
import androidx.compose.p004ui.text.font.C16242u;
import androidx.compose.p004ui.text.platform.extensions.C16372c;
import androidx.compose.p004ui.text.platform.extensions.SpannableExtensions_androidKt;
import androidx.compose.p004ui.text.style.C16426h;
import androidx.compose.p004ui.text.style.C16434j;
import androidx.compose.p004ui.text.style.C16442o;
import androidx.compose.p004ui.unit.C16479d;
import androidx.compose.p004ui.unit.C16506u;
import androidx.emoji2.text.C19019f;
import java.util.List;
import kotlin.jvm.functions.C11306r;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

/* renamed from: androidx.compose.ui.text.platform.f */
public final class C16376f {
    @C12579k

    /* renamed from: a */
    public static final C16377a f40633a = new C16377a();

    /* renamed from: androidx.compose.ui.text.platform.f$a */
    public static final class C16377a extends CharacterStyle {
        public void updateDrawState(@C12580l TextPaint textPaint) {
        }
    }

    @C12579k
    /* renamed from: a */
    public static final CharSequence m73926a(@C12579k String str, float f, @C12579k C16361p0 p0Var, @C12579k List<C16156d.C16159b<C16151c0>> list, @C12579k List<C16156d.C16159b<C16454v>> list2, @C12579k C16479d dVar, @C12579k C11306r<? super C16242u, ? super C16209i0, ? super C16190e0, ? super C16194f0, ? extends Typeface> rVar, boolean z) {
        CharSequence charSequence;
        Spannable spannable;
        Intrinsics.checkNotNullParameter(str, "text");
        Intrinsics.checkNotNullParameter(p0Var, "contextTextStyle");
        Intrinsics.checkNotNullParameter(list, "spanStyles");
        Intrinsics.checkNotNullParameter(list2, "placeholders");
        Intrinsics.checkNotNullParameter(dVar, "density");
        Intrinsics.checkNotNullParameter(rVar, "resolveTypeface");
        if (!z || !C19019f.m88870q()) {
            charSequence = str;
        } else {
            charSequence = C19019f.m88864c().mo55974x(str);
            Intrinsics.checkNotNull(charSequence);
        }
        Intrinsics.checkNotNullExpressionValue(charSequence, "if (useEmojiCompat && Em…else {\n        text\n    }");
        if (list.isEmpty() && list2.isEmpty() && Intrinsics.areEqual((Object) p0Var.mo47487O(), (Object) C16442o.f40744c.mo47706a()) && C16506u.m74718s(p0Var.mo47476D())) {
            return charSequence;
        }
        if (charSequence instanceof Spannable) {
            spannable = (Spannable) charSequence;
        } else {
            spannable = new SpannableString(charSequence);
        }
        if (Intrinsics.areEqual((Object) p0Var.mo47484L(), (Object) C16434j.f40726b.mo47683f())) {
            SpannableExtensions_androidKt.m73902t(spannable, f40633a, 0, str.length());
        }
        if (!m73927b(p0Var) || p0Var.mo47477E() != null) {
            C16426h E = p0Var.mo47477E();
            if (E == null) {
                E = C16426h.f40699c.mo47654a();
            }
            Spannable spannable2 = spannable;
            SpannableExtensions_androidKt.m73898p(spannable2, p0Var.mo47476D(), f, dVar, E);
        } else {
            SpannableExtensions_androidKt.m73899q(spannable, p0Var.mo47476D(), f, dVar);
        }
        SpannableExtensions_androidKt.m73906x(spannable, p0Var.mo47487O(), f, dVar);
        SpannableExtensions_androidKt.m73904v(spannable, p0Var, list, dVar, rVar);
        C16372c.m73916f(spannable, list2, dVar);
        return spannable;
    }

    /* renamed from: b */
    public static final boolean m73927b(@C12579k C16361p0 p0Var) {
        C16457x a;
        Intrinsics.checkNotNullParameter(p0Var, "<this>");
        C16051a0 H = p0Var.mo47480H();
        if (H == null || (a = H.mo46275a()) == null) {
            return true;
        }
        return a.mo47774c();
    }
}
