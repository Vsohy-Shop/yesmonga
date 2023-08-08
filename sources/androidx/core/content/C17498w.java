package androidx.core.content;

import android.content.ComponentName;
import androidx.core.util.C18007x;

/* renamed from: androidx.core.content.w */
public final /* synthetic */ class C17498w implements C18007x {

    /* renamed from: a */
    public final /* synthetic */ String f45799a;

    public /* synthetic */ C17498w(String str) {
        this.f45799a = str;
    }

    public final boolean test(Object obj) {
        return this.f45799a.equals(((ComponentName) obj).getPackageName());
    }
}
