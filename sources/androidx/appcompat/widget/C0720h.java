package androidx.appcompat.widget;

import android.content.res.TypedArray;
import android.text.method.KeyListener;
import android.text.method.NumberKeyListener;
import android.util.AttributeSet;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.EditText;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.appcompat.C0387a;
import androidx.emoji2.viewsintegration.C19116a;

/* renamed from: androidx.appcompat.widget.h */
public class C0720h {
    @C0359n0

    /* renamed from: a */
    public final EditText f2388a;
    @C0359n0

    /* renamed from: b */
    public final C19116a f2389b;

    public C0720h(@C0359n0 EditText editText) {
        this.f2388a = editText;
        this.f2389b = new C19116a(editText, false);
    }

    @C0363p0
    /* renamed from: a */
    public KeyListener mo3447a(@C0363p0 KeyListener keyListener) {
        if (mo3448b(keyListener)) {
            return this.f2389b.mo56389b(keyListener);
        }
        return keyListener;
    }

    /* renamed from: b */
    public boolean mo3448b(KeyListener keyListener) {
        return !(keyListener instanceof NumberKeyListener);
    }

    /* renamed from: c */
    public boolean mo3449c() {
        return this.f2389b.mo56391d();
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: d */
    public void mo3450d(@C0363p0 AttributeSet attributeSet, int i) {
        TypedArray obtainStyledAttributes = this.f2388a.getContext().obtainStyledAttributes(attributeSet, C0387a.C0400m.AppCompatTextView, i, 0);
        try {
            int i2 = C0387a.C0400m.AppCompatTextView_emojiCompatEnabled;
            boolean z = true;
            if (obtainStyledAttributes.hasValue(i2)) {
                z = obtainStyledAttributes.getBoolean(i2, true);
            }
            obtainStyledAttributes.recycle();
            mo3452f(z);
        } catch (Throwable th) {
            obtainStyledAttributes.recycle();
            throw th;
        }
    }

    @C0363p0
    /* renamed from: e */
    public InputConnection mo3451e(@C0363p0 InputConnection inputConnection, @C0359n0 EditorInfo editorInfo) {
        return this.f2389b.mo56392e(inputConnection, editorInfo);
    }

    /* renamed from: f */
    public void mo3452f(boolean z) {
        this.f2389b.mo56394g(z);
    }
}
