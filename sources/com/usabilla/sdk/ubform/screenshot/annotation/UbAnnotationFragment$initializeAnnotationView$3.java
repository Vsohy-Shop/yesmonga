package com.usabilla.sdk.ubform.screenshot.annotation;

import android.view.MenuItem;
import androidx.appcompat.widget.Toolbar;
import com.usabilla.sdk.ubform.C9747c;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@C11076d0(mo22515d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, mo22516d2 = {"Lkotlin/d2;", "<anonymous>"}, mo22517k = 3, mo22518mv = {1, 5, 1})
public final class UbAnnotationFragment$initializeAnnotationView$3 extends Lambda implements C11289a<C11079d2> {
    final /* synthetic */ UbAnnotationFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public UbAnnotationFragment$initializeAnnotationView$3(UbAnnotationFragment ubAnnotationFragment) {
        super(0);
        this.this$0 = ubAnnotationFragment;
    }

    public final void invoke() {
        Toolbar N0 = this.this$0.f27119e;
        if (N0 != null) {
            N0.setTitle(C9747c.C9761n.ub_edit_title);
            MenuItem L0 = this.this$0.f27121g;
            if (L0 != null) {
                L0.setVisible(true);
                MenuItem M0 = this.this$0.f27122v;
                if (M0 != null) {
                    M0.setVisible(false);
                    MenuItem K0 = this.this$0.f27123w;
                    if (K0 != null) {
                        K0.setVisible(false);
                    } else {
                        Intrinsics.throwUninitializedPropertyAccessException("menuConfirm");
                        throw null;
                    }
                } else {
                    Intrinsics.throwUninitializedPropertyAccessException("menuUndo");
                    throw null;
                }
            } else {
                Intrinsics.throwUninitializedPropertyAccessException("menuDone");
                throw null;
            }
        } else {
            Intrinsics.throwUninitializedPropertyAccessException("toolbar");
            throw null;
        }
    }
}
