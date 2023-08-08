package com.usabilla.sdk.ubform.screenshot.annotation;

import android.view.MenuItem;
import androidx.appcompat.widget.Toolbar;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22515d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n"}, mo22516d2 = {"Lcom/usabilla/sdk/ubform/screenshot/annotation/UbAnnotationFlowCommand;", "it", "Lkotlin/d2;", "<anonymous>"}, mo22517k = 3, mo22518mv = {1, 5, 1})
public final class UbAnnotationFragment$initializeAnnotationView$2 extends Lambda implements C11300l<UbAnnotationFlowCommand, C11079d2> {
    final /* synthetic */ UbAnnotationFragment this$0;

    /* renamed from: com.usabilla.sdk.ubform.screenshot.annotation.UbAnnotationFragment$initializeAnnotationView$2$a */
    public /* synthetic */ class C9884a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[UbAnnotationFlowCommand.values().length];
            iArr[UbAnnotationFlowCommand.NOTHING.ordinal()] = 1;
            iArr[UbAnnotationFlowCommand.DONE.ordinal()] = 2;
            iArr[UbAnnotationFlowCommand.DONE_AND_UNDO.ordinal()] = 3;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public UbAnnotationFragment$initializeAnnotationView$2(UbAnnotationFragment ubAnnotationFragment) {
        super(1);
        this.this$0 = ubAnnotationFragment;
    }

    /* renamed from: a */
    public final void mo20389a(@C12579k UbAnnotationFlowCommand ubAnnotationFlowCommand) {
        Intrinsics.checkNotNullParameter(ubAnnotationFlowCommand, "it");
        int i = C9884a.$EnumSwitchMapping$0[ubAnnotationFlowCommand.ordinal()];
        if (i == 2) {
            Toolbar N0 = this.this$0.f27119e;
            if (N0 != null) {
                N0.setTitle((CharSequence) "");
                MenuItem L0 = this.this$0.f27121g;
                if (L0 != null) {
                    L0.setVisible(false);
                    MenuItem M0 = this.this$0.f27122v;
                    if (M0 != null) {
                        M0.setVisible(false);
                        MenuItem K0 = this.this$0.f27123w;
                        if (K0 != null) {
                            K0.setVisible(true);
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
        } else if (i == 3) {
            Toolbar N02 = this.this$0.f27119e;
            if (N02 != null) {
                N02.setTitle((CharSequence) "");
                MenuItem L02 = this.this$0.f27121g;
                if (L02 != null) {
                    L02.setVisible(false);
                    MenuItem M02 = this.this$0.f27122v;
                    if (M02 != null) {
                        M02.setVisible(true);
                        MenuItem K02 = this.this$0.f27123w;
                        if (K02 != null) {
                            K02.setVisible(true);
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

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        mo20389a((UbAnnotationFlowCommand) obj);
        return C11079d2.f28267a;
    }
}
