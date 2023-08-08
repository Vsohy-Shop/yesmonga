package com.carrefour.fid.android.shared.base;

import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.KeyEvent;
import androidx.compose.runtime.internal.C8567o;
import androidx.fragment.app.C19215c;
import kotlin.C11076d0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0017\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\b\u0010\tJ\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016J\b\u0010\u0007\u001a\u00020\u0006H\u0016¨\u0006\n"}, mo22516d2 = {"Lcom/carrefour/fid/android/shared/base/i;", "Landroidx/fragment/app/c;", "Landroid/os/Bundle;", "savedInstanceState", "Landroid/app/Dialog;", "onCreateDialog", "", "L0", "<init>", "()V", "shared_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
@C8567o(parameters = 0)
/* renamed from: com.carrefour.fid.android.shared.base.i */
public class C28488i extends C19215c {

    /* renamed from: a */
    public static final int f68637a = 0;

    /* renamed from: M0 */
    public static final boolean m118404M0(C28488i iVar, DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
        Intrinsics.checkNotNullParameter(iVar, "this$0");
        if (i != 4 || keyEvent.getAction() == 0) {
            return false;
        }
        return iVar.mo74064L0();
    }

    /* renamed from: L0 */
    public boolean mo74064L0() {
        return false;
    }

    @C12579k
    public Dialog onCreateDialog(@C12580l Bundle bundle) {
        Dialog onCreateDialog = super.onCreateDialog(bundle);
        Intrinsics.checkNotNullExpressionValue(onCreateDialog, "super.onCreateDialog(savedInstanceState)");
        onCreateDialog.setOnKeyListener(new C28487h(this));
        return onCreateDialog;
    }
}
