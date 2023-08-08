package androidx.emoji2.viewsintegration;

import android.text.Editable;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputConnectionWrapper;
import android.widget.TextView;
import androidx.annotation.C0337f0;
import androidx.annotation.C0359n0;
import androidx.annotation.C0376v0;
import androidx.annotation.RestrictTo;
import androidx.emoji2.text.C19019f;

@C0376v0(19)
@RestrictTo({RestrictTo.Scope.LIBRARY})
/* renamed from: androidx.emoji2.viewsintegration.c */
public final class C19120c extends InputConnectionWrapper {

    /* renamed from: a */
    public final TextView f48644a;

    /* renamed from: b */
    public final C19121a f48645b;

    /* renamed from: androidx.emoji2.viewsintegration.c$a */
    public static class C19121a {
        /* renamed from: a */
        public boolean mo56406a(@C0359n0 InputConnection inputConnection, @C0359n0 Editable editable, @C0337f0(from = 0) int i, @C0337f0(from = 0) int i2, boolean z) {
            return C19019f.m88865j(inputConnection, editable, i, i2, z);
        }

        /* renamed from: b */
        public void mo56407b(@C0359n0 EditorInfo editorInfo) {
            if (C19019f.m88870q()) {
                C19019f.m88864c().mo55959G(editorInfo);
            }
        }
    }

    public C19120c(@C0359n0 TextView textView, @C0359n0 InputConnection inputConnection, @C0359n0 EditorInfo editorInfo) {
        this(textView, inputConnection, editorInfo, new C19121a());
    }

    /* renamed from: a */
    public final Editable mo56403a() {
        return this.f48644a.getEditableText();
    }

    public boolean deleteSurroundingText(int i, int i2) {
        if (this.f48645b.mo56406a(this, mo56403a(), i, i2, false) || super.deleteSurroundingText(i, i2)) {
            return true;
        }
        return false;
    }

    public boolean deleteSurroundingTextInCodePoints(int i, int i2) {
        if (this.f48645b.mo56406a(this, mo56403a(), i, i2, true) || super.deleteSurroundingTextInCodePoints(i, i2)) {
            return true;
        }
        return false;
    }

    public C19120c(@C0359n0 TextView textView, @C0359n0 InputConnection inputConnection, @C0359n0 EditorInfo editorInfo, @C0359n0 C19121a aVar) {
        super(inputConnection, false);
        this.f48644a = textView;
        this.f48645b = aVar;
        aVar.mo56407b(editorInfo);
    }
}
