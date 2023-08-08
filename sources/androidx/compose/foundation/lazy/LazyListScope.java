package androidx.compose.foundation.lazy;

import androidx.compose.foundation.C2855v;
import androidx.compose.runtime.C8592o;
import kotlin.C11079d2;
import kotlin.C11395k;
import kotlin.DeprecationLevel;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.functions.C11305q;
import kotlin.jvm.functions.C11306r;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C2622w
public interface LazyListScope {

    /* renamed from: androidx.compose.foundation.lazy.LazyListScope$a */
    public static final class C2448a {
        @Deprecated
        /* renamed from: a */
        public static void m10833a(@C12579k LazyListScope lazyListScope, @C12580l Object obj, @C12580l Object obj2, @C12579k C11305q<? super C2455e, ? super C8592o, ? super Integer, C11079d2> qVar) {
            Intrinsics.checkNotNullParameter(qVar, "content");
            LazyListScope.super.mo8306c(obj, obj2, qVar);
        }

        @C11395k(level = DeprecationLevel.f28051c, message = "Use the non deprecated overload")
        @Deprecated
        /* renamed from: b */
        public static /* synthetic */ void m10834b(LazyListScope lazyListScope, Object obj, C11305q qVar) {
            Intrinsics.checkNotNullParameter(qVar, "content");
            LazyListScope.super.mo8309j(obj, qVar);
        }

        @Deprecated
        /* renamed from: e */
        public static void m10837e(@C12579k LazyListScope lazyListScope, int i, @C12580l C11300l<? super Integer, ? extends Object> lVar, @C12579k C11300l<? super Integer, ? extends Object> lVar2, @C12579k C11306r<? super C2455e, ? super Integer, ? super C8592o, ? super Integer, C11079d2> rVar) {
            Intrinsics.checkNotNullParameter(lVar2, "contentType");
            Intrinsics.checkNotNullParameter(rVar, "itemContent");
            LazyListScope.super.mo8310k(i, lVar, lVar2, rVar);
        }

        @C11395k(level = DeprecationLevel.f28051c, message = "Use the non deprecated overload")
        @Deprecated
        /* renamed from: f */
        public static /* synthetic */ void m10838f(LazyListScope lazyListScope, int i, C11300l lVar, C11306r rVar) {
            Intrinsics.checkNotNullParameter(rVar, "itemContent");
            LazyListScope.super.mo8308i(i, lVar, rVar);
        }
    }

    /* renamed from: d */
    static /* synthetic */ void m10821d(LazyListScope lazyListScope, Object obj, Object obj2, C11305q qVar, int i, Object obj3) {
        if (obj3 == null) {
            if ((i & 1) != 0) {
                obj = null;
            }
            if ((i & 2) != 0) {
                obj2 = null;
            }
            lazyListScope.mo8307h(obj, obj2, qVar);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: stickyHeader");
    }

    /* renamed from: e */
    static /* synthetic */ void m10822e(LazyListScope lazyListScope, int i, C11300l lVar, C11300l lVar2, C11306r rVar, int i2, Object obj) {
        if (obj == null) {
            if ((i2 & 2) != 0) {
                lVar = null;
            }
            if ((i2 & 4) != 0) {
                lVar2 = LazyListScope$items$1.f6421f;
            }
            lazyListScope.mo8310k(i, lVar, lVar2, rVar);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: items");
    }

    /* renamed from: f */
    static /* synthetic */ void m10823f(LazyListScope lazyListScope, int i, C11300l lVar, C11306r rVar, int i2, Object obj) {
        if (obj == null) {
            if ((i2 & 2) != 0) {
                lVar = null;
            }
            lazyListScope.mo8308i(i, lVar, rVar);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: items");
    }

    /* renamed from: g */
    static /* synthetic */ void m10824g(LazyListScope lazyListScope, Object obj, Object obj2, C11305q qVar, int i, Object obj3) {
        if (obj3 == null) {
            if ((i & 1) != 0) {
                obj = null;
            }
            if ((i & 2) != 0) {
                obj2 = null;
            }
            lazyListScope.mo8306c(obj, obj2, qVar);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: item");
    }

    /* renamed from: n */
    static /* synthetic */ void m10827n(LazyListScope lazyListScope, Object obj, C11305q qVar, int i, Object obj2) {
        if (obj2 == null) {
            if ((i & 1) != 0) {
                obj = null;
            }
            lazyListScope.mo8309j(obj, qVar);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: item");
    }

    /* renamed from: c */
    void mo8306c(@C12580l Object obj, @C12580l Object obj2, @C12579k C11305q<? super C2455e, ? super C8592o, ? super Integer, C11079d2> qVar) {
        Intrinsics.checkNotNullParameter(qVar, "content");
        throw new IllegalStateException("The method is not implemented".toString());
    }

    @C2855v
    /* renamed from: h */
    void mo8307h(@C12580l Object obj, @C12580l Object obj2, @C12579k C11305q<? super C2455e, ? super C8592o, ? super Integer, C11079d2> qVar);

    @C11395k(level = DeprecationLevel.f28051c, message = "Use the non deprecated overload")
    /* renamed from: i */
    /* synthetic */ void mo8308i(int i, C11300l lVar, C11306r rVar) {
        Intrinsics.checkNotNullParameter(rVar, "itemContent");
        mo8310k(i, lVar, LazyListScope$items$2.f6422f, rVar);
    }

    @C11395k(level = DeprecationLevel.f28051c, message = "Use the non deprecated overload")
    /* renamed from: j */
    /* synthetic */ void mo8309j(Object obj, C11305q qVar) {
        Intrinsics.checkNotNullParameter(qVar, "content");
        mo8306c(obj, (Object) null, qVar);
    }

    /* renamed from: k */
    void mo8310k(int i, @C12580l C11300l<? super Integer, ? extends Object> lVar, @C12579k C11300l<? super Integer, ? extends Object> lVar2, @C12579k C11306r<? super C2455e, ? super Integer, ? super C8592o, ? super Integer, C11079d2> rVar) {
        Intrinsics.checkNotNullParameter(lVar2, "contentType");
        Intrinsics.checkNotNullParameter(rVar, "itemContent");
        throw new IllegalStateException("The method is not implemented".toString());
    }
}
