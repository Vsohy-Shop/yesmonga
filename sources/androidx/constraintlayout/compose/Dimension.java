package androidx.constraintlayout.compose;

import androidx.constraintlayout.widget.C16934c;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

public interface Dimension {
    @C12579k

    /* renamed from: a */
    public static final Companion f41160a = Companion.f41161a;

    public static final class Companion {

        /* renamed from: a */
        public static final /* synthetic */ Companion f41161a = new Companion();

        @C12579k
        /* renamed from: a */
        public final C16576a mo48363a() {
            return new C16627s(Dimension$Companion$fillToConstraints$1.f41162f);
        }

        @C12579k
        /* renamed from: b */
        public final Dimension mo48364b() {
            return new C16627s(Dimension$Companion$matchParent$1.f41163f);
        }

        @C12579k
        /* renamed from: c */
        public final C16576a mo48365c() {
            return new C16627s(Dimension$Companion$preferredWrapContent$1.f41164f);
        }

        @C12579k
        /* renamed from: d */
        public final Dimension mo48366d() {
            return new C16627s(Dimension$Companion$wrapContent$1.f41165f);
        }

        @C12579k
        /* renamed from: e */
        public final Dimension mo48367e(float f) {
            return new C16627s(new Dimension$Companion$percent$1(f));
        }

        @C12579k
        /* renamed from: f */
        public final C16578c mo48368f(float f) {
            return new C16627s(new Dimension$Companion$preferredValue$1(f));
        }

        @C12579k
        /* renamed from: g */
        public final Dimension mo48369g(@C12579k String str) {
            Intrinsics.checkNotNullParameter(str, C16934c.f44490U1);
            return new C16627s(new Dimension$Companion$ratio$1(str));
        }

        @C12579k
        /* renamed from: h */
        public final Dimension mo48370h(float f) {
            return new C16627s(new Dimension$Companion$value$1(f));
        }
    }

    /* renamed from: androidx.constraintlayout.compose.Dimension$a */
    public interface C16576a extends Dimension {
    }

    /* renamed from: androidx.constraintlayout.compose.Dimension$b */
    public interface C16577b extends Dimension {
    }

    /* renamed from: androidx.constraintlayout.compose.Dimension$c */
    public interface C16578c extends Dimension {
    }
}
