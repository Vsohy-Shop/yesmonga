package androidx.emoji2.viewsintegration;

import android.text.Editable;
import android.text.Selection;
import android.text.Spannable;
import android.text.TextWatcher;
import android.widget.EditText;
import androidx.annotation.C0363p0;
import androidx.annotation.C0376v0;
import androidx.annotation.RestrictTo;
import androidx.emoji2.text.C19019f;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;

@C0376v0(19)
@RestrictTo({RestrictTo.Scope.LIBRARY})
/* renamed from: androidx.emoji2.viewsintegration.g */
public final class C19130g implements TextWatcher {

    /* renamed from: a */
    public final EditText f48657a;

    /* renamed from: b */
    public final boolean f48658b;

    /* renamed from: c */
    public C19019f.C19027g f48659c;

    /* renamed from: d */
    public int f48660d = Integer.MAX_VALUE;

    /* renamed from: e */
    public int f48661e = 0;

    /* renamed from: f */
    public boolean f48662f;

    @C0376v0(19)
    /* renamed from: androidx.emoji2.viewsintegration.g$a */
    public static class C19131a extends C19019f.C19027g {

        /* renamed from: a */
        public final Reference<EditText> f48663a;

        public C19131a(EditText editText) {
            this.f48663a = new WeakReference(editText);
        }

        /* renamed from: b */
        public void mo3109b() {
            super.mo3109b();
            C19130g.m89529e(this.f48663a.get(), 1);
        }
    }

    public C19130g(EditText editText, boolean z) {
        this.f48657a = editText;
        this.f48658b = z;
        this.f48662f = true;
    }

    /* renamed from: e */
    public static void m89529e(@C0363p0 EditText editText, int i) {
        if (i == 1 && editText != null && editText.isAttachedToWindow()) {
            Editable editableText = editText.getEditableText();
            int selectionStart = Selection.getSelectionStart(editableText);
            int selectionEnd = Selection.getSelectionEnd(editableText);
            C19019f.m88864c().mo55974x(editableText);
            C19122d.m89492b(editableText, selectionStart, selectionEnd);
        }
    }

    /* renamed from: a */
    public int mo56437a() {
        return this.f48661e;
    }

    public void afterTextChanged(Editable editable) {
    }

    /* renamed from: b */
    public final C19019f.C19027g mo56439b() {
        if (this.f48659c == null) {
            this.f48659c = new C19131a(this.f48657a);
        }
        return this.f48659c;
    }

    public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    /* renamed from: c */
    public int mo56441c() {
        return this.f48660d;
    }

    /* renamed from: d */
    public boolean mo56442d() {
        return this.f48662f;
    }

    /* renamed from: f */
    public void mo56443f(int i) {
        this.f48661e = i;
    }

    /* renamed from: g */
    public void mo56444g(boolean z) {
        if (this.f48662f != z) {
            if (this.f48659c != null) {
                C19019f.m88864c().mo55958F(this.f48659c);
            }
            this.f48662f = z;
            if (z) {
                m89529e(this.f48657a, C19019f.m88864c().mo55965i());
            }
        }
    }

    /* renamed from: h */
    public void mo56445h(int i) {
        this.f48660d = i;
    }

    /* renamed from: i */
    public final boolean mo56446i() {
        return !this.f48662f || (!this.f48658b && !C19019f.m88870q());
    }

    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        if (!this.f48657a.isInEditMode() && !mo56446i() && i2 <= i3 && (charSequence instanceof Spannable)) {
            int i4 = C19019f.m88864c().mo55965i();
            if (i4 != 0) {
                if (i4 == 1) {
                    C19019f.m88864c().mo55956A((Spannable) charSequence, i, i + i3, this.f48660d, this.f48661e);
                    return;
                } else if (i4 != 3) {
                    return;
                }
            }
            C19019f.m88864c().mo55957B(mo56439b());
        }
    }
}
