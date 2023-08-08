package kotlinx.serialization.descriptors;

import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.C11345a;
import kotlinx.serialization.C12200d;
import org.jetbrains.annotations.C12579k;

/* renamed from: kotlinx.serialization.descriptors.g */
public final class C12219g {

    /* renamed from: kotlinx.serialization.descriptors.g$a */
    public static final class C12220a implements Iterator<C12217f>, C11345a {

        /* renamed from: a */
        public int f30003a;

        /* renamed from: b */
        public final /* synthetic */ C12217f f30004b;

        public C12220a(C12217f fVar) {
            this.f30004b = fVar;
            this.f30003a = fVar.mo24823d();
        }

        @C12579k
        /* renamed from: b */
        public C12217f next() {
            C12217f fVar = this.f30004b;
            int d = fVar.mo24823d();
            int i = this.f30003a;
            this.f30003a = i - 1;
            return fVar.mo24827g(d - i);
        }

        public boolean hasNext() {
            return this.f30003a > 0;
        }

        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    /* renamed from: kotlinx.serialization.descriptors.g$b */
    public static final class C12221b implements Iterator<String>, C11345a {

        /* renamed from: a */
        public int f30005a;

        /* renamed from: b */
        public final /* synthetic */ C12217f f30006b;

        public C12221b(C12217f fVar) {
            this.f30006b = fVar;
            this.f30005a = fVar.mo24823d();
        }

        @C12579k
        /* renamed from: b */
        public String next() {
            C12217f fVar = this.f30006b;
            int d = fVar.mo24823d();
            int i = this.f30005a;
            this.f30005a = i - 1;
            return fVar.mo24824e(d - i);
        }

        public boolean hasNext() {
            return this.f30005a > 0;
        }

        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    /* renamed from: kotlinx.serialization.descriptors.g$c */
    public static final class C12222c implements Iterable<C12217f>, C11345a {

        /* renamed from: a */
        public final /* synthetic */ C12217f f30007a;

        public C12222c(C12217f fVar) {
            this.f30007a = fVar;
        }

        @C12579k
        public Iterator<C12217f> iterator() {
            return new C12220a(this.f30007a);
        }
    }

    /* renamed from: kotlinx.serialization.descriptors.g$d */
    public static final class C12223d implements Iterable<String>, C11345a {

        /* renamed from: a */
        public final /* synthetic */ C12217f f30008a;

        public C12223d(C12217f fVar) {
            this.f30008a = fVar;
        }

        @C12579k
        public Iterator<String> iterator() {
            return new C12221b(this.f30008a);
        }
    }

    @C12579k
    /* renamed from: a */
    public static final Iterable<C12217f> m48904a(@C12579k C12217f fVar) {
        Intrinsics.checkNotNullParameter(fVar, "<this>");
        return new C12222c(fVar);
    }

    @C12200d
    /* renamed from: b */
    public static /* synthetic */ void m48905b(C12217f fVar) {
    }

    @C12579k
    /* renamed from: c */
    public static final Iterable<String> m48906c(@C12579k C12217f fVar) {
        Intrinsics.checkNotNullParameter(fVar, "<this>");
        return new C12223d(fVar);
    }

    @C12200d
    /* renamed from: d */
    public static /* synthetic */ void m48907d(C12217f fVar) {
    }
}
