package androidx.compose.p004ui.text.input;

import android.view.inputmethod.ExtractedText;
import androidx.compose.p004ui.text.C16356n0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.C12579k;

/* renamed from: androidx.compose.ui.text.input.y */
public final class C16330y {
    @C12579k
    /* renamed from: a */
    public static final ExtractedText m73573a(@C12579k TextFieldValue textFieldValue) {
        Intrinsics.checkNotNullParameter(textFieldValue, "<this>");
        ExtractedText extractedText = new ExtractedText();
        extractedText.text = textFieldValue.mo47115i();
        extractedText.startOffset = 0;
        extractedText.partialEndOffset = textFieldValue.mo47115i().length();
        extractedText.partialStartOffset = -1;
        extractedText.selectionStart = C16356n0.m73740l(textFieldValue.mo47113h());
        extractedText.selectionEnd = C16356n0.m73739k(textFieldValue.mo47113h());
        extractedText.flags = StringsKt__StringsKt.contains$default((CharSequence) textFieldValue.mo47115i(), 10, false, 2, (Object) null) ^ true ? 1 : 0;
        return extractedText;
    }
}
