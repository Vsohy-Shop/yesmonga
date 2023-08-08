package androidx.emoji2.viewsintegration;

import android.text.Editable;
import android.text.method.KeyListener;
import android.view.KeyEvent;
import android.view.View;
import androidx.annotation.C0359n0;
import androidx.annotation.C0376v0;
import androidx.annotation.RestrictTo;
import androidx.emoji2.text.C19019f;

@C0376v0(19)
@RestrictTo({RestrictTo.Scope.LIBRARY})
/* renamed from: androidx.emoji2.viewsintegration.e */
public final class C19124e implements KeyListener {

    /* renamed from: a */
    public final KeyListener f48650a;

    /* renamed from: b */
    public final C19125a f48651b;

    /* renamed from: androidx.emoji2.viewsintegration.e$a */
    public static class C19125a {
        /* renamed from: a */
        public boolean mo56416a(@C0359n0 Editable editable, int i, @C0359n0 KeyEvent keyEvent) {
            return C19019f.m88866k(editable, i, keyEvent);
        }
    }

    public C19124e(KeyListener keyListener) {
        this(keyListener, new C19125a());
    }

    public void clearMetaKeyState(View view, Editable editable, int i) {
        this.f48650a.clearMetaKeyState(view, editable, i);
    }

    public int getInputType() {
        return this.f48650a.getInputType();
    }

    public boolean onKeyDown(View view, Editable editable, int i, KeyEvent keyEvent) {
        if (this.f48651b.mo56416a(editable, i, keyEvent) || this.f48650a.onKeyDown(view, editable, i, keyEvent)) {
            return true;
        }
        return false;
    }

    public boolean onKeyOther(View view, Editable editable, KeyEvent keyEvent) {
        return this.f48650a.onKeyOther(view, editable, keyEvent);
    }

    public boolean onKeyUp(View view, Editable editable, int i, KeyEvent keyEvent) {
        return this.f48650a.onKeyUp(view, editable, i, keyEvent);
    }

    public C19124e(KeyListener keyListener, C19125a aVar) {
        this.f48650a = keyListener;
        this.f48651b = aVar;
    }
}
