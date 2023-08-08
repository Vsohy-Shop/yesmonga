package androidx.emoji2.viewsintegration;

import android.text.InputFilter;
import android.text.Selection;
import android.text.Spannable;
import android.text.Spanned;
import android.widget.TextView;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.annotation.C0376v0;
import androidx.annotation.RestrictTo;
import androidx.emoji2.text.C19019f;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;

@C0376v0(19)
@RestrictTo({RestrictTo.Scope.LIBRARY})
/* renamed from: androidx.emoji2.viewsintegration.d */
public final class C19122d implements InputFilter {

    /* renamed from: a */
    public final TextView f48646a;

    /* renamed from: b */
    public C19019f.C19027g f48647b;

    @C0376v0(19)
    /* renamed from: androidx.emoji2.viewsintegration.d$a */
    public static class C19123a extends C19019f.C19027g {

        /* renamed from: a */
        public final Reference<TextView> f48648a;

        /* renamed from: b */
        public final Reference<C19122d> f48649b;

        public C19123a(TextView textView, C19122d dVar) {
            this.f48648a = new WeakReference(textView);
            this.f48649b = new WeakReference(dVar);
        }

        /* renamed from: b */
        public void mo3109b() {
            CharSequence text;
            CharSequence x;
            super.mo3109b();
            TextView textView = this.f48648a.get();
            if (mo56410c(textView, this.f48649b.get()) && textView.isAttachedToWindow() && (text = textView.getText()) != (x = C19019f.m88864c().mo55974x(text))) {
                int selectionStart = Selection.getSelectionStart(x);
                int selectionEnd = Selection.getSelectionEnd(x);
                textView.setText(x);
                if (x instanceof Spannable) {
                    C19122d.m89492b((Spannable) x, selectionStart, selectionEnd);
                }
            }
        }

        /* renamed from: c */
        public final boolean mo56410c(@C0363p0 TextView textView, @C0363p0 InputFilter inputFilter) {
            InputFilter[] filters;
            if (inputFilter == null || textView == null || (filters = textView.getFilters()) == null) {
                return false;
            }
            for (InputFilter inputFilter2 : filters) {
                if (inputFilter2 == inputFilter) {
                    return true;
                }
            }
            return false;
        }
    }

    public C19122d(@C0359n0 TextView textView) {
        this.f48646a = textView;
    }

    /* renamed from: b */
    public static void m89492b(Spannable spannable, int i, int i2) {
        if (i >= 0 && i2 >= 0) {
            Selection.setSelection(spannable, i, i2);
        } else if (i >= 0) {
            Selection.setSelection(spannable, i);
        } else if (i2 >= 0) {
            Selection.setSelection(spannable, i2);
        }
    }

    /* renamed from: a */
    public final C19019f.C19027g mo56408a() {
        if (this.f48647b == null) {
            this.f48647b = new C19123a(this.f48646a, this);
        }
        return this.f48647b;
    }

    public CharSequence filter(CharSequence charSequence, int i, int i2, Spanned spanned, int i3, int i4) {
        if (this.f48646a.isInEditMode()) {
            return charSequence;
        }
        int i5 = C19019f.m88864c().mo55965i();
        if (i5 != 0) {
            boolean z = true;
            if (i5 == 1) {
                if (i4 == 0 && i3 == 0 && spanned.length() == 0 && charSequence == this.f48646a.getText()) {
                    z = false;
                }
                if (!z || charSequence == null) {
                    return charSequence;
                }
                if (!(i == 0 && i2 == charSequence.length())) {
                    charSequence = charSequence.subSequence(i, i2);
                }
                return C19019f.m88864c().mo55975y(charSequence, 0, charSequence.length());
            } else if (i5 != 3) {
                return charSequence;
            }
        }
        C19019f.m88864c().mo55957B(mo56408a());
        return charSequence;
    }
}
