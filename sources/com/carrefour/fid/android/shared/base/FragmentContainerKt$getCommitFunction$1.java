package com.carrefour.fid.android.shared.base;

import androidx.fragment.app.C19234h0;
import androidx.fragment.app.Fragment;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22515d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, mo22516d2 = {"Landroidx/fragment/app/h0;", "", "it", "Lkotlin/d2;", "a", "(Landroidx/fragment/app/h0;I)V"}, mo22517k = 3, mo22518mv = {1, 8, 0})
public final class FragmentContainerKt$getCommitFunction$1 extends Lambda implements C11304p<C19234h0, Integer, C11079d2> {
    final /* synthetic */ Fragment $fragment;
    final /* synthetic */ String $tag;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FragmentContainerKt$getCommitFunction$1(Fragment fragment, String str) {
        super(2);
        this.$fragment = fragment;
        this.$tag = str;
    }

    /* renamed from: a */
    public final void mo83356a(@C12579k C19234h0 h0Var, int i) {
        Intrinsics.checkNotNullParameter(h0Var, "$this$null");
        h0Var.mo57202D(i, this.$fragment, this.$tag);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        mo83356a((C19234h0) obj, ((Number) obj2).intValue());
        return C11079d2.f28267a;
    }
}
