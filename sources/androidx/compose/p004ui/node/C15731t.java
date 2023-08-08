package androidx.compose.p004ui.node;

import androidx.compose.p004ui.layout.C15560f0;
import androidx.compose.runtime.C8410b2;
import androidx.compose.runtime.C8539f2;
import androidx.compose.runtime.C8700z0;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

@C11363r0({"SMAP\nIntrinsicsPolicy.kt\nKotlin\n*S Kotlin\n*F\n+ 1 IntrinsicsPolicy.kt\nandroidx/compose/ui/node/IntrinsicsPolicy\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,89:1\n76#2:90\n102#2,2:91\n*S KotlinDebug\n*F\n+ 1 IntrinsicsPolicy.kt\nandroidx/compose/ui/node/IntrinsicsPolicy\n*L\n30#1:90\n30#1:91,2\n*E\n"})
/* renamed from: androidx.compose.ui.node.t */
public final class C15731t {
    @C12579k

    /* renamed from: c */
    public static final C15732a f39057c = new C15732a((DefaultConstructorMarker) null);
    @Deprecated
    @C12579k

    /* renamed from: d */
    public static final String f39058d = "Intrinsic size is queried but there is no measure policy in place.";
    @C12579k

    /* renamed from: a */
    public final LayoutNode f39059a;
    @C12579k

    /* renamed from: b */
    public final C8700z0 f39060b = C8539f2.m30981g((Object) null, (C8410b2) null, 2, (Object) null);

    /* renamed from: androidx.compose.ui.node.t$a */
    public static final class C15732a {
        public /* synthetic */ C15732a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public C15732a() {
        }
    }

    public C15731t(@C12579k LayoutNode layoutNode) {
        Intrinsics.checkNotNullParameter(layoutNode, "layoutNode");
        this.f39059a = layoutNode;
    }

    @C12579k
    /* renamed from: a */
    public final LayoutNode mo45196a() {
        return this.f39059a;
    }

    /* renamed from: b */
    public final C15560f0 mo45197b() {
        return (C15560f0) this.f39060b.getValue();
    }

    /* renamed from: c */
    public final int mo45198c(int i) {
        return mo45202g().mo6401e(this.f39059a.mo44610A0(), this.f39059a.mo44665Y(), i);
    }

    /* renamed from: d */
    public final int mo45199d(int i) {
        return mo45202g().mo6398b(this.f39059a.mo44610A0(), this.f39059a.mo44665Y(), i);
    }

    /* renamed from: e */
    public final int mo45200e(int i) {
        return mo45202g().mo6401e(this.f39059a.mo44610A0(), this.f39059a.mo44663X(), i);
    }

    /* renamed from: f */
    public final int mo45201f(int i) {
        return mo45202g().mo6398b(this.f39059a.mo44610A0(), this.f39059a.mo44663X(), i);
    }

    /* renamed from: g */
    public final C15560f0 mo45202g() {
        C15560f0 b = mo45197b();
        if (b != null) {
            return b;
        }
        throw new IllegalStateException(f39058d.toString());
    }

    /* renamed from: h */
    public final int mo45203h(int i) {
        return mo45202g().mo6399c(this.f39059a.mo44610A0(), this.f39059a.mo44665Y(), i);
    }

    /* renamed from: i */
    public final int mo45204i(int i) {
        return mo45202g().mo6400d(this.f39059a.mo44610A0(), this.f39059a.mo44665Y(), i);
    }

    /* renamed from: j */
    public final int mo45205j(int i) {
        return mo45202g().mo6399c(this.f39059a.mo44610A0(), this.f39059a.mo44663X(), i);
    }

    /* renamed from: k */
    public final int mo45206k(int i) {
        return mo45202g().mo6400d(this.f39059a.mo44610A0(), this.f39059a.mo44663X(), i);
    }

    /* renamed from: l */
    public final void mo45207l(C15560f0 f0Var) {
        this.f39060b.setValue(f0Var);
    }

    /* renamed from: m */
    public final void mo45208m(@C12579k C15560f0 f0Var) {
        Intrinsics.checkNotNullParameter(f0Var, "measurePolicy");
        mo45207l(f0Var);
    }
}
