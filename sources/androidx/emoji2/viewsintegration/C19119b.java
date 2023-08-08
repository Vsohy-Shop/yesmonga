package androidx.emoji2.viewsintegration;

import android.annotation.SuppressLint;
import android.text.Editable;
import androidx.annotation.C0323b0;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.emoji2.text.C19107q;

/* renamed from: androidx.emoji2.viewsintegration.b */
public final class C19119b extends Editable.Factory {

    /* renamed from: a */
    public static final Object f48641a = new Object();
    @C0323b0("INSTANCE_LOCK")

    /* renamed from: b */
    public static volatile Editable.Factory f48642b;
    @C0363p0

    /* renamed from: c */
    public static Class<?> f48643c;

    @SuppressLint({"PrivateApi"})
    public C19119b() {
        try {
            f48643c = Class.forName("android.text.DynamicLayout$ChangeWatcher", false, C19119b.class.getClassLoader());
        } catch (Throwable unused) {
        }
    }

    public static Editable.Factory getInstance() {
        if (f48642b == null) {
            synchronized (f48641a) {
                if (f48642b == null) {
                    f48642b = new C19119b();
                }
            }
        }
        return f48642b;
    }

    public Editable newEditable(@C0359n0 CharSequence charSequence) {
        Class<?> cls = f48643c;
        if (cls != null) {
            return C19107q.m89431c(cls, charSequence);
        }
        return super.newEditable(charSequence);
    }
}
