package androidx.compose.p004ui.platform;

import android.view.View;
import androidx.annotation.C0344h1;
import androidx.compose.p004ui.node.C15698j1;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11300l;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C0344h1
/* renamed from: androidx.compose.ui.platform.j4 */
public interface C15909j4 extends C15698j1 {
    @C12579k

    /* renamed from: p */
    public static final C15910a f39605p = C15910a.f39606a;

    /* renamed from: androidx.compose.ui.platform.j4$a */
    public static final class C15910a {

        /* renamed from: a */
        public static final /* synthetic */ C15910a f39606a = new C15910a();
        @C12580l

        /* renamed from: b */
        public static C11300l<? super C15909j4, C11079d2> f39607b;

        @C0344h1
        /* renamed from: b */
        public static /* synthetic */ void m71454b() {
        }

        @C12580l
        /* renamed from: a */
        public final C11300l<C15909j4, C11079d2> mo45814a() {
            return f39607b;
        }

        /* renamed from: c */
        public final void mo45815c(@C12580l C11300l<? super C15909j4, C11079d2> lVar) {
            f39607b = lVar;
        }
    }

    /* renamed from: D */
    void mo45301D();

    boolean getHasPendingMeasureOrLayout();

    @C12579k
    View getView();

    /* renamed from: r */
    boolean mo45350r();
}
