package androidx.emoji2.viewsintegration;

import android.text.method.KeyListener;
import android.text.method.NumberKeyListener;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.EditText;
import androidx.annotation.C0337f0;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.annotation.C0376v0;
import androidx.annotation.RestrictTo;
import androidx.core.util.C18001r;

/* renamed from: androidx.emoji2.viewsintegration.a */
public final class C19116a {

    /* renamed from: a */
    public final C19118b f48636a;

    /* renamed from: b */
    public int f48637b;

    /* renamed from: c */
    public int f48638c;

    @C0376v0(19)
    /* renamed from: androidx.emoji2.viewsintegration.a$a */
    public static class C19117a extends C19118b {

        /* renamed from: a */
        public final EditText f48639a;

        /* renamed from: b */
        public final C19130g f48640b;

        public C19117a(@C0359n0 EditText editText, boolean z) {
            this.f48639a = editText;
            C19130g gVar = new C19130g(editText, z);
            this.f48640b = gVar;
            editText.addTextChangedListener(gVar);
            editText.setEditableFactory(C19119b.getInstance());
        }

        /* renamed from: a */
        public KeyListener mo56396a(@C0363p0 KeyListener keyListener) {
            if (keyListener instanceof C19124e) {
                return keyListener;
            }
            if (keyListener == null) {
                return null;
            }
            if (keyListener instanceof NumberKeyListener) {
                return keyListener;
            }
            return new C19124e(keyListener);
        }

        /* renamed from: b */
        public boolean mo56397b() {
            return this.f48640b.mo56442d();
        }

        /* renamed from: c */
        public InputConnection mo56398c(@C0359n0 InputConnection inputConnection, @C0359n0 EditorInfo editorInfo) {
            if (inputConnection instanceof C19120c) {
                return inputConnection;
            }
            return new C19120c(this.f48639a, inputConnection, editorInfo);
        }

        /* renamed from: d */
        public void mo56399d(int i) {
            this.f48640b.mo56443f(i);
        }

        /* renamed from: e */
        public void mo56400e(boolean z) {
            this.f48640b.mo56444g(z);
        }

        /* renamed from: f */
        public void mo56401f(int i) {
            this.f48640b.mo56445h(i);
        }
    }

    /* renamed from: androidx.emoji2.viewsintegration.a$b */
    public static class C19118b {
        @C0363p0
        /* renamed from: a */
        public KeyListener mo56396a(@C0363p0 KeyListener keyListener) {
            return keyListener;
        }

        /* renamed from: b */
        public boolean mo56397b() {
            return false;
        }

        /* renamed from: c */
        public InputConnection mo56398c(@C0359n0 InputConnection inputConnection, @C0359n0 EditorInfo editorInfo) {
            return inputConnection;
        }

        /* renamed from: d */
        public void mo56399d(int i) {
        }

        /* renamed from: e */
        public void mo56400e(boolean z) {
        }

        /* renamed from: f */
        public void mo56401f(int i) {
        }
    }

    public C19116a(@C0359n0 EditText editText) {
        this(editText, true);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* renamed from: a */
    public int mo56388a() {
        return this.f48638c;
    }

    @C0363p0
    /* renamed from: b */
    public KeyListener mo56389b(@C0363p0 KeyListener keyListener) {
        return this.f48636a.mo56396a(keyListener);
    }

    /* renamed from: c */
    public int mo56390c() {
        return this.f48637b;
    }

    /* renamed from: d */
    public boolean mo56391d() {
        return this.f48636a.mo56397b();
    }

    @C0363p0
    /* renamed from: e */
    public InputConnection mo56392e(@C0363p0 InputConnection inputConnection, @C0359n0 EditorInfo editorInfo) {
        if (inputConnection == null) {
            return null;
        }
        return this.f48636a.mo56398c(inputConnection, editorInfo);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* renamed from: f */
    public void mo56393f(int i) {
        this.f48638c = i;
        this.f48636a.mo56399d(i);
    }

    /* renamed from: g */
    public void mo56394g(boolean z) {
        this.f48636a.mo56400e(z);
    }

    /* renamed from: h */
    public void mo56395h(@C0337f0(from = 0) int i) {
        C18001r.m81773j(i, "maxEmojiCount should be greater than 0");
        this.f48637b = i;
        this.f48636a.mo56401f(i);
    }

    public C19116a(@C0359n0 EditText editText, boolean z) {
        this.f48637b = Integer.MAX_VALUE;
        this.f48638c = 0;
        C18001r.m81776m(editText, "editText cannot be null");
        this.f48636a = new C19117a(editText, z);
    }
}
