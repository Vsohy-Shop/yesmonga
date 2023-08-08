package androidx.compose.p004ui.text.input;

import androidx.compose.p004ui.text.C16156d;
import androidx.compose.p004ui.text.C16356n0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

/* renamed from: androidx.compose.ui.text.input.r0 */
public final class C16317r0 {
    @C12579k
    /* renamed from: a */
    public static final C16156d m73531a(@C12579k TextFieldValue textFieldValue) {
        Intrinsics.checkNotNullParameter(textFieldValue, "<this>");
        return textFieldValue.mo47111f().mo46690p(textFieldValue.mo47113h());
    }

    @C12579k
    /* renamed from: b */
    public static final C16156d m73532b(@C12579k TextFieldValue textFieldValue, int i) {
        Intrinsics.checkNotNullParameter(textFieldValue, "<this>");
        return textFieldValue.mo47111f().subSequence(C16356n0.m73739k(textFieldValue.mo47113h()), Math.min(C16356n0.m73739k(textFieldValue.mo47113h()) + i, textFieldValue.mo47115i().length()));
    }

    @C12579k
    /* renamed from: c */
    public static final C16156d m73533c(@C12579k TextFieldValue textFieldValue, int i) {
        Intrinsics.checkNotNullParameter(textFieldValue, "<this>");
        return textFieldValue.mo47111f().subSequence(Math.max(0, C16356n0.m73740l(textFieldValue.mo47113h()) - i), C16356n0.m73740l(textFieldValue.mo47113h()));
    }
}
