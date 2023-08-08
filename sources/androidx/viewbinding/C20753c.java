package androidx.viewbinding;

import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.C0329d0;
import androidx.annotation.C0363p0;

/* renamed from: androidx.viewbinding.c */
public class C20753c {
    @C0363p0
    /* renamed from: a */
    public static <T extends View> T m96463a(View view, @C0329d0 int i) {
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            T findViewById = viewGroup.getChildAt(i2).findViewById(i);
            if (findViewById != null) {
                return findViewById;
            }
        }
        return null;
    }
}
