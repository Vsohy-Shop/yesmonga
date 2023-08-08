package androidx.compose.runtime.external.kotlinx.collections.immutable;

import androidx.compose.runtime.external.kotlinx.collections.immutable.internal.C8534e;
import java.util.List;
import kotlin.collections.C10904b;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.C11345a;
import org.jetbrains.annotations.C12579k;

/* renamed from: androidx.compose.runtime.external.kotlinx.collections.immutable.c */
public interface C8444c<E> extends List<E>, C8443b<E>, C11345a {

    /* renamed from: androidx.compose.runtime.external.kotlinx.collections.immutable.c$a */
    public static final class C8445a<E> extends C10904b<E> implements C8444c<E> {
        @C12579k

        /* renamed from: b */
        public final C8444c<E> f22807b;

        /* renamed from: c */
        public final int f22808c;

        /* renamed from: d */
        public final int f22809d;

        /* renamed from: e */
        public int f22810e;

        public C8445a(@C12579k C8444c<? extends E> cVar, int i, int i2) {
            Intrinsics.checkNotNullParameter(cVar, "source");
            this.f22807b = cVar;
            this.f22808c = i;
            this.f22809d = i2;
            C8534e.m30962c(i, i2, cVar.size());
            this.f22810e = i2 - i;
        }

        /* renamed from: e */
        public int mo15650e() {
            return this.f22810e;
        }

        public E get(int i) {
            C8534e.m30960a(i, this.f22810e);
            return this.f22807b.get(this.f22808c + i);
        }

        @C12579k
        public C8444c<E> subList(int i, int i2) {
            C8534e.m30962c(i, i2, this.f22810e);
            C8444c<E> cVar = this.f22807b;
            int i3 = this.f22808c;
            return new C8445a(cVar, i + i3, i3 + i2);
        }
    }

    @C12579k
    C8444c<E> subList(int i, int i2) {
        return new C8445a(this, i, i2);
    }
}
