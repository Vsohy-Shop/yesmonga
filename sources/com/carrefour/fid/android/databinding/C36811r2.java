package com.carrefour.fid.android.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.compose.p004ui.platform.ComposeView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.C20752b;
import androidx.viewbinding.C20753c;
import com.carrefour.fid.android.R;
import com.carrefour.fid.android.design.components.widgets.list.ListItemRecyclerView;
import com.facebook.shimmer.ShimmerFrameLayout;
import com.google.android.material.button.MaterialButton;

/* renamed from: com.carrefour.fid.android.databinding.r2 */
public final class C36811r2 implements C20752b {
    @C0359n0

    /* renamed from: a */
    public final ConstraintLayout f91563a;
    @C0359n0

    /* renamed from: b */
    public final MaterialButton f91564b;
    @C0359n0

    /* renamed from: c */
    public final ListItemRecyclerView f91565c;
    @C0359n0

    /* renamed from: d */
    public final ComposeView f91566d;
    @C0359n0

    /* renamed from: e */
    public final ComposeView f91567e;
    @C0359n0

    /* renamed from: f */
    public final ShimmerFrameLayout f91568f;
    @C0359n0

    /* renamed from: g */
    public final ViewStub f91569g;
    @C0359n0

    /* renamed from: h */
    public final ViewStub f91570h;

    public C36811r2(@C0359n0 ConstraintLayout constraintLayout, @C0359n0 MaterialButton materialButton, @C0359n0 ListItemRecyclerView listItemRecyclerView, @C0359n0 ComposeView composeView, @C0359n0 ComposeView composeView2, @C0359n0 ShimmerFrameLayout shimmerFrameLayout, @C0359n0 ViewStub viewStub, @C0359n0 ViewStub viewStub2) {
        this.f91563a = constraintLayout;
        this.f91564b = materialButton;
        this.f91565c = listItemRecyclerView;
        this.f91566d = composeView;
        this.f91567e = composeView2;
        this.f91568f = shimmerFrameLayout;
        this.f91569g = viewStub;
        this.f91570h = viewStub2;
    }

    @C0359n0
    /* renamed from: a */
    public static C36811r2 m150967a(@C0359n0 View view) {
        int i = R.id.button_recommendation;
        MaterialButton materialButton = (MaterialButton) C20753c.m96463a(view, R.id.button_recommendation);
        if (materialButton != null) {
            i = R.id.list_account_list_store_memo;
            ListItemRecyclerView listItemRecyclerView = (ListItemRecyclerView) C20753c.m96463a(view, R.id.list_account_list_store_memo);
            if (listItemRecyclerView != null) {
                i = R.id.memo_list_header;
                ComposeView composeView = (ComposeView) C20753c.m96463a(view, R.id.memo_list_header);
                if (composeView != null) {
                    i = R.id.memo_list_input;
                    ComposeView composeView2 = (ComposeView) C20753c.m96463a(view, R.id.memo_list_input);
                    if (composeView2 != null) {
                        i = R.id.shimmer_account_list_store_memo;
                        ShimmerFrameLayout shimmerFrameLayout = (ShimmerFrameLayout) C20753c.m96463a(view, R.id.shimmer_account_list_store_memo);
                        if (shimmerFrameLayout != null) {
                            i = R.id.stub_account_list_store_memo_empty;
                            ViewStub viewStub = (ViewStub) C20753c.m96463a(view, R.id.stub_account_list_store_memo_empty);
                            if (viewStub != null) {
                                i = R.id.stub_memo_list_error;
                                ViewStub viewStub2 = (ViewStub) C20753c.m96463a(view, R.id.stub_memo_list_error);
                                if (viewStub2 != null) {
                                    return new C36811r2((ConstraintLayout) view, materialButton, listItemRecyclerView, composeView, composeView2, shimmerFrameLayout, viewStub, viewStub2);
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @C0359n0
    /* renamed from: c */
    public static C36811r2 m150968c(@C0359n0 LayoutInflater layoutInflater) {
        return m150969d(layoutInflater, (ViewGroup) null, false);
    }

    @C0359n0
    /* renamed from: d */
    public static C36811r2 m150969d(@C0359n0 LayoutInflater layoutInflater, @C0363p0 ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.fragment_memo_list, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m150967a(inflate);
    }

    @C0359n0
    /* renamed from: b */
    public ConstraintLayout getRoot() {
        return this.f91563a;
    }
}
