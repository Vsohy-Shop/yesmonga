package com.carrefour.fid.android.shared.base;

import android.app.Dialog;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;
import androidx.compose.runtime.internal.C8567o;
import com.carrefour.fid.android.shared.C28444b;
import kotlin.C11076d0;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0017\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016J\b\u0010\u0006\u001a\u00020\u0004H\u0016¨\u0006\t"}, mo22516d2 = {"Lcom/carrefour/fid/android/shared/base/j;", "Lcom/carrefour/fid/android/shared/base/i;", "Landroid/os/Bundle;", "savedInstanceState", "Lkotlin/d2;", "onCreate", "onStart", "<init>", "()V", "shared_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
@C8567o(parameters = 0)
/* renamed from: com.carrefour.fid.android.shared.base.j */
public class C28489j extends C28488i {

    /* renamed from: b */
    public static final int f68638b = 0;

    public void onCreate(@C12580l Bundle bundle) {
        super.onCreate(bundle);
        setStyle(1, C28444b.C28463s.ModalDialogTheme);
    }

    public void onStart() {
        WindowManager.LayoutParams layoutParams;
        Window window;
        super.onStart();
        Dialog dialog = getDialog();
        Window window2 = null;
        if (dialog == null || (window = dialog.getWindow()) == null) {
            layoutParams = null;
        } else {
            layoutParams = window.getAttributes();
        }
        if (layoutParams != null) {
            layoutParams.width = -1;
            layoutParams.height = -1;
            Dialog dialog2 = getDialog();
            if (dialog2 != null) {
                window2 = dialog2.getWindow();
            }
            if (window2 != null) {
                window2.setAttributes(layoutParams);
            }
        }
    }
}
