package androidx.appcompat.view.menu;

import android.graphics.drawable.Drawable;
import androidx.annotation.RestrictTo;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
/* renamed from: androidx.appcompat.view.menu.o */
public interface C0587o {

    /* renamed from: androidx.appcompat.view.menu.o$a */
    public interface C0588a {
        /* renamed from: d */
        void mo1832d(C0573j jVar, int i);

        /* renamed from: e */
        boolean mo1833e();

        /* renamed from: f */
        boolean mo1834f();

        C0573j getItemData();

        void setCheckable(boolean z);

        void setChecked(boolean z);

        void setEnabled(boolean z);

        void setIcon(Drawable drawable);

        void setShortcut(boolean z, char c);

        void setTitle(CharSequence charSequence);
    }

    /* renamed from: c */
    void mo1858c(C0568g gVar);

    int getWindowAnimations();
}
