package androidx.core.content;

import android.content.SharedPreferences;
import androidx.annotation.C0359n0;

@Deprecated
/* renamed from: androidx.core.content.u0 */
public final class C17493u0 {

    @Deprecated
    /* renamed from: androidx.core.content.u0$a */
    public static final class C17494a {

        /* renamed from: b */
        public static C17494a f45795b;

        /* renamed from: a */
        public final C17495a f45796a = new C17495a();

        /* renamed from: androidx.core.content.u0$a$a */
        public static class C17495a {
            /* renamed from: a */
            public void mo51915a(@C0359n0 SharedPreferences.Editor editor) {
                try {
                    editor.apply();
                } catch (AbstractMethodError unused) {
                    editor.commit();
                }
            }
        }

        @Deprecated
        /* renamed from: b */
        public static C17494a m80264b() {
            if (f45795b == null) {
                f45795b = new C17494a();
            }
            return f45795b;
        }

        @Deprecated
        /* renamed from: a */
        public void mo51914a(@C0359n0 SharedPreferences.Editor editor) {
            this.f45796a.mo51915a(editor);
        }
    }
}
