package com.carrefour.fid.android.shared.extension;

import android.text.Editable;
import android.text.TextWatcher;
import android.view.KeyEvent;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import androidx.core.content.C17318d;
import com.carrefour.fid.android.shared.C28444b;
import com.google.android.gms.analytics.ecommerce.C40383c;
import kotlin.C11079d2;
import kotlin.coroutines.C11045c;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.C11907e;
import kotlinx.coroutines.flow.C11909g;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

public final class EditTextKt {

    /* renamed from: com.carrefour.fid.android.shared.extension.EditTextKt$a */
    public static final class C28707a implements TextWatcher {

        /* renamed from: a */
        public final /* synthetic */ C11300l<String, C11079d2> f70358a;

        public C28707a(C11300l<? super String, C11079d2> lVar) {
            this.f70358a = lVar;
        }

        public void afterTextChanged(@C12580l Editable editable) {
            this.f70358a.invoke(String.valueOf(editable));
        }

        public void beforeTextChanged(@C12580l CharSequence charSequence, int i, int i2, int i3) {
        }

        public void onTextChanged(@C12580l CharSequence charSequence, int i, int i2, int i3) {
        }
    }

    /* renamed from: e */
    public static final void m118795e(@C12579k EditText editText, int i, @C12579k C11300l<? super View, C11079d2> lVar) {
        Intrinsics.checkNotNullParameter(editText, "<this>");
        Intrinsics.checkNotNullParameter(lVar, "onAction");
        editText.setOnEditorActionListener(new C28787w(i, lVar));
    }

    /* renamed from: f */
    public static /* synthetic */ void m118796f(EditText editText, int i, C11300l lVar, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = 0;
        }
        m118795e(editText, i, lVar);
    }

    /* renamed from: g */
    public static final boolean m118797g(int i, C11300l lVar, TextView textView, int i2, KeyEvent keyEvent) {
        Intrinsics.checkNotNullParameter(lVar, "$onAction");
        if (i2 != i) {
            return false;
        }
        Intrinsics.checkNotNullExpressionValue(textView, C40383c.f102945c);
        lVar.invoke(textView);
        return true;
    }

    /* renamed from: h */
    public static final void m118798h(@C12579k EditText editText, @C12579k C11300l<? super String, C11079d2> lVar) {
        Intrinsics.checkNotNullParameter(editText, "<this>");
        Intrinsics.checkNotNullParameter(lVar, "cb");
        editText.addTextChangedListener(new C28707a(lVar));
    }

    /* renamed from: i */
    public static final void m118799i(@C12579k EditText editText, @C12579k C11289a<C11079d2> aVar) {
        Intrinsics.checkNotNullParameter(editText, "<this>");
        Intrinsics.checkNotNullParameter(aVar, "isClicked");
        editText.setOnEditorActionListener(new C28784u(aVar));
    }

    /* renamed from: j */
    public static final boolean m118800j(C11289a aVar, TextView textView, int i, KeyEvent keyEvent) {
        Intrinsics.checkNotNullParameter(aVar, "$isClicked");
        if ((keyEvent == null || keyEvent.getKeyCode() != 66) && i != 6) {
            return false;
        }
        aVar.invoke();
        return false;
    }

    /* renamed from: k */
    public static final void m118801k(@C12579k EditText editText, @C12579k C11289a<C11079d2> aVar) {
        Intrinsics.checkNotNullParameter(editText, "<this>");
        Intrinsics.checkNotNullParameter(aVar, "isClicked");
        editText.setOnEditorActionListener(new C28788x(aVar));
    }

    /* renamed from: l */
    public static final boolean m118802l(C11289a aVar, TextView textView, int i, KeyEvent keyEvent) {
        Intrinsics.checkNotNullParameter(aVar, "$isClicked");
        if ((keyEvent == null || keyEvent.getKeyCode() != 84) && i != 3) {
            return false;
        }
        aVar.invoke();
        return false;
    }

    /* renamed from: m */
    public static final void m118803m(@C12579k EditText editText, int i) {
        Intrinsics.checkNotNullParameter(editText, "<this>");
        editText.getBackground().setTint(C17318d.m79723f(editText.getContext(), i));
        editText.invalidate();
    }

    /* renamed from: n */
    public static final void m118804n(@C12579k EditText editText) {
        Intrinsics.checkNotNullParameter(editText, "<this>");
        editText.setOnFocusChangeListener(new C28786v(editText));
    }

    /* renamed from: o */
    public static final void m118805o(EditText editText, View view, boolean z) {
        int i;
        Intrinsics.checkNotNullParameter(editText, "$this_setColorOnFocusChange");
        if (z) {
            i = C28444b.C28450f.colorPrimary;
        } else {
            i = C28444b.C28450f.txt_grey;
        }
        m118803m(editText, i);
    }

    @C12579k
    /* renamed from: p */
    public static final C11907e<String> m118806p(@C12579k EditText editText) {
        Intrinsics.checkNotNullParameter(editText, "<this>");
        return C11909g.m47488s(new EditTextKt$textChanges$1(editText, (C11045c<? super EditTextKt$textChanges$1>) null));
    }
}
