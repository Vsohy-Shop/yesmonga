package androidx.compose.foundation.lazy.layout;

import androidx.compose.animation.core.C1968g;
import androidx.compose.foundation.gestures.ScrollExtensionsKt;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.p004ui.semantics.C16024b;
import kotlin.C11079d2;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.intrinsics.C11063b;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

/* renamed from: androidx.compose.foundation.lazy.layout.r */
public final class C2564r {

    /* renamed from: androidx.compose.foundation.lazy.layout.r$a */
    public static final class C2565a implements C2563q {

        /* renamed from: a */
        public final /* synthetic */ LazyListState f6759a;

        /* renamed from: b */
        public final /* synthetic */ boolean f6760b;

        public C2565a(LazyListState lazyListState, boolean z) {
            this.f6759a = lazyListState;
            this.f6760b = z;
        }

        /* renamed from: a */
        public boolean mo8633a() {
            return this.f6759a.mo7249a();
        }

        @C12580l
        /* renamed from: b */
        public Object mo8634b(int i, @C12579k C11045c<? super C11079d2> cVar) {
            Object H = LazyListState.m10849H(this.f6759a, i, 0, cVar, 2, (Object) null);
            return H == C11063b.m42612h() ? H : C11079d2.f28267a;
        }

        @C12580l
        /* renamed from: c */
        public Object mo8635c(float f, @C12579k C11045c<? super C11079d2> cVar) {
            Object b = ScrollExtensionsKt.m9368b(this.f6759a, f, (C1968g) null, cVar, 2, (Object) null);
            return b == C11063b.m42612h() ? b : C11079d2.f28267a;
        }

        @C12579k
        /* renamed from: d */
        public C16024b mo8636d() {
            if (this.f6760b) {
                return new C16024b(-1, 1);
            }
            return new C16024b(1, -1);
        }

        /* renamed from: e */
        public float mo8637e() {
            return ((float) this.f6759a.mo8339q()) + (((float) this.f6759a.mo8340r()) / 100000.0f);
        }
    }

    @C12579k
    /* renamed from: a */
    public static final C2563q m11502a(@C12579k LazyListState lazyListState, boolean z) {
        Intrinsics.checkNotNullParameter(lazyListState, "state");
        return new C2565a(lazyListState, z);
    }
}
