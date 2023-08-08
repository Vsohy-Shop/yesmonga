package com.carrefour.fid.android.design.components.widgets;

import android.app.Dialog;
import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.C0346i;
import androidx.compose.runtime.internal.C8567o;
import androidx.core.view.C18196h2;
import androidx.navigation.compose.C19714d;
import androidx.viewbinding.C20752b;
import com.carrefour.fid.android.design.components.C36896b;
import com.carrefour.fid.android.design.components.databinding.C37034c;
import com.google.android.gms.analytics.ecommerce.C40383c;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.bottomsheet.C31178a;
import com.google.android.material.bottomsheet.C31185b;
import com.google.android.material.shape.C31525j;
import com.google.android.material.shape.C31534o;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.functions.C11305q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C8567o(parameters = 0)
/* renamed from: com.carrefour.fid.android.design.components.widgets.a */
public abstract class C37185a<VB extends C20752b> extends C31185b {
    public static final int $stable = 8;
    @C12579k
    public static final C37186a Companion = new C37186a((DefaultConstructorMarker) null);
    @C12579k
    public static final String ON_DISMISS_FRAGMENT_RESULT_KEY = "BackdropOnDismiss";
    @C12580l
    private C37034c baseBinding;
    @C12579k
    private final C11300l<View, VB> bind;
    @C12580l
    private VB childBinding;
    private final boolean heightWrapContent;
    @C12579k
    private final C11305q<LayoutInflater, ViewGroup, Boolean, VB> inflate;

    /* renamed from: com.carrefour.fid.android.design.components.widgets.a$a */
    public static final class C37186a {
        public /* synthetic */ C37186a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public C37186a() {
        }
    }

    /* renamed from: com.carrefour.fid.android.design.components.widgets.a$b */
    public static final class C37187b extends BottomSheetBehavior.C31172f {

        /* renamed from: a */
        public final /* synthetic */ C37185a<VB> f93282a;

        public C37187b(C37185a<VB> aVar) {
            this.f93282a = aVar;
        }

        /* renamed from: b */
        public void mo68139b(@C12579k View view, float f) {
            Intrinsics.checkNotNullParameter(view, "bottomSheet");
        }

        /* renamed from: c */
        public void mo68140c(@C12579k View view, int i) {
            Intrinsics.checkNotNullParameter(view, "bottomSheet");
            if (i == 3) {
                C18196h2.m82502I1(view, this.f93282a.mo113255N0(view));
            }
        }
    }

    public C37185a(@C12579k C11305q<? super LayoutInflater, ? super ViewGroup, ? super Boolean, ? extends VB> qVar, @C12579k C11300l<? super View, ? extends VB> lVar, boolean z) {
        Intrinsics.checkNotNullParameter(qVar, "inflate");
        Intrinsics.checkNotNullParameter(lVar, "bind");
        this.inflate = qVar;
        this.bind = lVar;
        this.heightWrapContent = z;
    }

    /* renamed from: N0 */
    public final C31525j mo113255N0(View view) {
        C31534o m = C31534o.m127562b(getContext(), 0, C36896b.C36913q.BackdropRoundCornerShapeAppearance).mo90843m();
        Intrinsics.checkNotNullExpressionValue(m, "builder(context, 0, R.st…\n                .build()");
        Drawable background = view.getBackground();
        Intrinsics.checkNotNull(background, "null cannot be cast to non-null type com.google.android.material.shape.MaterialShapeDrawable");
        C31525j jVar = (C31525j) background;
        C31525j jVar2 = new C31525j(m);
        jVar2.mo90750Z(getContext());
        jVar2.mo90777o0(jVar.mo90797y());
        jVar2.setTintList(jVar.mo90742R());
        jVar2.mo90775n0(jVar.mo90795x());
        jVar2.mo90727I0(jVar.mo90741Q());
        jVar2.mo90721F0(jVar.mo90736N());
        return jVar2;
    }

    /* renamed from: O0 */
    public final int mo113256O0() {
        return (mo113258Q0() * 7) / 8;
    }

    /* renamed from: P0 */
    public final int mo113257P0() {
        return (mo113256O0() - getResources().getDimensionPixelOffset(C36896b.C36903g.ds_backdrop_handle_height)) - getResources().getDimensionPixelOffset(C36896b.C36903g.ds_spacing_s);
    }

    /* renamed from: Q0 */
    public final int mo113258Q0() {
        return requireActivity().getResources().getDisplayMetrics().heightPixels;
    }

    @C12579k
    public final VB getBinding() {
        VB vb = this.childBinding;
        if (vb != null) {
            return vb;
        }
        throw new IllegalStateException("ViewBinding is null, you may check parameters passed to BackDropComponent() constructor as well as onCreateView() implementation".toString());
    }

    public int getTheme() {
        return C36896b.C36913q.BackdropTheme;
    }

    public final void hideBackDropHandle() {
        C37034c cVar = this.baseBinding;
        View view = cVar != null ? cVar.f92582c : null;
        if (view != null) {
            view.setVisibility(8);
        }
    }

    @C12579k
    @C0346i
    public Dialog onCreateDialog(@C12580l Bundle bundle) {
        C31178a aVar = new C31178a(requireContext(), getTheme());
        BottomSheetBehavior<FrameLayout> r = aVar.mo88476r();
        Intrinsics.checkNotNullExpressionValue(r, "dialog.behavior");
        r.mo88407L0(true);
        r.mo88414S0(mo113256O0());
        r.mo88421Y(new C37187b(this));
        return aVar;
    }

    @C12580l
    @C0346i
    public View onCreateView(@C12579k LayoutInflater layoutInflater, @C12580l ViewGroup viewGroup, @C12580l Bundle bundle) {
        FrameLayout frameLayout;
        View view;
        Intrinsics.checkNotNullParameter(layoutInflater, "inflater");
        this.baseBinding = C37034c.m151943d(layoutInflater, viewGroup, false);
        VB vb = (C20752b) this.inflate.invoke(layoutInflater, viewGroup, Boolean.FALSE);
        this.childBinding = vb;
        C37034c cVar = this.baseBinding;
        if (!(cVar == null || (frameLayout = cVar.f92581b) == null)) {
            if (vb != null) {
                view = vb.getRoot();
            } else {
                view = null;
            }
            frameLayout.addView(view);
        }
        C37034c cVar2 = this.baseBinding;
        if (cVar2 != null) {
            return cVar2.getRoot();
        }
        return null;
    }

    @C0346i
    public void onDestroyView() {
        this.childBinding = null;
        this.baseBinding = null;
        super.onDestroyView();
    }

    public void onDismiss(@C12579k DialogInterface dialogInterface) {
        Intrinsics.checkNotNullParameter(dialogInterface, C19714d.f50522e);
        requireActivity().mo57175g0().mo56857a(ON_DISMISS_FRAGMENT_RESULT_KEY, new Bundle());
        super.onDismiss(dialogInterface);
    }

    @C0346i
    public void onViewCreated(@C12579k View view, @C12580l Bundle bundle) {
        ViewGroup.LayoutParams layoutParams;
        int i;
        FrameLayout frameLayout;
        Intrinsics.checkNotNullParameter(view, C40383c.f102945c);
        super.onViewCreated(view, bundle);
        C37034c cVar = this.baseBinding;
        if (cVar == null || (frameLayout = cVar.f92581b) == null) {
            layoutParams = null;
        } else {
            layoutParams = frameLayout.getLayoutParams();
        }
        if (layoutParams != null) {
            if (this.heightWrapContent) {
                i = -2;
            } else {
                i = mo113257P0();
            }
            layoutParams.height = i;
        }
    }
}
