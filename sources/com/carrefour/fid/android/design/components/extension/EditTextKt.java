package com.carrefour.fid.android.design.components.extension;

import android.widget.EditText;
import kotlin.coroutines.C11045c;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.C11907e;
import kotlinx.coroutines.flow.C11909g;
import org.jetbrains.annotations.C12579k;

public final class EditTextKt {
    /* renamed from: a */
    public static final void m152107a(@C12579k EditText editText, @C12579k CharSequence charSequence) {
        Intrinsics.checkNotNullParameter(editText, "<this>");
        Intrinsics.checkNotNullParameter(charSequence, "newText");
        editText.setText(charSequence);
        editText.setSelection(editText.getText().length());
    }

    @C12579k
    /* renamed from: b */
    public static final C11907e<String> m152108b(@C12579k EditText editText) {
        Intrinsics.checkNotNullParameter(editText, "<this>");
        return C11909g.m47488s(new EditTextKt$textChanges$1(editText, (C11045c<? super EditTextKt$textChanges$1>) null));
    }
}
