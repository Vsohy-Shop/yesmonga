package androidx.appcompat.widget;

import android.view.textclassifier.TextClassificationManager;
import android.view.textclassifier.TextClassifier;
import android.widget.TextView;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.annotation.C0373u;
import androidx.annotation.C0376v0;
import androidx.core.util.C18001r;

/* renamed from: androidx.appcompat.widget.s */
public final class C0780s {
    @C0359n0

    /* renamed from: a */
    public TextView f2554a;
    @C0363p0

    /* renamed from: b */
    public TextClassifier f2555b;

    @C0376v0(26)
    /* renamed from: androidx.appcompat.widget.s$a */
    public static final class C0781a {
        @C0359n0
        @C0373u
        /* renamed from: a */
        public static TextClassifier m3802a(@C0359n0 TextView textView) {
            TextClassificationManager a = C0759p.m3711a(textView.getContext().getSystemService(TextClassificationManager.class));
            if (a != null) {
                return a.getTextClassifier();
            }
            return TextClassifier.NO_OP;
        }
    }

    public C0780s(@C0359n0 TextView textView) {
        this.f2554a = (TextView) C18001r.m81775l(textView);
    }

    @C0359n0
    @C0376v0(api = 26)
    /* renamed from: a */
    public TextClassifier mo3642a() {
        TextClassifier textClassifier = this.f2555b;
        if (textClassifier == null) {
            return C0781a.m3802a(this.f2554a);
        }
        return textClassifier;
    }

    @C0376v0(api = 26)
    /* renamed from: b */
    public void mo3643b(@C0363p0 TextClassifier textClassifier) {
        this.f2555b = textClassifier;
    }
}
