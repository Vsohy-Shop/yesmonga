package androidx.compose.p004ui.viewinterop;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.compose.p004ui.node.C15695i1;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentContainerView;
import androidx.viewbinding.C20752b;
import com.urbanairship.iam.events.C9175a;
import kotlin.C11076d0;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.functions.C11305q;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
/* renamed from: androidx.compose.ui.viewinterop.AndroidViewBindingKt$AndroidViewBinding$viewBlock$1$1 */
public final class AndroidViewBindingKt$AndroidViewBinding$viewBlock$1$1 extends Lambda implements C11300l<Context, View> {
    final /* synthetic */ C11305q<LayoutInflater, ViewGroup, Boolean, T> $factory;
    final /* synthetic */ SnapshotStateList<FragmentContainerView> $fragmentContainerViews;
    final /* synthetic */ Fragment $parentFragment;
    final /* synthetic */ C15695i1<T> $viewBindingRef;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AndroidViewBindingKt$AndroidViewBinding$viewBlock$1$1(Fragment fragment, C11305q<? super LayoutInflater, ? super ViewGroup, ? super Boolean, ? extends T> qVar, C15695i1<T> i1Var, SnapshotStateList<FragmentContainerView> snapshotStateList) {
        super(1);
        this.$parentFragment = fragment;
        this.$factory = qVar;
        this.$viewBindingRef = i1Var;
        this.$fragmentContainerViews = snapshotStateList;
    }

    @C12579k
    /* renamed from: a */
    public final View invoke(@C12579k Context context) {
        LayoutInflater layoutInflater;
        ViewGroup viewGroup;
        Intrinsics.checkNotNullParameter(context, C9175a.f24932Y);
        Fragment fragment = this.$parentFragment;
        if (fragment == null || (layoutInflater = fragment.getLayoutInflater()) == null) {
            layoutInflater = LayoutInflater.from(context);
        }
        C11305q<LayoutInflater, ViewGroup, Boolean, T> qVar = this.$factory;
        Intrinsics.checkNotNullExpressionValue(layoutInflater, "inflater");
        C20752b bVar = (C20752b) qVar.invoke(layoutInflater, new FrameLayout(context), Boolean.FALSE);
        this.$viewBindingRef.mo45027b(bVar);
        this.$fragmentContainerViews.clear();
        View root = bVar.getRoot();
        if (root instanceof ViewGroup) {
            viewGroup = (ViewGroup) root;
        } else {
            viewGroup = null;
        }
        if (viewGroup != null) {
            AndroidViewBindingKt.m74786c(viewGroup, this.$fragmentContainerViews);
        }
        return bVar.getRoot();
    }
}
