package dagger.hilt.android.internal.lifecycle;

import androidx.annotation.C0359n0;
import dagger.hilt.android.C10162a;
import dagger.hilt.android.C10182h;
import dagger.hilt.android.internal.C10185b;
import dagger.hilt.android.lifecycle.C10246b;
import java.util.HashSet;
import java.util.Set;

/* renamed from: dagger.hilt.android.internal.lifecycle.i */
public final class C10212i implements C10162a, C10182h {

    /* renamed from: a */
    public final Set<C10246b.C10247a> f27922a = new HashSet();

    /* renamed from: b */
    public boolean f27923b = false;

    /* renamed from: a */
    public void mo21651a(@C0359n0 C10246b.C10247a aVar) {
        C10185b.m38403a();
        mo21654d();
        this.f27922a.remove(aVar);
    }

    /* renamed from: b */
    public void mo21652b(@C0359n0 C10246b.C10247a aVar) {
        C10185b.m38403a();
        mo21654d();
        this.f27922a.add(aVar);
    }

    /* renamed from: c */
    public void mo21653c() {
        C10185b.m38403a();
        this.f27923b = true;
        for (C10246b.C10247a a : this.f27922a) {
            a.mo21688a();
        }
    }

    /* renamed from: d */
    public final void mo21654d() {
        if (this.f27923b) {
            throw new IllegalStateException("There was a race between the call to add/remove an OnClearedListener and onCleared(). This can happen when posting to the Main thread from a background thread, which is not supported.");
        }
    }
}
