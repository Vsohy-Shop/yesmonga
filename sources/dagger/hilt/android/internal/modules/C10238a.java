package dagger.hilt.android.internal.modules;

import android.app.Activity;
import android.content.Context;
import androidx.fragment.app.C19232h;
import dagger.C10147a;
import dagger.C10159h;
import dagger.C10315i;
import dagger.C10344j;
import dagger.hilt.C10267e;
import dagger.hilt.android.components.C10166a;
import dagger.hilt.android.qualifiers.C10254a;

@C10159h
@C10267e({C10166a.class})
/* renamed from: dagger.hilt.android.internal.modules.a */
public abstract class C10238a {
    @C10315i
    @C10344j
    /* renamed from: b */
    public static C19232h m38480b(Activity activity) {
        try {
            return (C19232h) activity;
        } catch (ClassCastException e) {
            throw new IllegalStateException("Expected activity to be a FragmentActivity: " + activity, e);
        }
    }

    @C10147a
    @C10254a
    /* renamed from: a */
    public abstract Context mo21682a(Activity activity);
}
