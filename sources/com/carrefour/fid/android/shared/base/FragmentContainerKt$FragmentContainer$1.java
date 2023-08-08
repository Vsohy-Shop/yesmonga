package com.carrefour.fid.android.shared.base;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.compose.runtime.C8700z0;
import androidx.fragment.app.C19234h0;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentContainerView;
import androidx.fragment.app.FragmentManager;
import com.urbanairship.iam.events.C9175a;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
@C11363r0({"SMAP\nFragmentContainer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FragmentContainer.kt\ncom/carrefour/fid/android/shared/base/FragmentContainerKt$FragmentContainer$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 FragmentManager.kt\nandroidx/fragment/app/FragmentManagerKt\n*L\n1#1,48:1\n1#2:49\n26#3,12:50\n*S KotlinDebug\n*F\n+ 1 FragmentContainer.kt\ncom/carrefour/fid/android/shared/base/FragmentContainerKt$FragmentContainer$1\n*L\n34#1:50,12\n*E\n"})
public final class FragmentContainerKt$FragmentContainer$1 extends Lambda implements C11300l<Context, View> {
    final /* synthetic */ C11304p<C19234h0, Integer, C11079d2> $commit;
    final /* synthetic */ C8700z0<Integer> $containerId$delegate;
    final /* synthetic */ FragmentManager $fragmentManager;
    final /* synthetic */ C11289a<C11079d2> $tagScreenPreview;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FragmentContainerKt$FragmentContainer$1(C11289a<C11079d2> aVar, FragmentManager fragmentManager, C8700z0<Integer> z0Var, C11304p<? super C19234h0, ? super Integer, C11079d2> pVar) {
        super(1);
        this.$tagScreenPreview = aVar;
        this.$fragmentManager = fragmentManager;
        this.$containerId$delegate = z0Var;
        this.$commit = pVar;
    }

    @C12579k
    /* renamed from: a */
    public final View invoke(@C12579k Context context) {
        View view;
        ViewGroup viewGroup;
        Intrinsics.checkNotNullParameter(context, C9175a.f24932Y);
        this.$tagScreenPreview.invoke();
        Fragment r0 = this.$fragmentManager.mo56900r0(FragmentContainerKt.m118332b(this.$containerId$delegate));
        if (r0 == null || (view = r0.getView()) == null) {
            FragmentContainerView fragmentContainerView = new FragmentContainerView(context);
            fragmentContainerView.setId(FragmentContainerKt.m118332b(this.$containerId$delegate));
            FragmentManager fragmentManager = this.$fragmentManager;
            C11304p<C19234h0, Integer, C11079d2> pVar = this.$commit;
            C19234h0 u = fragmentManager.mo56909u();
            Intrinsics.checkNotNullExpressionValue(u, "beginTransaction()");
            pVar.invoke(u, Integer.valueOf(fragmentContainerView.getId()));
            u.mo57052q();
            return fragmentContainerView;
        }
        ViewParent parent = view.getParent();
        if (parent instanceof ViewGroup) {
            viewGroup = (ViewGroup) parent;
        } else {
            viewGroup = null;
        }
        if (viewGroup == null) {
            return view;
        }
        viewGroup.removeView(view);
        return view;
    }
}
