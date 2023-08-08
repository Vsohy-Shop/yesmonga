package androidx.compose.p004ui.platform.actionmodecallback;

import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;
import androidx.annotation.C0344h1;
import androidx.appcompat.view.C0543g;
import androidx.compose.p004ui.geometry.C15098i;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

/* renamed from: androidx.compose.ui.platform.actionmodecallback.c */
public final class C15850c {
    @C12580l

    /* renamed from: a */
    public final C11289a<C11079d2> f39491a;
    @C12579k

    /* renamed from: b */
    public C15098i f39492b;
    @C12580l

    /* renamed from: c */
    public C11289a<C11079d2> f39493c;
    @C12580l

    /* renamed from: d */
    public C11289a<C11079d2> f39494d;
    @C12580l

    /* renamed from: e */
    public C11289a<C11079d2> f39495e;
    @C12580l

    /* renamed from: f */
    public C11289a<C11079d2> f39496f;

    public C15850c() {
        this((C11289a) null, (C15098i) null, (C11289a) null, (C11289a) null, (C11289a) null, (C11289a) null, 63, (DefaultConstructorMarker) null);
    }

    /* renamed from: a */
    public final void mo45659a(@C12579k Menu menu, @C12579k MenuItemOption menuItemOption) {
        Intrinsics.checkNotNullParameter(menu, C0543g.f1415f);
        Intrinsics.checkNotNullParameter(menuItemOption, "item");
        menu.add(0, menuItemOption.mo45647q(), menuItemOption.mo45648r(), menuItemOption.mo45649w()).setShowAsAction(1);
    }

    /* renamed from: b */
    public final void mo45660b(Menu menu, MenuItemOption menuItemOption, C11289a<C11079d2> aVar) {
        if (aVar != null && menu.findItem(menuItemOption.mo45647q()) == null) {
            mo45659a(menu, menuItemOption);
        } else if (aVar == null && menu.findItem(menuItemOption.mo45647q()) != null) {
            menu.removeItem(menuItemOption.mo45647q());
        }
    }

    @C12580l
    /* renamed from: c */
    public final C11289a<C11079d2> mo45661c() {
        return this.f39491a;
    }

    @C12580l
    /* renamed from: d */
    public final C11289a<C11079d2> mo45662d() {
        return this.f39493c;
    }

    @C12580l
    /* renamed from: e */
    public final C11289a<C11079d2> mo45663e() {
        return this.f39495e;
    }

    @C12580l
    /* renamed from: f */
    public final C11289a<C11079d2> mo45664f() {
        return this.f39494d;
    }

    @C12580l
    /* renamed from: g */
    public final C11289a<C11079d2> mo45665g() {
        return this.f39496f;
    }

    @C12579k
    /* renamed from: h */
    public final C15098i mo45666h() {
        return this.f39492b;
    }

    /* renamed from: i */
    public final boolean mo45667i(@C12580l ActionMode actionMode, @C12580l MenuItem menuItem) {
        Intrinsics.checkNotNull(menuItem);
        int itemId = menuItem.getItemId();
        if (itemId == MenuItemOption.Copy.mo45647q()) {
            C11289a<C11079d2> aVar = this.f39493c;
            if (aVar != null) {
                aVar.invoke();
            }
        } else if (itemId == MenuItemOption.Paste.mo45647q()) {
            C11289a<C11079d2> aVar2 = this.f39494d;
            if (aVar2 != null) {
                aVar2.invoke();
            }
        } else if (itemId == MenuItemOption.Cut.mo45647q()) {
            C11289a<C11079d2> aVar3 = this.f39495e;
            if (aVar3 != null) {
                aVar3.invoke();
            }
        } else if (itemId != MenuItemOption.SelectAll.mo45647q()) {
            return false;
        } else {
            C11289a<C11079d2> aVar4 = this.f39496f;
            if (aVar4 != null) {
                aVar4.invoke();
            }
        }
        if (actionMode == null) {
            return true;
        }
        actionMode.finish();
        return true;
    }

    /* renamed from: j */
    public final boolean mo45668j(@C12580l ActionMode actionMode, @C12580l Menu menu) {
        if (menu == null) {
            throw new IllegalArgumentException("Required value was null.".toString());
        } else if (actionMode != null) {
            if (this.f39493c != null) {
                mo45659a(menu, MenuItemOption.Copy);
            }
            if (this.f39494d != null) {
                mo45659a(menu, MenuItemOption.Paste);
            }
            if (this.f39495e != null) {
                mo45659a(menu, MenuItemOption.Cut);
            }
            if (this.f39496f == null) {
                return true;
            }
            mo45659a(menu, MenuItemOption.SelectAll);
            return true;
        } else {
            throw new IllegalArgumentException("Required value was null.".toString());
        }
    }

