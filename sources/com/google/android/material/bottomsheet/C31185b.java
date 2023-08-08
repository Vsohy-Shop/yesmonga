package com.google.android.material.bottomsheet;

import android.app.Dialog;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.appcompat.app.C0493r;
import com.google.android.material.bottomsheet.BottomSheetBehavior;

/* renamed from: com.google.android.material.bottomsheet.b */
public class C31185b extends C0493r {
    private boolean waitingForDismissAllowingStateLoss;

    /* renamed from: com.google.android.material.bottomsheet.b$b */
    public class C31187b extends BottomSheetBehavior.C31172f {
        public C31187b() {
        }

        /* renamed from: b */
        public void mo68139b(@C0359n0 View view, float f) {
        }

        /* renamed from: c */
        public void mo68140c(@C0359n0 View view, int i) {
            if (i == 5) {
                C31185b.this.mo88487K0();
            }
        }
    }

    /* renamed from: K0 */
    public final void mo88487K0() {
        if (this.waitingForDismissAllowingStateLoss) {
            super.dismissAllowingStateLoss();
        } else {
            super.dismiss();
        }
    }

    /* renamed from: L0 */
    public final void mo88488L0(@C0359n0 BottomSheetBehavior<?> bottomSheetBehavior, boolean z) {
        this.waitingForDismissAllowingStateLoss = z;
        if (bottomSheetBehavior.mo88454u0() == 5) {
            mo88487K0();
            return;
        }
        if (getDialog() instanceof C31178a) {
            ((C31178a) getDialog()).mo88481u();
        }
        bottomSheetBehavior.mo88421Y(new C31187b());
        bottomSheetBehavior.mo88418W0(5);
    }

    /* renamed from: M0 */
    public final boolean mo88489M0(boolean z) {
        Dialog dialog = getDialog();
        if (!(dialog instanceof C31178a)) {
            return false;
        }
        C31178a aVar = (C31178a) dialog;
        BottomSheetBehavior<FrameLayout> r = aVar.mo88476r();
        if (!r.mo88396A0() || !aVar.mo88477s()) {
            return false;
        }
        mo88488L0(r, z);
        return true;
    }

    public void dismiss() {
        if (!mo88489M0(false)) {
            super.dismiss();
        }
    }

    public void dismissAllowingStateLoss() {
        if (!mo88489M0(true)) {
            super.dismissAllowingStateLoss();
        }
    }

    @C0359n0
    public Dialog onCreateDialog(@C0363p0 Bundle bundle) {
        return new C31178a(getContext(), getTheme());
    }
}
