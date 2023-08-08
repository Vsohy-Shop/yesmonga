package androidx.media;

import android.content.Context;
import androidx.annotation.C0359n0;
import androidx.annotation.C0376v0;
import androidx.media.C19616i;

@C0376v0(21)
/* renamed from: androidx.media.j */
public class C19620j extends C19630s {
    public C19620j(Context context) {
        super(context);
        this.f50254a = context;
    }

    /* renamed from: a */
    public boolean mo57991a(@C0359n0 C19616i.C19619c cVar) {
        return mo58001d(cVar) || super.mo57991a(cVar);
    }

    /* renamed from: d */
    public final boolean mo58001d(@C0359n0 C19616i.C19619c cVar) {
        if (getContext().checkPermission(C19630s.f50252f, cVar.mo57999b(), cVar.mo57998a()) == 0) {
            return true;
        }
        return false;
    }
}
