package androidx.compose.p004ui.viewinterop;

import android.content.Context;
import androidx.compose.runtime.C8430d0;
import androidx.compose.runtime.C8434e0;
import androidx.fragment.app.C19232h;
import androidx.fragment.app.C19234h0;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentContainerView;
import androidx.fragment.app.FragmentManager;
import kotlin.C11076d0;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
@C11363r0({"SMAP\nAndroidViewBinding.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidViewBinding.kt\nandroidx/compose/ui/viewinterop/AndroidViewBindingKt$AndroidViewBinding$3$1\n+ 2 Effects.kt\nandroidx/compose/runtime/DisposableEffectScope\n*L\n1#1,137:1\n62#2,5:138\n*S KotlinDebug\n*F\n+ 1 AndroidViewBinding.kt\nandroidx/compose/ui/viewinterop/AndroidViewBindingKt$AndroidViewBinding$3$1\n*L\n110#1:138,5\n*E\n"})
/* renamed from: androidx.compose.ui.viewinterop.AndroidViewBindingKt$AndroidViewBinding$3$1 */
public final class AndroidViewBindingKt$AndroidViewBinding$3$1 extends Lambda implements C11300l<C8434e0, C8430d0> {
    final /* synthetic */ FragmentContainerView $container;
    final /* synthetic */ Context $localContext;
    final /* synthetic */ Fragment $parentFragment;

    @C11363r0({"SMAP\nEffects.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Effects.kt\nandroidx/compose/runtime/DisposableEffectScope$onDispose$1\n+ 2 AndroidViewBinding.kt\nandroidx/compose/ui/viewinterop/AndroidViewBindingKt$AndroidViewBinding$3$1\n+ 3 FragmentManager.kt\nandroidx/fragment/app/FragmentManagerKt\n*L\n1#1,484:1\n111#2,4:485\n115#2,2:494\n118#2:502\n27#3,5:489\n32#3,6:496\n*S KotlinDebug\n*F\n+ 1 AndroidViewBinding.kt\nandroidx/compose/ui/viewinterop/AndroidViewBindingKt$AndroidViewBinding$3$1\n*L\n114#1:489,5\n114#1:496,6\n*E\n"})
    /* renamed from: androidx.compose.ui.viewinterop.AndroidViewBindingKt$AndroidViewBinding$3$1$a */
    public static final class C16518a implements C8430d0 {

        /* renamed from: a */
        public final /* synthetic */ Fragment f40920a;

        /* renamed from: b */
        public final /* synthetic */ FragmentManager f40921b;

        public C16518a(Fragment fragment, FragmentManager fragmentManager) {
            this.f40920a = fragment;
            this.f40921b = fragmentManager;
        }

        /* renamed from: g */
        public void mo791g() {
            if (this.f40920a != null && !this.f40921b.mo56871d1()) {
                C19234h0 u = this.f40921b.mo56909u();
                Intrinsics.checkNotNullExpressionValue(u, "beginTransaction()");
                u.mo57038B(this.f40920a);
                u.mo57052q();
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AndroidViewBindingKt$AndroidViewBinding$3$1(Fragment fragment, Context context, FragmentContainerView fragmentContainerView) {
        super(1);
        this.$parentFragment = fragment;
        this.$localContext = context;
        this.$container = fragmentContainerView;
    }

    @C12579k
    /* renamed from: a */
    public final C8430d0 invoke(@C12579k C8434e0 e0Var) {
        FragmentManager fragmentManager;
        C19232h hVar;
        Intrinsics.checkNotNullParameter(e0Var, "$this$DisposableEffect");
        Fragment fragment = this.$parentFragment;
        Fragment fragment2 = null;
        if (fragment == null || (fragmentManager = fragment.getChildFragmentManager()) == null) {
            Context context = this.$localContext;
            if (context instanceof C19232h) {
                hVar = (C19232h) context;
            } else {
                hVar = null;
            }
            if (hVar != null) {
                fragmentManager = hVar.mo57175g0();
            } else {
                fragmentManager = null;
            }
        }
        if (fragmentManager != null) {
            fragment2 = fragmentManager.mo56900r0(this.$container.getId());
        }
        return new C16518a(fragment2, fragmentManager);
    }
}
