package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList;

/* renamed from: androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList.g */
public final class C8462g<E> extends C8456a<E> {

    /* renamed from: c */
    public final E f22833c;

    public C8462g(E e, int i) {
        super(i, 1);
        this.f22833c = e;
    }

    public E next() {
        mo15729b();
        mo15733f(mo15731d() + 1);
        return this.f22833c;
    }

    public E previous() {
        mo15730c();
        mo15733f(mo15731d() - 1);
        return this.f22833c;
    }
}