    /* renamed from: k */
    public final void mo45669k() {
        C11289a<C11079d2> aVar = this.f39491a;
        if (aVar != null) {
            aVar.invoke();
        }
    }

    /* renamed from: l */
    public final boolean mo45670l(@C12580l ActionMode actionMode, @C12580l Menu menu) {
        if (actionMode == null || menu == null) {
            return false;
        }
        mo45676r(menu);
        return true;
    }

    /* renamed from: m */
    public final void mo45671m(@C12580l C11289a<C11079d2> aVar) {
        this.f39493c = aVar;
    }

    /* renamed from: n */
    public final void mo45672n(@C12580l C11289a<C11079d2> aVar) {
        this.f39495e = aVar;
    }

    /* renamed from: o */
    public final void mo45673o(@C12580l C11289a<C11079d2> aVar) {
        this.f39494d = aVar;
    }

    /* renamed from: p */
    public final void mo45674p(@C12580l C11289a<C11079d2> aVar) {
        this.f39496f = aVar;
    }

    /* renamed from: q */
    public final void mo45675q(@C12579k C15098i iVar) {
        Intrinsics.checkNotNullParameter(iVar, "<set-?>");
        this.f39492b = iVar;
    }

    @C0344h1
    /* renamed from: r */
    public final void mo45676r(@C12579k Menu menu) {
        Intrinsics.checkNotNullParameter(menu, C0543g.f1415f);
        mo45660b(menu, MenuItemOption.Copy, this.f39493c);
        mo45660b(menu, MenuItemOption.Paste, this.f39494d);
        mo45660b(menu, MenuItemOption.Cut, this.f39495e);
        mo45660b(menu, MenuItemOption.SelectAll, this.f39496f);
    }

    public C15850c(@C12580l C11289a<C11079d2> aVar, @C12579k C15098i iVar, @C12580l C11289a<C11079d2> aVar2, @C12580l C11289a<C11079d2> aVar3, @C12580l C11289a<C11079d2> aVar4, @C12580l C11289a<C11079d2> aVar5) {
        Intrinsics.checkNotNullParameter(iVar, "rect");
        this.f39491a = aVar;
        this.f39492b = iVar;
        this.f39493c = aVar2;
        this.f39494d = aVar3;
        this.f39495e = aVar4;
        this.f39496f = aVar5;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ C15850c(kotlin.jvm.functions.C11289a r6, androidx.compose.p004ui.geometry.C15098i r7, kotlin.jvm.functions.C11289a r8, kotlin.jvm.functions.C11289a r9, kotlin.jvm.functions.C11289a r10, kotlin.jvm.functions.C11289a r11, int r12, kotlin.jvm.internal.DefaultConstructorMarker r13) {
        /*
            r5 = this;
            r13 = r12 & 1
            r0 = 0
            if (r13 == 0) goto L_0x0007
            r13 = r0
            goto L_0x0008
        L_0x0007:
            r13 = r6
        L_0x0008:
            r6 = r12 & 2
            if (r6 == 0) goto L_0x0012
            androidx.compose.ui.geometry.i$a r6 = androidx.compose.p004ui.geometry.C15098i.f37261e
            androidx.compose.ui.geometry.i r7 = r6.mo42285a()
        L_0x0012:
            r1 = r7
            r6 = r12 & 4
            if (r6 == 0) goto L_0x0019
            r2 = r0
            goto L_0x001a
        L_0x0019:
            r2 = r8
        L_0x001a:
            r6 = r12 & 8
            if (r6 == 0) goto L_0x0020
            r3 = r0
            goto L_0x0021
        L_0x0020:
            r3 = r9
        L_0x0021:
            r6 = r12 & 16
            if (r6 == 0) goto L_0x0027
            r4 = r0
            goto L_0x0028
        L_0x0027:
            r4 = r10
        L_0x0028:
            r6 = r12 & 32
            if (r6 == 0) goto L_0x002e
            r12 = r0
            goto L_0x002f
        L_0x002e:
            r12 = r11
        L_0x002f:
            r6 = r5
            r7 = r13
            r8 = r1
            r9 = r2
            r10 = r3
            r11 = r4
            r6.<init>(r7, r8, r9, r10, r11, r12)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.p004ui.platform.actionmodecallback.C15850c.<init>(kotlin.jvm.functions.a, androidx.compose.ui.geometry.i, kotlin.jvm.functions.a, kotlin.jvm.functions.a, kotlin.jvm.functions.a, kotlin.jvm.functions.a, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
