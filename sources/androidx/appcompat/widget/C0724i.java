package androidx.appcompat.widget;

import android.content.res.TypedArray;
import android.text.InputFilter;
import android.text.method.TransformationMethod;
import android.util.AttributeSet;
import android.widget.TextView;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.appcompat.C0387a;
import androidx.emoji2.viewsintegration.C19126f;

/* renamed from: androidx.appcompat.widget.i */
public class C0724i {
    @C0359n0

    /* renamed from: a */
    public final TextView f2393a;
    @C0359n0

    /* renamed from: b */
    public final C19126f f2394b;

    public C0724i(@C0359n0 TextView textView) {
        this.f2393a = textView;
        this.f2394b = new C19126f(textView, false);
    }

    @C0359n0
    /* renamed from: a */
    public InputFilter[] mo3485a(@C0359n0 InputFilter[] inputFilterArr) {
        return this.f2394b.mo56417a(inputFilterArr);
    }

    /* renamed from: b */
    public boolean mo3486b() {
        return this.f2394b.mo56418b();
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: c */
    public void mo3487c(@C0363p0 AttributeSet attributeSet, int i) {
        TypedArray obtainStyledAttributes = this.f2393a.getContext().obtainStyledAttributes(attributeSet, C0387a.C0400m.AppCompatTextView, i, 0);
        try {
            int i2 = C0387a.C0400m.AppCompatTextView_emojiCompatEnabled;
            boolean z = true;
            if (obtainStyledAttributes.hasValue(i2)) {
                z = obtainStyledAttributes.getBoolean(i2, true);
            }
            obtainStyledAttributes.recycle();
            mo3489e(z);
        } catch (Throwable th) {
            obtainStyledAttributes.recycle();
            throw th;
        }
    }

    /* renamed from: d */
    public void mo3488d(boolean z) {
        this.f2394b.mo56419c(z);
    }

    /* renamed from: e */
    public void mo3489e(boolean z) {
        this.f2394b.mo56420d(z);
    }

    @C0363p0
    /* renamed from: f */
    public TransformationMethod mo3490f(@C0363p0 TransformationMethod transformationMethod) {
        return this.f2394b.mo56422f(transformationMethod);
    }
}
