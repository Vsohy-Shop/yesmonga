package dagger.hilt.android.internal.managers;

import dagger.hilt.internal.C10274c;

/* renamed from: dagger.hilt.android.internal.managers.d */
public final class C10226d implements C10274c<Object> {

    /* renamed from: a */
    public volatile Object f27944a;

    /* renamed from: b */
    public final Object f27945b = new Object();

    /* renamed from: c */
    public final C10228f f27946c;

    public C10226d(C10228f fVar) {
        this.f27946c = fVar;
    }

    public Object generatedComponent() {
        if (this.f27944a == null) {
            synchronized (this.f27945b) {
                if (this.f27944a == null) {
                    this.f27944a = this.f27946c.get();
                }
            }
        }
        return this.f27944a;
    }
}
