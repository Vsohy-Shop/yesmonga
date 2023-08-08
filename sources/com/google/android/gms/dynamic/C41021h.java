package com.google.android.gms.dynamic;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.fragment.app.Fragment;
import com.google.android.gms.common.annotation.C40473a;
import com.google.android.gms.common.internal.C40843u;
import com.google.android.gms.dynamic.C41014c;

@C40473a
/* renamed from: com.google.android.gms.dynamic.h */
public final class C41021h extends C41014c.C41015a {

    /* renamed from: n */
    public Fragment f104298n;

    public C41021h(Fragment fragment) {
        this.f104298n = fragment;
    }

    @C0363p0
    @C40473a
    /* renamed from: O0 */
    public static C41021h m166813O0(@C0363p0 Fragment fragment) {
        if (fragment != null) {
            return new C41021h(fragment);
        }
        return null;
    }

    /* renamed from: D */
    public final boolean mo134811D() {
        return this.f104298n.isVisible();
    }

    /* renamed from: F */
    public final boolean mo134812F() {
        return this.f104298n.isResumed();
    }

    /* renamed from: G0 */
    public final boolean mo134813G0() {
        return this.f104298n.isAdded();
    }

    /* renamed from: G3 */
    public final void mo134814G3(@C0359n0 C41016d dVar) {
        View view = (View) C41019f.m166810O0(dVar);
        Fragment fragment = this.f104298n;
        C40843u.m166202l(view);
        fragment.unregisterForContextMenu(view);
    }

    /* renamed from: J */
    public final boolean mo134815J() {
        return this.f104298n.isInLayout();
    }

    /* renamed from: Q0 */
    public final boolean mo134816Q0() {
        return this.f104298n.getRetainInstance();
    }

    /* renamed from: R */
    public final boolean mo134817R() {
        return this.f104298n.isDetached();
    }

    /* renamed from: S5 */
    public final void mo134818S5(boolean z) {
        this.f104298n.setRetainInstance(z);
    }

    /* renamed from: U */
    public final boolean mo134819U() {
        return this.f104298n.isRemoving();
    }

    /* renamed from: V0 */
    public final boolean mo134820V0() {
        return this.f104298n.getUserVisibleHint();
    }

    /* renamed from: a0 */
    public final boolean mo134821a0() {
        return this.f104298n.isHidden();
    }

    /* renamed from: d */
    public final int mo134822d() {
        return this.f104298n.getTargetRequestCode();
    }

    @C0363p0
    /* renamed from: e */
    public final Bundle mo134823e() {
        return this.f104298n.getArguments();
    }

    @C0363p0
    /* renamed from: f */
    public final C41014c mo134824f() {
        return m166813O0(this.f104298n.getParentFragment());
    }

    /* renamed from: g8 */
    public final void mo134825g8(boolean z) {
        this.f104298n.setUserVisibleHint(z);
    }

    @C0359n0
    /* renamed from: h */
    public final C41016d mo134826h() {
        return C41019f.m166811T6(this.f104298n.getActivity());
    }

    @C0359n0
    /* renamed from: j */
    public final C41016d mo134827j() {
        return C41019f.m166811T6(this.f104298n.getResources());
    }

    @C0359n0
    /* renamed from: k */
    public final C41016d mo134828k() {
        return C41019f.m166811T6(this.f104298n.getView());
    }

    /* renamed from: n0 */
    public final void mo134829n0(boolean z) {
        this.f104298n.setHasOptionsMenu(z);
    }

    /* renamed from: n6 */
    public final void mo134830n6(@C0359n0 Intent intent) {
        this.f104298n.startActivity(intent);
    }

    @C0363p0
    /* renamed from: o */
    public final C41014c mo134831o() {
        return m166813O0(this.f104298n.getTargetFragment());
    }

    @C0363p0
    /* renamed from: p */
    public final String mo134832p() {
        return this.f104298n.getTag();
    }

    /* renamed from: u5 */
    public final void mo134833u5(boolean z) {
        this.f104298n.setMenuVisibility(z);
    }

    /* renamed from: u6 */
    public final void mo134834u6(@C0359n0 Intent intent, int i) {
        this.f104298n.startActivityForResult(intent, i);
    }

    /* renamed from: u7 */
    public final void mo134835u7(@C0359n0 C41016d dVar) {
        View view = (View) C41019f.m166810O0(dVar);
        Fragment fragment = this.f104298n;
        C40843u.m166202l(view);
        fragment.registerForContextMenu(view);
    }

    public final int zzb() {
        return this.f104298n.getId();
    }
}
