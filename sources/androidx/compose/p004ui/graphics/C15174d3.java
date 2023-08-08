package androidx.compose.p004ui.graphics;

import androidx.compose.p004ui.geometry.C15098i;
import androidx.compose.p004ui.geometry.C15101k;
import androidx.compose.p004ui.geometry.C15103l;
import androidx.compose.runtime.C8585m0;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

/* renamed from: androidx.compose.ui.graphics.d3 */
public abstract class C15174d3 {

    /* renamed from: androidx.compose.ui.graphics.d3$a */
    public static final class C15175a extends C15174d3 {
        @C12579k

        /* renamed from: a */
        public final C15231i3 f37484a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C15175a(@C12579k C15231i3 i3Var) {
            super((DefaultConstructorMarker) null);
            Intrinsics.checkNotNullParameter(i3Var, "path");
            this.f37484a = i3Var;
        }

        @C12579k
        /* renamed from: a */
        public C15098i mo42645a() {
            return this.f37484a.getBounds();
        }

        @C12579k
        /* renamed from: b */
        public final C15231i3 mo42646b() {
            return this.f37484a;
        }

        public boolean equals(@C12580l Object obj) {
            if (this == obj) {
                return true;
            }
            if ((obj instanceof C15175a) && Intrinsics.areEqual((Object) this.f37484a, (Object) ((C15175a) obj).f37484a)) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return this.f37484a.hashCode();
        }
    }

    @C8585m0
    /* renamed from: androidx.compose.ui.graphics.d3$b */
    public static final class C15176b extends C15174d3 {
        @C12579k

        /* renamed from: a */
        public final C15098i f37485a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C15176b(@C12579k C15098i iVar) {
            super((DefaultConstructorMarker) null);
            Intrinsics.checkNotNullParameter(iVar, "rect");
            this.f37485a = iVar;
        }

        @C12579k
        /* renamed from: a */
        public C15098i mo42645a() {
            return this.f37485a;
        }

        @C12579k
        /* renamed from: b */
        public final C15098i mo42649b() {
            return this.f37485a;
        }

        public boolean equals(@C12580l Object obj) {
            if (this == obj) {
                return true;
            }
            if ((obj instanceof C15176b) && Intrinsics.areEqual((Object) this.f37485a, (Object) ((C15176b) obj).f37485a)) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return this.f37485a.hashCode();
        }
    }

    @C8585m0
    @C11363r0({"SMAP\nOutline.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Outline.kt\nandroidx/compose/ui/graphics/Outline$Rounded\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,307:1\n1#2:308\n*E\n"})
    /* renamed from: androidx.compose.ui.graphics.d3$c */
    public static final class C15177c extends C15174d3 {
        @C12579k

        /* renamed from: a */
        public final C15101k f37486a;
        @C12580l

        /* renamed from: b */
        public final C15231i3 f37487b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C15177c(@C12579k C15101k kVar) {
            super((DefaultConstructorMarker) null);
            Intrinsics.checkNotNullParameter(kVar, "roundRect");
            C15231i3 i3Var = null;
            this.f37486a = kVar;
            if (!C15204e3.m65909i(kVar)) {
                i3Var = C15318t0.m66550a();
                i3Var.mo42817r(kVar);
            }
            this.f37487b = i3Var;
        }

        @C12579k
        /* renamed from: a */
        public C15098i mo42645a() {
            return C15103l.m64991g(this.f37486a);
        }

        @C12579k
        /* renamed from: b */
        public final C15101k mo42652b() {
            return this.f37486a;
        }

        @C12580l
        /* renamed from: c */
        public final C15231i3 mo42653c() {
            return this.f37487b;
        }

        public boolean equals(@C12580l Object obj) {
            if (this == obj) {
                return true;
            }
            if ((obj instanceof C15177c) && Intrinsics.areEqual((Object) this.f37486a, (Object) ((C15177c) obj).f37486a)) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return this.f37486a.hashCode();
        }
    }

    public /* synthetic */ C15174d3(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    @C12579k
    /* renamed from: a */
    public abstract C15098i mo42645a();

    public C15174d3() {
    }
}
